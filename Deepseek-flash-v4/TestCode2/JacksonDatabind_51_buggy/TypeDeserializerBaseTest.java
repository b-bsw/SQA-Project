package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TypeDeserializerBaseTest {

    private static final class TestTypeDeserializerBase extends TypeDeserializerBase {
        private static final long serialVersionUID = 1L;

        TestTypeDeserializerBase(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        TestTypeDeserializerBase(TypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestTypeDeserializerBase(this, prop);
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    private static final class StubTypeIdResolver extends TypeIdResolverBase {
        private final Map<String, Class<?>> ids = new HashMap<String, Class<?>>();

        StubTypeIdResolver() {
            super(null);
        }

        void addTypeId(String id, Class<?> cls) {
            ids.put(id, cls);
        }

        @Override
        public void init(JavaType baseType) { }

        @Override
        public String idFromValue(Object value) {
            return value == null ? "null" : value.getClass().getName();
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return suggestedType == null ? "null" : suggestedType.getName();
        }

        @Override
        public String idFromBaseType() {
            return "base";
        }

        @Override
        public JavaType typeFromId(DeserializationContext context, String id) {
            Class<?> cls = ids.get(id);
            return cls == null ? null : TypeFactory.defaultInstance().constructType(cls);
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CLASS;
        }

        @Override
        public String getDescForKnownTypeIds() {
            return "known";
        }
    }

    public static class Dog {}
    public static class Fallback {}

    private JavaType javaType(Class<?> cls) {
        return TypeFactory.defaultInstance().constructType(cls);
    }

    private DeserializationContext defaultContext() {
        return new ObjectMapper().getDeserializationContext();
    }

    private TestTypeDeserializerBase createBase(JavaType baseType, TypeIdResolver idRes,
            String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
        return new TestTypeDeserializerBase(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
    }

    @Test
    public void testNullTypePropertyNameBecomesEmpty() {
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), new StubTypeIdResolver(), null, false, null);
        assertEquals("", deser.getPropertyName());
    }

    @Test
    public void testAccessorsAndToString() {
        StubTypeIdResolver resolver = new StubTypeIdResolver();
        TestTypeDeserializerBase deser = createBase(javaType(String.class), resolver, "typeId", true, javaType(Integer.class));
        assertEquals("typeId", deser.getPropertyName());
        assertSame(resolver, deser.getTypeIdResolver());
        assertEquals(Integer.class, deser.getDefaultImpl());
        assertEquals("java.lang.String", deser.baseTypeName());
        assertEquals(JsonTypeInfo.As.PROPERTY, deser.getTypeInclusion());
        String str = deser.toString();
        assertTrue(str.contains("TestTypeDeserializerBase"));
        assertTrue(str.contains("base-type"));
        assertTrue(str.contains("id-resolver"));
    }

    @Test
    public void testDefaultImplNull() {
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), new StubTypeIdResolver(), "type", true, null);
        assertNull(deser.getDefaultImpl());
    }

    @Test
    public void testFindDeserializerKnownTypeIdCachesResult() throws Exception {
        StubTypeIdResolver resolver = new StubTypeIdResolver();
        resolver.addTypeId("dog", Dog.class);
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), resolver, "type", true, null);
        JsonDeserializer<Object> first = deser._findDeserializer(defaultContext(), "dog");
        assertNotNull(first);
        assertSame(first, deser._findDeserializer(defaultContext(), "dog"));
    }

    @Test
    public void testFindDeserializerUnknownTypeIdUsesDefaultImpl() throws Exception {
        StubTypeIdResolver resolver = new StubTypeIdResolver();
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), resolver, "type", true, javaType(Fallback.class));
        JsonDeserializer<Object> first = deser._findDeserializer(defaultContext(), "missing");
        assertNotNull(first);
        assertSame(first, deser._findDeserializer(defaultContext(), "missing"));
    }

    @Test(expected = JsonMappingException.class)
    public void testFindDeserializerUnknownTypeIdThrowsWhenNoDefault() throws Exception {
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), new StubTypeIdResolver(), "type", true, null);
        deser._findDeserializer(defaultContext(), "missing");
    }

    @Test
    public void testFindDefaultImplDeserializerWithoutDefaultReturnsNull() throws Exception {
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), new StubTypeIdResolver(), "type", true, null);
        assertNull(deser._findDefaultImplDeserializer(defaultContext()));
    }

    @Test
    public void testFindDefaultImplDeserializerWithVoidReturnsNullifying() throws Exception {
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), new StubTypeIdResolver(), "type", true, javaType(Void.class));
        assertSame(NullifyingDeserializer.instance, deser._findDefaultImplDeserializer(defaultContext()));
    }

    @Test
    public void testFindDefaultImplDeserializerCachesResult() throws Exception {
        TestTypeDeserializerBase deser = createBase(javaType(Object.class), new StubTypeIdResolver(), "type", true, javaType(Fallback.class));
        JsonDeserializer<Object> first = deser._findDefaultImplDeserializer(defaultContext());
        assertNotNull(first);
        assertSame(first, deser._findDefaultImplDeserializer(defaultContext()));
    }

    @Test
    public void testForPropertyCopiesState() {
        StubTypeIdResolver resolver = new StubTypeIdResolver();
        TestTypeDeserializerBase original = createBase(javaType(Object.class), resolver, "type", true, javaType(Fallback.class));
        TestTypeDeserializerBase copy = (TestTypeDeserializerBase) original.forProperty(null);
        assertNotSame(original, copy);
        assertEquals(original.getPropertyName(), copy.getPropertyName());
        assertEquals(original.getDefaultImpl(), copy.getDefaultImpl());
        assertSame(original.getTypeIdResolver(), copy.getTypeIdResolver());
        assertEquals(JsonTypeInfo.As.PROPERTY, copy.getTypeInclusion());
    }
}