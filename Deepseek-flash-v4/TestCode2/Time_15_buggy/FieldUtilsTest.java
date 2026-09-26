package org.joda.time.field;

import static org.junit.Assert.*;

import org.joda.time.DateTimeField;
import org.joda.time.IllegalFieldValueException;
import org.junit.Test;

public class FieldUtilsTest {

    @Test
    public void safeNegateHandlesBoundaries() {
        assertEquals(0, FieldUtils.safeNegate(0));
        assertEquals(-5, FieldUtils.safeNegate(5));
        assertEquals(5, FieldUtils.safeNegate(-5));
    }

    @Test(expected = ArithmeticException.class)
    public void safeNegateRejectsIntegerMinValue() {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    @Test
    public void safeAddIntWithinRange() {
        assertEquals(15, FieldUtils.safeAdd(10, 5));
        assertEquals(-10, FieldUtils.safeAdd(-5, -5));
        assertEquals(0, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddIntOverflowAbove() {
        FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddIntOverflowBelow() {
        FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
    }

    @Test
    public void safeAddLongWithinRange() {
        assertEquals(15L, FieldUtils.safeAdd(10L, 5L));
        assertEquals(-10L, FieldUtils.safeAdd(-5L, -5L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLongOverflowAbove() {
        FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeAddLongOverflowBelow() {
        FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
    }

    @Test
    public void safeSubtractWithinRange() {
        assertEquals(5L, FieldUtils.safeSubtract(10L, 5L));
        assertEquals(-5L, FieldUtils.safeSubtract(-10L, -5L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeSubtractOverflow() {
        FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
    }

    @Test
    public void safeMultiplyWithIntFactorWithinRange() {
        assertEquals(24L, FieldUtils.safeMultiply(12L, 2));
        assertEquals(-24L, FieldUtils.safeMultiply(-12L, 2));
        assertEquals(12L, FieldUtils.safeMultiply(-12L, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyWithIntFactorOverflow() {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyWithMinusOneRejectsLongMinValue() {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1);
    }

    @Test
    public void safeMultiplyToIntWithinRange() {
        assertEquals(6, FieldUtils.safeMultiplyToInt(2L, 3L));
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiplyToInt(Integer.MAX_VALUE, 1L));
    }

    @Test(expected = ArithmeticException.class)
    public void safeMultiplyToIntOverflow() {
        FieldUtils.safeMultiplyToInt(Integer.MAX_VALUE + 1L, 2L);
    }

    @Test
    public void safeToIntWithinRange() {
        assertEquals(0, FieldUtils.safeToInt(0L));
        assertEquals(42, FieldUtils.safeToInt(42L));
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt(Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt(Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void safeToIntRejectsValueAboveMax() {
        FieldUtils.safeToInt(Integer.MAX_VALUE + 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void safeToIntRejectsValueBelowMin() {
        FieldUtils.safeToInt(Integer.MIN_VALUE - 1L);
    }

    @Test
    public void getWrappedValueWrapsWithinRange() {
        assertEquals(5, FieldUtils.getWrappedValue(5, 0, 10));
        assertEquals(0, FieldUtils.getWrappedValue(11, 0, 10));
        assertEquals(10, FieldUtils.getWrappedValue(-1, 0, 10));
        assertEquals(0, FieldUtils.getWrappedValue(-11, 0, 10));
    }

    @Test
    public void getWrappedValueWithFourArgsWrapsCorrectly() {
        assertEquals(1, FieldUtils.getWrappedValue(0, 1, 0, 10));
        assertEquals(0, FieldUtils.getWrappedValue(10, 1, 0, 10));
        assertEquals(10, FieldUtils.getWrappedValue(-1, 0, 0, 10));
    }

    @Test
    public void getWrappedValueHandlesIntegerMinValue() {
        assertEquals(9, FieldUtils.getWrappedValue(Integer.MIN_VALUE, 0, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWrappedValueRejectsInvertedRange() {
        FieldUtils.getWrappedValue(5, 10, 0);
    }

    @Test
    public void verifyValueBoundsWithStringAcceptsBoundaries() {
        FieldUtils.verifyValueBounds("field", 0, 0, 10);
        FieldUtils.verifyValueBounds("field", 10, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsWithStringRejectsBelow() {
        FieldUtils.verifyValueBounds("field", -1, 0, 10);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void verifyValueBoundsWithStringRejectsAbove() {
        FieldUtils.verifyValueBounds("field", 11, 0, 10);
    }

    @Test
    public void verifyValueBoundsWithDateTimeFieldAcceptsValidValue() {
        FieldUtils.verifyValueBounds((DateTimeField) null, 5, 0, 10);
    }

    @Test
    public void equalsHandlesNullAndReferences() {
        assertTrue(FieldUtils.equals(null, null));
        assertTrue(FieldUtils.equals("a", "a"));
        assertFalse(FieldUtils.equals("a", "b"));
        assertFalse(FieldUtils.equals(null, "a"));
        assertFalse(FieldUtils.equals("a", null));
    }
}