package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.zip.ZipException;

public class ZipArchiveEntryTest {

    private ZipArchiveEntry entry;

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test.txt");
    }

    @Test
    public void testConstructorWithString() {
        assertEquals("test.txt", entry.getName());
        assertFalse(entry.isDirectory());
        assertEquals(0, entry.getPlatform());
    }

    @Test
    public void testConstructorWithStringDirectory() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("testdir/");
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testConstructorWithFile() {
        File file = new File("test.txt");
        if (file.exists() || !file.isDirectory()) {
            ZipArchiveEntry fileEntry = new ZipArchiveEntry(file, "test.txt");
            assertEquals("test.txt", fileEntry.getName());
        }
    }

    @Test
    public void testConstructorWithFileDirectory() {
        File dir = new File("testdir");
        if (dir.isDirectory() || !dir.exists()) {
            ZipArchiveEntry dirEntry = new ZipArchiveEntry(dir, "testdir");
            assertEquals("testdir/", dirEntry.getName());
            assertTrue(dirEntry.isDirectory());
        }
    }

    @Test
    public void testSetMethodNegative() {
        try {
            entry.setMethod(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("negative"));
        }
    }

    @Test
    public void testSetMethodValid() {
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test
    public void testSetSizeNegative() {
        try {
            entry.setSize(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid entry size"));
        }
    }

    @Test
    public void testSetSizeValid() {
        entry.setSize(100);
        assertEquals(100, entry.getSize());
    }

    @Test
    public void testSetUnixMode() {
        entry.setUnixMode(0644);
        assertEquals(3, entry.getPlatform());
        int unixMode = entry.getUnixMode();
        assertTrue((unixMode & 0644) != 0);
    }

    @Test
    public void testGetUnixModePlatformNotUnix() {
        entry.setPlatform(0);
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetNameNull() {
        ZipArchiveEntry e = new ZipArchiveEntry((String) null);
        assertNotNull(e.getName());
    }

    @Test
    public void testGetNameBackslashReplacement() {
        ZipArchiveEntry e = new ZipArchiveEntry("dir\\file.txt");
        assertEquals("dir/file.txt", e.getName());
    }

    @Test
    public void testSetNameWithPlatformUnix() {
        ZipArchiveEntry e = new ZipArchiveEntry("");
        e.setPlatform(3);
        e.setName("dir\\file.txt");
        assertEquals("dir\\file.txt", e.getName());
    }

    @Test
    public void testSetNameWithRawName() {
        byte[] raw = new byte[] {65, 66, 67};
        entry.setName("abc", raw);
        assertArrayEquals(raw, entry.getRawName());
    }

    @Test
    public void testGetRawNameNull() {
        assertNull(entry.getRawName());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        entry.setExternalAttributes(123);
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
    }

    @Test
    public void testHashCode() {
        assertEquals(entry.getName().hashCode(), entry.hashCode());
    }

    @Test
    public void testEqualsSame() {
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(entry.equals("test.txt"));
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry other = new ZipArchiveEntry("other.txt");
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEqualsSameValues() {
        ZipArchiveEntry other = new ZipArchiveEntry("test.txt");
        assertTrue(entry.equals(other));
    }

    @Test
    public void testAddExtraField() {
        ZipShort headerId = new ZipShort(1);
        ZipExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(headerId);
        entry.addExtraField(field);
        assertNotNull(entry.getExtraField(headerId));
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipShort headerId = new ZipShort(2);
        ZipExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(headerId);
        entry.addAsFirstExtraField(field);
        assertEquals(field, entry.getExtraField(headerId));
    }

    @Test
    public void testRemoveExtraFieldNoSuchElement() {
        ZipShort headerId = new ZipShort(99);
        try {
            entry.removeExtraField(headerId);
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void testRemoveUnparseableExtraFieldDataNoSuchElement() {
        try {
            entry.removeUnparseableExtraFieldData();
            fail("Expected NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtraInvalidData() {
        entry.setExtra(new byte[] {0, 1, 2, 3});
    }

    @Test
    public void testGetLocalFileDataExtra() {
        assertNotNull(entry.getLocalFileDataExtra());
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testConstructorWithZipEntryNullExtra() throws ZipException {
        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("entry.txt");
        zipEntry.setExtra((byte[]) null);
        ZipArchiveEntry e = new ZipArchiveEntry(zipEntry);
        assertEquals("entry.txt", e.getName());
    }

    @Test
    public void testConstructorWithZipArchiveEntry() throws ZipException {
        entry.setInternalAttributes(10);
        entry.setExternalAttributes(20);
        ZipArchiveEntry copy = new ZipArchiveEntry(entry);
        assertEquals(10, copy.getInternalAttributes());
        assertEquals(20, copy.getExternalAttributes());
    }

    @Test
    public void testConstructorWithFileAndDirectory() {
        File file = new File(".");
        String name = "testdir";
        ZipArchiveEntry e = new ZipArchiveEntry(file, name);
        assertTrue(e.getName().endsWith("/"));
    }

    @Test
    public void testSetGeneralPurposeBit() {
        GeneralPurposeBit bit = new GeneralPurposeBit();
        bit.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(bit);
        assertTrue(entry.getGeneralPurposeBit().usesUTF8ForNames());
    }

    @Test
    public void testGetExtraFieldsEmpty() {
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testGetExtraFieldsIncludeUnparseable() {
        assertEquals(0, entry.getExtraFields(true).length);
    }
}