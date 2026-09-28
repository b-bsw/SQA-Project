package org.apache.commons.math.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        double double28 = normalDistributionImpl2.cumulativeProbability(4.996003610813204E-16d);
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
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double11 = normalDistributionImpl0.getInitialDomain((double) 1L);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 10.0f);
        double double15 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.039845748899803746d + "'", double14 == 0.039845748899803746d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        double double22 = normalDistributionImpl2.getInitialDomain(0.4980118725202293d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.07365795537454656d + "'", double18 == 0.07365795537454656d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + Double.POSITIVE_INFINITY + "'", double22 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.439419620630119E-4d, 0.33260627343376414d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.503327047302336d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double18 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.getDomainLowerBound(0.501361765869532d);
        double double22 = normalDistributionImpl2.cumulativeProbability(0.4992439296527548d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.38212483247943946d + "'", double14 == 0.38212483247943946d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.38208033909437056d + "'", double22 == 0.38208033909437056d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.010090298830658262d, 0.5378382600176361d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.1102230246251565E-15d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.00012139194168d + "'", double3 == 100.00012139194168d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.002105396850882957d + "'", double8 == 0.002105396850882957d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.5020052938315906d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(2.9897509126136645E-4d);
        normalDistributionImpl2.setMean(100.00012139194168d);
        normalDistributionImpl2.setStandardDeviation(0.37665202364296135d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.160849516286758d + "'", double13 == 10.160849516286758d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.getInitialDomain(0.0d);
        java.lang.Class<?> wildcardClass15 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3669245429555231d, 0.5188388553062419d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.0015054700491559103d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.15191431235071873d) + "'", double4 == (-0.15191431235071873d));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-442.33007853263365d), 0.29750602479108235d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.00233641240634197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-443.171652651081d) + "'", double4 == (-443.171652651081d));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        normalDistributionImpl2.setMean(0.5013626639053514d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.0015893633625518877d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.5039893563146316d);
        double double11 = normalDistributionImpl2.getInitialDomain((-69.90167018868739d));
        double double14 = normalDistributionImpl2.cumulativeProbability(0.32577496697911457d, 0.5000602018993799d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.952914751783279E-4d + "'", double14 == 6.952914751783279E-4d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5039893563146316d);
        double double14 = normalDistributionImpl2.cumulativeProbability(97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8327176031234544d + "'", double14 == 0.8327176031234544d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setMean((-312.05092239451676d));
        double double13 = normalDistributionImpl2.cumulativeProbability(0.9991601276537112d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.15864037517600482d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.005020117607718406d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9991274574548323d + "'", double13 == 0.9991274574548323d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-312.05092239451676d) + "'", double15 == (-312.05092239451676d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-569.4949730194809d) + "'", double17 == (-569.4949730194809d));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.cumulativeProbability(68.6216621174087d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.7537117409813648d + "'", double15 == 0.7537117409813648d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.getDomainUpperBound((-1.0d));
        normalDistributionImpl2.setStandardDeviation(0.3900253100277213d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(100.00012139194168d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.004777486474361492d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01213919411360942d + "'", double4 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01213919411360942d + "'", double6 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0018025371799152978d, 9.02999982830094d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        normalDistributionImpl2.setStandardDeviation(1.5d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.5001042314730403d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.0013519361546490138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(6.439419620615228E-4d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.5729554663241068d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5729554663241068d + "'", double16 == 0.5729554663241068d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(200.0d);
        double double16 = normalDistributionImpl2.getDomainLowerBound(0.37665202364295614d);
        normalDistributionImpl2.setMean(0.13819004034332988d);
        double double20 = normalDistributionImpl2.inverseCumulativeProbability(0.03505855944556485d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-180.97714380935068d) + "'", double20 == (-180.97714380935068d));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 100.00012139194168d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.140071090088769d, 6.106226635438361E-16d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        double double23 = normalDistributionImpl2.getDomainUpperBound((double) 100.0f);
        normalDistributionImpl2.setStandardDeviation(0.5000025689567479d);
        normalDistributionImpl2.setMean(0.0d);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841500270091506d, (double) 100);
        normalDistributionImpl2.setMean(0.5017915544255316d);
        normalDistributionImpl2.setStandardDeviation(0.0013519361546490138d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-0.5033270473131487d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        normalDistributionImpl2.setStandardDeviation(0.002105396850882957d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(4.839550979138796E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7228081817379124d + "'", double9 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        normalDistributionImpl2.setMean(34.0d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(97.67965765688128d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.5000081688930658d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.4637568454427297d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16602324606352958d + "'", double6 == 0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-316.4272152326943d) + "'", double19 == (-316.4272152326943d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        double double14 = normalDistributionImpl2.getDomainLowerBound(102.74285731024536d);
        double double16 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double17 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5297069799427127d, 0.9714544490438862d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.996954640520628d);
        double double23 = normalDistributionImpl2.getDomainUpperBound(0.10360644854994305d);
        double double24 = normalDistributionImpl2.getMean();
        double double25 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.503327047302336d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double18 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.inverseCumulativeProbability(0.002415011832167635d);
        normalDistributionImpl2.setStandardDeviation(410.06646246647756d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.38212483247943946d + "'", double14 == 0.38212483247943946d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-87.63548323309713d) + "'", double20 == (-87.63548323309713d));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.32982560921663984d, 97.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        normalDistributionImpl2.setStandardDeviation(129.0d);
        normalDistributionImpl2.setMean(6.106226635438361E-16d);
        double double12 = normalDistributionImpl2.getInitialDomain(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-129.0d) + "'", double12 == (-129.0d));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        double double19 = normalDistributionImpl2.getInitialDomain(101.0d);
        double double21 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.539827837277029d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double20 = normalDistributionImpl2.cumulativeProbability(0.5019813127606616d, (double) 1.0f);
        double double21 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.773567058553255E-4d + "'", double20 == 7.773567058553255E-4d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.15864037517600482d + "'", double21 == 0.15864037517600482d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound(11.0d);
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.5018822327219192d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9714544490438862d, 0.16108409568379545d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-0.8413596248239952d));
        double double14 = normalDistributionImpl2.getInitialDomain((-2.1649348980190553E-15d));
        double double17 = normalDistributionImpl2.cumulativeProbability((-22.36087456351966d), 0.16108488682834415d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.103606448964639d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.841359624824d) + "'", double14 == (-100.841359624824d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08919152173113587d + "'", double17 == 0.08919152173113587d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.5020052938315906d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.inverseCumulativeProbability((-0.9000000000335028d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.546219801024759d);
        normalDistributionImpl2.setStandardDeviation(0.10360644854994305d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.546219801024759d + "'", double11 == 0.546219801024759d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((-99.15865525393146d));
        double double15 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4490776072831239d + "'", double16 == 0.4490776072831239d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.8339767539364704d);
        double double10 = normalDistributionImpl2.getInitialDomain((-128.26949715237384d));
        double double11 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.3668235531222151d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d, 33.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(99.49601458591496d);
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.49601458591496d + "'", double8 == 99.49601458591496d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.816634256911273d, 0.10360644854994305d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.cumulativeProbability(100.00411074825631d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        double double25 = normalDistributionImpl2.getDomainUpperBound(0.8339767539364704d);
        double double26 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = normalDistributionImpl2.cumulativeProbability(0.5020253050112831d, 2.0551338408836273E-12d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.7976931348623157E308d + "'", double25 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.503327047302336d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double18 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.getDomainUpperBound(100.00012139194168d);
        double double21 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.38212483247943946d + "'", double14 == 0.38212483247943946d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5020026607457553d, 0.01509037837449223d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5020026607457553d + "'", double3 == 0.5020026607457553d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.00088902533815d), 0.16728208918541987d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(1.582067810090848E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-99.00088902533815d) + "'", double4 == (-99.00088902533815d));
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        normalDistributionImpl2.setMean(0.0012591409398656772d);
        normalDistributionImpl2.setMean(3.0324839434953876d);
        java.lang.Class<?> wildcardClass36 = normalDistributionImpl2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.inverseCumulativeProbability((double) (byte) 1);
        double double16 = normalDistributionImpl2.getDomainLowerBound((-0.38103458694487663d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + Double.POSITIVE_INFINITY + "'", double14 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        normalDistributionImpl0.setStandardDeviation(8.987287113132458E-5d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(184.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-34.0009882207076d), 0.1807295428348436d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4490776072831239d, 0.01509037837449223d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((double) (-1));
        normalDistributionImpl2.setMean(0.16116265572688077d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(97.0d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.039396101914527804d);
        double double13 = normalDistributionImpl2.cumulativeProbability((-0.0019222989632810212d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.8339767539364704d + "'", double9 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.49999233113668023d + "'", double13 == 0.49999233113668023d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.13661375606882142d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-18.016701886873854d), 0.13819004034332988d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(6.439419620615228E-4d, 65.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.003233364812544881d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        double double20 = normalDistributionImpl2.getInitialDomain(7.773567058553255E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-100.0d) + "'", double20 == (-100.0d));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.005020117607718406d);
        normalDistributionImpl2.setStandardDeviation(0.13819004034332988d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(99.02999982830094d, 0.1586552539043654d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.3668235531222151d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 98.97601288019085d + "'", double4 == 98.97601288019085d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49999225367341527d, 0.026126956040166516d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5006378007810146d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49999225367341527d + "'", double4 == 0.49999225367341527d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0L, 0.13514946487744206d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5000159154279771d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.391661164261377E-6d + "'", double4 == 5.391661164261377E-6d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        normalDistributionImpl2.setStandardDeviation(0.5002938527002967d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(100.44907760728313d, 0.0012156920342991095d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4979893818807349d, 0.0015893633625518877d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5000447779640537d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation(10.026126956040166d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double9 = normalDistributionImpl2.getInitialDomain((double) 10.0f);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean((-90.53983024611358d));
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.0012591409398656772d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.53983024611358d) + "'", double14 == (-90.53983024611358d));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        normalDistributionImpl2.setMean(0.5019947030907408d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.9999999999999823d);
        normalDistributionImpl2.setMean(0.5376487498992404d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.inverseCumulativeProbability(0.5011893264062109d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl0.cumulativeProbability(1.2032093049234251d, 0.12389834890160478d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.00298121154028d + "'", double11 == 10.00298121154028d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-128.26949715237384d), 0.3406824094489751d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-128.26949715237384d) + "'", double3 == (-128.26949715237384d));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        double double8 = normalDistributionImpl2.cumulativeProbability((double) '#');
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5020106023922443d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.07365795537454656d);
        double double14 = normalDistributionImpl2.getInitialDomain(8.89024926669868E-4d);
        normalDistributionImpl2.setMean((-1.503985414085041d));
        double double18 = normalDistributionImpl2.getDomainLowerBound(0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.999987716976066d + "'", double8 == 0.999987716976066d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-146.37048343391822d) + "'", double12 == (-146.37048343391822d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-132.0d) + "'", double14 == (-132.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.503985414085041d) + "'", double18 == (-1.503985414085041d));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(0.4992439296527548d);
        double double17 = normalDistributionImpl2.getMean();
        double double20 = normalDistributionImpl2.cumulativeProbability(0.0d, 0.6954518175886446d);
        double double22 = normalDistributionImpl2.cumulativeProbability((-321.8666021266556d));
        normalDistributionImpl2.setStandardDeviation(0.38212483247943946d);
        double double25 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.18951904809965026d) + "'", double16 == (-0.18951904809965026d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.002774428975804377d + "'", double20 == 0.002774428975804377d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.439419598842644E-4d + "'", double22 == 6.439419598842644E-4d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9991274574548323d, (-93.14798330551893d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        double double20 = normalDistributionImpl2.getInitialDomain(32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.0d + "'", double20 == 99.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        normalDistributionImpl2.setMean(107.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.001349898031630159d);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.13661375606882142d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.50539567299893d, 0.5020429585576492d);
        normalDistributionImpl2.setMean(0.9989951412038602d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(101.70713751849273d, (-0.8453489811386268d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double6 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.15864037517600482d);
        normalDistributionImpl2.setMean(0.16852760746683781d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.15987301523152742d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(100.49998149051751d, (-99.65865525393146d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.0d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.010090298830658262d, 0.5378382600176361d);
        normalDistributionImpl2.setMean(0.15972655368062133d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(6.334490483101973E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.00012139194168d + "'", double3 == 100.00012139194168d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.002105396850882957d + "'", double8 == 0.002105396850882957d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-322.1781125761098d) + "'", double12 == (-322.1781125761098d));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.501361765869532d);
        normalDistributionImpl2.setStandardDeviation(0.5027585141294139d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.1807295428348436d);
        double double11 = normalDistributionImpl2.getDomainUpperBound((-87.63548323309713d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0012541753965479852d, 0.3050257308975194d);
        normalDistributionImpl2.setMean(0.0d);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(3.809557474743208E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.206704764102424d) + "'", double6 == (-1.206704764102424d));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9870192304409138d, (double) 1);
        double double4 = normalDistributionImpl2.getInitialDomain((-69.90167018868739d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.012980769559086225d) + "'", double4 == (-0.012980769559086225d));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        normalDistributionImpl2.setMean(107.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.38924867502172716d);
        double double12 = normalDistributionImpl2.getInitialDomain(0.0012156920342991095d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 107.0d + "'", double10 == 107.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainLowerBound((-12.799211304789129d));
        normalDistributionImpl2.setMean(0.25986015636209525d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.9714544490438862d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation(9.047742753903742E-4d);
        normalDistributionImpl2.setStandardDeviation(0.5120960066622517d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getInitialDomain((-0.4369384131695145d));
        normalDistributionImpl2.setStandardDeviation(0.5000159154279771d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5120960066622517d + "'", double11 == 0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 96.48790399333775d + "'", double13 == 96.48790399333775d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double12 = normalDistributionImpl2.getDomainUpperBound(309.37500000520356d);
        double double14 = normalDistributionImpl2.cumulativeProbability(0.5000484283777002d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.539827837277029d + "'", double10 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5019948962895999d + "'", double14 == 0.5019948962895999d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        double double26 = normalDistributionImpl2.getDomainUpperBound(8.89024926669868E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = normalDistributionImpl2.inverseCumulativeProbability((-265.28436935047245d));
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.7976931348623157E308d) + "'", double22 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 68.57142857177841d + "'", double24 == 68.57142857177841d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainUpperBound(309.37500000520356d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.059977535157524076d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.32577496697911457d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.503327047302336d + "'", double17 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9987872496534157d, (double) 1.0f);
        normalDistributionImpl2.setStandardDeviation(10.503989356314632d);
        normalDistributionImpl2.setStandardDeviation(0.5000974839933444d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.9000000000335028d), 0.38212483247943946d);
        normalDistributionImpl2.setMean(0.807849797896304d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.5019867111794115d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2117316809276626d + "'", double6 == 0.2117316809276626d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double14 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.6921355838337144d);
        double double18 = normalDistributionImpl2.getInitialDomain(4.860213132951152E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 96.30786441616628d + "'", double18 == 96.30786441616628d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.inverseCumulativeProbability((double) 1.0f);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + Double.POSITIVE_INFINITY + "'", double9 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double11 = normalDistributionImpl2.getInitialDomain((double) (-1L));
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.98786080588638d) + "'", double11 == (-99.98786080588638d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.34134474606854304d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.1586552539043654d);
        normalDistributionImpl2.setMean(0.0d);
        double double19 = normalDistributionImpl2.cumulativeProbability(6.439419598842644E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5000025689567392d + "'", double19 == 0.5000025689567392d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.9000000000335028d), 0.38212483247943946d);
        normalDistributionImpl2.setStandardDeviation(0.816634256911273d);
        normalDistributionImpl2.setMean(0.0d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean(100.01213919411362d);
        normalDistributionImpl0.setMean(0.5013880883243286d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        double double25 = normalDistributionImpl2.cumulativeProbability(0.8409366149786677d, 0.9991109747008919d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 6.309976261438255E-4d + "'", double25 == 6.309976261438255E-4d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.501361765869532d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-99.73312743878357d));
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.getInitialDomain(0.25986015636209525d);
        double double23 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((-34.027810452415785d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-100.0d) + "'", double22 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5310861547925172d, 97.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5310861547925172d + "'", double4 == 0.5310861547925172d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(100.50398935631463d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((-132.0d));
        double double20 = normalDistributionImpl2.getDomainLowerBound((-0.8413596248239952d));
        double double22 = normalDistributionImpl2.inverseCumulativeProbability(0.807849797896304d);
        java.lang.Class<?> wildcardClass23 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.7976931348623157E308d) + "'", double20 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 109.20398935647562d + "'", double22 == 109.20398935647562d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        double double21 = normalDistributionImpl2.getDomainLowerBound((double) (short) 0);
        normalDistributionImpl2.setStandardDeviation(0.7507529000010817d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.003982051263416553d);
        normalDistributionImpl0.setStandardDeviation(101.0d);
        normalDistributionImpl0.setMean(0.4613342436112585d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(102.74285731024536d);
        normalDistributionImpl2.setStandardDeviation(259.9799562906546d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.08729746340859079d);
        double double25 = normalDistributionImpl2.getDomainUpperBound(0.5000185094824923d);
        double double27 = normalDistributionImpl2.getInitialDomain(0.002774428975804377d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-39.81100517904762d) + "'", double23 == (-39.81100517904762d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.7976931348623157E308d + "'", double25 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-29.324838582032726d) + "'", double27 == (-29.324838582032726d));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainLowerBound((double) 1);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.9870192304409138d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.13514946487744206d);
        double double17 = normalDistributionImpl2.cumulativeProbability((-334.4117969580364d));
        normalDistributionImpl2.setStandardDeviation(0.6449537968852086d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 222.67866038790694d + "'", double13 == 222.67866038790694d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.1272314516782593E-4d + "'", double17 == 4.1272314516782593E-4d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, (double) 'a');
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6153338488435729d + "'", double12 == 0.6153338488435729d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38212483247943946d, (double) (byte) 10);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        normalDistributionImpl2.setStandardDeviation(0.8390361687153073d);
        double double30 = normalDistributionImpl2.getStandardDeviation();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.8390361687153073d + "'", double30 == 0.8390361687153073d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        double double23 = normalDistributionImpl2.getDomainUpperBound(92.80725716499194d);
        double double26 = normalDistributionImpl2.cumulativeProbability((-0.4369384131695145d), 96.48790399333775d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.7976931348623157E308d + "'", double23 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3344404260826833d + "'", double26 == 0.3344404260826833d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.9990117802232268d);
        normalDistributionImpl2.setMean(0.691462461274013d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        normalDistributionImpl2.setStandardDeviation(0.16852760746683781d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.16852760746683781d + "'", double14 == 0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.16852760746683781d + "'", double15 == 0.16852760746683781d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        double double25 = normalDistributionImpl2.inverseCumulativeProbability(0.3699782314207525d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.NEGATIVE_INFINITY + "'", double15 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9.733236532260937d) + "'", double25 == (-9.733236532260937d));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(35.50332704731315d);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.16116262477047377d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(4.860213132951152E-6d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = normalDistributionImpl2.cumulativeProbability(11.0d, 0.8442305198083204d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5039854140850405d + "'", double8 == 0.5039854140850405d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5006429455720895d + "'", double12 == 0.5006429455720895d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-442.33007853263365d) + "'", double14 == (-442.33007853263365d));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        normalDistributionImpl2.setMean(0.5d);
        normalDistributionImpl2.setStandardDeviation(2.9897509126136645E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38212483247943946d, (double) (byte) 10);
        double double4 = normalDistributionImpl2.getDomainLowerBound(102.74285731024536d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-52.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.38212483247943946d + "'", double4 == 0.38212483247943946d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setStandardDeviation(200.0d);
        double double13 = normalDistributionImpl2.getInitialDomain((-0.15864037517600482d));
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.8404349207008496d);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.0012156920342991095d, 0.3669245429555231d);
        double double20 = normalDistributionImpl2.getDomainUpperBound(0.9999973964845106d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 199.24939592632566d + "'", double15 == 199.24939592632566d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.294832041665478E-4d + "'", double18 == 7.294832041665478E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.7976931348623157E308d + "'", double20 == 1.7976931348623157E308d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 1L);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.16643735506845647d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.8390361687153073d);
        double double11 = normalDistributionImpl2.getInitialDomain((-374.59034152034485d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5729554663241068d + "'", double9 == 0.5729554663241068d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-11.0d) + "'", double11 == (-11.0d));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability(107.0d);
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        normalDistributionImpl0.setMean(0.341344746068543d);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0012518388356499988d, 0.9999999993515475d);
        double double16 = normalDistributionImpl0.cumulativeProbability(0.5006378007810146d);
        normalDistributionImpl0.setMean((-1.0d));
        double double20 = normalDistributionImpl0.getInitialDomain((-7.771561172376096E-16d));
        double double22 = normalDistributionImpl0.getDomainUpperBound((-100.4845043062131d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.37804813188807573d + "'", double14 == 0.37804813188807573d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5632810037843777d + "'", double16 == 0.5632810037843777d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.0d) + "'", double20 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
            double double18 = normalDistributionImpl2.cumulativeProbability(100.84134474606854d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getInitialDomain(0.999987716976066d);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.5013304021987853d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.0015054700491559103d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3334829949240306d + "'", double12 == 0.3334829949240306d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.3410511871010289d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.010090298830658262d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.4540980747251103d);
        java.lang.Class<?> wildcardClass20 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 62.0d + "'", double15 == 62.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.695941430105695d + "'", double17 == 15.695941430105695d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 92.96400591347039d + "'", double19 == 92.96400591347039d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5120960066622517d, 0.501361765869532d);
        normalDistributionImpl2.setStandardDeviation(0.4115308789714541d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(10.503989356314632d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5120960066622517d + "'", double6 == 0.5120960066622517d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.539827837277029d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-799.5509223927169d));
        double double21 = normalDistributionImpl2.getInitialDomain(0.9763823569067764d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.15864037517600482d + "'", double21 == 0.15864037517600482d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setMean((double) 10);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability(0.34134474606854304d, (double) 'a');
        normalDistributionImpl2.setStandardDeviation(0.5033570607468583d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl2.cumulativeProbability((-272.3126474186623d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6153338488435729d + "'", double12 == 0.6153338488435729d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        normalDistributionImpl2.setMean(0.7537117409813648d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.73312743878357d), 0.996954640520628d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.942890293094024E-15d, 409.37500000520356d);
        normalDistributionImpl2.setMean(0.15865525393145702d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(15.695941430105695d);
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.13377303683494296d);
        normalDistributionImpl2.setStandardDeviation(0.10504850654241193d);
        normalDistributionImpl2.setStandardDeviation(0.006292013927202356d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.15865525393145702d + "'", double6 == 0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-453.7282599068794d) + "'", double8 == (-453.7282599068794d));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.439419620615228E-4d, 59.120415885425516d);
        normalDistributionImpl2.setMean((double) 10);
        double double6 = normalDistributionImpl2.getDomainLowerBound((-12.799211304789129d));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 59.120415885425516d + "'", double7 == 59.120415885425516d);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5000016465271271d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        normalDistributionImpl2.setMean((-9.831472392533161d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getDomainLowerBound((double) (short) -1);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.1586664807605242d, 0.37665202364295614d);
        double double20 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 8.69633484597232E-4d + "'", double19 == 8.69633484597232E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.01213919411360942d + "'", double20 == 0.01213919411360942d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49999225367341527d, 0.5000974839933444d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 1.0000000000000004d);
        normalDistributionImpl2.setMean((double) '4');
        double double22 = normalDistributionImpl2.cumulativeProbability(0.003233364812544881d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0012156920342991095d + "'", double18 == 0.0012156920342991095d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3015430556759741d + "'", double22 == 0.3015430556759741d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-29.324838582032726d), 0.503327047302336d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        double double21 = normalDistributionImpl2.getInitialDomain(0.5000185094824923d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5378382600176361d + "'", double17 == 0.5378382600176361d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.42733157976821107d + "'", double19 == 0.42733157976821107d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 62.026126956040166d + "'", double21 == 62.026126956040166d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9990502703892551d, (-33.19110015555852d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double6 = normalDistributionImpl2.getInitialDomain(0.5792597094137458d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((-10.0d));
        double double6 = normalDistributionImpl2.getInitialDomain(Double.NaN);
        double double8 = normalDistributionImpl2.getDomainUpperBound((-99.98786080588638d));
        normalDistributionImpl2.setMean(6.952914751783279E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((double) '#');
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double9 = normalDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double11 = normalDistributionImpl2.getInitialDomain(0.6954518175886446d);
        double double13 = normalDistributionImpl2.getInitialDomain(52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-52.0d), 197.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(100.84160442550657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7810799538201194d + "'", double4 == 0.7810799538201194d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain(99.0d);
        double double9 = normalDistributionImpl2.getDomainUpperBound((-1.5543122344752192E-15d));
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(3.809557474743208E-5d);
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.546219801024759d + "'", double4 == 0.546219801024759d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-11.0d) + "'", double13 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.cumulativeProbability(3.0324839434953876d);
        double double19 = normalDistributionImpl2.getDomainLowerBound((-27.529693043639718d));
        double double20 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5120960066622517d + "'", double17 == 0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.3668235531222151d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getInitialDomain((-0.9702930200572873d));
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.inverseCumulativeProbability(101.01213919411362d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.63317644687778d + "'", double5 == 51.63317644687778d);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setMean(0.37665202364295614d);
        double double17 = normalDistributionImpl2.getInitialDomain(6.439419620615228E-4d);
        double double19 = normalDistributionImpl2.getDomainLowerBound((-277.33138319894914d));
        double double21 = normalDistributionImpl2.cumulativeProbability(0.9999787774020832d);
        double double22 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-99.62334797635704d) + "'", double17 == (-99.62334797635704d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5024866978629178d + "'", double21 == 0.5024866978629178d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15930186906976396d, (-2.0327734413351157d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double6 = normalDistributionImpl0.getDomainLowerBound(0.5006378332680903d);
        java.lang.Class<?> wildcardClass7 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5039893563146316d, 0.4979893818807349d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) 10);
        double double15 = normalDistributionImpl2.getDomainUpperBound(1.7976931348623157E308d);
        double double18 = normalDistributionImpl2.cumulativeProbability((-6.661338147750939E-16d), 0.5033270473131487d);
        double double19 = normalDistributionImpl2.getStandardDeviation();
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.002007903360221386d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0012209691105105058d + "'", double18 == 0.0012209691105105058d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-187.69174208146546d) + "'", double21 == (-187.69174208146546d));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        double double24 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        double double26 = normalDistributionImpl2.cumulativeProbability(2.7755575615628914E-16d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.429456955875379E-4d + "'", double18 == 6.429456955875379E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.4960106436853684d + "'", double24 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5d + "'", double26 == 0.5d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.cumulativeProbability(87.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((-96.65865525364724d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.807849797896304d + "'", double11 == 0.807849797896304d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        double double8 = normalDistributionImpl2.cumulativeProbability((double) '#');
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5020106023922443d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.5006673586700512d);
        normalDistributionImpl2.setMean((-3.252694975621581d));
        double double16 = normalDistributionImpl2.getInitialDomain((-62.000000236937524d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.999987716976066d + "'", double8 == 0.999987716976066d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-35.25269497562158d) + "'", double16 == (-35.25269497562158d));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        normalDistributionImpl2.setStandardDeviation(9.391305229797384d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, (double) 10);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.8532181028539636d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8339767539364704d + "'", double4 == 0.8339767539364704d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.503327047302336d);
        double double9 = normalDistributionImpl2.cumulativeProbability(8.890252991080594E-4d, 0.999987716976066d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getDomainLowerBound((-3.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.039396101914527804d + "'", double9 == 0.039396101914527804d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(409.37500000520356d, 100.0d);
        normalDistributionImpl2.setStandardDeviation(0.4966435003267168d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(100.50398935631463d);
        double double10 = normalDistributionImpl2.cumulativeProbability((-11.119995541385146d));
        double double12 = normalDistributionImpl2.getInitialDomain(0.011224171101298197d);
        double double14 = normalDistributionImpl2.cumulativeProbability((-6.106226635438361E-16d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5000081688930658d + "'", double6 == 0.5000081688930658d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4557288934945513d + "'", double10 == 0.4557288934945513d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
            double double30 = normalDistributionImpl2.cumulativeProbability(132.0d, (-1.503985414085041d));
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.7976931348623157E308d) + "'", double27 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double9 = normalDistributionImpl2.getInitialDomain((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability(0.6823959331695719d, (-0.38103458694487663d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability(0.9991109747008919d, (-101.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        double double27 = normalDistributionImpl2.inverseCumulativeProbability(0.02860714277600379d);
        normalDistributionImpl2.setMean(0.3668235531222151d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double33 = normalDistributionImpl2.cumulativeProbability(0.35945014846025747d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 101.0d + "'", double23 == 101.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-69.90167018868739d) + "'", double27 == (-69.90167018868739d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double11 = normalDistributionImpl0.getInitialDomain((double) 1L);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 10.0f);
        double double15 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.13766062861250977d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.039845748899803746d + "'", double14 == 0.039845748899803746d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(6.106226635438361E-16d);
        normalDistributionImpl2.setStandardDeviation(0.501361765869532d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.501361765869532d + "'", double10 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.501361765869532d + "'", double11 == 0.501361765869532d);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-2.1649348980190553E-15d), 0.3406824094489751d);
        normalDistributionImpl2.setStandardDeviation(0.5000251015038278d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
            double double17 = normalDistributionImpl2.inverseCumulativeProbability((-800.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
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
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-272.3126474186623d), 0.34794284620061744d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34794284620061744d + "'", double3 == 0.34794284620061744d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.08939857521611085d);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5003566486671073d + "'", double7 == 0.5003566486671073d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        double double23 = normalDistributionImpl2.getDomainLowerBound(0.01213919411360942d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = normalDistributionImpl2.inverseCumulativeProbability(0.6984682124530338d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5020429585576492d + "'", double19 == 0.5020429585576492d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.7976931348623157E308d) + "'", double23 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double6 = normalDistributionImpl2.cumulativeProbability(34.0d);
        double double8 = normalDistributionImpl2.getDomainUpperBound((-109.56601864344911d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.25801261928916336d + "'", double6 == 0.25801261928916336d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.4490776072831239d);
        double double21 = normalDistributionImpl2.cumulativeProbability(200.0d);
        normalDistributionImpl2.setStandardDeviation(0.5026547384068555d);
        double double25 = normalDistributionImpl2.getInitialDomain(0.42851072492061976d);
        normalDistributionImpl2.setMean(0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-12.799211304789129d) + "'", double19 == (-12.799211304789129d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9772498680518209d + "'", double21 == 0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.5026547384068555d) + "'", double25 == (-0.5026547384068555d));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double7 = normalDistributionImpl2.getDomainUpperBound(2.0539125955565396E-15d);
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.5000001572897933d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.5033270473131487d);
        double double19 = normalDistributionImpl2.getInitialDomain(109.26923508160773d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + Double.POSITIVE_INFINITY + "'", double15 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + Double.POSITIVE_INFINITY + "'", double17 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound(129.0d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double4 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.5000484283777002d);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.4144226483220369d, 1.0000898728711314d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.5000496440189875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.00233641240634197d + "'", double11 == 0.00233641240634197d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5019949011392464d + "'", double13 == 0.5019949011392464d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double20 = normalDistributionImpl2.cumulativeProbability((-228.26949715448018d), 0.4240925721925803d);
        double double21 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4904677084063031d + "'", double20 == 0.4904677084063031d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        double double20 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double21 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-101.0d) + "'", double20 == (-101.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 10, 0.501361765869532d);
        double double4 = normalDistributionImpl2.getInitialDomain(1.942890293094024E-15d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.498638234130468d + "'", double4 == 9.498638234130468d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.996954640520628d);
        normalDistributionImpl2.setMean((-126.12663573645062d));
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-126.12663573645062d) + "'", double17 == (-126.12663573645062d));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean((-69.90167018868739d));
        double double8 = normalDistributionImpl2.getInitialDomain(194.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.09832981131261d + "'", double8 == 30.09832981131261d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.5019813127606616d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(100.50200740008205d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.502002607285855d + "'", double9 == 0.502002607285855d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.4490776072831239d);
        double double21 = normalDistributionImpl2.cumulativeProbability(200.0d);
        normalDistributionImpl2.setStandardDeviation(0.5026547384068555d);
        double double25 = normalDistributionImpl2.getInitialDomain(1.0364480113667245d);
        normalDistributionImpl2.setMean((-453.7282599068794d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-12.799211304789129d) + "'", double19 == (-12.799211304789129d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9772498680518209d + "'", double21 == 0.9772498680518209d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5026547384068555d + "'", double25 == 0.5026547384068555d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation(9.047742753903742E-4d);
        double double10 = normalDistributionImpl2.getDomainLowerBound((-8.326672684688674E-15d));
        normalDistributionImpl2.setMean((-330.30060268987296d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        double double30 = normalDistributionImpl2.getDomainUpperBound(129.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = normalDistributionImpl2.cumulativeProbability(0.11845872098528987d, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 99.0d + "'", double28 == 99.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.7976931348623157E308d + "'", double30 == 1.7976931348623157E308d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        double double21 = normalDistributionImpl2.getInitialDomain((double) 'a');
        double double22 = normalDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass23 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 101.0d + "'", double21 == 101.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        double double19 = normalDistributionImpl2.getInitialDomain(0.3435291934680794d);
        double double21 = normalDistributionImpl2.getDomainUpperBound(9.047742753903742E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-112.50817060471245d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.341344746068543d, 0.3410511871010289d);
        double double4 = normalDistributionImpl2.getInitialDomain((double) ' ');
        normalDistributionImpl2.setMean(0.5000974839933444d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.02860714277600379d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6823959331695719d + "'", double4 == 0.6823959331695719d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3410511871010289d + "'", double7 == 0.3410511871010289d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.49999999998978356d, 0.1591531807176773d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.691462461274013d);
        double double12 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        double double26 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = normalDistributionImpl2.cumulativeProbability(10.002029788284654d, 0.002031565577024441d);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 200.0d + "'", double21 == 200.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-26.12663573645063d) + "'", double23 == (-26.12663573645063d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.5003566486671073d);
        double double12 = normalDistributionImpl2.getInitialDomain((double) (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5019961258952685d + "'", double10 == 0.5019961258952685d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.5039854140850405d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-39.81100517904762d));
        double double21 = normalDistributionImpl2.cumulativeProbability(0.07365795537454656d);
        double double23 = normalDistributionImpl2.cumulativeProbability((-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5002938527002967d + "'", double21 == 0.5002938527002967d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.15865525393145702d + "'", double23 == 0.15865525393145702d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((double) '#');
        double double9 = normalDistributionImpl2.cumulativeProbability((-99.49799202407699d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08931585955781551d + "'", double9 == 0.08931585955781551d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getInitialDomain(0.0012541753965479852d);
        double double13 = normalDistributionImpl2.cumulativeProbability((-312.50001232497266d));
        double double15 = normalDistributionImpl2.getInitialDomain(0.5012996970417724d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.582067810090848E-14d + "'", double13 == 1.582067810090848E-14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.4557288934945513d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-31.428571428221588d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
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
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.9987872496534157d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        double double24 = normalDistributionImpl2.cumulativeProbability(0.5062828993298469d);
        double double26 = normalDistributionImpl2.cumulativeProbability(100.34828882463913d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5039893563146316d + "'", double11 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003982051263416553d + "'", double18 == 0.003982051263416553d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.841344746068543d + "'", double20 == 0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-100.0d) + "'", double22 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5020197679153369d + "'", double24 == 0.5020197679153369d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.8421860354496948d + "'", double26 == 0.8421860354496948d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-312.05092239451676d), 0.5039854140850405d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.6153338488435729d);
        normalDistributionImpl2.setStandardDeviation(409.37500000520356d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.5000081688930658d);
        double double15 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5062828993298469d + "'", double8 == 0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.507670861292653d + "'", double10 == 0.507670861292653d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(0.5000484283777002d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.003982051263416553d);
        double double11 = normalDistributionImpl0.getDomainUpperBound(0.175877604587528d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.5027585141294139d, 0.5297069799427127d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d, 0.9990394412085004d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.1649348980190553E-15d) + "'", double8 == (-2.1649348980190553E-15d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.4988010832439613E-15d) + "'", double11 == (-1.4988010832439613E-15d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 1.0000000000000004d);
        double double20 = normalDistributionImpl2.getDomainLowerBound(97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0012156920342991095d + "'", double18 == 0.0012156920342991095d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.cumulativeProbability(3.0324839434953876d);
        double double19 = normalDistributionImpl2.getDomainLowerBound((-27.529693043639718d));
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.08729746340859079d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5120960066622517d + "'", double17 == 0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(1.609823385706477E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-786.0d) + "'", double11 == (-786.0d));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 1.7976931348623157E308d);
        double double5 = normalDistributionImpl2.cumulativeProbability(0.15865525393145696d, 0.3344404260826833d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.01213919411360942d, 0.4490776072831239d);
        normalDistributionImpl2.setMean((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) ' ');
        double double8 = normalDistributionImpl2.getInitialDomain(0.02860714277600379d);
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.55092239271687d + "'", double8 == 99.55092239271687d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5020028532139044d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.6153338488435729d);
        double double17 = normalDistributionImpl2.cumulativeProbability(92.80725716499194d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5004521251615823d + "'", double15 == 0.5004521251615823d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8220100879493031d + "'", double17 == 0.8220100879493031d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.501361765869532d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-99.73312743878357d));
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.getInitialDomain(0.25986015636209525d);
        double double23 = normalDistributionImpl2.getMean();
        double double25 = normalDistributionImpl2.getInitialDomain(0.0494714680336481d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-100.0d) + "'", double22 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-100.0d) + "'", double25 == (-100.0d));
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(6.439419620615228E-4d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.8532181028539636d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, 11.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = normalDistributionImpl2.cumulativeProbability(100.34105118710103d, 0.140071090088769d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.22074688003828388d, 9.0350385020563d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.cumulativeProbability(0.0027907034839972367d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.30952073317575746d + "'", double5 == 0.30952073317575746d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-99.15865525393146d), 0.691462461274013d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.16433493561953405d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-99.85011771520547d) + "'", double4 == (-99.85011771520547d));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.5006153217161514d);
        double double7 = normalDistributionImpl2.getInitialDomain(0.0020196158042963264d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5019971578385047d + "'", double5 == 0.5019971578385047d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.09950447039473481d, 2.0509166282900448E-4d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.4992439296527548d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5019916868441024d + "'", double19 == 0.5019916868441024d);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double15 = normalDistributionImpl2.getInitialDomain(0.5000025689567479d);
        double double17 = normalDistributionImpl2.getDomainUpperBound((-99.85011771520547d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        double double8 = normalDistributionImpl2.getDomainLowerBound(100.50398935631463d);
        double double10 = normalDistributionImpl2.cumulativeProbability((-11.119995541385146d));
        double double12 = normalDistributionImpl2.getInitialDomain(0.011224171101298197d);
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.13661375606882142d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5000081688930658d + "'", double6 == 0.5000081688930658d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4557288934945513d + "'", double10 == 0.4557288934945513d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.1590394216775845d + "'", double22 == 0.1590394216775845d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-1.3322676295501878E-15d));
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
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6921596669396051d, (-287.19228667059815d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getInitialDomain(409.37500000520356d);
        normalDistributionImpl0.setMean(0.341344746068543d);
        double double13 = normalDistributionImpl0.getDomainUpperBound(0.16116262477047377d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = normalDistributionImpl0.cumulativeProbability(0.49999999998978356d, (-1.503985414085041d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d);
        normalDistributionImpl2.setStandardDeviation(200.0d);
        double double13 = normalDistributionImpl2.getInitialDomain((-0.15864037517600482d));
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(0.5016193542725117d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5001042314730403d + "'", double9 == 0.5001042314730403d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.8118260705588964d + "'", double16 == 0.8118260705588964d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        normalDistributionImpl2.setMean((-9.733236532260937d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.00398940617809046d + "'", double17 == 0.00398940617809046d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        normalDistributionImpl2.setStandardDeviation(0.5d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5000000000002491d);
        double double17 = normalDistributionImpl2.getInitialDomain((-1.3877787807814457E-15d));
        normalDistributionImpl2.setMean((-32.0d));
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.13306917105380833d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8413447460686635d + "'", double15 == 0.8413447460686635d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.5d) + "'", double17 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-32.555999776303494d) + "'", double21 == (-32.555999776303494d));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.07365796733045685d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double16 = normalDistributionImpl2.cumulativeProbability((-287.19228667059815d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.002039912671986388d + "'", double16 == 0.002039912671986388d);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.5120960066622517d);
        java.lang.Class<?> wildcardClass3 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-31.623158857349317d), 8.3936365174897E-4d);
        normalDistributionImpl2.setMean((-175.24788832960508d));
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        normalDistributionImpl2.setStandardDeviation(0.4992439296527548d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.10360644854994305d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9864666857579916d + "'", double19 == 0.9864666857579916d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.000000000000002d, 0.4557288934945513d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability(101.01213919411362d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.getInitialDomain((double) 10.0f);
        normalDistributionImpl2.setStandardDeviation(1.0000000000000449d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 107.0d + "'", double12 == 107.0d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.1260654216405832d);
        double double16 = normalDistributionImpl2.cumulativeProbability(0.04838995734662288d, 100.34134474606854d);
        double double17 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-114.51890744369275d) + "'", double13 == (-114.51890744369275d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3419762427587607d + "'", double16 == 0.3419762427587607d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(3.0324839434953876d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((-190.53983024611358d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0324839434953876d + "'", double4 == 3.0324839434953876d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 409.37500000520356d);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(100.34134474606854d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5958678794691377d + "'", double5 == 0.5958678794691377d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainLowerBound(100.00411074825631d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(410.37500000520356d, 0.07365795537454656d);
        normalDistributionImpl2.setStandardDeviation(0.4924205527050616d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        double double6 = normalDistributionImpl2.getDomainLowerBound(6.106226635438361E-16d);
        double double8 = normalDistributionImpl2.getInitialDomain(1.711841352131704d);
        double double10 = normalDistributionImpl2.getInitialDomain(0.29750602479108235d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-68.0d) + "'", double8 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-132.0d) + "'", double10 == (-132.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 62.0d + "'", double16 == 62.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-321.8666021266556d), 0.0024190355127375884d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-321.8666021266556d) + "'", double3 == (-321.8666021266556d));
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        double double8 = normalDistributionImpl2.getDomainUpperBound(35.50332704731315d);
        double double10 = normalDistributionImpl2.getDomainLowerBound((-800.0d));
        normalDistributionImpl2.setMean(9.498638234130468d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.4540980747251103d);
        double double17 = normalDistributionImpl2.cumulativeProbability((-181.0d), 0.6153338488435729d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0327734413351157d) + "'", double14 == (-2.0327734413351157d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.4362163775106971d + "'", double17 == 0.4362163775106971d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(0.059977535157524076d);
        double double7 = normalDistributionImpl2.getDomainUpperBound(0.9999999993515475d);
        normalDistributionImpl2.setMean(0.13377303683494296d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.7976931348623157E308d) + "'", double5 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.4993376909985171d, 0.3406824094489751d);
        normalDistributionImpl2.setMean(0.9772498680518209d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.cumulativeProbability(0.38212483247943946d, 0.506713322768457d);
        double double12 = normalDistributionImpl0.getMean();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0012766099775947935d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.3877787807814457E-15d) + "'", double11 == (-1.3877787807814457E-15d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.881784197001252E-16d) + "'", double14 == (-8.881784197001252E-16d));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        normalDistributionImpl2.setMean(0.691462461274013d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(0.1591531807176773d);
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.266416880227914d + "'", double23 == 2.266416880227914d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getDomainLowerBound(2.0551338408836273E-12d);
        double double9 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.cumulativeProbability((double) 1.0f, (-31.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.691462461274013d + "'", double9 == 0.691462461274013d);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.34134474606854304d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.01213919411360942d);
        double double15 = normalDistributionImpl2.getInitialDomain((-99.00088902533815d));
        double double17 = normalDistributionImpl2.getInitialDomain(0.9864666857579916d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getInitialDomain(1.0d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.getDomainUpperBound(0.4442181813792718d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double15 = normalDistributionImpl2.cumulativeProbability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4959622177584191d + "'", double15 == 0.4959622177584191d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        double double7 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.4490776072831239d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.30952073317575746d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.22074688003828388d);
        double double23 = normalDistributionImpl2.getDomainLowerBound(0.0020196158042963264d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.50398935631463d + "'", double17 == 100.50398935631463d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 92.80725716499194d + "'", double21 == 92.80725716499194d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.7976931348623157E308d) + "'", double23 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5004870960802225d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainLowerBound((-10.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl2.inverseCumulativeProbability((-0.8413596248239952d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.getInitialDomain(0.376841142650683d);
        double double12 = normalDistributionImpl2.getInitialDomain(0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 197.0d + "'", double12 == 197.0d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double7 = normalDistributionImpl0.cumulativeProbability((double) 10.0f);
        double double8 = normalDistributionImpl0.getMean();
        double double9 = normalDistributionImpl0.getStandardDeviation();
        double double11 = normalDistributionImpl0.getDomainLowerBound(0.5000034693356545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 10, 1.0d);
        normalDistributionImpl2.setMean((double) (-1.0f));
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(6.106226635438361E-16d);
        normalDistributionImpl2.setStandardDeviation(0.501361765869532d);
        normalDistributionImpl2.setMean(0.03021135797796476d);
        java.lang.Class<?> wildcardClass12 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 0.9990117802232268d);
        normalDistributionImpl2.setMean((-99.15865525393146d));
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(32.0d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5020028532139044d);
        double double15 = normalDistributionImpl2.inverseCumulativeProbability(0.5341532272166142d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 9.07343142430848d + "'", double15 == 9.07343142430848d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        double double20 = normalDistributionImpl2.getMean();
        double double21 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.4490776072831239d + "'", double14 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9990394412085004d + "'", double20 == 0.9990394412085004d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.4490776072831239d + "'", double21 == 0.4490776072831239d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double9 = normalDistributionImpl2.getInitialDomain((double) 10.0f);
        double double11 = normalDistributionImpl2.getInitialDomain(0.5004870960802225d);
        double double14 = normalDistributionImpl2.cumulativeProbability(1.1102230246251565E-15d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.34134474606854304d + "'", double14 == 0.34134474606854304d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5310861547925172d, 97.0d);
        normalDistributionImpl2.setStandardDeviation(0.36931748722364566d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.cumulativeProbability(3.0324839434953876d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.5002938527002967d);
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5120960066622517d + "'", double17 == 0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.07365796733045685d + "'", double19 == 0.07365796733045685d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.cumulativeProbability(0.9991109747008919d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability(4.860213132951152E-6d, 0.0012156920342991095d);
        double double15 = normalDistributionImpl2.cumulativeProbability(6.439419598842644E-4d, 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.16108488682834415d + "'", double8 == 0.16108488682834415d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.929876410651122E-6d + "'", double12 == 2.929876410651122E-6d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.166968745907608E-5d + "'", double15 == 6.166968745907608E-5d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(400.12500003330143d, 0.5001930479917899d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        double double21 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass22 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5006333584453674d + "'", double20 == 0.5006333584453674d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        normalDistributionImpl2.setMean((double) 10.0f);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass8 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        normalDistributionImpl2.setMean(99.49601458591496d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.cumulativeProbability(4.860213132951152E-6d, 0.5018815478082819d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.001223562276163881d + "'", double17 == 0.001223562276163881d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        double double6 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) '#');
        double double10 = normalDistributionImpl0.inverseCumulativeProbability(0.006292013927202356d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.50467067852617d + "'", double10 == 32.50467067852617d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double20 = normalDistributionImpl2.cumulativeProbability(0.49836914509065217d, 101.16064255229166d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.3421486667935335d + "'", double20 == 0.3421486667935335d);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5039854140850405d);
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((-99.83147239253316d));
        double double12 = normalDistributionImpl2.getDomainLowerBound(0.5000974839933444d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9991574196213242d + "'", double7 == 0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5021010149137857d + "'", double10 == 0.5021010149137857d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(68.57142857177841d, 100.50318270376744d);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-228.26949715448018d), 32.62551583472332d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((-0.9000000000335028d));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 10.0d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.3346390629379533d);
        double double6 = normalDistributionImpl2.cumulativeProbability(10.00298121154028d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 91.0d + "'", double4 == 91.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6653345369377348E-15d + "'", double6 == 1.6653345369377348E-15d);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-128.26949715448018d), 0.5039893563146316d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((-26.12663573645063d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(0.011224171101298197d);
        normalDistributionImpl2.setMean(0.08729746340859079d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.7976931348623157E308d) + "'", double15 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.NEGATIVE_INFINITY + "'", double19 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9991109747008919d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double8 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.cumulativeProbability((double) (short) -1);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.cumulativeProbability(1.5d);
        double double17 = normalDistributionImpl2.getInitialDomain(5.391661164261377E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4960106436853684d + "'", double10 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2822385972445549d + "'", double15 == 0.2822385972445549d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-40.879584114574484d) + "'", double17 == (-40.879584114574484d));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setStandardDeviation(309.37500000520356d);
        normalDistributionImpl2.setMean(9.0d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.9205522273689688d);
        double double16 = normalDistributionImpl2.getDomainLowerBound((-99.02522234182658d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 309.37500000520356d + "'", double12 == 309.37500000520356d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9990117802233995d, 0.4966435003267168d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5000602018993799d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9990117802233995d + "'", double4 == 0.9990117802233995d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        normalDistributionImpl2.setStandardDeviation((double) (byte) 1);
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
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.5033270473131487d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.9205522273689688d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.73312743878357d) + "'", double8 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9991941121393171d + "'", double10 == 0.9991941121393171d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3406824094489751d, 100.34105118710103d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.cumulativeProbability(0.5039854140850412d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double18 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        normalDistributionImpl2.setMean(0.5001930479917899d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5020106023922443d + "'", double13 == 0.5020106023922443d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + Double.NEGATIVE_INFINITY + "'", double18 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10, (double) '4');
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.5053565223803516d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.009021039372468731d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-99.49464347761965d) + "'", double17 == (-99.49464347761965d));
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        normalDistributionImpl2.setMean(11.0d);
        double double14 = normalDistributionImpl2.getDomainLowerBound(0.9990117802233995d);
        normalDistributionImpl2.setMean(51.63317644687778d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        double double25 = normalDistributionImpl2.getInitialDomain(0.5033600462439357d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        double double22 = normalDistributionImpl2.getDomainUpperBound(0.3406824094489751d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5006333584453674d + "'", double20 == 0.5006333584453674d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.341344746068543d + "'", double22 == 0.341344746068543d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.001986788236930437d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        normalDistributionImpl2.setStandardDeviation((double) (short) 1);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.816634256911273d);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.841500269950151d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7976931348623157E308d + "'", double14 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.cumulativeProbability(0.5053565223803516d);
        normalDistributionImpl2.setMean(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.15988115854417262d + "'", double16 == 0.15988115854417262d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.4490776072831239d, 0.5004870960802225d);
        double double9 = normalDistributionImpl2.getDomainUpperBound(0.5062828993298469d);
        double double10 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.49999225367341527d + "'", double4 == 0.49999225367341527d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0509166282900448E-4d + "'", double7 == 2.0509166282900448E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003989356314631598d + "'", double10 == 0.003989356314631598d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.5020106023922443d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(1.938493374054051E-5d);
        double double11 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-40.14690864207278d) + "'", double10 == (-40.14690864207278d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        normalDistributionImpl2.setStandardDeviation(0.6449537968852086d);
        double double29 = normalDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.7228081817379124d + "'", double29 == 0.7228081817379124d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
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
        double double23 = normalDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.9990117802233995d);
        double double13 = normalDistributionImpl2.getMean();
        double double15 = normalDistributionImpl2.getDomainUpperBound(35.50332704731315d);
        normalDistributionImpl2.setMean(0.0012826018800755623d);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.16116262477047377d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5063780183702739d + "'", double19 == 0.5063780183702739d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        java.lang.Class<?> wildcardClass25 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 99.49601458591496d + "'", double24 == 99.49601458591496d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setStandardDeviation(309.37500000520356d);
        normalDistributionImpl2.setMean(206.7000000016635d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-52.0d), 197.0d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-52.0d) + "'", double3 == (-52.0d));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        double double25 = normalDistributionImpl2.cumulativeProbability(0.48790399333774825d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5019464475946475d + "'", double25 == 0.5019464475946475d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.9772498680518209d);
        double double19 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double21 = normalDistributionImpl2.getDomainLowerBound(0.04838995734662288d);
        normalDistributionImpl2.setStandardDeviation(0.008210473291957843d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.NEGATIVE_INFINITY + "'", double19 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.3319448802391164d, 0.34182774550744877d);
        double double19 = normalDistributionImpl2.cumulativeProbability((-285.61164523091827d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.942670432222073E-5d + "'", double17 == 3.942670432222073E-5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0021442890359219535d + "'", double19 == 0.0021442890359219535d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.09950447039473481d, 0.5033270473131487d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.6855935107901387d);
        double double6 = normalDistributionImpl2.getInitialDomain(32.62551583472332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6028315177078836d + "'", double4 == 0.6028315177078836d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6028315177078836d + "'", double6 == 0.6028315177078836d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1);
        normalDistributionImpl2.setStandardDeviation(97.77142633673954d);
        double double9 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16116265572688077d + "'", double6 == 0.16116265572688077d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((-31.623158857349317d));
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getInitialDomain(0.5032578631163334d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 68.37684114265068d + "'", double13 == 68.37684114265068d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(0.5000001572897933d, (-100.4845043062131d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-799.5509223927169d), (-316.3803641163205d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double22 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.0d + "'", double19 == 99.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.getDomainLowerBound(107.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.01213919411360942d);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        double double10 = normalDistributionImpl2.getInitialDomain(0.996954640520628d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-128.26949715237384d) + "'", double4 == (-128.26949715237384d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.16602324606352958d + "'", double6 == 0.16602324606352958d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 197.0d + "'", double10 == 197.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004777486474361492d, 0.0017559868084203734d);
        normalDistributionImpl2.setMean(0.0012518388356499988d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0017559868084203734d + "'", double5 == 0.0017559868084203734d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        double double21 = normalDistributionImpl2.getDomainUpperBound(0.996954640520628d);
        double double23 = normalDistributionImpl2.getDomainUpperBound(0.10360644854994305d);
        double double25 = normalDistributionImpl2.getDomainLowerBound(0.5000018982459924d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0020476378332464074d + "'", double19 == 0.0020476378332464074d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.7976931348623157E308d + "'", double21 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.102823232264175d, 0.002007903360221386d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(52.0d);
        normalDistributionImpl2.setMean((-0.9000000000335028d));
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(100.34828882463913d);
        normalDistributionImpl2.setStandardDeviation(0.4012936743170763d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.getInitialDomain(0.5039893563146316d);
        normalDistributionImpl2.setStandardDeviation(0.5027585141294139d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.003989356314631598d, 100.00012139194168d);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.inverseCumulativeProbability(0.816634256911273d);
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.00012139194168d + "'", double3 == 100.00012139194168d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.26536848661516d + "'", double5 == 90.26536848661516d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003989356314631598d + "'", double6 == 0.003989356314631598d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-31.428571428221588d), (-31.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.16116265572688077d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain(99.0d);
        double double9 = normalDistributionImpl2.getDomainUpperBound((-1.5543122344752192E-15d));
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(3.809557474743208E-5d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.4362163775106971d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.546219801024759d + "'", double4 == 0.546219801024759d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-11.0d) + "'", double13 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5571003733268869d + "'", double15 == 0.5571003733268869d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.691462461274013d + "'", double8 == 0.691462461274013d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(410.37500000520356d, 0.08729746340859079d);
        normalDistributionImpl2.setMean(0.0012541753965479852d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) '4');
        double double10 = normalDistributionImpl2.getDomainLowerBound(409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(0.48790399333774825d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.841500269950151d, 0.35945014846025747d);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.cumulativeProbability((double) 1.0f);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 35.50332704731315d);
        double double21 = normalDistributionImpl2.inverseCumulativeProbability(0.16643735506845647d);
        double double23 = normalDistributionImpl2.cumulativeProbability(0.37665202364295614d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5039893563146316d + "'", double16 == 0.5039893563146316d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.13671765618845966d + "'", double19 == 0.13671765618845966d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-96.83397675379372d) + "'", double21 == (-96.83397675379372d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5015026206194335d + "'", double23 == 0.5015026206194335d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 0.9990117802232268d);
        normalDistributionImpl2.setStandardDeviation(0.5000185094824923d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = normalDistributionImpl2.cumulativeProbability(100.50199470309074d, 0.9732827299359185d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.7688235963189542d);
        double double16 = normalDistributionImpl2.getDomainLowerBound((double) 0);
        double double19 = normalDistributionImpl2.cumulativeProbability(0.16852760746683781d, 0.5003566436642092d);
        double double22 = normalDistributionImpl2.cumulativeProbability(0.29812036135129827d, 0.501361765869532d);
        double double24 = normalDistributionImpl2.cumulativeProbability(0.9987872496534157d);
        double double26 = normalDistributionImpl2.getDomainUpperBound(0.5019813127606616d);
        normalDistributionImpl2.setMean(0.5006378007810146d);
        normalDistributionImpl2.setMean(34.01213919411361d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.7976931348623157E308d) + "'", double16 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.03877026173060294d + "'", double19 == 0.03877026173060294d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.020241005302473858d + "'", double22 == 0.020241005302473858d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9953360887357412d + "'", double24 == 0.9953360887357412d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.7976931348623157E308d + "'", double26 == 1.7976931348623157E308d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        double double19 = normalDistributionImpl2.getDomainLowerBound((-0.49951290391977754d));
        normalDistributionImpl2.setMean((-100.841359624824d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        normalDistributionImpl0.setMean((double) 1L);
        double double9 = normalDistributionImpl0.getDomainLowerBound((double) (short) -1);
        double double11 = normalDistributionImpl0.getInitialDomain((double) 1L);
        double double14 = normalDistributionImpl0.cumulativeProbability(0.0d, (double) 10.0f);
        normalDistributionImpl0.setMean(65.0d);
        double double17 = normalDistributionImpl0.getStandardDeviation();
        double double19 = normalDistributionImpl0.getInitialDomain(0.3346390629379533d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.039845748899803746d + "'", double14 == 0.039845748899803746d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-35.0d) + "'", double19 == (-35.0d));
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.34134474606854304d);
        normalDistributionImpl2.setStandardDeviation(0.6449537968852086d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.1591531807176773d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1742829058275558d, 0.09950447039473481d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1742829058275558d + "'", double3 == 0.1742829058275558d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.getDomainUpperBound(0.0d);
        double double15 = normalDistributionImpl2.cumulativeProbability(0.5013304021987853d, 0.999987716976066d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0012518388356499988d + "'", double15 == 0.0012518388356499988d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        normalDistributionImpl2.setMean(0.3346390629379533d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.0324839434953876d + "'", double17 == 3.0324839434953876d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        double double23 = normalDistributionImpl2.cumulativeProbability((-1.0d));
        double double26 = normalDistributionImpl2.cumulativeProbability(0.5016918795069807d, 0.6153338488431551d);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.4960106436853684d + "'", double23 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.5335876855256974E-4d + "'", double26 == 4.5335876855256974E-4d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double10 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        double double14 = normalDistributionImpl2.inverseCumulativeProbability(0.9999999999999823d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 758.9997146186863d + "'", double14 == 758.9997146186863d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        double double23 = normalDistributionImpl2.getInitialDomain(0.6292541560646674d);
        double double24 = normalDistributionImpl2.getStandardDeviation();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 10.0d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.1586552539043654d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.5006378332680903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-10.0d) + "'", double4 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        normalDistributionImpl2.setMean((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.cumulativeProbability(0.5026547384068555d);
        double double10 = normalDistributionImpl2.getMean();
        double double12 = normalDistributionImpl2.getDomainUpperBound((-96.83397675379372d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0012826018800755623d + "'", double9 == 0.0012826018800755623d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        normalDistributionImpl2.setStandardDeviation(0.4240925721925803d);
        double double35 = normalDistributionImpl2.cumulativeProbability(0.8442305198083204d);
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.6398040011817943d + "'", double35 == 0.6398040011817943d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.7976931348623157E308d), 0.16602324606353464d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double8 = normalDistributionImpl2.getDomainUpperBound((-1.0d));
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.816634256911273d);
        double double12 = normalDistributionImpl2.getInitialDomain(0.10360644854994305d);
        normalDistributionImpl2.setMean(0.3410511871010289d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 190.26126956039283d + "'", double10 == 190.26126956039283d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 10);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563131264d);
        normalDistributionImpl2.setMean(0.841500270091506d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getDomainLowerBound(314.1692288583126d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.inverseCumulativeProbability((-1.5039893563037323d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3199999997720503d + "'", double6 == 0.3199999997720503d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.841500270091506d + "'", double11 == 0.841500270091506d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.439419620615228E-4d, 59.120415885425516d);
        normalDistributionImpl2.setMean((double) 10);
        double double6 = normalDistributionImpl2.getDomainLowerBound((-12.799211304789129d));
        normalDistributionImpl2.setMean(0.48839768861847016d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        // The following exception was thrown during execution in test generation
        try {
            double double21 = normalDistributionImpl2.cumulativeProbability(0.9991144879003537d, 0.00233641240634197d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5026547384068555d + "'", double15 == 0.5026547384068555d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.16852760746683781d + "'", double17 == 0.16852760746683781d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.841344746068543d);
        normalDistributionImpl2.setStandardDeviation(0.3668235531222151d);
        normalDistributionImpl2.setMean(1.0d);
        double double21 = normalDistributionImpl2.getInitialDomain(1.942890293094024E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.633176446877785d + "'", double21 == 0.633176446877785d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(11.0d, 0.7228081817379124d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.0d + "'", double3 == 11.0d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.6153338488435729d);
        double double19 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double22 = normalDistributionImpl2.cumulativeProbability(97.50000256894629d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 29.324838582032726d + "'", double17 == 29.324838582032726d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.00612486967738568d + "'", double22 == 0.00612486967738568d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5000000000002491d);
        normalDistributionImpl2.setMean((-312.50001232497266d));
        normalDistributionImpl2.setStandardDeviation(0.5000018982459924d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.37804813188807573d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5019947030907418d + "'", double11 == 0.5019947030907418d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-313.00001422321867d) + "'", double17 == (-313.00001422321867d));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double4 = normalDistributionImpl0.getStandardDeviation();
        double double5 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.5019813127606616d);
        double double9 = normalDistributionImpl0.getDomainLowerBound(0.4635132680301096d);
        double double11 = normalDistributionImpl0.getInitialDomain((-98.96907216489954d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.004966471651344884d + "'", double7 == 0.004966471651344884d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.7976931348623157E308d) + "'", double9 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        double double31 = normalDistributionImpl2.getDomainLowerBound(0.8298298865645481d);
        double double33 = normalDistributionImpl2.getDomainUpperBound((-330.30060268987296d));
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9987872496534157d + "'", double31 == 0.9987872496534157d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.9987872496534157d + "'", double33 == 0.9987872496534157d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (byte) 100);
        normalDistributionImpl2.setMean((double) '4');
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(100.50398935631463d);
        java.lang.Class<?> wildcardClass13 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) 100L);
        normalDistributionImpl2.setStandardDeviation(1.5d);
        double double8 = normalDistributionImpl2.getDomainUpperBound((-409.7391522790326d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        normalDistributionImpl2.setMean(59.120415885425516d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        normalDistributionImpl2.setStandardDeviation(90.26536848661516d);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.08919152173113587d);
        normalDistributionImpl2.setMean(46.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-120.47465095323574d) + "'", double10 == (-120.47465095323574d));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 1.7976931348623157E308d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5120960066622517d);
        normalDistributionImpl2.setStandardDeviation(0.09950447039473481d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09950447039473481d + "'", double7 == 0.09950447039473481d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09950447039473481d + "'", double8 == 0.09950447039473481d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setMean(1.7976931348623157E308d);
        normalDistributionImpl2.setMean((double) 'a');
        double double10 = normalDistributionImpl2.inverseCumulativeProbability(0.9991574196213242d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 411.0749544588838d + "'", double10 == 411.0749544588838d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getStandardDeviation();
        double double17 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double19 = normalDistributionImpl2.getDomainLowerBound((double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        normalDistributionImpl2.setMean(0.01213919411360942d);
        double double14 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.cumulativeProbability(0.3767128459166525d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01213919411360942d + "'", double14 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.501454435218333d + "'", double16 == 0.501454435218333d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '#', 6.439419620630119E-4d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.5188388553062419d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.00064394196206d + "'", double4 == 35.00064394196206d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        double double21 = normalDistributionImpl2.getInitialDomain(0.5006333584453674d);
        double double22 = normalDistributionImpl2.getStandardDeviation();
        double double24 = normalDistributionImpl2.getDomainLowerBound((-98.96907216489954d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 101.0d + "'", double21 == 101.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.7976931348623157E308d) + "'", double24 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.006292013927202356d, 5.86619840259317E-7d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = normalDistributionImpl2.inverseCumulativeProbability((-154.96651377710546d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.01213919411360942d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.999128202968101d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5004870960802225d, 0.002415011832167635d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.1610870595108309d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.7976931348623157E308d) + "'", double4 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setMean((double) (short) 0);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.999987716976066d);
        double double10 = normalDistributionImpl2.getDomainUpperBound((double) 1L);
        double double12 = normalDistributionImpl2.cumulativeProbability(0.5000000000002491d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getInitialDomain(410.37500000520356d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5019947030907418d + "'", double12 == 0.5019947030907418d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.4490776072831239d, 0.9991109747008919d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.cumulativeProbability(0.4625738809671905d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-6.106226635438361E-16d) + "'", double11 == (-6.106226635438361E-16d));
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        double double24 = normalDistributionImpl2.getDomainLowerBound(0.5019947133392674d);
        double double26 = normalDistributionImpl2.getDomainLowerBound((double) (-1L));
        double double28 = normalDistributionImpl2.getDomainUpperBound(0.32982560921663984d);
        double double30 = normalDistributionImpl2.cumulativeProbability(0.5001930479917899d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.7976931348623157E308d) + "'", double26 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.942890293094024E-15d + "'", double30 == 1.942890293094024E-15d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0013750926571968192d);
        double double19 = normalDistributionImpl2.getInitialDomain(101.0d);
        double double21 = normalDistributionImpl2.getDomainUpperBound((-6.106226635438361E-16d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.0d) + "'", double17 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double3 = normalDistributionImpl2.getMean();
        double double5 = normalDistributionImpl2.cumulativeProbability(0.5006153217161514d);
        normalDistributionImpl2.setMean(34.0d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5019971578385047d + "'", double5 == 0.5019971578385047d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 34.0d + "'", double8 == 34.0d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double6 = normalDistributionImpl2.cumulativeProbability((double) (-1));
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.inverseCumulativeProbability(1.0000898728711314d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9990117802232268d + "'", double6 == 0.9990117802232268d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(0.5039893563146316d);
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double17 = normalDistributionImpl2.getInitialDomain(0.0027907034839972367d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.4979893818807349d + "'", double15 == 0.4979893818807349d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-99.49601064368537d) + "'", double17 == (-99.49601064368537d));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-100.0d));
        double double20 = normalDistributionImpl2.getMean();
        double double23 = normalDistributionImpl2.cumulativeProbability((-99.83147239253316d), (double) (byte) 10);
        double double24 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean((-0.5027585141294139d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.38076445225569666d + "'", double23 == 0.38076445225569666d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.010465251519014118d, 0.5958678794691377d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double13 = normalDistributionImpl2.getDomainLowerBound((-1.7976931348623157E308d));
        double double15 = normalDistributionImpl2.getDomainUpperBound((double) 1.0f);
        double double17 = normalDistributionImpl2.cumulativeProbability(0.4625738809671905d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5018453962081378d + "'", double17 == 0.5018453962081378d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double16 = normalDistributionImpl2.getDomainUpperBound((double) (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        double double24 = normalDistributionImpl2.getDomainLowerBound(0.5039854140850412d);
        double double26 = normalDistributionImpl2.cumulativeProbability(0.0012209691105105058d);
        double double28 = normalDistributionImpl2.getDomainUpperBound((-409.37500000520356d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.501361765869532d + "'", double20 == 0.501361765869532d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5004870960802225d + "'", double26 == 0.5004870960802225d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double5 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean(0.5053565223803516d);
        double double9 = normalDistributionImpl0.getDomainUpperBound(200.0d);
        double double11 = normalDistributionImpl0.cumulativeProbability((-18.016702045934377d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.6653345369377348E-15d) + "'", double11 == (-1.6653345369377348E-15d));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double18 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(1.5020026072858554d);
        normalDistributionImpl2.setMean(0.29812036135129827d);
        normalDistributionImpl2.setStandardDeviation(0.5053565223803516d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.cumulativeProbability((-287.19228667059815d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.002039912671986388d + "'", double11 == 0.002039912671986388d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.6153338488431551d, 0.16108488682834415d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((-10.0d));
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(8.454946548441811E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6153338488431551d + "'", double4 == 0.6153338488431551d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.10956932744752794d + "'", double6 == 0.10956932744752794d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double9 = normalDistributionImpl2.getMean();
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getInitialDomain(0.017218078898202482d);
        double double13 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.4845043062131d), 0.5068289254012387d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.0108791319425795d);
        double double6 = normalDistributionImpl2.getDomainUpperBound(0.007728182885538226d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.4845043062131d) + "'", double4 == (-100.4845043062131d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.4845043062131d) + "'", double6 == (-100.4845043062131d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5068289254012387d + "'", double7 == 0.5068289254012387d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.503327047302336d);
        double double9 = normalDistributionImpl2.cumulativeProbability(8.890252991080594E-4d, 0.999987716976066d);
        double double10 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, 0.15930186906976396d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.039396101914527804d + "'", double9 == 0.039396101914527804d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) 100L);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainUpperBound(0.4979893818807349d);
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.039396101914527804d);
        double double14 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-175.77373820403324d) + "'", double13 == (-175.77373820403324d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double8 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(6.439419620615228E-4d);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getDomainUpperBound(0.13306917105380833d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = normalDistributionImpl2.inverseCumulativeProbability(32.50467067852617d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 6.439419620615228E-4d + "'", double11 == 6.439419620615228E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.5120960066622517d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.6252930094688305d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1635696111235406d + "'", double4 == 0.1635696111235406d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getDomainLowerBound(0.9991601276537112d);
        double double12 = normalDistributionImpl2.cumulativeProbability((-49.992075613441294d), 0.841500269950151d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5730516380690452d + "'", double12 == 0.5730516380690452d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.3410511871010289d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.010090298830658262d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = normalDistributionImpl2.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 62.0d + "'", double15 == 62.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.695941430105695d + "'", double17 == 15.695941430105695d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double8 = normalDistributionImpl2.cumulativeProbability((-312.05092239451676d), 0.5039854140850405d);
        double double10 = normalDistributionImpl2.cumulativeProbability(0.6153338488435729d);
        normalDistributionImpl2.setStandardDeviation(409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5062828993298469d + "'", double8 == 0.5062828993298469d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.507670861292653d + "'", double10 == 0.507670861292653d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        double double13 = normalDistributionImpl2.getDomainUpperBound(Double.POSITIVE_INFINITY);
        double double15 = normalDistributionImpl2.getInitialDomain(Double.NEGATIVE_INFINITY);
        double double17 = normalDistributionImpl2.getDomainLowerBound(0.4115308789714541d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.7976931348623157E308d) + "'", double17 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getInitialDomain((-100.0d));
        double double9 = normalDistributionImpl2.getInitialDomain((double) 100L);
        double double11 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        normalDistributionImpl2.setMean(99.49601458591496d);
        double double15 = normalDistributionImpl2.getInitialDomain((double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 199.49601458591496d + "'", double15 == 199.49601458591496d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0.0f);
        double double14 = normalDistributionImpl2.getDomainUpperBound(5.551115123125783E-16d);
        double double16 = normalDistributionImpl2.cumulativeProbability(0.5000081688930658d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5019947356795017d + "'", double16 == 0.5019947356795017d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.inverseCumulativeProbability((double) (short) 1);
        double double13 = normalDistributionImpl2.getInitialDomain((-68.0d));
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        normalDistributionImpl2.setMean(34.0d);
        double double19 = normalDistributionImpl2.getInitialDomain(0.546219801024759d);
        double double20 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + Double.POSITIVE_INFINITY + "'", double11 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.01213919411361d + "'", double19 == 34.01213919411361d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.01213919411360942d + "'", double20 == 0.01213919411360942d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double11 = normalDistributionImpl2.getMean();
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.6153338488435729d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.5039854140850405d);
        double double18 = normalDistributionImpl2.cumulativeProbability((double) 0.0f, 0.16116265572688077d);
        normalDistributionImpl2.setMean(2.3713936654234935E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.429456955875379E-4d + "'", double18 == 6.429456955875379E-4d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.inverseCumulativeProbability(0.9990117802232268d);
        normalDistributionImpl2.setMean((double) (byte) -1);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getMean();
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.cumulativeProbability((-0.38103458694487663d), 99.49601458591496d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.34007268059294227d + "'", double19 == 0.34007268059294227d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5004870960802225d, (double) 100L);
        normalDistributionImpl2.setMean(0.9987872496534157d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double12 = normalDistributionImpl2.getDomainUpperBound((-31.623158857349317d));
        double double14 = normalDistributionImpl2.cumulativeProbability((-128.26949715237384d));
        normalDistributionImpl2.setMean((-100.841359624824d));
        double double17 = normalDistributionImpl2.getMean();
        double double19 = normalDistributionImpl2.getDomainLowerBound((-0.5026547384068555d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.011224171101298197d + "'", double14 == 0.011224171101298197d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-100.841359624824d) + "'", double17 == (-100.841359624824d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.getDomainLowerBound(0.003989356314631598d);
        double double9 = normalDistributionImpl2.getMean();
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.49712933658943204d);
        normalDistributionImpl2.setStandardDeviation((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(0.8339767539364704d);
        normalDistributionImpl2.setMean((-99.73312743878357d));
        double double11 = normalDistributionImpl2.getDomainUpperBound((-0.8413596248239952d));
        double double13 = normalDistributionImpl2.inverseCumulativeProbability(0.5006333584453674d);
        double double15 = normalDistributionImpl2.getInitialDomain((double) 10L);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.4971164376655677d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.011224171101298197d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-99.73312743878357d) + "'", double11 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-99.73180342032491d) + "'", double13 == (-99.73180342032491d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-98.8991506848471d) + "'", double15 == (-98.8991506848471d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-99.73312743878357d) + "'", double17 == (-99.73312743878357d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        normalDistributionImpl2.setMean((double) (byte) 100);
        double double9 = normalDistributionImpl2.cumulativeProbability((-27.529693043639718d), 0.996954640520628d);
        double double11 = normalDistributionImpl2.getDomainLowerBound(32.72280818173791d);
        double double14 = normalDistributionImpl2.cumulativeProbability((-31.428571428221588d), 0.5018815478082819d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.059977535157524076d + "'", double9 == 0.059977535157524076d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06549767132473755d + "'", double14 == 0.06549767132473755d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 0, (double) 1.0f);
        normalDistributionImpl2.setMean(0.8604045658810415d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-800.0d), 101.16064255229166d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        double double5 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.0d, (double) (short) 10);
        double double10 = normalDistributionImpl2.getDomainLowerBound((double) 0.0f);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-99.00088902533815d));
        double double14 = normalDistributionImpl2.getDomainLowerBound(90.26536848661516d);
        double double16 = normalDistributionImpl2.cumulativeProbability((-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.026126956040166516d + "'", double8 == 0.026126956040166516d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.16378998975317755d + "'", double16 == 0.16378998975317755d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.0d);
        normalDistributionImpl2.setMean(0.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability(59.120415885425516d);
        double double19 = normalDistributionImpl2.getDomainUpperBound((-100.0d));
        double double20 = normalDistributionImpl2.getMean();
        double double22 = normalDistributionImpl2.getDomainUpperBound(0.5001042314730403d);
        double double24 = normalDistributionImpl2.getDomainLowerBound((-26.12663573645063d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.7228081817379124d + "'", double17 == 0.7228081817379124d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.7976931348623157E308d + "'", double22 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.7976931348623157E308d) + "'", double24 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) (byte) 10);
        double double10 = normalDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(3.809557474743208E-5d);
        double double13 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.539827837277029d + "'", double8 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + Double.POSITIVE_INFINITY + "'", double10 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-395.6075314214389d) + "'", double12 == (-395.6075314214389d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(198.0d, 0.19981031319245302d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        normalDistributionImpl2.setStandardDeviation(0.841344746068543d);
        double double29 = normalDistributionImpl2.cumulativeProbability(1.8751354819102062E-5d, 0.37665202364296135d);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.14523199392181396d + "'", double29 == 0.14523199392181396d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        double double21 = normalDistributionImpl2.getStandardDeviation();
        double double23 = normalDistributionImpl2.cumulativeProbability(0.9987872496534157d);
        double double25 = normalDistributionImpl2.getDomainLowerBound((-0.012980769559086225d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 409.37500000520356d + "'", double11 == 409.37500000520356d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.16108409568379545d + "'", double23 == 0.16108409568379545d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.7976931348623157E308d) + "'", double25 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.002007903360221386d, 0.9990117802233995d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getDomainUpperBound((double) 0L);
        double double14 = normalDistributionImpl2.getDomainLowerBound(1.0d);
        double double16 = normalDistributionImpl2.cumulativeProbability(0.0020476378332464074d);
        double double18 = normalDistributionImpl2.cumulativeProbability((-146.37048343391822d));
        double double19 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5000081688930658d + "'", double16 == 0.5000081688930658d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.07163730702377147d + "'", double18 == 0.07163730702377147d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double5 = normalDistributionImpl2.cumulativeProbability(0.026126956040166516d, (double) 1L);
        double double7 = normalDistributionImpl2.cumulativeProbability(0.5020106023922443d);
        normalDistributionImpl2.setStandardDeviation(309.37500000520356d);
        normalDistributionImpl2.setMean(9.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.0012766099775947935d);
        double double15 = normalDistributionImpl2.getInitialDomain(8.454946548441811E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.01213919411360942d + "'", double5 == 0.01213919411360942d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5062582824999134d + "'", double7 == 0.5062582824999134d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.48839768861847016d + "'", double13 == 0.48839768861847016d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-300.37500000520356d) + "'", double15 == (-300.37500000520356d));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, 0.5019947133392674d);
        normalDistributionImpl2.setStandardDeviation(0.4993376909985171d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(68.6216621174087d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8339767539364704d + "'", double5 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4993376909985171d + "'", double6 == 0.4993376909985171d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double12 = normalDistributionImpl2.getInitialDomain(0.5001042314730403d);
        normalDistributionImpl2.setMean((double) 0.0f);
        double double15 = normalDistributionImpl2.getMean();
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.1635696111235406d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 107.0d + "'", double12 == 107.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.798924433598735d) + "'", double17 == (-9.798924433598735d));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setMean((double) (short) -1);
        double double13 = normalDistributionImpl2.cumulativeProbability(0.50539567299893d, (double) 'a');
        normalDistributionImpl2.setMean(0.5041573996674839d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.4401694681058532d + "'", double13 == 0.4401694681058532d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.691462461274013d, 409.37500000520356d);
        normalDistributionImpl2.setStandardDeviation(1.7976931348623157E308d);
        double double6 = normalDistributionImpl2.getInitialDomain((-314.0626513812741d));
        double double8 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
        java.lang.Class<?> wildcardClass11 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.691462461274013d + "'", double10 == 0.691462461274013d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(10.026126956040166d, (-100.841359624824d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1.0f), (double) 10);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5039893563146316d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double9 = normalDistributionImpl2.cumulativeProbability(0.8390361687153073d);
        double double11 = normalDistributionImpl2.getDomainUpperBound(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.9000000000335028d) + "'", double4 == (-0.9000000000335028d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5729554663241068d + "'", double9 == 0.5729554663241068d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(Double.POSITIVE_INFINITY);
        normalDistributionImpl2.setStandardDeviation((double) 10.0f);
        normalDistributionImpl2.setMean(100.50398935631463d);
        double double18 = normalDistributionImpl2.getDomainLowerBound((-132.0d));
        double double20 = normalDistributionImpl2.getDomainLowerBound((-0.8413596248239952d));
        double double22 = normalDistributionImpl2.getDomainLowerBound(0.13514946487744206d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.7976931348623157E308d) + "'", double18 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.7976931348623157E308d) + "'", double20 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.7976931348623157E308d) + "'", double22 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-100.0d), (double) ' ');
        double double4 = normalDistributionImpl2.getInitialDomain((double) 10);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.cumulativeProbability(0.009021039372468731d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-68.0d) + "'", double4 == (-68.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-100.0d) + "'", double5 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9991118263228502d + "'", double8 == 0.9991118263228502d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double10 = normalDistributionImpl2.cumulativeProbability((double) 10);
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.getMean();
        double double14 = normalDistributionImpl2.getDomainUpperBound(0.09950447039473481d);
        double double15 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.9763823569067764d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        java.lang.Class<?> wildcardClass19 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.539827837277029d + "'", double10 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        double double19 = normalDistributionImpl2.getDomainLowerBound((-0.49951290391977754d));
        double double21 = normalDistributionImpl2.cumulativeProbability(0.5000484283777002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.7976931348623157E308d) + "'", double19 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.1598682499439264d + "'", double21 == 0.1598682499439264d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double4 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.5d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.5409311510863231d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.004639639218063429d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.5039860010376033d);
        normalDistributionImpl2.setMean(0.9987872496534157d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1586664807605242d + "'", double11 == 0.1586664807605242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double15 = normalDistributionImpl2.getInitialDomain(0.8339767539364704d);
        double double17 = normalDistributionImpl2.cumulativeProbability(3.0324839434953876d);
        double double19 = normalDistributionImpl2.getDomainLowerBound(0.5297069799427127d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5120960066622517d + "'", double17 == 0.5120960066622517d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound(0.6153338488435729d);
        normalDistributionImpl0.setMean(8.987287113132458E-5d);
        normalDistributionImpl0.setMean((-69.90167018868739d));
        // The following exception was thrown during execution in test generation
        try {
            double double8 = normalDistributionImpl0.inverseCumulativeProbability((-409.7391522790326d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.7976931348623157E308d, (double) 100);
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation((double) 10);
        double double6 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.15864037517600482d);
        normalDistributionImpl2.setMean(96.93366833316512d);
        normalDistributionImpl2.setMean(0.7537117409813648d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double11 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        normalDistributionImpl2.setMean((-6.661338147750939E-16d));
        double double15 = normalDistributionImpl2.getInitialDomain((-1.1102230246251565E-16d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8339767539364704d + "'", double11 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (byte) 1, (double) (byte) 100);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double6 = normalDistributionImpl2.getInitialDomain((double) (-1));
        double double8 = normalDistributionImpl2.getInitialDomain((-11.119995541385146d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4960106436853684d + "'", double4 == 0.4960106436853684d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-99.0d) + "'", double6 == (-99.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.0d) + "'", double8 == (-99.0d));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5000185094824923d, (double) 10.0f);
        double double4 = normalDistributionImpl2.getInitialDomain((-90.53983024611358d));
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767538013241d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.499981490517508d) + "'", double4 == (-9.499981490517508d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5133205302861421d + "'", double6 == 0.5133205302861421d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        double double21 = normalDistributionImpl2.getDomainLowerBound(6.106226635438361E-16d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5032578631163334d + "'", double19 == 0.5032578631163334d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.7976931348623157E308d) + "'", double21 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        normalDistributionImpl2.setStandardDeviation(0.01213919411360942d);
        double double5 = normalDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-17.598829940813502d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 101.0d + "'", double5 == 101.0d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) 10L);
        normalDistributionImpl2.setStandardDeviation((double) '4');
        double double10 = normalDistributionImpl2.getDomainLowerBound(409.37500000520356d);
        double double12 = normalDistributionImpl2.getInitialDomain(0.11974241180430323d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-52.0d) + "'", double12 == (-52.0d));
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) -1, 1.7976931348623157E308d);
        normalDistributionImpl2.setStandardDeviation(34.01213919411361d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-1.0d), 0.501361765869532d);
        normalDistributionImpl2.setMean(0.5006333584453674d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 200.0d);
        double double4 = normalDistributionImpl2.getDomainLowerBound(0.5019947030907418d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double6 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 200.0d + "'", double5 == 200.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + Double.NEGATIVE_INFINITY + "'", double6 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        double double8 = normalDistributionImpl0.cumulativeProbability(0.5027585141294139d, 0.5297069799427127d);
        double double11 = normalDistributionImpl0.cumulativeProbability(0.15865525393145702d, 0.9990394412085004d);
        double double13 = normalDistributionImpl0.getDomainLowerBound(0.5019946721877552d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.1649348980190553E-15d) + "'", double8 == (-2.1649348980190553E-15d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.4988010832439613E-15d) + "'", double11 == (-1.4988010832439613E-15d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation(101.0d);
        double double12 = normalDistributionImpl2.getDomainLowerBound(132.0d);
        normalDistributionImpl2.setMean(0.36733683944034023d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation(101.0d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-34.0009882207076d));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = normalDistributionImpl2.inverseCumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 1, 409.37500000520356d);
        double double4 = normalDistributionImpl2.getDomainLowerBound((double) 100L);
        double double5 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double11 = normalDistributionImpl2.cumulativeProbability(0.004639639218063429d);
        double double13 = normalDistributionImpl2.getInitialDomain(0.5039860010376033d);
        double double16 = normalDistributionImpl2.cumulativeProbability((-12.799211304789129d), 0.5019947133392674d);
        double double17 = normalDistributionImpl2.getStandardDeviation();
        double double19 = normalDistributionImpl2.getInitialDomain(0.0d);
        double double21 = normalDistributionImpl2.cumulativeProbability(1.711841352131704d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1586664807605242d + "'", double11 == 0.1586664807605242d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.03021135797796476d + "'", double16 == 0.03021135797796476d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.16283286067681413d + "'", double21 == 0.16283286067681413d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double3 = normalDistributionImpl0.getMean();
        normalDistributionImpl0.setMean((double) 10L);
        normalDistributionImpl0.setStandardDeviation(0.5d);
        double double8 = normalDistributionImpl0.getMean();
        double double10 = normalDistributionImpl0.getDomainLowerBound((-10.0d));
        double double11 = normalDistributionImpl0.getMean();
        double double12 = normalDistributionImpl0.getStandardDeviation();
        double double14 = normalDistributionImpl0.cumulativeProbability(0.3767128459166525d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5d + "'", double3 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.887379141862766E-15d) + "'", double14 == (-1.887379141862766E-15d));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, 0.9990117802232268d);
        normalDistributionImpl2.setStandardDeviation(0.5000185094824923d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.004639639218063429d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.cumulativeProbability(0.0027907034839972367d, 129.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.7976931348623157E308d) + "'", double6 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainUpperBound(0.16852760746683781d);
        double double8 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double6 = normalDistributionImpl2.inverseCumulativeProbability(0.5020079759221441d);
        normalDistributionImpl2.setStandardDeviation(0.15864037517600482d);
        double double10 = normalDistributionImpl2.getInitialDomain((-0.8413596248239952d));
        double double11 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.cumulativeProbability(6.439419620615228E-4d);
        normalDistributionImpl2.setMean(0.7228081817379124d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        double double18 = normalDistributionImpl2.getDomainLowerBound(0.5020253050112831d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.NEGATIVE_INFINITY + "'", double4 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.503327047302336d + "'", double6 == 0.503327047302336d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.15864037517600482d) + "'", double10 == (-0.15864037517600482d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.15864037517600482d + "'", double11 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5016193542725117d + "'", double13 == 0.5016193542725117d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.15864037517600482d + "'", double16 == 0.15864037517600482d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.7228081817379124d + "'", double18 == 0.7228081817379124d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.4960106436853684d);
        double double17 = normalDistributionImpl2.cumulativeProbability(1.711841352131704d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = normalDistributionImpl2.cumulativeProbability(100.50200740008205d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (10,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9997209697185048d + "'", double17 == 0.9997209697185048d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double9 = normalDistributionImpl2.inverseCumulativeProbability(0.15865525393145702d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.00000024999815d) + "'", double9 == (-100.00000024999815d));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        double double6 = normalDistributionImpl2.getDomainLowerBound((double) (short) 10);
        double double8 = normalDistributionImpl2.cumulativeProbability(10.026126956040166d);
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.getDomainUpperBound((-10.0d));
        double double12 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setStandardDeviation(100.19981031319246d);
        double double15 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.816634256911273d + "'", double8 == 0.816634256911273d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.19981031319246d + "'", double15 == 100.19981031319246d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        normalDistributionImpl2.setStandardDeviation(129.0d);
        java.lang.Class<?> wildcardClass9 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double3 = normalDistributionImpl0.cumulativeProbability((double) 0, (double) 1);
        double double5 = normalDistributionImpl0.getInitialDomain((double) (byte) -1);
        double double6 = normalDistributionImpl0.getStandardDeviation();
        double double7 = normalDistributionImpl0.getStandardDeviation();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl0.cumulativeProbability(99.49601458591496d, 0.5047733849287506d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.34134474606854304d + "'", double3 == 0.34134474606854304d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        normalDistributionImpl2.setStandardDeviation((double) (byte) 10);
        normalDistributionImpl2.setStandardDeviation((double) '#');
        double double13 = normalDistributionImpl2.cumulativeProbability((double) (byte) 1, 309.37500000520356d);
        double double15 = normalDistributionImpl2.getInitialDomain(0.3410511871010289d);
        double double17 = normalDistributionImpl2.inverseCumulativeProbability(0.010090298830658262d);
        double double18 = normalDistributionImpl2.getStandardDeviation();
        double double20 = normalDistributionImpl2.getDomainLowerBound(0.32982560921663984d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.996954640520628d + "'", double13 == 0.996954640520628d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 62.0d + "'", double15 == 62.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.695941430105695d + "'", double17 == 15.695941430105695d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.7976931348623157E308d) + "'", double20 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double4 = normalDistributionImpl0.cumulativeProbability((double) 1);
        double double6 = normalDistributionImpl0.getInitialDomain((-99.00088902533815d));
        double double8 = normalDistributionImpl0.getDomainLowerBound((-90.53983024611358d));
        double double10 = normalDistributionImpl0.getDomainLowerBound(0.0d);
        double double12 = normalDistributionImpl0.inverseCumulativeProbability(0.5041347553039998d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.691462461274013d + "'", double4 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5103643131849024d + "'", double12 == 0.5103643131849024d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.cumulativeProbability(0.8339767539364704d);
        double double8 = normalDistributionImpl2.getInitialDomain((double) 1L);
        double double10 = normalDistributionImpl2.getDomainLowerBound(0.13671765618845966d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = normalDistributionImpl2.inverseCumulativeProbability((-99.84012698476847d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5033270473131487d + "'", double6 == 0.5033270473131487d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.7976931348623157E308d) + "'", double10 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(101.0d, (double) ' ');
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.5020027136551392d);
        double double5 = normalDistributionImpl2.getStandardDeviation();
        double double7 = normalDistributionImpl2.getDomainUpperBound((-190.53983024611358d));
        // The following exception was thrown during execution in test generation
        try {
            double double9 = normalDistributionImpl2.inverseCumulativeProbability(1.0000000000000018d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 101.16064255229166d + "'", double4 == 101.16064255229166d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double15 = normalDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        normalDistributionImpl2.setStandardDeviation(0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) (short) 100);
        double double6 = normalDistributionImpl2.getInitialDomain(100.0d);
        double double8 = normalDistributionImpl2.getDomainLowerBound((double) (-1.0f));
        normalDistributionImpl2.setMean(100.0d);
        double double13 = normalDistributionImpl2.cumulativeProbability((double) 0, (double) 100L);
        double double14 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setMean(11.0d);
        double double18 = normalDistributionImpl2.getDomainLowerBound(Double.POSITIVE_INFINITY);
        double double21 = normalDistributionImpl2.cumulativeProbability((-31.308537538725986d), 0.1995538270222263d);
        // The following exception was thrown during execution in test generation
        try {
            normalDistributionImpl2.setStandardDeviation((-312.50001232497266d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Standard deviation must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.7976931348623157E308d) + "'", double8 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.341344746068543d + "'", double13 == 0.341344746068543d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.12087959042644592d + "'", double21 == 0.12087959042644592d);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = normalDistributionImpl2.cumulativeProbability(206.7000000016635d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double8 = normalDistributionImpl2.cumulativeProbability((double) 0);
        double double10 = normalDistributionImpl2.getInitialDomain(0.691462461274013d);
        double double12 = normalDistributionImpl2.getDomainLowerBound((-128.26949715237384d));
        double double13 = normalDistributionImpl2.getStandardDeviation();
        double double15 = normalDistributionImpl2.getDomainUpperBound(99.0d);
        double double17 = normalDistributionImpl2.cumulativeProbability((-180.97714380935068d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.7976931348623157E308d) + "'", double12 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0351656194586214d + "'", double17 == 0.0351656194586214d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0, 0.003989356314631598d);
        normalDistributionImpl2.setMean(0.5002938527002967d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound((-0.9834167765345851d));
        normalDistributionImpl2.setStandardDeviation(199.49601458591496d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5002938527002967d + "'", double5 == 0.5002938527002967d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double9 = normalDistributionImpl2.getInitialDomain((double) (byte) -1);
        double double10 = normalDistributionImpl2.getMean();
        normalDistributionImpl2.setMean(0.0d);
        double double14 = normalDistributionImpl2.getDomainLowerBound((-100.841359624824d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.7976931348623157E308d) + "'", double14 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) '4');
        double double11 = normalDistributionImpl2.getDomainLowerBound(0.5d);
        double double13 = normalDistributionImpl2.getInitialDomain((double) (-1));
        normalDistributionImpl2.setStandardDeviation(0.4960106436853684d);
        double double16 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.4960106436853684d + "'", double16 == 0.4960106436853684d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        double double29 = normalDistributionImpl2.getDomainLowerBound((-2.8315846849045707d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.0d + "'", double17 == 99.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.7976931348623157E308d + "'", double19 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.026126956040166d + "'", double25 == 10.026126956040166d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.7976931348623157E308d) + "'", double29 == (-1.7976931348623157E308d));
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        normalDistributionImpl2.setMean((double) (short) 100);
        double double13 = normalDistributionImpl2.getDomainLowerBound((double) 100);
        normalDistributionImpl2.setStandardDeviation((double) 1);
        double double17 = normalDistributionImpl2.getDomainUpperBound(0.5019948962895999d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.7976931348623157E308d + "'", double17 == 1.7976931348623157E308d);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(222.67866038790694d, 0.841500270091506d);
        double double4 = normalDistributionImpl2.inverseCumulativeProbability(0.13514946487744206d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 221.7510120206919d + "'", double4 == 221.7510120206919d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) (byte) 1);
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.cumulativeProbability((double) 'a');
        double double14 = normalDistributionImpl2.cumulativeProbability(0.9990117802233995d);
        double double16 = normalDistributionImpl2.inverseCumulativeProbability(8.429343765339881E-4d);
        double double18 = normalDistributionImpl2.cumulativeProbability(0.0d);
        double double21 = normalDistributionImpl2.cumulativeProbability((-0.01553288085883039d), 32.72280818173791d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8339767539364704d + "'", double12 == 0.8339767539364704d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5039854140850412d + "'", double14 == 0.5039854140850412d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-314.0626513812741d) + "'", double16 == (-314.0626513812741d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.12831427583165578d + "'", double21 == 0.12831427583165578d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) '4', 0.3668235531222151d);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.5039854140850405d);
        double double6 = normalDistributionImpl2.getDomainLowerBound(0.841344746068543d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.cumulativeProbability(0.16602324606352958d, 0.15972655368062133d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lower endpoint must be less than or equal to upper endpoint");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) 'a');
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.999987716976066d);
        double double5 = normalDistributionImpl2.getMean();
        double double6 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.inverseCumulativeProbability(0.001986788236930437d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-182.3844270656258d) + "'", double8 == (-182.3844270656258d));
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double5 = normalDistributionImpl2.cumulativeProbability((double) 10.0f, (double) 10.0f);
        double double7 = normalDistributionImpl2.getInitialDomain((double) 0);
        double double9 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 1);
        double double11 = normalDistributionImpl2.cumulativeProbability(10.0d);
        double double13 = normalDistributionImpl2.getInitialDomain(97.0d);
        double double15 = normalDistributionImpl2.getDomainLowerBound(101.0d);
        double double17 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double20 = normalDistributionImpl2.cumulativeProbability((-175.77373820403324d), 0.49380352624882917d);
        double double21 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.539827837277029d + "'", double11 == 0.539827837277029d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.4625738809671905d + "'", double20 == 0.4625738809671905d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1562476450212545d, 0.03505855944556485d);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        double double28 = normalDistributionImpl2.getStandardDeviation();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        double double4 = normalDistributionImpl2.cumulativeProbability((double) 0L);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainLowerBound(0.4960106436853684d);
        double double9 = normalDistributionImpl2.getInitialDomain(10.026126956040166d);
        normalDistributionImpl2.setMean(129.0d);
        normalDistributionImpl2.setStandardDeviation(10.00500006308629d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.7976931348623157E308d) + "'", double7 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        double double23 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double25 = normalDistributionImpl2.getDomainLowerBound(0.5016193542725117d);
        double double27 = normalDistributionImpl2.inverseCumulativeProbability(0.15987301523152742d);
        double double29 = normalDistributionImpl2.getDomainUpperBound(107.0d);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + Double.NEGATIVE_INFINITY + "'", double23 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-99.49799202407699d) + "'", double27 == (-99.49799202407699d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.7976931348623157E308d + "'", double29 == 1.7976931348623157E308d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        double double31 = normalDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double33 = normalDistributionImpl2.getInitialDomain(0.05691161595986349d);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + Double.NEGATIVE_INFINITY + "'", double31 == Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.0d + "'", double33 == 99.0d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-277.33138319894914d), 0.5019813127606616d);
        double double4 = normalDistributionImpl2.getInitialDomain((-99.98786080588638d));
        double double6 = normalDistributionImpl2.getInitialDomain(0.5000025689567479d);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-277.8333645117098d) + "'", double4 == (-277.8333645117098d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-276.82940188618846d) + "'", double6 == (-276.82940188618846d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5019813127606616d + "'", double7 == 0.5019813127606616d);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setMean((double) 'a');
        normalDistributionImpl2.setStandardDeviation((double) ' ');
        double double8 = normalDistributionImpl2.getDomainUpperBound(0.026126956040166516d);
        double double10 = normalDistributionImpl2.getDomainUpperBound(0.5003482664470201d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (double) (short) 100);
        double double4 = normalDistributionImpl2.getDomainUpperBound(0.6823959331695719d);
        double double6 = normalDistributionImpl2.getInitialDomain(0.5039893563131264d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 197.0d + "'", double6 == 197.0d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.004777486474361492d, 0.5000051168411888d);
        double double4 = normalDistributionImpl2.getInitialDomain(0.5011893264062109d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5047826033155502d + "'", double4 == 0.5047826033155502d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (short) 1, 10.0d);
        double double4 = normalDistributionImpl2.getDomainUpperBound((double) '#');
        normalDistributionImpl2.setMean(107.0d);
        double double7 = normalDistributionImpl2.getMean();
        double double8 = normalDistributionImpl2.getStandardDeviation();
        normalDistributionImpl2.setStandardDeviation(0.5019947030907408d);
        double double12 = normalDistributionImpl2.getDomainUpperBound(110.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 411.0749544588838d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation((double) 1.0f);
        double double3 = normalDistributionImpl0.getStandardDeviation();
        normalDistributionImpl0.setStandardDeviation(100.0d);
        double double7 = normalDistributionImpl0.inverseCumulativeProbability(0.16108488682834415d);
        double double9 = normalDistributionImpl0.cumulativeProbability(0.9999999996226588d);
        double double11 = normalDistributionImpl0.getInitialDomain((-314.0626513812741d));
        double double12 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.00088902533815d) + "'", double7 == (-99.00088902533815d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5039893563131264d + "'", double9 == 0.5039893563131264d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        normalDistributionImpl0.setMean(0.5d);
        double double5 = normalDistributionImpl0.cumulativeProbability((-1.0d), 0.539827837277029d);
        normalDistributionImpl0.setMean((double) (byte) 0);
        double double9 = normalDistributionImpl0.getDomainUpperBound(0.0013750926571968192d);
        double double11 = normalDistributionImpl0.getDomainLowerBound(6.106226635438361E-16d);
        double double13 = normalDistributionImpl0.getInitialDomain(0.9999999999999823d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4490776072831239d + "'", double5 == 0.4490776072831239d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.7976931348623157E308d) + "'", double11 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double11 = normalDistributionImpl2.cumulativeProbability(0.5033270473131487d);
        double double13 = normalDistributionImpl2.getDomainLowerBound(0.34134474606854304d);
        double double15 = normalDistributionImpl2.getDomainUpperBound(0.1586552539043654d);
        double double17 = normalDistributionImpl2.getDomainLowerBound(11.0d);
        java.lang.Class<?> wildcardClass18 = normalDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5020079759221441d + "'", double11 == 0.5020079759221441d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.7976931348623157E308d) + "'", double13 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double5 = normalDistributionImpl2.getMean();
        double double7 = normalDistributionImpl2.getDomainUpperBound((double) 10L);
        double double9 = normalDistributionImpl2.getDomainLowerBound((double) '#');
        double double10 = normalDistributionImpl2.getStandardDeviation();
        double double12 = normalDistributionImpl2.inverseCumulativeProbability(0.34134474606854304d);
        double double14 = normalDistributionImpl2.cumulativeProbability(32.0d);
        double double16 = normalDistributionImpl2.getDomainUpperBound((-2.1649348980190553E-15d));
        double double17 = normalDistributionImpl2.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-40.87958411457447d) + "'", double12 == (-40.87958411457447d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6255158347233201d + "'", double14 == 0.6255158347233201d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, (double) 100L);
        normalDistributionImpl2.setStandardDeviation(100.0d);
        double double6 = normalDistributionImpl2.getDomainUpperBound((double) (byte) 0);
        double double7 = normalDistributionImpl2.getStandardDeviation();
        double double8 = normalDistributionImpl2.getMean();
        double double9 = normalDistributionImpl2.getStandardDeviation();
        double double11 = normalDistributionImpl2.cumulativeProbability(87.0d);
        double double12 = normalDistributionImpl2.getStandardDeviation();
        double double13 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.807849797896304d + "'", double11 == 0.807849797896304d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        double double28 = normalDistributionImpl2.getStandardDeviation();
        double double29 = normalDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5013304021987853d, 97.67965765688128d);
        double double3 = normalDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5013304021987853d + "'", double3 == 0.5013304021987853d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 0.0f, (double) ' ');
        double double3 = normalDistributionImpl2.getStandardDeviation();
        double double5 = normalDistributionImpl2.getInitialDomain(0.501361765869532d);
        double double7 = normalDistributionImpl2.getDomainUpperBound((-22.36087456351966d));
        double double9 = normalDistributionImpl2.getInitialDomain((-99.73180342032491d));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = normalDistributionImpl2.inverseCumulativeProbability((-3.3306690738754696E-16d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: p must be between 0.0 and 1.0, inclusive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-32.0d) + "'", double9 == (-32.0d));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8339767539364704d, 107.0d);
        double double4 = normalDistributionImpl2.cumulativeProbability(0.9990117802232268d);
        double double7 = normalDistributionImpl2.cumulativeProbability((-8.326672684688674E-15d), 0.5002938527002967d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5006153217161514d + "'", double4 == 0.5006153217161514d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0018652824078519425d + "'", double7 == 0.0018652824078519425d);
    }
}

