package com.fasterxml.jackson.databind.deser;

import org.junit.Test;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;

import static org.junit.Assert.*;

public class BeanDeserializerFactoryTest {

    // ---------------------------------------------------------------------
    // Test beans
    // ---------------------------------------------------------------------

    public static class Bean {
        public String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public abstract static class AbstractBean {
        public String name;
    }

    public static class Value {
        private String name;

        public static class Builder {
            private String name;

            public Builder withName(String name) {
                this.name = name;
                return this;
            }

            public Value build() {
                Value value = new Value();
                value.name = this.name;
                return value;
            }
        }
    }

    // ---------------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------------

    private final ObjectMapper mapper = new ObjectMapper();

    private BeanDeserializerFactory factory() {
        return new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    private DeserializationContext createContext() throws Exception {
        mapper.readValue("{}", Object.class);
        DeserializationContext context = mapper.getDeserializationContext();
        assertNotNull("DeserializationContext should not be null", context);
        return context;
    }

    private JavaType type(Class<?> clazz) {
        return mapper.constructType(clazz);
    }

    private BeanDescription describe(Class<?> clazz) {
        return mapper.getDeserializationConfig().introspect(type(clazz));
    }

    // ---------------------------------------------------------------------
    // Tests: simple factory behaviour
    // ---------------------------------------------------------------------

    @Test
    public void testInstanceIsAvailable() {
        assertNotNull(BeanDeserializerFactory.instance);
    }

    @Test
    public void testWithConfigSameConfigReturnsSameFactory() {
        BeanDeserializerFactory factory = factory();
        assertSame(factory, factory.withConfig(factory._factoryConfig));
    }

    @Test
    public void testWithConfigDifferentConfigReturnsNewFactory() {
        BeanDeserializerFactory factory = factory();
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();

        BeanDeserializerFactory result =
                (BeanDeserializerFactory) factory.withConfig(newConfig);

        assertNotSame(factory, result);
        assertSame(newConfig, result._factoryConfig);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigOnSubtypeIsRejected() {
        BeanDeserializerFactory subclass =
                new BeanDeserializerFactory(new DeserializerFactoryConfig()) { };

        subclass.withConfig(new DeserializerFactoryConfig());
    }

    @Test
    public void testIllegalClassNamesSetIsNotEmpty() {
        assertNotNull(factory()._cfgIllegalClassNames);
        assertFalse(factory()._cfgIllegalClassNames.isEmpty());
    }

    // ---------------------------------------------------------------------
    // Tests: createBeanDeserializer
    // ---------------------------------------------------------------------

    @Test
    public void testCreateDeserializerForConcreteBean() throws Exception {
        DeserializationContext context = createContext();
        JavaType javaType = type(Bean.class);
        BeanDescription description = describe(Bean.class);

        JsonDeserializer<Object> deserializer =
                factory().createBeanDeserializer(context, javaType, description);

        assertNotNull("Concrete bean should produce a deserializer", deserializer);
    }

    @Test
    public void testCreateDeserializerForString() throws Exception {
        DeserializationContext context = createContext();
        JavaType javaType = type(String.class);
        BeanDescription description = describe(String.class);

        JsonDeserializer<Object> deserializer =
                factory().createBeanDeserializer(context, javaType, description);

        assertNotNull("String should be deserialized by a standard deserializer", deserializer);
    }

    @Test
    public void testCreateDeserializerForAbstractClass() throws Exception {
        DeserializationContext context = createContext();
        JavaType javaType = type(AbstractBean.class);
        BeanDescription description = describe(AbstractBean.class);

        JsonDeserializer<Object> deserializer =
                factory().createBeanDeserializer(context, javaType, description);

        assertNotNull("Abstract bean should still receive a deserializer", deserializer);
    }

    @Test
    public void testCreateDeserializerForThrowable() throws Exception {
        DeserializationContext context = createContext();
        JavaType javaType = type(IllegalArgumentException.class);
        BeanDescription description = describe(IllegalArgumentException.class);

        JsonDeserializer<Object> deserializer =
                factory().createBeanDeserializer(context, javaType, description);

        assertNotNull("Throwable should produce a deserializer", deserializer);
    }

    // ---------------------------------------------------------------------
    // Tests: createBuilderBasedDeserializer
    // ---------------------------------------------------------------------

    @Test
    public void testCreateBuilderBasedDeserializer() throws Exception {
        DeserializationContext context = createContext();
        JavaType valueType = type(Value.class);
        BeanDescription description = describe(Value.class);

        JsonDeserializer<Object> deserializer = factory()
                .createBuilderBasedDeserializer(
                        context,
                        valueType,
                        description,
                        Value.Builder.class);

        assertNotNull("Builder-based deserializer should not be null", deserializer);
    }
}