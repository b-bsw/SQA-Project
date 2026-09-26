package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;

public class BeanDeserializerFactoryTest {

    @Test
    public void testStaticInstanceNotNull() {
        assertNotNull(BeanDeserializerFactory.instance);
        assertTrue(BeanDeserializerFactory.instance instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigSameInstance() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        assertSame(factory, factory.withConfig(config));
    }

    @Test
    public void testWithConfigDifferentInstance() {
        DeserializerFactoryConfig config1 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig config2 = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config1);
        BeanDeserializerFactory result = (BeanDeserializerFactory) factory.withConfig(config2);
        assertNotSame(factory, result);
        assertEquals(config2, result.getFactoryConfig());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypeInvalidArrayClass() {
        BeanDeserializerFactory.instance.isPotentialBeanType(int[].class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanTypeInvalidLocalClass() {
        class LocalClass {}
        BeanDeserializerFactory.instance.isPotentialBeanType(LocalClass.class);
    }

    @Test
    public void testIsPotentialBeanTypeValid() {
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(String.class));
        assertTrue(BeanDeserializerFactory.instance.isPotentialBeanType(Integer.class));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateBeanDeserializerNullContext() throws JsonMappingException {
        BeanDeserializerFactory.instance.createBeanDeserializer(null, null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateBuilderBasedDeserializerNullContext() throws JsonMappingException {
        BeanDeserializerFactory.instance.createBuilderBasedDeserializer(null, null, null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testBuildThrowableDeserializerNullContext() throws JsonMappingException {
        BeanDeserializerFactory.instance.buildThrowableDeserializer(null, null, null);
    }

    @Test
    public void testIsIgnorableTypeStringPrimitive() {
        assertFalse(BeanDeserializerFactory.instance.isIgnorableType(null, null,
                String.class, new java.util.HashMap<>()));
    }

    @Test
    public void testFactoryConfigDefault() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(config);
        DeserializerFactoryConfig got = factory.getFactoryConfig();
        assertNotNull(got);
        assertEquals(config, got);
    }
}