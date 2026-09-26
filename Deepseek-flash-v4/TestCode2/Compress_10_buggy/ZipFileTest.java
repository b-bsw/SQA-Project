package org.apache.commons.compress.archivers.zip;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ZipFileTest {
    
    private static final String TEST_ZIP = "test.zip";
    
    @Before
    public void setUp() throws IOException {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(TEST_ZIP);
        java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(fos);
        java.util.zip.ZipEntry entry = new java.util.zip.ZipEntry("test.txt");
        zos.putNextEntry(entry);
        zos.write("Hello World".getBytes());
        zos.closeEntry();
        zos.close();
    }
    
    @Test
    public void testClose() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        zipFile.close();
        assertTrue(true);
    }
    
    @Test
    public void testCloseQuietly() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        ZipFile.closeQuietly(zipFile);
        assertTrue(true);
    }
    
    @Test
    public void testCloseQuietlyNull() {
        ZipFile.closeQuietly(null);
        assertTrue(true);
    }
    
    @Test(expected = IOException.class)
    public void testCloseTwice() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        zipFile.close();
        zipFile.close();
    }
    
    @Test(expected = IOException.class)
    public void testReadAfterClose() throws IOException, ZipException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        zipFile.close();
        ZipArchiveEntry entry = zipFile.getEntry("test.txt");
        if (entry != null) {
            zipFile.getInputStream(entry);
        }
    }
    
    @Test
    public void testGetEncodingDefault() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        assertEquals(ZipEncodingHelper.UTF8, zipFile.getEncoding());
        zipFile.close();
    }
    
    @Test
    public void testGetEncodingCustom() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP, "UTF-16");
        assertEquals("UTF-16", zipFile.getEncoding());
        zipFile.close();
    }
    
    @Test
    public void testGetEntry() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        assertNotNull(zipFile.getEntry("test.txt"));
        zipFile.close();
    }
    
    @Test
    public void testGetEntryNull() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        assertNull(zipFile.getEntry("nonexistent.txt"));
        zipFile.close();
    }
    
    @Test
    public void testGetEntries() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        assertTrue(entries.hasMoreElements());
        assertEquals("test.txt", entries.nextElement().getName());
        zipFile.close();
    }
    
    @Test
    public void testGetEntriesInPhysicalOrder() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntriesInPhysicalOrder();
        assertTrue(entries.hasMoreElements());
        zipFile.close();
    }
    
    @Test
    public void testGetInputStreamNull() throws IOException, ZipException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        assertNull(zipFile.getInputStream(null));
        zipFile.close();
    }
    
    @Test
    public void testGetInputStreamNotFound() throws IOException, ZipException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        ZipArchiveEntry entry = zipFile.getEntry("nonexistent");
        assertNotNull(entry);
        zipFile.close();
    }
    
    @Test
    public void testGetInputStreamStored() throws IOException, ZipException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        ZipArchiveEntry entry = zipFile.getEntry("test.txt");
        if (entry != null) {
            InputStream is = zipFile.getInputStream(entry);
            assertNotNull(is);
            byte[] data = new byte[11];
            int read = is.read(data);
            assertEquals(11, read);
            assertEquals("Hello World", new String(data));
            is.close();
        }
        zipFile.close();
    }
    
    @Test
    public void testCanReadEntryData() throws IOException {
        ZipFile zipFile = new ZipFile(TEST_ZIP);
        ZipArchiveEntry entry = zipFile.getEntry("test.txt");
        if (entry != null) {
            assertTrue(zipFile.canReadEntryData(entry));
        }
        zipFile.close();
    }
}