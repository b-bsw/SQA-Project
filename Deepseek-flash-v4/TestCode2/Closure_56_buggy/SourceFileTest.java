package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class SourceFileTest {

    private static final String CODE_WITH_NEWLINE =
        "line1\nline2\nline3\nline4\nline5\n";
    private static final String CODE_WITHOUT_NEWLINE =
        "line1\nline2\nline3\nline4\nline5";
    private static final String NEXISTENT_FILE = "/nonexistent/file.js";

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFileName() {
        new SourceFile(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyFileName() {
        new SourceFile("");
    }

    @Test
    public void testGetName() {
        SourceFile sf = SourceFile.fromCode("test.js", "dummy");
        assertEquals("test.js", sf.getName());
    }

    @Test
    public void testOriginalPath() {
        SourceFile sf1 = SourceFile.fromCode("test.js", "original.js", "dummy");
        assertEquals("original.js", sf1.getOriginalPath());

        SourceFile sf2 = SourceFile.fromCode("test.js", "dummy");
        assertEquals("test.js", sf2.getOriginalPath());
    }

    @Test
    public void testIsExternDefault() {
        SourceFile sf = SourceFile.fromCode("test.js", "dummy");
        assertFalse(sf.isExtern());
    }

    @Test
    public void testGetCodePreloaded() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertEquals(CODE_WITH_NEWLINE, sf.getCode());
    }

    @Test
    public void testGetCodeReaderPreloaded() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITHOUT_NEWLINE);
        Reader r = sf.getCodeReader();
        assertNotNull(r);
        char[] buf = new char[100];
        int len = r.read(buf);
        String content = new String(buf, 0, len);
        assertEquals(CODE_WITHOUT_NEWLINE, content);
        r.close();
    }

    @Test
    public void testGetLineFirstLine() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertEquals("line1", sf.getLine(1));
    }

    @Test
    public void testGetLineMiddleLine() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertEquals("line3", sf.getLine(3));
    }

    @Test
    public void testGetLineLastLineWithNewline() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertEquals("line5", sf.getLine(5));
    }

    @Test
    public void testGetLineLastLineWithoutNewline() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITHOUT_NEWLINE);
        assertNull(sf.getLine(5)); // no trailing newline -> indexOf returns -1
    }

    @Test
    public void testGetLineOutOfBounds() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertNull(sf.getLine(6));
    }

    @Test
    public void testGetLineWithIOException() {
        SourceFile sf = SourceFile.fromFile(NEXISTENT_FILE);
        assertNull(sf.getLine(1)); // getCode throws, returns null
    }

    @Test
    public void testLineCacheBehavior() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js",
            "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\n");
        // first call: lineNumber >= lastLine (1)
        assertEquals("h", sf.getLine(8));
        // second call: lineNumber < lastLine (2 < 8 after cache)
        assertEquals("b", sf.getLine(2));
    }

    @Test
    public void testGetRegionValid() {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITHOUT_NEWLINE);
        Region r = sf.getRegion(3);
        assertNotNull(r);
        SimpleRegion sr = (SimpleRegion) r;
        assertEquals(1, sr.getStartLine());
        assertEquals(6, sr.getEndLine());
        assertEquals("line1\nline2\nline3\nline4\nline5", sr.getSource());
    }

    @Test
    public void testGetRegionBeyondFile() {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITHOUT_NEWLINE);
        assertNull(sf.getRegion(6));
    }

    @Test
    public void testGetRegionWithIOException() {
        SourceFile sf = SourceFile.fromFile(NEXISTENT_FILE);
        assertNull(sf.getRegion(1));
    }

    @Test
    public void testGetLineOffsetValid() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertEquals(0, sf.getLineOffset(1));
        assertEquals(6, sf.getLineOffset(2));
        assertEquals(24, sf.getLineOffset(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLineOffsetInvalidBelowOne() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        sf.getLineOffset(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLineOffsetInvalidAbove() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        sf.getLineOffset(6);
    }

    @Test
    public void testGetNumLinesPreloaded() throws IOException {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertEquals(5, sf.getNumLines());
    }

    @Test
    public void testGetNumLinesWithIOException() {
        SourceFile sf = SourceFile.fromFile(NEXISTENT_FILE);
        assertEquals(1, sf.getNumLines()); // fallback lineOffsets length 1
    }

    @Test
    public void testHasSourceInMemoryPreloaded() {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        assertTrue(sf.hasSourceInMemory());
    }

    @Test
    public void testHasSourceInMemoryOnDiskNotCached() {
        SourceFile sf = SourceFile.fromFile(NEXISTENT_FILE);
        assertFalse(sf.hasSourceInMemory());
    }

    @Test
    public void testClearCachedSourceOnPreloaded() {
        SourceFile sf = SourceFile.fromCode("test.js", CODE_WITH_NEWLINE);
        sf.clearCachedSource(); // base implementation does nothing
        assertTrue(sf.hasSourceInMemory());
    }
}