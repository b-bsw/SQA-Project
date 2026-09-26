package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.Converter;

public class StdDelegatingSerializerTest {

    static class TestConverter implements Converter<Object,Object> {
        @Override public Object convert(Object value) { return "converted-"+value; }
        @Override public JavaType getInputType(TypeFactory typeFactory) { return new DummyJavaType(); }
        @Override public JavaType getOutputType(TypeFactory typeFactory) { return new DummyJavaType(); }
    }

    static class DummyJavaType extends JavaType {
        protected DummyJavaType() { super(Object.class, 0, null, null, false); }
        @Override public JavaType withTypeHandler(Object h) { return this; }
        @Override public JavaType withContentTypeHandler(Object h) { return this; }
        @Override public JavaType withValueHandler(Object h) { return this; }
        @Override public JavaType withHandlersFor(Object h) { return this; }
        @Override public JavaType narrowBy(Class<?> cls) { return this; }
        @Override public JavaType forcedNarrowBy(Class<?> cls) { return this; }
        @Override public JavaType widenBy(Class<?> cls) { return this; }
        @Override public JavaType widenBy(JavaType type) { return this; }
        @Override public boolean isAbstract() { return false; }
        @Override public boolean isConcrete() { return true; }
        @Override public boolean isThrowable() { return false; }
        @Override public boolean isArrayType() { return false; }
        @Override public boolean isEnumType() { return false; }
        @Override public boolean isInterface() { return false; }
        @Override public boolean isPrimitive() { return false; }
        @Override public boolean isFinal() { return false; }
        @Override public boolean isContainerType() { return false; }
        @Override public boolean isCollectionLikeType() { return false; }
        @Override public boolean isMapLikeType() { return false; }
        @Override public JavaType getSuperClass() { return null; }
        @Override public JavaType getKeyType() { return null; }
        @Override public JavaType getContentType() { return null; }
        @Override public int containedTypeCount() { return 0; }
        @Override public JavaType containedType(int index) { return null; }
        @Override public String containedTypeName(int index) { return null; }
        @Override public Class<?> getParameterSource() { return null; }
        @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
        @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
        @Override public String toString() { return "dummyJavaType"; }
        @Override public boolean equals(Object o) { return false; }
        @Override public int hashCode() { return 0; }
    }

    static class TestSerializer extends StdSerializer<Object> {
        boolean serializeCalled = false;
        boolean serializeWithTypeCalled = false;
        Object lastValue = null;
        public TestSerializer() {
            super(Object.class);
        }
        @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            serializeCalled = true;
            lastValue = value;
        }
        @Override public void serializeWithType(Object value, JsonGenerator gen, SerializerProvider provider, TypeSerializer typeSer) throws IOException {
            serializeWithTypeCalled = true;
            lastValue = value;
        }
        @Override public boolean isEmpty(SerializerProvider prov, Object value) { return value == null; }
        @Override public boolean isEmpty(Object value) { return value == null; }
    }

    static class TestResolvableSerializer extends TestSerializer implements ResolvableSerializer {
        boolean resolveCalled = false;
        @Override public void resolve(SerializerProvider provider) throws JsonMappingException {
            resolveCalled = true;
        }
    }

    static class TestContextualSerializer extends TestSerializer implements ContextualSerializer {
        boolean contextualizeCalled = false;
        @Override public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException {
            contextualizeCalled = true;
            return this;
        }
    }

    static class TestSchemaAwareSerializer extends TestSerializer implements SchemaAware {
        @Override public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException {
            return new TextNode("schema");
        }
        @Override public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) throws JsonMappingException {
            return getSchema(provider, typeHint);
        }
    }

    static class StubSerializerProvider extends SerializerProvider {
        JsonSerializer<Object> returnedSerializer;
        boolean defaultSerializeNullCalled = false;
        JsonGenerator lastGeneratorForNull;

        protected StubSerializerProvider() {
            super(null, null, null);
        }

        public void setReturnedSerializer(JsonSerializer<Object> ser) { this.returnedSerializer = ser; }

        @Override public JsonSerializer<Object> findValueSerializer(JavaType type) { return returnedSerializer; }
        @Override public JsonSerializer<Object> findValueSerializer(Class<?> type) { return returnedSerializer; }
        @Override public JsonSerializer<Object> findPrimarySerializer(JavaType type) { return returnedSerializer; }
        @Override public JsonSerializer<Object> findTypedValueSerializer(JavaType type, boolean cache) { return returnedSerializer; }
        @Override public JsonSerializer<Object> findTypedValueSerializer(Class<?> type, boolean cache) { return returnedSerializer; }
        @Override public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty prop) { return null; }
        @Override public JsonSerializer<Object> findKeySerializer(Class<?> cls, BeanProperty prop) { return null; }
        @Override public JsonSerializer<Object> findContentValueSerializer(JavaType type, BeanProperty prop) { return null; }
        @Override public JsonSerializer<Object> findContentValueSerializer(Class<?> cls, BeanProperty prop) { return null; }
        @Override public JsonSerializer<Object> findNullValueSerializer(BeanProperty prop) { return null; }
        @Override public JsonSerializer<Object> findNullKeySerializer(JavaType type, BeanProperty prop) { return null; }
        @Override public void defaultSerializeDateValue(long timestamp, JsonGenerator gen) throws IOException {}
        @Override public void defaultSerializeDateValue(Date date, JsonGenerator gen) throws IOException {}
        @Override public void defaultSerializeNull(JsonGenerator gen) throws IOException {
            defaultSerializeNullCalled = true;
            lastGeneratorForNull = gen;
            gen.writeNull();
        }
        @Override public void defaultSerializeDateKey(long timestamp, JsonGenerator gen) throws IOException {}
        @Override public void defaultSerializeDateKey(Date date, JsonGenerator gen) throws IOException {}
        @Override public void defaultSerializeValue(Object value, JsonGenerator gen) throws IOException {}
        @Override public SerializationConfig getConfig() { return null; }
        @Override public TypeFactory getTypeFactory() { return null; }
        @Override public SerializerFactory getSerializerFactory() { return null; }
        @Override public SerializerCache getSerializerCache() { return null; }
        @Override public JsonSerializer<Object> handleSecondaryContextualization(JsonSerializer<?> ser, BeanProperty prop) throws JsonMappingException {
            if (ser instanceof ContextualSerializer) {
                JsonSerializer<?> contextual = ((ContextualSerializer)ser).createContextual(this, prop);
                return (JsonSerializer<Object>) contextual;
            }
            return (JsonSerializer<Object>)ser;
        }
        @Override public JsonSerializer<Object> handlePrimaryContextualization(JsonSerializer<?> ser, BeanProperty prop) throws JsonMappingException { return (JsonSerializer<Object>)ser; }
        @Override public boolean isEnabled(SerializationFeature f) { return false; }
        @Override public boolean isEnabled(DeserializationFeature f) { return false; }
        @Override public boolean isEnabled(MapperFeature f) { return false; }
        @Override public int getSerializationView(Class<?> cls) { return 0; }
        @Override public TimeZone getTimeZone() { return TimeZone.getDefault(); }
        @Override public Locale getLocale() { return Locale.getDefault(); }
        @Override public int getAttributeCount() { return 0; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public SerializationContext getSerializationContext() { return null; }
        @Override public void reportMappingProblem(String msg, Object... args) throws JsonMappingException { throw new JsonMappingException(String.format(msg, args)); }
        @Override public void reportBadPropertyDefinition(BeanDescription beanDesc, String propName, String msg, Object... args) throws JsonMappingException { throw new JsonMappingException(String.format(msg, args)); }
    }

    static class StubJsonGenerator extends JsonGenerator {
        boolean nullWritten = false;
        boolean writeCalled = false;
        @Override public void writeNull() throws IOException { nullWritten = true; }
        @Override public void writeString(String text) throws IOException { writeCalled = true; }
        @Override public JsonGenerator writeStartObject() throws IOException { return this; }
        @Override public JsonGenerator writeStartArray() throws IOException { return this; }
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeFieldName(SerializableString name) throws IOException {}
        @Override public void writeString(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRawUTF8String(byte[] text, int offset, int len) throws IOException {}
        @Override public void writeUTF8String(byte[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(String text) throws IOException {}
        @Override public void writeRaw(String text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char c) throws IOException {}
        @Override public void writeRawValue(String text) throws IOException {}
        @Override public void writeRawValue(String text, int offset, int len) throws IOException {}
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException {}
        @Override public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(BigInteger v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeNumber(BigDecimal v) throws IOException {}
        @Override public void writeNumber(String encodedValue) throws IOException {}
        @Override public void writeObject(Object value) throws IOException {}
        @Override public void writeTree(TreeNode node) throws IOException {}
        @Override public JsonGenerator copy() { return this; }
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public boolean canWriteObjectId() { return false; }
        @Override public boolean canWriteTypeId() { return false; }
        @Override public void writeTypeId(Object id) throws IOException {}
        @Override public void writeObjectRef(Object id) throws IOException {}
        @Override public Version version() { return Version.unknownVersion(); }
        @Override public Object getCurrentValue() { return null; }
        @Override public void setCurrentValue(Object v) {}
        @Override public void close() throws IOException {}
        @Override public void flush() throws IOException {}
        @Override public boolean isClosed() { return false; }
    }

    @Test
    public void testConstructorWithConverter() {
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter());
        assertNotNull(ser.getConverter());
        assertNull(ser.getDelegatee());
    }

    @Test
    public void testConstructorWithClassAndConverter() {
        StdDelegatingSerializer ser = new StdDelegatingSerializer(String.class, new TestConverter());
        assertNotNull(ser.getConverter());
        assertNull(ser.getDelegatee());
        assertEquals(String.class, ser.handledType());
    }

    @Test
    public void testConstructorWithFull() {
        JavaType delegateType = new DummyJavaType();
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), delegateType, delSer);
        assertSame(delSer, ser.getDelegatee());
        assertNotNull(ser.getConverter());
    }

    @Test
    public void testWithDelegate() {
        StdDelegatingSerializer original = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), new TestSerializer());
        StdDelegatingSerializer copy = original.withDelegate(new TestConverter(), new DummyJavaType(), new TestSerializer());
        assertNotSame(original, copy);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithDelegateSubclassThrows() {
        StdDelegatingSerializer subclass = new StdDelegatingSerializer(new TestConverter()) {
        };
        subclass.withDelegate(new TestConverter(), new DummyJavaType(), new TestSerializer());
    }

    @Test
    public void testResolveWhenDelegateSerializerResolvable() throws JsonMappingException {
        TestResolvableSerializer delSer = new TestResolvableSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        ser.resolve(prov);
        assertTrue(delSer.resolveCalled);
    }

    @Test
    public void testResolveWhenDelegateSerializerNotResolvable() throws JsonMappingException {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        ser.resolve(prov);
    }

    @Test
    public void testCreateContextualWhenDelegateSerializerNullAndDelegateTypeNull() throws JsonMappingException {
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter());
        StubSerializerProvider prov = new StubSerializerProvider();
        TestSerializer mockSer = new TestSerializer();
        prov.setReturnedSerializer(mockSer);
        JsonSerializer<?> result = ser.createContextual(prov, null);
        assertNotNull(result);
        assertNotSame(ser, result);
    }

    @Test
    public void testCreateContextualWhenDelegateSerializerNotNullNotContextual() throws JsonMappingException {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        JsonSerializer<?> result = ser.createContextual(prov, null);
        assertSame(ser, result);
    }

    @Test
    public void testCreateContextualWhenDelegateSerializerNotNullContextual() throws JsonMappingException {
        TestContextualSerializer delSer = new TestContextualSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        JsonSerializer<?> result = ser.createContextual(prov, null);
        assertSame(ser, result);
        assertTrue(delSer.contextualizeCalled);
    }

    @Test
    public void testGetConverter() {
        TestConverter conv = new TestConverter();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(conv, new DummyJavaType(), new TestSerializer());
        assertSame(conv, ser.getConverter());
    }

    @Test
    public void testGetDelegatee() {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        assertSame(delSer, ser.getDelegatee());
    }

    @Test
    public void testSerializeNonNullDelegateValue() throws IOException {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubJsonGenerator gen = new StubJsonGenerator();
        StubSerializerProvider prov = new StubSerializerProvider();
        ser.serialize("input", gen, prov);
        assertTrue(delSer.serializeCalled);
        assertEquals("converted-input", delSer.lastValue);
    }

    @Test
    public void testSerializeNullDelegateValue() throws IOException {
        Converter<Object,Object> nullConverter = new Converter<Object,Object>() {
            @Override public Object convert(Object value) { return null; }
            @Override public JavaType getInputType(TypeFactory typeFactory) { return new DummyJavaType(); }
            @Override public JavaType getOutputType(TypeFactory typeFactory) { return new DummyJavaType(); }
        };
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(nullConverter, new DummyJavaType(), delSer);
        StubJsonGenerator gen = new StubJsonGenerator();
        StubSerializerProvider prov = new StubSerializerProvider();
        ser.serialize("input", gen, prov);
        assertTrue(prov.defaultSerializeNullCalled);
        assertFalse(delSer.serializeCalled);
    }

    @Test
    public void testSerializeWithType() throws IOException {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubJsonGenerator gen = new StubJsonGenerator();
        StubSerializerProvider prov = new StubSerializerProvider();
        TypeSerializer typeSer = new TypeSerializer() {
            @Override public TypeSerializer forProperty(BeanProperty prop) { return this; }
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator gen) throws IOException {}
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator gen) throws IOException {}
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator gen) throws IOException {}
            @Override public void writeTypeSuffixForScalar(Object value, JsonGenerator gen) throws IOException {}
            @Override public void writeTypeSuffixForObject(Object value, JsonGenerator gen) throws IOException {}
            @Override public void writeTypeSuffixForArray(Object value, JsonGenerator gen) throws IOException {}
            @Override public void writeTypePrefixForScalar(Object value, JsonGenerator gen, Class<?> type) throws IOException {}
            @Override public void writeTypePrefixForObject(Object value, JsonGenerator gen, Class<?> type) throws IOException {}
            @Override public void writeTypePrefixForArray(Object value, JsonGenerator gen, Class<?> type) throws IOException {}
            @Override public String getPropertyName() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public Class<?> getTypeIdResolverClass() { return null; }
        };
        ser.serializeWithType("input", gen, prov, typeSer);
        assertTrue(delSer.serializeWithTypeCalled);
        assertEquals("converted-input", delSer.lastValue);
    }

    @Test
    public void testIsEmptyDeprecated() {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        assertTrue(ser.isEmpty(null));
        assertFalse(ser.isEmpty("notnull"));
    }

    @Test
    public void testIsEmptyWithProvider() {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        assertTrue(ser.isEmpty(prov, null));
        assertFalse(ser.isEmpty(prov, "notnull"));
    }

    @Test
    public void testGetSchemaWhenDelegateSchemaAware() throws JsonMappingException {
        TestSchemaAwareSerializer delSer = new TestSchemaAwareSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        JsonNode schema = ser.getSchema(prov, null);
        assertNotNull(schema);
    }

    @Test
    public void testGetSchemaWhenDelegateNotSchemaAware() throws JsonMappingException {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        JsonNode schema = ser.getSchema(prov, null);
        assertNotNull(schema);
    }

    @Test
    public void testGetSchemaWithIsOptional() throws JsonMappingException {
        TestSchemaAwareSerializer delSer = new TestSchemaAwareSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        StubSerializerProvider prov = new StubSerializerProvider();
        JsonNode schema = ser.getSchema(prov, null, true);
        assertNotNull(schema);
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws JsonMappingException {
        TestSerializer delSer = new TestSerializer();
        StdDelegatingSerializer ser = new StdDelegatingSerializer(new TestConverter(), new DummyJavaType(), delSer);
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper() {
            @Override public JsonObjectFormatVisitor expectObjectFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonArrayFormatVisitor expectArrayFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNumberFormatVisitor expectNumberFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonIntegerFormatVisitor expectIntegerFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonBooleanFormatVisitor expectBooleanFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonNullFormatVisitor expectNullFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonAnyFormatVisitor expectAnyFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public JsonMapFormatVisitor expectMapFormat(JavaType type) throws JsonMappingException { return null; }
            @Override public SerializerProvider getProvider() { return null; }
        };
        ser.acceptJsonFormatVisitor(visitor, new DummyJavaType());
    }
}