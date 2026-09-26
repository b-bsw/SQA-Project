package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AsPropertyTypeDeserializerTest {

    public static class Bean {
        public String value;
        public String typeId;
        public String extra;
        public Bean() { }
    }

    static class TestTypeIdResolver implements TypeIdResolver {
        private final JavaType beanType = TypeFactory.defaultInstance().constructType(Bean.class);

        @Override
        public void init(JavaType baseType) { }

        @Override
        public String idFromValue(Object value) {
            return "bean";
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return "bean";
        }

        @Override
        public String idFromBaseType() {
            return "bean";
        }

        @Override
        public JavaType typeFromId(String id) throws IOException {
            return beanType;
        }
    }

    private AsPropertyTypeDeserializer create(boolean visible, JavaType defaultImpl) {
        return createWithBase(Bean.class, visible, defaultImpl);
    }

    private AsPropertyTypeDeserializer createWithBase(Class<?> baseClass, boolean visible, JavaType defaultImpl) {
        return new AsPropertyTypeDeserializer(
                TypeFactory.defaultInstance().constructType(baseClass),
                new TestTypeIdResolver(),
                "typeId",
                visible,
                defaultImpl,
                As.PROPERTY);
    }

    private DeserializationContext contextFor(ObjectMapper mapper) throws Exception {
        Field f = ObjectMapper.class.getDeclaredField("_deserializationContext");
        f.setAccessible(true);
        return (DeserializationContext) f.get(mapper);
    }

    private JsonParser parser(ObjectMapper mapper, String json) throws IOException {
        JsonParser p = mapper.getJsonFactory().createParser(json);
        p.setCodec(mapper);
        return p;
    }

    private BeanProperty dummyBeanProperty() {
        return (BeanProperty) Proxy.newProxyInstance(
                BeanProperty.class.getClassLoader(),
                new Class<?>[] { BeanProperty.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Class<?> rt = method.getReturnType();
                        if (rt == Boolean.TYPE) {
                            return Boolean.FALSE;
                        }
                        if (rt == Integer.TYPE) {
                            return Integer.valueOf(0);
                        }
                        if (rt == Long.TYPE) {
                            return Long.valueOf(0L);
                        }
                        if (rt == Short.TYPE) {
                            return Short.valueOf((short) 0);
                        }
                        if (rt == Byte.TYPE) {
                            return Byte.valueOf((byte) 0);
                        }
                        if (rt == Character.TYPE) {
                            return Character.valueOf('\0');
                        }
                        if (rt == Float.TYPE) {
                            return Float.valueOf(0f);
                        }
                        if (rt == Double.TYPE) {
                            return Double.valueOf(0d);
                        }
                        return null;
                    }
                });
    }

    @Test
    public void testGetTypeInclusion() {
        AsPropertyTypeDeserializer d = create(false, null);
        assertEquals(As.PROPERTY, d.getTypeInclusion());

        AsPropertyTypeDeserializer wrapped = new AsPropertyTypeDeserializer(
                TypeFactory.defaultInstance().constructType(Bean.class),
                new TestTypeIdResolver(),
                "typeId",
                false,
                null,
                As.WRAPPER_ARRAY);
        assertEquals(As.WRAPPER_ARRAY, wrapped.getTypeInclusion());
    }

    @Test
    public void testForProperty() {
        AsPropertyTypeDeserializer d = create(false, null);
        assertSame(d, d.forProperty(null));

        BeanProperty prop = dummyBeanProperty();
        TypeDeserializer copy = d.forProperty(prop);
        assertNotNull(copy);
        assertNotSame(d, copy);
        assertEquals(As.PROPERTY, copy.getTypeInclusion());
        assertSame(copy, copy.forProperty(prop));
    }

    @Test
    public void testDeserializeTypedFromObjectTypeIdFirst() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "{\"typeId\":\"bean\",\"value\":\"hello\"}");
        p.nextToken();

        Object result = create(false, null).deserializeTypedFromObject(p, contextFor(mapper));

        assertTrue(result instanceof Bean);
        Bean bean = (Bean) result;
        assertEquals("hello", bean.value);
        assertNull(bean.typeId);
    }

    @Test
    public void testDeserializeTypedFromObjectTypeIdLaterWithBuffer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "{\"value\":\"later\",\"typeId\":\"bean\",\"extra\":\"ignored\"}");
        p.nextToken();

        Object result = create(false, null).deserializeTypedFromObject(p, contextFor(mapper));

        assertTrue(result instanceof Bean);
        Bean bean = (Bean) result;
        assertEquals("later", bean.value);
        assertNull(bean.typeId);
        assertEquals("ignored", bean.extra);
    }

    @Test
    public void testDeserializeTypedFromObjectTypeIdVisible() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "{\"value\":\"vis\",\"typeId\":\"bean\"}");
        p.nextToken();

        Object result = create(true, null).deserializeTypedFromObject(p, contextFor(mapper));

        assertTrue(result instanceof Bean);
        Bean bean = (Bean) result;
        assertEquals("vis", bean.value);
        assertEquals("bean", bean.typeId);
    }

    @Test
    public void testDeserializeTypedFromObjectUsesDefaultImplWhenTypeIdMissing() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "{\"value\":\"default\"}");
        p.nextToken();

        AsPropertyTypeDeserializer d = create(false, TypeFactory.defaultInstance().constructType(Bean.class));
        Object result = d.deserializeTypedFromObject(p, contextFor(mapper));

        assertTrue(result instanceof Bean);
        assertEquals("default", ((Bean) result).value);
    }

    @Test
    public void testDeserializeTypedFromObjectNaturalValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "42");
        p.nextToken();

        AsPropertyTypeDeserializer d = createWithBase(Object.class, false, null);
        Object result = d.deserializeTypedFromObject(p, contextFor(mapper));

        assertEquals(Integer.valueOf(42), result);
    }

    @Test
    public void testDeserializeTypedFromObjectMissingTypeIdThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "{}");
        p.nextToken();

        AsPropertyTypeDeserializer d = create(false, null);
        try {
            d.deserializeTypedFromObject(p, contextFor(mapper));
            fail("Should have thrown JsonMappingException");
        } catch (JsonMappingException expected) {
        }
    }

    @Test
    public void testDeserializeTypedFromAnyArrayWrapper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "[\"bean\",{\"value\":\"arr\"}]");
        p.nextToken();

        Object result = create(false, null).deserializeTypedFromAny(p, contextFor(mapper));

        assertTrue(result instanceof Bean);
        assertEquals("arr", ((Bean) result).value);
    }

    @Test
    public void testDeserializeTypedFromAnyObjectDelegates() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = parser(mapper, "{\"typeId\":\"bean\",\"value\":\"any\"}");
        p.nextToken();

        Object result = create(false, null).deserializeTypedFromAny(p, contextFor(mapper));

        assertTrue(result instanceof Bean);
        assertEquals("any", ((Bean) result).value);
    }
}