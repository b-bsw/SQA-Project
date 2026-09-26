package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testGetBytesIso8859_1Null() {
        assertNull(StringUtils.getBytesIso8859_1(null));
    }

    @Test
    public void testGetBytesIso8859_1Normal() {
        byte[] result = StringUtils.getBytesIso8859_1("abc");
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals('a', result[0]);
        assertEquals('b', result[1]);
        assertEquals('c', result[2]);
    }

    @Test
    public void testGetBytesUncheckedNullString() {
        assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }

    @Test
    public void testGetBytesUncheckedNormal() {
        byte[] result = StringUtils.getBytesUnchecked("abc", "UTF-8");
        assertArrayEquals(new byte[] {'a', 'b', 'c'}, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetBytesUncheckedUnsupportedEncoding() {
        StringUtils.getBytesUnchecked("abc", "unsupported-encoding");
    }

    @Test
    public void testGetBytesUsAsciiNull() {
        assertNull(StringUtils.getBytesUsAscii(null));
    }

    @Test
    public void testGetBytesUsAsciiNormal() {
        byte[] result = StringUtils.getBytesUsAscii("abc");
        assertArrayEquals(new byte[] {'a', 'b', 'c'}, result);
    }

    @Test
    public void testGetBytesUtf16Null() {
        assertNull(StringUtils.getBytesUtf16(null));
    }

    @Test
    public void testGetBytesUtf16Normal() {
        byte[] result = StringUtils.getBytesUtf16("a");
        assertNotNull(result);
        assertEquals(4, result.length);
    }

    @Test
    public void testGetBytesUtf16BeNull() {
        assertNull(StringUtils.getBytesUtf16Be(null));
    }

    @Test
    public void testGetBytesUtf16BeNormal() {
        byte[] result = StringUtils.getBytesUtf16Be("a");
        assertNotNull(result);
        assertEquals(2, result.length);
    }

    @Test
    public void testGetBytesUtf16LeNull() {
        assertNull(StringUtils.getBytesUtf16Le(null));
    }

    @Test
    public void testGetBytesUtf16LeNormal() {
        byte[] result = StringUtils.getBytesUtf16Le("a");
        assertNotNull(result);
        assertEquals(2, result.length);
    }

    @Test
    public void testGetBytesUtf8Null() {
        assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void testGetBytesUtf8Normal() {
        byte[] result = StringUtils.getBytesUtf8("abc");
        assertArrayEquals(new byte[] {'a', 'b', 'c'}, result);
    }

    @Test
    public void testNewStringFromBytesNull() {
        assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test
    public void testNewStringFromBytesNormal() {
        String result = StringUtils.newString(new byte[] {'a', 'b', 'c'}, "UTF-8");
        assertEquals("abc", result);
    }

    @Test(expected = IllegalStateException.class)
    public void testNewStringFromBytesUnsupportedEncoding() {
        StringUtils.newString(new byte[] {'a'}, "unsupported-encoding");
    }

    @Test
    public void testNewStringIso8859_1() {
        String result = StringUtils.newStringIso8859_1(new byte[] {65, 66, 67});
        assertEquals("ABC", result);
    }

    @Test
    public void testNewStringUsAscii() {
        String result = StringUtils.newStringUsAscii(new byte[] {65, 66, 67});
        assertEquals("ABC", result);
    }

    @Test
    public void testNewStringUtf16() {
        String result = StringUtils.newStringUtf16(new byte[] {(byte)0xFE, (byte)0xFF, 0, 65});
        assertEquals("A", result);
    }

    @Test
    public void testNewStringUtf16Be() {
        String result = StringUtils.newStringUtf16Be(new byte[] {0, 65});
        assertEquals("A", result);
    }

    @Test
    public void testNewStringUtf16Le() {
        String result = StringUtils.newStringUtf16Le(new byte[] {65, 0});
        assertEquals("A", result);
    }

    @Test
    public void testNewStringUtf8() {
        String result = StringUtils.newStringUtf8(new byte[] {97, 98, 99});
        assertEquals("abc", result);
    }

    @Test
    public void testNewStringUtf8NullBytes() {
        String result = StringUtils.newStringUtf8(null);
        assertNull(result);
    }
}