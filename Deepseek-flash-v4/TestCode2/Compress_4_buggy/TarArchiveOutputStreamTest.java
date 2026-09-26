package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream bos;
    private TarArchiveOutputStream tos;

    private TarArchiveOutputStream createStream() {
        bos = new ByteArrayOutputStream();
        return new TarArchiveOutputStream(bos);
    }

    private TarArchiveOutputStream createStream(int blockSize, int recordSize) {
        bos = new ByteArrayOutputStream();
        return new TarArchiveOutputStream(bos, blockSize, recordSize);
    }

    @Test
    public void testConstructorDefault() {
        tos = createStream();
        assertNotNull(tos);
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test
    public void testConstructorBlockSize() {
        tos = createStream(1024, 512);
        assertNotNull(tos);
        assertEquals(512, tos.getRecordSize());
    }

    @Test
    public void testConstructorBlockAndRecordSize() {
        tos = createStream(2048, 512);
        assertNotNull(tos);
        assertEquals(512, tos.getRecordSize());
    }

    @Test
    public void testSetLongFileModeDefault() {
        tos = createStream();
        // default is LONGFILE_ERROR, no exception expected for short names
        TarArchiveEntry entry = new TarArchiveEntry("shortname.txt");
        try {
            tos.putArchiveEntry(entry);
            tos.closeArchiveEntry();
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryNullName() throws IOException {
        tos = createStream();
        TarArchiveEntry entry = new TarArchiveEntry((String) null);
        try {
            tos.putArchiveEntry(entry);
            fail("Expected NullPointerException or similar");
        } catch (NullPointerException e) {
            // expected for null name
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryLongNameErrorMode() throws IOException {
        tos = createStream();
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("a");
        }
        String longName = sb.toString();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        try {
            tos.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name in ERROR mode");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too long"));
        }
    }

    @Test
    public void testPutArchiveEntryLongNameTruncateMode() throws IOException {
        tos = createStream();
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("b");
        }
        String longName = sb.toString();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        // Should not throw, truncation is allowed
        try {
            tos.putArchiveEntry(entry);
            // For truncation mode, the entry is written as is (name truncated later)
            tos.closeArchiveEntry();
        } catch (Exception e) {
            fail("Unexpected exception in truncate mode: " + e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryLongNameGnuMode() throws IOException {
        tos = createStream();
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append("c");
        }
        String longName = sb.toString();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        try {
            tos.putArchiveEntry(entry);
            tos.closeArchiveEntry();
        } catch (Exception e) {
            fail("Unexpected exception in GNU mode: " + e.getMessage());
        }
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsSize() throws IOException {
        tos = createStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        // Set size to 10 bytes
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        byte[] data = new byte[20];
        tos.write(data, 0, 20);
    }

    @Test
    public void testWriteExactSize() throws IOException {
        tos = createStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tos.putArchiveEntry(entry);
        byte[] data = "1234567890".getBytes();
        tos.write(data, 0, 10);
        tos.closeArchiveEntry();
        // No exception expected
        assertTrue(bos.size() > 0);
    }

    @Test
    public void testWriteLessThanSize() throws IOException {
        tos = createStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(20);
        tos.putArchiveEntry(entry);
        byte[] data = "1234567890".getBytes();
        tos.write(data, 0, 10);
        // close should throw because bytes written < expected size
        try {
            tos.closeArchiveEntry();
            fail("Expected IOException for incomplete write");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("closed at"));
        }
    }

    @Test
    public void testCloseArchiveEntryWithAssembledData() throws IOException {
        tos = createStream();
        // Use record size 512, block size 1024
        bos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(bos, 1024, 512);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(600); // More than one record
        tos.putArchiveEntry(entry);
        byte[] data = new byte[600];
        // Write in small chunks to trigger assembly buffer
        int written = 0;
        while (written < 600) {
            int chunkSize = Math.min(100, 600 - written);
            tos.write(data, written, chunkSize);
            written += chunkSize;
        }
        // closeArchiveEntry should succeed
        tos.closeArchiveEntry();
        // Also finish and close
        tos.finish();
        tos.close();
        assertTrue(bos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws IOException {
        tos = createStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
        // Finish without closing the entry
        tos.finish();
    }

    @Test
    public void testFinishWithoutUnclosedEntry() throws IOException {
        tos = createStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        // Should succeed
        tos.finish();
        tos.close();
        assertTrue(bos.size() > 0);
    }

    @Test
    public void testMultipleEntries() throws IOException {
        tos = createStream();
        // Entry 1
        TarArchiveEntry entry1 = new TarArchiveEntry("file1.txt");
        entry1.setSize(5);
        tos.putArchiveEntry(entry1);
        byte[] data1 = "hello".getBytes();
        tos.write(data1, 0, 5);
        tos.closeArchiveEntry();

        // Entry 2
        TarArchiveEntry entry2 = new TarArchiveEntry("file2.txt");
        entry2.setSize(3);
        tos.putArchiveEntry(entry2);
        byte[] data2 = "abc".getBytes();
        tos.write(data2, 0, 3);
        tos.closeArchiveEntry();

        tos.finish();
        tos.close();
        assertTrue(bos.size() > 0);
    }

    @Test
    public void testDirectoryEntry() throws IOException {
        tos = createStream();
        TarArchiveEntry dirEntry = new TarArchiveEntry("mydir/");
        tos.putArchiveEntry(dirEntry);
        // Directory should have size 0
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        assertTrue(bos.size() > 0);
    }

    @Test
    public void testFlush() throws IOException {
        tos = createStream();
        // flush should not throw
        tos.flush();
        // Also after writing some data
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        byte[] data = "hello".getBytes();
        tos.write(data, 0, 5);
        tos.flush();
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
    }

    @Test
    public void testClose() throws IOException {
        tos = createStream();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.close();
        // Verify that second close does not throw
        try {
            tos.close();
        } catch (Exception e) {
            fail("Second close should not throw: " + e.getMessage());
        }
    }

    @Test
    public void testGetRecordSize() {
        tos = createStream();
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntryInvalidType() throws IOException {
        tos = createStream();
        // Pass an ArchiveEntry that is not TarArchiveEntry
        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            public String getName() { return "test"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
        };
        tos.putArchiveEntry(nonTarEntry);
    }

    @Test
    public void testWriteBufferBoundary() throws IOException {
        bos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(bos, 1024, 512);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(1024); // Exactly 2 records
        tos.putArchiveEntry(entry);
        byte[] data = new byte[1024];
        // Write in two 512-byte blocks
        tos.write(data, 0, 512);
        tos.write(data, 512, 512);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        assertTrue(bos.size() > 0);
    }

    @Test
    public void testWriteSmallChunks() throws IOException {
        bos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(bos, 1024, 512);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(1024);
        tos.putArchiveEntry(entry);
        byte[] data = new byte[1024];
        // Write in small chunks (e.g., 100 bytes each) to exercise assembly buffer
        int written = 0;
        while (written < 1024) {
            int chunkSize = Math.min(100, 1024 - written);
            tos.write(data, written, chunkSize);
            written += chunkSize;
        }
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        assertTrue(bos.size() > 0);
    }

    @Test
    public void testAssemBufExactFill() throws IOException {
        bos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(bos, 1024, 512);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(512);
        tos.putArchiveEntry(entry);
        // Write bytes that exactly fill the assembly buffer (record size = 512)
        byte[] data = new byte[512];
        tos.write(data, 0, 512);
        tos.closeArchiveEntry();
        tos.finish();
        tos.close();
        assertTrue(bos.size() > 0);
    }

    // Helper: An ArchiveEntry that is not a TarArchiveEntry, for ClassCastException test
    private static class NonTarArchiveEntry implements ArchiveEntry {
        private final String name;
        NonTarArchiveEntry(String name) {
            this.name = name;
        }
        public String getName() { return name; }
        public long getSize() { return 0; }
        public boolean isDirectory() { return false; }
    }
}