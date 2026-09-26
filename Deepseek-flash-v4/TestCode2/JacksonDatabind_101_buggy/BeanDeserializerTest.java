package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class BeanDeserializerTest {

    // ---------- Helper classes ----------

    static class MockValueInstantiator extends ValueInstantiator {
        @Override
        public Object createUsingDefault(DeserializationContext ctxt) {
            return "fromVanilla";
        }
        @Override
        public Object createFromString(DeserializationContext ctxt, String value) { return null; }
        @Override
        public Object createFromInt(DeserializationContext ctxt, int value) { return null; }
        @Override
        public Object createFromLong(DeserializationContext ctxt, long value) { return null; }
        @Override
        public Object createFromDouble(DeserializationContext ctxt, double value) { return null; }
        @Override
        public Object createFromBoolean(DeserializationContext ctxt, boolean value) { return null; }
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) { return null; }
        @Override
        public boolean canCreateFromString() { return false; }
        @Override
        public boolean canCreateFromInt() { return false; }
        @Override
        public boolean canCreateFromLong() { return false; }
        @Override
        public boolean canCreateFromDouble() { return false; }
        @Override
        public boolean canCreateFromBoolean() { return false; }
        @Override
        public boolean canCreateUsingDefault() { return true; }
        @Override
        public boolean canCreateUsingDelegate() { return false; }
        @Override
        public SettableBeanProperty[] getFromObjectArguments(DeserializationContext ctxt) { return null; }
    }

    static class StubDeserializationContext extends DeserializationContext {
        public StubDeserializationContext() {
            super(null, null);
        }
        @Override public JavaType getTypeFactory() { return null; }
        @Override public Class<?> handledType() { return Object.class; }
        @Override public Class<?> getActiveView() { return null; }
        @Override public DeserializationConfig getConfig() { return null; }
        @Override public AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override public DateFormat getDateFormat() { return null; }
        @Override public Locale getLocale() { return null; }
        @Override public TimeZone getTimeZone() { return null; }
        @Override public boolean isEnabled(MapperFeature f) { return false; }
        @Override public boolean isEnabled(DeserializationFeature f) { return false; }
        @Override public boolean isEnabled(JsonParser.Feature f) { return false; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public DeserializationContext setAttribute(Object key, Object value) { return this; }
        @Override public JavaType constructType(Class<?> cls) { return null; }
        @Override public JsonDeserializer<Object> deserializerInstance(Annotated ann, Class<?> cls) { return null; }
        @Override public JsonDeserializer<?> findRootValueDeserializer(JavaType type) { return null; }
        @Override public JsonDeserializer<?> findNonRootValueDeserializer(JavaType type) { return null; }
        @Override public JsonDeserializer<?> findDeserializerFromAnnotation(Annotated ann, AnnotationIntrospector ai) { return null; }
        @Override public JsonDeserializer<?> findConverter(Annotated ann, Class<?> toClass) { return null; }
        @Override public JsonNode getNodeFactory() { return null; }
        @Override public Object readValue(JsonParser p, JavaType valueType) { return null; }
        @Override public Object handleUnexpectedToken(JavaType targetType, JsonParser p) { return "unexpected"; }
        @Override public JsonMappingException endOfInputException(Class<?> beanType) { return new JsonMappingException("end of input"); }
        @Override public JsonMappingException reportBadDefinition(JavaType type, String msg) { return new JsonMappingException(msg); }
        @Override public JsonMappingException reportInputMismatch(BeanProperty prop, String msg) { return new JsonMappingException(msg); }
        @Override public JsonMappingException reportInputMismatch(JavaType type, String msg, JsonParser p) { return new JsonMappingException(msg); }
        @Override public JsonMappingException reportPropertyInputMismatch(JavaType type, String propName, JsonParser p) { return new JsonMappingException(propName); }
        @Override public JsonMappingException reportTrailingFields(JsonParser p) { return new JsonMappingException("trailing"); }
        @Override public boolean hasDeserializationFeatures(int mask) { return false; }
        @Override public DeserializationContext withDeserializationFeatures(int mask) { return this; }
        @Override public DeserializationContext withoutDeserializationFeatures(int mask) { return this; }
        @Override public void checkUnresolvedObjectId() {}
    }

    static class TestableBeanDeserializer extends BeanDeserializer {
        boolean deserializeFromStringCalled;
        boolean deserializeFromNumberCalled;
        boolean deserializeFromDoubleCalled;
        boolean deserializeFromEmbeddedCalled;
        boolean deserializeFromBooleanCalled;
        boolean deserializeFromNullCalled;
        boolean deserializeFromArrayCalled;
        boolean deserializeWithObjectIdCalled;
        boolean deserializeFromObjectCalled;

        TestableBeanDeserializer(BeanDeserializerBase src) {
            super(src);
        }

        @Override
        public Object deserializeFromString(JsonParser p, DeserializationContext ctxt) {
            deserializeFromStringCalled = true;
            return "fromString";
        }

        @Override
        public Object deserializeFromNumber(JsonParser p, DeserializationContext ctxt) {
            deserializeFromNumberCalled = true;
            return "fromNumber";
        }

        @Override
        public Object deserializeFromDouble(JsonParser p, DeserializationContext ctxt) {
            deserializeFromDoubleCalled = true;
            return "fromDouble";
        }

        @Override
        public Object deserializeFromEmbedded(JsonParser p, DeserializationContext ctxt) {
            deserializeFromEmbeddedCalled = true;
            return "fromEmbedded";
        }

        @Override
        public Object deserializeFromBoolean(JsonParser p, DeserializationContext ctxt) {
            deserializeFromBooleanCalled = true;
            return "fromBoolean";
        }

        @Override
        public Object deserializeFromNull(JsonParser p, DeserializationContext ctxt) {
            deserializeFromNullCalled = true;
            return "fromNull";
        }

        @Override
        public Object deserializeFromArray(JsonParser p, DeserializationContext ctxt) {
            deserializeFromArrayCalled = true;
            return "fromArray";
        }

        @Override
        public Object deserializeWithObjectId(JsonParser p, DeserializationContext ctxt) {
            deserializeWithObjectIdCalled = true;
            return "fromWithObjectId";
        }

        @Override
        public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) {
            deserializeFromObjectCalled = true;
            return "fromObject";
        }
    }

    // ---------- Helper methods ----------

    private BeanDeserializerBase createStubBase() {
        BeanDeserializerBase stub = new BeanDeserializerBase(null, null, null, null, null, false, false) {
            @Override
            public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer transformer) {
                return this;
            }
            @Override
            public BeanDeserializer withObjectIdReader(ObjectIdReader oir) {
                return null;
            }
            @Override
            public BeanDeserializer withIgnorableProperties(Set<String> ignorableProps) {
                return null;
            }
            @Override
            public BeanDeserializerBase withBeanProperties(BeanPropertyMap props) {
                return null;
            }
            @Override
            protected BeanDeserializerBase asArrayDeserializer() {
                return null;
            }
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return null;
            }
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                return null;
            }
        };
        return stub;
    }

    private JsonParser parserWithToken(JsonToken token) throws IOException {
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        switch (token) {
            case VALUE_STRING:
                buf.writeString("value");
                break;
            case VALUE_NUMBER_INT:
                buf.writeNumber(42);
                break;
            case VALUE_NUMBER_FLOAT:
                buf.writeNumber(3.14);
                break;
            case VALUE_TRUE:
                buf.writeBoolean(true);
                break;
            case VALUE_FALSE:
                buf.writeBoolean(false);
                break;
            case VALUE_NULL:
                buf.writeNull();
                break;
            case START_ARRAY:
                buf.writeStartArray();
                buf.writeEndArray();
                break;
            case VALUE_EMBEDDED_OBJECT:
                buf.writeObject("embedded");
                break;
            default:
                buf.writeStartObject();
                buf.writeEndObject();
        }
        return buf.asParser();
    }

    // ---------- Tests ----------

    @Test
    public void testUnwrappingDeserializer_subclassReturnsThis() {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        JsonDeserializer<Object> result = des.unwrappingDeserializer(NameTransformer.NOP);
        assertSame(des, result);
    }

    @Test
    public void testUnwrappingDeserializer_whenCurrentlyTransformingEqualsTransformer_returnsThis() {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        NameTransformer t = NameTransformer.NOP;
        des._currentlyTransforming = t;
        JsonDeserializer<Object> result = des.unwrappingDeserializer(t);
        assertSame(des, result);
        assertSame(t, des._currentlyTransforming);
    }

    @Test
    public void testUnwrappingDeserializer_normal_returnsNewDeserializer() {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        NameTransformer t = NameTransformer.NOP;
        JsonDeserializer<Object> result = des.unwrappingDeserializer(t);
        assertNotNull(result);
        assertNotSame(des, result);
        assertNull(des._currentlyTransforming);
    }

    @Test
    public void testWithObjectIdReader_returnsNewDeserializer() {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        BeanDeserializer result = des.withObjectIdReader(null);
        assertNotNull(result);
    }

    @Test
    public void testWithIgnorableProperties_handlesNullAndEmpty() {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        assertNotNull(des.withIgnorableProperties(null));
        assertNotNull(des.withIgnorableProperties(new HashSet<String>()));
    }

    @Test
    public void testWithBeanProperties_returnsNewDeserializer() {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        BeanPropertyMap props = new BeanPropertyMap(Collections.<SettableBeanProperty>emptyList()) {
            @Override
            public SettableBeanProperty[] getPropertiesInInsertionOrder() {
                return new SettableBeanProperty[0];
            }
        };
        assertNotNull(des.withBeanProperties(props));
    }

    @Test
    public void testAsArrayDeserializer_returnsBeanAsArrayDeserializer() {
        BeanDeserializerBase stub = createStubBase();
        stub._beanProperties = new BeanPropertyMap(Collections.<SettableBeanProperty>emptyList()) {
            @Override
            public SettableBeanProperty[] getPropertiesInInsertionOrder() {
                return new SettableBeanProperty[0];
            }
        };
        BeanDeserializer des = new BeanDeserializer(stub);
        BeanDeserializerBase result = des.asArrayDeserializer();
        assertTrue(result instanceof BeanAsArrayDeserializer);
    }

    @Test
    public void testCreatorReturnedNullException_createsAndReuses() {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        Exception first = des._creatorReturnedNullException();
        assertNotNull(first);
        assertTrue(first instanceof NullPointerException);
        assertEquals("JSON Creator returned null", first.getMessage());
        Exception second = des._creatorReturnedNullException();
        assertSame(first, second);
    }

    @Test(expected = JsonMappingException.class)
    public void testMissingToken_throwsException() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        JsonParser p = parserWithToken(JsonToken.START_OBJECT); // not used but needed
        DeserializationContext ctxt = new StubDeserializationContext();
        des._missingToken(p, ctxt);
    }

    @Test
    public void testDeserializeFromNull_requiresCustomCodecFalse() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        JsonParser p = new JsonParser() {
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public JsonToken nextToken() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            // minimal implementation for other abstract methods
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public String getCurrentName() { return null; }
            @Override public void close() throws IOException {}
            @Override public int getTextLength() { return 0; }
            @Override public char[] getTextCharacters() { return new char[0]; }
            @Override public int getTextOffset() { return 0; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean canReadObjectId() { return false; }
            @Override public Object getObjectId() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public String getText() { return null; }
            @Override public Object getEmbeddedObject() { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) { return null; }
            @Override public int getValueAsInt() { return 0; }
            @Override public long getValueAsLong() { return 0; }
            @Override public double getValueAsDouble() { return 0; }
            @Override public boolean getValueAsBoolean() { return false; }
            @Override public String getValueAsString() { return null; }
            @Override public <T> T readValueAs(Class<T> valueType) { return null; }
            @Override public <T> T readValueAs(TypeReference<?> valueTypeRef) { return null; }
            @Override public <T> T readValueAs(JavaType valueType) { return null; }
        };
        DeserializationContext ctxt = new StubDeserializationContext();
        Object result = des.deserializeFromNull(p, ctxt);
        assertEquals("unexpected", result);
    }

    @Test
    public void testDeserialize_startObject_vanillaProcessingTrue() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        stub._vanillaProcessing = true;
        stub._valueInstantiator = new MockValueInstantiator();
        BeanDeserializer des = new BeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeStartObject();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromVanilla", result);
    }

    @Test
    public void testDeserialize_startObject_vanillaProcessingFalse_noObjectId() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        stub._vanillaProcessing = false;
        stub._objectIdReader = null;
        // need to avoid non-standard creation
        stub._nonStandardCreation = false;
        stub._valueInstantiator = new MockValueInstantiator();
        stub._beanProperties = new BeanPropertyMap(Collections.<SettableBeanProperty>emptyList()) {
            @Override
            public SettableBeanProperty[] getPropertiesInInsertionOrder() { return new SettableBeanProperty[0]; }
        };
        // Use subclass to intercept deserializeFromObject
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeStartObject();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromObject", result);
        assertTrue(des.deserializeFromObjectCalled);
    }

    @Test
    public void testDeserialize_startObject_vanillaProcessingFalse_withObjectId() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        stub._vanillaProcessing = false;
        stub._objectIdReader = ObjectIdReader.construct(null, null, null, null, null);
        stub._nonStandardCreation = false;
        stub._valueInstantiator = new MockValueInstantiator();
        stub._beanProperties = new BeanPropertyMap(Collections.<SettableBeanProperty>emptyList()) {
            @Override
            public SettableBeanProperty[] getPropertiesInInsertionOrder() { return new SettableBeanProperty[0]; }
        };
        // Use subclass to intercept deserializeWithObjectId
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeStartObject();
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromWithObjectId", result);
        assertTrue(des.deserializeWithObjectIdCalled);
    }

    @Test
    public void testDeserialize_notStartObject_callsDeserializeOther_valueString() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.VALUE_STRING);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromString", result);
        assertTrue(des.deserializeFromStringCalled);
    }

    @Test
    public void testDeserializeOther_valueNumberInt() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.VALUE_NUMBER_INT);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromNumber", result);
        assertTrue(des.deserializeFromNumberCalled);
    }

    @Test
    public void testDeserializeOther_valueNumberFloat() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.VALUE_NUMBER_FLOAT);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromDouble", result);
        assertTrue(des.deserializeFromDoubleCalled);
    }

    @Test
    public void testDeserializeOther_valueEmbeddedObject() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromEmbedded", result);
        assertTrue(des.deserializeFromEmbeddedCalled);
    }

    @Test
    public void testDeserializeOther_valueTrue() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.VALUE_TRUE);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromBoolean", result);
        assertTrue(des.deserializeFromBooleanCalled);
    }

    @Test
    public void testDeserializeOther_valueFalse() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.VALUE_FALSE);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromBoolean", result);
        assertTrue(des.deserializeFromBooleanCalled);
    }

    @Test
    public void testDeserializeOther_valueNull() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.VALUE_NULL);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromNull", result);
        assertTrue(des.deserializeFromNullCalled);
    }

    @Test
    public void testDeserializeOther_startArray() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        TestableBeanDeserializer des = new TestableBeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.START_ARRAY);
        Object result = des.deserialize(p, ctxt);
        assertEquals("fromArray", result);
        assertTrue(des.deserializeFromArrayCalled);
    }

    @Test
    public void testDeserializeOther_defaultCase() throws IOException {
        BeanDeserializerBase stub = createStubBase();
        BeanDeserializer des = new BeanDeserializer(stub);
        DeserializationContext ctxt = new StubDeserializationContext();
        JsonParser p = parserWithToken(JsonToken.START_OBJECT); // start object, but not expected? Actually deserialize would go to start object path, not _deserializeOther. For default case we need a token that is not in switch and not null.
        // Use FIELD_NAME token which is not in the switch (except FIELD_NAME case goes to other branch)
        TokenBuffer buf = new TokenBuffer((ObjectCodec) null);
        buf.writeStartObject();
        buf.writeFieldName("foo");
        buf.writeString("bar");
        buf.writeEndObject();
        p = buf.asParser();
        p.nextToken(); // START_OBJECT
        // now manually set current token to FIELD_NAME? But we need to call _deserializeOther directly via deserialize when isExpectedStartObjectToken is false.
        // easiest: call _deserializeOther directly (protected)
        // but we cannot from test? package access allowed.
        // We'll call des.deserialize with a parser that has token FIELD_NAME as current token.
        JsonParser p2 = new JsonParser() {
            JsonToken current = JsonToken.FIELD_NAME;
            @Override public JsonToken getCurrentToken() { return current; }
            @Override public JsonToken nextToken() { current = null; return null; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public String getCurrentName() { return "foo"; }
            @Override public void close() {}
            @Override public int getTextLength() { return 0; }
            @Override public char[] getTextCharacters() { return new char[0]; }
            @Override public int getTextOffset() { return 0; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean canReadObjectId() { return false; }
            @Override public Object getObjectId() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public String getText() { return null; }
            @Override public Object getEmbeddedObject() { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) { return null; }
            @Override public int getValueAsInt() { return 0; }
            @Override public long getValueAsLong() { return 0; }
            @Override public double getValueAsDouble() { return 0; }
            @Override public boolean getValueAsBoolean() { return false; }
            @Override public String getValueAsString() { return null; }
            @Override public <T> T readValueAs(Class<T> valueType) { return null; }
            @Override public <T> T readValueAs(TypeReference<?> valueTypeRef) { return null; }
            @Override public <T> T readValueAs(JavaType valueType) { return null; }
        };
        Object result = des.deserialize(p2, ctxt);
        assertEquals("unexpected", result);
    }
}