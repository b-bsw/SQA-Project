package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AsWrapperTypeDeserializerTest {

    private AsWrapperTypeDeserializer deser;
    private AsWrapperTypeDeserializer visibleDeser;

    @Before
    public void setUp() {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Base.class);
        TestTypeIdResolver idRes = new TestTypeIdResolver();
        deser = new AsWrapperTypeDeserializer(baseType, idRes, "type", false, null);
        visibleDeser = new AsWrapperTypeDeserializer(baseType, idRes, "type", true, null);
    }

    @Test
    public void testGetTypeInclusion() {
        assertSame(As.WRAPPER_OBJECT, deser.getTypeInclusion());
    }

    @Test
    public void testForPropertyReusesInstanceForSameProperty() {
        assertSame(deser, deser.forProperty(null));
    }

    @Test
    public void testForPropertyCreatesNewInstanceForNewProperty() {
        BeanProperty prop = beanPropertyProxy();
        AsWrapperTypeDeserializer newDeser = deser.forProperty(prop);
        assertNotNull(newDeser);
        assertNotSame(deser, newDeser);
        assertSame(As.WRAPPER_OBJECT, newDeser.getTypeInclusion());
        assertSame(newDeser, newDeser.forProperty(prop));
    }

    @Test
    public void testAllDeserializeTypedVariantsUseWrapperObject() throws IOException {
        for (DeserMethod method : DeserMethod.values()) {
            Base result = read(deser, method, false, "{\"dog\":{\"name\":\"Rex\"}}");
            assertTrue("method: " + method, result instanceof Dog);
            assertEquals("method: " + method, "Rex", ((Dog) result).name);
        }
    }

    @Test
    public void testTypeIdVisibleIsInjectedIntoValue() throws IOException {
        Base result = read(visibleDeser, DeserMethod.OBJECT, false, "{\"dog\":{\"name\":\"Rex\"}}");
        assertTrue(result instanceof Dog);
        assertEquals("dog", ((Dog) result).type);
    }

    @Test
    public void testNativeTypeIdPath() throws IOException {
        Base result = read(deser, DeserMethod.OBJECT, true, "{\"name\":\"Rex\"}");
        assertTrue(result instanceof Dog);
        assertEquals("Rex", ((Dog) result).name);
    }

    @Test(expected = JsonMappingException.class)
    public void testInvalidStartTokenThrows() throws IOException {
        read(deser, DeserMethod.OBJECT, false, "\"not-an-object\"");
    }

    @Test(expected = JsonMappingException.class)
    public void testMissingFieldNameThrows() throws IOException {
        read(deser, DeserMethod.OBJECT, false, "{}");
    }

    @Test(expected = JsonMappingException.class)
    public void testMissingClosingObjectThrows() throws IOException {
        read(deser, DeserMethod.OBJECT, false, "{\"dog\":{\"name\":\"Rex\"}");
    }

    private Base read(AsWrapperTypeDeserializer td, DeserMethod method, boolean nativeTypeId, String json) throws IOException {
        return mapperWith(td, method, nativeTypeId).readValue(json, Base.class);
    }

    private ObjectMapper mapperWith(final AsWrapperTypeDeserializer td, final DeserMethod method, final boolean nativeTypeId) {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Base.class, new JsonDeserializer<Base>() {
            @Override
            public Base deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                JsonParser toUse = nativeTypeId ? new NativeTypeIdParser(p, "dog") : p;
                switch (method) {
                case OBJECT:
                    return (Base) td.deserializeTypedFromObject(toUse, ctxt);
                case ARRAY:
                    return (Base) td.deserializeTypedFromArray(toUse, ctxt);
                case SCALAR:
                    return (Base) td.deserializeTypedFromScalar(toUse, ctxt);
                case ANY:
                    return (Base) td.deserializeTypedFromAny(toUse, ctxt);
                default:
                    throw new IllegalStateException("Unknown method: " + method);
                }
            }
        });
        mapper.registerModule(module);
        return mapper;
    }

    private BeanProperty beanPropertyProxy() {
        return (BeanProperty) Proxy.newProxyInstance(
                AsWrapperTypeDeserializerTest.class.getClassLoader(),
                new Class<?>[] { BeanProperty.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                });
    }

    private enum DeserMethod {
        OBJECT, ARRAY, SCALAR, ANY
    }

    private static class NativeTypeIdParser extends JsonParserDelegate {
        private final String typeId;

        NativeTypeIdParser(JsonParser delegate, String typeId) {
            super(delegate);
            this.typeId = typeId;
        }

        @Override
        public boolean canReadTypeId() {
            return true;
        }

        @Override
        public Object getTypeId() {
            return typeId;
        }
    }

    private static class TestTypeIdResolver implements TypeIdResolver {
        private JavaType baseType;

        @Override
        public void init(JavaType bt) {
            this.baseType = bt;
        }

        @Override
        public String idFromValue(Object value) {
            return idFromValueAndType(value, value.getClass());
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> clazz) {
            if (clazz == Dog.class) {
                return "dog";
            }
            if (clazz == Cat.class) {
                return "cat";
            }
            return clazz.getName();
        }

        @Override
        public String idFromBaseType() {
            return baseType.getRawClass().getName();
        }

        @Override
        public JavaType typeFromId(String id) {
            TypeFactory tf = TypeFactory.defaultInstance();
            if ("dog".equals(id)) {
                return tf.constructType(Dog.class);
            }
            if ("cat".equals(id)) {
                return tf.constructType(Cat.class);
            }
            return null;
        }

        @Override
        public String getMechanism() {
            return "test";
        }
    }

    public static class Base {
    }

    public static class Dog extends Base {
        public String name;
        public String type;
    }

    public static class Cat extends Base {
        public String name;
    }
}