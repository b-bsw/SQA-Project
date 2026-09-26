package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
// Needed for the stub constructor
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value; // not used
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for ObjectIdReferenceProperty, focusing on:
 * - withName() copies and defines a new name
 * - withValueDeserializer() returns same instance for same deserializer
 * - withNullProvider() creates a new instance
 * - all delegate methods (fixAccess, getAnnotation, getMember, getCreatorIndex,
 *   set, setAndReturn) forward correctly to the underlying SettableBeanProperty
 */
public class ObjectIdReferencePropertyTest {

    private ObjectIdReferenceProperty property;
    private StubProperty forward;

    @Before
    public void setUp() {
        forward = new StubProperty(new com.fasterxml.jackson.databind.PropertyName("id"));
        property = new ObjectIdReferenceProperty(forward, null);
    }

    // ---------- withName ----------
    @Test
    public void testWithNameReturnsCopyWithNewName() {
        com.fasterxml.jackson.databind.PropertyName newName =
                new com.fasterxml.jackson.databind.PropertyName("newName");

        SettableBeanProperty result = property.withName(newName);

        assertTrue(result instanceof ObjectIdReferenceProperty);
        ObjectIdReferenceProperty copied = (ObjectIdReferenceProperty) result;
        assertNotSame(property, copied);
        assertEquals(newName, copied.getFullName());
    }

    // ---------- withValueDeserializer ----------
    @Test
    public void testWithValueDeserializerSameInstanceReturnsThis() {
        StringDeserializer deser = new StringDeserializer();

        ObjectIdReferenceProperty first =
                (ObjectIdReferenceProperty) property.withValueDeserializer(deser);
        assertNotSame(property, first);

        ObjectIdReferenceProperty second =
                (ObjectIdReferenceProperty) first.withValueDeserializer(deser);
        assertSame(first, second);
    }

    @Test
    public void testWithValueDeserializerDifferentInstanceReturnsNew() {
        StringDeserializer deser1 = new StringDeserializer();
        StringDeserializer deser2 = new StringDeserializer();

        ObjectIdReferenceProperty first =
                (ObjectIdReferenceProperty) property.withValueDeserializer(deser1);
        ObjectIdReferenceProperty second =
                (ObjectIdReferenceProperty) first.withValueDeserializer(deser2);

        assertNotSame(first, second);
        // The second instance should remember the last deserializer
        assertSame(second, second.withValueDeserializer(deser2));
    }

    // ---------- withNullProvider ----------
    @Test
    public void testWithNullProviderReturnsNewCopy() {
        NullValueProvider nvp = new SimpleNullValueProvider();

        ObjectIdReferenceProperty result =
                (ObjectIdReferenceProperty) property.withNullProvider(nvp);

        assertNotNull(result);
        assertNotSame(property, result);
    }

    // ---------- Delegation: fixAccess ----------
    @Test
    public void testFixAccessDelegatesToForward() {
        property.fixAccess(null);
        assertTrue(forward.fixAccessCalled);
    }

    // ---------- Delegation: getAnnotation ----------
    @Test
    public void testGetAnnotationDelegatesToForward() {
        Annotation result = property.getAnnotation(Deprecated.class);
        assertNull(result);
        assertEquals(Deprecated.class, forward.capturedAnnotationType);
    }

    // ---------- Delegation: getMember ----------
    @Test
    public void testGetMemberDelegatesToForward() {
        AnnotatedMember member = property.getMember();
        assertNull(member);
        assertTrue(forward.getMemberCalled);
    }

    // ---------- Delegation: getCreatorIndex ----------
    @Test
    public void testGetCreatorIndexDelegatesToForward() {
        assertEquals(42, property.getCreatorIndex());
        assertTrue(forward.getCreatorIndexCalled);
    }

    // ---------- Delegation: set ----------
    @Test
    public void testSetDelegatesToForward() throws Exception {
        Object pojo = new Object();
        Object value = "value";

        property.set(pojo, value);

        assertSame(pojo, forward.setInstance);
        assertSame(value, forward.setValue);
    }

    // ---------- Delegation: setAndReturn ----------
    @Test
    public void testSetAndReturnDelegatesToForward() throws Exception {
        Object pojo = new Object();
        Object value = "value";

        Object result = property.setAndReturn(pojo, value);

        assertSame(pojo, forward.setInstance);
        assertSame(value, forward.setValue);
        assertEquals("ret", result);
    }

    // ---------------------------------------------------------------------
    // Inner test helper classes
    // ---------------------------------------------------------------------

    /** Minimal concrete SettableBeanProperty for testing delegation. */
    private static class StubProperty extends SettableBeanProperty {

        private static final long serialVersionUID = 1L;

        boolean fixAccessCalled;
        Class<?> capturedAnnotationType;
        boolean getMemberCalled;
        boolean getCreatorIndexCalled;
        Object setInstance;
        Object setValue;

        StubProperty(com.fasterxml.jackson.databind.PropertyName name) {
            super(name,
                  TypeFactory.defaultInstance().constructType(String.class),
                  null,
                  null,
                  com.fasterxml.jackson.databind.PropertyMetadata.STD_OPTIONAL);
        }

        @Override
        public SettableBeanProperty withName(com.fasterxml.jackson.databind.PropertyName newName) {
            return this;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return this;
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return this;
        }

        @Override
        public void fixAccess(DeserializationConfig config) {
            fixAccessCalled = true;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            capturedAnnotationType = acls;
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            getMemberCalled = true;
            return null;
        }

        @Override
        public int getCreatorIndex() {
            getCreatorIndexCalled = true;
            return 42;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance)
                throws IOException {
            throw new UnsupportedOperationException("Not needed for this test");
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt,
                Object instance) throws IOException {
            throw new UnsupportedOperationException("Not needed for this test");
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.setInstance = instance;
            this.setValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this.setInstance = instance;
            this.setValue = value;
            return "ret";
        }
    }

    /** Minimal NullValueProvider for the withNullProvider test. */
    private static class SimpleNullValueProvider implements NullValueProvider {
        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object getNullValue(JsonParser p, DeserializationContext ctxt) {
            return null;
        }
    }

    /** Minimal JsonDeserializer subtype for withValueDeserializer tests. */
    private static class StringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }
}