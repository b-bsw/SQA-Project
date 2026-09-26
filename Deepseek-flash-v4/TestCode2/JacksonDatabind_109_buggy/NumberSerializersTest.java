package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class NumberSerializersTest {

    private String serialize(JsonSerializer<?> ser, Object value) throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        try {
            ser.serialize(value, gen, null);
            gen.flush();
        } finally {
            gen.close();
        }
        return sw.toString();
    }

    private String serializeWithType(JsonSerializer<?> ser, Object value) throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        try {
            ser.serializeWithType(value, gen, null, null);
            gen.flush();
        } finally {
            gen.close();
        }
        return sw.toString();
    }

    @Test
    public void testAddAll() {
        Map<String, JsonSerializer<?>> map = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(map);
        assertEquals(12, map.size());
        assertTrue(map.get(Integer.class.getName()) instanceof NumberSerializers.IntegerSerializer);
        assertTrue(map.get(Integer.TYPE.getName()) instanceof NumberSerializers.IntegerSerializer);
        assertTrue(map.get(Long.class.getName()) instanceof NumberSerializers.LongSerializer);
        assertTrue(map.get(Long.TYPE.getName()) instanceof NumberSerializers.LongSerializer);
        assertTrue(map.get(Byte.class.getName()) instanceof NumberSerializers.IntLikeSerializer);
        assertTrue(map.get(Byte.TYPE.getName()) instanceof NumberSerializers.IntLikeSerializer);
        assertTrue(map.get(Short.class.getName()) instanceof NumberSerializers.ShortSerializer);
        assertTrue(map.get(Short.TYPE.getName()) instanceof NumberSerializers.ShortSerializer);
        assertTrue(map.get(Double.class.getName()) instanceof NumberSerializers.DoubleSerializer);
        assertTrue(map.get(Double.TYPE.getName()) instanceof NumberSerializers.DoubleSerializer);
        assertTrue(map.get(Float.class.getName()) instanceof NumberSerializers.FloatSerializer);
        assertTrue(map.get(Float.TYPE.getName()) instanceof NumberSerializers.FloatSerializer);
    }

    @Test(expected = NullPointerException.class)
    public void testAddAllNullMap() {
        NumberSerializers.addAll(null);
    }

    @Test
    public void testIntegerSerializerSerialize() throws Exception {
        assertEquals("42", serialize(new NumberSerializers.IntegerSerializer(Integer.class), 42));
    }

    @Test
    public void testIntegerSerializerSerializeWithType() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        assertEquals("42", serializeWithType(ser, 42));
    }

    @Test
    public void testLongSerializerSerialize() throws Exception {
        NumberSerializers.LongSerializer ser = new NumberSerializers.LongSerializer(Long.class);
        assertEquals("123456789", serialize(ser, 123456789L));
    }

    @Test
    public void testShortSerializerSerialize() throws Exception {
        NumberSerializers.ShortSerializer ser = new NumberSerializers.ShortSerializer();
        assertEquals("7", serialize(ser, Short.valueOf((short) 7)));
    }

    @Test
    public void testIntLikeSerializerSerialize() throws Exception {
        NumberSerializers.IntLikeSerializer ser = new NumberSerializers.IntLikeSerializer();
        assertEquals("8", serialize(ser, Byte.valueOf((byte) 8)));
    }

    @Test
    public void testFloatSerializerSerialize() throws Exception {
        NumberSerializers.FloatSerializer ser = new NumberSerializers.FloatSerializer();
        assertEquals("3.14", serialize(ser, 3.14f));
    }

    @Test
    public void testDoubleSerializerSerialize() throws Exception {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        assertEquals("3.14159", serialize(ser, 3.14159d));
    }

    @Test
    public void testDoubleSerializerSerializeWithType() throws Exception {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        assertEquals("2.5", serializeWithType(ser, 2.5d));
    }

    @Test(expected = NullPointerException.class)
    public void testSerializeNullIntegerThrowsNullPointer() throws Exception {
        serialize(new NumberSerializers.IntegerSerializer(Integer.class), null);
    }

    @Test
    public void testGetSchemaInteger() {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        JsonNode node = ((NumberSerializers.Base<?>) ser).getSchema(null, null);
        assertTrue(node.isObject());
        assertEquals("integer", node.get("type").asText());
    }

    @Test
    public void testGetSchemaDouble() {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        JsonNode node = ((NumberSerializers.Base<?>) ser).getSchema(null, null);
        assertTrue(node.isObject());
        assertEquals("number", node.get("type").asText());
    }

    @Test
    public void testAcceptJsonFormatVisitorForInteger() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        final boolean[] visited = new boolean[1];
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                visited[0] = true;
                return null;
            }
        };
        ser.acceptJsonFormatVisitor(visitor,
                TypeFactory.defaultInstance().constructType(Integer.class));
        assertTrue(visited[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitorForDouble() throws Exception {
        NumberSerializers.DoubleSerializer ser = new NumberSerializers.DoubleSerializer(Double.class);
        final boolean[] visited = new boolean[1];
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                visited[0] = true;
                return null;
            }
        };
        ser.acceptJsonFormatVisitor(visitor,
                TypeFactory.defaultInstance().constructType(Double.class));
        assertTrue(visited[0]);
    }

    @Test
    public void testCreateContextualReturnsSameWhenNoFormat() throws Exception {
        NumberSerializers.IntegerSerializer ser = new NumberSerializers.IntegerSerializer(Integer.class);
        assertSame(ser, ser.createContextual(null, null));
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public static class StringBean {
        public Integer value;
    }

    @Test
    public void testIntegerSerializerUsesStringWhenJsonFormatString() throws Exception {
        StringBean bean = new StringBean();
        bean.value = 42;
        String json = new ObjectMapper().writeValueAsString(bean);
        assertEquals("{\"value\":\"42\"}", json);
    }
}