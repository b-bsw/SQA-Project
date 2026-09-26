package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

@SuppressWarnings("deprecation")
public class TokenBufferTest {

    private static void assertToken(JsonParser p, JsonToken expected) throws IOException {
        assertSame(expected, p.nextToken());
    }

    private static void assertField(JsonParser p, String name) throws IOException {
        assertSame(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(name, p.getCurrentName());
    }

    @Test
    public void testEmptyBuffer() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        assertNull(b.firstToken());
        assertNotNull(b.getOutputContext());
        assertEquals("[TokenBuffer: ]", b.toString());
        assertFalse(b.isClosed());
        b.close();
        assertTrue(b.isClosed());

        JsonParser p = b.asParser();
        assertNull(p.nextToken());
        p.close();
        assertTrue(p.isClosed());
    }

    @Test
    public void testWriteAndReadTokens() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeStartObject();
        b.writeFieldName("text");
        b.writeString("value");
        b.writeFieldName("int");
        b.writeNumber(1);
        b.writeFieldName("long");
        b.writeNumber(2L);
        b.writeFieldName("big");
        b.writeNumber(new BigInteger("123"));
        b.writeFieldName("double");
        b.writeNumber(1.5d);
        b.writeFieldName("decimal");
        b.writeNumber(new BigDecimal("3.25"));
        b.writeFieldName("strnum");
        b.writeNumber("2.5");
        b.writeFieldName("bool");
        b.writeBoolean(true);
        b.writeEndObject();

        assertSame(JsonToken.START_OBJECT, b.firstToken());

        JsonParser p = b.asParser();
        assertToken(p, JsonToken.START_OBJECT);
        assertField(p, "text");
        assertToken(p, JsonToken.VALUE_STRING);
        assertEquals("value", p.getText());

        assertField(p, "int");
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, p.getIntValue());

        assertField(p, "long");
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(2L, p.getLongValue());

        assertField(p, "big");
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(new BigInteger("123"), p.getBigIntegerValue());

        assertField(p, "double");
        assertToken(p, JsonToken.VALUE_NUMBER_FLOAT);
        assertEquals(1.5d, p.getDoubleValue(), 0.0d);

        assertField(p, "decimal");
        assertToken(p, JsonToken.VALUE_NUMBER_FLOAT);
        assertEquals(new BigDecimal("3.25"), p.getDecimalValue());

        assertField(p, "strnum");
        assertToken(p, JsonToken.VALUE_NUMBER_FLOAT);
        assertEquals(2.5d, p.getDoubleValue(), 0.0d);

        assertField(p, "bool");
        assertToken(p, JsonToken.VALUE_TRUE);
        assertToken(p, JsonToken.END_OBJECT);
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSerialize() throws Exception {
        TokenBuffer src = new TokenBuffer(null);
        src.writeStartObject();
        src.writeFieldName("s");
        src.writeString("x");
        src.writeFieldName("arr");
        src.writeStartArray();
        src.writeNumber(1);
        src.writeNumber(2L);
        src.writeNumber(new BigInteger("3"));
        src.writeNumber((short) 7);
        src.writeNumber(4.5d);
        src.writeNumber(new BigDecimal("6.25"));
        src.writeBoolean(false);
        src.writeNull();
        src.writeEndArray();
        src.writeEndObject();

        TokenBuffer dst = new TokenBuffer(null);
        src.serialize(dst);

        JsonParser p = dst.asParser();
        assertToken(p, JsonToken.START_OBJECT);
        assertField(p, "s");
        assertToken(p, JsonToken.VALUE_STRING);
        assertEquals("x", p.getText());

        assertField(p, "arr");
        assertToken(p, JsonToken.START_ARRAY);
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, p.getIntValue());
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(2L, p.getLongValue());
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(new BigInteger("3"), p.getBigIntegerValue());
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(7, p.getIntValue());
        assertToken(p, JsonToken.VALUE_NUMBER_FLOAT);
        assertEquals(4.5d, p.getDoubleValue(), 0.0d);
        assertToken(p, JsonToken.VALUE_NUMBER_FLOAT);
        assertEquals(new BigDecimal("6.25"), p.getDecimalValue());
        assertToken(p, JsonToken.VALUE_FALSE);
        assertToken(p, JsonToken.VALUE_NULL);
        assertToken(p, JsonToken.END_ARRAY);
        assertToken(p, JsonToken.END_OBJECT);
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSegmentExpansion() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeStartArray();
        for (int i = 0; i < 20; i++) {
            b.writeNumber(i);
        }
        b.writeEndArray();

        JsonParser p = b.asParser();
        assertToken(p, JsonToken.START_ARRAY);
        for (int i = 0; i < 20; i++) {
            assertToken(p, JsonToken.VALUE_NUMBER_INT);
            assertEquals(i, p.getIntValue());
        }
        assertToken(p, JsonToken.END_ARRAY);
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testAppend() throws Exception {
        TokenBuffer b1 = new TokenBuffer(null);
        b1.writeStartObject();
        b1.writeFieldName("a");
        b1.writeNumber(1);
        b1.writeEndObject();

        TokenBuffer b2 = new TokenBuffer(null);
        b2.writeStartObject();
        b2.writeFieldName("b");
        b2.writeNumber(2);
        b2.writeEndObject();

        assertSame(b1, b1.append(b2));

        JsonParser p = b1.asParser();
        assertToken(p, JsonToken.START_OBJECT);
        assertField(p, "a");
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, p.getIntValue());
        assertToken(p, JsonToken.END_OBJECT);

        assertToken(p, JsonToken.START_OBJECT);
        assertField(p, "b");
        assertToken(p, JsonToken.VALUE_NUMBER_INT);
        assertEquals(2, p.getIntValue());
        assertToken(p, JsonToken.END_OBJECT);
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testDeserialize() throws Exception {
        JsonParser p = new JsonFactory().createParser("{\"a\":1}");
        assertToken(p, JsonToken.START_OBJECT);
        assertToken(p, JsonToken.FIELD_NAME);

        TokenBuffer b = new TokenBuffer(null);
        b.deserialize(p, null);
        p.close();

        JsonParser r = b.asParser();
        assertToken(r, JsonToken.START_OBJECT);
        assertField(r, "a");
        assertToken(r, JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, r.getIntValue());
        assertToken(r, JsonToken.END_OBJECT);
        assertNull(r.nextToken());
        r.close();
    }

    @Test
    public void testCopyCurrentStructureNested() throws Exception {
        JsonParser p = new JsonFactory().createParser("{\"a\":[1,2],\"b\":{\"c\":true}}");
        assertToken(p, JsonToken.START_OBJECT);

        TokenBuffer b = new TokenBuffer(null);
        b.copyCurrentStructure(p);
        p.close();

        JsonParser r = b.asParser();
        assertToken(r, JsonToken.START_OBJECT);
        assertField(r, "a");
        assertToken(r, JsonToken.START_ARRAY);
        assertToken(r, JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, r.getIntValue());
        assertToken(r, JsonToken.VALUE_NUMBER_INT);
        assertEquals(2, r.getIntValue());
        assertToken(r, JsonToken.END_ARRAY);

        assertField(r, "b");
        assertToken(r, JsonToken.START_OBJECT);
        assertField(r, "c");
        assertToken(r, JsonToken.VALUE_TRUE);
        assertToken(r, JsonToken.END_OBJECT);
        assertToken(r, JsonToken.END_OBJECT);
        assertNull(r.nextToken());
        r.close();
    }

    @Test
    public void testCopyCurrentStructureEmpty() throws Exception {
        JsonParser p = new JsonFactory().createParser("{\"e\":[],\"o\":{}}");
        assertToken(p, JsonToken.START_OBJECT);

        TokenBuffer b = new TokenBuffer(null);
        b.copyCurrentStructure(p);
        p.close();

        JsonParser r = b.asParser();
        assertToken(r, JsonToken.START_OBJECT);
        assertField(r, "e");
        assertToken(r, JsonToken.START_ARRAY);
        assertToken(r, JsonToken.END_ARRAY);
        assertField(r, "o");
        assertToken(r, JsonToken.START_OBJECT);
        assertToken(r, JsonToken.END_OBJECT);
        assertToken(r, JsonToken.END_OBJECT);
        assertNull(r.nextToken());
        r.close();
    }

    @Test
    public void testNullValues() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeString(null);
        b.writeNumber((BigDecimal) null);
        b.writeNumber((BigInteger) null);
        b.writeObject(null);
        b.writeTree(null);

        JsonParser p = b.asParser();
        for (int i = 0; i < 5; i++) {
            assertToken(p, JsonToken.VALUE_NULL);
        }
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testEmbeddedBytes() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        byte[] data = new byte[] { 1, 2, 3 };
        b.writeBinary(Base64Variants.MIME, data, 0, data.length);

        JsonParser p = b.asParser();
        assertToken(p, JsonToken.VALUE_EMBEDDED_OBJECT);
        assertArrayEquals(data, (byte[]) p.getEmbeddedObject());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testFeaturesAndConfig() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        JsonGenerator.Feature f = JsonGenerator.Feature.QUOTE_FIELD_NAMES;

        assertSame(b, b.enable(f));
        assertTrue(b.isEnabled(f));
        assertSame(b, b.disable(f));
        assertFalse(b.isEnabled(f));

        int mask = b.getFeatureMask();
        assertSame(b, b.setFeatureMask(mask));
        assertSame(b, b.useDefaultPrettyPrinter());
        assertSame(b, b.setCodec(null));
        assertNull(b.getCodec());
        assertTrue(b.canWriteBinaryNatively());
        assertFalse(b.canWriteTypeId());
        assertFalse(b.canWriteObjectId());
        assertNotNull(b.version());

        b.flush();
        assertFalse(b.isClosed());
        b.close();
        assertTrue(b.isClosed());
    }

    @Test
    public void testNativeIds() throws Exception {
        TokenBuffer b = new TokenBuffer(null, true);
        assertTrue(b.canWriteTypeId());
        assertTrue(b.canWriteObjectId());

        b.writeStartObject();
        b.writeTypeId("type-1");
        b.writeObjectId("object-1");
        b.writeFieldName("a");
        b.writeString("x");
        b.writeEndObject();

        JsonParser p = b.asParser();
        assertTrue(p.canReadTypeId());
        assertTrue(p.canReadObjectId());

        assertToken(p, JsonToken.START_OBJECT);
        assertToken(p, JsonToken.FIELD_NAME);
        assertEquals("a", p.getCurrentName());
        assertEquals("type-1", p.getTypeId());
        assertEquals("object-1", p.getObjectId());

        assertToken(p, JsonToken.VALUE_STRING);
        assertEquals("x", p.getText());
        assertToken(p, JsonToken.END_OBJECT);
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSerializeWithNativeIds() throws Exception {
        TokenBuffer src = new TokenBuffer(null, true);
        src.writeStartObject();
        src.writeTypeId("t");
        src.writeObjectId("o");
        src.writeFieldName("a");
        src.writeString("x");
        src.writeEndObject();

        TokenBuffer dst = new TokenBuffer(null, true);
        src.serialize(dst);

        JsonParser p = dst.asParser();
        assertToken(p, JsonToken.START_OBJECT);
        assertToken(p, JsonToken.FIELD_NAME);
        assertEquals("a", p.getCurrentName());
        assertEquals("t", p.getTypeId());
        assertEquals("o", p.getObjectId());

        assertToken(p, JsonToken.VALUE_STRING);
        assertEquals("x", p.getText());
        assertToken(p, JsonToken.END_OBJECT);
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testUnsupportedOperations() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        try {
            b.writeRaw("x");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }

        try {
            b.writeUTF8String(new byte[] { 1 }, 0, 1);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }

        try {
            b.writeRawUTF8String(new byte[] { 1 }, 0, 1);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }

        try {
            b.writeRaw('c');
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testParserNumericAccessOnNonNumeric() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeString("abc");

        JsonParser p = b.asParser();
        assertToken(p, JsonToken.VALUE_STRING);
        try {
            p.getIntValue();
            fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
        } finally {
            p.close();
        }
    }

    @Test
    public void testToString() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        b.writeStartObject();
        b.writeFieldName("x");
        b.writeString("y");
        b.writeEndObject();

        String s = b.toString();
        assertTrue(s.contains("START_OBJECT"));
        assertTrue(s.contains("FIELD_NAME(x)"));
        assertTrue(s.contains("VALUE_STRING"));
        assertTrue(s.contains("END_OBJECT"));
    }

    @Test
    public void testToStringTruncation() throws Exception {
        TokenBuffer b = new TokenBuffer(null);
        for (int i = 0; i < 105; i++) {
            b.writeNull();
        }

        String s = b.toString();
        assertTrue(s.contains("(truncated 5 entries)"));
    }
}