package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.lang.reflect.Type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

public class NumberSerializerTest {

    // ---------- Stub classes for testing ----------
    private static class BaseStubJsonGenerator extends JsonGenerator {
        @Override public JsonGenerator setCodec(ObjectCodec oc) { return this; }
        @Override public ObjectCodec getCodec() { return null; }
        @Override public Version version() { return null; }
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public void writeStartArray() throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeEndArray() throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeStartObject() throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeEndObject() throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeFieldName(String name) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeFieldName(SerializableString name) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeString(String text) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeString(char[] text, int offset, int len) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeString(SerializableString text) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRaw(String text) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRaw(String text, int offset, int len) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRaw(char c) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRawValue(String text) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRawValue(String text, int offset, int len) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { throw new UnsupportedOperationException(); }
        @Override public int writeBinary(Base64Variant b64variant, java.io.InputStream data, int dataLength) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeBoolean(boolean state) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeNull() throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeObject(Object pojo) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeTree(TreeNode rootNode) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void copyCurrentEvent(com.fasterxml.jackson.core.JsonParser jp) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void copyCurrentStructure(com.fasterxml.jackson.core.JsonParser jp) throws IOException { throw new UnsupportedOperationException(); }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public JsonGenerator setPrettyPrinter(PrettyPrinter pp) { return this; }
        @Override public PrettyPrinter getPrettyPrinter() { return null; }
        @Override public JsonGenerator setHighestEscapedCharacter(int highestNonEscaped) { return this; }
        @Override public int getHighestEscapedCharacter() { return 0; }
        @Override public JsonGenerator setCharacterEscapes(com.fasterxml.jackson.core.io.CharacterEscapes esc) { return this; }
        @Override public com.fasterxml.jackson.core.io.CharacterEscapes getCharacterEscapes() { return null; }
        @Override public JsonGenerator setRootValueSeparator(SerializableString sep) { return this; }
        @Override public void writeEmbeddedObject(Object object) throws IOException { throw new UnsupportedOperationException(); }
        @Override public boolean canWriteObjectId() { return false; }
        @Override public boolean canWriteTypeId() { return false; }
        @Override public boolean canWriteBinaryNatively() { return false; }
        @Override public boolean canOmitFields() { return false; }
        @Override public void writeObjectId(Object id) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeObjectRef(Object id) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeTypeId(Object id) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeStringField(String fieldName, String value) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeBooleanField(String fieldName, boolean value) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeNullField(String fieldName) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeNumberField(String fieldName, int value) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeNumberField(String fieldName, long value) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeNumberField(String fieldName, double value) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeNumberField(String fieldName, float value) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeNumberField(String fieldName, BigDecimal value) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeBinaryField(String fieldName, byte[] data) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeArrayFieldStart(String fieldName) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeObjectFieldStart(String fieldName) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeObjectField(String fieldName, Object pojo) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writePOJOField(String fieldName, Object pojo) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void writeFieldName(SerializedString name) throws IOException { throw new UnsupportedOperationException(); }
        @Override public void flush() throws IOException { }
        @Override public void close() throws IOException { }
        @Override public boolean isClosed() { return false; }
        @Override public Object getCurrentValue() { return null; }
        @Override public void setCurrentValue(Object v) { }
        @Override public void assignCurrentValue(Object v) { }
        @Override public void writeNumber(BigDecimal v) { throw new UnsupportedOperationException(); }
        @Override public void writeNumber(BigInteger v) { throw new UnsupportedOperationException(); }
        @Override public void writeNumber(int v) { throw new UnsupportedOperationException(); }
        @Override public void writeNumber(long v) { throw new UnsupportedOperationException(); }
        @Override public void writeNumber(double v) { throw new UnsupportedOperationException(); }
        @Override public void writeNumber(float v) { throw new UnsupportedOperationException(); }
        @Override public void writeNumber(String v) { throw new UnsupportedOperationException(); }
    }

    private static class BaseStubJsonNumberFormatVisitor implements JsonNumberFormatVisitor {
        @Override public void type(JsonParser.NumberType type) { }
        @Override public void formatValue(JsonValueFormat format) { }
    }

    private static class BaseStubJsonFormatVisitorWrapper implements JsonFormatVisitorWrapper {
        @Override public JsonNumberFormatVisitor expectNumberFormat(JavaType type) { return new BaseStubJsonNumberFormatVisitor(); }
        @Override public JsonObjectFormatVisitor expectObjectFormat(JavaType type) { return null; }
        @Override public JsonArrayFormatVisitor expectArrayFormat(JavaType type) { return null; }
        @Override public JsonStringFormatVisitor expectStringFormat(JavaType type) { return null; }
        @Override public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) { return null; }
        @Override public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) { return null; }
        @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) { return null; }
    }

    // ---------- Serialize tests ----------
    @Test
    public void testSerializeBigDecimal() throws IOException {
        final BigDecimal value = BigDecimal.valueOf(123.456);
        final BigDecimal[] written = new BigDecimal[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(BigDecimal v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals(value, written[0]);
    }

    @Test
    public void testSerializeBigInteger() throws IOException {
        final BigInteger value = BigInteger.valueOf(12345);
        final BigInteger[] written = new BigInteger[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(BigInteger v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        ser.serialize(value, gen, null);
        assertEquals(value, written[0]);
    }

    @Test
    public void testSerializeInteger() throws IOException {
        final Integer value = 42;
        final Integer[] written = new Integer[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(int v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals(value, written[0]);
    }

    @Test
    public void testSerializeLong() throws IOException {
        final Long value = 987654321L;
        final Long[] written = new Long[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(long v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals(value, written[0]);
    }

    @Test
    public void testSerializeDouble() throws IOException {
        final Double value = 3.14159265358979;
        final Double[] written = new Double[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(double v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals(value, written[0]);
    }

    @Test
    public void testSerializeFloat() throws IOException {
        final Float value = 2.71828f;
        final Float[] written = new Float[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(float v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals(value, written[0]);
    }

    @Test
    public void testSerializeByte() throws IOException {
        final Byte value = (byte) 7;
        final Integer[] written = new Integer[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(int v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals(value.intValue(), written[0].intValue());
    }

    @Test
    public void testSerializeShort() throws IOException {
        final Short value = (short) 500;
        final Integer[] written = new Integer[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(int v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals(value.intValue(), written[0].intValue());
    }

    @Test
    public void testSerializeOtherNumber() throws IOException {
        final Number value = new Number() {
            @Override public int intValue() { return 0; }
            @Override public long longValue() { return 0; }
            @Override public float floatValue() { return 0; }
            @Override public double doubleValue() { return 0; }
            @Override public String toString() { return "custom"; }
        };
        final String[] written = new String[1];
        JsonGenerator gen = new BaseStubJsonGenerator() {
            @Override public void writeNumber(String v) { written[0] = v; }
        };
        NumberSerializer ser = new NumberSerializer(Number.class);
        ser.serialize(value, gen, null);
        assertEquals("custom", written[0]);
    }

    // ---------- getSchema tests ----------
    @Test
    public void testGetSchemaIsInt() {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonNode schema = ser.getSchema(null, null);
        assertTrue(schema.isObject());
        assertTrue(schema.has("type"));
        assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testGetSchemaIsNotInt() {
        NumberSerializer ser = new NumberSerializer(Number.class);
        JsonNode schema = ser.getSchema(null, null);
        assertTrue(schema.isObject());
        assertTrue(schema.has("type"));
        assertEquals("number", schema.get("type").asText());
    }

    // ---------- acceptJsonFormatVisitor tests ----------
    @Test
    public void testAcceptJsonFormatVisitorBigInteger() throws JsonMappingException {
        NumberSerializer ser = new NumberSerializer(BigInteger.class);
        JsonFormatVisitorWrapper visitor = new BaseStubJsonFormatVisitorWrapper();
        ser.acceptJsonFormatVisitor(visitor, null);
    }

    @Test
    public void testAcceptJsonFormatVisitorBigDecimal() throws JsonMappingException {
        NumberSerializer ser = new NumberSerializer(BigDecimal.class);
        JsonFormatVisitorWrapper visitor = new BaseStubJsonFormatVisitorWrapper();
        ser.acceptJsonFormatVisitor(visitor, null);
    }

    @Test
    public void testAcceptJsonFormatVisitorOtherNumber() throws JsonMappingException {
        NumberSerializer ser = new NumberSerializer(Number.class);
        JsonFormatVisitorWrapper visitor = new BaseStubJsonFormatVisitorWrapper();
        ser.acceptJsonFormatVisitor(visitor, null);
    }

    // ---------- constructor null rawType ----------
    @Test(expected = NullPointerException.class)
    public void testConstructorNullRawType() {
        new NumberSerializer(null);
    }
}