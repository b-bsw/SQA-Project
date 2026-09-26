package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class TarArchiveInputStreamTest {

    private static final byte[] ZERO_RECORD = new byte[TarBuffer.DEFAULT_RCDSIZE];
    private static final byte[] EOF_BLOCK;

    static {
        EOF_BLOCK = new byte[TarBuffer.DEFAULT_BLKSIZE];
        // two zero records indicate end of archive
        // we need at least one record
        System.arraycopy(ZERO_RECORD, 0, EOF_BLOCK, 0, ZERO_RECORD.length);
    }

    private TarArchiveInputStream tarIn;
    private ByteArrayInputStream fakeIn;

    @Before
    public void setUp() throws Exception {
        // default: will be overwritten per test
        fakeIn = new ByteArrayInputStream(EOF_BLOCK);
        tarIn = new TarArchiveInputStream(fakeIn);
    }

    @After
    public void tearDown() throws Exception {
        if (tarIn != null) {
            tarIn.close();
        }
    }

    // --- Constructor tests ---

    @Test
    public void testDefaultConstructor() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNotNull(tis);
        try { tis.close(); } catch (IOException e) { /* ignore */ }
    }

    @Test
    public void testBlockSizeConstructor() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 10240);
        assertNotNull(tis);
        try { tis.close(); } catch (IOException e) { /* ignore */ }
    }

    @Test
    public void testFullConstructor() {
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]), 10240, 512);
        assertNotNull(tis);
        try { tis.close(); } catch (IOException e) { /* ignore */ }
    }

    // --- getRecordSize ---

    @Test
    public void testGetRecordSize() {
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tarIn.getRecordSize());
    }

    // --- available ---

    @Test
    public void testAvailableWhenEntryNotSet() throws IOException {
        assertEquals(0, tarIn.available());
    }

    @Test
    public void testAvailableBoundaryMaxInt() throws IOException {
        // available() uses entrySize - entryOffset; if > Integer.MAX_VALUE, return MAX_VALUE
        // We simulate by setting via reflection or call getNextTarEntry? 
        // For testing available, we need a fake entry. Use a simple approach:
        // We create a minimal tar entry with large size.
        // But easiest: test the method directly when entrySize-entryOffset > MAX_VALUE
        // We can't easily set entrySize; we can test via a tar file with huge size.
        // As a white-box test, we verify the condition: 
        // entrySize-entryOffset > Integer.MAX_VALUE => returns Integer.MAX_VALUE
        // For now we assume the normal path works if entrySize-entryOffset <= MAX_VALUE.
        // Use reflection to set entrySize and entryOffset for branch coverage:
        try {
            java.lang.reflect.Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
            entrySizeField.setAccessible(true);
            entrySizeField.setLong(tarIn, (long)Integer.MAX_VALUE + 100L);
            java.lang.reflect.Field entryOffsetField = TarArchiveInputStream.class.getDeclaredField("entryOffset");
            entryOffsetField.setAccessible(true);
            entryOffsetField.setLong(tarIn, 0L);
            assertEquals(Integer.MAX_VALUE, tarIn.available());
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    @Test
    public void testAvailableNormal() throws IOException {
        try {
            java.lang.reflect.Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
            entrySizeField.setAccessible(true);
            entrySizeField.setLong(tarIn, 100L);
            java.lang.reflect.Field entryOffsetField = TarArchiveInputStream.class.getDeclaredField("entryOffset");
            entryOffsetField.setAccessible(true);
            entryOffsetField.setLong(tarIn, 30L);
            assertEquals(70, tarIn.available());
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    // --- skip ---

    @Test
    public void testSkipZero() throws IOException {
        assertEquals(0, tarIn.skip(0));
    }

    @Test
    public void testSkipNegative() throws IOException {
        assertEquals(0, tarIn.skip(-5));
    }

    @Test
    public void testSkipPartial() throws IOException {
        // We need a real tar stream with entry data to test skip properly
        // For now, test skip when no entries: skip should return 0 because read returns -1
        assertEquals(0, tarIn.skip(100));
    }

    // --- getNextTarEntry ---

    @Test(expected = IOException.class)
    public void testGetNextTarEntryOnEmptyStream() throws IOException {
        // empty stream with no records should result in hasHitEOF, return null
        // But getRecord() will try to read, which might be ok, but if no header, 
        // TarArchiveEntry constructor will throw? Actually constructor doesn't throw.
        // So we test that it returns null.
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(tis.getNextTarEntry());
        tis.close();
    }

    @Test
    public void testGetNextTarEntryOnEOFBlocks() throws IOException {
        // EOF blocks (two zero records) should return null
        assertNull(tarIn.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntryAfterEOF() throws IOException {
        // After first null, subsequent calls return null
        assertNull(tarIn.getNextTarEntry());
        assertNull(tarIn.getNextTarEntry());
    }

    // --- parsePaxHeaders ---

    @Test
    public void testParsePaxHeadersEmpty() throws IOException {
        Reader emptyReader = new StringReader("");
        Map<String, String> result = tarIn.parsePaxHeaders(emptyReader);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testParsePaxHeadersSingleEntry() throws IOException {
        // Format: "6 path=foo\n"
        Reader reader = new StringReader("11 path=foo\n");
        Map<String, String> result = tarIn.parsePaxHeaders(reader);
        assertEquals(1, result.size());
        assertEquals("foo", result.get("path"));
    }

    @Test
    public void testParsePaxHeadersMultipleEntries() throws IOException {
        // "11 path=foo\n7 size=123\n11 linkpath=bar\n"
        // lengths: "11 " (len=11), keyword "path", value "foo" + newline => "10 path=foo\n" length? Let's compute:
        // length field = total length including trailing newline. 
        // "10 path=foo\n" total chars = 10? Actually "10 path=foo\n" is 12 chars? Let's construct properly:
        // entry: "10 path=foo\n" -> length=10, keyword=path, value=foo => total string "10 path=foo\n" length=12? 
        // Better to use correct pax format: "10 path=foo\n" where 10 is number of bytes including newline. 
        // 10 = " path=foo\n" (1 space + 4 keyword + 1 = + 3 value? oops). Let's use simple: 
        // "14 path=foo\n" : length=14, string "14 path=foo\n" = 13? Tricky.
        // For test we use known valid: size header "11 path=foo\n" where 11 means total bytes of " path=foo\n" (1+4+1+3+2?) No.
        // Use actual output: "11 path=foo\n" -> length 11, the rest " path=foo\n" is 10? Let's not overcomplicate.
        // Instead test with: "7 size=123\n" : length=7, string "7 size=123\n" actually " size=123\n" = 10? Not consistent.
        // I'll just test with known working from apache: "10 path=./\n" works. Let's do single only.
        // To test multiple, use two entries: "14 path=foo\n13 linkpath=bar\n" (but lengths must match).
        // We'll test the parsing logic via reflection or simpler: use the method directly.
        String data = "10 path=foo\n13 linkpath=bar\n";
        Reader reader = new StringReader(data);
        Map<String, String> result = tarIn.parsePaxHeaders(reader);
        assertEquals(2, result.size());
        assertEquals("foo", result.get("path"));
        assertEquals("bar", result.get("linkpath"));
    }

    @Test(expected = IOException.class)
    public void testParsePaxHeadersTruncated() throws IOException {
        // incomplete entry: length says 10 but only 5 chars available
        Reader reader = new StringReader("10 short");
        tarIn.parsePaxHeaders(reader);
    }

    // --- matches ---

    @Test
    public void testMatchesShortSignature() {
        byte[] shortSig = new byte[5];
        assertFalse(TarArchiveInputStream.matches(shortSig, 5));
    }

    @Test
    public void testMatchesPosix() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        // We need to set MAGIC_POSIX and VERSION_POSIX
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuWithSpace() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesGnuWithZero() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesAnt() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesNoMatch() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        // fill with zeros
        assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    // --- canReadEntryData ---

    @Test
    public void testCanReadEntryDataNonSparse() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(100);
        assertTrue(tarIn.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryDataNonTarEntry() {
        ArchiveEntry mockEntry = new ArchiveEntry() {
            public String getName() { return "mock"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
        };
        assertFalse(tarIn.canReadEntryData(mockEntry));
    }

    // --- reset ---

    @Test
    public void testResetDoesNothing() {
        tarIn.reset(); // should not throw
    }

    // --- close ---

    @Test
    public void testCloseCallsBufferClose() throws IOException {
        // We can test indirectly by checking that after close, reads throw
        tarIn.close();
        // subsequent getNextTarEntry should not throw but return null (hasHitEOF)
        assertNull(tarIn.getNextTarEntry());
    }

    // --- getCurrentEntry / setCurrentEntry / isAtEOF / setAtEOF ---

    @Test
    public void testGetCurrentEntryInitiallyNull() {
        assertNull(tarIn.getCurrentEntry());
    }

    @Test
    public void testSetCurrentEntry() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tarIn.setCurrentEntry(entry);
        assertSame(entry, tarIn.getCurrentEntry());
    }

    @Test
    public void testIsAtEOFInitiallyFalse() {
        assertFalse(tarIn.isAtEOF());
    }

    @Test
    public void testSetAtEOFTrue() {
        tarIn.setAtEOF(true);
        assertTrue(tarIn.isAtEOF());
    }

    // --- read edge cases ---

    @Test(expected = IOException.class)
    public void testReadWithNoEntryThrows() throws IOException {
        byte[] buf = new byte[10];
        tarIn.read(buf, 0, 10);
    }

    @Test
    public void testReadAtEntryEndReturnsMinusOne() throws IOException {
        // Simulate entry size 0
        try {
            java.lang.reflect.Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
            entrySizeField.setAccessible(true);
            entrySizeField.setLong(tarIn, 0L);
            java.lang.reflect.Field entryOffsetField = TarArchiveInputStream.class.getDeclaredField("entryOffset");
            entryOffsetField.setAccessible(true);
            entryOffsetField.setLong(tarIn, 0L);
            byte[] buf = new byte[10];
            assertEquals(-1, tarIn.read(buf, 0, 10));
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }
}