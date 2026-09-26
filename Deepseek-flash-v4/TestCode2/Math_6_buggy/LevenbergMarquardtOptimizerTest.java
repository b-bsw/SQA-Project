package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.util.Precision;
import org.junit.Test;

public class LevenbergMarquardtOptimizerTest {

    private static MultivariateVectorFunction linearModel(final double coefficient) {
        return new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { coefficient * point[0] };
            }
        };
    }

    private static MultivariateMatrixFunction linearJacobian(final double coefficient) {
        return new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { coefficient } };
            }
        };
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(new LevenbergMarquardtOptimizer());
    }

    @Test
    public void testConstructorWithChecker() {
        ConvergenceChecker<PointVectorValuePair> checker = new ConvergenceChecker<PointVectorValuePair>() {
            public boolean converged(int iteration,
                                     PointVectorValuePair previous,
                                     PointVectorValuePair current) {
                return iteration >= 10;
            }
        };

        assertNotNull(new LevenbergMarquardtOptimizer(checker));
        assertNotNull(new LevenbergMarquardtOptimizer(100, checker,
                                                      1e-10, 1e-10, 1e-10,
                                                      Precision.SAFE_MIN));
    }

    @Test
    public void testToleranceConstructors() {
        assertNotNull(new LevenbergMarquardtOptimizer(1e-10, 1e-10, 1e-10));
        assertNotNull(new LevenbergMarquardtOptimizer(100, 1e-10, 1e-10,
                                                      1e-10, Precision.SAFE_MIN));
    }

    @Test
    public void testNullCheckerConstructor() {
        assertNotNull(new LevenbergMarquardtOptimizer((ConvergenceChecker<PointVectorValuePair>) null));
    }

    @Test
    public void testLinearLeastSquares() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        PointVectorValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new MaxIter(100),
            new InitialGuess(new double[] { 1.0 }),
            new Target(new double[] { 4.0 }),
            new Weight(new double[] { 1.0 }),
            new ModelFunction(linearModel(2.0)),
            new ModelFunctionJacobian(linearJacobian(2.0)));

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 1e-8);
        assertEquals(4.0, result.getValue()[0], 1e-8);
    }

    @Test
    public void testStopsImmediatelyAtExactOptimum() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        PointVectorValuePair result = optimizer.optimize(
            new MaxEval(10),
            new MaxIter(10),
            new InitialGuess(new double[] { 2.0 }),
            new Target(new double[] { 2.0 }),
            new Weight(new double[] { 1.0 }),
            new ModelFunction(linearModel(1.0)),
            new ModelFunctionJacobian(linearJacobian(1.0)));

        assertNotNull(result);
        assertEquals(2.0, result.getPoint()[0], 0.0);
        assertEquals(2.0, result.getValue()[0], 0.0);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testRejectsBoundedOptimization() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.optimize(
            new MaxEval(100),
            new MaxIter(100),
            new InitialGuess(new double[] { 1.0 }),
            new Target(new double[] { 4.0 }),
            new Weight(new double[] { 1.0 }),
            new ModelFunction(linearModel(2.0)),
            new ModelFunctionJacobian(linearJacobian(2.0)),
            new SimpleBounds(new double[] { 0.0 }, new double[] { 10.0 }));
    }
}