package org.apache.commons.math.linear;

import static org.junit.Assert.*;

import java.util.Iterator;
import org.junit.Test;

public class OpenMapRealVectorTest {

    private static final double TOL = 1e-12;

    @Test
    public void testConstructors() {
        OpenMapRealVector empty = new OpenMapRealVector();
        assertEquals(0, empty.getDimension());
        assertEquals(0, empty.getData().length);

        OpenMapRealVector five = new OpenMapRealVector(5);
        assertEquals(5, five.getDimension());
        assertArrayEquals(new double[5], five.getData(), 0.0);

        OpenMapRealVector fromDoubleArray = new OpenMapRealVector(new double[] {0, 1.5, -2, 0});
        assertArrayEquals(new double[] {0, 1.5, -2, 0}, fromDoubleArray.getData(), 0.0);

        OpenMapRealVector fromDoubleObject = new OpenMapRealVector(new Double[] {0.0, 2.5});
        assertArrayEquals(new double[] {0, 2.5}, fromDoubleObject.getData(), 0.0);

        OpenMapRealVector copy = new OpenMapRealVector(fromDoubleArray);
        assertArrayEquals(fromDoubleArray.getData(), copy.getData(), 0.0);

        OpenMapRealVector fromReal = new OpenMapRealVector((RealVector) fromDoubleArray);
        assertArrayEquals(fromDoubleArray.getData(), fromReal.getData(), 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullArrayThrows() {
        new OpenMapRealVector((double[]) null);
    }

    @Test
    public void testEpsilonFiltersTinyValues() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0, 1e-13, 1}, 1e-10);
        assertArrayEquals(new double[] {0, 0, 1}, v.getData(), 0.0);

        OpenMapRealVector w = new OpenMapRealVector(new double[] {0, 1e-9, 1}, 1e-10);
        assertArrayEquals(new double[] {0, 1e-9, 1}, w.getData(), 1e-20);
    }

    @Test
    public void testGetAndSetEntry() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 4.0);
        assertEquals(4.0, v.getEntry(1), 0.0);

        v.setEntry(1, 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);

        v.setEntry(0, -2.25);
        assertEquals(-2.25, v.getEntry(0), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetEntryOutOfBounds() {
        new OpenMapRealVector(2).setEntry(2, 1.0);
    }

    @Test
    public void testSet() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.set(2.5);
        assertArrayEquals(new double[] {2.5, 2.5, 2.5}, v.getData(), 0.0);

        v.set(0.0);
        assertArrayEquals(new double[] {0, 0, 0}, v.getData(), 0.0);
    }

    @Test
    public void testSetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(1, new double[] {7, 8});
        assertArrayEquals(new double[] {0, 7, 8, 0, 0}, v.getData(), 0.0);

        v.setSubVector(3, (RealVector) new ArrayRealVector(new double[] {9, 0}));
        assertArrayEquals(new double[] {0, 7, 8, 9, 0}, v.getData(), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubVectorOutOfBounds() {
        new OpenMapRealVector(2).setSubVector(1, new double[] {1, 2});
    }

    @Test
    public void testAdd() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1, 0, 2});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {0, 3, 4});

        OpenMapRealVector sum = a.add(b);
        assertArrayEquals(new double[] {1, 3, 6}, sum.getData(), 0.0);
        assertArrayEquals(new double[] {1, 0, 2}, a.getData(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        new OpenMapRealVector(2).add(new OpenMapRealVector(3));
    }

    @Test
    public void testSubtract() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {5, 0, 8});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {1, 2, 3});

        OpenMapRealVector diff = a.subtract(b);
        assertArrayEquals(new double[] {4, -2, 5}, diff.getData(), TOL);

        OpenMapRealVector diffViaReal = a.subtract((RealVector) new ArrayRealVector(new double[] {1, 2, 3}));
        assertArrayEquals(new double[] {4, -2, 5}, diffViaReal.getData(), TOL);
    }

    @Test
    public void testMapAdd() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1, 0, -2});

        OpenMapRealVector added = v.mapAdd(1.0);
        assertArrayEquals(new double[] {2, 1, -1}, added.getData(), TOL);
        assertArrayEquals(new double[] {1, 0, -2}, v.getData(), 0.0);

        v.mapAddToSelf(1.0);
        assertArrayEquals(new double[] {2, 1, -1}, v.getData(), TOL);
    }

    @Test
    public void testCopyEqualsHashCode() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1, 0, 3});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {1, 0, 3});
        OpenMapRealVector c = a.copy();

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotSame(a, c);
        assertEquals(a, c);

        b.setEntry(2, 4);
        assertFalse(a.equals(b));
        assertFalse(a.equals(null));
        assertFalse(a.equals("not a vector"));

        OpenMapRealVector differentEpsilon = new OpenMapRealVector(new double[] {1, 0, 3}, 1e-6);
        assertFalse(a.equals(differentEpsilon));
    }

    @Test
    public void testDotProduct() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1, 2, 3});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {4, 5, 6});

        assertEquals(32.0, a.dotProduct(b), 0.0);
        assertEquals(32.0, a.dotProduct((RealVector) new ArrayRealVector(new double[] {4, 5, 6})), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDotProductDimensionMismatch() {
        new OpenMapRealVector(2).dotProduct(new OpenMapRealVector(3));
    }

    @Test
    public void testEbeDivideAndMultiply() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {2, 0, 6});

        OpenMapRealVector quotient = a.ebeDivide(new OpenMapRealVector(new double[] {1, 5, 3}));
        assertArrayEquals(new double[] {2, 0, 2}, quotient.getData(), 0.0);

        OpenMapRealVector product = a.ebeMultiply(new double[] {2, 2, 2});
        assertArrayEquals(new double[] {4, 0, 12}, product.getData(), 0.0);
    }

    @Test
    public void testGetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0, 2, 3, 0});

        OpenMapRealVector sub = v.getSubVector(1, 2);
        assertArrayEquals(new double[] {2, 3}, sub.getData(), 0.0);
        assertArrayEquals(new double[] {0, 2, 3, 0}, v.getData(), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubVectorOutOfBounds() {
        new OpenMapRealVector(new double[] {1, 2}).getSubVector(1, 2);
    }

    @Test
    public void testAppend() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1, 2});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {3, 4});

        assertArrayEquals(new double[] {1, 2, 3, 4}, a.append(b).getData(), 0.0);
        assertArrayEquals(new double[] {1, 2, 5}, a.append(5).getData(), 0.0);
        assertArrayEquals(new double[] {1, 2, 6, 7}, a.append(new double[] {6, 7}).getData(), 0.0);

        OpenMapRealVector appendedReal = a.append((RealVector) new ArrayRealVector(new double[] {8, 9}));
        assertArrayEquals(new double[] {1, 2, 8, 9}, appendedReal.getData(), 0.0);
    }

    @Test
    public void testUnitVectorAndUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0, 3, 4});

        OpenMapRealVector unit = v.unitVector();
        assertArrayEquals(new double[] {0, 0.6, 0.8}, unit.getData(), TOL);
        assertArrayEquals(new double[] {0, 3, 4}, v.getData(), 0.0);

        v.unitize();
        assertArrayEquals(new double[] {0, 0.6, 0.8}, v.getData(), TOL);
    }

    @Test(expected = RuntimeException.class)
    public void testUnitizeZeroNormThrows() {
        new OpenMapRealVector(3).unitize();
    }

    @Test
    public void testDistances() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1, 0, 2});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {0, 3, 4});

        assertEquals(Math.sqrt(14), a.getDistance(b), TOL);
        assertEquals(Math.sqrt(14), a.getDistance(new double[] {0, 3, 4}), TOL);

        assertEquals(6.0, a.getL1Distance(b), TOL);
        assertEquals(6.0, a.getL1Distance(new double[] {0, 3, 4}), TOL);

        assertEquals(2.0, a.getLInfNorm(), TOL);
    }

    @Test
    public void testIsNaNAndIsInfinite() {
        OpenMapRealVector finite = new OpenMapRealVector(new double[] {1, 2});
        assertFalse(finite.isNaN());
        assertFalse(finite.isInfinite());

        OpenMapRealVector nan = new OpenMapRealVector(new double[] {Double.NaN, 1});
        assertTrue(nan.isNaN());

        OpenMapRealVector inf = new OpenMapRealVector(new double[] {1, Double.POSITIVE_INFINITY});
        assertFalse(inf.isNaN());
        assertTrue(inf.isInfinite());
    }

    @Test
    public void testOuterProduct() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0, 2, 3});
        RealMatrix m = v.outerProduct(new double[] {1, 0, 4});

        assertEquals(0, m.getEntry(0, 0), 0.0);
        assertEquals(2, m.getEntry(1, 0), 0.0);
        assertEquals(8, m.getEntry(1, 2), 0.0);
        assertEquals(3, m.getEntry(2, 0), 0.0);
        assertEquals(12, m.getEntry(2, 2), 0.0);
    }

    @Test
    public void testProjection() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1, 1, 1});
        OpenMapRealVector p = v.projection(new double[] {2, 0, 0});

        assertArrayEquals(new double[] {1, 0, 0}, p.getData(), TOL);
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector empty = new OpenMapRealVector(3);
        Iterator<?> emptyIterator = empty.sparseIterator();
        assertNotNull(emptyIterator);

        OpenMapRealVector v = new OpenMapRealVector(new double[] {0, 4, 0});
        Iterator<?> iterator = v.sparseIterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }
}