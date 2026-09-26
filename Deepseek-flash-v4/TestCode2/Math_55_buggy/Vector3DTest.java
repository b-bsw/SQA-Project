package org.apache.commons.math.geometry;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.apache.commons.math.exception.MathArithmeticException;

public class Vector3DTest {

    private static final double EPS = 1e-12;

    @Test
    public void testConstantsAndGetters() {
        Vector3D v = new Vector3D(1.5, -2.5, 3.5);
        assertEquals(1.5, v.getX(), EPS);
        assertEquals(-2.5, v.getY(), EPS);
        assertEquals(3.5, v.getZ(), EPS);
    }

    @Test
    public void testConstructors() {
        assertEquals(new Vector3D(2, 0, 0), new Vector3D(2, Vector3D.PLUS_I));
        assertEquals(new Vector3D(2, 3, 0), new Vector3D(2, Vector3D.PLUS_I, 3, Vector3D.PLUS_J));
        assertEquals(new Vector3D(1, 2, 3), new Vector3D(1, Vector3D.PLUS_I, 2, Vector3D.PLUS_J, 3, Vector3D.PLUS_K));
        assertEquals(new Vector3D(5, 2, 3), new Vector3D(1, Vector3D.PLUS_I, 2, Vector3D.PLUS_J, 3, Vector3D.PLUS_K, 4, Vector3D.PLUS_I));
        assertEquals(1, new Vector3D(0, 0).getX(), EPS);
        Vector3D sph = new Vector3D(0, Math.PI / 2);
        assertEquals(0, sph.getX(), EPS);
        assertEquals(0, sph.getY(), EPS);
        assertEquals(1, sph.getZ(), EPS);
    }

    @Test
    public void testNorms() {
        Vector3D v = new Vector3D(1, 2, 3);
        assertEquals(6, v.getNorm1(), EPS);
        assertEquals(14, v.getNormSq(), EPS);
        assertEquals(3, v.getNormInf(), EPS);
        assertEquals(Math.sqrt(14), v.getNorm(), EPS);
    }

    @Test
    public void testAddSubtractScalarNegate() {
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D v = new Vector3D(4, 5, 6);
        assertEquals(new Vector3D(5, 7, 9), u.add(v));
        assertEquals(new Vector3D(9, 12, 15), u.add(2, v));
        assertEquals(new Vector3D(-3, -3, -3), u.subtract(v));
        assertEquals(new Vector3D(-7, -8, -9), u.subtract(2, v));
        assertEquals(new Vector3D(2, 4, 6), u.scalarMultiply(2));
        assertEquals(new Vector3D(-1, -2, -3), u.negate());
    }

    @Test
    public void testAngularCoordinates() {
        assertEquals(0, Vector3D.PLUS_I.getAlpha(), EPS);
        assertEquals(Math.PI / 2, Vector3D.PLUS_J.getAlpha(), EPS);
        assertEquals(0, Vector3D.PLUS_I.getDelta(), EPS);
        assertEquals(Math.PI / 2, Vector3D.PLUS_K.getDelta(), EPS);
        assertEquals(Math.PI / 4, new Vector3D(1, 1, 0).getAlpha(), EPS);
        assertEquals(Math.PI / 4, new Vector3D(1, 0, 1).getDelta(), EPS);
    }

    @Test
    public void testNormalize() {
        assertEquals(Vector3D.PLUS_I, new Vector3D(3, 0, 0).normalize());
        assertEquals(1, new Vector3D(3, 0, 0).normalize().getNorm(), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalizeZeroNorm() {
        Vector3D.ZERO.normalize();
    }

    @Test
    public void testOrthogonal() {
        Vector3D u = new Vector3D(0, 1, 0);
        Vector3D o = u.orthogonal();
        assertEquals(new Vector3D(0, 0, -1), o);
        assertEquals(0, Vector3D.dotProduct(u, o), EPS);
        assertEquals(1, o.getNorm(), EPS);

        u = new Vector3D(1, 0, 0);
        o = u.orthogonal();
        assertEquals(new Vector3D(0, 0, 1), o);
        assertEquals(0, Vector3D.dotProduct(u, o), EPS);

        u = new Vector3D(1, 1, 0);
        o = u.orthogonal();
        assertEquals(0, Vector3D.dotProduct(u, o), EPS);
        assertEquals(1, o.getNorm(), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testOrthogonalZeroNorm() {
        Vector3D.ZERO.orthogonal();
    }

    @Test
    public void testAngle() {
        assertEquals(0, Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_I), EPS);
        assertEquals(Math.PI / 2, Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_J), EPS);
        assertEquals(Math.PI, Vector3D.angle(Vector3D.PLUS_I, Vector3D.MINUS_I), EPS);

        Vector3D near = new Vector3D(1, 1e-9, 0);
        assertEquals(1e-9, Vector3D.angle(Vector3D.PLUS_I, near), EPS);

        Vector3D nearOpp = new Vector3D(-1, 1e-9, 0);
        assertEquals(Math.PI - 1e-9, Vector3D.angle(Vector3D.PLUS_I, nearOpp), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAngleZeroNorm() {
        Vector3D.angle(Vector3D.ZERO, Vector3D.PLUS_I);
    }

    @Test
    public void testDotCross() {
        assertEquals(0, Vector3D.dotProduct(Vector3D.PLUS_I, Vector3D.PLUS_J), EPS);
        assertEquals(1, Vector3D.dotProduct(Vector3D.PLUS_I, Vector3D.PLUS_I), EPS);
        assertEquals(Vector3D.PLUS_K, Vector3D.crossProduct(Vector3D.PLUS_I, Vector3D.PLUS_J));
        assertEquals(Vector3D.MINUS_K, Vector3D.crossProduct(Vector3D.PLUS_J, Vector3D.PLUS_I));
    }

    @Test
    public void testDistances() {
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D v = new Vector3D(4, 5, 6);
        assertEquals(9, Vector3D.distance1(u, v), EPS);
        assertEquals(Math.sqrt(27), Vector3D.distance(u, v), EPS);
        assertEquals(3, Vector3D.distanceInf(u, v), EPS);
        assertEquals(27, Vector3D.distanceSq(u, v), EPS);
    }

    @Test
    public void testEqualsAndHash() {
        Vector3D v = new Vector3D(1, 2, 3);
        assertTrue(v.equals(v));
        assertEquals(v, new Vector3D(1, 2, 3));
        assertFalse(v.equals(new Vector3D(1, 2, 4)));
        assertFalse(v.equals(null));
        assertFalse(v.equals("foo"));
        assertTrue(Vector3D.NaN.equals(new Vector3D(Double.NaN, 1, 1)));
        assertFalse(v.equals(Vector3D.NaN));
        assertEquals(Vector3D.NaN.hashCode(), new Vector3D(Double.NaN, 0, 0).hashCode());
        assertFalse(Vector3D.PLUS_I.hashCode() == Vector3D.NaN.hashCode());
    }

    @Test
    public void testIsNaNInfinite() {
        assertTrue(Vector3D.NaN.isNaN());
        assertFalse(Vector3D.NaN.isInfinite());
        assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
        assertFalse(Vector3D.POSITIVE_INFINITY.isNaN());
        assertFalse(Vector3D.PLUS_I.isNaN());
        assertFalse(Vector3D.PLUS_I.isInfinite());
    }

    @Test
    public void testToString() {
        assertTrue(Vector3D.PLUS_I.toString().length() > 0);
    }
}