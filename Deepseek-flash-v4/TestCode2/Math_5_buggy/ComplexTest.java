package org.apache.commons.math3.complex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;

public class ComplexTest {

    private static final double EPS = 1e-12;

    private void assertComplexEquals(double expectedReal, double expectedImag,
                                     Complex actual, double delta) {
        assertEquals(expectedReal, actual.getReal(), delta);
        assertEquals(expectedImag, actual.getImaginary(), delta);
    }

    @Test
    public void testConstructorAndAccessors() {
        Complex z = new Complex(1.5, -2.5);
        assertEquals(1.5, z.getReal(), EPS);
        assertEquals(-2.5, z.getImaginary(), EPS);
    }

    @Test
    public void testAbs() {
        assertEquals(5.0, new Complex(3, 4).abs(), EPS);
        assertEquals(5.0, new Complex(4, 3).abs(), EPS);
        assertEquals(5.0, new Complex(-3, -4).abs(), EPS);
        assertEquals(0.0, Complex.ZERO.abs(), 0.0);
        assertTrue(Double.isNaN(Complex.NaN.abs()));
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 0.0);
    }

    @Test
    public void testAddComplex() {
        Complex z = new Complex(1, 2).add(new Complex(3, -4));
        assertComplexEquals(4.0, -2.0, z, EPS);
    }

    @Test
    public void testAddComplexNullThrows() {
        try {
            new Complex(1, 2).add(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testAddDouble() {
        Complex z = new Complex(1, 2).add(2.5);
        assertComplexEquals(3.5, 2.0, z, EPS);
    }

    @Test
    public void testConjugate() {
        Complex z = new Complex(1, -2).conjugate();
        assertComplexEquals(1.0, 2.0, z, EPS);
    }

    @Test
    public void testDivideComplex() {
        Complex z = Complex.ONE.divide(Complex.I);
        assertComplexEquals(0.0, -1.0, z, EPS);
    }

    @Test
    public void testDivideComplexByZero() {
        Complex z = Complex.ONE.divide(Complex.ZERO);
        assertTrue(z.isNaN());
    }

    @Test
    public void testDivideComplexNullThrows() {
        try {
            new Complex(1, 2).divide(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testDivideDouble() {
        Complex z = new Complex(1, 2).divide(2.0);
        assertComplexEquals(0.5, 1.0, z, EPS);
    }

    @Test
    public void testReciprocal() {
        Complex z = new Complex(2, 0).reciprocal();
        assertComplexEquals(0.5, 0.0, z, EPS);
    }

    @Test
    public void testReciprocalZero() {
        assertTrue(Complex.ZERO.reciprocal().isNaN());
    }

    @Test
    public void testEquals() {
        assertTrue(Complex.ONE.equals(new Complex(1, 0)));
        assertFalse(Complex.ONE.equals(new Complex(1, 1)));
        assertFalse(Complex.ONE.equals(null));
        assertFalse(Complex.ONE.equals("not a complex"));
        assertTrue(Complex.NaN.equals(new Complex(Double.NaN, 1)));
    }

    @Test
    public void testHashCode() {
        assertEquals(new Complex(1, 2).hashCode(), new Complex(1, 2).hashCode());
    }

    @Test
    public void testIsNaN() {
        assertTrue(Complex.NaN.isNaN());
        assertFalse(Complex.ONE.isNaN());
    }

    @Test
    public void testIsInfinite() {
        assertTrue(Complex.INF.isInfinite());
        assertFalse(Complex.ONE.isInfinite());
    }

    @Test
    public void testMultiplyComplex() {
        Complex z = new Complex(2, 3).multiply(new Complex(4, -5));
        assertComplexEquals(23.0, 2.0, z, EPS);
    }

    @Test
    public void testMultiplyComplexNullThrows() {
        try {
            new Complex(1, 2).multiply((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testMultiplyInt() {
        Complex z = new Complex(2, 3).multiply(3);
        assertComplexEquals(6.0, 9.0, z, EPS);
    }

    @Test
    public void testMultiplyDouble() {
        Complex z = new Complex(2, 3).multiply(2.0);
        assertComplexEquals(4.0, 6.0, z, EPS);
    }

    @Test
    public void testNegate() {
        Complex z = new Complex(1, -2).negate();
        assertComplexEquals(-1.0, 2.0, z, EPS);
    }

    @Test
    public void testSubtractComplex() {
        Complex z = new Complex(5, 7).subtract(new Complex(2, 3));
        assertComplexEquals(3.0, 4.0, z, EPS);
    }

    @Test
    public void testSubtractComplexNullThrows() {
        try {
            new Complex(1, 2).subtract(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testSubtractDouble() {
        Complex z = new Complex(1, 2).subtract(1.0);
        assertComplexEquals(0.0, 2.0, z, EPS);
    }

    @Test
    public void testTan() {
        Complex z = Complex.ZERO.tan();
        assertComplexEquals(0.0, 0.0, z, EPS);
    }

    @Test
    public void testTanLargeImaginaryPositive() {
        Complex z = new Complex(0, 30).tan();
        assertComplexEquals(0.0, 1.0, z, EPS);
    }

    @Test
    public void testTanLargeImaginaryNegative() {
        Complex z = new Complex(0, -30).tan();
        assertComplexEquals(0.0, -1.0, z, EPS);
    }

    @Test
    public void testTanInfiniteRealIsNaN() {
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0).tan().isNaN());
    }

    @Test
    public void testTanh() {
        Complex z = Complex.ZERO.tanh();
        assertComplexEquals(0.0, 0.0, z, EPS);
    }

    @Test
    public void testTanhLargePositiveReal() {
        Complex z = new Complex(30, 0).tanh();
        assertComplexEquals(1.0, 0.0, z, EPS);
    }

    @Test
    public void testTanhLargeNegativeReal() {
        Complex z = new Complex(-30, 0).tanh();
        assertComplexEquals(-1.0, 0.0, z, EPS);
    }

    @Test
    public void testTanhInfiniteImaginaryIsNaN() {
        assertTrue(new Complex(0, Double.POSITIVE_INFINITY).tanh().isNaN());
    }

    @Test
    public void testGetArgument() {
        assertEquals(Math.PI / 4, new Complex(1, 1).getArgument(), EPS);
        assertEquals(3 * Math.PI / 4, new Complex(-1, 1).getArgument(), EPS);
        assertEquals(0.0, Complex.ZERO.getArgument(), 0.0);
    }

    @Test
    public void testNthRoot() {
        List<Complex> roots = Complex.ONE.nthRoot(2);
        assertEquals(2, roots.size());
        assertComplexEquals(1.0, 0.0, roots.get(0), EPS);
        assertComplexEquals(-1.0, 0.0, roots.get(1), EPS);
    }

    @Test
    public void testNthRootNaN() {
        List<Complex> roots = Complex.NaN.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRootNonPositive() {
        try {
            Complex.ONE.nthRoot(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException expected) {
            // expected
        }
    }

    @Test
    public void testValueOfDoubleDouble() {
        Complex z = Complex.valueOf(1.0, 2.0);
        assertComplexEquals(1.0, 2.0, z, EPS);
    }

    @Test
    public void testValueOfDouble() {
        Complex z = Complex.valueOf(3.0);
        assertComplexEquals(3.0, 0.0, z, EPS);
    }

    @Test
    public void testValueOfNaN() {
        Complex z = Complex.valueOf(Double.NaN);
        assertTrue(z.isNaN());
    }

    @Test
    public void testGetField() {
        assertSame(ComplexField.getInstance(), new Complex(1, 2).getField());
    }

    @Test
    public void testToString() {
        assertEquals("(1.0, 2.0)", new Complex(1, 2).toString());
    }
}