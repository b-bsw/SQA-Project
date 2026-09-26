package org.apache.commons.math3.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;

public class UniformRealDistributionTest {

    private static final double EPS = 1e-12;

    @Test
    public void testDefaultConstructor() {
        UniformRealDistribution d = new UniformRealDistribution();

        assertEquals(0.0, d.getSupportLowerBound(), 0.0);
        assertEquals(1.0, d.getSupportUpperBound(), 0.0);
        assertEquals(0.5, d.getNumericalMean(), EPS);
        assertEquals(1.0 / 12.0, d.getNumericalVariance(), EPS);
        assertEquals(1e-9, d.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testCustomConstructorAndMoments() {
        UniformRealDistribution d = new UniformRealDistribution(-2.0, 4.0, 0.001);

        assertEquals(-2.0, d.getSupportLowerBound(), 0.0);
        assertEquals(4.0, d.getSupportUpperBound(), 0.0);
        assertEquals(1.0, d.getNumericalMean(), EPS);
        assertEquals(3.0, d.getNumericalVariance(), EPS);
        assertEquals(0.001, d.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testInvalidBoundsThrow() {
        try {
            new UniformRealDistribution(1.0, 1.0);
            fail("lower == upper should throw");
        } catch (NumberIsTooLargeException e) {
            // expected
        }

        try {
            new UniformRealDistribution(2.0, 1.0);
            fail("lower > upper should throw");
        } catch (NumberIsTooLargeException e) {
            // expected
        }
    }

    @Test
    public void testDensity() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);

        assertEquals(0.1, d.density(0.0), EPS);
        assertEquals(0.1, d.density(5.0), EPS);
        assertEquals(0.1, d.density(10.0), EPS);
        assertEquals(0.0, d.density(-0.001), 0.0);
        assertEquals(0.0, d.density(10.001), 0.0);
    }

    @Test
    public void testCumulativeProbability() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);

        assertEquals(0.0, d.cumulativeProbability(-1.0), 0.0);
        assertEquals(0.0, d.cumulativeProbability(0.0), 0.0);
        assertEquals(0.25, d.cumulativeProbability(2.5), EPS);
        assertEquals(0.5, d.cumulativeProbability(5.0), EPS);
        assertEquals(1.0, d.cumulativeProbability(10.0), 0.0);
        assertEquals(1.0, d.cumulativeProbability(11.0), 0.0);
    }

    @Test
    public void testSupportProperties() {
        UniformRealDistribution d = new UniformRealDistribution(-1.0, 1.0);

        assertTrue(d.isSupportLowerBoundInclusive());
        assertFalse(d.isSupportUpperBoundInclusive());
        assertTrue(d.isSupportConnected());
    }

    @Test
    public void testSampleUsesRandomGenerator() {
        UniformRealDistribution d =
            new UniformRealDistribution(new FixedRandomGenerator(0.0, 0.25, 0.75), 2.0, 6.0, 1e-9);

        assertEquals(2.0, d.sample(), 0.0);
        assertEquals(3.0, d.sample(), 0.0);
        assertEquals(5.0, d.sample(), 0.0);
    }

    @Test
    public void testSampleWithNullRandomGeneratorFails() {
        UniformRealDistribution d = new UniformRealDistribution(null, 0.0, 1.0, 1e-9);

        try {
            d.sample();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    private static class FixedRandomGenerator implements RandomGenerator {
        private final double[] values;
        private int index;

        FixedRandomGenerator(double... values) {
            this.values = values;
        }

        public void setSeed(int seed) {
        }

        public void setSeed(int[] seed) {
        }

        public void setSeed(long seed) {
        }

        public void nextBytes(byte[] bytes) {
        }

        public int nextInt() {
            return 0;
        }

        public int nextInt(int n) {
            return 0;
        }

        public long nextLong() {
            return 0L;
        }

        public boolean nextBoolean() {
            return false;
        }

        public float nextFloat() {
            return 0.0f;
        }

        public double nextDouble() {
            return values[index++ % values.length];
        }

        public double nextGaussian() {
            return 0.0;
        }
    }
}