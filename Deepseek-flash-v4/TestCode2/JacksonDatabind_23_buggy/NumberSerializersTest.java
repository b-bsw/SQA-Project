package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

public class NumberSerializersTest {

    @Test
    public void testAddAllPopulatesMap() {
        Map<String, JsonSerializer<?>> serializers = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(serializers);
        assertEquals(12, serializers.size());
        assertTrue(serializers.get(Integer.class.getName()) instanceof IntegerSerializer);
        assertSame(serializers.get(Integer.class.getName()), serializers.get(Integer.TYPE.getName()));
        assertSame(LongSerializer.instance, serializers.get(Long.class.getName()));
        assertSame(LongSerializer.instance, serializers.get(Long.TYPE.getName()));
        assertSame(IntLikeSerializer.instance, serializers.get(Byte.class.getName()));
        assertSame(IntLikeSerializer.instance, serializers.get(Byte.TYPE.getName()));
        assertSame(ShortSerializer.instance, serializers.get(Short.class.getName()));
        assertSame(ShortSerializer.instance, serializers.get(Short.TYPE.getName()));
        assertSame(FloatSerializer.instance, serializers.get(Float.class.getName()));
        assertSame(FloatSerializer.instance, serializers.get(Float.TYPE.getName()));
        assertSame(DoubleSerializer.instance, serializers.get(Double.class.getName()));
        assertSame(DoubleSerializer.instance, serializers.get(Double.TYPE.getName()));
    }

    private String writeValue(JsonSerializer serializer, Object value) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = new JsonFactory().createGenerator(out);
        serializer.serialize(value, gen, null);
        gen.close();
        return out.toString("UTF-8");
    }

    private String writeWithType(JsonSerializer serializer, Object value) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator gen = new JsonFactory().createGenerator(out);
        serializer.serializeWithType(value, gen, null, null);
        gen.close();
        return out.toString("UTF-8");
    }

    @Test
    public void testShortSerializerWritesMinMax() throws Exception {
        assertEquals("-32768", writeValue(new ShortSerializer(), Short.MIN_VALUE));
        assertEquals("32767", writeValue(new ShortSerializer(), Short.MAX_VALUE));
    }

    @Test
    public void testIntegerSerializerWritesValues() throws Exception {
        assertEquals("0", writeValue(new IntegerSerializer(), Integer.valueOf(0)));
        assertEquals("-2147483648", writeValue(new IntegerSerializer(), Integer.MIN_VALUE));
        assertEquals("2147483647", writeValue(new IntegerSerializer(), Integer.MAX_VALUE));
    }

    @Test
    public void testIntLikeSerializerWritesIntValue() throws Exception {
        assertEquals("7", writeValue(IntLikeSerializer.instance, Byte.valueOf((byte) 7)));
        assertEquals("-128", writeValue(IntLikeSerializer.instance, Byte.MIN_VALUE));
    }

    @Test
    public void testLongSerializerWritesMinMax() throws Exception {
        assertEquals("1234567890123", writeValue(LongSerializer.instance, Long.valueOf(1234567890123L)));
        assertEquals("-9223372036854775808", writeValue(LongSerializer.instance, Long.MIN_VALUE));
        assertEquals("9223372036854775807", writeValue(LongSerializer.instance, Long.MAX_VALUE));
    }

    @Test
    public void testFloatSerializerWritesValue() throws Exception {
        assertEquals("1.25", writeValue(FloatSerializer.instance, Float.valueOf(1.25f)));
    }

    @Test
    public void testDoubleSerializerWritesValue() throws Exception {
        assertEquals("2.5", writeValue(DoubleSerializer.instance, Double.valueOf(2.5d)));
    }

    @Test
    public void testSerializeWithTypeDelegatesForIntegerAndDouble() throws Exception {
        IntegerSerializer intSer = new IntegerSerializer();
        assertEquals(writeValue(intSer, 123), writeWithType(intSer, 123));
        DoubleSerializer dblSer = new DoubleSerializer();
        assertEquals(writeValue(dblSer, 1.5d), writeWithType(dblSer, 1.5d));
    }

    @Test
    public void testGetSchemaReturnsType() throws Exception {
        JsonNode intSchema = new IntegerSerializer().getSchema(null, null);
        assertEquals("integer", intSchema.get("type").asText());
        JsonNode numberSchema = new FloatSerializer().getSchema(null, null);
        assertEquals("number", numberSchema.get("type").asText());
    }

    @Test
    public void testCreateContextualReturnsSameWhenPropertyNull() throws Exception {
        IntegerSerializer ser = new IntegerSerializer();
        assertSame(ser, ser.createContextual(null, null));
    }

    @Test
    public void testCreateContextualReturnsSameWhenPropertyHasNoMember() throws Exception {
        BeanProperty property = (BeanProperty) Proxy.newProxyInstance(
                NumberSerializersTest.class.getClassLoader(),
                new Class<?>[] { BeanProperty.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        return null;
                    }
                });
        IntegerSerializer ser = new IntegerSerializer();
        assertSame(ser, ser.createContextual(null, property));
    }

    @Test
    public void testAcceptJsonFormatVisitorUsesIntegerBranch() throws Exception {
        final JsonParser.NumberType[] captured = new JsonParser.NumberType[1];
        JsonFormatVisitorWrapper wrapper = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) {
                return new JsonIntegerFormatVisitor() {
                    @Override
                    public void numberType(JsonParser.NumberType numberType) {
                        captured[0] = numberType;
                    }

                    public void format(JsonValueFormat format) { }

                    public void enumTypes(Set<String> enums) { }
                };
            }
        };
        new IntegerSerializer().acceptJsonFormatVisitor(wrapper, null);
        assertEquals(JsonParser.NumberType.INT, captured[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitorUsesNumberBranch() throws Exception {
        final JsonParser.NumberType[] captured = new JsonParser.NumberType[1];
        JsonFormatVisitorWrapper wrapper = new JsonFormatVisitorWrapper.Base() {
            @Override
            public JsonNumberFormatVisitor expectNumberFormat(JavaType type) {
                return new JsonNumberFormatVisitor() {
                    @Override
                    public void numberType(JsonParser.NumberType numberType) {
                        captured[0] = numberType;
                    }

                    public void format(JsonValueFormat format) { }

                    public void enumTypes(Set<String> enums) { }
                };
            }
        };
        new FloatSerializer().acceptJsonFormatVisitor(wrapper, null);
        assertEquals(JsonParser.NumberType.FLOAT, captured[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitorIgnoresNullVisitorResponses() throws Exception {
        new IntegerSerializer().acceptJsonFormatVisitor(new JsonFormatVisitorWrapper.Base() { }, null);
        new FloatSerializer().acceptJsonFormatVisitor(new JsonFormatVisitorWrapper.Base() { }, null);
    }

    @Test(expected = NullPointerException.class)
    public void testIntegerSerializerRejectsNullValue() throws Exception {
        JsonGenerator gen = new JsonFactory().createGenerator(new ByteArrayOutputStream());
        new IntegerSerializer().serialize(null, gen, null);
    }
}