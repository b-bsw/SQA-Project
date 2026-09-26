package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void testNewFormatAndDelimiter() {
        CSVFormat fmt = CSVFormat.newFormat(';');
        assertEquals(';', fmt.getDelimiter());
        assertNull(fmt.getQuoteCharacter());
        assertFalse(fmt.isQuoteCharacterSet());
        assertFalse(fmt.getIgnoreEmptyLines());

        CSVFormat changed = fmt.withDelimiter('|');
        assertEquals('|', changed.getDelimiter());
        assertEquals(';', fmt.getDelimiter());
    }

    @Test
    public void testImmutability() {
        CSVFormat original = CSVFormat.DEFAULT;
        CSVFormat changed = original.withDelimiter(';');
        assertEquals(',', original.getDelimiter());
        assertEquals(';', changed.getDelimiter());
    }

    @Test
    public void testQuoteAndQuoteMode() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote('\'').withQuoteMode(QuoteMode.ALL);
        assertEquals(Character.valueOf('\''), fmt.getQuoteCharacter());
        assertEquals(QuoteMode.ALL, fmt.getQuoteMode());
        assertTrue(fmt.isQuoteCharacterSet());

        CSVFormat noQuote = fmt.withQuote(null);
        assertNull(noQuote.getQuoteCharacter());
        assertFalse(noQuote.isQuoteCharacterSet());
    }

    @Test
    public void testEscapeAndCommentMarker() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withCommentMarker('#');
        assertEquals(Character.valueOf('\\'), fmt.getEscapeCharacter());
        assertEquals(Character.valueOf('#'), fmt.getCommentMarker());
        assertTrue(fmt.isEscapeCharacterSet());
        assertTrue(fmt.isCommentMarkerSet());

        assertFalse(fmt.withEscape(null).isEscapeCharacterSet());
        assertFalse(fmt.withCommentMarker(null).isCommentMarkerSet());
    }

    @Test
    public void testHeaderAndNullString() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("A", "B").withNullString("NULL");
        assertArrayEquals(new String[]{"A", "B"}, fmt.getHeader());
        assertEquals("NULL", fmt.getNullString());
        assertTrue(fmt.isNullStringSet());
        assertFalse(fmt.withNullString(null).isNullStringSet());
    }

    @Test
    public void testRecordSeparatorAndFlags() {
        CSVFormat fmt = CSVFormat.DEFAULT
                .withRecordSeparator("SEP")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withIgnoreHeaderCase(true)
                .withSkipHeaderRecord(true)
                .withTrim(true)
                .withTrailingDelimiter(true)
                .withAutoFlush(true)
                .withAllowMissingColumnNames(true);

        assertEquals("SEP", fmt.getRecordSeparator());
        assertTrue(fmt.getIgnoreEmptyLines());
        assertTrue(fmt.getIgnoreSurroundingSpaces());
        assertTrue(fmt.getIgnoreHeaderCase());
        assertTrue(fmt.getSkipHeaderRecord());
        assertTrue(fmt.getTrim());
        assertTrue(fmt.getTrailingDelimiter());
        assertTrue(fmt.getAutoFlush());
        assertTrue(fmt.getAllowMissingColumnNames());
    }

    @Test
    public void testFormatNormalValues() {
        assertEquals("a,b", CSVFormat.RFC4180.format("a", "b"));
    }

    @Test
    public void testFormatQuotesDelimiter() {
        assertEquals("\"a,b\"", CSVFormat.RFC4180.format("a,b"));
    }

    @Test
    public void testFormatNullString() {
        assertEquals("NULL", CSVFormat.RFC4180.withNullString("NULL")
                .format((Object) null));
    }

    @Test
    public void testFormatTrailingDelimiter() {
        CSVFormat fmt = CSVFormat.RFC4180.withTrailingDelimiter(true);
        assertEquals("a,b,", fmt.format("a", "b"));
    }

    @Test
    public void testFormatQuoteModeAll() {
        CSVFormat fmt = CSVFormat.RFC4180.withQuoteMode(QuoteMode.ALL);
        assertEquals("\"a\",\"b\"", fmt.format("a", "b"));
    }

    @Test
    public void testPrintRecord() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat.RFC4180.printRecord(out, "a", "b");
        assertEquals("a,b" + CSVFormat.RFC4180.getRecordSeparator(), out.toString());
    }

    @Test
    public void testPrintRecordQuotes() throws Exception {
        StringWriter out = new StringWriter();
        CSVFormat.RFC4180.printRecord(out, "a,b");
        assertEquals("\"a,b\"" + CSVFormat.RFC4180.getRecordSeparator(), out.toString());
    }

    @Test
    public void testPrintRecordWithEscaping() throws Exception {
        CSVFormat fmt = CSVFormat.RFC4180.withQuote(null).withEscape('\\');
        StringWriter out = new StringWriter();
        fmt.printRecord(out, "a,b");
        assertEquals("a\\,b" + fmt.getRecordSeparator(), out.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        CSVFormat a = CSVFormat.DEFAULT;
        CSVFormat b = CSVFormat.DEFAULT;

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals(null));
        assertFalse(a.equals(""));
        assertFalse(a.equals(a.withDelimiter(';')));
    }

    @Test
    public void testValueOfKnown() {
        assertNotNull(CSVFormat.valueOf("DEFAULT"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfUnknown() {
        CSVFormat.valueOf("NO_SUCH_FORMAT");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatRejectsLineBreakDelimiter() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelimiterCannotBeQuote() {
        CSVFormat.DEFAULT.withDelimiter('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteCannotBeLineBreak() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeCannotBeLineBreak() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCommentMarkerCannotBeLineBreak() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuoteModeNoneRequiresEscape() {
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE);
    }

    @Test
    public void testQuoteModeNoneWithEscapeAllowed() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    @Test(expected = IOException.class)
    public void testPrintRecordPropagatesIOException() throws Exception {
        CSVFormat.RFC4180.printRecord(new ThrowingAppendable(), "boom");
    }

    private static class ThrowingAppendable implements Appendable {
        @Override
        public Appendable append(CharSequence csq) throws IOException {
            throw new IOException("boom");
        }

        @Override
        public Appendable append(CharSequence csq, int start, int end) throws IOException {
            throw new IOException("boom");
        }

        @Override
        public Appendable append(char c) throws IOException {
            throw new IOException("boom");
        }
    }
}