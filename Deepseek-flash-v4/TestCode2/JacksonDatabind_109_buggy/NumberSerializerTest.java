package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;

public class NumberSerializerTest {

    private static class TestNumberSerializer extends NumberSerializer {
        private final JsonFormat.Value format;

        TestNumberSerializer(Class<? extends Number> rawType, JsonFormat.Value format) {
            super(rawType);
            this.format = format;
        }

        @Override
        protected JsonFormat.Value findFormatOverrides(SerializerProvider provider,
                BeanProperty property, Class<?> type) {
            return format;
        }
    }

    private static class TestFormatVisitor implements JsonFormatVisitorWrapper {
        boolean integerVisited;
        boolean numberVisited;

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            integerVisited = true;
            return null;
        }

        @Override
        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            numberVisited = true;
            return null;
        }

        @Override
        public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonArrayFormatVisitor expectArrayFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonNullFormatVisitor expectNullFormat(JavaType type) {
            return null;
        }

        @Override
        public JsonMapFormatVisitor expectMapFormat(JavaType type) {
            return null;
        }

        @Override
        public void setProvider(SerializerProvider provider) {
        }
    }

    private static class CustomNumber extends Number {
        @Override
        public int intValue() {
            return 123;
        }

        @Override
        public long longValue() {
            return 123L;
        }

        @Override
        public float floatValue() {
            return 123.0f;
        }

        @Override
        public double doubleValue() {
            return 123.0d;
        }

        @Override
        public String toString() {
            return "123";
        }
    }

    private void assertSerializedNumber(Number value, String expected) throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator generator = new JsonFactory().createGenerator(writer);
        try {
            NumberSerializer.instance.serialize(value, generator, null);
            generator.flush();
            assertEquals(expected, writer.toString());
        } finally {
            generator.close();
        }
    }

    @Test
    public void testSerializeBigDecimal() throws Exception {
        assertSerializedNumber(new BigDecimal("1.25"), "1.25");
    }

    @Test
    public void testSerializeBigInteger() throws Exception {
        assertSerializedNumber(new BigInteger("12345678901234567890"), "12345678901234567890");
    }

    @Test
    public void testSerializeLong() throws Exception {
        assertSerializedNumber(42L, "42");
    }

    @Test
    public void testSerializeDouble() throws Exception {
        assertSerializedNumber(4.5d, "4.5");
    }

    @Test
    public void testSerializeFloat() throws Exception {
        assertSerializedNumber(4.5f, "4.5");
    }

    @Test
    public void testSerializeInteger() throws Exception {
        assertSerializedNumber(42, "42");
    }

    @Test
    public void testSerializeByte() throws Exception {
        assertSerializedNumber((byte) 7, "7");
    }

    @Test
    public void testSerializeShort() throws Exception {
        assertSerializedNumber((short) 8, "8");
    }

    @Test
    public void testSerializeCustomNumberFallsBackToString() throws Exception {
        assertSerializedNumber(new CustomNumber(), "123");
    }

    @Test
    public void testGetSchemaForInteger() {
        JsonNode schema = new NumberSerializer(Integer.class).getSchema(null, null);
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchemaForNonInteger() {
        JsonNode schema = new NumberSerializer(BigDecimal.class).getSchema(null, null);
        assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testAcceptFormatVisitorForInteger() throws Exception {
        TestFormatVisitor visitor = new TestFormatVisitor();
        new NumberSerializer(Integer.class).acceptJsonFormatVisitor(visitor, null);
        assertTrue(visitor.integerVisited);
        assertFalse(visitor.numberVisited);
    }

    @Test
    public void testAcceptFormatVisitorForBigDecimal() throws Exception {
        TestFormatVisitor visitor = new TestFormatVisitor();
        new NumberSerializer(BigDecimal.class).acceptJsonFormatVisitor(visitor, null);
        assertTrue(visitor.numberVisited);
        assertFalse(visitor.integerVisited);
    }

    @Test
    public void testAcceptFormatVisitorForOtherNumber() throws Exception {
        TestFormatVisitor visitor = new TestFormatVisitor();
        new NumberSerializer(Number.class).acceptJsonFormatVisitor(visitor, null);
        assertTrue(visitor.numberVisited);
        assertFalse(visitor.integerVisited);
    }

    @Test
    public void testCreateContextualWithoutConfiguredReturnsSame() throws Exception {
        NumberSerializer serializer = new TestNumberSerializer(Number.class, null);
        assertSame(serializer, serializer.createContextual(null, null));
    }

    @Test
    public void testCreateContextualWithNumberShapeReturnsSame() throws Exception {
        NumberSerializer serializer = new TestNumberSerializer(
                Number.class, JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER));
        assertSame(serializer, serializer.createContextual(null, null));
    }

    @Test
    public void testCreateContextualWithStringShapeUsesToStringSerializer() throws Exception {
        NumberSerializer serializer = new TestNumberSerializer(
                BigDecimal.class, JsonFormat.Value.forShape(JsonFormat.Shape.STRING));
        JsonSerializer<?> result = serializer.createContextual(null, null);
        assertTrue(result instanceof ToStringSerializer);
    }
}