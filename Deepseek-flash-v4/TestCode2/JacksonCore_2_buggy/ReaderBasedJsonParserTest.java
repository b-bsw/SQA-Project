package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;

import com.fasterxml.jackson.core.*;

public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser newParser(String json) throws Exception {
        return (ReaderBasedJsonParser) new JsonFactory().createParser(new StringReader(json));
    }

    private static class TrackingReader extends Reader {
        private final String content;
        private boolean closed;
        private int pos;

        TrackingReader(String content) {
            this.content = content;
        }

        boolean isClosed() {
            return closed;
        }

        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            if (closed || pos >= content.length()) {
                return -1;
            }
            int n = Math.min(len, content.length() - pos);
            content.getChars(pos, pos + n, cbuf, off);
            pos += n;
            return n;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }
    }

    @Test
    public void testNextTokenEmptyAndWhitespaceInput() throws Exception {
        assertNull(newParser("").nextToken());
        assertNull(newParser("   ").nextToken());
    }

    @Test
    public void testNextTokenObjectAndArray() throws Exception {
        ReaderBasedJsonParser p = newParser("{\"a\":[1,2]}");

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());

        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());

        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testScalarTokens() throws Exception {
        ReaderBasedJsonParser p = newParser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals("true", p.getText());

        p = newParser("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        p = newParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());

        p = newParser("1.25");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.25, p.getDoubleValue(), 0.0001);
    }

    @Test
    public void testConvenienceScalarGetters() throws Exception {
        ReaderBasedJsonParser p = newParser("{\"x\":7}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("x", p.getCurrentName());
        assertEquals(7, p.nextIntValue(-1));
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p = newParser("{\"x\":1234567890123}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(1234567890123L, p.nextLongValue(-1L));
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p = newParser("{\"x\":false}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p = newParser("{\"x\":null}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertNull(p.nextBooleanValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p = newParser("{\"x\":\"y\"}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("y", p.nextTextValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testStringsAndEscapes() throws Exception {
        ReaderBasedJsonParser p = newParser("\"hello\\nworld\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello\nworld", p.getText());

        p = newParser("\"a\\\"b\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a\"b", p.getText());
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        ReaderBasedJsonParser p = newParser("\"abc\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());

        char[] chars = p.getTextCharacters();
        int off = p.getTextOffset();
        int len = p.getTextLength();
        assertEquals("abc", new String(chars, off, len));

        p = newParser("{\"key\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());

        chars = p.getTextCharacters();
        off = p.getTextOffset();
        len = p.getTextLength();
        assertEquals("key", new String(chars, off, len));
    }

    @Test
    public void testGetValueAsString() throws Exception {
        ReaderBasedJsonParser p = newParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getValueAsString());
        assertEquals("hello", p.getValueAsString("default"));
    }

    @Test
    public void testBinaryValue() throws Exception {
        ReaderBasedJsonParser p = newParser("\"aGVsbG8=\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] data = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertEquals("hello", new String(data, "UTF-8"));

        p = newParser("\"aGVsbG8=\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int n = p.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertTrue(n > 0);
        assertEquals("hello", new String(out.toByteArray(), "UTF-8"));
    }

    @Test(expected = JsonParseException.class)
    public void testBinaryValueOnNonStringFails() throws Exception {
        ReaderBasedJsonParser p = newParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testComments() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);

        ReaderBasedJsonParser p =
                (ReaderBasedJsonParser) f.createParser(new StringReader("/* block */true"));
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());

        p = (ReaderBasedJsonParser) f.createParser(new StringReader("// line\ntrue"));
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
    }

    @Test
    public void testAllowedSingleQuotesAndUnquotedNames() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        f.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);

        ReaderBasedJsonParser p =
                (ReaderBasedJsonParser) f.createParser(new StringReader("{a:'b'}"));

        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("b", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
    }

    @Test
    public void testGetInputSource() throws Exception {
        StringReader reader = new StringReader("{}");
        ReaderBasedJsonParser p =
                (ReaderBasedJsonParser) new JsonFactory().createParser(reader);
        assertSame(reader, p.getInputSource());
    }

    @Test
    public void testCloseClosesSource() throws Exception {
        TrackingReader reader = new TrackingReader("{}");
        ReaderBasedJsonParser p =
                (ReaderBasedJsonParser) new JsonFactory().createParser(reader);
        p.close();
        assertTrue(reader.isClosed());
        p.close();
    }

    @Test
    public void testReleaseBufferedEmpty() throws Exception {
        ReaderBasedJsonParser p = newParser("true");
        StringWriter w = new StringWriter();
        assertEquals(0, p.releaseBuffered(w));
        assertEquals("", w.toString());
    }

    @Test
    public void testReleaseBufferedAfterRead() throws Exception {
        ReaderBasedJsonParser p = newParser("true false");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());

        StringWriter w = new StringWriter();
        int count = p.releaseBuffered(w);
        assertTrue(count > 0);
        assertTrue(w.toString().contains("false"));
    }

    @Test
    public void testUnexpectedCharacterFails() {
        try {
            newParser("~").nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testUnexpectedEofFails() throws Exception {
        ReaderBasedJsonParser p = newParser("{\"a\":");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());

        try {
            p.nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }
}