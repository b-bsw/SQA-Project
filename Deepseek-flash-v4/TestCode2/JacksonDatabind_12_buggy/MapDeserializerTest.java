package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

public class MapDeserializerTest {

    // ---- Stub classes ----
    static class StubJavaType extends JavaType {
        private final Class<?> rawClass;
        private final JavaType keyType;
        private final JavaType contentType;

        protected StubJavaType(Class<?> raw, Class<?> keyCls, Class<?> contentCls) {
            super(raw);
            this.rawClass = raw;
            this.keyType = (keyCls == null) ? null : new StubJavaType(keyCls, null, null);
            this.contentType = (contentCls == null) ? null : new StubJavaType(contentCls, null, null);
        }

        @Override public JavaType getKeyType() { return keyType; }
        @Override public JavaType getContentType() { return contentType; }
        @Override public Class<?> getRawClass() { return rawClass; }
        @Override public boolean isAbstract() { return false; }
        @Override public boolean isConcrete() { return true; }
        @Override public boolean isArrayType() { return false; }
        @Override public boolean isCollectionLikeType() { return false; }
        @Override public boolean isMapLikeType() { return true; }
        @Override public boolean isEnumType() { return false; }
        @Override public boolean isPrimitive() { return false; }
        @Override public boolean isFinal() { return false; }
        @Override public boolean isThrowable() { return false; }
        @Override public JavaType withTypeHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType withContentTypeHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType withValueHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType withContentValueHandler(Object h) { throw new UnsupportedOperationException(); }
        @Override public JavaType narrowBy(Class<?> subclass) { throw new UnsupportedOperationException(); }
        @Override public JavaType widenBy(Class<?> subclass) { throw new UnsupportedOperationException(); }
        @Override public String containedTypeName(int index) { return null; }
        @Override public boolean isContainerType() { return true; }
        @Override public JavaType forcedNarrowBy(Class<?> subclass) { throw new UnsupportedOperationException(); }
        @Override public String toString() { return rawClass.getName(); }
        @Override public boolean equals(Object o) { if (o instanceof StubJavaType) return ((StubJavaType)o).rawClass == rawClass; return false; }
        @Override public int hashCode() { return rawClass.hashCode(); }
    }

    static class StubValueInstantiator extends ValueInstantiator {
        private final boolean canDefault;
        private final boolean canDelegate;
        private final boolean canFromObject;
        public StubValueInstantiator(boolean canDefault, boolean canDelegate, boolean canFromObject) {
            this.canDefault = canDefault;
            this.canDelegate = canDelegate;
            this.canFromObject = canFromObject;
        }
        @Override public boolean canCreateUsingDefault() { return canDefault; }
        @Override public boolean canCreateUsingDelegate() { return canDelegate; }
        @Override public boolean canCreateFromObjectWith() { return canFromObject; }
        @Override public JavaType getDelegateType(DeserializationConfig config) { return null; }
        @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return new SettableBeanProperty[0]; }
        @Override public Object createUsingDefault(DeserializationContext ctxt) throws IOException { return new HashMap<Object,Object>(); }
        @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return delegate; }
        @Override public Object createFromString(DeserializationContext ctxt, String value) throws IOException { return new HashMap<Object,Object>(); }
    }

    static class StubKeyDeserializer extends KeyDeserializer {
        @Override public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException { return key; }
    }

    static class StubJsonDeserializer extends JsonDeserializer<Object> {
        private Object value;
        private boolean nullValue;
        private ObjectIdReader oidReader;
        public StubJsonDeserializer(Object value, boolean nullValue, ObjectIdReader oidReader) {
            this.value = value;
            this.nullValue = nullValue;
            this.oidReader = oidReader;
        }
        @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return value; }
        @Override public Object getNullValue() { return nullValue ? null : value; }
        @Override public ObjectIdReader getObjectIdReader() { return oidReader; }
    }

    static class StubTypeDeserializer extends TypeDeserializer {
        @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
        @Override public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException { return "typed"; }
    }

    static class StubDeserializerFactory extends DeserializerFactory {
        @Override public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc, Class<?> builderClass) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig config, JavaType type, JsonNode node) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException { return null; }
        @Override public TypeDeserializer createTypeDeserializer(DeserializationConfig config, JavaType baseType, BeanProperty property) throws JsonMappingException { return null; }
        @Override public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException { return null; }
        @Override public JsonDeserializer<Object> findDefaultDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException { return null; }
        @Override public String getDefaultFactoryClassName() { return "Stub"; }
        @Override public JavaType mapType(Class<?> rawClass) { return null; }
        @Override public JavaType resolveMemberType(JavaType type, Class<?> rawClass) { return null; }
    }

    static class StubDeserializationContext extends DeserializationContext {
        private KeyDeserializer keyDes;
        private JsonDeserializer<?> valueDes;
        private AnnotationIntrospector intr;
        protected StubDeserializationContext(DeserializerFactory df) { super(df); }
        public void setKeyDeserializer(KeyDeserializer kd) { this.keyDes = kd; }
        public void setValueDeserializer(JsonDeserializer<?> vd) { this.valueDes = vd; }
        public void setAnnotationIntrospector(AnnotationIntrospector ai) { this.intr = ai; }
        @Override public KeyDeserializer findKeyDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException { return keyDes; }
        @Override public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException { return (JsonDeserializer<Object>) valueDes; }
        @Override public JsonDeserializer<Object> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty prop) throws JsonMappingException { return (JsonDeserializer<Object>) deser; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return intr; }
        @Override public JsonMappingException instantiationException(Class<?> instClass, String msg) { return new JsonMappingException(msg); }
        @Override public JsonMappingException mappingException(Class<?> targetClass) { return new JsonMappingException("mapping exception"); }
        @Override public JsonMappingException mappingException(String msg) { return new JsonMappingException(msg); }
        @Override public DeserializationConfig getConfig() { return null; }
        @Override public DeserializerFactory getFactory() { return null; }
        @Override public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException { return null; }
        @Override public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
        @Override public com.fasterxml.jackson.databind.node.NodeFactory getNodeFactory() { throw new UnsupportedOperationException(); }
        @Override public JavaType constructType(Class<?> cls) { return TypeFactory.defaultInstance().constructType(cls); }
        @Override public JavaType constructArrayType(Class<?> cls) { return TypeFactory.defaultInstance().constructArrayType(cls); }
        @Override public JavaType constructMapType(Class<?> cls) { return TypeFactory.defaultInstance().constructMapType(cls, Object.class, Object.class); }
        @Override public JavaType constructCollectionType(Class<?> cls) { return TypeFactory.defaultInstance().constructCollectionType(cls, Object.class); }
        @Override public JavaType constructReferenceType(Class<?> cls) { throw new UnsupportedOperationException(); }
        @Override public JavaType constructSpecializedType(JavaType base, Class<?> subclass) { return TypeFactory.defaultInstance().constructSpecializedType(base, subclass); }
        @Override public <T> T handleResolvedObject(DeserializationContext ctxt, Object resolvedObject) { return (T) resolvedObject; }
        @Override public boolean isEnabled(DeserializationFeature feature) { return false; }
        @Override public boolean isEnabled(StreamReadFeature feature) { return false; }
        @Override public boolean isEnabled(MapperFeature feature) { return false; }
        @Override public Class<?> getActiveView() { return null; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public Object setAttribute(Object key, Object value) { return null; }
        @Override public Locale getLocale() { return Locale.getDefault(); }
        @Override public TimeZone getTimeZone() { return TimeZone.getDefault(); }
        @Override public DateFormat getDateFormat() { return new SimpleDateFormat("yyyy-MM-dd"); }
        @Override public Calendar getCalendar() { return Calendar.getInstance(); }
        @Override public boolean hasExplicitTimeZone() { return false; }
        @Override public Object getInjectableValue(Object valueId) { return null; }
        @Override public DeserializationContext createInstance(DeserializationConfig config, JsonParser jp) { throw new UnsupportedOperationException(); }
        @Override public DeserializationContext createInstance(DeserializationConfig config, JsonParser jp, InjectableValues injectableValues) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException weirdKeyException(Class<?> keyClass, String keyValue, String msg) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException weirdKeyException(Class<?> keyClass, String keyValue, String msg, Throwable cause) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException weirdStringException(String value, Class<?> targetType, String msg) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException weirdStringException(String value, Class<?> targetType, String msg, Throwable cause) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException weirdNumberException(Number value, Class<?> targetType, String msg) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException weirdNumberException(Number value, Class<?> targetType, String msg, Throwable cause) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException wrongTokenException(JsonParser p, JsonToken expToken, String msg) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException wrongTokenException(JsonParser p, JsonToken expToken, String msg, Throwable cause) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException unknownTypeException(JavaType type, String id) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException endOfInputException(Class<?> instClass) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException instantiationException(Class<?> instClass, Throwable cause) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException canNotConstructInstance(Class<?> type) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException mappingException(Class<?> targetClass, Throwable cause) { throw new UnsupportedOperationException(); }
        @Override public JsonMappingException mappingException(Throwable cause) { throw new UnsupportedOperationException(); }
    }

    static class StubJsonParser extends JsonParser {
        private List<JsonToken> tokens;
        private List<String> fieldNames;
        private int index;
        private String text;
        public StubJsonParser(List<JsonToken> tokens, List<String> fieldNames) {
            this.tokens = tokens;
            this.fieldNames = fieldNames;
            this.index = 0;
        }
        @Override public JsonToken getCurrentToken() { return tokens.get(index); }
        @Override public JsonToken nextToken() { index++; return index < tokens.size() ? tokens.get(index) : null; }
        @Override public String getCurrentName() { if (fieldNames != null && index < fieldNames.size()) return fieldNames.get(index); return null; }
        @Override public String getText() { return text; }
        public void setText(String t) { this.text = t; }
        @Override public void skipChildren() {
            int depth = 0;
            JsonToken t = getCurrentToken();
            while (t != null) {
                if (t == JsonToken.START_OBJECT || t == JsonToken.START_ARRAY) depth++;
                else if (t == JsonToken.END_OBJECT || t == JsonToken.END_ARRAY) { depth--; if (depth == 0) break; }
                t = nextToken();
            }
        }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public boolean hasCurrentToken() { return false; }
        @Override public boolean hasToken(JsonToken t) { return getCurrentToken() == t; }
        @Override public boolean isExpectedStartObjectToken() { return false; }
        @Override public void clearCurrentToken() {}
        @Override public JsonToken getLastClearedToken() { return null; }
        @Override public void overrideCurrentName(String name) {}
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public Object getCurrentValue() { return null; }
        @Override public void setCurrentValue(Object v) {}
        @Override public int releaseBuffered(java.io.OutputStream out) throws IOException { return 0; }
        @Override public Object getEmbeddedObject() { return null; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override public String getValueAsString(String def) { return null; }
        @Override public int getValueAsInt(int def) { return 0; }
        @Override public long getValueAsLong(long def) { return 0; }
        @Override public double getValueAsDouble(double def) { return 0.0; }
        @Override public boolean getValueAsBoolean(boolean def) { return false; }
        @Override public boolean isClosed() { return false; }
        @Override public JsonParser skipChildren() { skipChildren(); return this; }
        @Override public JsonParser enable(Feature f) { return this; }
        @Override public JsonParser disable(Feature f) { return this; }
        @Override public boolean isEnabled(Feature f) { return false; }
        @Override public int getFeatureMask() { return 0; }
        @Override public JsonParser setFeatureMask(int mask) { return this; }
        @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
        @Override public JsonParser setCodec(ObjectCodec c) { return this; }
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void close() throws IOException {}
        @Override public boolean nextFieldName(SerializableString str) throws IOException { return false; }
        @Override public String nextFieldName() throws IOException { return null; }
        @Override public String nextTextValue() throws IOException { return null; }
        @Override public int nextIntValue(int defaultValue) throws IOException { return 0; }
        @Override public long nextLongValue(long defaultValue) throws IOException { return 0; }
        @Override public Boolean nextBooleanValue() throws IOException { return null; }
        @Override public void finishToken() throws IOException {}
        @Override public JsonToken nextValue() throws IOException { return nextToken(); }
        @Override public Number getNumberValue() { return null; }
        @Override public NumberType getNumberType() { return null; }
        @Override public String getValueAsString() throws IOException { return null; }
        @Override public int getValueAsInt() throws IOException { return 0; }
        @Override public long getValueAsLong() throws IOException { return 0; }
        @Override public double getValueAsDouble() throws IOException { return 0.0; }
        @Override public boolean getValueAsBoolean() throws IOException { return false; }
        @Override public <T> T readValueAs(Class<T> valueType) throws IOException { throw new UnsupportedOperationException(); }
        @Override public <T> T readValueAs(TypeReference<?> valueTypeRef) throws IOException { throw new UnsupportedOperationException(); }
        @Override public <T> T readValueAs(JavaType valueType) throws IOException { throw new UnsupportedOperationException(); }
        @Override public <T extends TreeNode> T readValueAsTree() throws IOException { throw new UnsupportedOperationException(); }
    }

    // ---- Test fields ----
    private StubDeserializerFactory factory;
    private StubDeserializationContext ctxt;
    private StubValueInstantiator defaultInstantiator;
    private StubValueInstantiator noDefaultInstantiator;
    private StubKeyDeserializer keyDeser;
    private StubJsonDeserializer valueDeser;
    private StubTypeDeserializer typeDeser;
    private StubJavaType mapType;
    private MapDeserializer deser;

    @Before
    public void setUp() {
        factory = new StubDeserializerFactory();
        ctxt = new StubDeserializationContext(factory);
        keyDeser = new StubKeyDeserializer();
        valueDeser = new StubJsonDeserializer("value", false, null);
        typeDeser = new StubTypeDeserializer();
        mapType = new StubJavaType(HashMap.class, String.class, String.class);
        defaultInstantiator = new StubValueInstantiator(true, false, false);
        noDefaultInstantiator = new StubValueInstantiator(false, false, false);
        deser = new MapDeserializer(mapType, defaultInstantiator, keyDeser, valueDeser, typeDeser);
    }

    private JsonParser createParser(List<JsonToken> tokens, List<String> fieldNames) {
        return new StubJsonParser(tokens, fieldNames);
    }

    // ===== Test methods =====

    @Test
    public void testDeserializeUsingCreator() throws Exception {
        deser._propertyBasedCreator = new PropertyBasedCreator() {
            @Override
            public PropertyValueBuffer startBuilding(JsonParser jp, DeserializationContext context, ObjectIdReader oidReader) {
                return new PropertyValueBuffer(jp, context, 0, null);
            }
            @Override
            public SettableBeanProperty findCreatorProperty(String name) { return null; }
            @Override
            public Object build(DeserializationContext ctxt, PropertyValueBuffer buffer) throws Exception {
                return new HashMap<Object,Object>();
            }
        };
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT),
            Arrays.asList("key1")
        );
        Map<Object,Object> result = deser.deserialize(jp, ctxt);
        assertNotNull(result);
        assertTrue(result.containsKey("key1"));
    }

    @Test
    public void testDeserializeUsingDelegate() throws Exception {
        deser._delegateDeserializer = new StubJsonDeserializer("delegate", false, null);
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.END_OBJECT),
            null
        );
        Map<Object,Object> result = deser.deserialize(jp, ctxt);
        assertEquals("delegate", result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNoDefaultCreator() throws Exception {
        MapDeserializer noDefDeser = new MapDeserializer(mapType, noDefaultInstantiator, keyDeser, valueDeser, typeDeser);
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.END_OBJECT),
            null
        );
        noDefDeser.deserialize(jp, ctxt);
    }

    @Test
    public void testDeserializeFromString() throws Exception {
        StubValueInstantiator instantiator = new StubValueInstantiator(true, false, false) {
            @Override
            public Object createFromString(DeserializationContext ctxt, String value) throws IOException {
                Map<Object,Object> m = new HashMap<>();
                m.put("fromString", value);
                return m;
            }
        };
        MapDeserializer stringDeser = new MapDeserializer(mapType, instantiator, keyDeser, valueDeser, typeDeser);
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.VALUE_STRING),
            null
        );
        ((StubJsonParser)jp).setText("testString");
        Map<Object,Object> result = stringDeser.deserialize(jp, ctxt);
        assertNotNull(result);
        assertEquals("testString", result.get("fromString"));
    }

    @Test
    public void testDeserializeStandardStringKey() throws Exception {
        deser._standardStringKey = true;
        deser._ignorableProperties = null;
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT),
            Arrays.asList("key1")
        );
        Map<Object,Object> result = deser.deserialize(jp, ctxt);
        assertNotNull(result);
        assertEquals("value", result.get("key1"));
    }

    @Test
    public void testDeserializeNonStandardStringKey() throws Exception {
        deser._standardStringKey = false;
        deser._ignorableProperties = null;
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT),
            Arrays.asList("key1")
        );
        Map<Object,Object> result = deser.deserialize(jp, ctxt);
        assertNotNull(result);
        assertEquals("value", result.get("key1"));
    }

    @Test
    public void testDeserializeOverloaded() throws Exception {
        deser._standardStringKey = true;
        Map<Object,Object> existing = new HashMap<>();
        existing.put("exist", "val");
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT),
            Arrays.asList("newkey")
        );
        Map<Object,Object> result = deser.deserialize(jp, ctxt, existing);
        assertSame(existing, result);
        assertEquals("val", result.get("exist"));
        assertEquals("value", result.get("newkey"));
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.END_OBJECT),
            null
        );
        Object result = deser.deserializeWithType(jp, ctxt, typeDeser);
        assertEquals("typed", result);
    }

    @Test
    public void testIsCachableWithNullTypeDeser() throws Exception {
        MapDeserializer d = new MapDeserializer(mapType, defaultInstantiator, keyDeser, valueDeser, null);
        assertTrue(d.isCachable());
        d._ignorableProperties = new HashSet<String>(Arrays.asList("x"));
        assertFalse(d.isCachable());
    }

    @Test
    public void testSetIgnorableProperties() throws Exception {
        assertNull(deser._ignorableProperties);
        deser.setIgnorableProperties(new String[] {"a", "b"});
        assertNotNull(deser._ignorableProperties);
        assertTrue(deser._ignorableProperties.contains("a"));
        assertTrue(deser._ignorableProperties.contains("b"));
        deser.setIgnorableProperties(new String[0]);
        assertNull(deser._ignorableProperties);
        deser.setIgnorableProperties(null);
        assertNull(deser._ignorableProperties);
    }

    @Test
    public void testReadAndBindEmpty() throws Exception {
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.END_OBJECT),
            null
        );
        Map<Object,Object> result = new HashMap<>();
        deser._readAndBind(jp, ctxt, result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testReadAndBindOneField() throws Exception {
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT),
            Arrays.asList("key1")
        );
        Map<Object,Object> result = new HashMap<>();
        deser._readAndBind(jp, ctxt, result);
        assertEquals("value", result.get("key1"));
    }

    @Test
    public void testReadAndBindWithIgnorable() throws Exception {
        deser._ignorableProperties = new HashSet<String>(Arrays.asList("ignoreMe"));
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT,
                          JsonToken.FIELD_NAME, JsonToken.VALUE_STRING,
                          JsonToken.FIELD_NAME, JsonToken.VALUE_STRING,
                          JsonToken.END_OBJECT),
            Arrays.asList("ignoreMe", "keepMe")
        );
        Map<Object,Object> result = new HashMap<>();
        deser._readAndBind(jp, ctxt, result);
        assertNull(result.get("ignoreMe"));
        assertEquals("value", result.get("keepMe"));
    }

    @Test
    public void testReadAndBindWithTypeDeser() throws Exception {
        deser._valueTypeDeserializer = typeDeser;
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT),
            Arrays.asList("key1")
        );
        Map<Object,Object> result = new HashMap<>();
        deser._readAndBind(jp, ctxt, result);
        assertEquals("typed", result.get("key1"));
    }

    @Test
    public void testReadAndBindStringMap() throws Exception {
        deser._standardStringKey = true;
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT),
            Arrays.asList("key1")
        );
        Map<Object,Object> result = new HashMap<>();
        deser._readAndBindStringMap(jp, ctxt, result);
        assertEquals("value", result.get("key1"));
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow() throws IOException {
        Throwable cause = new InvocationTargetException(new RuntimeException("inner"));
        deser.wrapAndThrow(cause, new Object(), "key");
    }

    @Test
    public void testResolve() throws Exception {
        deser.resolve(ctxt);
    }

    @Test
    public void testCreateContextual() throws Exception {
        ctxt.setKeyDeserializer(keyDeser);
        ctxt.setValueDeserializer(valueDeser);
        ctxt.setAnnotationIntrospector(null);
        JsonDeserializer<?> result = deser.createContextual(ctxt, null);
        assertNotNull(result);
        assertTrue(result instanceof MapDeserializer);
        MapDeserializer md = (MapDeserializer) result;
        assertSame(deser, md);
    }

    @Test
    public void testGetters() throws Exception {
        assertSame(mapType.getContentType(), deser.getContentType());
        assertSame(valueDeser, deser.getContentDeserializer());
        assertEquals(HashMap.class, deser.getMapClass());
        assertSame(mapType, deser.getValueType());
    }

    @Test
    public void testReadAndBindNullValue() throws Exception {
        JsonParser jp = createParser(
            Arrays.asList(JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_NULL, JsonToken.END_OBJECT),
            Arrays.asList("k")
        );
        Map<Object,Object> result = new HashMap<>();
        valueDeser.nullValue = true;
        deser._readAndBind(jp, ctxt, result);
        assertNull(result.get("k"));
    }
}