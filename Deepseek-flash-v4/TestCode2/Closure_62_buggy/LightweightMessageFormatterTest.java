package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class LightweightMessageFormatterTest {

    private LightweightMessageFormatter formatter;
    private LightweightMessageFormatter formatterWithoutSource;
    private LightweightMessageFormatter formatterWithLineExcerpt;
    private LightweightMessageFormatter formatterWithOtherExcerpt;
    private static final String SOURCE_NAME = "test.js";
    private static final int LINE_NUMBER = 5;
    private static final int CHARNO = 3;
    private static final String LINE_CONTENT = "var x = 1;";
    private static final String DESCRIPTION = "Something went wrong";

    @Before
    public void setUp() {
        // JSError and source excerpt provider are created per test if needed
        formatter = null;
        formatterWithoutSource = LightweightMessageFormatter.withoutSource();
    }

    @After
    public void tearDown() {
        formatter = null;
        formatterWithoutSource = null;
    }

    private JSError createErrorWithSource(SourceExcerptProvider sourceProvider) {
        return JSError.make(SOURCE_NAME, LINE_NUMBER, CHARNO, CheckLevel.ERROR, DESCRIPTION);;
    }

    private JSError createErrorNullSource() {
        return JSError.make(null, LINE_NUMBER, CHARNO, CheckLevel.ERROR, DESCRIPTION);;
    }

    private JSError createWarningWithSource(SourceExcerptProvider sourceProvider) {
        return JSError.make(SOURCE_NAME, LINE_NUMBER, CHARNO, CheckLevel.WARNING, DESCRIPTION);;
    }

    private JSError createErrorNoLine() {
        return JSError.make(SOURCE_NAME, 0, CHARNO, CheckLevel.ERROR, DESCRIPTION);;
    }

    // Helper to create a SourceExcerptProvider that returns a simple line excerpt
    private SourceExcerptProvider createSimpleSourceProvider(final String lineContent) {
        return new SourceExcerptProvider() {
            @Override
            public String getSourceLine(String sourceName, int lineNumber) {
                if (sourceName == null) return null;
                return lineContent;
            }

            @Override
            public Region getSourceRegion(String sourceName, int lineNumber) {
                return null; // not used in this test setup
            }
        };
    }

    // Test 1: formatError with source and valid charno
    @Test
    public void testFormatErrorWithSourceAndCharno() {
        SourceExcerptProvider sourceProvider = createSimpleSourceProvider(LINE_CONTENT);
        formatter = new LightweightMessageFormatter(sourceProvider);
        JSError error = new JSError(SOURCE_NAME, "testSource", LINE_NUMBER, CHARNO, CheckLevel.ERROR, DESCRIPTION);
        String result = formatter.formatError(error);
        assertTrue(result.contains(SOURCE_NAME));
        assertTrue(result.contains(String.valueOf(LINE_NUMBER)));
        assertTrue(result.contains("ERROR"));
        assertTrue(result.contains(DESCRIPTION));
        assertTrue(result.contains(LINE_CONTENT));
        assertTrue(result.contains("^"));
    }

    // Test 2: formatWarning with source
    @Test
    public void testFormatWarningWithSource() {
        SourceExcerptProvider sourceProvider = createSimpleSourceProvider(LINE_CONTENT);
        formatter = new LightweightMessageFormatter(sourceProvider);
        JSError warning = new JSError(SOURCE_NAME, "testSource", LINE_NUMBER, CHARNO, CheckLevel.WARNING, DESCRIPTION);
        String result = formatter.formatWarning(warning);
        assertTrue(result.contains("WARNING"));
        assertFalse(result.contains("ERROR"));
    }

    // Test 3: formatError with null source name
    @Test
    public void testFormatErrorNullSourceName() {
        formatter = LightweightMessageFormatter.withoutSource();
        JSError error = new JSError(null, "testSource", LINE_NUMBER, CHARNO, CheckLevel.ERROR, DESCRIPTION);
        String result = formatter.formatError(error);
        assertFalse(result.contains(SOURCE_NAME));
        assertTrue(result.contains("ERROR"));
        assertTrue(result.contains(DESCRIPTION));
    }

    // Test 4: formatError with source but line number 0
    @Test
    public void testFormatErrorLineNumberZero() {
        SourceExcerptProvider sourceProvider = createSimpleSourceProvider(LINE_CONTENT);
        formatter = new LightweightMessageFormatter(sourceProvider);
        JSError error = new JSError(SOURCE_NAME, "testSource", 0, CHARNO, CheckLevel.ERROR, DESCRIPTION);
        String result = formatter.formatError(error);
        assertTrue(result.contains(SOURCE_NAME));
        assertFalse(result.contains(":0:"));
        assertTrue(result.contains("ERROR"));
    }

    // Test 5: formatError with null sourceExcerpt (null provider)
    @Test
    public void testFormatErrorNullSourceExcerpt() {
        formatter = LightweightMessageFormatter.withoutSource();
        JSError error = createErrorWithSource(null);
        String result = formatter.formatError(error);
        // withoutSource uses super(null) so getSource() returns null -> sourceExcerpt null
        assertFalse(result.contains(LINE_CONTENT));
    }

    // Test 6: formatError with charno == sourceExcerpt.length()
    @Test
    public void testFormatErrorCharnoEqualsExcerptLength() {
        SourceExcerptProvider sourceProvider = createSimpleSourceProvider(LINE_CONTENT);
        formatter = new LightweightMessageFormatter(sourceProvider);
        int charnoAtEnd = LINE_CONTENT.length(); // charno equals length
        JSError error = new JSError(SOURCE_NAME, "testSource", LINE_NUMBER, charnoAtEnd, CheckLevel.ERROR, DESCRIPTION);
        String result = formatter.formatError(error);
        assertTrue(result.contains(LINE_CONTENT));
        // No caret line because condition fails: 0 <= charno < length()
        assertFalse(result.contains("^"));
    }

    // Test 7: formatError with negative charno
    @Test
    public void testFormatErrorNegativeCharno() {
        SourceExcerptProvider sourceProvider = createSimpleSourceProvider(LINE_CONTENT);
        formatter = new LightweightMessageFormatter(sourceProvider);
        JSError error = new JSError(SOURCE_NAME, "testSource", LINE_NUMBER, -1, CheckLevel.ERROR, DESCRIPTION);
        String result = formatter.formatError(error);
        assertTrue(result.contains(LINE_CONTENT));
        assertFalse(result.contains("^"));
    }

    // Test 8: withoutSource creates formatter with null source
    @Test
    public void testWithoutSourceNullSource() {
        LightweightMessageFormatter noSource = LightweightMessageFormatter.withoutSource();
        assertNotNull(noSource);
        JSError error = createErrorNullSource();
        String result = noSource.formatError(error);
        assertFalse(result.contains(SOURCE_NAME));
    }

    // Test 9: Test LineNumberingFormatter.formatRegion with non-null region
    @Test
    public void testLineNumberingFormatterFormatRegion() {
        LightweightMessageFormatter.LineNumberingFormatter lnf = new LightweightMessageFormatter.LineNumberingFormatter();
        // Create a simple region
        Region region = new Region() {
            @Override
            public int getBeginningLineNumber() { return 1; }
            @Override
            public int getEndingLineNumber() { return 2; }
            @Override
            public String getSourceExcerpt() { return "line1\nline2"; }
        };
        String result = lnf.formatRegion(region);
        assertNotNull(result);
        assertTrue(result.contains("1|"));
        assertTrue(result.contains("2|"));
    }

    // Test 10: Test LineNumberingFormatter.formatRegion with null region
    @Test
    public void testLineNumberingFormatterFormatRegionNull() {
        LightweightMessageFormatter.LineNumberingFormatter lnf = new LightweightMessageFormatter.LineNumberingFormatter();
        assertNull(lnf.formatRegion(null));
    }

    // Test 11: Test LineNumberingFormatter.formatRegion with empty excerpt
    @Test
    public void testLineNumberingFormatterFormatRegionEmptyExcerpt() {
        LightweightMessageFormatter.LineNumberingFormatter lnf = new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new Region() {
            @Override
            public int getBeginningLineNumber() { return 1; }
            @Override
            public int getEndingLineNumber() { return 1; }
            @Override
            public String getSourceExcerpt() { return ""; }
        };
        assertNull(lnf.formatRegion(region));
    }

    // Test 12: formatError with excerpt type not LINE (e.g., source excerpt null from other type)
    @Test
    public void testFormatErrorOtherExcerptType() {
        // Create a provider that returns null for LINE excerpt (but we set excerpt to LINE anyway, so test is still valid)
        // Actually we need to test when excerpt is not LINE, the caret line block is skipped.
        // We'll create a custom SourceExcerpt that returns null for get().
        SourceExcerpt nonLineExcerpt = new SourceExcerpt() {
            @Override
            public String get(SourceExcerptProvider provider, String sourceName, int lineNumber, ExcerptFormatter formatter) {
                return null;
            }
        };
        SourceExcerptProvider sourceProvider = createSimpleSourceProvider(LINE_CONTENT);
        formatter = new LightweightMessageFormatter(sourceProvider, nonLineExcerpt);
        JSError error = new JSError(SOURCE_NAME, "testSource", LINE_NUMBER, CHARNO, CheckLevel.ERROR, DESCRIPTION);
        String result = formatter.formatError(error);
        // no source excerpt appended, but still contains basic info
        assertTrue(result.contains(SOURCE_NAME));
        assertTrue(result.contains("ERROR"));
        // No excerpt line, no caret
        assertFalse(result.contains(LINE_CONTENT));
        assertFalse(result.contains("^"));
    }

    // Test 13: formatWarning with no source (just to ensure warning method works)
    @Test
    public void testFormatWarningWithoutSource() {
        formatter = LightweightMessageFormatter.withoutSource();
        JSError warning = new JSError(null, "testSource", LINE_NUMBER, CHARNO, CheckLevel.WARNING, DESCRIPTION);
        String result = formatter.formatWarning(warning);
        assertTrue(result.contains("WARNING"));
    }

    // Test 14: formatError with charno within range and excerpt.formatLine test
    @Test
    public void testFormatLineMethod() {
        LightweightMessageFormatter.LineNumberingFormatter lnf = new LightweightMessageFormatter.LineNumberingFormatter();
        String line = "test line";
        int lineNumber = 42;
        assertEquals(line, lnf.formatLine(line, lineNumber));
    }

    // Inner class representing JSError for simplicity (since we don't import real JSError to avoid dependency)
    // We'll create a minimal JSError implementation to satisfy the test.
    // But actually we should use the real JSError from the source package if available.
    // Since the source code uses JSError from com.google.javascript.jscomp, we assume it is available.
    // We'll just create a subclass or use the public constructor if provided.
    // For the test, we'll create a concrete JSError using the available constructor.
    // The constructor signature: JSError(String sourceName, String source, int lineno, int charno, CheckLevel level, String description)
    // We'll use that.
}