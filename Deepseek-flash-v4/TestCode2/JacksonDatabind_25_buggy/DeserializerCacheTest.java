package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.*;

import java.io.IOException;
import java.util.*;

public class DeserializerCacheTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private DeserializerCache cache;
    private DeserializerFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        cache = new DeserializerCache();
        factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    public enum TestEnum { A, B }

    static class UnknownType {}
    static abstract class AbstractUnknown {}
    static class UnknownKeyType {}

    static class TestDeserializerFactory extends BeanDeserializerFactory {
        TestDeserializerFactory() {
            super(new DeserializerFactoryConfig());
        }

        @Override
        public JsonDeserializer<?> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException {
            if (type.getRawClass() == UnknownType.class || type.getRawClass() == AbstractUnknown.class) {
                return null;
            }
            return super.createBeanDeserializer(ctxt, type, beanDesc);
        }

        @Override
        public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException {
            if (type.getRawClass() == UnknownKeyType.class) {
                return null;
            }
            return super.createKeyDeserializer(ctxt, type);
        }
    }

    static class TestResolvableKeyDeserializer extends KeyDeserializer implements ResolvableDeserializer {
        boolean resolved = false;

        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
            return key;
        }

        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            resolved = true;
        }
    }

    static class ResolvableKeyFactory extends BeanDeserializerFactory {
        ResolvableKeyFactory() {
            super(new DeserializerFactoryConfig());
        }

        @Override
        public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException {
            return new TestResolvableKeyDeserializer();
        }
    }

    @Test
    public void testInitialCacheCountIsZero() {
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializerReturnsCachedInstanceForString() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        int before = cache.cachedDeserializersCount();
        JsonDeserializer<Object> first = cache.findValueDeserializer(ctxt, factory, type);
        assertNotNull(first);
        int afterFirst = cache.cachedDeserializersCount();
        assertTrue(afterFirst > before);
        JsonDeserializer<Object> second = cache.findValueDeserializer(ctxt, factory, type);
        assertSame(first, second);
        assertEquals(afterFirst, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializerForCollectionType() throws Exception {
        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        assertNotNull(cache.findValueDeserializer(ctxt, factory, listType));
    }

    @Test
    public void testFindValueDeserializerForMapType() throws Exception {
        JavaType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, String.class);
        assertNotNull(cache.findValueDeserializer(ctxt, factory, mapType));
    }

    @Test
    public void testFindValueDeserializerForEnumType() throws Exception {
        JavaType enumType = mapper.getTypeFactory().constructType(TestEnum.class);
        assertNotNull(cache.findValueDeserializer(ctxt, factory, enumType));
    }

    @Test
    public void testFindValueDeserializerForArrayType() throws Exception {
        JavaType arrayType = mapper.getTypeFactory().constructArrayType(String.class);
        assertNotNull(cache.findValueDeserializer(ctxt, factory, arrayType));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueDeserializerNullTypeThrows() throws Exception {
        cache.findValueDeserializer(ctxt, factory, null);
    }

    @Test
    public void testFindValueDeserializerUnknownTypeThrows() throws Exception {
        TestDeserializerFactory nullFactory = new TestDeserializerFactory();
        JavaType type = mapper.getTypeFactory().constructType(UnknownType.class);
        try {
            cache.findValueDeserializer(ctxt, nullFactory, type);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Can not find a Value deserializer for type"));
        }
    }

    @Test
    public void testFindValueDeserializerAbstractTypeThrows() throws Exception {
        TestDeserializerFactory nullFactory = new TestDeserializerFactory();
        JavaType type = mapper.getTypeFactory().constructType(AbstractUnknown.class);
        try {
            cache.findValueDeserializer(ctxt, nullFactory, type);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Can not find a Value deserializer for abstract type"));
        }
    }

    @Test
    public void testHasValueDeserializerForString() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, type));
    }

    @Test
    public void testHasValueDeserializerForUnknownTypeFalse() throws Exception {
        TestDeserializerFactory nullFactory = new TestDeserializerFactory();
        JavaType type = mapper.getTypeFactory().constructType(UnknownType.class);
        assertFalse(cache.hasValueDeserializerFor(ctxt, nullFactory, type));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasValueDeserializerNullTypeThrows() throws Exception {
        cache.hasValueDeserializerFor(ctxt, factory, null);
    }

    @Test
    public void testFlushCachedDeserializers() throws Exception {
        cache.findValueDeserializer(ctxt, factory, mapper.getTypeFactory().constructType(String.class));
        assertTrue(cache.cachedDeserializersCount() > 0);
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindKeyDeserializerWithStringKey() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNotNull(cache.findKeyDeserializer(ctxt, factory, type));
    }

    @Test
    public void testFindKeyDeserializerUnknownKeyTypeThrows() throws Exception {
        TestDeserializerFactory nullFactory = new TestDeserializerFactory();
        JavaType type = mapper.getTypeFactory().constructType(UnknownKeyType.class);
        try {
            cache.findKeyDeserializer(ctxt, nullFactory, type);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Can not find a (Map) Key deserializer for type"));
        }
    }

    @Test
    public void testFindKeyDeserializerResolves() throws Exception {
        ResolvableKeyFactory resolvableFactory = new ResolvableKeyFactory();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, resolvableFactory, type);
        assertNotNull(kd);
        TestResolvableKeyDeserializer testKd = (TestResolvableKeyDeserializer) kd;
        assertTrue(testKd.resolved);
    }

    @Test
    public void testWriteReplaceReturnsSameInstance() {
        assertSame(cache, cache.writeReplace());
    }
}