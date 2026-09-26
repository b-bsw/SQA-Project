package org.apache.commons.math.linear;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CholeskyDecompositionImplTest {

    private static final double EPS = 1.0e-12;
    private static final double TINY_EPS = 1.0e-20;

    @Test
    public void test2x2DecompositionAndCachedFactors() throws Exception {
        RealMatrix a = MatrixUtils.createRealMatrix(new double[][] {
            { 4.0, 2.0 },
            { 2.0, 3.0 }
        });

        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(a);

        RealMatrix l = decomposition.getL();
        RealMatrix lt = decomposition.getLT();

        assertEquals(2, l.getRowDimension());
        assertEquals(2, l.getColumnDimension());
        assertEquals(2.0, l.getEntry(0, 0), EPS);
        assertEquals(0.0, l.getEntry(0, 1), EPS);
        assertEquals(1.0, l.getEntry(1, 0), EPS);
        assertEquals(Math.sqrt(2.0), l.getEntry(1, 1), EPS);

        assertEquals(2.0, lt.getEntry(0, 0), EPS);
        assertEquals(1.0, lt.getEntry(0, 1), EPS);
        assertEquals(0.0, lt.getEntry(1, 0), EPS);
        assertEquals(Math.sqrt(2.0), lt.getEntry(1, 1), EPS);

        assertSame(l, decomposition.getL());
        assertSame(lt, decomposition.getLT());
        assertEquals(8.0, decomposition.getDeterminant(), EPS);
    }

    @Test
    public void test1x1Matrix() throws Exception {
        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(
                MatrixUtils.createRealMatrix(new double[][] { { 9.0 } }));
        assertEquals(3.0, decomposition.getL().getEntry(0, 0), EPS);
        assertEquals(9.0, decomposition.getDeterminant(), EPS);
    }

    @Test
    public void test3x3PositiveDefiniteMatrix() throws Exception {
        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(
                MatrixUtils.createRealMatrix(new double[][] {
                    { 4.0, 2.0, 1.0 },
                    { 2.0, 3.0, 0.0 },
                    { 1.0, 0.0, 2.0 }
                }));

        RealMatrix l = decomposition.getL();
        assertEquals(0.0, l.getEntry(0, 1), EPS);
        assertEquals(0.0, l.getEntry(0, 2), EPS);
        assertEquals(0.0, l.getEntry(1, 2), EPS);
        assertEquals(13.0, decomposition.getDeterminant(), EPS);
    }

    @Test
    public void testAbsolutePositivityThresholdBoundary() throws Exception {
        try {
            new CholeskyDecompositionImpl(MatrixUtils.createRealMatrix(
                    new double[][] { { 1.0e-12 } }));
            fail("Default positivity threshold should reject this diagonal");
        } catch (NotPositiveDefiniteMatrixException e) {
            // expected
        }

        CholeskyDecompositionImpl decomposition = new CholeskyDecompositionImpl(
                MatrixUtils.createRealMatrix(new double[][] { { 1.0e-12 } }),
                1.0e-15, 1.0e-15);
        assertEquals(1.0e-12, decomposition.getDeterminant(), TINY_EPS);
    }

    @Test
    public void testNonPositiveDefiniteMatrixWithPositiveDiagonalThrows() throws Exception {
        try {
            new CholeskyDecompositionImpl(MatrixUtils.createRealMatrix(
                    new double[][] { { 1.0, 2.0 }, { 2.0, 1.0 } }));
            fail("Expected NotPositiveDefiniteMatrixException");
        } catch (NotPositiveDefiniteMatrixException e) {
            // expected
        }
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testNonSquareMatrixThrows() throws Exception {
        new CholeskyDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } }));
    }

    @Test(expected = NotSymmetricMatrixException.class)
    public void testNonSymmetricMatrixThrows() throws Exception {
        new CholeskyDecompositionImpl(MatrixUtils.createRealMatrix(
                new double[][] { { 4.0, 2.0 }, { 3.0, 3.0 } }));
    }

    @Test(expected = NullPointerException.class)
    public void testNullMatrixThrows() throws Exception {
        new CholeskyDecompositionImpl(null);
    }

    @Test
    public void testSolverSolvesVectorsAndMatrix() throws Exception {
        DecompositionSolver solver = new CholeskyDecompositionImpl(
                MatrixUtils.createRealMatrix(new double[][] { { 4.0, 2.0 }, { 2.0, 3.0 } }))
                .getSolver();

        assertTrue(solver.isNonSingular());

        assertArrayEquals(new double[] { 1.0, 2.0 },
                solver.solve(new double[] { 8.0, 8.0 }), EPS);

        RealVector b = new RealVectorImpl(new double[] { 8.0, 8.0 }, false);
        RealVector x = solver.solve(b);
        assertEquals(1.0, x.getData()[0], EPS);
        assertEquals(2.0, x.getData()[1], EPS);

        RealMatrix B = MatrixUtils.createRealMatrix(new double[][] {
                { 8.0, 0.0 },
                { 8.0, 1.0 }
        });
        RealMatrix X = solver.solve(B);
        assertEquals(1.0, X.getEntry(0, 0), EPS);
        assertEquals(2.0, X.getEntry(1, 0), EPS);
        assertEquals(-0.25, X.getEntry(0, 1), EPS);
        assertEquals(0.5, X.getEntry(1, 1), EPS);

        RealMatrix inverse = solver.getInverse();
        assertEquals(0.375, inverse.getEntry(0, 0), EPS);
        assertEquals(-0.25, inverse.getEntry(0, 1), EPS);
        assertEquals(-0.25, inverse.getEntry(1, 0), EPS);
        assertEquals(0.5, inverse.getEntry(1, 1), EPS);
    }

    @Test
    public void testSolverRejectsBadDimensions() throws Exception {
        DecompositionSolver solver = new CholeskyDecompositionImpl(
                MatrixUtils.createRealMatrix(new double[][] { { 4.0, 2.0 }, { 2.0, 3.0 } }))
                .getSolver();

        try {
            solver.solve(new double[0]);
            fail("Expected vector length mismatch");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            solver.solve(MatrixUtils.createRealMatrix(new double[][] {
                    { 1.0, 2.0 },
                    { 3.0, 4.0 },
                    { 5.0, 6.0 }
            }));
            fail("Expected matrix row dimension mismatch");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}