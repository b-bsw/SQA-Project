package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.zip.ZipException;
import java.io.File;

public class ZipArchiveEntryTest {

    private ZipArchiveEntry entry;

    @Before
    public void setUp() throws ZipException {
        entry = new ZipArchiveEntry("test.txt");
    }

    @Test
    public void testConstructorWithString() {
        ZipArchiveEntry e = new ZipArchiveEntry("test.txt");
        assertEquals("test.txt", e.getName());
        assertFalse(e.isDirectory());
        assertEquals(-1, e.getMethod());
        assertEquals(0, e.getInternalAttributes());
        assertEquals(0, e.getExternalAttributes());
        assertEquals(PLATFORM_FAT, e.getPlatform());
    }

    @Test
    public void testConstructorWithZipEntry() throws ZipException {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("test.dat");
        ze.setMethod(java.util.zip.ZipEntry.DEFLATED);
        ZipArchiveEntry e = new ZipArchiveEntry(ze);
        assertEquals("test.dat", e.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, e.getMethod());
    }

    @Test(expected = ZipException.class)
    public void testConstructorWithZipEntryInvalidExtra() throws ZipException {
        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry("invalid.extra");
        ze.setExtra(new byte[]{0x00, 0x01, 0x02});
        new ZipArchiveEntry(ze);
    }

    @Test
    public void testConstructorWithCopy() throws ZipException {
        entry.setInternalAttributes(42);
        entry.setExternalAttributes(12345L);
        ZipArchiveEntry clone = new ZipArchiveEntry(entry);
        assertEquals(entry.getName(), clone.getName());
        assertEquals(42, clone.getInternalAttributes());
        assertEquals(12345L, clone.getExternalAttributes());
    }

    @Test
    public void testConstructorWithFileAndEntryName() {
        File f = new File("/tmp/testdir/");
        ZipArchiveEntry e = new ZipArchiveEntry(f, "myfile");
        assertEquals("myfile/", e.getName());
        assertTrue(e.isDirectory());
        assertTrue(e.getSize() == 0 || e.getSize() > 0);
    }

    @Test
    public void testConstructorWithFileRegular() {
        File f = new File("/tmp/regular.txt");
        ZipArchiveEntry e = new ZipArchiveEntry(f, "regular.txt");
        assertEquals("regular.txt", e.getName());
        assertFalse(e.isDirectory());
    }

    @Test
    public void testCloneMethod() throws Exception {
        entry.setMethod(ZipArchiveEntry.STORED);
        entry.setInternalAttributes(100);
        entry.setExternalAttributes(200L);
        ZipArchiveEntry clone = (ZipArchiveEntry) entry.clone();
        assertEquals(entry.getName(), clone.getName());
        assertEquals(entry.getMethod(), clone.getMethod());
        assertEquals(100, clone.getInternalAttributes());
        assertEquals(200L, clone.getExternalAttributes());
    }

    @Test
    public void testIsSupportedCompressionMethod() {
        entry.setMethod(ZipArchiveEntry.STORED);
        assertTrue(entry.isSupportedCompressionMethod());
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertTrue(entry.isSupportedCompressionMethod());
        entry.setMethod(0);
        assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testSetMethodValid() {
        entry.setMethod(ZipArchiveEntry.STORED);
        assertEquals(ZipArchiveEntry.STORED, entry.getMethod());
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMethodNegative() {
        entry.setMethod(-5);
    }

    @Test
    public void testGetDefaultMethod() {
        assertEquals(-1, entry.getMethod());
    }

    @Test
    public void testGetSetInternalAttributes() {
        entry.setInternalAttributes(0xFF);
        assertEquals(0xFF, entry.getInternalAttributes());
    }

    @Test
    public void testGetSetExternalAttributes() {
        entry.setExternalAttributes(0xABCDEFL);
        assertEquals(0xABCDEFL, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixMode() {
        entry.setName("mydir/");
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testSetUnixModeReadOnly() {
        entry.setName("readonly.txt");
        entry.setUnixMode(0444);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertFalse(entry.isDirectory());
        assertTrue((entry.getExternalAttributes() & 1) != 0);
    }

    @Test
    public void testGetUnixModeWithNonUnixPlatform() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetUnixModeWithUnixPlatform() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        entry.setExternalAttributes(0x81A40000L);
        assertEquals(0x81A4, entry.getUnixMode());
    }

    @Test
    public void testGetPlatformDefault() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetPlatformProtected() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testSetExtraFieldsNull() {
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testSetExtraFieldsWithValues() {
        ZipShort headerId = new ZipShort(0x1234);
        byte[] data = {0x01, 0x02};
        ZipExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(headerId);
        field.setLocalFileDataData(data);
        entry.setExtraFields(new ZipExtraField[]{field});
        assertEquals(1, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(headerId));
    }

    @Test
    public void testGetExtraFieldsWhenNull() {
        assertNotNull(entry.getExtraFields());
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testAddExtraFieldFirstTime() {
        ZipShort headerId = new ZipShort(0x5678);
        UnrecognizedExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(headerId);
        field.setLocalFileDataData(new byte[]{0x05});
        entry.addExtraField(field);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testAddExtraFieldReplaceExisting() {
        ZipShort headerId = new ZipShort(0x1111);
        UnrecognizedExtraField field1 = new UnrecognizedExtraField();
        field1.setHeaderId(headerId);
        field1.setLocalFileDataData(new byte[]{0x01});
        entry.addExtraField(field1);

        UnrecognizedExtraField field2 = new UnrecognizedExtraField();
        field2.setHeaderId(headerId);
        field2.setLocalFileDataData(new byte[]{0x02});
        entry.addExtraField(field2);

        assertEquals(1, entry.getExtraFields().length);
        assertEquals(0x02, entry.getExtraField(headerId).getLocalFileDataData()[0]);
    }

    @Test
    public void testAddAsFirstExtraFieldNullExtraFields() {
        ZipShort headerId = new ZipShort(0x2222);
        UnrecognizedExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(headerId);
        field.setLocalFileDataData(new byte[]{0x03});
        entry.addAsFirstExtraField(field);
        assertEquals(1, entry.getExtraFields().length);
    }

    @Test
    public void testAddAsFirstExtraFieldExisting() {
        ZipShort headerId1 = new ZipShort(0x3333);
        ZipShort headerId2 = new ZipShort(0x4444);
        UnrecognizedExtraField field1 = new UnrecognizedExtraField();
        field1.setHeaderId(headerId1);
        field1.setLocalFileDataData(new byte[]{0x11});
        entry.addExtraField(field1);

        UnrecognizedExtraField field2 = new UnrecognizedExtraField();
        field2.setHeaderId(headerId2);
        field2.setLocalFileDataData(new byte[]{0x22});
        entry.addAsFirstExtraField(field2);

        assertEquals(2, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(headerId1));
        assertNotNull(entry.getExtraField(headerId2));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraFieldNullMap() {
        entry.removeExtraField(new ZipShort(0x0000));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraFieldNonExistent() {
        UnrecognizedExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(new ZipShort(0x5555));
        field.setLocalFileDataData(new byte[]{0x77});
        entry.addExtraField(field);
        entry.removeExtraField(new ZipShort(0x6666));
    }

    @Test
    public void testRemoveExtraFieldValid() {
        ZipShort headerId = new ZipShort(0x7777);
        UnrecognizedExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(headerId);
        field.setLocalFileDataData(new byte[]{0x88});
        entry.addExtraField(field);
        entry.removeExtraField(headerId);
        assertNull(entry.getExtraField(headerId));
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testGetExtraFieldNull() {
        assertNull(entry.getExtraField(new ZipShort(0x0001)));
    }

    @Test
    public void testGetExtraFieldPresent() {
        ZipShort headerId = new ZipShort(0x8888);
        UnrecognizedExtraField field = new UnrecognizedExtraField();
        field.setHeaderId(headerId);
        field.setLocalFileDataData(new byte[]{0x99});
        entry.addExtraField(field);
        assertNotNull(entry.getExtraField(headerId));
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtraInvalid() {
        entry.setExtra(new byte[]{0x00});
    }

    @Test
    public void testSetExtraValid() {
        byte[] extra = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
        entry.setExtra(extra);
        assertNotNull(entry.getExtra());
    }

    @Test
    public void testSetExtraProtected() {
        entry.setExtra();
        assertNotNull(entry.getExtra());
    }

    @Test
    public void testSetCentralDirectoryExtra() {
        byte[] data = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
        entry.setCentralDirectoryExtra(data);
    }

    @Test(expected = RuntimeException.class)
    public void testSetCentralDirectoryExtraInvalid() {
        entry.setCentralDirectoryExtra(new byte[]{0x00});
    }

    @Test
    public void testGetLocalFileDataExtra() {
        byte[] extra = entry.getLocalFileDataExtra();
        assertNotNull(extra);
    }

    @Test
    public void testGetLocalFileDataExtraWithExtra() {
        entry.setExtra();
        byte[] extra = entry.getLocalFileDataExtra();
        assertNotNull(extra);
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        byte[] central = entry.getCentralDirectoryExtra();
        assertNotNull(central);
    }

    @Test
    public void testGetNameDefault() {
        ZipArchiveEntry e = new ZipArchiveEntry("default.txt");
        assertEquals("default.txt", e.getName());
    }

    @Test
    public void testSetNameThenGetName() {
        entry.setName("newname.xml");
        assertEquals("newname.xml", entry.getName());
    }

    @Test
    public void testIsDirectoryTrue() {
        entry.setName("somedir/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testIsDirectoryFalse() {
        entry.setName("file.txt");
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testHashCode() {
        entry.setName("hashcheck");
        assertEquals("hashcheck".hashCode(), entry.hashCode());
    }

    @Test
    public void testGetLastModifiedDate() {
        long time = 123456789L;
        entry.setTime(time);
        assertEquals(new Date(time), entry.getLastModifiedDate());
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
    public void testEqualsSameName() throws ZipException {
        ZipArchiveEntry other = new ZipArchiveEntry("test.txt");
        assertTrue(entry.equals(other));
    }

    @Test
    public void testEqualsNullNameOtherNotNullName() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry("name1");
        ZipArchiveEntry e2 = new ZipArchiveEntry("name2");
        e1.name = null;
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsNullNameBothNull() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a");
        ZipArchiveEntry e2 = new ZipArchiveEntry("b");
        e1.name = null;
        e2.name = null;
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testConstructorDefault() {
        ZipArchiveEntry e = new ZipArchiveEntry();
        assertEquals("", e.getName());
    }

    @Test
    public void testGetPlatformAfterSetUnixMode() {
        entry.setName("test/");
        entry.setUnixMode(0755);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testSetExtraFieldsPreservesExisting() throws ZipException {
        ZipShort headerId1 = new ZipShort(0x1000);
        UnrecognizedExtraField field1 = new UnrecognizedExtraField();
        field1.setHeaderId(headerId1);
        field1.setLocalFileDataData(new byte[]{0x10});
        entry.addExtraField(field1);

        ZipShort headerId2 = new ZipShort(0x2000);
        UnrecognizedExtraField field2 = new UnrecognizedExtraField();
        field2.setHeaderId(headerId2);
        field2.setLocalFileDataData(new byte[]{0x20});
        entry.setExtraFields(new ZipExtraField[]{field2});

        assertEquals(1, entry.getExtraFields().length);
        assertNull(entry.getExtraField(headerId1));
        assertNotNull(entry.getExtraField(headerId2));
    }
}