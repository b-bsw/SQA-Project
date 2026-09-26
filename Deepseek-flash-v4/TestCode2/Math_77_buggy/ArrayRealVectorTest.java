package org.apache.commons.math.linear;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ArrayRealVectorTest {

    private static final double EPS = 1e-12;

    @Test
    public void testConstructors() {
        ArrayRealVector v = new ArrayRealVector();
        assertEquals(0, v.getDimension());

        v = new ArrayRealVector(3);
        assertArrayEquals(new double[]{0, 0, 0}, v.getData(), 0.0);

        v = new ArrayRealVector(3, 2.5);
        assertArrayEquals(new double[]{2.5, 2.5, 2.5}, v.getData(), 0.0);

        double[] a = {1.0, 2.0};
        v = new ArrayRealVector(a);
        a[0] = 99.0;
        assertEquals(1.0, v.getEntry(0), 0.0);

        a = new double[]{1.0, 2.0};
        v = new ArrayRealVector(a, false);
        a[0] = 99.0;
        assertEquals(99.0, v.getEntry(0), 0.0);

        v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0}, 1, 2);
        assertArrayEquals(new double[]{2.0, 3.0}, v.getData(), 0.0);

        v = new ArrayRealVector(new Double[]{1.0, 2.0});
        assertArrayEquals(new double[]{1.0, 2.0}, v.getData(), 0.0);

        ArrayRealVector source = new ArrayRealVector(new double[]{1.0, 2.0});
        v = new ArrayRealVector(source);
        source.setEntry(0, 99.0);
        assertEquals(1.0, v.getEntry(0), 0.0);

        source = new ArrayRealVector(new double[]{1.0, 2.0});
        v = new ArrayRealVector(source, false);
        source.setEntry(1, 55.0);
        assertEquals(55.0, v.getEntry(1), 0.0);

        source = new ArrayRealVector(new double[]{1.0, 2.0});
        v = new ArrayRealVector(source, true);
        source.setEntry(1, 66.0);
        assertEquals(2.0, v.getEntry(1), 0.0);

        v = new ArrayRealVector(
                new ArrayRealVector(new double[]{1.0, 2.0}),
                new ArrayRealVector(new double[]{3.0, 4.0}));
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, v.getData(), 0.0);

        v = new ArrayRealVector(
                new ArrayRealVector(new double[]{1.0}),
                new double[]{2.0});
        assertArrayEquals(new double[]{1.0, 2.0}, v.getData(), 0.0);

        v = new ArrayRealVector(
                new double[]{1.0},
                new ArrayRealVector(new double[]{2.0}));
        assertArrayEquals(new double[]{1.0, 2.0}, v.getData(), 0.0);

        v = new ArrayRealVector((RealVector) new ArrayRealVector(new double[]{1.0, 2.0}));
        assertArrayEquals(new double[]{1.0, 2.0}, v.getData(), 0.0);
    }

    @Test
    public void testConstructorErrors() {
        try {
            new ArrayRealVector((double[]) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }

        try {
            new ArrayRealVector((double[]) null, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }

        try {
            new ArrayRealVector(new double[0], true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCopyAndDataAccess() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector copy = (ArrayRealVector) v.copy();
        assertNotSame(v, copy);
        copy.setEntry(0, 99.0);
        assertEquals(1.0, v.getEntry(0), 0.0);

        double[] ref = v.getDataRef();
        ref[1] = 20.0;
        assertEquals(20.0, v.getEntry(1), 0.0);

        double[] data = v.getData();
        data[0] = -5.0;
        assertEquals(1.0, v.getEntry(0), 0.0);

        double[] toArray = v.toArray();
        toArray[1] = -9.0;
        assertEquals(20.0, v.getEntry(1), 0.0);

        try {
            v.getEntry(-1);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }

        try {
            v.setEntry(-1, 0.0);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testAddSubtractEbe() {
        ArrayRealVector a = new ArrayRealVector(new double[]{1.0, 2.0});
        ArrayRealVector b = new ArrayRealVector(new double[]{3.0, 4.0});

        assertArrayEquals(new double[]{4.0, 6.0}, a.add(b).getData(), EPS);
        assertArrayEquals(new double[]{4.0, 6.0}, a.add((RealVector) b).getData(), EPS);
        assertArrayEquals(new double[]{4.0, 6.0}, a.add(new double[]{3.0, 4.0}).getData(), EPS);
        assertArrayEquals(new double[]{1.0, 2.0}, a.getData(), 0.0);

        assertArrayEquals(new double[]{-2.0, -2.0}, a.subtract(b).getData(), EPS);
        assertArrayEquals(new double[]{1.0, 2.0}, a.getData(), 0.0);

        assertArrayEquals(new double[]{3.0, 8.0}, a.ebeMultiply(b).getData(), EPS);
        assertArrayEquals(new double[]{1.0 / 3.0, 0.5}, a.ebeDivide(b).getData(), EPS);
        assertArrayEquals(new double[]{1.0, 2.0}, a.getData(), 0.0);

        try {
            a.add(new double[]{1.0});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            a.ebeMultiply(new ArrayRealVector(new double[]{1.0}));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testNormsDistancesDotProduct() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, -4.0});
        assertEquals(5.0, v.getNorm(), EPS);
        assertEquals(7.0, v.getL1Norm(), EPS);
        assertEquals(4.0, v.getLInfNorm(), EPS);

        ArrayRealVector zero = new ArrayRealVector(new double[]{0.0, 0.0});

        assertEquals(5.0, v.getDistance(zero), EPS);
        assertEquals(7.0, v.getL1Distance(zero), EPS);
        assertEquals(4.0, v.getLInfDistance(zero), EPS);

        assertEquals(5.0, v.getDistance((RealVector) zero), EPS);
        assertEquals(7.0, v.getL1Distance((RealVector) zero), EPS);
        assertEquals(4.0, v.getLInfDistance((RealVector) zero), EPS);

        assertEquals(5.0, v.getDistance(new double[]{0.0, 0.0}), EPS);
        assertEquals(7.0, v.getL1Distance(new double[]{0.0, 0.0}), EPS);
        assertEquals(4.0, v.getLInfDistance(new double[]{0.0, 0.0}), EPS);

        ArrayRealVector a = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector b = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});

        assertEquals(32.0, a.dotProduct(b), EPS);
        assertEquals(32.0, a.dotProduct(b.getData()), EPS);
        assertEquals(32.0, a.dotProduct((RealVector) b), EPS);
    }

    @Test
    public void testMapArithmeticToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});
        v.mapAddToSelf(2.0);
        assertArrayEquals(new double[]{3.0, 4.0}, v.getData(), EPS);

        v.mapSubtractToSelf(1.0);
        assertArrayEquals(new double[]{2.0, 3.0}, v.getData(), EPS);

        v.mapMultiplyToSelf(3.0);
        assertArrayEquals(new double[]{6.0, 9.0}, v.getData(), EPS);

        v.mapDivideToSelf(2.0);
        assertArrayEquals(new double[]{3.0, 4.5}, v.getData(), EPS);

        v.mapPowToSelf(2.0);
        assertArrayEquals(new double[]{9.0, 20.25}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{2.0, 4.0});
        v.mapInvToSelf();
        assertArrayEquals(new double[]{0.5, 0.25}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{-2.0, 3.0});
        v.mapAbsToSelf();
        assertArrayEquals(new double[]{2.0, 3.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{4.0, 9.0});
        v.mapSqrtToSelf();
        assertArrayEquals(new double[]{2.0, 3.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{8.0, 27.0});
        v.mapCbrtToSelf();
        assertArrayEquals(new double[]{2.0, 3.0}, v.getData(), EPS);
    }

    @Test
    public void testMapExpLogToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapExpToSelf();
        assertArrayEquals(new double[]{1.0, Math.E}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapExpm1ToSelf();
        assertArrayEquals(new double[]{0.0, Math.E - 1.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{1.0, Math.E});
        v.mapLogToSelf();
        assertArrayEquals(new double[]{0.0, 1.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{1.0, 1000.0});
        v.mapLog10ToSelf();
        assertArrayEquals(new double[]{0.0, 3.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, Math.E - 1.0});
        v.mapLog1pToSelf();
        assertArrayEquals(new double[]{0.0, 1.0}, v.getData(), EPS);
    }

    @Test
    public void testMapTrigToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapCoshToSelf();
        assertArrayEquals(new double[]{1.0, Math.cosh(1.0)}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapSinhToSelf();
        assertArrayEquals(new double[]{0.0, Math.sinh(1.0)}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapTanhToSelf();
        assertArrayEquals(new double[]{0.0, Math.tanh(1.0)}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, Math.PI / 2.0});
        v.mapSinToSelf();
        assertArrayEquals(new double[]{0.0, 1.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, Math.PI / 2.0});
        v.mapCosToSelf();
        assertArrayEquals(new double[]{1.0, 0.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, Math.PI / 4.0});
        v.mapTanToSelf();
        assertArrayEquals(new double[]{0.0, 1.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapAsinToSelf();
        assertArrayEquals(new double[]{0.0, Math.PI / 2.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{1.0, 0.0});
        v.mapAcosToSelf();
        assertArrayEquals(new double[]{0.0, Math.PI / 2.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, 1.0});
        v.mapAtanToSelf();
        assertArrayEquals(new double[]{0.0, Math.PI / 4.0}, v.getData(), EPS);
    }

    @Test
    public void testMapRoundingToSelf() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.2, -1.8});
        v.mapCeilToSelf();
        assertArrayEquals(new double[]{2.0, -1.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{1.8, -1.2});
        v.mapFloorToSelf();
        assertArrayEquals(new double[]{1.0, -2.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{1.2, 2.8});
        v.mapRintToSelf();
        assertArrayEquals(new double[]{1.0, 3.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{-2.5, 0.0, 3.5});
        v.mapSignumToSelf();
        assertArrayEquals(new double[]{-1.0, 0.0, 1.0}, v.getData(), 0.0);

        v = new ArrayRealVector(new double[]{1.0, 1.5});
        v.mapUlpToSelf();
        assertArrayEquals(new double[]{Math.ulp(1.0), Math.ulp(1.5)}, v.getData(), EPS);
    }

    @Test
    public void testUnitVectorAndUnitize() {
        ArrayRealVector v = new ArrayRealVector(new double[]{3.0, 0.0});
        ArrayRealVector u = (ArrayRealVector) v.unitVector();
        assertArrayEquals(new double[]{3.0, 0.0}, v.getData(), EPS);
        assertArrayEquals(new double[]{1.0, 0.0}, u.getData(), EPS);

        v.unitize();
        assertArrayEquals(new double[]{1.0, 0.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{0.0, 4.0});
        v.unitize();
        assertArrayEquals(new double[]{0.0, 1.0}, v.getData(), EPS);

        try {
            new ArrayRealVector(new double[]{0.0, 0.0}).unitVector();
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }

        try {
            new ArrayRealVector(new double[]{0.0, 0.0}).unitize();
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testProjection() {
        ArrayRealVector x = new ArrayRealVector(new double[]{1.0, 0.0});
        ArrayRealVector axis = new ArrayRealVector(new double[]{2.0, 3.0});
        double[] expected = {4.0 / 13.0, 6.0 / 13.0};

        ArrayRealVector p1 = (ArrayRealVector) x.projection((RealVector) axis);
        assertArrayEquals(expected, p1.getData(), EPS);

        ArrayRealVector p2 = (ArrayRealVector) x.projection(axis);
        assertArrayEquals(expected, p2.getData(), EPS);

        ArrayRealVector p3 = (ArrayRealVector) x.projection(new double[]{2.0, 3.0});
        assertArrayEquals(expected, p3.getData(), EPS);
    }

    @Test
    public void testOuterProduct() {
        ArrayRealVector x = new ArrayRealVector(new double[]{1.0, 2.0});
        RealMatrix m = x.outerProduct(new double[]{3.0, 4.0});

        assertEquals(2, m.getRowDimension());
        assertEquals(2, m.getColumnDimension());
        assertEquals(3.0, m.getEntry(0, 0), EPS);
        assertEquals(4.0, m.getEntry(0, 1), EPS);
        assertEquals(6.0, m.getEntry(1, 0), EPS);
        assertEquals(8.0, m.getEntry(1, 1), EPS);
    }

    @Test
    public void testAppend() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0});

        RealVector r1 = v.append(new ArrayRealVector(new double[]{3.0, 4.0}));
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, r1.getData(), EPS);

        RealVector r2 = v.append((RealVector) new ArrayRealVector(new double[]{3.0, 4.0}));
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, r2.getData(), EPS);

        RealVector r3 = v.append(3.0);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, r3.getData(), EPS);

        RealVector r4 = v.append(new double[]{3.0, 4.0});
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0}, r4.getData(), EPS);
    }

    @Test
    public void testSubVectorAndEntry() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});

        ArrayRealVector sub = (ArrayRealVector) v.getSubVector(1, 2);
        assertArrayEquals(new double[]{2.0, 3.0}, sub.getData(), EPS);
        sub.setEntry(0, 99.0);
        assertEquals(2.0, v.getEntry(1), 0.0);

        try {
            v.getSubVector(1, 4);
            fail("Expected MatrixIndexException");
        } catch (MatrixIndexException e) {
            // expected
        }

        v.setEntry(0, 10.0);
        assertEquals(10.0, v.getEntry(0), EPS);
        v.set(1, new ArrayRealVector(new double[]{7.0, 8.0}));
        assertArrayEquals(new double[]{10.0, 7.0, 8.0, 4.0}, v.getData(), EPS);

        v = new ArrayRealVector(new double[]{1.0, 2.0, 3.0, 4.0});
        v.setSubVector(1, new double[]{7.0, 8.0});
        assertArrayEquals(new double[]{1.0, 7.0, 8.0, 4.0}, v.getData(), EPS);
    }

    @Test
    public void testIsNaNIsInfiniteEqualsHashCode() {
        ArrayRealVector nan = new ArrayRealVector(new double[]{Double.NaN});
        assertTrue(nan.isNaN());
        assertFalse(nan.isInfinite());

        ArrayRealVector inf = new ArrayRealVector(new double[]{Double.POSITIVE_INFINITY});
        assertFalse(inf.isNaN());
        assertTrue(inf.isInfinite());

        ArrayRealVector normal = new ArrayRealVector(new double[]{1.0, 2.0});
        assertFalse(normal.isNaN());
        assertFalse(normal.isInfinite());

        assertTrue(nan.equals(nan));
        assertTrue(nan.equals(new ArrayRealVector(new double[]{Double.NaN})));
        assertTrue(inf.equals(new ArrayRealVector(new double[]{Double.POSITIVE_INFINITY})));
        assertTrue(normal.equals(new ArrayRealVector(new double[]{1.0, 2.0})));
        assertFalse(normal.equals(new ArrayRealVector(new double[]{1.0, 3.0})));

        assertEquals(
                new ArrayRealVector(new double[]{1.0, 2.0}).hashCode(),
                new ArrayRealVector(new double[]{1.0, 2.0}).hashCode());
    }

    @Test
    public void testToStringAndToArray() {
        ArrayRealVector v = new ArrayRealVector(new double[]{1.5, 2.5});

        double[] arr = v.toArray();
        arr[0] = 0.0;
        assertEquals(1.5, v.getEntry(0), 0.0);

        String s = v.toString();
        assertNotNull(s);
        assertTrue(s.length() > 0);
    }
}