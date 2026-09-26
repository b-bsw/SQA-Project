package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PropertyBuilderTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private static final class ExposedBeanBuilder extends PropertyBuilder {

        ExposedBeanBuilder(SerializationConfig config, BeanDescription beanDesc) {
            super(config, beanDesc);
        }

        @Override
        public BeanPropertyWriter buildWriter(SerializerProvider prov,
                                              BeanPropertyDefinition propDef,
                                              JavaType declaredType,
                                              JsonSerializer<?> ser,
                                              TypeSerializer typeSer,
                                              TypeSerializer contentTypeSer,
                                              AnnotatedMember am,
                                              boolean defaultUseStaticTyping)
                throws JsonMappingException {
            return super.buildWriter(prov, propDef, declaredType, ser,
                    typeSer, contentTypeSer, am, defaultUseStaticTyping);
        }

        @Override
        public JavaType findSerializationType(Annotated a, boolean useStaticTyping,
                                              JavaType declaredType)
                throws JsonMappingException {
            return super.findSerializationType(a, useStaticTyping, declaredType);
        }

        @Override
        public Object getPropertyDefaultValue(String name, AnnotatedMember member,
                                              JavaType type) {
            return super.getPropertyDefaultValue(name, member, type);
        }

        @Override
        public Object getDefaultValue(JavaType type) {
            return super.getDefaultValue(type);
        }
    }

    private ExposedBeanBuilder builderFor(Class<?> type) {
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType javaType = mapper.constructType(type);
        BeanDescription beanDesc = config.introspect(javaType);
        return new ExposedBeanBuilder(config, beanDesc);
    }

    private BeanPropertyDefinition property(BeanDescription beanDesc, String name) {
        for (BeanPropertyDefinition prop : beanDesc.findProperties()) {
            if (name.equals(prop.getName())) {
                return prop;
            }
        }
        throw new IllegalArgumentException("Property not found: " + name);
    }

    @Test
    public void exposesClassAnnotations() {
        ExposedBeanBuilder builder = builderFor(SimpleBean.class);
        assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void returnsDefaultValueForPrimitiveAndWrapper() {
        ExposedBeanBuilder builder = builderFor(SimpleBean.class);

        assertEquals(0, ((Number) builder.getDefaultValue(
                mapper.constructType(Integer.TYPE))).intValue());
        assertEquals(0, ((Number) builder.getDefaultValue(
                mapper.constructType(Integer.class))).intValue());
    }

    @Test
    public void returnsDefaultValueForStringAndNullForObject() {
        ExposedBeanBuilder builder = builderFor(SimpleBean.class);

        assertEquals("", builder.getDefaultValue(mapper.constructType(String.class)));
        assertNull(builder.getDefaultValue(mapper.constructType(Object.class)));
    }

    @Test
    public void returnsNonEmptyMarkerForContainerTypes() {
        ExposedBeanBuilder builder = builderFor(SimpleBean.class);

        assertEquals(
                JsonInclude.Include.NON_EMPTY,
                builder.getDefaultValue(mapper.constructType(List.class)));
    }

    @Test
    public void propertyDefaultValueUsesDefaultBeanInstance() {
        ExposedBeanBuilder builder = builderFor(DefaultBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig()
                .introspect(mapper.constructType(DefaultBean.class));
        BeanPropertyDefinition prop = property(beanDesc, "value");

        Object value = builder.getPropertyDefaultValue(
                prop.getName(), prop.getPrimaryMember(), prop.getPrimaryType());

        assertEquals("default", value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void propertyDefaultValueFailsWhenNoDefaultConstructor() {
        ExposedBeanBuilder builder = builderFor(NoDefaultConstructorBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig()
                .introspect(mapper.constructType(NoDefaultConstructorBean.class));
        BeanPropertyDefinition prop = property(beanDesc, "value");

        builder.getPropertyDefaultValue(
                prop.getName(), prop.getPrimaryMember(), prop.getPrimaryType());
    }

    @Test
    public void buildWriterHonoursNonNullInclusion() throws Exception {
        ExposedBeanBuilder builder = builderFor(NonNullBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig()
                .introspect(mapper.constructType(NonNullBean.class));
        BeanPropertyDefinition prop = property(beanDesc, "value");

        BeanPropertyWriter writer = builder.buildWriter(
                mapper.getSerializerProvider(),
                prop,
                prop.getPrimaryType(),
                null,
                null,
                null,
                prop.getPrimaryMember(),
                false);

        assertNotNull(writer);
        assertTrue(writer.willSuppressNulls());
    }

    @Test
    public void buildWriterWithNonDefaultClassDoesNotSuppressNulls() throws Exception {
        ExposedBeanBuilder builder = builderFor(NonDefaultClassBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig()
                .introspect(mapper.constructType(NonDefaultClassBean.class));
        BeanPropertyDefinition prop = property(beanDesc, "value");

        BeanPropertyWriter writer = builder.buildWriter(
                mapper.getSerializerProvider(),
                prop,
                prop.getPrimaryType(),
                null,
                null,
                null,
                prop.getPrimaryMember(),
                false);

        assertNotNull(writer);
        assertFalse(writer.willSuppressNulls());
    }

    @Test
    public void findSerializationTypeReturnsNullWithoutStaticTyping() throws Exception {
        ExposedBeanBuilder builder = builderFor(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig()
                .introspect(mapper.constructType(SimpleBean.class));
        BeanPropertyDefinition prop = property(beanDesc, "value");

        assertNull(builder.findSerializationType(
                prop.getPrimaryMember(), false, prop.getPrimaryType()));
    }

    public static class SimpleBean {
        public String value = "hello";
    }

    public static class DefaultBean {
        public String value = "default";
    }

    public static class NoDefaultConstructorBean {
        public NoDefaultConstructorBean(String value) {
        }

        public String value = "x";
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class NonNullBean {
        public String value;
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class NonDefaultClassBean {
        public String value = "x";
    }
}