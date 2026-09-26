package org.apache.commons.math.complex;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Test;

public class ComplexTest {
    private static final double EPS = 1e-10;

    private void assertComplexEquals(Complex expected, Complex actual, double eps) {
        assertEquals(expected.getReal(), actual.getReal(), eps);
        assertEquals(expected.getImaginary(), actual.getImaginary(), eps);
    }

    private void assertComplexNaN(Complex c) {
        assertTrue(c.isNaN());
        assertTrue(Double.isNaN(c.getReal()));
        assertTrue(Double.isNaN(c.getImaginary()));
    }

    @Test
    public void testAbs() {
        assertEquals(5.0, new Complex(3.0, 4.0).abs(), EPS);
        assertEquals(5.0, new Complex(4.0, 3.0).abs(), EPS);
        assertEquals(3.0, new Complex(0.0, 3.0).abs(), EPS);
        assertEquals(3.0, new Complex(3.0, 0.0).abs(), EPS);
        assertEquals(0.0, Complex.ZERO.abs(), EPS);
        assertTrue(Double.isNaN(Complex.NaN.abs()));
        assertTrue(Double.isInfinite(Complex.INF.abs()));
    }

    @Test
    public void testAdd() {
        assertComplexEquals(new Complex(4.0, 6.0), new Complex(1.0, 2.0).add(new Complex(3.0, 4.0)), EPS);
        assertComplexNaN(new Complex(1.0, 2.0).add(Complex.NaN));
    }

    @Test
    public void testConjugate() {
        assertComplexEquals(new Complex(1.0, -2.0), new Complex(1.0, 2.0).conjugate(), EPS);
        assertComplexNaN(Complex.NaN.conjugate());
    }

    @Test
    public void testDivide() {
        Complex q1 = new Complex(3.0, 4.0).divide(new Complex(1.0, 2.0));
        assertComplexEquals(new Complex(2.2, -0.4), q1, EPS);

        Complex q2 = new Complex(3.0, 4.0).divide(new Complex(2.0, 1.0));
        assertComplexEquals(new Complex(2.0, 1.0), q2, EPS);

        assertComplexEquals(new Complex(2.0 / 3.0, -1.0 / 3.0),
                new Complex(1.0, 2.0).divide(new Complex(0.0, 3.0)), EPS);

        assertComplexNaN(Complex.ONE.divide(Complex.ZERO));
        assertComplexNaN(Complex.ONE.divide(Complex.NaN));
        assertComplexEquals(Complex.ZERO, new Complex(1.0, 1.0).divide(Complex.INF), EPS);
    }

    @Test
    public void testEquals() {
        Complex c = new Complex(1.0, 2.0);
        assertTrue(c.equals(c));
        assertTrue(c.equals(new Complex(1.0, 2.0)));
        assertFalse(c.equals(new Complex(1.0, 3.0)));
        assertFalse(c.equals("not a complex"));
        assertTrue(Complex.NaN.equals(new Complex(Double.NaN, 0.0)));
        assertFalse(c.equals(Complex.NaN));
    }

    @Test
    public void testHashCode() {
        assertEquals(7, Complex.NaN.hashCode());
        assertEquals(new Complex(1.0, 2.0).hashCode(), new Complex(1.0, 2.0).hashCode());
    }

    @Test
    public void testGettersAndFlags() {
        Complex finite = new Complex(1.5, -2.5);
        assertEquals(1.5, finite.getReal(), EPS);
        assertEquals(-2.5, finite.getImaginary(), EPS);
        assertFalse(finite.isNaN());
        assertFalse(finite.isInfinite());

        assertTrue(Complex.NaN.isNaN());
        assertFalse(Complex.NaN.isInfinite());

        assertFalse(Complex.INF.isNaN());
        assertTrue(Complex.INF.isInfinite());
    }

    @Test
    public void testMultiply() {
        assertComplexEquals(new Complex(-5.0, 10.0), new Complex(1.0, 2.0).multiply(new Complex(3.0, 4.0)), EPS);
        assertComplexEquals(new Complex(2.0, 4.0), new Complex(1.0, 2.0).multiply(2.0), EPS);
        assertComplexNaN(Complex.NaN.multiply(Complex.ONE));
        assertComplexNaN(new Complex(1.0, 2.0).multiply(Double.NaN));
        assertTrue(Complex.INF.equals(new Complex(1.0, 1.0).multiply(new Complex(2.0, Double.POSITIVE_INFINITY))));
        assertTrue(Complex.INF.equals(new Complex(1.0, 1.0).multiply(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testNegate() {
        assertComplexEquals(new Complex(-1.0, 2.0), new Complex(1.0, -2.0).negate(), EPS);
        assertComplexNaN(Complex.NaN.negate());
    }

    @Test
    public void testSubtract() {
        assertComplexEquals(new Complex(3.0, 3.0), new Complex(5.0, 6.0).subtract(new Complex(2.0, 3.0)), EPS);
        assertComplexNaN(new Complex(1.0, 2.0).subtract(Complex.NaN));
    }

    @Test
    public void testTrigonometric() {
        assertComplexEquals(Complex.ONE, new Complex(0.0, 0.0).cos(), EPS);
        assertComplexEquals(Complex.ONE, new Complex(0.0, 0.0).cosh(), EPS);
        assertComplexEquals(Complex.ONE, new Complex(0.0, 0.0).exp(), EPS);
        assertComplexEquals(Complex.ZERO, new Complex(0.0, 0.0).sin(), EPS);
        assertComplexEquals(Complex.ZERO, new Complex(0.0, 0.0).sinh(), EPS);
        assertComplexEquals(Complex.ZERO, new Complex(0.0, 0.0).tan(), EPS);
        assertComplexEquals(Complex.ZERO, new Complex(0.0, 0.0).tanh(), EPS);

        assertComplexNaN(Complex.NaN.sin());
        assertComplexNaN(Complex.NaN.cos());
        assertComplexNaN(Complex.NaN.tan());
        assertComplexNaN(Complex.NaN.sinh());
        assertComplexNaN(Complex.NaN.cosh());
        assertComplexNaN(Complex.NaN.tanh());
    }

    @Test
    public void testInverseTrigonometric() {
        assertComplexEquals(Complex.ZERO, new Complex(1.0, 0.0).acos(), EPS);
        assertComplexEquals(Complex.ZERO, new Complex(0.0, 0.0).asin(), EPS);
        assertComplexEquals(Complex.ZERO, new Complex(0.0, 0.0).atan(), EPS);

        assertComplexNaN(Complex.NaN.acos());
        assertComplexNaN(Complex.NaN.asin());
        assertComplexNaN(Complex.NaN.atan());
    }

    @Test
    public void testLogExpPow() {
        assertComplexEquals(Complex.ZERO, new Complex(1.0, 0.0).log(), EPS);
        assertComplexEquals(new Complex(0.0, Math.PI), new Complex(-1.0, 0.0).log(), EPS);
        assertComplexEquals(Complex.ONE, new Complex(0.0, 0.0).exp(), EPS);
        assertComplexEquals(new Complex(8.0, 0.0), new Complex(2.0, 0.0).pow(new Complex(3.0, 0.0)), EPS);

        assertComplexNaN(Complex.NaN.log());
        assertComplexNaN(Complex.NaN.exp());
    }

    @Test
    public void testSqrt() {
        assertComplexEquals(Complex.ZERO, Complex.ZERO.sqrt(), EPS);
        assertComplexEquals(new Complex(2.0, 0.0), new Complex(4.0, 0.0).sqrt(), EPS);
        assertComplexEquals(new Complex(1.0, 2.0), new Complex(-3.0, 4.0).sqrt(), EPS);
        assertComplexNaN(Complex.NaN.sqrt());
    }

    @Test
    public void testSqrt1z() {
        assertComplexEquals(Complex.ONE, new Complex(0.0, 0.0).sqrt1z(), EPS);
    }

    @Test
    public void testGetArgument() {
        assertEquals(0.0, new Complex(2.0, 0.0).getArgument(), EPS);
        assertEquals(Math.PI / 2.0, new Complex(0.0, 1.0).getArgument(), EPS);
    }

    @Test
    public void testNthRoot() {
        List<Complex> roots = Complex.ONE.nthRoot(2);
        assertEquals(2, roots.size());
        assertComplexEquals(new Complex(1.0, 0.0), roots.get(0), EPS);
        assertComplexEquals(new Complex(-1.0, 0.0), roots.get(1), EPS);

        List<Complex> oneRoot = new Complex(2.0, 3.0).nthRoot(1);
        assertEquals(1, oneRoot.size());
        assertComplexEquals(new Complex(2.0, 3.0), oneRoot.get(0), EPS);

        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        assertEquals(1, nanRoots.size());
        assertComplexNaN(nanRoots.get(0));

        List<Complex> infRoots = Complex.INF.nthRoot(2);
        assertEquals(1, infRoots.size());
        assertTrue(infRoots.get(0).equals(Complex.INF));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNthRootInvalidN() {
        Complex.ONE.nthRoot(0);
    }

    @Test
    public void testNullArguments() {
        Complex z = new Complex(1.0, 2.0);
        try {
            z.add(null);
            fail();
        } catch (NullArgumentException e) { }

        try {
            z.subtract(null);
            fail();
        } catch (NullArgumentException e) { }

        try {
            z.multiply((Complex) null);
            fail();
        } catch (NullArgumentException e) { }

        try {
            z.divide(null);
            fail();
        } catch (NullArgumentException e) { }

        try {
            z.pow(null);
            fail();
        } catch (NullArgumentException e) { }
    }

    @Test
    public void testGetFieldAndToString() {
        assertNotNull(Complex.ZERO.getField());
        assertEquals("(1.0, 2.0)", new Complex(1.0, 2.0).toString());
    }
}