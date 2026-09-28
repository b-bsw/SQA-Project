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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = normalDistributionImpl0.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        double double0 = org.apache.commons.math.distribution.NormalDistributionImpl.DEFAULT_INVERSE_ABSOLUTE_ACCURACY;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-9d + "'", double0 == 1.0E-9d);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl3 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) 'a', (-1.7082847584965843d), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1.708 is smaller than, or equal to, the minimum (0): standard deviation (-1.708)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainUpperBound((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getMean();
        double double3 = normalDistributionImpl0.getMean();
// flaky "1) test05(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0994002264053119d) + "'", double1 == (-0.0994002264053119d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.5419861432312927d));
        double double4 = normalDistributionImpl0.getInitialDomain(0.0d);
        double[] doubleArray6 = normalDistributionImpl0.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double3 = normalDistributionImpl0.getInitialDomain((-0.5200331656264335d));
// flaky "2) test07(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8894982220042755d) + "'", double1 == (-0.8894982220042755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl3 = new org.apache.commons.math.distribution.NormalDistributionImpl((double) (-1), 0.0d, (-2.5419861432312927d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0): standard deviation (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.5419861432312927d));
        double double4 = normalDistributionImpl0.getInitialDomain(0.0d);
        java.lang.Class<?> wildcardClass5 = normalDistributionImpl0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.inverseCumulativeProbability(0.841344746068543d);
// flaky "3) test10(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1963472683945953d + "'", double1 == 1.1963472683945953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.5419861432312927d));
        double double4 = normalDistributionImpl0.cumulativeProbability(100.0d);
        double double6 = normalDistributionImpl0.cumulativeProbability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = normalDistributionImpl0.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0): number of samples (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.841344746068543d + "'", double6 == 0.841344746068543d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.5419861432312927d));
        double double4 = normalDistributionImpl0.getDomainLowerBound((double) (short) 10);
        double double5 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.sample();
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.sample();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10, (double) ' ');
        double double10 = normalDistributionImpl0.getInitialDomain((double) 0L);
// flaky "4) test13(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1640260999160659d) + "'", double1 == (-1.1640260999160659d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
// flaky "1) test13(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1854680231868489d + "'", double3 == 0.1854680231868489d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "1) test13(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.9428203638535597d) + "'", double5 == (-1.9428203638535597d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.7003864857215535d, (double) ' ');
        double double3 = normalDistributionImpl2.sample();
// flaky "5) test14(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-35.086759943362324d) + "'", double3 == (-35.086759943362324d));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl3 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.0994002264053119d), 1.1963472683945953d, 0.0d);
        double double4 = normalDistributionImpl3.sample();
// flaky "6) test15(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.3616305592010616d) + "'", double4 == (-1.3616305592010616d));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.getMean();
        double double4 = normalDistributionImpl0.sample();
// flaky "7) test16(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44771489661148006d) + "'", double1 == (-0.44771489661148006d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
// flaky "2) test16(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.797233099089398d + "'", double4 == 0.797233099089398d);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.sample();
        double double5 = normalDistributionImpl0.getDomainLowerBound((double) (byte) 100);
        double double6 = normalDistributionImpl0.getSolverAbsoluteAccuracy();
        double double7 = normalDistributionImpl0.getSolverAbsoluteAccuracy();
// flaky "8) test17(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2967074684323547d + "'", double1 == 0.2967074684323547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
// flaky "3) test17(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.3266790825823986d + "'", double3 == 2.3266790825823986d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-9d + "'", double6 == 1.0E-9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-9d + "'", double7 == 1.0E-9d);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl3 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.0994002264053119d), 1.1963472683945953d, 0.0d);
        double double5 = normalDistributionImpl3.getDomainLowerBound((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0994002264053119d) + "'", double5 == (-0.0994002264053119d));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.1854680231868489d, (double) (short) 100, (-0.6040292993049645d));
        double double4 = normalDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1854680231868489d + "'", double4 == 0.1854680231868489d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.sample();
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.sample();
        double double8 = normalDistributionImpl0.cumulativeProbability((double) (byte) 10, (double) ' ');
        double double9 = normalDistributionImpl0.getMean();
// flaky "9) test20(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36475996068516126d) + "'", double1 == (-0.36475996068516126d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
// flaky "4) test20(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2162255234864032d) + "'", double3 == (-1.2162255234864032d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky "2) test20(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9163480414531106d + "'", double5 == 0.9163480414531106d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = normalDistributionImpl0.cumulativeProbability((double) '#', 2.225878299490827d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky "10) test21(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18564866935750565d) + "'", double1 == (-0.18564866935750565d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
// flaky "5) test21(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.47256372006006964d + "'", double3 == 0.47256372006006964d);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.5419861432312927d));
        double double4 = normalDistributionImpl0.getInitialDomain(0.0d);
        double double6 = normalDistributionImpl0.density((double) 0.0f);
        double double7 = normalDistributionImpl0.getStandardDeviation();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3989422804014327d + "'", double6 == 0.3989422804014327d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double1 = normalDistributionImpl0.sample();
        double double2 = normalDistributionImpl0.getStandardDeviation();
        double double3 = normalDistributionImpl0.sample();
        double double4 = normalDistributionImpl0.getMean();
        double double5 = normalDistributionImpl0.getMean();
// flaky "11) test23(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4641021413929484d + "'", double1 == 0.4641021413929484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
// flaky "6) test23(org.apache.commons.math.distribution.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.45793016289229926d + "'", double3 == 0.45793016289229926d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math.distribution.NormalDistributionImpl normalDistributionImpl0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
        double double2 = normalDistributionImpl0.getDomainLowerBound((-2.5419861432312927d));
        double double3 = normalDistributionImpl0.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }
}
