package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8JsonGeneratorTest {

    private ByteArrayOutputStream outputStream;
    private IOContext ctxt;
    private UTF8JsonGenerator gen;

    @Before
    public void setUp() throws Exception {
        outputStream = new ByteArrayOutputStream();
        BufferRecycler br = new BufferRecycler();
        ctxt = new IOContext(br, null, false);
        JsonFactory factory = new JsonFactory();
        gen = new UTF8JsonGenerator(ctxt, 0, null, outputStream);
    }

    @After
    public void tearDown() throws Exception {
        if (gen != null) {
            gen.close();
        }
    }

    @Test
    public void testWriteStartArrayEndArray() throws IOException {
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("[]", output);
    }

    @Test
    public void testWriteStartObjectEndObject() throws IOException {
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("{}", output);
    }

    @Test
    public void testWriteFieldNameString() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("foo");
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("{\"foo\":1}", output);
    }

    @Test
    public void testWriteFieldNameSerializableString() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName((SerializableString) new SerializableString() {
            @Override
            public String getValue() {
                return "bar";
            }
            @Override
            public int charLength() {
                return 3;
            }
            @Override
            public char[] asQuotedChars() {
                return "\"bar\"".toCharArray();
            }
            @Override
            public byte[] asUnquotedUTF8() {
                return "bar".getBytes();
            }
            @Override
            public byte[] asQuotedUTF8() {
                return "\"bar\"".getBytes();
            }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) {
                byte[] quoted = asQuotedUTF8();
                System.arraycopy(quoted, 0, buffer, offset, quoted.length);
                return quoted.length;
            }
            @Override
            public int appendQuoted(char[] buffer, int offset) {
                char[] quoted = asQuotedChars();
                System.arraycopy(quoted, 0, buffer, offset, quoted.length);
                return quoted.length;
            }
        });
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("{\"bar\":2}", output);
    }

    @Test
    public void testWriteStringNull() throws IOException {
        gen.writeString((String) null);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("null", output);
    }

    @Test
    public void testWriteStringEmpty() throws IOException {
        gen.writeString("");
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("\"\"", output);
    }

    @Test
    public void testWriteStringNormal() throws IOException {
        gen.writeString("hello");
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("\"hello\"", output);
    }

    @Test
    public void testWriteStringWithSpecialChars() throws IOException {
        gen.writeString("line1\nline2");
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertTrue(output.contains("\\n"));
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        gen.writeString(new char[] {'a', 'b', 'c'}, 0, 3);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("\"abc\"", output);
    }

    @Test
    public void testWriteStringSerializableString() throws IOException {
        gen.writeString((SerializableString) new SerializableString() {
            @Override
            public String getValue() {
                return "test";
            }
            @Override
            public int charLength() {
                return 4;
            }
            @Override
            public char[] asQuotedChars() {
                return "\"test\"".toCharArray();
            }
            @Override
            public byte[] asUnquotedUTF8() {
                return "test".getBytes();
            }
            @Override
            public byte[] asQuotedUTF8() {
                return "\"test\"".getBytes();
            }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) {
                byte[] quoted = asQuotedUTF8();
                System.arraycopy(quoted, 0, buffer, offset, quoted.length);
                return quoted.length;
            }
            @Override
            public int appendQuoted(char[] buffer, int offset) {
                char[] quoted = asQuotedChars();
                System.arraycopy(quoted, 0, buffer, offset, quoted.length);
                return quoted.length;
            }
        });
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("\"test\"", output);
    }

    @Test
    public void testWriteNumberInt() throws IOException {
        gen.writeNumber(42);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("42", output);
    }

    @Test
    public void testWriteNumberLong() throws IOException {
        gen.writeNumber(1234567890123L);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("1234567890123", output);
    }

    @Test
    public void testWriteNumberDouble() throws IOException {
        gen.writeNumber(3.14);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("3.14", output);
    }

    @Test
    public void testWriteNumberFloat() throws IOException {
        gen.writeNumber(2.5f);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("2.5", output);
    }

    @Test
    public void testWriteNumberBigDecimal() throws IOException {
        gen.writeNumber(new BigDecimal("12345.6789"));
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("12345.6789", output);
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        gen.writeNumber((BigDecimal) null);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("null", output);
    }

    @Test
    public void testWriteNumberBigInteger() throws IOException {
        gen.writeNumber(new BigInteger("12345678901234567890"));
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("12345678901234567890", output);
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        gen.writeNumber((BigInteger) null);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("null", output);
    }

    @Test
    public void testWriteNumberString() throws IOException {
        gen.writeNumber("123");
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("123", output);
    }

    @Test
    public void testWriteBooleanTrue() throws IOException {
        gen.writeBoolean(true);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("true", output);
    }

    @Test
    public void testWriteBooleanFalse() throws IOException {
        gen.writeBoolean(false);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("false", output);
    }

    @Test
    public void testWriteNull() throws IOException {
        gen.writeNull();
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("null", output);
    }

    @Test(expected = IOException.class)
    public void testWriteFieldNameExpectingValue() throws IOException {
        gen.writeStartArray();
        gen.writeFieldName("foo");
    }

    @Test
    public void testWriteRawString() throws IOException {
        gen.writeRaw("raw text");
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("raw text", output);
    }

    @Test
    public void testWriteRawCharArray() throws IOException {
        gen.writeRaw(new char[] {'r', 'a', 'w'}, 0, 3);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("raw", output);
    }

    @Test
    public void testWriteRawChar() throws IOException {
        gen.writeRaw('X');
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("X", output);
    }

    @Test
    public void testWriteRawSerializableString() throws IOException {
        gen.writeRaw((SerializableString) new SerializableString() {
            @Override
            public String getValue() {
                return "raw";
            }
            @Override
            public int charLength() {
                return 3;
            }
            @Override
            public char[] asQuotedChars() {
                return "raw".toCharArray();
            }
            @Override
            public byte[] asUnquotedUTF8() {
                return "raw".getBytes();
            }
            @Override
            public byte[] asQuotedUTF8() {
                return "raw".getBytes();
            }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) {
                byte[] raw = asUnquotedUTF8();
                System.arraycopy(raw, 0, buffer, offset, raw.length);
                return raw.length;
            }
            @Override
            public int appendQuoted(char[] buffer, int offset) {
                char[] raw = asQuotedChars();
                System.arraycopy(raw, 0, buffer, offset, raw.length);
                return raw.length;
            }
        });
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("raw", output);
    }

    @Test
    public void testWriteRawValueSerializableString() throws IOException {
        gen.writeRawValue((SerializableString) new SerializableString() {
            @Override
            public String getValue() {
                return "value";
            }
            @Override
            public int charLength() {
                return 5;
            }
            @Override
            public char[] asQuotedChars() {
                return "value".toCharArray();
            }
            @Override
            public byte[] asUnquotedUTF8() {
                return "value".getBytes();
            }
            @Override
            public byte[] asQuotedUTF8() {
                return "value".getBytes();
            }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) {
                byte[] raw = asUnquotedUTF8();
                System.arraycopy(raw, 0, buffer, offset, raw.length);
                return raw.length;
            }
            @Override
            public int appendQuoted(char[] buffer, int offset) {
                char[] raw = asQuotedChars();
                System.arraycopy(raw, 0, buffer, offset, raw.length);
                return raw.length;
            }
        });
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertEquals("value", output);
    }

    @Test
    public void testGetOutputTarget() {
        assertSame(outputStream, gen.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered() throws IOException {
        assertEquals(0, gen.getOutputBuffered());
        gen.writeStartArray();
        assertTrue(gen.getOutputBuffered() > 0);
    }

    @Test
    public void testFlush() throws IOException {
        gen.writeString("test");
        gen.flush();
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testClose() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1);
        gen.close();
        String output = outputStream.toString("UTF-8");
        assertEquals("{\"a\":1}", output);
        assertNull(gen.getOutputTarget());
    }

    @Test
    public void testWriteBinary() throws IOException {
        byte[] data = new byte[] {1, 2, 3};
        gen.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        gen.flush();
        String output = outputStream.toString("UTF-8");
        assertTrue(output.startsWith("\"") && output.endsWith("\""));
        assertEquals(4, output.length()); // Base64 for 3 bytes is 4 chars
    }

    @Test(expected = IOException.class)
    public void testWriteValueInObjectExpectFieldName() throws IOException {
        gen.writeStartObject();
        gen.writeString("value");
    }
}