package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.zip.ZipException;

public class Zip64ExtendedInformationExtraFieldTest {

    private Zip64ExtendedInformationExtraField field;

    @Before
    public void setUp() {
        field = new Zip64ExtendedInformationExtraField();
    }

    @Test
    public void testDefaultConstructor() {
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testConstructorWithSizeAndCompressedSize() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,1});
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,2});
        field = new Zip64ExtendedInformationExtraField(size, compressedSize);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testConstructorWithAllFields() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,1});
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,2});
        ZipEightByteInteger offset = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,3});
        ZipLong diskStart = new ZipLong(4);
        field = new Zip64ExtendedInformationExtraField(size, compressedSize, offset, diskStart);
        assertEquals(size, field.getSize());
        assertEquals(compressedSize, field.getCompressedSize());
        assertEquals(offset, field.getRelativeHeaderOffset());
        assertEquals(diskStart, field.getDiskStartNumber());
    }

    @Test
    public void testGetHeaderId() {
        ZipShort headerId = field.getHeaderId();
        assertEquals(0x0001, headerId.getValue());
    }

    @Test
    public void testGetLocalFileDataLengthNullSize() {
        assertEquals(0, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthWithSize() {
        field.setSize(new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,1}));
        assertEquals(2 * 8, field.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLengthNoFields() {
        assertEquals(0, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetCentralDirectoryLengthAllFields() {
        field.setSize(new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,1}));
        field.setCompressedSize(new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,2}));
        field.setRelativeHeaderOffset(new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,3}));
        field.setDiskStartNumber(new ZipLong(4));
        int expected = 8 + 8 + 8 + 4;
        assertEquals(expected, field.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testGetLocalFileDataDataBothNull() {
        byte[] data = field.getLocalFileDataData();
        assertArrayEquals(new byte[0], data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataDataOnlySize() {
        field.setSize(new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,1}));
        field.getLocalFileDataData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataDataOnlyCompressedSize() {
        field.setCompressedSize(new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,2}));
        field.getLocalFileDataData();
    }

    @Test
    public void testGetLocalFileDataDataBothSizes() {
        byte[] sizeBytes = new byte[]{0,0,0,0,0,0,0,1};
        byte[] compressedBytes = new byte[]{0,0,0,0,0,0,0,2};
        field.setSize(new ZipEightByteInteger(sizeBytes));
        field.setCompressedSize(new ZipEightByteInteger(compressedBytes));
        byte[] data = field.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(16, data.length);
        assertArrayEquals(sizeBytes, new byte[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        assertArrayEquals(compressedBytes, new byte[]{data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15]});
    }

    @Test
    public void testGetCentralDirectoryDataNoFields() {
        byte[] data = field.getCentralDirectoryData();
        assertArrayEquals(new byte[0], data);
    }

    @Test
    public void testGetCentralDirectoryDataOnlySize() {
        byte[] sizeBytes = new byte[]{0,0,0,0,0,0,0,1};
        field.setSize(new ZipEightByteInteger(sizeBytes));
        byte[] data = field.getCentralDirectoryData();
        assertEquals(8, data.length);
        assertArrayEquals(sizeBytes, data);
    }

    @Test
    public void testGetCentralDirectoryDataAllFields() {
        byte[] sizeBytes = new byte[]{0,0,0,0,0,0,0,1};
        byte[] compressedBytes = new byte[]{0,0,0,0,0,0,0,2};
        byte[] offsetBytes = new byte[]{0,0,0,0,0,0,0,3};
        byte[] diskBytes = new byte[]{4,0,0,0};
        field.setSize(new ZipEightByteInteger(sizeBytes));
        field.setCompressedSize(new ZipEightByteInteger(compressedBytes));
        field.setRelativeHeaderOffset(new ZipEightByteInteger(offsetBytes));
        field.setDiskStartNumber(new ZipLong(4));
        byte[] data = field.getCentralDirectoryData();
        assertEquals(28, data.length);
        assertArrayEquals(sizeBytes, new byte[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        assertArrayEquals(compressedBytes, new byte[]{data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15]});
        assertArrayEquals(offsetBytes, new byte[]{data[16], data[17], data[18], data[19], data[20], data[21], data[22], data[23]});
        assertArrayEquals(diskBytes, new byte[]{data[24], data[25], data[26], data[27]});
    }

    @Test
    public void testParseFromLocalFileDataZeroLength() throws ZipException {
        field.parseFromLocalFileData(new byte[10], 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
    }

    @Test(expected = ZipException.class)
    public void testParseFromLocalFileDataTooShort() throws ZipException {
        field.parseFromLocalFileData(new byte[10], 0, 8);
    }

    @Test
    public void testParseFromLocalFileDataOnlySizes() throws ZipException {
        byte[] buffer = new byte[20];
        buffer[0] = 1; buffer[8] = 2; // fake sizes
        field.parseFromLocalFileData(buffer, 0, 16);
        assertNotNull(field.getSize());
        assertNotNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileDataWithOffset() throws ZipException {
        byte[] buffer = new byte[30];
        buffer[0] = 1; buffer[8] = 2; buffer[16] = 3;
        field.parseFromLocalFileData(buffer, 0, 24);
        assertNotNull(field.getSize());
        assertNotNull(field.getCompressedSize());
        assertNotNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileDataAllFields() throws ZipException {
        byte[] buffer = new byte[30];
        buffer[0] = 1; buffer[8] = 2; buffer[16] = 3; buffer[24] = 4;
        field.parseFromLocalFileData(buffer, 0, 28);
        assertNotNull(field.getSize());
        assertNotNull(field.getCompressedSize());
        assertNotNull(field.getRelativeHeaderOffset());
        assertNotNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataAllFields() throws ZipException {
        byte[] buffer = new byte[28];
        buffer[0] = 1; buffer[8] = 2; buffer[16] = 3; buffer[24] = 4;
        field.parseFromCentralDirectoryData(buffer, 0, 28);
        assertNotNull(field.getSize());
        assertNotNull(field.getCompressedSize());
        assertNotNull(field.getRelativeHeaderOffset());
        assertNotNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataThreeDWORD() throws ZipException {
        byte[] buffer = new byte[24];
        buffer[0] = 1; buffer[8] = 2; buffer[16] = 3;
        field.parseFromCentralDirectoryData(buffer, 0, 24);
        assertNotNull(field.getSize());
        assertNotNull(field.getCompressedSize());
        assertNotNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataLengthMod8Is4() throws ZipException {
        byte[] buffer = new byte[12];
        buffer[0] = 1; buffer[4] = 2; buffer[8] = 3;
        field.parseFromCentralDirectoryData(buffer, 0, 12);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNotNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataShortBuffer() throws ZipException {
        byte[] buffer = new byte[4];
        buffer[0] = 1;
        field.parseFromCentralDirectoryData(buffer, 0, 4);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryDataMismatchLength() throws ZipException {
        field.reparseCentralDirectoryData(true, false, false, false);
    }

    @Test
    public void testReparseCentralDirectoryDataAllFields() throws ZipException {
        byte[] rawData = new byte[28];
        rawData[0] = 1; rawData[8] = 2; rawData[16] = 3; rawData[24] = 4;
        field.parseFromCentralDirectoryData(rawData, 0, 28);
        field.reparseCentralDirectoryData(true, true, true, true);
        assertNotNull(field.getSize());
        assertNotNull(field.getCompressedSize());
        assertNotNull(field.getRelativeHeaderOffset());
        assertNotNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryDataNoFields() throws ZipException {
        byte[] rawData = new byte[0];
        field.parseFromCentralDirectoryData(rawData, 0, 0);
        field.reparseCentralDirectoryData(false, false, false, false);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryDataSizeOnly() throws ZipException {
        byte[] rawData = new byte[8];
        rawData[0] = 1;
        field.parseFromCentralDirectoryData(rawData, 0, 8);
        field.reparseCentralDirectoryData(true, false, false, false);
        assertNotNull(field.getSize());
        assertNull(field.getCompressedSize());
    }

    @Test
    public void testReparseCentralDirectoryDataDiskStartOnly() throws ZipException {
        byte[] rawData = new byte[4];
        rawData[0] = 5;
        field.parseFromCentralDirectoryData(rawData, 0, 4);
        field.reparseCentralDirectoryData(false, false, false, true);
        assertNotNull(field.getDiskStartNumber());
    }

    @Test
    public void testSetAndGetSize() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,10});
        field.setSize(size);
        assertEquals(size, field.getSize());
    }

    @Test
    public void testSetAndGetCompressedSize() {
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,20});
        field.setCompressedSize(compressedSize);
        assertEquals(compressedSize, field.getCompressedSize());
    }

    @Test
    public void testSetAndGetRelativeHeaderOffset() {
        ZipEightByteInteger offset = new ZipEightByteInteger(new byte[]{0,0,0,0,0,0,0,30});
        field.setRelativeHeaderOffset(offset);
        assertEquals(offset, field.getRelativeHeaderOffset());
    }

    @Test
    public void testSetAndGetDiskStartNumber() {
        ZipLong disk = new ZipLong(99);
        field.setDiskStartNumber(disk);
        assertEquals(disk, field.getDiskStartNumber());
    }
}