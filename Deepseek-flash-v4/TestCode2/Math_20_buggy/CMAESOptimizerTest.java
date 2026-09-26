package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Test;

public class CMAESOptimizerTest {

    private MultivariateFunction sphere() {
        return new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double x : point) {
                    sum += x * x;
                }
                return sum;
            }
        };
    }

    private MultivariateFunction negativeSphere() {
        return new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double x : point) {
                    sum += x * x;
                }
                return -sum;
            }
        };
    }

    @Test
    public void testDefaultConstructorAndHistoryCollections() {
        CMAESOptimizer optimizer = new CMAESOptimizer();

        assertNotNull(optimizer);
        assertNotNull(optimizer.getStatisticsSigmaHistory());
        assertNotNull(optimizer.getStatisticsMeanHistory());
        assertNotNull(optimizer.getStatisticsFitnessHistory());
        assertNotNull(optimizer.getStatisticsDHistory());

        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
    }

    @Test
    public void testOptimizeSphereMinimize() {
        double[] sigma = new double[] { 0.5, 0.5 };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                20, sigma, 10000, 1e-10, true, 0, 0,
                new MersenneTwister(42), false,
                new SimpleValueChecker());

        PointValuePair result = optimizer.optimize(
                100000, sphere(), GoalType.MINIMIZE, new double[] { 3, 3 });

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-6);

        for (double v : result.getPoint()) {
            assertEquals(0.0, v, 1e-5);
        }
    }

    @Test
    public void testOptimizeMaximizeNegativeSphere() {
        double[] sigma = new double[] { 0.5, 0.5 };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                20, sigma, 5000, 1e-10, true, 0, 0,
                new MersenneTwister(43), false,
                new SimpleValueChecker());

        PointValuePair result = optimizer.optimize(
                50000, negativeSphere(), GoalType.MAXIMIZE, new double[] { -2, -2 });

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimizeWithinBounds() {
        double[] lower = { -2, -2 };
        double[] upper = { 2, 2 };
        double[] start = { 1, 1 };
        double[] sigma = { 0.5, 0.5 };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 5000, 1e-10, true, 0, 0,
                new MersenneTwister(44), false,
                new SimpleValueChecker());

        PointValuePair result = optimizer.optimize(
                30000, sphere(), GoalType.MINIMIZE, start, lower, upper);

        assertNotNull(result);

        double[] point = result.getPoint();
        for (int i = 0; i < point.length; i++) {
            assertTrue("point below lower bound", point[i] >= lower[i] - 1e-6);
            assertTrue("point above upper bound", point[i] <= upper[i] + 1e-6);
        }

        assertEquals(0.0, result.getValue(), 1e-4);
    }

    @Test
    public void testNullInputSigmaOffersDefault() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, null, 1000, 1e-10, true, 0, 0,
                new MersenneTwister(45), false,
                new SimpleValueChecker());

        PointValuePair result = optimizer.optimize(
                20000, sphere(), GoalType.MINIMIZE, new double[] { 0.1, 0.1 });

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testGenerateStatisticsPopulatesHistory() {
        double[] sigma = { 0.5, 0.5 };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, sigma, 500, 1e-10, true, 0, 0,
                new MersenneTwister(48), true,
                new SimpleValueChecker());

        PointValuePair result = optimizer.optimize(
                10000, sphere(), GoalType.MINIMIZE, new double[] { 1, 1 });

        assertNotNull(result);
        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
    }

    @Test
    public void testInputSigmaLengthMismatchThrows() {
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(
                    10, new double[] { 0.5 }, 100, 1e-10, true, 0, 0,
                    new MersenneTwister(46), false,
                    new SimpleValueChecker());

            optimizer.optimize(
                    100, sphere(), GoalType.MINIMIZE, new double[] { 1, 1 });

            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        }
    }

    @Test
    public void testNegativeSigmaThrows() {
        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(
                    10, new double[] { -0.1, 0.2 }, 100, 1e-10, true, 0, 0,
                    new MersenneTwister(47), false,
                    new SimpleValueChecker());

            optimizer.optimize(
                    100, sphere(), GoalType.MINIMIZE, new double[] { 0, 0 });

            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testSigmaLargerThanBoundsThrows() {
        double[] lower = { -1, -1 };
        double[] upper = { 1, 1 };

        try {
            CMAESOptimizer optimizer = new CMAESOptimizer(
                    10, new double[] { 3.0, 0.2 }, 100, 1e-10, true, 0, 0,
                    new MersenneTwister(49), false,
                    new SimpleValueChecker());

            optimizer.optimize(
                    100, sphere(), GoalType.MINIMIZE, new double[] { 0, 0 },
                    lower, upper);

            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
    }
}