package org.apache.commons.compress.archivers.tar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        tos = new TarArchiveOutputStream(baos);
    }

    @After
    public void tearDown() {
        if (tos != null) {
            try {
                tos.close();
            } catch (IOException e) {
                // ignore
            }
        }
    }

    @Test
    public void testDefaultRecordSize() {
        assertEquals(512, tos.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockAndRecordSize() throws IOException {
        TarArchiveOutputStream custom = new TarArchiveOutputStream(new ByteArrayOutputStream(), 1024, 512);
        assertEquals(512, custom.getRecordSize());
        custom.close();
    }

    @Test
    public void testInitialBytesWritten() {
        assertEquals(0L, tos.getBytesWritten());
    }

    @Test
    public void testWriteAndCloseArchiveEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {'h', 'e', 'l', 'l', 'o'});
        tos.closeArchiveEntry();
        assertEquals(1024L, tos.getBytesWritten());
    }

    @Test
    public void testWriteZeroLengthEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("empty.txt");
        entry.setSize(0);
        tos.putArchiveEntry(entry);
        tos.write(new byte[0], 0, 0);
        tos.closeArchiveEntry();
        tos.finish();
    }

    @Test
    public void testWriteLargeData() throws IOException {
        byte[] data = new byte[2000];
        Arrays.fill(data, (byte) 1);
        TarArchiveEntry entry = new TarArchiveEntry("large.bin");
        entry.setSize(data.length);
        tos.putArchiveEntry(entry);
        tos.write(data);
        tos.closeArchiveEntry();
        long bytes = tos.getBytesWritten();
        assertTrue(bytes >= 2000);
        tos.finish();
    }

    @Test
    public void testWriteWithOffset() throws IOException {
        byte[] data = "0123456789".getBytes("UTF-8");
        TarArchiveEntry entry = new TarArchiveEntry("offset.txt");
        entry.setSize(5);
        tos.putArchiveEntry(entry);
        tos.write(data, 2, 5);
        tos.closeArchiveEntry();
        tos.finish();
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsEntrySize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("exceeds.txt");
        entry.setSize(3);
        tos.putArchiveEntry(entry);
        tos.write(new byte[10]);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteWithoutEntry() throws IOException {
        tos.write(new byte[] {1});
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutEntry() throws IOException {
        tos.closeArchiveEntry();
    }

    @Test
    public void testFinishTwiceThrows() throws IOException {
        tos.finish();
        try {
            tos.finish();
            fail("Expected IOException on second finish");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testFinishWithUnclosedEntryThrows() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("unclosed.txt");
        entry.setSize(1);
        tos.putArchiveEntry(entry);
        try {
            tos.finish();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testPutArchiveEntryAfterFinishThrows() throws IOException {
        tos.finish();
        try {
            tos.putArchiveEntry(new TarArchiveEntry("late.txt"));
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testCloseFinishesStream() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("a.txt");
        entry.setSize(1);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {42});
        tos.closeArchiveEntry();
        tos.close();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File f = File.createTempFile("tar", ".txt");
        try {
            org.apache.commons.compress.archivers.ArchiveEntry entry = tos.createArchiveEntry(f, "entry.txt");
            assertNotNull(entry);
            assertTrue(entry instanceof TarArchiveEntry);
        } finally {
            f.delete();
        }
    }

    @Test
    public void testLongFileNameTruncate() throws IOException {
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        String name = repeat('a', 200);
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(1);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {0});
        tos.closeArchiveEntry();
        tos.finish();
    }

    @Test
    public void testFlush() throws IOException {
        tos.flush();
    }

    @Test
    public void testGetCount() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("count.txt");
        entry.setSize(1);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {1});
        tos.closeArchiveEntry();
        assertTrue(tos.getCount() > 0);
    }

    @Test
    public void testAddPaxHeadersForNonAsciiNames() throws IOException {
        tos.setAddPaxHeadersForNonAsciiNames(true);
        TarArchiveEntry entry = new TarArchiveEntry("é.txt");
        entry.setSize(1);
        tos.putArchiveEntry(entry);
        tos.write(new byte[] {97});
        tos.closeArchiveEntry();
        tos.finish();
    }

    private String repeat(char c, int count) {
        char[] chars = new char[count];
        Arrays.fill(chars, c);
        return new String(chars);
    }
}