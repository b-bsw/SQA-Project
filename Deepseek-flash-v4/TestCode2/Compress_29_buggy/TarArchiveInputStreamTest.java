package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TarArchiveInputStreamTest {

    private static final int BLOCK_SIZE = 512;
    private static final int RECORD_SIZE = 512;

    private TarArchiveInputStream createStream(byte[] data) {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        return new TarArchiveInputStream(bais, BLOCK_SIZE, RECORD_SIZE);
    }

    @Test
    public void testConstructor() {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        assertNotNull(stream);
        assertEquals(RECORD_SIZE, stream.getRecordSize());
    }

    @Test
    public void testClose() throws IOException {
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        stream.close();
    }

    @Test
    public void testAvailableInitial() throws IOException {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        assertEquals(0, stream.available());
    }

    @Test
    public void testSkipNegative() throws IOException {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        assertEquals(0, stream.skip(-1));
    }

    @Test
    public void testSkipZero() throws IOException {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        assertEquals(0, stream.skip(0));
    }

    @Test
    public void testMarkSupported() {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        assertFalse(stream.markSupported());
    }

    @Test
    public void testMark() {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        stream.mark(100);
    }

    @Test
    public void testReset() {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        stream.reset();
    }

    @Test
    public void testGetNextTarEntryNoEntries() throws IOException {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        assertNull(stream.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntryEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream stream = new TarArchiveInputStream(bais, BLOCK_SIZE, RECORD_SIZE);
        assertNull(stream.getNextTarEntry());
    }

    @Test
    public void testGetNextEntryReturnsNullOnEmpty() throws IOException {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        assertNull(stream.getNextEntry());
    }

    @Test
    public void testCanReadEntryDataWithNonTarEntry() {
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        assertFalse(stream.canReadEntryData(null));
    }

    @Test
    public void testMatchesShortSignature() {
        byte[] sig = new byte[10];
        assertFalse(TarArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void testMatchesEmptySignature() {
        byte[] sig = new byte[0];
        assertFalse(TarArchiveInputStream.matches(sig, 0));
    }

    @Test
    public void testMatchesPosixSignature() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, 512));
    }

    @Test
    public void testMatchesGnuSignature() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, 512));
    }

    @Test
    public void testMatchesAntSignature() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, 512));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] sig = new byte[512];
        assertFalse(TarArchiveInputStream.matches(sig, 512));
    }

    @Test
    public void testIsEOFRecordNull() {
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        assertTrue(stream.isEOFRecord(null));
    }

    @Test
    public void testIsEOFRecordNonZero() {
        byte[] record = new byte[RECORD_SIZE];
        record[0] = 1;
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        assertFalse(stream.isEOFRecord(record));
    }

    @Test
    public void testIsEOFRecordAllZero() {
        byte[] record = new byte[RECORD_SIZE];
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        assertTrue(stream.isEOFRecord(record));
    }

    @Test(expected = IOException.class)
    public void testReadWithNoEntry() throws IOException {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        byte[] buf = new byte[10];
        stream.read(buf, 0, 10);
    }

    @Test
    public void testReadWithNegativeOffset() throws IOException {
        byte[] data = new byte[BLOCK_SIZE];
        TarArchiveInputStream stream = createStream(data);
        try {
            byte[] buf = new byte[10];
            stream.read(buf, -1, 5);
            fail("Should have thrown exception");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testGetCurrentEntryInitialNull() {
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        assertNull(stream.getCurrentEntry());
    }

    @Test
    public void testSetCurrentEntry() {
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        stream.setCurrentEntry(entry);
        assertSame(entry, stream.getCurrentEntry());
    }

    @Test
    public void testIsAtEOFInitiallyFalse() {
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        assertFalse(stream.isAtEOF());
    }

    @Test
    public void testSetAtEOF() {
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        stream.setAtEOF(true);
        assertTrue(stream.isAtEOF());
    }

    @Test
    public void testParsePaxHeadersEmpty() throws IOException {
        byte[] data = new byte[0];
        InputStream is = new ByteArrayInputStream(data);
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        Map<String, String> headers = stream.parsePaxHeaders(is);
        assertTrue(headers.isEmpty());
    }

    @Test
    public void testParsePaxHeadersSimple() throws IOException {
        String header = "4 path=test.txt\n";
        InputStream is = new ByteArrayInputStream(header.getBytes("UTF-8"));
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        Map<String, String> headers = stream.parsePaxHeaders(is);
        assertEquals(1, headers.size());
        assertEquals("test.txt", headers.get("path"));
    }

    @Test
    public void testParsePaxHeadersMultiple() throws IOException {
        String header = "4 path=a.txt\n4 size=123\n";
        InputStream is = new ByteArrayInputStream(header.getBytes("UTF-8"));
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        Map<String, String> headers = stream.parsePaxHeaders(is);
        assertEquals(2, headers.size());
        assertEquals("a.txt", headers.get("path"));
        assertEquals("123", headers.get("size"));
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeadersTruncated() throws IOException {
        String header = "10 path=a.txt";
        InputStream is = new ByteArrayInputStream(header.getBytes("UTF-8"));
        TarArchiveInputStream stream = createStream(new byte[BLOCK_SIZE]);
        stream.parsePaxHeaders(is);
    }
}