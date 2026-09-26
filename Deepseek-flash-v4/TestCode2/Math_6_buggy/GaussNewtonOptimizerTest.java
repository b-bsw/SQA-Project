package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;

@SuppressWarnings("deprecation")
public class GaussNewtonOptimizerTest {

    private static ConvergenceChecker<PointVectorValuePair> eventualChecker() {
        return new ConvergenceChecker<PointVectorValuePair>() {
            private int calls = 0;
            @Override
            public boolean converged(int iteration,
                                     PointVectorValuePair previous,
                                     PointVectorValuePair current) {
                return ++calls > 1;
            }
        };
    }

    private static void setLinearModel(GaussNewtonOptimizer optimizer) {
        optimizer.setModelFunction(new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] { 2 * point[0] };
            }
        });
        optimizer.setModelFunctionJacobian(new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][] { { 2d } };
            }
        });
    }

    private static void setSingularModel(GaussNewtonOptimizer optimizer) {
        optimizer.setModelFunction(new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                return new double[] { point[0] + point[1] };
            }
        });
        optimizer.setModelFunctionJacobian(new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                return new double[][] { { 1d, 1d } };
            }
        });
    }

    @Test
    public void testOptimizeWithDefaultLUSolver() {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(eventualChecker());
        setLinearModel(optimizer);

        PointVectorValuePair result = optimizer.optimize(
                new Target(new double[] { 4d }),
                new Weight(new BlockRealMatrix(new double[][] { { 1d } })),
                new InitialGuess(new double[] { 1d }));

        assertEquals(2.0, result.getPoint()[0], 1e-12);
        assertEquals(4.0, result.getValue()[0], 1e-12);
    }

    @Test
    public void testOptimizeWithQRSolver() {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(false, eventualChecker());
        setLinearModel(optimizer);

        PointVectorValuePair result = optimizer.optimize(
                new Target(new double[] { 4d }),
                new Weight(new BlockRealMatrix(new double[][] { { 1d } })),
                new InitialGuess(new double[] { 1d }));

        assertEquals(2.0, result.getPoint()[0], 1e-12);
        assertEquals(4.0, result.getValue()[0], 1e-12);
    }

    @Test(expected = NullArgumentException.class)
    public void testNullCheckerThrowsNullArgumentException() {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true, null);
        setLinearModel(optimizer);

        optimizer.optimize(
                new Target(new double[] { 4d }),
                new Weight(new BlockRealMatrix(new double[][] { { 1d } })),
                new InitialGuess(new double[] { 1d }));
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testBoundsAreRejected() {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(eventualChecker());
        setLinearModel(optimizer);

        optimizer.optimize(
                new Target(new double[] { 4d }),
                new Weight(new BlockRealMatrix(new double[][] { { 1d } })),
                new InitialGuess(new double[] { 1d }),
                new SimpleBounds(new double[] { 0d }, new double[] { 1d }));
    }

    @Test(expected = ConvergenceException.class)
    public void testSingularNormalEquationsThrowsConvergenceException() {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(eventualChecker());
        setSingularModel(optimizer);

        optimizer.optimize(
                new Target(new double[] { 1d }),
                new Weight(new BlockRealMatrix(new double[][] { { 1d } })),
                new InitialGuess(new double[] { 0d, 0d }));
    }
}