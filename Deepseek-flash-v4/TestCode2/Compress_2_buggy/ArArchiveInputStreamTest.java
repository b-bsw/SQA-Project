package org.apache.commons.compress.archivers.ar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArArchiveInputStreamTest {

    private static final String HEADER = "!<arch>\n";
    private static final String TRAILER = "`\n";

    private InputStream emptyInput;
    private InputStream headerOnly;
    private InputStream validEntry;
    private InputStream invalidHeader;
    private InputStream oddOffsetEntry;
    private InputStream badTrailer;

    @Before
    public void setUp() {
        emptyInput = new ByteArrayInputStream(new byte[0]);
        headerOnly = new ByteArrayInputStream(HEADER.getBytes());
        validEntry = createValidEntryStream("file.txt", "10");
        invalidHeader = new ByteArrayInputStream("badheader\n".getBytes());
        oddOffsetEntry = createOddOffsetEntryStream();
        badTrailer = createBadTrailerStream();
    }

    @After
    public void tearDown() throws IOException {
        if (emptyInput != null) emptyInput.close();
        if (headerOnly != null) headerOnly.close();
        if (validEntry != null) validEntry.close();
        if (invalidHeader != null) invalidHeader.close();
        if (oddOffsetEntry != null) oddOffsetEntry.close();
        if (badTrailer != null) badTrailer.close();
    }

    private InputStream createValidEntryStream(String name, String length) {
        StringBuilder sb = new StringBuilder();
        sb.append(HEADER);
        sb.append(String.format("%-16s", name));
        sb.append(String.format("%-12s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-8s", "0"));
        sb.append(String.format("%-10s", length));
        sb.append(TRAILER);
        return new ByteArrayInputStream(sb.toString().getBytes());
    }

    private InputStream createOddOffsetEntryStream() {
        StringBuilder sb = new StringBuilder();
        sb.append(HEADER);
        sb.append("X");
        sb.append(String.format("%-16s", "file"));
        sb.append(String.format("%-12s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-8s", "0"));
        sb.append(String.format("%-10s", "5"));
        sb.append(TRAILER);
        return new ByteArrayInputStream(sb.toString().getBytes());
    }

    private InputStream createBadTrailerStream() {
        StringBuilder sb = new StringBuilder();
        sb.append(HEADER);
        sb.append(String.format("%-16s", "file"));
        sb.append(String.format("%-12s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-6s", "0"));
        sb.append(String.format("%-8s", "0"));
        sb.append(String.format("%-10s", "5"));
        sb.append("XX");
        return new ByteArrayInputStream(sb.toString().getBytes());
    }

    @Test
    public void testGetNextArEntryNormal() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(validEntry);
        ArArchiveEntry entry = in.getNextArEntry();
        assertNotNull(entry);
        assertEquals("file.txt", entry.getName());
        assertEquals(10, entry.getLength());
        in.close();
    }

    @Test
    public void testGetNextArEntryNullOnEof() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(headerOnly);
        ArArchiveEntry entry = in.getNextArEntry();
        assertNull(entry);
        in.close();
    }

    @Test
    public void testGetNextArEntryInvalidHeader() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(invalidHeader);
        try {
            in.getNextArEntry();
            fail("Expected IOException for invalid header");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid header"));
        }
        in.close();
    }

    @Test
    public void testGetNextArEntryBadTrailer() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(badTrailer);
        try {
            in.getNextArEntry();
            fail("Expected IOException for bad trailer");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid entry header"));
        }
        in.close();
    }

    @Test
    public void testGetNextArEntryWithOddOffset() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(oddOffsetEntry);
        ArArchiveEntry entry = in.getNextArEntry();
        assertNotNull(entry);
        assertEquals("file", entry.getName());
        in.close();
    }

    @Test
    public void testGetNextEntryDelegation() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(validEntry);
        ArchiveEntry entry = in.getNextEntry();
        assertNotNull(entry);
        assertTrue(entry instanceof ArArchiveEntry);
        in.close();
    }

    @Test
    public void testReadSingleByte() throws IOException {
        byte[] data = HEADER.getBytes();
        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(data));
        int first = in.read();
        assertEquals(data[0], first);
        in.close();
    }

    @Test
    public void testReadArray() throws IOException {
        byte[] data = HEADER.getBytes();
        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(data));
        byte[] buffer = new byte[5];
        int read = in.read(buffer);
        assertEquals(5, read);
        assertArrayEquals(new byte[]{data[0], data[1], data[2], data[3], data[4]}, buffer);
        in.close();
    }

    @Test
    public void testReadArrayWithOffset() throws IOException {
        byte[] data = HEADER.getBytes();
        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(data));
        byte[] buffer = new byte[10];
        int read = in.read(buffer, 2, 3);
        assertEquals(3, read);
        assertEquals(data[0], buffer[2]);
        assertEquals(data[1], buffer[3]);
        assertEquals(data[2], buffer[4]);
        in.close();
    }

    @Test
    public void testClose() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(validEntry);
        in.close();
        in.close();
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertTrue(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesTooShort() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x61, 0x72};
        assertFalse(ArArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesInvalidFirstByte() {
        byte[] sig = new byte[]{0x00, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesInvalidSecondByte() {
        byte[] sig = new byte[]{0x21, 0x00, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesInvalidThirdByte() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x00, 0x72, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesInvalidFourthByte() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x61, 0x00, 0x63, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesInvalidFifthByte() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x00, 0x68, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesInvalidSixthByte() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x63, 0x00, 0x3e, 0x0a};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesInvalidSeventhByte() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x00, 0x0a};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }

    @Test
    public void testMatchesInvalidEighthByte() {
        byte[] sig = new byte[]{0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x00};
        assertFalse(ArArchiveInputStream.matches(sig, 8));
    }
}