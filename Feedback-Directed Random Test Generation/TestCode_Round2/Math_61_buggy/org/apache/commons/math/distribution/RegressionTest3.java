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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d, 0.18393972058572114d, 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d, (double) 38, 29);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.008575364588394788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9784874006708175d + "'", double5 == 0.9784874006708175d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) (byte) 100);
        double double4 = poissonDistributionImpl2.probability(1.9701958953177723E-8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 10.0d, 2147483647);
        int[] intArray5 = poissonDistributionImpl3.sample(34);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 103);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 9.216155638647194E-8d, 0);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(0.07257897695541599d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.normalApproximateProbability(24);
        double double16 = poissonDistributionImpl3.probability(16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
// flaky "1) test1506(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.7582714501302516E-14d + "'", double16 == 1.7582714501302516E-14d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        double double23 = poissonDistributionImpl3.probability((int) (short) -1);
        double double25 = poissonDistributionImpl3.probability(3);
        double double27 = poissonDistributionImpl3.probability((double) 1);
        double double30 = poissonDistributionImpl3.cumulativeProbability((int) '#', (int) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) 4);
        double double34 = poissonDistributionImpl3.probability(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "1) test1507(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.36787944117144233d + "'", double27 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.36787944117144233d + "'", double34 == 0.36787944117144233d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int int7 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999999d);
        double double8 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 38 + "'", int7 == 38);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3363019087207584d, 2.253367380355975E-6d, 82);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(4.3013378484179026E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.probability(1);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.36787944117144256d);
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.7472115020283746d, (double) 31);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484845E-4d + "'", double4 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999545754442823d + "'", double9 == 0.9999545754442823d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainLowerBound((double) (short) 1);
        int int7 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 82);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "1) test1512(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        double double14 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 110);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06680720126885803d + "'", double14 == 0.06680720126885803d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794411711612d, 5.907792072437627E-11d, (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        double double5 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, 35.0d);
        int[] intArray4 = poissonDistributionImpl2.sample(99);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray9 = poissonDistributionImpl3.sample((int) (byte) 100);
        int int11 = poissonDistributionImpl3.getDomainLowerBound(8.781633496103664E-142d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 86, (-1.0d), 9);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(2.253367380355975E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 100);
        double double18 = poissonDistributionImpl3.cumulativeProbability(0.9999999999999825d, (double) 14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3678794411711612d + "'", double18 == 0.3678794411711612d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 80);
        int int8 = poissonDistributionImpl3.getDomainLowerBound((double) 29);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 0.0f, 10);
        double double4 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6321205588285574d + "'", double4 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137743067240024E-7d, 4.219851480312614E-12d, 24);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999966023268753d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6922006275553462d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 10);
        double double7 = poissonDistributionImpl3.cumulativeProbability(102);
        int int9 = poissonDistributionImpl3.getDomainUpperBound(4.448081146614204E-6d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(0.06186911463179348d, 0.18393972058572117d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.941866060050443E-159d, 0.0030656620097619935d, 98);
        int int4 = poissonDistributionImpl3.sample();
        double double6 = poissonDistributionImpl3.probability(43);
        double double8 = poissonDistributionImpl3.cumulativeProbability((double) 43);
        int int9 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.probability(35);
        int int11 = poissonDistributionImpl3.sample();
        double double13 = poissonDistributionImpl3.cumulativeProbability(1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "2) test1526(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
// flaky "2) test1526(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.5601874895062087E-41d + "'", double10 == 3.5601874895062087E-41d);
// flaky "1) test1526(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int[] intArray7 = poissonDistributionImpl1.sample(35);
        int int9 = poissonDistributionImpl1.getDomainLowerBound((double) 13);
        double double11 = poissonDistributionImpl1.probability(10000000);
        double double13 = poissonDistributionImpl1.probability(0.05956661497600297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int int9 = poissonDistributionImpl2.sample();
        int int11 = poissonDistributionImpl2.getDomainLowerBound(0.4421702547125971d);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
// flaky "3) test1528(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(32.0d, (double) (short) 0);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.0013335812360537602d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        int[] intArray7 = poissonDistributionImpl2.sample(34);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability(15, 29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky "4) test1530(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9353755231673158d, 1.0040290630831367E-103d, 6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        double double11 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int13 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.9999999999999825d);
        double double17 = poissonDistributionImpl3.probability(102);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.826311454135856E-163d + "'", double17 == 3.826311454135856E-163d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06131324019524039d, 1.1102230246251565E-16d, 29);
        double double5 = poissonDistributionImpl3.cumulativeProbability(3.8785349352299523E-28d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9405285822723919d + "'", double5 == 0.9405285822723919d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(2, 31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "2) test1534(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.533676680517062d + "'", double8 == 0.533676680517062d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155633002718E-9d, (double) 82, 0);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(9.999778782798785E-13d);
        double double19 = poissonDistributionImpl3.probability(105);
        double double21 = poissonDistributionImpl3.probability(2.6728134305602215E-44d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.4018914738572114E-169d + "'", double19 == 3.4018914738572114E-169d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998405164d, (double) 37, 52);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) '#');
        poissonDistributionImpl3.reseedRandomGenerator((long) 88);
        double double19 = poissonDistributionImpl3.cumulativeProbability(23);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        int int17 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        double double21 = poissonDistributionImpl3.normalApproximateProbability(95);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
// flaky "5) test1539(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.941866060050443E-159d, 0.0030656620097619935d, 98);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) (byte) 100);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.7156847426216517d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572117d, (double) 1L);
        double double4 = poissonDistributionImpl2.cumulativeProbability(35);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.0137769446139089E-7d);
        double double8 = poissonDistributionImpl2.probability(99);
        double double10 = poissonDistributionImpl2.probability(9.999778782798785E-13d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.4222929602677774E-229d + "'", double8 == 1.4222929602677774E-229d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        int[] intArray20 = poissonDistributionImpl3.sample(0);
        int int21 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999999907838444d + "'", double18 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
// flaky "3) test1543(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainUpperBound(100.0d);
        int[] intArray18 = poissonDistributionImpl3.sample(12);
        double double20 = poissonDistributionImpl3.cumulativeProbability(3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(intArray18);
// flaky "6) test1544(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 1, 2, 0, 0, 1, 2, 2, 1, 0, 1 });
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9846716899511899d + "'", double20 == 0.9846716899511899d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, 0.9353755231673158d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) 'a');
        double double6 = poissonDistributionImpl2.probability(9.88940969307282E-43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.9999999907838444d);
        int int8 = poissonDistributionImpl2.getDomainUpperBound(5.347030737638007E-35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.139132792048018E-17d + "'", double6 == 3.139132792048018E-17d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, 106);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.17246204865673E-37d);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        int int15 = poissonDistributionImpl3.getDomainLowerBound((double) 2147483647);
        double double18 = poissonDistributionImpl3.cumulativeProbability(97, 112);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = poissonDistributionImpl3.cumulativeProbability(0.9936865915923108d, 5.1401737047361744E-120d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "4) test1548(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.25464638004358264d);
        double double3 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999942d + "'", double3 == 0.9999999999999942d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.214425871271413E-5d, (double) 38);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 102, 7.457712003500205E-9d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(91, 37);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound(4.719682636442159E-60d);
        double double21 = poissonDistributionImpl3.probability(0.29140699867905834d);
        double double22 = poissonDistributionImpl3.getMean();
        int int24 = poissonDistributionImpl3.getDomainLowerBound(0.9999999999999997d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int[] intArray14 = poissonDistributionImpl3.sample((int) 'a');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794411711612d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6426402136161335d, 0.011604342211143792d, 43);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6426402136161335d + "'", double4 == 0.6426402136161335d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(30);
        int int5 = poissonDistributionImpl1.getDomainUpperBound(0.0d);
        int int7 = poissonDistributionImpl1.getDomainLowerBound((double) 102);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.999999999954943d + "'", double3 == 0.999999999954943d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, 0.691462461274013d, 37);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0);
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        double double10 = poissonDistributionImpl3.cumulativeProbability(88, 88);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.631895849694923E-44d, 4.160702826336122E-32d, 105);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double20 = poissonDistributionImpl3.cumulativeProbability(14, 93);
        int int22 = poissonDistributionImpl3.getDomainUpperBound((double) 52);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.2198466942977575E-12d + "'", double20 == 4.2198466942977575E-12d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98, (double) 100, 98);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999999999999997d);
        double double7 = poissonDistributionImpl3.cumulativeProbability((double) 95);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(3.5601874895062087E-41d, 2.8133051444001467E-13d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 186 + "'", int5 == 186);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.17390895361798006d + "'", double7 == 0.17390895361798006d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(4.2198466942977575E-12d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "7) test1561(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 0, 0, 1, 0, 2, 1, 2, 2, 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, (double) 35, 34);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(1.2460656213271568E-39d);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546000702375d, (int) ' ');
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7455062667769425E-9d, 2.813234320208393E-13d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (int) '#');
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int[] intArray19 = poissonDistributionImpl3.sample(41);
        int int21 = poissonDistributionImpl3.getDomainUpperBound(0.6922006275553462d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 1);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(0);
        int[] intArray25 = poissonDistributionImpl3.sample(12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "8) test1567(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertNotNull(intArray25);
// flaky "5) test1567(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray25, new int[] { 3, 1, 1, 0, 1, 2, 0, 1, 0, 0, 0, 1 });
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        poissonDistributionImpl2.reseedRandomGenerator((long) 30);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.9999999999999909d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) 105);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.308537538725987d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) ' ', 28);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6391624183905688d + "'", double4 == 0.6391624183905688d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability((double) 10000000);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.0030656620097619935d);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(3.9606298142722176E-69d);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(0.04425363959909373d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "9) test1570(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int int17 = poissonDistributionImpl3.getDomainLowerBound(0.36787944117144256d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound(4.719682636442159E-60d);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 10);
        double double23 = poissonDistributionImpl3.probability(4.560969057281241E-69d);
        int int25 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl3.cumulativeProbability(44, 42);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator(1L);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(99);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        int int7 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999999d);
        double double9 = poissonDistributionImpl1.probability(41);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 38 + "'", int7 == 38);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.3571450159050078E-13d + "'", double9 == 1.3571450159050078E-13d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 23, 100.0d, 100);
        double double5 = poissonDistributionImpl3.probability(7.647163731812068E-193d);
        double double8 = poissonDistributionImpl3.cumulativeProbability(51, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.8565280035520715E-7d + "'", double8 == 1.8565280035520715E-7d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) 1);
        int[] intArray17 = poissonDistributionImpl3.sample((int) 'a');
        double double19 = poissonDistributionImpl3.normalApproximateProbability(30);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = poissonDistributionImpl3.cumulativeProbability(0.3525511311226325d, 1.7401052582713831E-47d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.8160602794142788d + "'", double15 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = poissonDistributionImpl3.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36083758160943114d, 15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137743067240024E-7d, 0.01891663740103536d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        double double6 = poissonDistributionImpl3.cumulativeProbability(0, (int) '4');
        double double9 = poissonDistributionImpl3.cumulativeProbability((double) 30, (double) 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 1);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        double double10 = poissonDistributionImpl2.probability(38);
        int int11 = poissonDistributionImpl2.sample();
        int int13 = poissonDistributionImpl2.getDomainLowerBound(0.9846716899511899d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
// flaky "10) test1581(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray6, new int[] { 31 });
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.533676680517062d + "'", double8 == 0.533676680517062d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.05698471084507295d + "'", double10 == 0.05698471084507295d);
// flaky "6) test1581(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 38 + "'", int11 == 38);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.1627334188024467E-75d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        double double22 = poissonDistributionImpl3.getMean();
        int int24 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        int int26 = poissonDistributionImpl3.getDomainLowerBound((double) 26);
        int[] intArray28 = poissonDistributionImpl3.sample(4);
        double double30 = poissonDistributionImpl3.probability(95);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray28);
// flaky "11) test1583(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray28, new int[] { 3, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.561279838000423E-149d + "'", double30 == 3.561279838000423E-149d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, 35);
        double double4 = poissonDistributionImpl2.cumulativeProbability(105);
        int[] intArray6 = poissonDistributionImpl2.sample(30);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(10);
        int int7 = poissonDistributionImpl3.getDomainLowerBound(5.628682978044818E-21d);
        double double8 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 24);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(6.813556821545286E-46d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "12) test1585(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 1, 1, 2, 0, 1, 0, 1, 0, 3 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl2.cumulativeProbability(7.033719554105805E-46d, (double) 82);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(4.925222664969737E-19d);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(3.902447399449791E-155d);
        int int23 = poissonDistributionImpl3.inverseCumulativeProbability(3.2093315791106567E-171d);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = poissonDistributionImpl3.cumulativeProbability(2.755731922395672E-127d, 0.03796348149127876d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "13) test1587(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 0, 4, 1, 0, 2, 0, 0, 2, 0 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, 0.9353755231673158d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) 'a');
        int int5 = poissonDistributionImpl2.sample();
        int[] intArray7 = poissonDistributionImpl2.sample((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.028861154135454092d, (-1));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.2001158042335694E-17d, 0.4421702547125971d, 4);
        double double5 = poissonDistributionImpl3.probability(2147483647);
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.008575364588394788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        int int13 = poissonDistributionImpl2.sample();
        int[] intArray15 = poissonDistributionImpl2.sample((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl2.cumulativeProbability(0.0d, (double) 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, 0);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(105);
        double double6 = poissonDistributionImpl2.probability((double) 86);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(5.559174711623875E-287d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability(91, 46);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.25464638004358264d, (double) 13, 97);
        int int4 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        int int8 = poissonDistributionImpl2.getDomainUpperBound(0.05698471084507295d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, (double) (byte) -1, 30);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        int int7 = poissonDistributionImpl3.getDomainUpperBound(3.115285807098189E-13d);
// flaky "14) test1596(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 78 + "'", int4 == 78);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.039860996809147134d, 10000000);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.9736445389005101d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.033719554105805E-46d, 3.115285807098189E-13d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 9.216155638647194E-8d, 0);
        int int4 = poissonDistributionImpl3.sample();
        int int5 = poissonDistributionImpl3.sample();
        int int7 = poissonDistributionImpl3.getDomainLowerBound(7.875285095517683E-30d);
// flaky "15) test1599(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28 + "'", int4 == 28);
// flaky "7) test1599(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) (short) 0, (double) 'a');
        double double15 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998986222932d, 3);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 35, 110);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9224963690453434d, 9.121924876459277E-28d, 26);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.29140699867905834d);
        int int17 = poissonDistributionImpl3.sample();
        double double19 = poissonDistributionImpl3.normalApproximateProbability((int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "16) test1604(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double20 = poissonDistributionImpl3.cumulativeProbability(3.561279838000423E-149d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9999999907838444d + "'", double18 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(15);
        double double7 = poissonDistributionImpl2.cumulativeProbability(39, 104);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int12 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 32);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(4.5399929762484845E-4d);
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        double double5 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability((int) 'a', 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d, (double) 100L);
        double double12 = poissonDistributionImpl3.getMean();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(0.9353755231673158d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "3) test1611(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144256d + "'", double11 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl3.inverseCumulativeProbability((double) 37);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.941866060050443E-159d + "'", double5 == 3.941866060050443E-159d);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d, (int) (short) 0);
        double double4 = poissonDistributionImpl2.probability(106);
        double double6 = poissonDistributionImpl2.probability(0.14723260883568248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        int int3 = poissonDistributionImpl1.getDomainUpperBound(4.539992976248491E-5d);
        int[] intArray5 = poissonDistributionImpl1.sample(106);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl1.cumulativeProbability(2.3162630182404337E-179d, 0.5578297452874029d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 80, (double) 93);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        int[] intArray11 = poissonDistributionImpl3.sample(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(32.0d, (int) (byte) -1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.826311454135856E-163d, 0.36787943195528694d, 110);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0.0d);
        double double4 = poissonDistributionImpl2.probability(34);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.875285095517683E-30d + "'", double4 == 7.875285095517683E-30d);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 79);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.941866060050443E-159d, 0.0030656620097619935d, 98);
        int int4 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 41);
        double double8 = poissonDistributionImpl3.normalApproximateProbability(73);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(30);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "17) test1623(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        double double18 = poissonDistributionImpl3.normalApproximateProbability(32);
        double double21 = poissonDistributionImpl3.cumulativeProbability(3.5601874895062087E-41d, (double) 10);
        double double23 = poissonDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787943195528694d + "'", double21 == 0.36787943195528694d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6321205588285574d + "'", double23 == 0.6321205588285574d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainLowerBound(1.4230202807276707E-23d);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.950212931632136d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 38, 3.57198604755006E-167d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(1.17246204865673E-37d, (double) 34);
        double double8 = poissonDistributionImpl2.cumulativeProbability(2, 38);
        double double10 = poissonDistributionImpl2.probability(35);
        double double12 = poissonDistributionImpl2.probability((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.29140699867905834d + "'", double5 == 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5429999234951242d + "'", double8 == 0.5429999234951242d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.05956661497600297d + "'", double10 == 0.05956661497600297d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.2001158042335694E-17d + "'", double12 == 3.2001158042335694E-17d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999992542288d, (double) 0, (int) (short) 10);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(9.999778782798785E-13d);
        int int19 = poissonDistributionImpl3.getDomainUpperBound(2.7476693956635508E-33d);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) 97);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int5 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        double double9 = poissonDistributionImpl2.probability((int) (short) -1);
        int int11 = poissonDistributionImpl2.getDomainLowerBound(52.0d);
        double double13 = poissonDistributionImpl2.probability((double) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
// flaky "18) test1629(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 6.305116760146989E-16d + "'", double13 == 6.305116760146989E-16d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 0.0d, (int) (short) 10);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.normalApproximateProbability(32);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability((int) '#', 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3363019087207584d + "'", double6 == 0.3363019087207584d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (int) '4');
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6183476108973206E-52d, (double) 91);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        double double4 = poissonDistributionImpl2.probability((double) 104);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        double double16 = poissonDistributionImpl3.probability((double) (-1L));
        int int18 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double20 = poissonDistributionImpl3.normalApproximateProbability(26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "19) test1634(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(44);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "20) test1635(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.cumulativeProbability(1.962564426565066E-37d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6321205588285574d + "'", double11 == 0.6321205588285574d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 1.2460656213271568E-39d, 9);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(9.999778782798785E-13d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
        double double4 = poissonDistributionImpl1.cumulativeProbability((int) (byte) -1, 3);
        int[] intArray6 = poissonDistributionImpl1.sample(91);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.17246204865673E-37d + "'", double4 == 1.17246204865673E-37d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.139132792048018E-17d);
        double double3 = poissonDistributionImpl1.probability(11);
        int[] intArray5 = poissonDistributionImpl1.sample(12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.307197512236221E-190d + "'", double3 == 7.307197512236221E-190d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.9386867598047597d);
        int int5 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 34);
        double double9 = poissonDistributionImpl2.probability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability(2.3162630182404337E-179d, 0.06186911463179348d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "21) test1641(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5 == 18);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int[] intArray8 = poissonDistributionImpl2.sample(106);
        double double9 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double17 = poissonDistributionImpl3.probability(14);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.219851480312614E-12d + "'", double17 == 4.219851480312614E-12d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.902447399449791E-155d);
        double double3 = poissonDistributionImpl1.cumulativeProbability(0.5429999234951242d);
        double double5 = poissonDistributionImpl1.probability(3.9606298142722176E-69d);
        double double7 = poissonDistributionImpl1.cumulativeProbability(0.9999998986222932d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2460656213271568E-39d, 7.033719554105805E-46d, (int) (byte) 0);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) ' ');
        int[] intArray18 = poissonDistributionImpl3.sample(38);
        double double20 = poissonDistributionImpl3.normalApproximateProbability(46);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = poissonDistributionImpl3.cumulativeProbability(100.0d, 0.6640509287659724d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.2520179332262523d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 4.864649182067619E-63d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, (double) 99, 30);
        poissonDistributionImpl3.reseedRandomGenerator((long) 13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 0.14723260883568248d);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(1.1102230246251565E-16d);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(52.0d);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999999463d + "'", double8 == 0.9999999999999463d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(4.5399929762484845E-4d);
        int int17 = poissonDistributionImpl3.sample();
        int int18 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky "8) test1651(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
// flaky "22) test1651(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d);
        int int3 = poissonDistributionImpl1.getDomainUpperBound((double) 99);
        int[] intArray5 = poissonDistributionImpl1.sample(86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(38.0d);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability(2.8161075942893507E-12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0040290630831367E-103d + "'", double4 == 1.0040290630831367E-103d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.029285828261849244d + "'", double5 == 0.029285828261849244d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 32);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.962564426565066E-37d, 1.4230202807276707E-23d, 98);
        int[] intArray5 = poissonDistributionImpl3.sample(91);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        double double5 = poissonDistributionImpl3.probability((int) (byte) -1);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl3.cumulativeProbability((double) (-1L), 0.028444728018643173d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.025956482467509034d, (double) 35, 34);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(1.2460656213271568E-39d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 102);
        double double9 = poissonDistributionImpl3.cumulativeProbability(186);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d, (int) '#');
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.cumulativeProbability(15);
        poissonDistributionImpl3.reseedRandomGenerator((long) 44);
        double double19 = poissonDistributionImpl3.cumulativeProbability(3.139132792048018E-17d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999999999825d + "'", double15 == 0.9999999999999825d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        int[] intArray4 = poissonDistributionImpl2.sample(95);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(95);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7596379528070493E-10d, 0.9353755231673158d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) 'a');
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.6536858183744849d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d, 104);
        double double4 = poissonDistributionImpl2.probability((int) (byte) 1);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25464638004358264d + "'", double4 == 0.25464638004358264d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6922006275553553d + "'", double6 == 0.6922006275553553d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(83);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(4.793034378392443E-7d, 0.4421702547125971d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(0);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) 12);
        double double19 = poissonDistributionImpl3.cumulativeProbability(43, 95);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.308537538725987d + "'", double14 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "23) test1665(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability(30);
        double double15 = poissonDistributionImpl3.normalApproximateProbability(43);
        poissonDistributionImpl3.reseedRandomGenerator((long) 94);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3869009421120585E-33d + "'", double13 == 1.3869009421120585E-33d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.probability(1.0d);
        double double13 = poissonDistributionImpl3.normalApproximateProbability(2);
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 1);
        double double17 = poissonDistributionImpl3.normalApproximateProbability(10);
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability(0.05956661497600297d);
        int int20 = poissonDistributionImpl3.sample();
        double double22 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.36787944117144233d + "'", double11 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9331927987311419d + "'", double13 == 0.9331927987311419d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "24) test1667(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky "9) test1667(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6321205588285574d + "'", double22 == 0.6321205588285574d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) (short) 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 3);
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(0.9386867598047597d);
        double double20 = poissonDistributionImpl3.cumulativeProbability(99);
        double double22 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double24 = poissonDistributionImpl3.probability(0.6922006339347839d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3525511311226325d + "'", double16 == 0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6321205588285574d + "'", double22 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
// flaky "25) test1670(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double14 = poissonDistributionImpl3.cumulativeProbability(32);
        double double16 = poissonDistributionImpl3.cumulativeProbability(104);
        int int17 = poissonDistributionImpl3.sample();
        int[] intArray19 = poissonDistributionImpl3.sample(102);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "26) test1671(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
// flaky "10) test1671(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int int9 = poissonDistributionImpl2.sample();
        int int11 = poissonDistributionImpl2.getDomainLowerBound(0.4421702547125971d);
        int[] intArray13 = poissonDistributionImpl2.sample(86);
        int int15 = poissonDistributionImpl2.getDomainLowerBound((double) 5);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl2.cumulativeProbability(16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.457712003500205E-9d + "'", double8 == 7.457712003500205E-9d);
// flaky "27) test1672(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.999778782798785E-13d, (double) 100L);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) (byte) -1);
        double double5 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(0.5259020955950889d, 0.5269687609254716d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.999778782798785E-13d + "'", double5 == 9.999778782798785E-13d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 80, 42);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 0.0d, 95);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.36787944117144233d, (double) 100.0f);
        double double14 = poissonDistributionImpl3.cumulativeProbability(99);
        poissonDistributionImpl3.reseedRandomGenerator((long) 95);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36787944117144256d + "'", double12 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double19 = poissonDistributionImpl3.probability((int) '#');
        double double22 = poissonDistributionImpl3.cumulativeProbability(0.6027489844659351d, (double) 3);
        int int24 = poissonDistributionImpl3.getDomainUpperBound(0.7156847426216517d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "28) test1677(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3.5601874895062087E-41d + "'", double19 == 3.5601874895062087E-41d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3525511311226325d + "'", double22 == 0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.probability(12);
        int int14 = poissonDistributionImpl3.getDomainLowerBound((double) 46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "29) test1678(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.680129694168893E-10d + "'", double12 == 7.680129694168893E-10d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9331927987311419d, 4.018416977195786E-54d);
        double double4 = poissonDistributionImpl2.probability(0.03796348149127876d);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(5.609088260248484E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, (int) (byte) 10);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 10);
        double double7 = poissonDistributionImpl2.probability(0.19699216367798777d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 32, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.probability(112);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4205580623440414E-28d + "'", double4 == 2.4205580623440414E-28d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainUpperBound(4.560969057281241E-69d);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) 32, (double) 100L);
        double double19 = poissonDistributionImpl3.normalApproximateProbability(102);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "30) test1682(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        int int10 = poissonDistributionImpl3.getDomainLowerBound(10.0d);
        int int11 = poissonDistributionImpl3.sample();
        int int12 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "31) test1683(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "4) test1683(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 23, 100.0d, 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(1.0398180320558363E-12d);
        double double14 = poissonDistributionImpl3.probability(2);
        double double15 = poissonDistributionImpl3.getMean();
        double double18 = poissonDistributionImpl3.cumulativeProbability(31, 10000000);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.18393972058572114d + "'", double14 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 99);
        double double21 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        double double23 = poissonDistributionImpl3.probability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double26 = poissonDistributionImpl3.cumulativeProbability(86, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "32) test1686(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.5601874895062087E-41d + "'", double23 == 3.5601874895062087E-41d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int[] intArray5 = poissonDistributionImpl1.sample((int) 'a');
        double double6 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        poissonDistributionImpl1.reseedRandomGenerator((long) 39);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability((double) 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 35");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794411123646d, 3.1627334188024467E-75d, (int) (byte) -1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (int) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6150373563537195d, 0.8862636038898793d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 104, 0);
        int int4 = poissonDistributionImpl2.getDomainUpperBound((double) 106);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability(0.3678794411711612d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 104.0d + "'", double5 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, (double) (short) -1, (int) (short) 100);
        int[] intArray5 = poissonDistributionImpl3.sample((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(105, 40);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
// flaky "33) test1695(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 28, 34, 34, 39, 34, 50, 52, 24, 27, 45 });
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.029285828261849244d, 1.0137743067240024E-7d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9402803946842729d, 4.719682636442159E-60d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 99);
        int[] intArray21 = poissonDistributionImpl3.sample(100);
        double double23 = poissonDistributionImpl3.cumulativeProbability(99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "34) test1698(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) 3);
        int int12 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.cumulativeProbability(46, (int) (byte) 100);
        double double17 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.probability(5);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(0.9936865915923108d, 2.8133051444001467E-13d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky "35) test1700(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 105 + "'", int3 == 105);
// flaky "11) test1700(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 111 + "'", int4 == 111);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.347030737638007E-35d + "'", double6 == 5.347030737638007E-35d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999999d, 4.160702826336122E-32d, 29);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        int[] intArray5 = poissonDistributionImpl3.sample(5);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "36) test1702(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        double double11 = poissonDistributionImpl3.cumulativeProbability(10000000);
        int int13 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.9999999999999825d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(79);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample(36);
        double double12 = poissonDistributionImpl3.cumulativeProbability(80);
        double double14 = poissonDistributionImpl3.probability(12);
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.680129694168893E-10d + "'", double14 == 7.680129694168893E-10d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.902447399449791E-155d, 0.01891663740103536d, 99);
        double double5 = poissonDistributionImpl3.cumulativeProbability(78);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(44.0d, 10.0d, 93);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.3678794411711612d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 42 + "'", int5 == 42);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 4.993992273873336E-4d, 26);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainLowerBound(1.4230202807276707E-23d);
        double double15 = poissonDistributionImpl3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(0.5319622942224367d, 4.993992273873336E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36787944117144233d + "'", double15 == 0.36787944117144233d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 10);
        int[] intArray5 = poissonDistributionImpl1.sample(3);
        double double7 = poissonDistributionImpl1.cumulativeProbability(34);
        double double8 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0137771196302933E-7d + "'", double3 == 1.0137771196302933E-7d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "37) test1710(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 2, 2, 2 });
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double20 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        double double22 = poissonDistributionImpl3.probability(37);
        int int23 = poissonDistributionImpl3.sample();
        int int24 = poissonDistributionImpl3.sample();
        double double27 = poissonDistributionImpl3.cumulativeProbability(0, 104);
        double double29 = poissonDistributionImpl3.probability(4.448081146614204E-6d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.6728134305602215E-44d + "'", double22 == 2.6728134305602215E-44d);
// flaky "12) test1711(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky "2) test1711(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        int int12 = poissonDistributionImpl3.getDomainUpperBound((double) 10000000);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "38) test1712(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl3.cumulativeProbability((double) 10000000, (double) 0.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        int int10 = poissonDistributionImpl3.getDomainLowerBound((double) 106);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability(83, 52);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.03796348149127876d, 6.685526970917836E-59d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 0.0f, 10);
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int int6 = poissonDistributionImpl3.sample();
        int int7 = poissonDistributionImpl3.sample();
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
// flaky "39) test1716(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
// flaky "13) test1716(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6321205588285574d + "'", double8 == 0.6321205588285574d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        double double16 = poissonDistributionImpl3.probability(0);
        double double18 = poissonDistributionImpl3.probability(0.5429999234951242d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.36787944117144233d + "'", double16 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        double double7 = poissonDistributionImpl1.cumulativeProbability(1.4230202807276707E-23d);
        double double9 = poissonDistributionImpl1.cumulativeProbability(0.9224963690453434d);
        int int10 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.3013378484179026E-15d, (double) (byte) 100);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, 37);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572117d);
        double double4 = poissonDistributionImpl1.cumulativeProbability(28, 86);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) (short) 0);
        double double13 = poissonDistributionImpl3.probability((double) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.57198604755006E-167d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(15);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4);
        double double8 = poissonDistributionImpl2.probability(0.021990921302225148d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 83, 31);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        double double14 = poissonDistributionImpl3.probability(3);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int[] intArray18 = poissonDistributionImpl3.sample(23);
        poissonDistributionImpl3.reseedRandomGenerator((long) 2146192320);
        int[] intArray22 = poissonDistributionImpl3.sample((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "40) test1725(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06131324019524039d + "'", double14 == 0.06131324019524039d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 1, 1, 0, 1, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2 });
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        double double14 = poissonDistributionImpl3.cumulativeProbability(100);
        int int16 = poissonDistributionImpl3.getDomainLowerBound((double) ' ');
        int[] intArray18 = poissonDistributionImpl3.sample(15);
        int int19 = poissonDistributionImpl3.sample();
        int int21 = poissonDistributionImpl3.getDomainLowerBound(0.021990921302225148d);
        int int23 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
// flaky "41) test1726(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray18, new int[] { 2, 0, 1, 2, 3, 2, 2, 0, 2, 0, 0, 2, 0, 1, 1 });
// flaky "14) test1726(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 14);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, 82);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(0.1251100357211333d);
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(0.06680720126885803d);
        double double23 = poissonDistributionImpl3.probability(104);
        int int25 = poissonDistributionImpl3.getDomainUpperBound((double) 0L);
        int[] intArray27 = poissonDistributionImpl3.sample(31);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.57198604755006E-167d + "'", double23 == 3.57198604755006E-167d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        double double22 = poissonDistributionImpl3.getMean();
        double double24 = poissonDistributionImpl3.normalApproximateProbability(37);
        double double26 = poissonDistributionImpl3.normalApproximateProbability(43);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.875285095517683E-30d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9937903346742238d, 3.2001158042335694E-17d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.0876756987846234E-153d, (double) '4', 78);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int int15 = poissonDistributionImpl3.getDomainUpperBound(0.5429999234951242d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9846716899511899d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(9);
        int int4 = poissonDistributionImpl1.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl1.cumulativeProbability(2147483647, (int) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
// flaky "42) test1735(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 32);
        double double10 = poissonDistributionImpl3.probability(106);
        double double12 = poissonDistributionImpl3.cumulativeProbability(83);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double20 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        double double22 = poissonDistributionImpl3.probability(37);
        int int24 = poissonDistributionImpl3.getDomainUpperBound(0.6150373563537195d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.6728134305602215E-44d + "'", double22 == 2.6728134305602215E-44d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(104.0d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9405285822723919d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.probability(32);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        double double18 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double21 = poissonDistributionImpl3.cumulativeProbability(24, 112);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3980856271290693E-36d + "'", double14 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        double double23 = poissonDistributionImpl3.probability((int) (short) -1);
        java.lang.Class<?> wildcardClass24 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "43) test1741(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(4.5399929762484845E-4d);
        int[] intArray18 = poissonDistributionImpl3.sample(37);
        poissonDistributionImpl3.reseedRandomGenerator(1L);
        double double22 = poissonDistributionImpl3.normalApproximateProbability(2146192320);
        poissonDistributionImpl3.reseedRandomGenerator((long) 3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', 14);
        double double4 = poissonDistributionImpl2.probability((double) 102);
        double double6 = poissonDistributionImpl2.probability((double) 78);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.9248445663341396E-10d + "'", double4 == 2.9248445663341396E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.6253133415699046E-4d + "'", double6 == 1.6253133415699046E-4d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 1.5034409561692122E-102d, 41);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) 83);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 0.14723260883568248d);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(1.1102230246251565E-16d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.9999999999999997d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.539992976248491E-5d + "'", double6 == 4.539992976248491E-5d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.4421702547125802d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06680720126885803d, 100.0d);
        double double4 = poissonDistributionImpl2.probability(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.692187436142982E-82d + "'", double4 == 6.692187436142982E-82d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        double double15 = poissonDistributionImpl3.probability((double) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability(15, 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.8133051444001467E-13d + "'", double18 == 2.8133051444001467E-13d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        poissonDistributionImpl2.reseedRandomGenerator((long) 91);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10);
        int[] intArray3 = poissonDistributionImpl1.sample(46);
        int int4 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertNotNull(intArray3);
// flaky "44) test1751(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.291633944458635E-10d, 31);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int16 = poissonDistributionImpl3.sample();
        double double18 = poissonDistributionImpl3.cumulativeProbability(2);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "45) test1753(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 2, 1, 0, 1, 0, 0, 0, 1, 2, 2 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "5) test1753(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9386867598047597d + "'", double18 == 0.9386867598047597d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        double double11 = poissonDistributionImpl3.normalApproximateProbability(91);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, (double) 3);
        int int18 = poissonDistributionImpl3.inverseCumulativeProbability(0.9386867598047597d);
        double double20 = poissonDistributionImpl3.probability(35);
        int[] intArray22 = poissonDistributionImpl3.sample(51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3525511311226325d + "'", double16 == 0.3525511311226325d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.5601874895062087E-41d + "'", double20 == 3.5601874895062087E-41d);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.normalApproximateProbability((int) '#');
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 0, (double) 36);
        double double20 = poissonDistributionImpl3.probability((double) 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "46) test1756(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.36787944117144233d + "'", double20 == 0.36787944117144233d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 36, 24);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.probability(0.36787944117144233d);
        int int17 = poissonDistributionImpl3.inverseCumulativeProbability(4.5399929762484845E-4d);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(0.025956482467509034d);
        double double21 = poissonDistributionImpl3.probability(0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
// flaky "47) test1758(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 4.5399929762484854E-5d);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.01377703554215E-7d, 4.560969057281241E-69d, 13);
        double double6 = poissonDistributionImpl3.cumulativeProbability(32, 105);
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 32);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        double double5 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 38.0d + "'", double5 == 38.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6426402136161335d);
        double double3 = poissonDistributionImpl1.probability(0);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5259020955950889d + "'", double3 == 0.5259020955950889d);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.471972337343043E-43d, 3.139132792048018E-17d);
        double double4 = poissonDistributionImpl2.probability((double) 43);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) (short) -1);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(4.219851480312614E-12d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(2146192320);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10,000,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(52.0d, (double) (byte) -1, 15);
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 1);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2518874825673265E-12d + "'", double5 == 1.2518874825673265E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) 3);
        int int12 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.cumulativeProbability(46, (int) (byte) 100);
        double double17 = poissonDistributionImpl3.probability(94);
        poissonDistributionImpl3.reseedRandomGenerator((long) 50);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.383215846100408E-147d + "'", double17 == 3.383215846100408E-147d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.36787944117144233d, (double) 100.0f);
        double double14 = poissonDistributionImpl3.cumulativeProbability(99);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(110);
        int int17 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.36787944117144256d + "'", double12 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
// flaky "48) test1767(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) (byte) 1);
        int int17 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        int int21 = poissonDistributionImpl3.getDomainUpperBound(0.9386867598047597d);
        int int23 = poissonDistributionImpl3.getDomainLowerBound(0.999999992542288d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
// flaky "49) test1768(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.8133051444001467E-13d, (int) (short) 10);
        double double4 = poissonDistributionImpl2.probability(0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        int int3 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.getDomainUpperBound(2.8161075942893507E-12d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(12);
// flaky "50) test1770(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.545951360777861E-7d + "'", double7 == 8.545951360777861E-7d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double12 = poissonDistributionImpl3.probability((double) 10);
        double double14 = poissonDistributionImpl3.normalApproximateProbability((int) (short) -1);
        int int16 = poissonDistributionImpl3.getDomainUpperBound((double) 32);
        double double18 = poissonDistributionImpl3.probability(0.9736445389005101d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0137771196302933E-7d + "'", double12 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.06680720126885803d + "'", double14 == 0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        double double22 = poissonDistributionImpl3.getMean();
        int int24 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        int int26 = poissonDistributionImpl3.getDomainLowerBound((double) 26);
        java.lang.Class<?> wildcardClass27 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.864649182067619E-63d, 0.9997803485788277d);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, 0.0d);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability(7.457712003500205E-9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9386867598047597d + "'", double3 == 0.9386867598047597d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, (double) 107, 115);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        int int14 = poissonDistributionImpl3.getDomainLowerBound(100.0d);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 0);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 37);
        int int19 = poissonDistributionImpl3.sample();
        double double21 = poissonDistributionImpl3.probability(1.3571450159050078E-13d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "51) test1776(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
// flaky "15) test1776(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 15);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(99);
        int[] intArray5 = poissonDistributionImpl1.sample((int) ' ');
        double double7 = poissonDistributionImpl1.cumulativeProbability(1.4230202807276707E-23d);
        double double9 = poissonDistributionImpl1.probability(105);
        double double12 = poissonDistributionImpl1.cumulativeProbability(0.9999999999999993d, (double) 83);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0);
        double double20 = poissonDistributionImpl3.cumulativeProbability(14, 93);
        int int22 = poissonDistributionImpl3.getDomainUpperBound(0.021990921302225148d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.2198466942977575E-12d + "'", double20 == 4.2198466942977575E-12d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, (double) 16, 110);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117227944d, 105);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.4421702547125971d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.033719554105805E-46d, 0.25464638004358264d, 99);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.033719554105805E-46d + "'", double4 == 7.033719554105805E-46d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.4018914738572114E-169d, 4.719682636442159E-60d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.36787943195528694d);
        int int5 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.4018914738572114E-169d + "'", double6 == 3.4018914738572114E-169d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999999999d, 0.0d, 10);
        int[] intArray5 = poissonDistributionImpl3.sample(44);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(3.2093315791106567E-171d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.028861154135454092d, 2.755731922395672E-127d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100, 27);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 1L);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        int int8 = poissonDistributionImpl2.getDomainUpperBound(0.308537538725987d);
        double double10 = poissonDistributionImpl2.probability(8.322102657191705E-4d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8345580221844533d + "'", double6 == 0.8345580221844533d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        int int18 = poissonDistributionImpl3.sample();
        double double20 = poissonDistributionImpl3.probability(0.533676680517062d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
// flaky "16) test1788(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.normalApproximateProbability(0);
        double double22 = poissonDistributionImpl3.probability(4.5399929762484845E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = poissonDistributionImpl3.cumulativeProbability(0.9937903346742238d, 4.719682636442159E-60d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "17) test1789(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.308537538725987d + "'", double20 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(38.0d);
        double double5 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(10.0d, 8.101511794681424E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0040290630831367E-103d + "'", double4 == 1.0040290630831367E-103d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.029285828261849244d + "'", double5 == 0.029285828261849244d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        int int14 = poissonDistributionImpl3.getDomainLowerBound((double) 46);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = poissonDistributionImpl3.inverseCumulativeProbability((double) 12);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "52) test1791(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6321205588285574d + "'", double12 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 102);
// flaky "53) test1792(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double11 = poissonDistributionImpl3.probability((double) 106);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(3.561279838000423E-149d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.2093315791106567E-171d + "'", double11 == 3.2093315791106567E-171d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.normalApproximateProbability(0);
        double double22 = poissonDistributionImpl3.probability(4.5399929762484845E-4d);
        double double24 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        int[] intArray26 = poissonDistributionImpl3.sample(94);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "54) test1794(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.308537538725987d + "'", double20 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.6321205588285574d + "'", double24 == 0.6321205588285574d);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
        double double11 = poissonDistributionImpl3.probability(2);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) 26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.18393972058572114d + "'", double11 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546000702375d, 38);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999999999999813d + "'", double6 == 0.9999999999999813d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability(1.962564426565066E-37d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(0, 59);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
// flaky "55) test1797(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.normalApproximateProbability(80);
        double double16 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 10);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7401052582713831E-47d);
        double double8 = poissonDistributionImpl2.probability(0.9652365304395534d);
        int int9 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.008575364588394788d);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, 3);
        double double4 = poissonDistributionImpl2.probability(6.26308534261165E-35d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 46);
        double double12 = poissonDistributionImpl3.normalApproximateProbability(24);
        int[] intArray14 = poissonDistributionImpl3.sample(30);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, (double) 0.0f, 10);
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int int6 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(4.5399929762484845E-4d, 6.305116760146989E-16d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
// flaky "56) test1803(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d, 6.305116760146996E-16d);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.017644508717319204d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36083758160943114d, 9.216155633002718E-9d, (int) (byte) 10);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, (double) (-1), 0);
        double double5 = poissonDistributionImpl3.probability(0.14723260883568248d);
        double double7 = poissonDistributionImpl3.probability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.2401161522552107E-91d + "'", double7 == 2.2401161522552107E-91d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.1102230246251565E-16d);
        int int3 = poissonDistributionImpl1.getDomainUpperBound(0.9999999999999825d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainLowerBound((double) (-1));
        double double6 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        double double10 = poissonDistributionImpl3.cumulativeProbability(43);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.6922006339347839d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-12d + "'", double6 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, 0.691462461274013d, 37);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(2.8133051444001467E-13d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (int) (short) 10);
        double double4 = poissonDistributionImpl2.probability(0.9999999999991455d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(112, 112);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 93);
        int[] intArray3 = poissonDistributionImpl1.sample(86);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        double double11 = poissonDistributionImpl3.probability((double) (byte) -1);
        int int12 = poissonDistributionImpl3.sample();
        double double14 = poissonDistributionImpl3.probability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double19 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 99);
        int[] intArray21 = poissonDistributionImpl3.sample(100);
        int int23 = poissonDistributionImpl3.inverseCumulativeProbability(3.4018914738572114E-169d);
        int int25 = poissonDistributionImpl3.getDomainUpperBound(0.7156847426216517d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "57) test1812(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double10 = poissonDistributionImpl3.getMean();
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.14723260883568248d);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = poissonDistributionImpl3.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 106);
        double double15 = poissonDistributionImpl3.cumulativeProbability(0.999999999954943d);
        double double17 = poissonDistributionImpl3.cumulativeProbability(1.2460656213271568E-39d);
        double double19 = poissonDistributionImpl3.cumulativeProbability(38.0d);
        int int20 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = poissonDistributionImpl3.inverseCumulativeProbability((double) 43);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "58) test1814(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6321205588285574d + "'", double17 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
// flaky "18) test1814(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.216155638647194E-8d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.999999999954943d);
        int[] intArray5 = poissonDistributionImpl1.sample(37);
        int int6 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9386867598047597d, 0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.05956661497600297d);
        int int7 = poissonDistributionImpl2.sample();
        double double10 = poissonDistributionImpl2.cumulativeProbability(0, 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9995720010776109d + "'", double10 == 0.9995720010776109d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        int int13 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double14 = poissonDistributionImpl3.getMean();
        int int15 = poissonDistributionImpl3.sample();
        int[] intArray17 = poissonDistributionImpl3.sample(29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "59) test1817(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998405164d, 4.560969057281241E-69d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        int int4 = poissonDistributionImpl2.getDomainLowerBound(0.0d);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(52.0d);
        int int7 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
// flaky "60) test1819(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06131324019524039d, 0.308537538725987d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        int int5 = poissonDistributionImpl1.getDomainUpperBound((double) (-1L));
        poissonDistributionImpl1.reseedRandomGenerator((long) (byte) 10);
        int int9 = poissonDistributionImpl1.getDomainLowerBound((double) 98);
        double double11 = poissonDistributionImpl1.cumulativeProbability(2);
        int int13 = poissonDistributionImpl1.getDomainUpperBound(0.015328310048810079d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0027693957155115767d + "'", double11 == 0.0027693957155115767d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        int[] intArray12 = poissonDistributionImpl3.sample(23);
        double double14 = poissonDistributionImpl3.cumulativeProbability(4.2913989097407664E-60d);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability(7.043845779425746E-168d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky "61) test1822(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray12, new int[] { 2, 0, 0, 4, 1, 0, 1, 1, 1, 1, 3, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1 });
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6321205588285574d + "'", double14 == 0.6321205588285574d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.17246204865673E-37d);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.17246204865673E-37d + "'", double2 == 1.17246204865673E-37d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(38.0d);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) (-1L), 2.813234320208393E-13d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0040290630831367E-103d + "'", double4 == 1.0040290630831367E-103d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9711388458645459d + "'", double7 == 0.9711388458645459d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        int int13 = poissonDistributionImpl3.getDomainLowerBound((double) (byte) 1);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample((int) (short) 100);
        int int17 = poissonDistributionImpl3.getDomainUpperBound(0.06680720126885803d);
        int int19 = poissonDistributionImpl3.inverseCumulativeProbability(7.043845779425746E-168d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl3.reseedRandomGenerator(0L);
        double double14 = poissonDistributionImpl3.probability(32);
        int int16 = poissonDistributionImpl3.inverseCumulativeProbability(0.18393972058572117d);
        double double18 = poissonDistributionImpl3.probability((double) 2);
        double double19 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.3980856271290693E-36d + "'", double14 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.18393972058572114d + "'", double18 == 0.18393972058572114d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999545754442823d, 1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        double double22 = poissonDistributionImpl3.getMean();
        double double24 = poissonDistributionImpl3.normalApproximateProbability(37);
        int[] intArray26 = poissonDistributionImpl3.sample(23);
        double double28 = poissonDistributionImpl3.probability(12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(intArray26);
// flaky "62) test1830(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray26, new int[] { 1, 1, 1, 0, 2, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 1, 0, 0 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.680129694168893E-10d + "'", double28 == 7.680129694168893E-10d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        double double13 = poissonDistributionImpl3.cumulativeProbability(32, 99);
        double double15 = poissonDistributionImpl3.probability(73);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.229752549768878E-107d + "'", double15 == 8.229752549768878E-107d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        double double4 = poissonDistributionImpl3.getMean();
        int[] intArray6 = poissonDistributionImpl3.sample((int) (short) 1);
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.25464638004358264d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-12d + "'", double4 == 1.0E-12d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.631895849694923E-44d, 1.3980856271290628E-36d);
        double double4 = poissonDistributionImpl2.probability(32);
        int[] intArray6 = poissonDistributionImpl2.sample(14);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6426402136161335d, 0.011604342211143792d, 43);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(1.5080394273921536E-28d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability(30);
        double double15 = poissonDistributionImpl3.normalApproximateProbability(43);
        double double17 = poissonDistributionImpl3.probability(24);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3869009421120585E-33d + "'", double13 == 1.3869009421120585E-33d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.929251169698556E-25d + "'", double17 == 5.929251169698556E-25d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0398180320558363E-12d, 24);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0398180320558363E-12d + "'", double3 == 1.0398180320558363E-12d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 23, 100.0d, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 103);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546000702375d, 21);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, (double) (short) 10);
        int[] intArray4 = poissonDistributionImpl2.sample(86);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.3980856271290693E-36d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        double double4 = poissonDistributionImpl1.getMean();
        int int6 = poissonDistributionImpl1.inverseCumulativeProbability(4.3013378484179026E-15d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl1.cumulativeProbability(97, 50);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3980856271290693E-36d + "'", double4 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int20 = poissonDistributionImpl3.getDomainUpperBound((double) ' ');
        int int22 = poissonDistributionImpl3.inverseCumulativeProbability(2.7476693956635508E-33d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
        int int3 = poissonDistributionImpl1.getDomainUpperBound(0.9995720010776109d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 26, 5.347030737638007E-35d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(12, 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 43, 50);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        double double23 = poissonDistributionImpl3.probability((int) (short) -1);
        double double25 = poissonDistributionImpl3.probability(3);
        double double27 = poissonDistributionImpl3.probability((double) 1);
        double double29 = poissonDistributionImpl3.probability(0.0d);
        int int30 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "63) test1846(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.36787944117144233d + "'", double27 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.36787944117144233d + "'", double29 == 0.36787944117144233d);
// flaky "19) test1846(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d, (double) 103, 50);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(1.7401052582713831E-47d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0398180320558363E-12d, 3.941866060050443E-159d, 34);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(0.9999999907838444d);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(4.719682636442159E-60d);
        int int8 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        double double22 = poissonDistributionImpl3.getMean();
        double double24 = poissonDistributionImpl3.normalApproximateProbability(37);
        int[] intArray26 = poissonDistributionImpl3.sample(23);
        int int28 = poissonDistributionImpl3.getDomainUpperBound(5.1401737047361744E-120d);
        int[] intArray30 = poissonDistributionImpl3.sample(28);
        double double31 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(intArray26);
// flaky "64) test1849(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 1, 3, 1, 0, 2, 0, 1, 0, 0, 0, 1, 1, 2, 1, 0, 1, 1, 0, 1, 0, 1, 2 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144256d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 41);
        double double5 = poissonDistributionImpl1.normalApproximateProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl1.inverseCumulativeProbability((double) 44);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (int) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.probability(0.36787943195528694d);
        double double13 = poissonDistributionImpl3.cumulativeProbability(32);
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.probability(15);
        double double17 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.813234320208393E-13d + "'", double16 == 2.813234320208393E-13d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 59, (double) 83, 105);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.88940969307282E-43d, (double) 1, 41);
        int int5 = poissonDistributionImpl3.getDomainUpperBound(3.8243984514608465E-153d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.028861154135454092d, 2.755731922395672E-127d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 38);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1, 2);
        poissonDistributionImpl2.reseedRandomGenerator((long) 26);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.028444728018643173d + "'", double7 == 0.028444728018643173d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 110, 31);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6889118802245312E-48d + "'", double4 == 1.6889118802245312E-48d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9956796);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        double double11 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "65) test1858(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9999999907838444d + "'", double16 == 0.9999999907838444d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.probability(0.9999999907838444d);
        double double4 = poissonDistributionImpl1.getMean();
        int int6 = poissonDistributionImpl1.getDomainLowerBound(0.9999999999977743d);
        double double8 = poissonDistributionImpl1.probability(0.36787944117144256d);
        int int10 = poissonDistributionImpl1.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), 27);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(4.925222664969737E-19d);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) 186);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "66) test1861(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 1, 1, 2, 1, 2, 1, 2, 1, 2 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1);
        double double2 = poissonDistributionImpl1.getMean();
        int int4 = poissonDistributionImpl1.inverseCumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2518874825673265E-12d, 0.6027489844659351d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, (int) '4');
        int[] intArray4 = poissonDistributionImpl2.sample(39);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        int int8 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.probability(1.0d);
        double double12 = poissonDistributionImpl3.probability(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "67) test1865(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
// flaky "6) test1865(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.36787944117144233d + "'", double10 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.033719554105805E-46d + "'", double12 == 7.033719554105805E-46d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0398180320558363E-12d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40894881836993996d, 73);
        double double5 = poissonDistributionImpl2.cumulativeProbability(38.0d, (double) 100L);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(3);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability(1.962564426565066E-37d);
        double double12 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.062340213690675E-8d + "'", double8 == 5.062340213690675E-8d);
// flaky "68) test1868(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4919298095548862d, 4.864649182067619E-63d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(3.8243984514608465E-153d);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(44);
        double double13 = poissonDistributionImpl3.probability(110);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.3162630182404337E-179d + "'", double13 == 2.3162630182404337E-179d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d);
        double double3 = poissonDistributionImpl1.probability((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl1.cumulativeProbability(2.170057723151973E-33d, 1.2460656213271568E-39d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.043845779425746E-168d + "'", double3 == 7.043845779425746E-168d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787943195528694d, (double) (-1L), 10);
        int int5 = poissonDistributionImpl3.getDomainLowerBound(1.4076594357809174E-73d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        double double12 = poissonDistributionImpl3.getMean();
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 0, 0.29140699867905834d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "69) test1873(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6321205588285574d + "'", double15 == 0.6321205588285574d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.4106148140883866E-25d, 29);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.36787944117144233d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
// flaky "70) test1875(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 39 + "'", int5 == 39);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9960697873735121d, 0.9999999999991455d, 9);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) 2);
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.0030656620097619935d);
        int int8 = poissonDistributionImpl2.getDomainUpperBound((double) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.929251169698556E-25d, 1.6253133415699046E-4d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.01891663740103536d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5034409561692122E-102d, 0.03796348149127876d, 15);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(1.2051256383269262E-30d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021990921302225148d, 0.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 0.0d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(13, 112);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.059797191288908E-12d + "'", double5 == 7.059797191288908E-12d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 1.1173711675821023E-12d, (int) (short) 10);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) '#');
        int int16 = poissonDistributionImpl3.getDomainLowerBound(3.57198604755006E-167d);
        double double18 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        int int20 = poissonDistributionImpl3.inverseCumulativeProbability(4.719682636442159E-60d);
        int int22 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double24 = poissonDistributionImpl3.cumulativeProbability(39);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10L);
        double double8 = poissonDistributionImpl3.getMean();
        int int9 = poissonDistributionImpl3.sample();
        int[] intArray11 = poissonDistributionImpl3.sample(9);
        int int12 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-12d + "'", double8 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 46);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.0030656620097619935d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 73 + "'", int6 == 73);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.getDomainUpperBound((double) (short) 1);
        double double23 = poissonDistributionImpl3.normalApproximateProbability(0);
        double double25 = poissonDistributionImpl3.probability((double) (-1));
        double double27 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double29 = poissonDistributionImpl3.probability(0.8862636038898793d);
        double double31 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) -1);
        double double33 = poissonDistributionImpl3.cumulativeProbability(9.88940969307282E-43d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "20) test1888(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.308537538725987d + "'", double23 == 0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.06680720126885803d + "'", double31 == 0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.6321205588285574d + "'", double33 == 0.6321205588285574d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.03105243133179786d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, 0.6922006339347749d, 35);
        double double5 = poissonDistributionImpl3.probability((int) (byte) 1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 115);
        double double9 = poissonDistributionImpl3.cumulativeProbability(105);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.631895849694923E-44d + "'", double5 == 2.631895849694923E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9236504896389613d + "'", double9 == 0.9236504896389613d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (double) (byte) 1, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.6426402136161335d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-12d + "'", double5 == 1.0E-12d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999999999d + "'", double7 == 0.999999999999d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        int int10 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) '4');
        double double13 = poissonDistributionImpl3.getMean();
        double double15 = poissonDistributionImpl3.cumulativeProbability(98);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
// flaky "71) test1892(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double14 = poissonDistributionImpl3.getMean();
        double double15 = poissonDistributionImpl3.getMean();
        double double17 = poissonDistributionImpl3.probability(10);
        double double19 = poissonDistributionImpl3.probability(9.88940969307282E-43d);
        double double21 = poissonDistributionImpl3.probability(103);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0137771196302933E-7d + "'", double17 == 1.0137771196302933E-7d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.714865489451933E-165d + "'", double21 == 3.714865489451933E-165d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        int int14 = poissonDistributionImpl3.sample();
        int int16 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "72) test1894(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.normalApproximateProbability(0);
        int int21 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        double double25 = poissonDistributionImpl3.probability(4.793034378392443E-7d);
        int int27 = poissonDistributionImpl3.getDomainUpperBound(0.9999998986222932d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "73) test1895(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 3 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.308537538725987d + "'", double20 == 0.308537538725987d);
// flaky "21) test1895(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        double double8 = poissonDistributionImpl3.getMean();
        int[] intArray10 = poissonDistributionImpl3.sample(36);
        double double12 = poissonDistributionImpl3.cumulativeProbability(80);
        double double13 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(6.305116760146996E-16d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 3.720075976020836E-44d);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1);
        double double23 = poissonDistributionImpl3.probability((int) (short) -1);
        double double25 = poissonDistributionImpl3.probability(3);
        double double27 = poissonDistributionImpl3.probability((double) 1);
        double double30 = poissonDistributionImpl3.cumulativeProbability((int) '#', (int) (short) 100);
        int int32 = poissonDistributionImpl3.getDomainUpperBound(1.4230202807276707E-23d);
        double double35 = poissonDistributionImpl3.cumulativeProbability(0.03781461598070298d, (double) 44);
        int int36 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "74) test1899(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.06131324019524039d + "'", double25 == 0.06131324019524039d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.36787944117144233d + "'", double27 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.36787944117144256d + "'", double35 == 0.36787944117144256d);
// flaky "22) test1899(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.9552158909873505E-5d, (double) 1);
        double double4 = poissonDistributionImpl2.probability((double) 3);
        double double6 = poissonDistributionImpl2.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.3013378484179026E-15d + "'", double4 == 4.3013378484179026E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999704482777508d + "'", double6 == 0.9999704482777508d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.015328310048810079d, 86);
        int int3 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999943880751789d, 10);
        int[] intArray4 = poissonDistributionImpl2.sample(115);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 100);
        double double19 = poissonDistributionImpl3.cumulativeProbability(0.999999999231987d);
        double double21 = poissonDistributionImpl3.cumulativeProbability((double) 6);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6321205588285574d + "'", double19 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9999270080473867d + "'", double21 == 0.9999270080473867d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8345580221844533d, 41);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(0.533676680517062d);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(29);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06727319239963177d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d);
        double double3 = poissonDistributionImpl1.probability((double) 100);
        double double5 = poissonDistributionImpl1.probability(0.07034028736850317d);
        double double7 = poissonDistributionImpl1.normalApproximateProbability(97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.043845779425746E-168d + "'", double3 == 7.043845779425746E-168d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        double double21 = poissonDistributionImpl3.probability(0.0d);
        double double23 = poissonDistributionImpl3.cumulativeProbability((double) 'a');
        double double25 = poissonDistributionImpl3.cumulativeProbability((double) (-1));
        double double27 = poissonDistributionImpl3.probability(93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "75) test1907(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 4 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.1802228953341904E-145d + "'", double27 == 3.1802228953341904E-145d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 105, (double) 0);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999907838444d, (int) 'a');
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability((double) 10);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(34);
        double double12 = poissonDistributionImpl2.cumulativeProbability(79, (int) (short) 100);
// flaky "76) test1909(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.01377703554215E-7d + "'", double5 == 1.01377703554215E-7d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double16 = poissonDistributionImpl3.cumulativeProbability((double) 2, (double) 'a');
        int[] intArray18 = poissonDistributionImpl3.sample(102);
        int int19 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.18393972058572117d + "'", double16 == 0.18393972058572117d);
        org.junit.Assert.assertNotNull(intArray18);
// flaky "23) test1910(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.cumulativeProbability(32);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 0);
        int int9 = poissonDistributionImpl2.getDomainLowerBound(0.691462461274013d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) 102);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8160602794142788d + "'", double3 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.probability(1);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(1.5034409561692122E-102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484845E-4d + "'", double4 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double7 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int13 = poissonDistributionImpl3.getDomainUpperBound(7.033719554105805E-46d);
        int int14 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        double double18 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 38);
        double double21 = poissonDistributionImpl3.cumulativeProbability(38, (int) (short) 100);
        double double22 = poissonDistributionImpl3.getMean();
        int int24 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        int int26 = poissonDistributionImpl3.getDomainLowerBound((double) 26);
        int[] intArray28 = poissonDistributionImpl3.sample(36);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = poissonDistributionImpl3.cumulativeProbability(1.5034409561692122E-102d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.36787944117144256d + "'", double18 == 0.36787944117144256d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.36787944117144233d, 1);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40894881836993996d, 73);
        double double5 = poissonDistributionImpl2.cumulativeProbability(38.0d, (double) 100L);
        int int7 = poissonDistributionImpl2.getDomainUpperBound((double) 86);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f);
        poissonDistributionImpl3.reseedRandomGenerator(100L);
        int int13 = poissonDistributionImpl3.sample();
        double double15 = poissonDistributionImpl3.cumulativeProbability(15);
        int int17 = poissonDistributionImpl3.getDomainUpperBound((double) 38);
        int int19 = poissonDistributionImpl3.getDomainLowerBound(0.9999704482777508d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999907838444d + "'", double10 == 0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999999999999825d + "'", double15 == 0.9999999999999825d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.062340213690675E-8d, (double) (short) 10);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.0528363998149075E-10d, 79);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.17390895361798006d, 26);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.2913989097407664E-60d, (double) 0, 98);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.2913989097407664E-60d + "'", double5 == 4.2913989097407664E-60d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(7.214425871271413E-5d);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) 2147483647);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        int int13 = poissonDistributionImpl3.inverseCumulativeProbability(0.8160602794142788d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double17 = poissonDistributionImpl3.cumulativeProbability(12);
        double double20 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.9605336665255937d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.999999999940922d + "'", double17 == 0.999999999940922d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572117d, (double) 1L);
        double double4 = poissonDistributionImpl2.probability(78);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(4.864649182067619E-63d, 1.01377703554215E-7d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.2418737649498176E-173d + "'", double4 == 3.2418737649498176E-173d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1.0f, 35);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029285828261849244d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.25464638004358264d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6321205588285574d + "'", double5 == 0.6321205588285574d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.160702826336122E-32d, 0.36787943195528694d, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5034409561692122E-102d, 0.0d, 30);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(6.305116760146989E-16d, 5.628682978044818E-21d, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.4421702547125802d, (double) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794411711612d, 0.586219203359673d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999545999035672d, 0.6922006275553462d, 73);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(16, 6);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability((int) (short) 1);
        double double6 = poissonDistributionImpl2.probability(52.0d);
        int int8 = poissonDistributionImpl2.getDomainUpperBound((double) 35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.36083758160943114d + "'", double4 == 0.36083758160943114d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.4076594357809174E-73d + "'", double6 == 1.4076594357809174E-73d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((int) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 0);
        double double13 = poissonDistributionImpl3.probability(5);
        double double14 = poissonDistributionImpl3.getMean();
        double double16 = poissonDistributionImpl3.normalApproximateProbability(5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "77) test1934(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0030656620097620196d + "'", double13 == 0.0030656620097620196d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9999966023268753d + "'", double16 == 0.9999966023268753d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.05698471084507295d, 35);
        double double4 = poissonDistributionImpl2.cumulativeProbability(105);
        int int5 = poissonDistributionImpl2.sample();
        int int6 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        double double15 = poissonDistributionImpl3.normalApproximateProbability(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability(38);
        double double20 = poissonDistributionImpl3.cumulativeProbability((-1), (-1));
        double double22 = poissonDistributionImpl3.probability(86);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.691462461274013d + "'", double15 == 0.691462461274013d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.5184628423074624E-131d + "'", double22 == 1.5184628423074624E-131d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (double) (-1), (-1));
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999999994409d + "'", double8 == 0.9999999999994409d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 3.8785349352299523E-28d, 112);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 2147483647);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1);
        double double13 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double16 = poissonDistributionImpl3.cumulativeProbability(37, 37);
        int int18 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int20 = poissonDistributionImpl3.getDomainUpperBound((double) ' ');
        double double22 = poissonDistributionImpl3.cumulativeProbability(24);
        int int24 = poissonDistributionImpl3.getDomainUpperBound(0.9386867598047597d);
        double double26 = poissonDistributionImpl3.cumulativeProbability(3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8160602794142788d + "'", double11 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.9846716899511899d + "'", double26 == 0.9846716899511899d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double18 = poissonDistributionImpl3.getMean();
        double double20 = poissonDistributionImpl3.cumulativeProbability((double) 0L);
        int int22 = poissonDistributionImpl3.getDomainLowerBound(0.0d);
        double double24 = poissonDistributionImpl3.probability(2147483647);
        double double27 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "78) test1940(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6321205588285574d + "'", double20 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability((int) '4');
        double double15 = poissonDistributionImpl3.probability(0.0d);
        int int16 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.560969057281241E-69d + "'", double13 == 4.560969057281241E-69d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.36787944117144233d + "'", double15 == 0.36787944117144233d);
// flaky "79) test1941(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0.0030656618967475464d, (int) '#');
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.getDomainLowerBound((double) 1L);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(38.0d, 30);
        double double4 = poissonDistributionImpl2.probability((double) 100L);
        int[] intArray6 = poissonDistributionImpl2.sample(94);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.2001158042335694E-17d + "'", double4 == 3.2001158042335694E-17d);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.902447399449791E-155d);
        double double4 = poissonDistributionImpl1.cumulativeProbability((double) 0L, (double) 51);
        int int6 = poissonDistributionImpl1.getDomainUpperBound(0.5259020955950889d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 0.14723260883568248d);
        int int4 = poissonDistributionImpl2.getDomainUpperBound(1.1102230246251565E-16d);
        double double6 = poissonDistributionImpl2.probability((double) 3);
        double double8 = poissonDistributionImpl2.probability(3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.007566654960414148d + "'", double6 == 0.007566654960414148d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.609088260248484E-6d, 0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.18393972058572114d, (int) (byte) 1);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 78);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 100L);
        int int11 = poissonDistributionImpl3.getDomainUpperBound((double) 10);
        int[] intArray13 = poissonDistributionImpl3.sample((int) (byte) 10);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 0);
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 3);
        double double19 = poissonDistributionImpl3.probability((double) 5);
        int int21 = poissonDistributionImpl3.inverseCumulativeProbability(3.826311454135856E-163d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.941866060050443E-159d + "'", double9 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
// flaky "80) test1951(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray13, new int[] { 3, 0, 0, 1, 2, 0, 1, 0, 2, 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0030656620097620196d + "'", double19 == 0.0030656620097620196d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.160702826336122E-32d, 0.36787943195528694d, 0);
        int[] intArray5 = poissonDistributionImpl3.sample(80);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (double) ' ', (int) (short) 100);
        double double5 = poissonDistributionImpl3.probability(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.inverseCumulativeProbability(0.36787944117144233d);
        double double10 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.720075976020836E-44d + "'", double5 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(6.305116760146989E-16d);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        int int9 = poissonDistributionImpl3.getDomainLowerBound((double) 10);
        int int10 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.getMean();
        int int13 = poissonDistributionImpl3.getDomainLowerBound(0.18393972058572114d);
        int int14 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "81) test1955(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "24) test1955(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        double double21 = poissonDistributionImpl3.probability(0.0d);
        double double23 = poissonDistributionImpl3.probability((int) (short) 1);
        int[] intArray25 = poissonDistributionImpl3.sample(51);
        int[] intArray27 = poissonDistributionImpl3.sample(15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "25) test1956(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.36787944117144233d + "'", double23 == 0.36787944117144233d);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
// flaky "82) test1956(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray27, new int[] { 2, 0, 2, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 3 });
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(37);
        double double11 = poissonDistributionImpl3.cumulativeProbability(23);
        double double13 = poissonDistributionImpl3.cumulativeProbability(3.57198604755006E-167d);
        int int15 = poissonDistributionImpl3.inverseCumulativeProbability(3.4018914738572114E-169d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl3.cumulativeProbability(91, 31);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6321205588285574d + "'", double13 == 0.6321205588285574d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.getDomainUpperBound((double) 10.0f);
        int[] intArray9 = poissonDistributionImpl3.sample((int) 'a');
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double13 = poissonDistributionImpl3.probability((int) ' ');
        int[] intArray15 = poissonDistributionImpl3.sample(1);
        double double17 = poissonDistributionImpl3.cumulativeProbability((double) (-1L));
        double double19 = poissonDistributionImpl3.cumulativeProbability((double) 100);
        double double21 = poissonDistributionImpl3.probability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = poissonDistributionImpl3.cumulativeProbability(4.2621516760377176E-7d, 4.670902356181524E-139d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.3980856271290693E-36d + "'", double13 == 1.3980856271290693E-36d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky "83) test1958(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.36787944117144233d + "'", double21 == 0.36787944117144233d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 37, (int) (short) 100);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 30, (double) 10000000);
        poissonDistributionImpl2.reseedRandomGenerator((long) 30);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 99);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3678794445618948d, 2.7596379528070493E-10d);
        double double4 = poissonDistributionImpl2.probability(100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7591832341910907E-202d + "'", double4 == 2.7591832341910907E-202d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(35.0d, 0.9386867598047597d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.7591832341910907E-202d, 3.2093315791106567E-171d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 99, (int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(3.2001158042335694E-17d);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.44008422745336273d + "'", double8 == 0.44008422745336273d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((double) 105, (double) 1.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4421702547125802d + "'", double4 == 0.4421702547125802d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.101511794681424E-4d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 100.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double11 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.getMean();
        int int14 = poissonDistributionImpl2.getDomainUpperBound((double) 14);
        double double16 = poissonDistributionImpl2.normalApproximateProbability(31);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.27705656503472276d + "'", double16 == 0.27705656503472276d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainUpperBound(0.025956482467509034d);
        int int13 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
// flaky "84) test1969(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 23);
        double double5 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 78);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.6728134305602215E-44d + "'", double5 == 2.6728134305602215E-44d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        double double3 = poissonDistributionImpl1.probability((int) (short) 10);
        int[] intArray5 = poissonDistributionImpl1.sample(103);
        double double7 = poissonDistributionImpl1.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0398180320558363E-12d + "'", double3 == 1.0398180320558363E-12d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.6102790696677047E-23d + "'", double7 == 2.6102790696677047E-23d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 110, 4.560969057281241E-69d);
        int int4 = poissonDistributionImpl2.getDomainLowerBound((double) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4');
        double double3 = poissonDistributionImpl1.probability((int) (short) 10);
        double double5 = poissonDistributionImpl1.probability((double) 4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl1.inverseCumulativeProbability(97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0398180320558363E-12d + "'", double3 == 1.0398180320558363E-12d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.952232587603118E-18d + "'", double5 == 7.952232587603118E-18d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability(0.2520179332262523d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (short) 100);
        int int8 = poissonDistributionImpl3.sample();
        int int10 = poissonDistributionImpl3.getDomainUpperBound(0.36787944117144233d);
        double double12 = poissonDistributionImpl3.probability(32);
        double double15 = poissonDistributionImpl3.cumulativeProbability(32, 112);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "85) test1975(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.3980856271290693E-36d + "'", double12 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(3.9606298142722176E-69d, 0.017644508717319204d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 100.0f);
        int int12 = poissonDistributionImpl3.getDomainLowerBound((double) 'a');
        int int14 = poissonDistributionImpl3.getDomainLowerBound(0.999999999954943d);
        double double16 = poissonDistributionImpl3.normalApproximateProbability(46);
        int int17 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
// flaky "86) test1977(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 110, 5);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 10);
        int int11 = poissonDistributionImpl3.getDomainLowerBound(0.3678794411711612d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998405164d, 29);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6728134305602215E-44d, 0.691462461274013d, 37);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', (int) (short) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(100);
        int int6 = poissonDistributionImpl2.getDomainUpperBound((double) 10);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.probability(2.4205580623440414E-28d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
// flaky "87) test1982(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        poissonDistributionImpl3.reseedRandomGenerator((long) 99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.560969057281241E-69d, (double) '4', (int) 'a');
        double double6 = poissonDistributionImpl3.cumulativeProbability(0, (int) '4');
        double double7 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.560969057281241E-69d + "'", double7 == 4.560969057281241E-69d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, (double) 14);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.9248445663341396E-10d, 9.999778782798785E-13d, 102);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability((int) ' ');
        double double9 = poissonDistributionImpl3.probability((-1.0d));
        double double11 = poissonDistributionImpl3.probability((double) 86);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.3980856271290693E-36d + "'", double7 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.5184628423074624E-131d + "'", double11 == 1.5184628423074624E-131d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.cumulativeProbability(100);
        double double11 = poissonDistributionImpl3.probability(2147483647);
        double double13 = poissonDistributionImpl3.cumulativeProbability(11);
        double double15 = poissonDistributionImpl3.probability(15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.36787944117144233d + "'", double7 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.999999999231987d + "'", double13 == 0.999999999231987d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.813234320208393E-13d + "'", double15 == 2.813234320208393E-13d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, (int) '4');
        double double4 = poissonDistributionImpl2.probability(0.308537538725987d);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.14723260883568248d);
        double double8 = poissonDistributionImpl2.cumulativeProbability(36);
        double double10 = poissonDistributionImpl2.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.44217025471258026d + "'", double10 == 0.44217025471258026d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        double double7 = poissonDistributionImpl3.cumulativeProbability(2147483647);
        double double9 = poissonDistributionImpl3.probability((double) (short) 1);
        double double11 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double13 = poissonDistributionImpl3.probability(38.0d);
        double double15 = poissonDistributionImpl3.cumulativeProbability((double) (-1));
        int int17 = poissonDistributionImpl3.getDomainLowerBound((double) 21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.033719554105805E-46d + "'", double13 == 7.033719554105805E-46d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.018416977195786E-54d, 80);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f);
        double double11 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.14723260883568248d, 52.0d, 38);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((double) 104);
        int int7 = poissonDistributionImpl3.getDomainUpperBound(0.3525511311226325d);
        int int9 = poissonDistributionImpl3.getDomainUpperBound(0.19699216367798777d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) (byte) 0);
        double double4 = poissonDistributionImpl2.probability(1);
        int int6 = poissonDistributionImpl2.getDomainUpperBound(0.36787944117144256d);
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.3678794411672227d, (double) 186);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484845E-4d + "'", double4 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999546000702375d + "'", double9 == 0.9999546000702375d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 1);
        double double9 = poissonDistributionImpl3.probability((double) 0.0f);
        double double11 = poissonDistributionImpl3.cumulativeProbability(98);
        double double13 = poissonDistributionImpl3.probability(0.9999999907838444d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(intArray7);
// flaky "88) test1995(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray7, new int[] { 2 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.36787944117144233d + "'", double9 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int int5 = poissonDistributionImpl3.getDomainUpperBound((-1.0d));
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(7.214425871271413E-5d);
        int[] intArray9 = poissonDistributionImpl3.sample(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
// flaky "89) test1996(org.apache.commons.math.distribution.RegressionTest3)":         org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1 });
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06680720126885803d, 4.560969057281241E-69d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.6321205588285574d);
        double double6 = poissonDistributionImpl2.cumulativeProbability(3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9353755231673158d + "'", double4 == 0.9353755231673158d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999992131415443d + "'", double6 == 0.9999992131415443d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 110, (double) 33, 24);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 'a', (int) (byte) 100);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.getDomainUpperBound(0.0d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 46);
        double double12 = poissonDistributionImpl3.probability(93);
        int[] intArray14 = poissonDistributionImpl3.sample(88);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.1802228953341904E-145d + "'", double12 == 3.1802228953341904E-145d);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', (double) (short) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 10);
        int int6 = poissonDistributionImpl2.getDomainLowerBound(2.7455062667769425E-9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }
}
