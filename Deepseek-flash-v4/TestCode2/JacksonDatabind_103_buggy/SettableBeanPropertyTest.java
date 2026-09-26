package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;

public class SettableBeanPropertyTest {

    private static class TestSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;

        TestSettableBeanProperty(PropertyName name, JavaType type, PropertyName wrapper,
                Annotations ann, JsonDeserializer<Object> valueDeser,
                TypeDeserializer typeDeser, NullValueProvider nullProvider) {
            super(name, type, wrapper, ann, valueDeser, typeDeser, nullProvider);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new TestSettableBeanProperty(getFullName(), getType(), getWrapperName(),
                    null, (JsonDeserializer<Object>) deser, getValueTypeDeserializer(),
                    getNullValueProvider());
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new TestSettableBeanProperty(newName, getType(), getWrapperName(),
                    null, _valueDeserializer, _valueTypeDeserializer, _nullProvider);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return new TestSettableBeanProperty(getFullName(), getType(), getWrapperName(),
                    null, _valueDeserializer, _valueTypeDeserializer, nva);
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
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }
    }

    private TestSettableBeanProperty bean;

    @Before
    public void setUp() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        bean = new TestSettableBeanProperty(PropertyName.construct("id"), type, null,
                null, null, null, null);
    }

    @Test
    public void testGetNameAndFullName() {
        assertEquals("id", bean.getName());
        assertEquals("id", bean.getFullName().getSimpleName());
    }

    @Test
    public void testGetWrapperName() {
        assertNull(bean.getWrapperName());
        TestSettableBeanProperty wrapped = new TestSettableBeanProperty(
                PropertyName.construct("id"), bean.getType(), PropertyName.construct("wrapped"),
                null, null, null, null);
        assertEquals("wrapped", wrapped.getWrapperName().getSimpleName());
    }

    @Test
    public void testHasValueDeserializer() {
        assertFalse(bean.hasValueDeserializer());
        assertNull(bean.getValueDeserializer());

        TestSettableBeanProperty withMissing = new TestSettableBeanProperty(
                PropertyName.construct("id"), bean.getType(), null, null,
                SettableBeanProperty.MISSING_VALUE_DESERIALIZER, null, null);
        assertFalse(withMissing.hasValueDeserializer());
        assertNull(withMissing.getValueDeserializer());

        FailingDeserializer deser = new FailingDeserializer("fail");
        TestSettableBeanProperty withDeser = new TestSettableBeanProperty(
                PropertyName.construct("id"), bean.getType(), null, null, deser, null, null);
        assertTrue(withDeser.hasValueDeserializer());
        assertSame(deser, withDeser.getValueDeserializer());
    }

    @Test
    public void testHasValueTypeDeserializer() {
        assertFalse(bean.hasValueTypeDeserializer());
        assertNull(bean.getValueTypeDeserializer());
    }

    @Test
    public void testManagedReferenceName() {
        assertNull(bean.getManagedReferenceName());
        bean.setManagedReferenceName("managed");
        assertEquals("managed", bean.getManagedReferenceName());
        bean.setManagedReferenceName(null);
        assertNull(bean.getManagedReferenceName());
    }

    @Test
    public void testObjectIdInfo() {
        assertNull(bean.getObjectIdInfo());
        bean.setObjectIdInfo(null);
        assertNull(bean.getObjectIdInfo());
    }

    @Test
    public void testSetViewsAndHasViews() {
        assertFalse(bean.hasViews());
        assertTrue(bean.visibleInView(String.class));

        bean.setViews(null);
        assertFalse(bean.hasViews());
        assertTrue(bean.visibleInView(String.class));

        bean.setViews(new Class<?>[] { String.class });
        assertTrue(bean.hasViews());
        assertTrue(bean.visibleInView(String.class));
        assertFalse(bean.visibleInView(Integer.class));
    }

    @Test
    public void testAssignIndex() {
        assertEquals(-1, bean.getPropertyIndex());
        bean.assignIndex(2);
        assertEquals(2, bean.getPropertyIndex());
        try {
            bean.assignIndex(3);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("already had index"));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignIndexRepeatedThrows() {
        bean.assignIndex(0);
        bean.assignIndex(1);
    }

    @Test
    public void testWithSimpleName() {
        SettableBeanProperty renamed = bean.withSimpleName("renamed");
        assertEquals("renamed", renamed.getName());
    }

    @Test
    public void testToString() {
        assertEquals("[property 'id']", bean.toString());
    }

    @Test
    public void testGetType() {
        assertNotNull(bean.getType());
        assertEquals("java.lang.String", bean.getType().getRawClass().getName());
    }

    @Test
    public void testGetNullValueProvider() {
        assertNull(bean.getNullValueProvider());
        NullValueProvider provider = NullsConstantProvider.nullProvider();
        TestSettableBeanProperty withProvider = new TestSettableBeanProperty(
                PropertyName.construct("id"), bean.getType(), null, null, null, null, provider);
        assertSame(provider, withProvider.getNullValueProvider());
    }

    @Test
    public void testThrowAsIOEWithIllegalArgumentException() throws IOException {
        try {
            bean._throwAsIOE((JsonParser) null, new IllegalArgumentException("boom"), "value");
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("boom"));
        }
    }

    @Test
    public void testThrowAsIOEWithIOException() throws IOException {
        IOException original = new IOException("io");
        try {
            bean._throwAsIOE((JsonParser) null, original, "value");
            fail("Should have thrown IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testThrowAsIOEWithNullValue() throws IOException {
        try {
            bean._throwAsIOE((JsonParser) null, new IllegalArgumentException("null check"), null);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("null check"));
        }
    }
}