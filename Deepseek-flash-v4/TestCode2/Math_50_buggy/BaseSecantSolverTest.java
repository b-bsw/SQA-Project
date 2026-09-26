package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BaseSecantSolverTest {

    private static final class TestSolver extends BaseSecantSolver {
        TestSolver(BaseSecantSolver.Method method) {
            super(1e-6, method);
        }

        TestSolver(double relativeAccuracy, double absoluteAccuracy,
                   double functionValueAccuracy, BaseSecantSolver.Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    private static final class LinearFunction implements UnivariateRealFunction {
        private final double root;

        LinearFunction(double root) {
            this.root = root;
        }

        public double value(double x) {
            return x - root;
        }
    }

    private static final class QuadraticFunction implements UnivariateRealFunction {
        public double value(double x) {
            return x * x - 2.0;
        }
    }

    private static final class NonBracketingFunction implements UnivariateRealFunction {
        public double value(double x) {
            return x * x + 1.0;
        }
    }

    @Test
    public void testExactRootAtLowerBound() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new LinearFunction(2.0);
        assertEquals(2.0, solver.solve(100, f, 2.0, 3.0, AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testExactRootAtUpperBound() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.PEGASUS);
        UnivariateRealFunction f = new LinearFunction(2.0);
        assertEquals(2.0, solver.solve(100, f, 0.0, 2.0, AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testExactRootInFirstIteration() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.REGULA_FALSI);
        UnivariateRealFunction f = new LinearFunction(1.5);
        assertEquals(1.5, solver.solve(100, f, 0.0, 3.0, AllowedSolution.ANY_SIDE), 0.0);
    }

    @Test
    public void testSolveWithDefaultAllowedSolution() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.PEGASUS);
        UnivariateRealFunction f = new QuadraticFunction();
        double result = solver.solve(1000, f, 0.0, 2.0, 1.0);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testRegulaFalsiFindsRoot() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.REGULA_FALSI);
        UnivariateRealFunction f = new QuadraticFunction();
        double result = solver.solve(1000, f, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testPegasusAllowedSolutionRightSide() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.PEGASUS);
        UnivariateRealFunction f = new QuadraticFunction();
        double result = solver.solve(1000, f, 0.0, 2.0, AllowedSolution.RIGHT_SIDE);
        assertTrue(result > Math.sqrt(2.0));
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testIllinoisAllowedSolutions() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new QuadraticFunction();

        double left = solver.solve(1000, f, 0.0, 2.0, AllowedSolution.LEFT_SIDE);
        assertTrue(left < Math.sqrt(2.0));
        assertEquals(Math.sqrt(2.0), left, 1e-6);

        double right = solver.solve(1000, f, 0.0, 2.0, AllowedSolution.RIGHT_SIDE);
        assertTrue(right > Math.sqrt(2.0));
        assertEquals(Math.sqrt(2.0), right, 1e-6);

        double below = solver.solve(1000, f, 0.0, 2.0, AllowedSolution.BELOW_SIDE);
        assertTrue(f.value(below) <= 0.0);
        assertEquals(Math.sqrt(2.0), below, 1e-6);

        double above = solver.solve(1000, f, 0.0, 2.0, AllowedSolution.ABOVE_SIDE);
        assertTrue(f.value(above) >= 0.0);
        assertEquals(Math.sqrt(2.0), above, 1e-6);
    }

    @Test
    public void testFunctionValueAccuracyStopsAtSmallFunctionValue() {
        TestSolver solver = new TestSolver(1e-12, 1e-12, 0.001, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new QuadraticFunction();
        double result = solver.solve(100, f, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertTrue(Math.abs(f.value(result)) <= 0.001);
        assertEquals(Math.sqrt(2.0), result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonBracketingThrowsException() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, new NonBracketingFunction(), -1.0, 1.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NullArgumentException.class)
    public void testNullFunctionThrowsException() {
        TestSolver solver = new TestSolver(BaseSecantSolver.Method.REGULA_FALSI);
        solver.solve(100, null, 0.0, 2.0, AllowedSolution.ANY_SIDE);
    }
}