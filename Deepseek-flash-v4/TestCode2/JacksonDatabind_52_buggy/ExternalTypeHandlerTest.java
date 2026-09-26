package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class ExternalTypeHandlerTest {

    private static class NonNatural { }

    private final ObjectMapper MAPPER = new ObjectMapper();
    private final DeserializationContext CTXT = MAPPER.getDeserializationContext();

    private static JavaType javaType(Class<?> cls) {
        return TypeFactory.defaultInstance().constructType(cls);
    }

    private JsonParser jsonParser(String json) throws IOException {
        return MAPPER.getFactory().createParser(json);
    }

    private static Object field(Object target, String name) throws Exception {
        Field f = ExternalTypeHandler.class.getDeclaredField(name);
        f.setAccessible(true);
        return f.get(target);
    }

    private static String[] typeIds(ExternalTypeHandler h) throws Exception {
        return (String[]) field(h, "_typeIds");
    }

    private static TokenBuffer[] tokens(ExternalTypeHandler h) throws Exception {
        return (TokenBuffer[]) field(h, "_tokens");
    }

    private ExternalTypeHandler startHandler(StubBeanProperty prop, StubTypeDeserializer typeDeser) {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        builder.addExternal(prop, typeDeser);
        return builder.build().start();
    }

    @Test
    public void testBuilderAndStart() throws Exception {
        ExternalTypeHandler empty = new ExternalTypeHandler.Builder().build().start();
        Object bean = new Object();
        assertSame(bean, empty.complete(jsonParser("{}"), CTXT, bean));

        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        assertEquals(1, typeIds(handler).length);
        assertEquals(1, tokens(handler).length);
        assertNull(typeIds(handler)[0]);
        assertNull(tokens(handler)[0]);

        JsonParser p = jsonParser("\"x\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertFalse(handler.handlePropertyValue(p, CTXT, "unknown", bean));
        assertFalse(handler.handlePropertyValue(p, CTXT, null, bean));
        assertFalse(handler.handleTypePropertyValue(p, CTXT, null, bean));
        assertFalse(handler.handleTypePropertyValue(p, CTXT, "value", bean));
    }

    @Test
    public void testHandlePropertyValueStoresTypeIdOnly() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser p = jsonParser("\"abc\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertTrue(handler.handlePropertyValue(p, CTXT, "type", null));

        assertEquals("abc", typeIds(handler)[0]);
        assertNull(tokens(handler)[0]);
        assertFalse(prop.deserializeAndSetCalled);
    }

    @Test
    public void testHandleTypePropertyValueStoresTypeId() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser p = jsonParser("\"abc\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertTrue(handler.handleTypePropertyValue(p, CTXT, "type", null));

        assertEquals("abc", typeIds(handler)[0]);
        assertFalse(prop.deserializeAndSetCalled);
    }

    @Test
    public void testHandlePropertyValueBuffersValueAndCompleteNaturalScalar() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(String.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser p = jsonParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertTrue(handler.handlePropertyValue(p, CTXT, "value", null));

        assertNotNull(tokens(handler)[0]);
        assertNull(typeIds(handler)[0]);

        Object bean = new Object();
        assertSame(bean, handler.complete(jsonParser("{}"), CTXT, bean));
        assertEquals("hello", prop.lastSetValue);
        assertTrue(prop.setCalled);
        assertFalse(prop.deserializeAndSetCalled);
    }

    @Test
    public void testCompleteWithTypeIdAndBufferedValueDeserializes() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser pType = jsonParser("\"typeId\"");
        assertEquals(JsonToken.VALUE_STRING, pType.nextToken());
        assertTrue(handler.handlePropertyValue(pType, CTXT, "type", null));

        JsonParser pVal = jsonParser("{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, pVal.nextToken());
        assertTrue(handler.handlePropertyValue(pVal, CTXT, "value", null));

        assertEquals("typeId", typeIds(handler)[0]);
        assertNotNull(tokens(handler)[0]);

        Object bean = new Object();
        assertSame(bean, handler.complete(jsonParser("{}"), CTXT, bean));
        assertTrue(prop.deserializeAndSetCalled);
        assertEquals(1, prop.deserializeAndSetCount);
        assertNotNull(prop.lastSetValue);
    }

    @Test
    public void testHandlePropertyValueTypeBranchImmediateDeserialize() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser pVal = jsonParser("{\"v\":1}");
        assertEquals(JsonToken.START_OBJECT, pVal.nextToken());
        assertTrue(handler.handlePropertyValue(pVal, CTXT, "value", null));

        JsonParser pType = jsonParser("\"typeId\"");
        assertEquals(JsonToken.VALUE_STRING, pType.nextToken());
        Object bean = new Object();
        assertTrue(handler.handlePropertyValue(pType, CTXT, "type", bean));

        assertTrue(prop.deserializeAndSetCalled);
        assertNull(typeIds(handler)[0]);
        assertNull(tokens(handler)[0]);
    }

    @Test
    public void testHandlePropertyValueImmediateDeserialize() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser pType = jsonParser("\"typeId\"");
        assertEquals(JsonToken.VALUE_STRING, pType.nextToken());
        assertTrue(handler.handlePropertyValue(pType, CTXT, "type", null));

        JsonParser pVal = jsonParser("{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, pVal.nextToken());
        Object bean = new Object();
        assertTrue(handler.handlePropertyValue(pVal, CTXT, "value", bean));

        assertTrue(prop.deserializeAndSetCalled);
        assertNull(typeIds(handler)[0]);
        assertNull(tokens(handler)[0]);
    }

    @Test
    public void testHandleTypePropertyValueImmediateDeserialize() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser pVal = jsonParser("{\"v\":1}");
        assertEquals(JsonToken.START_OBJECT, pVal.nextToken());
        assertTrue(handler.handlePropertyValue(pVal, CTXT, "value", null));

        JsonParser pType = jsonParser("\"typeId\"");
        assertEquals(JsonToken.VALUE_STRING, pType.nextToken());
        Object bean = new Object();
        assertTrue(handler.handleTypePropertyValue(pType, CTXT, "type", bean));

        assertTrue(prop.deserializeAndSetCalled);
        assertNull(typeIds(handler)[0]);
        assertNull(tokens(handler)[0]);
    }

    @Test
    public void testCompleteMissingPropertyThrows() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser p = jsonParser("\"typeId\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertTrue(handler.handlePropertyValue(p, CTXT, "type", null));

        try {
            handler.complete(jsonParser("{}"), CTXT, new Object());
            fail("should have thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Missing property"));
        }
    }

    @Test
    public void testCompleteMissingBothDoesNothing() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        Object bean = new Object();
        assertSame(bean, handler.complete(jsonParser("{}"), CTXT, bean));
        assertFalse(prop.deserializeAndSetCalled);
        assertFalse(prop.setCalled);
    }

    @Test
    public void testCompleteDefaultTypeWhenNaturalResultNull() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(NonNatural.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", NonNatural.class);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser pVal = jsonParser("\"v1\"");
        assertEquals(JsonToken.VALUE_STRING, pVal.nextToken());
        assertTrue(handler.handlePropertyValue(pVal, CTXT, "value", null));

        Object bean = new Object();
        assertSame(bean, handler.complete(jsonParser("{}"), CTXT, bean));
        assertTrue(prop.deserializeAndSetCalled);
        assertTrue(prop.setCalled);
    }

    @Test
    public void testCompleteWithNullValueSetsPropertyNull() throws Exception {
        StubBeanProperty prop = new StubBeanProperty("value", javaType(Object.class));
        StubTypeDeserializer typeDeser = new StubTypeDeserializer("type", null);
        ExternalTypeHandler handler = startHandler(prop, typeDeser);

        JsonParser pVal = jsonParser("null");
        assertEquals(JsonToken.VALUE_NULL, pVal.nextToken());
        assertTrue(handler.handlePropertyValue(pVal, CTXT, "value", null));

        JsonParser pType = jsonParser("\"typeId\"");
        assertEquals(JsonToken.VALUE_STRING, pType.nextToken());
        assertTrue(handler.handlePropertyValue(pType, CTXT, "type", null));

        Object bean = new Object();
        assertSame(bean, handler.complete(jsonParser("{}"), CTXT, bean));
        assertTrue(prop.setCalled);
        assertNull(prop.lastSetValue);
        assertFalse(prop.deserializeAndSetCalled);
    }

    private static class StubBeanProperty extends SettableBeanProperty {
        private Object lastSetValue;
        private boolean setCalled;
        private boolean deserializeAndSetCalled;
        private int deserializeAndSetCount;

        StubBeanProperty(String name, JavaType type) {
            super(new PropertyName(name), type, null, null, null, null);
        }

        @Override
        public SettableBeanProperty withName(String n) {
            return this;
        }

        @Override
        public SettableBeanProperty withName(PropertyName n) {
            return this;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return this;
        }

        @Override
        public void fixAccess(DeserializationConfig config) { }

        @Override
        public void set(Object instance, Object value) {
            setCalled = true;
            lastSetValue = value;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return "deserialized:" + p.getCurrentToken();
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            deserializeAndSetCalled = true;
            ++deserializeAndSetCount;
            set(instance, deserialize(p, ctxt));
        }
    }

    private static class StubTypeDeserializer extends TypeDeserializer {
        private final String typePropertyName;
        private final Class<?> defaultImpl;
        private final TypeIdResolver typeIdResolver = new StubTypeIdResolver();

        StubTypeDeserializer(String typePropertyName, Class<?> defaultImpl) {
            this.typePropertyName = typePropertyName;
            this.defaultImpl = defaultImpl;
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public String getPropertyName() {
            return typePropertyName;
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return typeIdResolver;
        }

        @Override
        public Class<?> getDefaultImpl() {
            return defaultImpl;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) {
            throw new UnsupportedOperationException();
        }
    }

    private static class StubTypeIdResolver implements TypeIdResolver {
        @Override
        public void init(JavaType baseType) { }

        @Override
        public String idFromValue(Object value) {
            return "typeId";
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return "typeId";
        }

        @Override
        public String idFromBaseType() {
            return "typeId";
        }

        @Override
        public JavaType typeFromId(String id) throws IOException {
            return TypeFactory.defaultInstance().constructType(Object.class);
        }
    }
}