package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializerFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.introspect.BeanDescription;

public class BeanDeserializerFactoryTest {

    private DeserializationContext context(ObjectMapper mapper) {
        try {
            Field f = ObjectMapper.class.getDeclaredField("_deserializationContext");
            f.setAccessible(true);
            return (DeserializationContext) f.get(mapper);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private BeanDeserializerFactory newFactory() {
        return new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    private JsonDeserializer<Object> buildBean(BeanDeserializerFactory factory,
            DeserializationContext ctxt, DeserializationConfig config, Class<?> cls) throws Exception {
        JavaType type = config.constructType(cls);
        BeanDescription desc = config.introspect(type);
        return factory.createBeanDeserializer(ctxt, type, desc);
    }

    public static class SimpleBean {
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static class EmptyBean {
    }

    public static class MultiPropBean {
        private String a;
        private int b;
        private List<String> c;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public List<String> getC() {
            return c;
        }

        public void setC(List<String> c) {
            this.c = c;
        }
    }

    public static class ValueBean {
        private int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }

    public static class ValueBuilder {
        private int x;

        public ValueBuilder withX(int x) {
            this.x = x;
            return this;
        }

        public ValueBean build() {
            ValueBean bean = new ValueBean();
            bean.setX(x);
            return bean;
        }
    }

    @JsonPOJOBuilder(buildMethodName = "create")
    public static class AnnotatedValueBuilder {
        private int x;

        public AnnotatedValueBuilder withX(int x) {
            this.x = x;
            return this;
        }

        public ValueBean create() {
            ValueBean bean = new ValueBean();
            bean.setX(x);
            return bean;
        }
    }

    public abstract static class AbstractBean {
        public int x;
    }

    static class ExposedFactory extends BeanDeserializerFactory {
        ExposedFactory() {
            super(new DeserializerFactoryConfig());
        }

        boolean testIsPotentialBeanType(Class<?> type) {
            return isPotentialBeanType(type);
        }

        boolean testIsIgnorableType(DeserializationConfig config, BeanDescription beanDesc,
                Class<?> type, Map<Class<?>, Boolean> ignoredTypes) {
            return isIgnorableType(config, beanDesc, type, ignoredTypes);
        }
    }

    static class SubFactory extends BeanDeserializerFactory {
        final DeserializerFactoryConfig cfg;

        SubFactory(DeserializerFactoryConfig cfg) {
            super(cfg);
            this.cfg = cfg;
        }
    }

    @Test
    public void testWithConfigReturnsSameInstanceForSameConfig() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg);

        assertSame(factory, factory.withConfig(cfg));
    }

    @Test
    public void testWithConfigCreatesNewFactoryForDifferentConfig() {
        BeanDeserializerFactory factory = newFactory();

        DeserializerFactory result = factory.withConfig(new DeserializerFactoryConfig());

        assertNotSame(factory, result);
        assertTrue(result instanceof BeanDeserializerFactory);
    }

    @Test
    public void testWithConfigRejectsSubclass() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        SubFactory factory = new SubFactory(cfg);

        assertSame(factory, factory.withConfig(cfg));

        try {
            factory.withConfig(new DeserializerFactoryConfig());
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Subtype"));
        }
    }

    @Test
    public void testCreateBeanDeserializerForConcreteShapes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = context(mapper);
        BeanDeserializerFactory factory = newFactory();

        assertNotNull(buildBean(factory, ctxt, config, EmptyBean.class));

        JsonDeserializer<Object> simple = buildBean(factory, ctxt, config, SimpleBean.class);
        assertTrue(simple instanceof BeanDeserializer);

        assertNotNull(buildBean(factory, ctxt, config, MultiPropBean.class));
    }

    @Test
    public void testCreateBeanDeserializerForAbstractType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = context(mapper);

        JavaType type = config.constructType(AbstractBean.class);
        BeanDescription desc = config.introspect(type);

        assertNotNull(newFactory().createBeanDeserializer(ctxt, type, desc));
    }

    @Test
    public void testCreateBeanDeserializerRejectsLocalClass() throws Exception {
        class LocalDummy {
        }

        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = context(mapper);

        JavaType type = config.constructType(LocalDummy.class);
        BeanDescription desc = config.introspect(type);

        try {
            newFactory().createBeanDeserializer(ctxt, type, desc);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Bean"));
        }
    }

    @Test
    public void testBuildThrowableDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = context(mapper);

        JavaType type = config.constructType(RuntimeException.class);
        BeanDescription desc = config.introspect(type);

        JsonDeserializer<Object> deserializer =
                newFactory().buildThrowableDeserializer(ctxt, type, desc);

        assertTrue(deserializer instanceof ThrowableDeserializer);
    }

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = context(mapper);
        BeanDeserializerFactory factory = newFactory();

        JavaType valueType = config.constructType(ValueBean.class);
        BeanDescription valueDesc = config.introspect(valueType);

        assertNotNull(factory.createBuilderBasedDeserializer(
                ctxt, valueType, valueDesc, ValueBuilder.class));

        assertNotNull(factory.createBuilderBasedDeserializer(
                ctxt, valueType, valueDesc, AnnotatedValueBuilder.class));
    }

    @Test
    public void testIsPotentialBeanTypeRejectsPrimitive() {
        try {
            new ExposedFactory().testIsPotentialBeanType(int.class);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Bean"));
        }
    }

    @Test
    public void testIsIgnorableTypeUsesCacheAndAnnotationIntrospector() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = config.constructType(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(type);
        ExposedFactory factory = new ExposedFactory();

        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        cache.put(SimpleBean.class, Boolean.TRUE);
        assertTrue(factory.testIsIgnorableType(config, beanDesc, SimpleBean.class, cache));

        assertFalse(factory.testIsIgnorableType(config, beanDesc, SimpleBean.class,
                new HashMap<Class<?>, Boolean>()));
    }
}