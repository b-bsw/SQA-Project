package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.*;

public class UTF8JsonGeneratorTest {
    private ByteArrayOutputStream out;
    private IOContext ctxt;
    private JsonFactory factory;
    private UTF8JsonGenerator gen;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        factory = new JsonFactory();
        ctxt = new IOContext(IOContext.ALLOC_MEDIUM, null, false);
        gen = new UTF8JsonGenerator(ctxt, 
            JsonGenerator.Feature.collectDefaults(), 
            null, out);
    }

    @Test
    public void testWriteStartEndArray() throws IOException {
        gen.writeStartArray();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStartEndObject() throws IOException {
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        assertEquals("{}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringSimple() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("key");
        gen.writeString("value");
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"key\":\"value\"}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringNull() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("n");
        gen.writeString((String)null);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"n\":null}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBooleanTrue() throws IOException {
        gen.writeBoolean(true);
        gen.flush();
        assertEquals("true", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBooleanFalse() throws IOException {
        gen.writeBoolean(false);
        gen.flush();
        assertEquals("false", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNull() throws IOException {
        gen.writeNull();
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberInt() throws IOException {
        gen.writeNumber(42);
        gen.flush();
        assertEquals("42", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberNegativeInt() throws IOException {
        gen.writeNumber(-123);
        gen.flush();
        assertEquals("-123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberLong() throws IOException {
        gen.writeNumber(1234567890123L);
        gen.flush();
        assertEquals("1234567890123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberDouble() throws IOException {
        gen.writeNumber(3.14);
        gen.flush();
        assertTrue(out.toString("UTF-8").contains("3.14"));
    }

    @Test
    public void testWriteNumberFloatNaNQuoted() throws IOException {
        gen = new UTF8JsonGenerator(ctxt,
            JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.getMask(),
            null, out);
        gen.writeNumber(Float.NaN);
        gen.flush();
        assertEquals("\"NaN\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimal() throws IOException {
        gen.writeNumber(new BigDecimal("123.456"));
        gen.flush();
        assertEquals("123.456", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        gen.writeNumber((BigDecimal)null);
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigInteger() throws IOException {
        gen.writeNumber(new BigInteger("12345678901234567890"));
        gen.flush();
        assertEquals("12345678901234567890", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        gen.writeNumber((BigInteger)null);
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testWriteFieldNameMultiple() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeNumber(1);
        gen.writeFieldName("b");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"a\":1,\"b\":2}", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldNameExpectingValue() throws IOException {
        gen.writeStartArray();
        gen.writeFieldName("x");
    }

    @Test
    public void testWriteRawString() throws IOException {
        gen.writeRaw("raw data");
        gen.flush();
        assertEquals("raw data", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawCharArray() throws IOException {
        gen.writeRaw(new char[]{'a','b','c'}, 0, 3);
        gen.flush();
        assertEquals("abc", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawChar() throws IOException {
        gen.writeRaw('X');
        gen.flush();
        assertEquals("X", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBinary() throws IOException {
        byte[] data = {1, 2, 3, 4, 5};
        gen.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        gen.flush();
        String result = out.toString("UTF-8");
        assertTrue(result.startsWith("\"") && result.endsWith("\""));
        assertTrue(result.length() > 2);
    }

    @Test
    public void testGetOutputTarget() {
        assertSame(out, gen.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered() throws IOException {
        assertEquals(0, gen.getOutputBuffered());
        gen.writeNumber(1);
        gen.flush();
        assertEquals(0, gen.getOutputBuffered());
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        gen.writeString(new char[]{'h','e','l','l','o'}, 0, 5);
        gen.flush();
        assertEquals("\"hello\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteUTF8String() throws IOException {
        byte[] utf8 = "test".getBytes("UTF-8");
        gen.writeUTF8String(utf8, 0, utf8.length);
        gen.flush();
        assertEquals("\"test\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteRawUTF8String() throws IOException {
        byte[] utf8 = "raw".getBytes("UTF-8");
        gen.writeRawUTF8String(utf8, 0, utf8.length);
        gen.flush();
        assertEquals("\"raw\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberShort() throws IOException {
        gen.writeNumber((short) 7);
        gen.flush();
        assertEquals("7", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberStringEncoded() throws IOException {
        gen.writeNumber("99");
        gen.flush();
        assertEquals("99", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberStringEncodedNull() throws IOException {
        gen.writeNumber((String) null);
        gen.flush();
        assertEquals("null", out.toString("UTF-8"));
    }

    @Test
    public void testClose() throws IOException {
        gen.writeStartObject();
        gen.writeEndObject();
        gen.close();
        assertEquals("{}", out.toString("UTF-8"));
    }

    @Test
    public void testFlush() throws IOException {
        gen.writeNumber(123);
        gen.flush();
        assertEquals("123", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringWithSpecialChars() throws IOException {
        gen.writeString("line1\nline2\t");
        gen.flush();
        String result = out.toString("UTF-8");
        assertTrue(result.contains("\\n"));
        assertTrue(result.contains("\\t"));
    }

    @Test
    public void testWriteStringWithUnicode() throws IOException {
        gen.writeString("\u00e9\u20ac");
        gen.flush();
        String result = out.toString("UTF-8");
        assertEquals("\"\u00e9\u20ac\"", result);
    }

    @Test
    public void testWriteNumberNegativeLong() throws IOException {
        gen.writeNumber(-9876543210L);
        gen.flush();
        assertEquals("-9876543210", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberNegativeDouble() throws IOException {
        gen.writeNumber(-2.5);
        gen.flush();
        assertTrue(out.toString("UTF-8").contains("-2.5"));
    }

    @Test
    public void testWriteNumberFloat() throws IOException {
        gen.writeNumber(1.5f);
        gen.flush();
        assertTrue(out.toString("UTF-8").contains("1.5"));
    }

    @Test
    public void testWriteNumberFloatNaN() throws IOException {
        gen.writeNumber(Float.NaN);
        gen.flush();
        assertTrue(out.toString("UTF-8").contains("NaN"));
    }

    @Test
    public void testWriteNumberDoubleInfinity() throws IOException {
        gen.writeNumber(Double.POSITIVE_INFINITY);
        gen.flush();
        assertTrue(out.toString("UTF-8").contains("Infinity"));
    }

    @Test
    public void testWriteNumberDoubleNaNAndQuoted() throws IOException {
        gen = new UTF8JsonGenerator(ctxt,
            JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.getMask(),
            null, out);
        gen.writeNumber(Double.NaN);
        gen.flush();
        assertEquals("\"NaN\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimalPlain() throws IOException {
        gen = new UTF8JsonGenerator(ctxt,
            JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask(),
            null, out);
        gen.writeNumber(new BigDecimal("1E+2"));
        gen.flush();
        assertEquals("100", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigDecimalAsString() throws IOException {
        gen = new UTF8JsonGenerator(ctxt,
            JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask(),
            null, out);
        gen.writeNumber(new BigDecimal("99.9"));
        gen.flush();
        assertEquals("\"99.9\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberBigIntegerAsString() throws IOException {
        gen = new UTF8JsonGenerator(ctxt,
            JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask(),
            null, out);
        gen.writeNumber(new BigInteger("42"));
        gen.flush();
        assertEquals("\"42\"", out.toString("UTF-8"));
    }

    @Test
    public void testWriteStringLongSegment() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append('a');
        }
        gen.writeString(sb.toString());
        gen.flush();
        String result = out.toString("UTF-8");
        assertEquals(1002, result.length());
        assertTrue(result.startsWith("\"") && result.endsWith("\""));
    }

    @Test
    public void testWriteFieldNameWithCommaStatus() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("f1");
        gen.writeNumber(1);
        gen.writeFieldName("f2");
        gen.writeNumber(2);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"f1\":1,\"f2\":2}", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteValueInObjectExpectingFieldName() throws IOException {
        gen.writeStartObject();
        gen.writeNumber(1);
    }

    @Test
    public void testWriteEndObjectNotInObject() throws IOException {
        gen.writeStartArray();
        gen.writeEndArray();
        gen.writeStartObject();
        gen.writeEndObject();
        gen.flush();
        assertEquals("[]{}", out.toString("UTF-8"));
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObjectWhenNotInObject() throws IOException {
        gen.writeEndObject();
    }

    @Test
    public void testWriteStringCharSegment() throws IOException {
        char[] chars = new char[200];
        for (int i = 0; i < chars.length; i++) chars[i] = 'x';
        gen.writeString(chars, 0, chars.length);
        gen.flush();
        String result = out.toString("UTF-8");
        assertTrue(result.startsWith("\"") && result.endsWith("\""));
        assertEquals(chars.length + 2, result.length());
    }

    @Test
    public void testWriteFieldNameSerializableString() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName(SerializedString.valueOf("myField"));
        gen.writeNumber(123);
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"myField\":123}", out.toString("UTF-8"));
    }

    @Test(expected = IOException.class)
    public void testWriteFieldNameSerializableStringExpectingValue() throws IOException {
        gen.writeStartArray();
        gen.writeFieldName(SerializedString.valueOf("x"));
    }

    @Test
    public void testFlushWithOutputStreamFlushEnabled() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream() {
            boolean flushed;
            @Override
            public void flush() throws IOException {
                flushed = true;
                super.flush();
            }
        };
        UTF8JsonGenerator g = new UTF8JsonGenerator(ctxt,
            JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask(), null, baos);
        g.writeNumber(1);
        g.flush();
        assertTrue(((java.io.ByteArrayOutputStream)baos).size() > 0);
    }

    @Test
    public void testWriteMultipleValuesArray() throws IOException {
        gen.writeStartArray();
        gen.writeNumber(1);
        gen.writeNumber(2);
        gen.writeNumber(3);
        gen.writeEndArray();
        gen.flush();
        assertEquals("[1,2,3]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteMultipleValuesObject() throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeString("x");
        gen.writeFieldName("b");
        gen.writeString("y");
        gen.writeEndObject();
        gen.flush();
        assertEquals("{\"a\":\"x\",\"b\":\"y\"}", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNullInArray() throws IOException {
        gen.writeStartArray();
        gen.writeNull();
        gen.writeNull();
        gen.writeEndArray();
        gen.flush();
        assertEquals("[null,null]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteBooleanInArray() throws IOException {
        gen.writeStartArray();
        gen.writeBoolean(true);
        gen.writeBoolean(false);
        gen.writeEndArray();
        gen.flush();
        assertEquals("[true,false]", out.toString("UTF-8"));
    }

    @Test
    public void testWriteNumberIntMinMax() throws IOException {
        gen.writeStartArray();
        gen.writeNumber(Integer.MIN_VALUE);
        gen.writeNumber(Integer.MAX_VALUE);
        gen.writeEndArray();
        gen.flush();
        String result = out.toString("UTF-8");
        assertTrue(result.contains(String.valueOf(Integer.MIN_VALUE)));
        assertTrue(result.contains(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void testWriteNumberLongMinMax() throws IOException {
        gen.writeStartArray();
        gen.writeNumber(Long.MIN_VALUE);
        gen.writeNumber(Long.MAX_VALUE);
        gen.writeEndArray();
        gen.flush();
        String result = out.toString("UTF-8");
        assertTrue(result.contains(String.valueOf(Long.MIN_VALUE)));
        assertTrue(result.contains(String.valueOf(Long.MAX_VALUE)));
    }

    @Test
    public void testWriteStringWithEmbeddedQuote() throws IOException {
        gen.writeString("he\"llo");
        gen.flush();
        assertEquals("\"he\\\"llo\"", out.toString("UTF-8"));
    }
}