package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TokenBufferTest {
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        mapper = null;
    }

    @Test
    public void testConstructorAndFirstTokenEmpty() {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        assertNull(buffer.firstToken());
        assertFalse(buffer.isClosed());
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testConstructorWithParser() throws IOException {
        TokenBuffer source = new TokenBuffer(mapper, false);
        source.writeStartObject();
        source.writeFieldName("a");
        source.writeString("val");
        source.writeEndObject();
        JsonParser parser = source.asParser();
        TokenBuffer buffer2 = new TokenBuffer(parser);
        assertNull(buffer2.firstToken());
        assertNotNull(source.firstToken());
        assertEquals(JsonToken.START_OBJECT, source.firstToken());
    }

    @Test
    public void testWriteAndReadObject() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeStartObject();
        buffer.writeFieldName("key");
        buffer.writeString("value");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        assertNull(parser.getCurrentToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals("key", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteArray() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeStartArray();
        buffer.writeNumber(42);
        buffer.writeString("hello");
        buffer.writeBoolean(true);
        buffer.writeNull();
        buffer.writeEndArray();
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNumberTypes() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeNumber(Short.MAX_VALUE);
        buffer.writeNumber(Integer.MAX_VALUE);
        buffer.writeNumber(Long.MAX_VALUE);
        buffer.writeNumber(BigInteger.valueOf(1234567890123456789L));
        buffer.writeNumber(3.14159d);
        buffer.writeNumber(2.71828f);
        buffer.writeNumber(new BigDecimal("12345678901234567890.123456789"));
        buffer.writeNumber("9.99");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals((int) Short.MAX_VALUE, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Integer.MAX_VALUE, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(Long.MAX_VALUE, parser.getLongValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(new BigInteger("1234567890123456789"), parser.getBigIntegerValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14159d, parser.getDoubleValue(), 1e-9);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(2.71828f, parser.getFloatValue(), 1e-6);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(new BigDecimal("12345678901234567890.123456789"), parser.getDecimalValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(9.99, parser.getDoubleValue(), 1e-9);
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteStringNull() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeString((String) null);
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWriteBooleanAndNullAndObject() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeBoolean(false);
        buffer.writeNull();
        buffer.writeObject("embedded");
        JsonParser parser = buffer.asParser();
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals("embedded", parser.getEmbeddedObject());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNativeIds() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, true);
        assertTrue(buffer.canWriteTypeId());
        assertTrue(buffer.canWriteObjectId());
        buffer.writeStartObject();
        buffer.writeFieldName("x");
        buffer.writeObjectId("obj123");
        buffer.writeTypeId("type456");
        buffer.writeString("test");
        buffer.writeEndObject();
        JsonParser parser = buffer.asParser();
        assertTrue(parser.canReadObjectId());
        assertTrue(parser.canReadTypeId());
        parser.nextToken();
        parser.nextToken();
        assertEquals("x", parser.getCurrentName());
        parser.nextToken();
        assertEquals("test", parser.getText());
        assertEquals("obj123", parser.getObjectId());
        assertEquals("type456", parser.getTypeId());
        parser.nextToken();
        assertNull(parser.nextToken());
    }

    @Test
    public void testAppend() throws IOException {
        TokenBuffer buffer1 = new TokenBuffer(mapper, false);
        buffer1.writeNumber(1);
        TokenBuffer buffer2 = new TokenBuffer(mapper, false);
        buffer2.writeNumber(2);
        buffer1.append(buffer2);
        JsonParser parser = buffer1.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertNull(parser.nextToken());
    }

    @Test
    public void testToString() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeStartObject();
        buffer.writeFieldName("a");
        buffer.writeString("b");
        buffer.writeEndObject();
        String str = buffer.toString();
        assertTrue(str.startsWith("[TokenBuffer:"));
        assertTrue(str.contains("START_OBJECT"));
        assertTrue(str.contains("FIELD_NAME(a)"));
        assertTrue(str.contains("VALUE_STRING"));
        assertTrue(str.contains("END_OBJECT"));
        assertTrue(str.endsWith("]"));
    }

    @Test
    public void testFeatureFlags() {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buffer.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        buffer.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(buffer.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        int mask = buffer.getFeatureMask();
        buffer.setFeatureMask(0);
        assertEquals(0, buffer.getFeatureMask());
        buffer.setFeatureMask(mask);
    }

    @Test
    public void testClose() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        assertFalse(buffer.isClosed());
        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUnsupported() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeRaw("raw");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValueUnsupported() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeRawValue("raw");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8StringUnsupported() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeRawUTF8String(new byte[]{0}, 0, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8StringUnsupported() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeUTF8String(new byte[]{0}, 0, 1);
    }

    @Test
    public void testCopyCurrentEvent() throws IOException {
        TokenBuffer source = new TokenBuffer(mapper, false);
        source.writeNumber(123);
        JsonParser srcParser = source.asParser();
        srcParser.nextToken();
        TokenBuffer target = new TokenBuffer(mapper, false);
        target.copyCurrentEvent(srcParser);
        JsonParser targetParser = target.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, targetParser.nextToken());
        assertEquals(123, targetParser.getIntValue());
        assertNull(targetParser.nextToken());
    }

    @Test
    public void testCopyCurrentStructure() throws IOException {
        TokenBuffer source = new TokenBuffer(mapper, false);
        source.writeStartObject();
        source.writeFieldName("x");
        source.writeStartArray();
        source.writeString("item");
        source.writeEndArray();
        source.writeEndObject();
        JsonParser srcParser = source.asParser();
        srcParser.nextToken();
        TokenBuffer target = new TokenBuffer(mapper, false);
        target.copyCurrentStructure(srcParser);
        JsonParser targetParser = target.asParser();
        assertEquals(JsonToken.START_OBJECT, targetParser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, targetParser.nextToken());
        assertEquals("x", targetParser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, targetParser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, targetParser.nextToken());
        assertEquals("item", targetParser.getText());
        assertEquals(JsonToken.END_ARRAY, targetParser.nextToken());
        assertEquals(JsonToken.END_OBJECT, targetParser.nextToken());
        assertNull(targetParser.nextToken());
    }

    @Test
    public void testFirstTokenAfterWrite() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        assertNull(buffer.firstToken());
        buffer.writeNumber(1);
        assertEquals(JsonToken.VALUE_NUMBER_INT, buffer.firstToken());
    }

    @Test
    public void testEmptyBufferParser() throws IOException {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        JsonParser parser = buffer.asParser();
        assertNull(parser.nextToken());
    }
}