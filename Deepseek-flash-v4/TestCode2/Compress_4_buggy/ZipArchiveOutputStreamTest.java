package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipException;

public class ZipArchiveOutputStreamTest {

    private ByteArrayOutputStream baos;
    private ZipArchiveOutputStream zos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        zos = new ZipArchiveOutputStream(baos);
    }

    @Test
    public void testConstructorWithOutputStream() {
        assertNotNull(zos);
        assertFalse(zos.isSeekable());
    }

    @Test
    public void testIsSeekableFalseForOutputStream() {
        assertFalse(zos.isSeekable());
    }

    @Test
    public void testSetEncoding() {
        zos.setEncoding("UTF-8");
        assertEquals("UTF-8", zos.getEncoding());
    }

    @Test
    public void testSetLevelValid() {
        zos.setLevel(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelTooLow() {
        zos.setLevel(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelTooHigh() {
        zos.setLevel(10);
    }

    @Test
    public void testSetMethod() {
        zos.setMethod(ZipArchiveOutputStream.STORED);
    }

    @Test
    public void testSetComment() {
        zos.setComment("test comment");
    }

    @Test
    public void testPutArchiveEntryAndCloseArchiveEntry() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        zos.write(new byte[]{1,2,3,4,5}, 0, 5);
        zos.closeArchiveEntry();
    }

    @Test(expected = ZipException.class)
    public void testCloseArchiveEntryCrcMismatch() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(5);
        entry.setCrc(1L);
        zos.putArchiveEntry(entry);
        zos.write(new byte[]{1,2,3,4,5}, 0, 5);
        zos.closeArchiveEntry();
    }

    @Test(expected = ZipException.class)
    public void testCloseArchiveEntrySizeMismatch() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(10);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        zos.write(new byte[]{1,2,3,4,5}, 0, 5);
        zos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntryNullEntry() throws IOException {
        zos.closeArchiveEntry();
    }

    @Test
    public void testFinish() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        zos.closeArchiveEntry();
        zos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinishWithOpenEntry() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zos.putArchiveEntry(entry);
        zos.finish();
    }

    @Test
    public void testWriteWithDeflatedMethodSmallData() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        entry.setSize(0);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        byte[] data = "hello".getBytes();
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
    }

    @Test
    public void testWriteWithDeflatedMethodLargeData() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("large.txt");
        entry.setMethod(ZipArchiveOutputStream.DEFLATED);
        entry.setSize(0);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        byte[] data = new byte[20000];
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
    }

    @Test
    public void testWriteWithStoredMethod() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        entry.setSize(5);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        byte[] data = "hello".getBytes();
        zos.write(data, 0, data.length);
        zos.closeArchiveEntry();
    }

    @Test
    public void testFlush() throws IOException {
        zos.flush();
    }

    @Test
    public void testClose() throws IOException {
        zos.close();
    }

    @Test
    public void testMultipleEntries() throws IOException {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
        entry1.setSize(3);
        entry1.setCrc(0);
        zos.putArchiveEntry(entry1);
        zos.write(new byte[]{1,2,3}, 0, 3);
        zos.closeArchiveEntry();

        ZipArchiveEntry entry2 = new ZipArchiveEntry("file2.txt");
        entry2.setSize(4);
        entry2.setCrc(0);
        zos.putArchiveEntry(entry2);
        zos.write(new byte[]{4,5,6,7}, 0, 4);
        zos.closeArchiveEntry();

        zos.finish();
    }

    @Test
    public void testSetUseLanguageEncodingFlag() {
        zos.setUseLanguageEncodingFlag(true);
    }

    @Test
    public void testSetCreateUnicodeExtraFields() {
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
    }

    @Test
    public void testSetFallbackToUTF8() {
        zos.setFallbackToUTF8(true);
    }

    @Test
    public void testPutArchiveEntryWithDefaultMethod() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(0);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        assertEquals(ZipArchiveOutputStream.DEFLATED, entry.getMethod());
        zos.closeArchiveEntry();
    }

    @Test
    public void testPutArchiveEntryWithStoredMethodNoSize() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipArchiveOutputStream.STORED);
        try {
            zos.putArchiveEntry(entry);
            fail("Expected ZipException");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithFile() throws IOException {
        File tempFile = File.createTempFile("test", ".zip");
        tempFile.deleteOnExit();
        ZipArchiveOutputStream fileZos = new ZipArchiveOutputStream(tempFile);
        assertTrue(fileZos.isSeekable());
        fileZos.close();
    }

    @Test
    public void testConstructorWithFileIOException() throws IOException {
        File tempFile = File.createTempFile("test", ".zip");
        tempFile.deleteOnExit();
        tempFile.setReadOnly();
        ZipArchiveOutputStream fileZos = new ZipArchiveOutputStream(tempFile);
        assertFalse(fileZos.isSeekable());
        fileZos.close();
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("test", ".txt");
        tempFile.deleteOnExit();
        ArchiveEntry entry = zos.createArchiveEntry(tempFile, "entry.txt");
        assertNotNull(entry);
        assertEquals("entry.txt", entry.getName());
    }
}