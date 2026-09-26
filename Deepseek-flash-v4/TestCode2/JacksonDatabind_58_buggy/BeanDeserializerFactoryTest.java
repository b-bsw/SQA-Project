package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Test;

public class BeanDeserializerFactoryTest {

    private static class SubBeanDeserializerFactory extends BeanDeserializerFactory {
        SubBeanDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    @Test
    public void testWithConfigSameConfigReturnsSameInstance() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);

        assertSame(factory, factory.withConfig(config));
    }

    @Test
    public void testWithConfigDifferentConfigReturnsNewInstance() {
        DeserializerFactoryConfig config1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig config2 = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config1);

        DeserializerFactory result = factory.withConfig(config2);

        assertNotNull(result);
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigSameConfigOnSubtypeReturnsThis() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        SubBeanDeserializerFactory factory = new SubBeanDeserializerFactory(config);

        assertSame(factory, factory.withConfig(config));
    }

    @Test
    public void testWithConfigDifferentConfigOnSubtypeFails() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        SubBeanDeserializerFactory factory = new SubBeanDeserializerFactory(config);

        try {
            factory.withConfig(new DeserializerFactoryConfig());
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Subtype"));
        }
    }

    @Test
    public void testMaterializeAbstractTypeWithoutResolversReturnsNull() {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());

        assertNull(factory.materializeAbstractType(null, null, null));
    }
}