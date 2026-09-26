package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.*;

public class ReaderBasedJsonParserTest {

    private IOContext ctxt;
    private CharsToNameCanonicalizer symbols;
    private int features;
    private Reader reader;
    private ReaderBasedJsonParser parser;
    private ByteArrayOutputStream bos;

    @Before
    public void setUp() throws Exception {
        ctxt = new IOContext(JsonFactory.Feature.collectDefaults(),
                null, null, null, null, null, false);
        symbols = CharsToNameCanonicalizer.createRoot(0).child();
        features = JsonParser.Feature.collectDefaults();
        bos = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() throws Exception {
        if (parser != null) {
            parser.close();
        }
    }

    @Test
    public void testGetTextReturnsStringForStringToken() throws Exception {
        String json = "\"hello\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextReturnsNullWhenTokenIsNull() throws Exception {
        String json = " ";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertNull(parser.getText());
    }

    @Test
    public void testGetTextCharactersForFieldName() throws Exception {
        String json = "{\"name\":123}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals("name", new String(chars, 0, parser.getTextLength()));
    }

    @Test
    public void testGetTextCharactersForStringToken() throws Exception {
        String json = "\"abc\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals("abc", new String(chars, 0, parser.getTextLength()));
    }

    @Test
    public void testGetTextCharactersReturnsNullWhenTokenNull() throws Exception {
        String json = " ";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthForStringToken() throws Exception {
        String json = "\"hello\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthReturnsZeroWhenTokenNull() throws Exception {
        String json = " ";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetForStringToken() throws Exception {
        String json = "\"hello\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetTextOffsetReturnsZeroWhenTokenNull() throws Exception {
        String json = " ";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testNextTokenReturnsFieldName() throws Exception {
        String json = "{\"key\":\"value\"}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
    }

    @Test
    public void testNextTokenReturnsStringValue() throws Exception {
        String json = "\"value\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testNextTokenReturnsNull() throws Exception {
        String json = "null";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenReturnsBooleanTrue() throws Exception {
        String json = "true";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenReturnsBooleanFalse() throws Exception {
        String json = "false";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenReturnsInteger() throws Exception {
        String json = "42";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testNextTokenReturnsNegativeInteger() throws Exception {
        String json = "-7";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-7, parser.getIntValue());
    }

    @Test
    public void testNextTokenReturnsFloat() throws Exception {
        String json = "3.14";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.001);
    }

    @Test
    public void testNextTokenReturnsStartArray() throws Exception {
        String json = "[1,2]";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenReturnsStartObject() throws Exception {
        String json = "{\"a\":1}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenReturnsNullForEmptyInput() throws Exception {
        String json = "   ";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithTrailingCommaAllowed() throws Exception {
        features |= Feature.ALLOW_TRAILING_COMMA.getMask();
        String json = "{\"a\":1,}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenThrowsOnInvalidChar() throws Exception {
        String json = "{!}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        parser.nextToken();
    }

    @Test
    public void testNextFieldNameReturnsFieldNameAndAdvances() throws Exception {
        String json = "{\"name\":\"John\"}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        String name = parser.nextFieldName();
        assertEquals("name", name);
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());
    }

    @Test
    public void testNextFieldNameReturnsNullWhenNotInObject() throws Exception {
        String json = "[]";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameWithSerializableStringMatch() throws Exception {
        String json = "{\"key\":123}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        SerializableString sstr = new SerializableString() {
            public String getValue() { return "key"; }
            public int charLength() { return 3; }
            public char[] asQuotedChars() { return new char[]{'"','k','e','y','"'}; }
            public byte[] asUnquotedUTF8() { return null; }
            public byte[] asQuotedUTF8() { return null; }
            public int appendQuotedUTF8(byte[] b, int o) { return 0; }
            public int appendQuoted(char[] b, int o) { return 0; }
            public int appendUnquotedUTF8(byte[] b, int o) { return 0; }
            public int appendUnquoted(char[] b, int o) { return 0; }
        };
        assertTrue(parser.nextFieldName(sstr));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
    }

    @Test
    public void testNextFieldNameWithSerializableStringNoMatch() throws Exception {
        String json = "{\"other\":456}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        SerializableString sstr = new SerializableString() {
            public String getValue() { return "key"; }
            public int charLength() { return 3; }
            public char[] asQuotedChars() { return new char[]{'"','k','e','y','"'}; }
            public byte[] asUnquotedUTF8() { return null; }
            public byte[] asQuotedUTF8() { return null; }
            public int appendQuotedUTF8(byte[] b, int o) { return 0; }
            public int appendQuoted(char[] b, int o) { return 0; }
            public int appendUnquotedUTF8(byte[] b, int o) { return 0; }
            public int appendUnquoted(char[] b, int o) { return 0; }
        };
        assertFalse(parser.nextFieldName(sstr));
        assertEquals("other", parser.getCurrentName());
    }

    @Test
    public void testNextTextValueReturnsString() throws Exception {
        String json = "{\"name\":\"John\"}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        String text = parser.nextTextValue();
        assertEquals("John", text);
    }

    @Test
    public void testNextTextValueReturnsNullForNonString() throws Exception {
        String json = "{\"name\":42}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValueReturnsInt() throws Exception {
        String json = "{\"age\":25}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(25, parser.nextIntValue(0));
    }

    @Test
    public void testNextIntValueReturnsDefaultWhenNotInt() throws Exception {
        String json = "{\"age\":\"old\"}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(99, parser.nextIntValue(99));
    }

    @Test
    public void testNextLongValueReturnsLong() throws Exception {
        String json = "{\"id\":123456789}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(123456789L, parser.nextLongValue(0L));
    }

    @Test
    public void testNextLongValueReturnsDefault() throws Exception {
        String json = "{\"id\":\"abc\"}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(-1L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueReturnsTrue() throws Exception {
        String json = "{\"flag\":true}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueReturnsFalse() throws Exception {
        String json = "{\"flag\":false}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueReturnsNullForNonBoolean() throws Exception {
        String json = "{\"flag\":123}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testGetBinaryValueReturnsDecodedBytes() throws Exception {
        String json = "\"SGVsbG8=\""; // "Hello" in base64
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        byte[] result = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("Hello".getBytes("UTF-8"), result);
    }

    @Test
    public void testGetBinaryValueReturnsExistingBinary() throws Exception {
        String json = "\"SGVsbG8=\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        byte[] first = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        byte[] second = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertSame(first, second);
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueThrowsOnNonStringToken() throws Exception {
        String json = "123";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testReadBinaryValueWritesToStream() throws Exception {
        String json = "\"SGVsbG8=\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        int count = parser.readBinaryValue(Base64Variants.getDefaultVariant(), bos);
        assertEquals(5, count);
        assertArrayEquals("Hello".getBytes("UTF-8"), bos.toByteArray());
    }

    @Test
    public void testGetValueAsStringReturnsStringForStringToken() throws Exception {
        String json = "\"hello\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals("hello", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringReturnsFieldName() throws Exception {
        String json = "{\"key\":\"val\"}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        parser.nextToken();
        assertEquals("key", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefaultReturnsDefaultForNonString() throws Exception {
        String json = "123";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testFinishTokenFinishesIncompleteString() throws Exception {
        String json = "\"hello\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        parser.finishToken();
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testReleaseBufferedReturnsCount() throws Exception {
        String json = "abc";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        StringWriter writer = new StringWriter();
        int count = parser.releaseBuffered(writer);
        assertEquals(3, count);
        assertEquals("abc", writer.toString());
    }

    @Test
    public void testReleaseBufferedReturnsZeroWhenEmpty() throws Exception {
        String json = "";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        StringWriter writer = new StringWriter();
        assertEquals(0, parser.releaseBuffered(writer));
    }

    @Test
    public void testGetInputSourceReturnsReader() throws Exception {
        reader = new StringReader("{}");
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testGetTokenLocationForFieldName() throws Exception {
        String json = "{\"a\":1}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetTokenLocationForValue() throws Exception {
        String json = "true";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() throws Exception {
        String json = "{}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCodecReturnsNullByDefault() throws Exception {
        reader = new StringReader("{}");
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodecStoresCodec() throws Exception {
        reader = new StringReader("{}");
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        ObjectCodec codec = new ObjectCodec() {
            public JsonParser getFactory() { return null; }
            public JsonFactory getJsonFactory() { return null; }
            public <T> T readValue(JsonParser p, Class<T> v) { return null; }
            public <T> T readValue(JsonParser p, TypeReference<?> v) { return null; }
            public JsonNode readTree(JsonParser p) { return null; }
        };
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testGetTextWithWriterForStringToken() throws Exception {
        String json = "\"hello\"";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        StringWriter writer = new StringWriter();
        assertEquals(5, parser.getText(writer));
        assertEquals("hello", writer.toString());
    }

    @Test
    public void testGetTextWithWriterForFieldName() throws Exception {
        String json = "{\"key\":1}";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        parser.nextToken();
        StringWriter writer = new StringWriter();
        assertEquals(3, parser.getText(writer));
        assertEquals("key", writer.toString());
    }

    @Test
    public void testGetTextWithWriterForNumericToken() throws Exception {
        String json = "123.45";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        StringWriter writer = new StringWriter();
        assertEquals(6, parser.getText(writer));
        assertEquals("123.45", writer.toString());
    }

    @Test
    public void testGetTextWithWriterForOtherToken() throws Exception {
        String json = "true";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        StringWriter writer = new StringWriter();
        assertEquals(4, parser.getText(writer));
        assertEquals("true", writer.toString());
    }

    @Test
    public void testGetTextWithWriterReturnsZeroWhenTokenNull() throws Exception {
        String json = " ";
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, null, symbols);
        parser.nextToken();
        StringWriter writer = new StringWriter();
        assertEquals(0, parser.getText(writer));
    }
}