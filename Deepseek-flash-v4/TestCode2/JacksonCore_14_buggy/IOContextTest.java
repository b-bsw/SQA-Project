package com.fasterxml.jackson.core.io;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class IOContextTest {

    private BufferRecycler recycler;
    private IOContext context;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        context = new IOContext(recycler, "testSource", true);
    }

    @Test
    public void testConstructorAndAccessors() {
        assertSame("testSource", context.getSourceReference());
        assertTrue(context.isResourceManaged());
        assertNull(context.getEncoding());
    }

    @Test
    public void testSetEncoding() {
        context.setEncoding(JsonEncoding.UTF8);
        assertEquals(JsonEncoding.UTF8, context.getEncoding());
    }

    @Test
    public void testWithEncoding() {
        IOContext returned = context.withEncoding(JsonEncoding.UTF16_BE);
        assertSame(context, returned);
        assertEquals(JsonEncoding.UTF16_BE, context.getEncoding());
    }

    @Test
    public void testConstructTextBuffer() {
        TextBuffer buffer = context.constructTextBuffer();
        assertNotNull(buffer);
    }

    @Test
    public void testAllocReadIOBufferFirstTime() {
        byte[] buf = context.allocReadIOBuffer();
        assertNotNull(buf);
        assertTrue(buf.length > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferSecondTime() {
        context.allocReadIOBuffer();
        context.allocReadIOBuffer();
    }

    @Test
    public void testAllocReadIOBufferWithMinSize() {
        byte[] buf = context.allocReadIOBuffer(100);
        assertNotNull(buf);
        assertTrue(buf.length >= 100);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocReadIOBufferWithMinSizeSecondTime() {
        context.allocReadIOBuffer(100);
        context.allocReadIOBuffer(200);
    }

    @Test
    public void testAllocWriteEncodingBuffer() {
        byte[] buf = context.allocWriteEncodingBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBufferSecondTime() {
        context.allocWriteEncodingBuffer();
        context.allocWriteEncodingBuffer();
    }

    @Test
    public void testAllocWriteEncodingBufferWithMinSize() {
        byte[] buf = context.allocWriteEncodingBuffer(50);
        assertNotNull(buf);
        assertTrue(buf.length >= 50);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocWriteEncodingBufferWithMinSizeSecondTime() {
        context.allocWriteEncodingBuffer(50);
        context.allocWriteEncodingBuffer(50);
    }

    @Test
    public void testAllocBase64Buffer() {
        byte[] buf = context.allocBase64Buffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocBase64BufferSecondTime() {
        context.allocBase64Buffer();
        context.allocBase64Buffer();
    }

    @Test
    public void testAllocTokenBuffer() {
        char[] buf = context.allocTokenBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBufferSecondTime() {
        context.allocTokenBuffer();
        context.allocTokenBuffer();
    }

    @Test
    public void testAllocTokenBufferWithMinSize() {
        char[] buf = context.allocTokenBuffer(256);
        assertNotNull(buf);
        assertTrue(buf.length >= 256);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocTokenBufferWithMinSizeSecondTime() {
        context.allocTokenBuffer(256);
        context.allocTokenBuffer(256);
    }

    @Test
    public void testAllocConcatBuffer() {
        char[] buf = context.allocConcatBuffer();
        assertNotNull(buf);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocConcatBufferSecondTime() {
        context.allocConcatBuffer();
        context.allocConcatBuffer();
    }

    @Test
    public void testAllocNameCopyBuffer() {
        char[] buf = context.allocNameCopyBuffer(100);
        assertNotNull(buf);
        assertTrue(buf.length >= 100);
    }

    @Test(expected = IllegalStateException.class)
    public void testAllocNameCopyBufferSecondTime() {
        context.allocNameCopyBuffer(100);
        context.allocNameCopyBuffer(100);
    }

    @Test
    public void testReleaseReadIOBufferWithCorrectBuffer() {
        byte[] buf = context.allocReadIOBuffer();
        context.releaseReadIOBuffer(buf);
        assertNull(context._readIOBuffer);
    }

    @Test
    public void testReleaseReadIOBufferWithNull() {
        context.releaseReadIOBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseReadIOBufferWithWrongBuffer() {
        byte[] buf = context.allocReadIOBuffer();
        byte[] otherBuf = new byte[buf.length];
        context.releaseReadIOBuffer(otherBuf);
    }

    @Test
    public void testReleaseWriteEncodingBuffer() {
        byte[] buf = context.allocWriteEncodingBuffer();
        context.releaseWriteEncodingBuffer(buf);
        assertNull(context._writeEncodingBuffer);
    }

    @Test
    public void testReleaseWriteEncodingBufferWithNull() {
        context.releaseWriteEncodingBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseWriteEncodingBufferWithWrongBuffer() {
        byte[] buf = context.allocWriteEncodingBuffer();
        byte[] otherBuf = new byte[buf.length];
        context.releaseWriteEncodingBuffer(otherBuf);
    }

    @Test
    public void testReleaseBase64Buffer() {
        byte[] buf = context.allocBase64Buffer();
        context.releaseBase64Buffer(buf);
        assertNull(context._base64Buffer);
    }

    @Test
    public void testReleaseBase64BufferWithNull() {
        context.releaseBase64Buffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseBase64BufferWithWrongBuffer() {
        byte[] buf = context.allocBase64Buffer();
        byte[] otherBuf = new byte[buf.length];
        context.releaseBase64Buffer(otherBuf);
    }

    @Test
    public void testReleaseTokenBuffer() {
        char[] buf = context.allocTokenBuffer();
        context.releaseTokenBuffer(buf);
        assertNull(context._tokenCBuffer);
    }

    @Test
    public void testReleaseTokenBufferWithNull() {
        context.releaseTokenBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseTokenBufferWithWrongBuffer() {
        char[] buf = context.allocTokenBuffer();
        char[] otherBuf = new char[buf.length];
        context.releaseTokenBuffer(otherBuf);
    }

    @Test
    public void testReleaseConcatBuffer() {
        char[] buf = context.allocConcatBuffer();
        context.releaseConcatBuffer(buf);
        assertNull(context._concatCBuffer);
    }

    @Test
    public void testReleaseConcatBufferWithNull() {
        context.releaseConcatBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseConcatBufferWithWrongBuffer() {
        char[] buf = context.allocConcatBuffer();
        char[] otherBuf = new char[buf.length];
        context.releaseConcatBuffer(otherBuf);
    }

    @Test
    public void testReleaseNameCopyBuffer() {
        char[] buf = context.allocNameCopyBuffer(100);
        context.releaseNameCopyBuffer(buf);
        assertNull(context._nameCopyBuffer);
    }

    @Test
    public void testReleaseNameCopyBufferWithNull() {
        context.releaseNameCopyBuffer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReleaseNameCopyBufferWithWrongBuffer() {
        char[] buf = context.allocNameCopyBuffer(100);
        char[] otherBuf = new char[buf.length];
        context.releaseNameCopyBuffer(otherBuf);
    }

    @Test
    public void testVerifyAllocWithNull() {
        context._verifyAlloc(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testVerifyAllocWithNonNull() {
        context._verifyAlloc(new Object());
    }

    @Test
    public void testVerifyReleaseByteArraySameReference() {
        byte[] buf = new byte[10];
        context._verifyRelease(buf, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyReleaseByteArraySmallerDifferentReference() {
        byte[] buf = new byte[10];
        byte[] otherBuf = new byte[5];
        context._verifyRelease(otherBuf, buf);
    }

    @Test
    public void testVerifyReleaseByteArrayLargerDifferentReference() {
        byte[] buf = new byte[10];
        byte[] otherBuf = new byte[20];
        context._verifyRelease(otherBuf, buf);
    }

    @Test
    public void testVerifyReleaseCharArraySameReference() {
        char[] buf = new char[10];
        context._verifyRelease(buf, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyReleaseCharArraySmallerDifferentReference() {
        char[] buf = new char[10];
        char[] otherBuf = new char[5];
        context._verifyRelease(otherBuf, buf);
    }

    @Test
    public void testVerifyReleaseCharArrayLargerDifferentReference() {
        char[] buf = new char[10];
        char[] otherBuf = new char[20];
        context._verifyRelease(otherBuf, buf);
    }

    @Test
    public void testWrongBuf() {
        IllegalArgumentException ex = context.wrongBuf();
        assertEquals("Trying to release buffer not owned by the context", ex.getMessage());
    }
}