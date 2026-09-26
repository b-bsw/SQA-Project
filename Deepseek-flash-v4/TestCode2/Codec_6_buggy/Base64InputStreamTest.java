package org.apache.commons.codec.binary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class Base64InputStreamTest {

    private static final byte[] ENCODED_HELLO = "aGVsbG8=".getBytes();
    private static final byte[] DECODED_HELLO = "hello".getBytes();

    @Test
    public void testDecodeSingleByte() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        for (int i = 0; i < DECODED_HELLO.length; i++) {
            int b = b64in.read();
            assertEquals(DECODED_HELLO[i] & 0xFF, b);
        }
        assertEquals(-1, b64in.read());
        b64in.close();
    }

    @Test
    public void testDecodeArray() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        byte[] buf = new byte[5];
        int n = b64in.read(buf, 0, 5);
        assertEquals(5, n);
        for (int i = 0; i < 5; i++) {
            assertEquals(DECODED_HELLO[i], buf[i]);
        }
        assertEquals(-1, b64in.read(buf, 0, 5));
        b64in.close();
    }

    @Test
    public void testDecodeEmpty() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream b64in = new Base64InputStream(in);
        assertEquals(-1, b64in.read());
        assertEquals(-1, b64in.read(new byte[1], 0, 1));
        b64in.close();
    }

    @Test
    public void testDecodeNullInput() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        try {
            b64in.read(null, 0, 1);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
        b64in.close();
    }

    @Test
    public void testDecodeNegativeOffset() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        try {
            b64in.read(new byte[1], -1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        b64in.close();
    }

    @Test
    public void testDecodeNegativeLength() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        try {
            b64in.read(new byte[1], 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        b64in.close();
    }

    @Test
    public void testDecodeOffsetOverflow() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        try {
            b64in.read(new byte[5], 4, 2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        b64in.close();
    }

    @Test
    public void testDecodeZeroLength() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        assertEquals(0, b64in.read(new byte[1], 0, 0));
        b64in.close();
    }

    @Test
    public void testDecodePartialBuffer() throws IOException {
        InputStream in = new ByteArrayInputStream(ENCODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        byte[] buf = new byte[10];
        int n = b64in.read(buf, 2, 5);
        assertEquals(5, n);
        for (int i = 0; i < 5; i++) {
            assertEquals(DECODED_HELLO[i], buf[2 + i]);
        }
        b64in.close();
    }

    @Test
    public void testEncodeSingleByte() throws IOException {
        InputStream in = new ByteArrayInputStream(DECODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in, true);
        byte[] buf = new byte[8];
        int n = b64in.read(buf, 0, 8);
        assertEquals(8, n);
        for (int i = 0; i < 8; i++) {
            assertEquals(ENCODED_HELLO[i], buf[i]);
        }
        assertEquals(-1, b64in.read());
        b64in.close();
    }

    @Test
    public void testMarkSupported() {
        InputStream in = new ByteArrayInputStream(DECODED_HELLO);
        Base64InputStream b64in = new Base64InputStream(in);
        assertEquals(false, b64in.markSupported());
    }

    @Test
    public void testConstructorWithLineLength() throws IOException {
        byte[] lineSep = "\n".getBytes();
        InputStream in = new ByteArrayInputStream("hello".getBytes());
        Base64InputStream b64in = new Base64InputStream(in, true, 4, lineSep);
        byte[] buf = new byte[20];
        int n = b64in.read(buf, 0, 20);
        assertEquals(10, n);
        b64in.close();
    }

    @Test
    public void testDecodeRepeatedZeroRead() throws IOException {
        // Simulate scenario where readResults returns 0 repeatedly, then returns data
        InputStream in = new InputStream() {
            private boolean first = true;
            public int read() throws IOException {
                return 0;
            }
            public int read(byte[] b, int off, int len) throws IOException {
                if (first) {
                    first = false;
                    return 0;
                }
                return -1;
            }
        };
        Base64InputStream b64in = new Base64InputStream(in);
        assertEquals(-1, b64in.read());
        b64in.close();
    }
}