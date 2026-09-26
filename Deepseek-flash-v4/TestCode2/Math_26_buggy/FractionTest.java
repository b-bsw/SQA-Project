package org.apache.commons.math3.fraction;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;

public class FractionTest {

    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction fraction) {
        assertEquals(expectedNumerator, fraction.getNumerator());
        assertEquals(expectedDenominator, fraction.getDenominator());
    }

    @Test
    public void testConstructorInt() throws Exception {
        assertFraction(5, 1, new Fraction(5));
        assertFraction(0, 1, new Fraction(0));
    }

    @Test
    public void testConstructorIntIntReduces() throws Exception {
        assertFraction(3, 4, new Fraction(6, 8));
        assertFraction(-1, 2, new Fraction(1, -2));
        assertFraction(1, 2, new Fraction(-1, -2));
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntIntZeroDenominator() throws Exception {
        new Fraction(1, 0);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntIntDenominatorMinValue() throws Exception {
        new Fraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testConstructorDoubleInteger() throws Exception {
        assertFraction(3, 1, new Fraction(3.0));
        assertFraction(-3, 1, new Fraction(-3.0));
    }

    @Test
    public void testConstructorDoubleHalf() throws Exception {
        assertFraction(1, 2, new Fraction(0.5));
    }

    @Test
    public void testConstructorDoubleWithMaxDenominator() throws Exception {
        assertFraction(22, 7, new Fraction(Math.PI, 10));
    }

    @Test
    public void testConstructorDoubleWithMaxDenominatorMultipleIterations() throws Exception {
        assertFraction(355, 113, new Fraction(Math.PI, 1000));
    }

    @Test
    public void testConstructorDoubleWithMaxDenominatorAcceptsInteger() throws Exception {
        assertFraction(2, 1, new Fraction(2.0, 10));
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxIterations() throws Exception {
        new Fraction(Math.PI, 1e-9, 1);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleOverflow() throws Exception {
        new Fraction(1e20);
    }

    @Test
    public void testCompareTo() throws Exception {
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction(1, 3);
        assertEquals(-1, third.compareTo(half));
        assertEquals(1, half.compareTo(third));
        assertEquals(0, half.compareTo(new Fraction(2, 4)));
    }

    @Test
    public void testNumericConversions() throws Exception {
        Fraction f = new Fraction(3, 2);
        assertEquals(1.5, f.doubleValue(), 0.0);
        assertEquals(1.5f, f.floatValue(), 0.0f);
        assertEquals(1, f.intValue());
        assertEquals(1L, f.longValue());
        assertEquals(150.0, f.percentageValue(), 0.0);
    }

    @Test
    public void testAbs() throws Exception {
        Fraction positive = new Fraction(3, 4);
        assertSame(positive, positive.abs());
        assertFraction(3, 4, new Fraction(-3, 4).abs());
    }

    @Test
    public void testNegate() throws Exception {
        assertFraction(-3, 4, new Fraction(3, 4).negate());
        assertFraction(3, 4, new Fraction(-3, 4).negate());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegateOverflow() throws Exception {
        new Fraction(Integer.MIN_VALUE, 1).negate();
    }

    @Test
    public void testReciprocal() throws Exception {
        assertFraction(4, 3, new Fraction(3, 4).reciprocal());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocalZero() throws Exception {
        Fraction.ZERO.reciprocal();
    }

    @Test
    public void testEquals() throws Exception {
        Fraction f = new Fraction(1, 2);
        assertTrue(f.equals(f));
        assertTrue(f.equals(new Fraction(2, 4)));
        assertFalse(f.equals(new Fraction(1, 3)));
        assertFalse(f.equals(null));
        assertFalse(f.equals("1/2"));
    }

    @Test
    public void testHashCode() throws Exception {
        Fraction f = new Fraction(1, 2);
        assertEquals(f.hashCode(), new Fraction(2, 4).hashCode());
        assertFalse(f.hashCode() == new Fraction(1, 3).hashCode());
    }

    @Test
    public void testAdd() throws Exception {
        assertFraction(5, 6, new Fraction(1, 2).add(new Fraction(1, 3)));
        assertFraction(3, 2, new Fraction(1, 2).add(1));
        assertFraction(1, 3, new Fraction(0, 1).add(new Fraction(1, 3)));
    }

    @Test
    public void testAddSameDenominator() throws Exception {
        assertFraction(1, 1, new Fraction(1, 2).add(new Fraction(1, 2)));
    }

    @Test
    public void testAddZeroReturnsSame() throws Exception {
        Fraction half = new Fraction(1, 2);
        assertSame(half, half.add(Fraction.ZERO));
    }

    @Test
    public void testSubtract() throws Exception {
        assertFraction(1, 2, new Fraction(3, 4).subtract(new Fraction(1, 4)));
        assertFraction(-1, 2, new Fraction(1, 2).subtract(1));
        assertFraction(-1, 3, new Fraction(0, 1).subtract(new Fraction(1, 3)));
    }

    @Test
    public void testMultiply() throws Exception {
        assertFraction(1, 2, new Fraction(2, 3).multiply(new Fraction(3, 4)));
        assertFraction(4, 3, new Fraction(2, 3).multiply(2));
        assertSame(Fraction.ZERO, new Fraction(0, 1).multiply(new Fraction(1, 2)));
    }

    @Test
    public void testDivide() throws Exception {
        assertFraction(2, 3, new Fraction(1, 2).divide(new Fraction(3, 4)));
        assertFraction(1, 4, new Fraction(1, 2).divide(2));
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZero() throws Exception {
        new Fraction(1, 2).divide(Fraction.ZERO);
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideIntByZero() throws Exception {
        new Fraction(1, 2).divide(0);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNull() throws Exception {
        new Fraction(1, 2).add(null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() throws Exception {
        new Fraction(1, 2).multiply(null);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() throws Exception {
        new Fraction(1, 2).divide(null);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAddOverflow() throws Exception {
        new Fraction(Integer.MAX_VALUE, 1).add(new Fraction(1, 1));
    }

    @Test
    public void testGetReducedFraction() throws Exception {
        assertFraction(1, 2, Fraction.getReducedFraction(2, 4));
        assertSame(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
        assertFraction(-1, 2, Fraction.getReducedFraction(1, -2));
        assertFraction(1, 2, Fraction.getReducedFraction(-1, -2));
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionZeroDenominator() throws Exception {
        Fraction.getReducedFraction(1, 0);
    }

    @Test
    public void testGetReducedFractionMinDenominatorEven() throws Exception {
        assertFraction(-1, 1073741824, Fraction.getReducedFraction(2, Integer.MIN_VALUE));
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionMinDenominatorOdd() throws Exception {
        Fraction.getReducedFraction(1, Integer.MIN_VALUE);
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionMinNumeratorNegativeDenominator() throws Exception {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("5", new Fraction(5, 1).toString());
        assertEquals("0", Fraction.ZERO.toString());
        assertEquals("3 / 4", new Fraction(3, 4).toString());
    }

    @Test
    public void testGetField() throws Exception {
        assertSame(FractionField.getInstance(), Fraction.ONE.getField());
    }
}