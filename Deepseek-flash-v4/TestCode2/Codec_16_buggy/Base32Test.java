package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class Base32Test {

    private Base32 base32;
    private Base32 base32Hex;

    @Before
    public void setUp() {
        base32 = new Base32();
        base32Hex = new Base32(true);
    }

    @Test
    public void testEncodeEmptyArray() {
        byte[] input = new byte[0];
        byte[] expected = new byte[0];
        assertArrayEquals(expected, base32.encode(input));
    }

    @Test
    public void testEncodeSingleByte() {
        byte[] input = new byte[]{(byte) 0x41};
        byte[] result = base32.encode(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testEncodeFiveBytes() {
        byte[] input = new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F};
        byte[] result = base32.encode(input);
        assertNotNull(result);
        byte[] expected = new byte[]{'J', 'B', 'S', 'W', 'Y', '3', 'D', 'P'};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDecodeValidInput() {
        byte[] input = new byte[]{'J', 'B', 'S', 'W', 'Y', '3', 'D', 'P'};
        byte[] result = base32.decode(input);
        assertNotNull(result);
        assertArrayEquals(new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F}, result);
    }

    @Test
    public void testDecodeWithPadding() {
        byte[] input = new byte[]{'M', 'F', 'Z', 'W', 'K', 'I', 'D', 'E'};
        byte[] result = base32.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testIsInAlphabetValid() {
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) 'Z'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertTrue(base32.isInAlphabet((byte) '7'));
    }

    @Test
    public void testIsInAlphabetInvalid() {
        assertFalse(base32.isInAlphabet((byte) '!'));
        assertFalse(base32.isInAlphabet((byte) '0'));
        assertFalse(base32.isInAlphabet((byte) 0));
    }

    @Test
    public void testConstructorWithLineLengthAndSeparator() {
        Base32 b32 = new Base32(10, new byte[]{'\n'});
        assertNotNull(b32);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithLineLengthAndNullSeparator() {
        new Base32(10, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithLineSeparatorContainingBase32Chars() {
        new Base32(10, new byte[]{'A'});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidPad() {
        new Base32((byte) 'A');
    }

    @Test
    public void testHexEncoding() {
        byte[] input = new byte[]{0x48, 0x65};
        byte[] result = base32Hex.encode(input);
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

    @Test
    public void testDecodeWithEofFlag() {
        Base32 b32 = new Base32();
        byte[] input = new byte[]{'J', 'B', 'S', 'W', 'Y', '3', 'D', 'P'};
        byte[] result = b32.decode(input);
        assertArrayEquals(new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F}, result);
    }

    @Test
    public void testEncodeWithEof() {
        Base32 b32 = new Base32();
        byte[] input = new byte[]{0x41};
        byte[] result = b32.encode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeSingleCharacter() {
        byte[] input = new byte[]{'M'};
        byte[] result = base32.decode(input);
        assertNotNull(result);
        assertEquals(1, result.length);
    }

    @Test
    public void testEncodeDecodeRoundTrip() {
        byte[] original = new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x20, 0x57, 0x6F, 0x72, 0x6C, 0x64};
        byte[] encoded = base32.encode(original);
        byte[] decoded = base32.decode(encoded);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testContainsAlphabetOrPad() {
        Base32 b32 = new Base32();
        assertFalse(b32.containsAlphabetOrPad(new byte[]{'\n'}));
    }

    @Test
    public void testEncodeWithLineLength() {
        Base32 b32 = new Base32(8);
        byte[] input = new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x20, 0x57, 0x6F, 0x72, 0x6C, 0x64};
        byte[] result = b32.encode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeHexModulus2() {
        byte[] input = new byte[]{'3', '4'};
        Base32 hex32 = new Base32(true);
        byte[] result = hex32.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeHexModulus3() {
        byte[] input = new byte[]{'3', '4', '5'};
        Base32 hex32 = new Base32(true);
        byte[] result = hex32.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeHexModulus4() {
        byte[] input = new byte[]{'3', '4', '5', '6'};
        Base32 hex32 = new Base32(true);
        byte[] result = hex32.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeHexModulus5() {
        byte[] input = new byte[]{'3', '4', '5', '6', '7'};
        Base32 hex32 = new Base32(true);
        byte[] result = hex32.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeHexModulus6() {
        byte[] input = new byte[]{'3', '4', '5', '6', '7', '8'};
        Base32 hex32 = new Base32(true);
        byte[] result = hex32.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeHexModulus7() {
        byte[] input = new byte[]{'3', '4', '5', '6', '7', '8', '9'};
        Base32 hex32 = new Base32(true);
        byte[] result = hex32.decode(input);
        assertNotNull(result);
    }

    @Test
    public void testIsWhiteSpace() {
        assertTrue(base32.isWhiteSpace((byte) ' '));
        assertTrue(base32.isWhiteSpace((byte) '\t'));
        assertFalse(base32.isWhiteSpace((byte) 'A'));
    }

    @Test
    public void testDecodeWithNegativeByte() {
        byte[] input = new byte[]{(byte) 0x80};
        byte[] result = base32.decode(input);
        assertNotNull(result);
    }
}