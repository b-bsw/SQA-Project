package com.fasterxml.jackson.databind.deser;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class SettableAnyPropertyTest {

    // ----- Helper POJOs -----
    public static class MapHolder {
        public Map<Object, Object> anySet = new HashMap<>();
    }

    public static class MethodHolder {
        public Object lastProp;
        public Object lastValue;
        public void anySetter(Object prop, Object value) {
            lastProp = prop;
            lastValue = value;
        }
    }

    public static class ThrowingHolder {
        public void setAny(Object prop, Object value) {
            throw new IllegalArgumentException("forced");
        }
    }

    // ----- Mock classes -----
    private static class MockJsonParser extends JsonParser {
        private final JsonToken token;
        public MockJsonParser(JsonToken t) { this.token = t; }

        @Override public JsonToken getCurrentToken() { return token; }
        @Override public JsonToken getLastClearedToken() { return null; }
        @Override public boolean hasCurrentToken() { return token != null; }
        @Override public String getCurrentName() { return null; }
        @Override public void clearCurrentToken() {}
        @Override public JsonParser skipChildren() { return this; }
        @Override public Object getEmbeddedObject() { return null; }
        @Override public boolean isExpectedStartArrayToken() { return false; }
        @Override public boolean isExpectedStartObjectToken() { return false; }
        @Override public int getValueAsInt() { return 0; }
        @Override public long getValueAsLong() { return 0L; }
        @Override public double getValueAsDouble() { return 0.0; }
        @Override public boolean getValueAsBoolean() { return false; }
        @Override public String getValueAsString() { return null; }
        @Override public String getValueAsString(String dflt) { return dflt; }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public byte[] getBinaryValue(Base64Variant b64) { return new byte[0]; }
        @Override public boolean isClosed() { return false; }
        @Override public Object getCurrentValue() { return null; }
        @Override public TokenLocation getCurrentTokenLocation() { return null; }
        @Override public TokenLocation getCurrentLocation() { return null; }
        @Override public int getValueAsInt(int def) { return def; }
        @Override public long getValueAsLong(long def) { return def; }
        @Override public double getValueAsDouble(double def) { return def; }
        @Override public boolean getValueAsBoolean(boolean def) { return def; }
        @Override public String getText() { return null; }
        @Override public char[] getTextCharacters() { return null; }
        @Override public int getTextLength() { return 0; }
        @Override public int getTextOffset() { return 0; }
        @Override public Object getNumberValue() { return null; }
        @Override public NumberType numberType() { return NumberType.INT; }
    }

    private static class MockDeserializationContext extends DeserializationContext {
        @Override public Object findObjectId(Object id, ObjectIdGenerator<?> gen, ObjectIdResolver resolverType) { return null; }
        @Override public ReadableObjectId readObjectId(Object id, ObjectIdGenerator<?> gen, ObjectIdResolver resolverType) { return null; }
        @Override public void addResolutionKey(ObjectIdGenerator<?> gen, ObjectIdResolver resolverType) {}
        @Override public void handleUnresolvedObjectId(ReadableObjectId roid, Object pojo, DeserializationContext ctxt) {}
        @Override public JsonMappingException mappingException(String message) { return new JsonMappingException(null, message); }
        @Override public JsonMappingException badInputException(TypeValueHandler handler, String msg, Object token) { return new JsonMappingException(null, msg); }
        @Override public JsonMappingException instantiationException(Class<?> instClass, Exception e) { return new JsonMappingException(null, e.getMessage()); }
        @Override public JsonMappingException unknownTypeException(JavaType type, String id) { return new JsonMappingException(null, id); }
        @Override public JsonMappingException wrongUsageException(DeserializableString d, String msg) { return new JsonMappingException(null, msg); }
        @Override public Object deserializerInstance(DeserializationConfig config, Object deser) { return deser; }
        @Override public Class<?> findType(DeserializationConfig config, JavaType type) { return null; }
        @Override public TypeDeserializer findTypeDeserializer(DeserializationConfig config, JavaType type) { return null; }
        @Override public boolean isEnabled(DeserializationFeature feature) { return false; }
        @Override public int getCurrentRepeatedCount() { return 0; }
        @Override public void addRepeatedValue(Object repeatedValue) {}
    }

    private static class MockJsonDeserializer extends JsonDeserializer<Object> {
        private final Object result;
        private final boolean throwUnresolved;
        private final ObjectIdReader oidReader;

        public MockJsonDeserializer(Object result) { this.result = result; this.throwUnresolved = false; this.oidReader = null; }
        public MockJsonDeserializer(boolean throwUnresolved, ObjectIdReader oidReader) { this.result = null; this.throwUnresolved = throwUnresolved; this.oidReader = oidReader; }

        @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (throwUnresolved) throw new UnresolvedForwardReference(null, "test", null);
            return result;
        }
        @Override public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeser) throws IOException {
            return "deserializedWithType";
        }
        @Override public Object getNullValue(DeserializationContext ctxt) { return "nullValue"; }
        @Override public ObjectIdReader getObjectIdReader() { return oidReader; }
    }

    private static class MockKeyDeserializer extends KeyDeserializer {
        @Override public Object deserializeKey(String key, DeserializationContext ctxt) {
            return "key_" + key;
        }
    }

    private static class MockTypeDeserializer extends TypeDeserializer {
        @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) { return "typedValue"; }
        @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) { return null; }
        @Override public Object deserializeTypedFromString(JsonParser p, DeserializationContext ctxt) { return null; }
        @Override public JavaType getBaseType() { return null; }
        @Override public String getDefaultTypeId() { return null; }
        @Override public String ensureTypeId(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    // Recording setter for fixAccess test
    private static class RecordingAnnotatedMember extends AnnotatedMember {
        boolean fixAccessCalled = false;
        boolean fixAccessArg;

        @Override public void fixAccess(boolean b) { fixAccessCalled = true; fixAccessArg = b; }
        @Override public Annotated getAnnotated() { return null; }
        @Override public Class<?> getDeclaringClass() { return RecordingAnnotatedMember.class; }
        @Override public AnnotatedMember withAnnotations(AnnotationMap fallback) { return this; }
        @Override public JavaType getType() { return null; }
    }

    // ----- Tests -----

    @Test
    public void testConstructorAndAccessors() {
        SettableAnyProperty sp = new SettableAnyProperty(null, null, null, null, null, null);
        assertNull(sp.getProperty());
        assertNull(sp.getType());
        assertFalse(sp.hasValueDeserializer());
        // with valueDeserializer non-null
        JsonDeserializer<Object> deser = new MockJsonDeserializer("val");
        SettableAnyProperty sp2 = new SettableAnyProperty(null, null, null, null, deser, null);
        assertTrue(sp2.hasValueDeserializer());
    }

    @Test
    public void testWithValueDeserializer() {
        JsonDeserializer<Object> d1 = new MockJsonDeserializer("a");
        SettableAnyProperty sp = new SettableAnyProperty(null, null, null, null, d1, null);
        JsonDeserializer<Object> d2 = new MockJsonDeserializer("b");
        SettableAnyProperty sp2 = sp.withValueDeserializer(d2);
        assertNotSame(sp, sp2);
        assertTrue(sp2.hasValueDeserializer());
        assertNull(sp2.getProperty());
        assertNull(sp2.getType());
    }

    @Test
    public void testFixAccess() throws Exception {
        RecordingAnnotatedMember setter = new RecordingAnnotatedMember();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig configFalse = mapper.getDeserializationConfig();
        DeserializationConfig configTrue = configFalse.enable(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);

        SettableAnyProperty sp = new SettableAnyProperty(null, setter, null, null, null, null);
        sp.fixAccess(configTrue);
        assertTrue(setter.fixAccessCalled);
        assertTrue(setter.fixAccessArg);

        setter.fixAccessCalled = false;
        sp.fixAccess(configFalse);
        assertTrue(setter.fixAccessCalled);
        assertFalse(setter.fixAccessArg);
    }

    @Test
    public void testSetWithFieldSetter() throws Exception {
        MapHolder holder = new MapHolder();
        Field field = MapHolder.class.getField("anySet");
        AnnotatedField afield = new AnnotatedField(field, null, null);
        SettableAnyProperty sp = new SettableAnyProperty(null, afield, null, null, null, null);
        // map non-null
        assertTrue(holder.anySet.isEmpty());
        sp.set(holder, "key1", "value1");
        assertEquals(1, holder.anySet.size());
        assertEquals("value1", holder.anySet.get("key1"));
        // map null
        MapHolder nullMap = new MapHolder();
        nullMap.anySet = null;
        sp.set(nullMap, "key2", "value2"); // should not throw
    }

    @Test
    public void testSetWithMethodSetter() throws Exception {
        MethodHolder holder = new MethodHolder();
        Method method = MethodHolder.class.getMethod("anySetter", Object.class, Object.class);
        AnnotatedMethod amethod = new AnnotatedMethod(method, null, null);
        SettableAnyProperty sp = new SettableAnyProperty(null, amethod, null, null, null, null);
        sp.set(holder, "prop", "val");
        assertEquals("prop", holder.lastProp);
        assertEquals("val", holder.lastValue);
    }

    @Test(expected = IOException.class)
    public void testSetWithExceptionThrowsIOException() throws Exception {
        Method method = ThrowingHolder.class.getMethod("setAny", Object.class, Object.class);
        AnnotatedMethod amethod = new AnnotatedMethod(method, null, null);
        SettableAnyProperty sp = new SettableAnyProperty(null, amethod, null, null, null, null);
        sp.set(new ThrowingHolder(), "prop", "val");
    }

    @Test
    public void testDeserialize() throws IOException {
        MockJsonDeserializer deser = new MockJsonDeserializer("normal");
        MockDeserializationContext ctxt = new MockDeserializationContext();
        SettableAnyProperty sp = new SettableAnyProperty(null, null, null, null, deser, null);

        // null token -> getNullValue
        MockJsonParser parserNull = new MockJsonParser(JsonToken.VALUE_NULL);
        Object result = sp.deserialize(parserNull, ctxt);
        assertEquals("nullValue", result);

        // non-null token, no typeDeser
        MockJsonParser parserVal = new MockJsonParser(JsonToken.VALUE_STRING);
        result = sp.deserialize(parserVal, ctxt);
        assertEquals("normal", result);

        // non-null token, with typeDeser
        MockTypeDeserializer typeDeser = new MockTypeDeserializer();
        SettableAnyProperty sp2 = new SettableAnyProperty(null, null, null, null, deser, typeDeser);
        result = sp2.deserialize(parserVal, ctxt);
        assertEquals("deserializedWithType", result);
    }

    @Test
    public void testDeserializeAndSetNormal() throws IOException {
        MethodHolder holder = new MethodHolder();
        Method method = MethodHolder.class.getMethod("anySetter", Object.class, Object.class);
        AnnotatedMethod amethod = new AnnotatedMethod(method, null, null);
        MockJsonDeserializer deser = new MockJsonDeserializer("testValue");
        SettableAnyProperty sp = new SettableAnyProperty(null, amethod, null, null, deser, null);

        MockJsonParser parser = new MockJsonParser(JsonToken.VALUE_STRING);
        MockDeserializationContext ctxt = new MockDeserializationContext();
        sp.deserializeAndSet(parser, ctxt, holder, "propName");
        assertEquals("propName", holder.lastProp);
        assertEquals("testValue", holder.lastValue);
    }

    @Test
    public void testDeserializeAndSetWithKeyDeserializer() throws IOException {
        MethodHolder holder = new MethodHolder();
        Method method = MethodHolder.class.getMethod("anySetter", Object.class, Object.class);
        AnnotatedMethod amethod = new AnnotatedMethod(method, null, null);
        MockJsonDeserializer deser = new MockJsonDeserializer("val");
        MockKeyDeserializer keyDeser = new MockKeyDeserializer();
        SettableAnyProperty sp = new SettableAnyProperty(null, amethod, null, keyDeser, deser, null);

        MockJsonParser parser = new MockJsonParser(JsonToken.VALUE_STRING);
        MockDeserializationContext ctxt = new MockDeserializationContext();
        sp.deserializeAndSet(parser, ctxt, holder, "someKey");
        assertEquals("key_someKey", holder.lastProp);
        assertEquals("val", holder.lastValue);
    }

    @Test
    public void testDeserializeAndSetWithForwardReferenceNoIdentity() throws IOException {
        MethodHolder holder = new MethodHolder();
        Method method = MethodHolder.class.getMethod("anySetter", Object.class, Object.class);
        AnnotatedMethod amethod = new AnnotatedMethod(method, null, null);
        MockJsonDeserializer deser = new MockJsonDeserializer(true, null);
        SettableAnyProperty sp = new SettableAnyProperty(null, amethod, null, null, deser, null);

        MockJsonParser parser = new MockJsonParser(JsonToken.VALUE_STRING);
        MockDeserializationContext ctxt = new MockDeserializationContext();
        try {
            sp.deserializeAndSet(parser, ctxt, holder, "prop");
            fail("Expected IOException/JsonMappingException");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
            String msg = e.getMessage();
            assertTrue(msg.contains("Unresolved forward reference but no identity info"));
        }
    }

    @Test
    public void testDeserializeAndSetWithForwardReferenceWithIdentity() throws IOException {
        final List<ReadableObjectId.Referring> capturedRefs = new ArrayList<>();
        class MockReadableObjectId extends ReadableObjectId {
            List<ReadableObjectId.Referring> refs = new ArrayList<>();
            public MockReadableObjectId(Object id) { super(id); }
            @Override
            public void appendReferring(Referring ref) { refs.add(ref); }
        }
        MockReadableObjectId roid = new MockReadableObjectId("id1");

        class MockForwardRef extends UnresolvedForwardReference {
            public MockForwardRef(ReadableObjectId roid) { super(null, "test"); this._roid = roid; }
        }

        ObjectIdReader oidReader = new ObjectIdReader(null, null, null, null);
        class ThrowingDeserializer extends JsonDeserializer<Object> {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new MockForwardRef(roid);
            }
            @Override public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeser) {
                return null;
            }
            @Override public Object getNullValue(DeserializationContext ctxt) { return null; }
            @Override public ObjectIdReader getObjectIdReader() { return oidReader; }
        }

        MethodHolder holder = new MethodHolder();
        Method method = MethodHolder.class.getMethod("anySetter", Object.class, Object.class);
        AnnotatedMethod amethod = new AnnotatedMethod(method, null, null);
        SettableAnyProperty sp = new SettableAnyProperty(null, amethod, null, null, new ThrowingDeserializer(), null);

        MockJsonParser parser = new MockJsonParser(JsonToken.VALUE_STRING);
        MockDeserializationContext ctxt = new MockDeserializationContext();
        sp.deserializeAndSet(parser, ctxt, holder, "propName");
        assertEquals(1, roid.refs.size());
    }

    @Test
    public void testThrowAsIOE() throws IOException {
        Field field = MapHolder.class.getField("anySet");
        AnnotatedField afield = new AnnotatedField(field, null, null);
        SettableAnyProperty sp = new SettableAnyProperty(null, afield, null, null, null, null);

        // IllegalArgumentException with message
        try {
            sp._throwAsIOE(new IllegalArgumentException("original msg"), "prop", 42);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
            String msg = e.getMessage();
            assertTrue(msg.contains("Problem deserializing \"any\" property 'prop'"));
            assertTrue(msg.contains("original msg"));
            assertTrue(msg.contains("expected type: null"));
        }

        // IllegalArgumentException without message
        try {
            sp._throwAsIOE(new IllegalArgumentException(), "prop", "value");
            fail();
        } catch (IOException e) {
            String msg = e.getMessage();
            assertTrue(msg.contains("(no error message provided)"));
        }

        // IOException directly
        try {
            sp._throwAsIOE(new IOException("io ex"), "prop", "val");
            fail();
        } catch (IOException e) {
            assertEquals("io ex", e.getMessage());
        }

        // RuntimeException
        try {
            sp._throwAsIOE(new RuntimeException("rt ex"), "prop", "val");
            fail();
        } catch (IOException e) {
            assertEquals("rt ex", e.getMessage());
        }

        // Other Exception
        try {
            sp._throwAsIOE(new Exception("other ex"), "prop", "val");
            fail();
        } catch (IOException e) {
            assertEquals("other ex", e.getMessage());
        }
    }
}