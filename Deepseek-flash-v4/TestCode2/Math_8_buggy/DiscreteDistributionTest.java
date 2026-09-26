package org.apache.commons.math3.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.Pair;
import org.junit.Test;

public class DiscreteDistributionTest {

    private static Pair<String, Double> pair(String value, double probability) {
        return new Pair<String, Double>(value, probability);
    }

    private static DiscreteDistribution<String> newDistribution(StubRandomGenerator rng,
                                                                 double... probabilities) {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>(probabilities.length);
        for (int i = 0; i < probabilities.length; i++) {
            samples.add(pair("v" + i, probabilities[i]));
        }
        return new DiscreteDistribution<String>(rng, samples);
    }

    @Test
    public void testConstructorWithDefaultRng() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(pair("only", 1.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        assertNotNull(distribution);
        assertEquals(1, distribution.sample(1).length);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorRejectsNegativeProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(pair("a", -0.1));

        new DiscreteDistribution<String>(new StubRandomGenerator(0.0), samples);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorRejectsZeroTotalProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(pair("a", 0.0));

        new DiscreteDistribution<String>(new StubRandomGenerator(0.0), samples);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorRejectsInfiniteProbability() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(pair("a", Double.POSITIVE_INFINITY));

        new DiscreteDistribution<String>(new StubRandomGenerator(0.0), samples);
    }

    @Test
    public void testReseedRandomGeneratorDelegatesToRandomGenerator() {
        StubRandomGenerator rng = new StubRandomGenerator(0.0);
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(pair("a", 1.0));

        DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(rng, samples);
        distribution.reseedRandomGenerator(12345L);

        assertEquals(12345L, rng.getSeed());
    }

    @Test
    public void testProbabilityHandlesNullAndDuplicateValues() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(pair(null, 0.25));
        samples.add(pair("a", 0.25));
        samples.add(pair(null, 0.25));
        samples.add(pair("b", 0.25));

        DiscreteDistribution<String> distribution =
                new DiscreteDistribution<String>(new StubRandomGenerator(0.0), samples);

        assertEquals(0.5, distribution.probability(null), 1e-12);
        assertEquals(0.25, distribution.probability("a"), 1e-12);
        assertEquals(0.25, distribution.probability("b"), 1e-12);
        assertEquals(0.0, distribution.probability("c"), 1e-12);
    }

    @Test
    public void testGetSamplesReturnsNormalizedProbabilities() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(pair("a", 1.0));
        samples.add(pair("b", 3.0));

        DiscreteDistribution<String> distribution =
                new DiscreteDistribution<String>(new StubRandomGenerator(0.0), samples);

        List<Pair<String, Double>> normalized = distribution.getSamples();

        assertEquals(2, normalized.size());
        assertEquals("a", normalized.get(0).getKey());
        assertEquals(0.25, normalized.get(0).getValue(), 1e-12);
        assertEquals("b", normalized.get(1).getKey());
        assertEquals(0.75, normalized.get(1).getValue(), 1e-12);
    }

    @Test
    public void testSampleSelectsSingletonUsingRandomValue() {
        DiscreteDistribution<String> distribution =
                newDistribution(new StubRandomGenerator(0.0, 0.5, 1.0), 0.5, 0.5);

        assertEquals("v0", distribution.sample());
        assertEquals("v1", distribution.sample());
        assertEquals("v1", distribution.sample());
    }

    @Test
    public void testSampleWithPositiveSizeUsesRandomValues() {
        DiscreteDistribution<String> distribution =
                newDistribution(new StubRandomGenerator(0.0, 0.5), 0.5, 0.5);

        String[] result = distribution.sample(2);

        assertEquals(2, result.length);
        assertEquals("v0", result[0]);
        assertEquals("v1", result[1]);
    }

    @Test
    public void testSampleWithNonPositiveSizeThrows() {
        DiscreteDistribution<String> distribution =
                newDistribution(new StubRandomGenerator(0.0), 0.5, 0.5);

        try {
            distribution.sample(0);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            // expected
        }

        try {
            distribution.sample(-1);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException expected) {
            // expected
        }
    }

    private static class StubRandomGenerator implements RandomGenerator {
        private final double[] values;
        private int index;
        private long seed;

        StubRandomGenerator(double... values) {
            this.values = values;
        }

        @Override
        public void setSeed(int seed) {
            this.seed = seed;
        }

        @Override
        public void setSeed(int[] seed) {
            this.seed = 0;
        }

        @Override
        public void setSeed(long seed) {
            this.seed = seed;
        }

        @Override
        public void nextBytes(byte[] bytes) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int nextInt() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int nextInt(int n) {
            throw new UnsupportedOperationException();
        }

        @Override
        public long nextLong() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean nextBoolean() {
            throw new UnsupportedOperationException();
        }

        @Override
        public float nextFloat() {
            throw new UnsupportedOperationException();
        }

        @Override
        public double nextDouble() {
            return values[index++ % values.length];
        }

        @Override
        public double nextGaussian() {
            throw new UnsupportedOperationException();
        }

        long getSeed() {
            return seed;
        }
    }
}