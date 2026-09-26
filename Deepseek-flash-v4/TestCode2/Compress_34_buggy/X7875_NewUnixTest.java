package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.zip.ZipException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class X7875_NewUnixTest {

    private X7875_NewUnix xf;

    @Before
    public void setUp() {
        xf = new X7875_NewUnix();
    }

    @After
    public void tearDown() {
        xf = null;
    }

    @Test
    public void testDefaultUidGid() {
        assertEquals(1000L, xf.getUID());
        assertEquals(1000L, xf.getGID());
    }

    @Test
    public void testSetAndGetUid() {
        xf.setUID(0L);
        assertEquals(0L, xf.getUID());
        xf.setUID(1L);
        assertEquals(1L, xf.getUID());
        xf.setUID(65535L);
        assertEquals(65535L, xf.getUID());
        xf.setUID(4294967295L);
        assertEquals(4294967295L, xf.getUID());
    }

    @Test
    public void testSetAndGetGid() {
        xf.setGID(0L);
        assertEquals(0L, xf.getGID());
        xf.setGID(1L);
        assertEquals(1L, xf.getGID());
        xf.setGID(65535L);
        assertEquals(65535L, xf.getGID());
        xf.setGID(4294967295L);
        assertEquals(4294967295L, xf.getGID());
    }

    @Test
    public void testGetHeaderId() {
        assertEquals(0x7875, xf.getHeaderId().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthDefault() {
        // default uid=1000,gid=1000 each fit in 2 bytes; version=1 -> 3+2+2 = 7
        assertEquals(7, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthZeroUid() {
        xf.setUID(0L);
        xf.setGID(0L);
        // uid=0 -> trimmed to 1 byte, gid=0 -> 1 byte, 3+1+1=5
        assertEquals(5, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthLargeUid() {
        xf.setUID(4294967295L); // 0xFFFFFFFF -> 4 bytes
        xf.setGID(4294967295L);
        assertEquals(3 + 4 + 4, xf.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLength() {
        assertEquals(xf.getLocalFileDataLength().getValue(),
                     xf.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetLocalFileDataDataDefault() {
        byte[] data = xf.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(7, data.length);
        // version=1, uidSize=2, gidSize=2 ; uid=1000=0x03E8 little-endian: 0xE8,0x03 ; gid same
        assertEquals(1, signedByteToUnsignedInt(data[0]));
        assertEquals(2, signedByteToUnsignedInt(data[1]));
        assertEquals((byte)0xE8, data[2]);
        assertEquals((byte)0x03, data[3]);
        assertEquals(2, signedByteToUnsignedInt(data[4]));
        assertEquals((byte)0xE8, data[5]);
        assertEquals((byte)0x03, data[6]);
    }

    @Test
    public void testGetLocalFileDataDataZeroUidGid() {
        xf.setUID(0L);
        xf.setGID(0L);
        byte[] data = xf.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(5, data.length);
        assertEquals(1, signedByteToUnsignedInt(data[0]));
        assertEquals(1, signedByteToUnsignedInt(data[1]));
        assertEquals(0, signedByteToUnsignedInt(data[2]));
        assertEquals(1, signedByteToUnsignedInt(data[3]));
        assertEquals(0, signedByteToUnsignedInt(data[4]));
    }

    @Test
    public void testGetCentralDirectoryData() {
        byte[] centralData = xf.getCentralDirectoryData();
        assertNotNull(centralData);
        assertEquals(0, centralData.length);
    }

    @Test
    public void testParseFromLocalFileDataDefault() throws ZipException {
        byte[] rawData = xf.getLocalFileDataData();
        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(rawData, 0, rawData.length);
        assertEquals(xf.getUID(), parsed.getUID());
        assertEquals(xf.getGID(), parsed.getGID());
    }

    @Test
    public void testParseFromLocalFileDataZeroUidGid() throws ZipException {
        xf.setUID(0L);
        xf.setGID(0L);
        byte[] rawData = xf.getLocalFileDataData();
        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(rawData, 0, rawData.length);
        assertEquals(0L, parsed.getUID());
        assertEquals(0L, parsed.getGID());
    }

    @Test
    public void testParseFromLocalFileDataSpecificValues() throws ZipException {
        // uid=12345 (0x3039), gid=67890 (0x10932)
        xf.setUID(12345L);
        xf.setGID(67890L);
        byte[] rawData = xf.getLocalFileDataData();
        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(rawData, 0, rawData.length);
        assertEquals(12345L, parsed.getUID());
        assertEquals(67890L, parsed.getGID());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileDataInvalidOffset() throws ZipException {
        byte[] data = new byte[] {0, 0, 0};
        xf.parseFromLocalFileData(data, 0, 3);
    }

    @Test
    public void testParseFromCentralDirectoryData() throws ZipException {
        // should do nothing
        byte[] dummy = new byte[] {0, 0};
        xf.parseFromCentralDirectoryData(dummy, 0, 2);
        // state unchanged
        assertEquals(1000L, xf.getUID());
        assertEquals(1000L, xf.getGID());
    }

    @Test
    public void testToString() {
        String str = xf.toString();
        assertTrue(str.contains("UID=1000"));
        assertTrue(str.contains("GID=1000"));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        X7875_NewUnix clone = (X7875_NewUnix) xf.clone();
        assertNotNull(clone);
        assertEquals(xf.getUID(), clone.getUID());
        assertEquals(xf.getGID(), clone.getGID());
        assertTrue(xf != clone);
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(xf.equals(xf));
    }

    @Test
    public void testEqualsNull() {
        assertTrue(!xf.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertTrue(!xf.equals("string"));
    }

    @Test
    public void testEqualsSameValues() {
        X7875_NewUnix other = new X7875_NewUnix();
        assertTrue(xf.equals(other));
    }

    @Test
    public void testEqualsDifferentUid() {
        X7875_NewUnix other = new X7875_NewUnix();
        other.setUID(0L);
        assertTrue(!xf.equals(other));
    }

    @Test
    public void testEqualsDifferentGid() {
        X7875_NewUnix other = new X7875_NewUnix();
        other.setGID(0L);
        assertTrue(!xf.equals(other));
    }

    @Test
    public void testHashCodeConsistency() {
        int hc1 = xf.hashCode();
        int hc2 = xf.hashCode();
        assertEquals(hc1, hc2);
    }

    @Test
    public void testHashCodeDifferentValues() {
        X7875_NewUnix other = new X7875_NewUnix();
        other.setUID(0L);
        assertTrue(xf.hashCode() != other.hashCode());
    }

    @Test
    public void testParseFromLocalFileDataErrorInvalidUidSize() {
        // version=1, uidSize=10 (but only 2 bytes remaining in data of length 5)
        byte[] data = new byte[] {1, 10, 0, 0, 0};
        try {
            xf.parseFromLocalFileData(data, 0, 5);
            fail("Expected ZipException");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthNull() {
        assertNull(X7875_NewUnix.trimLeadingZeroesForceMinLength(null));
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthAllZero() {
        byte[] input = new byte[] {0, 0, 0};
        byte[] output = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, output.length);
        assertEquals(0, output[0]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthNoLeadingZero() {
        byte[] input = new byte[] {1, 2, 3};
        byte[] output = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(3, output.length);
        assertEquals(1, output[0]);
        assertEquals(2, output[1]);
        assertEquals(3, output[2]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthSomeLeadingZero() {
        byte[] input = new byte[] {0, 0, 5, 6};
        byte[] output = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(2, output.length);
        assertEquals(5, output[0]);
        assertEquals(6, output[1]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthSingleElement() {
        byte[] input = new byte[] {7};
        byte[] output = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, output.length);
        assertEquals(7, output[0]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthEmptyArray() {
        byte[] input = new byte[] {};
        byte[] output = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, output.length);
        assertEquals(0, output[0]);
    }

    private int signedByteToUnsignedInt(byte b) {
        return b & 0xFF;
    }

}