package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class InnerClassPropertyTest {

    private static final JsonFactory JSON_FACTORY = new JsonFactory();

    private TestSettableBeanProperty delegate;
    private InnerClassProperty property;

    @Before
    public void setUp() throws Exception {
        delegate = new TestSettableBeanProperty(PropertyName.construct("value"), 0, null);
        Constructor<OuterBean.Inner> ctor = OuterBean.Inner.class.getDeclaredConstructor(OuterBean.class);
        ctor.setAccessible(true);
        property = new InnerClassProperty(delegate, ctor);
    }

    @Test
    public void testDeserializeAndSetCreatesInnerAndSetsDelegate() throws Exception {
        RecordingDeserializer deser = new RecordingDeserializer();
        InnerClassProperty prop = property.withValueDeserializer(deser);
        JsonParser p = JSON_FACTORY.createParser("\"x\"");
        p.nextToken();
        OuterBean bean = new OuterBean();

        prop.deserializeAndSet(p, null, bean);

        assertNotNull(delegateOf(prop).lastSet);
        assertSame(bean, ((OuterBean.Inner) delegateOf(prop).lastSet).getOuterBean());
        assertEquals(1, deser.deserializeCalls);
        assertSame(bean, delegateOf(prop).lastSetInstance);
    }

    @Test
    public void testDeserializeAndSetNullUsesNullValue() throws Exception {
        RecordingDeserializer deser = new RecordingDeserializer();
        deser.nullValue = null;
        InnerClassProperty prop = property.withValueDeserializer(deser);
        JsonParser p = JSON_FACTORY.createParser("null");
        p.nextToken();

        prop.deserializeAndSet(p, null, new OuterBean());

        assertEquals(1, deser.nullValueCalls);
        assertEquals(0, deser.deserializeCalls);
        assertNull(delegateOf(prop).lastSet);
    }

    @Test
    public void testDeserializeAndSetWithTypeDeserializer() throws Exception {
        RecordingDeserializer deser = new RecordingDeserializer();
        OuterBean.Inner typeValue = new OuterBean().new Inner();
        deser.typeResult = typeValue;
        InnerClassProperty prop = property.withValueDeserializer(deser);
        setValueTypeDeserializer(prop, new DummyTypeDeserializer());
        JsonParser p = JSON_FACTORY.createParser("\"x\"");
        p.nextToken();

        prop.deserializeAndSet(p, null, new OuterBean());

        assertEquals(1, deser.deserializeWithTypeCalls);
        assertEquals(0, deser.deserializeCalls);
        assertSame(typeValue, delegateOf(prop).lastSet);
    }

    @Test
    public void testDeserializeSetAndReturn() throws Exception {
        RecordingDeserializer deser = new RecordingDeserializer();
        OuterBean.Inner result = new OuterBean().new Inner();
        deser.deserializeResult = result;
        InnerClassProperty prop = property.withValueDeserializer(deser);
        JsonParser p = JSON_FACTORY.createParser("\"x\"");
        p.nextToken();

        Object returned = prop.deserializeSetAndReturn(p, null, new OuterBean());

        assertSame(result, returned);
        assertSame(result, delegateOf(prop).lastSet);
    }

    @Test
    public void testSetAndSetAndReturnDelegate() throws Exception {
        Object value = new Object();
        OuterBean bean = new OuterBean();

        property.set(bean, value);

        assertSame(value, delegate.lastSet);
        assertSame(bean, delegate.lastSetInstance);
        assertSame(value, property.setAndReturn(bean, value));
    }

    @Test
    public void testWithNameUpdatesBothPropertyAndDelegate() throws Exception {
        PropertyName newName = PropertyName.construct("renamed");
        InnerClassProperty renamed = property.withName(newName);

        assertNotSame(property, renamed);
        assertEquals(newName, propertyNameOf(renamed));
        assertEquals(newName, delegateOf(renamed).propertyName);
    }

    @Test
    public void testIndexMethodsDelegate() throws Exception {
        property.assignIndex(42);
        assertEquals(42, property.getPropertyIndex());
        assertEquals(42, delegate.index);
    }

    @Test
    public void testGetAnnotationDelegatesToDelegate() throws Exception {
        Marker marker = new MarkerImpl();
        delegate.annotation = marker;
        assertSame(marker, property.getAnnotation(Marker.class));
    }

    @Test
    public void testSerializationWorkaround() throws Exception {
        InnerClassProperty replacement = (InnerClassProperty) property.writeReplace();
        assertNotSame(property, replacement);
        assertSame(replacement, replacement.writeReplace());

        InnerClassProperty resolved = (InnerClassProperty) replacement.readResolve();
        assertNotSame(replacement, resolved);
    }

    @Test
    public void testMissingAnnotatedConstructorThrows() throws Exception {
        try {
            new InnerClassProperty(property, (AnnotatedConstructor) null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testCreateInnerFailureUnwrapsException() throws Exception {
        Constructor<ExplodingOuter.Inner> ctor = ExplodingOuter.Inner.class.getDeclaredConstructor(ExplodingOuter.class);
        ctor.setAccessible(true);
        InnerClassProperty bad = new InnerClassProperty(delegate, ctor);
        JsonParser p = JSON_FACTORY.createParser("\"x\"");
        p.nextToken();

        try {
            bad.deserializeAndSet(p, null, new ExplodingOuter());
            fail("Should throw RuntimeException");
        } catch (RuntimeException expected) {
            // expected
        }
    }

    private static TestSettableBeanProperty delegateOf(InnerClassProperty prop) throws Exception {
        Field f = findField(InnerClassProperty.class, "_delegate");
        f.setAccessible(true);
        return (TestSettableBeanProperty) f.get(prop);
    }

    private static PropertyName propertyNameOf(InnerClassProperty prop) throws Exception {
        Field f = findField(InnerClassProperty.class, "_propName");
        f.setAccessible(true);
        return (PropertyName) f.get(prop);
    }

    private static void setValueTypeDeserializer(InnerClassProperty prop, TypeDeserializer td) throws Exception {
        Field f = findField(InnerClassProperty.class, "_valueTypeDeserializer");
        f.setAccessible(true);
        f.set(prop, td);
    }

    private static Field findField(Class<?> cls, String name) throws NoSuchFieldException {
        Class<?> current = cls;
        while (current != null) {
            try {
                return current.getDeclaredField(name);
            } catch (NoSuchFieldException e) {
                current = current.getSuperclass();
            }
        }
        throw new NoSuchFieldException(name);
    }

    private static class TestSettableBeanProperty extends SettableBeanProperty {
        PropertyName propertyName;
        int index;
        JsonDeserializer<?> valueDeserializer;
        Annotation annotation;
        Object lastSet;
        Object lastSetInstance;

        TestSettableBeanProperty(PropertyName name, int index, JsonDeserializer<?> deser) {
            super(name, null, null, null, null, null);
            this.propertyName = name;
            this.index = index;
            this.valueDeserializer = deser;
        }

        @Override
        public TestSettableBeanProperty withName(PropertyName newName) {
            return new TestSettableBeanProperty(newName, index, valueDeserializer);
        }

        @Override
        public TestSettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new TestSettableBeanProperty(propertyName, index, deser);
        }

        @Override
        public void fixAccess(DeserializationConfig config) {
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (annotation != null && acls.isInstance(annotation)) {
                return acls.cast(annotation);
            }
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException {
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException {
            return null;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.lastSetInstance = instance;
            this.lastSet = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return value;
        }

        @Override
        public int getPropertyIndex() {
            return index;
        }

        @Override
        public void assignIndex(int index) {
            this.index = index;
        }
    }

    private static class RecordingDeserializer extends JsonDeserializer<Object> {
        int nullValueCalls;
        int deserializeCalls;
        int deserializeWithTypeCalls;
        Object nullValue;
        Object typeResult;
        Object deserializeResult;

        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            nullValueCalls++;
            return nullValue;
        }

        @Override
        public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            deserializeCalls++;
            return deserializeResult;
        }

        @Override
        public Object deserialize(JsonParser jp, DeserializationContext ctxt, Object intoValue) throws IOException {
            deserializeCalls++;
            return intoValue;
        }

        @Override
        public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException {
            deserializeWithTypeCalls++;
            return typeResult;
        }
    }

    private static class DummyTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public JsonToken getTypeInclusion() {
            return JsonToken.START_OBJECT;
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return null;
        }

        @Override
        public Class<?> getDefaultImpl() {
            return null;
        }

        @Override
        public String getPropertyName() {
            return null;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    private static class OuterBean {
        public class Inner {
            public Inner() {
            }

            public OuterBean getOuterBean() {
                return OuterBean.this;
            }
        }
    }

    private static class ExplodingOuter {
        public class Inner {
            public Inner() {
                throw new IllegalStateException("boom");
            }
        }
    }

    private @interface Marker {
    }

    private static class MarkerImpl implements Marker {
        @Override
        public Class<? extends Annotation> annotationType() {
            return Marker.class;
        }
    }
}