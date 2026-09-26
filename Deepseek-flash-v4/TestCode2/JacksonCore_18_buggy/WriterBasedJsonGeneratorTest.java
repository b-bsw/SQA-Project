package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.*;

public class WriterBasedJsonGeneratorTest {
    private IOContext ctxt;
    private Writer writer;
    private WriterBasedJsonGenerator gen;

    @Before
    public void setUp() throws Exception {
        JsonFactory factory = new JsonFactory();
        ctxt = new IOContext(IOContext.allocBufferRecycler(), null, false);
        writer = new StringWriter();
        gen = new WriterBasedJsonGenerator(ctxt, 0, null, writer);
    }

    @Test
    public void testGetOutputTarget() {
        assertSame(writer, gen.getOutputTarget());
    }

    @Test
    public void testGetOutputBufferedInitiallyZero() {
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testWriteFieldNameSimple() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("abc");
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"abc\"}", writer.toString());
    }

    @Test
    public void testWriteFieldNameWithCommaBefore() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1);
        gen.writeFieldName("b");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"a\":1,\"b\":2}", writer.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldNameOutsideObject() throws IOException {
        gen.writeFieldName("x");
    }

    @Test
    public void testWriteStartEndArray() throws IOException {
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[]", writer.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArrayWithoutStart() throws IOException {
        gen.writeEndArray();
    }

    @Test
    public void testWriteStartEndObject() throws IOException {
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        assertEquals("{}", writer.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObjectWithoutStart() throws IOException {
        gen.writeEndObject();
    }

    @Test
    public void testWriteStringNull() throws IOException {
        gen.writeString((String) null);
        gen.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testWriteStringEmpty() throws IOException {
        gen.writeString("");
        gen.flush();
        assertEquals("\"\"", writer.toString());
    }

    @Test
    public void testWriteStringNormal() throws IOException {
        gen.writeString("hello");
        gen.flush();
        assertEquals("\"hello\"", writer.toString());
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        gen.writeString("world".toCharArray(), 0, 5);
        gen.flush();
        assertEquals("\"world\"", writer.toString());
    }

    @Test
    public void testWriteStringSerializableString() throws IOException {
        gen.writeString(new SerializableStringImpl("test"));
        gen.flush();
        assertEquals("\"test\"", writer.toString());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteUnsupportedRawUTF8String() throws IOException {
        gen.writeRawUTF8String(new byte[]{65}, 0, 1);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteUnsupportedUTF8String() throws IOException {
        gen.writeUTF8String(new byte[]{65}, 0, 1);
    }

    @Test
    public void testWriteRawString() throws IOException {
        gen.writeRaw("raw data");
        gen.flush();
        assertEquals("raw data", writer.toString());
    }

    @Test
    public void testWriteRawSubstring() throws IOException {
        gen.writeRaw("hello world", 6, 5);
        gen.flush();
        assertEquals("world", writer.toString());
    }

    @Test
    public void testWriteRawChar() throws IOException {
        gen.writeRaw('X');
        gen.flush();
        assertEquals("X", writer.toString());
    }

    @Test
    public void testWriteNumberShort() throws IOException {
        gen.writeNumber((short) 42);
        gen.flush();
        assertEquals("42", writer.toString());
    }

    @Test
    public void testWriteNumberInt() throws IOException {
        gen.writeNumber(123);
        gen.flush();
        assertEquals("123", writer.toString());
    }

    @Test
    public void testWriteNumberLong() throws IOException {
        gen.writeNumber(1234567890123L);
        gen.flush();
        assertEquals("1234567890123", writer.toString());
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        gen.writeNumber((BigInteger) null);
        gen.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testWriteNumberBigInteger() throws IOException {
        gen.writeNumber(new BigInteger("9999999999999999999999999999"));
        gen.flush();
        assertEquals("9999999999999999999999999999", writer.toString());
    }

    @Test
    public void testWriteNumberDoubleNormal() throws IOException {
        gen.writeNumber(3.14);
        gen.flush();
        assertTrue(writer.toString().contains("3.14"));
    }

    @Test
    public void testWriteNumberFloatNormal() throws IOException {
        gen.writeNumber(2.5f);
        gen.flush();
        assertTrue(writer.toString().contains("2.5"));
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        gen.writeNumber((BigDecimal) null);
        gen.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testWriteNumberBigDecimal() throws IOException {
        gen.writeNumber(new BigDecimal("123.456"));
        gen.flush();
        assertEquals("123.456", writer.toString());
    }

    @Test
    public void testWriteNumberEncodedValue() throws IOException {
        gen.writeNumber("99.99");
        gen.flush();
        assertEquals("99.99", writer.toString());
    }

    @Test
    public void testWriteBooleanTrue() throws IOException {
        gen.writeBoolean(true);
        gen.flush();
        assertEquals("true", writer.toString());
    }

    @Test
    public void testWriteBooleanFalse() throws IOException {
        gen.writeBoolean(false);
        gen.flush();
        assertEquals("false", writer.toString());
    }

    @Test
    public void testWriteNull() throws IOException {
        gen.writeNull();
        gen.flush();
        assertEquals("null", writer.toString());
    }

    @Test
    public void testFlush() throws IOException {
        gen.writeNumber(1);
        gen.flush();
        String result = writer.toString();
        assertTrue(result.contains("1"));
    }

    @Test
    public void testCloseWithAutoCloseContent() throws IOException {
        gen.writeStartArray();
        gen.close();
        String result = writer.toString();
        assertEquals("[]", result);
    }

    @Test
    public void testWriteFieldNameSerializableString() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName(new SerializableStringImpl("key"));
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"key\":1}", writer.toString());
    }

    private static class SerializableStringImpl implements SerializableString {
        private final String value;
        public SerializableStringImpl(String v) { this.value = v; }
        @Override public String getValue() { return value; }
        @Override public int length() { return value.length(); }
        @Override public char[] asQuotedChars() { return value.toCharArray(); }
        @Override public byte[] asUnquotedUTF8() { return value.getBytes(); }
        @Override public byte[] asQuotedUTF8() { return value.getBytes(); }
        @Override public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
        @Override public int appendQuoted(char[] buffer, int offset) { return 0; }
        @Override public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
        @Override public int appendUnquoted(char[] buffer, int offset) { return 0; }
        @Override public int putQuotedUTF8(OutputStream out) throws IOException { return 0; }
        @Override public int putUnquotedUTF8(OutputStream out) throws IOException { return 0; }
    }
}