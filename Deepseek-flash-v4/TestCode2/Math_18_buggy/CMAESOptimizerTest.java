package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Test;

public class CMAESOptimizerTest {

    @Test
    public void testDefaultConstructor() {
        CMAESOptimizer opt = new CMAESOptimizer();
        assertNotNull(opt.getStatisticsSigmaHistory());
        assertNotNull(opt.getStatisticsMeanHistory());
        assertNotNull(opt.getStatisticsFitnessHistory());
        assertNotNull(opt.getStatisticsDHistory());
        assertTrue(opt.getStatisticsSigmaHistory().isEmpty());
        assertTrue(opt.getStatisticsMeanHistory().isEmpty());
        assertTrue(opt.getStatisticsFitnessHistory().isEmpty());
        assertTrue(opt.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testConstructorWithLambdaAndInputSigma() {
        double[] sigma = {0.1, 0.2};
        CMAESOptimizer opt = new CMAESOptimizer(3, sigma);
        assertNotNull(opt);
        assertTrue(opt.getStatisticsSigmaHistory().isEmpty());
        assertTrue(opt.getStatisticsMeanHistory().isEmpty());
        assertTrue(opt.getStatisticsFitnessHistory().isEmpty());
        assertTrue(opt.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimizeSphereNoBounds() {
        CMAESOptimizer opt = new CMAESOptimizer(8, null, 1000, 1e-8,
                true, 0, 0, new MersenneTwister(12345), false, null);
        MultivariateFunction sphere = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += v * v;
                }
                return sum;
            }
        };
        PointValuePair result = opt.optimize(100000, sphere, GoalType.MINIMIZE,
                new double[] {1, 1});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(2, result.getPoint().length);
        assertTrue("Value should be small, but was " + result.getValue(),
                result.getValue() < 1e-2);
    }

    @Test
    public void testOptimizeWithBounds() {
        CMAESOptimizer opt = new CMAESOptimizer(8, null, 1000, 1e-8,
                true, 0, 0, new MersenneTwister(42), false, null);
        MultivariateFunction centered = new MultivariateFunction() {
            public double value(double[] point) {
                double dx = point[0] - 0.5;
                double dy = point[1] - 0.5;
                return dx * dx + dy * dy;
            }
        };
        PointValuePair result = opt.optimize(100000, centered, GoalType.MINIMIZE,
                new double[] {0.5, 0.5}, new double[] {0, 0}, new double[] {1, 1});
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertTrue("Result should be within bounds",
                result.getPoint()[0] >= 0 && result.getPoint()[0] <= 1);
        assertTrue("Result should be within bounds",
                result.getPoint()[1] >= 0 && result.getPoint()[1] <= 1);
        assertTrue("Value should be small, but was " + result.getValue(),
                result.getValue() < 1e-2);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testInfiniteBoundsThrows() {
        CMAESOptimizer opt = new CMAESOptimizer(4, null, 100, 0,
                true, 0, 0, new MersenneTwister(1), false, null);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        opt.optimize(10000, f, GoalType.MINIMIZE, new double[] {0},
                new double[] {0}, new double[] {Double.POSITIVE_INFINITY});
    }

    @Test(expected = NotPositiveException.class)
    public void testNegativeInputSigmaThrows() {
        CMAESOptimizer opt = new CMAESOptimizer(4, new double[] {-1.0}, 100, 0,
                true, 0, 0, new MersenneTwister(1), false, null);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        opt.optimize(10000, f, GoalType.MINIMIZE, new double[] {0});
    }

    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaLengthMismatchThrows() {
        CMAESOptimizer opt = new CMAESOptimizer(4, new double[] {0.1}, 100, 0,
                true, 0, 0, new MersenneTwister(1), false, null);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        opt.optimize(10000, f, GoalType.MINIMIZE, new double[] {0, 0});
    }

    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaOutOfRangeThrows() {
        CMAESOptimizer opt = new CMAESOptimizer(4, new double[] {2.0}, 100, 0,
                true, 0, 0, new MersenneTwister(1), false, null);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        opt.optimize(10000, f, GoalType.MINIMIZE, new double[] {0},
                new double[] {0}, new double[] {1});
    }

    @Test
    public void testGenerateStatistics() {
        CMAESOptimizer opt = new CMAESOptimizer(6, null, 10, 0,
                false, 0, 0, new MersenneTwister(7), true, null);
        MultivariateFunction sphere = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += v * v;
                }
                return sum;
            }
        };
        PointValuePair result = opt.optimize(10000, sphere, GoalType.MINIMIZE,
                new double[] {1, 1});
        assertNotNull(result);
        assertFalse(opt.getStatisticsSigmaHistory().isEmpty());
        assertFalse(opt.getStatisticsFitnessHistory().isEmpty());
        assertFalse(opt.getStatisticsMeanHistory().isEmpty());
        assertFalse(opt.getStatisticsDHistory().isEmpty());
    }
}