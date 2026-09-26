package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.junit.Before;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    private TestOptimizer optimizer;

    @Before
    public void setUp() {
        setUpWith(new double[] { 1, 2 },
                  new double[] { 2, 3 },
                  new double[][] { { 1, 0 }, { 0, 1 } });
    }

    private void setUpWith(final double[] target,
                           final double[] weights,
                           final double[][] jacobian) {
        optimizer = new TestOptimizer();
        optimizer.optimize(new MaxEval(100),
                           new InitialGuess(new double[target.length]),
                           new Target(target),
                           new Weight(new DiagonalMatrix(weights)),
                           modelFunction(),
                           jacobianFunction(jacobian));
    }

    private static ModelFunction modelFunction() {
        return new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return point.clone();
            }
        });
    }

    private static ModelFunctionJacobian jacobianFunction(final double[][] jacobian) {
        return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return jacobian;
            }
        });
    }

    @Test
    public void testOptimizeInitializesWeightSquareRootAndCost() {
        RealMatrix sqrt = optimizer.getWeightSquareRoot();
        assertNotNull(sqrt);
        assertEquals(2, sqrt.getRowDimension());
        assertEquals(Math.sqrt(2), sqrt.getEntry(0, 0), 1e-10);
        assertEquals(Math.sqrt(3), sqrt.getEntry(1, 1), 1e-10);

        sqrt.setEntry(0, 0, 123);
        assertEquals(Math.sqrt(2), optimizer.getWeightSquareRoot().getEntry(0, 0), 1e-10);

        assertEquals(0, optimizer.getChiSquare(), 1e-10);
        assertEquals(0, optimizer.getRMS(), 1e-10);
    }

    @Test
    public void testChiSquareAndRMS() {
        optimizer.setCostForTest(4);
        assertEquals(16, optimizer.getChiSquare(), 1e-10);
        assertEquals(Math.sqrt(8), optimizer.getRMS(), 1e-10);

        optimizer.setCostForTest(0);
        assertEquals(0, optimizer.getRMS(), 1e-10);
    }

    @Test
    public void testComputeResiduals() {
        double[] residuals = optimizer.computeResiduals(new double[] { 0.5, 1.5 });
        assertArrayEquals(new double[] { 0.5, 0.5 }, residuals, 1e-10);

        try {
            optimizer.computeResiduals(new double[0]);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testComputeCost() {
        assertEquals(Math.sqrt(14), optimizer.computeCost(new double[] { 1, 2 }), 1e-10);
    }

    @Test
    public void testComputeWeightedJacobian() {
        RealMatrix weighted = optimizer.computeWeightedJacobian(new double[] { 0, 0 });
        assertEquals(Math.sqrt(2), weighted.getEntry(0, 0), 1e-10);
        assertEquals(Math.sqrt(3), weighted.getEntry(1, 1), 1e-10);
        assertEquals(0, weighted.getEntry(0, 1), 1e-10);
    }

    @Test
    public void testComputeCovariancesAndSigma() {
        double[][] cov = optimizer.computeCovariances(new double[] { 0, 0 }, 1e-10);
        assertEquals(0.5, cov[0][0], 1e-10);
        assertEquals(1.0 / 3.0, cov[1][1], 1e-10);
        assertEquals(0, cov[0][1], 1e-10);

        double[] sigma = optimizer.computeSigma(new double[] { 0, 0 }, 1e-10);
        assertArrayEquals(new double[] { Math.sqrt(0.5), Math.sqrt(1.0 / 3.0) }, sigma, 1e-10);
    }

    @Test
    public void testOptimizeWithoutWeightReusesPreviousWeightMatrixSqrt() {
        RealMatrix before = optimizer.getWeightSquareRoot().copy();
        optimizer.optimize(new MaxEval(10),
                           new InitialGuess(new double[] { 0 }),
                           new Target(new double[] { 1 }),
                           modelFunction(),
                           jacobianFunction(new double[][] { { 1 } }));
        assertEquals(before.getEntry(0, 0),
                     optimizer.getWeightSquareRoot().getEntry(0, 0), 1e-10);
        assertEquals(2, optimizer.getWeightSquareRoot().getRowDimension());
    }

    @Test
    public void testComputeCovariancesThrowsForSingularMatrix() {
        setUpWith(new double[] { 1 },
                  new double[] { 1 },
                  new double[][] { { 0 } });
        try {
            optimizer.computeCovariances(new double[] { 0 }, 1e-10);
            fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            assertNotNull(e);
        }
    }

    private static class TestOptimizer extends AbstractLeastSquaresOptimizer {
        TestOptimizer() {
            super(null);
        }

        public PointVectorValuePair doOptimize() {
            final int n = getTargetSize();
            return new PointVectorValuePair(new double[n], new double[n]);
        }

        public void setCostForTest(double value) {
            setCost(value);
        }
    }
}