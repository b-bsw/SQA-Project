package org.apache.commons.compress.archivers.zip;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;

public class ZipArchiveOutputStreamTest {
    private ByteArrayOutputStream baos;
    private ZipArchiveOutputStream zos;
    private File tempFile;
    private SeekableByteChannel tempChannel;

    @Before
    public void setUp() throws IOException {
        baos = new ByteArrayOutputStream();
        tempFile = File.createTempFile("testzip", ".zip");
        tempFile.deleteOnExit();
    }

    @After
    public void tearDown() throws IOException {
        if (zos != null) {
            try {
                zos.close();
            } catch (IOException e) {
            }
        }
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void testConstructorOutputStream() {
        zos = new ZipArchiveOutputStream(baos);
        assertFalse(zos.finished);
        assertNull(zos.channel);
        assertNotNull(zos.out);
    }

    @Test
    public void testConstructorFile() throws IOException {
        zos = new ZipArchiveOutputStream(tempFile);
        assertTrue(zos.isSeekable());
        assertNotNull(zos.channel);
        assertNull(zos.out);
    }

    @Test(expected = IOException.class)
    public void testConstructorFileFailsAndFallsBack() throws IOException {
        File nonWritable = File.createTempFile("testzip", ".zip");
        nonWritable.deleteOnExit();
        nonWritable.setWritable(false);
        zos = new ZipArchiveOutputStream(nonWritable);
    }

    @Test
    public void testConstructorSeekableByteChannel() throws IOException {
        tempChannel = Files.newByteChannel(tempFile.toPath(),
            java.util.EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE,
                StandardOpenOption.READ, StandardOpenOption.TRUNCATE_EXISTING));
        zos = new ZipArchiveOutputStream(tempChannel);
        assertTrue(zos.isSeekable());
        assertNotNull(zos.channel);
        assertNull(zos.out);
    }

    @Test
    public void testIsSeekableWithOutputStream() {
        zos = new ZipArchiveOutputStream(baos);
        assertFalse(zos.isSeekable());
    }

    @Test
    public void testSetEncoding() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setEncoding("UTF-8");
        assertEquals("UTF-8", zos.getEncoding());
        zos.setEncoding("ISO-8859-1");
        assertEquals("ISO-8859-1", zos.getEncoding());
    }

    @Test
    public void testSetUseLanguageEncodingFlag() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setUseLanguageEncodingFlag(true);
        zos.setUseLanguageEncodingFlag(false);
    }

    @Test
    public void testSetCreateUnicodeExtraFields() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
    }

    @Test
    public void testSetFallbackToUTF8() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setFallbackToUTF8(true);
        zos.setFallbackToUTF8(false);
    }

    @Test
    public void testSetUseZip64() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setUseZip64(Zip64Mode.Always);
        zos.setUseZip64(Zip64Mode.Never);
        zos.setUseZip64(Zip64Mode.AsNeeded);
    }

    @Test(expected = IOException.class)
    public void testFinishAlreadyFinished() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        zos.finish();
    }

    @Test(expected = IOException.class)
    public void testFinishWithOpenEntry() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zos.putArchiveEntry(entry);
        zos.finish();
    }

    @Test
    public void testFinishSuccess() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(5);
        entry.setCrc(12345);
        zos.putArchiveEntry(entry);
        zos.write(new byte[]{1,2,3,4,5});
        zos.closeArchiveEntry();
        zos.finish();
        assertTrue(zos.finished);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWhenFinished() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        zos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryNoCurrentEntry() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.closeArchiveEntry();
    }

    @Test
    public void testCloseArchiveEntryNormal() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(5);
        entry.setCrc(12345);
        zos.putArchiveEntry(entry);
        zos.write(new byte[]{1,2,3,4,5});
        zos.closeArchiveEntry();
        assertNull(zos.entry);
    }

    @Test(expected = IOException.class)
    public void testAddRawArchiveEntryWithFinished() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        zos.addRawArchiveEntry(new ZipArchiveEntry("test"), null);
    }

    @Test
    public void testPutArchiveEntryNormal() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(5);
        entry.setCrc(12345);
        zos.putArchiveEntry(entry);
        assertNotNull(zos.entry);
        assertEquals(1, zos.entries.size());
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryWhenFinished() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        zos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
    }

    @Test(expected = ZipException.class)
    public void testPutArchiveEntryStoredNoSize() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        zos.putArchiveEntry(entry);
    }

    @Test(expected = ZipException.class)
    public void testPutArchiveEntryStoredNoCrc() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(5);
        zos.putArchiveEntry(entry);
    }

    @Test
    public void testPutArchiveEntryWithSeekableChannel() throws IOException {
        zos = new ZipArchiveOutputStream(tempFile);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(5);
        entry.setCrc(12345);
        zos.putArchiveEntry(entry);
        assertNotNull(zos.entry);
    }

    @Test
    public void testSetComment() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setComment("my comment");
        assertEquals("my comment", zos.comment);
        zos.setComment("");
        assertEquals("", zos.comment);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelTooLow() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setLevel(Deflater.DEFAULT_COMPRESSION - 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelTooHigh() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setLevel(Deflater.BEST_COMPRESSION + 1);
    }

    @Test
    public void testSetLevelValid() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setLevel(Deflater.DEFAULT_COMPRESSION);
        zos.setLevel(Deflater.BEST_SPEED);
        zos.setLevel(Deflater.BEST_COMPRESSION);
    }

    @Test
    public void testSetMethod() {
        zos = new ZipArchiveOutputStream(baos);
        zos.setMethod(ZipEntry.STORED);
        assertEquals(ZipEntry.STORED, zos.method);
        zos.setMethod(ZipEntry.DEFLATED);
        assertEquals(ZipEntry.DEFLATED, zos.method);
    }

    @Test
    public void testCanWriteEntryDataValid() {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        assertTrue(zos.canWriteEntryData(entry));
        entry.setMethod(ZipEntry.DEFLATED);
        assertTrue(zos.canWriteEntryData(entry));
    }

    @Test
    public void testCanWriteEntryDataInvalid() {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipMethod.IMPLODING.getCode());
        assertFalse(zos.canWriteEntryData(entry));
        entry.setMethod(ZipMethod.UNSHRINKING.getCode());
        assertFalse(zos.canWriteEntryData(entry));
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteWithoutEntry() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.write(new byte[10], 0, 10);
    }

    @Test
    public void testWriteWithEntry() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(5);
        entry.setCrc(12345);
        zos.putArchiveEntry(entry);
        zos.write(new byte[]{1,2,3,4,5}, 0, 5);
        zos.closeArchiveEntry();
        zos.finish();
        byte[] result = baos.toByteArray();
        assertTrue(result.length > 0);
    }

    @Test
    public void testWriteEmptyArray() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(0);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        zos.write(new byte[0], 0, 0);
        zos.closeArchiveEntry();
    }

    @Test
    public void testFlush() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.flush();
    }

    @Test
    public void testFlushWithSeekableChannel() throws IOException {
        zos = new ZipArchiveOutputStream(tempFile);
        zos.flush();
    }

    @Test
    public void testCloseNotFinished() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(0);
        entry.setCrc(0);
        zos.putArchiveEntry(entry);
        zos.closeArchiveEntry();
        zos.close();
        assertTrue(zos.finished);
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryAfterFinish() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        zos.createArchiveEntry(tempFile, "test.txt");
    }

    @Test
    public void testCreateArchiveEntryNormal() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        ArchiveEntry entry = zos.createArchiveEntry(tempFile, "test.txt");
        assertNotNull(entry);
        assertTrue(entry instanceof ZipArchiveEntry);
    }

    @Test
    public void testUsesDataDescriptorDeflatedNoChannel() {
        assertEquals(true, zos.usesDataDescriptor(ZipEntry.DEFLATED));
    }

    @Test
    public void testUsesDataDescriptorStored() {
        assertEquals(false, zos.usesDataDescriptor(ZipEntry.STORED));
    }

    @Test
    public void testVersionNeededToExtractZip64() {
        assertEquals(ZipConstants.ZIP64_MIN_VERSION, zos.versionNeededToExtract(ZipEntry.DEFLATED, true, false));
    }

    @Test
    public void testVersionNeededToExtractDataDescriptor() {
        assertEquals(ZipConstants.DATA_DESCRIPTOR_MIN_VERSION, zos.versionNeededToExtract(ZipEntry.DEFLATED, false, true));
    }

    @Test
    public void testVersionNeededToExtractDeflated() {
        assertEquals(ZipConstants.DEFLATE_MIN_VERSION, zos.versionNeededToExtract(ZipEntry.DEFLATED, false, false));
    }

    @Test
    public void testVersionNeededToExtractStored() {
        assertEquals(ZipConstants.INITIAL_VERSION, zos.versionNeededToExtract(ZipEntry.STORED, false, false));
    }

    @Test
    public void testGetGeneralPurposeBitsWithUTF8() {
        GeneralPurposeBit bits = zos.getGeneralPurposeBits(false, true);
        assertTrue(bits.usesUTF8ForNames());
        assertTrue(bits.usesDataDescriptor());
    }

    @Test
    public void testGetGeneralPurposeBitsWithoutUTF8() {
        zos.setUseLanguageEncodingFlag(false);
        GeneralPurposeBit bits = zos.getGeneralPurposeBits(true, false);
        assertTrue(bits.usesUTF8ForNames());
        assertFalse(bits.usesDataDescriptor());
    }

    @Test
    public void testWriteCentralDirectoryEnd() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.finish();
        byte[] data = baos.toByteArray();
        assertTrue(data.length > 0);
    }

    @Test(expected = Zip64RequiredException.class)
    public void testWriteCentralDirectoryEndTooManyEntriesWithNever() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.setUseZip64(Zip64Mode.Never);
        for (int i = 0; i < 0x10001; i++) {
            ZipArchiveEntry entry = new ZipArchiveEntry("test" + i + ".txt");
            entry.setMethod(ZipEntry.STORED);
            entry.setSize(1);
            entry.setCrc(1);
            zos.putArchiveEntry(entry);
            zos.write(new byte[]{0});
            zos.closeArchiveEntry();
        }
        zos.finish();
    }

    @Test
    public void testWriteZip64CentralDirectoryNotNeeded() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.setUseZip64(Zip64Mode.Always);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(1);
        entry.setCrc(1);
        zos.putArchiveEntry(entry);
        zos.write(new byte[]{0});
        zos.closeArchiveEntry();
        zos.finish();
        byte[] data = baos.toByteArray();
        assertTrue(data.length > 0);
    }

    @Test
    public void testWriteZip64CentralDirectoryNever() throws IOException {
        zos = new ZipArchiveOutputStream(baos);
        zos.setUseZip64(Zip64Mode.Never);
        zos.finish();
    }
}