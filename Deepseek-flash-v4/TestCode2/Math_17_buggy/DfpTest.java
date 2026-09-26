package org.apache.commons.math3.dfp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DfpTest {

    private DfpField field;

    @Before
    public void setUp() {
        field = new DfpField(20);
    }

    private Dfp d(String s) {
        return field.getZero().newInstance(s);
    }

    private void assertDfpEquals(double expected, Dfp actual) {
        assertEquals(expected, actual.toDouble(), 0.0);
    }

    @Test
    public void testAdd() {
        assertDfpEquals(3.75, d("1.5").add(d("2.25")));
        assertDfpEquals(0.0, d("1").add(d("-1")));
    }

    @Test
    public void testAddWithSpecialValues() {
        assertTrue(d("Infinity").add(d("1")).isInfinite());
        assertTrue(d("NaN").add(d("1")).isNaN());
        assertTrue(d("1").add(d("NaN")).isNaN());
        assertTrue(d("Infinity").add(d("-Infinity")).isNaN());
    }

    @Test
    public void testSubtract() {
        assertDfpEquals(3.0, d("5").subtract(d("2")));
        assertDfpEquals(-3.0, d("2").subtract(d("5")));
    }

    @Test
    public void testMultiply() {
        assertDfpEquals(6.0, d("2").multiply(d("3")));
        assertDfpEquals(-4.0, d("2").multiply(d("-2")));
    }

    @Test
    public void testMultiplyInt() {
        assertDfpEquals(6.0, d("2").multiply(3));
    }

    @Test
    public void testDivide() {
        assertDfpEquals(2.5, d("5").divide(d("2")));
    }

    @Test
    public void testDivideInt() {
        assertDfpEquals(2.5, d("5").divide(2));
    }

    @Test
    public void testNegate() {
        assertDfpEquals(-3.5, d("3.5").negate());
        assertTrue(d("Infinity").negate().isInfinite());
    }

    @Test
    public void testAbs() {
        assertDfpEquals(3.5, d("-3.5").abs());
        assertDfpEquals(3.5, d("3.5").abs());
        assertTrue(d("NaN").abs().isNaN());
    }

    @Test
    public void testFloor() {
        assertDfpEquals(2.0, d("2.7").floor());
        assertDfpEquals(-3.0, d("-2.1").floor());
    }

    @Test
    public void testCeil() {
        assertDfpEquals(3.0, d("2.1").ceil());
        assertDfpEquals(-2.0, d("-2.7").ceil());
    }

    @Test
    public void testRint() {
        assertDfpEquals(2.0, d("2.5").rint());
        assertDfpEquals(4.0, d("3.5").rint());
    }

    @Test
    public void testRemainder() {
        assertDfpEquals(1.0, d("10").remainder(d("3")));
    }

    @Test
    public void testSqrt() {
        assertDfpEquals(2.0, d("4").sqrt());
        assertTrue(d("-4").sqrt().isNaN());
    }

    @Test
    public void testReciprocal() {
        assertDfpEquals(0.5, d("2").reciprocal());
    }

    @Test
    public void testComparePredicates() {
        Dfp one = d("1");
        Dfp two = d("2");

        assertTrue(one.lessThan(two));
        assertFalse(one.greaterThan(two));
        assertTrue(one.unequal(two));
        assertTrue(two.greaterThan(one));
        assertFalse(one.greaterThan(one));
        assertFalse(d("NaN").lessThan(one));
        assertFalse(one.lessThan(d("NaN")));
    }

    @Test
    public void testEqualsAndHashCode() {
        Dfp a = d("1");
        Dfp b = d("1");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testSpecialValues() {
        assertTrue(d("NaN").isNaN());
        assertTrue(d("Infinity").isInfinite());
        assertTrue(d("-Infinity").isInfinite());

        assertEquals(Double.POSITIVE_INFINITY, d("Infinity").toDouble(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, d("-Infinity").toDouble(), 0.0);
        assertTrue(Double.isNaN(d("NaN").toDouble()));
    }

    @Test
    public void testSignPredicates() {
        assertTrue(d("5").strictlyPositive());
        assertTrue(d("-5").strictlyNegative());
        assertTrue(d("0").positiveOrNull());
        assertTrue(d("0").negativeOrNull());
    }

    @Test
    public void testIsZero() {
        assertTrue(d("0").isZero());
        assertTrue(field.getZero().isZero());
        assertFalse(d("1").isZero());
    }

    @Test
    public void testIntValue() {
        assertEquals(123, d("123").intValue());
        assertEquals(123, d("123.9").intValue());
        assertEquals(-123, d("-123.9").intValue());
    }

    @Test
    public void testToStringSpecialValues() {
        assertEquals("NaN", d("NaN").toString());
        assertEquals("Infinity", d("Infinity").toString());
        assertEquals("-Infinity", d("-Infinity").toString());
    }

    @Test
    public void testAccessorsAndNewInstance() {
        Dfp one = d("1");

        assertSame(field, one.getField());
        assertEquals(20, one.getRadixDigits());
        assertTrue(field.getZero().isZero());
        assertDfpEquals(1.0, field.getOne());
        assertDfpEquals(2.0, field.getTwo());

        assertDfpEquals(3, one.newInstance(3));
        assertDfpEquals(4L, one.newInstance(4L));
        assertDfpEquals(5.5, one.newInstance(5.5));

        Dfp src = d("7.5");
        Dfp copy = one.newInstance(src);
        assertTrue(src.equals(copy));
        assertNotSame(src, copy);
    }

    @Test
    public void testNextAfter() {
        Dfp one = d("1");
        Dfp next = one.nextAfter(d("2"));

        assertTrue(one.lessThan(next));
        assertTrue(next.lessThan(d("2")));
    }

    @Test
    public void testClassify() {
        assertEquals(Dfp.FINITE, d("1").classify());
        assertEquals(Dfp.INFINITE, d("Infinity").classify());
        assertEquals(Dfp.QNAN, d("NaN").classify());
    }
}