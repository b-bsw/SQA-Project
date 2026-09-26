package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/**
 * Unit tests for {@link TypeDeserializerBase}.
 */
public class TypeDeserializerBaseTest {

    // ----------------------------------------------------------------------
    // Helper classes
    // ----------------------------------------------------------------------

    /**
     * Minimal {@link TypeIdResolver} used to control whether type ids resolve
     * to a JavaType or to null (unknown type).
     */
    static class StubTypeIdResolver implements TypeIdResolver {
        JavaType typeToReturn;

        StubTypeIdResolver() { }

        StubTypeIdResolver(JavaType type) {
            this.typeToReturn = type;
        }

        @Override
        public void init(JavaType baseType) { }

        @Override
        public String idFromValue(Object value) {
            return null;
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return null;
        }

        @Override
        public String idFromBaseType() {
            return null;
        }

        @Override
        public JavaType typeFromId(DeserializationContext context, String id) {
            return typeToReturn;
        }

        @Override
        public String getDescForKnownTypeIds() {
            return null;
        }
    }

    /**
     * A simple JsonDeserializer that returns a configured value and
     * records calls made to its deserialize method.
     */
    static class StubDeserializer extends JsonDeserializer<Object> {
        private final Object result;
        private final AtomicInteger callCount = new AtomicInteger();

        StubDeserializer(Object result) {
            this.result = result;
        }

        int getCallCount() {
            return callCount.get();
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            callCount.incrementAndGet();
            return result;
        }
    }

    /**
     * Exposes the ObjectMapper's default DeserializationContext, which is
     * needed when calling methods such as {@code _findDeserializer}.
     */
    static class MapperWithContext extends ObjectMapper {
        DeserializationContext getDeserializationContext() {
            return _deserializationContext;
        }
    }

    // ----------------------------------------------------------------------
    // Tests
    // ----------------------------------------------------------------------

    @Test
    public void testAccessorsAndBasicProperties() throws Exception {
        MapperWithContext mapper = new MapperWithContext();
        JavaType baseType = mapper.getTypeFactory().constructType(Object.class);
        JavaType defaultImplType = mapper.getTypeFactory().constructType(String.class);

        StubTypeIdResolver idResolver = new StubTypeIdResolver();

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idResolver, "typeId", true, defaultImplType.getRawClass());

        assertEquals("java.lang.Object", deser.baseTypeName());
        assertEquals("typeId", deser.getPropertyName());
        assertSame(idResolver, deser.getTypeIdResolver());
        assertEquals(String.class, deser.getDefaultImpl());
        assertNotNull(deser.toString());
    }

    @Test
    public void testFindDeserializerUsesCache() throws Exception {
        MapperWithContext mapper = new MapperWithContext();
        JavaType baseType = mapper.getTypeFactory().constructType(Object.class);

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, new StubTypeIdResolver(), "id", true, null);

        StubDeserializer stub = new StubDeserializer("value");
        deser._deserializers.put("cached", stub);

        assertSame(stub, deser._findDeserializer(mapper.getDeserializationContext(), "cached"));
    }

    @Test
    public void testFindDeserializerResolvesType() throws Exception {
        MapperWithContext mapper = new MapperWithContext();
        JavaType baseType = mapper.getTypeFactory().constructType(Object.class);

        JavaType resolvedType = mapper.getTypeFactory().constructType(String.class);
        StubTypeIdResolver idResolver = new StubTypeIdResolver(resolvedType);

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idResolver, "id", true, null);

        JsonDeserializer<Object> result =
                deser._findDeserializer(mapper.getDeserializationContext(), "someId");

        assertNotNull("Expected a deserializer to be resolved", result);
        assertNotNull("Expected the resolved deserializer to be cached",
                deser._deserializers.get("someId"));
    }

    @Test
    public void testFindDeserializerUsesDefaultImpl() throws Exception {
        MapperWithContext mapper = new MapperWithContext();
        JavaType baseType = mapper.getTypeFactory().constructType(Object.class);

        // No JavaType will be resolved by TypeIdResolver, so the default impl should kick in.
        StubTypeIdResolver idResolver = new StubTypeIdResolver(null);

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idResolver, "id", true, String.class);

        JsonDeserializer<Object> result =
                deser._findDeserializer(mapper.getDeserializationContext(), "unknownId");

        assertNotNull("Expected the default implementation to provide a deserializer", result);
    }

    @Test
    public void testFindDeserializerUnknownType() throws Exception {
        MapperWithContext mapper = new MapperWithContext();
        JavaType baseType = mapper.getTypeFactory().constructType(Object.class);

        // TypeIdResolver cannot resolve the id, and there is no default impl.
        StubTypeIdResolver idResolver = new StubTypeIdResolver(null);

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idResolver, "id", true, null);

        DeserializationContext ctxt = mapper.getDeserializationContext();

        if (ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            try {
                deser._findDeserializer(ctxt, "unknown");
                fail("Expected JsonMappingException for unknown type when FAIL_ON_INVALID_SUBTYPE is enabled");
            } catch (JsonMappingException expected) {
                // expected
            }
        } else {
            // With the feature disabled, Typing should return a null-aware deserializer
            JsonDeserializer<Object> result = deser._findDeserializer(ctxt, "unknown");
            assertNotNull(result);
        }
    }

    @Test
    public void testDeserializeWithNativeTypeIdUsesCache() throws Exception {
        MapperWithContext mapper = new MapperWithContext();
        JavaType baseType = mapper.getTypeFactory().constructType(Object.class);

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, new StubTypeIdResolver(), "id", true, null);

        StubDeserializer stub = new StubDeserializer("resolved");
        deser._deserializers.put("wid", stub);

        Object result = deser._deserializeWithNativeTypeId(null, null, "wid");

        assertEquals("resolved", result);
        assertEquals(1, stub.getCallCount());
    }

    @Test
    public void testDeserializeWithNativeTypeIdUsesResolverWhenCacheMiss() throws Exception {
        MapperWithContext mapper = new MapperWithContext();
        JavaType baseType = mapper.getTypeFactory().constructType(Object.class);

        JavaType resolvedType = mapper.getTypeFactory().constructType(Integer.class);
        StubTypeIdResolver idResolver = new StubTypeIdResolver(resolvedType);

        AsPropertyTypeDeserializer deser = new AsPropertyTypeDeserializer(
                baseType, idResolver, "id", true, null);

        Object result = deser._deserializeWithNativeTypeId(null, null, "i");

        assertNotNull("Expected a value to be deserialized", result);
    }
}