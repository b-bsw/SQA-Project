package com.fasterxml.jackson.core.util;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class TextBufferTest {

    private TextBuffer buffer;
    private BufferRecycler recycler;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        buffer = new TextBuffer(recycler);
    }

    @Test
    public void testInitialState() {
        assertEquals(0, buffer.size());
        assertEquals(0, buffer.getTextOffset());
        assertTrue(buffer.hasTextAsCharacters());
        assertNotNull(buffer.getTextBuffer());
        assertEquals("", buffer.contentsAsString());
        assertEquals(0, buffer.contentsAsArray().length);
    }

    @Test
    public void testResetWithEmpty() {
        buffer.append('a');
        buffer.resetWithEmpty();
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testResetWithShared() {
        char[] chars = "hello".toCharArray();
        buffer.resetWithShared(chars, 0, chars.length);
        assertEquals(5, buffer.size());
        assertEquals(0, buffer.getTextOffset());
        assertTrue(buffer.hasTextAsCharacters());
        assertSame(chars, buffer.getTextBuffer());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testResetWithSharedEmpty() {
        buffer.resetWithShared(new char[0], 0, 0);
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testResetWithCopy() {
        char[] chars = "world".toCharArray();
        buffer.resetWithCopy(chars, 0, chars.length);
        assertEquals(5, buffer.size());
        assertNotSame(chars, buffer.getTextBuffer());
        assertEquals("world", buffer.contentsAsString());
    }

    @Test
    public void testResetWithCopyEmpty() {
        buffer.resetWithCopy(new char[0], 0, 0);
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testResetWithString() {
        buffer.resetWithString("test");
        assertEquals(4, buffer.size());
        assertFalse(buffer.hasTextAsCharacters());
        assertEquals("test", buffer.contentsAsString());
    }

    @Test
    public void testResetWithStringEmpty() {
        buffer.resetWithString("");
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testAppendChar() {
        buffer.append('x');
        assertEquals(1, buffer.size());
        assertEquals("x", buffer.contentsAsString());
        buffer.append('y');
        assertEquals(2, buffer.size());
        assertEquals("xy", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharArray() {
        char[] chars = "abc".toCharArray();
        buffer.append(chars, 0, chars.length);
        assertEquals(3, buffer.size());
        assertEquals("abc", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayPartial() {
        char[] chars = "abcdef".toCharArray();
        buffer.append(chars, 1, 3);
        assertEquals(3, buffer.size());
        assertEquals("bcd", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayEmpty() {
        buffer.append(new char[0], 0, 0);
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testAppendString() {
        buffer.append("hello", 0, 5);
        assertEquals(5, buffer.size());
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testAppendStringPartial() {
        buffer.append("hello", 1, 3);
        assertEquals(3, buffer.size());
        assertEquals("ell", buffer.contentsAsString());
    }

    @Test
    public void testAppendStringEmpty() {
        buffer.append("", 0, 0);
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testAppendMultipleTimes() {
        buffer.append('a');
        buffer.append("bc", 0, 2);
        char[] chars = "def".toCharArray();
        buffer.append(chars, 0, 3);
        assertEquals("abcdef", buffer.contentsAsString());
        assertEquals(6, buffer.size());
    }

    @Test
    public void testAppendLargeData() {
        int size = 5000;
        char[] large = new char[size];
        Arrays.fill(large, 'x');
        buffer.append(large, 0, size);
        assertEquals(size, buffer.size());
        String result = buffer.contentsAsString();
        assertEquals(size, result.length());
        for (int i = 0; i < size; i++) {
            assertEquals('x', result.charAt(i));
        }
    }

    @Test
    public void testAppendExceedingMaxSegmentLength() {
        int largeSize = 1000000;
        char[] large = new char[largeSize];
        Arrays.fill(large, 'y');
        buffer.append(large, 0, largeSize);
        assertEquals(largeSize, buffer.size());
        String result = buffer.contentsAsString();
        assertEquals(largeSize, result.length());
    }

    @Test
    public void testEnsureNotShared() {
        char[] shared = "shared".toCharArray();
        buffer.resetWithShared(shared, 0, shared.length);
        buffer.ensureNotShared();
        assertNotSame(shared, buffer.getTextBuffer());
        assertEquals("shared", buffer.contentsAsString());
    }

    @Test
    public void testGetCurrentSegment() {
        char[] seg = buffer.getCurrentSegment();
        assertNotNull(seg);
        assertTrue(seg.length > 0);
    }

    @Test
    public void testGetCurrentSegmentAfterAppend() {
        buffer.append('a');
        char[] seg = buffer.getCurrentSegment();
        assertNotNull(seg);
        assertEquals(1, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testEmptyAndGetCurrentSegment() {
        buffer.append('a');
        char[] seg = buffer.emptyAndGetCurrentSegment();
        assertNotNull(seg);
        assertEquals(0, buffer.size());
    }

    @Test
    public void testSetCurrentLength() {
        buffer.setCurrentLength(5);
        assertEquals(5, buffer.getCurrentSegmentSize());
    }

    @Test
    public void testFinishCurrentSegment() {
        buffer.append("hello", 0, 5);
        char[] newSeg = buffer.finishCurrentSegment();
        assertNotNull(newSeg);
        assertEquals("hello", buffer.contentsAsString());
    }

    @Test
    public void testExpandCurrentSegment() {
        buffer.append("test", 0, 4);
        char[] expanded = buffer.expandCurrentSegment();
        assertTrue(expanded.length >= 4);
    }

    @Test
    public void testContentsAsArray() {
        buffer.append("array", 0, 5);
        char[] arr = buffer.contentsAsArray();
        assertEquals(5, arr.length);
        assertEquals("array", new String(arr));
    }

    @Test
    public void testContentsAsArrayEmpty() {
        char[] arr = buffer.contentsAsArray();
        assertEquals(0, arr.length);
    }

    @Test
    public void testContentsAsDecimal() {
        buffer.resetWithString("123.45");
        BigDecimal decimal = buffer.contentsAsDecimal();
        assertEquals(new BigDecimal("123.45"), decimal);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDecimalInvalid() {
        buffer.resetWithString("notanumber");
        buffer.contentsAsDecimal();
    }

    @Test
    public void testContentsAsDouble() {
        buffer.resetWithString("3.14");
        double d = buffer.contentsAsDouble();
        assertEquals(3.14, d, 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testContentsAsDoubleInvalid() {
        buffer.resetWithString("NaN");
        buffer.contentsAsDouble();
    }

    @Test
    public void testReleaseBuffers() {
        buffer.append("data", 0, 4);
        buffer.releaseBuffers();
        assertEquals(0, buffer.size());
        assertEquals("", buffer.contentsAsString());
    }

    @Test
    public void testReleaseBuffersWithNullAllocator() {
        TextBuffer noAlloc = new TextBuffer(null);
        noAlloc.append('a');
        noAlloc.releaseBuffers();
        assertEquals(0, noAlloc.size());
    }

    @Test
    public void testHasTextAsCharactersWithInputBuffer() {
        char[] chars = "test".toCharArray();
        buffer.resetWithShared(chars, 0, chars.length);
        assertTrue(buffer.hasTextAsCharacters());
    }

    @Test
    public void testHasTextAsCharactersWithResultString() {
        buffer.resetWithString("string");
        assertFalse(buffer.hasTextAsCharacters());
    }

    @Test
    public void testGetTextBufferWithInputBuffer() {
        char[] chars = "input".toCharArray();
        buffer.resetWithShared(chars, 0, chars.length);
        assertSame(chars, buffer.getTextBuffer());
    }

    @Test
    public void testGetTextBufferWithResultString() {
        buffer.resetWithString("result");
        char[] buf = buffer.getTextBuffer();
        assertEquals("result", new String(buf));
    }

    @Test
    public void testGetTextBufferWithSingleSegment() {
        buffer.append('a');
        char[] buf = buffer.getTextBuffer();
        assertNotNull(buf);
    }

    @Test
    public void testGetTextOffsetWithSharedBuffer() {
        char[] chars = "offset".toCharArray();
        buffer.resetWithShared(chars, 2, 3);
        assertEquals(2, buffer.getTextOffset());
    }

    @Test
    public void testGetTextOffsetWithoutShared() {
        buffer.append('x');
        assertEquals(0, buffer.getTextOffset());
    }

    @Test
    public void testSizeWithResultArray() {
        buffer.resetWithString("cached");
        buffer.contentsAsArray();
        assertEquals(6, buffer.size());
    }

    @Test
    public void testSizeWithResultString() {
        buffer.resetWithString("str");
        assertEquals(3, buffer.size());
    }

    @Test
    public void testSizeWithSegments() {
        buffer.append("large", 0, 5);
        buffer.finishCurrentSegment();
        buffer.append("data", 0, 4);
        assertEquals(9, buffer.size());
    }

    @Test
    public void testMultipleFinishCurrentSegment() {
        for (int i = 0; i < 5; i++) {
            buffer.append("seg", 0, 3);
            buffer.finishCurrentSegment();
        }
        assertEquals(15, buffer.size());
        assertEquals("segsegsegsegseg", buffer.contentsAsString());
    }

    @Test
    public void testBuildResultArrayWithSegments() {
        buffer.append("part1", 0, 5);
        buffer.finishCurrentSegment();
        buffer.append("part2", 0, 5);
        char[] arr = buffer.contentsAsArray();
        assertEquals(10, arr.length);
        assertEquals("part1part2", new String(arr));
    }

    @Test
    public void testBuildResultArrayWithInputBuffer() {
        char[] chars = "shared".toCharArray();
        buffer.resetWithShared(chars, 0, chars.length);
        char[] arr = buffer.contentsAsArray();
        assertArrayEquals(chars, arr);
    }

    @Test
    public void testBuildResultArrayEmpty() {
        char[] arr = buffer.contentsAsArray();
        assertEquals(0, arr.length);
    }

    @Test
    public void testToString() {
        buffer.resetWithString("tostring");
        assertEquals("tostring", buffer.toString());
    }

    @Test
    public void testToStringEmpty() {
        assertEquals("", buffer.toString());
    }

    @Test
    public void testAppendAfterSharedBuffer() {
        char[] shared = "shared".toCharArray();
        buffer.resetWithShared(shared, 0, shared.length);
        buffer.append('!');
        assertEquals(7, buffer.size());
        assertEquals("shared!", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharAfterEnsureNotShared() {
        buffer.resetWithShared("test".toCharArray(), 0, 4);
        buffer.ensureNotShared();
        buffer.append('!');
        assertEquals("test!", buffer.contentsAsString());
    }

    @Test
    public void testAppendCharArrayLargerThanSegment() {
        char[] large = new char[1500];
        Arrays.fill(large, 'z');
        buffer.append(large, 0, large.length);
        assertEquals(1500, buffer.size());
        assertTrue(buffer.contentsAsString().length() == 1500);
    }

    public static class BufferRecycler {
        public char[] allocCharBuffer(BufferRecycler.CharBufferType type, int minSize) {
            return new char[Math.max(minSize, 1000)];
        }

        public void releaseCharBuffer(BufferRecycler.CharBufferType type, char[] buffer) {
        }

        public enum CharBufferType { TEXT_BUFFER }
    }
}