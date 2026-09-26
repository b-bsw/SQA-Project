package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class CMAESOptimizerTest {

    private static final double EPS = 1e-10;

    private static MultivariateFunction sphere() {
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

    private static RandomGenerator seededRandom() {
        MersenneTwister random = new MersenneTwister();
        random.setSeed(1234);
        return random;
    }

    @Test
    public void testDefaultConstructors() {
        assertNotNull(new CMAESOptimizer());
        assertNotNull(new CMAESOptimizer(5));
        assertNotNull(new CMAESOptimizer(5, new double[] {0.1, 0.2}));
    }

    @Test
    public void testOptimizeSphereConverges() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0, true, 0, 0,
                seededRandom(), false);
        PointValuePair result = optimizer.optimize(20000, sphere(), GoalType.MINIMIZE,
                new double[] {1.0, 1.0});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(2, result.getPoint().length);
        assertTrue(result.getValue() >= 0);
        assertTrue(result.getValue() < 1e-3);
        assertTrue(Math.abs(result.getPoint()[0]) < 0.2);
        assertTrue(Math.abs(result.getPoint()[1]) < 0.2);
    }

    @Test
    public void testMaximizeGoalTypeReturnsMaximizedValue() {
        MultivariateFunction negativeSphere = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double x : point) {
                    sum += x * x;
                }
                return -sum;
            }
        };
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0, false, 0, 0,
                seededRandom(), false);
        PointValuePair result = optimizer.optimize(20000, negativeSphere, GoalType.MAXIMIZE,
                new double[] {1.0, 1.0});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertTrue(result.getValue() > -0.01);
    }

    @Test
    public void testOptimizeWithMaxIterationsZeroReturnsInitialGuess() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 0, 0, true, 0, 0,
                seededRandom(), false);
        PointValuePair result = optimizer.optimize(10, sphere(), GoalType.MINIMIZE,
                new double[] {2.0, -3.0});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(2.0, result.getPoint()[0], EPS);
        assertEquals(-3.0, result.getPoint()[1], EPS);
        assertEquals(13.0, result.getValue(), EPS);
    }

    @Test
    public void testDefaultLambdaAndZeroIterationsReturnsInitialGuess() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, null, 0, 0, true, 0, 0,
                seededRandom(), false);
        PointValuePair result = optimizer.optimize(10, sphere(), GoalType.MINIMIZE,
                new double[] {2.0, -3.0});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(13.0, result.getValue(), EPS);
    }

    @Test
    public void testOptimizeWithAllInfiniteBoundsTreatsAsUnbounded() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 0, 0, true, 0, 0,
                seededRandom(), false);
        PointValuePair result = optimizer.optimize(10, sphere(), GoalType.MINIMIZE,
                new double[] {1.0, 1.0},
                new double[] {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
                new double[] {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY});
        assertNotNull(result);
        assertEquals(2, result.getPoint().length);
        assertEquals(1.0, result.getPoint()[0], EPS);
        assertEquals(1.0, result.getPoint()[1], EPS);
    }

    @Test
    public void testOptimizeWithFiniteBoundsAndRepair() {
        MultivariateFunction shiftedSphere = new MultivariateFunction() {
            public double value(double[] point) {
                final double dx = point[0] - 0.5;
                final double dy = point[1] + 0.5;
                return dx * dx + dy * dy;
            }
        };
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0, true, 0, 0,
                seededRandom(), false);
        PointValuePair result = optimizer.optimize(20000, shiftedSphere, GoalType.MINIMIZE,
                new double[] {0.0, 0.0},
                new double[] {-1.0, -1.0},
                new double[] {1.0, 1.0});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(2, result.getPoint().length);
        assertEquals(0.5, result.getPoint()[0], 0.4);
        assertEquals(-0.5, result.getPoint()[1], 0.4);
    }

    @Test
    public void testDiagonalOnlyOptimizeRuns() {
        CMAESOptimizer optimizer = new CMAESOptimizer(8, null, 5, 0, true, 1, 0,
                seededRandom(), false);
        PointValuePair result = optimizer.optimize(1000, sphere(), GoalType.MINIMIZE,
                new double[] {1.0, 1.0});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(2, result.getPoint().length);
    }

    @Test
    public void testGenerateStatisticsPopulatesHistory() {
        CMAESOptimizer optimizer = new CMAESOptimizer(8, null, 100, 0, true, 0, 0,
                seededRandom(), true);
        assertNotNull(optimizer.getStatisticsSigmaHistory());
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertNotNull(optimizer.getStatisticsMeanHistory());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertNotNull(optimizer.getStatisticsFitnessHistory());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertNotNull(optimizer.getStatisticsDHistory());
        assertEquals(0, optimizer.getStatisticsDHistory().size());

        optimizer.optimize(5000, sphere(), GoalType.MINIMIZE, new double[] {1.0, 1.0});

        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test(expected = NotPositiveException.class)
    public void testNegativeInputSigmaThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5, new double[] {-0.1, 0.1});
        optimizer.optimize(100, sphere(), GoalType.MINIMIZE, new double[] {1.0, 1.0});
    }

    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaWrongLengthThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5, new double[] {0.1});
        optimizer.optimize(100, sphere(), GoalType.MINIMIZE, new double[] {1.0, 1.0});
    }

    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaOutOfRangeThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5, new double[] {2.0, 0.1});
        optimizer.optimize(100, sphere(), GoalType.MINIMIZE,
                new double[] {0.0, 0.0},
                new double[] {0.0, 0.0},
                new double[] {1.0, 1.0});
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testMixedFiniteAndInfiniteBoundsThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null);
        optimizer.optimize(100, sphere(), GoalType.MINIMIZE,
                new double[] {0.0, 0.0},
                new double[] {Double.NEGATIVE_INFINITY, -1.0},
                new double[] {1.0, 1.0});
    }
}