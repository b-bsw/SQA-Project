package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collections;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class StdSerializerTest {

    private static class TestStdSerializer extends StdSerializer<String> {
        public TestStdSerializer(Class<String> t) { super(t); }
        public TestStdSerializer(JavaType type) { super(type); }
        public TestStdSerializer(Class<?> t, boolean dummy) { super(t, dummy); }
        @Override public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException {}
        @Override public JsonNode getSchema(SerializerProvider provider, Type typeHint) { return super.getSchema(provider, typeHint); }
        @Override public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) { return super.getSchema(provider, typeHint, isOptional); }
        @Override public ObjectNode createObjectNode() { return super.createObjectNode(); }
        @Override public ObjectNode createSchemaNode(String type) { return super.createSchemaNode(type); }
        @Override public ObjectNode createSchemaNode(String type, boolean isOptional) { return super.createSchemaNode(type, isOptional); }
        @Override public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) { super.acceptJsonFormatVisitor(visitor, typeHint); }
        @Override public void wrapAndThrow(SerializerProvider provider, Throwable t, Object bean, String fieldName) throws IOException { super.wrapAndThrow(provider, t, bean, fieldName); }
        @Override public void wrapAndThrow(SerializerProvider provider, Throwable t, Object bean, int index) throws IOException { super.wrapAndThrow(provider, t, bean, index); }
        @Override public boolean isDefaultSerializer(JsonSerializer<?> serializer) { return super.isDefaultSerializer(serializer); }
        @Override public JsonSerializer<?> findConvertingContentSerializer(SerializerProvider provider, BeanProperty prop, JsonSerializer<?> existingSerializer) throws JsonMappingException { return super.findConvertingContentSerializer(provider, prop, existingSerializer); }
        @Override public PropertyFilter findPropertyFilter(SerializerProvider provider, Object filterId, Object valueToFilter) throws JsonMappingException { return super.findPropertyFilter(provider, filterId, valueToFilter); }
    }

    private static class MockJavaType extends JavaType {
        private static final long serialVersionUID = 1L;
        private final Class<?> rawClass;
        public MockJavaType(Class<?> rawClass) {
            super(Object.class);
            this.rawClass = rawClass;
        }
        @Override public Class<?> getRawClass() { return rawClass; }
        @Override protected JavaType _narrow(Class<?> subclass) { throw new UnsupportedOperationException(); }
        @Override public JavaType withTypeHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType withContentTypeHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType withValueHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType withContentValueHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType withStaticTyping() { throw new UnsupportedOperationException(); }
        @Override public JavaType narrowBy(Class<?> subclass) { throw new UnsupportedOperationException(); }
        @Override public JavaType forceNarrowBy(Class<?> subclass) { throw new UnsupportedOperationException(); }
        @Override public String toString() { throw new UnsupportedOperationException(); }
        @Override public boolean equals(Object o) { return false; }
        @Override public int hashCode() { return 0; }
        @Override public boolean isAbstract() { return false; }
        @Override public boolean isThrowable() { return false; }
        @Override public boolean isArrayType() { return false; }
        @Override public boolean isEnumType() { return false; }
        @Override public boolean isInterface() { return false; }
        @Override public boolean isPrimitive() { return false; }
        @Override public boolean isFinal() { return false; }
        @Override public boolean isContainerType() { return false; }
        @Override public boolean isCollectionLikeType() { return false; }
        @Override public boolean isMapLikeType() { return false; }
        @Override public JavaType getContentType() { return null; }
        @Override public int containedTypeCount() { return 0; }
        @Override public JavaType containedType(int index) { return null; }
        @Override public String containedTypeName(int index) { return null; }
        @Override public JavaType getKeyType() { return null; }
        @Override public JavaType getSuperClass() { return null; }
        @Override public JavaType getSuperInterfaces() { return null; }
        @Override public JavaType getErasedSignature() { throw new UnsupportedOperationException(); }
        @Override public String getGenericSignature() { throw new UnsupportedOperationException(); }
        @Override public boolean isJavaLangObject() { return false; }
        @Override public boolean hasGenericTypes() { return false; }
    }

    private static class MockSerializerProvider extends SerializerProvider {
        private boolean wrapExceptions = true;
        private AnnotationIntrospector annotationIntrospector;
        private FilterProvider filterProvider;

        protected MockSerializerProvider() {
            super(null, null, null);
        }
        public void setWrapExceptions(boolean wrap) { this.wrapExceptions = wrap; }
        public void setAnnotationIntrospector(AnnotationIntrospector ai) { this.annotationIntrospector = ai; }
        public void setFilterProvider(FilterProvider fp) { this.filterProvider = fp; }

        @Override public boolean isEnabled(SerializationFeature feature) {
            if (feature == SerializationFeature.WRAP_EXCEPTIONS) return wrapExceptions;
            return false;
        }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return annotationIntrospector; }
        @Override public FilterProvider getFilterProvider() { return filterProvider; }
        @Override public <T> T converterInstance(AnnotatedMember m, Object converterDef) throws JsonMappingException {
            if (converterDef instanceof Converter) return (T) converterDef;
            return null;
        }
        @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }

        @Override public JsonSerializer<Object> findValueSerializer(Class<?> type, BeanProperty property) { return null; }
        @Override public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty property) { return null; }
        @Override public JsonSerializer<Object> findTypedValueSerializer(Class<?> type, boolean cache, BeanProperty property) { return null; }
        @Override public JsonSerializer<Object> findTypedValueSerializer(JavaType type, boolean cache, BeanProperty property) { return null; }
        @Override public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty property) { return null; }
        @Override public JsonSerializer<Object> findContentValueSerializer(JavaType type, BeanProperty property) { return null; }
        @Override public JsonSerializer<Object> findContentSerializer(Class<?> type, BeanProperty property) { return null; }

        @Override public void serializerInstance(JsonSerializer<?> ser) {}
        @Override public void includeFilterInstance(BeanPropertyFilter filter) {}
        @Override public void includeFilterInstance(PropertyFilter filter) {}
        @Override public void setObjectId(ObjectIdGenerator<?> gen) {}
        @Override public ObjectIdGenerator<?> getObjectId() { return null; }
        @Override public boolean canOverrideAccessModifiers() { return false; }
        @Override public boolean isEnabled(JsonParser.Feature feature) { return false; }
        @Override public boolean isEnabled(JsonGenerator.Feature feature) { return false; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public void setAttribute(Object key, Object value) {}
        @Override public boolean isClosed() { return false; }
        @Override public java.util.TimeZone getTimeZone() { return null; }
        @Override public java.util.Locale getLocale() { return null; }
        @Override public java.text.DateFormat getDateFormat() { return null; }
    }

    private static class MockAnnotationIntrospector extends AnnotationIntrospector {
        private Object converterDef;
        public void setConverterDef(Object def) { this.converterDef = def; }
        @Override public Object findSerializationContentConverter(AnnotatedMember m) { return converterDef; }
        @Override public boolean hasIgnoreMarker(AnnotatedMember m) { return false; }
        @Override public Object findSerializationConverter(AnnotatedMember a) { return null; }
        @Override public Object findDeserializationContentConverter(AnnotatedMember a) { return null; }
        @Override public Object findDeserializationConverter(AnnotatedMember a) { return null; }
        @Override public boolean isAnnotationBundle(java.lang.annotation.Annotation ann) { return false; }
        @Override public Object findFilterId(AnnotatedClass ac) { return null; }
        @Override public Object findNamingStrategy(AnnotatedClass ac) { return null; }
        @Override public String findEnumValue(Enum<?> value) { return null; }
        @Override public String findRootName(AnnotatedClass ac) { return null; }
        @Override public String[] findPropertiesToIgnore(AnnotatedClass ac) { return new String[0]; }
        @Override public Boolean findIgnoreUnknownProperties(AnnotatedClass ac) { return null; }
        @Override public Object findPropertyContentType(AnnotatedMember m) { return null; }
        @Override public Object findPropertyType(AnnotatedMember m) { return null; }
        @Override public PropertyName findWrapperName(AnnotatedMember m) { return null; }
        @Override public ReferenceInfo findReferenceType(AnnotatedMember m) { return null; }
        @Override public Object findUnwrappingNameTransformer(AnnotatedMember m) { return null; }
        @Override public ObjectIdInfo findObjectIdInfo(AnnotatedMember m) { return null; }
        @Override public ObjectIdInfo findObjectReferenceInfo(AnnotatedMember m, ObjectIdInfo info) { return info; }
        @Override public String findTypeName(AnnotatedClass ac) { return null; }
        @Override public TypeResolverBuilder<?> findTypeResolver(AnnotatedClass ac, JavaType baseType) { return null; }
        @Override public TypeResolverBuilder<?> findPropertyTypeResolver(AnnotatedMember m, JavaType baseType) { return null; }
        @Override public TypeResolverBuilder<?> findContentTypeResolver(AnnotatedMember m, JavaType baseType) { return null; }
        @Override public JsonSerializer<?> findSerializer(Annotated a) { return null; }
        @Override public JsonSerializer<?> findKeySerializer(Annotated a) { return null; }
        @Override public JsonSerializer<?> findContentSerializer(Annotated a) { return null; }
        @Override public JsonDeserializer<?> findDeserializer(Annotated a) { return null; }
        @Override public JsonDeserializer<?> findKeyDeserializer(Annotated a) { return null; }
        @Override public JsonDeserializer<?> findContentDeserializer(Annotated a) { return null; }
        @Override public Object findDeserializationType(AnnotatedMember m, JavaType baseType) { return null; }
        @Override public Object findSerializationType(AnnotatedMember m) { return null; }
        @Override public PropertyAccess findPropertyAccess(AnnotatedMember m) { return null; }
        @Override public String findPropertyDescription(AnnotatedMember m) { return null; }
        @Override public Integer findPropertyIndex(AnnotatedMember m) { return null; }
        @Override public JsonFormat.Value findFormat(AnnotatedMember m) { return null; }
        @Override public Object findNullValue(AnnotatedMember m) { return null; }
        @Override public Object findContentNullValue(AnnotatedMember m) { return null; }
        @Override public Boolean hasRequiredMarker(AnnotatedMember m) { return null; }
        @Override public Object findInjectableValueId(AnnotatedMember m) { return null; }
        @Override public PropertyName findImplicitPropertyName(AnnotatedMember m) { return null; }
        @Override public boolean isHandled(java.lang.annotation.Annotation ann) { return false; }
    }

    private static class MockConverter implements Converter<Object,Object> {
        private final JavaType outputType;
        public MockConverter(JavaType outputType) { this.outputType = outputType; }
        @Override public Object convert(Object value) { return value; }
        @Override public JavaType getInputType(TypeFactory typeFactory) { return null; }
        @Override public JavaType getOutputType(TypeFactory typeFactory) { return outputType; }
    }

    private static class MockBeanProperty implements BeanProperty {
        private AnnotatedMember member;
        public void setMember(AnnotatedMember m) { this.member = m; }
        @Override public AnnotatedMember getMember() { return member; }
        @Override public String getName() { return "test"; }
        @Override public PropertyName getFullName() { return new PropertyName("test"); }
        @Override public JavaType getType() { return null; }
        @Override public PropertyName getWrapperName() { return null; }
        @Override public boolean isRequired() { return false; }
        @Override public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public <A extends java.lang.annotation.Annotation> A getContextAnnotation(Class<A> acls) { return null; }
        @Override public PropertyMetadata getMetadata() { return null; }
        @Override public JavaType getContentType() { return null; }
        @Override public JsonSerializer<Object> getSerializer() { return null; }
        @Override public JsonSerializer<Object> getValueSerializer() { return null; }
        @Override public JsonSerializer<Object> getKeySerializer() { return null; }
        @Override public JsonSerializer<Object> getNullValueSerializer() { return null; }
        @Override public TypeDeserializer getValueTypeDeserializer() { return null; }
        @Override public TypeDeserializer getKeyTypeDeserializer() { return null; }
        @Override public Object getInjectableValueId() { return null; }
        @Override public boolean isVirtual() { return false; }
    }

    private static class MockAnnotatedMember extends AnnotatedMember {
        private static final long serialVersionUID = 1L;
        @Override public Class<?> getDeclaringClass() { return Object.class; }
        @Override public String getName() { return "mock"; }
        @Override public Type getGenericType() { return Object.class; }
        @Override public Class<?> getRawType() { return Object.class; }
        @Override public Iterable<java.lang.annotation.Annotation> annotations() { return Collections.emptyList(); }
        @Override public boolean hasAnnotation(Class<?> acls) { return false; }
        @Override public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public Annotated withAnnotations(AnnotationMap annotations) { return null; }
        @Override public void setValue(Object pojo, Object value) { }
        @Override public Object getValue(Object pojo) { return null; }
        @Override public Annotated getAnnotated() { return null; }
        @Override public Type getGenericParameterType(int index) { return null; }
        @Override public int getAnnotationCount() { return 0; }
    }

    @JacksonStdImpl
    private static class DefaultSerializer extends JsonSerializer<Object> {
        @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {}
        @Override public Class<Object> handledType() { return Object.class; }
    }

    private static class CustomSerializer extends JsonSerializer<Object> {
        @Override public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {}
        @Override public Class<Object> handledType() { return Object.class; }
    }

    private TestStdSerializer serializer;
    private MockSerializerProvider provider;

    @Before
    public void setUp() {
        serializer = new TestStdSerializer(String.class);
        provider = new MockSerializerProvider();
    }

    @After
    public void tearDown() {
        serializer = null;
        provider = null;
    }

    @Test
    public void testConstructorWithClass() {
        assertEquals(String.class, serializer.handledType());
    }

    @Test
    public void testConstructorWithJavaType() {
        TestStdSerializer s = new TestStdSerializer(new MockJavaType(Integer.class));
        assertEquals(Integer.class, s.handledType());
    }

    @Test
    public void testConstructorWithClassAndBoolean() {
        TestStdSerializer s = new TestStdSerializer(Double.class, true);
        assertEquals(Double.class, s.handledType());
    }

    @Test
    public void testHandledType() {
        assertEquals(String.class, serializer.handledType());
    }

    @Test
    public void testGetSchema() throws JsonMappingException {
        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertTrue(schema instanceof ObjectNode);
        assertEquals("string", schema.get("type").asText());
    }

    @Test
    public void testGetSchemaWithOptional() throws JsonMappingException {
        JsonNode schema = serializer.getSchema(provider, null, true);
        assertEquals("string", schema.get("type").asText());
        assertNull(schema.get("required"));

        schema = serializer.getSchema(provider, null, false);
        assertEquals("string", schema.get("type").asText());
        assertTrue(schema.get("required").asBoolean());
    }

    @Test
    public void testCreateObjectNode() {
        ObjectNode node = serializer.createObjectNode();
        assertNotNull(node);
        assertTrue(node.size() == 0);
    }

    @Test
    public void testCreateSchemaNode() {
        ObjectNode schema = serializer.createSchemaNode("integer");
        assertEquals("integer", schema.get("type").asText());
        assertNull(schema.get("required"));
    }

    @Test
    public void testCreateSchemaNodeWithOptional() {
        ObjectNode schema = serializer.createSchemaNode("boolean", true);
        assertEquals("boolean", schema.get("type").asText());
        assertNull(schema.get("required"));

        schema = serializer.createSchemaNode("boolean", false);
        assertTrue(schema.get("required").asBoolean());
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws JsonMappingException {
        final boolean[] visited = {false};
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper() {
            @Override public JsonFormatVisitable expectAnyFormat(JavaType type) throws JsonMappingException {
                visited[0] = true;
                return null;
            }
            @Override public JsonFormatVisitable expectStringFormat(JavaType type) { throw new UnsupportedOperationException(); }
            @Override public JsonFormatVisitable expectNumberFormat(JavaType type) { throw new UnsupportedOperationException(); }
            @Override public JsonFormatVisitable expectIntegerFormat(JavaType type) { throw new UnsupportedOperationException(); }
            @Override public JsonFormatVisitable expectBooleanFormat(JavaType type) { throw new UnsupportedOperationException(); }
            @Override public JsonFormatVisitable expectArrayFormat(JavaType type) { throw new UnsupportedOperationException(); }
            @Override public JsonFormatVisitable expectObjectFormat(JavaType type) { throw new UnsupportedOperationException(); }
            @Override public JsonFormatVisitable expectNullFormat(JavaType type) { throw new UnsupportedOperationException(); }
            @Override public SerializerProvider getProvider() { return provider; }
            @Override public void setProvider(SerializerProvider p) {}
        };
        serializer.acceptJsonFormatVisitor(visitor, null);
        assertTrue("expectAnyFormat should be called", visited[0]);
    }

    @Test
    public void testWrapAndThrowInvocationTarget() throws IOException {
        IOException rootCause = new IOException("root");
        InvocationTargetException ite = new InvocationTargetException(rootCause);
        try {
            serializer.wrapAndThrow(provider, ite, "bean", "field");
            fail("Expected IOException");
        } catch (IOException e) {
            assertSame(rootCause, e);
        }
    }

    @Test
    public void testWrapAndThrowError() {
        Error error = new Error("test error");
        try {
            serializer.wrapAndThrow(provider, error, "bean", "field");
            fail("Expected Error");
        } catch (Error e) {
            assertSame(error, e);
        } catch (IOException e) {
            fail("Should not catch IOException");
        }
    }

    @Test
    public void testWrapAndThrowIOExceptionNoWrap() throws IOException {
        provider.setWrapExceptions(false);
        IOException ioe = new IOException("plain");
        try {
            serializer.wrapAndThrow(provider, ioe, "bean", "field");
            fail("Expected IOException");
        } catch (IOException e) {
            assertSame(ioe, e);
        }
    }

    @Test
    public void testWrapAndThrowJsonMappingExceptionWithWrap() throws IOException {
        provider.setWrapExceptions(true);
        JsonMappingException jme = new JsonMappingException("mapping");
        try {
            serializer.wrapAndThrow(provider, jme, "bean", "field");
            fail("Expected JsonMappingException wrapping");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrowRuntimeExceptionNoWrap() throws IOException {
        provider.setWrapExceptions(false);
        RuntimeException re = new RuntimeException("unchecked");
        try {
            serializer.wrapAndThrow(provider, re, "bean", "field");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertSame(re, e);
        }
    }

    @Test
    public void testWrapAndThrowOtherWithWrap() throws IOException {
        provider.setWrapExceptions(true);
        Exception other = new Exception("other");
        try {
            serializer.wrapAndThrow(provider, other, "bean", "field");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrowWithIndex() throws IOException {
        provider.setWrapExceptions(true);
        Exception other = new Exception("indexed");
        try {
            serializer.wrapAndThrow(provider, other, "bean", 0);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testIsDefaultSerializer() {
        assertTrue(serializer.isDefaultSerializer(new DefaultSerializer()));
        assertFalse(serializer.isDefaultSerializer(new CustomSerializer()));
        assertFalse(serializer.isDefaultSerializer(null));
    }

    @Test
    public void testFindConvertingContentSerializerNullIntr() throws JsonMappingException {
        provider.setAnnotationIntrospector(null);
        JsonSerializer<?> existing = new DefaultSerializer();
        assertSame(existing, serializer.findConvertingContentSerializer(provider, null, existing));
    }

    @Test
    public void testFindConvertingContentSerializerNullPropWithIntr() throws JsonMappingException {
        MockAnnotationIntrospector intr = new MockAnnotationIntrospector();
        intr.setConverterDef(null);
        provider.setAnnotationIntrospector(intr);
        JsonSerializer<?> existing = new DefaultSerializer();
        assertSame(existing, serializer.findConvertingContentSerializer(provider, null, existing));
    }

    @Test
    public void testFindConvertingContentSerializerPropNotNullNoConverter() throws JsonMappingException {
        MockAnnotationIntrospector intr = new MockAnnotationIntrospector();
        intr.setConverterDef(null);
        provider.setAnnotationIntrospector(intr);
        MockBeanProperty prop = new MockBeanProperty();
        prop.setMember(null);
        JsonSerializer<?> existing = new DefaultSerializer();
        assertSame(existing, serializer.findConvertingContentSerializer(provider, prop, existing));
    }

    @Test
    public void testFindConvertingContentSerializerWithConverter() throws JsonMappingException {
        MockAnnotationIntrospector intr = new MockAnnotationIntrospector();
        intr.setConverterDef(new MockConverter(new MockJavaType(String.class)));
        provider.setAnnotationIntrospector(intr);
        MockBeanProperty prop = new MockBeanProperty();
        prop.setMember(new MockAnnotatedMember());

        JsonSerializer<?> result = serializer.findConvertingContentSerializer(provider, prop, null);
        assertNotNull(result);
        assertTrue(result instanceof StdDelegatingSerializer);

        JsonSerializer<?> existing = new DefaultSerializer();
        result = serializer.findConvertingContentSerializer(provider, prop, existing);
        assertNotNull(result);
        assertTrue(result instanceof StdDelegatingSerializer);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindPropertyFilterNullFilterProvider() throws JsonMappingException {
        provider.setFilterProvider(null);
        serializer.findPropertyFilter(provider, "filterId", "value");
    }

    @Test
    public void testFindPropertyFilterNormal() throws JsonMappingException {
        FilterProvider fp = new FilterProvider() {
            @Override public PropertyFilter findPropertyFilter(Object filterId, Object valueToFilter) {
                return null;
            }
        };
        provider.setFilterProvider(fp);
        PropertyFilter result = serializer.findPropertyFilter(provider, "id", "value");
        assertNull(result);
    }
}