package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class StringEscapeUtilsTest {

    // ---------- escapeJava ----------

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
        // tab, newline, backslash, double quote, single quote (not escaped in Java)
        String input = "\t\n\\\"'";
        String expected = "\\t\\n\\\\\\\"'";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJavaControlChars() {
        // control chars: \b, \f, \r, and other <32
        String input = "\b\f\r\u0007";
        String expected = "\\b\\f\\r\\u0007";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJavaHighUnicode() {
        // chars > 0xfff, > 0xff, > 0x7f
        String input = "\u1234\u00A0\u0080";
        String expected = "\\u1234\\u00A0\\u0080";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJavaWriterNull() throws IOException {
        try {
            StringEscapeUtils.escapeJava((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEscapeJavaWriterNullInput() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testEscapeJavaWriterNormal() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeJava(sw, "a\nb");
        assertEquals("a\\nb", sw.toString());
    }

    // ---------- escapeJavaScript ----------

    @Test
    public void testEscapeJavaScriptNull() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScriptEmpty() {
        assertEquals("", StringEscapeUtils.escapeJavaScript(""));
    }

    @Test
    public void testEscapeJavaScriptSingleQuoteEscaped() {
        // single quotes should be escaped
        String input = "'";
        String expected = "\\'";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }

    @Test
    public void testEscapeJavaScriptDoubleQuoteUnchanged() {
        // double quotes still escaped
        String input = "\"";
        String expected = "\\\"";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }

    // ---------- unescapeJava ----------

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
    public void testUnescapeJavaEscapeSequences() {
        String input = "\\t\\n\\r\\f\\b\\\\\\\"\\'";
        String expected = "\t\n\r\f\b\\\"'";
        assertEquals(expected, StringEscapeUtils.unescapeJava(input));
    }

    @Test
    public void testUnescapeJavaUnicode() {
        String input = "\\u0048\\u0065\\u006C\\u006C\\u006F";
        String expected = "Hello";
        assertEquals(expected, StringEscapeUtils.unescapeJava(input));
    }

    @Test
    public void testUnescapeJavaTrailingSlash() {
        // input ends with backslash, should output backslash
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\"));
    }

    @Test
    public void testUnescapeJavaInvalidUnicode() {
        // unicode with invalid hex should throw NestableRuntimeException
        try {
            StringEscapeUtils.unescapeJava("\\u00XX");
            fail("Expected NestableRuntimeException");
        } catch (NestableRuntimeException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeJavaWriterNull() throws IOException {
        try {
            StringEscapeUtils.unescapeJava((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeJavaWriterNullInput() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, null);
        assertEquals("", sw.toString());
    }

    @Test
    public void testUnescapeJavaWriterNormal() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.unescapeJava(sw, "a\\nb");
        assertEquals("a\nb", sw.toString());
    }

    // ---------- unescapeJavaScript (delegates) ----------

    @Test
    public void testUnescapeJavaScriptDelegatesToUnescapeJava() {
        assertEquals("'", StringEscapeUtils.unescapeJavaScript("\\'"));
    }

    // ---------- escapeHtml ----------

    @Test
    public void testEscapeHtmlNull() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtmlEmpty() {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testEscapeHtmlSpecialChars() {
        // basic HTML entities: < > & " '
        String input = "<>&\"'";
        String expected = "&lt;&gt;&amp;&quot;&#39;";
        assertEquals(expected, StringEscapeUtils.escapeHtml(input));
    }

    @Test
    public void testEscapeHtmlWriterNull() throws IOException {
        try {
            StringEscapeUtils.escapeHtml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEscapeHtmlWriterNullInput() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeHtml(sw, null);
        assertEquals("", sw.toString());
    }

    // ---------- unescapeHtml ----------

    @Test
    public void testUnescapeHtmlNull() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtmlEmpty() {
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test
    public void testUnescapeHtmlEntities() {
        String input = "&lt;&gt;&amp;&quot;&#39;";
        String expected = "<>&\"'";
        assertEquals(expected, StringEscapeUtils.unescapeHtml(input));
    }

    // ---------- escapeXml ----------

    @Test
    public void testEscapeXmlNull() {
        assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void testEscapeXmlEmpty() {
        assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test
    public void testEscapeXmlSpecialChars() {
        // XML escape: < > & " '
        String input = "<>&\"'";
        String expected = "&lt;&gt;&amp;&quot;&apos;";
        assertEquals(expected, StringEscapeUtils.escapeXml(input));
    }

    @Test
    public void testEscapeXmlWriterNull() throws IOException {
        try {
            StringEscapeUtils.escapeXml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEscapeXmlWriterNullInput() throws IOException {
        StringWriter sw = new StringWriter();
        StringEscapeUtils.escapeXml(sw, null);
        assertEquals("", sw.toString());
    }

    // ---------- unescapeXml ----------

    @Test
    public void testUnescapeXmlNull() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void testUnescapeXmlEmpty() {
        assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test
    public void testUnescapeXmlEntities() {
        String input = "&lt;&gt;&amp;&quot;&apos;";
        String expected = "<>&\"'";
        assertEquals(expected, StringEscapeUtils.unescapeXml(input));
    }

    // ---------- escapeSql ----------

    @Test
    public void testEscapeSqlNull() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSqlEmpty() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSqlSingleQuote() {
        assertEquals("''", StringEscapeUtils.escapeSql("'"));
    }

    @Test
    public void testEscapeSqlMultipleQuotes() {
        assertEquals("a''b''c", StringEscapeUtils.escapeSql("a'b'c"));
    }

    @Test
    public void testEscapeSqlNoQuotes() {
        assertEquals("hello", StringEscapeUtils.escapeSql("hello"));
    }
}