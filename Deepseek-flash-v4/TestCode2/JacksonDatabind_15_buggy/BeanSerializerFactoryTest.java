package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdInfo;
import com.fasterxml.jackson.annotation.PropertyName;
import java.util.*;

public class BeanSerializerFactoryTest {

    private BeanSerializerFactory factory;

    @Before
    public void setUp() {
        factory = new BeanSerializerFactory(new SerializerFactoryConfig());
    }

    @Test
    public void testWithConfigSameConfig() {
        SerializerFactoryConfig config = factory._factoryConfig;
        assertSame(factory, factory.withConfig(config));
    }

    @Test
    public void testWithConfigDifferentConfig() {
        SerializerFactoryConfig newConfig = new SerializerFactoryConfig();
        BeanSerializerFactory newFactory = factory.withConfig(newConfig);
        assertNotNull(newFactory);
        assertNotSame(factory, newFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigSubclassNotOverride() {
        BeanSerializerFactory sub = new BeanSerializerFactory(new SerializerFactoryConfig()) {
            // not overriding withConfig
        };
        sub.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testIsPotentialBeanTypeTrue() {
        assertTrue(factory.isPotentialBeanType(Foo.class));
    }

    @Test
    public void testIsPotentialBeanTypeFalse() {
        assertFalse(factory.isPotentialBeanType(int.class));
    }

    @Test
    public void testCustomSerializers() {
        Iterable<Serializers> serializers = factory.customSerializers();
        assertNotNull(serializers);
        assertFalse(serializers.iterator().hasNext());
    }

    @Test
    public void testConstructBeanSerializerBuilder() {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = new MinimalBeanDescription(type, null, null, null, null);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        assertNotNull(builder);
        assertSame(beanDesc, builder.getBeanDescription());
    }

    @Test
    public void testConstructFilteredBeanWriter() {
        BeanPropertyWriter writer = new DummyBeanPropertyWriter("test");
        Class<?>[] views = new Class<?>[] { Object.class };
        BeanPropertyWriter filtered = factory.constructFilteredBeanWriter(writer, views);
        assertNotNull(filtered);
        assertTrue(filtered instanceof FilteredBeanPropertyWriter);
    }

    @Test
    public void testConstructObjectIdHandlerNullObjectIdInfo() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = new MinimalBeanDescription(type, null, null, null, null);
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();
        ObjectIdWriter writer = factory.constructObjectIdHandler(null, beanDesc, props);
        assertNull(writer);
    }

    @Test
    public void testConstructObjectIdHandlerPropertyGeneratorFound() throws Exception {
        PropertyName propName = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(propName, ObjectIdGenerators.PropertyGenerator.class, null, false);
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = new MinimalBeanDescription(type, info, null, null, null);
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();
        BeanPropertyWriter bpw = new DummyBeanPropertyWriter("id");
        props.add(bpw);
        ObjectIdWriter writer = factory.constructObjectIdHandler(null, beanDesc, props);
        assertNotNull(writer);
        assertSame(bpw, props.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructObjectIdHandlerPropertyGeneratorNotFound() throws Exception {
        PropertyName propName = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(propName, ObjectIdGenerators.PropertyGenerator.class, null, false);
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = new MinimalBeanDescription(type, info, null, null, null);
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();
        props.add(new DummyBeanPropertyWriter("other"));
        factory.constructObjectIdHandler(null, beanDesc, props);
    }

    public static class Foo {
    }

    private static class MinimalBeanDescription extends BeanDescription {
        private final ObjectIdInfo objectIdInfo;
        private final AnnotatedClass classInfo;
        private final List<BeanPropertyDefinition> properties;
        private final AnnotatedMember anyGetter;

        public MinimalBeanDescription(JavaType type, ObjectIdInfo objectIdInfo, AnnotatedClass classInfo,
                List<BeanPropertyDefinition> properties, AnnotatedMember anyGetter) {
            super(type);
            this.objectIdInfo = objectIdInfo;
            this.classInfo = classInfo;
            this.properties = properties;
            this.anyGetter = anyGetter;
        }

        @Override
        public AnnotatedClass getClassInfo() { return classInfo; }

        @Override
        public List<BeanPropertyDefinition> findProperties() { return properties; }

        @Override
        public AnnotatedMember findAnyGetter() { return anyGetter; }

        @Override
        public ObjectIdInfo getObjectIdInfo() { return objectIdInfo; }

        @Override
        public boolean hasKnownClassAnnotations() { return false; }

        @Override
        public TypeBindings bindingsForBeanType() { return TypeBindings.emptyBindings(); }

        @Override
        public Class<?> getBeanClass() { return getType().getRawClass(); }

        @Override
        public JavaType getType() { return super.getType(); }
    }

    private static class DummyBeanPropertyWriter extends BeanPropertyWriter {
        private final String name;

        public DummyBeanPropertyWriter(String name) {
            super(PropertyName.construct(name), null, null, null, null, null, null, null, null, null, null);
            this.name = name;
        }

        @Override
        public String getName() { return name; }

        @Override
        public JavaType getType() {
            return TypeFactory.defaultInstance().constructType(String.class);
        }
    }
}