package org.apache.commons.csv;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CSVFormatTest {

    private CSVFormat format;

    @Before
    public void setUp() {
        format = CSVFormat.DEFAULT;
    }

    @Test
    public void testDefaultFormat() {
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('"'), format.getQuoteCharacter());
        assertNull(format.getCommentMarker());
        assertNull(format.getEscapeCharacter());
        assertEquals("\r\n", format.getRecordSeparator());
        assertTrue(format.getIgnoreEmptyLines());
        assertFalse(format.getAllowMissingColumnNames());
        assertFalse(format.getIgnoreHeaderCase());
        assertFalse(format.getIgnoreSurroundingSpaces());
        assertFalse(format.getSkipHeaderRecord());
        assertFalse(format.getTrailingDelimiter());
        assertFalse(format.getTrim());
    }

    @Test
    public void testWithDelimiter() {
        CSVFormat newFormat = format.withDelimiter('|');
        assertEquals('|', newFormat.getDelimiter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreakCR() {
        format.withDelimiter('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreakLF() {
        format.withDelimiter('\n');
    }

    @Test
    public void testWithQuoteCharacter() {
        CSVFormat newFormat = format.withQuote('\'');
        assertEquals(Character.valueOf('\''), newFormat.getQuoteCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharacterLineBreak() {
        format.withQuote('\n');
    }

    @Test
    public void testWithNullQuote() {
        CSVFormat newFormat = format.withQuote(null);
        assertNull(newFormat.getQuoteCharacter());
    }

    @Test
    public void testWithEscape() {
        CSVFormat newFormat = format.withEscape('\\');
        assertEquals(Character.valueOf('\\'), newFormat.getEscapeCharacter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreak() {
        format.withEscape('\r');
    }

    @Test
    public void testWithCommentMarker() {
        CSVFormat newFormat = format.withCommentMarker('#');
        assertEquals(Character.valueOf('#'), newFormat.getCommentMarker());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreak() {
        format.withCommentMarker('\n');
    }

    @Test
    public void testWithRecordSeparatorString() {
        CSVFormat newFormat = format.withRecordSeparator("sep");
        assertEquals("sep", newFormat.getRecordSeparator());
    }

    @Test
    public void testWithRecordSeparatorChar() {
        CSVFormat newFormat = format.withRecordSeparator('\t');
        assertEquals("\t", newFormat.getRecordSeparator());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat newFormat = format.withIgnoreSurroundingSpaces();
        assertTrue(newFormat.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat newFormat = format.withIgnoreEmptyLines(false);
        assertFalse(newFormat.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreHeaderCase() {
        CSVFormat newFormat = format.withIgnoreHeaderCase();
        assertTrue(newFormat.getIgnoreHeaderCase());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat newFormat = format.withSkipHeaderRecord();
        assertTrue(newFormat.getSkipHeaderRecord());
    }

    @Test
    public void testWithTrailingDelimiter() {
        CSVFormat newFormat = format.withTrailingDelimiter();
        assertTrue(newFormat.getTrailingDelimiter());
    }

    @Test
    public void testWithTrim() {
        CSVFormat newFormat = format.withTrim();
        assertTrue(newFormat.getTrim());
    }

    @Test
    public void testWithAllowMissingColumnNames() {
        CSVFormat newFormat = format.withAllowMissingColumnNames();
        assertTrue(newFormat.getAllowMissingColumnNames());
    }

    @Test
    public void testWithNullString() {
        CSVFormat newFormat = format.withNullString("NULL");
        assertEquals("NULL", newFormat.getNullString());
    }

    @Test
    public void testWithHeader() {
        CSVFormat newFormat = format.withHeader("a", "b");
        assertArrayEquals(new String[]{"a", "b"}, newFormat.getHeader());
    }

    @Test
    public void testWithHeaderNull() {
        CSVFormat newFormat = format.withHeader((String[]) null);
        assertNull(newFormat.getHeader());
    }

    @Test
    public void testWithHeaderComments() {
        CSVFormat newFormat = format.withHeaderComments("comment1", "comment2");
        assertArrayEquals(new String[]{"comment1", "comment2"}, newFormat.getHeaderComments());
    }

    @Test
    public void testWithFirstRecordAsHeader() {
        CSVFormat newFormat = format.withFirstRecordAsHeader();
        assertTrue(newFormat.getSkipHeaderRecord());
        assertNotNull(newFormat.getHeader());
        assertEquals(0, newFormat.getHeader().length);
    }

    @Test
    public void testWithQuoteMode() {
        CSVFormat newFormat = format.withQuoteMode(QuoteMode.ALL);
        assertEquals(QuoteMode.ALL, newFormat.getQuoteMode());
    }

    @Test
    public void testValidateDelimiterLineBreak() {
        try {
            CSVFormat.newFormat('\n');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The delimiter cannot be a line break", e.getMessage());
        }
    }

    @Test
    public void testValidateQuoteSameAsDelimiter() {
        try {
            CSVFormat.DEFAULT.withDelimiter('"');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("quoteChar character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testValidateEscapeSameAsDelimiter() {
        try {
            CSVFormat.DEFAULT.withEscape(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("escape character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testValidateCommentSameAsDelimiter() {
        try {
            CSVFormat.DEFAULT.withCommentMarker(',');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("comment start character and the delimiter cannot be the same"));
        }
    }

    @Test
    public void testValidateQuoteEqualsComment() {
        try {
            CSVFormat.DEFAULT.withCommentMarker('"');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("comment start character and the quoteChar cannot be the same"));
        }
    }

    @Test
    public void testValidateEscapeEqualsComment() {
        try {
            CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("comment start and the escape character cannot be the same"));
        }
    }

    @Test
    public void testValidateNoEscapeWithQuoteModeNone() {
        try {
            CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("No quotes mode set but no escape character is set", e.getMessage());
        }
    }

    @Test
    public void testValidateDuplicateHeader() {
        try {
            CSVFormat.DEFAULT.withHeader("a", "b", "a");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("duplicate entry"));
        }
    }

    @Test
    public void testEqualsSame() {
        CSVFormat f = CSVFormat.DEFAULT;
        assertEquals(f, f);
    }

    @Test
    public void testEqualsNull() {
        assertFalse(CSVFormat.DEFAULT.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(CSVFormat.DEFAULT.equals("string"));
    }

    @Test
    public void testEqualsDifferent() {
        CSVFormat f1 = CSVFormat.DEFAULT;
        CSVFormat f2 = CSVFormat.DEFAULT.withDelimiter('|');
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsSameConfig() {
        CSVFormat f1 = CSVFormat.DEFAULT.withHeader("a");
        CSVFormat f2 = CSVFormat.DEFAULT.withHeader("a");
        assertEquals(f1, f2);
    }

    @Test
    public void testHashCodeSame() {
        CSVFormat f1 = CSVFormat.DEFAULT;
        CSVFormat f2 = CSVFormat.DEFAULT;
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() {
        CSVFormat f1 = CSVFormat.DEFAULT;
        CSVFormat f2 = CSVFormat.DEFAULT.withDelimiter('|');
        assertNotEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testToString() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("QuoteChar=<\" >"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testToStringWithAllOptions() {
        CSVFormat fmt = CSVFormat.DEFAULT.withEscape('\\').withCommentMarker('#').withNullString("N/A")
                .withRecordSeparator(";").withIgnoreSurroundingSpaces().withIgnoreHeaderCase()
                .withHeaderComments("h1").withHeader("a", "b");
        String str = fmt.toString();
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<N/A>"));
        assertTrue(str.contains("RecordSeparator=<;>"));
        assertTrue(str.contains("SurroundingSpaces:ignored"));
        assertTrue(str.contains("IgnoreHeaderCase:ignored"));
        assertTrue(str.contains("HeaderComments:[h1]"));
        assertTrue(str.contains("Header:[a, b]"));
    }

    @Test
    public void testPredefinedFormats() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.Predefined.Default.getFormat());
        assertEquals(CSVFormat.EXCEL, CSVFormat.Predefined.Excel.getFormat());
        assertEquals(CSVFormat.TDF, CSVFormat.Predefined.TDF.getFormat());
    }

    @Test
    public void testValueOf() {
        assertEquals(CSVFormat.DEFAULT, CSVFormat.valueOf("Default"));
        assertEquals(CSVFormat.EXCEL, CSVFormat.valueOf("Excel"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOfInvalid() {
        CSVFormat.valueOf("Invalid");
    }

    @Test
    public void testNewFormat() {
        CSVFormat fmt = CSVFormat.newFormat(';');
        assertEquals(';', fmt.getDelimiter());
        assertNull(fmt.getQuoteCharacter());
        assertFalse(fmt.getIgnoreEmptyLines());
        assertNull(fmt.getRecordSeparator());
    }

    @Test
    public void testIsCommentMarkerSet() {
        assertFalse(CSVFormat.DEFAULT.isCommentMarkerSet());
        assertTrue(CSVFormat.DEFAULT.withCommentMarker('#').isCommentMarkerSet());
    }

    @Test
    public void testIsEscapeCharacterSet() {
        assertFalse(CSVFormat.DEFAULT.isEscapeCharacterSet());
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscapeCharacterSet());
    }

    @Test
    public void testIsNullStringSet() {
        assertFalse(CSVFormat.DEFAULT.isNullStringSet());
        assertTrue(CSVFormat.DEFAULT.withNullString("NULL").isNullStringSet());
    }

    @Test
    public void testIsQuoteCharacterSet() {
        assertTrue(CSVFormat.DEFAULT.isQuoteCharacterSet());
        assertFalse(CSVFormat.DEFAULT.withQuote(null).isQuoteCharacterSet());
    }

    @Test
    public void testGetAllowMissingColumnNames() {
        assertFalse(CSVFormat.DEFAULT.getAllowMissingColumnNames());
        assertTrue(CSVFormat.DEFAULT.withAllowMissingColumnNames().getAllowMissingColumnNames());
    }

    @Test
    public void testGetCommentMarker() {
        assertNull(CSVFormat.DEFAULT.getCommentMarker());
        assertEquals(Character.valueOf('#'), CSVFormat.DEFAULT.withCommentMarker('#').getCommentMarker());
    }

    @Test
    public void testGetDelimiter() {
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertEquals('|', CSVFormat.DEFAULT.withDelimiter('|').getDelimiter());
    }

    @Test
    public void testGetEscapeCharacter() {
        assertNull(CSVFormat.DEFAULT.getEscapeCharacter());
        assertEquals(Character.valueOf('\\'), CSVFormat.DEFAULT.withEscape('\\').getEscapeCharacter());
    }

    @Test
    public void testGetHeader() {
        assertNull(CSVFormat.DEFAULT.getHeader());
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a", "b");
        assertArrayEquals(new String[]{"a", "b"}, fmt.getHeader());
    }

    @Test
    public void testGetHeaderReturnsCopy() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader("a");
        String[] hdr = fmt.getHeader();
        hdr[0] = "x";
        assertArrayEquals(new String[]{"a"}, fmt.getHeader());
    }

    @Test
    public void testGetHeaderComments() {
        assertNull(CSVFormat.DEFAULT.getHeaderComments());
        CSVFormat fmt = CSVFormat.DEFAULT.withHeaderComments("c1");
        assertArrayEquals(new String[]{"c1"}, fmt.getHeaderComments());
    }

    @Test
    public void testGetIgnoreEmptyLines() {
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines(false).getIgnoreEmptyLines());
    }

    @Test
    public void testGetIgnoreHeaderCase() {
        assertFalse(CSVFormat.DEFAULT.getIgnoreHeaderCase());
        assertTrue(CSVFormat.DEFAULT.withIgnoreHeaderCase().getIgnoreHeaderCase());
    }

    @Test
    public void testGetIgnoreSurroundingSpaces() {
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertTrue(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().getIgnoreSurroundingSpaces());
    }

    @Test
    public void testGetNullString() {
        assertNull(CSVFormat.DEFAULT.getNullString());
        assertEquals("NULL", CSVFormat.DEFAULT.withNullString("NULL").getNullString());
    }

    @Test
    public void testGetQuoteCharacter() {
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteCharacter());
        assertNull(CSVFormat.DEFAULT.withQuote(null).getQuoteCharacter());
    }

    @Test
    public void testGetQuoteMode() {
        assertNull(CSVFormat.DEFAULT.getQuoteMode());
        assertEquals(QuoteMode.ALL, CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).getQuoteMode());
    }

    @Test
    public void testGetRecordSeparator() {
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
        assertEquals("|", CSVFormat.DEFAULT.withRecordSeparator("|").getRecordSeparator());
    }

    @Test
    public void testGetSkipHeaderRecord() {
        assertFalse(CSVFormat.DEFAULT.getSkipHeaderRecord());
        assertTrue(CSVFormat.DEFAULT.withSkipHeaderRecord().getSkipHeaderRecord());
    }

    @Test
    public void testGetTrailingDelimiter() {
        assertFalse(CSVFormat.DEFAULT.getTrailingDelimiter());
        assertTrue(CSVFormat.DEFAULT.withTrailingDelimiter().getTrailingDelimiter());
    }

    @Test
    public void testGetTrim() {
        assertFalse(CSVFormat.DEFAULT.getTrim());
        assertTrue(CSVFormat.DEFAULT.withTrim().getTrim());
    }

    @Test
    public void testPrintlnWithTrailingDelimiter() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat fmt = CSVFormat.DEFAULT.withTrailingDelimiter().withRecordSeparator("\n");
        fmt.println(sb);
        assertEquals(",\n", sb.toString());
    }

    @Test
    public void testPrintlnWithoutTrailingDelimiter() throws IOException {
        StringBuilder sb = new StringBuilder();
        CSVFormat.DEFAULT.println(sb);
        assertEquals("\r\n", sb.toString());
    }

    @Test
    public void testFormat() {
        String result = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", result);
    }

    @Test
    public void testFormatWithQuotes() {
        String result = CSVFormat.DEFAULT.format("a,b", "c");
        assertEquals("\"a,b\",c", result);
    }

    @Test
    public void testFormatWithNull() {
        String result = CSVFormat.DEFAULT.withNullString("N/A").format("a", null, "b");
        assertEquals("a,N/A,b", result);
    }

    @Test
    public void testWithHeaderFromEnum() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader(CSVFormat.Predefined.class);
        assertNotNull(fmt.getHeader());
        assertTrue(fmt.getHeader().length > 0);
        assertEquals("Default", fmt.getHeader()[0]);
    }

    @Test
    public void testWithHeaderFromNullEnum() {
        CSVFormat fmt = CSVFormat.DEFAULT.withHeader((Class<? extends Enum<?>>) null);
        assertNotNull(fmt.getHeader());
        assertEquals(0, fmt.getHeader().length);
    }

    @Test
    public void testValidateNoQuoteAndEscape() {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\').withQuoteMode(QuoteMode.NONE);
        assertNotNull(fmt);
    }

    @Test
    public void testWithIgnoreEmptyLinesTrue() {
        CSVFormat fmt = CSVFormat.DEFAULT.withIgnoreEmptyLines(false).withIgnoreEmptyLines(true);
        assertTrue(fmt.getIgnoreEmptyLines());
    }
}