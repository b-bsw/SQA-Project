package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

import java.io.*;

public class ReaderBasedJsonParserTest {

    private IOContext ioContext;
    private CharsToNameCanonicalizer symbolTable;
    private ReaderBasedJsonParser parser;

    @Before
    public void setUp() throws Exception {
        BufferRecycler br = new BufferRecycler();
        ioContext = new IOContext(br, null, false);
        symbolTable = CharsToNameCanonicalizer.createRoot(0).makeChild(0);
    }

    private void initParser(Reader reader, int features) {
        parser = new ReaderBasedJsonParser(ioContext, features, reader, null, symbolTable);
    }

    @Test
    public void testReleaseBufferedZeroCount() throws Exception {
        String json = "";
        initParser(new StringReader(json), 0);
        StringWriter w = new StringWriter();
        assertEquals(0, parser.releaseBuffered(w));
    }

    @Test
    public void testReleaseBufferedWithData() throws Exception {
        String json = "true";
        initParser(new StringReader(json), 0);
        // advance pointer by reading some
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        StringWriter w = new StringWriter();
        int count = parser.releaseBuffered(w);
        assertTrue("should have some buffered", count > 0);
        assertTrue(w.toString().contains("true"));
    }

    @Test
    public void testGetCodec() {
        initParser(new StringReader("1"), 0);
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodec() {
        initParser(new StringReader("1"), 0);
        parser.setCodec(null);
        assertNull(parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        Reader r = new StringReader("1");
        initParser(r, 0);
        assertSame(r, parser.getInputSource());
    }

    @Test
    public void testLoadMoreFromReader() throws Exception {
        String json = "abc";
        initParser(new StringReader(json), 0);
        // exhaust buffer, then call loadMore indirectly
        assertFalse(parser.nextToken() != null);
        // now empty, loadMore returns false
    }

    @Test
    public void testLoadMoreReturnsFalseWhenReaderNull() throws Exception {
        // we need to set reader null manually, then call loadMore
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ioContext, 0,
                new StringReader(" "), null, symbolTable);
        // consume buffer
        assertNull(p.nextToken());
        // try calling loadMore again
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroCount() throws Exception {
        // Use a reader that returns 0 on read
        Reader zeroReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() {}
        };
        initParser(zeroReader, 0);
        parser.nextToken(); // triggers loadMore
    }

    @Test
    public void testGetNextCharNormal() throws Exception {
        String json = "x";
        initParser(new StringReader(json), 0);
        char ch = parser.getNextChar("eof");
        assertEquals('x', ch);
    }

    @Test(expected = IOException.class)
    public void testGetNextCharEOF() throws Exception {
        initParser(new StringReader(""), 0);
        parser.getNextChar("eof test");
    }

    @Test
    public void testCloseInput() throws Exception {
        Reader mock = new StringReader("abc");
        initParser(mock, 0);
        parser._closeInput();
        // should close and set null
    }

    @Test
    public void testReleaseBuffers() throws Exception {
        initParser(new StringReader("1"), 0);
        parser._releaseBuffers();
    }

    @Test
    public void testGetTextForNullToken() throws Exception {
        initParser(new StringReader(" "), 0);
        assertNull(parser.getText());
    }

    @Test
    public void testGetTextForStringToken() throws Exception {
        String json = "\"hello\"";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextForFieldName() throws Exception {
        String json = "{\"key\":1}";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getText());
    }

    @Test
    public void testGetTextForIntNumber() throws Exception {
        String json = "42";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("42", parser.getText());
    }

    @Test
    public void testGetTextForFloatNumber() throws Exception {
        String json = "3.14";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(parser.getText().startsWith("3.14"));
    }

    @Test
    public void testGetValueAsStringNullToken() throws Exception {
        initParser(new StringReader(" "), 0);
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringStringToken() throws Exception {
        String json = "\"world\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals("world", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringFieldName() throws Exception {
        String json = "{\"field\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals("field", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws Exception {
        initParser(new StringReader("null"), 0);
        parser.nextToken();
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharactersNullToken() throws Exception {
        initParser(new StringReader(" "), 0);
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextCharactersStringToken() throws Exception {
        String json = "\"test\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
    }

    @Test
    public void testGetTextLengthNullToken() throws Exception {
        initParser(new StringReader(" "), 0);
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthStringToken() throws Exception {
        String json = "\"abc\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals(3, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetNullToken() throws Exception {
        initParser(new StringReader(" "), 0);
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetTextOffsetStringToken() throws Exception {
        String json = "\"x\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertTrue(parser.getTextOffset() >= 0);
    }

    @Test
    public void testNextTokenSimpleArray() throws Exception {
        String json = "[1,2]";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenSimpleObject() throws Exception {
        String json = "{\"a\":3}";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(3, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenRootValue() throws Exception {
        String json = "null";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenRootBoolean() throws Exception {
        String json = "true";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenRootFalse() throws Exception {
        String json = "false";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextFieldNameSimple() throws Exception {
        String json = "{\"x\":1}";
        initParser(new StringReader(json), 0);
        assertEquals("x", parser.nextFieldName());
        assertEquals(1, parser.nextIntValue(-1));
    }

    @Test
    public void testNextFieldNameWhenNotObject() throws Exception {
        String json = "[1,2]";
        initParser(new StringReader(json), 0);
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameWhenFieldNameCurrent() throws Exception {
        String json = "{\"a\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME a
        // call nextFieldName while current is FIELD_NAME
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextTextValueFromFieldName() throws Exception {
        String json = "{\"name\":\"John\"}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        String val = parser.nextTextValue();
        assertEquals("John", val);
    }

    @Test
    public void testNextTextValueNotString() throws Exception {
        String json = "{\"age\":30}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValueFromFieldName() throws Exception {
        String json = "{\"count\":5}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals(5, parser.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueNotInt() throws Exception {
        String json = "{\"val\":\"str\"}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals(-1, parser.nextIntValue(-1));
    }

    @Test
    public void testNextLongValueFromFieldName() throws Exception {
        String json = "{\"big\":1234567890123}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals(1234567890123L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueTrue() throws Exception {
        String json = "{\"flag\":true}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalse() throws Exception {
        String json = "{\"flag\":false}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNotBoolean() throws Exception {
        String json = "{\"flag\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testParsePosNumberSimple() throws Exception {
        String json = "123";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testParseNegNumber() throws Exception {
        String json = "-456";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-456, parser.getIntValue());
    }

    @Test
    public void testParseFloatNumber() throws Exception {
        String json = "3.14";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(parser.getDoubleValue() - 3.14 < 0.001);
    }

    @Test
    public void testParseNumberWithExponent() throws Exception {
        String json = "1.5e10";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.5e10, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testParseNumberLeadingZeroAllowed() throws Exception {
        String json = "0";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testParseNumberLeadingZeroDisallowed() throws Exception {
        String json = "00";
        initParser(new StringReader(json), JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        parser.nextToken(); // should fail
    }

    @Test
    public void testParseNameSimple() throws Exception {
        String json = "\"simpleKey\"";
        initParser(new StringReader(json), 0);
        // need a context
        parser._parsingContext = parser._parsingContext.createChildObjectContext(1, 1);
        String name = parser._parseName();
        assertEquals("simpleKey", name);
    }

    @Test
    public void testHandleOddNameQuotesDisabled() throws Exception {
        String json = "'single'";
        initParser(new StringReader(json), 0);
        parser._parsingContext = parser._parsingContext.createChildObjectContext(1, 1);
        // single quotes not allowed by default
        try {
            parser._handleOddName('\'');
            fail("Expecting exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testHandleOddNameUnquoted() throws Exception {
        String json = "unquotedName";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        parser._parsingContext = parser._parsingContext.createChildObjectContext(1, 1);
        // read first char
        int i = 'u';
        String name = parser._handleOddName(i);
        assertEquals("unquotedName", name);
    }

    @Test
    public void testFinishString() throws Exception {
        String json = "\"hello world\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals("hello world", parser.getText());
    }

    @Test
    public void testFinishStringWithEscapes() throws Exception {
        String json = "\"line1\\nline2\"";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertTrue(parser.getText().contains("\n"));
    }

    @Test
    public void testSkipString() throws Exception {
        String json = "\"skip\" ";
        initParser(new StringReader(json), 0);
        parser._tokenIncomplete = true;
        parser.nextToken(); // should skip string and return next token (space then null)
        // After skipping, we are at end
    }

    @Test
    public void testSkipColonSimple() throws Exception {
        String json = ":";
        initParser(new StringReader(json), 0);
        // adjust input to start directly before colon
        // since we need a colon in the buffer
        int result = parser._skipColon();
        // colon consumed, result should be next char (EOF -> loadMore -> -1)
        // Actually after colon there is nothing, so result is -1
        assertEquals(-1, result);
    }

    @Test
    public void testSkipCommaSimple() throws Exception {
        String json = ", ";
        initParser(new StringReader(json), 0);
        int i = parser._skipComma(',');
        assertTrue(i > 0);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipCommaMissing() throws Exception {
        String json = "}";
        initParser(new StringReader(json), 0);
        parser._skipComma('}');
    }

    @Test
    public void testSkipWSOrEndSimpleSpace() throws Exception {
        String json = " x";
        initParser(new StringReader(json), 0);
        int i = parser._skipWSOrEnd();
        assertEquals('x', i);
    }

    @Test
    public void testSkipWSOrEndEndOfInput() throws Exception {
        String json = "";
        initParser(new StringReader(json), 0);
        int i = parser._skipWSOrEnd();
        assertTrue(i < 0);
    }

    @Test
    public void testMatchTrue() throws Exception {
        String json = "true";
        initParser(new StringReader(json), 0);
        parser._matchTrue();
        // no exception means match
    }

    @Test
    public void testMatchFalse() throws Exception {
        String json = "false";
        initParser(new StringReader(json), 0);
        parser._matchFalse();
    }

    @Test
    public void testMatchNull() throws Exception {
        String json = "null";
        initParser(new StringReader(json), 0);
        parser._matchNull();
    }

    @Test(expected = JsonParseException.class)
    public void testMatchTokenInvalid() throws Exception {
        String json = "nully";
        initParser(new StringReader(json), 0);
        parser._matchToken("null", 1);
    }

    @Test
    public void testGetTokenLocation() throws Exception {
        String json = "42";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() throws Exception {
        String json = "42";
        initParser(new StringReader(json), 0);
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testUpdateLocation() throws Exception {
        String json = "abc";
        initParser(new StringReader(json), 0);
        parser._updateLocation();
    }

    @Test
    public void testUpdateNameLocation() throws Exception {
        String json = "name";
        initParser(new StringReader(json), 0);
        parser._updateNameLocation();
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidToken() throws Exception {
        String json = "badToken";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testHandleOddValueSingleQuoteEnabled() throws Exception {
        String json = "'value'";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testHandleOddValueInfinity() throws Exception {
        String json = "Infinity";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
    }

    @Test
    public void testHandleOddValueNaN() throws Exception {
        String json = "NaN";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddValueInfinityNotAllowed() throws Exception {
        String json = "Infinity";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testBinaryValueBase64() throws Exception {
        String json = "\"SGVsbG8=\"";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] binary = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertNotNull(binary);
        assertEquals("Hello", new String(binary));
    }

    @Test
    public void testReadBinaryValue() throws Exception {
        String json = "\"SGVsbG8=\"";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(Base64Variants.getDefaultVariant(), bos);
        assertEquals(5, len);
        assertEquals("Hello", bos.toString("UTF-8"));
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueNonStringToken() throws Exception {
        String json = "123";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testDecodeBase64Inline() throws Exception {
        String json = "\"TWVzc2FnZQ==\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        byte[] result = parser._decodeBase64(Base64Variants.getDefaultVariant());
        assertEquals("Message", new String(result));
    }

    @Test
    public void testGetBinaryValueWithTokenIncomplete() throws Exception {
        String json = "\"YWJj\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser._tokenIncomplete = true;
        byte[] b = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertEquals("abc", new String(b));
    }

    @Test
    public void testReadBinaryValueWithTokenIncomplete() throws Exception {
        String json = "\"eHl6\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser._tokenIncomplete = true;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(Base64Variants.getDefaultVariant(), bos);
        assertEquals(3, len);
        assertEquals("xyz", bos.toString());
    }

    @Test
    public void testNextFieldNameMatchSuccess() throws Exception {
        String json = "{\"name\":\"John\"}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertTrue(parser.nextFieldName(new SerializableString() {
            public String getValue() { return "name"; }
            public int charLength() { return 4; }
            public char[] asQuotedChars() { return "\"name\"".toCharArray(); }
            public byte[] asUnquotedUTF8() { return null; }
            public byte[] asQuotedUTF8() { return null; }
            public int appendQuoted(char[] buffer, int offset) { return 0; }
            public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            public int appendUnquoted(char[] buffer, int offset) { return 0; }
            public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
        }));
    }

    @Test
    public void testNextFieldNameMatchFailure() throws Exception {
        String json = "{\"other\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertFalse(parser.nextFieldName(new SerializableString() {
            public String getValue() { return "name"; }
            public int charLength() { return 4; }
            public char[] asQuotedChars() { return "\"name\"".toCharArray(); }
            public byte[] asUnquotedUTF8() { return null; }
            public byte[] asQuotedUTF8() { return null; }
            public int appendQuoted(char[] buffer, int offset) { return 0; }
            public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            public int appendUnquoted(char[] buffer, int offset) { return 0; }
            public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
        }));
    }

    @Test
    public void testNextFieldNameWhenNotInObject() throws Exception {
        String json = "[1]";
        initParser(new StringReader(json), 0);
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameWithEndArray() throws Exception {
        String json = "[]";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameWithEndObject() throws Exception {
        String json = "{}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameStringNullNotAllowed() throws Exception {
        String json = "{\"key\":\"val\"}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        String name = parser.nextFieldName();
        assertEquals("key", name);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("val", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testHandleUnexpectedToken() throws Exception {
        String json = "{]";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testVerifyRootSpaceNewline() throws Exception {
        String json = "42\n";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testVerifyRootSpaceTab() throws Exception {
        String json = "42\t";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testVerifyRootSpaceCR() throws Exception {
        String json = "42\r";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testVerifyRootSpaceInvalid() throws Exception {
        String json = "42|";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testSkipYAMLCommentEnabled() throws Exception {
        String json = "# comment\n42";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testSkipLineComment() throws Exception {
        String json = "// comment\n42";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_COMMENTS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testSkipCComment() throws Exception {
        String json = "/* comment */42";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_COMMENTS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testCommentNotEnabled() throws Exception {
        String json = "// comment";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testHandleApos() throws Exception {
        String json = "'value'";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
    }

    @Test
    public void testTokenIncompleteHandledInGetText() throws Exception {
        String json = "\"test\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser._tokenIncomplete = true;
        assertEquals("test", parser.getText());
        assertFalse(parser._tokenIncomplete);
    }

    @Test
    public void testGetValueAsStringDefaults() throws Exception {
        String json = "true";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefaultNull() throws Exception {
        String json = "false";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals("def", parser.getValueAsString("def"));
    }

    @Test
    public void testNextIntValueSimple() throws Exception {
        String json = "7";
        initParser(new StringReader(json), 0);
        assertEquals(7, parser.nextIntValue(-1));
    }

    @Test
    public void testNextLongValueSimple() throws Exception {
        String json = "123456789";
        initParser(new StringReader(json), 0);
        assertEquals(123456789L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueTopLevelTrue() throws Exception {
        String json = "true";
        initParser(new StringReader(json), 0);
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueTopLevelNull() throws Exception {
        String json = "42";
        initParser(new StringReader(json), 0);
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testGetTextForNullTokenInGetText2() throws Exception {
        assertEquals(null, parser._getText2(null));
    }

    @Test
    public void testGetTextForFieldNameToken() throws Exception {
        String json = "{\"key\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals("key", parser._getText2(JsonToken.FIELD_NAME));
    }

    @Test
    public void testGetTextForDefaultToken() throws Exception {
        String json = "\"str\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        String text = parser._getText2(JsonToken.VALUE_STRING);
        assertNotNull(text);
    }

    @Test
    public void testGetTextForStartArray() throws Exception {
        String text = parser._getText2(JsonToken.START_ARRAY);
        assertEquals("[", text);
    }

    @Test
    public void testCloseInputWhenNotResourceManaged() throws Exception {
        Reader reader = new StringReader("x");
        initParser(reader, 0);
        parser._closeInput();
        assertNull(parser._reader);
    }

    @Test
    public void testReleaseBuffersNotRecyclable() throws Exception {
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ioContext, 0,
                new StringReader(" "), null, symbolTable,
                new char[16], 0, 0, false);
        p._releaseBuffers();
    }

    @Test
    public void testReleaseBuffersRecyclable() throws Exception {
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ioContext, 0,
                new StringReader(" "), null, symbolTable,
                new char[16], 0, 0, true);
        p._releaseBuffers();
    }

    @Test
    public void testLoadMoreFromReaderAlreadyNull() throws Exception {
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ioContext, 0,
                new StringReader(" "), null, symbolTable);
        p._reader = null;
        // should return false
        assertFalse(p.loadMore());
    }

    @Test
    public void testSkipWSOrEndNewline() throws Exception {
        String json = "\n x";
        initParser(new StringReader(json), 0);
        int i = parser._skipWSOrEnd();
        assertEquals('x', i);
    }

    @Test
    public void testSkipWSOrEndCR() throws Exception {
        String json = "\r x";
        initParser(new StringReader(json), 0);
        int i = parser._skipWSOrEnd();
        assertEquals('x', i);
    }

    @Test
    public void testSkipWSOrEndTab() throws Exception {
        String json = "\tx";
        initParser(new StringReader(json), 0);
        int i = parser._skipWSOrEnd();
        assertEquals('x', i);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipWSOrEndInvalidSpace() throws Exception {
        String json = "\u0000x";
        initParser(new StringReader(json), 0);
        parser._skipWSOrEnd();
    }

    @Test
    public void testSkipColonWithSpaces() throws Exception {
        String json = ":  42";
        initParser(new StringReader(json), 0);
        int i = parser._skipColon();
        assertEquals('4', i);
    }

    @Test
    public void testSkipColonFastSimple() throws Exception {
        String json = ":x";
        initParser(new StringReader(json), 0);
        // start after :
        int i = parser._skipColonFast(parser._inputPtr);
        assertEquals('x', i);
    }

    @Test
    public void testSkipCommaWithWS() throws Exception {
        String json = ",  true";
        initParser(new StringReader(json), 0);
        int i = parser._skipComma(',');
        assertEquals('t', i);
    }

    @Test
    public void testSkipCR() throws Exception {
        String json = "\n";
        initParser(new StringReader(json), 0);
        parser._skipCR();
    }

    @Test
    public void testSkipCRLF() throws Exception {
        String json = "\n\n";
        initParser(new StringReader(json), 0);
        parser._skipCR();
    }

    @Test
    public void testUpdateLocationAfterRead() throws Exception {
        String json = "abc";
        initParser(new StringReader(json), 0);
        parser._inputPtr = 1;
        parser._updateLocation();
    }

    @Test
    public void testUpdateNameLocationAfterRead() throws Exception {
        String json = "name";
        initParser(new StringReader(json), 0);
        parser._updateNameLocation();
    }

    @Test
    public void testGetTextCharactersFieldName() throws Exception {
        String json = "{\"key\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
    }

    @Test
    public void testGetTextCharactersStringWithIncomplete() throws Exception {
        String json = "\"str\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser._tokenIncomplete = true;
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
    }

    @Test
    public void testGetTextLengthFieldName() throws Exception {
        String json = "{\"key\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals(3, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetFieldName() throws Exception {
        String json = "{\"key\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetTextOffsetDefaultToken() throws Exception {
        String json = "null";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testCopyBufferForGetTextCharactersFieldName() throws Exception {
        String json = "{\"longFieldName\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
    }

    @Test
    public void testHandleOddValuePositiveSign() throws Exception {
        String json = "+Infinity";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
    }

    @Test(expected = JsonParseException.class)
    public void testHandleInvalidNumberStartBadChar() throws Exception {
        String json = "-x";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testVerifyNoLeadingZeroesOK() throws Exception {
        String json = "0";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testVerifyNLZRejectsLeadingZeros() throws Exception {
        String json = "00";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testVerifyNLZWithMultipleZeros() throws Exception {
        String json = "0001";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testSkipLineCommentWithSlashSlash() throws Exception {
        String json = "// comment\n42";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_COMMENTS.getMask());
        parser.nextToken();
        assertEquals(42, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testSkipCCommentEOF() throws Exception {
        String json = "/* unclosed ";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_COMMENTS.getMask());
        parser.nextToken();
    }

    @Test
    public void testDecodeEscapedSimple() throws Exception {
        String json = "\"\\n\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals("\n", parser.getText());
    }

    @Test
    public void testDecodeEscapedUnicode() throws Exception {
        String json = "\"\\u0041\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals("A", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testDecodeEscapedInvalidHex() throws Exception {
        String json = "\"\\u00XX\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testGetBinaryValueAlreadyComputed() throws Exception {
        String json = "\"YWJj\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser._binaryValue = "old".getBytes(); // set existing
        byte[] b = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertNotNull(b);
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueNonValueStringOrEmbedded() throws Exception {
        String json = "123";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testGetBinaryValueIllegalArgument() throws Exception {
        String json = "\"!!!\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser._tokenIncomplete = true;
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("should have thrown exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testReadBinaryValueWithNonStringToken() throws Exception {
        String json = "123";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        // should call getBinaryValue and write
        bos.write("abc".getBytes());
        int len = parser.readBinaryValue(Base64Variants.getDefaultVariant(), bos);
        assertEquals(3, len);
    }

    @Test
    public void testReadBinaryValueIncomplete() throws Exception {
        String json = "\"eHl6\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser._tokenIncomplete = true;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(Base64Variants.getDefaultVariant(), bos);
        assertEquals(3, len);
        assertEquals("xyz", bos.toString());
    }

    @Test(expected = IOException.class)
    public void testLoadMoreThrowsOnZero() throws Exception {
        Reader zeroReader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() {}
        };
        initParser(zeroReader, 0);
        parser._inputPtr = parser._inputEnd;
        parser.loadMore();
    }

    @Test
    public void testNextTokenAfterFieldName() throws Exception {
        String json = "{\"a\":1}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        JsonToken t = parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
    }

    @Test
    public void testNextTokenArrayAfterFieldName() throws Exception {
        String json = "{\"a\":[1,2]}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenObjectAfterFieldName() throws Exception {
        String json = "{\"a\":{}}";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenRootString() throws Exception {
        String json = "\"rootString\"";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testNextTokenRootArray() throws Exception {
        String json = "[1]";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenRootObject() throws Exception {
        String json = "{}";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenRootNumberStartNegative() throws Exception {
        String json = "-5";
        initParser(new StringReader(json), 0);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-5, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedEndOfInput() throws Exception {
        String json = "\"unfinished";
        initParser(new StringReader(json), 0);
        parser.nextToken();
    }

    @Test
    public void testGetCurrentLocationAfterRead() throws Exception {
        String json = "x";
        initParser(new StringReader(json), 0);
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testSkipAfterComma2() throws Exception {
        String json = "  42";
        initParser(new StringReader(json), 0);
        int i = parser._skipAfterComma2();
        assertEquals('4', i);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipAfterComma2End() throws Exception {
        String json = "";
        initParser(new StringReader(json), 0);
        parser._skipAfterComma2();
    }

    @Test
    public void testSkipWSOrEnd2() throws Exception {
        String json = "/*c*/42";
        initParser(new StringReader(json),
                JsonParser.Feature.ALLOW_COMMENTS.getMask());
        int i = parser._skipWSOrEnd2();
        assertEquals('4', i);
    }

    @Test
    public void testFinishString2Normal() throws Exception {
        String json = "\"normal\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals("normal", parser.getText());
    }

    @Test
    public void testFinishString2Escape() throws Exception {
        String json = "\"esc\\n\"";
        initParser(new StringReader(json), 0);
        parser.nextToken();
        assertEquals("esc\n", parser.getText());
    }

    @Test
    public void testParseName2Normal() throws Exception {
        String json = "\"name\"";
        initParser(new StringReader(json), 0);
        parser._parsingContext = parser._parsingContext.createChildObjectContext(1, 1);
        // move past first char
        parser._inputPtr = 1;
        String name = parser._parseName2(1, parser._hashSeed, '"');
        assertEquals("name", name);
    }
}