package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class ZipArchiveEntryTest {

    private ZipArchiveEntry entry;

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test.txt");
    }

    @After
    public void tearDown() {
        entry = null;
    }

    @Test
    public void testConstructorStringNormal() {
        ZipArchiveEntry e = new ZipArchiveEntry("hello.txt");
        assertEquals("hello.txt", e.getName());
        assertFalse(e.isDirectory());
    }

    @Test
    public void testConstructorStringEmpty() {
        ZipArchiveEntry e = new ZipArchiveEntry("");
        assertEquals("", e.getName());
        assertFalse(e.isDirectory());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorStringNull() {
        new ZipArchiveEntry((String) null);
    }

    @Test
    public void testConstructorZipEntryNormal() throws ZipException {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("file.txt");
        ze.setMethod(ZipEntry.STORED);
        ze.setSize(100);
        ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals("file.txt", e.getName());
        assertEquals(ZipEntry.STORED, e.getMethod());
        assertEquals(100, e.getSize());
    }

    @Test(expected = ZipException.class)
    public void testConstructorZipEntryExtraParsingError() throws ZipException {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("bad.zip");
        ze.setExtra(new byte[] {(byte)0xFF, (byte)0xFF, (byte)0xFF});
        new ZipArchiveEntry(ze);
    }

    @Test
    public void testConstructorZipArchiveEntryCopy() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("original.txt");
        original.setMethod(ZipEntry.DEFLATED);
        original.setInternalAttributes(1);
        original.setExternalAttributes(2);
        original.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals("original.txt", copy.getName());
        assertEquals(ZipEntry.DEFLATED, copy.getMethod());
        assertEquals(1, copy.getInternalAttributes());
        assertEquals(2, copy.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, copy.getPlatform());
    }

    @Test
    public void testConstructorFileDirectory() {
        File dir = new File("/tmp/dir");
        ZipArchiveEntry e = new ZipArchiveEntry(dir, "mydir");
        assertTrue(e.isDirectory());
        assertEquals("mydir/", e.getName());
        assertEquals(dir.lastModified(), e.getTime());
    }

    @Test
    public void testConstructorFileRegular() {
        File file = new File("/tmp/testfile.txt");
        if (file.exists()) {
            ZipArchiveEntry e = new ZipArchiveEntry(file, "test.txt");
            assertEquals("test.txt", e.getName());
            assertFalse(e.isDirectory());
            assertEquals(file.length(), e.getSize());
        }
    }

    @Test
    public void testClone() {
        entry.setMethod(ZipEntry.DEFLATED);
        entry.setInternalAttributes(5);
        entry.setExternalAttributes(10);
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertNotSame(entry, cloned);
        assertEquals(entry.getMethod(), cloned.getMethod());
        assertEquals(entry.getInternalAttributes(), cloned.getInternalAttributes());
        assertEquals(entry.getExternalAttributes(), cloned.getExternalAttributes());
    }

    @Test
    public void testSetMethodNormal() {
        entry.setMethod(ZipEntry.STORED);
        assertEquals(ZipEntry.STORED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        entry.setMethod(-1);
    }

    @Test
    public void testSetMethodZero() {
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
    }

    @Test
    public void testGetSetInternalAttributes() {
        entry.setInternalAttributes(12345);
        assertEquals(12345, entry.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes() {
        entry.setExternalAttributes(99999L);
        assertEquals(99999L, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixModeDirectory() {
        entry = new ZipArchiveEntry("mydir/");
        entry.setUnixMode(0755);
        assertTrue(entry.isDirectory());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testSetUnixModeFile() {
        entry.setUnixMode(0644);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        int mode = entry.getUnixMode();
        assertEquals(0644, mode & 0777);
    }

    @Test
    public void testSetUnixModeSymlink() {
        entry.setUnixMode(0120777);
        assertTrue(entry.isUnixSymlink());
    }

    @Test
    public void testGetUnixModeNotUnix() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetPlatformDefault() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetPlatform() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testSetExtraFieldsWithUnparseable() throws Exception {
        ZipExtraField[] fields = new ZipExtraField[0];
        entry.setExtraFields(fields);
        assertNotNull(entry.getExtraFields());
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testGetExtraFieldsIncludeUnparseable() {
        ZipExtraField[] all = entry.getExtraFields(true);
        assertNotNull(all);
    }

    @Test
    public void testAddExtraFieldNormal() throws Exception {
        ZipShort id = new ZipShort(0x5855);
        ZipExtraField field = new X5455_ExtendedTimestamp();
        entry.addExtraField(field);
        assertSame(field, entry.getExtraField(id));
    }

    @Test
    public void testAddExtraFieldReplacesExisting() throws Exception {
        ZipShort id = new ZipShort(0x5855);
        X5455_ExtendedTimestamp first = new X5455_ExtendedTimestamp();
        X5455_ExtendedTimestamp second = new X5455_ExtendedTimestamp();
        entry.addExtraField(first);
        entry.addExtraField(second);
        assertSame(second, entry.getExtraField(id));
    }

    @Test
    public void testAddAsFirstExtraField() throws Exception {
        ZipShort id = new ZipShort(0x000a);
        ZipExtraField firstField = new X5455_ExtendedTimestamp();
        entry.addAsFirstExtraField(firstField);
        assertEquals(firstField, entry.getExtraFields()[0]);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraFieldNotPresent() {
        entry.removeExtraField(new ZipShort(0x0001));
    }

    @Test
    public void testRemoveExtraFieldPresent() throws Exception {
        ZipShort id = new ZipShort(0x0001);
        X5455_ExtendedTimestamp field = new X5455_ExtendedTimestamp();
        entry.addExtraField(field);
        entry.removeExtraField(id);
        assertNull(entry.getExtraField(id));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldDataNotPresent() {
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testRemoveUnparseableExtraFieldDataPresent() throws Exception {
        UnparseableExtraFieldData u = new UnparseableExtraFieldData();
        entry.addExtraField(u);
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testGetExtraFieldNotFound() {
        assertNull(entry.getExtraField(new ZipShort(0x9999)));
    }

    @Test
    public void testSetExtraWithValidData() throws Exception {
        byte[] extra = new byte[] {0x55, 0x54, 0x05, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00};
        entry.setExtra(extra);
        assertNotNull(entry.getExtra());
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtraInvalidData() {
        entry.setExtra(new byte[] {(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF});
    }

    @Test
    public void testGetLocalFileDataExtra() {
        byte[] extra = entry.getLocalFileDataExtra();
        assertNotNull(extra);
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        byte[] centralExtra = entry.getCentralDirectoryExtra();
        assertNotNull(centralExtra);
    }

    @Test
    public void testGetNameReturnsOverriddenName() {
        entry.setName("override.txt");
        assertEquals("override.txt", entry.getName());
    }

    @Test
    public void testIsDirectoryTrue() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("folder/");
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testIsDirectoryFalse() {
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testSetNameWithBackslashOnFAT() {
        entry.setName("a\\b\\c.txt");
        assertEquals("a/b/c.txt", entry.getName());
    }

    @Test
    public void testSetNameWithBackslashOnUnix() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        entry.setName("a\\b\\c.txt");
        assertEquals("a\\b\\c.txt", entry.getName());
    }

    @Test
    public void testSetSizeNormal() {
        entry.setSize(1024);
        assertEquals(1024, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        entry.setSize(-5);
    }

    @Test
    public void testSetSizeZero() {
        entry.setSize(0);
        assertEquals(0, entry.getSize());
    }

    @Test
    public void testSetNameRawName() {
        byte[] raw = new byte[] {0x61, 0x62, 0x63};
        entry.setName("abc", raw);
        assertEquals("abc", entry.getName());
        assertArrayEquals(raw, entry.getRawName());
    }

    @Test
    public void testGetRawNameReturnsCopy() {
        byte[] raw = new byte[] {0x01, 0x02};
        entry.setName("test", raw);
        byte[] result = entry.getRawName();
        assertNotSame(raw, result);
        assertArrayEquals(raw, result);
    }

    @Test
    public void testGetRawNameNull() {
        assertNull(entry.getRawName());
    }

    @Test
    public void testHashCode() {
        ZipArchiveEntry other = new ZipArchiveEntry("test.txt");
        assertEquals(other.hashCode(), entry.hashCode());
    }

    @Test
    public void testGetGeneralPurposeBitDefault() {
        assertNotNull(entry.getGeneralPurposeBit());
    }

    @Test
    public void testSetGeneralPurposeBit() {
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(gpb);
        assertTrue(entry.getGeneralPurposeBit().usesUTF8ForNames());
    }

    @Test
    public void testGetLastModifiedDate() {
        assertNotNull(entry.getLastModifiedDate());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(entry.equals("string"));
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry other = new ZipArchiveEntry("other.txt");
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEqualsSameNameDifferentAttributes() {
        ZipArchiveEntry other = new ZipArchiveEntry("test.txt");
        other.setMethod(ZipEntry.DEFLATED);
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEqualsSameNameSameAttributes() {
        ZipArchiveEntry other = new ZipArchiveEntry("test.txt");
        assertTrue(entry.equals(other));
    }

    @Test
    public void testSetVersionMadeByAndRequired() {
        entry.setVersionMadeBy(20);
        entry.setVersionRequired(10);
        assertEquals(20, entry.getVersionMadeBy());
        assertEquals(10, entry.getVersionRequired());
    }

    @Test
    public void testGetSetRawFlag() {
        entry.setRawFlag(1234);
        assertEquals(1234, entry.getRawFlag());
    }
}