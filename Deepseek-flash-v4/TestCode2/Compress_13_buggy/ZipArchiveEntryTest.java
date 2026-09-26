package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.zip.ZipException;
import java.util.zip.ZipEntry;
import java.io.File;

public class ZipArchiveEntryTest {

    @Test
    public void testConstructorString() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", entry.getName());
        assertEquals(-1, entry.getMethod());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testConstructorStringDirectory() {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testConstructorZipEntry() throws ZipException {
        ZipEntry ze = new ZipEntry("entry.txt");
        ze.setMethod(ZipEntry.STORED);
        ze.setSize(100);
        ZipArchiveEntry entry = new ZipArchiveEntry(ze);
        assertEquals("entry.txt", entry.getName());
        assertEquals(ZipEntry.STORED, entry.getMethod());
        assertEquals(100, entry.getSize());
    }

    @Test(expected = ZipException.class)
    public void testConstructorZipEntryNullExtraThrows() throws ZipException {
        new ZipArchiveEntry(new java.util.zip.ZipEntry("test"));
    }

    @Test
    public void testConstructorZipArchiveEntry() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("orig.txt");
        original.setInternalAttributes(1);
        original.setExternalAttributes(2L);
        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals(original.getName(), copy.getName());
        assertEquals(1, copy.getInternalAttributes());
        assertEquals(2L, copy.getExternalAttributes());
    }

    @Test
    public void testConstructorFileDirectory() {
        File dir = new File("/tmp/dir");
        ZipArchiveEntry entry = new ZipArchiveEntry(dir, "dir");
        assertTrue(entry.getName().endsWith("/"));
    }

    @Test
    public void testConstructorFileFile() throws Exception {
        File f = File.createTempFile("test", ".txt");
        f.deleteOnExit();
        ZipArchiveEntry entry = new ZipArchiveEntry(f, f.getName());
        assertEquals(f.length(), entry.getSize());
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testSetMethodValid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setMethod(-1);
    }

    @Test
    public void testGetSetInternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setInternalAttributes(1234);
        assertEquals(1234, entry.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setExternalAttributes(0xABCDEF1234L);
        assertEquals(0xABCDEF1234L, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixMode() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testGetUnixModeNonUnix() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetPlatformDefault() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetPlatform() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testSetExtraFields() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testGetExtraFieldsEmpty() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testGetExtraFieldsIncludeUnparseableNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testAddExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        AsiExtraField field = new AsiExtraField();
        field.setHeaderId(new ZipShort(0x4141));
        field.setDirectory(true);
        entry.addExtraField(field);
        assertNotNull(entry.getExtraField(new ZipShort(0x4141)));
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        AsiExtraField field = new AsiExtraField();
        field.setHeaderId(new ZipShort(0x4141));
        entry.addAsFirstExtraField(field);
        assertNotNull(entry.getExtraField(new ZipShort(0x4141)));
    }

    @Test
    public void testRemoveExtraFieldSuccess() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        AsiExtraField field = new AsiExtraField();
        field.setHeaderId(new ZipShort(0x4141));
        entry.addExtraField(field);
        entry.removeExtraField(new ZipShort(0x4141));
        assertNull(entry.getExtraField(new ZipShort(0x4141)));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraFieldNoSuchElement() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeExtraField(new ZipShort(0x9999));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldDataNoData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testGetExtraFieldNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNull(entry.getExtraField(new ZipShort(0x1111)));
    }

    @Test
    public void testGetUnparseableExtraFieldData() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtraByteArray() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setExtra(new byte[0]);
        assertNotNull(entry.getExtra());
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtraByteArrayInvalid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setExtra(new byte[] {0, 1, 2});
    }

    @Test
    public void testSetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setCentralDirectoryExtra(new byte[0]);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testGetLocalFileDataExtraNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNotNull(entry.getLocalFileDataExtra());
        assertEquals(0, entry.getLocalFileDataExtra().length);
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testGetName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("myname");
        assertEquals("myname", entry.getName());
    }

    @Test
    public void testIsDirectoryTrue() {
        ZipArchiveEntry entry = new ZipArchiveEntry("mydir/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testIsDirectoryFalse() {
        ZipArchiveEntry entry = new ZipArchiveEntry("file.txt");
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testSetName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("old");
        entry.setName("new");
        assertEquals("new", entry.getName());
    }

    @Test
    public void testGetSizeDefault() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertEquals(-1L, entry.getSize());
    }

    @Test
    public void testSetSizeValid() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(500L);
        assertEquals(500L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setSize(-1L);
    }

    @Test
    public void testSetNameWithRawName() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setName("raw", new byte[] {1, 2, 3});
        assertEquals("raw", entry.getName());
        assertNotNull(entry.getRawName());
    }

    @Test
    public void testGetRawNameNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNull(entry.getRawName());
    }

    @Test
    public void testHashCode() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("abc");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("abc");
        assertEquals(entry1.hashCode(), entry2.hashCode());
    }

    @Test
    public void testGetGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertNotNull(entry.getGeneralPurposeBit());
    }

    @Test
    public void testSetGeneralPurposeBit() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb);
        assertTrue(entry.getGeneralPurposeBit().usesDataDescriptor());
    }

    @Test
    public void testGetLastModifiedDate() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        entry.setTime(1000L);
        assertEquals(new java.util.Date(1000L), entry.getLastModifiedDate());
    }

    @Test
    public void testEqualsSameObject() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsNull() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        assertFalse(entry.equals("string"));
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a");
        ZipArchiveEntry e2 = new ZipArchiveEntry("b");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsSameName() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("same");
        ZipArchiveEntry e2 = new ZipArchiveEntry("same");
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEqualsNullName() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a");
        e1.setName(null);
        ZipArchiveEntry e2 = new ZipArchiveEntry("b");
        assertFalse(e1.equals(e2));
        assertFalse(e2.equals(e1));
        ZipArchiveEntry e3 = new ZipArchiveEntry(null);
        e3.setName(null);
        assertTrue(e1.equals(e3));
    }

    @Test
    public void testClone() throws Exception {
        ZipArchiveEntry original = new ZipArchiveEntry("original");
        original.setMethod(8);
        original.setSize(200);
        original.setInternalAttributes(42);
        original.setExternalAttributes(99L);
        ZipArchiveEntry cloned = (ZipArchiveEntry) original.clone();
        assertEquals(original.getName(), cloned.getName());
        assertEquals(original.getMethod(), cloned.getMethod());
        assertEquals(original.getSize(), cloned.getSize());
        assertEquals(original.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(original.getExternalAttributes(), cloned.getExternalAttributes());
    }

    @Test
    public void testMergeExtraFieldsLocal() throws ZipException {
        ZipArchiveEntry entry = new ZipArchiveEntry("test");
        AsiExtraField field = new AsiExtraField();
        field.setHeaderId(new ZipShort(0x4141));
        entry.mergeExtraFields(new ZipExtraField[] {field}, true);
        assertNotNull(entry.getExtraField(new ZipShort(0x4141)));
    }
}