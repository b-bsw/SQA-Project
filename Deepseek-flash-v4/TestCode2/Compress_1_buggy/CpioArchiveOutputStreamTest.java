package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private CpioArchiveOutputStream cpioOut;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        cpioOut = new CpioArchiveOutputStream(baos);
    }

    @After
    public void tearDown() throws Exception {
        if (cpioOut != null) {
            cpioOut.close();
        }
        if (baos != null) {
            baos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testPutNextEntryTwiceThrowsException() throws IOException {
        CpioArchiveEntry entry1 = new CpioArchiveEntry();
        entry1.setName("test1");
        entry1.setFileSize(0);
        cpioOut.putNextEntry(entry1);

        CpioArchiveEntry entry2 = new CpioArchiveEntry();
        entry2.setName("test1"); // duplicate name
        entry2.setFileSize(0);
        cpioOut.putNextEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void testWriteBeforePutNextEntryThrowsException() throws IOException {
        byte[] data = new byte[10];
        cpioOut.write(data, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteInvalidOffsetsThrowsException() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test1");
        entry.setFileSize(10);
        cpioOut.putNextEntry(entry);
        byte[] data = new byte[5];
        cpioOut.write(data, -1, 1);
    }

    @Test(expected = IOException.class)
    public void testWritePastEndOfEntryThrowsException() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test1");
        entry.setFileSize(1);
        cpioOut.putNextEntry(entry);
        byte[] data = new byte[] { 1, 2 };
        cpioOut.write(data, 0, 2);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntrySizeMismatchThrowsException() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test1");
        entry.setFileSize(5);
        cpioOut.putNextEntry(entry);
        byte[] data = new byte[] { 1, 2, 3 };
        cpioOut.write(data, 0, 3);
        cpioOut.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testWriteAfterCloseThrowsException() throws IOException {
        cpioOut.close();
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test1");
        entry.setFileSize(0);
        cpioOut.putNextEntry(entry);
    }

    @Test
    public void testNormalWriteAndCloseArchiveEntry() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("testfile.txt");
        entry.setFileSize(5);
        cpioOut.putNextEntry(entry);
        byte[] data = "Hello".getBytes();
        cpioOut.write(data, 0, 5);
        cpioOut.closeArchiveEntry();
        cpioOut.finish();
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testFinishedStreamReturnsEarly() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test1");
        entry.setFileSize(0);
        cpioOut.putNextEntry(entry);
        cpioOut.closeArchiveEntry();
        cpioOut.finish();
        cpioOut.finish(); // should not throw
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFormatThrowsException() throws IOException {
        CpioArchiveOutputStream badOut = new CpioArchiveOutputStream(baos, (short) 99);
        badOut.close();
    }

    @Test
    public void testWriteZeroLengthReturnsEarly() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test1");
        entry.setFileSize(10);
        cpioOut.putNextEntry(entry);
        byte[] data = new byte[0];
        cpioOut.write(data, 0, 0);
        // no exception expected
    }

    @Test(expected = IOException.class)
    public void testDuplicateEntryThrowsOnPutNextEntry() throws IOException {
        CpioArchiveEntry entry1 = new CpioArchiveEntry();
        entry1.setName("dup");
        entry1.setFileSize(0);
        cpioOut.putNextEntry(entry1);

        CpioArchiveEntry entry2 = new CpioArchiveEntry();
        entry2.setName("dup");
        entry2.setFileSize(0);
        cpioOut.putNextEntry(entry2);
    }

    @Test
    public void testWriteWithCrcFormat() throws IOException {
        ByteArrayOutputStream baosCrc = new ByteArrayOutputStream();
        CpioArchiveOutputStream crcOut = new CpioArchiveOutputStream(baosCrc, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("crcfile");
        entry.setFileSize(3);
        crcOut.putNextEntry(entry);
        byte[] data = new byte[] { 1, 2, 3 };
        crcOut.write(data, 0, 3);
        crcOut.closeArchiveEntry();
        crcOut.finish();
        crcOut.close();
        assertTrue(baosCrc.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testWritePastEndOfEntryException() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("overflow");
        entry.setFileSize(2);
        cpioOut.putNextEntry(entry);
        byte[] data = new byte[] { 1, 2, 3 };
        cpioOut.write(data, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithSizeMismatch() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("mismatch");
        entry.setFileSize(10);
        cpioOut.putNextEntry(entry);
        byte[] data = new byte[] { 1, 2, 3 };
        cpioOut.write(data, 0, 3);
        cpioOut.closeArchiveEntry();
    }

    @Test
    public void testCloseAfterFinishAndClosed() throws IOException {
        cpioOut.finish();
        cpioOut.close();
        // should not throw
    }
}