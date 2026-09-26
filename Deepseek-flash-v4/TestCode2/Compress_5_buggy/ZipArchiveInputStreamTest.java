package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private static final byte[] EMPTY = new byte[0];

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegative() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        zis.skip(-1);
    }

    @Test
    public void testSkipOnClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        zis.close();
        assertEquals(0, zis.skip(10));
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        zis.close();
        zis.read(new byte[10], 0, 10);
    }

    @Test
    public void testGetNextEntryOnClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        zis.close();
        assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testGetNextEntryEmptyStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        assertNull(zis.getNextEntry());
    }

    @Test
    public void testMatchesNormalFile() {
        byte[] lfhSig = ZipArchiveOutputStream.LFH_SIG;
        assertTrue(ZipArchiveInputStream.matches(lfhSig, lfhSig.length));
    }

    @Test
    public void testMatchesEOCODSig() {
        byte[] eocdSig = ZipArchiveOutputStream.EOCD_SIG;
        assertTrue(ZipArchiveInputStream.matches(eocdSig, eocdSig.length));
    }

    @Test
    public void testMatchesTooShort() {
        assertFalse(ZipArchiveInputStream.matches(new byte[2], 2));
    }

    @Test
    public void testMatchesWrongSig() {
        byte[] wrong = new byte[ZipArchiveOutputStream.LFH_SIG.length];
        assertFalse(ZipArchiveInputStream.matches(wrong, wrong.length));
    }

    @Test
    public void testReadStoredEntry() throws IOException {
        byte[] data = createStoredEntry("test.txt", "Hello".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(ZipArchiveOutputStream.STORED, entry.getMethod());

        byte[] buf = new byte[10];
        int read = zis.read(buf, 0, buf.length);
        assertEquals(5, read);
        assertEquals('H', buf[0]);
        assertEquals('o', buf[4]);
        assertEquals(-1, zis.read(buf, 0, buf.length));
    }

    @Test
    public void testReadDeflatedEntry() throws IOException {
        byte[] data = createDeflatedEntry("test.txt", "Hello World Deflated".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(ZipArchiveOutputStream.DEFLATED, entry.getMethod());

        byte[] buf = new byte[1024];
        int totalRead = 0;
        int read;
        while ((read = zis.read(buf, totalRead, buf.length - totalRead)) != -1) {
            totalRead += read;
        }
        String result = new String(buf, 0, totalRead);
        assertEquals("Hello World Deflated", result);
    }

    @Test
    public void testTwoEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(createStoredEntry("first.txt", "first".getBytes()));
        baos.write(createStoredEntry("second.txt", "second".getBytes()));
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        
        ZipArchiveEntry e1 = zis.getNextZipEntry();
        assertNotNull(e1);
        assertEquals("first.txt", e1.getName());
        byte[] buf = new byte[10];
        assertEquals(5, zis.read(buf, 0, buf.length));
        
        ZipArchiveEntry e2 = zis.getNextZipEntry();
        assertNotNull(e2);
        assertEquals("second.txt", e2.getName());
        assertEquals(6, zis.read(buf, 0, buf.length));
        
        assertNull(zis.getNextZipEntry());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidBufferParams() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        zis.read(new byte[10], -1, 5);
    }

    @Test
    public void testSkipOverEntry() throws IOException {
        byte[] data = createStoredEntry("test.txt", "SkipMe".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        long skipped = zis.skip(100);
        assertEquals(6, skipped);
    }

    @Test
    public void testSkipPartialEntry() throws IOException {
        byte[] data = createStoredEntry("test.txt", "Partial".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zis.getNextZipEntry();
        long skipped = zis.skip(3);
        assertEquals(3, skipped);
    }

    @Test
    public void testDoubleClose() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        zis.close();
        zis.close(); // should not throw
    }

    @Test(expected = IOException.class)
    public void testCloseEntryOnClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY));
        zis.close();
        zis.read(new byte[1], 0, 1);
    }

    @Test
    public void testGetNextEntryEOF() throws IOException {
        byte[] data = createStoredEntry("test.txt", "data".getBytes());
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        assertNotNull(zis.getNextZipEntry());
        assertNull(zis.getNextZipEntry());
    }

    private byte[] createStoredEntry(String name, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CRC32 crc = new CRC32();
        crc.update(content);
        
        // LFH signature
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        // version needed to extract (2 bytes)
        baos.write(new byte[]{20, 0});
        // general purpose bit flag (STORED, no data descriptor)
        baos.write(new byte[]{0, 0});
        // compression method: STORED
        baos.write(new byte[]{0, 0});
        // last mod file time
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0});
        // CRC-32
        byte[] crcBytes = new byte[4];
        long crcVal = crc.getValue();
        for (int i = 0; i < 4; i++) {
            crcBytes[i] = (byte) ((crcVal >> (i * 8)) & 0xFF);
        }
        baos.write(crcBytes);
        // compressed size
        baos.write(new byte[]{(byte) content.length, 0, 0, 0});
        // uncompressed size
        baos.write(new byte[]{(byte) content.length, 0, 0, 0});
        // file name length
        byte[] nameBytes = name.getBytes("UTF-8");
        baos.write(new byte[]{(byte) nameBytes.length, 0});
        // extra field length
        baos.write(new byte[]{0, 0});
        // file name
        baos.write(nameBytes);
        // file data
        baos.write(content);
        return baos.toByteArray();
    }

    private byte[] createDeflatedEntry(String name, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(content);
        deflater.finish();
        byte[] compressed = new byte[1024];
        int compressedLen = deflater.deflate(compressed);
        byte[] compressedData = new byte[compressedLen];
        System.arraycopy(compressed, 0, compressedData, 0, compressedLen);

        CRC32 crc = new CRC32();
        crc.update(content);
        
        // LFH signature
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        // version needed to extract (2.0)
        baos.write(new byte[]{20, 0});
        // general purpose bit flag: bit 3 (data descriptor) + bit 11 (UTF-8)
        baos.write(new byte[]{8, 0});
        // compression method: DEFLATED
        baos.write(new byte[]{8, 0});
        // last mod file time
        baos.write(new byte[]{0, 0});
        baos.write(new byte[]{0, 0});
        // CRC-32 (0 for data descriptor)
        baos.write(new byte[]{0, 0, 0, 0});
        // compressed size (0 for data descriptor)
        baos.write(new byte[]{0, 0, 0, 0});
        // uncompressed size (0 for data descriptor)
        baos.write(new byte[]{0, 0, 0, 0});
        // file name length
        byte[] nameBytes = name.getBytes("UTF-8");
        baos.write(new byte[]{(byte) nameBytes.length, 0});
        // extra field length
        baos.write(new byte[]{0, 0});
        // file name
        baos.write(nameBytes);
        // compressed data
        baos.write(compressedData);
        // data descriptor: CRC, compressed size, uncompressed size
        byte[] crcBytes = new byte[4];
        long crcVal = crc.getValue();
        for (int i = 0; i < 4; i++) {
            crcBytes[i] = (byte) ((crcVal >> (i * 8)) & 0xFF);
        }
        baos.write(crcBytes);
        byte[] sizeBytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            sizeBytes[i] = (byte) ((content.length >> (i * 8)) & 0xFF);
        }
        baos.write(sizeBytes);
        baos.write(sizeBytes); // compressed size = uncompressed for simplicity
        
        return baos.toByteArray();
    }
}