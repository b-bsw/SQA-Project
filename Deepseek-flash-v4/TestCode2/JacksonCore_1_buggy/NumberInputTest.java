package com.fasterxml.jackson.core.io;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class NumberInputTest {

    @Test
    public void testParseIntCharArrayNormal() {
        assertEquals(123, NumberInput.parseInt(new char[]{'1','2','3'}, 0, 3));
    }

    @Test
    public void testParseIntCharArraySingleDigit() {
        assertEquals(5, NumberInput.parseInt(new char[]{'5'}, 0, 1));
    }

    @Test
    public void testParseIntCharArrayNineDigits() {
        assertEquals(123456789, NumberInput.parseInt(new char[]{'1','2','3','4','5','6','7','8','9'}, 0, 9));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseIntCharArrayEmpty() {
        NumberInput.parseInt(new char[]{}, 0, 0);
    }

    @Test
    public void testParseIntStringNormal() {
        assertEquals(42, NumberInput.parseInt("42"));
    }

    @Test
    public void testParseIntStringNegative() {
        assertEquals(-123, NumberInput.parseInt("-123"));
    }

    @Test
    public void testParseIntStringLeadingPlus() {
        assertEquals(7, NumberInput.parseInt("+7"));
    }

    @Test
    public void testParseIntStringOverflowDelegates() {
        assertEquals(1234567890, NumberInput.parseInt("1234567890"));
    }

    @Test
    public void testParseIntStringNonDigitMiddle() {
        assertEquals(12, NumberInput.parseInt("12a3"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntStringOnlyMinus() {
        NumberInput.parseInt("-");
    }

    @Test
    public void testParseLongCharArray() {
        assertEquals(123456789012L, NumberInput.parseLong(new char[]{'1','2','3','4','5','6','7','8','9','0','1','2'}, 0, 12));
    }

    @Test
    public void testParseLongStringShort() {
        assertEquals(999L, NumberInput.parseLong("999"));
    }

    @Test
    public void testParseLongStringLong() {
        assertEquals(123456789012L, NumberInput.parseLong("123456789012"));
    }

    @Test
    public void testInLongRangeCharArrayShorter() {
        assertTrue(NumberInput.inLongRange(new char[]{'1','2','3'}, 0, 3, false));
    }

    @Test
    public void testInLongRangeCharArrayLonger() {
        assertFalse(NumberInput.inLongRange(new char[]{'9','9','9','9','9','9','9','9','9','9','9','9','9','9','9','9','9','9','9','9'}, 0, 20, false));
    }

    @Test
    public void testInLongRangeCharArrayEqualLess() {
        assertTrue(NumberInput.inLongRange(new char[]{'9','2','2','3','3','7','2','0','3','6','8','5','4','7','7','5','8','0','7'}, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArrayEqualGreater() {
        assertFalse(NumberInput.inLongRange(new char[]{'9','2','2','3','3','7','2','0','3','6','8','5','4','7','7','5','8','0','8'}, 0, 19, false));
    }

    @Test
    public void testInLongRangeCharArrayEqualBoundary() {
        assertTrue(NumberInput.inLongRange(new char[]{'9','2','2','3','3','7','2','0','3','6','8','5','4','7','7','5','8','0','7'}, 0, 19, true));
    }

    @Test
    public void testInLongRangeStringShorter() {
        assertTrue(NumberInput.inLongRange("123", false));
    }

    @Test
    public void testInLongRangeStringLonger() {
        assertFalse(NumberInput.inLongRange("99999999999999999999", false));
    }

    @Test
    public void testInLongRangeStringEqualLess() {
        assertTrue(NumberInput.inLongRange("9223372036854775807", false));
    }

    @Test
    public void testInLongRangeStringEqualGreater() {
        assertFalse(NumberInput.inLongRange("9223372036854775808", false));
    }

    @Test
    public void testParseAsIntNull() {
        assertEquals(0, NumberInput.parseAsInt(null, 0));
    }

    @Test
    public void testParseAsIntEmpty() {
        assertEquals(10, NumberInput.parseAsInt("  ", 10));
    }

    @Test
    public void testParseAsIntNormal() {
        assertEquals(77, NumberInput.parseAsInt("77", 0));
    }

    @Test
    public void testParseAsIntLeadingPlus() {
        assertEquals(5, NumberInput.parseAsInt("+5", 0));
    }

    @Test
    public void testParseAsIntWithDecimal() {
        assertEquals(3, NumberInput.parseAsInt("3.14", 0));
    }

    @Test
    public void testParseAsIntNonNumericReturnsDefault() {
        assertEquals(42, NumberInput.parseAsInt("abc", 42));
    }

    @Test
    public void testParseAsLongNull() {
        assertEquals(0L, NumberInput.parseAsLong(null, 0L));
    }

    @Test
    public void testParseAsLongEmpty() {
        assertEquals(100L, NumberInput.parseAsLong("  ", 100L));
    }

    @Test
    public void testParseAsLongNormal() {
        assertEquals(1234567890123L, NumberInput.parseAsLong("1234567890123", 0L));
    }

    @Test
    public void testParseAsLongLeadingPlus() {
        assertEquals(99L, NumberInput.parseAsLong("+99", 0L));
    }

    @Test
    public void testParseAsLongWithDecimal() {
        assertEquals(5L, NumberInput.parseAsLong("5.7", 0L));
    }

    @Test
    public void testParseAsLongNonNumericReturnsDefault() {
        assertEquals(-1L, NumberInput.parseAsLong("xyz", -1L));
    }

    @Test
    public void testParseAsDoubleNull() {
        assertEquals(1.5, NumberInput.parseAsDouble(null, 1.5), 0.0);
    }

    @Test
    public void testParseAsDoubleEmpty() {
        assertEquals(2.5, NumberInput.parseAsDouble("  ", 2.5), 0.0);
    }

    @Test
    public void testParseAsDoubleNormal() {
        assertEquals(3.14, NumberInput.parseAsDouble("3.14", 0.0), 1e-9);
    }

    @Test
    public void testParseAsDoubleNonNumericReturnsDefault() {
        assertEquals(0.0, NumberInput.parseAsDouble("notanumber", 0.0), 0.0);
    }

    @Test
    public void testParseDoubleNormal() {
        assertEquals(2.5, NumberInput.parseDouble("2.5"), 1e-9);
    }

    @Test
    public void testParseDoubleNastySmall() {
        assertEquals(Double.MIN_VALUE, NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE), 0.0);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseDoubleInvalid() {
        NumberInput.parseDouble("notadouble");
    }

    @Test
    public void testParseBigDecimalString() {
        assertEquals(new BigDecimal("123.45"), NumberInput.parseBigDecimal("123.45"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalStringInvalid() {
        NumberInput.parseBigDecimal("invalid");
    }

    @Test
    public void testParseBigDecimalCharArrayFull() {
        assertEquals(new BigDecimal("67.89"), NumberInput.parseBigDecimal(new char[]{'6','7','.','8','9'}));
    }

    @Test
    public void testParseBigDecimalCharArraySub() {
        assertEquals(new BigDecimal("78.9"), NumberInput.parseBigDecimal(new char[]{'7','8','.','9','0'}, 0, 4));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseBigDecimalCharArraySubInvalid() {
        NumberInput.parseBigDecimal(new char[]{'a','b','c'}, 0, 3);
    }

    @Test
    public void testParseIntStringNegativeOverflowDelegates() {
        assertEquals(-1234567890, NumberInput.parseInt("-1234567890"));
    }

    @Test
    public void testParseIntStringTooLongNegative() {
        assertEquals(-2147483648, NumberInput.parseInt("-2147483648"));
    }

    @Test
    public void testParseIntStringNonDigitAtStart() {
        assertEquals(123, NumberInput.parseInt("+123"));
    }

    @Test
    public void testParseLongStringExactTenDigits() {
        assertEquals(1000000000L, NumberInput.parseLong("1000000000"));
    }

    @Test
    public void testParseLongStringOverNineDigits() {
        assertEquals(9999999999L, NumberInput.parseLong("9999999999"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseLongStringInvalid() {
        NumberInput.parseLong("notlong");
    }

    @Test
    public void testInLongRangeStringNegativeShorter() {
        assertTrue(NumberInput.inLongRange("1", true));
    }

    @Test
    public void testInLongRangeStringNegativeLonger() {
        assertFalse(NumberInput.inLongRange("9223372036854775808", true));
    }

    @Test
    public void testInLongRangeStringNegativeEqual() {
        assertTrue(NumberInput.inLongRange("9223372036854775808", true));
    }

    @Test
    public void testParseAsIntWithLeadingSignAndNonDigit() {
        assertEquals(0, NumberInput.parseAsInt("+abc", 0));
    }

    @Test
    public void testParseAsLongWithLeadingSignAndNonDigit() {
        assertEquals(5, NumberInput.parseAsLong("-abc", 5));
    }

    @Test
    public void testParseAsDoubleWithLeadingSignAndNonDigit() {
        assertEquals(1.0, NumberInput.parseAsDouble("+xyz", 1.0), 0.0);
    }

    @Test
    public void testParseDoubleMinValue() {
        assertEquals(Double.MIN_VALUE, NumberInput.parseDouble("4.9E-324"), 0.0);
    }

    @Test
    public void testParseDoubleZero() {
        assertEquals(0.0, NumberInput.parseDouble("0"), 0.0);
    }

    @Test
    public void testParseBigDecimalZero() {
        assertEquals(BigDecimal.ZERO, NumberInput.parseBigDecimal("0"));
    }

    @Test
    public void testParseBigDecimalCharArrayZero() {
        assertEquals(BigDecimal.ZERO, NumberInput.parseBigDecimal(new char[]{'0'}, 0, 1));
    }

    @Test
    public void testParseIntStringLeadingZeros() {
        assertEquals(7, NumberInput.parseInt("007"));
    }

    @Test
    public void testParseIntStringNegativeLeadingZeros() {
        assertEquals(-7, NumberInput.parseInt("-007"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntStringOnlySign() {
        NumberInput.parseInt("+");
    }

    @Test
    public void testParseLongStringShortNegative() {
        assertEquals(-1L, NumberInput.parseLong("-1"));
    }

    @Test
    public void testParseAsIntOverflowReturnsDefault() {
        // This will go through Double parsing path, but overflow int
        assertEquals(0, NumberInput.parseAsInt("999999999999", 0));
    }

    @Test
    public void testParseAsLongNonNumericWithDecimal() {
        assertEquals(3L, NumberInput.parseAsLong("3.14", 0L));
    }

    @Test
    public void testParseAsDoubleWithDecimalReturnsParsed() {
        assertEquals(2.718, NumberInput.parseAsDouble("2.718", 0.0), 1e-9);
    }
}