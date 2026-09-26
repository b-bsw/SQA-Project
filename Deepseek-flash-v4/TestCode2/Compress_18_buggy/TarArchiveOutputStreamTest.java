package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private TarArchiveOutputStream tarOut;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        tarOut = new TarArchiveOutputStream(baos);
    }

    @Test
    public void testConstructorDefault() {
        assertNotNull(tarOut);
    }

    @Test
    public void testSetLongFileModeValid() {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        assertEquals(TarArchiveOutputStream.LONGFILE_GNU, tarOut.longFileMode);
    }

    @Test
    public void testSetBigNumberModeValid() {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        assertEquals(TarArchiveOutputStream.BIGNUMBER_STAR, tarOut.bigNumberMode);
    }

    @Test
    public void testSetAddPaxHeadersForNonAsciiNamesTrue() {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        assertTrue(tarOut.addPaxHeadersForNonAsciiNames);
    }

    @Test
    public void testFinishAlreadyFinished() throws IOException {
        tarOut.finish();
        try {
            tarOut.finish();
            fail("Expected IOException for already finished");
        } catch (IOException e) {
            assertEquals("This archive has already been finished", e.getMessage());
        }
    }

    @Test
    public void testFinishWithUnclosedEntry() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        try {
            tarOut.finish();
            fail("Expected IOException for unclosed entry");
        } catch (IOException e) {
            assertEquals("This archives contains unclosed entries.", e.getMessage());
        }
    }

    @Test
    public void testFinishNormal() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[] {1,2,3,4,5});
        tarOut.closeArchiveEntry();
        tarOut.finish();
        assertTrue(tarOut.finished);
    }

    @Test
    public void testCloseWithFinish() throws IOException {
        tarOut.close();
        assertTrue(tarOut.closed);
    }

    @Test
    public void testCloseWithoutFinish() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
        tarOut.close();
        assertTrue(tarOut.finished);
        assertTrue(tarOut.closed);
    }

    @Test
    public void testPutArchiveEntryAlreadyFinished() throws IOException {
        tarOut.finish();
        try {
            tarOut.putArchiveEntry(new TarArchiveEntry("test.txt"));
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryLongFileTruncate() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        String longName = sb.toString();
        // should not throw exception
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryLongFileError() {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        String longName = sb.toString();
        try {
            TarArchiveEntry entry = new TarArchiveEntry(longName);
            entry.setSize(0);
            tarOut.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too long"));
        }
    }

    @Test
    public void testPutArchiveEntryLongFileGNU() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        String longName = sb.toString();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryLongFilePosix() throws IOException {
        tarOut.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append('a');
        }
        String longName = sb.toString();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryBigNumberError() {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        try {
            tarOut.putArchiveEntry(entry);
            fail("Expected RuntimeException for big number");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("too big"));
        }
    }

    @Test
    public void testPutArchiveEntryBigNumberStar() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryBigNumberPosix() throws IOException {
        tarOut.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntryNoCurrentEntry() throws IOException {
        try {
            tarOut.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("No current entry to close", e.getMessage());
        }
    }

    @Test
    public void testCloseArchiveEntryIncompleteWrite() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[] {1,2,3});
        try {
            tarOut.closeArchiveEntry();
            fail("Expected IOException for incomplete write");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("closed at"));
        }
    }

    @Test
    public void testCloseArchiveEntryFinished() throws IOException {
        tarOut.finish();
        try {
            tarOut.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testWriteExceedsSize() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        byte[] data = new byte[10];
        try {
            tarOut.write(data, 0, 10);
            fail("Expected IOException for excessive write");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("exceeds size"));
        }
    }

    @Test
    public void testWriteNormal() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[] {1,2,3,4,5});
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteExactRecordLength() throws IOException {
        int recordSize = tarOut.getRecordSize();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(recordSize);
        tarOut.putArchiveEntry(entry);
        byte[] data = new byte[recordSize];
        for (int i = 0; i < recordSize; i++) {
            data[i] = (byte) i;
        }
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testWriteMultipleRecords() throws IOException {
        int recordSize = tarOut.getRecordSize();
        int totalSize = recordSize * 3 + 10;
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(totalSize);
        tarOut.putArchiveEntry(entry);
        byte[] data = new byte[totalSize];
        for (int i = 0; i < totalSize; i++) {
            data[i] = (byte) (i % 256);
        }
        tarOut.write(data);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testGetBytesWritten() throws IOException {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        tarOut.putArchiveEntry(entry);
        tarOut.write(new byte[] {1,2,3,4,5,6,7,8,9,10});
        tarOut.closeArchiveEntry();
        long bytesWritten = tarOut.getBytesWritten();
        assertTrue(bytesWritten > 0);
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        java.io.File tmp = java.io.File.createTempFile("test", ".txt");
        tmp.deleteOnExit();
        ArchiveEntry entry = tarOut.createArchiveEntry(tmp, "test.txt");
        assertNotNull(entry);
        assertTrue(entry instanceof TarArchiveEntry);
    }

    @Test
    public void testCreateArchiveEntryFinished() throws IOException {
        tarOut.finish();
        java.io.File tmp = java.io.File.createTempFile("test", ".txt");
        tmp.deleteOnExit();
        try {
            tarOut.createArchiveEntry(tmp, "test.txt");
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testGetRecordSize() {
        int recordSize = tarOut.getRecordSize();
        assertTrue(recordSize > 0);
    }

    @Test
    public void testWritePaxHeaders() throws IOException {
        TarArchiveOutputStream spyOut = new TarArchiveOutputStream(baos) {
            @Override
            public void putArchiveEntry(ArchiveEntry entry) throws IOException {
                if (entry.getName().startsWith("./PaxHeaders.X/")) {
                    // allow
                }
                super.putArchiveEntry(entry);
            }
        };
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("path", "/very/long/path/that/exceeds/normal/limit/for/testing");
        spyOut.writePaxHeaders("test.txt", headers);
    }

    @Test
    public void testStripTo7Bits() {
        String input = "Hëllö Wörld";
        String result = tarOut.stripTo7Bits(input);
        // should keep only ASCII chars
        assertEquals("Hll Wrld", result);
    }

    @Test
    public void testAddPaxHeadersForNonAsciiNames() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        String nonAscii = "Hëllö";
        TarArchiveEntry entry = new TarArchiveEntry(nonAscii);
        entry.setSize(0);
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }

    @Test
    public void testAddPaxHeadersForNonAsciiNamesWithLink() throws IOException {
        tarOut.setAddPaxHeadersForNonAsciiNames(true);
        String nonAscii = "test";
        TarArchiveEntry entry = new TarArchiveEntry(nonAscii);
        entry.setSize(0);
        entry.setLinkName("lïnk");
        // mark as symbolic link; actual type handling may vary, but setLinkName should be enough
        tarOut.putArchiveEntry(entry);
        tarOut.closeArchiveEntry();
    }
}