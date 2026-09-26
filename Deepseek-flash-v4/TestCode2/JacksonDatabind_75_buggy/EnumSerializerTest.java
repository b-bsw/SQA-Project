package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;

public class EnumSerializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
        mapper = null;
    }

    public enum TestEnum {
        A("alpha"), B("beta");

        private final String label;

        TestEnum(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public enum StringShapeEnum {
        A, B
    }

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public enum NumberShapeEnum {
        A, B
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public enum ObjectShapeEnum {
        A, B
    }

    public static class StringShapeWrapper {
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public TestEnum value;

        public StringShapeWrapper(TestEnum value) {
            this.value = value;
        }
    }

    public static class NumberShapeWrapper {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public NumberShapeEnum value;

        public NumberShapeWrapper(NumberShapeEnum value) {
            this.value = value;
        }
    }

    private static JsonFormat.Value annotationValue(Class<?> enumClass) {
        return new JsonFormat.Value(enumClass.getAnnotation(JsonFormat.class));
    }

    @Test
    public void testSerializeDefaultName() throws Exception {
        assertEquals("\"A\"", mapper.writeValueAsString(TestEnum.A));
    }

    @Test
    public void testSerializeWithIndexFeature() throws Exception {
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        assertEquals("0", mapper.writeValueAsString(TestEnum.A));
        assertEquals("1", mapper.writeValueAsString(TestEnum.B));
    }

    @Test
    public void testSerializeWithToStringFeature() throws Exception {
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        assertEquals("\"alpha\"", mapper.writeValueAsString(TestEnum.A));
    }

    @Test
    public void testClassStringShapeOverridesIndexFeature() throws Exception {
        assertEquals("\"A\"", mapper.writeValueAsString(StringShapeEnum.A));
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        assertEquals("\"A\"", mapper.writeValueAsString(StringShapeEnum.A));
    }

    @Test
    public void testClassNumberShapeUsesOrdinal() throws Exception {
        assertEquals("0", mapper.writeValueAsString(NumberShapeEnum.A));
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        assertEquals("1", mapper.writeValueAsString(NumberShapeEnum.B));
    }

    @Test
    public void testPropertyNumberOverridesDefault() throws Exception {
        assertEquals("{\"value\":0}", mapper.writeValueAsString(new StringShapeWrapper(TestEnum.A)));
    }

    @Test
    public void testPropertyStringOverridesClassNumber() throws Exception {
        assertEquals("{\"value\":\"A\"}", mapper.writeValueAsString(new NumberShapeWrapper(NumberShapeEnum.A)));
    }

    @Test
    public void testCreateContextualNullPropertyReturnsSame() throws Exception {
        EnumSerializer serializer = EnumSerializer.construct(TestEnum.class, mapper.getSerializationConfig(), null, null);
        assertSame(serializer, serializer.createContextual(mapper.getSerializerProvider(), null));
    }

    @Test
    public void testGetEnumValues() {
        EnumSerializer serializer = EnumSerializer.construct(TestEnum.class, mapper.getSerializationConfig(), null, null);
        assertNotNull(serializer.getEnumValues());
    }

    @Test
    public void testGetSchemaStringWithEnumNames() throws Exception {
        EnumSerializer ser = EnumSerializer.construct(TestEnum.class, mapper.getSerializationConfig(), null, null);
        JsonNode schema = ser.getSchema(mapper.getSerializerProvider(), TestEnum.class);
        assertEquals("string", schema.get("type").asText());
        assertTrue(schema.has("enum"));
        assertEquals(2, schema.get("enum").size());
        assertEquals("A", schema.get("enum").get(0).asText());
        assertEquals("B", schema.get("enum").get(1).asText());
    }

    @Test
    public void testGetSchemaIndexForNumberShape() throws Exception {
        EnumSerializer ser = EnumSerializer.construct(NumberShapeEnum.class, mapper.getSerializationConfig(),
                null, annotationValue(NumberShapeEnum.class));
        JsonNode schema = ser.getSchema(mapper.getSerializerProvider(), NumberShapeEnum.class);
        assertEquals("integer", schema.get("type").asText());
        assertFalse(schema.has("enum"));
    }

    @Test
    public void testGetSchemaNullTypeHint() throws Exception {
        EnumSerializer ser = EnumSerializer.construct(TestEnum.class, mapper.getSerializationConfig(), null, null);
        JsonNode schema = ser.getSchema(mapper.getSerializerProvider(), null);
        assertEquals("string", schema.get("type").asText());
        assertFalse(schema.has("enum"));
    }

    @Test
    public void testAcceptJsonFormatVisitorStringNames() throws Exception {
        EnumSerializer ser = EnumSerializer.construct(TestEnum.class, mapper.getSerializationConfig(), null, null);
        TestJsonFormatVisitorWrapper visitor = new TestJsonFormatVisitorWrapper(mapper.getSerializerProvider());
        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(TestEnum.class));
        assertTrue(visitor.stringCalled);
        assertFalse(visitor.integerCalled);
        assertNotNull(visitor.stringEnums);
        assertEquals(2, visitor.stringEnums.size());
        assertTrue(visitor.stringEnums.contains("A"));
        assertTrue(visitor.stringEnums.contains("B"));
    }

    @Test
    public void testAcceptJsonFormatVisitorIndex() throws Exception {
        EnumSerializer ser = EnumSerializer.construct(NumberShapeEnum.class, mapper.getSerializationConfig(),
                null, annotationValue(NumberShapeEnum.class));
        TestJsonFormatVisitorWrapper visitor = new TestJsonFormatVisitorWrapper(mapper.getSerializerProvider());
        ser.acceptJsonFormatVisitor(visitor, mapper.constructType(NumberShapeEnum.class));
        assertTrue(visitor.integerCalled);
        assertFalse(visitor.stringCalled);
        assertEquals(JsonParser.NumberType.INT, visitor.integerType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithUnsupportedShape() {
        EnumSerializer.construct(ObjectShapeEnum.class, mapper.getSerializationConfig(),
                null, annotationValue(ObjectShapeEnum.class));
    }

    private static final class TestJsonFormatVisitorWrapper implements JsonFormatVisitorWrapper {
        private final SerializerProvider provider;
        private Set<String> stringEnums;
        private boolean stringCalled;
        private boolean integerCalled;
        private JsonParser.NumberType integerType;

        TestJsonFormatVisitorWrapper(SerializerProvider provider) {
            this.provider = provider;
        }

        public SerializerProvider getProvider() {
            return provider;
        }

        public JsonStringFormatVisitor expectStringFormat(JavaType type) {
            stringCalled = true;
            return new JsonStringFormatVisitor() {
                public void enumTypes(Set<String> enums) {
                    stringEnums = enums;
                }

                public void format(String format) {
                    // no-op
                }
            };
        }

        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
            integerCalled = true;
            return new JsonIntegerFormatVisitor() {
                public void numberType(JsonParser.NumberType type) {
                    integerType = type;
                }

                public void enumTypes(Set<String> enums) {
                    // no-op
                }

                public void format(String format) {
                    // no-op
                }
            };
        }

        public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
            return null;
        }

        public JsonArrayFormatVisitor expectArrayFormat(JavaType type) {
            return null;
        }

        public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
            return null;
        }

        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) {
            return null;
        }

        public JsonNullFormatVisitor expectNullFormat(JavaType type) {
            return null;
        }

        public JsonAnyFormatVisitor expectAnyFormat(JavaType type) {
            return null;
        }
    }
}