package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;

public class BaseSecantSolverTest {

    private static final double SQRT2 = Math.sqrt(2.0);
    private static final double ROOT_TOL = 1e-6;

    private static class TestSolver extends BaseSecantSolver {
        TestSolver(double absoluteAccuracy, BaseSecantSolver.Method method) {
            super(absoluteAccuracy, method);
        }
    }

    private TestSolver newSolver(BaseSecantSolver.Method method) {
        return new TestSolver(1e-10, method);
    }

    private UnivariateRealFunction squareMinusTwo() {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2.0;
            }
        };
    }

    @Test
    public void testLinearFunctionFindsExactRoot() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        TestSolver solver = newSolver(BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, f, -1.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 0.0);
    }

    @Test
    public void testRootAtLowerBound() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        TestSolver solver = newSolver(BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, f, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testRootAtUpperBound() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        TestSolver solver = newSolver(BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, f, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 0.0);
    }

    @Test
    public void testRegulaFalsiMethod() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, squareMinusTwo(), 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test
    public void testIllinoisMethod() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.ILLINOIS);
        double result = solver.solve(100, squareMinusTwo(), 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test
    public void testPegasusMethod() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(100, squareMinusTwo(), 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test
    public void testSolveWithStartValue() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.REGULA_FALSI);
        double result = solver.solve(100, squareMinusTwo(), 0.0, 2.0, 1.5);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test
    public void testAllowedSolutionBelowSide() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = squareMinusTwo();
        double result = solver.solve(100, f, 0.0, 2.0, AllowedSolution.BELOW_SIDE);
        assertTrue("BELOW_SIDE result should have non-positive f", f.value(result) <= 0.0);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test
    public void testAllowedSolutionAboveSide() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = squareMinusTwo();
        double result = solver.solve(100, f, 0.0, 2.0, AllowedSolution.ABOVE_SIDE);
        assertTrue("ABOVE_SIDE result should have non-negative f", f.value(result) >= 0.0);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test
    public void testAllowedSolutionLeftSide() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(100, squareMinusTwo(), 0.0, 2.0, AllowedSolution.LEFT_SIDE);
        assertTrue("LEFT_SIDE result should not be right of root", result <= SQRT2 + 1e-9);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test
    public void testAllowedSolutionRightSide() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.PEGASUS);
        double result = solver.solve(100, squareMinusTwo(), 0.0, 2.0, AllowedSolution.RIGHT_SIDE);
        assertTrue("RIGHT_SIDE result should not be left of root", result >= SQRT2 - 1e-9);
        assertEquals(SQRT2, result, ROOT_TOL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonBracketingIntervalThrows() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(100, squareMinusTwo(), 0.0, 1.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullFunctionThrows() {
        TestSolver solver = newSolver(BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(100, null, 0.0, 1.0, AllowedSolution.ANY_SIDE);
    }
}