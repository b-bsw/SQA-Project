package com.fasterxml.jackson.core.json;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.*;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;

public class ReaderBasedJsonParserTest {
    private IOContext ctxt;
    private Reader reader;
    private CharsToNameCanonicalizer sym;
    private ReaderBasedJsonParser parser;
    private JsonFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new JsonFactory();
        ctxt = new IOContext(IOContext.builder().build(), null, false, false);
        sym = CharsToNameCanonicalizer.createRoot(17).makeChild(1);
    }

    @Test(expected = IOException.class)
    public void testReleaseBufferedZeroCount() throws IOException {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser.releaseBuffered(new StringWriter());
    }

    @Test
    public void testReleaseBufferedPositiveCount() throws IOException {
        String content = "hello";
        reader = new StringReader(content);
        char[] buf = new char[10];
        reader.read(buf);
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, buf, 0, 5, true);
        StringWriter w = new StringWriter();
        int result = parser.releaseBuffered(w);
        assertEquals(5, result);
        assertEquals("hello", w.toString());
    }

    @Test
    public void testGetInputSourceReturnsReader() {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testLoadMoreReturnsFalseWhenReaderNull() throws IOException {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser._reader.close();
        parser._reader = null;
        assertFalse(parser.loadMore());
    }

    @Test
    public void testLoadMoreReturnsTrueWhenDataAvailable() throws IOException {
        String data = "test";
        reader = new StringReader(data);
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[20], 0, 0, true);
        parser._inputEnd = 0;
        assertTrue(parser.loadMore());
        assertEquals(0, parser._inputPtr);
        assertEquals(4, parser._inputEnd);
    }

    @Test(expected = IOException.class)
    public void testGetNextCharWithEof() throws IOException {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser.getNextChar("EOF test");
    }

    @Test
    public void testGetNextCharReadsCorrectChar() throws IOException {
        reader = new StringReader("a");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        char c = parser.getNextChar("msg");
        assertEquals('a', c);
    }

    @Test
    public void testCloseInputClosesReader() throws Exception {
        reader = new StringReader("test");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser._closeInput();
        assertTrue(parser._reader == null || !reader.ready());
    }

    @Test
    public void testGetTextWhenTokenNull() throws IOException {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser.nextToken();
        assertNull(parser.getText());
    }

    @Test
    public void testGetValueAsStringWhenTokenString() throws IOException {
        reader = new StringReader("\"abc\"");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
        assertEquals("abc", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws IOException {
        reader = new StringReader("null");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
        assertEquals("mydefault", parser.getValueAsString("mydefault"));
    }

    @Test
    public void testGetTextCharactersReturnsNullWhenTokenNull() throws IOException {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser.nextToken();
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthReturnsZeroWhenTokenNull() throws IOException {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser.nextToken();
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetReturnsZeroWhenTokenNull() throws IOException {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueNonStringToken() throws IOException {
        reader = new StringReader("123");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testNextTokenReturnsEndArray() throws IOException {
        reader = new StringReader("[ ]");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenReturnsEndObject() throws IOException {
        reader = new StringReader("{ }");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenParsesString() throws IOException {
        reader = new StringReader("\"abc\"");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("abc", parser.getText());
    }

    @Test
    public void testNextTokenParsesNumber() throws IOException {
        reader = new StringReader("42");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testNextTokenParsesTrue() throws IOException {
        reader = new StringReader("true");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenParsesFalse() throws IOException {
        reader = new StringReader("false");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenParsesNull() throws IOException {
        reader = new StringReader("null");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextFieldNameReturnsNullInArray() throws IOException {
        reader = new StringReader("[1]");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameReturnsNameInObject() throws IOException {
        reader = new StringReader("{\"key\": 123}");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
        assertEquals("key", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTextValueReturnsString() throws IOException {
        reader = new StringReader("\"hello\"");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals("hello", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueReturnsNullForNonString() throws IOException {
        reader = new StringReader("123");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValueReturnsDefaultWhenNonInt() throws IOException {
        reader = new StringReader("\"abc\"");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(99, parser.nextIntValue(99));
    }

    @Test
    public void testNextLongValueReturnsDefaultWhenNonLong() throws IOException {
        reader = new StringReader("true");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(88L, parser.nextLongValue(88L));
    }

    @Test
    public void testNextBooleanValueReturnsNullWhenNonBoolean() throws IOException {
        reader = new StringReader("null");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testGetTokenLocation() throws IOException {
        reader = new StringReader(" 123");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() throws IOException {
        reader = new StringReader(" 123");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testParsePositiveNumberWithZero() throws IOException {
        reader = new StringReader("0");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testParseNegativeNumber() throws IOException {
        reader = new StringReader("-42");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-42, parser.getIntValue());
    }

    @Test
    public void testParseFloatNumber() throws IOException {
        reader = new StringReader("3.14");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
    }

    @Test
    public void testParseNameWithSimpleString() throws IOException {
        reader = new StringReader("{\"foo\": 1}");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("foo", parser.getCurrentName());
    }

    @Test(expected = JsonParseException.class)
    public void testHandleOddValueWithInvalidStart() throws IOException {
        reader = new StringReader("$invalid");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[100], 0, 0, true);
        parser.nextToken();
    }

    @Test
    public void testGetCodecReturnsSetCodec() {
        reader = new StringReader("");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, sym, new char[10], 0, 0, true);
        ObjectCodec codec = new ObjectMapper();
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }
}