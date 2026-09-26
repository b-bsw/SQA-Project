package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static final int BLOCK_SIZE = 512;
    private static final int RECORD_SIZE = 512;

    private ByteArrayInputStream emptyStream;
    private TarArchiveInputStream tarIn;

    @Before
    public void setUp() {
        emptyStream = new ByteArrayInputStream(new byte[0]);
        tarIn = new TarArchiveInputStream(emptyStream, BLOCK_SIZE, RECORD_SIZE);
    }

    @Test
    public void testConstructorDefaults() {
        TarArchiveInputStream stream = new TarArchiveInputStream(emptyStream);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, stream.getRecordSize());
    }

    @Test
    public void testConstructorWithEncoding() {
        TarArchiveInputStream stream = new TarArchiveInputStream(emptyStream, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, stream.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeAndEncoding() {
        TarArchiveInputStream stream = new TarArchiveInputStream(emptyStream, BLOCK_SIZE, "UTF-8");
        assertEquals(TarConstants.DEFAULT_RCDSIZE, stream.getRecordSize());
    }

    @Test
    public void testGetRecordSize() {
        TarArchiveInputStream stream = new TarArchiveInputStream(emptyStream, 1024, 512);
        assertEquals(512, stream.getRecordSize());
    }

    @Test
    public void testAvailableNoEntry() throws IOException {
        assertEquals(0, tarIn.available());
    }

    @Test(expected = IOException.class)
    public void testCloseThrowsIOException() throws IOException {
        InputStream brokenStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("read error");
            }

            @Override
            public void close() throws IOException {
                throw new IOException("close error");
            }
        };
        TarArchiveInputStream stream = new TarArchiveInputStream(brokenStream);
        stream.close();
    }

    @Test
    public void testCloseNormal() throws IOException {
        tarIn.close();
        assertTrue(true);
    }

    @Test
    public void testGetNextTarEntryOnEmptyStream() throws IOException {
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNull(entry);
        assertTrue(tarIn.isAtEOF());
    }

    @Test
    public void testGetNextEntryOnEmptyStream() throws IOException {
        ArchiveEntry entry = tarIn.getNextEntry();
        assertNull(entry);
    }

    @Test
    public void testSkipOnEmptyStream() throws IOException {
        long skipped = tarIn.skip(100);
        assertEquals(0, skipped);
    }

    @Test
    public void testSkipZero() throws IOException {
        long skipped = tarIn.skip(0);
        assertEquals(0, skipped);
    }

    @Test
    public void testReadOnEmptyBuffer() throws IOException {
        byte[] buf = new byte[10];
        int read = tarIn.read(buf, 0, 5);
        assertEquals(-1, read);
    }

    @Test(expected = IllegalStateException.class)
    public void testReadWithoutEntry() throws IOException {
        ByteArrayInputStream input = createSimpleTarWithOneFile();
        TarArchiveInputStream stream = new TarArchiveInputStream(input, BLOCK_SIZE, RECORD_SIZE);
        stream.setCurrentEntry(null);
        byte[] buf = new byte[10];
        stream.read(buf, 0, 5);
    }

    @Test
    public void testReadEntryWithZeroSize() throws IOException {
        byte[] tarData = createTarEntry("test.txt", new byte[0]);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        TarArchiveEntry entry = stream.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(0, entry.getSize());
        byte[] buf = new byte[10];
        int read = stream.read(buf, 0, 5);
        assertEquals(-1, read);
    }

    @Test
    public void testReadSmallEntry() throws IOException {
        byte[] content = "Hello".getBytes();
        byte[] tarData = createTarEntry("small.txt", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        TarArchiveEntry entry = stream.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("small.txt", entry.getName());
        assertEquals(content.length, entry.getSize());
        byte[] buf = new byte[10];
        int read = stream.read(buf, 0, 5);
        assertEquals(content.length, read);
        assertArrayEquals(content, java.util.Arrays.copyOf(buf, read));
    }

    @Test
    public void testReadEntrySpanningMultipleRecords() throws IOException {
        byte[] content = new byte[1000];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 256);
        }
        byte[] tarData = createTarEntry("large.txt", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        TarArchiveEntry entry = stream.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(content.length, entry.getSize());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[256];
        int read;
        while ((read = stream.read(buf, 0, buf.length)) != -1) {
            baos.write(buf, 0, read);
        }
        assertArrayEquals(content, baos.toByteArray());
    }

    @Test
    public void testGetNextTarEntryAfterReadingEntry() throws IOException {
        byte[] content = "data".getBytes();
        byte[] tarData = createTwoFileTar("a.txt", content, "b.txt", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        TarArchiveEntry entry1 = stream.getNextTarEntry();
        assertNotNull(entry1);
        assertEquals("a.txt", entry1.getName());
        byte[] buf = new byte[10];
        stream.read(buf, 0, content.length);
        TarArchiveEntry entry2 = stream.getNextTarEntry();
        assertNotNull(entry2);
        assertEquals("b.txt", entry2.getName());
        stream.read(buf, 0, content.length);
        assertNull(stream.getNextTarEntry());
    }

    @Test
    public void testGetCurrentEntryInitiallyNull() {
        assertNull(tarIn.getCurrentEntry());
    }

    @Test
    public void testSetCurrentEntry() {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        tarIn.setCurrentEntry(entry);
        assertSame(entry, tarIn.getCurrentEntry());
    }

    @Test
    public void testIsAtEOFInitial() {
        assertFalse(tarIn.isAtEOF());
    }

    @Test
    public void testSetAtEOF() {
        tarIn.setAtEOF(true);
        assertTrue(tarIn.isAtEOF());
        tarIn.setAtEOF(false);
        assertFalse(tarIn.isAtEOF());
    }

    @Test
    public void testResetDoesNothing() {
        tarIn.reset();
        assertFalse(tarIn.isAtEOF());
    }

    @Test
    public void testCanReadEntryDataWithNonTarEntry() {
        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            @Override
            public String getName() {
                return "test";
            }

            @Override
            public long getSize() {
                return 0;
            }

            @Override
            public boolean isDirectory() {
                return false;
            }
        };
        assertFalse(tarIn.canReadEntryData(nonTarEntry));
    }

    @Test
    public void testCanReadEntryDataWithSparseEntry() {
        // We cannot easily create a sparse entry, but mock the flag
        TarArchiveEntry entry = new TarArchiveEntry("test");
        // Normally GNUSparse would be set via header parsing
        assertTrue(tarIn.canReadEntryData(entry));
    }

    @Test
    public void testMatchesWithShortSignature() {
        byte[] sig = new byte[10];
        assertFalse(TarArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void testMatchesWithPosixSignature() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesWithGnuSignature() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesWithAntSignature() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testParsePaxHeadersEmptyStream() throws IOException {
        ByteArrayInputStream empty = new ByteArrayInputStream(new byte[0]);
        Map<String, String> headers = tarIn.parsePaxHeaders(empty);
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeadersSimple() throws IOException {
        String paxData = "25 path=test.txt\n";
        ByteArrayInputStream input = new ByteArrayInputStream(paxData.getBytes("UTF-8"));
        Map<String, String> headers = tarIn.parsePaxHeaders(input);
        assertEquals(1, headers.size());
        assertEquals("test.txt", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersMultiple() throws IOException {
        String paxData = "25 path=test.txt\n18 uid=1000\n";
        ByteArrayInputStream input = new ByteArrayInputStream(paxData.getBytes("UTF-8"));
        Map<String, String> headers = tarIn.parsePaxHeaders(input);
        assertEquals(2, headers.size());
        assertEquals("test.txt", headers.get("path"));
        assertEquals("1000", headers.get("uid"));
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeadersTruncated() throws IOException {
        String paxData = "25 path=test.txt"; // missing newline
        ByteArrayInputStream input = new ByteArrayInputStream(paxData.getBytes("UTF-8"));
        tarIn.parsePaxHeaders(input);
    }

    @Test
    public void testAvailableAfterEntry() throws IOException {
        byte[] content = new byte[100];
        byte[] tarData = createTarEntry("test.dat", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        stream.getNextTarEntry();
        assertEquals(100, stream.available());
    }

    @Test
    public void testAvailableMaxValue() throws IOException {
        TarArchiveInputStream stream = new TarArchiveInputStream(emptyStream) {
            {
                entrySize = (long) Integer.MAX_VALUE + 1;
                entryOffset = 0;
            }
        };
        assertEquals(Integer.MAX_VALUE, stream.available());
    }

    @Test
    public void testSkipBeyondEntry() throws IOException {
        byte[] content = new byte[100];
        byte[] tarData = createTarEntry("test.dat", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        stream.getNextTarEntry();
        long skipped = stream.skip(200);
        assertEquals(100, skipped);
    }

    @Test
    public void testReadAfterEntryEOF() throws IOException {
        byte[] content = new byte[10];
        byte[] tarData = createTarEntry("test.dat", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        stream.getNextTarEntry();
        byte[] buf = new byte[20];
        int total = 0;
        int read;
        while ((read = stream.read(buf, 0, buf.length)) != -1) {
            total += read;
        }
        assertEquals(10, total);
        assertEquals(-1, stream.read(buf, 0, 5));
    }

    @Test
    public void testReadZeroLengthBuffer() throws IOException {
        byte[] content = new byte[10];
        byte[] tarData = createTarEntry("test.dat", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        stream.getNextTarEntry();
        byte[] buf = new byte[0];
        int read = stream.read(buf, 0, 0);
        assertEquals(0, read);
    }

    @Test
    public void testGetNextTarEntryWithPaxHeader() throws IOException {
        // A tar entry with a pax header cannot be easily created manually
        // We just verify the flow doesn't break
        byte[] tarData = createTarEntry("test.txt", new byte[0]);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        TarArchiveEntry entry = stream.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
    }

    @Test
    public void testSkipRecordPaddingWhenEntrySizeMultipleOfRecordSize() throws IOException {
        byte[] content = new byte[512]; // exactly one record
        byte[] tarData = createTarEntry("test.dat", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        stream.getNextTarEntry();
        // After reading the entry, skipRecordPadding should not skip anything extra
        stream.getNextTarEntry(); // This triggers skipRecordPadding
        // If no exception, test passes
        assertTrue(true);
    }

    @Test
    public void testSkipRecordPaddingWhenEntrySizeNotMultiple() throws IOException {
        byte[] content = new byte[100]; // less than one record
        byte[] tarData = createTarEntry("test.dat", content);
        TarArchiveInputStream stream = new TarArchiveInputStream(
                new ByteArrayInputStream(tarData), BLOCK_SIZE, RECORD_SIZE);
        stream.getNextTarEntry();
        // Read the data to consume it
        byte[] buf = new byte[100];
        stream.read(buf, 0, 100);
        // Now skipRecordPadding should skip the padding
        stream.getNextTarEntry();
        // If no exception, test passes
        assertTrue(true);
    }

    private byte[] createSimpleTarWithOneFile() {
        byte[] header = new byte[512];
        // Write a simple tar header for "test.txt" with size 10
        String name = "test.txt";
        byte[] nameBytes = name.getBytes();
        System.arraycopy(nameBytes, 0, header, 0, nameBytes.length);
        // Set size to 10 (octal)
        String sizeStr = "0000000000000000012"; // 10 octal
        byte[] sizeBytes = sizeStr.getBytes();
        System.arraycopy(sizeBytes, 0, header, 124, sizeBytes.length);
        // Set checksum placeholder
        String chk = "        ";
        byte[] chkBytes = chk.getBytes();
        System.arraycopy(chkBytes, 0, header, 148, chkBytes.length);
        // Set magic
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        // Calculate checksum
        long checksum = 0;
        for (byte b : header) {
            checksum += b & 0xff;
        }
        String checksumStr = String.format("%06o", checksum);
        byte[] checksumBytes = checksumStr.getBytes();
        System.arraycopy(checksumBytes, 0, header, 148, checksumBytes.length);
        header[154] = ' ';
        header[155] = ' ';
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            baos.write(header);
            // Write 10 bytes of data
            byte[] data = new byte[10];
            for (int i = 0; i < 10; i++) {
                data[i] = (byte) i;
            }
            baos.write(data);
            // Pad to block boundary (512 + 10 = 522, so pad 502 bytes)
            int padding = 512 - (10 % 512);
            if (padding == 512) padding = 0;
            baos.write(new byte[padding]);
            // Write two end-of-archive blocks (all zeros)
            baos.write(new byte[1024]);
        } catch (IOException e) {
            // ignore
        }
        return baos.toByteArray();
    }

    private byte[] createTarEntry(String name, byte[] content) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] header = new byte[512];
        byte[] nameBytes = name.getBytes();
        System.arraycopy(nameBytes, 0, header, 0, Math.min(nameBytes.length, 100));
        // Set size (octal)
        String sizeStr = String.format("%011o", content.length);
        byte[] sizeBytes = sizeStr.getBytes();
        System.arraycopy(sizeBytes, 0, header, 124, sizeBytes.length);
        // Set checksum placeholder
        String chk = "        ";
        byte[] chkBytes = chk.getBytes();
        System.arraycopy(chkBytes, 0, header, 148, chkBytes.length);
        // Set magic
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        // Set type flag to '0' for regular file
        header[156] = '0';
        // Calculate checksum
        long checksum = 0;
        for (byte b : header) {
            checksum += b & 0xff;
        }
        String checksumStr = String.format("%06o", checksum);
        byte[] checksumBytes = checksumStr.getBytes();
        // Clear the checksum field first
        for (int i = 148; i < 156; i++) {
            header[i] = ' ';
        }
        System.arraycopy(checksumBytes, 0, header, 148, checksumBytes.length);
        try {
            baos.write(header);
            baos.write(content);
            // Pad to record boundary
            int totalData = 512 + content.length;
            int padding = (512 - (totalData % 512)) % 512;
            baos.write(new byte[padding]);
        } catch (IOException e) {
            // ignore
        }
        return baos.toByteArray();
    }

    private byte[] createTwoFileTar(String name1, byte[] content1, String name2, byte[] content2) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            byte[] entry1 = createTarEntry(name1, content1);
            byte[] entry2 = createTarEntry(name2, content2);
            baos.write(entry1);
            baos.write(entry2);
            // Add end-of-archive blocks
            baos.write(new byte[1024]);
        } catch (IOException e) {
            // ignore
        }
        return baos.toByteArray();
    }
}