package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.*;
import java.util.concurrent.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.introspect.BeanDescription;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.junit.Test;

public class BasicDeserializerFactoryTest {

    private static class TestFactory extends BasicDeserializerFactory {
        DeserializerFactoryConfig lastConfig;

        TestFactory(DeserializerFactoryConfig config) {
            super(config);
            lastConfig = config;
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            lastConfig = config;
            return new TestFactory(config);
        }

        public JsonDeserializer<Object> customBeanDeserializer(JavaType type,
                DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException {
            return _findCustomBeanDeserializer(type, config, beanDesc);
        }

        public CollectionType mapAbstractCollectionType(JavaType type, DeserializationConfig config) {
            return _mapAbstractCollectionType(type, config);
        }
    }

    private DeserializationConfig deserConfig() {
        return new ObjectMapper().getDeserializationConfig();
    }

    @Test
    public void testGetFactoryConfig() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        TestFactory f = new TestFactory(cfg);
        assertSame(cfg, f.getFactoryConfig());
    }

    @Test
    public void testConfigDelegatingMethods() {
        DeserializerFactoryConfig original = new DeserializerFactoryConfig();
        TestFactory f = new TestFactory(original);

        DeserializerFactory r1 = f.withAdditionalDeserializers(new Deserializers.Base() {});
        assertNotSame(original, r1.getFactoryConfig());
        assertSame(f.lastConfig, r1.getFactoryConfig());

        DeserializerFactory r2 = f.withAdditionalKeyDeserializers(new KeyDeserializers() {
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type,
                    DeserializationConfig config, BeanDescription beanDesc)
                    throws JsonMappingException {
                return null;
            }
        });
        assertNotSame(original, r2.getFactoryConfig());
        assertSame(f.lastConfig, r2.getFactoryConfig());

        DeserializerFactory r3 = f.withDeserializerModifier(new BeanDeserializerModifier() {});
        assertNotSame(original, r3.getFactoryConfig());
        assertSame(f.lastConfig, r3.getFactoryConfig());

        DeserializerFactory r4 = f.withAbstractTypeResolver(new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                return null;
            }
        });
        assertNotSame(original, r4.getFactoryConfig());
        assertSame(f.lastConfig, r4.getFactoryConfig());

        DeserializerFactory r5 = f.withValueInstantiators(new ValueInstantiators() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config,
                    BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return defaultInstantiator;
            }
        });
        assertNotSame(original, r5.getFactoryConfig());
        assertSame(f.lastConfig, r5.getFactoryConfig());
    }

    @Test
    public void testMapAbstractTypeReturnsSameWithoutResolvers() throws Exception {
        TestFactory f = new TestFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = deserConfig();
        JavaType stringType = config.getTypeFactory().constructType(String.class);
        assertSame(stringType, f.mapAbstractType(config, stringType));
    }

    @Test
    public void testMapAbstractTypeResolvesAbstractToConcrete() throws Exception {
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass() == List.class) {
                    return config.getTypeFactory().constructType(ArrayList.class);
                }
                return null;
            }
        };
        TestFactory f = new TestFactory(new DeserializerFactoryConfig().withAbstractTypeResolver(resolver));
        DeserializationConfig config = deserConfig();
        JavaType result = f.mapAbstractType(config, config.getTypeFactory().constructType(List.class));
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractTypeIgnoresSameClassMapping() throws Exception {
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                return config.getTypeFactory().constructType(String.class);
            }
        };
        TestFactory f = new TestFactory(new DeserializerFactoryConfig().withAbstractTypeResolver(resolver));
        DeserializationConfig config = deserConfig();
        JavaType stringType = config.getTypeFactory().constructType(String.class);
        assertSame(stringType, f.mapAbstractType(config, stringType));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractTypeRejectsUnrelatedType() throws Exception {
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass() == String.class) {
                    return config.getTypeFactory().constructType(Integer.class);
                }
                return null;
            }
        };
        TestFactory f = new TestFactory(new DeserializerFactoryConfig().withAbstractTypeResolver(resolver));
        DeserializationConfig config = deserConfig();
        f.mapAbstractType(config, config.getTypeFactory().constructType(String.class));
    }

    @Test
    public void testValueInstantiatorInstanceBranches() throws Exception {
        TestFactory f = new TestFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = deserConfig();

        assertNull(f._valueInstantiatorInstance(config, null, null));

        ValueInstantiator supplied = new JsonLocationInstantiator();
        assertSame(supplied, f._valueInstantiatorInstance(config, null, supplied));

        ValueInstantiator created = f._valueInstantiatorInstance(config, null,
                JsonLocationInstantiator.class);
        assertNotNull(created);
        assertTrue(created instanceof JsonLocationInstantiator);

        try {
            f._valueInstantiatorInstance(config, null, String.class);
            fail("Expected IllegalStateException for non-ValueInstantiator class");
        } catch (IllegalStateException e) {
            // expected
        }

        try {
            f._valueInstantiatorInstance(config, null, new Object());
            fail("Expected IllegalStateException for invalid instantiator definition");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testMapAbstractCollectionType() throws Exception {
        TestFactory f = new TestFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = deserConfig();
        JavaType listType = config.getTypeFactory().constructType(List.class);
        CollectionType mapped = f.mapAbstractCollectionType(listType, config);
        assertEquals(ArrayList.class, mapped.getRawClass());
    }

    @Test
    public void testFindCustomBeanDeserializerNoCustomizers() throws Exception {
        TestFactory f = new TestFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = deserConfig();
        JavaType type = config.getTypeFactory().constructType(String.class);
        BeanDescription beanDesc = config.introspectClassAnnotations(String.class);
        assertNull(f.customBeanDeserializer(type, config, beanDesc));
    }

    @Test
    public void testFindTypeDeserializerReturnsNullWithoutTyper() throws Exception {
        TestFactory f = new TestFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = deserConfig();
        assertNull(f.findTypeDeserializer(config, config.getTypeFactory().constructType(String.class)));
    }

    @Test
    public void testCreateTreeDeserializer() throws Exception {
        TestFactory f = new TestFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = deserConfig();
        JavaType nodeType = config.getTypeFactory().constructType(ObjectNode.class);
        BeanDescription beanDesc = config.introspectClassAnnotations(ObjectNode.class);
        assertNotNull(f.createTreeDeserializer(config, nodeType, beanDesc));
    }

    @Test
    public void testAbstractMapFallbacks() {
        assertEquals(LinkedHashMap.class, BasicDeserializerFactory._mapFallbacks.get(Map.class.getName()));
        assertEquals(ConcurrentHashMap.class, BasicDeserializerFactory._mapFallbacks.get(ConcurrentMap.class.getName()));
        assertEquals(TreeMap.class, BasicDeserializerFactory._mapFallbacks.get(SortedMap.class.getName()));
        assertEquals(TreeMap.class, BasicDeserializerFactory._mapFallbacks.get(NavigableMap.class.getName()));
        assertEquals(ConcurrentSkipListMap.class, BasicDeserializerFactory._mapFallbacks.get(ConcurrentNavigableMap.class.getName()));
    }

    @Test
    public void testAbstractCollectionFallbacks() {
        assertEquals(ArrayList.class, BasicDeserializerFactory._collectionFallbacks.get(Collection.class.getName()));
        assertEquals(ArrayList.class, BasicDeserializerFactory._collectionFallbacks.get(List.class.getName()));
        assertEquals(HashSet.class, BasicDeserializerFactory._collectionFallbacks.get(Set.class.getName()));
        assertEquals(TreeSet.class, BasicDeserializerFactory._collectionFallbacks.get(SortedSet.class.getName()));
        assertEquals(LinkedList.class, BasicDeserializerFactory._collectionFallbacks.get(Queue.class.getName()));
        assertEquals(LinkedList.class, BasicDeserializerFactory._collectionFallbacks.get(Deque.class.getName()));
        assertEquals(TreeSet.class, BasicDeserializerFactory._collectionFallbacks.get(NavigableSet.class.getName()));
    }
}