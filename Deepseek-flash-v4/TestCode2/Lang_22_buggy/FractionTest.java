import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void testGetFractionTwoArgs() {
        Fraction fraction = Fraction.getFraction(3, 4);
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());

        Fraction negative = Fraction.getFraction(3, -4);
        assertEquals(-3, negative.getNumerator());
        assertEquals(4, negative.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionTwoArgsDenominatorZero() {
        Fraction.getFraction(1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionTwoArgsDenominatorOverflow() {
        Fraction.getFraction(1, Integer.MIN_VALUE);
    }

    @Test
    public void testGetFractionThreeArgs() {
        Fraction mixed = Fraction.getFraction(1, 2, 3);
        assertEquals(5, mixed.getNumerator());
        assertEquals(3, mixed.getDenominator());

        Fraction negative = Fraction.getFraction(-1, 1, 3);
        assertEquals(-4, negative.getNumerator());
        assertEquals(3, negative.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeArgsDenominatorZero() {
        Fraction.getFraction(1, 1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFractionThreeArgsNegativeNumerator() {
        Fraction.getFraction(1, -1, 3);
    }

    @Test
    public void testGetReducedFraction() {
        Fraction reduced = Fraction.getReducedFraction(2, 4);
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());
    }

    @Test
    public void testGetFractionString() {
        Fraction simple = Fraction.getFraction("3/4");
        assertEquals(3, simple.getNumerator());
        assertEquals(4, simple.getDenominator());

        Fraction mixed = Fraction.getFraction("1 1/2");
        assertEquals(3, mixed.getNumerator());
        assertEquals(2, mixed.getDenominator());

        Fraction whole = Fraction.getFraction("4");
        assertEquals(4, whole.getNumerator());
        assertEquals(1, whole.getDenominator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFractionStringNull() {
        Fraction.getFraction(null);
    }

    @Test
    public void testAdd() {
        Fraction sum = Fraction.getFraction(1, 2).add(Fraction.getFraction(1, 3));
        assertEquals(5, sum.getNumerator());
        assertEquals(6, sum.getDenominator());
    }

    @Test
    public void testSubtract() {
        Fraction difference = Fraction.getFraction(1, 2).subtract(Fraction.getFraction(1, 3));
        assertEquals(1, difference.getNumerator());
        assertEquals(6, difference.getDenominator());
    }

    @Test
    public void testMultiplyBy() {
        Fraction product = Fraction.getFraction(1, 2).multiplyBy(Fraction.getFraction(1, 3));
        assertEquals(1, product.getNumerator());
        assertEquals(6, product.getDenominator());
    }

    @Test
    public void testDivide() {
        Fraction quotient = Fraction.getFraction(1, 2).divide(Fraction.getFraction(1, 3));
        assertEquals(3, quotient.getNumerator());
        assertEquals(2, quotient.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Fraction.getFraction(1, 2).divide(Fraction.ZERO);
    }

    @Test
    public void testPower() {
        Fraction result = Fraction.getFraction(1, 2).pow(3);
        assertEquals(1, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    public void testInvert() {
        Fraction inverted = Fraction.getFraction(2, 3).invert();
        assertEquals(3, inverted.getNumerator());
        assertEquals(2, inverted.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void testInvertZero() {
        Fraction.ZERO.invert();
    }

    @Test
    public void testNegate() {
        Fraction negative = Fraction.getFraction(1, 2).negate();
        assertEquals(-1, negative.getNumerator());
        assertEquals(2, negative.getDenominator());
    }

    @Test
    public void testAbs() {
        Fraction positive = Fraction.getFraction(-1, 2).abs();
        assertEquals(1, positive.getNumerator());
        assertEquals(2, positive.getDenominator());
    }

    @Test
    public void testReduce() {
        Fraction reduced = Fraction.getFraction(2, 4).reduce();
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());
    }

    @Test
    public void testToString() {
        assertEquals("1/2", Fraction.getFraction(1, 2).toString());
        assertEquals("-3/4", Fraction.getFraction(-3, 4).toString());
    }

    @Test
    public void testToProperString() {
        assertEquals("1 1/2", Fraction.getFraction(3, 2).toProperString());
        assertEquals("-1 1/2", Fraction.getFraction(-3, 2).toProperString());
    }

    @Test
    public void testProperParts() {
        Fraction fraction = Fraction.getFraction(3, 2);
        assertEquals(1, fraction.getProperWhole());
        assertEquals(1, fraction.getProperNumerator());
    }

    @Test
    public void testEquals() {
        assertEquals(Fraction.getFraction(1, 2), Fraction.getFraction(1, 2));
        assertNotEquals(Fraction.getFraction(1, 2), Fraction.getFraction(1, 3));
    }

    @Test
    public void testCompareTo() {
        assertTrue(Fraction.getFraction(1, 2).compareTo(Fraction.getFraction(1, 3)) > 0);
        assertTrue(Fraction.getFraction(1, 3).compareTo(Fraction.getFraction(1, 2)) < 0);
        assertEquals(0, Fraction.getFraction(1, 2).compareTo(Fraction.getFraction(2, 4)));
    }
}