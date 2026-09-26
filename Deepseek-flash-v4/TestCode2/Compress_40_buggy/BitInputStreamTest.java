package org.apache.commons.compress.utils;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

import org.junit.Test;

public class BitInputStreamTest {

    private static ByteArrayInputStream stream(int... bytes) {
        byte[] data = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            data[i] = (byte) bytes[i];
        }
        return new ByteArrayInputStream(data);
    }

    @Test
    public void testBigEndianWithinByte() throws Exception {
        BitInputStream in = new BitInputStream(stream(0x2D), ByteOrder.BIG_ENDIAN);

        assertEquals(0x2, in.readBits(4));
        assertEquals(0xD, in.readBits(4));
        assertEquals(-1, in.readBits(8));
    }

    @Test
    public void testLittleEndianWithinByte() throws Exception {
        BitInputStream in = new BitInputStream(stream(0x2D), ByteOrder.LITTLE_ENDIAN);

        assertEquals(0xD, in.readBits(4));
        assertEquals(0x2, in.readBits(4));
    }

    @Test
    public void testBigEndianMultipleBytes() throws Exception {
        BitInputStream in = new BitInputStream(stream(0x01, 0x02, 0x03), ByteOrder.BIG_ENDIAN);

        assertEquals(0x0102L, in.readBits(16));
        assertEquals(0x03L, in.readBits(8));
    }

    @Test
    public void testLittleEndianMultipleBytes() throws Exception {
        BitInputStream in = new BitInputStream(stream(0x01, 0x02, 0x03), ByteOrder.LITTLE_ENDIAN);

        assertEquals(0x0201L, in.readBits(16));
        assertEquals(0x03L, in.readBits(8));
    }

    @Test
    public void testMaxBitCountBigEndian() throws Exception {
        byte[] data = new byte[8];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) 0xFF;
        }

        BitInputStream in = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN);

        assertEquals(0x7fffffffffffffffL, in.readBits(63));
        assertEquals(1L, in.readBits(1));
    }

    @Test
    public void testZeroBits() throws Exception {
        BitInputStream in = new BitInputStream(stream(), ByteOrder.BIG_ENDIAN);

        assertEquals(0L, in.readBits(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeBitCountRejected() throws Exception {
        new BitInputStream(stream(0x01), ByteOrder.BIG_ENDIAN).readBits(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBitCountOverMaxRejected() throws Exception {
        new BitInputStream(stream(0x01), ByteOrder.BIG_ENDIAN).readBits(64);
    }

    @Test
    public void testEmptyStreamReturnsMinusOne() throws Exception {
        BitInputStream in = new BitInputStream(stream(), ByteOrder.BIG_ENDIAN);

        assertEquals(-1L, in.readBits(1));
    }

    @Test
    public void testReadPastEndReturnsMinusOne() throws Exception {
        BitInputStream in = new BitInputStream(stream(0x01), ByteOrder.BIG_ENDIAN);

        assertEquals(-1L, in.readBits(16));
    }

    @Test(expected = NullPointerException.class)
    public void testNullInputThrowsNpe() throws Exception {
        new BitInputStream(null, ByteOrder.BIG_ENDIAN).readBits(1);
    }

    @Test
    public void testClearBitCacheDiscardsBufferedBits() throws Exception {
        BitInputStream in = new BitInputStream(stream(0xAB, 0xCD), ByteOrder.BIG_ENDIAN);

        assertEquals(0xA, in.readBits(4));

        in.clearBitCache();

        assertEquals(0xCD, in.readBits(8));
    }

    @Test
    public void testCloseDelegatesToUnderlyingStream() throws Exception {
        TrackedInputStream tracked = new TrackedInputStream();
        BitInputStream in = new BitInputStream(tracked, ByteOrder.BIG_ENDIAN);

        in.close();

        assertTrue(tracked.closed);
    }

    private static final class TrackedInputStream extends InputStream {
        private boolean closed;

        @Override
        public int read() {
            return -1;
        }

        @Override
        public void close() throws IOException {
            this.closed = true;
        }
    }
}