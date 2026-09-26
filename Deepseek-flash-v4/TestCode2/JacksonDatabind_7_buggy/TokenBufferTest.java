package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class TokenBufferTest {

    @Test
    public void testEmptyBufferLifecycle() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        assertNull(buffer.firstToken());
        assertEquals("[TokenBuffer: ]", buffer.toString());
        assertFalse(buffer.isClosed());
        buffer.flush();

        TokenBuffer sink = new TokenBuffer(null);
        buffer.serialize(sink);
        assertNull(sink.asParser().nextToken());

        buffer.close();
        assertTrue(buffer.isClosed());
    }

    @Test
    public void testSimpleObjectTokensAndParser() throws Exception {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeStartObject();
        buffer.writeFieldName("value");
        buffer.writeNumber(42);
        buffer.writeEndObject();

        assertSame(JsonToken.START_OBJECT, buffer.firstToken());

        JsonParser p = buffer.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("value", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getIntValue());
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNullWritesProduceNullTokens() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeString(null);
        b.writeNumber((BigDecimal) null);
        b.writeNumber((BigInteger) null);
        b.writeObject(null);
        b.writeTree(null);

        JsonParser p = b.asParser();
        for (int i = 0; i < 5; i++) {
            assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        }
        assertNull(p.nextToken());
    }

    @Test
    public void testNumericTypeAccessors() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeNumber(123);
        b.writeNumber(456L);
        b.writeNumber(new BigInteger("123456789012345678901234567890"));
        b.writeNumber(1.5d);
        b.writeNumber(2.5f);
        b.writeNumber(new BigDecimal("3.50"));
        b.writeNumber("12.34");
        b.writeNumber("789");

        JsonParser p = b.asParser();

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(456L, p.getLongValue());
        assertEquals(JsonParser.NumberType.LONG, p.getNumberType());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getBigIntegerValue().compareTo(new BigInteger("123456789012345678901234567890")));
        assertEquals(JsonParser.NumberType.BIG_INTEGER, p.getNumberType());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(1.5d, p.getDoubleValue(), 0.0d);
        assertEquals(JsonParser.NumberType.DOUBLE, p.getNumberType());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2.5f, p.getFloatValue(), 0.0f);
        assertEquals(JsonParser.NumberType.FLOAT, p.getNumberType());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0, p.getDecimalValue().compareTo(new BigDecimal("3.50")));
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, p.getNumberType());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(12.34d, p.getDoubleValue(), 0.0d);
        assertEquals(JsonParser.NumberType.DOUBLE, p.getNumberType());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(789L, p.getLongValue());
        assertEquals(JsonParser.NumberType.LONG, p.getNumberType());

        assertNull(p.nextToken());
    }

    @Test
    public void testMiscValuesAndEmbeddedObjects() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeBoolean(true);
        b.writeBoolean(false);
        b.writeNull();
        b.writeObject(new byte[] { 1, 2, 3 });
        b.writeObject("plain");
        b.writeString("text");
        b.writeString(new char[] { 'M', 'i', 'x' }, 0, 3);

        JsonParser p = b.asParser();

        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertFalse(p.getBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertArrayEquals(new byte[] { 1, 2, 3 }, (byte[]) p.getEmbeddedObject());

        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertEquals("plain", p.getEmbeddedObject());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("text", p.getText());

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("Mix", p.getText());

        assertNull(p.nextToken());
    }

    @Test
    public void testSerializeNumericVariants() throws Exception {
        TokenBuffer src = new TokenBuffer(null);
        src.writeNumber((short) 1);
        src.writeNumber(2);
        src.writeNumber(3L);
        src.writeNumber(new BigInteger("4"));
        src.writeNumber(5.5d);
        src.writeNumber(new BigDecimal("6.50"));
        src.writeNumber(7.5f);
        src.writeNumber("8.25");

        TokenBuffer sink = new TokenBuffer(null);
        src.serialize(sink);

        JsonParser p = sink.asParser();
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3L, p.getLongValue());

        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(0, p.getBigIntegerValue().compareTo(new BigInteger("4")));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(5.5d, p.getDoubleValue(), 0.0d);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(0, p.getDecimalValue().compareTo(new BigDecimal("6.50")));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(7.5f, p.getFloatValue(), 0.0f);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(8.25d, p.getDoubleValue(), 0.0d);

        assertNull(p.nextToken());
    }

    @Test
    public void testSerializeAcrossSegments() throws Exception {
        TokenBuffer source = new TokenBuffer(null);
        source.writeStartObject();
        for (int i = 0; i < 20; i++) {
            source.writeFieldName("k" + i);
            source.writeNumber(i);
        }
        source.writeEndObject();

        TokenBuffer sink = new TokenBuffer(null);
        source.serialize(sink);

        JsonParser p = sink.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        for (int i = 0; i < 20; i++) {
            assertEquals(JsonToken.FIELD_NAME, p.nextToken());
            assertEquals("k" + i, p.getCurrentName());
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testAppendAndDeserializeStructure() throws Exception {
        TokenBuffer other = new TokenBuffer(null);
        other.writeStartArray();
        other.writeNumber(1);
        other.writeString("x");
        other.writeEndArray();

        TokenBuffer target = new TokenBuffer(null);
        target.writeStartObject();
        target.writeFieldName("payload");
        target.append(other);
        target.writeEndObject();

        JsonParser p = target.asParser();
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("payload", p.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("x", p.getText());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());

        TokenBuffer source = new TokenBuffer(null);
        source.writeStartObject();
        source.writeFieldName("a");
        source.writeStartArray();
        source.writeNumber(7);
        source.writeBoolean(false);
        source.writeEndArray();
        source.writeEndObject();

        JsonParser srcParser = source.asParser();
        assertEquals(JsonToken.START_OBJECT, srcParser.nextToken());

        TokenBuffer copy = new TokenBuffer(null);
        copy.deserialize(srcParser, null);

        JsonParser cp = copy.asParser();
        assertEquals(JsonToken.START_OBJECT, cp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, cp.nextToken());
        assertEquals("a", cp.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, cp.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, cp.nextToken());
        assertEquals(7, cp.getIntValue());
        assertEquals(JsonToken.VALUE_FALSE, cp.nextToken());
        assertEquals(JsonToken.END_ARRAY, cp.nextToken());
        assertEquals(JsonToken.END_OBJECT, cp.nextToken());
        assertNull(cp.nextToken());
    }

    @Test
    public void testNativeTypeAndObjectIds() throws Exception {
        TokenBuffer b = new TokenBuffer(null, true);
        assertTrue(b.canWriteTypeId());
        assertTrue(b.canWriteObjectId());

        b.writeTypeId("type-id");
        b.writeObjectId("object-id");
        b.writeString("with-id");

        JsonParser p = b.asParser();
        assertTrue(p.canReadTypeId());
        assertTrue(p.canReadObjectId());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("object-id", p.getObjectId());
        assertEquals("type-id", p.getTypeId());
        assertNull(p.nextToken());

        TokenBuffer noIds = new TokenBuffer(null);
        assertFalse(noIds.canWriteTypeId());
        assertFalse(noIds.canWriteObjectId());

        TokenBuffer fromParser = new TokenBuffer(p);
        assertTrue(fromParser.canWriteTypeId());
        assertTrue(fromParser.canWriteObjectId());
    }

    @Test
    public void testToStringTruncatesAfterOneHundredTokens() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        for (int i = 0; i < 101; i++) {
            b.writeNumber(i);
        }
        String s = b.toString();
        assertTrue(s.startsWith("[TokenBuffer: "));
        assertTrue(s.contains("... (truncated 1 entries)"));
        assertTrue(s.endsWith("]"));
    }

    @Test(expected = JsonParseException.class)
    public void testParserRejectsNonNumericAccess() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeString("not-a-number");

        JsonParser p = b.asParser();
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.getIntValue();
    }

    @Test
    public void testUnsupportedWriteOperations() throws Exception {
        TokenBuffer b = new TokenBuffer(null);

        try {
            b.writeRaw("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }

        try {
            b.writeRawUTF8String(new byte[] { 1 }, 0, 1);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testGeneratorFeatureFlags() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        JsonGenerator.Feature feature = JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;

        b.enable(feature);
        assertTrue(b.isEnabled(feature));

        b.disable(feature);
        assertFalse(b.isEnabled(feature));

        int mask = b.getFeatureMask();
        b.setFeatureMask(mask);
        assertEquals(mask, b.getFeatureMask());

        assertSame(b, b.useDefaultPrettyPrinter());
    }
}