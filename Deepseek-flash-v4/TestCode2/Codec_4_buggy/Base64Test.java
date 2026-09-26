package org.apache.commons.codec.binary;
import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigInteger;
public class Base64Test {
    @Test
    public void testEncodeDecodeRoundTrip() {
        byte[] original = "Hello World".getBytes();
        byte[] encoded = Base64.encodeBase64(original);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(original, decoded);
    }
    @Test
    public void testEncodeEmptyArray() {
        byte[] empty = new byte[0];
        assertNull(Base64.encodeBase64(null));
        assertArrayEquals(empty, Base64.encodeBase64(empty));
    }
    @Test
    public void testDecodeEmptyArray() {
        byte[] empty = new byte[0];
        assertNull(new Base64().decode((byte[])null));
        assertArrayEquals(empty, new Base64().decode(empty));
    }
    @Test
    public void testEncodeUrlSafe() {
        byte[] data = { (byte)0xff, (byte)0xfe, 0x00 };
        byte[] encoded = Base64.encodeBase64URLSafe(data);
        String encodedStr = new String(encoded);
        assertFalse(encodedStr.contains("+"));
        assertFalse(encodedStr.contains("/"));
        assertFalse(encodedStr.contains("="));
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
    }
    @Test
    public void testDecodeWithPadding() {
        byte[] decoded = Base64.decodeBase64("SGVsbG8=");
        assertArrayEquals("Hello".getBytes(), decoded);
    }
    @Test
    public void testDecodeInvalidInput() {
        try {
            Base64.decodeBase64("!!!");
            fail("Should throw exception for invalid base64");
        } catch (Exception e) {
        }
    }
    @Test
    public void testEncodeChunked() {
        byte[] data = new byte[100];
        for (int i = 0; i < 100; i++) data[i] = (byte)i;
        byte[] encoded = Base64.encodeBase64Chunked(data);
        String encodedStr = new String(encoded);
        assertTrue(encodedStr.contains("\r\n"));
    }
    @Test
    public void testDecodeString() {
        byte[] decoded = Base64.decodeBase64("VGhpcyBpcyBhIHRlc3Q=");
        assertArrayEquals("This is a test".getBytes(), decoded);
    }
    @Test
    public void testIsBase64() {
        assertTrue(Base64.isBase64((byte)'A'));
        assertTrue(Base64.isBase64((byte)'='));
        assertFalse(Base64.isBase64((byte)'!'));
        assertFalse(Base64.isBase64((byte)' '));
    }
    @Test
    public void testIsArrayByteBase64() {
        assertTrue(Base64.isArrayByteBase64("QUJD".getBytes()));
        assertFalse(Base64.isArrayByteBase64("AB!C".getBytes()));
        assertTrue(Base64.isArrayByteBase64("AB C".getBytes()));
    }
    @Test
    public void testDecodeInteger() {
        byte[] data = { 0x01, 0x02, 0x03 };
        String encoded = Base64.encodeBase64URLSafeString(data);
        byte[] decoded = Base64.decodeBase64(encoded);
        assertArrayEquals(data, decoded);
        BigInteger bi = Base64.decodeInteger(encoded.getBytes());
        assertEquals(new BigInteger(1, data), bi);
    }
    @Test
    public void testEncodeInteger() {
        BigInteger bi = new BigInteger("12345678901234567890");
        byte[] encoded = Base64.encodeInteger(bi);
        byte[] decoded = Base64.decodeBase64(encoded);
        BigInteger result = new BigInteger(1, decoded);
        assertEquals(bi, result);
    }
    @Test(expected = NullPointerException.class)
    public void testEncodeIntegerNull() {
        Base64.encodeInteger(null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalLineSeparator() {
        byte[] sep = "A".getBytes();
        new Base64(76, sep);
    }
    @Test
    public void testDiscardWhitespace() {
        byte[] data = "A B C".getBytes();
        byte[] result = Base64.discardWhitespace(data);
        assertArrayEquals("ABC".getBytes(), result);
    }
    @Test
    public void testDecodeObject() throws Exception {
        Base64 codec = new Base64();
        byte[] data = "Test".getBytes();
        byte[] decoded = (byte[]) codec.decode((Object)data);
        assertArrayEquals(data, decoded);
        byte[] fromString = (byte[]) codec.decode((Object)"VGVzdA==");
        assertArrayEquals(data, fromString);
    }
    @Test(expected = org.apache.commons.codec.DecoderException.class)
    public void testDecodeObjectInvalid() throws Exception {
        new Base64().decode((Object)123);
    }
    @Test
    public void testEncodeObject() throws Exception {
        Base64 codec = new Base64();
        byte[] data = "Test".getBytes();
        byte[] encoded = (byte[]) codec.encode((Object)data);
        assertArrayEquals(Base64.encodeBase64(data), encoded);
    }
    @Test(expected = org.apache.commons.codec.EncoderException.class)
    public void testEncodeObjectInvalid() throws Exception {
        new Base64().encode((Object)"not bytes");
    }
    @Test
    public void testIsUrlSafe() {
        assertFalse(new Base64().isUrlSafe());
        assertTrue(new Base64(true).isUrlSafe());
    }
    @Test
    public void testEncodeToString() {
        Base64 codec = new Base64();
        String result = codec.encodeToString("Hello".getBytes());
        assertEquals("SGVsbG8=", result);
    }
    @Test
    public void testConstructorLineLength() {
        Base64 b64 = new Base64(20);
        assertFalse(b64.isUrlSafe());
    }
    @Test
    public void testConstructorLineSeparator() {
        byte[] sep = {'\n'};
        Base64 b64 = new Base64(10, sep);
        assertNotNull(b64);
    }
    @Test
    public void testConstructorNullSeparator() {
        Base64 b64 = new Base64(10, null);
        assertNotNull(b64);
    }
    @Test
    public void testMaxResultSizeExceeded() {
        try {
            byte[] data = new byte[1000000];
            Base64.encodeBase64(data, true, false, 100);
            fail("Should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    public void testDecodeWithWhitespace() {
        byte[] data = "SGVs bG8=".getBytes();
        byte[] decoded = Base64.decodeBase64(data);
        assertArrayEquals("Hello".getBytes(), decoded);
    }
    @Test
    public void testEncodeEmptyWithUrlSafe() {
        Base64 b64 = new Base64(true);
        byte[] data = new byte[0];
        byte[] result = b64.encode(data);
        assertArrayEquals(data, result);
        assertNull(b64.encode(null));
    }
}