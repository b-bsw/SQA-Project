package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

public class ZipArchiveInputStreamTest {

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final String TEST_STRING = "test data";
    private ByteArrayInputStream emptyStream;
    private ByteArrayInputStream testStream;

    @Before
    public void setUp() throws Exception {
        emptyStream = new ByteArrayInputStream(EMPTY_BYTE_ARRAY);
        testStream = new ByteArrayInputStream(TEST_STRING.getBytes("UTF-8"));
    }

    @Test
    public void testConstructorWithInputStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        assertNotNull(zis);
        zis.close();
    }

    @Test
    public void testConstructorWithEncoding() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream, "UTF-8");
        assertNotNull(zis);
        zis.close();
    }

    @Test
    public void testConstructorWithAllParams() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream, "UTF-8", true, false);
        assertNotNull(zis);
        zis.close();
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.close();
        zis.read(new byte[10], 0, 10);
    }

    @Test
    public void testReadWhenCurrentIsNull() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        assertEquals(-1, zis.read(new byte[10], 0, 10));
        zis.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidOffset() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.read(new byte[10], -1, 5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidLength() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.read(new byte[10], 0, -1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadBufferTooSmall() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.read(new byte[5], 0, 10);
    }

    @Test
    public void testSkipWithNegativeValue() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        try {
            zis.skip(-1);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        } finally {
            try {
                zis.close();
            } catch (IOException e) {
                // ignore
            }
        }
    }

    @Test
    public void testSkipZero() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        assertEquals(0, zis.skip(0));
        zis.close();
    }

    @Test
    public void testMatches_ShortSignature() {
        assertFalse(ZipArchiveInputStream.matches(new byte[2], 2));
    }

    @Test
    public void testMatches_LFHSig() {
        byte[] sig = ZipArchiveOutputStream.LFH_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_EOCDSig() {
        byte[] sig = ZipArchiveOutputStream.EOCD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_DDSig() {
        byte[] sig = ZipArchiveOutputStream.DD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_SingleSegmentSplitMarker() {
        byte[] sig = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatches_InvalidSig() {
        byte[] sig = new byte[]{0x00, 0x01, 0x02, 0x03};
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testCanReadEntryData_NullEntry() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        assertFalse(zis.canReadEntryData(null));
        try {
            zis.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void testCanReadEntryData_NonZipEntry() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        ArchiveEntry ae = new ArchiveEntry() {
            public String getName() { return "test"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
        };
        assertFalse(zis.canReadEntryData(ae));
        try {
            zis.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void testGetNextZipEntry_ClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.close();
        assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testGetNextEntry_ClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.close();
        assertNull(zis.getNextEntry());
    }

    @Test
    public void testCloseMultipleTimes() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.close();
        zis.close(); // should not throw
    }

    @Test(expected = IOException.class)
    public void testCloseEntryWithClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.close();
        zis.getNextZipEntry();
    }

    @Test
    public void testMatches_ChecksigFalse() {
        byte[] sig = new byte[]{0x50, 0x4B, 0x03, 0x05};
        assertFalse(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRealSkipNegative() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(emptyStream);
        zis.close();
    }

    @Test
    public void testReadStored_NoDataDescriptor_EmptyEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[26]);
        baos.write(new byte[0]);
        baos.write(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        zis.getNextZipEntry();
        assertEquals(-1, zis.read(new byte[10], 0, 10));
        zis.close();
    }

    @Test
    public void testSkip_ValueGreaterThanBufferSize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.LFH_SIG.getBytes());
        baos.write(new byte[26]);
        baos.write(new byte[0]);
        baos.write(new byte[0]);
        for (int i = 0; i < 2000; i++) {
            baos.write(i);
        }
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        zis.getNextZipEntry();
        long skipped = zis.skip(1500);
        assertTrue(skipped > 0);
        zis.close();
    }
}