package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TypeDeserializerBaseTest {

    private static class TestTypeDeserializer extends TypeDeserializerBase {

        TestTypeDeserializer(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        TestTypeDeserializer(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestTypeDeserializer(this, prop);
        }

        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        JsonDeserializer<Object> findDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }

        JsonDeserializer<Object> findDefault(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }

        JsonDeserializer<Object> handleUnknown(DeserializationContext ctxt, String typeId) throws IOException {
            return _handleUnknownTypeId(ctxt, typeId, _idResolver, _baseType);
        }

        Object deserializeNative(DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(null, ctxt, typeId);
        }
    }

    private static class StubTypeIdResolver implements TypeIdResolver {

        private final JavaType knownType;

        StubTypeIdResolver(JavaType knownType) {
            this.knownType = knownType;
        }

        public void init(JavaType baseType) {
        }

        public String idFromValue(Object value) {
            return null;
        }

        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return null;
        }

        public String idFromBaseType() {
            return null;
        }

        public JavaType typeFromId(String id) {
            return "known".equals(id) ? knownType : null;
        }
    }

    private static class StubTypeIdResolverBase extends TypeIdResolverBase {

        StubTypeIdResolverBase(JavaType baseType) {
            super(baseType, TypeFactory.defaultInstance());
        }

        public String idFromValue(Object value) {
            return null;
        }

        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return null;
        }

        public String idFromBaseType() {
            return null;
        }

        public JavaType typeFromId(String id) {
            return null;
        }

        public String getDescForKnownTypeIds() {
            return "a,b";
        }
    }

    private static class FakeDeserializer extends JsonDeserializer<Object> {

        private final Object value;

        FakeDeserializer(Object value) {
            this.value = value;
        }

        public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return value;
        }
    }

    private static class MockDeserializationContext extends DeserializationContext {

        JsonDeserializer<Object> contextualDeserializer;

        MockDeserializationContext(boolean failOnInvalidSubtype) {
            super(null, null,
                    new ObjectMapper().getDeserializationConfig().with(
                            DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, failOnInvalidSubtype),
                    null);
        }

        public JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException {
            return contextualDeserializer;
        }

        public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
            return contextualDeserializer;
        }

        public JsonParser getParser() {
            return null;
        }

        public Object getAttribute(Object key) {
            return null;
        }

        public void setAttribute(Object key, Object value) {
        }
    }

    private TestTypeDeserializer newDeserializer(Class<?> defaultImpl) {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        return new TestTypeDeserializer(base, new StubTypeIdResolver(base), "type", false, defaultImpl);
    }

    @Test
    public void testConstructorAndAccessors() {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        StubTypeIdResolver resolver = new StubTypeIdResolver(base);
        TestTypeDeserializer deser = new TestTypeDeserializer(base, resolver, "type", true, String.class);

        assertEquals("java.lang.Object", deser.baseTypeName());
        assertEquals("type", deser.getPropertyName());
        assertSame(resolver, deser.getTypeIdResolver());
        assertEquals(String.class, deser.getDefaultImpl());
        assertEquals(JsonTypeInfo.As.PROPERTY, deser.getTypeInclusion());

        String str = deser.toString();
        assertTrue(str.contains(TestTypeDeserializer.class.getName()));
        assertTrue(str.contains("base-type"));
    }

    @Test
    public void testCopyConstructorForProperty() {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        StubTypeIdResolver resolver = new StubTypeIdResolver(base);
        TestTypeDeserializer original = new TestTypeDeserializer(base, resolver, "t", false, null);

        TestTypeDeserializer copy = (TestTypeDeserializer) original.forProperty(null);

        assertNull(copy.getDefaultImpl());
        assertEquals("t", copy.getPropertyName());
        assertSame(resolver, copy.getTypeIdResolver());
        assertEquals(JsonTypeInfo.As.PROPERTY, copy.getTypeInclusion());
    }

    @Test
    public void testNullAndEmptyTypePropertyName() {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        StubTypeIdResolver resolver = new StubTypeIdResolver(base);

        TestTypeDeserializer nullName = new TestTypeDeserializer(base, resolver, null, false, null);
        TestTypeDeserializer emptyName = new TestTypeDeserializer(base, resolver, "", false, null);

        assertNull(nullName.getPropertyName());
        assertEquals("", emptyName.getPropertyName());
    }

    @Test
    public void testFindDefaultImplNoImplFeatureDisabled() throws IOException {
        TestTypeDeserializer deser = newDeserializer(null);
        MockDeserializationContext ctxt = new MockDeserializationContext(false);

        assertSame(NullifyingDeserializer.instance, deser.findDefault(ctxt));
    }

    @Test
    public void testFindDefaultImplNoImplFeatureEnabled() throws IOException {
        TestTypeDeserializer deser = newDeserializer(null);
        MockDeserializationContext ctxt = new MockDeserializationContext(true);

        assertNull(deser.findDefault(ctxt));
    }

    @Test
    public void testFindDefaultImplWithConcreteImpl() throws IOException {
        TestTypeDeserializer deser = newDeserializer(String.class);
        MockDeserializationContext ctxt = new MockDeserializationContext(false);
        FakeDeserializer fake = new FakeDeserializer("default");
        ctxt.contextualDeserializer = fake;

        assertSame(fake, deser.findDefault(ctxt));
        assertSame(fake, deser.findDefault(ctxt));
    }

    @Test
    public void testFindDefaultImplWithBogusClass() throws IOException {
        TestTypeDeserializer deser = newDeserializer(Void.class);
        MockDeserializationContext ctxt = new MockDeserializationContext(false);

        assertSame(NullifyingDeserializer.instance, deser.findDefault(ctxt));
    }

    @Test
    public void testFindDeserializerKnownTypeAndCached() throws IOException {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType known = TypeFactory.defaultInstance().constructType(String.class);
        StubTypeIdResolver resolver = new StubTypeIdResolver(known);
        TestTypeDeserializer deser = new TestTypeDeserializer(base, resolver, "type", false, null);
        MockDeserializationContext ctxt = new MockDeserializationContext(false);
        FakeDeserializer fake = new FakeDeserializer("value");
        ctxt.contextualDeserializer = fake;

        assertSame(fake, deser.findDeserializer(ctxt, "known"));

        ctxt.contextualDeserializer = new FakeDeserializer("other");
        assertSame(fake, deser.findDeserializer(ctxt, "known"));
    }

    @Test
    public void testFindDeserializerUnknownTypeUsesNullifying() throws IOException {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        StubTypeIdResolver resolver = new StubTypeIdResolver(null);
        TestTypeDeserializer deser = new TestTypeDeserializer(base, resolver, "type", false, null);
        MockDeserializationContext ctxt = new MockDeserializationContext(false);

        assertSame(NullifyingDeserializer.instance, deser.findDeserializer(ctxt, "unknown"));
    }

    @Test(expected = JsonMappingException.class)
    public void testFindDeserializerUnknownTypeThrowsWhenFailureEnabled() throws IOException {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        StubTypeIdResolver resolver = new StubTypeIdResolver(null);
        TestTypeDeserializer deser = new TestTypeDeserializer(base, resolver, "type", false, null);
        MockDeserializationContext ctxt = new MockDeserializationContext(true);

        deser.findDeserializer(ctxt, "unknown");
    }

    @Test
    public void testHandleUnknownTypeIdWithTypeIdResolverBase() throws IOException {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        StubTypeIdResolverBase resolver = new StubTypeIdResolverBase(base);
        TestTypeDeserializer deser = new TestTypeDeserializer(base, resolver, "type", false, null);
        MockDeserializationContext ctxt = new MockDeserializationContext(true);

        try {
            deser.handleUnknown(ctxt, "bad");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("known type ids"));
        }
    }

    @Test
    public void testDeserializeWithNativeTypeId() throws IOException {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        JavaType known = TypeFactory.defaultInstance().constructType(String.class);
        StubTypeIdResolver resolver = new StubTypeIdResolver(known);
        TestTypeDeserializer deser = new TestTypeDeserializer(base, resolver, "type", false, null);
        MockDeserializationContext ctxt = new MockDeserializationContext(false);
        FakeDeserializer fake = new FakeDeserializer("native");
        ctxt.contextualDeserializer = fake;

        assertEquals("native", deser.deserializeNative(ctxt, "known"));
    }

    @Test
    public void testDeserializeWithNativeTypeIdNullIdUsesDefaultImpl() throws IOException {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(base,
                new StubTypeIdResolver(base), "type", false, String.class);
        MockDeserializationContext ctxt = new MockDeserializationContext(false);
        FakeDeserializer fake = new FakeDeserializer("default");
        ctxt.contextualDeserializer = fake;

        assertEquals("default", deser.deserializeNative(ctxt, null));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeWithNativeTypeIdNullIdThrowsWhenNoDefault() throws IOException {
        JavaType base = TypeFactory.defaultInstance().constructType(Object.class);
        TestTypeDeserializer deser = new TestTypeDeserializer(base,
                new StubTypeIdResolver(base), "type", false, null);
        MockDeserializationContext ctxt = new MockDeserializationContext(true);

        deser.deserializeNative(ctxt, null);
    }
}