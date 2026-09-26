package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.*;

public class BeanSerializerFactoryTest {

    private BeanSerializerFactory factory;

    @Before
    public void setUp() {
        factory = BeanSerializerFactory.instance;
    }

    // --- withConfig ---
    @Test
    public void testWithConfigSameConfigReturnsThis() {
        // BeanSerializerFactory.instance has _factoryConfig = null (from constructor BeanSerializerFactory(null))
        SerializerFactoryConfig cfg = null; // same as existing
        Assert.assertSame(factory, factory.withConfig(cfg));
    }

    @Test
    public void testWithConfigDifferentConfigReturnsNewInstance() {
        SerializerFactoryConfig cfg = new SerializerFactoryConfig();
        BeanSerializerFactory result = (BeanSerializerFactory) factory.withConfig(cfg);
        Assert.assertNotNull(result);
        Assert.assertNotSame(factory, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigSubtypeNotOverridden() {
        // Create a subtype that does not override withConfig
        BeanSerializerFactory sub = new BeanSerializerFactory(null) {
            private static final long serialVersionUID = 1L;
            // no withConfig override
        };
        SerializerFactoryConfig cfg = new SerializerFactoryConfig();
        // trigger IllegalStateException because getClass() != BeanSerializerFactory.class
        sub.withConfig(cfg);
    }

    // --- createSerializer (simple branch: annotation ser found) ---
    @Test
    public void testCreateSerializerAnnotationSerFound() throws Exception {
        // Use a custom factory that avoids heavy mocking for _createSerializer2
        // We'll test only the first branch where findSerializerFromAnnotation returns non-null
        // For that we need a mock SerializerProvider and JavaType.
        // We'll create a minimal stub.
        MockSerializerProvider prov = new MockSerializerProvider();
        MockJavaType type = new MockJavaType(String.class);
        // By default findSerializerFromAnnotation in MockSerializerProvider returns a dummy serializer
        // The method in BeanSerializerFactory uses prov.findSerializerFromAnnotation
        // We'll set a dummy serializer in the provider
        JsonSerializer<Object> dummy = new JsonSerializer<Object>() {};
        prov.annotationSerializer = dummy;
        JsonSerializer<Object> result = factory.createSerializer(prov, type);
        Assert.assertNotNull(result);
        // The result should be the dummy serializer (casted)
        Assert.assertSame(dummy, result);
    }

    // --- findBeanSerializer ---
    @Test
    public void testFindBeanSerializerNonPotentialNonEnumReturnsNull() throws Exception {
        // Create a type that is not a potential bean and not enum
        // We'll use a mock JavaType that returns a class that cannotBeABeanType or is proxy
        // Since isPotentialBeanType uses ClassUtil, we rely on actual logic.
        // We'll create a type for an array (e.g., int[])
        MockSerializerProvider prov = new MockSerializerProvider();
        MockJavaType type = new MockJavaType(int[].class);
        // But isPotentialBeanType: int[] -> ClassUtil.canBeABeanType returns NON_STATIC_INNER_CLASS? Actually arrays are not beans.
        BeanDescription beanDesc = new MockBeanDescription(type.rawClass);
        JsonSerializer<Object> ser = factory.findBeanSerializer(prov, type, beanDesc);
        Assert.assertNull(ser);
    }

    // --- isPotentialBeanType ---
    @Test
    public void testIsPotentialBeanTypeTrueForRegularClass() {
        // Use a plain class like String
        Assert.assertTrue(factory.isPotentialBeanType(String.class));
    }

    @Test
    public void testIsPotentialBeanTypeFalseForPrimitive() {
        // int is not a bean type
        Assert.assertFalse(factory.isPotentialBeanType(int.class));
    }

    // --- constructObjectIdHandler ---
    @Test
    public void testConstructObjectIdHandlerNullObjectIdInfo() throws Exception {
        // When objectIdInfo is null, return null
        MockSerializerProvider prov = new MockSerializerProvider();
        MockBeanDescription beanDesc = new MockBeanDescription(String.class);
        beanDesc.objectIdInfo = null;
        List<BeanPropertyWriter> props = new ArrayList<>();
        ObjectIdWriter writer = factory.constructObjectIdHandler(prov, beanDesc, props);
        Assert.assertNull(writer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructObjectIdHandlerPropertyNotFound() throws Exception {
        // When generator type is PropertyGenerator but no matching property name
        MockSerializerProvider prov = new MockSerializerProvider();
        MockBeanDescription beanDesc = new MockBeanDescription(String.class);
        // Provide ObjectIdInfo with generator type PropertyGenerator and a property name that doesn't exist
        beanDesc.objectIdInfo = new ObjectIdInfo(
            PropertyName.construct("missingProp"),
            null,
            ObjectIdGenerators.PropertyGenerator.class,
            false
        );
        List<BeanPropertyWriter> props = new ArrayList<>();
        // No property with name "missingProp"
        factory.constructObjectIdHandler(prov, beanDesc, props);
    }

    // --- filterBeanProperties ---
    @Test
    public void testFilterBeanPropertiesNoIgnored() {
        // When no properties to ignore, the list should remain unchanged
        SerializationConfig config = new MockSerializationConfig();
        BeanDescription beanDesc = new MockBeanDescription(String.class);
        List<BeanPropertyWriter> props = new ArrayList<>();
        BeanPropertyWriter bpw = new BeanPropertyWriter();
        props.add(bpw);
        List<BeanPropertyWriter> result = factory.filterBeanProperties(config, beanDesc, props);
        Assert.assertEquals(1, result.size());
        Assert.assertSame(bpw, result.get(0));
    }

    @Test
    public void testFilterBeanPropertiesWithIgnored() {
        // Simulate an annotation introspector that returns an array with property name "ignoredProp"
        MockSerializationConfig config = new MockSerializationConfig();
        config.ignoredProperties = new String[]{"ignoredProp"};
        BeanDescription beanDesc = new MockBeanDescription(String.class);
        List<BeanPropertyWriter> props = new ArrayList<>();
        BeanPropertyWriter bpw1 = new BeanPropertyWriter();
        bpw1.setName("keepProp");
        BeanPropertyWriter bpw2 = new BeanPropertyWriter();
        bpw2.setName("ignoredProp");
        props.add(bpw1);
        props.add(bpw2);
        List<BeanPropertyWriter> result = factory.filterBeanProperties(config, beanDesc, props);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("keepProp", result.get(0).getName());
    }

    // Helper stub classes
    static class MockSerializerProvider extends SerializerProvider {
        JsonSerializer<Object> annotationSerializer = null;
        MockSerializerProvider() {
            super(null, null, null);
        }
        @Override
        public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty prop) { return null; }
        @Override
        public JsonSerializer<Object> findValueSerializer(Class<?> type, BeanProperty prop) { return null; }
        @Override
        public JsonSerializer<Object> findTypedValueSerializer(JavaType type, boolean cache, BeanProperty prop) { return null; }
        @Override
        public JsonSerializer<Object> findTypedValueSerializer(Class<?> type, boolean cache, BeanProperty prop) { return null; }
        @Override
        public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty prop) { return null; }
        @Override
        public JsonSerializer<Object> findKeySerializer(Class<?> keyType, BeanProperty prop) { return null; }
        @Override
        public JsonSerializer<Object> findPrimarySerializer(JavaType type, BeanProperty prop) { return null; }
        @Override
        public ObjectIdGenerator<?> objectIdGeneratorInstance(AnnotatedClass annotated, ObjectIdInfo info) { return null; }
        @Override
        public SerializationConfig getConfig() {
            return new MockSerializationConfig();
        }
        @Override
        public JavaType constructType(Class<?> cls) {
            return new MockJavaType(cls);
        }
        @Override
        public TypeFactory getTypeFactory() {
            return TypeFactory.defaultInstance();
        }
        @Override
        public JsonSerializer<Object> handlePrimaryContextualization(JsonSerializer<?> ser, BeanProperty prop) {
            return (JsonSerializer<Object>) ser;
        }
        @Override
        public JsonSerializer<Object> getUnknownTypeSerializer(Class<?> unknownType) {
            return new JsonSerializer<Object>() {};
        }
        @Override
        public boolean canOverrideAccessModifiers() {
            return false;
        }
        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return new MockAnnotationIntrospector();
        }
    }

    static class MockJavaType extends JavaType {
        protected final Class<?> rawClass;
        MockJavaType(Class<?> raw) {
            super(raw, 0, null, null);
            this.rawClass = raw;
        }
        @Override
        public JavaType withTypeHandler(Object h) { return this; }
        @Override
        public JavaType withContentTypeHandler(Object h) { return this; }
        @Override
        public JavaType withValueHandler(Object h) { return this; }
        @Override
        public JavaType withContentValueHandler(Object h) { return this; }
        @Override
        public JavaType withStaticTyping() { return this; }
        @Override
        public JavaType narrowBy(Class<?> subclass) { return this; }
        @Override
        public JavaType forcedNarrowBy(Class<?> subclass) { return this; }
        @Override
        public JavaType widenBy(Class<?> superclass) { return this; }
        @Override
        public boolean isAbstract() { return false; }
        @Override
        public boolean isThrowable() { return false; }
        @Override
        public boolean isArrayType() { return rawClass.isArray(); }
        @Override
        public boolean isEnumType() { return rawClass.isEnum(); }
        @Override
        public boolean isInterface() { return rawClass.isInterface(); }
        @Override
        public boolean isPrimitive() { return rawClass.isPrimitive(); }
        @Override
        public boolean isFinal() { return false; }
        @Override
        public boolean isContainerType() { return false; }
        @Override
        public boolean isCollectionLikeType() { return false; }
        @Override
        public boolean isMapLikeType() { return false; }
        @Override
        public JavaType getContentType() { return null; }
        @Override
        public int containedTypeCount() { return 0; }
        @Override
        public JavaType containedType(int index) { return null; }
        @Override
        public String containedTypeName(int index) { return null; }
        @Override
        public Class<?> getParameterSource() { return null; }
        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
        @Override
        public String toString() { return rawClass.getName(); }
        @Override
        public boolean equals(Object o) { return false; }
        @Override
        public int hashCode() { return 0; }
        @Override
        public JavaType withBindings(TypeBindings bindings) { return this; }
        @Override
        protected JavaType _narrow(Class<?> subclass) { return this; }
    }

    static class MockBeanDescription extends BeanDescription {
        ObjectIdInfo objectIdInfo = null;
        AnnotatedMember anyGetter = null;
        List<BeanPropertyDefinition> properties = new ArrayList<>();
        MockBeanDescription(Class<?> beanClass) {
            super(beanClass, null, null);
        }
        @Override
        public AnnotatedClass getClassInfo() {
            return new MockAnnotatedClass(getBeanClass());
        }
        @Override
        public ObjectIdInfo getObjectIdInfo() {
            return objectIdInfo;
        }
        @Override
        public AnnotatedMember findAnyGetter() {
            return anyGetter;
        }
        @Override
        public List<BeanPropertyDefinition> findProperties() {
            return properties;
        }
        // Other overrides needed minimal
        @Override
        public Converter<Object, Object> findSerializationConverter() { return null; }
        @Override
        public boolean hasKnownClassAnnotations() { return false; }
        @Override
        public TypeBindings bindingsForBeanType() { return TypeBindings.emptyBindings(); }
        @Override
        public Class<?> getBeanClass() { return super.getBeanClass(); }
    }

    static class MockAnnotatedClass extends AnnotatedClass {
        private final Class<?> rawClass;
        MockAnnotatedClass(Class<?> raw) {
            super(null, null, null, null, null);
            this.rawClass = raw;
        }
        @Override
        public Class<?> getAnnotated() { return rawClass; }
        @Override
        public int getModifiers() { return 0; }
        @Override
        public String getName() { return rawClass.getName(); }
        @Override
        public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override
        public boolean hasAnnotation(Class<?> acls) { return false; }
        @Override
        public boolean hasOneOf(Class<? extends java.lang.annotation.Annotation>[] annoClasses) { return false; }
        @Override
        public Iterable<java.lang.annotation.Annotation> annotations() { return Collections.emptyList(); }
        @Override
        public JavaType getType() { return new MockJavaType(rawClass); }
    }

    static class MockSerializationConfig extends SerializationConfig {
        String[] ignoredProperties = null;
        MockSerializationConfig() {
            super(null, null);
        }
        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return new MockAnnotationIntrospector(ignoredProperties);
        }
        @Override
        public boolean isEnabled(MapperFeature f) {
            if (f == MapperFeature.DEFAULT_VIEW_INCLUSION) return false;
            if (f == MapperFeature.REQUIRE_SETTERS_FOR_GETTERS) return false;
            if (f == MapperFeature.USE_STATIC_TYPING) return false;
            return false;
        }
        @Override
        public BeanDescription introspect(JavaType type) {
            return new MockBeanDescription(type.getRawClass());
        }
        @Override
        public BeanDescription introspectClassAnnotations(Class<?> cls) {
            return new MockBeanDescription(cls);
        }
        @Override
        public SubtypeResolver getSubtypeResolver() { return null; }
        @Override
        public boolean canOverrideAccessModifiers() { return false; }
    }

    static class MockAnnotationIntrospector extends AnnotationIntrospector {
        private final String[] ignoredProperties;
        MockAnnotationIntrospector() {
            this.ignoredProperties = null;
        }
        MockAnnotationIntrospector(String[] ignored) {
            this.ignoredProperties = ignored;
        }
        @Override
        public String[] findPropertiesToIgnore(AnnotatedClass ac) {
            return ignoredProperties;
        }
        @Override
        public Boolean isIgnorableType(AnnotatedClass ac) { return false; }
        @Override
        public TypeResolverBuilder<?> findPropertyTypeResolver(SerializationConfig config, AnnotatedMember accessor, JavaType baseType) { return null; }
        @Override
        public TypeResolverBuilder<?> findPropertyContentTypeResolver(SerializationConfig config, AnnotatedMember accessor, JavaType containerType) { return null; }
        // Other abstract methods minimal
        @Override
        public boolean hasIgnoreMarker(AnnotatedMember m) { return false; }
    }

    static class MockBeanPropertyWriter extends BeanPropertyWriter {
        private String name;
        void setName(String n) { this.name = n; }
        @Override
        public String getName() { return name; }
        @Override
        public JavaType getType() { return new MockJavaType(Object.class); }
        @Override
        public Class<?>[] getViews() { return null; }
    }

    static class BeanPropertyWriter extends com.fasterxml.jackson.databind.ser.BeanPropertyWriter {
        // need to extend the actual one to avoid abstract issues
        // We'll just create a minimal stub (not extending properly because BeanPropertyWriter is not abstract)
        // Actually BeanPropertyWriter is a concrete class; we can instantiate it directly.
        // But for simplicity we'll use it as is in filterBeanProperties test.
        // The test uses bpw.setName which is not a method; we'll just use the real BeanPropertyWriter instance.
        // However we can't instantiate without proper constructor. We'll use the actual class with mock data.
        // Use a dummy constructor.
        public BeanPropertyWriter() {
            super();
        }
        @Override
        public String getName() { return name; }
        private String name;
        public void setName(String n) { this.name = n; }
        @Override
        public JavaType getType() { return new MockJavaType(Object.class); }
    }
}