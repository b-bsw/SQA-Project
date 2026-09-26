package org.apache.commons.compress.archivers.cpio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.Assert.*;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private CpioArchiveOutputStream out;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() throws IOException {
        if (out != null) {
            out.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorUnknownFormat() {
        new CpioArchiveOutputStream(baos, (short) 999);
    }

    @Test
    public void testConstructorDefaultFormat() throws IOException {
        out = new CpioArchiveOutputStream(baos);
        out.finish();
        byte[] data = baos.toByteArray();
        assertTrue(data.length > 0);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryDuplicateName() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry1.setName("test");
        entry1.setSize(0);
        out.putArchiveEntry(entry1);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry2.setName("test");
        entry2.setSize(0);
        out.putArchiveEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryWrongFormat() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII);
        entry.setName("test");
        entry.setSize(0);
        out.putArchiveEntry(entry);
    }

    @Test
    public void testWriteAndCloseEntry() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("file.txt");
        entry.setSize(5);
        out.putArchiveEntry(entry);
        out.write("hello".getBytes(), 0, 5);
        out.closeArchiveEntry();
        out.finish();
        byte[] data = baos.toByteArray();
        assertTrue(data.length > 0);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntrySizeMismatch() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("file.txt");
        entry.setSize(10);
        out.putArchiveEntry(entry);
        out.write("hello".getBytes(), 0, 5);
        out.closeArchiveEntry();
    }

    @Test
    public void testWriteZeroLengthNoOp() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("empty");
        entry.setSize(0);
        out.putArchiveEntry(entry);
        out.write(new byte[0], 0, 0);
        out.closeArchiveEntry();
        out.finish();
    }

    @Test(expected = IOException.class)
    public void testWriteNoEntry() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.write(new byte[10], 0, 10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteInvalidOffset() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("test");
        entry.setSize(10);
        out.putArchiveEntry(entry);
        byte[] data = new byte[10];
        out.write(data, -1, 5);
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsEntrySize() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("test");
        entry.setSize(5);
        out.putArchiveEntry(entry);
        out.write("123456".getBytes(), 0, 6);
    }

    @Test
    public void testFinishTwiceNoException() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.finish();
        out.finish();
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("test");
        entry.setSize(0);
        out.putArchiveEntry(entry);
        out.finish();
    }

    @Test
    public void testCloseClosesStream() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        assertTrue(out.closed);
    }

    @Test(expected = IOException.class)
    public void testEnsureOpenAfterClose() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        out.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW));
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        java.io.File f = new java.io.File("test.txt");
        CpioArchiveEntry ae = (CpioArchiveEntry) out.createArchiveEntry(f, "test.txt");
        assertNotNull(ae);
        assertEquals("test.txt", ae.getName());
    }

    @Test
    public void testWriteNullEntryNameHandled() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC);
        entry.setName("test");
        entry.setSize(3);
        entry.setChksum(0);
        out.putArchiveEntry(entry);
        out.write("abc".getBytes(), 0, 3);
        out.closeArchiveEntry();
        out.finish();
    }

    @Test(expected = IOException.class)
    public void testWriteWhenClosed() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        out.write(new byte[1], 0, 1);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryWhenClosed() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        out.close();
        out.putArchiveEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW));
    }

    @Test
    public void testFormatNewCrcChecksumMismatch() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW_CRC);
        entry.setName("test");
        entry.setSize(1);
        entry.setChksum(12345);
        out.putArchiveEntry(entry);
        out.write(new byte[]{'a'}, 0, 1);
        try {
            out.closeArchiveEntry();
            fail("Expected IOException for CRC mismatch");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("CRC Error"));
        }
    }

    @Test
    public void testWriteMultipleEntries() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII);
        entry1.setName("file1");
        entry1.setSize(3);
        out.putArchiveEntry(entry1);
        out.write("abc".getBytes(), 0, 3);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII);
        entry2.setName("file2");
        entry2.setSize(4);
        out.putArchiveEntry(entry2);
        out.write("defg".getBytes(), 0, 4);
        out.closeArchiveEntry();
        out.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testFormatOldBinary() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_BINARY);
        entry.setName("test");
        entry.setSize(2);
        out.putArchiveEntry(entry);
        out.write("ab".getBytes(), 0, 2);
        out.closeArchiveEntry();
        out.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testAutoSetTime() throws IOException {
        out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW);
        entry.setName("auto");
        entry.setSize(0);
        assertEquals(-1, entry.getTime());
        out.putArchiveEntry(entry);
        assertTrue(entry.getTime() > 0);
        out.closeArchiveEntry();
        out.finish();
    }
}