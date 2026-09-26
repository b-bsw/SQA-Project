package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import java.util.List;

public class ComplexTest {
    private static final double DELTA = 1e-12;

    private void assertComplexEquals(Complex expected, Complex actual, double delta) {
        assertEquals(expected.getReal(), actual.getReal(), delta);
        assertEquals(expected.getImaginary(), actual.getImaginary(), delta);
    }

    @Test
    public void testAbs_NaN() {
        assertTrue(Double.isNaN(new Complex(Double.NaN, 0).abs()));
    }

    @Test
    public void testAbs_Infinite() {
        assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.POSITIVE_INFINITY, 0).abs(), 0.0);
    }

    @Test
    public void testAbs_Zero() {
        assertEquals(0.0, new Complex(0, 0).abs(), 0.0);
    }

    @Test
    public void testAbs_RealLarger() {
        assertEquals(Math.sqrt(5*5+3*3), new Complex(5, 3).abs(), DELTA);
    }

    @Test
    public void testAbs_ImagLarger() {
        assertEquals(5.0, new Complex(3, 4).abs(), DELTA);
    }

    @Test
    public void testAbs_RealZero() {
        assertEquals(4.0, new Complex(0, 4).abs(), DELTA);
    }

    @Test
    public void testAbs_ImagZero() {
        assertEquals(4.0, new Complex(4, 0).abs(), DELTA);
    }

    @Test(expected = NullArgumentException.class)
    public void testAdd_NullArgument() {
        new Complex(1, 1).add(null);
    }

    @Test
    public void testAdd_NaN() {
        assertTrue(new Complex(1, 1).add(new Complex(Double.NaN, 1)).isNaN());
    }

    @Test
    public void testAdd_Normal() {
        Complex result = new Complex(1, 2).add(new Complex(3, 4));
        assertEquals(4.0, result.getReal(), DELTA);
        assertEquals(6.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testAddDouble_NaN() {
        assertTrue(new Complex(1, 2).add(Double.NaN).isNaN());
    }

    @Test
    public void testAddDouble_Normal() {
        Complex result = new Complex(1, 2).add(5.0);
        assertEquals(6.0, result.getReal(), DELTA);
        assertEquals(2.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testConjugate_NaN() {
        assertTrue(new Complex(Double.NaN, 0).conjugate().isNaN());
    }

    @Test
    public void testConjugate_Normal() {
        Complex conj = new Complex(3, 4).conjugate();
        assertEquals(3.0, conj.getReal(), DELTA);
        assertEquals(-4.0, conj.getImaginary(), DELTA);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivide_NullArgument() {
        new Complex(1, 1).divide(null);
    }

    @Test
    public void testDivide_NaN() {
        assertTrue(new Complex(1, 1).divide(new Complex(Double.NaN, 0)).isNaN());
    }

    @Test
    public void testDivide_ZeroDividend_ZeroDivisor() {
        assertTrue(new Complex(0, 0).divide(new Complex(0, 0)).isNaN());
    }

    @Test
    public void testDivide_ByZero() {
        assertTrue(new Complex(1, 0).divide(new Complex(0, 0)).isInfinite());
    }

    @Test
    public void testDivide_InfiniteDivisor() {
        assertTrue(new Complex(1, 0).divide(new Complex(Double.POSITIVE_INFINITY, 0)).equals(Complex.ZERO));
    }

    @Test
    public void testDivide_Normal() {
        Complex result = new Complex(3, 4).divide(new Complex(3, 4));
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testDivideDouble_NaN() {
        assertTrue(new Complex(1, 1).divide(Double.NaN).isNaN());
    }

    @Test
    public void testDivideDouble_Zero() {
        assertTrue(new Complex(1, 0).divide(0.0).isInfinite());
    }

    @Test
    public void testDivideDouble_Infinite() {
        assertTrue(new Complex(1, 0).divide(Double.POSITIVE_INFINITY).equals(Complex.ZERO));
    }

    @Test
    public void testDivideDouble_Normal() {
        Complex result = new Complex(3, 6).divide(3.0);
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(2.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testEquals_Reflexive() {
        Complex c = new Complex(1, 2);
        assertTrue(c.equals(c));
    }

    @Test
    public void testEquals_SameValues() {
        assertTrue(new Complex(1, 2).equals(new Complex(1, 2)));
    }

    @Test
    public void testEquals_DifferentValues() {
        assertFalse(new Complex(1, 2).equals(new Complex(1, 3)));
    }

    @Test
    public void testEquals_NaN() {
        Complex nan1 = new Complex(Double.NaN, 0);
        Complex nan2 = new Complex(Double.NaN, 0);
        assertTrue(nan1.equals(nan2));
        assertFalse(nan1.equals(new Complex(1, 0)));
    }

    @Test
    public void testEquals_NonComplex() {
        assertFalse(new Complex(1, 0).equals(""));
    }

    @Test
    public void testHashCode_ConsistentWithEquals() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(1, 2);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    @Test
    public void testHashCode_NaN() {
        assertEquals(7, new Complex(Double.NaN, 0).hashCode());
    }

    @Test
    public void testGetReal() {
        assertEquals(2.0, new Complex(2, 3).getReal(), DELTA);
    }

    @Test
    public void testGetImaginary() {
        assertEquals(3.0, new Complex(2, 3).getImaginary(), DELTA);
    }

    @Test
    public void testIsNaN() {
        assertTrue(new Complex(Double.NaN, 0).isNaN());
        assertFalse(new Complex(1, 0).isNaN());
    }

    @Test
    public void testIsInfinite() {
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0).isInfinite());
        assertFalse(new Complex(1, 0).isInfinite());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiply_NullArgument() {
        new Complex(1, 1).multiply(null);
    }

    @Test
    public void testMultiply_NaN() {
        assertTrue(new Complex(1, 1).multiply(new Complex(Double.NaN, 0)).isNaN());
    }

    @Test
    public void testMultiply_Infinite() {
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0).multiply(new Complex(1, 0)).isInfinite());
    }

    @Test
    public void testMultiply_Normal() {
        Complex result = new Complex(3, 4).multiply(new Complex(1, 2));
        assertEquals(-5.0, result.getReal(), DELTA);
        assertEquals(10.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testMultiplyDouble_NaN() {
        assertTrue(new Complex(1, 1).multiply(Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyDouble_Normal() {
        Complex result = new Complex(2, 3).multiply(4.0);
        assertEquals(8.0, result.getReal(), DELTA);
        assertEquals(12.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testNegate_NaN() {
        assertTrue(new Complex(Double.NaN, 0).negate().isNaN());
    }

    @Test
    public void testNegate_Normal() {
        Complex neg = new Complex(3, -4).negate();
        assertEquals(-3.0, neg.getReal(), DELTA);
        assertEquals(4.0, neg.getImaginary(), DELTA);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtract_NullArgument() {
        new Complex(1, 1).subtract(null);
    }

    @Test
    public void testSubtract_NaN() {
        assertTrue(new Complex(1, 1).subtract(new Complex(Double.NaN, 0)).isNaN());
    }

    @Test
    public void testSubtract_Normal() {
        Complex result = new Complex(5, 6).subtract(new Complex(3, 4));
        assertEquals(2.0, result.getReal(), DELTA);
        assertEquals(2.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSubtractDouble_NaN() {
        assertTrue(new Complex(1, 1).subtract(Double.NaN).isNaN());
    }

    @Test
    public void testSubtractDouble_Normal() {
        Complex result = new Complex(5, 6).subtract(3.0);
        assertEquals(2.0, result.getReal(), DELTA);
        assertEquals(6.0, result.getImaginary(), DELTA);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_NonPositive() {
        new Complex(1, 0).nthRoot(0);
    }

    @Test
    public void testNthRoot_NaN() {
        List<Complex> roots = new Complex(Double.NaN, 0).nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_Infinite() {
        List<Complex> roots = new Complex(Double.POSITIVE_INFINITY, 0).nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isInfinite());
    }

    @Test
    public void testNthRoot_1() {
        Complex c = new Complex(8, 0);
        List<Complex> roots = c.nthRoot(1);
        assertEquals(1, roots.size());
        assertComplexEquals(c, roots.get(0), DELTA);
    }

    @Test
    public void testNthRoot_2() {
        Complex c = new Complex(0, 4);
        List<Complex> roots = c.nthRoot(2);
        assertEquals(2, roots.size());
        double sqrt2 = Math.sqrt(2);
        assertComplexEquals(new Complex(sqrt2, sqrt2), roots.get(0), DELTA);
        assertComplexEquals(new Complex(-sqrt2, -sqrt2), roots.get(1), DELTA);
    }

    @Test
    public void testValueOf_NaN() {
        assertTrue(Complex.valueOf(Double.NaN, 0).isNaN());
        assertTrue(Complex.valueOf(Double.NaN).isNaN());
    }

    @Test
    public void testValueOf_Normal() {
        Complex c = Complex.valueOf(3, 4);
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(4.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testValueOf_RealOnly() {
        Complex c = Complex.valueOf(5);
        assertEquals(5.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testCos_NaN() {
        assertTrue(new Complex(Double.NaN, 0).cos().isNaN());
    }

    @Test
    public void testCos_Normal() {
        Complex result = new Complex(0, 0).cos();
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSin_Normal() {
        Complex result = new Complex(0, 0).sin();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testExp_Normal() {
        Complex result = new Complex(1, 0).exp();
        assertEquals(Math.E, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testLog_Normal() {
        Complex result = new Complex(1, 0).log();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSqrt_Zero() {
        Complex result = new Complex(0, 0).sqrt();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSqrt_Normal() {
        Complex result = new Complex(4, 0).sqrt();
        assertEquals(2.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSqrt_NegativeReal() {
        Complex result = new Complex(-4, 0).sqrt();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(2.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testAcos_One() {
        Complex result = new Complex(1, 0).acos();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testPow_NaN() {
        assertTrue(new Complex(1, 0).pow(new Complex(Double.NaN, 0)).isNaN());
    }

    @Test
    public void testPow_Normal() {
        Complex result = new Complex(2, 0).pow(new Complex(3, 0));
        assertEquals(8.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testGetArgument() {
        assertEquals(0.0, new Complex(1, 0).getArgument(), DELTA);
        assertEquals(Math.PI / 2, new Complex(0, 1).getArgument(), DELTA);
    }
}