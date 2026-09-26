package com.fasterxml.jackson.core.util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TextBufferTest {
    
    private TextBuffer buffer;
    
    @Before
    public void setUp() {
        buffer = new TextBuffer(null);
    }
    
    @Test
    public void testResetWithEmpty() {
        buffer.resetWithEmpty();
        assertEquals(0, buffer.size());
        assertEquals(0, buffer.getTextOffset());
        assertTrue(buffer.hasTextAsCharacters());
        assertEquals("", buffer.contentsAsString());
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testResetWithShared() {
        char[] shared = "hello".toCharArray();
        buffer.resetWithShared(shared, 0, 5);
        assertEquals(5, buffer.size());
        assertEquals(0, buffer.getTextOffset());
        assertEquals(shared, buffer.getTextBuffer());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testResetWithSharedEmpty() {
        char[] shared = "".toCharArray();
        buffer.resetWithShared(shared, 0, 0);
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testResetWithCopy() {
        char[] data = "world".toCharArray();
        buffer.resetWithCopy(data, 0, 5);
        assertEquals(5, buffer.size());
        assertEquals("world", buffer.contentsAsString());
        assertNull(buffer.getTextBuffer());
    }

    @Test
    public void testResetWithCopyPartial() {
        char[] data = "hello world".toCharArray();
        buffer.resetWithCopy(data, 6, 5);
        assertEquals(5, buffer.size());
        assertEquals("world", buffer.contentsAsString());
    }

    @Test
    public void testResetWithString() {
        buffer.resetWithString("test");
        assertEquals(4, buffer.size());
        assertEquals("test", buffer.contentsAsString());
        assertFalse(buffer.hasTextAsCharacters());
    }

    @Test
    public void testResetWithStringEmpty() {
        buffer.resetWithString("");
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testAppendChar() {
        buffer.append('a');
        assertEquals(1, buffer.size());
        assertEquals("a", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharMultiple() {
        buffer.append('h');
        buffer.append('e');
        buffer.append('l');
        buffer.append('l');
        buffer.append('o');
        assertEquals(5, buffer.size());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharArray() {
        buffer.append("hello".toCharArray(), 0, 5);
        assertEquals(5, buffer.size());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayLarge() {
        char[] large = new char[2000];
        for (int i = 0; i < 2000; i++) large[i] = 'x';
        buffer.append(large, 0, 2000);
        assertEquals(2000, buffer.size());
        assertEquals(new String(large), buffer.contentsAsString());
    }

    @Test
    public void testAppendString() {
        buffer.append("hello", 0, 5);
        assertEquals(5, buffer.size());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testAppendStringLarge() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2000; i++) sb.append("x");
        String large = sb.toString();
        buffer.append(large, 0, 2000);
        assertEquals(2000, buffer.size());
        assertEquals(large, buffer.contentsAsString());
    }

    @Test
    public void testAppendMixed() {
        buffer.append('h');
        buffer.append("ell".toCharArray(), 0, 3);
        buffer.append("o", 0, 1);
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testEnsureNotShared() {
        char[] shared = "test".toCharArray();
        buffer.resetWithShared(shared, 0, 4);
        buffer.ensureNotShared();
        assertTrue(buffer.getTextOffset() == 0);
        assertEquals("test", buffer.contentsAsString());
    }

    @Test
    public void testGetCurrentSegment() {
        char[] seg = buffer.getCurrentSegment();
        assertNotNull(seg);
        assertTrue(seg.length >= 1000);
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        buffer.append("test");
        char[] seg = buffer.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, buffer.size());
        assertEquals(0, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testFinishCurrentSegment() {
        buffer.append("hello");
        char[] newSeg = buffer.finishCurrentSegment();
        assertNotNull(newSeg);
        assertTrue(newSeg.length > 0);
    }

    @Test
    public void testExpandCurrentSegment() {
        char[] seg = buffer.getCurrentSegment();
        int oldLen = seg.length;
        char[] expanded = buffer.expandCurrentSegment();
        assertTrue(expanded.length > oldLen);
    }

    @Test
    public void testExpandCurrentSegmentWithMinSize() {
        char[] seg = buffer.getCurrentSegment();
        int minSize = seg.length + 100;
        char[] expanded = buffer.expandCurrentSegment(minSize);
        assertTrue(expanded.length >= minSize);
    }

    @Test
    public void testContentsAsArray() {
        buffer.append("array");
        char[] arr = buffer.contentsAsArray();
        assertNotNull(arr);
        assertEquals("array", new String(arr));
    }

    @Test
    public void testContentsAsDecimal() {
        buffer.resetWithString("123.45");
        assertEquals(0, new BigDecimal("123.45").compareTo(buffer.contentsAsDecimal()));
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimalInvalid() {
        buffer.resetWithString("notanumber");
        buffer.contentsAsDecimal();
    }

    @Test
    public void testContentsAsDouble() {
        buffer.resetWithString("3.14");
        assertEquals(3.14, buffer.contentsAsDouble(), 1e-9);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDoubleInvalid() {
        buffer.resetWithString("notadouble");
        buffer.contentsAsDouble();
    }

    @Test
    public void testSizeAfterResetWithEmpty() {
        buffer.resetWithEmpty();
        assertEquals(0, buffer.size());
    }

    @Test
    public void testSizeAfterResetWithShared() {
        buffer.resetWithShared("test".toCharArray(), 0, 4);
        assertEquals(4, buffer.size());
    }

    @Test
    public void testSizeAfterResetWithCopy() {
        buffer.resetWithCopy("hello".toCharArray(), 0, 5);
        assertEquals(5, buffer.size());
    }

    @Test
    public void testSizeAfterResetWithString() {
        buffer.resetWithString("example");
        assertEquals(7, buffer.size());
    }

    @Test
    public void testReleaseBuffers() {
        buffer.append("data");
        buffer.releaseBuffers();
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testGetTextBufferWithShared() {
        char[] shared = "test".toCharArray();
        buffer.resetWithShared(shared, 0, 4);
        assertEquals(shared, buffer.getTextBuffer());
    }

    @Test
    public void testGetTextBufferWithString() {
        buffer.resetWithString("test");
        char[] buf = buffer.getTextBuffer();
        assertNotNull(buf);
        assertEquals("test", new String(buf));
    }

    @Test
    public void testContentsAsStringFromResultArray() {
        buffer.resetWithString("cached");
        buffer.contentsAsArray();
        String s = buffer.contentsAsString();
        assertEquals("cached", s);
    }

    @Test
    public void testTextOffsetWithShared() {
        char[] shared = "hello".toCharArray();
        buffer.resetWithShared(shared, 1, 4);
        assertEquals(1, buffer.getTextOffset());
    }

    @Test
    public void testTextOffsetWithoutShared() {
        buffer.append("test");
        assertEquals(0, buffer.getTextOffset());
    }

    @Test
    public void testHasTextAsCharactersWithShared() {
        buffer.resetWithShared("test".toCharArray(), 0, 4);
        assertTrue(buffer.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWithString() {
        buffer.resetWithString("test");
        assertFalse(buffer.hasTextAsCharacters());
    }

    @Test
    public void testSetCurrentLength() {
        buffer.getCurrentSegment();
        buffer.setCurrentLength(5);
        assertEquals(5, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testToString() {
        buffer.append("text");
        assertEquals("text", buffer.toString());
    }

    @Test
    public void testAppendCharEnsureSharedUnshared() {
        char[] shared = "test".toCharArray();
        buffer.resetWithShared(shared, 0, 4);
        buffer.append('x');
        assertEquals(5, buffer.size());
        assertEquals("testx", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayEnsureSharedUnshared() {
        char[] shared = "test".toCharArray();
        buffer.resetWithShared(shared, 0, 4);
        buffer.append("xxx".toCharArray(), 0, 3);
        assertEquals(7, buffer.size());
        assertEquals("testxxx", buffer.contentsAsString());
    }

    @Test
    public void testAppendStringEnsureSharedUnshared() {
        char[] shared = "test".toCharArray();
        buffer.resetWithShared(shared, 0, 4);
        buffer.append("xxx", 0, 3);
        assertEquals(7, buffer.size());
        assertEquals("testxxx", buffer.contentsAsString());
    }

    @Test
    public void testMultipleSegments() {
        for (int i = 0; i < 1500; i++) {
            buffer.append('a');
        }
        assertEquals(1500, buffer.size());
        assertEquals(1500, buffer.contentsAsString().length());
        for (int i = 0; i < 1500; i++) {
            assertEquals('a', buffer.contentsAsString().charAt(i));
        }
    }

    @Test
    public void testGetTextBufferWithMultipleSegments() {
        for (int i = 0; i < 3000; i++) {
            buffer.append('b');
        }
        char[] buf = buffer.getTextBuffer();
        assertNotNull(buf);
        assertEquals(3000, buf.length);
        for (int i = 0; i < 3000; i++) {
            assertEquals('b', buf[i]);
        }
    }
}