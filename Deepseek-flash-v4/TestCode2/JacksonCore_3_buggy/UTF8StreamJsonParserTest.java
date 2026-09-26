package com.fasterxml.jackson.core.json;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

import java.io.*;

public class UTF8StreamJsonParserTest {

    private IOContext ioContext;
    private BytesToNameCanonicalizer symbolTable;
    private byte[] inputBuffer;
    private int start;
    private int end;
    private boolean bufferRecyclable;
    private InputStream inputStream;
    private ObjectCodec objectCodec;

    @Before
    public void setUp() {
        BufferRecycler br = new BufferRecycler();
        ioContext = new IOContext(br, null, false);
        symbolTable = BytesToNameCanonicalizer.createRoot();
        objectCodec = null;
        inputBuffer = new byte[1024];
        start = 0;
        end = 0;
        bufferRecyclable = false;
        inputStream = null;
    }

    @Test
    public void testConstructorAndGetCodec() {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        assertNotNull(parser);
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodec() {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        ObjectCodec codec = new ObjectCodec() {};
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testReleaseBufferedNoData() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(0, count);
    }

    @Test
    public void testReleaseBufferedWithData() throws IOException {
        byte[] data = new byte[] { (byte) 'a', (byte) 'b', (byte) 'c' };
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, data, 0, data.length, bufferRecyclable);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(3, count);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testGetInputSource() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, is, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        assertSame(is, parser.getInputSource());
    }

    @Test
    public void testLoadMoreNoStream() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, null, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        assertFalse(parser.loadMore());
    }

    @Test
    public void testLoadMoreWithStream() throws IOException {
        byte[] data = new byte[] { 1, 2, 3 };
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, 0, bufferRecyclable);
        assertTrue(parser.loadMore());
        assertEquals(0, parser._inputPtr);
        assertEquals(3, parser._inputEnd);
    }

    @Test
    public void testLoadMoreStreamReturnsZero() throws IOException {
        inputStream = new InputStream() {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return 0;
            }
        };
        inputBuffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, 0, bufferRecyclable);
        try {
            parser.loadMore();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("returned 0 characters"));
        }
    }

    @Test
    public void testLoadMoreStreamReturnsNegative() throws IOException {
        inputStream = new InputStream() {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return -1;
            }
        };
        inputBuffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, 0, bufferRecyclable);
        assertFalse(parser.loadMore());
    }

    @Test
    public void testLoadToHaveAtLeastNoStream() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, null, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        assertFalse(parser._loadToHaveAtLeast(5));
    }

    @Test
    public void testLoadToHaveAtLeastWithData() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 5, 5, bufferRecyclable);
        assertTrue(parser._loadToHaveAtLeast(3));
        assertEquals(0, parser._inputPtr);
        assertTrue(parser._inputEnd >= 3);
    }

    @Test
    public void testLoadToHaveAtLeastStreamReturnsZero() throws IOException {
        inputStream = new InputStream() {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return 0;
            }
        };
        inputBuffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, 0, bufferRecyclable);
        try {
            parser._loadToHaveAtLeast(5);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("returned 0 characters"));
        }
    }

    @Test
    public void testCloseInput() throws IOException {
        inputStream = new ByteArrayInputStream(new byte[0]);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        parser._closeInput();
        assertNull(parser._inputStream);
    }

    @Test
    public void testReleaseBuffers() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, true);
        parser._releaseBuffers();
        assertNull(parser._inputBuffer);
    }

    @Test
    public void testGetTextReturnsNullForNullToken() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        parser._currToken = null;
        String text = parser.getText();
        assertNull(text);
    }

    @Test
    public void testGetValueAsStringWithNullToken() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        parser._currToken = null;
        String result = parser.getValueAsString();
        assertNull(result);
    }

    @Test
    public void testGetValueAsStringWithDefault() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharactersReturnsNullForNullToken() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        parser._currToken = null;
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthReturnsZeroForNullToken() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        parser._currToken = null;
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetReturnsZeroForNullToken() throws IOException {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        parser._currToken = null;
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetTokenLocation() {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, start, end, bufferRecyclable);
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testNextTokenEndOfInput() throws IOException {
        inputBuffer = new byte[0];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, null, objectCodec, symbolTable, inputBuffer, 0, 0, bufferRecyclable);
        JsonToken token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextTokenSimpleObject() throws IOException {
        String json = "{\"key\":123}";
        byte[] data = json.getBytes("UTF-8");
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[data.length];
        System.arraycopy(data, 0, inputBuffer, 0, data.length);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, data.length, false);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextFieldNameReturnsFalseForNullCurrToken() throws IOException {
        byte[] data = new byte[0];
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[0];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, 0, bufferRecyclable);
        SerializableString str = new SerializableString() {
            @Override
            public String getValue() { return "dummy"; }
            @Override
            public int charLength() { return 5; }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[0]; }
            @Override
            public byte[] asQuotedUTF8() { return new byte[0]; }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendQuoted(char[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquoted(char[] buffer, int offset) { return 0; }
            @Override
            public int writeQuotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int writeUnquotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int putQuotedUTF8(ByteArrayBuilder out) { return 0; }
            @Override
            public int putUnquotedUTF8(ByteArrayBuilder out) { return 0; }

            @Override
            public int appendQuoted(byte[] buffer, int offset) {
                return 0;
            }

            @Override
            public int appendUnquoted(byte[] buffer, int offset) {
                return 0;
            }

            @Override
            public int writeQuoted(OutputStream out) throws IOException {
                return 0;
            }

            @Override
            public int writeUnquoted(OutputStream out) throws IOException {
                return 0;
            }

            @Override
            public int putQuoted(ByteArrayBuilder out) {
                return 0;
            }

            @Override
            public int putUnquoted(ByteArrayBuilder out) {
                return 0;
            }
        };
        assertFalse(parser.nextFieldName(str));
        assertNull(parser._currToken);
    }

    @Test
    public void testNextTextValueReturnsNullWhenNotString() throws IOException {
        String json = "null";
        byte[] data = json.getBytes("UTF-8");
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[data.length];
        System.arraycopy(data, 0, inputBuffer, 0, data.length);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, data.length, false);
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValueWithDefault() throws IOException {
        String json = "null";
        byte[] data = json.getBytes("UTF-8");
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[data.length];
        System.arraycopy(data, 0, inputBuffer, 0, data.length);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, data.length, false);
        assertEquals(42, parser.nextIntValue(42));
    }

    @Test
    public void testNextLongValueWithDefault() throws IOException {
        String json = "null";
        byte[] data = json.getBytes("UTF-8");
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[data.length];
        System.arraycopy(data, 0, inputBuffer, 0, data.length);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, data.length, false);
        assertEquals(99L, parser.nextLongValue(99L));
    }

    @Test
    public void testNextBooleanValueReturnsNullForNonBoolean() throws IOException {
        String json = "null";
        byte[] data = json.getBytes("UTF-8");
        inputStream = new ByteArrayInputStream(data);
        inputBuffer = new byte[data.length];
        System.arraycopy(data, 0, inputBuffer, 0, data.length);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ioContext, 0, inputStream, objectCodec, symbolTable, inputBuffer, 0, data.length, false);
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testGrowArrayByNull() {
        int[] result = UTF8StreamJsonParser.growArrayBy(null, 5);
        assertNotNull(result);
        assertEquals(5, result.length);
    }

    @Test
    public void testGrowArrayByExisting() {
        int[] arr = new int[] {1, 2, 3};
        int[] result = UTF8StreamJsonParser.growArrayBy(arr, 2);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }
}