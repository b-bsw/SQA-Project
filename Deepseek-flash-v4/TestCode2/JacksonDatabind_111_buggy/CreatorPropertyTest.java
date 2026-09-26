package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

public class CreatorPropertyTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final JavaType STRING_TYPE = MAPPER.getTypeFactory().constructType(String.class);

    private CreatorProperty createProperty(String name, int index, Object injectableValueId) {
        return new CreatorProperty(
                new PropertyName(name),      // name
                STRING_TYPE,                 // type
                null,                        // wrapperName
                null,                        // typeDeserializer
                null,                        // annotations
                null,                        // member
                index,                       // creatorIndex
                injectableValueId,           // injectableValueId
                null);                       // metadata
    }

    // ---------------------------------------------------------------------
    // Basic getter/copy behaviour
    // ---------------------------------------------------------------------

    @Test
    public void testInitialGetters() {
        CreatorProperty prop = createProperty("id", 3, "inj");

        assertEquals("id", prop.getName());
        assertEquals(3, prop.getCreatorIndex());
        assertEquals("inj", prop.getInjectableValueId());
        assertSame(STRING_TYPE, prop.getType());
        assertFalse(prop.isIgnorable());
        assertNull(prop.getAnnotation(Deprecated.class));
        assertNull(prop.getMember());
    }

    @Test
    public void testFindInjectableValueWithNullIdDoesNotUseContext() {
        CreatorProperty prop = createProperty("x", 0, null);

        // If injectableValueId is null, the method should simply return null
        // and not touch the context at all.
        assertNull(prop.findInjectableValue(null, new Object()));
    }

    @Test
    public void testWithNameCopiesMetadata() {
        CreatorProperty original = createProperty("old", 7, "inj");

        SettableBeanProperty renamed = original.withName(new PropertyName("new"));

        assertNotSame(original, renamed);
        assertTrue(renamed instanceof CreatorProperty);
        assertEquals("new", renamed.getName());

        CreatorProperty copy = (CreatorProperty) renamed;
        assertEquals(7, copy.getCreatorIndex());
        assertEquals("inj", copy.getInjectableValueId());

        // Original property should not have been mutated.
        assertEquals("old", original.getName());
    }

    @Test
    public void testWithValueDeserializerCopiesMetadata() {
        CreatorProperty original = createProperty("p", 9, "inj");

        SettableBeanProperty updated = original.withValueDeserializer(new StringDeserializer());

        assertNotSame(original, updated);
        assertTrue(updated instanceof CreatorProperty);

        CreatorProperty copy = (CreatorProperty) updated;
        assertEquals(9, copy.getCreatorIndex());
        assertEquals("inj", copy.getInjectableValueId());
    }

    // ---------------------------------------------------------------------
    // Fallback setter behaviour
    // ---------------------------------------------------------------------

    @Test
    public void testSetDelegatesToFallback() throws Exception {
        CreatorProperty prop = createProperty("p", 0, null);
        RecordingSettableBeanProperty fallback = new RecordingSettableBeanProperty();
        prop.setFallbackSetter(fallback);

        prop.set(new Object(), "value");

        assertEquals("value", fallback.value);
    }

    @Test
    public void testDeserializeAndSetUsesValueDeserializerAndFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        CreatorProperty prop = (CreatorProperty) createProperty("p", 0, null)
                .withValueDeserializer(new StringDeserializer());

        RecordingSettableBeanProperty fallback = new RecordingSettableBeanProperty();
        prop.setFallbackSetter(fallback);

        try (JsonParser p = mapper.getFactory().createParser("\"abc\"")) {
            p.nextToken();
            prop.deserializeAndSet(p, null, new Object());
        }

        assertEquals("abc", fallback.value);
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testDeserializeAndSetWithoutFallbackFails() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        CreatorProperty prop = (CreatorProperty) createProperty("p", 0, null)
                .withValueDeserializer(new StringDeserializer());

        try (JsonParser p = mapper.getFactory().createParser("\"abc\"")) {
            p.nextToken();
            prop.deserializeAndSet(p, null, new Object());
        }
    }

    // ---------------------------------------------------------------------
    // Test helpers
    // ---------------------------------------------------------------------

    private static class StringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return p.getText();
        }
    }

    private static class RecordingSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;

        Object value;
        boolean fixAccessCalled;

        RecordingSettableBeanProperty() {
            super(new PropertyName("fallback"), STRING_TYPE, null, null, null, null);
        }

        @Override
        public SettableBeanProperty withName(PropertyName name) {
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
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public int getCreatorIndex() {
            return -1;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) {
            throw new UnsupportedOperationException("not expected in this test");
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) {
            throw new UnsupportedOperationException("not expected in this test");
        }

        @Override
        public void set(Object instance, Object value) {
            this.value = value;
        }
    }
}