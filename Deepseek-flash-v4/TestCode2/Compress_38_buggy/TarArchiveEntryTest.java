package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveEntryTest {

    private TarArchiveEntry entry;

    @Before
    public void setUp() {
        entry = new TarArchiveEntry("test");
    }

    @After
    public void tearDown() {
        entry = null;
    }

    @Test
    public void testConstructorString() {
        TarArchiveEntry e = new TarArchiveEntry("testfile.txt");
        assertEquals("testfile.txt", e.getName());
        assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, e.getMode());
        assertEquals(TarArchiveEntry.LF_NORMAL, e.getLinkFlag());
    }

    @Test
    public void testConstructorStringDir() {
        TarArchiveEntry e = new TarArchiveEntry("mydir/");
        assertTrue(e.isDirectory());
        assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, e.getMode());
        assertEquals(TarArchiveEntry.LF_DIR, e.getLinkFlag());
    }

    @Test
    public void testConstructorStringEmptyName() {
        TarArchiveEntry e = new TarArchiveEntry("");
        assertEquals("", e.getName());
        assertFalse(e.isDirectory());
    }

    @Test
    public void testConstructorStringPreserveLeadingSlashes() {
        TarArchiveEntry e = new TarArchiveEntry("/absolute/path", true);
        assertEquals("/absolute/path", e.getName());
    }

    @Test
    public void testConstructorStringPreserveLeadingSlashesFalse() {
        TarArchiveEntry e = new TarArchiveEntry("/absolute/path", false);
        assertEquals("absolute/path", e.getName());
    }

    @Test
    public void testConstructorStringByteLinkFlag() {
        TarArchiveEntry e = new TarArchiveEntry("link", TarArchiveEntry.LF_SYMLINK);
        assertEquals("link", e.getName());
        assertEquals(TarArchiveEntry.LF_SYMLINK, e.getLinkFlag());
    }

    @Test
    public void testConstructorStringByteLinkFlagLongName() {
        TarArchiveEntry e = new TarArchiveEntry("longname", TarArchiveEntry.LF_GNUTYPE_LONGNAME);
        assertEquals(TarArchiveEntry.MAGIC_GNU, e.magic);
        assertEquals(TarArchiveEntry.VERSION_GNU_SPACE, e.version);
    }

    @Test
    public void testConstructorFile() {
        File f = new File(".");
        TarArchiveEntry e = new TarArchiveEntry(f);
        assertNotNull(e.getFile());
    }

    @Test
    public void testConstructorByteArray() {
        byte[] header = new byte[TarArchiveEntry.HEADERSIZE];
        TarArchiveEntry e = new TarArchiveEntry(header);
        assertNotNull(e);
    }

    @Test
    public void testConstructorByteArrayZipEncoding() throws IOException {
        byte[] header = new byte[TarArchiveEntry.HEADERSIZE];
        ZipEncoding encoding = TarUtils.DEFAULT_ENCODING;
        TarArchiveEntry e = new TarArchiveEntry(header, encoding);
        assertNotNull(e);
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
        assertFalse(entry.equals("string"));
    }

    @Test
    public void testEqualsDifferentName() {
        TarArchiveEntry other = new TarArchiveEntry("other");
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEqualsSameName() {
        TarArchiveEntry other = new TarArchiveEntry("test");
        assertTrue(entry.equals(other));
    }

    @Test
    public void testHashCode() {
        assertEquals(entry.getName().hashCode(), entry.hashCode());
    }

    @Test
    public void testIsDescendentTrue() {
        TarArchiveEntry parent = new TarArchiveEntry("dir");
        TarArchiveEntry child = new TarArchiveEntry("dir/file");
        assertTrue(parent.isDescendent(child));
    }

    @Test
    public void testIsDescendentFalse() {
        TarArchiveEntry parent = new TarArchiveEntry("dir");
        TarArchiveEntry other = new TarArchiveEntry("other/file");
        assertFalse(parent.isDescendent(other));
    }

    @Test
    public void testIsDescendentSelf() {
        TarArchiveEntry e = new TarArchiveEntry("dir");
        assertTrue(e.isDescendent(e));
    }

    @Test
    public void testGetName() {
        assertEquals("test", entry.getName());
    }

    @Test
    public void testSetName() {
        entry.setName("newName");
        assertEquals("newName", entry.getName());
    }

    @Test
    public void testSetMode() {
        entry.setMode(0644);
        assertEquals(0644, entry.getMode());
    }

    @Test
    public void testGetSetLinkName() {
        assertNull(entry.getLinkName());
        entry.setLinkName("linktarget");
        assertEquals("linktarget", entry.getLinkName());
    }

    @Test
    public void testGetUserIdDeprecated() {
        assertEquals(0, entry.getUserId());
    }

    @Test
    public void testSetUserIdInt() {
        entry.setUserId(1000);
        assertEquals(1000L, entry.getLongUserId());
    }

    @Test
    public void testGetLongUserId() {
        assertEquals(0L, entry.getLongUserId());
    }

    @Test
    public void testSetUserIdLong() {
        entry.setUserId(1000L);
        assertEquals(1000L, entry.getLongUserId());
    }

    @Test
    public void testGetGroupIdDeprecated() {
        assertEquals(0, entry.getGroupId());
    }

    @Test
    public void testSetGroupIdInt() {
        entry.setGroupId(500);
        assertEquals(500L, entry.getLongGroupId());
    }

    @Test
    public void testGetLongGroupId() {
        assertEquals(0L, entry.getLongGroupId());
    }

    @Test
    public void testSetGroupIdLong() {
        entry.setGroupId(500L);
        assertEquals(500L, entry.getLongGroupId());
    }

    @Test
    public void testGetSetUserName() {
        assertEquals("", entry.getUserName());
        entry.setUserName("user");
        assertEquals("user", entry.getUserName());
    }

    @Test
    public void testGetSetGroupName() {
        assertEquals("", entry.getGroupName());
        entry.setGroupName("group");
        assertEquals("group", entry.getGroupName());
    }

    @Test
    public void testSetIds() {
        entry.setIds(100, 200);
        assertEquals(100L, entry.getLongUserId());
        assertEquals(200L, entry.getLongGroupId());
    }

    @Test
    public void testSetNames() {
        entry.setNames("u", "g");
        assertEquals("u", entry.getUserName());
        assertEquals("g", entry.getGroupName());
    }

    @Test
    public void testSetModTimeLong() {
        long time = System.currentTimeMillis();
        entry.setModTime(time);
        assertEquals(time / 1000 * 1000, entry.getModTime().getTime());
    }

    @Test
    public void testSetModTimeDate() {
        Date d = new Date();
        entry.setModTime(d);
        assertEquals(d.getTime() / 1000 * 1000, entry.getModTime().getTime());
    }

    @Test
    public void testGetLastModifiedDate() {
        assertNotNull(entry.getLastModifiedDate());
    }

    @Test
    public void testIsCheckSumOK() {
        assertFalse(entry.isCheckSumOK());
    }

    @Test
    public void testGetFile() {
        assertNull(entry.getFile());
    }

    @Test
    public void testGetMode() {
        assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, entry.getMode());
    }

    @Test
    public void testGetSize() {
        assertEquals(0L, entry.getSize());
    }

    @Test
    public void testSetSizePositive() {
        entry.setSize(1024);
        assertEquals(1024L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        entry.setSize(-1);
    }

    @Test
    public void testSetSizeZero() {
        entry.setSize(0);
        assertEquals(0L, entry.getSize());
    }

    @Test
    public void testGetSetDevMajor() {
        assertEquals(0, entry.getDevMajor());
        entry.setDevMajor(3);
        assertEquals(3, entry.getDevMajor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMajorNegative() {
        entry.setDevMajor(-1);
    }

    @Test
    public void testGetSetDevMinor() {
        assertEquals(0, entry.getDevMinor());
        entry.setDevMinor(1);
        assertEquals(1, entry.getDevMinor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMinorNegative() {
        entry.setDevMinor(-1);
    }

    @Test
    public void testIsExtended() {
        assertFalse(entry.isExtended());
    }

    @Test
    public void testGetRealSize() {
        assertEquals(0L, entry.getRealSize());
    }

    @Test
    public void testIsGNUSparse() {
        assertFalse(entry.isGNUSparse());
    }

    @Test
    public void testIsOldGNUSparse() {
        assertFalse(entry.isOldGNUSparse());
    }

    @Test
    public void testIsPaxGNUSparse() {
        assertFalse(entry.isPaxGNUSparse());
    }

    @Test
    public void testIsStarSparse() {
        assertFalse(entry.isStarSparse());
    }

    @Test
    public void testIsGNULongLinkEntry() {
        assertFalse(entry.isGNULongLinkEntry());
    }

    @Test
    public void testIsGNULongNameEntry() {
        assertFalse(entry.isGNULongNameEntry());
    }

    @Test
    public void testIsPaxHeader() {
        assertFalse(entry.isPaxHeader());
    }

    @Test
    public void testIsGlobalPaxHeader() {
        assertFalse(entry.isGlobalPaxHeader());
    }

    @Test
    public void testIsDirectoryForFileEntry() {
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testIsDirectoryForDirEntry() {
        TarArchiveEntry dirEntry = new TarArchiveEntry("mydir/");
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testIsDirectoryNameEndsWithSlash() {
        TarArchiveEntry e = new TarArchiveEntry("dir");
        e.setName("dir/");
        assertTrue(e.isDirectory());
    }

    @Test
    public void testIsFileForFileEntry() {
        assertTrue(entry.isFile());
    }

    @Test
    public void testIsFileForDirEntry() {
        TarArchiveEntry dirEntry = new TarArchiveEntry("mydir/");
        assertFalse(dirEntry.isFile());
    }

    @Test
    public void testIsSymbolicLink() {
        assertFalse(entry.isSymbolicLink());
    }

    @Test
    public void testIsLink() {
        assertFalse(entry.isLink());
    }

    @Test
    public void testIsCharacterDevice() {
        assertFalse(entry.isCharacterDevice());
    }

    @Test
    public void testIsBlockDevice() {
        assertFalse(entry.isBlockDevice());
    }

    @Test
    public void testIsFIFO() {
        assertFalse(entry.isFIFO());
    }

    @Test
    public void testIsSparse() {
        assertFalse(entry.isSparse());
    }

    @Test
    public void testGetDirectoryEntriesNullFile() {
        assertNotNull(entry.getDirectoryEntries());
        assertEquals(0, entry.getDirectoryEntries().length);
    }

    @Test
    public void testGetDirectoryEntriesFileIsNotDirectory() {
        TarArchiveEntry e = new TarArchiveEntry(new File("pom.xml"));
        assertNotNull(e.getDirectoryEntries());
        assertEquals(0, e.getDirectoryEntries().length);
    }

    @Test
    public void testParseTarHeader() {
        byte[] header = new byte[TarArchiveEntry.HEADERSIZE];
        TarArchiveEntry e = new TarArchiveEntry("test");
        e.parseTarHeader(header);
    }

    @Test(expected = RuntimeException.class)
    public void testParseTarHeaderThrowsOnInvalid() {
        byte[] header = new byte[TarArchiveEntry.HEADERSIZE];
        // cause failure in parseName by setting invalid encoding data
        header[0] = (byte) 0xFF;
        TarArchiveEntry e = new TarArchiveEntry("dummy");
        e.parseTarHeader(header);
    }

    @Test
    public void testWriteEntryHeader() {
        byte[] outbuf = new byte[TarArchiveEntry.HEADERSIZE];
        entry.writeEntryHeader(outbuf);
    }

    @Test
    public void testFillGNUSparse0xData() {
        Map<String, String> headers = new HashMap<>();
        headers.put("GNU.sparse.size", "1024");
        TarArchiveEntry e = new TarArchiveEntry("test");
        e.fillGNUSparse0xData(headers);
        assertTrue(e.isPaxGNUSparse());
        assertEquals(1024L, e.getRealSize());
    }

    @Test
    public void testFillGNUSparse0xDataWithName() {
        Map<String, String> headers = new HashMap<>();
        headers.put("GNU.sparse.size", "2048");
        headers.put("GNU.sparse.name", "sparsefile");
        TarArchiveEntry e = new TarArchiveEntry("original");
        e.fillGNUSparse0xData(headers);
        assertEquals("sparsefile", e.getName());
    }

    @Test
    public void testFillGNUSparse1xData() {
        Map<String, String> headers = new HashMap<>();
        headers.put("GNU.sparse.realsize", "4096");
        headers.put("GNU.sparse.name", "sparse1");
        TarArchiveEntry e = new TarArchiveEntry("test");
        e.fillGNUSparse1xData(headers);
        assertTrue(e.isPaxGNUSparse());
        assertEquals(4096L, e.getRealSize());
        assertEquals("sparse1", e.getName());
    }

    @Test
    public void testFillStarSparseData() {
        Map<String, String> headers = new HashMap<>();
        headers.put("SCHILY.realsize", "8192");
        TarArchiveEntry e = new TarArchiveEntry("test");
        e.fillStarSparseData(headers);
        assertTrue(e.isStarSparse());
        assertEquals(8192L, e.getRealSize());
    }

    @Test
    public void testFillStarSparseDataNoRealsize() {
        Map<String, String> headers = new HashMap<>();
        TarArchiveEntry e = new TarArchiveEntry("test");
        e.fillStarSparseData(headers);
        assertTrue(e.isStarSparse());
        assertEquals(0L, e.getRealSize());
    }

    @Test
    public void testNormalizeFileNameWindows() {
        String result = TarArchiveEntry.normalizeFileName("C:\\\\path", false);
        assertEquals("path", result);
    }

    @Test
    public void testNormalizeFileNameLeadingSlash() {
        String result = TarArchiveEntry.normalizeFileName("/absolute", false);
        assertEquals("absolute", result);
    }

    @Test
    public void testNormalizeFileNamePreserveLeadingSlash() {
        String result = TarArchiveEntry.normalizeFileName("/absolute", true);
        assertEquals("/absolute", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeFileNameNull() {
        TarArchiveEntry.normalizeFileName(null, false);
    }

    @Test
    public void testIsGNULongNameEntry() {
        TarArchiveEntry e = new TarArchiveEntry("name", TarArchiveEntry.LF_GNUTYPE_LONGNAME);
        assertTrue(e.isGNULongNameEntry());
    }

    @Test
    public void testIsGNULongLinkEntry() {
        TarArchiveEntry e = new TarArchiveEntry("link", TarArchiveEntry.LF_GNUTYPE_LONGLINK);
        assertTrue(e.isGNULongLinkEntry());
    }

    @Test
    public void testIsPaxHeaderLC() {
        TarArchiveEntry e = new TarArchiveEntry("pax", TarArchiveEntry.LF_PAX_EXTENDED_HEADER_LC);
        assertTrue(e.isPaxHeader());
    }

    @Test
    public void testIsGlobalPaxHeader() {
        TarArchiveEntry e = new TarArchiveEntry("global", TarArchiveEntry.LF_PAX_GLOBAL_EXTENDED_HEADER);
        assertTrue(e.isGlobalPaxHeader());
    }

    @Test
    public void testIsSymbolicLinkTrue() {
        TarArchiveEntry e = new TarArchiveEntry("sym", TarArchiveEntry.LF_SYMLINK);
        assertTrue(e.isSymbolicLink());
    }

    @Test
    public void testIsLinkTrue() {
        TarArchiveEntry e = new TarArchiveEntry("hard", TarArchiveEntry.LF_LINK);
        assertTrue(e.isLink());
    }

    @Test
    public void testIsCharacterDeviceTrue() {
        TarArchiveEntry e = new TarArchiveEntry("chr", TarArchiveEntry.LF_CHR);
        assertTrue(e.isCharacterDevice());
    }

    @Test
    public void testIsBlockDeviceTrue() {
        TarArchiveEntry e = new TarArchiveEntry("blk", TarArchiveEntry.LF_BLK);
        assertTrue(e.isBlockDevice());
    }

    @Test
    public void testIsFIFOTrue() {
        TarArchiveEntry e = new TarArchiveEntry("fifo", TarArchiveEntry.LF_FIFO);
        assertTrue(e.isFIFO());
    }

    @Test
    public void testIsOldGNUSparseTrue() {
        TarArchiveEntry e = new TarArchiveEntry("sparse", TarArchiveEntry.LF_GNUTYPE_SPARSE);
        assertTrue(e.isOldGNUSparse());
    }

    @Test
    public void testIsSparseWhenGNUSparse() {
        TarArchiveEntry e = new TarArchiveEntry("sparse", TarArchiveEntry.LF_GNUTYPE_SPARSE);
        assertTrue(e.isSparse());
    }

    @Test
    public void testIsSparseWhenStarSparse() {
        TarArchiveEntry e = new TarArchiveEntry("test");
        Map<String, String> headers = new HashMap<>();
        e.fillStarSparseData(headers);
        assertTrue(e.isSparse());
    }
}