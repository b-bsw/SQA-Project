package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private static final String TEST_CONTENT = "Hello, World!";
    private static final byte[] TEST_BYTES = TEST_CONTENT.getBytes();

    @Test
    public void testConstructorAndGetNextEntryWithEmptyStream() throws IOException {
        ByteArrayInputStream empty = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(empty);
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testGetNextEntryReturnsNullAfterClosed() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED));
        ZipArchiveInputStream zis = new ZipArchiveInputStream(in);
        assertNotNull(zis.getNextZipEntry());
        zis.close();
        assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testReadStoredEntry() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(ZipEntry.STORED, entry.getMethod());
        byte[] buf = new byte[1024];
        int len = zis.read(buf, 0, buf.length);
        assertEquals(TEST_BYTES.length, len);
        byte[] readData = new byte[len];
        System.arraycopy(buf, 0, readData, 0, len);
        assertArrayEquals(TEST_BYTES, readData);
        assertEquals(-1, zis.read(buf, 0, buf.length));
        zis.close();
    }

    @Test
    public void testReadDeflatedEntry() throws IOException {
        byte[] compressed = deflate(TEST_BYTES);
        byte[] zipData = createRawZipEntry("test.txt", compressed, ZipEntry.DEFLATED, computeCrc32(TEST_BYTES), TEST_BYTES.length, compressed.length);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        byte[] buf = new byte[1024];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len;
        while ((len = zis.read(buf, 0, buf.length)) != -1) {
            bos.write(buf, 0, len);
        }
        assertArrayEquals(TEST_BYTES, bos.toByteArray());
        zis.close();
    }

    @Test
    public void testReadStoredEntryWithDataDescriptor() throws IOException {
        byte[] zipData = createStoredEntryWithDataDescriptor("test.txt", TEST_BYTES);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData), "UTF8", true, true);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertTrue(entry.getGeneralPurposeBit().usesDataDescriptor());
        byte[] buf = new byte[1024];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len;
        while ((len = zis.read(buf, 0, buf.length)) != -1) {
            bos.write(buf, 0, len);
        }
        assertArrayEquals(TEST_BYTES, bos.toByteArray());
        zis.close();
    }

    @Test
    public void testReadStoredEntryWithDataDescriptorNotAllowed() throws IOException {
        byte[] zipData = createStoredEntryWithDataDescriptor("test.txt", TEST_BYTES);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData), "UTF8", true, false);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        try {
            byte[] buf = new byte[1024];
            zis.read(buf, 0, buf.length);
            fail("Expected UnsupportedZipFeatureException");
        } catch (UnsupportedZipFeatureException e) {
            assertEquals(Feature.DATA_DESCRIPTOR, e.getFeature());
        }
        zis.close();
    }

    @Test(expected = IOException.class)
    public void testReadAfterClose() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED));
        ZipArchiveInputStream zis = new ZipArchiveInputStream(in);
        zis.close();
        zis.read(new byte[1], 0, 1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadWithInvalidOffset() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        zis.read(buf, -1, 5);
        zis.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadWithInvalidLength() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        zis.read(buf, 0, -1);
        zis.close();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadWithInvalidOffsetPlusLength() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        byte[] buf = new byte[5];
        zis.read(buf, 3, 3);
        zis.close();
    }

    @Test
    public void testReadStoredEntryCompressedSizeExact() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertEquals(TEST_BYTES.length, entry.getSize());
        byte[] buf = new byte[1024];
        int totalRead = 0;
        int len;
        while ((len = zis.read(buf, 0, buf.length)) != -1) {
            totalRead += len;
        }
        assertEquals(TEST_BYTES.length, totalRead);
        zis.close();
    }

    @Test
    public void testSkip() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        zis.getNextZipEntry();
        long skipped = zis.skip(5);
        assertEquals(5, skipped);
        byte[] buf = new byte[1024];
        int len = zis.read(buf, 0, buf.length);
        assertEquals(TEST_BYTES.length - 5, len);
        byte[] expected = new byte[TEST_BYTES.length - 5];
        System.arraycopy(TEST_BYTES, 5, expected, 0, TEST_BYTES.length - 5);
        byte[] readData = new byte[len];
        System.arraycopy(buf, 0, readData, 0, len);
        assertArrayEquals(expected, readData);
        zis.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegative() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED));
        ZipArchiveInputStream zis = new ZipArchiveInputStream(in);
        zis.skip(-1);
        zis.close();
    }

    @Test
    public void testMatchesReturnsTrueForLfhSignature() {
        byte[] sig = ZipArchiveOutputStream.LFH_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesReturnsTrueForEocdSignature() {
        byte[] sig = ZipArchiveOutputStream.EOCD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesReturnsTrueForDdSignature() {
        byte[] sig = ZipArchiveOutputStream.DD_SIG;
        assertTrue(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesReturnsFalseForShortSignature() {
        byte[] sig = new byte[] { 0x50 };
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesReturnsFalseForInvalidSignature() {
        byte[] sig = new byte[] { 0x00, 0x01, 0x02, 0x03 };
        assertFalse(ZipArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testCanReadEntryDataReturnsTrueForSupportedEntry() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertTrue(zis.canReadEntryData(entry));
        zis.close();
    }

    @Test
    public void testCanReadEntryDataReturnsFalseForNull() throws IOException {
        byte[] zipData = createSingleEntryZip("test.txt", TEST_BYTES, ZipEntry.STORED);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipData));
        assertFalse(zis.canReadEntryData(null));
        zis.close();
    }

    @Test
    public void testMultipleEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        
        ZipArchiveEntry e1 = new ZipArchiveEntry("first.txt");
        e1.setSize(TEST_BYTES.length);
        e1.setMethod(ZipEntry.STORED);
        e1.setCrc(computeCrc32(TEST_BYTES));
        zos.putArchiveEntry(e1);
        zos.write(TEST_BYTES);
        zos.closeArchiveEntry();
        
        byte[] secondContent = "Second file".getBytes();
        ZipArchiveEntry e2 = new ZipArchiveEntry("second.txt");
        e2.setSize(secondContent.length);
        e2.setMethod(ZipEntry.STORED);
        e2.setCrc(computeCrc32(secondContent));
        zos.putArchiveEntry(e2);
        zos.write(secondContent);
        zos.closeArchiveEntry();
        
        zos.close();
        
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        
        ZipArchiveEntry entry1 = zis.getNextZipEntry();
        assertNotNull(entry1);
        assertEquals("first.txt", entry1.getName());
        byte[] buf = new byte[1024];
        int len = zis.read(buf, 0, buf.length);
        byte[] readData = new byte[len];
        System.arraycopy(buf, 0, readData, 0, len);
        assertArrayEquals(TEST_BYTES, readData);
        
        ZipArchiveEntry entry2 = zis.getNextZipEntry();
        assertNotNull(entry2);
        assertEquals("second.txt", entry2.getName());
        len = zis.read(buf, 0, buf.length);
        readData = new byte[len];
        System.arraycopy(buf, 0, readData, 0, len);
        assertArrayEquals(secondContent, readData);
        
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void testSkipRemainderOfArchive() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        
        ZipArchiveEntry e1 = new ZipArchiveEntry("first.txt");
        e1.setSize(TEST_BYTES.length);
        e1.setMethod(ZipEntry.STORED);
        e1.setCrc(computeCrc32(TEST_BYTES));
        zos.putArchiveEntry(e1);
        zos.write(TEST_BYTES);
        zos.closeArchiveEntry();
        
        ZipArchiveEntry e2 = new ZipArchiveEntry("second.txt");
        byte[] secondContent = "Second file".getBytes();
        e2.setSize(secondContent.length);
        e2.setMethod(ZipEntry.STORED);
        e2.setCrc(computeCrc32(secondContent));
        zos.putArchiveEntry(e2);
        zos.write(secondContent);
        zos.closeArchiveEntry();
        
        zos.close();
        
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        
        ZipArchiveEntry entry1 = zis.getNextZipEntry();
        assertNotNull(entry1);
        byte[] buf = new byte[1024];
        zis.read(buf, 0, buf.length);
        
        ZipArchiveEntry entry2 = zis.getNextZipEntry();
        assertNotNull(entry2);
        byte[] secondBuf = new byte[secondContent.length];
        zis.read(secondBuf, 0, secondBuf.length);
        assertArrayEquals(secondContent, secondBuf);
        
        assertNull(zis.getNextZipEntry());
        zis.close();
    }

    private byte[] createSingleEntryZip(String name, byte[] content, int method) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        entry.setSize(content.length);
        entry.setMethod(method);
        if (method == ZipEntry.STORED) {
            entry.setCrc(computeCrc32(content));
        }
        zos.putArchiveEntry(entry);
        zos.write(content);
        zos.closeArchiveEntry();
        zos.close();
        
        return baos.toByteArray();
    }

    private byte[] createRawZipEntry(String name, byte[] compressedContent, int method, long crc, long size, long compressedSize) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        entry.setMethod(method);
        entry.setCrc(crc);
        entry.setSize(size);
        entry.setCompressedSize(compressedSize);
        zos.putArchiveEntry(entry);
        zos.write(compressedContent);
        zos.closeArchiveEntry();
        zos.close();
        
        return baos.toByteArray();
    }

    private byte[] createStoredEntryWithDataDescriptor(String name, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        entry.setMethod(ZipEntry.STORED);
        GeneralPurposeBit b = new GeneralPurposeBit();
        b.useDataDescriptor(true);
        entry.setGeneralPurposeBit(b);
        zos.putArchiveEntry(entry);
        zos.write(content);
        zos.closeArchiveEntry();
        zos.close();
        
        return baos.toByteArray();
    }

    private byte[] deflate(byte[] input) throws IOException {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos, deflater);
        dos.write(input);
        dos.close();
        return baos.toByteArray();
    }

    private long computeCrc32(byte[] data) {
        CRC32 crc = new CRC32();
        crc.update(data);
        return crc.getValue();
    }
}