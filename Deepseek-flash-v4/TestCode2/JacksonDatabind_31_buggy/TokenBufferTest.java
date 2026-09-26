package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectCodec;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TokenBufferTest {

    private TokenBuffer createBuffer() {
        return new TokenBuffer((ObjectCodec)null);
    }

    @Test
    public void testEmptyBuffer() throws Exception {
        TokenBuffer buf = createBuffer();
        assertNull(buf.firstToken());
        assertEquals("", buf.toString());
        JsonParser p = buf.asParser();
        assertNull(p.nextToken());
        assertNull(p.getCurrentToken());
        assertFalse(buf.isClosed());
        buf.close();
        assertTrue(buf.isClosed());
    }

    @Test
    public void testWriteReadObject() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeStartObject();
        buf.writeFieldName("name");
        buf.writeString("value");
        buf.writeFieldName("count");
        buf.writeNumber(42);
        buf.writeFieldName("ratio");
        buf.writeNumber(1.5);
        buf.writeFieldName("flag");
        buf.writeBoolean(true);
        buf.writeFieldName("nothing");
        buf.writeNull();
        buf.writeEndObject();

        assertEquals(JsonToken.START_OBJECT, buf.firstToken());

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("count", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("ratio", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5, p.getDoubleValue(), 0.0);
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("flag", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("nothing", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals("null", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testWriteArrayMultipleSegments() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeStartArray();
        for (int i = 0; i < 20; i++) {
            buf.writeNumber(i);
        }
        buf.writeEndArray();

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        for (int i = 0; i < 20; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testEmptyStructures() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeStartArray();
        buf.writeEndArray();
        buf.writeStartObject();
        buf.writeEndObject();

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNullAndEmptyStrings() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeString((String)null);
        buf.writeString("");

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertNull(p.getText());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("", p.getText());
        assertNull(p.nextToken());
    }

    @Test
    public void testWriteObjectNullDoesNothing() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeObject(null);
        assertNull(buf.firstToken());
        assertEquals("", buf.toString());
    }

    @Test
    public void testWriteObjectByteArray() throws Exception {
        TokenBuffer buf = createBuffer();
        byte[] data = new byte[] {1, 2, 3};
        buf.writeObject(data);

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(data, p.getBinaryValue());
    }

    @Test
    public void testWriteBinary() throws Exception {
        TokenBuffer buf = createBuffer();
        byte[] data = new byte[] {10, 20, 30};
        buf.writeBinary(data, 0, data.length);

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(data, p.getBinaryValue());
    }

    @Test
    public void testFeatureFlags() throws Exception {
        TokenBuffer buf = createBuffer();
        assertEquals(0, buf.getFeatureMask());
        assertFalse(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        buf.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        assertTrue((buf.getFeatureMask() & JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask()) != 0);

        buf.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(buf.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        assertEquals(0, buf.getFeatureMask());
    }

    @Test
    public void testGetCodecAndOutputContext() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer buf = new TokenBuffer(mapper);
        assertSame(mapper, buf.getCodec());
        assertNotNull(buf.getOutputContext());
    }

    @Test
    public void testParserNumberTypes() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeNumber(Integer.MAX_VALUE);
        buf.writeNumber(Long.MAX_VALUE);
        buf.writeNumber(1.5d);
        buf.writeNumber(BigDecimal.valueOf(2.5));
        buf.writeNumber(BigInteger.TEN);
        buf.writeNumber((short)3);
        buf.writeNumber((float)1.5);

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertSame(JsonParser.NumberType.INT, p.getNumberType());
        assertEquals(Integer.MAX_VALUE, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertSame(JsonParser.NumberType.LONG, p.getNumberType());
        assertEquals(Long.MAX_VALUE, p.getLongValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertSame(JsonParser.NumberType.DOUBLE, p.getNumberType());
        assertEquals(1.5d, p.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertSame(JsonParser.NumberType.BIG_DECIMAL, p.getNumberType());
        assertEquals(BigDecimal.valueOf(2.5), p.getDecimalValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertSame(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());
        assertEquals(BigInteger.TEN, p.getBigIntegerValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertSame(JsonParser.NumberType.INT, p.getNumberType());
        assertEquals(3, p.getShortValue());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertSame(JsonParser.NumberType.FLOAT, p.getNumberType());
        assertEquals(1.5f, p.getFloatValue(), 0.0f);

        assertNull(p.nextToken());
    }

    @Test
    public void testTokenBufferFromParser() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser(new StringReader("{\"a\":[1,true,null]}"));
        p.nextToken();
        TokenBuffer buf = new TokenBuffer(p);

        JsonParser q = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, q.nextToken());
        assertEquals(JsonToken.FIELD_NAME, q.nextToken());
        assertEquals("a", q.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, q.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, q.nextToken());
        assertEquals(1, q.getIntValue());
        assertEquals(JsonToken.VALUE_TRUE, q.nextToken());
        assertTrue(q.getBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, q.nextToken());
        assertEquals(JsonToken.END_ARRAY, q.nextToken());
        assertEquals(JsonToken.END_OBJECT, q.nextToken());
        assertNull(q.nextToken());
    }

    @Test
    public void testParserThrowsOnWrongAccess() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeBoolean(true);
        JsonParser p = buf.asParser();
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        try {
            p.getIntValue();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        try {
            p.getBinaryValue();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testToStringWithContent() throws Exception {
        TokenBuffer buf = createBuffer();
        buf.writeStartObject();
        buf.writeFieldName("a");
        buf.writeNumber(1);
        buf.writeEndObject();

        String s = buf.toString();
        assertNotNull(s);
        assertTrue(s.contains("a"));
        assertTrue(s.contains("1"));
    }

    @Test
    public void testBasicConfigMethods() throws Exception {
        TokenBuffer buf = createBuffer();
        assertSame(buf, buf.forceUseOfBigDecimal(true));
        assertTrue(buf.canWriteBinaryNatively());
        assertFalse(buf.canWriteTypeId());
        assertFalse(buf.canWriteObjectId());
        assertSame(buf, buf.useDefaultPrettyPrinter());
    }

    @Test
    public void testWriteObjectWithCodec() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TokenBuffer buf = new TokenBuffer(mapper);
        TreeMap<String, Object> map = new TreeMap<String, Object>();
        map.put("x", 1);
        buf.writeObject(map);

        JsonParser p = buf.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("x", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }
}