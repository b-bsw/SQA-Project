package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.MathArithmeticException;

public class OpenMapRealVectorTest {

    private static final double DELTA = 1e-12;

    @Test
    public void testConstructorsAndSparsity() {
        OpenMapRealVector zeroDim = new OpenMapRealVector();
        assertEquals(0, zeroDim.getDimension());

        OpenMapRealVector empty = new OpenMapRealVector(5);
        assertEquals(0.0, empty.getSparsity(), 0.0);

        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0, -2.0, 0.5});
        assertEquals(4, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);
        assertEquals(-2.0, v.getEntry(2), 0.0);
        assertEquals(0.5, v.getEntry(3), 0.0);
        assertEquals(0.75, v.getSparsity(), 0.0);

        OpenMapRealVector fromDoubles = new OpenMapRealVector(new Double[] {1.0, 0.0, 2.0});
        assertArrayEquals(new double[] {1.0, 0.0, 2.0}, fromDoubles.getData(), 0.0);
    }

    @Test
    public void testEpsilonFilteringAndSetEntry() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {0.2, 0.5}, 0.3);
        assertEquals(2, v.getDimension());
        assertEquals(0.0, v.getEntry(0), 0.0);
        assertEquals(0.5, v.getEntry(1), 0.0);

        v.setEntry(0, 0.1);
        assertEquals(0.0, v.getEntry(0), 0.0);
        v.setEntry(0, 0.4);
        assertEquals(0.4, v.getEntry(0), 0.0);
        v.setEntry(1, 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);

        v.set(0.0);
        assertEquals(0.0, v.getEntry(0), 0.0);
        v.set(2.0);
        assertEquals(2.0, v.getEntry(0), 0.0);
        assertEquals(2.0, v.getEntry(1), 0.0);
        assertEquals(8.0, v.dotProduct(v), 0.0);
    }

    @Test
    public void testAddSubtract() {
        OpenMapRealVector v1 = new OpenMapRealVector(new double[] {1.0, 0.0, 3.0});
        OpenMapRealVector v2 = new OpenMapRealVector(new double[] {4.0, 5.0, 0.0});

        OpenMapRealVector sum = v1.add(v2);
        assertArrayEquals(new double[] {5.0, 5.0, 3.0}, sum.getData(), 0.0);

        OpenMapRealVector small = new OpenMapRealVector(new double[] {2.0, 0.0, 0.0});
        OpenMapRealVector sum2 = v1.add(small);
        assertArrayEquals(new double[] {3.0, 0.0, 3.0}, sum2.getData(), 0.0);

        OpenMapRealVector diff = v1.subtract(v2);
        assertArrayEquals(new double[] {-3.0, -5.0, 3.0}, diff.getData(), 0.0);

        OpenMapRealVector diff2 = v1.subtract(new double[] {0.0, 2.0, 0.0});
        assertArrayEquals(new double[] {1.0, -2.0, 3.0}, diff2.getData(), 0.0);
    }

    @Test
    public void testAppend() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0});

        OpenMapRealVector a1 = v.append(4.0);
        assertArrayEquals(new double[] {1.0, 0.0, 4.0}, a1.getData(), 0.0);

        OpenMapRealVector a2 = v.append(new double[] {2.0, 3.0});
        assertArrayEquals(new double[] {1.0, 0.0, 2.0, 3.0}, a2.getData(), 0.0);

        OpenMapRealVector a3 = v.append(new OpenMapRealVector(new double[] {5.0, 0.0, 6.0}));
        assertArrayEquals(new double[] {1.0, 0.0, 5.0, 0.0, 6.0}, a3.getData(), 0.0);
    }

    @Test
    public void testDotProduct() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 2.0, 3.0});
        OpenMapRealVector w = new OpenMapRealVector(new double[] {4.0, 5.0, 6.0});
        assertEquals(32.0, v.dotProduct(w), 0.0);
        assertEquals(32.0, v.dotProduct((RealVector) w), 0.0);

        OpenMapRealVector sparse = new OpenMapRealVector(new double[] {0.0, 5.0, 0.0});
        assertEquals(10.0, sparse.dotProduct(v), 0.0);
        assertEquals(10.0, sparse.dotProduct((RealVector) v), 0.0);
    }

    @Test
    public void testEbeOperations() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2.0, 0.0, 6.0});
        OpenMapRealVector w = new OpenMapRealVector(new double[] {1.0, 3.0, 2.0});

        assertArrayEquals(new double[] {2.0, 0.0, 12.0}, v.ebeMultiply(w).getData(), 0.0);
        assertArrayEquals(new double[] {2.0, 0.0, 3.0}, v.ebeDivide(w).getData(), 0.0);
        assertArrayEquals(new double[] {2.0, 0.0, 12.0}, v.ebeMultiply(new double[] {1.0, 3.0, 2.0}).getData(), 0.0);
        assertArrayEquals(new double[] {2.0, 0.0, 3.0}, v.ebeDivide(new double[] {1.0, 3.0, 2.0}).getData(), 0.0);
    }

    @Test
    public void testDistances() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {3.0, 0.0, 4.0});
        OpenMapRealVector w = new OpenMapRealVector(new double[] {0.0, 5.0, 0.0});

        assertEquals(Math.sqrt(50.0), v.getDistance(w), DELTA);
        assertEquals(Math.sqrt(50.0), v.getDistance((RealVector) w), DELTA);
        assertEquals(Math.sqrt(34.0), v.getDistance(new double[] {0.0, 3.0, 0.0}), DELTA);

        assertEquals(12.0, v.getL1Distance(w), 0.0);
        assertEquals(12.0, v.getL1Distance((RealVector) w), 0.0);
        assertEquals(10.0, v.getL1Distance(new double[] {0.0, 3.0, 0.0}), 0.0);

        assertEquals(5.0, v.getLInfDistance((RealVector) w), 0.0);
        assertEquals(4.0, v.getLInfDistance(new double[] {0.0, 3.0, 0.0}), 0.0);
    }

    @Test
    public void testMapAdd() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0, 3.0});
        OpenMapRealVector mapped = v.mapAdd(2.0);
        assertArrayEquals(new double[] {3.0, 2.0, 5.0}, mapped.getData(), 0.0);
        assertArrayEquals(new double[] {1.0, 0.0, 3.0}, v.getData(), 0.0);

        OpenMapRealVector self = v.mapAddToSelf(1.0);
        assertSame(v, self);
        assertArrayEquals(new double[] {2.0, 1.0, 4.0}, v.getData(), 0.0);
    }

    @Test
    public void testGetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0, 3.0, 4.0});
        OpenMapRealVector sub = v.getSubVector(1, 2);
        assertEquals(2, sub.getDimension());
        assertArrayEquals(new double[] {0.0, 3.0}, sub.getData(), 0.0);
        assertArrayEquals(v.getData(), v.getSubVector(0, 4).getData(), 0.0);
    }

    @Test
    public void testSetSubVector() {
        OpenMapRealVector v = new OpenMapRealVector(4);
        v.setSubVector(1, new double[] {2.0, 0.0, 3.0});
        assertArrayEquals(new double[] {0.0, 2.0, 0.0, 3.0}, v.getData(), 0.0);

        OpenMapRealVector w = new OpenMapRealVector(4);
        w.setSubVector(0, new OpenMapRealVector(new double[] {1.0, 0.0, 2.0, 0.0}));
        assertArrayEquals(new double[] {1.0, 0.0, 2.0, 0.0}, w.getData(), 0.0);
    }

    @Test
    public void testNaNInfinite() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, Double.NaN, 3.0});
        assertTrue(v.isNaN());
        assertFalse(v.isInfinite());

        OpenMapRealVector inf = new OpenMapRealVector(new double[] {1.0, Double.POSITIVE_INFINITY, 3.0});
        assertFalse(inf.isNaN());
        assertTrue(inf.isInfinite());

        OpenMapRealVector clean = new OpenMapRealVector(new double[] {1.0, 2.0, 3.0});
        assertFalse(clean.isNaN());
        assertFalse(clean.isInfinite());
    }

    @Test
    public void testOuterProduct() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {2.0, 0.0, 3.0});
        RealMatrix m = v.outerProduct(new double[] {1.0, 2.0});
        assertEquals(3, m.getRowDimension());
        assertEquals(2, m.getColumnDimension());
        assertEquals(2.0, m.getEntry(0, 0), 0.0);
        assertEquals(4.0, m.getEntry(0, 1), 0.0);
        assertEquals(0.0, m.getEntry(1, 0), 0.0);
        assertEquals(3.0, m.getEntry(2, 0), 0.0);
        assertEquals(6.0, m.getEntry(2, 1), 0.0);
    }

    @Test
    public void testProjection() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {3.0, 4.0});
        RealVector proj = v.projection(new OpenMapRealVector(new double[] {1.0, 0.0}));
        assertEquals(3.0, proj.getEntry(0), 0.0);
        assertEquals(0.0, proj.getEntry(1), 0.0);

        RealVector proj2 = v.projection(new double[] {0.0, 1.0});
        assertEquals(0.0, proj2.getEntry(0), 0.0);
        assertEquals(4.0, proj2.getEntry(1), 0.0);
    }

    @Test
    public void testUnitize() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {3.0, 0.0, 4.0});
        OpenMapRealVector u = v.unitVector();
        assertEquals(5.0, v.getNorm(), DELTA);
        assertEquals(1.0, u.getNorm(), DELTA);
        assertEquals(0.6, u.getEntry(0), DELTA);
        assertEquals(0.8, u.getEntry(2), DELTA);

        v.unitize();
        assertEquals(1.0, v.getNorm(), DELTA);
        assertEquals(0.6, v.getEntry(0), DELTA);

        try {
            new OpenMapRealVector(new double[] {0.0, 0.0}).unitVector();
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testEqualsHashCode() {
        OpenMapRealVector a = new OpenMapRealVector(new double[] {1.0, 0.0, 3.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[] {1.0, 0.0, 3.0});
        OpenMapRealVector c = new OpenMapRealVector(new double[] {1.0, 0.0, 4.0});
        OpenMapRealVector d = new OpenMapRealVector(new double[] {1.0, 0.0, 3.0}, 1.0e-11);

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(c));
        assertFalse(a.equals(d));
        assertFalse(a.equals(null));
        assertFalse(a.equals("not a vector"));
    }

    @Test
    public void testCopyAndConstructors() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0, 2.0});
        OpenMapRealVector c = v.copy();
        assertFalse(v == c);
        assertTrue(v.equals(c));

        OpenMapRealVector c2 = new OpenMapRealVector(c);
        assertTrue(v.equals(c2));

        RealVector rv = v;
        OpenMapRealVector c3 = new OpenMapRealVector(rv);
        assertTrue(v.equals(c3));
    }

    @Test
    public void testGetDataToArray() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {1.0, 0.0, 2.0});
        assertArrayEquals(new double[] {1.0, 0.0, 2.0}, v.getData(), 0.0);
        assertArrayEquals(new double[] {1.0, 0.0, 2.0}, v.toArray(), 0.0);
    }

    @Test
    public void testSparseIterator() {
        OpenMapRealVector v = new OpenMapRealVector(new double[] {5.0, 0.0, 7.0});
        java.util.Iterator<RealVector.Entry> it = v.sparseIterator();

        assertTrue(it.hasNext());
        RealVector.Entry e = it.next();
        assertEquals(0, e.getIndex());
        assertEquals(5.0, e.getValue(), 0.0);

        assertTrue(it.hasNext());
        assertEquals(2, it.next().getIndex());
        assertFalse(it.hasNext());

        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionMismatch() {
        new OpenMapRealVector(2).add(new OpenMapRealVector(3));
    }
}