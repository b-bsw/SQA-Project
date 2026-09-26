package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;

public class CMAESOptimizerTest {

    @Test
    public void testSigmaNormalAndClone() {
        double[] input = {0.5, 1.5};
        Sigma sigma = new Sigma(input);

        assertArrayEquals(new double[]{0.5, 1.5}, sigma.getSigma(), 0.0);
        assertNotSame(input, sigma.getSigma());

        input[0] = 99;
        assertArrayEquals(new double[]{0.5, 1.5}, sigma.getSigma(), 0.0);

        double[] internal = sigma.getSigma();
        internal[1] = 42;
        assertArrayEquals(new double[]{0.5, 1.5}, sigma.getSigma(), 0.0);

        assertArrayEquals(new double[0], new Sigma(new double[0]).getSigma(), 0.0);
    }

    @Test(expected = NotPositiveException.class)
    public void testSigmaNegativeThrows() {
        new Sigma(new double[]{1.0, -1e-6});
    }

    @Test
    public void testPopulationSizePositive() {
        assertEquals(1, new PopulationSize(1).getPopulationSize());
        assertEquals(10, new PopulationSize(10).getPopulationSize());
    }

    @Test
    public void testPopulationSizeNonPositiveThrows() {
        try {
            new PopulationSize(0);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException e) {
            // Expected.
        }
        try {
            new PopulationSize(-1);
            fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException e) {
            // Expected.
        }
    }

    @Test
    public void testStatisticsInitiallyEmpty() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, 0, false, 0, 0,
                new FixedRandom(0.5), false, null);

        assertNotNull(optimizer.getStatisticsSigmaHistory());
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testOptimizeZeroIterations() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, 0, false, 0, 0,
                new FixedRandom(0.5), true, null);

        PointValuePair result = optimizer.optimize(
                squareObjective(),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0}),
                new SimpleBounds(new double[]{-5.0}, new double[]{5.0}),
                new MaxEval(1000),
                new PopulationSize(4),
                new Sigma(new double[]{10.0}));

        assertNotNull(result);
        assertEquals(1.0, result.getKey()[0], 0.0);
        assertEquals(1.0, result.getValue(), 0.0);
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
    }

    @Test(expected = DimensionMismatchException.class)
    public void testOptimizeSigmaDimensionMismatch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, 0, false, 0, 0,
                new FixedRandom(0.5), false, null);

        optimizer.optimize(
                squareObjective(),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, 2.0}),
                new MaxEval(1000),
                new PopulationSize(4),
                new Sigma(new double[]{1.0}));
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimizeSigmaOutOfRange() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, 0, false, 0, 0,
                new FixedRandom(0.5), false, null);

        optimizer.optimize(
                squareObjective(),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{5.0}),
                new SimpleBounds(new double[]{0.0}, new double[]{10.0}),
                new MaxEval(1000),
                new PopulationSize(4),
                new Sigma(new double[]{20.0}));
    }

    @Test
    public void testOptimizeOneIterationFullCovariance() {
        CMAESOptimizer optimizer = new CMAESOptimizer(1, 0, false, 0, 0,
                new FixedRandom(0.5), true, null);

        PointValuePair result = optimizeOnce(optimizer);

        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
        assertFalse(Double.isInfinite(result.getValue()));
        assertEquals(1, optimizer.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testOptimizeOneIterationDiagonalOnly() {
        CMAESOptimizer optimizer = new CMAESOptimizer(1, 0, false, 1, 0,
                new FixedRandom(0.5), true, null);

        PointValuePair result = optimizeOnce(optimizer);

        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
        assertFalse(Double.isInfinite(result.getValue()));
        assertEquals(1, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(1, optimizer.getStatisticsMeanHistory().size());
        assertEquals(1, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(1, optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testOptimizeOneIterationActiveCma() {
        CMAESOptimizer optimizer = new CMAESOptimizer(1, 0, true, 0, 0,
                new FixedRandom(0.5), true, null);

        PointValuePair result = optimizeOnce(optimizer);

        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
        assertFalse(Double.isInfinite(result.getValue()));
        assertEquals(1, optimizer.getStatisticsSigmaHistory().size());
    }

    private static PointValuePair optimizeOnce(CMAESOptimizer optimizer) {
        return optimizer.optimize(
                squareObjective(),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0}),
                new SimpleBounds(new double[]{-5.0}, new double[]{5.0}),
                new MaxEval(1000),
                new PopulationSize(4),
                new Sigma(new double[]{1.0}));
    }

    private static ObjectiveFunction squareObjective() {
        return new ObjectiveFunction(new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        });
    }

    private static class FixedRandom implements RandomGenerator {
        private final double value;

        FixedRandom(double value) {
            this.value = value;
        }

        @Override
        public void setSeed(int seed) {
        }

        @Override
        public void setSeed(int[] seed) {
        }

        @Override
        public void setSeed(long seed) {
        }

        @Override
        public void nextBytes(byte[] bytes) {
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = 0;
            }
        }

        @Override
        public int nextInt() {
            return 1;
        }

        @Override
        public int nextInt(int n) {
            return 0;
        }

        @Override
        public long nextLong() {
            return 1L;
        }

        @Override
        public boolean nextBoolean() {
            return true;
        }

        @Override
        public float nextFloat() {
            return (float) value;
        }

        @Override
        public double nextDouble() {
            return value;
        }

        @Override
        public double nextGaussian() {
            return value;
        }
    }
}