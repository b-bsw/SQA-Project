package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;
import static org.junit.Assert.*;

public class BaseSecantSolverTest {

    private static final double EPS = 1e-8;

    private static class TestSecantSolver extends BaseSecantSolver {
        TestSecantSolver(double absoluteAccuracy, BaseSecantSolver.Method method) {
            super(absoluteAccuracy, method);
        }

        TestSecantSolver(double relativeAccuracy, double absoluteAccuracy,
                         double functionValueAccuracy, BaseSecantSolver.Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    private static TestSecantSolver solver(BaseSecantSolver.Method method) {
        return new TestSecantSolver(1e-12, method);
    }

    private static UnivariateRealFunction linear() {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return x - 3.0;
            }
        };
    }

    private static UnivariateRealFunction positiveQuadratic() {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };
    }

    private static UnivariateRealFunction negativeQuadratic() {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return 4.0 - x * x;
            }
        };
    }

    @Test
    public void testExactRootAtMinBoundary() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(3.0,
                s.solve(1000, linear(), 3.0, 10.0, AllowedSolution.ANY_SIDE),
                0.0);
    }

    @Test
    public void testExactRootAtMaxBoundary() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(3.0,
                s.solve(1000, linear(), 0.0, 3.0, AllowedSolution.ANY_SIDE),
                0.0);
    }

    @Test
    public void testExactRootAtSecantIteration() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(3.0,
                s.solve(1000, linear(), 0.0, 10.0, AllowedSolution.ANY_SIDE),
                0.0);
    }

    @Test
    public void testSolveWithStartValueUsesAnySide() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(3.0,
                s.solve(1000, linear(), 0.0, 10.0, 5.0),
                0.0);
    }

    @Test
    public void testRegulaFalsiFindsRoot() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(-2.0,
                s.solve(1000, positiveQuadratic(), -5.0, 0.0, AllowedSolution.ANY_SIDE),
                1e-6);
    }

    @Test
    public void testIllinoisFindsRoot() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.ILLINOIS);
        assertEquals(-2.0,
                s.solve(1000, positiveQuadratic(), -5.0, 0.0, AllowedSolution.ANY_SIDE),
                1e-6);
    }

    @Test
    public void testPegasusFindsRoot() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.PEGASUS);
        assertEquals(-2.0,
                s.solve(1000, positiveQuadratic(), -5.0, 0.0, AllowedSolution.ANY_SIDE),
                1e-6);
    }

    @Test
    public void testAllowedLeftSide() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        double root = s.solve(1000, positiveQuadratic(), 0.0, 5.0, AllowedSolution.LEFT_SIDE);
        assertEquals(2.0, root, 1e-6);
        assertTrue(root <= 2.0 + EPS);
    }

    @Test
    public void testAllowedRightSide() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        double root = s.solve(1000, positiveQuadratic(), -5.0, 0.0, AllowedSolution.RIGHT_SIDE);
        assertEquals(-2.0, root, 1e-6);
        assertTrue(root >= -2.0 - EPS);
    }

    @Test
    public void testAllowedBelowSide() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        double root = s.solve(1000, positiveQuadratic(), 0.0, 5.0, AllowedSolution.BELOW_SIDE);
        assertEquals(2.0, root, 1e-6);
        assertTrue(positiveQuadratic().value(root) <= EPS);
    }

    @Test
    public void testAllowedAboveSide() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        double root = s.solve(1000, negativeQuadratic(), 0.0, 3.0, AllowedSolution.ABOVE_SIDE);
        assertEquals(2.0, root, 1e-6);
        assertTrue(negativeQuadratic().value(root) >= -EPS);
    }

    @Test
    public void testFunctionValueAccuracyStopsAtFirstSecantStep() {
        TestSecantSolver s = new TestSecantSolver(1e-12, 1e-12, 1e100, BaseSecantSolver.Method.REGULA_FALSI);
        assertEquals(-0.8,
                s.solve(100, positiveQuadratic(), -5.0, 0.0, AllowedSolution.ANY_SIDE),
                1e-8);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxEvaluationsExceeded() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        s.solve(1, positiveQuadratic(), -5.0, 0.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NullPointerException.class)
    public void testNullFunctionThrowsNullPointerException() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        s.solve(100, null, -5.0, 0.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = RuntimeException.class)
    public void testNonBracketingThrows() {
        TestSecantSolver s = solver(BaseSecantSolver.Method.REGULA_FALSI);
        s.solve(100, positiveQuadratic(), 0.0, 1.0, AllowedSolution.ANY_SIDE);
    }
}