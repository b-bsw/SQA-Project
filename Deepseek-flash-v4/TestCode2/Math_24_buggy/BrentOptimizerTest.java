package org.apache.commons.math3.optimization.univariate;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BrentOptimizerTest {

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRejectsTooSmallRelativeThreshold() {
        new BrentOptimizer(0.0, 1e-8);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorRejectsNonPositiveAbsoluteThreshold() {
        new BrentOptimizer(1e-8, 0.0);
    }

    @Test
    public void testConstructorAcceptsBoundaryRelativeThreshold() {
        double minRel = 2.0 * Math.ulp(1.0);
        assertNotNull(new BrentOptimizer(minRel, 1e-8));
    }

    @Test
    public void testMinimizeQuadratic() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8, null);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x;
            }
        };

        UnivariatePointValuePair result =
                optimizer.optimize(100, f, GoalType.MINIMIZE, -1.0, 1.0, 0.5);

        assertNotNull(result);
        assertEquals(0.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
        assertTrue(optimizer.getEvaluations() > 2);
    }

    @Test
    public void testMaximizeQuadratic() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return -(x - 1.0) * (x - 1.0) + 3.0;
            }
        };

        UnivariatePointValuePair result =
                optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.0, 2.0, 0.5);

        assertNotNull(result);
        assertEquals(1.0, result.getPoint(), 1e-6);
        assertEquals(3.0, result.getValue(), 1e-6);
    }

    @Test
    public void testImmediateTerminationZeroIterations() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x;
            }
        };

        UnivariatePointValuePair result =
                optimizer.optimize(100, f, GoalType.MINIMIZE, -1e-12, 1e-12, 0.0);

        assertNotNull(result);
        assertEquals(0.0, result.getPoint(), 1e-15);
        assertEquals(0.0, result.getValue(), 1e-15);
        assertEquals(1, optimizer.getEvaluations());
    }

    private static class CountingChecker
            implements ConvergenceChecker<UnivariatePointValuePair> {
        private int calls = 0;

        public boolean converged(int iteration,
                                 UnivariatePointValuePair previous,
                                 UnivariatePointValuePair current) {
            ++calls;
            return true;
        }

        public int getCalls() {
            return calls;
        }
    }

    @Test
    public void testUserDefinedConvergenceCheckerReturnsBestPoint() {
        CountingChecker checker = new CountingChecker();
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return 2.0 - x;
            }
        };

        UnivariatePointValuePair result =
                optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 2.0, 1.0);

        assertNotNull(result);
        assertEquals(1, checker.getCalls());
        assertEquals(2, optimizer.getEvaluations());
        assertEquals(1.0, result.getPoint(), 1e-6);
        assertEquals(1.0, result.getValue(), 1e-6);
    }
}