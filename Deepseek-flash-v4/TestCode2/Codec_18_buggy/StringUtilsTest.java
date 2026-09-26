package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testEqualsSameReference() {
        String s = "test";
        assertTrue(StringUtils.equals(s, s));
    }

    @Test
    public void testEqualsBothNull() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEqualsFirstNull() {
        assertFalse(StringUtils.equals(null, "test"));
    }

    @Test
    public void testEqualsSecondNull() {
        assertFalse(StringUtils.equals("test", null));
    }

    @Test
    public void testEqualsEqualStrings() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEqualsDifferentCase() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsNonStringCharSequences() {
        CharSequence cs1 = new StringBuilder("hello");
        CharSequence cs2 = new StringBuilder("hello");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEqualsNonStringDifferentLength() {
        CharSequence cs1 = new StringBuilder("short");
        CharSequence cs2 = new StringBuilder("longer");
        assertFalse(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testGetByteBufferUtf8Null() {
        assertNull(StringUtils.getByteBufferUtf8(null));
    }

    @Test
    public void testGetByteBufferUtf8Valid() {
        ByteBuffer buffer = StringUtils.getByteBufferUtf8("test");
        assertNotNull(buffer);
        assertEquals(4, buffer.capacity());
        byte[] expected = "test".getBytes(Charset.forName("UTF-8"));
        byte[] actual = new byte[buffer.remaining()];
        buffer.get(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetBytesIso8859_1Null() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1Valid() {
        byte[] bytes = StringUtils.getBytesIso8859_1("test");
        assertNotNull(bytes);
        assertArrayEquals("test".getBytes(Charset.forName("ISO-8859-1")), bytes);
    }

    @Test
    public void testGetBytesUncheckedNull() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytesUncheckedValid() {
        byte[] bytes = StringUtils.getBytesUnchecked("test", "UTF-8");
        assertNotNull(bytes);
        assertArrayEquals("test".getBytes(Charset.forName("UTF-8")), bytes);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUncheckedUnsupportedEncoding() {
        StringUtils.getBytesUnchecked("test", "unsupported-encoding");
    }

    @Test
    public void testGetBytesUsAsciiNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAsciiValid() {
        byte[] bytes = StringUtils.getBytesUsAscii("test");
        assertNotNull(bytes);
        assertArrayEquals("test".getBytes(Charset.forName("US-ASCII")), bytes);
    }

    @Test
    public void testGetBytesUtf16Null() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16Valid() {
        byte[] bytes = StringUtils.getBytesUtf16("test");
        assertNotNull(bytes);
        assertArrayEquals("test".getBytes(Charset.forName("UTF-16")), bytes);
    }

    @Test
    public void testGetBytesUtf16BeNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16BeValid() {
        byte[] bytes = StringUtils.getBytesUtf16Be("test");
        assertNotNull(bytes);
        assertArrayEquals("test".getBytes(Charset.forName("UTF-16BE")), bytes);
    }

    @Test
    public void testGetBytesUtf16LeNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16LeValid() {
        byte[] bytes = StringUtils.getBytesUtf16Le("test");
        assertNotNull(bytes);
        assertArrayEquals("test".getBytes(Charset.forName("UTF-16LE")), bytes);
    }

    @Test
    public void testGetBytesUtf8Null() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8Valid() {
        byte[] bytes = StringUtils.getBytesUtf8("test");
        assertNotNull(bytes);
        assertArrayEquals("test".getBytes(Charset.forName("UTF-8")), bytes);
    }

    @Test
    public void testNewStringBytesNull() {
        assertNull(StringUtils.newString((byte[]) null, "UTF-8"));
    }

    @Test
    public void testNewStringValid() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-8"));
        assertEquals("test", StringUtils.newString(bytes, "UTF-8"));
    }

    @Test(expected = IllegalStateException.class)
    public void testNewStringUnsupportedEncoding() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-8"));
        StringUtils.newString(bytes, "unsupported-encoding");
    }

    @Test
    public void testNewStringIso8859_1Null() {
        assertNull(StringUtils.newStringIso8859_1(null));
    }

    @Test
    public void testNewStringIso8859_1Valid() {
        byte[] bytes = "test".getBytes(Charset.forName("ISO-8859-1"));
        assertEquals("test", StringUtils.newStringIso8859_1(bytes));
    }

    @Test
    public void testNewStringUsAsciiNull() {
        assertNull(StringUtils.newStringUsAscii(null));
    }

    @Test
    public void testNewStringUsAsciiValid() {
        byte[] bytes = "test".getBytes(Charset.forName("US-ASCII"));
        assertEquals("test", StringUtils.newStringUsAscii(bytes));
    }

    @Test
    public void testNewStringUtf16Null() {
        assertNull(StringUtils.newStringUtf16(null));
    }

    @Test
    public void testNewStringUtf16Valid() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-16"));
        assertEquals("test", StringUtils.newStringUtf16(bytes));
    }

    @Test
    public void testNewStringUtf16BeNull() {
        assertNull(StringUtils.newStringUtf16Be(null));
    }

    @Test
    public void testNewStringUtf16BeValid() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-16BE"));
        assertEquals("test", StringUtils.newStringUtf16Be(bytes));
    }

    @Test
    public void testNewStringUtf16LeNull() {
        assertNull(StringUtils.newStringUtf16Le(null));
    }

    @Test
    public void testNewStringUtf16LeValid() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-16LE"));
        assertEquals("test", StringUtils.newStringUtf16Le(bytes));
    }

    @Test
    public void testNewStringUtf8Null() {
        assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void testNewStringUtf8Valid() {
        byte[] bytes = "test".getBytes(Charset.forName("UTF-8"));
        assertEquals("test", StringUtils.newStringUtf8(bytes));
    }

}