package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private CpioArchiveOutputStream output;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        output = null;
    }

    @After
    public void tearDown() throws IOException {
        if (output != null) {
            output.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsUnknownFormat() {
        new CpioArchiveOutputStream(baos, (short) 12345);
    }

    @Test
    public void testPutArchiveEntryAndCloseEntry() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("test.txt");
        entry.setFileSize(3);
        output.putArchiveEntry(entry);
        output.write(new byte[] {'a', 'b', 'c'}, 0, 3);
        output.closeArchiveEntry();
        output.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testNewCrcFormatWithData() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC);
        entry.setName("crc.txt");
        entry.setFileSize(2);
        output.putArchiveEntry(entry);
        output.write(new byte[] {1, 2}, 0, 2);
        output.closeArchiveEntry();
        output.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testOldAsciiFormat() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII);
        entry.setName("old");
        entry.setFileSize(0);
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        output.finish();
    }

    @Test
    public void testOldBinaryFormat() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY);
        entry.setName("bin");
        entry.setFileSize(0);
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        output.finish();
    }

    @Test
    public void testWriteZeroLengthWhenNoEntryOpenDoesNotThrow() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        output.write(new byte[0], 0, 0);
    }

    @Test(expected = IOException.class)
    public void testWriteWithoutOpenEntryThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        output.write(new byte[] {1}, 0, 1);
    }

    @Test
    public void testWriteWithInvalidOffsetsThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        byte[] data = new byte[10];
        try {
            output.write(data, -1, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // expected
        }
        try {
            output.write(data, 0, 11);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // expected
        }
    }

    @Test
    public void testDuplicateEntryThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("dup");
        entry.setFileSize(0);
        output.putArchiveEntry(entry);

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry2.setName("dup");
        entry2.setFileSize(0);
        try {
            output.putArchiveEntry(entry2);
            fail("Expected IOException for duplicate entry");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("duplicate entry"));
        }
    }

    @Test
    public void testFormatMismatchThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII);
        entry.setName("old");
        entry.setFileSize(0);
        try {
            output.putArchiveEntry(entry);
            fail("Expected IOException for format mismatch");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("does not match existing format"));
        }
    }

    @Test
    public void testCloseArchiveEntrySizeMismatchThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("small");
        entry.setFileSize(10);
        output.putArchiveEntry(entry);
        try {
            output.closeArchiveEntry();
            fail("Expected IOException for size mismatch");
        } catch (IOException expected) {
            assertTrue(expected.getMessage().contains("invalid entry size"));
        }
    }

    @Test
    public void testWriteMoreThanEntrySizeThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("small");
        entry.setFileSize(1);
        output.putArchiveEntry(entry);
        try {
            output.write(new byte[] {1, 2}, 0, 2);
            fail("Expected IOException for exceeding entry size");
        } catch (IOException expected) {
            // expected
        }
    }

    @Test
    public void testFinishThenPutArchiveEntryThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("a");
        entry.setFileSize(0);
        output.putArchiveEntry(entry);
        output.closeArchiveEntry();
        output.finish();
        try {
            output.putArchiveEntry(entry);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertEquals("Stream has already been finished", expected.getMessage());
        }
    }

    @Test
    public void testFinishTwiceThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        output.finish();
        try {
            output.finish();
            fail("Expected IOException");
        } catch (IOException expected) {
            assertEquals("Stream has already been finished", expected.getMessage());
        }
    }

    @Test
    public void testWriteAfterCloseThrows() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        output.close();
        try {
            output.write(new byte[] {1}, 0, 1);
            fail("Expected IOException");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }

    @Test
    public void testCreateArchiveEntry() throws Exception {
        output = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        File temp = File.createTempFile("cpiotest", ".txt");
        try {
            CpioArchiveEntry entry = (CpioArchiveEntry) output.createArchiveEntry(temp, "entryName.txt");
            assertNotNull(entry);
            assertEquals("entryName.txt", entry.getName());
        } finally {
            temp.delete();
        }
    }
}