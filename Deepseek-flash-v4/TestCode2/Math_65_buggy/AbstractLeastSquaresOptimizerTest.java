package org.apache.commons.math.optimization.general;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    private static class TestOptimizer extends AbstractLeastSquaresOptimizer {
        @Override
        protected VectorialPointValuePair doOptimize() {
            return null;
        }
    }

    private static class CallingOptimizer extends AbstractLeastSquaresOptimizer {
        @Override
        protected VectorialPointValuePair doOptimize() throws FunctionEvaluationException {
            updateJacobian();
            updateResidualsAndCost();
            return null;
        }
    }

    private static DifferentiableMultivariateVectorialFunction createFunction(
            final double[] values, final double[][] matrix) {
        return new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return values.clone();
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        double[][] copy = new double[matrix.length][];
                        for (int i = 0; i < matrix.length; i++) {
                            copy[i] = matrix[i].clone();
                        }
                        return copy;
                    }
                };
            }
        };
    }

    @Test
    public void testDefaults() {
        TestOptimizer optimizer = new TestOptimizer();
        assertEquals(100, optimizer.getMaxIterations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getJacobianEvaluations());
        assertNotNull(optimizer.getConvergenceChecker());
        assertTrue(optimizer.getConvergenceChecker() instanceof SimpleVectorialValueChecker);
    }

    @Test
    public void testSettersAndGetters() {
        TestOptimizer optimizer = new TestOptimizer();
        SimpleVectorialValueChecker checker = new SimpleVectorialValueChecker();
        optimizer.setMaxIterations(42);
        optimizer.setMaxEvaluations(1000);
        optimizer.setConvergenceChecker(checker);
        assertEquals(42, optimizer.getMaxIterations());
        assertEquals(1000, optimizer.getMaxEvaluations());
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testIncrementIterationsCounter() {
        TestOptimizer optimizer = new TestOptimizer();
        optimizer.setMaxIterations(1);
        optimizer.incrementIterationsCounter();
        assertEquals(1, optimizer.getIterations());
        try {
            optimizer.incrementIterationsCounter();
            fail("Expected OptimizationException");
        } catch (OptimizationException e) {
            assertEquals(2, optimizer.getIterations());
        }
    }

    @Test
    public void testUpdateResidualsAndCost() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0, 1.0}, new double[][]{{1.0}, {1.0}}),
                new double[]{2.0, 3.0},
                new double[]{1.0, 4.0},
                new double[]{0.0});
        assertEquals(2, optimizer.rows);
        assertEquals(1, optimizer.cols);
        assertArrayEquals(new double[]{2.0, 2.0}, optimizer.residuals, 1e-12);
        assertEquals(Math.sqrt(20.0), optimizer.cost, 1e-12);
        assertEquals(1, optimizer.getEvaluations());
        assertEquals(1, optimizer.getJacobianEvaluations());
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsDimensionMismatch() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0}, new double[][]{{1.0}, {1.0}}),
                new double[]{1.0, 2.0},
                new double[]{1.0, 1.0},
                new double[]{0.0});
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateJacobianDimensionMismatch() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0, 0.0}, new double[][]{{1.0}}),
                new double[]{1.0, 2.0},
                new double[]{1.0, 1.0},
                new double[]{0.0, 0.0});
    }

    @Test
    public void testUpdateJacobianScalesByWeights() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0, 0.0},
                        new double[][]{{1.0, 2.0}, {3.0, 4.0}}),
                new double[]{0.0, 0.0},
                new double[]{4.0, 9.0},
                new double[]{1.0, 2.0});
        assertEquals(1, optimizer.getJacobianEvaluations());
        assertEquals(2, optimizer.jacobian.length);
        assertArrayEquals(new double[]{-2.0, -4.0}, optimizer.jacobian[0], 1e-12);
        assertArrayEquals(new double[]{-9.0, -12.0}, optimizer.jacobian[1], 1e-12);
    }

    @Test
    public void testMaxEvaluationsExceeded() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.setMaxEvaluations(1);
        optimizer.optimize(
                createFunction(new double[]{0.0}, new double[][]{{1.0}}),
                new double[]{1.0},
                new double[]{1.0},
                new double[]{0.0});
        try {
            optimizer.updateResidualsAndCost();
            fail("Expected FunctionEvaluationException");
        } catch (FunctionEvaluationException e) {
            assertEquals(2, optimizer.getEvaluations());
        }
    }

    @Test
    public void testGetRMSAndChiSquare() {
        TestOptimizer optimizer = new TestOptimizer();
        optimizer.rows = 2;
        optimizer.residuals = new double[]{1.0, 2.0};
        optimizer.residualsWeights = new double[]{1.0, 4.0};
        assertEquals(Math.sqrt(8.5), optimizer.getRMS(), 1e-12);
        assertEquals(2.0, optimizer.getChiSquare(), 1e-12);
    }

    @Test
    public void testGetCovariances() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0, 0.0},
                        new double[][]{{1.0, 0.0}, {0.0, 1.0}}),
                new double[]{0.0, 0.0},
                new double[]{1.0, 1.0},
                new double[]{0.0, 0.0});
        double[][] covariances = optimizer.getCovariances();
        assertEquals(2, covariances.length);
        assertEquals(2, covariances[0].length);
        assertArrayEquals(new double[]{1.0, 0.0}, covariances[0], 1e-12);
        assertArrayEquals(new double[]{0.0, 1.0}, covariances[1], 1e-12);
    }

    @Test(expected = OptimizationException.class)
    public void testGetCovariancesSingular() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0}, new double[][]{{0.0}}),
                new double[]{1.0},
                new double[]{1.0},
                new double[]{0.0});
        optimizer.getCovariances();
    }

    @Test
    public void testGuessParametersErrors() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0, 0.0, 0.0},
                        new double[][]{{1.0, 0.0}, {0.0, 1.0}, {0.0, 0.0}}),
                new double[]{1.0, 2.0, 3.0},
                new double[]{1.0, 1.0, 1.0},
                new double[]{0.0, 0.0});
        double[] errors = optimizer.guessParametersErrors();
        assertEquals(2, errors.length);
        assertEquals(Math.sqrt(14.0), errors[0], 1e-12);
        assertEquals(Math.sqrt(14.0), errors[1], 1e-12);
    }

    @Test(expected = OptimizationException.class)
    public void testGuessParametersErrorsNoDegreesOfFreedom() throws Exception {
        CallingOptimizer optimizer = new CallingOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0, 0.0},
                        new double[][]{{1.0, 0.0}, {0.0, 1.0}}),
                new double[]{0.0, 0.0},
                new double[]{1.0, 1.0},
                new double[]{0.0, 0.0});
        optimizer.guessParametersErrors();
    }

    @Test
    public void testOptimizeStoresProblemAndResetsCounters() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        optimizer.incrementIterationsCounter();
        optimizer.optimize(
                createFunction(new double[]{0.0}, new double[][]{{1.0}}),
                new double[]{5.0},
                new double[]{2.0},
                new double[]{3.0});
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getJacobianEvaluations());
        assertEquals(1, optimizer.rows);
        assertEquals(1, optimizer.cols);
        assertEquals(5.0, optimizer.targetValues[0], 1e-12);
        assertEquals(2.0, optimizer.residualsWeights[0], 1e-12);
        assertEquals(3.0, optimizer.point[0], 1e-12);
        assertEquals(1, optimizer.residuals.length);
        assertEquals(Double.POSITIVE_INFINITY, optimizer.cost, 0.0);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimizeRejectsTargetWeightsMismatch() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        optimizer.optimize(
                createFunction(new double[]{0.0}, new double[][]{{1.0}}),
                new double[]{1.0, 2.0},
                new double[]{1.0},
                new double[]{0.0});
    }

    @Test
    public void testOptimizeWithEmptyArrays() throws Exception {
        TestOptimizer optimizer = new TestOptimizer();
        VectorialPointValuePair result = optimizer.optimize(
                createFunction(new double[0], new double[0][0]),
                new double[0],
                new double[0],
                new double[0]);
        assertNull(result);
        assertEquals(0, optimizer.rows);
        assertEquals(0, optimizer.cols);
    }
}