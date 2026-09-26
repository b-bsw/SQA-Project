package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class DefaultSerializerProviderTest {

    private DefaultSerializerProvider provider;
    private SerializationConfig config;
    private SerializerFactory factory;

    @Before
    public void setUp() {
        // Use a simple implementation for testing
        provider = new DefaultSerializerProvider.Impl();
        // We need a mock-like setup; use default ObjectMapper config to get a real SerializationConfig
        ObjectMapper mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        // We'll use a simple SerializerFactory
        factory = new BeanSerializerFactory(config, mapper.getSerializerProviderInstance().getFactory());
        // Now set config and factory via protected constructor? We cannot directly, so we'll use the Impl constructor
        // Actually, we can create an Impl with config and factory using the protected constructor via a subclass or reflection.
        // For simplicity, we'll work with the default blueprint and test methods that don't require config/factory.
    }

    @Test
    public void testSerializerInstanceWithNullSerDef() throws Exception {
        DefaultSerializerProvider prov = provider;
        Annotated annotated = new Annotated() {
            @Override
            public JavaType getType() { return null; }
            @Override
            public int getModifiers() { return 0; }
            @Override
            public String getName() { return "test"; }
            @Override
            public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public java.lang.reflect.AnnotatedElement getAnnotated() { return null; }
            @Override
            protected Object getValue() { return null; }
            @Override
            public void setValue(Object value) throws UnsupportedOperationException { }
        };
        assertNull("null serDef should return null", prov.serializerInstance(annotated, null));
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializerInstanceWithInvalidSerDefType() throws Exception {
        DefaultSerializerProvider prov = provider;
        Annotated annotated = new Annotated() {
            @Override
            public JavaType getType() { return null; }
            @Override
            public int getModifiers() { return 0; }
            @Override
            public String getName() { return "test"; }
            @Override
            public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public java.lang.reflect.AnnotatedElement getAnnotated() { return null; }
            @Override
            protected Object getValue() { return null; }
            @Override
            public void setValue(Object value) throws UnsupportedOperationException { }
        };
        prov.serializerInstance(annotated, "not a serializer");
    }

    @Test
    public void testIncludeFilterInstanceWithNullFilterClass() {
        DefaultSerializerProvider prov = provider;
        BeanPropertyDefinition propDef = null;
        assertNull("null filterClass should return null", prov.includeFilterInstance(propDef, null));
    }

    @Test
    public void testIncludeFilterSuppressNullsWithNullFilter() throws Exception {
        DefaultSerializerProvider prov = provider;
        assertTrue("null filter should return true", prov.includeFilterSuppressNulls(null));
    }

    @Test
    public void testFindObjectIdFirstCall() {
        DefaultSerializerProvider prov = provider;
        Object forPojo = new Object();
        ObjectIdGenerator<?> genType = new ObjectIdGenerator<Object>() {
            @Override
            public ObjectIdGenerator<Object> forScope(Class<?> scope) { return this; }
            @Override
            public Class<Object> getScope() { return Object.class; }
            @Override
            public ObjectIdGenerator<Object> newForSerialization(Object context) { return this; }
            @Override
            public IdKey key(Object key) { return new IdKey(Object.class, null, key); }
            @Override
            public boolean canUseFor(ObjectIdGenerator<?> gen) { return true; }
            @Override
            public Object generateId(Object forPojo) { return forPojo.hashCode(); }
        };
        WritableObjectId oid = prov.findObjectId(forPojo, genType);
        assertNotNull("should return non-null WritableObjectId", oid);
        assertSame("should return same instance on second call", oid, prov.findObjectId(forPojo, genType));
    }

    @Test
    public void testHasSerializerForObjectClassWithFailOnEmptyBeansDisabled() {
        // We need a config with FAIL_ON_EMPTY_BEANS disabled
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        DefaultSerializerProvider prov = mapper.getSerializerProvider();
        assertTrue("hasSerializerFor(Object.class) should return true when FAIL_ON_EMPTY_BEANS disabled", prov.hasSerializerFor(Object.class, null));
    }

    @Test
    public void testHasSerializerForObjectClassWithFailOnEmptyBeansEnabled() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        DefaultSerializerProvider prov = mapper.getSerializerProvider();
        assertFalse("hasSerializerFor(Object.class) should return false when FAIL_ON_EMPTY_BEANS enabled and no custom serializer", prov.hasSerializerFor(Object.class, null));
    }

    @Test
    public void testHasSerializerForWithCauseAndException() {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider prov = mapper.getSerializerProvider();
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        // Try a class that might cause an exception in _findExplicitUntypedSerializer (unlikely with simple class)
        assertTrue("hasSerializerFor should not throw", prov.hasSerializerFor(String.class, cause));
        assertNull("cause should be null", cause.get());
    }

    @Test
    public void testGetGeneratorInitiallyNull() {
        assertNull("generator should initially be null for blueprint", provider.getGenerator());
    }

    @Test
    public void testCachedSerializersCount() {
        assertEquals("cache should be empty initially", 0, provider.cachedSerializersCount());
    }

    @Test
    public void testFlushCachedSerializers() {
        provider.flushCachedSerializers();
        assertEquals("cache should be empty after flush", 0, provider.cachedSerializersCount());
    }

    @Test
    public void testAcceptJsonFormatVisitorWithNullType() {
        try {
            provider.acceptJsonFormatVisitor(null, null);
            fail("should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCopyThrowsIllegalStateException() {
        try {
            provider.copy();
            fail("should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSerializePolymorphicWithNullValue() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider prov = mapper.getSerializerProvider();
        JsonGenerator gen = mapper.getFactory().createGenerator(System.out);
        // We'll just test null path; for safety, use a silent writer
        JsonGenerator silentGen = new JsonGenerator() {
            @Override public void writeStartObject() throws IOException { }
            @Override public void writeEndObject() throws IOException { }
            @Override public void writeFieldName(String name) throws IOException { }
            @Override protected void _writeFieldName(String name) throws IOException { }
            @Override public void writeString(String text) throws IOException { }
            @Override public void writeString(char[] buffer, int offset, int len) throws IOException { }
            @Override public void writeRawUTF8String(byte[] text, int offset, int len) throws IOException { }
            @Override public void writeUTF8String(byte[] text, int offset, int len) throws IOException { }
            @Override public void writeRaw(String text) throws IOException { }
            @Override public void writeRaw(String text, int offset, int len) throws IOException { }
            @Override public void writeRaw(char[] text, int offset, int len) throws IOException { }
            @Override public void writeRaw(char c) throws IOException { }
            @Override public void writeRawValue(String text) throws IOException { }
            @Override public void writeRawValue(String text, int offset, int len) throws IOException { }
            @Override public void writeRawValue(char[] text, int offset, int len) throws IOException { }
            @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { }
            @Override public int writeBinary(Base64Variant b64variant, InputStream data, int dataBytes) throws IOException { return 0; }
            @Override public void writeNumber(int v) throws IOException { }
            @Override public void writeNumber(long v) throws IOException { }
            @Override public void writeNumber(BigDecimal v) throws IOException { }
            @Override public void writeNumber(double v) throws IOException { }
            @Override public void writeNumber(float v) throws IOException { }
            @Override public void writeBoolean(boolean state) throws IOException { }
            @Override public void writeNull() throws IOException { }
            @Override public void writeObject(Object pojo) throws IOException { }
            @Override public void writeTree(TreeNode rootNode) throws IOException { }
            @Override public JsonStreamContext getOutputContext() { return null; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec oc) { }
            @Override public int getHighestEscapedChar() { return 0; }
            @Override public int getOutputBuffered() { return 0; }
            @Override public void flush() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public void close() throws IOException { }
        };
        prov.serializePolymorphic(silentGen, null, null, null, null);
        // No exception expected
    }

    @Test
    public void testSerializeValueWithNull() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider prov = mapper.getSerializerProvider();
        JsonGenerator silentGen = createSilentGenerator();
        prov.serializeValue(silentGen, null);
        // Should not throw
    }

    private JsonGenerator createSilentGenerator() {
        return new JsonGenerator() {
            @Override public void writeStartObject() throws IOException { }
            @Override public void writeEndObject() throws IOException { }
            @Override public void writeFieldName(String name) throws IOException { }
            @Override protected void _writeFieldName(String name) throws IOException { }
            @Override public void writeString(String text) throws IOException { }
            @Override public void writeString(char[] buffer, int offset, int len) throws IOException { }
            @Override public void writeRawUTF8String(byte[] text, int offset, int len) throws IOException { }
            @Override public void writeUTF8String(byte[] text, int offset, int len) throws IOException { }
            @Override public void writeRaw(String text) throws IOException { }
            @Override public void writeRaw(String text, int offset, int len) throws IOException { }
            @Override public void writeRaw(char[] text, int offset, int len) throws IOException { }
            @Override public void writeRaw(char c) throws IOException { }
            @Override public void writeRawValue(String text) throws IOException { }
            @Override public void writeRawValue(String text, int offset, int len) throws IOException { }
            @Override public void writeRawValue(char[] text, int offset, int len) throws IOException { }
            @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { }
            @Override public int writeBinary(Base64Variant b64variant, InputStream data, int dataBytes) throws IOException { return 0; }
            @Override public void writeNumber(int v) throws IOException { }
            @Override public void writeNumber(long v) throws IOException { }
            @Override public void writeNumber(BigDecimal v) throws IOException { }
            @Override public void writeNumber(double v) throws IOException { }
            @Override public void writeNumber(float v) throws IOException { }
            @Override public void writeBoolean(boolean state) throws IOException { }
            @Override public void writeNull() throws IOException { }
            @Override public void writeObject(Object pojo) throws IOException { }
            @Override public void writeTree(TreeNode rootNode) throws IOException { }
            @Override public JsonStreamContext getOutputContext() { return null; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec oc) { }
            @Override public int getHighestEscapedChar() { return 0; }
            @Override public int getOutputBuffered() { return 0; }
            @Override public void flush() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public void close() throws IOException { }
        };
    }
}