package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DateTimeSerializerBaseTest {

    // Annotated markers used to create JsonFormat.Value instances
    static class FormatAnnotations {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
        public static Long number;

        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public static Long string;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "fr_FR")
        public static Long stringPattern;

        @JsonFormat(shape = JsonFormat.Shape.ANY)
        public static Long any;
    }

    static class TestingSerializer extends DateTimeSerializerBase<Long> {

        private JsonFormat.Value formatOverride;

        TestingSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Long.class, useTimestamp, customFormat);
        }

        void setFormatOverride(JsonFormat.Value format) {
            this.formatOverride = format;
        }

        @Override
        public TestingSerializer withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestingSerializer(timestamp, customFormat);
        }

        @Override
        public void serialize(Long value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        }

        @Override
        protected JsonFormat.Value findFormatOverrides(SerializerProvider serializers,
                BeanProperty property, Class<?> type) {
            return formatOverride;
        }

        Boolean useTimestamp() {
            return _useTimestamp;
        }

        DateFormat customFormat() {
            return _customFormat;
        }
    }

    private static JsonFormat.Value formatValue(String fieldName) throws Exception {
        Field field = FormatAnnotations.class.getField(fieldName);
        return JsonFormat.Value.from(field.getAnnotation(JsonFormat.class));
    }

    private static BeanProperty dummyProperty() {
        return new BeanProperty.Std("prop", null, null, null, null);
    }

    // ----------------------------------------------------------
    // _asTimestamp / useTimestamp behavior
    // ----------------------------------------------------------

    @Test
    public void testAsTimestampUsesExplicitBooleanTrue() {
        TestingSerializer serializer = new TestingSerializer(Boolean.TRUE, null);
        assertTrue(serializer.asTimestamp());
    }

    @Test
    public void testAsTimestampUsesExplicitBooleanFalse() {
        TestingSerializer serializer = new TestingSerializer(Boolean.FALSE, null);
        assertFalse(serializer.asTimestamp());
    }

    @Test
    public void testAsTimestampNullDefaultsToTrue() {
        TestingSerializer serializer = new TestingSerializer(null, null);
        assertTrue(serializer.asTimestamp());
    }

    @Test
    public void testAsTimestampUsesSerializationFeature() {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        TestingSerializer trueSerializer = new TestingSerializer(null, null);
        assertTrue(trueSerializer.asTimestamp());

        ObjectMapper falseMapper = new ObjectMapper();
        falseMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        TestingSerializer falseSerializer = new TestingSerializer(null, null);
        assertFalse(falseSerializer.asTimestamp());
    }

    // ----------------------------------------------------------
    // createContextual
    // ----------------------------------------------------------

    @Test
    public void testCreateContextualNullPropertyReturnsSame() throws Exception {
        TestingSerializer serializer = new TestingSerializer(Boolean.FALSE, null);
        assertSame(serializer, serializer.createContextual(null, null));
    }

    @Test
    public void testCreateContextualNullFormatReturnsSame() throws Exception {
        TestingSerializer serializer = new TestingSerializer(Boolean.FALSE, null);
        assertSame(serializer, serializer.createContextual(null, dummyProperty()));
    }

    @Test
    public void testCreateContextualNumericShapeEnablesTimestamp() throws Exception {
        TestingSerializer serializer = new TestingSerializer(null, null);
        serializer.setFormatOverride(formatValue("number"));

        JsonSerializer<?> result = serializer.createContextual(null, dummyProperty());

        assertTrue(result instanceof TestingSerializer);
        TestingSerializer converted = (TestingSerializer) result;
        assertEquals(Boolean.TRUE, converted.useTimestamp());
        assertNull(converted.customFormat());
    }

    @Test
    public void testCreateContextualStringShapeEnablesTimestamp() throws Exception {
        TestingSerializer serializer = new TestingSerializer(null, null);
        serializer.setFormatOverride(formatValue("string"));

        JsonSerializer<?> result = serializer.createContextual(null, dummyProperty());

        assertTrue(result instanceof TestingSerializer);
        TestingSerializer converted = (TestingSerializer) result;
        assertEquals(Boolean.TRUE, converted.useTimestamp());
        assertNull(converted.customFormat());
    }

    @Test
    public void testCreateContextualPatternCreatesCustomFormat() throws Exception {
        TestingSerializer serializer = new TestingSerializer(null, null);
        serializer.setFormatOverride(formatValue("stringPattern"));

        JsonSerializer<?> result = serializer.createContextual(null, dummyProperty());

        assertTrue(result instanceof TestingSerializer);
        TestingSerializer converted = (TestingSerializer) result;
        assertEquals(Boolean.FALSE, converted.useTimestamp());
        assertNotNull(converted.customFormat());
        assertTrue(converted.customFormat() instanceof SimpleDateFormat);
        assertEquals("yyyy-MM-dd", ((SimpleDateFormat) converted.customFormat()).toPattern());
    }

    @Test
    public void testCreateContextualAnyShapeReturnsSame() throws Exception {
        TestingSerializer serializer = new TestingSerializer(null, null);
        serializer.setFormatOverride(formatValue("any"));

        JsonSerializer<?> result = serializer.createContextual(null, dummyProperty());

        assertSame(serializer, result);
    }
}