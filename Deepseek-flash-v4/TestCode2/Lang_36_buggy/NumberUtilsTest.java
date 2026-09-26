:package org.apache.commons.lang3.math;

import org.junit.Test;
import org.junit.Assert;

public class NumberUtilsTest {

    @Test
    public void testToIntNormal() {
        Assert.assertEquals(123, NumberUtils.toInt("123"));
        Assert.assertEquals(-456, NumberUtils.toInt("-456"));
    }

    @Test
    public void testToIntNull() {
        Assert.assertEquals(0, NumberUtils.toInt(null));
        Assert.assertEquals(10, NumberUtils.toInt(null, 10));
    }

    @Test
    public void testToIntInvalid() {
        Assert.assertEquals(0, NumberUtils.toInt("abc"));
        Assert.assertEquals(7, NumberUtils.toInt("abc", 7));
    }

    @Test
    public void testToLongNormal() {
        Assert.assertEquals(123L, NumberUtils.toLong("123"));
        Assert.assertEquals(-456L, NumberUtils.toLong("-456"));
    }

    @Test
    public void testToLongNull() {
        Assert.assertEquals(0L, NumberUtils.toLong(null));
        Assert.assertEquals(10L, NumberUtils.toLong(null, 10L));
    }

    @Test
    public void testToLongInvalid() {
        Assert.assertEquals(0L, NumberUtils.toLong("abc"));
        Assert.assertEquals(7L, NumberUtils.toLong("abc", 7L));
    }

    @Test
    public void testToFloatNormal() {
        Assert.assertEquals(3.14f, NumberUtils.toFloat("3.14"), 0.0f);
        Assert.assertEquals(-2.5f, NumberUtils.toFloat("-2.5"), 0.0f);
    }

    @Test
    public void testToFloatNull() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
        Assert.assertEquals(1.5f, NumberUtils.toFloat(null, 1.5f), 0.0f);
    }

    @Test
    public void testToFloatInvalid() {
        Assert.assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
        Assert.assertEquals(2.5f, NumberUtils.toFloat("abc", 2.5f), 0.0f);
    }

    @Test
    public void testToDoubleNormal() {
        Assert.assertEquals(2.718, NumberUtils.toDouble("2.718"), 0.0);
        Assert.assertEquals(-0.5, NumberUtils.toDouble("-0.5"), 0.0);
    }

    @Test
    public void testToDoubleNull() {
        Assert.assertEquals(0.0, NumberUtils.toDouble(null), 0.0);
        Assert.assertEquals(3.0, NumberUtils.toDouble(null, 3.0), 0.0);
    }

    @Test
    public void testToDoubleInvalid() {
        Assert.assertEquals(0.0, NumberUtils.toDouble("xyz"), 0.0);
        Assert.assertEquals(1.0, NumberUtils.toDouble("xyz", 1.0), 0.0);
    }

    @Test
    public void testToByteNormal() {
        Assert.assertEquals((byte)10, NumberUtils.toByte("10"));
        Assert.assertEquals((byte)-5, NumberUtils.toByte("-5"));
    }

    @Test
    public void testToByteNull() {
        Assert.assertEquals((byte)0, NumberUtils.toByte(null));
        Assert.assertEquals((byte)2, NumberUtils.toByte(null, (byte)2));
    }

    @Test
    public void testToByteInvalid() {
        Assert.assertEquals((byte)0, NumberUtils.toByte("abc"));
        Assert.assertEquals((byte)4, NumberUtils.toByte("abc", (byte)4));
    }

    @Test
    public void testToShortNormal() {
        Assert.assertEquals((short)100, NumberUtils.toShort("100"));
        Assert.assertEquals((short)-20, NumberUtils.toShort("-20"));
    }

    @Test
    public void testToShortNull() {
        Assert.assertEquals((short)0, NumberUtils.toShort(null));
        Assert.assertEquals((short)7, NumberUtils.toShort(null, (short)7));
    }

    @Test
    public void testToShortInvalid() {
        Assert.assertEquals((short)0, NumberUtils.toShort("abc"));
        Assert.assertEquals((short)3, NumberUtils.toShort("abc", (short)3));
    }

    @Test
    public void testCreateNumberNull() {
        Assert.assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumberDoubleHyphen() {
        Assert.assertNull(NumberUtils.createNumber("--123"));
    }

    @Test
    public void testCreateNumberHex() {
        Assert.assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
        Assert.assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xFF"));
    }

    @Test
    public void testCreateNumberLongSuffix() {
        Assert.assertEquals(Long.valueOf(123456789L), NumberUtils.createNumber("123456789L"));
    }

    @Test
    public void testCreateNumberFloatSuffix() {
        Float f = NumberUtils.createNumber("3.14f");
        Assert.assertNotNull(f);
        Assert.assertEquals(3.14f, f.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumberDoubleSuffix() {
        Double d = NumberUtils.createNumber("2.718d");
        Assert.assertNotNull(d);
        Assert.assertEquals(2.718, d.doubleValue(), 0.0);
    }

    @Test
    public void testCreateNumberDecimalNoSuffix() {
        Number n = NumberUtils.createNumber("1.5");
        Assert.assertTrue(n instanceof Double);
        Assert.assertEquals(1.5, n.doubleValue(), 0.0);
    }

    @Test
    public void testCreateNumberExponent() {
        Number n = NumberUtils.createNumber("1e2");
        Assert.assertTrue(n instanceof Double);
        Assert.assertEquals(100.0, n.doubleValue(), 0.0);
    }

    @Test
    public void testCreateNumberExponentWithSuffix() {
        Number n = NumberUtils.createNumber("1.5e2f");
        Assert.assertTrue(n instanceof Float);
        Assert.assertEquals(150.0f, n.floatValue(), 0.0f);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberInvalidSuffix() {
        NumberUtils.createNumber("123x");
    }

    @Test
    public void testCreateNumberInteger() {
        Assert.assertEquals(Integer.valueOf(42), NumberUtils.createNumber("42"));
    }

    @Test
    public void testCreateNumberBigInteger() {
        Assert.assertEquals(new java.math.BigInteger("99999999999999999999"), NumberUtils.createNumber("99999999999999999999"));
    }

    @Test
    public void testCreateNumberEdgeAllZeros() {
        Number n = NumberUtils.createNumber("0.0000");
        Assert.assertNotNull(n);
        Assert.assertEquals(0.0, n.doubleValue(), 0.0);
    }

    @Test
    public void testCreateFloatNull() {
        Assert.assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloatValid() {
        Assert.assertEquals(2.5f, NumberUtils.createFloat("2.5").floatValue(), 0.0f);
    }

    @Test
    public void testCreateDoubleNull() {
        Assert.assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDoubleValid() {
        Assert.assertEquals(3.14, NumberUtils.createDouble("3.14").doubleValue(), 0.0);
    }

    @Test
    public void testCreateIntegerNull() {
        Assert.assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateIntegerValid() {
        Assert.assertEquals(Integer.valueOf(10), NumberUtils.createInteger("10"));
    }

    @Test
    public void testCreateLongNull() {
        Assert.assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLongValid() {
        Assert.assertEquals(Long.valueOf(100L), NumberUtils.createLong("100"));
    }

    @Test
    public void testCreateBigIntegerNull() {
        Assert.assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigIntegerValid() {
        Assert.assertEquals(new java.math.BigInteger("123"), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigDecimalNull() {
        Assert.assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimalBlank() {
        NumberUtils.createBigDecimal("   ");
    }

    @Test
    public void testCreateBigDecimalValid() {
        Assert.assertEquals(new java.math.BigDecimal("1.23"), NumberUtils.createBigDecimal("1.23"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayNull() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinLongArrayEmpty() {
        NumberUtils.min(new long[0]);
    }

    @Test
    public void testMinLongArrayNormal() {
        Assert.assertEquals(3L, NumberUtils.min(new long[]{3L, 5L, 7L}));
        Assert.assertEquals(-1L, NumberUtils.min(new long[]{10L, -1L, 0L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayNull() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinIntArrayEmpty() {
        NumberUtils.min(new int[0]);
    }

    @Test
    public void testMinIntArrayNormal() {
        Assert.assertEquals(2, NumberUtils.min(new int[]{2, 4, 6}));
        Assert.assertEquals(-5, NumberUtils.min(new int[]{-5, 0, 3}));
    }

    @Test
    public void testMinShortArrayNormal() {
        Assert.assertEquals((short)1, NumberUtils.min(new short[]{1, 3, 5}));
    }

    @Test
    public void testMinByteArrayNormal() {
        Assert.assertEquals((byte)0, NumberUtils.min(new byte[]{0, 2, 4}));
    }

    @Test
    public void testMinDoubleArrayNormal() {
        Assert.assertEquals(1.0, NumberUtils.min(new double[]{1.0, 2.0, 3.0}), 0.0);
    }

    @Test
    public void testMinDoubleArrayNaN() {
        Assert.assertEquals(Double.NaN, NumberUtils.min(new double[]{1.0, Double.NaN, 3.0}), 0.0);
    }

    @Test
    public void testMinFloatArrayNormal() {
        Assert.assertEquals(1.0f, NumberUtils.min(new float[]{1.0f, 2.0f, 3.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArrayNaN() {
        Assert.assertEquals(Float.NaN, NumberUtils.min(new float[]{1.0f, Float.NaN, 3.0f}), 0.0f);
    }

    @Test
    public void testMaxLongArrayNormal() {
        Assert.assertEquals(10L, NumberUtils.max(new long[]{1L, 10L, 5L}));
    }

    @Test
    public void testMaxIntArrayNormal() {
        Assert.assertEquals(8, NumberUtils.max(new int[]{8, 3, 5}));
    }

    @Test
    public void testMaxShortArrayNormal() {
        Assert.assertEquals((short)9, NumberUtils.max(new short[]{1, 9, 5}));
    }

    @Test
    public void testMaxByteArrayNormal() {
        Assert.assertEquals((byte)7, NumberUtils.max(new byte[]{-1, 7, 2}));
    }

    @Test
    public void testMaxDoubleArrayNormal() {
        Assert.assertEquals(3.0, NumberUtils.max(new double[]{1.0, 2.0, 3.0}), 0.0);
    }

    @Test
    public void testMaxDoubleArrayNaN() {
        Assert.assertEquals(Double.NaN, NumberUtils.max(new double[]{1.0, Double.NaN, 3.0}), 0.0);
    }

    @Test
    public void testMaxFloatArrayNormal() {
        Assert.assertEquals(3.0f, NumberUtils.max(new float[]{1.0f, 2.0f, 3.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArrayNaN() {
        Assert.assertEquals(Float.NaN, NumberUtils.max(new float[]{1.0f, Float.NaN, 3.0f}), 0.0f);
    }

    @Test
    public void testMinThreeLongs() {
        Assert.assertEquals(1L, NumberUtils.min(1L, 5L, 3L));
        Assert.assertEquals(-2L, NumberUtils.min(10L, -2L, 0L));
    }

    @Test
    public void testMinThreeInts() {
        Assert.assertEquals(1, NumberUtils.min(1, 5, 3));
        Assert.assertEquals(-2, NumberUtils.min(10, -2, 0));
    }

    @Test
    public void testMinThreeShorts() {
        Assert.assertEquals((short)1, NumberUtils.min((short)1, (short)5, (short)3));
    }

    @Test
    public void testMinThreeBytes() {
        Assert.assertEquals((byte)0, NumberUtils.min((byte)0, (byte)5, (byte)2));
    }

    @Test
    public void testMinThreeDoubles() {
        Assert.assertEquals(1.0, NumberUtils.min(1.0, 5.0, 3.0), 0.0);
        Assert.assertEquals(-1.0, NumberUtils.min(-1.0, 0.0, 2.0), 0.0);
    }

    @Test
    public void testMinThreeFloats() {
        Assert.assertEquals(1.0f, NumberUtils.min(1.0f, 5.0f, 3.0f), 0.0f);
    }

    @Test
    public void testMaxThreeLongs() {
        Assert.assertEquals(5L, NumberUtils.max(1L, 5L, 3L));
        Assert.assertEquals(0L, NumberUtils.max(-10L, 0L, -5L));
    }

    @Test
    public void testMaxThreeInts() {
        Assert.assertEquals(5, NumberUtils.max(1, 5, 3));
        Assert.assertEquals(0, NumberUtils.max(-10, 0, -5));
    }

    @Test
    public void testMaxThreeShorts() {
        Assert.assertEquals((short)5, NumberUtils.max((short)1, (short)5, (short)3));
    }

    @Test
    public void testMaxThreeBytes() {
        Assert.assertEquals((byte)5, NumberUtils.max((byte)1, (byte)5, (byte)3));
    }

    @Test
    public void testMaxThreeDoubles() {
        Assert.assertEquals(5.0, NumberUtils.max(1.0, 5.0, 3.0), 0.0);
        Assert.assertEquals(2.0, NumberUtils.max(-1.0, 0.0, 2.0), 0.0);
    }

    @Test
    public void testMaxThreeFloats() {
        Assert.assertEquals(5.0f, NumberUtils.max(1.0f, 5.0f, 3.0f), 0.0f);
    }

    @Test
    public void testIsDigitsNull() {
        Assert.assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigitsEmpty() {
        Assert.assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigitsTrue() {
        Assert.assertTrue(NumberUtils.isDigits("123"));
        Assert.assertTrue(NumberUtils.isDigits("0"));
    }

    @Test
    public void testIsDigitsFalse() {
        Assert.assertFalse(NumberUtils.isDigits("12a"));
        Assert.assertFalse(NumberUtils.isDigits("-123"));
    }

    @Test
    public void testIsNumberNull() {
        Assert.assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumberEmpty() {
        Assert.assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumberHex() {
        Assert.assertTrue(NumberUtils.isNumber("0xFF"));
        Assert.assertTrue(NumberUtils.isNumber("-0xFF"));
    }

    @Test
    public void testIsNumberHexInvalid() {
        Assert.assertFalse(NumberUtils.isNumber("0x"));
        Assert.assertFalse(NumberUtils.isNumber("0xGG"));
    }

    @Test
    public void testIsNumberDecimal() {
        Assert.assertTrue(NumberUtils.isNumber("123.456"));
        Assert.assertTrue(NumberUtils.isNumber(".123"));
    }

    @Test
    public void testIsNumberExponent() {
        Assert.assertTrue(NumberUtils.isNumber("1e10"));
        Assert.assertTrue(NumberUtils.isNumber("1E-5"));
    }

    @Test
    public void testIsNumberWithSuffix() {
        Assert.assertTrue(NumberUtils.isNumber("123L"));
        Assert.assertTrue(NumberUtils.isNumber("1.5f"));
        Assert.assertTrue(NumberUtils.isNumber("2.0D"));
    }

    @Test
    public void testIsNumberInvalid() {
        Assert.assertFalse(NumberUtils.isNumber("--123"));
        Assert.assertFalse(NumberUtils.isNumber("12e"));
        Assert.assertFalse(NumberUtils.isNumber("12L.0"));
        Assert.assertFalse(NumberUtils.isNumber("+-123"));
    }
}