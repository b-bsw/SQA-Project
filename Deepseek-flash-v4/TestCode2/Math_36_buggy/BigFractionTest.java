package org.apache.commons.math.fraction;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.ZeroException;
import org.apache.commons.math.fraction.FractionConversionException;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigFractionTest {

    @Test
    public void testConstructorBigIntegerNormal() {
        BigFraction f = new BigFraction(BigInteger.valueOf(6), BigInteger.valueOf(8));
        assertEquals(BigInteger.valueOf(3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorBigIntegerNullNum() {
        new BigFraction((BigInteger) null, BigInteger.ONE);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorBigIntegerNullDen() {
        new BigFraction(BigInteger.ONE, (BigInteger) null);
    }

    @Test(expected = ZeroException.class)
    public void testConstructorBigIntegerZeroDen() {
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void testConstructorBigIntegerZeroNum() {
        BigFraction f = new BigFraction(BigInteger.ZERO, BigInteger.valueOf(5));
        assertEquals(BigInteger.ZERO, f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerNegativeDen() {
        BigFraction f = new BigFraction(BigInteger.valueOf(3), BigInteger.valueOf(-4));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerNoReduction() {
        BigFraction f = new BigFraction(BigInteger.valueOf(1), BigInteger.valueOf(3));
        assertEquals(BigInteger.ONE, f.getNumerator());
        assertEquals(BigInteger.valueOf(3), f.getDenominator());
    }

    @Test
    public void testConstructorBigIntegerNegativeNumerator() {
        BigFraction f = new BigFraction(BigInteger.valueOf(-6), BigInteger.valueOf(8));
        assertEquals(BigInteger.valueOf(-3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleNaN() {
        new BigFraction(Double.NaN);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorDoubleInfinity() {
        new BigFraction(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testConstructorDoubleNormal() {
        BigFraction f = new BigFraction(0.75);
        assertEquals(BigInteger.valueOf(3), f.getNumerator());
        assertEquals(BigInteger.valueOf(4), f.getDenominator());
    }

    @Test
    public void testConstructorDoubleEpsilonMaxIterations() {
        BigFraction f = new BigFraction(0.3333333333, 1e-9, 100);
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
        assertEquals(BigInteger.valueOf(3), f.getDenominator());
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleEpsilonMaxIterationsOverflow() {
        new BigFraction(Math.PI, 1e-15, 1000);
    }

    @Test
    public void testConstructorDoubleImmediateConvergence() {
        BigFraction f = new BigFraction(0.5, 0.1, 10);
        assertEquals(0.5, f.doubleValue(), 1e-15);
        assertEquals(BigInteger.ONE, f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructorDoubleConvergenceLoop() {
        BigFraction f = new BigFraction(0.14285714285714285, 1e-15, 100);
        assertEquals(new BigFraction(1, 7), f);
    }

    @Test(expected = FractionConversionException.class)
    public void testConstructorDoubleMaxIterationsExceeded() {
        new BigFraction(Math.PI, 1e-20, 10);
    }

    @Test
    public void testConstructorDoubleMaxDenominator() {
        BigFraction f = new BigFraction(0.3333, 100);
        assertEquals(new BigFraction(1, 3), f);
    }

    @Test
    public void testConstructorIntInt() {
        BigFraction f = new BigFraction(2, 4);
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructorInt() {
        BigFraction f = new BigFraction(7);
        assertEquals(BigInteger.valueOf(7), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testConstructorLongLong() {
        BigFraction f = new BigFraction(3L, 6L);
        assertEquals(BigInteger.valueOf(1), f.getNumerator());
        assertEquals(BigInteger.valueOf(2), f.getDenominator());
    }

    @Test
    public void testConstructorLong() {
        BigFraction f = new BigFraction(5L);
        assertEquals(BigInteger.valueOf(5), f.getNumerator());
        assertEquals(BigInteger.ONE, f.getDenominator());
    }

    @Test
    public void testGetReducedFractionZero() {
        assertSame(BigFraction.ZERO, BigFraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFractionNormal() {
        BigFraction f = BigFraction.getReducedFraction(9, 12);
        assertEquals(new BigFraction(3, 4), f);
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNullFraction() {
        BigFraction.ONE_HALF.add((BigFraction) null);
    }

    @Test
    public void testAddZero() {
        assertSame(BigFraction.ONE_HALF, BigFraction.ONE_HALF.add(BigFraction.ZERO));
    }

    @Test
    public void testAddSameDenominator() {
        BigFraction result = new BigFraction(1, 5).add(new BigFraction(2, 5));
        assertEquals(new BigFraction(3, 5), result);
    }

    @Test
    public void testAddDifferentDenominator() {
        BigFraction result = BigFraction.ONE_HALF.add(BigFraction.ONE_THIRD);
        assertEquals(new BigFraction(5, 6), result);
    }

    @Test
    public void testAddBigInteger() {
        assertEquals(new BigFraction(5, 2), BigFraction.ONE_HALF.add(BigInteger.valueOf(2)));
    }

    @Test
    public void testAddInt() {
        assertEquals(new BigFraction(3, 2), BigFraction.ONE_HALF.add(1));
    }

    @Test
    public void testAddLong() {
        assertEquals(new BigFraction(3, 2), BigFraction.ONE_HALF.add(1L));
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNullFraction() {
        BigFraction.ONE_HALF.subtract((BigFraction) null);
    }

    @Test
    public void testSubtractZero() {
        assertSame(BigFraction.ONE_HALF, BigFraction.ONE_HALF.subtract(BigFraction.ZERO));
    }

    @Test
    public void testSubtractSameDenominator() {
        BigFraction result = new BigFraction(3, 7).subtract(new BigFraction(1, 7));
        assertEquals(new BigFraction(2, 7), result);
    }

    @Test
    public void testSubtractDifferentDenominator() {
        BigFraction result = BigFraction.ONE_HALF.subtract(BigFraction.ONE_QUARTER);
        assertEquals(new BigFraction(1, 4), result);
    }

    @Test
    public void testSubtractBigInteger() {
        assertEquals(new BigFraction(-3, 2), BigFraction.ONE_HALF.subtract(BigInteger.valueOf(2)));
    }

    @Test
    public void testSubtractInt() {
        assertEquals(new BigFraction(-1, 2), BigFraction.ONE_HALF.subtract(1));
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNullFraction() {
        BigFraction.ONE_HALF.multiply((BigFraction) null);
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(BigFraction.ZERO, BigFraction.ONE_HALF.multiply(BigFraction.ZERO));
    }

    @Test
    public void testMultiplyNormal() {
        BigFraction result = BigFraction.ONE_HALF.multiply(new BigFraction(2, 3));
        assertEquals(new BigFraction(1, 3), result);
    }

    @Test
    public void testMultiplyBigInteger() {
        assertEquals(new BigFraction(3, 2), BigFraction.ONE_HALF.multiply(BigInteger.valueOf(3)));
    }

    @Test
    public void testMultiplyInt() {
        assertEquals(new BigFraction(3, 2), BigFraction.ONE_HALF.multiply(3));
    }

    @Test
    public void testMultiplyLong() {
        assertEquals(new BigFraction(3, 2), BigFraction.ONE_HALF.multiply(3L));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNullFraction() {
        BigFraction.ONE_HALF.divide((BigFraction) null);
    }

    @Test(expected = ZeroException.class)
    public void testDivideByZeroFraction() {
        BigFraction.ONE_HALF.divide(BigFraction.ZERO);
    }

    @Test
    public void testDivideNormal() {
        BigFraction result = BigFraction.ONE_HALF.divide(new BigFraction(3, 4));
        assertEquals(new BigFraction(2, 3), result);
    }

    @Test
    public void testDivideBigInteger() {
        assertEquals(new BigFraction(1, 6), BigFraction.ONE_HALF.divide(BigInteger.valueOf(3)));
    }

    @Test(expected = ZeroException.class)
    public void testDivideByZeroBigInteger() {
        BigFraction.ONE_HALF.divide(BigInteger.ZERO);
    }

    @Test
    public void testDivideInt() {
        assertEquals(new BigFraction(1, 4), BigFraction.ONE_HALF.divide(2));
    }

    @Test
    public void testDivideLong() {
        assertEquals(new BigFraction(1, 6), BigFraction.ONE_HALF.divide(3L));
    }

    @Test
    public void testPowIntZero() {
        assertEquals(BigFraction.ONE, BigFraction.ONE_HALF.pow(0));
    }

    @Test
    public void testPowIntPositive() {
        BigFraction result = new BigFraction(2, 3).pow(3);
        assertEquals(new BigFraction(8, 27), result);
    }

    @Test
    public void testPowIntNegative() {
        BigFraction result = new BigFraction(2, 3).pow(-2);
        assertEquals(new BigFraction(9, 4), result);
    }

    @Test
    public void testPowLong() {
        assertEquals(new BigFraction(1, 8), BigFraction.ONE_HALF.pow(3L));
    }

    @Test
    public void testPowLongNegative() {
        assertEquals(new BigFraction(8, 1), BigFraction.ONE_HALF.pow(-3L));
    }

    @Test
    public void testPowBigInteger() {
        assertEquals(new BigFraction(1, 4), BigFraction.ONE_HALF.pow(BigInteger.valueOf(2)));
    }

    @Test
    public void testPowBigIntegerNegative() {
        assertEquals(new BigFraction(4, 1), BigFraction.ONE_HALF.pow(BigInteger.valueOf(-2)));
    }

    @Test
    public void testPowDoubleExponent() {
        double result = BigFraction.ONE_HALF.pow(2.0);
        assertEquals(0.25, result, 1e-15);
    }

    @Test
    public void testCompareToEqual() {
        assertEquals(0, BigFraction.ONE_HALF.compareTo(new BigFraction(2, 4)));
    }

    @Test
    public void testCompareToLess() {
        assertTrue(BigFraction.ONE_HALF.compareTo(BigFraction.ONE) < 0);
    }

    @Test
    public void testCompareToGreater() {
        assertTrue(BigFraction.ONE.compareTo(BigFraction.ONE_HALF) > 0);
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(BigFraction.ONE_HALF.equals(BigFraction.ONE_HALF));
    }

    @Test
    public void testEqualsEqualFraction() {
        assertTrue(new BigFraction(1, 2).equals(new BigFraction(2, 4)));
    }

    @Test
    public void testEqualsDifferentFraction() {
        assertFalse(BigFraction.ONE_HALF.equals(BigFraction.ONE_THIRD));
    }

    @Test
    public void testEqualsNotBigFraction() {
        assertFalse(BigFraction.ONE_HALF.equals("string"));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(BigFraction.ONE_HALF.equals(null));
    }

    @Test
    public void testHashCodeConsistency() {
        BigFraction a = new BigFraction(1, 2);
        BigFraction b = new BigFraction(2, 4);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringInteger() {
        assertEquals("3", new BigFraction(3, 1).toString());
    }

    @Test
    public void testToStringZero() {
        assertEquals("0", BigFraction.ZERO.toString());
    }

    @Test
    public void testToStringFraction() {
        assertEquals("1 / 2", BigFraction.ONE_HALF.toString());
    }

    @Test
    public void testReduce() {
        BigFraction f = new BigFraction(6, 9);
        BigFraction reduced = f.reduce();
        assertEquals(new BigFraction(2, 3), reduced);
    }

    @Test
    public void testAbsPositive() {
        assertSame(BigFraction.ONE_HALF, BigFraction.ONE_HALF.abs());
    }

    @Test
    public void testAbsNegative() {
        assertEquals(BigFraction.ONE_HALF, new BigFraction(-1, 2).abs());
    }

    @Test
    public void testNegate() {
        assertEquals(new BigFraction(-1, 2), BigFraction.ONE_HALF.negate());
    }

    @Test
    public void testReciprocal() {
        assertEquals(new BigFraction(2, 1), BigFraction.ONE_HALF.reciprocal());
    }

    @Test
    public void testDoubleValue() {
        assertEquals(0.5, BigFraction.ONE_HALF.doubleValue(), 1e-15);
    }

    @Test
    public void testFloatValue() {
        assertEquals(0.5f, BigFraction.ONE_HALF.floatValue(), 1e-7);
    }

    @Test
    public void testIntValue() {
        assertEquals(2, new BigFraction(7, 3).intValue());
    }

    @Test
    public void testLongValue() {
        assertEquals(2L, new BigFraction(7, 3).longValue());
    }

    @Test
    public void testPercentageValue() {
        assertEquals(50.0, BigFraction.ONE_HALF.percentageValue(), 1e-15);
    }

    @Test
    public void testBigDecimalValue() {
        assertEquals(new BigDecimal("0.5"), BigFraction.ONE_HALF.bigDecimalValue());
    }

    @Test
    public void testBigDecimalValueRoundingMode() {
        BigDecimal result = new BigFraction(1, 3).bigDecimalValue(BigDecimal.ROUND_HALF_UP);
        assertTrue(result.compareTo(new BigDecimal("0.3333333333")) > 0);
    }

    @Test
    public void testBigDecimalValueScaleRoundingMode() {
        assertEquals(new BigDecimal("0.33"), new BigFraction(1, 3).bigDecimalValue(2, BigDecimal.ROUND_DOWN));
    }

    @Test
    public void testGetNumerator() {
        assertEquals(BigInteger.valueOf(1), BigFraction.ONE_HALF.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(BigInteger.valueOf(2), BigFraction.ONE_HALF.getDenominator());
    }

    @Test
    public void testGetNumeratorAsInt() {
        assertEquals(3, new BigFraction(3, 5).getNumeratorAsInt());
    }

    @Test
    public void testGetDenominatorAsInt() {
        assertEquals(5, new BigFraction(3, 5).getDenominatorAsInt());
    }

    @Test
    public void testGetNumeratorAsLong() {
        assertEquals(3L, new BigFraction(3, 5).getNumeratorAsLong());
    }

    @Test
    public void testGetDenominatorAsLong() {
        assertEquals(5L, new BigFraction(3, 5).getDenominatorAsLong());
    }

    @Test
    public void testGetField() {
        assertNotNull(BigFraction.ONE.getField());
    }
}