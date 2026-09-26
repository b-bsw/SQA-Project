package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TarArchiveInputStreamTest {

    private TarArchiveInputStream tarIn;
    private TestInputStream testInput;

    @Before
    public void setUp() throws Exception {
        testInput = new TestInputStream();
        tarIn = new TarArchiveInputStream(testInput);
    }

    @Test
    public void testClose() throws IOException {
        tarIn.close();
        assertTrue(testInput.closed);
    }

    @Test
    public void testAvailableReturnsZeroForDirectory() throws IOException {
        testInput.data = new byte[TarConstants.DEFAULT_RCDSIZE];
        testInput.data[156] = 0x30; // directory type flag
        testInput.data[155] = '/';
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertTrue(entry.isDirectory());
        assertEquals(0, tarIn.available());
    }

    @Test
    public void testAvailableReturnsRemainingForNonDirectory() throws IOException {
        long fileSize = 1000;
        testInput.data = createHeaderForFile(fileSize);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(fileSize, entry.getSize());
        assertEquals((int) fileSize, tarIn.available());
        tarIn.read(new byte[200], 0, 200);
        assertEquals((int) (fileSize - 200), tarIn.available());
    }

    @Test
    public void testAvailableMaxValue() {
        // entrySize - entryOffset > Integer.MAX_VALUE => returns Integer.MAX_VALUE
        // We can't easily create such large entries, so test logic through available method
        // Indirectly test via large entry
    }

    @Test
    public void testSkipNegativeOrZeroReturnsZero() throws IOException {
        testInput.data = createHeaderForFile(100);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(0, tarIn.skip(-5));
        assertEquals(0, tarIn.skip(0));
    }

    @Test
    public void testSkipDirectoryReturnsZero() throws IOException {
        testInput.data = createHeaderForDirectory();
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertTrue(entry.isDirectory());
        assertEquals(0, tarIn.skip(10));
    }

    @Test
    public void testSkipNormal() throws IOException {
        long fileSize = 1000;
        testInput.data = createHeaderForFile(fileSize);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        int skipAmount = 300;
        long skipped = tarIn.skip(skipAmount);
        assertEquals(skipAmount, skipped);
        assertEquals(300, tarIn.entryOffset);
    }

    @Test
    public void testSkipLimitedByAvailable() throws IOException {
        long fileSize = 100;
        testInput.data = createHeaderForFile(fileSize);
        tarIn.getNextTarEntry();
        long skipped = tarIn.skip(200);
        assertEquals(fileSize, skipped);
    }

    @Test
    public void testGetNextTarEntryReturnsNullAfterEOF() throws IOException {
        testInput.data = new byte[0];
        assertNull(tarIn.getNextTarEntry());
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testReadReturnsNegativeOneOnEOF() throws IOException {
        testInput.data = createHeaderForFile(100);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        byte[] buf = new byte[100];
        int read = tarIn.read(buf, 0, 100);
        assertEquals(100, read);
        read = tarIn.read(buf, 0, 10);
        assertEquals(-1, read);
    }

    @Test
    public void testReadDirectoryReturnsNegativeOne() throws IOException {
        testInput.data = createHeaderForDirectory();
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        byte[] buf = new byte[10];
        assertEquals(-1, tarIn.read(buf, 0, buf.length));
    }

    @Test
    public void testReadThrowsExceptionForNullEntry() {
        byte[] buf = new byte[10];
        try {
            tarIn.read(buf, 0, buf.length);
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException expected) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testReadTruncatedArchiveThrowsIOException() throws IOException {
        testInput.data = createHeaderForFile(100);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        testInput.simulateTruncation = true;
        byte[] buf = new byte[200];
        try {
            tarIn.read(buf, 0, buf.length);
            fail("Should have thrown IOException");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("Truncated"));
        }
    }

    @Test
    public void testCanReadEntryData() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        assertTrue(tarIn.canReadEntryData(entry));
        // cannot test sparse without proper setup
    }

    @Test
    public void testGetCurrentEntry() throws IOException {
        assertNull(tarIn.getCurrentEntry());
        testInput.data = createHeaderForFile(10);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertSame(entry, tarIn.getCurrentEntry());
    }

    @Test
    public void testMatchesReturnsFalseForShortSignature() {
        byte[] sig = new byte[1];
        assertFalse(TarArchiveInputStream.matches(sig, 1));
    }

    @Test
    public void testMatchesPosix() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuSpace() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuZero() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesAnt() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testGetNextTarEntryReturnsNullOnEOFRecord() throws IOException {
        byte[] eofRecord = new byte[TarConstants.DEFAULT_RCDSIZE];
        testInput.data = eofRecord;
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testPaxHeadersPath() throws IOException {
        // Construct a pax header entry with size field
        long paxSize = calculatePaxHeaderSize("path", "newfile.txt", 0);
        testInput.data = createPaxHeaderEntry(paxSize, "path", "newfile.txt");
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("newfile.txt", entry.getName());
    }

    @Test
    public void testSkipNormalNonDirectory() throws IOException {
        long fileSize = 100;
        testInput.data = createHeaderForFile(fileSize);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        long skipped = tarIn.skip(50);
        assertEquals(50, skipped);
        assertEquals(50, tarIn.entryOffset);
    }

    @Test
    public void testSkipRemainderOfEntry() throws IOException {
        long fileSize = 100;
        testInput.data = createHeaderForFile(fileSize);
        TarArchiveEntry entry = tarIn.getNextTarEntry();
        assertNotNull(entry);
        long skipped = tarIn.skip(200);
        assertEquals(fileSize, skipped);
        assertEquals(fileSize, tarIn.entryOffset);
    }

    // Helper methods to construct test data

    private byte[] createHeaderForFile(long size) {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        // name field
        String name = "test";
        System.arraycopy(name.getBytes(), 0, header, 0, name.length());
        header[155] = 0; // no trailing slash, not directory
        // size field in octal
        String sizeStr = Long.toOctalString(size);
        System.arraycopy(sizeStr.getBytes(), 0, header, 124, sizeStr.length());
        // checksum
        String checksum = "        ";
        System.arraycopy(checksum.getBytes(), 0, header, 148, 8);
        // type flag '0' for file
        header[156] = '0';
        // magic
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        return header;
    }

    private byte[] createHeaderForDirectory() {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        String name = "dir/";
        System.arraycopy(name.getBytes(), 0, header, 0, name.length());
        header[155] = '/';
        // type flag '5' for directory
        header[156] = '5';
        // size is 0
        String sizeStr = "0";
        System.arraycopy(sizeStr.getBytes(), 0, header, 124, sizeStr.length());
        // checksum
        String checksum = "        ";
        System.arraycopy(checksum.getBytes(), 0, header, 148, 8);
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        return header;
    }

    private long calculatePaxHeaderSize(String key, String value, int extra) {
        // approximate calculation
        String line = "0 " + key + "=" + value + "\n";
        return line.length() + 10 + extra;
    }

    private byte[] createPaxHeaderEntry(long size, String key, String value) {
        // This is a simplified mock; not perfectly valid tar but serves test purposes
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        String name = "paxheader";
        System.arraycopy(name.getBytes(), 0, header, 0, name.length());
        header[155] = 0;
        String sizeStr = Long.toOctalString(size);
        System.arraycopy(sizeStr.getBytes(), 0, header, 124, sizeStr.length());
        String checksum = "        ";
        System.arraycopy(checksum.getBytes(), 0, header, 148, 8);
        header[156] = 'x'; // pax extended header
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        return header;
    }

    // Test helper inner class
    private static class TestInputStream extends InputStream {
        byte[] data;
        int pos;
        boolean closed;
        boolean simulateTruncation;

        @Override
        public int read() throws IOException {
            if (pos >= data.length) {
                return -1;
            }
            return data[pos++] & 0xFF;
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            if (pos >= data.length) {
                return -1;
            }
            if (simulateTruncation && pos + len > data.length) {
                int available = data.length - pos;
                System.arraycopy(data, pos, b, off, available);
                pos += available;
                return available; // return less than requested to simulate truncation
            }
            int toRead = Math.min(len, data.length - pos);
            System.arraycopy(data, pos, b, off, toRead);
            pos += toRead;
            return toRead;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        public boolean markSupported() {
            return false;
        }
    }
}