package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;

public class UTF8StreamJsonParserTest {

    private IOContext ctxt;
    private ByteQuadsCanonicalizer sym;
    private JsonFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new JsonFactory();
        ctxt = new IOContext(JsonFactory.Feature.collectDefaults(), null, false);
        sym = ByteQuadsCanonicalizer.createRoot();
    }

    private UTF8StreamJsonParser createParser(String json) throws IOException {
        InputStream in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        return new UTF8StreamJsonParser(ctxt, JsonParser.Feature.collectDefaults(), in, null, sym,
                buf, 0, len, false);
    }

    @Test
    public void testGetCodec() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodec() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}");
        ObjectCodec codec = new ObjectMapper();
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testReleaseBufferedNormal() throws IOException {
        String json = "  abc  ";
        InputStream in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym,
                buf, 0, len, false);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertTrue(count > 0);
        assertEquals(json.length(), count);
        assertEquals(json, out.toString());
    }

    @Test
    public void testReleaseBufferedNoData() throws IOException {
        String json = "";
        InputStream in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym,
                buf, 0, len, false);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(0, count);
    }

    @Test
    public void testGetInputSource() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNotNull(parser.getInputSource());
        assertTrue(parser.getInputSource() instanceof InputStream);
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroReturn() throws IOException {
        InputStream in = new InputStream() {
            public int read(byte[] b, int off, int len) throws IOException {
                return 0;
            }
            public int read() throws IOException {
                return 0;
            }
        };
        byte[] buf = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym,
                buf, 0, 0, false);
        parser.nextToken();
    }

    @Test
    public void testLoadMoreNormal() throws IOException {
        String json = "123";
        InputStream in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        byte[] smallBuf = new byte[1];
        int first = in.read(smallBuf, 0, 1);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym,
                smallBuf, 0, first, false);
        int token = parser.nextToken().id();
        assertEquals(JsonToken.VALUE_NUMBER_INT.id(), token);
    }

    @Test
    public void testGetTextValueString() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"hello\"");
        parser.nextToken();
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextNullToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("   ");
        parser.nextToken();
        assertNull(parser.getText());
    }

    @Test
    public void testGetValueAsStringValueString() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"testValue\"");
        parser.nextToken();
        assertEquals("testValue", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringNullToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("null");
        parser.nextToken();
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefaultNull() throws IOException {
        UTF8StreamJsonParser parser = createParser("null");
        parser.nextToken();
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsIntNumberInt() throws IOException {
        UTF8StreamJsonParser parser = createParser("42");
        parser.nextToken();
        assertEquals(42, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntNonNumber() throws IOException {
        UTF8StreamJsonParser parser = createParser("true");
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntWithDefaultNonNumber() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"abc\"");
        parser.nextToken();
        assertEquals(7, parser.getValueAsInt(7));
    }

    @Test
    public void testGetTextCharactersFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"name\":1}");
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals("name", new String(chars, 0, parser.getTextLength()));
    }

    @Test
    public void testGetTextCharactersNullToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("  ");
        parser.nextToken();
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthNullToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("  ");
        parser.nextToken();
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"key\":1}");
        parser.nextToken();
        parser.nextToken();
        assertTrue(parser.getTextLength() > 0);
    }

    @Test
    public void testGetTextOffsetFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"key\":1}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetCurrentLocation() throws IOException {
        UTF8StreamJsonParser parser = createParser("{");
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
        assertTrue(loc.getColumnNr() > 0);
    }

    @Test
    public void testGetTokenLocationFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":1}");
        parser.nextToken();
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testNextFieldNameMatch() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"name\":123}");
        parser.nextToken();
        assertFalse(parser.nextFieldName(new SerializableString() {
            public String getValue() { return "name"; }
            public int charLength() { return 4; }
            public char[] asQuotedChars() { return "name".toCharArray(); }
            public byte[] asUnquotedUTF8() { return new byte[] {'n','a','m','e'}; }
            public byte[] asQuotedUTF8() { return new byte[] {'n','a','m','e'}; }
        }));
    }

    @Test
    public void testNextFieldNameNoMatch() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"other\":123}");
        parser.nextToken();
        assertFalse(parser.nextFieldName(new SerializableString() {
            public String getValue() { return "name"; }
            public int charLength() { return 4; }
            public char[] asQuotedChars() { return "name".toCharArray(); }
            public byte[] asUnquotedUTF8() { return new byte[] {'n','a','m','e'}; }
            public byte[] asQuotedUTF8() { return new byte[] {'n','a','m','e'}; }
        }));
    }

    @Test
    public void testNextFieldNameCurrentFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":1}");
        parser.nextToken();
        parser.nextToken();
        assertFalse(parser.nextFieldName((SerializableString) null));
    }

    @Test
    public void testNextFieldNameStringMatch() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"key\":true}");
        parser.nextToken();
        assertEquals("key", parser.nextFieldName());
    }

    @Test
    public void testNextTextValueFieldNameString() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":\"value\"}");
        parser.nextToken();
        String text = parser.nextTextValue();
        assertEquals("value", text);
    }

    @Test
    public void testNextTextValueNonString() throws IOException {
        UTF8StreamJsonParser parser = createParser("123");
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValueNumber() throws IOException {
        UTF8StreamJsonParser parser = createParser("42");
        assertEquals(42, parser.nextIntValue(0));
    }

    @Test
    public void testNextIntValueDefault() throws IOException {
        UTF8StreamJsonParser parser = createParser("true");
        assertEquals(10, parser.nextIntValue(10));
    }

    @Test
    public void testNextLongValueNumber() throws IOException {
        UTF8StreamJsonParser parser = createParser("123");
        assertEquals(123L, parser.nextLongValue(0L));
    }

    @Test
    public void testNextLongValueDefault() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"abc\"");
        assertEquals(99L, parser.nextLongValue(99L));
    }

    @Test
    public void testNextBooleanValueTrue() throws IOException {
        UTF8StreamJsonParser parser = createParser("true");
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalse() throws IOException {
        UTF8StreamJsonParser parser = createParser("false");
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNull() throws IOException {
        UTF8StreamJsonParser parser = createParser("null");
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFromFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"flag\":true}");
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testTokenSequenceObject() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testTokenSequenceArray() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testParseNameEmpty() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"\":1}");
        parser.nextToken();
        assertEquals("", parser.nextFieldName());
    }

    @Test
    public void testParseNameSimple() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abc\":2}");
        parser.nextToken();
        assertEquals("abc", parser.nextFieldName());
    }

    @Test
    public void testParseNameFourBytes() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"longer\":3}");
        parser.nextToken();
        assertEquals("longer", parser.nextFieldName());
    }

    @Test
    public void testUnquotedFieldNameNotAllowed() throws IOException {
        UTF8StreamJsonParser parser = createParser("{abc:1}");
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting double-quote"));
        }
    }

    @Test
    public void testParsePosNumberInt() throws IOException {
        UTF8StreamJsonParser parser = createParser("123");
        parser.nextToken();
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testParseNegNumberInt() throws IOException {
        UTF8StreamJsonParser parser = createParser("-45");
        parser.nextToken();
        assertEquals(-45, parser.getIntValue());
    }

    @Test
    public void testParseFloatNumber() throws IOException {
        UTF8StreamJsonParser parser = createParser("3.14");
        parser.nextToken();
        assertEquals(3.14, parser.getDoubleValue(), 0.001);
    }

    @Test
    public void testParseFloatWithExponent() throws IOException {
        UTF8StreamJsonParser parser = createParser("1e10");
        parser.nextToken();
        assertEquals(1e10, parser.getDoubleValue(), 1.0);
    }

    @Test
    public void testParseNumberLeadingZero() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        InputStream in = new ByteArrayInputStream("0123".getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, f.getParserFeatures(), in, null, sym,
                buf, 0, len, false);
        parser.nextToken();
        assertEquals(123, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumberLeadingZeroNotAllowed() throws IOException {
        UTF8StreamJsonParser parser = createParser("0123");
        parser.nextToken();
    }

    @Test
    public void testParseStringWithEscaped() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"hello\\nworld\"");
        parser.nextToken();
        assertEquals("hello\nworld", parser.getText());
    }

    @Test
    public void testParseUnicodeEscape() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\u0041\"");
        parser.nextToken();
        assertEquals("A", parser.getText());
    }

    @Test
    public void testParseStringIncompleteToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":\"b\"}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals("b", parser.getText());
    }

    @Test
    public void testSkipString() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":\"longvalue\",\"b\":2}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("b", parser.getCurrentName());
    }

    @Test
    public void testMatchTrue() throws IOException {
        UTF8StreamJsonParser parser = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testMatchFalse() throws IOException {
        UTF8StreamJsonParser parser = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testMatchNull() throws IOException {
        UTF8StreamJsonParser parser = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testMatchInvalidToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("tru");
        parser.nextToken();
    }

    @Test
    public void testSkipComments() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);
        InputStream in = new ByteArrayInputStream("/* comment */ 1".getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, f.getParserFeatures(), in, null, sym,
                buf, 0, len, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testSkipCommentsNotAllowed() throws IOException {
        UTF8StreamJsonParser parser = createParser("/* comment */ 1");
        parser.nextToken();
    }

    @Test
    public void testSkipColonWithWS() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\"  :  1}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testMissingColon() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\" 1}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
    }

    @Test
    public void testGetBinaryValueBase64() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"dGVzdA==\"");
        parser.nextToken();
        byte[] data = parser.getBinaryValue(Base64Variants.MIME);
        assertNotNull(data);
        assertEquals(4, data.length);
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueInvalidToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("123");
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test
    public void testReadBinaryValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"dGVzdA==\"");
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.MIME, out);
        assertTrue(count > 0);
        assertArrayEquals(new byte[]{'t','e','s','t'}, out.toByteArray());
    }

    @Test
    public void testHandleApos() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        InputStream in = new ByteArrayInputStream("'single'".getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, f.getParserFeatures(), in, null, sym,
                buf, 0, len, false);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("single", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddNameInvalid() throws IOException {
        UTF8StreamJsonParser parser = createParser("{invalid:1}");
        parser.nextToken();
    }

    @Test
    public void testCloseInputOnAutoClose() throws IOException {
        InputStream in = new ByteArrayInputStream("{}".getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, JsonParser.Feature.AUTO_CLOSE_SOURCE.getMask(), in, null, sym,
                buf, 0, len, false);
        parser.nextToken();
        parser.close();
        assertNull(parser.getInputSource());
    }

    @Test
    public void testReleaseBuffers() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}");
        parser.nextToken();
        parser.close();
    }

    @Test
    public void testGrowArrayBy() {
        int[] arr = new int[5];
        int[] grown = UTF8StreamJsonParser.growArrayBy(arr, 3);
        assertEquals(8, grown.length);
    }

    @Test
    public void testGrowArrayByNull() {
        int[] grown = UTF8StreamJsonParser.growArrayBy(null, 10);
        assertEquals(10, grown.length);
    }

    @Test(expected = IOException.class)
    public void testEOFInName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abc");
        parser.nextToken();
        parser.nextToken();
    }

    @Test
    public void testParseNameWithUTF8TwoByte() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"\\u00e9\":1}");
        parser.nextToken();
        assertEquals("\u00e9", parser.nextFieldName());
    }

    @Test
    public void testParseNameWithUTF8ThreeByte() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"\\u4e2d\":2}");
        parser.nextToken();
        assertEquals("\u4e2d", parser.nextFieldName());
    }

    @Test
    public void testSkipYAMLComment() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        InputStream in = new ByteArrayInputStream("# yaml\n1".getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, f.getParserFeatures(), in, null, sym,
                buf, 0, len, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testHandleNonNumericNaN() throws IOException {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        InputStream in = new ByteArrayInputStream("NaN".getBytes("UTF-8"));
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, f.getParserFeatures(), in, null, sym,
                buf, 0, len, false);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
    }

    @Test(expected = JsonParseException.class)
    public void testHandleNonNumericNaNNotAllowed() throws IOException {
        UTF8StreamJsonParser parser = createParser("NaN");
        parser.nextToken();
    }

    @Test
    public void testMismatchedEndBracketInArray() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,2}");
        try {
            parser.nextToken();
            parser.nextToken();
            parser.nextToken();
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("mismatched"));
        }
    }

    @Test
    public void testMismatchedEndBraceInObject() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":1]");
        try {
            parser.nextToken();
            parser.nextToken();
            parser.nextToken();
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("mismatched"));
        }
    }

    @Test
    public void testSkipWSWithNewline() throws IOException {
        UTF8StreamJsonParser parser = createParser("\n1");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testSkipWSWithCRLF() throws IOException {
        UTF8StreamJsonParser parser = createParser("\r\n1");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidSpaceCharacter() throws IOException {
        byte[] invalid = new byte[]{(byte)0x0B};
        InputStream in = new ByteArrayInputStream(invalid);
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym,
                buf, 0, len, false);
        parser.nextToken();
    }
}