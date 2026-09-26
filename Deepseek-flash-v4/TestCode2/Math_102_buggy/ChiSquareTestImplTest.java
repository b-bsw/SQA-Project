package org.apache.commons.math.stat.inference;

import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ChiSquareTestImplTest {

    private ChiSquareTestImpl chiSquareTest;

    @Before
    public void setUp() {
        chiSquareTest = new ChiSquareTestImpl();
    }

    @Test
    public void testChiSquare() {
        assertEquals(0.0, chiSquareTest.chiSquare(new double[]{10.0, 10.0}, new long[]{10, 10}), 1e-12);
        assertEquals(4.0 / 3.0, chiSquareTest.chiSquare(new double[]{1.0, 2.0, 3.0}, new long[]{2, 2, 4}), 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTooShort() {
        chiSquareTest.chiSquare(new double[]{1.0}, new long[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareLengthMismatch() {
        chiSquareTest.chiSquare(new double[]{1.0, 2.0}, new long[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareEmptyArrays() {
        chiSquareTest.chiSquare(new double[0], new long[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareNonPositiveExpected() {
        chiSquareTest.chiSquare(new double[]{0.0, 2.0}, new long[]{1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareNegativeObserved() {
        chiSquareTest.chiSquare(new double[]{1.0, 2.0}, new long[]{-1, 2});
    }

    @Test(expected = NullPointerException.class)
    public void testChiSquareNullArrays() {
        chiSquareTest.chiSquare(null, null);
    }

    @Test
    public void testChiSquareTest() throws Exception {
        assertEquals(1.0, chiSquareTest.chiSquareTest(new double[]{10.0, 10.0}, new long[]{10, 10}), 1e-12);
    }

    @Test
    public void testChiSquareTestAlpha() throws Exception {
        assertFalse(chiSquareTest.chiSquareTest(new double[]{10.0, 10.0}, new long[]{10, 10}, 0.05));
        assertFalse(chiSquareTest.chiSquareTest(new double[]{10.0, 10.0}, new long[]{10, 10}, 0.5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestInvalidAlpha() throws Exception {
        chiSquareTest.chiSquareTest(new double[]{10.0, 10.0}, new long[]{10, 10}, 0.0);
    }

    @Test
    public void testChiSquareTwoWay() {
        assertEquals(5.0 / 63.0, chiSquareTest.chiSquare(new long[][]{{1, 2}, {3, 4}}), 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayTooFewRows() {
        chiSquareTest.chiSquare(new long[][]{{1, 2}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayTooFewColumns() {
        chiSquareTest.chiSquare(new long[][]{{1}, {2}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayNonRectangular() {
        chiSquareTest.chiSquare(new long[][]{{1, 2}, {3, 4}, {5}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTwoWayNegativeEntry() {
        chiSquareTest.chiSquare(new long[][]{{1, 2}, {-1, 4}});
    }

    @Test
    public void testChiSquareTestTwoWay() throws Exception {
        assertEquals(1.0, chiSquareTest.chiSquareTest(new long[][]{{2, 2}, {2, 2}}), 1e-12);
    }

    @Test
    public void testChiSquareTestTwoWayAlpha() throws Exception {
        assertFalse(chiSquareTest.chiSquareTest(new long[][]{{2, 2}, {2, 2}}, 0.05));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestTwoWayInvalidAlpha() throws Exception {
        chiSquareTest.chiSquareTest(new long[][]{{2, 2}, {2, 2}}, 0.6);
    }

    @Test
    public void testChiSquareDataSetsComparisonEqualCounts() {
        assertEquals(0.0, chiSquareTest.chiSquareDataSetsComparison(new long[]{1, 2, 3}, new long[]{1, 2, 3}), 1e-12);
    }

    @Test
    public void testChiSquareDataSetsComparisonUnequalCounts() {
        assertEquals(5.0 / 63.0, chiSquareTest.chiSquareDataSetsComparison(new long[]{1, 3}, new long[]{2, 4}), 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonTooShort() {
        chiSquareTest.chiSquareDataSetsComparison(new long[]{1}, new long[]{2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonLengthMismatch() {
        chiSquareTest.chiSquareDataSetsComparison(new long[]{1, 2}, new long[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonNegative() {
        chiSquareTest.chiSquareDataSetsComparison(new long[]{1, -2}, new long[]{1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonAllZero() {
        chiSquareTest.chiSquareDataSetsComparison(new long[]{0, 0}, new long[]{1, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareDataSetsComparisonBothZero() {
        chiSquareTest.chiSquareDataSetsComparison(new long[]{0, 2}, new long[]{0, 3});
    }

    @Test
    public void testChiSquareTestDataSetsComparison() throws Exception {
        assertEquals(1.0, chiSquareTest.chiSquareTestDataSetsComparison(new long[]{1, 2}, new long[]{1, 2}), 1e-12);
    }

    @Test
    public void testChiSquareTestDataSetsComparisonAlpha() throws Exception {
        assertFalse(chiSquareTest.chiSquareTestDataSetsComparison(new long[]{1, 2}, new long[]{1, 2}, 0.05));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testChiSquareTestDataSetsComparisonInvalidAlpha() throws Exception {
        chiSquareTest.chiSquareTestDataSetsComparison(new long[]{1, 2}, new long[]{1, 2}, 0.0);
    }

    @Test
    public void testSetDistribution() throws Exception {
        chiSquareTest.setDistribution(new ChiSquaredDistributionImpl(2.0));
        assertEquals(1.0, chiSquareTest.chiSquareTest(new double[]{10.0, 10.0}, new long[]{10, 10}), 1e-12);
    }
}