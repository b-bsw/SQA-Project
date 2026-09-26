package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;

public class BasicDeserializerFactoryTest {

    private static class TestFactory extends BasicDeserializerFactory {
        TestFactory() {
            super(new DeserializerFactoryConfig());
        }

        TestFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new TestFactory(config);
        }
    }

    private BasicDeserializerFactory factory() {
        return new TestFactory();
    }

    private DeserializationConfig config() {
        return new ObjectMapper().getDeserializationConfig();
    }

    @Test
    public void testGetFactoryConfig() {
        assertNotNull(factory().getFactoryConfig());
    }

    @Test
    public void testMapAbstractListToArrayList() throws Exception {
        DeserializationConfig cfg = config();
        JavaType type = cfg.getTypeFactory().constructType(List.class);

        JavaType result = factory().mapAbstractType(cfg, type);

        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractMapToLinkedHashMap() throws Exception {
        DeserializationConfig cfg = config();
        JavaType type = cfg.getTypeFactory().constructType(Map.class);

        JavaType result = factory().mapAbstractType(cfg, type);

        assertEquals(LinkedHashMap.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractConcreteTypeStaysSame() throws Exception {
        DeserializationConfig cfg = config();
        JavaType type = cfg.getTypeFactory().constructType(String.class);

        JavaType result = factory().mapAbstractType(cfg, type);

        assertEquals(String.class, result.getRawClass());
    }

    @Test(expected = NullPointerException.class)
    public void testMapAbstractNullTypeFails() throws Exception {
        factory().mapAbstractType(config(), null);
    }

    @Test
    public void testWithAdditionalDeserializers() {
        BasicDeserializerFactory original = factory();

        DeserializerFactory result = original.withAdditionalDeserializers(new Deserializers.Base() {});

        assertNotNull(result);
        assertNotSame(original, result);
    }

    @Test
    public void testWithAdditionalKeyDeserializers() {
        BasicDeserializerFactory original = factory();

        KeyDeserializers keyDeserializers = new KeyDeserializers() {
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type,
                    DeserializationConfig config, BeanDescription beanDesc) {
                return null;
            }
        };

        DeserializerFactory result = original.withAdditionalKeyDeserializers(keyDeserializers);

        assertNotNull(result);
        assertNotSame(original, result);
    }

    @Test
    public void testWithDeserializerModifier() {
        BasicDeserializerFactory original = factory();

        DeserializerFactory result = original.withDeserializerModifier(new BeanDeserializerModifier() {});

        assertNotNull(result);
        assertNotSame(original, result);
    }

    @Test
    public void testWithAbstractTypeResolver() {
        BasicDeserializerFactory original = factory();

        DeserializerFactory result = original.withAbstractTypeResolver(new AbstractTypeResolver() {});

        assertNotNull(result);
        assertNotSame(original, result);
    }

    @Test
    public void testWithValueInstantiators() {
        BasicDeserializerFactory original = factory();

        ValueInstantiators instantiators = new ValueInstantiators() {
            @Override
            public ValueInstantiator findValueInstantiator(BeanDescription beanDesc,
                    ValueInstantiator defaultInstantiator) {
                return defaultInstantiator;
            }
        };

        DeserializerFactory result = original.withValueInstantiators(instantiators);

        assertNotNull(result);
        assertNotSame(original, result);
    }
}