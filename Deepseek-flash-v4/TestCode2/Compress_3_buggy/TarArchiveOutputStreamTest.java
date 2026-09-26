package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Arrays;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class TarArchiveOutputStreamTest {

    private TestOutputStream out;
    private TarArchiveOutputStream tar;

    @Before
    public void setUp() {
        out = new TestOutputStream();
        tar = new TarArchiveOutputStream(out, 512, 512);
    }

    @After
    public void tearDown() throws Exception {
        if (tar != null) {
            tar.close();
        }
    }

    @Test
    public void testGetRecordSize() {
        assertEquals(512, tar.getRecordSize());
    }

    @Test
    public void testDefaultConstructor() throws Exception {
        TestOutputStream bout = new TestOutputStream();
        TarArchiveOutputStream t = new TarArchiveOutputStream(bout);
        assertTrue(t.getRecordSize() > 0);
        t.close();
    }

    @Test
    public void testCloseWritesEOFRecordsAndClosesOut() throws Exception {
        tar.close();
        assertEquals(1024, out.toByteArray().length);
        assertTrue(out.closed);
    }

    @Test
    public void testCloseIsIdempotent() throws Exception {
        tar.close();
        int len = out.toByteArray().length;
        tar.close();
        assertEquals(len, out.toByteArray().length);
    }

    @Test
    public void testPutEntryAndWriteExactSize() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tar.putArchiveEntry(entry);
        tar.write(new byte[10], 0, 10);
        tar.closeArchiveEntry();
    }

    @Test
    public void testWriteTooMuchThrowsIOException() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tar.putArchiveEntry(entry);

        try {
            tar.write(new byte[11], 0, 11);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testCloseArchiveEntryBeforeFullWriteThrows() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tar.putArchiveEntry(entry);
        tar.write(new byte[5], 0, 5);

        try {
            tar.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testCloseArchiveEntryCompleteWriteWithPartialBuffer() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tar.putArchiveEntry(entry);
        tar.write(new byte[10], 0, 10);
        tar.closeArchiveEntry();
    }

    @Test
    public void testWriteMultipleRecordsAndClose() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(2000);
        tar.putArchiveEntry(entry);

        byte[] data = new byte[2000];
        Arrays.fill(data, (byte) 'a');
        tar.write(data, 0, data.length);
        tar.closeArchiveEntry();
    }

    @Test
    public void testWriteFullAssembledRecord() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(512);
        tar.putArchiveEntry(entry);

        tar.write(new byte[10], 0, 10);
        tar.write(new byte[502], 0, 502);
        tar.closeArchiveEntry();
    }

    @Test
    public void testLongFileNameErrorDefault() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry(createLongName());
        entry.setSize(0);

        try {
            tar.putArchiveEntry(entry);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too long"));
        }
    }

    @Test
    public void testLongFileNameGnuMode() throws Exception {
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName());
        entry.setSize(0);
        tar.putArchiveEntry(entry);
        tar.closeArchiveEntry();
    }

    @Test
    public void testLongFileNameTruncateMode() throws Exception {
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName());
        entry.setSize(0);
        tar.putArchiveEntry(entry);
        tar.closeArchiveEntry();
    }

    @Test
    public void testLongFileNameInvalidModeThrows() throws Exception {
        tar.setLongFileMode(999);
        TarArchiveEntry entry = new TarArchiveEntry(createLongName());
        entry.setSize(0);

        try {
            tar.putArchiveEntry(entry);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too long"));
        }
    }

    @Test
    public void testCreateArchiveEntry() throws Exception {
        File f = File.createTempFile("test", ".txt");
        try {
            ArchiveEntry e = tar.createArchiveEntry(f, "foo.txt");
            assertNotNull(e);
            assertTrue(e instanceof TarArchiveEntry);
            assertEquals("foo.txt", e.getName());
        } finally {
            f.delete();
        }
    }

    private String createLongName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    private static class TestOutputStream extends OutputStream {
        private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        boolean closed;
        boolean flushed;

        @Override
        public void write(int b) throws IOException {
            baos.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            baos.write(b, off, len);
        }

        @Override
        public void close() throws IOException {
            closed = true;
            super.close();
        }

        @Override
        public void flush() throws IOException {
            flushed = true;
            super.flush();
        }

        byte[] toByteArray() {
            return baos.toByteArray();
        }
    }
}