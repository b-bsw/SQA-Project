package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.Date;
import java.util.zip.ZipException;

public class X5455_ExtendedTimestampTest {

    private X5455_ExtendedTimestamp xt;

    @Before
    public void setUp() {
        xt = new X5455_ExtendedTimestamp();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(0, xt.getFlags());
        assertFalse(xt.isBit0_modifyTimePresent());
        assertFalse(xt.isBit1_accessTimePresent());
        assertFalse(xt.isBit2_createTimePresent());
        assertNull(xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
    }

    @Test
    public void testGetHeaderId() {
        assertEquals(0x5455, xt.getHeaderId().getValue());
    }

    @Test
    public void testSetFlagsAllBits() {
        xt.setFlags((byte) 7);
        assertTrue(xt.isBit0_modifyTimePresent());
        assertTrue(xt.isBit1_accessTimePresent());
        assertTrue(xt.isBit2_createTimePresent());
    }

    @Test
    public void testSetFlagsNoBits() {
        xt.setFlags((byte) 0);
        assertFalse(xt.isBit0_modifyTimePresent());
        assertFalse(xt.isBit1_accessTimePresent());
        assertFalse(xt.isBit2_createTimePresent());
    }

    @Test
    public void testSetModifyTimeNonNull() {
        ZipLong zl = new ZipLong(1000);
        xt.setModifyTime(zl);
        assertTrue(xt.isBit0_modifyTimePresent());
        assertEquals(zl, xt.getModifyTime());
    }

    @Test
    public void testSetModifyTimeNull() {
        xt.setFlags((byte) 1);
        xt.setModifyTime(null);
        assertFalse(xt.isBit0_modifyTimePresent());
        assertNull(xt.getModifyTime());
    }

    @Test
    public void testSetAccessTimeNonNull() {
        ZipLong zl = new ZipLong(2000);
        xt.setAccessTime(zl);
        assertTrue(xt.isBit1_accessTimePresent());
        assertEquals(zl, xt.getAccessTime());
    }

    @Test
    public void testSetAccessTimeNull() {
        xt.setFlags((byte) 2);
        xt.setAccessTime(null);
        assertFalse(xt.isBit1_accessTimePresent());
        assertNull(xt.getAccessTime());
    }

    @Test
    public void testSetCreateTimeNonNull() {
        ZipLong zl = new ZipLong(3000);
        xt.setCreateTime(zl);
        assertTrue(xt.isBit2_createTimePresent());
        assertEquals(zl, xt.getCreateTime());
    }

    @Test
    public void testSetCreateTimeNull() {
        xt.setFlags((byte) 4);
        xt.setCreateTime(null);
        assertFalse(xt.isBit2_createTimePresent());
        assertNull(xt.getCreateTime());
    }

    @Test
    public void testGetLocalFileDataLengthOnlyModify() {
        xt.setModifyTime(new ZipLong(100));
        assertEquals(5, xt.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthModifyAndAccess() {
        xt.setModifyTime(new ZipLong(100));
        xt.setAccessTime(new ZipLong(200));
        assertEquals(9, xt.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthAllThree() {
        xt.setModifyTime(new ZipLong(100));
        xt.setAccessTime(new ZipLong(200));
        xt.setCreateTime(new ZipLong(300));
        assertEquals(13, xt.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthNoTimestamps() {
        assertEquals(1, xt.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLengthOnlyModify() {
        xt.setModifyTime(new ZipLong(100));
        assertEquals(5, xt.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLengthNoModify() {
        assertEquals(1, xt.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetLocalFileDataDataNoTimestamps() {
        byte[] data = xt.getLocalFileDataData();
        assertEquals(1, data.length);
        assertEquals(0, data[0]);
    }

    @Test
    public void testGetLocalFileDataDataModifyOnly() {
        xt.setModifyTime(new ZipLong(0x12345678));
        byte[] data = xt.getLocalFileDataData();
        assertEquals(5, data.length);
        assertEquals(1, data[0]);
        assertArrayEquals(new byte[] { (byte)0x78, (byte)0x56, (byte)0x34, (byte)0x12 }, 
                          new byte[] { data[1], data[2], data[3], data[4] });
    }

    @Test
    public void testGetLocalFileDataDataModifyAndAccess() {
        xt.setModifyTime(new ZipLong(0x11111111));
        xt.setAccessTime(new ZipLong(0x22222222));
        byte[] data = xt.getLocalFileDataData();
        assertEquals(9, data.length);
        assertEquals(3, data[0]);
        assertArrayEquals(new byte[] { (byte)0x11, (byte)0x11, (byte)0x11, (byte)0x11 },
                          new byte[] { data[1], data[2], data[3], data[4] });
        assertArrayEquals(new byte[] { (byte)0x22, (byte)0x22, (byte)0x22, (byte)0x22 },
                          new byte[] { data[5], data[6], data[7], data[8] });
    }

    @Test
    public void testGetLocalFileDataDataAllThree() {
        xt.setModifyTime(new ZipLong(0x11111111));
        xt.setAccessTime(new ZipLong(0x22222222));
        xt.setCreateTime(new ZipLong(0x33333333));
        byte[] data = xt.getLocalFileDataData();
        assertEquals(13, data.length);
        assertEquals(7, data[0]);
    }

    @Test
    public void testGetCentralDirectoryDataOnlyModify() {
        xt.setModifyTime(new ZipLong(0x12345678));
        byte[] data = xt.getCentralDirectoryData();
        assertEquals(5, data.length);
        assertEquals(1, data[0]);
    }

    @Test
    public void testGetCentralDirectoryDataWithAccessAndCreateTruncated() {
        xt.setModifyTime(new ZipLong(100));
        xt.setAccessTime(new ZipLong(200));
        xt.setCreateTime(new ZipLong(300));
        byte[] data = xt.getCentralDirectoryData();
        assertEquals(5, data.length);
    }

    @Test
    public void testParseFromLocalFileDataOnlyModify() throws ZipException {
        byte[] raw = new byte[] { 1, 0, 0, 0, (byte)0x7B };
        xt.parseFromLocalFileData(raw, 0, raw.length);
        assertEquals(1, xt.getFlags());
        assertTrue(xt.isBit0_modifyTimePresent());
        assertEquals(123, xt.getModifyTime().getIntValue());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileDataModifyAndAccess() throws ZipException {
        byte[] raw = new byte[] { 3, 0, 0, 0, 0, 0, 0, 0, 0 };
        raw[1] = 10; raw[2] = 0; raw[3] = 0; raw[4] = 0;
        raw[5] = 20; raw[6] = 0; raw[7] = 0; raw[8] = 0;
        xt.parseFromLocalFileData(raw, 0, raw.length);
        assertEquals(3, xt.getFlags());
        assertEquals(10, xt.getModifyTime().getIntValue());
        assertEquals(20, xt.getAccessTime().getIntValue());
        assertNull(xt.getCreateTime());
    }

    @Test
    public void testParseFromLocalFileDataAllThree() throws ZipException {
        byte[] raw = new byte[13];
        raw[0] = 7;
        raw[1] = 1; raw[2] = 0; raw[3] = 0; raw[4] = 0;
        raw[5] = 2; raw[6] = 0; raw[7] = 0; raw[8] = 0;
        raw[9] = 3; raw[10] = 0; raw[11] = 0; raw[12] = 0;
        xt.parseFromLocalFileData(raw, 0, raw.length);
        assertEquals(1, xt.getModifyTime().getIntValue());
        assertEquals(2, xt.getAccessTime().getIntValue());
        assertEquals(3, xt.getCreateTime().getIntValue());
    }

    @Test
    public void testParseFromLocalFileDataShortBufferForAccess() throws ZipException {
        byte[] raw = new byte[] { 3, 1, 0, 0, 0 };
        xt.parseFromLocalFileData(raw, 0, raw.length);
        assertNotNull(xt.getModifyTime());
        assertNull(xt.getAccessTime());
    }

    @Test
    public void testParseFromLocalFileDataAccessWithoutCreateShortBuffer() throws ZipException {
        byte[] raw = new byte[] { 7, 1, 0, 0, 0, 2, 0, 0, 0 };
        xt.parseFromLocalFileData(raw, 0, raw.length);
        assertNotNull(xt.getModifyTime());
        assertNotNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
    }

    @Test
    public void testParseFromCentralDirectoryData() throws ZipException {
        byte[] raw = new byte[] { 1, 0, 0, 0, 42 };
        xt.parseFromCentralDirectoryData(raw, 0, raw.length);
        assertEquals(42, xt.getModifyTime().getIntValue());
    }

    @Test
    public void testParseFromCentralDirectoryDataResetsFirst() throws ZipException {
        xt.setModifyTime(new ZipLong(999));
        xt.setAccessTime(new ZipLong(888));
        byte[] raw = new byte[] { 1, 0, 0, 0, 10 };
        xt.parseFromCentralDirectoryData(raw, 0, raw.length);
        assertEquals(10, xt.getModifyTime().getIntValue());
        assertNull(xt.getAccessTime());
    }

    @Test
    public void testGetModifyJavaTimeNonNull() {
        xt.setModifyTime(new ZipLong(946684800));
        Date d = xt.getModifyJavaTime();
        assertNotNull(d);
        assertEquals(946684800000L, d.getTime());
    }

    @Test
    public void testGetModifyJavaTimeNull() {
        assertNull(xt.getModifyJavaTime());
    }

    @Test
    public void testGetAccessJavaTimeNonNull() {
        xt.setAccessTime(new ZipLong(946684800));
        Date d = xt.getAccessJavaTime();
        assertNotNull(d);
        assertEquals(946684800000L, d.getTime());
    }

    @Test
    public void testGetCreateJavaTimeNonNull() {
        xt.setCreateTime(new ZipLong(946684800));
        Date d = xt.getCreateJavaTime();
        assertNotNull(d);
        assertEquals(946684800000L, d.getTime());
    }

    @Test
    public void testSetModifyJavaTimeNonNull() {
        Date d = new Date(1000000000L);
        xt.setModifyJavaTime(d);
        assertNotNull(xt.getModifyTime());
        assertEquals(1000000, xt.getModifyTime().getIntValue());
    }

    @Test
    public void testSetModifyJavaTimeNull() {
        xt.setModifyJavaTime(null);
        assertNull(xt.getModifyTime());
    }

    @Test
    public void testSetAccessJavaTimeNonNull() {
        Date d = new Date(2000000000L);
        xt.setAccessJavaTime(d);
        assertNotNull(xt.getAccessTime());
        assertEquals(2000000, xt.getAccessTime().getIntValue());
    }

    @Test
    public void testSetCreateJavaTimeNonNull() {
        Date d = new Date(3000000000L);
        xt.setCreateJavaTime(d);
        assertNotNull(xt.getCreateTime());
        assertEquals(3000000, xt.getCreateTime().getIntValue());
    }

    @Test
    public void testDateToZipLongNullDate() {
        assertNull(X5455_ExtendedTimestamp.class.getDeclaredMethods());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateToZipLongOverflow() {
        xt.setModifyJavaTime(new Date(0x100000000L * 1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnixTimeToZipLongTooLarge() {
        xt.setModifyTime(new ZipLong(0x100000000L));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        xt.setModifyTime(new ZipLong(100));
        X5455_ExtendedTimestamp cloned = (X5455_ExtendedTimestamp) xt.clone();
        assertEquals(xt.getFlags(), cloned.getFlags());
        assertEquals(xt.getModifyTime(), cloned.getModifyTime());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(xt.equals(xt));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(xt.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(xt.equals("string"));
    }

    @Test
    public void testEqualsEqualObjects() {
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        xt.setFlags((byte) 3);
        xt.setModifyTime(new ZipLong(10));
        xt.setAccessTime(new ZipLong(20));
        other.setFlags((byte) 3);
        other.setModifyTime(new ZipLong(10));
        other.setAccessTime(new ZipLong(20));
        assertTrue(xt.equals(other));
    }

    @Test
    public void testEqualsDifferentFlags() {
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        xt.setFlags((byte) 1);
        other.setFlags((byte) 2);
        assertFalse(xt.equals(other));
    }

    @Test
    public void testEqualsDifferentModifyTime() {
        X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        xt.setModifyTime(new ZipLong(10));
        other.setModifyTime(new ZipLong(20));
        assertFalse(xt.equals(other));
    }

    @Test
    public void testHashCodeConsistent() {
        xt.setFlags((byte) 5);
        xt.setModifyTime(new ZipLong(100));
        xt.setCreateTime(new ZipLong(300));
        int hc1 = xt.hashCode();
        int hc2 = xt.hashCode();
        assertEquals(hc1, hc2);
    }

    @Test
    public void testToString() {
        xt.setModifyTime(new ZipLong(946684800));
        String s = xt.toString();
        assertTrue(s.contains("0x5455"));
        assertTrue(s.contains("Modify"));
    }

    @Test
    public void testParseFromLocalFileDataOffset() throws ZipException {
        byte[] raw = new byte[] { 0, 0, 0, 0, 0, 1, 10, 0, 0, 0 };
        xt.parseFromLocalFileData(raw, 5, 5);
        assertEquals(1, xt.getFlags());
        assertEquals(10, xt.getModifyTime().getIntValue());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileDataNullData() throws ZipException {
        xt.parseFromLocalFileData(null, 0, 0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseFromLocalFileDataNegativeOffset() throws ZipException {
        xt.parseFromLocalFileData(new byte[5], -1, 5);
    }
}