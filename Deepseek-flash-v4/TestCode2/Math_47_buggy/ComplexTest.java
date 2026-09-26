package org.apache.commons.math.complex;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import java.util.List;

public class ComplexTest {

    private Complex zero;
    private Complex one;
    private Complex i;
    private Complex nan;
    private Complex inf;
    private Complex negOne;

    @Before
    public void setUp() {
        zero = Complex.ZERO;
        one = Complex.ONE;
        i = Complex.I;
        nan = Complex.NaN;
        inf = Complex.INF;
        negOne = new Complex(-1.0, 0.0);
    }

    @Test
    public void testAbs_Zero() {
        assertEquals(0.0, zero.abs(), 1e-15);
    }

    @Test
    public void testAbs_NaN() {
        assertTrue(Double.isNaN(nan.abs()));
    }

    @Test
    public void testAbs_Infinity() {
        assertEquals(Double.POSITIVE_INFINITY, inf.abs(), 0.0);
    }

    @Test
    public void testAbs_Normal() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), 1e-12);
    }

    @Test
    public void testAbs_SmallImaginary() {
        Complex c = new Complex(1.0, 0.0);
        assertEquals(1.0, c.abs(), 1e-15);
    }

    @Test
    public void testAbs_SmallReal() {
        Complex c = new Complex(0.0, -2.0);
        assertEquals(2.0, c.abs(), 1e-15);
    }

    @Test
    public void testAdd_NullArgument() {
        try {
            one.add((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAdd_NaN() {
        assertSame(nan, one.add(nan));
    }

    @Test
    public void testAdd_Basic() {
        Complex result = one.add(i);
        assertEquals(1.0, result.getReal(), 1e-15);
        assertEquals(1.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testAddDouble_NaN() {
        assertSame(nan, one.add(Double.NaN));
    }

    @Test
    public void testAddDouble_Basic() {
        Complex result = one.add(2.0);
        assertEquals(3.0, result.getReal(), 1e-15);
        assertEquals(0.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testConjugate_NaN() {
        assertSame(nan, nan.conjugate());
    }

    @Test
    public void testConjugate_Basic() {
        Complex c = new Complex(1.0, 2.0);
        Complex conj = c.conjugate();
        assertEquals(1.0, conj.getReal(), 1e-15);
        assertEquals(-2.0, conj.getImaginary(), 1e-15);
    }

    @Test
    public void testDivide_NullArgument() {
        try {
            one.divide((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDivide_NaN() {
        assertSame(nan, one.divide(nan));
    }

    @Test
    public void testDivide_ZeroDivisor() {
        Complex result = one.divide(zero);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivide_InfDivisorNotInfinite() {
        Complex result = one.divide(inf);
        assertSame(Complex.ZERO, result);
    }

    @Test
    public void testDivide_Normal() {
        Complex c = new Complex(1.0, 1.0);
        Complex result = c.divide(new Complex(1.0, -1.0));
        assertEquals(0.0, result.getReal(), 1e-15);
        assertEquals(1.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testDivideDouble_NaN() {
        assertSame(nan, one.divide(Double.NaN));
    }

    @Test
    public void testDivideDouble_Zero() {
        Complex result = one.divide(0.0);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideDouble_Infinity() {
        Complex result = one.divide(Double.POSITIVE_INFINITY);
        assertSame(Complex.ZERO, result);
    }

    @Test
    public void testDivideDouble_Normal() {
        Complex result = new Complex(4.0, 6.0).divide(2.0);
        assertEquals(2.0, result.getReal(), 1e-15);
        assertEquals(3.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testEquals_SameObject() {
        assertTrue(one.equals(one));
    }

    @Test
    public void testEquals_EqualComplex() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEquals_DifferentReal() {
        assertFalse(one.equals(new Complex(2.0, 0.0)));
    }

    @Test
    public void testEquals_NaN() {
        assertTrue(nan.equals(nan));
        assertFalse(nan.equals(one));
        assertFalse(one.equals(nan));
    }

    @Test
    public void testHashCode_NaN() {
        assertEquals(7, nan.hashCode());
    }

    @Test
    public void testHashCode_NonNaN() {
        int h1 = one.hashCode();
        int h2 = new Complex(1.0, 0.0).hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testGetImaginary() {
        assertEquals(2.0, new Complex(0.0, 2.0).getImaginary(), 1e-15);
    }

    @Test
    public void testGetReal() {
        assertEquals(3.0, new Complex(3.0, 0.0).getReal(), 1e-15);
    }

    @Test
    public void testIsNaN_True() {
        assertTrue(nan.isNaN());
    }

    @Test
    public void testIsNaN_False() {
        assertFalse(one.isNaN());
    }

    @Test
    public void testIsInfinite_True() {
        assertTrue(inf.isInfinite());
    }

    @Test
    public void testIsInfinite_False() {
        assertFalse(one.isInfinite());
    }

    @Test
    public void testMultiply_NullArgument() {
        try {
            one.multiply((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testMultiply_NaN() {
        assertSame(nan, one.multiply(nan));
    }

    @Test
    public void testMultiply_Infinity() {
        Complex result = inf.multiply(one);
        assertSame(Complex.INF, result);
    }

    @Test
    public void testMultiply_Normal() {
        Complex result = new Complex(1.0, 2.0).multiply(new Complex(3.0, 4.0));
        assertEquals(-5.0, result.getReal(), 1e-15);
        assertEquals(10.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testMultiplyDouble_NaN() {
        assertSame(nan, one.multiply(Double.NaN));
    }

    @Test
    public void testMultiplyDouble_Infinity() {
        assertSame(Complex.INF, inf.multiply(2.0));
    }

    @Test
    public void testMultiplyDouble_Normal() {
        Complex result = new Complex(2.0, 3.0).multiply(2.0);
        assertEquals(4.0, result.getReal(), 1e-15);
        assertEquals(6.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testNegate_NaN() {
        assertSame(nan, nan.negate());
    }

    @Test
    public void testNegate_Basic() {
        Complex neg = one.negate();
        assertEquals(-1.0, neg.getReal(), 1e-15);
        assertEquals(0.0, neg.getImaginary(), 1e-15);
    }

    @Test
    public void testSubtract_NullArgument() {
        try {
            one.subtract((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSubtract_NaN() {
        assertSame(nan, one.subtract(nan));
    }

    @Test
    public void testSubtract_Basic() {
        Complex result = new Complex(5.0, 3.0).subtract(new Complex(2.0, 1.0));
        assertEquals(3.0, result.getReal(), 1e-15);
        assertEquals(2.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testSubtractDouble_NaN() {
        assertSame(nan, one.subtract(Double.NaN));
    }

    @Test
    public void testSubtractDouble_Basic() {
        Complex result = new Complex(5.0, 3.0).subtract(2.0);
        assertEquals(3.0, result.getReal(), 1e-15);
        assertEquals(3.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testAcos_NaN() {
        assertSame(nan, nan.acos());
    }

    @Test
    public void testAsin_NaN() {
        assertSame(nan, nan.asin());
    }

    @Test
    public void testAtan_NaN() {
        assertSame(nan, nan.atan());
    }

    @Test
    public void testCos_NaN() {
        assertSame(nan, nan.cos());
    }

    @Test
    public void testCosh_NaN() {
        assertSame(nan, nan.cosh());
    }

    @Test
    public void testExp_NaN() {
        assertSame(nan, nan.exp());
    }

    @Test
    public void testLog_NaN() {
        assertSame(nan, nan.log());
    }

    @Test
    public void testPowComplex_NullArgument() {
        try {
            one.pow((Complex) null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSin_NaN() {
        assertSame(nan, nan.sin());
    }

    @Test
    public void testSinh_NaN() {
        assertSame(nan, nan.sinh());
    }

    @Test
    public void testSqrt_NaN() {
        assertSame(nan, nan.sqrt());
    }

    @Test
    public void testSqrt_Zero() {
        Complex result = zero.sqrt();
        assertEquals(0.0, result.getReal(), 1e-15);
        assertEquals(0.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testSqrt_RealPositive() {
        Complex result = new Complex(4.0, 0.0).sqrt();
        assertEquals(2.0, result.getReal(), 1e-15);
        assertEquals(0.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testSqrt_RealNegative() {
        Complex result = negOne.sqrt();
        assertEquals(0.0, result.getReal(), 1e-15);
        assertEquals(1.0, result.getImaginary(), 1e-15);
    }

    @Test
    public void testTan_NaN() {
        assertSame(nan, nan.tan());
    }

    @Test
    public void testTanh_NaN() {
        assertSame(nan, nan.tanh());
    }

    @Test
    public void testGetArgument() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4, c.getArgument(), 1e-15);
    }

    @Test
    public void testNthRoot_NegativeN() {
        try {
            one.nthRoot(-1);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testNthRoot_ZeroN() {
        try {
            one.nthRoot(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testNthRoot_NaN() {
        List<Complex> roots = nan.nthRoot(3);
        assertEquals(1, roots.size());
        assertSame(Complex.NaN, roots.get(0));
    }

    @Test
    public void testNthRoot_Infinite() {
        List<Complex> roots = inf.nthRoot(3);
        assertEquals(1, roots.size());
        assertSame(Complex.INF, roots.get(0));
    }

    @Test
    public void testNthRoot_NEquals1() {
        Complex c = new Complex(2.0, 3.0);
        List<Complex> roots = c.nthRoot(1);
        assertEquals(1, roots.size());
        assertEquals(2.0, roots.get(0).getReal(), 1e-15);
        assertEquals(3.0, roots.get(0).getImaginary(), 1e-15);
    }

    @Test
    public void testNthRoot_Normal() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(4);
        assertEquals(4, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), 1e-12);
        assertEquals(0.0, roots.get(0).getImaginary(), 1e-12);
    }

    @Test
    public void testCreateComplex() {
        Complex c = one.createComplex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), 1e-15);
        assertEquals(4.0, c.getImaginary(), 1e-15);
    }

    @Test
    public void testValueOfDoubleDouble_NaN() {
        assertSame(Complex.NaN, Complex.valueOf(Double.NaN, 0.0));
    }

    @Test
    public void testValueOfDoubleDouble_Normal() {
        Complex c = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c.getReal(), 1e-15);
        assertEquals(2.0, c.getImaginary(), 1e-15);
    }

    @Test
    public void testValueOfDouble_NaN() {
        assertSame(Complex.NaN, Complex.valueOf(Double.NaN));
    }

    @Test
    public void testValueOfDouble_Normal() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), 1e-15);
        assertEquals(0.0, c.getImaginary(), 1e-15);
    }

    @Test
    public void testToString() {
        Complex c = new Complex(1.0, -2.0);
        assertEquals("(1.0, -2.0)", c.toString());
    }

    @Test
    public void testGetField() {
        assertNotNull(one.getField());
    }
}