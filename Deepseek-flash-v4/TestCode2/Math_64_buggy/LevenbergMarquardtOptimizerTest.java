package org.apache.commons.math.optimization.general;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LevenbergMarquardtOptimizerTest {

    private static final double TOL = 1.0e-6;

    private LevenbergMarquardtOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1000);
    }

    private static final class LinearFunction implements DifferentiableMultivariateVectorialFunction {
        private final double[] expected;

        LinearFunction(double... expected) {
            this.expected = expected;
        }

        public double[] value(double[] point) throws FunctionEvaluationException {
            double[] result = new double[point.length];
            for (int i = 0; i < point.length; ++i) {
                result[i] = point[i] - expected[i];
            }
            return result;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    double[][] j = new double[point.length][point.length];
                    for (int i = 0; i < point.length; ++i) {
                        j[i][i] = 1.0;
                    }
                    return j;
                }
            };
        }
    }

    private static final class LinearSystemFunction implements DifferentiableMultivariateVectorialFunction {
        public double[] value(double[] point) throws FunctionEvaluationException {
            return new double[] { point[0] + point[1], point[0] - point[1] };
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) throws FunctionEvaluationException {
                    return new double[][] { { 1.0, 1.0 }, { 1.0, -1.0 } };
                }
            };
        }
    }

    @Test
    public void testLinearSystemOptimization() throws Exception {
        optimizer.setInitialStepBoundFactor(50.0);
        optimizer.setCostRelativeTolerance(1.0e-10);
        optimizer.setParRelativeTolerance(1.0e-10);
        optimizer.setOrthoTolerance(1.0e-10);
        optimizer.setQRRankingThreshold(1.0e-15);

        VectorialPointValuePair optimum = optimizer.optimize(
                new LinearSystemFunction(),
                new double[] { 5.0, 1.0 },
                new double[] { 1.0, 1.0 },
                new double[] { 0.0, 0.0 });

        assertNotNull(optimum);
        double[] point = optimum.getPoint();
        assertEquals(3.0, point[0], TOL);
        assertEquals(2.0, point[1], TOL);
    }

    @Test
    public void testStartAtOptimumTerminates() throws Exception {
        VectorialPointValuePair optimum = optimizer.optimize(
                new LinearSystemFunction(),
                new double[] { 5.0, 1.0 },
                new double[] { 1.0, 1.0 },
                new double[] { 3.0, 2.0 });

        assertNotNull(optimum);
        double[] point = optimum.getPoint();
        assertEquals(3.0, point[0], TOL);
        assertEquals(2.0, point[1], TOL);
    }

    @Test
    public void testEmptyProblemRunsWithZeroLoops() throws Exception {
        VectorialPointValuePair optimum = optimizer.optimize(
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] point) throws FunctionEvaluationException {
                        return new double[0];
                    }

                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] point) throws FunctionEvaluationException {
                                return new double[0][0];
                            }
                        };
                    }
                },
                new double[0],
                new double[0],
                new double[0]);

        assertNotNull(optimum);
        assertEquals(0, optimum.getPoint().length);
    }

    @Test(expected = OptimizationException.class)
    public void testNonFiniteJacobianThrowsOptimizationException() throws Exception {
        optimizer.optimize(
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] point) throws FunctionEvaluationException {
                        return new double[] { point[0] - 1.0 };
                    }

                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] point) throws FunctionEvaluationException {
                                return new double[][] { { Double.NaN } };
                            }
                        };
                    }
                },
                new double[] { 0.0 },
                new double[] { 1.0 },
                new double[] { 0.0 });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMismatchedDimensionsThrow() throws Exception {
        optimizer.optimize(
                new LinearFunction(1.0, 2.0),
                new double[] { 0.0 },
                new double[] { 1.0 },
                new double[] { 1.0, 2.0 });
    }

    @Test(expected = NullPointerException.class)
    public void testNullTargetThrows() throws Exception {
        optimizer.optimize(
                new LinearFunction(1.0),
                null,
                new double[] { 1.0 },
                new double[] { 1.0 });
    }
}