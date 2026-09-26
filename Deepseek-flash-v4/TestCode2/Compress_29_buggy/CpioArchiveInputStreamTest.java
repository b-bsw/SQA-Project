package org.apache.commons.compress.archivers.cpio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.Assert.*;

public class CpioArchiveInputStreamTest {

    private CpioArchiveInputStream in;
    private ByteArrayInputStream bais;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws IOException {
        if (in != null) {
            in.close();
        }
    }

    @Test
    public void testAvailableAfterCloseThrowsException() throws IOException {
        bais = new ByteArrayInputStream(new byte[0]);
        in = new CpioArchiveInputStream(bais);
        in.close();
        try {
            in.available();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream closed"));
        }
    }

    @Test
    public void testAvailableBeforeEntry() throws IOException {
        bais = new ByteArrayInputStream(new byte[] {0x71, (byte)0xC7, 0, 0, 0, 0});
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNull(entry);
        assertEquals(1, in.available());
    }

    @Test
    public void testAvailableAfterReadingAllData() throws IOException {
        byte[] data = createOldBinaryEntry();
        bais = new ByteArrayInputStream(data);
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNotNull(entry);
        byte[] buf = new byte[4];
        int read = in.read(buf, 0, buf.length);
        assertTrue(read > 0);
        int remaining;
        while ((remaining = in.available()) > 0) {
            in.read(buf);
        }
        assertEquals(0, in.available());
    }

    @Test
    public void testReadAfterCloseReturnsMinusOne() throws IOException {
        bais = new ByteArrayInputStream(new byte[] {0x71, (byte)0xC7, 0, 0, 0, 0});
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNull(entry);
        byte[] buf = new byte[4];
        assertEquals(-1, in.read(buf, 0, buf.length));
    }

    @Test
    public void testReadNegativeOffset() throws IOException {
        bais = new ByteArrayInputStream(new byte[0]);
        in = new CpioArchiveInputStream(bais);
        try {
            in.read(new byte[10], -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testReadEntireEntry() throws IOException {
        byte[] data = createOldBinaryEntry();
        bais = new ByteArrayInputStream(data);
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNotNull(entry);
        assertEquals("testfile", entry.getName());
        byte[] buf = new byte[8];
        int read = in.read(buf, 0, buf.length);
        assertEquals(8, read);
        assertArrayEquals(new byte[] {0, 1, 2, 3, 4, 5, 6, 7}, buf);
        int read2 = in.read(buf, 0, buf.length);
        assertEquals(-1, read2);
    }

    @Test
    public void testSkipNegative() throws IOException {
        bais = new ByteArrayInputStream(new byte[0]);
        in = new CpioArchiveInputStream(bais);
        try {
            in.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("negative skip length"));
        }
    }

    @Test
    public void testSkipZero() throws IOException {
        byte[] data = createOldBinaryEntry();
        bais = new ByteArrayInputStream(data);
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNotNull(entry);
        assertEquals(0, in.skip(0));
        byte[] buf = new byte[8];
        int read = in.read(buf, 0, buf.length);
        assertEquals(8, read);
    }

    @Test
    public void testSkipPartial() throws IOException {
        byte[] data = createOldBinaryEntry();
        bais = new ByteArrayInputStream(data);
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNotNull(entry);
        long skipped = in.skip(4);
        assertEquals(4, skipped);
        byte[] buf = new byte[8];
        int read = in.read(buf, 0, buf.length);
        assertEquals(4, read);
        assertArrayEquals(new byte[] {4, 5, 6, 7}, buf);
    }

    @Test
    public void testSkipBeyondEntry() throws IOException {
        byte[] data = createOldBinaryEntry();
        bais = new ByteArrayInputStream(data);
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNotNull(entry);
        long skipped = in.skip(100);
        assertEquals(8, skipped);
        byte[] buf = new byte[4];
        assertEquals(-1, in.read(buf, 0, buf.length));
    }

    @Test
    public void testMatchesReturnsFalseForShortSignature() {
        assertFalse(CpioArchiveInputStream.matches(new byte[] {0x71}, 1));
    }

    @Test
    public void testMatchesReturnsTrueForOldBinary() {
        assertTrue(CpioArchiveInputStream.matches(new byte[] {0x71, (byte)0xC7, 0, 0, 0, 0}, 6));
    }

    @Test
    public void testMatchesReturnsTrueForOldBinarySwapped() {
        assertTrue(CpioArchiveInputStream.matches(new byte[] {(byte)0xC7, 0x71, 0, 0, 0, 0}, 6));
    }

    @Test
    public void testMatchesReturnsTrueForNew() {
        assertTrue(CpioArchiveInputStream.matches(new byte[] {0x30, 0x37, 0x30, 0x37, 0x30, 0x31}, 6));
    }

    @Test
    public void testMatchesReturnsTrueForNewCrc() {
        assertTrue(CpioArchiveInputStream.matches(new byte[] {0x30, 0x37, 0x30, 0x37, 0x30, 0x32}, 6));
    }

    @Test
    public void testMatchesReturnsTrueForOldAscii() {
        assertTrue(CpioArchiveInputStream.matches(new byte[] {0x30, 0x37, 0x30, 0x37, 0x30, 0x37}, 6));
    }

    @Test
    public void testMatchesReturnsFalseForInvalidSignature() {
        assertFalse(CpioArchiveInputStream.matches(new byte[] {0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF}, 6));
    }

    @Test
    public void testReadZeroLength() throws IOException {
        byte[] data = createOldBinaryEntry();
        bais = new ByteArrayInputStream(data);
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry = in.getNextCPIOEntry();
        assertNotNull(entry);
        byte[] buf = new byte[0];
        assertEquals(0, in.read(buf, 0, 0));
    }

    @Test(expected = IOException.class)
    public void testReadFullyThrowsEOFWhenNotEnoughData() throws IOException {
        bais = new ByteArrayInputStream(new byte[] {0x30, 0x37});
        in = new CpioArchiveInputStream(bais);
        in.getNextCPIOEntry();
    }

    @Test
    public void testGetNextEntryReturnsNullAtTrailer() throws IOException {
        byte[] data = createOldBinaryEntry();
        bais = new ByteArrayInputStream(data);
        in = new CpioArchiveInputStream(bais);
        CpioArchiveEntry entry1 = in.getNextCPIOEntry();
        assertNotNull(entry1);
        CpioArchiveEntry entry2 = in.getNextCPIOEntry();
        assertNull(entry2);
    }

    private byte[] createOldBinaryEntry() {
        byte[] header = {
            0x71, (byte)0xC7, // magic
            0, 0, // dev
            0, 0, // inode
            0, 0, // mode (regular file)
            0, 0, // uid
            0, 0, // gid
            0, 0, // nlink
            0, 0, // rdev
            0, 0, 0, 0, // mtime
            0, 9, // namesize (including null)
            0, 0, 0, 8, // filesize
        };
        byte[] name = "testfile\0".getBytes();
        byte[] fileData = new byte[] {0, 1, 2, 3, 4, 5, 6, 7};
        byte[] trailer = createTrailer();
        byte[] result = new byte[header.length + name.length + fileData.length + trailer.length];
        System.arraycopy(header, 0, result, 0, header.length);
        System.arraycopy(name, 0, result, header.length, name.length);
        System.arraycopy(fileData, 0, result, header.length + name.length, fileData.length);
        System.arraycopy(trailer, 0, result, header.length + name.length + fileData.length, trailer.length);
        return result;
    }

    private byte[] createTrailer() {
        byte[] trailerHeader = {
            0x71, (byte)0xC7,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 11, // namesize for "TRAILER!!!\0"
            0, 0, 0, 0, // filesize
        };
        byte[] trailerName = "TRAILER!!!\0".getBytes();
        byte[] result = new byte[trailerHeader.length + trailerName.length];
        System.arraycopy(trailerHeader, 0, result, 0, trailerHeader.length);
        System.arraycopy(trailerName, 0, result, trailerHeader.length, trailerName.length);
        return result;
    }
}