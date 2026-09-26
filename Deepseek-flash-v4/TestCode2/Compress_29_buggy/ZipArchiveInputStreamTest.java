package org.apache.commons.compress.archives.zip;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;

import org.junit.Test;

public class ZipArchiveInputStreamTest {

    @Test
    public void testEmptyArchiveReturnsNull() throws Exception {
        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(emptyZip()))) {
            assertNull(in.getNextZipEntry());
            assertNull(in.getNextEntry());
        }
    }

    @Test
    public void testStoredEntryRoundTrip() throws Exception {
        byte[] zip = singleEntryZip("hello.txt", "Hello world", ZipArchiveOutputStream.STORED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            assertNotNull(entry);
            assertEquals("hello.txt", entry.getName());
            assertEquals(11, entry.getSize());
            assertEquals("Hello world", readEntryAsString(in));
            assertNull(in.getNextEntry());
        }
    }

    @Test
    public void testDeflatedEntryRoundTrip() throws Exception {
        byte[] zip = singleEntryZip("data.txt", "Some deflated content here", ZipArchiveOutputStream.DEFLATED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            assertNotNull(in.getNextZipEntry());
            assertEquals("Some deflated content here", readEntryAsString(in));
            assertNull(in.getNextEntry());
        }
    }

    @Test
    public void testMultipleEntriesAreReadInOrder() throws Exception {
        byte[] zip = emptyZip();

        try (ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream())) {
            zos.write(zip);
        }

        zip = multiEntryZip();

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            assertEquals("a.txt", in.getNextZipEntry().getName());
            assertEquals("alpha", readEntryAsString(in));

            assertEquals("b.txt", in.getNextZipEntry().getName());
            assertEquals("beta", readEntryAsString(in));

            assertEquals("c.txt", in.getNextZipEntry().getName());
            assertEquals("gamma", readEntryAsString(in));

            assertNull(in.getNextEntry());
        }
    }

    @Test
    public void testEmptyEntry() throws Exception {
        byte[] zip = singleEntryZip("empty.bin", "", ZipArchiveOutputStream.STORED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            assertNotNull(in.getNextZipEntry());
            assertEquals("", readEntryAsString(in));
            assertNull(in.getNextEntry());
        }
    }

    @Test
    public void testReadBeforeNextEntryReturnsMinusOne() throws Exception {
        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]))) {
            assertEquals(-1, in.read(new byte[1], 0, 1));
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadRejectsNegativeOffset() throws Exception {
        byte[] zip = singleEntryZip("a.txt", "abc", ZipArchiveOutputStream.STORED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            assertNotNull(in.getNextEntry());
            in.read(new byte[8], -1, 0);
        }
    }

    @Test
    public void testSkipStoredEntry() throws Exception {
        byte[] zip = singleEntryZip("skip.txt", "hello", ZipArchiveOutputStream.STORED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            assertNotNull(in.getNextEntry());
            assertEquals(2, in.skip(2));
            assertEquals("llo", readEntryAsString(in));
        }
    }

    @Test
    public void testSkipNonPositiveIsNoOp() throws Exception {
        byte[] zip = singleEntryZip("skip.txt", "abc", ZipArchiveOutputStream.STORED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            assertNotNull(in.getNextEntry());
            assertEquals(0, in.skip(-1));
            assertEquals(0, in.skip(0));
            assertEquals("abc", readEntryAsString(in));
        }
    }

    @Test
    public void testCanReadEntryData() throws Exception {
        byte[] zip = singleEntryZip("x.bin", "data", ZipArchiveOutputStream.STORED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip))) {
            ZipArchiveEntry entry = in.getNextZipEntry();
            assertNotNull(entry);
            assertTrue(in.canReadEntryData(entry));
            assertFalse(in.canReadEntryData(null));
        }
    }

    @Test
    public void testMatchesSignature() {
        assertTrue(ZipArchiveInputStream.matches(new byte[] {'P', 'K', 3, 4}, 4));
        assertTrue(ZipArchiveInputStream.matches(new byte[] {'P', 'K', 3, 4, 0}, 5));
        assertFalse(ZipArchiveInputStream.matches(new byte[] {'P', 'K', 5, 6}, 4));
        assertFalse(ZipArchiveInputStream.matches(new byte[0], 0));
    }

    @Test
    public void testEncodingConstructorsReadyDeflatedEntry() throws Exception {
        byte[] zip = singleEntryZip("x.txt", "constructors", ZipArchiveOutputStream.DEFLATED);

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip), "UTF-8")) {
            assertNotNull(in.getNextEntry());
            assertEquals("constructors", readEntryAsString(in));
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip), "UTF-8", true)) {
            assertNotNull(in.getNextEntry());
            assertEquals("constructors", readEntryAsString(in));
        }

        try (ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(zip), "UTF-8", true, false)) {
            assertNotNull(in.getNextEntry());
            assertEquals("constructors", readEntryAsString(in));
        }
    }

    private static byte[] emptyZip() throws Exception {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos)) {
            return bos.toByteArray();
        }
    }

    private static byte[] singleEntryZip(String name, String content, int method) throws Exception {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos)) {
            addEntry(zos, name, content, method);
            return bos.toByteArray();
        }
    }

    private static byte[] multiEntryZip() throws Exception {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ZipArchiveOutputStream zos = new ZipArchiveOutputStream(bos)) {
            addEntry(zos, "a.txt", "alpha", ZipArchiveOutputStream.STORED);
            addEntry(zos, "b.txt", "beta", ZipArchiveOutputStream.STORED);
            addEntry(zos, "c.txt", "gamma", ZipArchiveOutputStream.STORED);
            return bos.toByteArray();
        }
    }

    private static void addEntry(ZipArchiveOutputStream zos, String name, String content, int method) throws Exception {
        byte[] data = content.getBytes(StandardCharsets.UTF_8);
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        entry.setMethod(method);

        if (method == ZipArchiveOutputStream.STORED) {
            entry.setSize(data.length);
            entry.setCompressedSize(data.length);

            CRC32 crc = new CRC32();
            crc.update(data);
            entry.setCrc(crc.getValue());
        }

        zos.putArchiveEntry(entry);
        zos.write(data);
        zos.closeArchiveEntry();
    }

    private static String readEntryAsString(ZipArchiveInputStream in) throws Exception {
        return new String(readAll(in), StandardCharsets.UTF_8);
    }

    private static byte[] readAll(ZipArchiveInputStream in) throws Exception {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[16];
        int read;

        while ((read = in.read(buffer, 0, buffer.length)) != -1) {
            result.write(buffer, 0, read);
        }

        return result.toByteArray();
    }
}