package org.apache.commons.csv;

import static org.junit.Assert.*;
import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void testDefault() {
        assertNotNull(CSVFormat.DEFAULT);
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
        assertNull(CSVFormat.DEFAULT.getCommentMarker());
        assertNull(CSVFormat.DEFAULT.getEscapeCharacter());
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertNull(CSVFormat.DEFAULT.getNullString());
        assertNull(CSVFormat.DEFAULT.getHeader());
        assertNull(CSVFormat.DEFAULT.getHeaderComments());
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());
        assertFalse(CSVFormat.DEFAULT.getIgnoreHeaderCase());
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat fmt = CSVFormat.DEFAULT.withDelimiter(';');
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertEquals(';', fmt.getDelimiter());
    }

    @Test
    public void testWithQuote() {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuote('\'');
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertEquals(Character.valueOf('\''), fmt.getQuoteCharacter());
    }

    @Test
    public void testWithEscape() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\');
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertEquals(Character.valueOf('\\'), fmt.getEscapeCharacter());
    }

    @Test
    public void testWithCommentMarker() {
        CSVFormat fmt = CSVFormat.DEFAULT.withCommentMarker('#');
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertEquals(Character.valueOf('#'), fmt.getCommentMarker());
    }

    @Test
    public void testWithHeader() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertArrayEquals(new String[]{"a", "b", "c"}, fmt.getHeader());
    }

    @Test
    public void testWithNullString() {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("N/A");
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertEquals("N/A", fmt.getNullString());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertFalse(fmt.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertTrue(fmt.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat fmt = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertTrue(fmt.getSkipHeaderRecord());
    }

    @Test
    public void testWithAllowMissingColumnNames() {
        CSVFormat fmt = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertTrue(fmt.getAllowMissingColumnNames());
    }

    @Test
    public void testWithIgnoreHeaderCase() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertTrue(fmt.getIgnoreHeaderCase());
    }

    @Test
    public void testWithQuoteMode() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertNotNull(fmt);
        assertEquals(QuoteMode.NONE, fmt.getQuoteMode());
    }

    @Test
    public void testWithRecordSeparator() {
        CSVFormat fmt = CSVFormat.DEFAULT.withRecordSeparator("\n");
        assertNotSame(CSVFormat.DEFAULT, fmt);
        assertEquals("\n", fmt.getRecordSeparator());
    }

    @Test
    public void testEquals() {
        assertTrue(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.equals(null));
        assertFalse(CSVFormat.DEFAULT.equals("string"));
        assertFalse(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT.withDelimiter(';')));
        assertFalse(CSVFormat.DEFAULT.equals(CSVFormat.DEFAULT.withQuote('\'')));
        CSVFormat h1 = CSVFormat.DEFAULT.withHeader("a");
        CSVFormat h2 = CSVFormat.DEFAULT.withHeader("b");
        assertFalse(h1.equals(h2));
    }

    @Test
    public void testHashCode() {
        assertEquals(CSVFormat.DEFAULT.hashCode(), CSVFormat.DEFAULT.hashCode());
        assertFalse(CSVFormat.DEFAULT.hashCode() == CSVFormat.DEFAULT.withDelimiter(';').hashCode());
    }

    @Test
    public void testFormat() {
        String result = CSVFormat.DEFAULT.format("hello");
        assertEquals("hello", result);
    }

    @Test
    public void testToString() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("QuoteChar=<\" >") || str.contains("QuoteChar=<\">"));
        assertFalse(str.contains("Escape=<"));
        assertFalse(str.contains("CommentStart=<"));
        assertFalse(str.contains("NullString=<"));
        assertTrue(str.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testIsMethods() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
        CSVFormat withEscape = CSVFormat.DEFAULT.withEscape('\\');
        assertTrue(withEscape.isEscapeCharacterSet());
        CSVFormat withComment = CSVFormat.DEFAULT.withCommentMarker('#');
        assertTrue(withComment.isCommentMarkerSet());
        CSVFormat withNull = CSVFormat.DEFAULT.withNullString("NULL");
        assertTrue(withNull.isNullStringSet());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_DelimiterLineBreak() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_QuoteEqualsDelimiter() {
        CSVFormat.DEFAULT.withQuote(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_EscapeEqualsDelimiter() {
        CSVFormat.DEFAULT.withEscape(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_CommentEqualsDelimiter() {
        CSVFormat.DEFAULT.withCommentMarker(',');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_QuoteEqualsComment() {
        CSVFormat.DEFAULT.withQuote('!').withCommentMarker('!');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_EscapeEqualsComment() {
        CSVFormat.DEFAULT.withEscape('!').withCommentMarker('!');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_QuoteModeNoneNoEscape() {
        CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidate_DuplicateHeader() {
        CSVFormat.DEFAULT.withHeader("a", "a");
    }

    @Test
    public void testNewFormat() {
        CSVFormat fmt = CSVFormat.newFormat(';');
        assertEquals(';', fmt.getDelimiter());
        assertNull(fmt.getQuoteCharacter());
        assertNull(fmt.getEscapeCharacter());
        assertNull(fmt.getCommentMarker());
        assertNull(fmt.getRecordSeparator());
        assertFalse(fmt.getIgnoreEmptyLines());
        assertFalse(fmt.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testValueOf() {
        assertSame(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertSame(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
        assertSame(CSVFormat.RFC4180, CSVFormat.valueOf("RFC4180"));
        assertSame(CSVFormat.TDF, CSVFormat.valueOf("TDF"));
        assertSame(CSVFormat.MYSQL, CSVFormat.valueOf("MySQL"));
    }

    @Test
    public void testHeaderComments() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("comment1", "comment2");
        assertArrayEquals(new String[]{"comment1", "comment2"}, fmt.getHeaderComments());
    }

    @Test
    public void testPredefinedConstants() {
        assertNotNull(CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertNotNull(CSVFormat.Predefined.Excel.getFormat());
        assertNotNull(CSVFormat.Predefined.MySQL.getFormat());
        assertNotNull(CSVFormat.Predefined.RFC4180.getFormat());
        assertNotNull(CSVFormat.Predefined.TDF.getFormat());
    }

    @Test
    public void testWithHeaderClones() {
        String[] original = {"a", "b"};
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(original);
        original[0] = "changed";
        assertArrayEquals(new String[]{"a", "b"}, fmt.getHeader());
    }

    @Test
    public void testWithHeaderCommentsClones() {
        Object[] original = {"x", "y"};
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments(original);
        original[0] = "changed";
        assertArrayEquals(new String[]{"x", "y"}, fmt.getHeaderComments());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreak() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreak() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreak() {
        CSVFormat.DEFAULT.withCommentMarker('\n');
    }

    @Test
    public void testGetHeaderReturnsClone() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", "b");
        String[] h = fmt.getHeader();
        h[0] = "changed";
        assertArrayEquals(new String[]{"a", "b"}, fmt.getHeader());
    }

    @Test
    public void testGetHeaderCommentsReturnsClone() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("a", "b");
        String[] h = fmt.getHeaderComments();
        h[0] = "changed";
        assertArrayEquals(new String[]{"a", "b"}, fmt.getHeaderComments());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDuplicateHeaderWithThree() {
        CSVFormat.DEFAULT.withHeader("x", "y", "x");
    }
}