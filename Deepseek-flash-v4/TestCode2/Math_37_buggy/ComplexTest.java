package org.apache.commons.math.complex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Test;

public class ComplexTest {

    private static final double EPS = 1e-12;

    @Test
    public void testConstants() {
        assertEquals(0.0, Complex.I.getReal(), 0.0);
        assertEquals(1.0, Complex.I.getImaginary(), 0.0);
        assertEquals(1.0, Complex.ONE.getReal(), 0.0);
        assertEquals(0.0, Complex.ONE.getImaginary(), 0.0);
        assertEquals(0.0, Complex.ZERO.getReal(), 0.0);
        assertEquals(0.0, Complex.ZERO.getImaginary(), 0.0);

        assertTrue(Complex.NaN.isNaN());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 0).isInfinite());
        assertTrue(new Complex(0, Double.NEGATIVE_INFINITY).isInfinite());
        assertFalse(new Complex(1, 2).isInfinite());
        assertFalse(new Complex(1, 2).isNaN());
    }

    @Test
    public void testAbs() {
        assertEquals(5.0, new Complex(3, 4).abs(), EPS);
        assertEquals(5.0, new Complex(-3, -4).abs(), EPS);
        assertEquals(0.0, Complex.ZERO.abs(), 0.0);
        assertTrue(Double.isNaN(Complex.NaN.abs()));
        assertEquals(Double.POSITIVE_INFINITY,
                new Complex(Double.POSITIVE_INFINITY, 1).abs(), 0.0);
    }

    @Test
    public void testAddComplex() {
        Complex sum = new Complex(1, 2).add(new Complex(3, -5));
        assertEquals(4.0, sum.getReal(), 0.0);
        assertEquals(-3.0, sum.getImaginary(), 0.0);

        assertTrue(new Complex(1, 2).add(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.add(new Complex(1, 2)).isNaN());
    }

    @Test
    public void testAddDouble() {
        Complex sum = new Complex(1, 2).add(3.5);
        assertEquals(4.5, sum.getReal(), 0.0);
        assertEquals(2.0, sum.getImaginary(), 0.0);

        assertTrue(new Complex(1, 2).add(Double.NaN).isNaN());
    }

    @Test
    public void testConjugate() {
        Complex c = new Complex(1, -2).conjugate();
        assertEquals(1.0, c.getReal(), 0.0);
        assertEquals(2.0, c.getImaginary(), 0.0);
    }

    @Test
    public void testDivideComplex() {
        Complex q = new Complex(1, 2).divide(new Complex(3, 4));
        assertEquals(11.0 / 25.0, q.getReal(), EPS);
        assertEquals(2.0 / 25.0, q.getImaginary(), EPS);

        assertTrue(new Complex(1, 2).divide(Complex.NaN).isNaN());
        assertTrue(Complex.ONE.divide(Complex.ZERO).isInfinite());
    }

    @Test
    public void testDivideDouble() {
        Complex q = new Complex(1, 2).divide(2.0);
        assertEquals(0.5, q.getReal(), 0.0);
        assertEquals(1.0, q.getImaginary(), 0.0);

        assertTrue(new Complex(1, 2).divide(Double.NaN).isNaN());
        assertTrue(new Complex(1, 2).divide(0.0).isInfinite());

        Complex z = new Complex(1, 2).divide(Double.POSITIVE_INFINITY);
        assertEquals(0.0, z.getReal(), 0.0);
        assertEquals(0.0, z.getImaginary(), 0.0);
    }

    @Test
    public void testReciprocal() {
        Complex r = new Complex(3, 4).reciprocal();
        assertEquals(3.0 / 25.0, r.getReal(), EPS);
        assertEquals(-4.0 / 25.0, r.getImaginary(), EPS);

        assertTrue(new Complex(1, 0).reciprocal().equals(new Complex(1, 0)));
        assertTrue(Complex.NaN.reciprocal().isNaN());
    }

    @Test
    public void testEquals() {
        assertTrue(new Complex(1, 2).equals(new Complex(1, 2)));
        assertFalse(new Complex(1, 2).equals(new Complex(1, 3)));
        assertFalse(new Complex(1, 2).equals(null));
        assertFalse(new Complex(1, 2).equals("not a complex"));

        assertTrue(Complex.NaN.equals(Complex.NaN));
        assertFalse(new Complex(1, 2).equals(Complex.NaN));
    }

    @Test
    public void testHashCode() {
        assertEquals(new Complex(1, 2).hashCode(), new Complex(1, 2).hashCode());
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testMultiplyComplex() {
        Complex p = new Complex(1, 2).multiply(new Complex(3, 4));
        assertEquals(-5.0, p.getReal(), EPS);
        assertEquals(10.0, p.getImaginary(), EPS);

        assertTrue(new Complex(1, 2).multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testMultiplyScalar() {
        Complex byInt = new Complex(1, 2).multiply(3);
        assertEquals(3.0, byInt.getReal(), 0.0);
        assertEquals(6.0, byInt.getImaginary(), 0.0);

        Complex byDouble = new Complex(1, 2).multiply(2.5);
        assertEquals(2.5, byDouble.getReal(), 0.0);
        assertEquals(5.0, byDouble.getImaginary(), 0.0);

        assertTrue(Complex.NaN.multiply(2).isNaN());
        assertTrue(new Complex(1, 2).multiply(Double.NaN).isNaN());
        assertTrue(new Complex(1, 2).multiply(Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test
    public void testNegate() {
        Complex n = new Complex(1, -2).negate();
        assertEquals(-1.0, n.getReal(), 0.0);
        assertEquals(2.0, n.getImaginary(), 0.0);
    }

    @Test
    public void testSubtractComplex() {
        Complex d = new Complex(5, 5).subtract(new Complex(2, 4));
        assertEquals(3.0, d.getReal(), 0.0);
        assertEquals(1.0, d.getImaginary(), 0.0);

        assertTrue(new Complex(5, 5).subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testSubtractDouble() {
        Complex d = new Complex(5, 5).subtract(2.0);
        assertEquals(3.0, d.getReal(), 0.0);
        assertEquals(5.0, d.getImaginary(), 0.0);
    }

    @Test
    public void testGetArgument() {
        assertEquals(0.0, new Complex(1, 0).getArgument(), EPS);
        assertEquals(Math.PI / 4.0, new Complex(1, 1).getArgument(), EPS);
        assertEquals(Math.PI, new Complex(-1, 0).getArgument(), EPS);
        assertEquals(-Math.PI / 2.0, new Complex(0, -1).getArgument(), EPS);
    }

    @Test
    public void testExpLogPow() {
        Complex exp = new Complex(0, Math.PI).exp();
        assertEquals(-1.0, exp.getReal(), EPS);
        assertEquals(0.0, exp.getImaginary(), EPS);

        Complex log = new Complex(1, 1).log();
        assertEquals(Math.log(Math.sqrt(2.0)), log.getReal(), EPS);
        assertEquals(Math.PI / 4.0, log.getImaginary(), EPS);

        Complex pow = new Complex(2, 0).pow(2.0);
        assertEquals(4.0, pow.getReal(), EPS);
        assertEquals(0.0, pow.getImaginary(), EPS);
    }

    @Test
    public void testSqrt() {
        Complex sqrt = new Complex(4, 0).sqrt();
        assertEquals(2.0, sqrt.getReal(), EPS);
        assertEquals(0.0, sqrt.getImaginary(), EPS);

        sqrt = new Complex(-1, 0).sqrt();
        assertEquals(0.0, sqrt.getReal(), EPS);
        assertEquals(1.0, sqrt.getImaginary(), EPS);
    }

    @Test
    public void testTrigonometric() {
        Complex sin = new Complex(1, 0).sin();
        assertEquals(Math.sin(1), sin.getReal(), EPS);
        assertEquals(0.0, sin.getImaginary(), EPS);

        Complex cos = new Complex(1, 0).cos();
        assertEquals(Math.cos(1), cos.getReal(), EPS);
        assertEquals(0.0, cos.getImaginary(), EPS);

        Complex tan = new Complex(1, 0).tan();
        assertEquals(Math.tan(1), tan.getReal(), EPS);
        assertEquals(0.0, tan.getImaginary(), EPS);
    }

    @Test
    public void testHyperbolic() {
        Complex sinh = new Complex(1, 0).sinh();
        assertEquals(Math.sinh(1), sinh.getReal(), EPS);
        assertEquals(0.0, sinh.getImaginary(), EPS);

        Complex cosh = new Complex(1, 0).cosh();
        assertEquals(Math.cosh(1), cosh.getReal(), EPS);
        assertEquals(0.0, cosh.getImaginary(), EPS);

        Complex tanh = new Complex(1, 0).tanh();
        assertEquals(Math.tanh(1), tanh.getReal(), EPS);
        assertEquals(0.0, tanh.getImaginary(), EPS);
    }

    @Test
    public void testInverseTrigOnRealOne() {
        Complex acos = new Complex(1, 0).acos();
        assertEquals(0.0, acos.getReal(), EPS);
        assertEquals(0.0, acos.getImaginary(), EPS);

        Complex asin = new Complex(1, 0).asin();
        assertEquals(Math.PI / 2.0, asin.getReal(), EPS);
        assertEquals(0.0, asin.getImaginary(), EPS);

        Complex atan = new Complex(1, 0).atan();
        assertEquals(Math.PI / 4.0, atan.getReal(), EPS);
        assertEquals(0.0, atan.getImaginary(), EPS);
    }

    @Test
    public void testValueOf() {
        Complex one = Complex.valueOf(3.0);
        assertEquals(3.0, one.getReal(), 0.0);
        assertEquals(0.0, one.getImaginary(), 0.0);

        Complex two = Complex.valueOf(3.0, -4.0);
        assertEquals(3.0, two.getReal(), 0.0);
        assertEquals(-4.0, two.getImaginary(), 0.0);

        assertTrue(Complex.valueOf(Double.NaN).isNaN());
        assertTrue(Complex.valueOf(Double.NaN, 1).isNaN());
        assertTrue(Complex.valueOf(1, Double.NaN).isNaN());
    }

    @Test
    public void testNthRoot() {
        try {
            new Complex(1, 0).nthRoot(0);
            fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }

        List<Complex> roots = Complex.ONE.nthRoot(4);
        assertEquals(4, roots.size());

        double[] expectedReal = { 1.0, 0.0, -1.0, 0.0 };
        double[] expectedImag = { 0.0, 1.0, 0.0, -1.0 };

        for (int i = 0; i < 4; i++) {
            assertEquals(expectedReal[i], roots.get(i).getReal(), EPS);
            assertEquals(expectedImag[i], roots.get(i).getImaginary(), EPS);
        }

        List<Complex> nanRoot = Complex.NaN.nthRoot(2);
        assertEquals(1, nanRoot.size());
        assertTrue(nanRoot.get(0).isNaN());

        List<Complex> infRoot = Complex.INF.nthRoot(2);
        assertEquals(1, infRoot.size());
        assertTrue(infRoot.get(0).isInfinite());
    }

    @Test
    public void testToString() {
        assertEquals("(1.0, 2.0)", new Complex(1, 2).toString());
    }

    @Test
    public void testGetField() {
        assertNotNull(new Complex(1, 2).getField());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNullThrows() {
        new Complex(1, 2).add((Complex) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNullThrows() {
        new Complex(1, 2).subtract((Complex) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNullThrows() {
        new Complex(1, 2).multiply((Complex) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNullThrows() {
        new Complex(1, 2).divide((Complex) null);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowNullThrows() {
        new Complex(1, 2).pow((Complex) null);
    }
}