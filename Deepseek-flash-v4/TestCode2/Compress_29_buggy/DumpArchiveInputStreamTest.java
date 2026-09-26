package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class DumpArchiveInputStreamTest {

    private DumpArchiveInputStream inputStream;
    private byte[] validHeader;
    private byte[] clriSegment;
    private byte[] bitsSegment;
    private byte[] inodeSegment;
    private byte[] addrSegment;
    private byte[] endSegment;
    private byte[] dataSegment;

    @Before
    public void setUp() throws Exception {
        // Setup minimal valid dump archive data
        // This is a simplified representation for testing purposes
        validHeader = createDumpHeader();
        clriSegment = createClriSegment();
        bitsSegment = createBitsSegment();
        inodeSegment = createInodeSegment();
        addrSegment = createAddrSegment();
        endSegment = createEndSegment();
        dataSegment = createDataSegment();
    }

    @After
    public void tearDown() throws Exception {
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Test(expected = ArchiveException.class)
    public void testConstructorWithInvalidHeader() throws Exception {
        // Test with invalid header bytes
        byte[] invalidHeader = new byte[1024];
        for (int i = 0; i < invalidHeader.length; i++) {
            invalidHeader[i] = 0;
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidHeader);
        new DumpArchiveInputStream(bais);
    }

    @Test(expected = ArchiveException.class)
    public void testConstructorWithNullInputStream() throws Exception {
        new DumpArchiveInputStream(null);
    }

    @Test
    public void testConstructorSuccess() throws Exception {
        ByteArrayInputStream bais = createValidInputStream();
        inputStream = new DumpArchiveInputStream(bais);
        assertNotNull(inputStream);
        assertNotNull(inputStream.getSummary());
    }

    @Test
    public void testGetNextEntryWhenEmpty() throws Exception {
        // Test empty archive (just header, CLRI, BITS, then END)
        ByteArrayInputStream bais = createInputStreamWithEndOnly();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNull(entry);
    }

    @Test
    public void testReadEntryWithDirectory() throws Exception {
        // Test reading a directory entry
        ByteArrayInputStream bais = createInputStreamWithDirectory();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        assertTrue(entry.isDirectory());
        assertNotNull(entry.getName());
    }

    @Test
    public void testReadEntryWithFile() throws Exception {
        // Test reading a regular file entry
        ByteArrayInputStream bais = createInputStreamWithFile();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        assertFalse(entry.isDirectory());
        assertEquals(100, entry.getEntrySize());
        assertNotNull(entry.getName());
    }

    @Test
    public void testReadReturnsExpectedBytes() throws Exception {
        ByteArrayInputStream bais = createInputStreamWithFile();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        
        byte[] buffer = new byte[50];
        int bytesRead = inputStream.read(buffer, 0, 50);
        assertEquals(50, bytesRead);
    }

    @Test
    public void testReadAtEOF() throws Exception {
        ByteArrayInputStream bais = createInputStreamWithFile();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        
        byte[] buffer = new byte[200];
        int bytesRead = inputStream.read(buffer, 0, 200);
        assertEquals(100, bytesRead); // Entry size is 100
        
        bytesRead = inputStream.read(buffer, 0, 50);
        assertEquals(-1, bytesRead);
    }

    @Test(expected = NullPointerException.class)
    public void testReadWithNullBuffer() throws Exception {
        ByteArrayInputStream bais = createInputStreamWithFile();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        inputStream.read(null, 0, 50);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadWithInvalidOffset() throws Exception {
        ByteArrayInputStream bais = createInputStreamWithFile();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        byte[] buffer = new byte[50];
        inputStream.read(buffer, -1, 50);
    }

    @Test
    public void testClose() throws Exception {
        ByteArrayInputStream bais = createValidInputStream();
        inputStream = new DumpArchiveInputStream(bais);
        inputStream.close();
        assertTrue(inputStream.isClosed);
    }

    @Test
    public void testDoubleClose() throws Exception {
        ByteArrayInputStream bais = createValidInputStream();
        inputStream = new DumpArchiveInputStream(bais);
        inputStream.close();
        inputStream.close(); // Should not throw exception
    }

    @Test
    public void testMatchesWithValidBuffer() {
        byte[] buffer = new byte[DumpArchiveConstants.TP_SIZE];
        // Assume DumpArchiveUtil.verify returns true for this buffer
        assertTrue(DumpArchiveInputStream.matches(buffer, DumpArchiveConstants.TP_SIZE));
    }

    @Test
    public void testMatchesWithShortBuffer() {
        byte[] buffer = new byte[31];
        assertFalse(DumpArchiveInputStream.matches(buffer, 31));
    }

    @Test
    public void testMatchesWithMediumBuffer() {
        byte[] buffer = new byte[64];
        // Set magic number at offset 24
        DumpArchiveUtil.put32(buffer, 24, DumpArchiveConstants.NFS_MAGIC);
        assertTrue(DumpArchiveInputStream.matches(buffer, 64));
    }

    @Test
    public void testMatchesWithInvalidBuffer() {
        byte[] buffer = new byte[64];
        // Set wrong magic number
        DumpArchiveUtil.put32(buffer, 24, 0);
        assertFalse(DumpArchiveInputStream.matches(buffer, 64));
    }

    @Test
    public void testGetBytesRead() throws Exception {
        ByteArrayInputStream bais = createInputStreamWithFile();
        inputStream = new DumpArchiveInputStream(bais);
        long initialBytesRead = inputStream.getBytesRead();
        assertTrue(initialBytesRead >= 0);
    }

    @Test
    public void testGetSummary() throws Exception {
        ByteArrayInputStream bais = createValidInputStream();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveSummary summary = inputStream.getSummary();
        assertNotNull(summary);
        assertNotNull(summary.getVolumeName());
    }

    @Test
    public void testPendingQueueAfterGetEntry() throws Exception {
        // Test that entries are resolved correctly
        ByteArrayInputStream bais = createInputStreamWithDirectory();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        // After getting an entry, pending should be empty for resolved entries
        assertTrue(inputStream.pending.isEmpty());
    }

    @Test
    public void testReadDirectoryEntryCreatesNames() throws Exception {
        // Create an input stream with directory entries that have children
        ByteArrayInputStream bais = createInputStreamWithNestedDirectory();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        // Check that names map contains entries
        assertFalse(inputStream.names.isEmpty());
    }

    @Test
    public void testReadWithMultipleBlocks() throws Exception {
        // Test reading data that spans multiple blocks
        ByteArrayInputStream bais = createInputStreamWithLargeFile();
        inputStream = new DumpArchiveInputStream(bais);
        DumpArchiveEntry entry = inputStream.getNextEntry();
        assertNotNull(entry);
        assertFalse(entry.isDirectory());
        
        byte[] buffer = new byte[2000];
        int totalRead = 0;
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer, totalRead, buffer.length - totalRead)) != -1) {
            totalRead += bytesRead;
        }
        assertEquals(entry.getEntrySize(), totalRead);
    }

    // Helper methods to create test data
    private byte[] createDumpHeader() {
        // Create a minimal valid dump header (1024 bytes)
        byte[] header = new byte[1024];
        // Set magic number at offset 24
        DumpArchiveUtil.put32(header, 24, DumpArchiveConstants.NFS_MAGIC);
        // Set other necessary fields to make verify() pass
        // This is a simplified version - actual implementation would need valid checksum
        return header;
    }

    private byte[] createClriSegment() {
        // Create CLRI segment - 1024 bytes
        byte[] segment = new byte[1024];
        // Set type to CLRI
        segment[12] = (byte) DumpArchiveConstants.SEGMENT_TYPE.CLRI.ordinal();
        return segment;
    }

    private byte[] createBitsSegment() {
        // Create BITS segment - 1024 bytes
        byte[] segment = new byte[1024];
        // Set type to BITS
        segment[12] = (byte) DumpArchiveConstants.SEGMENT_TYPE.BITS.ordinal();
        return segment;
    }

    private byte[] createInodeSegment() {
        // Create INODE segment for a file
        byte[] segment = new byte[1024];
        // Set type to INODE
        segment[12] = (byte) DumpArchiveConstants.SEGMENT_TYPE.INODE.ordinal();
        // Set inode number
        DumpArchiveUtil.put32(segment, 20, 3); // Some inode
        // Set entry size (100 bytes)
        DumpArchiveUtil.put64(segment, 40, 100);
        return segment;
    }

    private byte[] createAddrSegment() {
        // Create ADDR segment
        byte[] segment = new byte[1024];
        // Set type to ADDR
        segment[12] = (byte) DumpArchiveConstants.SEGMENT_TYPE.ADDR.ordinal();
        return segment;
    }

    private byte[] createEndSegment() {
        // Create END segment
        byte[] segment = new byte[1024];
        // Set type to END
        segment[12] = (byte) DumpArchiveConstants.SEGMENT_TYPE.END.ordinal();
        return segment;
    }

    private byte[] createDataSegment() {
        // Create data segment with some content
        byte[] segment = new byte[1024];
        // Fill with some data
        for (int i = 0; i < segment.length; i++) {
            segment[i] = (byte) (i % 256);
        }
        return segment;
    }

    private ByteArrayInputStream createValidInputStream() {
        // Create a minimal valid dump archive stream
        byte[] archive = new byte[3072]; // header + CLRI + BITS
        System.arraycopy(createDumpHeader(), 0, archive, 0, 1024);
        System.arraycopy(createClriSegment(), 0, archive, 1024, 1024);
        System.arraycopy(createBitsSegment(), 0, archive, 2048, 1024);
        return new ByteArrayInputStream(archive);
    }

    private ByteArrayInputStream createInputStreamWithEndOnly() {
        // Create stream with header, CLRI, BITS, then END
        byte[] archive = new byte[4096];
        System.arraycopy(createDumpHeader(), 0, archive, 0, 1024);
        System.arraycopy(createClriSegment(), 0, archive, 1024, 1024);
        System.arraycopy(createBitsSegment(), 0, archive, 2048, 1024);
        System.arraycopy(createEndSegment(), 0, archive, 3072, 1024);
        return new ByteArrayInputStream(archive);
    }

    private ByteArrayInputStream createInputStreamWithDirectory() {
        // Create stream with a directory entry
        byte[] archive = new byte[5120];
        System.arraycopy(createDumpHeader(), 0, archive, 0, 1024);
        System.arraycopy(createClriSegment(), 0, archive, 1024, 1024);
        System.arraycopy(createBitsSegment(), 0, archive, 2048, 1024);
        // Directory inode
        byte[] dirInode = createInodeSegment();
        dirInode[24] = 1; // Set directory flag
        DumpArchiveUtil.put64(dirInode, 40, 0); // Directory size
        System.arraycopy(dirInode, 0, archive, 3072, 1024);
        // Add data segment with directory entries
        System.arraycopy(createDataSegment(), 0, archive, 4096, 1024);
        return new ByteArrayInputStream(archive);
    }

    private ByteArrayInputStream createInputStreamWithFile() {
        // Create stream with a file entry
        byte[] archive = new byte[5120];
        System.arraycopy(createDumpHeader(), 0, archive, 0, 1024);
        System.arraycopy(createClriSegment(), 0, archive, 1024, 1024);
        System.arraycopy(createBitsSegment(), 0, archive, 2048, 1024);
        System.arraycopy(createInodeSegment(), 0, archive, 3072, 1024);
        System.arraycopy(createDataSegment(), 0, archive, 4096, 1024);
        return new ByteArrayInputStream(archive);
    }

    private ByteArrayInputStream createInputStreamWithNestedDirectory() {
        // Create stream with nested directory structure
        byte[] archive = new byte[6144];
        System.arraycopy(createDumpHeader(), 0, archive, 0, 1024);
        System.arraycopy(createClriSegment(), 0, archive, 1024, 1024);
        System.arraycopy(createBitsSegment(), 0, archive, 2048, 1024);
        
        // First directory
        byte[] dirInode1 = createInodeSegment();
        dirInode1[24] = 1; // Set directory flag
        DumpArchiveUtil.put32(dirInode1, 20, 2); // Root inode
        DumpArchiveUtil.put64(dirInode1, 40, 0);
        System.arraycopy(dirInode1, 0, archive, 3072, 1024);
        
        // Data for first directory with child entries
        System.arraycopy(createDataSegment(), 0, archive, 4096, 1024);
        
        return new ByteArrayInputStream(archive);
    }

    private ByteArrayInputStream createInputStreamWithLargeFile() {
        // Create stream with a large file (multiple blocks)
        byte[] archive = new byte[10240];
        System.arraycopy(createDumpHeader(), 0, archive, 0, 1024);
        System.arraycopy(createClriSegment(), 0, archive, 1024, 1024);
        System.arraycopy(createBitsSegment(), 0, archive, 2048, 1024);
        
        // File inode with large size
        byte[] fileInode = createInodeSegment();
        DumpArchiveUtil.put64(fileInode, 40, 2000); // 2000 bytes
        System.arraycopy(fileInode, 0, archive, 3072, 1024);
        
        // Multiple data segments
        for (int i = 0; i < 8; i++) {
            System.arraycopy(createDataSegment(), 0, archive, 4096 + i * 1024, 1024);
        }
        
        // End segment
        System.arraycopy(createEndSegment(), 0, archive, 9216, 1024);
        
        return new ByteArrayInputStream(archive);
    }
}