package com.fasterxml.jackson.databind.deser;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.util.*;

public class BasicDeserializerFactoryTest {

    private DeserializationConfig config;
    private TypeFactory tf;
    private DeserializationContext ctxt;

    @Before
    public void setUp() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{}", Object.class);
        config = mapper.getDeserializationConfig();
        tf = mapper.getTypeFactory();
        ctxt = mapper.getDeserializationContext();
    }

    @Test
    public void testGetFactoryConfig() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BasicDeserializerFactory factory = new TestDeserializerFactory(cfg);
        assertSame(cfg, factory.getFactoryConfig());
    }

    @Test
    public void testWithAdditionalDeserializersReturnsConfiguredFactory() {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        Deserializers additional = new Deserializers.Base() {};
        DeserializerFactory result = factory.withAdditionalDeserializers(additional);
        assertNotNull(result);
        assertNotSame(factory, result);
    }

    @Test
    public void testMapAbstractTypeWithoutResolversReturnsSameType() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        JavaType baseType = tf.constructType(Base.class);
        assertSame(baseType, factory.mapAbstractType(config, baseType));
    }

    @Test
    public void testMapAbstractTypeResolvesConfiguredType() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory(
                new DeserializerFactoryConfig().withAbstractTypeResolver(new AbstractTypeResolver() {
                    @Override
                    public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                        if (type.getRawClass() == Base.class) {
                            return config.getTypeFactory().constructType(Sub.class);
                        }
                        return null;
                    }
                }));
        JavaType result = factory.mapAbstractType(config, tf.constructType(Base.class));
        assertEquals(Sub.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractTypeRejectsNonSubtype() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory(
                new DeserializerFactoryConfig().withAbstractTypeResolver(new AbstractTypeResolver() {
                    @Override
                    public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                        return config.getTypeFactory().constructType(String.class);
                    }
                }));
        factory.mapAbstractType(config, tf.constructType(Base.class));
    }

    @Test
    public void testFindValueInstantiatorUsesDefaultConstructor() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        BeanDescription beanDesc = config.introspect(tf.constructType(Simple.class));
        ValueInstantiator inst = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(inst);
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testFindValueInstantiatorForJsonLocation() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        BeanDescription beanDesc = config.introspect(tf.constructType(JsonLocation.class));
        ValueInstantiator inst = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(inst);
    }

    @Test
    public void testCreateArrayDeserializer() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        ArrayType stringArrayType = tf.constructArrayType(String.class);
        JsonDeserializer<?> deser = factory.createArrayDeserializer(ctxt, stringArrayType,
                config.introspect(stringArrayType));
        assertSame(StringArrayDeserializer.instance, deser);

        ArrayType intArrayType = tf.constructArrayType(int.class);
        assertNotNull(factory.createArrayDeserializer(ctxt, intArrayType, null));
    }

    @Test
    public void testCreateCollectionDeserializerForStringList() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        CollectionType listOfString = tf.constructCollectionType(List.class, String.class);
        JsonDeserializer<?> deser = factory.createCollectionDeserializer(ctxt, listOfString,
                config.introspect(listOfString));
        assertTrue(deser instanceof StringCollectionDeserializer);
    }

    @Test
    public void testCreateMapDeserializerForStringMap() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        MapType mapOfString = tf.constructMapType(Map.class, String.class, String.class);
        JsonDeserializer<?> deser = factory.createMapDeserializer(ctxt, mapOfString,
                config.introspect(mapOfString));
        assertTrue(deser instanceof MapDeserializer);
    }

    @Test
    public void testCreateEnumDeserializer() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        JavaType enumType = tf.constructType(TestEnum.class);
        BeanDescription beanDesc = config.introspect(enumType);
        JsonDeserializer<?> deser = factory.createEnumDeserializer(ctxt, enumType, beanDesc);
        assertTrue(deser instanceof EnumDeserializer);
    }

    @Test
    public void testCreateTreeDeserializer() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        JavaType nodeType = tf.constructType(JsonNode.class);
        JsonDeserializer<?> deser = factory.createTreeDeserializer(config, nodeType, null);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializerForObjectAndString() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        assertNotNull(factory.findDefaultDeserializer(ctxt, tf.constructType(Object.class), null));
        assertSame(StringDeserializer.instance,
                factory.findDefaultDeserializer(ctxt, tf.constructType(String.class), null));
    }

    @Test
    public void testCreateKeyDeserializerForString() throws Exception {
        BasicDeserializerFactory factory = new TestDeserializerFactory();
        assertNotNull(factory.createKeyDeserializer(ctxt, tf.constructType(String.class)));
    }

    static abstract class Base {
    }

    static class Sub extends Base {
    }

    public static class Simple {
        public Simple() {
        }
    }

    enum TestEnum {
        A, B
    }

    static class TestDeserializerFactory extends BasicDeserializerFactory {
        private static final long serialVersionUID = 1L;

        TestDeserializerFactory() {
            super(new DeserializerFactoryConfig());
        }

        TestDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new TestDeserializerFactory(config);
        }
    }
}