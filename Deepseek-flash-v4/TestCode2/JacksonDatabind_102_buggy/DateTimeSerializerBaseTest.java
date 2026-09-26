package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeSerializerBaseTest {

    private static class TestSerializer extends DateTimeSerializerBase<Date> {
        public TestSerializer(Boolean useTimestamp, DateFormat customFormat) {
            super(Date.class, useTimestamp, customFormat);
        }
        @Override
        public DateTimeSerializerBase<Date> withFormat(Boolean timestamp, DateFormat customFormat) {
            return new TestSerializer(timestamp, customFormat);
        }
        @Override
        protected long _timestamp(Date value) {
            return value.getTime();
        }
        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        }
    }

    private static class InvalidDateFormat extends DateFormat {
        @Override
        public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
            return null;
        }
        @Override
        public Date parse(String source, ParsePosition pos) {
            return null;
        }
    }

    private TestSerializer serializer;
    private ObjectMapper mapper;
    private SerializerProvider provider;

    @Before
    public void setUp() throws Exception {
        serializer = new TestSerializer(null, null);
        mapper = new ObjectMapper();
        provider = mapper.getSerializerProvider();
    }

    private BeanProperty createProperty(final JsonFormat.Value format) {
        return new BeanProperty() {
            @Override public JsonFormat.Value findFormatOverrides(SerializerProvider prov, Class<?> type) {
                return format;
            }
            @Override public String getName() { return "test"; }
            @Override public JavaType getType() { return null; }
            @Override public PropertyName getFullName() { return new PropertyName("test"); }
            @Override public boolean isRequired() { return false; }
            @Override public PropertyMetadata getMetadata() { return null; }
            @Override public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override public <A extends java.lang.annotation.Annotation> A getContextAnnotation(Class<A> acls) { return null; }
            @Override public com.fasterxml.jackson.databind.util.Annotations getMemberAnnotations() { return null; }
            @Override public AnnotatedMember getMember() { return null; }
        };
    }

    private JsonFormat.Value createFormat(final JsonFormat.Shape shape, final String pattern,
                                          final Locale locale, final TimeZone tz) {
        return new JsonFormat.Value() {
            @Override public JsonFormat.Shape getShape() { return shape; }
            @Override public boolean hasPattern() { return pattern != null; }
            @Override public String getPattern() { return pattern; }
            @Override public boolean hasLocale() { return locale != null; }
            @Override public Locale getLocale() { return locale; }
            @Override public boolean hasTimeZone() { return tz != null; }
            @Override public TimeZone getTimeZone() { return tz; }
        };
    }

    @Test
    public void testCreateContextualPropertyNull() throws JsonMappingException {
        Assert.assertSame(serializer, serializer.createContextual(provider, null));
    }

    @Test
    public void testCreateContextualFormatNull() throws JsonMappingException {
        BeanProperty prop = createProperty(null);
        Assert.assertSame(serializer, serializer.createContextual(provider, prop));
    }

    @Test
    public void testCreateContextualNumericShape() throws JsonMappingException {
        JsonFormat.Value format = createFormat(JsonFormat.Shape.NUMBER, null, null, null);
        BeanProperty prop = createProperty(format);
        DateTimeSerializerBase<Date> result = serializer.createContextual(provider, prop);
        Assert.assertTrue(result._useTimestamp);
        Assert.assertNull(result._customFormat);
    }

    @Test
    public void testCreateContextualWithPattern() throws JsonMappingException {
        JsonFormat.Value format = createFormat(JsonFormat.Shape.STRING, "yyyy-MM-dd", Locale.US, TimeZone.getTimeZone("UTC"));
        BeanProperty prop = createProperty(format);
        DateTimeSerializerBase<Date> result = serializer.createContextual(provider, prop);
        Assert.assertFalse(result._useTimestamp);
        Assert.assertNotNull(result._customFormat);
        Assert.assertTrue(result._customFormat instanceof SimpleDateFormat);
    }

    @Test
    public void testCreateContextualNoChanges() throws JsonMappingException {
        JsonFormat.Value format = createFormat(JsonFormat.Shape.STRING, null, null, null);
        BeanProperty prop = createProperty(format);
        Assert.assertSame(serializer, serializer.createContextual(provider, prop));
    }

    @Test
    public void testCreateContextualStdDateFormat() throws JsonMappingException {
        JsonFormat.Value format = createFormat(JsonFormat.Shape.STRING, null, Locale.GERMANY, TimeZone.getTimeZone("CET"));
        BeanProperty prop = createProperty(format);
        DateTimeSerializerBase<Date> result = serializer.createContextual(provider, prop);
        Assert.assertFalse(result._useTimestamp);
        Assert.assertNotNull(result._customFormat);
        Assert.assertTrue(result._customFormat instanceof StdDateFormat);
    }

    @Test
    public void testCreateContextualSimpleDateFormat() throws JsonMappingException {
        ObjectMapper mapper2 = new ObjectMapper();
        mapper2.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        SerializerProvider customProvider = mapper2.getSerializerProvider();
        JsonFormat.Value format = createFormat(JsonFormat.Shape.STRING, null, Locale.ENGLISH, null);
        BeanProperty prop = createProperty(format);
        DateTimeSerializerBase<Date> result = serializer.createContextual(customProvider, prop);
        Assert.assertFalse(result._useTimestamp);
        Assert.assertNotNull(result._customFormat);
        Assert.assertTrue(result._customFormat instanceof SimpleDateFormat);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateContextualBadDateFormat() throws JsonMappingException {
        ObjectMapper mapper2 = new ObjectMapper();
        mapper2.setDateFormat(new InvalidDateFormat());
        SerializerProvider customProvider = mapper2.getSerializerProvider();
        JsonFormat.Value format = createFormat(JsonFormat.Shape.STRING, null, Locale.ENGLISH, null);
        BeanProperty prop = createProperty(format);
        serializer.createContextual(customProvider, prop);
    }

    @Test
    public void testAsTimestampUseTimestampTrue() {
        TestSerializer s = new TestSerializer(Boolean.TRUE, null);
        Assert.assertTrue(s._asTimestamp(provider));
    }

    @Test
    public void testAsTimestampUseTimestampFalse() {
        TestSerializer s = new TestSerializer(Boolean.FALSE, null);
        Assert.assertFalse(s._asTimestamp(provider));
    }

    @Test
    public void testAsTimestampUseTimestampNullCustomFormatNullSerializersNotNull() {
        Assert.assertTrue(serializer._asTimestamp(provider));
    }

    @Test
    public void testAsTimestampUseTimestampNullCustomFormatNullSerializersNull() {
        try {
            serializer._asTimestamp(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testAsTimestampUseTimestampNullCustomFormatNotNull() {
        TestSerializer s = new TestSerializer(null, new SimpleDateFormat());
        Assert.assertFalse(s._asTimestamp(provider));
    }

    @Test
    public void testIsEmpty() {
        Assert.assertFalse(serializer.isEmpty(provider, new Date()));
    }

    @Test
    public void testGetSchemaAsTimestamp() {
        TestSerializer s = new TestSerializer(Boolean.TRUE, null);
        JsonNode schema = s.getSchema(provider, null);
        Assert.assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testGetSchemaAsString() {
        TestSerializer s = new TestSerializer(Boolean.FALSE, null);
        JsonNode schema = s.getSchema(provider, null);
        Assert.assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitorAsNumber() throws JsonMappingException {
        final boolean[] visitedInt = {false};
        TestSerializer s = new TestSerializer(Boolean.TRUE, null);
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper() {
            @Override public SerializerProvider getProvider() { return provider; }
            @Override public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException {
                visitedInt[0] = true;
                return null;
            }
            @Override public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonObjectFormatVisitor expectObjectFormat(JavaType type) { return null; }
            @Override public JsonArrayFormatVisitor expectArrayFormat(JavaType type) { return null; }
            @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) { return null; }
            @Override public JsonAnyFormatVisitor expectAnyFormat(JavaType type) { return null; }
        };
        s.acceptJsonFormatVisitor(visitor, null);
        Assert.assertTrue(visitedInt[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitorAsString() throws JsonMappingException {
        final boolean[] visitedString = {false};
        TestSerializer s = new TestSerializer(Boolean.FALSE, null);
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper() {
            @Override public SerializerProvider getProvider() { return provider; }
            @Override public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
                visitedString[0] = true;
                return null;
            }
            @Override public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonObjectFormatVisitor expectObjectFormat(JavaType type) { return null; }
            @Override public JsonArrayFormatVisitor expectArrayFormat(JavaType type) { return null; }
            @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) { return null; }
            @Override public JsonAnyFormatVisitor expectAnyFormat(JavaType type) { return null; }
        };
        s.acceptJsonFormatVisitor(visitor, null);
        Assert.assertTrue(visitedString[0]);
    }

    @Test
    public void testSerializeAsStringCustomFormatNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        serializer._serializeAsString(new Date(0), gen, provider);
        gen.flush();
        String output = sw.toString();
        Assert.assertTrue(output.startsWith("\""));
    }

    @Test
    public void testSerializeAsStringCustomFormatNotNull() throws IOException {
        TestSerializer s = new TestSerializer(null, new SimpleDateFormat("yyyy-MM-dd"));
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        s._serializeAsString(new Date(0), gen, provider);
        gen.flush();
        String output = sw.toString();
        Assert.assertTrue(output.startsWith("\""));
        Assert.assertTrue(output.contains("1970"));
    }
}