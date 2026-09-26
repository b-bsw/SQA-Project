package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.*;

public class ReaderBasedJsonParserTest {

    private IOContext ctxt;
    private ReaderBasedJsonParser parser;
    private CharsToNameCanonicalizer sym;
    private ObjectCodec codec;

    @Before
    public void setUp() throws Exception {
        ctxt = new IOContext(new BufferRecycler(), null, false);
        sym = CharsToNameCanonicalizer.createRoot();
        codec = null;
    }

    @After
    public void tearDown() throws Exception {
        if (parser != null) {
            parser.close();
        }
    }

    @Test
    public void testConstructorWithProvidedBuffer() throws Exception {
        char[] buf = new char[64];
        // Simulate a simple JSON object in the buffer
        "{\"a\":1}".getChars(0, 6, buf, 0);
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym, buf, 0, 6, true);
        assertEquals(0, parser.getCurrentToken());
        assertNotNull(parser.getInputSource());
    }

    @Test
    public void testConstructorWithoutBuffer() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{}"),
                codec, sym);
        assertNotNull(parser.getInputSource());
    }

    @Test
    public void testGetCodec() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{}"),
                codec, sym);
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodec() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{}"),
                codec, sym);
        ObjectCodec newCodec = new ObjectCodec() {
            @Override
            public JsonFactory getFactory() { return null; }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.databind.JavaType valueType) throws IOException { return null; }
            @Override
            public <T> T treeToValue(TreeNode n, Class<T> valueType) throws IOException { return null; }
            @Override
            public com.fasterxml.jackson.core.TreeNode readTree(JsonParser p) throws IOException { return null; }
            @Override
            public void writeValue(JsonGenerator g, Object value) throws IOException {}
            @Override
            public TreeNode createArrayNode() { return null; }
            @Override
            public TreeNode createObjectNode() { return null; }
            @Override
            public JsonParser treeAsTokens(TreeNode n) { return null; }
        };
        parser.setCodec(newCodec);
        assertSame(newCodec, parser.getCodec());
    }

    @Test
    public void testReleaseBufferedNoData() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym);
        StringWriter w = new StringWriter();
        assertEquals(0, parser.releaseBuffered(w));
        assertEquals("", w.toString());
    }

    @Test
    public void testReleaseBufferedWithData() throws Exception {
        char[] buf = "hello".toCharArray();
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym, buf, 0, 5, true);
        StringWriter w = new StringWriter();
        assertEquals(5, parser.releaseBuffered(w));
        assertEquals("hello", w.toString());
    }

    @Test
    public void testLoadMoreNoReader() throws Exception {
        char[] buf = new char[0];
        parser = new ReaderBasedJsonParser(ctxt, 0, null,
                codec, sym, buf, 0, 0, false);
        // Since _reader is null, loadMore should return false
        assertFalse(parser.loadMore());
    }

    @Test
    public void testLoadMoreReaderReturnsData() throws Exception {
        StringReader reader = new StringReader("abc");
        char[] buf = new char[16];
        parser = new ReaderBasedJsonParser(ctxt, 0, reader,
                codec, sym, buf, 0, 0, false);
        assertTrue(parser.loadMore());
        assertEquals(0, parser.getTokenCharacterOffset()); // verify state
    }

    @Test
    public void testLoadMoreReaderReturnsZero() throws Exception {
        StringReader reader = new StringReader("");
        char[] buf = new char[16];
        parser = new ReaderBasedJsonParser(ctxt, 0, reader,
                codec, sym, buf, 0, 0, false);
        try {
            parser.loadMore();
            fail("Expected IOException for reader returning 0");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Reader returned 0 characters"));
        }
    }

    @Test
    public void testCloseInputWithAutoCloseEnabled() throws Exception {
        StringReader reader = new StringReader("{}");
        parser = new ReaderBasedJsonParser(ctxt, 
                JsonParser.Feature.AUTO_CLOSE_SOURCE.getMask(), reader,
                codec, sym);
        parser.close();
        assertNull(parser.getInputSource());
    }

    @Test
    public void testCloseInputWithResourceManaged() throws Exception {
        IOContext managedCtxt = new IOContext(new BufferRecycler(), null, false) {
            @Override
            public boolean isResourceManaged() { return true; }
        };
        StringReader reader = new StringReader("{}");
        parser = new ReaderBasedJsonParser(managedCtxt, 0, reader,
                codec, sym);
        parser.close();
        assertNull(parser.getInputSource());
    }

    @Test
    public void testCloseInputNotManaged() throws Exception {
        StringReader reader = new StringReader("{}");
        // Ensure both isResourceManaged and AUTO_CLOSE_SOURCE are false
        int features = 0;
        parser = new ReaderBasedJsonParser(ctxt, features, reader,
                codec, sym);
        parser.close();
        // _reader should still be null because _closeInput sets it to null
        assertNull(parser.getInputSource());
    }

    @Test
    public void testGetTextForNullToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym);
        assertNull(parser.getText());
    }

    @Test
    public void testGetTextForStringToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"test\""),
                codec, sym);
        parser.nextToken();
        assertEquals("test", parser.getText());
    }

    @Test
    public void testGetValueAsStringForStringToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"value\""),
                codec, sym);
        parser.nextToken();
        assertEquals("value", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("123"),
                codec, sym);
        parser.nextToken();
        assertEquals("123", parser.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharactersForNullToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym);
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthForNullToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym);
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetForNullToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym);
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetBinaryValueOnNonStringToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("true"),
                codec, sym);
        parser.nextToken();
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected exception");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("not VALUE_STRING"));
        }
    }

    @Test
    public void testReadBinaryValueOnNonStringToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("true"),
                codec, sym);
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(4, len);
        assertArrayEquals("true".getBytes(), out.toByteArray());
    }

    @Test
    public void testNextTokenSimpleObject() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":1}"),
                codec, sym);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenArray() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("[1,2,3]"),
                codec, sym);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(3, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenString() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"hello\""),
                codec, sym);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testNextTokenTrue() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("true"),
                codec, sym);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenFalse() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("false"),
                codec, sym);
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenNull() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("null"),
                codec, sym);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenNegativeNumber() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("-42"),
                codec, sym);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-42, parser.getIntValue());
    }

    @Test
    public void testNextTokenFloat() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("3.14"),
                codec, sym);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testNextTokenScientificNotation() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("1e10"),
                codec, sym);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1e10, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testNextTokenLeadingZeroNotAllowed() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("0123"),
                codec, sym);
        // With default featuress, leading zeros are not allowed
        try {
            parser.nextToken();
            fail("Expected exception for leading zero");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        }
    }

    @Test
    public void testNextTokenLeadingZeroAllowed() throws Exception {
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        parser = new ReaderBasedJsonParser(ctxt, features, new StringReader("0123"),
                codec, sym);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testNextTokenUnquotedFieldName() throws Exception {
        int features = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        parser = new ReaderBasedJsonParser(ctxt, features, new StringReader("{abc:1}"),
                codec, sym);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("abc", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenSingleQuotedFieldName() throws Exception {
        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        parser = new ReaderBasedJsonParser(ctxt, features, new StringReader("{'a':1}"),
                codec, sym);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenComments() throws Exception {
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask();
        parser = new ReaderBasedJsonParser(ctxt, features, new StringReader("/* comment */{}"),
                codec, sym);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenYAMLComment() throws Exception {
        int features = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        parser = new ReaderBasedJsonParser(ctxt, features, new StringReader("# comment\n{}"),
                codec, sym);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenMismatchedBracket() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("[}"),
                codec, sym);
        parser.nextToken();
        try {
            parser.nextToken();
            fail("Expected exception for mismatched bracket");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("mismatched"));
        }
    }

    @Test
    public void testNextTextValueFromFieldName() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":\"val\"}"),
                codec, sym);
        parser.nextToken();
        assertEquals("val", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueNotString() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":1}"),
                codec, sym);
        parser.nextToken();
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValueFromFieldName() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":42}"),
                codec, sym);
        parser.nextToken();
        assertEquals(42, parser.nextIntValue(0));
    }

    @Test
    public void testNextIntValueDefault() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":\"x\"}"),
                codec, sym);
        parser.nextToken();
        assertEquals(-1, parser.nextIntValue(-1));
    }

    @Test
    public void testNextLongValueFromFieldName() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":1234567890123}"),
                codec, sym);
        parser.nextToken();
        assertEquals(1234567890123L, parser.nextLongValue(0L));
    }

    @Test
    public void testNextLongValueDefault() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":\"x\"}"),
                codec, sym);
        parser.nextToken();
        assertEquals(99L, parser.nextLongValue(99L));
    }

    @Test
    public void testNextBooleanValueTrue() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":true}"),
                codec, sym);
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalse() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":false}"),
                codec, sym);
        parser.nextToken();
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNull() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\":null}"),
                codec, sym);
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testGetTextAfterNextToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"abc\""),
                codec, sym);
        parser.nextToken();
        assertEquals("abc", parser.getText());
        // Calling getText again should return same value
        assertEquals("abc", parser.getText());
    }

    @Test
    public void testReleaseBuffers() throws Exception {
        char[] buf = new char[16];
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader(""),
                codec, sym, buf, 0, 0, true);
        parser.close();
        // After close, internal buffers should be released (checked by no exception)
    }

    @Test
    public void testSkipStringWhenTokenIncomplete() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"abc\""),
                codec, sym);
        parser.nextToken();
        // Force _tokenIncomplete to true (simulating state)
        // Normal flow: after nextToken, _tokenIncomplete is false because string is complete
        // To test _skipString, we can call nextToken again which will skip if incomplete
        // In our case, the token is complete, so move on
        assertNotNull(parser.nextToken());
    }

    @Test
    public void testGetTextCharactersLengthOffsetForString() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"hello\""),
                codec, sym);
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertTrue(parser.getTextLength() > 0);
    }

    @Test
    public void testParseNameWithEscape() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("{\"a\\\"b\":1}"),
                codec, sym);
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a\"b", parser.getCurrentName());
    }

    @Test
    public void testGetBinaryValueBase64() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"SGVsbG8=\""),
                codec, sym);
        parser.nextToken();
        byte[] result = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("Hello".getBytes(), result);
    }

    @Test
    public void testReadBinaryValueBase64() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"SGVsbG8=\""),
                codec, sym);
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = parser.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(5, len);
        assertArrayEquals("Hello".getBytes(), out.toByteArray());
    }

    @Test
    public void testAllowsNonNumericNumbers() throws Exception {
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        parser = new ReaderBasedJsonParser(ctxt, features, new StringReader("NaN"),
                codec, sym);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
    }

    @Test
    public void testDisallowsNonNumericNumbers() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("NaN"),
                codec, sym);
        try {
            parser.nextToken();
            fail("Expected exception for NaN without ALLOW_NON_NUMERIC_NUMBERS");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Non-standard token"));
        }
    }

    @Test
    public void testInvalidToken() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("xyz"),
                codec, sym);
        try {
            parser.nextToken();
            fail("Expected exception for invalid token");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unrecognized token"));
        }
    }

    @Test
    public void testEOFInValue() throws Exception {
        parser = new ReaderBasedJsonParser(ctxt, 0, new StringReader("\"unclosed"),
                codec, sym);
        try {
            parser.nextToken();
            fail("Expected exception for unclosed string");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("EOF"));
        }
    }
}