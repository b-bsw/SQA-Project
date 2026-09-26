package org.apache.commons.compress.compressors.bzip2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BZip2CompressorInputStreamTest {

    @Test(expected = NullPointerException.class)
    public void testConstructorNullInputStream() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testConstructorInvalidHeader() throws IOException {
        byte[] data = new byte[] {0, 1, 2, 3};
        InputStream in = new ByteArrayInputStream(data);
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void testConstructorShortHeader() throws IOException {
        byte[] data = new byte[] {66, 90}; // BZ but no h
        InputStream in = new ByteArrayInputStream(data);
        new BZip2CompressorInputStream(in);
    }

    @Test(expected = IOException.class)
    public void testConstructorInvalidBlockSize() throws IOException {
        byte[] data = new byte[] {66, 90, 104, 48}; // 'B','Z','h','0' -> invalid block size
        InputStream in = new ByteArrayInputStream(data);
        new BZip2CompressorInputStream(in);
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] sig = new byte[] {66, 90, 104};
        assertTrue(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatchesShortSignature() {
        byte[] sig = new byte[] {66, 90};
        assertFalse(BZip2CompressorInputStream.matches(sig, 2));
    }

    @Test
    public void testMatchesWrongFirstByte() {
        byte[] sig = new byte[] {65, 90, 104};
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatchesWrongSecondByte() {
        byte[] sig = new byte[] {66, 65, 104};
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatchesWrongThirdByte() {
        byte[] sig = new byte[] {66, 90, 103};
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test(expected = IOException.class)
    public void testReadAfterClose() throws IOException {
        byte[] data = new byte[] {66, 90, 104, 49};
        InputStream in = new ByteArrayInputStream(data);
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(in);
        bzIn.close();
        bzIn.read();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArrayNegativeOffset() throws IOException {
        byte[] data = new byte[] {66, 90, 104, 49};
        InputStream in = new ByteArrayInputStream(data);
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(in);
        try {
            bzIn.read(new byte[10], -1, 5);
        } finally {
            bzIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArrayNegativeLength() throws IOException {
        byte[] data = new byte[] {66, 90, 104, 49};
        InputStream in = new ByteArrayInputStream(data);
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(in);
        try {
            bzIn.read(new byte[10], 0, -1);
        } finally {
            bzIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadArrayOffsetPlusLengthExceedsDest() throws IOException {
        byte[] data = new byte[] {66, 90, 104, 49};
        InputStream in = new ByteArrayInputStream(data);
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(in);
        try {
            bzIn.read(new byte[10], 8, 5);
        } finally {
            bzIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void testReadArrayAfterClose() throws IOException {
        byte[] data = new byte[] {66, 90, 104, 49};
        InputStream in = new ByteArrayInputStream(data);
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(in);
        bzIn.close();
        bzIn.read(new byte[10], 0, 10);
    }
}