package org.apache.commons.csv;

import static org.junit.Assert.*;
import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void testDefaultFormat() {
        assertNotNull(CSVFormat.DEFAULT);
        assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        assertTrue(CSVFormat.DEFAULT.isQuoting());
        assertEquals(Character.valueOf('"'), CSVFormat.DEFAULT.getQuoteChar());
        assertFalse(CSVFormat.DEFAULT.isCommentingEnabled());
        assertFalse(CSVFormat.DEFAULT.isEscaping());
        assertFalse(CSVFormat.DEFAULT.isNullHandling());
        assertTrue(CSVFormat.DEFAULT.getIgnoreEmptyLines());
        assertFalse(CSVFormat.DEFAULT.getIgnoreSurroundingSpaces());
        assertEquals("\r\n", CSVFormat.DEFAULT.getRecordSeparator());
    }

    @Test
    public void testRfc4180Format() {
        assertNotNull(CSVFormat.RFC4180);
        assertEquals(',', CSVFormat.RFC4180.getDelimiter());
        assertFalse(CSVFormat.RFC4180.getIgnoreEmptyLines());
    }

    @Test
    public void testExcelFormat() {
        assertNotNull(CSVFormat.EXCEL);
        assertEquals(',', CSVFormat.EXCEL.getDelimiter());
        assertFalse(CSVFormat.EXCEL.getIgnoreEmptyLines());
    }

    @Test
    public void testTdfFormat() {
        assertNotNull(CSVFormat.TDF);
        assertEquals('\t', CSVFormat.TDF.getDelimiter());
        assertTrue(CSVFormat.TDF.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testMysqlFormat() {
        assertNotNull(CSVFormat.MYSQL);
        assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        assertEquals(Character.valueOf('\\'), CSVFormat.MYSQL.getEscape());
        assertFalse(CSVFormat.MYSQL.getIgnoreEmptyLines());
        assertNull(CSVFormat.MYSQL.getQuoteChar());
        assertEquals("\n", CSVFormat.MYSQL.getRecordSeparator());
    }

    // Constructor and withDelimiter line break rejection
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDelimiterLineBreak() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreak() {
        CSVFormat.DEFAULT.withDelimiter('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteCharLineBreak() {
        CSVFormat.DEFAULT.withQuoteChar('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreak() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStartLineBreak() {
        CSVFormat.DEFAULT.withCommentStart('\r');
    }

    // newFormat
    @Test
    public void testNewFormat() {
        CSVFormat format = CSVFormat.newFormat(';');
        assertEquals(';', format.getDelimiter());
        assertNull(format.getQuoteChar());
        assertNull(format.getQuotePolicy());
        assertFalse(format.isQuoting());
    }

    // Getters and with methods for valid input
    @Test
    public void testWithDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
        assertEquals(';', format.getDelimiter());
    }

    @Test
    public void testWithQuoteChar() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('\'');
        assertEquals(Character.valueOf('\''), format.getQuoteChar());
    }

    @Test
    public void testWithEscape() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        assertEquals(Character.valueOf('\\'), format.getEscape());
    }

    @Test
    public void testWithCommentStart() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart('#');
        assertEquals(Character.valueOf('#'), format.getCommentStart());
    }

    @Test
    public void testWithIgnoreEmptyLines() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);
        assertFalse(format.getIgnoreEmptyLines());
    }

    @Test
    public void testWithIgnoreSurroundingSpaces() {
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);
        assertTrue(format.getIgnoreSurroundingSpaces());
    }

    @Test
    public void testWithNullString() {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        assertEquals("NULL", format.getNullString());
        assertTrue(format.isNullHandling());
    }

    @Test
    public void testWithSkipHeaderRecord() {
        CSVFormat format = CSVFormat.DEFAULT.withSkipHeaderRecord(true);
        assertTrue(format.getSkipHeaderRecord());
    }

    @Test
    public void testWithRecordSeparator() {
        CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
        assertEquals("\n", format.getRecordSeparator());
    }

    @Test
    public void testWithQuotePolicy() {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE);
        assertEquals(Quote.NONE, format.getQuotePolicy());
    }

    @Test
    public void testIsQuoting() {
        assertTrue(CSVFormat.DEFAULT.isQuoting());
        assertFalse(CSVFormat.DEFAULT.withQuoteChar(null).isQuoting());
    }

    @Test
    public void testIsEscaping() {
        assertFalse(CSVFormat.DEFAULT.isEscaping());
        assertTrue(CSVFormat.DEFAULT.withEscape('\\').isEscaping());
    }

    @Test
    public void testIsCommentingEnabled() {
        assertFalse(CSVFormat.DEFAULT.isCommentingEnabled());
        assertTrue(CSVFormat.DEFAULT.withCommentStart('#').isCommentingEnabled());
    }

    @Test
    public void testIsNullHandling() {
        assertFalse(CSVFormat.DEFAULT.isNullHandling());
        assertTrue(CSVFormat.DEFAULT.withNullString("N/A").isNullHandling());
    }

    // Header tests
    @Test
    public void testWithHeader() {
        String[] header = {"a", "b", "c"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader(header);
        assertArrayEquals(header, format.getHeader());
        // Ensure it's a clone
        header[0] = "changed";
        assertNotEquals("changed", format.getHeader()[0]);
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateDuplicateHeader() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "b", "a");
        format.validate();
    }

    @Test
    public void testValidateNoDuplicateHeader() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "b", "c");
        format.validate(); // should not throw
    }

    // Validate exception conditions
    @Test(expected = IllegalStateException.class)
    public void testValidateQuoteCharEqualsDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withDelimiter('"');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateEscapeEqualsDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape(',').withDelimiter(',');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateCommentStartEqualsDelimiter() {
        CSVFormat format = CSVFormat.DEFAULT.withCommentStart(',');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateQuoteCharEqualsCommentStart() {
        CSVFormat format = CSVFormat.DEFAULT.withQuoteChar('#').withCommentStart('#');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateEscapeEqualsCommentStart() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('#').withCommentStart('#');
        format.validate();
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateNoEscapeAndNoneQuote() {
        CSVFormat format = CSVFormat.DEFAULT.withQuotePolicy(Quote.NONE).withEscape(null);
        format.validate();
    }

    // Equals tests
    @Test
    public void testEqualsSameRef() {
        CSVFormat format = CSVFormat.DEFAULT;
        assertEquals(format, format);
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
    public void testEqualsDifferentDelimiter() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(';');
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testEqualsDifferentQuoteChar() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withQuoteChar('\'');
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testEqualsSameConfig() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(',').withQuoteChar('"');
        assertTrue(format1.equals(format2));
    }

    @Test
    public void testEqualsDifferentQuotePolicy() {
        CSVFormat format1 = CSVFormat.DEFAULT.withQuotePolicy(Quote.MINIMAL);
        CSVFormat format2 = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        assertFalse(format1.equals(format2));
    }

    @Test
    public void testHashCodeSameConfig() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(',').withQuoteChar('"');
        assertEquals(format1.hashCode(), format2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT.withDelimiter(';');
        assertNotEquals(format1.hashCode(), format2.hashCode());
    }

    // format test (basic)
    @Test
    public void testFormat() {
        CSVFormat format = CSVFormat.DEFAULT;
        String result = format.format("hello");
        // default format: quotes if needed? "hello" without spaces
        assertEquals("hello", result);
    }

    @Test
    public void testFormatWithComma() {
        CSVFormat format = CSVFormat.DEFAULT;
        String result = format.format("a,b");
        // value contains delimiter, should be quoted
        assertEquals("\"a,b\"", result);
    }

    // toString test
    @Test
    public void testToString() {
        String str = CSVFormat.DEFAULT.toString();
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("QuoteChar=<\">"));
        assertTrue(str.contains("RecordSeparator=<\r\n>"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SkipHeaderRecord:false"));
    }

    @Test
    public void testToStringWithEscaping() {
        CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
        String str = format.toString();
        assertTrue(str.contains("Escape=<\\>"));
    }
}