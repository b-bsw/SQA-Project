package org.apache.commons.compress.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class ChecksumCalculatingInputStreamTest {
    
    private static final byte[] TEST_DATA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private Checksum checksum;
    private ByteArrayInputStream bais;
    private ChecksumCalculatingInputStream cis;
    
    @Before
    public void setUp() {
        checksum = new CRC32();
        bais = new ByteArrayInputStream(TEST_DATA);
        cis = new ChecksumCalculatingInputStream(checksum, bais);
    }
    
    @After
    public void tearDown() throws IOException {
        if (cis != null) {
            cis.close();
        }
    }
    
    @Test
    public void testReadSingleByteNormal() throws IOException {
        int value = cis.read();
        assertEquals(TEST_DATA[0], value);
        CRC32 expected = new CRC32();
        expected.update(TEST_DATA[0]);
        assertEquals(expected.getValue(), cis.getValue());
    }
    
    @Test
    public void testReadSingleByteEndOfStream() throws IOException {
        byte[] emptyData = new byte[0];
        cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(emptyData));
        int value = cis.read();
        assertEquals(-1, value);
        assertEquals(0L, cis.getValue());
    }
    
    @Test
    public void testReadByteArrayNormal() throws IOException {
        byte[] buffer = new byte[TEST_DATA.length];
        int bytesRead = cis.read(buffer);
        assertEquals(TEST_DATA.length, bytesRead);
        assertArrayEquals(TEST_DATA, buffer);
        CRC32 expected = new CRC32();
        expected.update(TEST_DATA);
        assertEquals(expected.getValue(), cis.getValue());
    }
    
    @Test
    public void testReadByteArrayPartial() throws IOException {
        byte[] buffer = new byte[5];
        int bytesRead = cis.read(buffer);
        assertEquals(5, bytesRead);
        byte[] expectedPartial = {1, 2, 3, 4, 5};
        byte[] actual = new byte[5];
        System.arraycopy(buffer, 0, actual, 0, 5);
        assertArrayEquals(expectedPartial, actual);
    }
    
    @Test
    public void testReadByteArrayWithOffsetAndLength() throws IOException {
        byte[] buffer = new byte[20];
        int bytesRead = cis.read(buffer, 5, 10);
        assertEquals(10, bytesRead);
        CRC32 expected = new CRC32();
        expected.update(TEST_DATA, 0, 10);
        assertEquals(expected.getValue(), cis.getValue());
    }
    
    @Test
    public void testReadByteArrayEndOfStream() throws IOException {
        cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[0]));
        byte[] buffer = new byte[10];
        int bytesRead = cis.read(buffer);
        assertEquals(-1, bytesRead);
    }
    
    @Test(expected = NullPointerException.class)
    public void testReadByteArrayNull() throws IOException {
        cis.read(null);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayNegativeOffset() throws IOException {
        byte[] buffer = new byte[10];
        cis.read(buffer, -1, 5);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayNegativeLength() throws IOException {
        byte[] buffer = new byte[10];
        cis.read(buffer, 0, -1);
    }
    
    @Test
    public void testReadByteArrayZeroLength() throws IOException {
        byte[] buffer = new byte[10];
        int bytesRead = cis.read(buffer, 0, 0);
        assertEquals(0, bytesRead);
        assertEquals(0L, cis.getValue());
    }
    
    @Test(expected = IOException.class)
    public void testReadUnderlyingStreamThrows() throws IOException {
        InputStream brokenStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Test exception");
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("Test exception");
            }
        };
        cis = new ChecksumCalculatingInputStream(new CRC32(), brokenStream);
        cis.read();
    }
    
    @Test
    public void testSkip() throws IOException {
        long skipped = cis.skip(5);
        assertEquals(1, skipped);
        assertEquals(1L, cis.getValue());
    }
    
    @Test
    public void testSkipAtEndOfStream() throws IOException {
        cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[0]));
        long skipped = cis.skip(5);
        assertEquals(0, skipped);
        assertEquals(0L, cis.getValue());
    }
    
    @Test
    public void testGetValueInitial() {
        assertEquals(0L, cis.getValue());
    }
    
    @Test
    public void testGetValueAfterReadingAllData() throws IOException {
        byte[] buffer = new byte[TEST_DATA.length];
        cis.read(buffer);
        CRC32 expected = new CRC32();
        expected.update(TEST_DATA);
        assertEquals(expected.getValue(), cis.getValue());
    }
    
    @Test
    public void testMultipleReadBytesUpdateChecksum() throws IOException {
        for (int i = 0; i < TEST_DATA.length; i++) {
            int value = cis.read();
            assertEquals(TEST_DATA[i], value);
        }
        CRC32 expected = new CRC32();
        expected.update(TEST_DATA);
        assertEquals(expected.getValue(), cis.getValue());
    }
    
    @Test
    public void testReadWithDifferentChecksum() throws IOException {
        Checksum adler = new Adler32();
        cis = new ChecksumCalculatingInputStream(adler, new ByteArrayInputStream(TEST_DATA));
        byte[] buffer = new byte[TEST_DATA.length];
        cis.read(buffer);
        Adler32 expected = new Adler32();
        expected.update(TEST_DATA);
        assertEquals(expected.getValue(), cis.getValue());
    }
}