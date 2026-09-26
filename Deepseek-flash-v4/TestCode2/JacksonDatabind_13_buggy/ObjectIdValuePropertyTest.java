package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.lang.annotation.Annotation;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanProperty;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectIdValuePropertyTest {

    private static ObjectIdReader createDefaultReader() {
        PropertyName propName = new PropertyName("id");
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<?> deser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }
        };
        return new ObjectIdReader(propName, idType, deser, null, null);
    }

    private static class MockSettableBeanProperty extends SettableBeanProperty {
        public Object capturedInstance;
        public Object capturedValue;
        public Object returnValue;

        public MockSettableBeanProperty(PropertyName name, JavaType type, PropertyMetadata meta,
                                        JsonDeserializer<?> deser, Object returnValue) {
            super(name, type, meta, deser);
            this.returnValue = returnValue;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this.capturedInstance = instance;
            this.capturedValue = value;
            return returnValue;
        }

        @Override public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public AnnotatedMember getMember() { return null; }
        @Override public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException { }
        @Override public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException { return null; }
        @Override public void set(Object instance, Object value) throws IOException { }
        @Override public SettableBeanProperty withName(PropertyName newName) { return this; }
        @Override public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
    }

    private static class MockReadableObjectId extends ReadableObjectId {
        public Object boundItem;

        public MockReadableObjectId(Object id) {
            super(id);
        }

        @Override
        public void bindItem(Object ob) {
            this.boundItem = ob;
            super.bindItem(ob);
        }
    }

    private static class MockDeserializationContext extends DeserializationContext {
        private ReadableObjectId roid;

        public MockDeserializationContext(ReadableObjectId roid) {
            super(null, null);
            this.roid = roid;
        }

        @Override
        public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> gen, ObjectIdResolver resolver) {
            return roid;
        }

        @Override public DeserializationConfig getConfig() { return null; }
        @Override public JsonParser getParser() { return null; }
        @Override public Object getAttribute(Object key) { return null; }
        @Override public DeserializationContext setAttribute(Object key, Object value) { return this; }
        @Override public JavaType constructType(Class<?> cls) { return null; }
        @Override public Class<?> getActiveView() { return null; }
        @Override public boolean hasExplicitDeserializerFor(JavaType type) { return false; }
        @Override public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException { return null; }
        @Override public Object deserializer(JavaType type) throws JsonMappingException { return null; }
        @Override public Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance) { return null; }
        @Override public int findTypeId(DeserializationConfig config, JavaType type) { return 0; }
        @Override public JavaType resolveType(JavaType type) throws JsonMappingException { return type; }
        @Override public JsonToken getLastToken() { return null; }
        @Override public int getCurrentTokenId() { return 0; }
        @Override public Object getLastParameter() { return null; }
        @Override public void setCreatorProperty(DeserializationContext.Property p) { }
        @Override public void reportUnresolvedObjectId(Object key, BeanProperty prop) throws UnresolvedForwardReference { }
        @Override public void handleUnknownProperty(JsonParser jp, DeserializationContext ctxt, Object beanOrClass, String propName) throws IOException { }
        @Override public void handleMissingInstantiator(JavaType valueType, JsonParser jp, String msg, Object... args) throws IOException { }
        @Override public void handleInstantiationProblem(Class<?> instClass, Object argument, Throwable t) throws IOException { }
        @Override public void handleUnknown(JsonParser jp, DeserializationContext ctxt, Object beanOrClass, String propName) throws IOException { }
        @Override public void reportUnknownProperty(Object bean, String fieldName, JsonParser jp) throws IOException { }
    }

    @Test
    public void testGetAnnotationAndGetMember() {
        ObjectIdReader reader = createDefaultReader();
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        assertNull(prop.getAnnotation(String.class));
        assertNull(prop.getMember());
    }

    @Test
    public void testWithName() {
        ObjectIdReader reader = createDefaultReader();
        reader.idProperty = null;
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        PropertyName newName = new PropertyName("newName");
        ObjectIdValueProperty newProp = prop.withName(newName);
        assertNotNull(newProp);
        assertNotSame(prop, newProp);
    }

    @Test
    public void testWithValueDeserializer() {
        ObjectIdReader reader = createDefaultReader();
        reader.idProperty = null;
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        JsonDeserializer<?> newDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "";
            }
        };
        ObjectIdValueProperty newProp = prop.withValueDeserializer(newDeser);
        assertNotNull(newProp);
        assertNotSame(prop, newProp);
    }

    @Test
    public void testSetAndReturnWithoutIdPropertyThrowsException() {
        ObjectIdReader reader = createDefaultReader();
        reader.idProperty = null;
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        try {
            prop.setAndReturn(new Object(), "value");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testSetAndReturnWithIdProperty() throws IOException {
        ObjectIdReader reader = createDefaultReader();
        PropertyName propName = new PropertyName("id");
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<?> deser = new JsonDeserializer<String>() {
            @Override public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException { return null; }
        };
        MockSettableBeanProperty idPropStub = new MockSettableBeanProperty(propName, idType, PropertyMetadata.STD_OPTIONAL, deser, "mockedReturn");
        reader.idProperty = idPropStub;
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        Object instance = new Object();
        Object result = prop.setAndReturn(instance, "someValue");
        assertEquals("mockedReturn", result);
        assertSame(instance, idPropStub.capturedInstance);
        assertEquals("someValue", idPropStub.capturedValue);
    }

    @Test
    public void testDeserializeSetAndReturnWithoutIdProperty() throws IOException {
        ObjectIdReader reader = createDefaultReader();
        reader.idProperty = null;
        final String testId = "testId";
        reader = new ObjectIdReader(reader.propertyName, reader.getIdType(),
                new JsonDeserializer<String>() {
                    @Override
                    public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                        return testId;
                    }
                }, null, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        MockReadableObjectId roid = new MockReadableObjectId(testId);
        MockDeserializationContext ctxt = new MockDeserializationContext(roid);
        Object instance = new Object();
        Object result = prop.deserializeSetAndReturn(null, ctxt, instance);
        assertSame(instance, result);
        assertSame(instance, roid.boundItem);
    }

    @Test
    public void testDeserializeSetAndReturnWithIdProperty() throws IOException {
        ObjectIdReader reader = createDefaultReader();
        PropertyName propName = new PropertyName("id");
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<?> deser = new JsonDeserializer<String>() {
            @Override public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException { return null; }
        };
        final String testId = "testId";
        reader = new ObjectIdReader(reader.propertyName, reader.getIdType(),
                new JsonDeserializer<String>() {
                    @Override
                    public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                        return testId;
                    }
                }, null, null);
        MockSettableBeanProperty idPropStub = new MockSettableBeanProperty(propName, idType, PropertyMetadata.STD_OPTIONAL, deser, "mockedReturn");
        reader.idProperty = idPropStub;
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        MockReadableObjectId roid = new MockReadableObjectId(testId);
        MockDeserializationContext ctxt = new MockDeserializationContext(roid);
        Object instance = new Object();
        Object result = prop.deserializeSetAndReturn(null, ctxt, instance);
        assertEquals("mockedReturn", result);
        assertSame(instance, idPropStub.capturedInstance);
        assertEquals(testId, idPropStub.capturedValue);
        assertSame(instance, roid.boundItem);
    }
}