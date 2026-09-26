package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testEqualsSameReference() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEqualsBothNull() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEqualsFirstNull() {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEqualsSecondNull() {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEqualsDifferentCase() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsNonStringCharSequence() {
        assertTrue(StringUtils.equals(new StringBuilder("abc"), new StringBuilder("abc")));
    }

    @Test
    public void testGetByteBufferUtf8Null() {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8Normal() {
        ByteBuffer buffer = StringUtils.getByteBufferUtf8("Hello");
        assertNotNull(buffer);
        assertArrayEquals("Hello".getBytes(Charset.forName("UTF-8")), buffer.array());
    }

    @Test
    public void testGetBytesIso8859_1Null() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1Normal() {
        byte[] bytes = StringUtils.getBytesIso8859_1("Hello");
        assertArrayEquals("Hello".getBytes(Charset.forName("ISO-8859-1")), bytes);
    }

    @Test
    public void testGetBytesUncheckedNull() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytesUncheckedNormal() {
        byte[] bytes = StringUtils.getBytesUnchecked("Hello", "UTF-8");
        assertArrayEquals("Hello".getBytes(Charset.forName("UTF-8")), bytes);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUncheckedUnsupportedEncoding() {
        StringUtils.getBytesUnchecked("Hello", "unsupported-charset");
    }

    @Test
    public void testGetBytesUsAsciiNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAsciiNormal() {
        byte[] bytes = StringUtils.getBytesUsAscii("Hello");
        assertArrayEquals("Hello".getBytes(Charset.forName("US-ASCII")), bytes);
    }

    @Test
    public void testGetBytesUtf16Null() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16Normal() {
        byte[] bytes = StringUtils.getBytesUtf16("Hello");
        assertArrayEquals("Hello".getBytes(Charset.forName("UTF-16")), bytes);
    }

    @Test
    public void testGetBytesUtf16BeNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16BeNormal() {
        byte[] bytes = StringUtils.getBytesUtf16Be("Hello");
        assertArrayEquals("Hello".getBytes(Charset.forName("UTF-16BE")), bytes);
    }

    @Test
    public void testGetBytesUtf16LeNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16LeNormal() {
        byte[] bytes = StringUtils.getBytesUtf16Le("Hello");
        assertArrayEquals("Hello".getBytes(Charset.forName("UTF-16LE")), bytes);
    }

    @Test
    public void testGetBytesUtf8Null() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8Normal() {
        byte[] bytes = StringUtils.getBytesUtf8("Hello");
        assertArrayEquals("Hello".getBytes(Charset.forName("UTF-8")), bytes);
    }

    @Test
    public void testNewStringWithByteArrayAndCharsetNameNull() {
        assertNull(StringUtils.newString((byte[]) null, "UTF-8"));
    }

    @Test
    public void testNewStringWithByteArrayAndCharsetNameNormal() {
        byte[] input = "Hello".getBytes(Charset.forName("UTF-8"));
        assertEquals("Hello", StringUtils.newString(input, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewStringWithByteArrayAndCharsetNameUnsupported() {
        byte[] input = "Hello".getBytes(Charset.forName("UTF-8"));
        StringUtils.newString(input, "unsupported-charset");
    }

    @Test
    public void testNewStringIso8859_1() {
        byte[] input = "Hello".getBytes(Charset.forName("ISO-8859-1"));
        assertEquals("Hello", StringUtils.newStringIso8859_1(input));
    }

    @Test
    public void testNewStringUsAscii() {
        byte[] input = "Hello".getBytes(Charset.forName("US-ASCII"));
        assertEquals("Hello", StringUtils.newStringUsAscii(input));
    }

    @Test
    public void testNewStringUtf16() {
        byte[] input = "Hello".getBytes(Charset.forName("UTF-16"));
        assertEquals("Hello", StringUtils.newStringUtf16(input));
    }

    @Test
    public void testNewStringUtf16Be() {
        byte[] input = "Hello".getBytes(Charset.forName("UTF-16BE"));
        assertEquals("Hello", StringUtils.newStringUtf16Be(input));
    }

    @Test
    public void testNewStringUtf16Le() {
        byte[] input = "Hello".getBytes(Charset.forName("UTF-16LE"));
        assertEquals("Hello", StringUtils.newStringUtf16Le(input));
    }

    @Test
    public void testNewStringUtf8() {
        byte[] input = "Hello".getBytes(Charset.forName("UTF-8"));
        assertEquals("Hello", StringUtils.newStringUtf8(input));
    }

    @Test
    public void testNewStringWithNullByteArray() {
        assertNull(StringUtils.newString(null, Charset.forName("UTF-8")));
    }
}