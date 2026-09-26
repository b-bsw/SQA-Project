package org.apache.commons.math3.distribution;

import org.junit.Test;
import org.junit.Assert;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.random.Well19937c;

public class MultivariateNormalDistributionTest {
    private static final double EPS = 1e-10;

    @Test
    public void testConstructorValid1D() {
        double[] means = {0.0};
        double[][] cov = {{1.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        Assert.assertNotNull(dist);
        Assert.assertEquals(1, dist.getDimension());
        Assert.assertArrayEquals(new double[]{0.0}, dist.getMeans(), EPS);
    }

    @Test
    public void testConstructorValid2D() {
        double[] means = {1.0, -2.0};
        double[][] cov = {{2.0, 0.5}, {0.5, 1.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        Assert.assertEquals(2, dist.getDimension());
        Assert.assertArrayEquals(new double[]{1.0, -2.0}, dist.getMeans(), EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructorDimensionMismatchLength() {
        new MultivariateNormalDistribution(new double[]{1.0}, new double[][]{{1.0, 0.0}, {0.0, 1.0}});
    }

    @Test(expected = DimensionMismatchException.class)
    public void testConstructorDimensionMismatchInner() {
        new MultivariateNormalDistribution(new double[]{1.0, 2.0}, new double[][]{{1.0, 0.0}, {0.0}});
    }

    @Test(expected = SingularMatrixException.class)
    public void testConstructorSingularMatrix() {
        new MultivariateNormalDistribution(new double[]{0.0, 0.0}, new double[][]{{1.0, 1.0}, {1.0, 1.0}});
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void testConstructorNonPositiveDefinite() {
        new MultivariateNormalDistribution(new double[]{0.0, 0.0}, new double[][]{{1.0, 2.0}, {2.0, 1.0}});
    }

    @Test
    public void testDensity1D() {
        double[] means = {0.0};
        double[][] cov = {{1.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        double density = dist.density(new double[]{0.0});
        double expected = 1.0 / Math.sqrt(2 * Math.PI);
        Assert.assertEquals("1D density at mean", expected, density, EPS);
    }

    @Test
    public void testDensity2D() {
        double[] means = {0.0, 0.0};
        double[][] cov = {{1.0, 0.0}, {0.0, 1.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        double density = dist.density(new double[]{0.0, 0.0});
        double expected = 1.0 / (2 * Math.PI);
        Assert.assertEquals("2D density at mean", expected, density, EPS);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDensityDimensionMismatch() {
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(new double[]{0.0}, new double[][]{{1.0}});
        dist.density(new double[]{0.0, 0.0});
    }

    @Test
    public void testGetStandardDeviations() {
        double[] means = {0.0, 0.0};
        double[][] cov = {{4.0, 0.0}, {0.0, 9.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        double[] std = dist.getStandardDeviations();
        Assert.assertArrayEquals(new double[]{2.0, 3.0}, std, EPS);
    }

    @Test
    public void testGetMeansCopy() {
        double[] means = {1.0, 2.0};
        double[][] cov = {{1.0, 0.0}, {0.0, 1.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        double[] returned = dist.getMeans();
        Assert.assertArrayEquals(new double[]{1.0, 2.0}, returned, EPS);
        returned[0] = 999.0;
        double[] again = dist.getMeans();
        Assert.assertArrayEquals(new double[]{1.0, 2.0}, again, EPS);
    }

    @Test
    public void testGetCovariancesCopy() {
        double[] means = {0.0, 0.0};
        double[][] cov = {{2.0, 0.5}, {0.5, 1.0}};
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(means, cov);
        RealMatrix mat = dist.getCovariances();
        Assert.assertEquals(2.0, mat.getEntry(0, 0), EPS);
        mat.setEntry(0, 0, 100.0);
        RealMatrix mat2 = dist.getCovariances();
        Assert.assertEquals(2.0, mat2.getEntry(0, 0), EPS);
    }

    @Test
    public void testSample() {
        double[] means = {1.0, 2.0};
        double[][] cov = {{1.0, 0.5}, {0.5, 1.0}};
        Well19937c rng = new Well19937c(42L);
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(rng, means, cov);
        double[] sample = dist.sample();
        Assert.assertNotNull(sample);
        Assert.assertEquals(2, sample.length);
    }

    @Test
    public void testSampleMultiple() {
        double[] means = {0.0, 0.0};
        double[][] cov = {{1.0, 0.0}, {0.0, 1.0}};
        Well19937c rng = new Well19937c(123L);
        MultivariateNormalDistribution dist = new MultivariateNormalDistribution(rng, means, cov);
        double[] sample1 = dist.sample();
        double[] sample2 = dist.sample();
        Assert.assertNotNull(sample1);
        Assert.assertNotNull(sample2);
        Assert.assertEquals(2, sample1.length);
        Assert.assertEquals(2, sample2.length);
    }
}