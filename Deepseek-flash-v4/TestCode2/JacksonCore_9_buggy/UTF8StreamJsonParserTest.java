package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;
import com.fasterxml.jackson.core.*;

public class UTF8StreamJsonParserTest {

    private IOContext ioCtx;
    private ByteQuadsCanonicalizer symbols;
    private JsonFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new JsonFactory();
        ioCtx = new IOContext(JsonFactory.Feature.collectDefaults(), null, null, null, null, 0);
        symbols = ByteQuadsCanonicalizer.createRoot();
    }

    private UTF8StreamJsonParser createParser(byte[] data) throws IOException {
        InputStream in = new ByteArrayInputStream(data);
        return new UTF8StreamJsonParser(ioCtx, 0, in, null, symbols, data, 0, data.length, false);
    }

    @Test
    public void testGetInputSource() throws Exception {
        byte[] data = "{}".getBytes("UTF-8");
        InputStream in = new ByteArrayInputStream(data);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioCtx, 0, in, null, symbols, data, 0, data.length, false);
        assertNotNull(parser.getInputSource());
        assertTrue(parser.getInputSource() instanceof InputStream);
    }

    @Test
    public void testReleaseBufferedZero() throws Exception {
        byte[] data = "{}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(0, parser.releaseBuffered(new ByteArrayOutputStream()));
    }

    @Test
    public void testReleaseBufferedNonZero() throws Exception {
        byte[] data = "{}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(bos);
        assertTrue(released > 0);
        assertTrue(bos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testLoadMoreInputStreamReturnsZero() throws Exception {
        InputStream in = new InputStream() {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public int read() throws IOException {
                return -1;
            }
        };
        byte[] buf = new byte[16];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioCtx, 0, in, null, symbols, buf, 0, 0, false);
        parser.getText();
    }

    @Test
    public void testLoadMoreEof() throws Exception {
        byte[] data = "   ".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetTextNullToken() throws Exception {
        byte[] data = "".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertNull(parser.getText());
    }

    @Test
    public void testGetTextValueString() throws Exception {
        byte[] data = "\"hello\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextValueStringIncomplete() throws Exception {
        byte[] data = "\"hello\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertFalse(parser._tokenIncomplete);
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetValueAsStringNullToken() throws Exception {
        byte[] data = "".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(null, parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringStringToken() throws Exception {
        byte[] data = "\"world\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertEquals("world", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringDefault() throws Exception {
        byte[] data = "true".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsIntNumberInt() throws Exception {
        byte[] data = "123".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertEquals(123, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntNonNumber() throws Exception {
        byte[] data = "\"abc\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntWithDefault() throws Exception {
        byte[] data = "null".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertEquals(99, parser.getValueAsInt(99));
    }

    @Test
    public void testGetTextCharactersFieldName() throws Exception {
        byte[] data = "{\"name\":\"value\"}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals("name", new String(chars, 0, parser.getTextLength()));
    }

    @Test
    public void testGetTextCharactersString() throws Exception {
        byte[] data = "\"test\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
    }

    @Test
    public void testGetTextCharactersNullToken() throws Exception {
        byte[] data = "".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthNull() throws Exception {
        byte[] data = "".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthFieldName() throws Exception {
        byte[] data = "{\"key\":1}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        parser.nextToken();
        assertTrue(parser.getTextLength() > 0);
    }

    @Test
    public void testGetTextOffsetNull() throws Exception {
        byte[] data = "".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testNextTokenSimpleObject() throws Exception {
        byte[] data = "{\"a\":1}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenSimpleArray() throws Exception {
        byte[] data = "[1,2]".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenFalse() throws Exception {
        byte[] data = "false".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenTrue() throws Exception {
        byte[] data = "true".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenNull() throws Exception {
        byte[] data = "null".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenNumberFloat() throws Exception {
        byte[] data = "3.14".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
    }

    @Test
    public void testNextTokenNegativeNumber() throws Exception {
        byte[] data = "-42".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-42, parser.getIntValue());
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenInvalidToken() throws Exception {
        byte[] data = "xyz".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
    }

    @Test
    public void testNextFieldNameMatches() throws Exception {
        byte[] data = "{\"field\":1}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertTrue(parser.nextFieldName(new SerializableString() {
            public String getValue() { return "field"; }
            public int charLength() { return 5; }
            public char[] asQuotedChars() { return getValue().toCharArray(); }
            public byte[] asUnquotedUTF8() { return getValue().getBytes(); }
            public byte[] asQuotedUTF8() { return getValue().getBytes(); }
            public int appendQuotedUTF8(byte[] b, int offset) { return 0; }
            public int appendQuoted(char[] b, int offset) { return 0; }
            public int appendUnquotedUTF8(byte[] b, int offset) { return 0; }
            public int appendUnquoted(char[] b, int offset) { return 0; }
            public int putQuotedUTF8(OutputStream s) throws IOException { return 0; }
            public int putUnquotedUTF8(OutputStream s) throws IOException { return 0; }
            public int appendQuoted(byte[] b, int offset) { return 0; }
        }));
    }

    @Test
    public void testNextFieldNameNoMatch() throws Exception {
        byte[] data = "{\"other\":1}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertFalse(parser.nextFieldName(new SerializableString() {
            public String getValue() { return "field"; }
            public int charLength() { return 5; }
            public char[] asQuotedChars() { return getValue().toCharArray(); }
            public byte[] asUnquotedUTF8() { return getValue().getBytes(); }
            public byte[] asQuotedUTF8() { return getValue().getBytes(); }
            public int appendQuotedUTF8(byte[] b, int offset) { return 0; }
            public int appendQuoted(char[] b, int offset) { return 0; }
            public int appendUnquotedUTF8(byte[] b, int offset) { return 0; }
            public int appendUnquoted(char[] b, int offset) { return 0; }
            public int putQuotedUTF8(OutputStream s) throws IOException { return 0; }
            public int putUnquotedUTF8(OutputStream s) throws IOException { return 0; }
            public int appendQuoted(byte[] b, int offset) { return 0; }
        }));
    }

    @Test
    public void testNextFieldNameReturnsNull() throws Exception {
        byte[] data = "[1]".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextTextValueString() throws Exception {
        byte[] data = "\"hello\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals("hello", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueNonString() throws Exception {
        byte[] data = "123".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValueDefault() throws Exception {
        byte[] data = "\"abc\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(99, parser.nextIntValue(99));
    }

    @Test
    public void testNextIntValueInt() throws Exception {
        byte[] data = "42".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(42, parser.nextIntValue(0));
    }

    @Test
    public void testNextLongValueDefault() throws Exception {
        byte[] data = "true".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(100L, parser.nextLongValue(100L));
    }

    @Test
    public void testNextLongValueLong() throws Exception {
        byte[] data = "77".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(77L, parser.nextLongValue(0L));
    }

    @Test
    public void testNextBooleanValueTrue() throws Exception {
        byte[] data = "true".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalse() throws Exception {
        byte[] data = "false".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNonBoolean() throws Exception {
        byte[] data = "null".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testGetBinaryValueBase64() throws Exception {
        byte[] data = "\"SGVsbG8=\"".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        byte[] binary = parser.getBinaryValue(Base64Variants.MIME);
        assertNotNull(binary);
        assertTrue(binary.length > 0);
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueNonString() throws Exception {
        byte[] data = "123".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.MIME);
    }

    @Test
    public void testReleaseBuffers() throws Exception {
        byte[] data = "{}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createParser(data);
        parser.nextToken();
        parser._releaseBuffers();
    }

    @Test
    public void testGrowArrayByNull() {
        int[] result = UTF8StreamJsonParser.growArrayBy(null, 10);
        assertEquals(10, result.length);
    }

    @Test
    public void testGrowArrayByExisting() {
        int[] arr = new int[5];
        int[] result = UTF8StreamJsonParser.growArrayBy(arr, 3);
        assertEquals(8, result.length);
    }
}