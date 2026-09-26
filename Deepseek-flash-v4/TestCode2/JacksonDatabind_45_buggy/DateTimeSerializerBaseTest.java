package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;

@SuppressWarnings({ "unchecked", "deprecation" })
public class DateTimeSerializerBaseTest {

    static class ConcreteDateTimeSerializer<T> extends DateTimeSerializerBase<T> {
        private final Class<T> type;

        ConcreteDateTimeSerializer(Class<T> type, Boolean useTimestamp, DateFormat customFormat) {
            super(type, useTimestamp, customFormat);
            this.type = type;
        }

        @Override
        public DateTimeSerializerBase<T> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new ConcreteDateTimeSerializer<T>(type, timestamp, customFormat);
        }

        @Override
        protected long _timestamp(T value) {
            if (value instanceof Number) {
                return ((Number) value).longValue();
            }
            if (value instanceof java.util.Date) {
                return ((java.util.Date) value).getTime();
            }
            return 0L;
        }

        @Override
        public void serialize(T value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value == null) {
                gen.writeNull();
            } else {
                gen.writeNumber(_timestamp(value));
            }
        }
    }

    static class FixedFormatAnnotationIntrospector extends JacksonAnnotationIntrospector {
        private final JsonFormat.Value format;

        FixedFormatAnnotationIntrospector(JsonFormat.Value format) {
            this.format = format;
        }

        @Override
        public JsonFormat.Value findFormat(Annotated annotated) {
            return format;
        }
    }

    static class IntVisitor implements JsonIntegerFormatVisitor {
        JsonParser.NumberType numberType;
        JsonValueFormat format;

        @Override
        public void numberType(JsonParser.NumberType numberType) {
            this.numberType = numberType;
        }

        @Override
        public void format(JsonValueFormat format) {
            this.format = format;
        }
    }

    static class StringVisitor implements JsonStringFormatVisitor {
        JsonValueFormat format;

        @Override
        public void format(JsonValueFormat format) {
            this.format = format;
        }
    }

    static class TestJsonFormatVisitorWrapper extends JsonFormatVisitorWrapper.Base {
        final IntVisitor intVisitor = new IntVisitor();
        final StringVisitor stringVisitor = new StringVisitor();

        TestJsonFormatVisitorWrapper(SerializerProvider provider) {
            setProvider(provider);
        }

        @Override
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            return intVisitor;
        }

        @Override
        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            return stringVisitor;
        }
    }

    private static SerializerProvider providerWithFormat(JsonFormat.Value format) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setAnnotationIntrospector(new FixedFormatAnnotationIntrospector(format));
        return mapper.getSerializerProviderInstance();
    }

    private static SerializerProvider providerWithDatesAsTimestamps(boolean enabled) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, enabled);
        return mapper.getSerializerProviderInstance();
    }

    @Test
    public void testCreateContextualNullPropertyReturnsThis() throws Exception {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);
        assertSame(ser, ser.createContextual(null, null));
    }

    @Test
    public void testCreateContextualNullFormatReturnsThis() throws Exception {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);
        SerializerProvider provider = providerWithFormat(null);
        BeanProperty property = new BeanProperty.Std("prop", null, null, null, false);
        assertSame(ser, ser.createContextual(provider, property));
    }

    @Test
    public void testCreateContextualNumericShape() throws Exception {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);
        SerializerProvider provider = providerWithFormat(JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER));
        BeanProperty property = new BeanProperty.Std("prop", null, null, null, false);

        DateTimeSerializerBase<Object> result = (DateTimeSerializerBase<Object>) ser.createContextual(provider, property);

        assertNotSame(ser, result);
        assertEquals(Boolean.TRUE, result._useTimestamp);
        assertNull(result._customFormat);
    }

    @Test
    public void testCreateContextualStringShape() throws Exception {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);
        SerializerProvider provider = providerWithFormat(JsonFormat.Value.forShape(JsonFormat.Shape.STRING));
        BeanProperty property = new BeanProperty.Std("prop", null, null, null, false);

        DateTimeSerializerBase<Object> result = (DateTimeSerializerBase<Object>) ser.createContextual(provider, property);

        assertNotSame(ser, result);
        assertEquals(Boolean.FALSE, result._useTimestamp);
        assertNotNull(result._customFormat);
        assertTrue(result._customFormat instanceof SimpleDateFormat);
        assertEquals(StdDateFormat.DATE_FORMAT_STR_ISO8601, ((SimpleDateFormat) result._customFormat).toPattern());
    }

    @Test
    public void testCreateContextualNonNumericNonStringShapeReturnsThis() throws Exception {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);
        SerializerProvider provider = providerWithFormat(JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT));
        BeanProperty property = new BeanProperty.Std("prop", null, null, null, false);
        assertSame(ser, ser.createContextual(provider, property));
    }

    @Test
    public void testAsTimestampExplicitValues() {
        DateTimeSerializerBase<Object> serTrue = new ConcreteDateTimeSerializer<Object>(Object.class, Boolean.TRUE, null);
        DateTimeSerializerBase<Object> serFalse = new ConcreteDateTimeSerializer<Object>(Object.class, Boolean.FALSE, null);

        assertTrue(serTrue._asTimestamp(null));
        assertFalse(serFalse._asTimestamp(null));
    }

    @Test
    public void testAsTimestampUsesProviderWhenNoFormat() {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);

        assertTrue(ser._asTimestamp(providerWithDatesAsTimestamps(true)));
        assertFalse(ser._asTimestamp(providerWithDatesAsTimestamps(false)));
    }

    @Test
    public void testAsTimestampWithCustomFormat() {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, new SimpleDateFormat("yyyy-MM-dd"));
        assertFalse(ser._asTimestamp(null));
    }

    @Test
    public void testAsTimestampNullProviderThrows() {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);

        try {
            ser._asTimestamp(null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Null SerializerProvider"));
        }
    }

    @Test
    public void testIsEmpty() {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);

        assertTrue(ser.isEmpty(null));
        assertTrue(ser.isEmpty(0L));
        assertTrue(ser.isEmpty(null, 0L));
        assertFalse(ser.isEmpty(null, 1L));
    }

    @Test
    public void testGetSchema() {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, null, null);

        JsonNode numberSchema = ser.getSchema(providerWithDatesAsTimestamps(true), Object.class);
        assertEquals("number", numberSchema.get("type").asText());

        JsonNode stringSchema = ser.getSchema(providerWithDatesAsTimestamps(false), Object.class);
        assertEquals("string", stringSchema.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitorNumber() throws Exception {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, Boolean.TRUE, null);
        TestJsonFormatVisitorWrapper visitor = new TestJsonFormatVisitorWrapper(null);

        ser.acceptJsonFormatVisitor(visitor, null);

        assertEquals(JsonParser.NumberType.LONG, visitor.intVisitor.numberType);
        assertEquals(JsonValueFormat.UTC_MILLISEC, visitor.intVisitor.format);
    }

    @Test
    public void testAcceptJsonFormatVisitorString() throws Exception {
        DateTimeSerializerBase<Object> ser = new ConcreteDateTimeSerializer<Object>(Object.class, Boolean.FALSE, null);
        TestJsonFormatVisitorWrapper visitor = new TestJsonFormatVisitorWrapper(null);

        ser.acceptJsonFormatVisitor(visitor, null);

        assertEquals(JsonValueFormat.DATE_TIME, visitor.stringVisitor.format);
    }
}