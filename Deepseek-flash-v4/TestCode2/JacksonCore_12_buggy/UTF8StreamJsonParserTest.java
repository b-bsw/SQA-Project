package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import org.junit.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

public class UTF8StreamJsonParserTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private UTF8StreamJsonParser parser(String json) throws Exception {
        return (UTF8StreamJsonParser) factory.createParser(
                new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8)));
    }

    private static void assertToken(JsonToken expected, JsonToken actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void testObjectAndArrayTokens() throws Exception {
        UTF8StreamJsonParser p = parser("{\"a\":[1,true,null],\"b\":{\"c\":2.5}}");

        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertNotNull(p.getCurrentLocation());
        assertNotNull(p.getTokenLocation());

        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());

        assertToken(JsonToken.START_ARRAY, p.nextToken());

        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());

        assertToken(JsonToken.VALUE_TRUE, p.nextToken());

        assertToken(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals("null", p.getText());

        assertToken(JsonToken.END_ARRAY, p.nextToken());

        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getText());

        assertToken(JsonToken.START_OBJECT, p.nextToken());

        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("c", p.getText());

        assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2.5, p.getDoubleValue(), 0.0001);

        assertToken(JsonToken.END_OBJECT, p.nextToken());
        assertToken(JsonToken.END_OBJECT, p.nextToken());

        assertNull(p.nextToken());
    }

    @Test
    public void testNextFieldNameVariants() throws Exception {
        UTF8StreamJsonParser p = parser("{\"foo\":1}");
        assertToken(JsonToken.START_OBJECT, p.nextToken());

        SerializedString field = new SerializedString("foo");
        assertTrue(p.nextFieldName(field));
        assertEquals("foo", p.getCurrentName());

        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertToken(JsonToken.END_OBJECT, p.nextToken());

        p = parser("{\"bar\":1}");
        p.nextToken();
        assertFalse(p.nextFieldName(new SerializedString("foo")));

        p = parser("{\"baz\":2}");
        p.nextToken();
        assertEquals("baz", p.nextFieldName());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
    }

    @Test
    public void testNextTextValueAndNumbers() throws Exception {
        UTF8StreamJsonParser p = parser("\"hello\" 123 true false null");

        assertEquals("hello", p.nextTextValue());
        assertEquals(123, p.nextIntValue(0));
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
        assertNull(p.nextBooleanValue());

        p = parser(String.valueOf(Long.MAX_VALUE));
        assertEquals(Long.MAX_VALUE, p.nextLongValue(0L));
    }

    @Test
    public void testGetValueAsString() throws Exception {
        UTF8StreamJsonParser p = parser("{\"a\":12,\"b\":\"hello\",\"c\":null}");

        assertToken(JsonToken.START_OBJECT, p.nextToken());

        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getValueAsString());

        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("12", p.getValueAsString());

        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getValueAsString());

        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getValueAsString());

        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertToken(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals("null", p.getText());
    }

    @Test
    public void testGetValueAsInt() throws Exception {
        UTF8StreamJsonParser p = parser("123 -42 3.5");

        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getValueAsInt());

        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-42, p.getValueAsInt());

        assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(3, p.getValueAsInt());

        p = parser("\"notANumber\"");
        p.nextToken();
        assertEquals(17, p.getValueAsInt(17));
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        UTF8StreamJsonParser p = parser("{\"fieldName\":\"value\"}");

        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        char[] buf = p.getTextCharacters();
        assertEquals("fieldName", new String(buf, p.getTextOffset(), p.getTextLength()));

        p.nextToken(); // VALUE_STRING
        buf = p.getTextCharacters();
        assertEquals("value", new String(buf, p.getTextOffset(), p.getTextLength()));
    }

    @Test
    public void testBinaryValues() throws Exception {
        byte[] expected = new byte[] {'a', 'a', 'a'};

        UTF8StreamJsonParser p = parser("\"YWFh\"");
        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertArrayEquals(expected, p.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS));

        p = parser("\"YWFh\"");
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(3, p.readBinaryValue(Base64Variants.MIME_NO_LINEFEEDS, out));
        assertArrayEquals(expected, out.toByteArray());

        p = parser("123");
        p.nextToken();
        try {
            p.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS);
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testReleaseBuffered() throws Exception {
        UTF8StreamJsonParser p = parser("{\"a\":1}");
        while (p.nextToken() != null) {
            // read to EOF
        }
        int released = p.releaseBuffered(new ByteArrayOutputStream());
        assertTrue(released >= 0);
    }

    @Test
    public void testExceptionPaths() throws Exception {
        UTF8StreamJsonParser p = parser("]");
        try {
            p.nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }

        p = parser("\"abc");
        try {
            p.nextToken();
            p.getText();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }

        p = parser("{\"a\":1");
        p.nextToken();
        p.nextToken();
        p.nextToken();
        try {
            p.nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }

        p = parser("-x");
        try {
            p.nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testParserFeatures() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        f.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);

        String json = "/*c*/{a:'value',b:/*x*/2}";
        UTF8StreamJsonParser p = (UTF8StreamJsonParser) f.createParser(
                new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8)));

        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());

        assertToken(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());

        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());

        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());

        assertToken(JsonToken.END_OBJECT, p.nextToken());
    }
}