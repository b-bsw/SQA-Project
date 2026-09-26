package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner;

public class NonLinearConjugateGradientOptimizerTest {

    private static final ConvergenceChecker<PointValuePair> CHECKER =
        new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration,
                                     PointValuePair previous,
                                     PointValuePair current) {
                final double prev = previous.getValue();
                final double curr = current.getValue();
                return Math.abs(prev - curr) <= 1e-10 * Math.max(1.0, Math.max(Math.abs(prev), Math.abs(curr)));
            }
        };

    @Test
    public void testFormulaEnum() {
        assertEquals(Formula.FLETCHER_REEVES, Formula.valueOf("FLETCHER_REEVES"));
        assertEquals(Formula.POLAK_RIBIERE, Formula.valueOf("POLAK_RIBIERE"));
        assertEquals(2, Formula.values().length);
    }

    @Test
    public void testBracketingStep() {
        final BracketingStep step = new BracketingStep(1.25);
        assertEquals(1.25, step.getBracketingStep(), 0.0);
    }

    @Test
    public void testIdentityPreconditioner() {
        final double[] variables = { 1, -2 };
        final double[] r = { 3, 4 };

        final double[] result = new IdentityPreconditioner().precondition(variables, r);

        assertNotSame(r, result);
        assertArrayEquals(r, result, 0.0);
    }

    @Test
    public void testConstructors() {
        NonLinearConjugateGradientOptimizer opt =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, CHECKER);
        assertNotNull(opt);

        opt = new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, CHECKER, new BrentSolver());
        assertNotNull(opt);

        opt = new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, CHECKER,
                                                      new BrentSolver(),
                                                      new IdentityPreconditioner());
        assertNotNull(opt);
    }

    @Test
    public void testOptimizeFletcherReevesMinimize() {
        assertQuadraticOptimum(optimize(Formula.FLETCHER_REEVES, 1, false), -1.0);
    }

    @Test
    public void testOptimizePolakRibiereMinimize() {
        assertQuadraticOptimum(optimize(Formula.POLAK_RIBIERE, 1, false), -1.0);
    }

    @Test
    public void testOptimizeFletcherReevesMaximize() {
        assertQuadraticOptimum(optimize(Formula.FLETCHER_REEVES, 1, true), 1.0);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimizeWithBoundsThrows() {
        final NonLinearConjugateGradientOptimizer opt =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, CHECKER);

        opt.optimize(new MaxEval(100),
                     GoalType.MINIMIZE,
                     new InitialGuess(new double[] { 0 }),
                     new ObjectiveFunction(new MultivariateFunction() {
                         public double value(double[] p) {
                             return p[0] * p[0];
                         }
                     }),
                     new ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                         public double[] value(double[] p) {
                             return new double[] { 2 * p[0] };
                         }
                     }),
                     new SimpleBounds(new double[] { -1 },
                                      new double[] { 1 }));
    }

    private PointValuePair optimize(final Formula formula, final double step,
                                    final boolean maximize) {
        final double sign = maximize ? -1.0 : 1.0;

        final NonLinearConjugateGradientOptimizer opt =
            new NonLinearConjugateGradientOptimizer(formula, CHECKER, new BrentSolver(),
                                                    new IdentityPreconditioner());

        return opt.optimize(new MaxEval(5000),
                            maximize ? GoalType.MAXIMIZE : GoalType.MINIMIZE,
                            new InitialGuess(new double[] { 1, 1 }),
                            new ObjectiveFunction(new MultivariateFunction() {
                                public double value(double[] p) {
                                    return sign * (p[0] * p[0] + p[1] * p[1]
                                                   + p[0] * p[1] - p[0] - 2 * p[1]);
                                }
                            }),
                            new ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                                public double[] value(double[] p) {
                                    return new double[] {
                                        sign * (2 * p[0] + p[1] - 1),
                                        sign * (p[0] + 2 * p[1] - 2)
                                    };
                                }
                            }),
                            new BracketingStep(step));
    }

    private static void assertQuadraticOptimum(PointValuePair result, double value) {
        assertNotNull(result);
        assertEquals(0.0, result.getPoint()[0], 1e-4);
        assertEquals(1.0, result.getPoint()[1], 1e-4);
        assertEquals(value, result.getValue(), 1e-4);
    }
}