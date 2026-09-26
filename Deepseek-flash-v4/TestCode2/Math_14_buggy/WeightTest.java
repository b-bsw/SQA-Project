package org.apache.commons.math3.optim.nonlinear.vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Test;

public class WeightTest {

    @Test
    public void testEmptyDiagonalWeight() {
        Weight weight = new Weight(new double[0]);
        RealMatrix matrix = weight.getWeight();

        assertEquals(0, matrix.getRowDimension());
        assertEquals(0, matrix.getColumnDimension());
    }

    @Test
    public void testSingleElementDiagonalWeight() {
        Weight weight = new Weight(new double[] { 7.5 });
        RealMatrix matrix = weight.getWeight();

        assertEquals(1, matrix.getRowDimension());
        assertEquals(1, matrix.getColumnDimension());
        assertEquals(7.5, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testMultipleDiagonalWeightsAndCopies() {
        double[] values = { 1.0, -2.0, 3.5 };
        Weight weight = new Weight(values);
        RealMatrix matrix = weight.getWeight();

        assertEquals(3, matrix.getRowDimension());
        assertEquals(3, matrix.getColumnDimension());
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (i == j) {
                    assertEquals("diagonal entry", values[i], matrix.getEntry(i, j), 0.0);
                } else {
                    assertEquals("off-diagonal entry", 0.0, matrix.getEntry(i, j), 0.0);
                }
            }
        }

        matrix.setEntry(0, 0, 100.0);
        RealMatrix other = weight.getWeight();
        assertNotSame(matrix, other);
        assertEquals(1.0, other.getEntry(0, 0), 0.0);
    }

    @Test
    public void testSquareMatrixConstructorCopiesInput() {
        Array2DRowRealMatrix input = new Array2DRowRealMatrix(new double[][] { { 1, 2 }, { 3, 4 } });
        Weight weight = new Weight(input);

        input.setEntry(0, 0, 99);
        input.setEntry(1, 1, -1);

        RealMatrix matrix = weight.getWeight();
        assertEquals(1.0, matrix.getEntry(0, 0), 0.0);
        assertEquals(4.0, matrix.getEntry(1, 1), 0.0);

        matrix.setEntry(0, 1, 42);
        RealMatrix other = weight.getWeight();
        assertNotSame(matrix, other);
        assertEquals(2.0, other.getEntry(0, 1), 0.0);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testNonSquareMatrixRejected() {
        new Weight(new Array2DRowRealMatrix(new double[][] { { 1, 2, 3 }, { 4, 5, 6 } }));
    }

    @Test(expected = NullPointerException.class)
    public void testNullWeightArrayRejected() {
        new Weight((double[]) null);
    }

    @Test(expected = NullPointerException.class)
    public void testNullWeightMatrixRejected() {
        new Weight((RealMatrix) null);
    }
}