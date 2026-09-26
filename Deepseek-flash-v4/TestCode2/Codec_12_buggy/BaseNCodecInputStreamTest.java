package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class BaseNCodecInputStreamTest {

    private static BaseNCodecInputStream decoder(String data) throws Exception {
        return new BaseNCodecInputStream(
            new ByteArrayInputStream(data.getBytes("US-ASCII")),
            new Base64(),
            false);
    }

    private static BaseNCodecInputStream encoder(String data) throws Exception {
        return new BaseNCodecInputStream(
            new ByteArrayInputStream(data.getBytes("US-ASCII")),
            new Base64(),
            true);
    }

    private static byte[] readAll(InputStream in) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[128];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        return out.toByteArray();
    }

    @Test
    public void testDecodeBuffer() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");
        assertArrayEquals("Man".getBytes("US-ASCII"), readAll(in));
    }

    @Test
    public void testEncodeBuffer() throws Exception {
        BaseNCodecInputStream in = encoder("Man");
        assertArrayEquals("TWFu".getBytes("US-ASCII"), readAll(in));
    }

    @Test
    public void testReadSingleByte() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");
        assertEquals('M', in.read());
        assertEquals('a', in.read());
        assertEquals('n', in.read());
        assertEquals(-1, in.read());
    }

    @Test
    public void testReadReturnsUnsignedByte() throws Exception {
        BaseNCodecInputStream in = decoder("/w=="); // decodes to 0xFF
        assertEquals(255, in.read());
        assertEquals(-1, in.read());
    }

    @Test
    public void testEmptyStream() throws Exception {
        BaseNCodecInputStream in = decoder("");
        assertEquals(-1, in.read(new byte[1], 0, 1));
        assertEquals(-1, in.read());
    }

    @Test
    public void testPartialReads() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");
        byte[] buf = new byte[2];

        assertEquals(2, in.read(buf, 0, 2));
        assertEquals("Ma", new String(buf, "US-ASCII"));

        assertEquals(1, in.read(buf, 0, 2));
        assertEquals("n", new String(buf, 0, 1));

        assertEquals(-1, in.read(buf, 0, 2));
    }

    @Test
    public void testStagedWhitespaceThenDataUsesRepeatedReads() throws Exception {
        BaseNCodecInputStream in = new BaseNCodecInputStream(
            new StagedInputStream("   ", "TWFu"),
            new Base64(),
            false);

        assertArrayEquals("Man".getBytes("US-ASCII"), readAll(in));
    }

    @Test
    public void testReadValidation() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");

        try {
            in.read((byte[]) null, 0, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
        }

        try {
            in.read(new byte[1], -1, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }

        try {
            in.read(new byte[1], 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }

        byte[] buf = new byte[1];
        try {
            in.read(buf, 2, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }

        try {
            in.read(buf, 0, 2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testReadZeroLengthReturnsZero() throws Exception {
        BaseNCodecInputStream in = decoder("");
        assertEquals(0, in.read(new byte[0], 0, 0));
        assertEquals(0, in.read(new byte[5], 0, 0));
    }

    @Test
    public void testMarkSupportedFalse() throws Exception {
        assertFalse(decoder("TWFu").markSupported());
    }

    @Test
    public void testSkip() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");
        assertEquals(2L, in.skip(2));
        assertEquals('n', in.read());
        assertEquals(-1, in.read());
    }

    @Test
    public void testSkipZero() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");
        assertEquals(0L, in.skip(0));
    }

    @Test
    public void testSkipNegativeRejected() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");
        try {
            in.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAvailable() throws Exception {
        BaseNCodecInputStream in = decoder("TWFu");

        assertEquals(0, in.available());

        assertEquals('M', in.read());
        assertEquals(1, in.available());

        assertEquals('a', in.read());
        assertEquals(1, in.available());

        assertEquals('n', in.read());
        assertEquals(0, in.available());

        assertEquals(-1, in.read());
        assertEquals(0, in.available());
    }

    /**
     * Simple stream that returns predefined chunks separately so that
     * BaseNCodecInputStream is forced to loop when readResults() returns 0.
     */
    private static class StagedInputStream extends InputStream {
        private final byte[] first;
        private final byte[] second;
        private int stage = 0;
        private int pos = 0;

        StagedInputStream(String first, String second) throws Exception {
            this.first = first.getBytes("US-ASCII");
            this.second = second.getBytes("US-ASCII");
        }

        @Override
        public int read() throws IOException {
            byte[] one = new byte[1];
            int n = read(one, 0, 1);
            return n < 0 ? -1 : (one[0] & 0xff);
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            if (len == 0) {
                return 0;
            }

            while (stage < 2) {
                byte[] data = stage == 0 ? first : second;
                int available = data.length - pos;

                if (available > 0) {
                    int n = Math.min(available, len);
                    System.arraycopy(data, pos, b, off, n);
                    pos += n;

                    if (pos == data.length) {
                        stage++;
                        pos = 0;
                    }
                    return n;
                }

                stage++;
                pos = 0;
            }

            return -1;
        }
    }
}