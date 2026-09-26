package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.compress.archivers.ArchiveEntry;

public class ArchiveUtilsTest {

    @Test
    public void testToStringDirectoryEntry() {
        ArchiveEntry entry = new ArchiveEntry() {
            public String getName() { return "testfiles"; }
            public long getSize() { return 100L; }
            public boolean isDirectory() { return true; }
        };
        String result = ArchiveUtils.toString(entry);
        assertEquals("d     100 testfiles", result);
    }

    @Test
    public void testToStringFileEntry() {
        ArchiveEntry entry = new ArchiveEntry() {
            public String getName() { return "main.c"; }
            public long getSize() { return 2000L; }
            public boolean isDirectory() { return false; }
        };
        String result = ArchiveUtils.toString(entry);
        assertEquals("-    2000 main.c", result);
    }

    @Test
    public void testToStringLargeSize() {
        ArchiveEntry entry = new ArchiveEntry() {
            public String getName() { return "bigfile.dat"; }
            public long getSize() { return 12345678L; }
            public boolean isDirectory() { return false; }
        };
        String result = ArchiveUtils.toString(entry);
        assertTrue(result.startsWith("-"));
        assertTrue(result.contains("12345678"));
        assertTrue(result.endsWith("bigfile.dat"));
    }

    @Test
    public void testMatchAsciiBufferExact() {
        byte[] buffer = "hello".getBytes();
        assertTrue(ArchiveUtils.matchAsciiBuffer("hello", buffer));
    }

    @Test
    public void testMatchAsciiBufferMismatch() {
        byte[] buffer = "hello".getBytes();
        assertFalse(ArchiveUtils.matchAsciiBuffer("world", buffer));
    }

    @Test
    public void testMatchAsciiBufferWithOffset() {
        byte[] buffer = "xxabcxx".getBytes();
        assertTrue(ArchiveUtils.matchAsciiBuffer("abc", buffer, 2, 3));
    }

    @Test
    public void testToAsciiBytes() {
        byte[] expected = {0x48, 0x65, 0x6c, 0x6c, 0x6f};
        assertArrayEquals(expected, ArchiveUtils.toAsciiBytes("Hello"));
    }

    @Test
    public void testToAsciiBytesEmpty() {
        assertArrayEquals(new byte[0], ArchiveUtils.toAsciiBytes(""));
    }

    @Test
    public void testToAsciiString() {
        byte[] input = {0x48, 0x65, 0x6c, 0x6c, 0x6f};
        assertEquals("Hello", ArchiveUtils.toAsciiString(input));
    }

    @Test
    public void testToAsciiStringWithOffset() {
        byte[] input = {0x00, 0x48, 0x65, 0x6c, 0x00};
        assertEquals("Hel", ArchiveUtils.toAsciiString(input, 1, 3));
    }

    @Test
    public void testIsEqualExactSame() {
        byte[] a = {1, 2, 3};
        byte[] b = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(a, b));
    }

    @Test
    public void testIsEqualDifferent() {
        byte[] a = {1, 2, 3};
        byte[] b = {1, 2, 4};
        assertFalse(ArchiveUtils.isEqual(a, b));
    }

    @Test
    public void testIsEqualDifferentLengthNoIgnore() {
        byte[] a = {1, 2, 3};
        byte[] b = {1, 2};
        assertFalse(ArchiveUtils.isEqual(a, b));
    }

    @Test
    public void testIsEqualWithIgnoreTrailingNullsFirstLonger() {
        byte[] a = {1, 2, 3, 0};
        byte[] b = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(a, b, true));
    }

    @Test
    public void testIsEqualWithIgnoreTrailingNullsSecondLonger() {
        byte[] a = {1, 2, 3};
        byte[] b = {1, 2, 3, 0, 0};
        assertTrue(ArchiveUtils.isEqual(a, b, true));
    }

    @Test
    public void testIsEqualWithIgnoreTrailingNullsNonZeroTrailing() {
        byte[] a = {1, 2, 3, 5};
        byte[] b = {1, 2, 3};
        assertFalse(ArchiveUtils.isEqual(a, b, true));
    }

    @Test
    public void testIsEqualWithNull() {
        byte[] a = {1, 2, 3, 0, 0};
        byte[] b = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqualWithNull(a, 0, 5, b, 0, 3));
    }

    @Test
    public void testIsEqualWithNullNonZeroTrailing() {
        byte[] a = {1, 2, 3, 4, 0};
        byte[] b = {1, 2, 3};
        assertFalse(ArchiveUtils.isEqualWithNull(a, 0, 5, b, 0, 3));
    }

    @Test
    public void testIsEqualWithOffset() {
        byte[] a = {0, 1, 2, 3};
        byte[] b = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(a, 1, 3, b, 0, 3));
    }

    @Test
    public void testIsArrayZeroAllZero() {
        byte[] a = {0, 0, 0};
        assertTrue(ArchiveUtils.isArrayZero(a, 3));
    }

    @Test
    public void testIsArrayZeroFirstNonZero() {
        byte[] a = {1, 0, 0};
        assertFalse(ArchiveUtils.isArrayZero(a, 3));
    }

    @Test
    public void testIsArrayZeroPartialCheck() {
        byte[] a = {0, 0, 1};
        assertTrue(ArchiveUtils.isArrayZero(a, 2));
    }

    @Test
    public void testSanitizeNormalString() {
        assertEquals("hello", ArchiveUtils.sanitize("hello"));
    }

    @Test
    public void testSanitizeWithControlChar() {
        assertEquals("?ello", ArchiveUtils.sanitize("\u0001ello"));
    }

    @Test
    public void testSanitizeWithSpecialUnicode() {
        // Unicode specials block character replaced with '?'
        assertEquals("abc?", ArchiveUtils.sanitize("abc\uFFFE"));
    }

    @Test
    public void testSanitizeEmptyString() {
        assertEquals("", ArchiveUtils.sanitize(""));
    }

    @Test(expected = NullPointerException.class)
    public void testSanitizeNullInput() {
        ArchiveUtils.sanitize(null);
    }

    @Test(expected = NullPointerException.class)
    public void testMatchAsciiBufferNullExpected() {
        ArchiveUtils.matchAsciiBuffer(null, new byte[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testToAsciiBytesNull() {
        ArchiveUtils.toAsciiBytes(null);
    }

    @Test(expected = NullPointerException.class)
    public void testToAsciiStringNull() {
        ArchiveUtils.toAsciiString((byte[]) null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIsEqualOutOfBounds() {
        byte[] a = {1, 2, 3};
        byte[] b = {1, 2, 3};
        ArchiveUtils.isEqual(a, 0, 5, b, 0, 3);
    }

    @Test
    public void testMatchAsciiBufferEmptyBuffer() {
        assertTrue(ArchiveUtils.matchAsciiBuffer("", new byte[0]));
    }

    @Test
    public void testIsEqualBothEmpty() {
        byte[] a = {};
        byte[] b = {};
        assertTrue(ArchiveUtils.isEqual(a, b));
    }

    @Test
    public void testIsEqualIgnoreTrailingBothSameLength() {
        byte[] a = {1, 2, 3};
        byte[] b = {1, 2, 3};
        assertTrue(ArchiveUtils.isEqual(a, b, true));
    }

    @Test
    public void testIsEqualIgnoreTrailingFirstLongerSkipNull() {
        byte[] a = {1, 2, 3, 0, 0};
        byte[] b = {1, 2, 3, 0};
        assertTrue(ArchiveUtils.isEqual(a, b, true));
    }
}