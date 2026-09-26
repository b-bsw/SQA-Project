package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.lang.reflect.*;

import org.junit.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class DeserializerCacheTest {

    private DeserializerCache cache;
    private DeserializationContext ctxt;
    private DeserializerFactory factory;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        cache = new DeserializerCache();
        ObjectMapper mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        factory = mapper.getDeserializerFactory();
        typeFactory = mapper.getTypeFactory();
    }

    @Test
    public void cacheStartsEmptyAndFlushIsNoOp() {
        assertEquals(0, cache.cachedDeserializersCount());
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void findValueDeserializerCachesBean() throws Throwable {
        JavaType type = typeFactory.constructType(SimpleBean.class);

        JsonDeserializer<Object> deserializer = findValueDeserializer(type);

        assertNotNull(deserializer);
        assertTrue(cache.cachedDeserializersCount() > 0);
    }

    @Test
    public void secondLookupReturnsSameCachedInstance() throws Throwable {
        JavaType type = typeFactory.constructType(SimpleBean.class);

        JsonDeserializer<Object> first = findValueDeserializer(type);
        JsonDeserializer<Object> second = findValueDeserializer(type);

        assertNotNull(first);
        assertSame(first, second);
    }

    @Test
    public void flushClearsCachedEntries() throws Throwable {
        JavaType type = typeFactory.constructType(SimpleBean.class);

        findValueDeserializer(type);
        assertTrue(cache.cachedDeserializersCount() > 0);

        cache.flushCachedDeserializers();

        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void hasValueDeserializerForKnownType() throws Throwable {
        JavaType type = typeFactory.constructType(SimpleBean.class);

        assertTrue(hasValueDeserializerFor(type));
    }

    @Test(expected = JsonMappingException.class)
    public void findValueDeserializerForUnknownAbstractTypeThrows() throws Throwable {
        JavaType type = typeFactory.constructType(NoDeserializerInterface.class);

        findValueDeserializer(type);
    }

    @Test
    public void findKeyDeserializerForString() throws Throwable {
        JavaType type = typeFactory.constructType(String.class);

        KeyDeserializer keyDeserializer = findKeyDeserializer(type);

        assertNotNull(keyDeserializer);
    }

    public static class SimpleBean {
        public String value;

        public SimpleBean() {
        }
    }

    public interface NoDeserializerInterface {
    }

    @SuppressWarnings("unchecked")
    private JsonDeserializer<Object> findValueDeserializer(JavaType type) throws Throwable {
        try {
            return (JsonDeserializer<Object>) invokePublic(
                    "findValueDeserializer", new Object[]{ctxt, factory, type});
        } catch (NoSuchMethodException e) {
            try {
                return (JsonDeserializer<Object>) invokePublic(
                        "findValueDeserializer", new Object[]{ctxt, type});
            } catch (NoSuchMethodException e2) {
                throw e;
            }
        }
    }

    private KeyDeserializer findKeyDeserializer(JavaType type) throws Throwable {
        try {
            return (KeyDeserializer) invokePublic(
                    "findKeyDeserializer", new Object[]{ctxt, factory, type});
        } catch (NoSuchMethodException e) {
            try {
                return (KeyDeserializer) invokePublic(
                        "findKeyDeserializer", new Object[]{ctxt, type});
            } catch (NoSuchMethodException e2) {
                throw e;
            }
        }
    }

    private boolean hasValueDeserializerFor(JavaType type) throws Throwable {
        try {
            return (Boolean) invokePublic(
                    "hasValueDeserializerFor", new Object[]{ctxt, factory, type});
        } catch (NoSuchMethodException e) {
            try {
                return (Boolean) invokePublic(
                        "hasValueDeserializerFor", new Object[]{ctxt, type});
            } catch (NoSuchMethodException e2) {
                throw e;
            }
        }
    }

    private Object invokePublic(String methodName, Object[] args) throws Throwable {
        for (Method method : cache.getClass().getMethods()) {
            if (!method.getName().equals(methodName)) {
                continue;
            }

            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length != args.length) {
                continue;
            }

            boolean matches = true;
            for (int i = 0; i < args.length; i++) {
                if (args[i] != null && !parameterTypes[i].isAssignableFrom(args[i].getClass())) {
                    matches = false;
                    break;
                }
            }

            if (!matches) {
                continue;
            }

            try {
                return method.invoke(cache, args);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        throw new NoSuchMethodException(methodName);
    }
}