package org.apache.commons.math3.optimization.general;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class AbstractLeastSquaresOptimizerTest {

    private TestOptimizer optimizer;

    @Before
    public void init() {
        optimizer = new TestOptimizer();
    }

    private void setup2x2(double[] target, double[] weights, double[] start) {
        optimizer.optimize(100, new LinearModel2(), target, weights, start);
    }

    private void setup3x2(double[] target, double[] weights, double[] start) {
        optimizer.optimize(100, new LinearModel3(), target, weights, start);
    }

    @Test
    public void testOptimizeInitializesState() {
        double[] target = {0, 0};
        double[] weights = {1, 1};
        double[] start = {0, 0};
        setup2x2(target, weights, start);

        assertEquals(0, optimizer.getJacobianEvaluations());
        assertEquals(2, optimizer.rows);
        assertEquals(2, optimizer.cols);
        assertArrayEquals(start, optimizer.point, 1e-15);
        assertNotNull(optimizer.getWeightSquareRoot());
        assertEquals(0.0, optimizer.getChiSquare(), 0.0);
    }

    @Test
    public void testComputeWeightedJacobian() {
        setup2x2(new double[] {0, 0}, new double[] {1, 1}, new double[] {0, 0});

        RealMatrix j = optimizer.computeWeightedJacobian(new double[] {3, 4});

        assertEquals(1, optimizer.getJacobianEvaluations());
        assertEquals(1.0, j.getEntry(0, 0), 1e-15);
        assertEquals(2.0, j.getEntry(0, 1), 1e-15);
        assertEquals(1.0, j.getEntry(1, 0), 1e-15);
        assertEquals(-1.0, j.getEntry(1, 1), 1e-15);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeWeightedJacobianThrowsWhenModelAndTargetDiffer() {
        optimizer.optimize(100, new LinearModel2(),
                           new double[] {1}, new double[] {1}, new double[] {0, 0});
        optimizer.computeWeightedJacobian(new double[] {0, 0});
    }

    @Test
    public void testUpdateJacobian() {
        setup2x2(new double[] {0, 0}, new double[] {1, 1}, new double[] {0, 0});

        optimizer.updateJacobian();

        assertArrayEquals(new double[] {-1, -2}, optimizer.weightedResidualJacobian[0], 1e-15);
        assertArrayEquals(new double[] {-1, 1}, optimizer.weightedResidualJacobian[1], 1e-15);
    }

    @Test
    public void testComputeCost() {
        setup2x2(new double[] {0, 0}, new double[] {4, 1}, new double[] {0, 0});

        assertEquals(Math.sqrt(8), optimizer.computeCost(new double[] {1, 2}), 1e-12);
    }

    @Test
    public void testComputeResiduals() {
        setup2x2(new double[] {3, -2}, new double[] {1, 1}, new double[] {0, 0});

        assertArrayEquals(new double[] {2, -3},
                          optimizer.computeResiduals(new double[] {1, 1}), 1e-15);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeResidualsThrowsOnWrongLength() {
        setup2x2(new double[] {3, -2}, new double[] {1, 1}, new double[] {0, 0});
        optimizer.computeResiduals(new double[3]);
    }

    @Test
    public void testUpdateResidualsAndCost() {
        setup2x2(new double[] {3, -2}, new double[] {1, 1}, new double[] {1, 1});

        optimizer.updateResidualsAndCost();

        assertArrayEquals(new double[] {3, 0}, optimizer.objective, 1e-15);
        assertArrayEquals(new double[] {0, -2}, optimizer.weightedResiduals, 1e-15);
        assertEquals(2.0, optimizer.cost, 1e-15);
        assertEquals(4.0, optimizer.getChiSquare(), 1e-15);
    }

    @Test
    public void testSetCostAndChiSquareAndRMS() {
        setup2x2(new double[] {0, 0}, new double[] {1, 1}, new double[] {0, 0});

        optimizer.setCost(3);

        assertEquals(9.0, optimizer.getChiSquare(), 1e-15);
        assertEquals(Math.sqrt(9.0 / 2.0), optimizer.getRMS(), 1e-15);
    }

    @Test
    public void testGetWeightSquareRootReturnsCopy() {
        setup2x2(new double[] {0, 0}, new double[] {4, 1}, new double[] {0, 0});

        RealMatrix root = optimizer.getWeightSquareRoot();

        assertEquals(2.0, root.getEntry(0, 0), 1e-15);
        assertEquals(1.0, root.getEntry(1, 1), 1e-15);

        root.setEntry(0, 0, 123.0);
        assertEquals(2.0, optimizer.getWeightSquareRoot().getEntry(0, 0), 1e-15);
    }

    @Test
    public void testComputeCovariancesAndSigma() {
        setup2x2(new double[] {0, 0}, new double[] {1, 1}, new double[] {3, 4});

        double[][] cov = optimizer.computeCovariances(new double[] {3, 4}, 1e-14);

        assertEquals(5.0 / 9.0, cov[0][0], 1e-12);
        assertEquals(-1.0 / 9.0, cov[0][1], 1e-12);
        assertEquals(-1.0 / 9.0, cov[1][0], 1e-12);
        assertEquals(2.0 / 9.0, cov[1][1], 1e-12);

        double[] sigma = optimizer.computeSigma(new double[] {3, 4}, 1e-14);

        assertEquals(Math.sqrt(5.0 / 9.0), sigma[0], 1e-12);
        assertEquals(Math.sqrt(2.0 / 9.0), sigma[1], 1e-12);
    }

    @Test
    public void testGetCovariancesDeprecatedWrappers() {
        setup2x2(new double[] {0, 0}, new double[] {1, 1}, new double[] {3, 4});

        double[][] cov = optimizer.getCovariances();
        double[][] covWithThreshold = optimizer.getCovariances(1e-14);

        assertEquals(5.0 / 9.0, cov[0][0], 1e-12);
        assertEquals(5.0 / 9.0, covWithThreshold[0][0], 1e-12);
    }

    @Test
    public void testGuessParametersErrors() {
        setup3x2(new double[] {0, 0, 0}, new double[] {1, 1, 1}, new double[] {1, 2});
        optimizer.setCost(9);

        double[] errors = optimizer.guessParametersErrors();

        assertEquals(3 * Math.sqrt(5.0 / 14.0), errors[0], 1e-12);
        assertEquals(3 * Math.sqrt(3.0 / 14.0), errors[1], 1e-12);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuessParametersErrorsThrowsWhenNoDegreesOfFreedom() {
        setup2x2(new double[] {0, 0}, new double[] {1, 1}, new double[] {0, 0});
        optimizer.guessParametersErrors();
    }

    @Test
    public void testOptimizeWithDifferentiableMultivariateVectorFunction() {
        double[] target = {0, 0};
        double[] weights = {1, 1};
        double[] start = {0, 0};

        PointVectorValuePair pair =
            optimizer.optimize(100, new DifferentiableLinearModel2(), target, weights, start);

        assertNotNull(pair);
        assertArrayEquals(start, pair.getPoint(), 1e-15);
    }

    private static class TestOptimizer extends AbstractLeastSquaresOptimizer {
        TestOptimizer() {
            super(new ConvergenceChecker<PointVectorValuePair>() {
                public boolean converged(int iteration,
                                         PointVectorValuePair previous,
                                         PointVectorValuePair current) {
                    return true;
                }
            });
        }

        @Override
        protected PointVectorValuePair doOptimize() {
            return new PointVectorValuePair(getStartPoint(), new double[getTarget().length]);
        }
    }

    private static class LinearModel2 implements MultivariateDifferentiableVectorFunction {
        public DerivativeStructure[] value(DerivativeStructure[] point) {
            return new DerivativeStructure[] {
                point[0].add(point[1].multiply(2)),
                point[0].subtract(point[1])
            };
        }
    }

    private static class LinearModel3 implements MultivariateDifferentiableVectorFunction {
        public DerivativeStructure[] value(DerivativeStructure[] point) {
            return new DerivativeStructure[] {
                point[0].add(point[1].multiply(2)),
                point[0].subtract(point[1]),
                point[0]
            };
        }
    }

    private static class DifferentiableLinearModel2 implements DifferentiableMultivariateVectorFunction {
        public double[] value(double[] point) {
            return new double[] {point[0] + 2 * point[1], point[0] - point[1]};
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][] {{1, 2}, {1, -1}};
                }
            };
        }
    }
}