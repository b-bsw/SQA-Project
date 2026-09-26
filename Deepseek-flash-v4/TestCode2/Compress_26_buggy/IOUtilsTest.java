package org.apache.commons.compress.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtilsTest {

    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() throws IOException {
        output.close();
    }

    @Test
    public void testCopyNormal() throws IOException {
        byte[] data = "Hello".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long count = IOUtils.copy(input, output);
        assertEquals(5L, count);
        assertArrayEquals(data, output.toByteArray());
    }

    @Test
    public void testCopyEmpty() throws IOException {
        byte[] data = new byte[0];
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long count = IOUtils.copy(input, output);
        assertEquals(0L, count);
        assertArrayEquals(data, output.toByteArray());
    }

    @Test
    public void testCopyLargeBuffer() throws IOException {
        byte[] data = new byte[10000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long count = IOUtils.copy(input, output, 4096);
        assertEquals(10000L, count);
        assertArrayEquals(data, output.toByteArray());
    }

    @Test
    public void testCopyWithCustomBufferSize() throws IOException {
        byte[] data = "Test".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long count = IOUtils.copy(input, output, 128);
        assertEquals(4L, count);
        assertArrayEquals(data, output.toByteArray());
    }

    @Test(expected = NullPointerException.class)
    public void testCopyNullInput() throws IOException {
        IOUtils.copy(null, output);
    }

    @Test(expected = NullPointerException.class)
    public void testCopyNullOutput() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream("test".getBytes());
        IOUtils.copy(input, null);
    }

    @Test
    public void testSkipNormal() throws IOException {
        byte[] data = "Hello World".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(input, 5);
        assertEquals(5L, skipped);
        byte[] remaining = new byte[data.length - 5];
        input.read(remaining);
        assertArrayEquals(" World".getBytes(), remaining);
    }

    @Test
    public void testSkipZero() throws IOException {
        byte[] data = "Hello".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(input, 0);
        assertEquals(0L, skipped);
    }

    @Test
    public void testSkipMoreThanAvailable() throws IOException {
        byte[] data = "Hi".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(input, 10);
        assertEquals(2L, skipped);
        assertEquals(-1, input.read());
    }

    @Test
    public void testSkipNegative() throws IOException {
        byte[] data = "Test".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(input, -1);
        assertEquals(0L, skipped);
    }

    @Test
    public void testReadFullyNormal() throws IOException {
        byte[] data = "Hello".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        int count = IOUtils.readFully(input, buffer);
        assertEquals(5, count);
        assertArrayEquals(data, buffer);
    }

    @Test
    public void testReadFullyPartial() throws IOException {
        byte[] data = "Hi".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        int count = IOUtils.readFully(input, buffer);
        assertEquals(2, count);
        assertEquals('H', buffer[0]);
        assertEquals('i', buffer[1]);
    }

    @Test
    public void testReadFullyEmpty() throws IOException {
        byte[] data = new byte[0];
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[0];
        int count = IOUtils.readFully(input, buffer);
        assertEquals(0, count);
    }

    @Test
    public void testReadFullyWithOffsetAndLengthNormal() throws IOException {
        byte[] data = "Hello World".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[20];
        int count = IOUtils.readFully(input, buffer, 5, 5);
        assertEquals(5, count);
        assertArrayEquals("Hello".getBytes(), new byte[]{buffer[5], buffer[6], buffer[7], buffer[8], buffer[9]});
    }

    @Test
    public void testReadFullyWithOffsetAndLengthPartial() throws IOException {
        byte[] data = "AB".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];
        int count = IOUtils.readFully(input, buffer, 2, 5);
        assertEquals(2, count);
        assertEquals('A', buffer[2]);
        assertEquals('B', buffer[3]);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyNegativeLen() throws IOException {
        byte[] data = "Test".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        IOUtils.readFully(input, new byte[5], 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyNegativeOffset() throws IOException {
        byte[] data = "Test".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        IOUtils.readFully(input, new byte[5], -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyOffsetLenExceedsBuffer() throws IOException {
        byte[] data = "Test".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        IOUtils.readFully(input, new byte[5], 3, 3);
    }

    @Test
    public void testToByteArrayNormal() throws IOException {
        byte[] data = "Hello".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        byte[] result = IOUtils.toByteArray(input);
        assertArrayEquals(data, result);
    }

    @Test
    public void testToByteArrayEmpty() throws IOException {
        ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
        byte[] result = IOUtils.toByteArray(input);
        assertArrayEquals(new byte[0], result);
    }

    @Test(expected = NullPointerException.class)
    public void testToByteArrayNullInput() throws IOException {
        IOUtils.toByteArray(null);
    }

    @Test
    public void testCloseQuietlyNull() {
        IOUtils.closeQuietly(null);
    }

    @Test
    public void testCloseQuietlyNormal() {
        Closeable c = new Closeable() {
            @Override
            public void close() throws IOException {
            }
        };
        IOUtils.closeQuietly(c);
    }

    @Test
    public void testCloseQuietlyWithIOException() {
        Closeable c = new Closeable() {
            @Override
            public void close() throws IOException {
                throw new IOException("Test exception");
            }
        };
        IOUtils.closeQuietly(c);
    }

    @Test
    public void testPrivateConstructor() throws Exception {
        java.lang.reflect.Constructor<IOUtils> constructor = IOUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}