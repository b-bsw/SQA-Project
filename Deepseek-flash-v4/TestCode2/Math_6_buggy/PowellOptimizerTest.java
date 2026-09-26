package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;

public class PowellOptimizerTest {

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRejectsTooSmallRelativeThreshold() {
        new PowellOptimizer(0.0, 1e-8);
    }

    @Test
    public void testConstructorAcceptsMinimumRelativeThreshold() {
        assertNotNull(new PowellOptimizer(2 * Math.ulp(1d), 1e-8));
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorRejectsNonPositiveAbsoluteThreshold() {
        new PowellOptimizer(0.1, 0.0);
    }

    @Test
    public void testConstructorAllowsNullConvergenceChecker() {
        assertNotNull(new PowellOptimizer(0.1, 1e-8, null));
    }

    @Test
    public void testOptimizeMinimizesQuadraticFunction() {
        PowellOptimizer optimizer = new PowellOptimizer(0.05, 1e-8);
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0] * point[0] + point[1] * point[1];
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1, 1 }));

        assertEquals(0.0, result.getPoint()[0], 1e-2);
        assertEquals(0.0, result.getPoint()[1], 1e-2);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testOptimizeMaximizesNegativeQuadraticFunction() {
        PowellOptimizer optimizer = new PowellOptimizer(0.05, 1e-8);
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return -point[0] * point[0] - point[1] * point[1];
                }
            }),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[] { 1, 1 }));

        assertEquals(0.0, result.getPoint()[0], 1e-2);
        assertEquals(0.0, result.getPoint()[1], 1e-2);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimizeRejectsBoundedProblem() {
        PowellOptimizer optimizer = new PowellOptimizer(0.05, 1e-8);
        optimizer.optimize(
            new MaxEval(100),
            new ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0] * point[0];
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0 }),
            new SimpleBounds(new double[] { -1 }, new double[] { 1 }));
    }

    @Test
    public void testOptimizeWithEmptyStartPoint() {
        PowellOptimizer optimizer = new PowellOptimizer(0.05, 1e-8);
        PointValuePair result = optimizer.optimize(
            new MaxEval(100),
            new ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return 0.0;
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(new double[0]));

        assertEquals(0, result.getPoint().length);
        assertEquals(0.0, result.getValue(), 0.0);
    }

    @Test
    public void testUserDefinedConvergenceCheckerIsConsulted() {
        final boolean[] called = new boolean[1];
        ConvergenceChecker<PointValuePair> checker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                called[0] = true;
                return false;
            }
        };

        PowellOptimizer optimizer = new PowellOptimizer(1e-12, 1e-14, checker);
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] point) {
                    return point[0] * point[0];
                }
            }),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1 }));

        assertTrue("custom checker should be called", called[0]);
        assertEquals(0.0, result.getPoint()[0], 1e-3);
    }
}