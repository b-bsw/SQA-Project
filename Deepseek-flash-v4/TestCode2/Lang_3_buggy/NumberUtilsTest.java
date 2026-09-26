package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberUtilsTest {

    // --- toInt ---
    @Test
    public void testToIntNormal() {
        assertEquals(123, NumberUtils.toInt("123"));
        assertEquals(-5, NumberUtils.toInt("-5"));
    }

    @Test
    public void testToIntNull() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(42, NumberUtils.toInt(null, 42));
    }

    @Test
    public void testToIntInvalid() {
        assertEquals(0, NumberUtils.toInt("abc"));
        assertEquals(7, NumberUtils.toInt("abc", 7));
    }

    // --- toLong ---
    @Test
    public void testToLongNormal() {
        assertEquals(999L, NumberUtils.toLong("999"));
    }

    @Test
    public void testToLongNull() {
        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(10L, NumberUtils.toLong(null, 10L));
    }

    @Test
    public void testToLongInvalid() {
        assertEquals(0L, NumberUtils.toLong("12.5"));
        assertEquals(-1L, NumberUtils.toLong("x", -1L));
    }

    // --- toFloat ---
    @Test
    public void testToFloatNormal() {
        assertEquals(3.14f, NumberUtils.toFloat("3.14"), 1e-6f);
    }

    @Test
    public void testToFloatNull() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 1e-6f);
        assertEquals(2.5f, NumberUtils.toFloat(null, 2.5f), 1e-6f);
    }

    @Test
    public void testToFloatInvalid() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 1e-6f);
    }

    // --- toDouble ---
    @Test
    public void testToDoubleNormal() {
        assertEquals(2.718, NumberUtils.toDouble("2.718"), 1e-9);
    }

    @Test
    public void testToDoubleNull() {
        assertEquals(0.0, NumberUtils.toDouble(null), 1e-9);
    }

    // --- toByte ---
    @Test
    public void testToByteNormal() {
        assertEquals((byte)12, NumberUtils.toByte("12"));
    }

    @Test
    public void testToByteNull() {
        assertEquals((byte)0, NumberUtils.toByte(null));
        assertEquals((byte)5, NumberUtils.toByte(null, (byte)5));
    }

    // --- toShort ---
    @Test
    public void testToShortNormal() {
        assertEquals((short)100, NumberUtils.toShort("100"));
    }

    @Test
    public void testToShortNull() {
        assertEquals((short)0, NumberUtils.toShort(null));
    }

    // --- createNumber ---
    @Test
    public void testCreateNumberNull() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumberInteger() throws NumberFormatException {
        assertEquals(Integer.valueOf(456), NumberUtils.createNumber("456"));
    }

    @Test
    public void testCreateNumberLong() throws NumberFormatException {
        assertEquals(Long.valueOf(123456789012L), NumberUtils.createNumber("123456789012"));
    }

    @Test
    public void testCreateNumberBigInteger() throws NumberFormatException {
        assertTrue(NumberUtils.createNumber("123456789012345678901234567890") instanceof java.math.BigInteger);
    }

    @Test
    public void testCreateNumberFloat() throws NumberFormatException {
        Float f = (Float) NumberUtils.createNumber("3.14f");
        assertEquals(3.14f, f.floatValue(), 1e-6f);
    }

    @Test
    public void testCreateNumberDouble() throws NumberFormatException {
        Double d = (Double) NumberUtils.createNumber("2.718d");
        assertEquals(2.718, d.doubleValue(), 1e-9);
    }

    @Test
    public void testCreateNumberHex() throws NumberFormatException {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        assertEquals(Long.valueOf(0xABCDEF12L), NumberUtils.createNumber("0xABCDEF12"));
    }

    @Test
    public void testCreateNumberHexBig() throws NumberFormatException {
        assertTrue(NumberUtils.createNumber("0x1234567890ABCDEF") instanceof java.math.BigInteger);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidSuffix() throws NumberFormatException {
        NumberUtils.createNumber("12z");
    }

    // --- createFloat / createDouble / createInteger / createLong ---
    @Test
    public void testCreateFloatNull() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloatNormal() {
        assertEquals(1.5f, NumberUtils.createFloat("1.5").floatValue(), 1e-6f);
    }

    @Test
    public void testCreateDoubleNull() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDoubleNormal() {
        assertEquals(3.0, NumberUtils.createDouble("3.0").doubleValue(), 1e-9);
    }

    @Test
    public void testCreateIntegerNull() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateIntegerNormal() {
        assertEquals(Integer.valueOf(77), NumberUtils.createInteger("77"));
    }

    @Test
    public void testCreateLongNull() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLongNormal() {
        assertEquals(Long.valueOf(999L), NumberUtils.createLong("999"));
    }

    // --- createBigInteger ---
    @Test
    public void testCreateBigIntegerNull() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigIntegerDecimal() {
        assertEquals(java.math.BigInteger.valueOf(12345), NumberUtils.createBigInteger("12345"));
    }

    @Test
    public void testCreateBigIntegerHex() {
        assertEquals(java.math.BigInteger.valueOf(255), NumberUtils.createBigInteger("0xFF"));
    }

    @Test
    public void testCreateBigIntegerOctal() {
        assertEquals(java.math.BigInteger.valueOf(8), NumberUtils.createBigInteger("010"));
    }

    @Test
    public void testCreateBigIntegerNegative() {
        assertEquals(java.math.BigInteger.valueOf(-10), NumberUtils.createBigInteger("-10"));
    }

    // --- createBigDecimal ---
    @Test
    public void testCreateBigDecimalNull() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalBlank() {
        NumberUtils.createBigDecimal("  ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalDoubleDash() {
        NumberUtils.createBigDecimal("--1.5");
    }

    @Test
    public void testCreateBigDecimalNormal() {
        assertEquals(new java.math.BigDecimal("12.34"), NumberUtils.createBigDecimal("12.34"));
    }

    // --- min/max array ---
    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayNull() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayEmpty() {
        NumberUtils.min(new long[]{});
    }

    @Test
    public void testMinLongArrayNormal() {
        assertEquals(2L, NumberUtils.min(new long[]{5L, 2L, 8L}));
    }

    @Test
    public void testMinIntArray() {
        assertEquals(-3, NumberUtils.min(new int[]{1, -3, 7}));
    }

    @Test
    public void testMinDoubleArray() {
        assertEquals(1.5, NumberUtils.min(new double[]{3.2, 1.5, 2.0}), 1e-9);
    }

    @Test
    public void testMinDoubleArrayNaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0, Double.NaN, 2.0})));
    }

    @Test
    public void testMinFloatArray() {
        assertEquals(2.0f, NumberUtils.min(new float[]{5.0f, 3.0f, 2.0f}), 1e-6f);
    }

    @Test
    public void testMaxIntArray() {
        assertEquals(9, NumberUtils.max(new int[]{3, 9, 1}));
    }

    @Test
    public void testMaxLongArray() {
        assertEquals(100L, NumberUtils.max(new long[]{10L, 100L, 50L}));
    }

    @Test
    public void testMaxDoubleArrayNaN() {
        assertTrue(Double.isNaN(NumberUtils.max(new double[]{1.0, Double.NaN, 3.0})));
    }

    // --- min/max three values ---
    @Test
    public void testMinThreeInts() {
        assertEquals(1, NumberUtils.min(5, 1, 3));
        assertEquals(-1, NumberUtils.min(-1, 0, 2));
    }

    @Test
    public void testMaxThreeLongs() {
        assertEquals(7L, NumberUtils.max(7L, 2L, 5L));
    }

    @Test
    public void testMinThreeDoubles() {
        assertEquals(2.0, NumberUtils.min(3.0, 2.0, 5.0), 1e-9);
    }

    // --- isDigits ---
    @Test
    public void testIsDigitsNull() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigitsEmpty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigitsTrue() {
        assertTrue(NumberUtils.isDigits("123456"));
    }

    @Test
    public void testIsDigitsFalse() {
        assertFalse(NumberUtils.isDigits("12a"));
    }

    // --- isNumber ---
    @Test
    public void testIsNumberNull() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumberEmpty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumberValid() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("12.34"));
        assertTrue(NumberUtils.isNumber("-5.0e2"));
        assertTrue(NumberUtils.isNumber("0xFF"));
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumberInvalid() {
        assertFalse(NumberUtils.isNumber("--1"));
        assertFalse(NumberUtils.isNumber("12.3.4"));
        assertFalse(NumberUtils.isNumber("0xFG"));
        assertFalse(NumberUtils.isNumber("12e"));
        assertFalse(NumberUtils.isNumber("12Lx"));
    }
}