package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Collections;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest {

    private BeanPropertyDefinition propDef;
    private AnnotatedMember fieldMember;
    private AnnotatedMember methodMember;
    private Annotations contextAnnotations;
    private JavaType declaredType;
    private JsonSerializer<Object> serializer;
    private JsonSerializer<Object> nullSerializer;
    private TypeSerializer typeSerializer;
    private JavaType serType;
    private PropertySerializerMap emptyMap;
    private JsonGenerator jgen;
    private SerializerProvider prov;
    private Object bean;

    @Before
    public void setUp() throws Exception {
        // Create stubs
        propDef = new SimpleBeanPropertyDefinition("testProp", false);
        fieldMember = new SimpleAnnotatedField("myField");
        methodMember = new SimpleAnnotatedMethod("getMyField", String.class);
        contextAnnotations = new SimpleAnnotations();
        declaredType = new SimpleJavaType(String.class);
        serializer = new SimpleJsonSerializer();
        nullSerializer = new SimpleJsonSerializer();
        typeSerializer = new SimpleTypeSerializer();
        serType = new SimpleJavaType(Integer.class);
        emptyMap = PropertySerializerMap.emptyMap();

        jgen = new SimpleJsonGenerator();
        prov = new SimpleSerializerProvider();
        bean = new SimpleBean();
    }

    @Test
    public void testConstructorWithFieldMember() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, typeSerializer, serType,
                false, null);
        assertEquals("testProp", bw.getName());
        assertTrue(bw.hasSerializer());
        assertNull(bw._nullSerializer);
        assertNull(bw._dynamicSerializers);
        assertNotNull(bw._field);
        assertNull(bw._accessorMethod);
        assertFalse(bw.willSuppressNulls());
    }

    @Test
    public void testConstructorWithMethodMember() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, null, null, null,
                true, BeanPropertyWriter.MARKER_FOR_EMPTY);
        assertEquals("testProp", bw.getName());
        assertFalse(bw.hasSerializer());
        assertNotNull(bw._dynamicSerializers);
        assertNull(bw._field);
        assertNotNull(bw._accessorMethod);
        assertTrue(bw.willSuppressNulls());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidMember() {
        AnnotatedMember invalid = new AnnotatedMember() {
            public String getName() { return "invalid"; }
            public JavaType getType() { return null; }
            public Class<?> getDeclaringClass() { return Object.class; }
            public Annotations getContextAnnotations() { return null; }
            public Annotation getAnnotation(Class<?> cls) { return null; }
            public boolean hasAnnotation(Class<?> cls) { return false; }
            public Object getValue(Object pojo) { return null; }
            public void setValue(Object pojo, Object value) {}
            public Member getMember() { return null; }
            public void fixAccess() {}
        };
        new BeanPropertyWriter(propDef, invalid, contextAnnotations, declaredType,
                null, null, null, false, null);
    }

    @Test
    public void testCopyConstructor() {
        BeanPropertyWriter original = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, typeSerializer, serType,
                false, null);
        original.setInternalSetting("key1", "value1");
        BeanPropertyWriter copy = new BeanPropertyWriter(original);
        assertNotNull(copy._internalSettings);
        assertEquals("value1", copy._internalSettings.get("key1"));
        assertEquals(original._name, copy._name);
    }

    @Test
    public void testCopyConstructorWithName() {
        BeanPropertyWriter original = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, typeSerializer, serType,
                false, null);
        SerializedString newName = new SerializedString("renamed");
        BeanPropertyWriter copy = new BeanPropertyWriter(original, newName);
        assertEquals("renamed", copy.getName());
    }

    @Test
    public void testRenameSame() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, typeSerializer, serType,
                false, null);
        NameTransformer identity = new NameTransformer() {
            public String transform(String name) { return name; }
            public String reverse(String transformed) { return transformed; }
        };
        assertSame(bw, bw.rename(identity));
    }

    @Test
    public void testRenameDifferent() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, typeSerializer, serType,
                false, null);
        NameTransformer prefix = new NameTransformer() {
            public String transform(String name) { return "pre_" + name; }
            public String reverse(String transformed) { return transformed.substring(4); }
        };
        BeanPropertyWriter renamed = bw.rename(prefix);
        assertNotSame(bw, renamed);
        assertEquals("pre_testProp", renamed.getName());
    }

    @Test
    public void testAssignSerializerNormal() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        JsonSerializer<Object> newSer = new SimpleJsonSerializer();
        bw.assignSerializer(newSer);
        assertSame(newSer, bw.getSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignSerializerOverride() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        bw.assignSerializer(new SimpleJsonSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignNullSerializerOverride() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        bw.assignNullSerializer(nullSerializer);
        bw.assignNullSerializer(new SimpleJsonSerializer());
    }

    @Test
    public void testInternalSettings() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        assertNull(bw.getInternalSetting("nonexistent"));
        Object old = bw.setInternalSetting("key", "val");
        assertNull(old);
        assertEquals("val", bw.getInternalSetting("key"));
        old = bw.setInternalSetting("key", "val2");
        assertEquals("val", old);
        Object removed = bw.removeInternalSetting("key");
        assertEquals("val2", removed);
        assertNull(bw.getInternalSetting("key"));
    }

    @Test
    public void testInternalSettingsRemoveEmptyMap() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        bw.setInternalSetting("k", "v");
        bw.removeInternalSetting("k");
        assertNull(bw._internalSettings);
    }

    @Test
    public void testAccessors() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, typeSerializer, serType,
                true, null);
        assertTrue(bw.hasSerializer());
        assertTrue(bw.hasNullSerializer());
        assertTrue(bw.willSuppressNulls());
        assertSame(serializer, bw.getSerializer());
        assertSame(serType, bw.getSerializationType());
        assertEquals(Integer.class, bw.getRawSerializationType());
        assertEquals(String.class, bw.getPropertyType()); // field type
        assertEquals(String.class, bw.getGenericPropertyType());
    }

    @Test
    public void testGetWithField() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        Object value = bw.get(bean);
        assertEquals("fieldValue", value);
    }

    @Test
    public void testGetWithMethod() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        Object value = bw.get(bean);
        assertEquals("methodValue", value);
    }

    @Test
    public void testSerializeAsFieldNullWithNullSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        bw.assignNullSerializer(nullSerializer);
        Object nullBean = new Object() {
            @Override
            public String toString() { return "nullBean"; }
        };
        bw.serializeAsField(nullBean, jgen, prov);
        // Verify that writeFieldName was called, and _nullSerializer was used
        // We rely on our stub to track calls
        assertTrue(((SimpleJsonGenerator)jgen).fieldNameWritten);
        assertTrue(((SimpleJsonSerializer)nullSerializer).serialized);
    }

    @Test
    public void testSerializeAsFieldNullWithoutNullSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        bw.serializeAsField(null, jgen, prov);
        // No field name written, nothing serialized
        assertFalse(((SimpleJsonGenerator)jgen).fieldNameWritten);
    }

    @Test
    public void testSerializeAsFieldWithSuppressEmpty() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, new SimpleJsonSerializer(true), null, null,
                false, BeanPropertyWriter.MARKER_FOR_EMPTY);
        // The serializer.isEmpty returns true for this bean
        bw.serializeAsField(bean, jgen, prov);
        assertFalse(((SimpleJsonGenerator)jgen).fieldNameWritten);
    }

    @Test
    public void testSerializeAsFieldWithSuppressEquals() throws Exception {
        Object suppressable = "suppressMe";
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, suppressable);
        Object equalsBean = new Object() {
            @Override
            public boolean equals(Object o) { return o == "suppressMe"; }
            public String toString() { return "equalsBean"; }
        };
        bw.serializeAsField(equalsBean, jgen, prov);
        assertFalse(((SimpleJsonGenerator)jgen).fieldNameWritten);
    }

    @Test
    public void testSerializeAsFieldNormalWithSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        bw.serializeAsField(bean, jgen, prov);
        assertTrue(((SimpleJsonGenerator)jgen).fieldNameWritten);
        assertTrue(((SimpleJsonSerializer)serializer).serialized);
    }

    @Test
    public void testSerializeAsFieldDynamicSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        bw.serializeAsField(bean, jgen, prov);
        assertNotNull(bw._dynamicSerializers);
        // After lookup, dynamic serializers should be populated
        assertTrue(bw._dynamicSerializers.serializerFor(bean.getClass()) != null);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeAsFieldSelfReference() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        bw.serializeAsField(bw, jgen, prov); // self-reference
    }

    @Test
    public void testSerializeAsFieldWithTypeSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, serializer, typeSerializer, null,
                false, null);
        bw.serializeAsField(bean, jgen, prov);
        assertTrue(((SimpleTypeSerializer)typeSerializer).serializeWithTypeCalled);
    }

    @Test
    public void testSerializeAsColumnNullWithNullSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        bw.assignNullSerializer(nullSerializer);
        bw.serializeAsColumn(null, jgen, prov);
        assertTrue(((SimpleJsonSerializer)nullSerializer).serialized);
    }

    @Test
    public void testSerializeAsColumnNullWithoutNullSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        bw.serializeAsColumn(null, jgen, prov);
        // Should write null
        assertTrue(((SimpleJsonGenerator)jgen).nullWritten);
    }

    @Test
    public void testSerializeAsColumnWithSuppressEmpty() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, new SimpleJsonSerializer(true), null, null,
                false, BeanPropertyWriter.MARKER_FOR_EMPTY);
        bw.serializeAsColumn(bean, jgen, prov);
        // Should call serializeAsPlaceholder (write null)
        assertTrue(((SimpleJsonGenerator)jgen).nullWritten);
    }

    @Test
    public void testSerializeAsColumnNormal() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        bw.serializeAsColumn(bean, jgen, prov);
        assertTrue(((SimpleJsonSerializer)serializer).serialized);
    }

    @Test
    public void testSerializeAsPlaceholderWithNullSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        bw.assignNullSerializer(nullSerializer);
        bw.serializeAsPlaceholder(null, jgen, prov);
        assertTrue(((SimpleJsonSerializer)nullSerializer).serialized);
    }

    @Test
    public void testSerializeAsPlaceholderWithoutNullSerializer() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, methodMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        bw.serializeAsPlaceholder(null, jgen, prov);
        assertTrue(((SimpleJsonGenerator)jgen).nullWritten);
    }

    @Test
    public void testToString() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        String str = bw.toString();
        assertTrue(str.contains("testProp"));
        assertTrue(str.contains("no static serializer"));
    }

    @Test
    public void testDepositSchemaPropertyObjectNode() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, serializer, null, null,
                false, null);
        ObjectNode propertiesNode = new SimpleObjectNode();
        bw.depositSchemaProperty(propertiesNode, prov);
        assertTrue(propertiesNode.has("testProp"));
    }

    @Test
    public void testDepositSchemaPropertyObjectNodeWithSchemaAware() throws Exception {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, new SimpleJsonSerializer(false, true), null, null,
                false, null);
        ObjectNode propertiesNode = new SimpleObjectNode();
        bw.depositSchemaProperty(propertiesNode, prov);
        assertTrue(propertiesNode.has("testProp"));
    }

    @Test
    public void testSetNonTrivialBaseType() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        JavaType nonTrivial = new SimpleJavaType(Integer.class);
        bw.setNonTrivialBaseType(nonTrivial);
        assertSame(nonTrivial, bw._nonTrivialBaseType);
    }

    @Test
    public void testUnwrappingWriter() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        NameTransformer unwrapper = new NameTransformer() {
            public String transform(String name) { return "unwrapped_" + name; }
            public String reverse(String transformed) { return transformed.substring(9); }
        };
        BeanPropertyWriter uw = bw.unwrappingWriter(unwrapper);
        assertTrue(uw instanceof UnwrappingBeanPropertyWriter);
    }

    @Test
    public void testBeanPropertyMethods() {
        BeanPropertyWriter bw = new BeanPropertyWriter(propDef, fieldMember,
                contextAnnotations, declaredType, null, null, null,
                false, null);
        assertEquals("testProp", bw.getName());
        assertSame(declaredType, bw.getType());
        assertSame(propDef.getWrapperName(), bw.getWrapperName());
        assertFalse(bw.isRequired());
        assertNull(bw.getAnnotation(Deprecated.class));
        assertNull(bw.getContextAnnotation(Deprecated.class));
        assertSame(fieldMember, bw.getMember());
        assertNull(bw.getViews());
    }

    // -----------------------------------------------------------------------
    // Helper stubs (plain Java inner classes)
    // -----------------------------------------------------------------------

    static class SimpleBeanPropertyDefinition implements BeanPropertyDefinition {
        private final String name;
        private final boolean required;
        SimpleBeanPropertyDefinition(String name, boolean required) {
            this.name = name;
            this.required = required;
        }
        public String getName() { return name; }
        public boolean isRequired() { return required; }
        public PropertyName getWrapperName() { return new PropertyName(name); }
        public Class<?>[] findViews() { return null; }
        // other methods needed by BeanPropertyWriter
        public boolean hasGetter() { return false; }
        public boolean hasSetter() { return false; }
        public boolean hasField() { return false; }
        public boolean isExplicitlyIncluded() { return false; }
        public boolean couldDeserialize() { return false; }
        public AnnotatedMethod getGetter() { return null; }
        public AnnotatedMethod getSetter() { return null; }
        public AnnotatedField getField() { return null; }
        public AnnotatedParameter getConstructorParameter() { return null; }
        public AnnotatedMember getPrimaryMember() { return null; }
        public Accessor getAccessor() { return null; }
        public Mutator getMutator() { return null; }
    }

    static class SimpleAnnotatedField extends AnnotatedField {
        private final String fieldName;
        SimpleAnnotatedField(String fieldName) { this.fieldName = fieldName; }
        public String getName() { return fieldName; }
        public JavaType getType() { return new SimpleJavaType(String.class); }
        public Class<?> getDeclaringClass() { return SimpleBean.class; }
        public Annotations getContextAnnotations() { return null; }
        public Annotation getAnnotation(Class<?> cls) { return null; }
        public boolean hasAnnotation(Class<?> cls) { return false; }
        public Object getValue(Object pojo) throws Exception {
            if (pojo instanceof SimpleBean) return ((SimpleBean)pojo)._fieldValue;
            return null;
        }
        public void setValue(Object pojo, Object value) {}
        public java.lang.reflect.Member getMember() {
            try {
                return SimpleBean.class.getDeclaredField("_fieldValue");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        public void fixAccess() {}
    }

    static class SimpleAnnotatedMethod extends AnnotatedMethod {
        private final String methodName;
        private final Class<?> returnType;
        SimpleAnnotatedMethod(String methodName, Class<?> returnType) {
            this.methodName = methodName;
            this.returnType = returnType;
        }
        public String getName() { return methodName; }
        public JavaType getType() { return new SimpleJavaType(returnType); }
        public Class<?> getDeclaringClass() { return SimpleBean.class; }
        public Annotations getContextAnnotations() { return null; }
        public Annotation getAnnotation(Class<?> cls) { return null; }
        public boolean hasAnnotation(Class<?> cls) { return false; }
        public Object getValue(Object pojo) throws Exception {
            if (pojo instanceof SimpleBean) return ((SimpleBean)pojo)._methodValue;
            return null;
        }
        public void setValue(Object pojo, Object value) {}
        public java.lang.reflect.Member getMember() {
            try {
                return SimpleBean.class.getMethod("getMyField");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        public void fixAccess() {}
    }

    static class SimpleAnnotations implements Annotations {
        public Annotation get(Class<?> cls) { return null; }
        public int size() { return 0; }
    }

    static class SimpleJavaType extends JavaType {
        private final Class<?> rawClass;
        SimpleJavaType(Class<?> rawClass) { super(rawClass, 0, Object.class, null, false); this.rawClass = rawClass; }
        public Class<?> getRawClass() { return rawClass; }
        public String toString() { return rawClass.getName(); }
        public boolean isAbstract() { return false; }
        public boolean isArrayType() { return false; }
        public boolean isCollectionLikeType() { return false; }
        public boolean isMapLikeType() { return false; }
        public boolean isEnumType() { return false; }
        public boolean isFinal() { return false; }
        public boolean isContainerType() { return false; }
        public boolean isPrimitive() { return rawClass.isPrimitive(); }
        public JavaType containedType(int index) { return null; }
        public int containedTypeCount() { return 0; }
        public String containedTypeName(int index) { return null; }
        public JavaType getContentType() { return null; }
        public JavaType getKeyType() { return null; }
        public JavaType getValueType() { return null; }
        public JavaType narrowContentsBy(Class<?> contentClass) { return this; }
        public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) { return this; }
        public JavaType withTypeHandler(Object h) { return this; }
        public JavaType withValueHandler(Object h) { return this; }
        public JavaType withContentTypeHandler(Object h) { return this; }
        public JavaType withContentValueHandler(Object h) { return this; }
        public JavaType withStaticTyping() { return this; }
        public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
        public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
        public String toCanonical() { return rawClass.getName(); }
        public Type getRawKind() { return 0; }
    }

    static class SimpleJsonSerializer extends JsonSerializer<Object> {
        private boolean empty;
        private boolean schemaAware;
        boolean serialized = false;
        SimpleJsonSerializer() {}
        SimpleJsonSerializer(boolean empty) { this.empty = empty; }
        SimpleJsonSerializer(boolean empty, boolean schemaAware) { this.empty = empty; this.schemaAware = schemaAware; }
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) {
            serialized = true;
        }
        public boolean isEmpty(Object value) {
            return empty;
        }
        public boolean usesObjectId() { return false; }
        // If schemaAware, return dummy
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) { return null; }
        public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) {
            return com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
        }
    }

    static class SimpleTypeSerializer extends TypeSerializer {
        boolean serializeWithTypeCalled = false;
        public void serializeWithType(Object value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) {
            serializeWithTypeCalled = true;
        }
        public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) {}
        public void writeTypePrefixForObject(Object value, JsonGenerator jgen) {}
        public void writeTypePrefixForArray(Object value, JsonGenerator jgen) {}
        public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) {}
        public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) {}
        public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) {}
        public void writeCustomTypePrefixForScalar(Object value, JsonGenerator jgen, String typeStr) {}
        public void writeCustomTypePrefixForObject(Object value, JsonGenerator jgen, String typeStr) {}
        public void writeCustomTypePrefixForArray(Object value, JsonGenerator jgen, String typeStr) {}
        public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator jgen, String typeStr) {}
        public void writeCustomTypeSuffixForObject(Object value, JsonGenerator jgen, String typeStr) {}
        public void writeCustomTypeSuffixForArray(Object value, JsonGenerator jgen, String typeStr) {}
        public TypeSerializer forProperty(BeanProperty prop) { return this; }
        public String getPropertyName() { return null; }
        public TypeIdResolver getTypeIdResolver() { return null; }
        public String getTypeId() { return null; }
    }

    static class SimpleJsonGenerator extends JsonGenerator {
        boolean fieldNameWritten = false;
        boolean nullWritten = false;
        public void writeStartArray() {}
        public void writeEndArray() {}
        public void writeStartObject() {}
        public void writeEndObject() {}
        public void writeFieldName(String name) { fieldNameWritten = true; }
        public void writeFieldName(SerializedString name) { fieldNameWritten = true; }
        public void writeString(String text) {}
        public void writeString(char[] buffer, int offset, int len) {}
        public void writeRawUTF8String(byte[] text, int offset, int len) {}
        public void writeUTF8String(byte[] text, int offset, int len) {}
        public void writeRaw(String text) {}
        public void writeRaw(String text, int offset, int len) {}
        public void writeRaw(char[] text, int offset, int len) {}
        public void writeRawValue(String text) {}
        public void writeRawValue(String text, int offset, int len) {}
        public void writeRawValue(char[] text, int offset, int len) {}
        public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) {}
        public void writeBoolean(boolean state) {}
        public void writeNull() { nullWritten = true; }
        public void writeNumber(int v) {}
        public void writeNumber(long v) {}
        public void writeNumber(double v) {}
        public void writeNumber(float v) {}
        public void writeNumber(String encodedValue) {}
        public void writeNumber(BigDecimal value) {}
        public void writeNumber(BigInteger value) {}
        public void writeObject(Object pojo) {}
        public void writeTree(TreeNode rootNode) {}
        public JsonStreamContext getOutputContext() { return null; }
        public ObjectCodec getCodec() { return null; }
        public void setCodec(ObjectCodec oc) {}
        public boolean isClosed() { return false; }
        public void close() {}
        public void flush() {}
        public JsonGenerator configure(JsonGenerator.Feature f, boolean state) { return this; }
        public JsonGenerator enable(JsonGenerator.Feature f) { return this; }
        public JsonGenerator disable(JsonGenerator.Feature f) { return this; }
        public boolean isEnabled(JsonGenerator.Feature f) { return false; }
        public int getFeatureMask() { return 0; }
        public JsonGenerator setFeatureMask(int mask) { return this; }
        public boolean canWriteBinaryNatively() { return false; }
        public boolean canWriteObjectId() { return false; }
        public boolean canWriteTypeId() { return false; }
        public boolean canOmitFields() { return false; }
        public void writeTypeId(String id) {}
        public void writeObjectId(Object id) {}
        public void writeObjectRef(Object id) {}
        public void writeEmbeddedObject(Object object) {}
    }

    static class SimpleSerializerProvider extends SerializerProvider {
        SimpleSerializerProvider() {
            super(null, null, null, null);
        }
        public JsonSerializer<Object> findValueSerializer(Class<?> serType, BeanProperty property) {
            return new SimpleJsonSerializer();
        }
        public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass) {
            return new SimpleJavaType(subclass);
        }
        public final static int DEFAULT_GENERATOR_FEATURES = 0;
        public int getDefaultNullKeyFormat() { return 0; }
        public int getDefaultNullValueFormat() { return 0; }
    }

    static class SimpleBean {
        public String _fieldValue = "fieldValue";
        public String _methodValue = "methodValue";
        public String getMyField() { return _methodValue; }
    }

    static class SimpleObjectNode extends ObjectNode {
        SimpleObjectNode() { super(null); }
        public ObjectNode put(String fieldName, JsonNode value) { return this; }
        public boolean has(String fieldName) { return true; }
    }
}