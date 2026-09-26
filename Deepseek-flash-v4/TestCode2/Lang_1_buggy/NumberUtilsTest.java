package org.apache.commons.lang3.math;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {

    @Test
    public void testParseMethods() {
        assertEquals(0, NumberUtils.toInt(null));
        assertEquals(5, NumberUtils.toInt("5"));
        assertEquals(3, NumberUtils.toInt("bad", 3));

        assertEquals(0L, NumberUtils.toLong(null));
        assertEquals(7L, NumberUtils.toLong("7"));
        assertEquals(4L, NumberUtils.toLong("bad", 4L));

        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0001f);

        assertEquals(2.0d, NumberUtils.toDouble("bad", 2.0d), 0.0d);

        assertEquals(8, NumberUtils.toByte("8"));
        assertEquals(0, NumberUtils.toByte("bad"));

        assertEquals(9, NumberUtils.toShort("9"));
        assertEquals(0, NumberUtils.toShort("bad"));
    }

    @Test
    public void testCreateNumberBasic() {
        assertNull(NumberUtils.createNumber(null));

        assertTrue(NumberUtils.createNumber("1") instanceof Integer);
        assertTrue(NumberUtils.createNumber("123456789012") instanceof Long);
        assertTrue(NumberUtils.createNumber("123456789012345678901234") instanceof BigInteger);

        assertTrue(NumberUtils.createNumber("1.1") instanceof Float);
        assertTrue(NumberUtils.createNumber("1.23456789") instanceof Double);
        assertTrue(NumberUtils.createNumber("1.123456789012345678901234") instanceof BigDecimal);

        assertTrue(NumberUtils.createNumber("1.1f") instanceof Float);
        assertTrue(NumberUtils.createNumber("1.1d") instanceof Double);

        assertEquals(Integer.valueOf(31), NumberUtils.createNumber("0x1F"));
        assertEquals(Long.valueOf(1L), NumberUtils.createNumber("1L"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlankFails() {
        NumberUtils.createNumber(" ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidFails() {
        NumberUtils.createNumber("1x");
    }

    @Test
    public void testCreateBigNumbers() {
        assertEquals(
                new BigInteger("123456789012345678901234567890"),
                NumberUtils.createBigInteger("123456789012345678901234567890"));

        assertEquals(new BigDecimal("1.1"), NumberUtils.createBigDecimal("1.1"));
    }

    @Test
    public void testMinMaxArrayValues() {
        assertEquals(1, NumberUtils.min(new int[]{2, 1, 3}));
        assertEquals(1L, NumberUtils.min(new long[]{2L, 1L, 3L}));
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 2, (short) 1, (short) 3}));
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 2, (byte) 1, (byte) 3}));
        assertEquals(1.0d, NumberUtils.min(new double[]{2.0d, 1.0d, 3.0d}), 0.0d);
        assertEquals(1.0f, NumberUtils.min(new float[]{2.0f, 1.0f, 3.0f}), 0.0f);

        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}));
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
        assertEquals((short) 3, NumberUtils.max(new short[]{(short) 1, (short) 3, (short) 2}));
        assertEquals((byte) 3, NumberUtils.max(new byte[]{(byte) 1, (byte) 3, (byte) 2}));
        assertEquals(3.0d, NumberUtils.max(new double[]{1.0d, 3.0d, 2.0d}), 0.0d);
        assertEquals(3.0f, NumberUtils.max(new float[]{1.0f, 3.0f, 2.0f}), 0.0f);
    }

    @Test
    public void testMinMaxArraysWithNaN() {
        assertTrue(Double.isNaN(NumberUtils.min(new double[]{1.0d, Double.NaN})));
        assertTrue(Float.isNaN(NumberUtils.max(new float[]{1.0f, Float.NaN})));
    }

    @Test
    public void testMinMaxSingleElementArray() {
        assertEquals(42, NumberUtils.min(new int[]{42}));
        assertEquals(42L, NumberUtils.max(new long[]{42L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinEmptyArrayThrows() {
        NumberUtils.min(new int[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxNullArrayThrows() {
        double[] array = null;
        NumberUtils.max(array);
    }

    @Test
    public void testPrimitiveMinMax() {
        assertEquals(1, NumberUtils.min(3, 1, 2));
        assertEquals(3, NumberUtils.max(1, 3, 2));

        assertEquals(1L, NumberUtils.min(3L, 1L, 2L));
        assertEquals(3L, NumberUtils.max(1L, 3L, 2L));

        assertEquals((byte) 1, NumberUtils.min((byte) 3, (byte) 1, (byte) 2));
        assertEquals((byte) 3, NumberUtils.max((byte) 1, (byte) 3, (byte) 2));

        assertEquals((short) 1, NumberUtils.min((short) 3, (short) 1, (short) 2));
        assertEquals((short) 3, NumberUtils.max((short) 1, (short) 3, (short) 2));

        assertEquals(1.0d, NumberUtils.min(3.0d, 1.0d, 2.0d), 0.0d);
        assertEquals(3.0d, NumberUtils.max(1.0d, 3.0d, 2.0d), 0.0d);

        assertEquals(1.0f, NumberUtils.min(3.0f, 1.0f, 2.0f), 0.0f);
        assertEquals(3.0f, NumberUtils.max(1.0f, 3.0f, 2.0f), 0.0f);
    }

    @Test
    public void testIsDigits() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("123"));
        assertFalse(NumberUtils.isDigits("-1"));
        assertFalse(NumberUtils.isDigits("12.3"));
    }

    @Test
    public void testIsNumber() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertTrue(NumberUtils.isNumber("1"));
        assertTrue(NumberUtils.isNumber("-1.1"));
        assertTrue(NumberUtils.isNumber("1e3"));
        assertTrue(NumberUtils.isNumber("0x1F"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("1.1L"));
    }
}