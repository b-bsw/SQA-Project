package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionDeserializerTest {

    // --- Stub classes for Jackson types ---

    static class StubJavaType extends JavaType {
        protected StubJavaType() {
            super(Object.class, 0, null, null);
        }

        @Override
        public JavaType withTypeHandler(Object h) { return this; }
        @Override
        public JavaType withContentTypeHandler(Object h) { return this; }
        @Override
        public JavaType withValueHandler(Object h) { return this; }
        @Override
        public JavaType withContentValueHandler(Object h) { return this; }
        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) { return this; }
        @Override
        public JavaType widenContentsBy(Class<?> contentClass) { return this; }
        @Override
        public JavaType narrowBy(Class<?> subclass) { return this; }
        @Override
        public JavaType widenBy(Class<?> superclass) { return this; }
        @Override
        public boolean isContainerType() { return true; }
        @Override
        public boolean isArrayType() { return false; }
        @Override
        public String toString() { return "stubJavaType"; }
        @Override
        public boolean equals(Object o) { return o == this; }
        @Override
        public int hashCode() { return 1; }
        @Override
        protected String buildCanonicalName() { return "stubJavaType"; }
        @Override
        public JavaType getContentType() { return this; }
        @Override
        public Class<?> getRawClass() { return Collection.class; }
    }

    static class StubValueDeserializer extends JsonDeserializer<Object> {
        private final Object value;
        private final ObjectIdReader oidReader;
        private final boolean throwUnresolved;
        private final boolean throwRuntime;

        public StubValueDeserializer(Object value) {
            this(value, null, false, false);
        }

        public StubValueDeserializer(Object value, ObjectIdReader oidReader) {
            this(value, oidReader, false, false);
        }

        public StubValueDeserializer(Object value, ObjectIdReader oidReader, boolean throwUnresolved, boolean throwRuntime) {
            this.value = value;
            this.oidReader = oidReader;
            this.throwUnresolved = throwUnresolved;
            this.throwRuntime = throwRuntime;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (throwUnresolved) {
                throw new UnresolvedForwardReference(p, "test unresolved");
            }
            if (throwRuntime) {
                throw new RuntimeException("test runtime");
            }
            return value;
        }

        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return null;
        }

        @Override
        public ObjectIdReader getObjectIdReader() {
            return oidReader;
        }
    }

    static class StubTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(BeanProperty prop) { return this; }
        @Override
        public JsonTypeInfo.As getTypeInclusion() { return null; }
        @Override
        public String getPropertyName() { return null; }
        @Override
        public TypeIdResolver getTypeIdResolver() { return null; }
        @Override
        public Class<?> getDefaultImpl() { return null; }
        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return "typedArray"; }
        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
    }

    static class StubValueInstantiator extends ValueInstantiator {
        private final boolean canDelegate;
        private final JavaType delegateType;

        public StubValueInstantiator() {
            this(false, null);
        }

        public StubValueInstantiator(boolean canDelegate, JavaType delegateType) {
            this.canDelegate = canDelegate;
            this.delegateType = delegateType;
        }

        @Override
        public boolean canCreateUsingDefault() { return true; }
        @Override
        public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
            return new ArrayList<Object>();
        }
        @Override
        public boolean canCreateFromString() { return true; }
        @Override
        public Object createFromString(DeserializationContext ctxt, String value) throws IOException {
            return new ArrayList<Object>();
        }
        @Override
        public boolean canCreateUsingDelegate() { return canDelegate; }
        @Override
        public JavaType getDelegateType(DeserializationConfig config) { return delegateType; }
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException {
            return (Collection<Object>) delegate;
        }
        @Override
        public String getValueTypeDesc() { return "stub"; }
    }

    // --- Helper to create parser from tokens ---
    private JsonParser createParser(final JsonToken... tokens) {
        return new JsonParser() {
            private int pos = -1;
            private JsonToken current = null;
            private Object currentValue;

            @Override
            public JsonToken getCurrentToken() { return current; }
            @Override
            public JsonToken nextToken() throws IOException {
                pos++;
                current = (pos < tokens.length) ? tokens[pos] : null;
                return current;
            }
            @Override
            public boolean isExpectedStartArrayToken() {
                return current == JsonToken.START_ARRAY;
            }
            @Override
            public boolean hasToken(JsonToken t) {
                return current == t;
            }
            @Override
            public String getText() throws IOException {
                return current == JsonToken.VALUE_STRING ? "" : "";
            }
            @Override
            public void setCurrentValue(Object v) { this.currentValue = v; }
            @Override
            public Object getCurrentValue() { return currentValue; }

            // Stub the rest of abstract methods minimally
            @Override
            public JsonStreamContext getParsingContext() { return null; }
            @Override
            public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonLocation getCurrentLocation() { return null; }
            @Override
            public void clearCurrentToken() {}
            @Override
            public JsonToken getLastClearedToken() { return null; }
            @Override
            public void overrideCurrentName(String name) {}
            @Override
            public String getCurrentName() throws IOException { return null; }
            @Override
            public void close() throws IOException {}
            @Override
            public boolean isClosed() { return false; }
            @Override
            public JsonToken getCurrentToken() { return current; }
            @Override
            public int getCurrentTokenId() { return current == null ? 0 : current.id(); }
            @Override
            public boolean hasCurrentToken() { return current != null; }
            @Override
            public boolean hasTextCharacters() { return false; }
            @Override
            public char[] getTextCharacters() throws IOException { return new char[0]; }
            @Override
            public int getTextLength() throws IOException { return 0; }
            @Override
            public int getTextOffset() throws IOException { return 0; }
            @Override
            public Number getNumberValue() throws IOException { return 0; }
            @Override
            public Number getNumberValueExact() throws IOException { return 0; }
            @Override
            public JsonParser.NumberType getNumberType() throws IOException { return null; }
            @Override
            public int getIntValue() throws IOException { return 0; }
            @Override
            public long getLongValue() throws IOException { return 0; }
            @Override
            public BigInteger getBigIntegerValue() throws IOException { return BigInteger.ZERO; }
            @Override
            public float getFloatValue() throws IOException { return 0; }
            @Override
            public double getDoubleValue() throws IOException { return 0; }
            @Override
            public BigDecimal getDecimalValue() throws IOException { return BigDecimal.ZERO; }
            @Override
            public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
            @Override
            public String getValueAsString() throws IOException { return null; }
            @Override
            public String getValueAsString(String def) throws IOException { return def; }
            @Override
            public boolean getValueAsBoolean(boolean def) throws IOException { return def; }
            @Override
            public int getValueAsInt(int def) throws IOException { return def; }
            @Override
            public long getValueAsLong(long def) throws IOException { return def; }
            @Override
            public double getValueAsDouble(double def) throws IOException { return def; }
            @Override
            public Object getEmbeddedObject() throws IOException { return null; }
            @Override
            public ByteArrayBuilder getByteArrayBuilder() { return null; }
            @Override
            public int releaseBuffered(OutputStream out) throws IOException { return 0; }
            @Override
            public int releaseBuffered(OutputStream out, byte[] buf) throws IOException { return 0; }
            @Override
            public Object readValueAs(Class<?> valueType) throws IOException { return null; }
            @Override
            public <T> T readValueAs(TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override
            public <T> T readValueAs(Class<T> valueType, DeserializationConfig config, DeserializationContext ctxt) throws IOException { return null; }
            @Override
            public <T> TreeNode readValueAsTree() throws IOException { return null; }
            @Override
            public Version version() { return Version.unknownVersion(); }
            @Override
            public ObjectCodec getCodec() { return null; }
            @Override
            public void setCodec(ObjectCodec c) {}

            // Additional needed for compilation (may be version specific)
            @Override
            public boolean canReadObjectId() { return false; }
            @Override
            public boolean canReadTypeId() { return false; }
            @Override
            public Object getObjectId() throws IOException { return null; }
            @Override
            public Object getTypeId() throws IOException { return null; }
        };
    }

    // --- Helper to create minimal DeserializationContext ---
    private DeserializationContext createContext(final boolean acceptSingle, final boolean wrapExceptions) {
        return new DeserializationContext(null, null, null, null) {
            @Override
            public boolean isEnabled(DeserializationFeature feature) {
                if (feature == DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                    return acceptSingle;
                if (feature == DeserializationFeature.WRAP_EXCEPTIONS)
                    return wrapExceptions;
                return false;
            }
            @Override
            public JsonMappingException mappingException(Class<?> targetClass) {
                return new JsonMappingException(this, "mapping exception");
            }
            @Override
            public DeserializationConfig getConfig() { return null; }
            @Override
            public final Object getAttribute(Object key) { return null; }
            @Override
            public final void setAttribute(Object key, Object value) {}
            @Override
            public JsonParser getParser() { return null; }
            @Override
            public Object getBase64Variant() { return null; }
            @Override
            public DeserializerFactory getFactory() { return null; }
            @Override
            public JavaType getContextualType() { return null; }
            @Override
            public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) { return null; }
            @Override
            public JsonDeserializer<Object> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty prop, JavaType type) { return null; }
            @Override
            public int getActiveView() { return 0; }
            @Override
            public AnnotationIntrospector getAnnotationIntrospector() { return null; }
            @Override
            public TypeDeserializer findTypeDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException { return null; }
            @Override
            public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException { return null; }
            @Override
            public JsonDeserializer<Object> findDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException { return null; }
            @Override
            public final boolean handleUnknownProperty(JsonParser p, JsonDeserializer<?> deser, Object instanceOrClass, String propName) throws IOException { return false; }
            @Override
            public JsonMappingException weirdStringException(String value, Class<?> type, String msg) { return null; }
            @Override
            public JsonMappingException weirdKeyException(Class<?> keyType, String keyValue, String msg) { return null; }
            @Override
            public JsonMappingException weirdNumberException(Number value, Class<?> type, String msg) { return null; }
            @Override
            public JsonMappingException wrongTokenException(JsonParser p, JsonToken expToken, String msg) { return null; }
            @Override
            public JsonMappingException unknownTypeException(JavaType type, String id) { return null; }
            @Override
            public JsonMappingException instantiationException(Class<?> instClass, Throwable cause) { return null; }
            @Override
            public JsonMappingException instantiationException(Class<?> instClass, String msg) { return null; }
            @Override
            public JsonMappingException cannotDeserializeException(JavaType type, String msg) { return null; }
            @Override
            public JsonMappingException endOfInputException(Class<?> instClass) { return null; }
            @Override
            public JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String msg) { return null; }
            @Override
            public JsonMappingException mappingException(String msg) { return new JsonMappingException(this, msg); }
            @Override
            public JsonMappingException mappingException(String msg, Throwable cause) { return new JsonMappingException(this, msg, cause); }
        };
    }

    // --- Tests ---

    private final StubJavaType collectionType = new StubJavaType();
    private final StubValueInstantiator defaultInstantiator = new StubValueInstantiator();
    private final StubValueInstantiator delegateInstantiator = new StubValueInstantiator(true, collectionType);

    @Test
    public void testIsCachableTrue() {
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                null, null, defaultInstantiator);
        assertTrue(deser.isCachable());
    }

    @Test
    public void testIsCachableFalseValueDeser() {
        StubValueDeserializer vd = new StubValueDeserializer("a");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        assertFalse(deser.isCachable());
    }

    @Test
    public void testIsCachableFalseTypeDeser() {
        StubTypeDeserializer td = new StubTypeDeserializer();
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                null, td, defaultInstantiator);
        assertFalse(deser.isCachable());
    }

    @Test
    public void testIsCachableFalseDelegate() {
        StubValueDeserializer dd = new StubValueDeserializer("del");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                null, null, defaultInstantiator, dd, null);
        assertFalse(deser.isCachable());
    }

    @Test
    public void testWithResolvedNoChange() {
        StubValueDeserializer vd = new StubValueDeserializer("v");
        StubTypeDeserializer td = new StubTypeDeserializer();
        StubValueDeserializer dd = new StubValueDeserializer("d");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, td, defaultInstantiator, dd, Boolean.TRUE);
        CollectionDeserializer result = deser.withResolved(dd, vd, td, Boolean.TRUE);
        assertSame(deser, result);
    }

    @Test
    public void testWithResolvedChanged() {
        StubValueDeserializer vd = new StubValueDeserializer("v");
        StubValueDeserializer vd2 = new StubValueDeserializer("v2");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        CollectionDeserializer result = deser.withResolved(null, vd2, null, null);
        assertNotNull(result);
        assertNotSame(deser, result);
    }

    @Test
    public void testDeserializeWithDelegate() throws IOException {
        StubValueDeserializer dd = new StubValueDeserializer(new ArrayList<Object>() {{ add("del"); }});
        StubValueDeserializer vd = new StubValueDeserializer("x"); // not used
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, delegateInstantiator, dd, null);
        JsonParser p = createParser(JsonToken.VALUE_NULL); // token not used due to delegate
        DeserializationContext ctxt = createContext(false, false);
        Collection<Object> result = deser.deserialize(p, ctxt);
        assertEquals(1, result.size());
        assertEquals("del", result.iterator().next());
    }

    @Test
    public void testDeserializeEmptyString() throws IOException {
        // Empty string triggers createFromString
        StubValueDeserializer vd = new StubValueDeserializer("x");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        JsonParser p = createParser(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = createContext(false, false);
        Collection<Object> result = deser.deserialize(p, ctxt);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserializeEmptyArray() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer("x");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        JsonParser p = createParser(JsonToken.START_ARRAY, JsonToken.END_ARRAY);
        DeserializationContext ctxt = createContext(false, false);
        Collection<Object> result = deser.deserialize(p, ctxt);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserializeSingleElement() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer("abc");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        JsonParser p = createParser(JsonToken.START_ARRAY, JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        DeserializationContext ctxt = createContext(false, false);
        Collection<Object> result = deser.deserialize(p, ctxt);
        assertEquals(1, result.size());
        assertEquals("abc", result.iterator().next());
    }

    @Test
    public void testDeserializeMultipleElements() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer("val");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        JsonParser p = createParser(JsonToken.START_ARRAY,
                JsonToken.VALUE_STRING, JsonToken.VALUE_NUMBER_INT, JsonToken.END_ARRAY);
        DeserializationContext ctxt = createContext(false, false);
        Collection<Object> result = deser.deserialize(p, ctxt);
        // Since valueDes always returns "val", each element becomes "val"
        assertEquals(2, result.size());
        for (Object o : result) {
            assertEquals("val", o);
        }
    }

    @Test
    public void testDeserializeNullElement() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer("x");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        JsonParser p = createParser(JsonToken.START_ARRAY, JsonToken.VALUE_NULL, JsonToken.END_ARRAY);
        DeserializationContext ctxt = createContext(false, false);
        Collection<Object> result = deser.deserialize(p, ctxt);
        assertEquals(1, result.size());
        assertNull(result.iterator().next());
    }

    @Test
    public void testDeserializeNonArrayWrappingEnabled() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer("wrapped");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator, null, Boolean.TRUE);
        JsonParser p = createParser(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = createContext(false, false);
        Collection<Object> result = deser.deserialize(p, ctxt);
        assertEquals(1, result.size());
        assertEquals("wrapped", result.iterator().next());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNonArrayWrappingDisabled() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer("x");
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator, null, Boolean.FALSE);
        JsonParser p = createParser(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = createContext(false, false);
        deser.deserialize(p, ctxt);
    }

    @Test
    public void testDeserializeWithType() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer("x");
        StubTypeDeserializer td = new StubTypeDeserializer();
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, td, defaultInstantiator);
        JsonParser p = createParser(JsonToken.VALUE_STRING);
        DeserializationContext ctxt = createContext(false, false);
        Object result = deser.deserializeWithType(p, ctxt, td);
        assertEquals("typedArray", result);
    }

    @Test(expected = RuntimeException.class)
    public void testDeserializeRuntimeExceptionUnwrapped() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer(null, null, false, true);
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        JsonParser p = createParser(JsonToken.START_ARRAY, JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        DeserializationContext ctxt = createContext(false, false); // wrapExceptions = false
        deser.deserialize(p, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeRuntimeExceptionWrapped() throws IOException {
        StubValueDeserializer vd = new StubValueDeserializer(null, null, false, true);
        CollectionDeserializer deser = new CollectionDeserializer(collectionType,
                vd, null, defaultInstantiator);
        JsonParser p = createParser(JsonToken.START_ARRAY, JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        DeserializationContext ctxt = createContext(false, true); // wrapExceptions = true
        deser.deserialize(p, ctxt);
    }
}