package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class StringEscapeUtilsTest {

    @Test
    public void testEscapeJavaNull() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJavaEmpty() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJavaNormal() {
        assertEquals("hello", StringEscapeUtils.escapeJava("hello"));
    }

    @Test
    public void testEscapeJavaSpecialChars() {
        assertEquals("tab\\ttab", StringEscapeUtils.escapeJava("tab\ttab"));
        assertEquals("new\\nline", StringEscapeUtils.escapeJava("new\nline"));
        assertEquals("back\\\\slash", StringEscapeUtils.escapeJava("back\\slash"));
        assertEquals("single\\'quote", StringEscapeUtils.escapeJavaScript("single'quote"));
        assertEquals("double\\\"quote", StringEscapeUtils.escapeJava("double\"quote"));
        assertEquals("slash\\/slash", StringEscapeUtils.escapeJava("slash/slash"));
    }

    @Test
    public void testEscapeJavaUnicode() {
        assertEquals("\\u00A9", StringEscapeUtils.escapeJava("\u00A9"));
        assertEquals("\\u0100", StringEscapeUtils.escapeJava("\u0100"));
        assertEquals("\\uABCD", StringEscapeUtils.escapeJava("\uABCD"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaWriterNull() throws IOException {
        StringEscapeUtils.escapeJava(null, "test");
    }

    @Test
    public void testEscapeJavaWriterNullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testEscapeJavaWriter() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, "test\"quote");
        assertEquals("test\\\"quote", sw.toString());
    }

    @Test
    public void testUnescapeJavaNull() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJavaEmpty() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJavaNormal() {
        assertEquals("hello", StringEscapeUtils.unescapeJava("hello"));
    }

    @Test
    public void testUnescapeJavaEscapedChars() {
        assertEquals("tab\ttab", StringEscapeUtils.unescapeJava("tab\\ttab"));
        assertEquals("new\nline", StringEscapeUtils.unescapeJava("new\\nline"));
        assertEquals("back\\slash", StringEscapeUtils.unescapeJava("back\\\\slash"));
        assertEquals("single'quote", StringEscapeUtils.unescapeJava("single\\'quote"));
        assertEquals("double\"quote", StringEscapeUtils.unescapeJava("double\\\"quote"));
    }

    @Test
    public void testUnescapeJavaUnicode() {
        assertEquals("\u00A9", StringEscapeUtils.unescapeJava("\\u00A9"));
        assertEquals("\u0100", StringEscapeUtils.unescapeJava("\\u0100"));
        assertEquals("\uABCD", StringEscapeUtils.unescapeJava("\\uABCD"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaWriterNull() throws IOException {
        StringEscapeUtils.unescapeJava(null, "test");
    }

    @Test
    public void testUnescapeJavaWriterNullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testUnescapeJavaWriter() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, "test\\\"quote");
        assertEquals("test\"quote", sw.toString());
    }

    @Test
    public void testUnescapeJavaTrailingSlash() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, "test\\");
        assertEquals("test\\", sw.toString());
    }

    @Test
    public void testEscapeHtmlNull() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtmlEmpty() {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtmlWriterNull() throws IOException {
        StringEscapeUtils.escapeHtml(null, "test");
    }

    @Test
    public void testEscapeHtmlWriterNullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testUnescapeHtmlNull() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtmlEmpty() {
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtmlWriterNull() throws IOException {
        StringEscapeUtils.unescapeHtml(null, "test");
    }

    @Test
    public void testUnescapeHtmlWriterNullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeHtml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testEscapeXmlNull() {
        assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void testEscapeXmlEmpty() {
        assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXmlWriterNull() throws IOException {
        StringEscapeUtils.escapeXml(null, "test");
    }

    @Test
    public void testEscapeXmlWriterNullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testUnescapeXmlNull() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void testUnescapeXmlEmpty() {
        assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXmlWriterNull() throws IOException {
        StringEscapeUtils.unescapeXml(null, "test");
    }

    @Test
    public void testUnescapeXmlWriterNullString() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeXml(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testEscapeSqlNull() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSqlEmpty() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSqlWithQuote() {
        assertEquals("''", StringEscapeUtils.escapeSql("'"));
        assertEquals("test''value", StringEscapeUtils.escapeSql("test'value"));
    }

    @Test
    public void testEscapeSqlNoQuote() {
        assertEquals("test", StringEscapeUtils.escapeSql("test"));
    }

    @Test
    public void testEscapeCsvNull() {
        assertNull(StringEscapeUtils.escapeCsv(null));
    }

    @Test
    public void testEscapeCsvNoSpecialChars() {
        assertEquals("simple", StringEscapeUtils.escapeCsv("simple"));
    }

    @Test
    public void testEscapeCsvWithQuote() {
        assertEquals("\"\"\"hello\"\"\"", StringEscapeUtils.escapeCsv("\"hello\""));
    }

    @Test
    public void testEscapeCsvWithDelimiter() {
        assertEquals("\"a,b\"", StringEscapeUtils.escapeCsv("a,b"));
    }

    @Test
    public void testUnescapeCsvNull() {
        assertNull(StringEscapeUtils.unescapeCsv(null));
    }

    @Test
    public void testUnescapeCsvShort() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "a");
        assertEquals("a", sw.toString());
    }

    @Test
    public void testUnescapeCsvNoQuotes() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "hello");
        assertEquals("hello", sw.toString());
    }

    @Test
    public void testUnescapeCsvQuoted() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "\"hello\"");
        assertEquals("hello", sw.toString());
    }

    @Test
    public void testUnescapeCsvEmbeddedQuote() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "\"\"\"hello\"\"\"");
        assertEquals("\"hello\"", sw.toString());
    }

    @Test
    public void testUnescapeCsvEmbeddedDelimiter() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeCsv(sw, "\"a,b\"");
        assertEquals("a,b", sw.toString());
    }

    @Test
    public void testConstructor() {
        StringEscapeUtils utils = new StringEscapeUtils();
        assertNotNull(utils);
    }
}