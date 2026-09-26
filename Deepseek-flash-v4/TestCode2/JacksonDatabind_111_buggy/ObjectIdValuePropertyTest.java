package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class ObjectIdValuePropertyTest {

    private ObjectMapper mapper;
    private DeserializationConfig config;
    private JsonFactory factory;
    private ObjectIdReader oidr;
    private MockSettableBeanProperty idProp;
    private ObjectIdGenerator<String> generator;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
        factory = new JsonFactory();
        generator = new ObjectIdGenerator<String>() {
            @Override
            public Class<?> getScope() {
                return Object.class;
            }
            @Override
            public boolean canUseFor(ObjectIdGenerator<?> other) {
                return other.getClass() == getClass();
            }
            @Override
            public ObjectIdGenerator<String> forScope(Class<?> scope) {
                return this;
            }
            @Override
            public String generateId(DeserializationContext ctxt) {
                return "generated";
            }
            @Override
            public ObjectIdGenerator<String> newForSerialization() {
                return this;
            }
            @Override
            public String key(Object key) {
                return key.toString();
            }
        };
    }

    private ObjectIdValueProperty createProperty(boolean withIdProp) {
        JavaType idType = mapper.constructType(String.class);
        PropertyName propName = new PropertyName("id");
        SettableBeanProperty idPropActual;
        if (withIdProp) {
            idProp = new MockSettableBeanProperty();
            idPropActual = idProp;
        } else {
            idProp = null;
            idPropActual = null;
        }
        oidr = new ObjectIdReader(idType, propName, generator, config, idPropActual);
        return new ObjectIdValueProperty(oidr, PropertyMetadata.STD_REQUIRED);
    }

    private JsonParser createParser(String json) throws IOException {
        return factory.createParser(json);
    }

    static class MockSettableBeanProperty extends SettableBeanProperty {
        boolean setAndReturnCalled;
        Object lastInstance;
        Object lastValue;

        public MockSettableBeanProperty() {
            super(new PropertyName("mock"), null, null, null);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return null;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return null;
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return null;
        }

        @Override
        public void fixAccess(DeserializationConfig config) {
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            return null;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            setAndReturnCalled = true;
            lastInstance = instance;
            lastValue = value;
            return "setAndReturnResult";
        }
    }

    @Test
    public void testWithName() {
        ObjectIdValueProperty prop = createProperty(false);
        PropertyName newName = new PropertyName("newId");
        SettableBeanProperty newProp = prop.withName(newName);
        assertNotNull(newProp);
        assertTrue(newProp instanceof ObjectIdValueProperty);
    }

    @Test
    public void testWithValueDeserializerSame() {
        ObjectIdValueProperty prop = createProperty(false);
        JsonDeserializer<?> deser = oidr.getDeserializer();
        assertSame(prop.getValueDeserializer(), deser);
        SettableBeanProperty result = prop.withValueDeserializer(deser);
        assertSame(prop, result);
    }

    @Test
    public void testWithValueDeserializerDifferent() {
        ObjectIdValueProperty prop = createProperty(false);
        JsonDeserializer<?> differentDeser = new StringDeserializer();
        SettableBeanProperty result = prop.withValueDeserializer(differentDeser);
        assertNotNull(result);
        assertTrue(result instanceof ObjectIdValueProperty);
        assertNotSame(prop, result);
    }

    @Test
    public void testWithNullProvider() {
        ObjectIdValueProperty prop = createProperty(false);
        NullValueProvider nva = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException {
                return null;
            }
        };
        SettableBeanProperty result = prop.withNullProvider(nva);
        assertNotNull(result);
        assertTrue(result instanceof ObjectIdValueProperty);
        assertNotSame(prop, result);
    }

    @Test
    public void testGetAnnotation() {
        ObjectIdValueProperty prop = createProperty(false);
        assertNull(prop.getAnnotation(Override.class));
    }

    @Test
    public void testGetMember() {
        ObjectIdValueProperty prop = createProperty(false);
        assertNull(prop.getMember());
    }

    @Test
    public void testSetDelegatesToSetAndReturn() throws Exception {
        ObjectIdValueProperty prop = createProperty(true);
        Object instance = "instance";
        Object value = "value";
        prop.set(instance, value);
        assertTrue(idProp.setAndReturnCalled);
        assertEquals(instance, idProp.lastInstance);
        assertEquals(value, idProp.lastValue);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnWhenIdPropNull() throws Exception {
        ObjectIdValueProperty prop = createProperty(false);
        prop.setAndReturn("instance", "value");
    }

    @Test
    public void testSetAndReturnWhenIdPropNotNull() throws Exception {
        ObjectIdValueProperty prop = createProperty(true);
        Object instance = "instance";
        Object value = "value";
        Object result = prop.setAndReturn(instance, value);
        assertTrue(idProp.setAndReturnCalled);
        assertEquals("setAndReturnResult", result);
    }

    @Test
    public void testDeserializeAndSet() throws Exception {
        ObjectIdValueProperty prop = createProperty(false);
        JsonParser p = createParser("null");
        p.nextToken();
        DeserializationContext ctxt = mapper.createDeserializationContext(p, config);
        Object instance = "instance";
        prop.deserializeAndSet(p, ctxt, instance);
    }

    @Test
    public void testDeserializeSetAndReturnWithNullToken() throws Exception {
        ObjectIdValueProperty prop = createProperty(false);
        JsonParser p = createParser("null");
        p.nextToken();
        DeserializationContext ctxt = mapper.createDeserializationContext(p, config);
        Object instance = "instance";
        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);
        assertNull(result);
    }

    @Test
    public void testDeserializeSetAndReturnWithIdPropNull() throws Exception {
        ObjectIdValueProperty prop = createProperty(false);
        JsonParser p = createParser("\"myId\"");
        p.nextToken();
        DeserializationContext ctxt = mapper.createDeserializationContext(p, config);
        Object instance = "instance";
        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);
        assertSame(instance, result);
    }

    @Test
    public void testDeserializeSetAndReturnWithIdPropNotNull() throws Exception {
        ObjectIdValueProperty prop = createProperty(true);
        JsonParser p = createParser("\"myId\"");
        p.nextToken();
        DeserializationContext ctxt = mapper.createDeserializationContext(p, config);
        Object instance = "instance";
        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);
        assertEquals("setAndReturnResult", result);
        assertTrue(idProp.setAndReturnCalled);
        assertEquals(instance, idProp.lastInstance);
        assertEquals("myId", idProp.lastValue);
    }
}