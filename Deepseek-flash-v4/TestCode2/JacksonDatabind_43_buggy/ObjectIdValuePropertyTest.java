package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectIdGenerator;
import com.fasterxml.jackson.databind.ObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectIdValuePropertyTest {

    private static final PropertyName PROP_NAME = new PropertyName("id");
    private static final JavaType ID_TYPE = TypeFactory.defaultInstance().constructType(String.class);

    private static class TestObjectIdGenerator extends ObjectIdGenerator<String> {
        private static final long serialVersionUID = 1L;
        @Override public Class<?> getScope() { return Object.class; }
        @Override public boolean canUseFor(ObjectIdGenerator<?> gen) { return true; }
        @Override public ObjectIdGenerator<String> forScope(Class<?> scope) { return this; }
        @Override public ObjectIdGenerator<String> newForSerialization(Object context) { return this; }
        @Override public IdKey key(Object key) { return new IdKey(getClass(), null, key); }
        @Override public String generateId(Object forPojo) { return "gen-id"; }
    }

    private static class TestJsonDeserializer extends JsonDeserializer<Object> {
        private final Object value;
        public TestJsonDeserializer(Object value) { this.value = value; }
        @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return value;
        }
    }

    private static class SimpleSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private final Object setResult;
        public SimpleSettableBeanProperty(Object setResult) {
            super(PROP_NAME, ID_TYPE, PropertyMetadata.STD_OPTIONAL, new TestJsonDeserializer("x"));
            this.setResult = setResult;
        }
        @Override public SettableBeanProperty withName(PropertyName name) { return this; }
        @Override public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        @Override public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { }
        @Override public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return setResult; }
        @Override public void set(Object instance, Object value) throws IOException { }
        @Override public Object setAndReturn(Object instance, Object value) throws IOException { return setResult; }
        @Override public String getName() { return "idProp"; }
        @Override public JavaType getType() { return ID_TYPE; }
        @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_OPTIONAL; }
        @Override public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public AnnotatedMember getMember() { return null; }
    }

    private static class TestDeserializationContext extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1L;
        public TestDeserializationContext() {
            super(new ObjectMapper().getDeserializationConfig(), null, new InjectableValues.Std());
        }
    }

    private static ObjectIdReader createObjectIdReader(JsonDeserializer<?> deser, SettableBeanProperty idProp) {
        ObjectIdGenerator<?> gen = new TestObjectIdGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        try {
            Method m = ObjectIdReader.class.getMethod("construct",
                    JavaType.class, String.class, JsonDeserializer.class,
                    ObjectIdGenerator.class, ObjectIdResolver.class, SettableBeanProperty.class);
            return (ObjectIdReader) m.invoke(null, ID_TYPE, "id", deser, gen, resolver, idProp);
        } catch (NoSuchMethodException e) {
            try {
                Constructor<ObjectIdReader> ctor = ObjectIdReader.class.getDeclaredConstructor(
                        JavaType.class, PropertyName.class, JsonDeserializer.class,
                        ObjectIdGenerator.class, ObjectIdResolver.class, SettableBeanProperty.class);
                ctor.setAccessible(true);
                return ctor.newInstance(ID_TYPE, PROP_NAME, deser, gen, resolver, idProp);
            } catch (NoSuchMethodException e2) {
                try {
                    Constructor<ObjectIdReader> ctor2 = ObjectIdReader.class.getDeclaredConstructor(
                            JavaType.class, String.class, JsonDeserializer.class,
                            ObjectIdGenerator.class, ObjectIdResolver.class, SettableBeanProperty.class);
                    ctor2.setAccessible(true);
                    return ctor2.newInstance(ID_TYPE, "id", deser, gen, resolver, idProp);
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static ObjectIdValueProperty createProperty(JsonDeserializer<?> deser, SettableBeanProperty idProp) {
        return new ObjectIdValueProperty(createObjectIdReader(deser, idProp), PropertyMetadata.STD_OPTIONAL);
    }

    @Test
    public void testGetAnnotationReturnsNull() {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("x"), null);
        assertNull(prop.getAnnotation(Override.class));
    }

    @Test
    public void testGetMemberReturnsNull() {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("x"), null);
        assertNull(prop.getMember());
    }

    @Test
    public void testWithNameReturnsNewInstanceWithSameReaderAndNewName() {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("x"), null);
        ObjectIdValueProperty renamed = prop.withName(new PropertyName("newId"));
        assertNotSame(prop, renamed);
        assertSame(prop._objectIdReader, renamed._objectIdReader);
        assertEquals(new PropertyName("newId"), renamed._propName);
    }

    @Test
    public void testWithValueDeserializerReturnsNewInstanceWithSameReaderAndNewDeser() {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("x"), null);
        JsonDeserializer<?> newDeser = new TestJsonDeserializer("y");
        ObjectIdValueProperty newProp = prop.withValueDeserializer(newDeser);
        assertNotSame(prop, newProp);
        assertSame(prop._objectIdReader, newProp._objectIdReader);
        assertSame(newDeser, newProp._valueDeserializer);
    }

    @Test
    public void testDeserializeAndSetWithNullIdDoesNotThrow() throws Exception {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer(null), null);
        prop.deserializeAndSet(null, null, new Object());
    }

    @Test
    public void testDeserializeSetAndReturnWithNullIdReturnsNull() throws Exception {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer(null), null);
        assertNull(prop.deserializeSetAndReturn(null, null, new Object()));
    }

    @Test
    public void testDeserializeSetAndReturnWithIdAndNoIdPropReturnsInstance() throws Exception {
        Object instance = new Object();
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("id"), null);
        Object result = prop.deserializeSetAndReturn(null, new TestDeserializationContext(), instance);
        assertSame(instance, result);
    }

    @Test
    public void testDeserializeSetAndReturnWithIdAndIdPropReturnsIdPropValue() throws Exception {
        Object instance = new Object();
        Object expected = new Object();
        SimpleSettableBeanProperty idProp = new SimpleSettableBeanProperty(expected);
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("id"), idProp);
        Object result = prop.deserializeSetAndReturn(null, new TestDeserializationContext(), instance);
        assertSame(expected, result);
    }

    @Test
    public void testSetWithoutIdPropThrowsUnsupportedOperationException() throws Exception {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("x"), null);
        try {
            prop.set(new Object(), "id");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnWithoutIdPropThrowsUnsupportedOperationException() throws Exception {
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("x"), null);
        prop.setAndReturn(new Object(), "id");
    }

    @Test
    public void testSetAndReturnWithIdPropReturnsIdPropValue() throws Exception {
        Object expected = new Object();
        SimpleSettableBeanProperty idProp = new SimpleSettableBeanProperty(expected);
        ObjectIdValueProperty prop = createProperty(new TestJsonDeserializer("x"), idProp);
        Object result = prop.setAndReturn(new Object(), "id");
        assertSame(expected, result);
    }
}