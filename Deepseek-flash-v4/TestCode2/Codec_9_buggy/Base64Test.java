package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class Base64Test {

    private Base64 base64;

    @Before
    public void setUp() {
        base64 = new Base64();
    }

    @Test
    public void testEncodeDecodeNormal() {
        byte[] input = "Hello World".getBytes();
        byte[] encoded = base64.encode(input);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeDecodeEmptyArray() {
        byte[] input = new byte[0];
        byte[] encoded = base64.encode(input);
        assertArrayEquals(input, encoded);
    }

    @Test
    public void testEncodeDecodeNull() {
        assertNull(base64.encode(null));
        assertNull(base64.decode((byte[]) null));
    }

    @Test
    public void testEncodeDecodeSingleByte() {
        byte[] input = new byte[]{0x61}; // 'a'
        byte[] encoded = base64.encode(input);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeDecodeTwoBytes() {
        byte[] input = new byte[]{0x61, 0x62}; // "ab"
        byte[] encoded = base64.encode(input);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testDecodeInvalidInputThrows() {
        try {
            base64.decode("!!!");
            fail("Expected DecoderException");
        } catch (Exception e) {
            // expected
        }
    }

    @Test(expected = org.apache.commons.codec.EncoderException.class)
    public void testEncodeObjectNonByteArray() throws org.apache.commons.codec.EncoderException {
        base64.encode(new Object());
    }

    @Test(expected = org.apache.commons.codec.DecoderException.class)
    public void testDecodeObjectInvalidType() throws org.apache.commons.codec.DecoderException {
        base64.decode(new Integer(1));
    }

    @Test
    public void testDecodeObjectByteArray() throws Exception {
        byte[] input = "test".getBytes();
        byte[] result = (byte[]) base64.decode((Object) input);
        assertArrayEquals(input, result);
    }

    @Test
    public void testDecodeObjectString() throws Exception {
        String input = "dGVzdA==";
        byte[] result = (byte[]) base64.decode((Object) input);
        assertArrayEquals("test".getBytes(), result);
    }

    @Test
    public void testEncodeObjectByteArray() throws Exception {
        byte[] input = "test".getBytes();
        byte[] result = (byte[]) base64.encode((Object) input);
        byte[] decoded = base64.decode(result);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testIsBase64Byte() {
        assertTrue(Base64.isBase64((byte) 'A'));
        assertTrue(Base64.isBase64((byte) 'z'));
        assertTrue(Base64.isBase64((byte) '0'));
        assertTrue(Base64.isBase64((byte) '+'));
        assertTrue(Base64.isBase64((byte) '/'));
        assertTrue(Base64.isBase64((byte) '='));
        assertFalse(Base64.isBase64((byte) '!'));
        assertFalse(Base64.isBase64((byte) ' '));
    }

    @Test
    public void testIsArrayByteBase64() {
        byte[] valid = "ABCD".getBytes();
        assertTrue(Base64.isArrayByteBase64(valid));
        byte[] invalid = "AB!D".getBytes();
        assertFalse(Base64.isArrayByteBase64(invalid));
        byte[] withWhitespace = "AB D".getBytes();
        assertFalse(Base64.isBase64(withWhitespace));
    }

    @Test
    public void testEncodeBase64StaticSimple() {
        byte[] input = "test".getBytes();
        byte[] encoded = Base64.encodeBase64(input);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeBase64StaticNull() {
        assertNull(Base64.encodeBase64(null));
    }

    @Test
    public void testEncodeBase64StaticEmpty() {
        byte[] input = new byte[0];
        assertArrayEquals(input, Base64.encodeBase64(input));
    }

    @Test
    public void testEncodeBase64Chunked() {
        byte[] input = new byte[100];
        for (int i = 0; i < 100; i++) {
            input[i] = (byte) i;
        }
        byte[] encoded = Base64.encodeBase64Chunked(input);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeBase64URLSafe() {
        byte[] input = "test".getBytes();
        byte[] encoded = Base64.encodeBase64URLSafe(input);
        String encodedStr = new String(encoded);
        assertFalse(encodedStr.contains("+"));
        assertFalse(encodedStr.contains("/"));
    }

    @Test
    public void testEncodeBase64String() {
        String input = "test";
        String encoded = Base64.encodeBase64String(input.getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(input.getBytes(), decoded);
    }

    @Test
    public void testEncodeBase64URLSafeString() {
        String input = "test123?";
        String encoded = Base64.encodeBase64URLSafeString(input.getBytes());
        assertFalse(encoded.contains("+"));
        assertFalse(encoded.contains("/"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncodeBase64MaxSizeExceeded() {
        byte[] input = new byte[1000];
        Base64.encodeBase64(input, false, false, 10);
    }

    @Test
    public void testDecodeBase64String() {
        String encoded = Base64.encodeBase64String("test".getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals("test".getBytes(), decoded);
    }

    @Test
    public void testDecodeBase64ByteArray() {
        byte[] encoded = Base64.encodeBase64("test".getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals("test".getBytes(), decoded);
    }

    @Test
    public void testDecodeBase64Empty() {
        assertArrayEquals(new byte[0], Base64.decodeBase64(""));
    }

    @Test
    public void testDiscardWhitespace() {
        byte[] input = " H e l l o ".getBytes();
        byte[] expected = "Hello".getBytes();
        assertArrayEquals(expected, Base64.discardWhitespace(input));
    }

    @Test
    public void testDiscardWhitespaceNoChange() {
        byte[] input = "Hello".getBytes();
        assertArrayEquals(input, Base64.discardWhitespace(input));
    }

    @Test
    public void testIsUrlSafe() {
        assertFalse(base64.isUrlSafe());
        Base64 urlSafe = new Base64(true);
        assertTrue(urlSafe.isUrlSafe());
    }

    @Test
    public void testConstructorWithLineLength() {
        Base64 b64 = new Base64(50);
        assertNotNull(b64);
    }

    @Test
    public void testConstructorUrlSafe() {
        Base64 b64 = new Base64(true);
        assertTrue(b64.isUrlSafe());
    }

    @Test
    public void testConstructorLineSeparatorNull() {
        Base64 b64 = new Base64(76, null);
        assertNotNull(b64);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLineSeparatorContainsBase64() {
        new Base64(76, new byte[]{'A', 'B'});
    }

    @Test
    public void testEncodeToString() {
        String input = "test";
        String encoded = base64.encodeToString(input.getBytes());
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input.getBytes(), decoded);
    }

    @Test
    public void testAvail() {
        assertEquals(0, base64.avail());
        base64.encode("test".getBytes());
        assertTrue(base64.avail() > 0);
    }

    @Test
    public void testHasData() {
        assertFalse(base64.hasData());
        base64.encode("test".getBytes());
        assertTrue(base64.hasData());
    }

    @Test
    public void testEncodeDecodeBinaryDataWithAllValues() {
        byte[] input = new byte[256];
        for (int i = 0; i < 256; i++) {
            input[i] = (byte) i;
        }
        byte[] encoded = base64.encode(input);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testDecodeInteger() {
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        BigInteger bi = Base64.decodeInteger(input);
        assertEquals(new BigInteger("66051"), bi);
    }

    @Test
    public void testEncodeInteger() {
        BigInteger bi = new BigInteger("123456789");
        byte[] encoded = Base64.encodeInteger(bi);
        BigInteger decoded = Base64.decodeInteger(encoded);
        assertEquals(bi, decoded);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }

    @Test
    public void testToIntegerBytes() {
        BigInteger bi = new BigInteger("255");
        byte[] bytes = Base64.toIntegerBytes(bi);
        assertEquals(1, bytes.length);
        assertEquals((byte) 0xFF, bytes[0]);
    }

    @Test
    public void testToIntegerBytesNegativeBitLength() {
        BigInteger bi = new BigInteger("1");
        byte[] bytes = Base64.toIntegerBytes(bi);
        assertEquals(1, bytes.length);
        assertEquals((byte) 0x01, bytes[0]);
    }

    @Test
    public void testEncodeDecodeModulus0() {
        byte[] input = new byte[]{0x01, 0x02, 0x03}; // 3 bytes -> modulus 0 after encoding
        byte[] encoded = base64.encode(input);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncodeWithMultipleResize() {
        byte[] input = new byte[20000];
        for (int i = 0; i < 20000; i++) {
            input[i] = (byte) (i % 256);
        }
        byte[] encoded = base64.encode(input);
        byte[] decoded = base64.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testDecodeWithMultipleResize() {
        byte[] input = new byte[20000];
        for (int i = 0; i < 20000; i++) {
            input[i] = (byte) (i % 256);
        }
        Base64 b64 = new Base64();
        byte[] encoded = b64.encode(input);
        byte[] decoded = b64.decode(encoded);
        assertArrayEquals(input, decoded);
    }
}