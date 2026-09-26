package org.apache.commons.compress.compressors.deflate;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import org.junit.Test;

public class DeflateCompressorInputStreamTest {

    private static byte[] deflate(byte[] data, boolean zlibHeader) throws IOException {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, !zlibHeader);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (DeflaterOutputStream out = new DeflaterOutputStream(buffer, deflater)) {
            out.write(data);
        } finally {
            deflater.end();
        }
        return buffer.toByteArray();
    }

    @Test
    public void testReadSingleBytes() throws IOException {
        byte[] input = "abc".getBytes("US-ASCII");
        byte[] compressed = deflate(input, true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            assertEquals('a', in.read());
            assertEquals('b', in.read());
            assertEquals('c', in.read());
            assertEquals(-1, in.read());
        }
    }

    @Test
    public void testReadBuffer() throws IOException {
        byte[] input = "hello world".getBytes("US-ASCII");
        byte[] compressed = deflate(input, true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            byte[] buf = new byte[128];
            int n = in.read(buf, 0, buf.length);

            assertEquals(input.length, n);
            assertArrayEquals(input, Arrays.copyOf(buf, n));
            assertEquals(-1, in.read(buf, 0, buf.length));
        }
    }

    @Test
    public void testReadBufferWithOffsetAndLength() throws IOException {
        byte[] input = "0123456789".getBytes("US-ASCII");
        byte[] compressed = deflate(input, true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            byte[] buf = new byte[10];
            int n = in.read(buf, 2, 5);

            assertEquals(5, n);
            assertArrayEquals(
                    new byte[] {'0', '1', '2', '3', '4'},
                    Arrays.copyOfRange(buf, 2, 7));
        }
    }

    @Test
    public void testReadZeroLengthBuffer() throws IOException {
        byte[] compressed = deflate(new byte[] {'x'}, true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            assertEquals(0, in.read(new byte[0], 0, 0));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testReadNullBufferThrowsNullPointerException() throws IOException {
        byte[] compressed = deflate(new byte[] {'x'}, true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            in.read(null, 0, 1);
        }
    }

    @Test
    public void testSkip() throws IOException {
        byte[] input = "abcdefghijklmnopqrstuvwxyz".getBytes("US-ASCII");
        byte[] compressed = deflate(input, true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            assertEquals(0, in.skip(0));
            assertEquals(1, in.skip(1));
            assertEquals(10, in.skip(10));
            assertEquals('l', in.read());
        }
    }

    @Test
    public void testEmptyInput() throws IOException {
        byte[] compressed = deflate(new byte[0], true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            assertEquals(-1, in.read());
            assertEquals(-1, in.read(new byte[4], 0, 4));
        }
    }

    @Test
    public void testRawDeflate() throws IOException {
        byte[] input = "raw".getBytes("US-ASCII");
        byte[] compressed = deflate(input, false);

        DeflateParameters params = new DeflateParameters();
        params.setZlibHeader(false);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed), params)) {
            assertEquals('r', in.read());
            assertEquals('a', in.read());
            assertEquals('w', in.read());
            assertEquals(-1, in.read());
        }
    }

    @Test
    public void testLargeInput() throws IOException {
        byte[] input = new byte[4096];
        for (int i = 0; i < input.length; i++) {
            input[i] = (byte) (i % 251);
        }

        byte[] compressed = deflate(input, true);

        try (DeflateCompressorInputStream in =
                     new DeflateCompressorInputStream(new ByteArrayInputStream(compressed))) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[511];
            int n;

            while ((n = in.read(buf, 0, buf.length)) != -1) {
                out.write(buf, 0, n);
            }

            assertArrayEquals(input, out.toByteArray());
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullParametersThrowsNullPointerException() {
        new DeflateCompressorInputStream(new ByteArrayInputStream(new byte[0]), null);
    }
}