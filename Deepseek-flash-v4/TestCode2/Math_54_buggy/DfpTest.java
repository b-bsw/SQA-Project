package org.apache.commons.math.dfp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DfpTest {

    private DfpField field;
    private Dfp zero;
    private Dfp one;
    private Dfp two;
    private Dfp ten;
    private Dfp nan;
    private Dfp inf;
    private Dfp ninf;

    @Before
    public void setUp() {
        field = new DfpField(20);
        zero = field.getZero();
        one = field.getOne();
        two = field.getTwo();
        ten = one.newInstance(10);
        nan = one.newInstance("NaN");
        inf = one.newInstance("Infinity");
        ninf = one.newInstance("-Infinity");
    }

    @Test
    public void testBasicStateAndConstants() {
        assertEquals(10000, Dfp.RADIX);
        assertEquals(Dfp.FINITE, zero.classify());
        assertFalse(zero.isNaN());
        assertFalse(zero.isInfinite());
        assertTrue(one.equals(one.newInstance(1)));
        assertEquals(2.0, two.toDouble(), 0.0);
    }

    @Test
    public void testNewInstanceFromStringAndDouble() {
        assertEquals(123.45, one.newInstance("123.45").toDouble(), 1e-12);
        assertEquals(1230.0, one.newInstance("1.23e3").toDouble(), 1e-12);
        assertEquals(-0.001, one.newInstance("-0.001").toDouble(), 1e-15);
        assertTrue(one.newInstance(Double.NaN).isNaN());
        assertTrue(one.newInstance(Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test
    public void testAddSubtract() {
        assertEquals(4.0, two.add(two).toDouble(), 1e-12);
        assertEquals(8.0, ten.subtract(two).toDouble(), 1e-12);
        assertEquals(1.0, one.newInstance("0.75").add(one.newInstance("0.25")).toDouble(), 1e-12);
    }

    @Test
    public void testMultiplyDivide() {
        Dfp three = one.newInstance(3);
        assertEquals(6.0, two.multiply(three).toDouble(), 1e-12);
        assertEquals(0.5, one.divide(two).toDouble(), 1e-12);
        assertEquals(2.5, ten.divide(4).toDouble(), 1e-12);
        assertEquals(8.0, two.multiply(4).toDouble(), 1e-12);
    }

    @Test
    public void testCompareAndEquals() {
        assertTrue(one.lessThan(two));
        assertTrue(two.greaterThan(one));
        assertTrue(one.unequal(two));
        assertFalse(one.lessThan(one));
        assertFalse(nan.equals(nan));

        Dfp copy = new Dfp(two);
        assertTrue(two.equals(copy));
        assertEquals(two.hashCode(), copy.hashCode());

        Dfp factoryCopy = one.newInstance(two);
        assertTrue(two.equals(factoryCopy));
    }

    @Test
    public void testSpecialValuesAndArithmetic() {
        assertTrue(nan.isNaN());
        assertTrue(inf.isInfinite());
        assertTrue(ninf.isInfinite());

        assertEquals("NaN", nan.toString());
        assertEquals("Infinity", inf.toString());
        assertEquals("-Infinity", ninf.toString());

        assertTrue(nan.add(one).isNaN());
        assertTrue(inf.add(one).isInfinite());
        assertTrue(inf.add(ninf).isNaN());
        assertTrue(inf.multiply(zero).isNaN());
        assertTrue(one.divide(zero).isInfinite());
        assertTrue(zero.divide(zero).isNaN());

        assertFalse(nan.lessThan(one));
        assertFalse(nan.greaterThan(one));
    }

    @Test
    public void testRoundingAndTruncation() {
        assertEquals(3.0, one.newInstance("3.7").floor().toDouble(), 0.0);
        assertEquals(4.0, one.newInstance("3.2").ceil().toDouble(), 0.0);
        assertEquals(-4.0, one.newInstance("-3.7").floor().toDouble(), 0.0);
        assertEquals(-3.0, one.newInstance("-3.7").ceil().toDouble(), 0.0);

        assertEquals(2.0, one.newInstance("2.5").rint().toDouble(), 0.0);
        assertEquals(4.0, one.newInstance("3.5").rint().toDouble(), 0.0);
    }

    @Test
    public void testIntValue() {
        assertEquals(2, one.newInstance("2.49").intValue());
        assertEquals(-2, one.newInstance("-2.49").intValue());
        assertEquals(Integer.MAX_VALUE, one.newInstance("2147483648").intValue());
        assertEquals(Integer.MIN_VALUE, one.newInstance("-2147483649").intValue());
    }

    @Test
    public void testLogAndPowerBranches() {
        assertEquals(0, one.newInstance(2).log10());
        assertEquals(1, one.newInstance(20).log10());
        assertEquals(2, one.newInstance(200).log10());
        assertEquals(3, one.newInstance(2000).log10());

        assertEquals(10000.0, one.power10K(1).toDouble(), 1e-9);
        assertEquals(10.0, one.power10(1).toDouble(), 1e-12);
        assertEquals(0.1, one.power10(-1).toDouble(), 1e-15);
    }

    @Test
    public void testSqrtAndRemainder() {
        assertEquals(3.0, one.newInstance(9).sqrt().toDouble(), 1e-12);
        assertEquals(0.0, zero.sqrt().toDouble(), 0.0);
        assertTrue(one.newInstance(-1).sqrt().isNaN());
        assertTrue(one.newInstance("Infinity").sqrt().isInfinite());

        assertEquals(1.0, ten.remainder(one.newInstance(3)).toDouble(), 1e-12);
    }

    @Test
    public void testNextAfterAndCopySign() {
        Dfp next = one.nextAfter(two);
        assertTrue(next.greaterThan(one));
        assertTrue(next.lessThan(two));

        Dfp prev = two.nextAfter(one);
        assertTrue(prev.lessThan(two));
        assertTrue(prev.greaterThan(one));

        assertEquals(1.0, one.nextAfter(one).toDouble(), 0.0);

        Dfp negativeOne = Dfp.copysign(one, one.newInstance("-2"));
        assertEquals(-1.0, negativeOne.toDouble(), 0.0);
    }

    @Test
    public void testToDoubleAndSplit() {
        assertTrue(Double.isInfinite(inf.toDouble()));
        assertTrue(inf.toDouble() > 0);
        assertTrue(Double.isInfinite(ninf.toDouble()));
        assertTrue(ninf.toDouble() < 0);
        assertTrue(Double.isNaN(nan.toDouble()));

        double[] split = one.newInstance("1.5").toSplitDouble();
        assertEquals(1.5, split[0] + split[1], 1e-15);
    }

    @Test
    public void testInvalidScalarAndRadixMismatch() {
        assertTrue(two.multiply(-1).isNaN());
        assertTrue(two.divide(-1).isNaN());

        DfpField otherField = new DfpField(10);
        Dfp other = otherField.getOne();
        assertTrue(other.newInstance(two).isNaN());
        assertFalse(two.lessThan(other));
        assertFalse(two.greaterThan(other));
    }
}