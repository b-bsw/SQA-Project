package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.FastMath;

public class BrentOptimizerTest {

    private static final double EPS = 1e-8;

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorThrowsWhenRelTooSmall() {
        double minRel = 2 * FastMath.ulp(1d);
        new BrentOptimizer(minRel - 1e-16, 1.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorThrowsWhenAbsNonPositive() {
        new BrentOptimizer(1.0, 0.0);
    }

    @Test
    public void testConstructorSuccess() {
        BrentOptimizer opt = new BrentOptimizer(1.0, 1.0);
        assertNotNull(opt);
    }

    @Test
    public void testConstructorWithChecker() {
        ConvergenceChecker<UnivariatePointValuePair> checker = new ConvergenceChecker<UnivariatePointValuePair>() {
            public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                return false;
            }
        };
        BrentOptimizer opt = new BrentOptimizer(1.0, 1.0, checker);
        assertNotNull(opt);
    }

    @Test
    public void testMinimizeQuadratic() {
        BrentOptimizer opt = new BrentOptimizer(1e-12, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result = opt.optimize(1000, f, GoalType.MINIMIZE, -10, 10, 0);
        assertEquals(2.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testMaximizeQuadratic() {
        BrentOptimizer opt = new BrentOptimizer(1e-12, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return -(x - 3.0) * (x - 3.0);
            }
        };
        UnivariatePointValuePair result = opt.optimize(1000, f, GoalType.MAXIMIZE, -10, 10, 5);
        assertEquals(3.0, result.getPoint(), 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testWithConvergenceCheckerStopsEarly() {
        final boolean[] stop = {false};
        ConvergenceChecker<UnivariatePointValuePair> checker = new ConvergenceChecker<UnivariatePointValuePair>() {
            public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                if (iteration > 0) {
                    stop[0] = true;
                    return true;
                }
                return false;
            }
        };
        BrentOptimizer opt = new BrentOptimizer(1e-6, 1e-6, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x;
            }
        };
        UnivariatePointValuePair result = opt.optimize(1000, f, GoalType.MINIMIZE, -10, 10, 1);
        assertNotNull(result);
        assertTrue("Checker should have been invoked and returned true", stop[0]);
    }
}