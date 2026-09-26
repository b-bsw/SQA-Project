package org.apache.commons.math3.distribution;

import org.junit.Test;
import org.junit.Assert;

public class FDistributionTest {

    private static final double DEFAULT_EPSILON = 1e-9;

    @Test
    public void testConstructorValid() {
        FDistribution dist = new FDistribution(1.0, 2.0);
        Assert.assertEquals(1.0, dist.getNumeratorDegreesOfFreedom(), 0.0);
        Assert.assertEquals(2.0, dist.getDenominatorDegreesOfFreedom(), 0.0);
        Assert.assertEquals(FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                            dist.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test(expected = org.apache.commons.math3.exception.NotStrictlyPositiveException.class)
    public void testConstructorNumeratorZero() {
        new FDistribution(0.0, 1.0);
    }

    @Test(expected = org.apache.commons.math3.exception.NotStrictlyPositiveException.class)
    public void testConstructorNumeratorNegative() {
        new FDistribution(-1.0, 1.0);
    }

    @Test(expected = org.apache.commons.math3.exception.NotStrictlyPositiveException.class)
    public void testConstructorDenominatorZero() {
        new FDistribution(1.0, 0.0);
    }

    @Test(expected = org.apache.commons.math3.exception.NotStrictlyPositiveException.class)
    public void testConstructorDenominatorNegative() {
        new FDistribution(1.0, -2.0);
    }

    @Test
    public void testDensityKnownValue() {
        // F(1,1) density at x=1: using formula
        FDistribution dist = new FDistribution(1.0, 1.0);
        double expected = Math.exp(0.5 * Math.log(1) + 0.5 * Math.log(1) - Math.log(1) +
                                   0.5 * Math.log(1) - 0.5 * Math.log(1*1+1) - 0.5 * Math.log(1*1+1) -
                                   org.apache.commons.math3.special.Beta.logBeta(0.5, 0.5));
        // Beta.logBeta(0.5,0.5) = ln(pi) ≈ 1.1447298858494002
        // but using the actual call
        double actual = dist.density(1.0);
        Assert.assertEquals("density(1) for F(1,1)", 0.15915494309189535, actual, 1e-12);
    }

    @Test
    public void testDensityZero() {
        FDistribution dist = new FDistribution(2.0, 3.0);
        double d = dist.density(0.0);
        // x=0 => logx = -Infinity; density should be 0?
        // Actually logx negative infinite, exp will be 0.
        Assert.assertEquals(0.0, d, 0.0);
    }

    @Test
    public void testCumulativeProbabilityXLessOrEqualZero() {
        FDistribution dist = new FDistribution(2.0, 3.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(0.0), 0.0);
        Assert.assertEquals(0.0, dist.cumulativeProbability(-1.0), 0.0);
    }

    @Test
    public void testCumulativeProbabilityPositive() {
        FDistribution dist = new FDistribution(2.0, 3.0);
        double x = 1.0;
        double n = 2.0;
        double m = 3.0;
        double expected = org.apache.commons.math3.special.Beta.regularizedBeta(
            (n * x) / (m + n * x), 0.5 * n, 0.5 * m);
        double actual = dist.cumulativeProbability(x);
        Assert.assertEquals(expected, actual, 1e-12);
    }

    @Test
    public void testGetNumericalMeanDenDFMoreThan2() {
        FDistribution dist = new FDistribution(1.0, 5.0);
        double mean = dist.getNumericalMean();
        Assert.assertEquals(5.0 / (5.0 - 2.0), mean, 1e-12);
    }

    @Test
    public void testGetNumericalMeanDenDFEquals2() {
        FDistribution dist = new FDistribution(1.0, 2.0);
        Assert.assertTrue(Double.isNaN(dist.getNumericalMean()));
    }

    @Test
    public void testGetNumericalMeanDenDFLessThan2() {
        FDistribution dist = new FDistribution(1.0, 1.5);
        Assert.assertTrue(Double.isNaN(dist.getNumericalMean()));
    }

    @Test
    public void testGetNumericalVarianceDenDFGreaterThan4() {
        FDistribution dist = new FDistribution(2.0, 6.0);
        double expected = (2.0 * 6.0 * 6.0 * (2.0 + 6.0 - 2.0)) /
                          (2.0 * (6.0 - 2.0) * (6.0 - 2.0) * (6.0 - 4.0));
        double actual = dist.getNumericalVariance();
        Assert.assertEquals(expected, actual, 1e-12);
    }

    @Test
    public void testGetNumericalVarianceDenDFEquals4() {
        FDistribution dist = new FDistribution(2.0, 4.0);
        Assert.assertTrue(Double.isNaN(dist.getNumericalVariance()));
    }

    @Test
    public void testGetNumericalVarianceDenDFLessThan4() {
        FDistribution dist = new FDistribution(2.0, 3.0);
        Assert.assertTrue(Double.isNaN(dist.getNumericalVariance()));
    }

    @Test
    public void testGetSolverAbsoluteAccuracyCustom() {
        double acc = 1e-5;
        FDistribution dist = new FDistribution(1.0, 1.0, acc);
        Assert.assertEquals(acc, dist.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testSupportLowerBound() {
        FDistribution dist = new FDistribution(1.0, 1.0);
        Assert.assertEquals(0.0, dist.getSupportLowerBound(), 0.0);
    }

    @Test
    public void testSupportUpperBound() {
        FDistribution dist = new FDistribution(1.0, 1.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, dist.getSupportUpperBound(), 0.0);
    }

    @Test
    public void testIsSupportLowerBoundInclusive() {
        FDistribution dist = new FDistribution(1.0, 1.0);
        Assert.assertTrue(dist.isSupportLowerBoundInclusive());
    }

    @Test
    public void testIsSupportUpperBoundInclusive() {
        FDistribution dist = new FDistribution(1.0, 1.0);
        Assert.assertFalse(dist.isSupportUpperBoundInclusive());
    }

    @Test
    public void testIsSupportConnected() {
        FDistribution dist = new FDistribution(1.0, 1.0);
        Assert.assertTrue(dist.isSupportConnected());
    }
}