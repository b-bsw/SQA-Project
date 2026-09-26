package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class PropertyBuilderTest {

    public static class SimpleBean {
        public int id;
        public String name = "foo";
    }

    public static class NoDefaultBean {
        public int x;
        public NoDefaultBean(int x) {
            this.x = x;
        }
    }

    public static class ThrowingBean {
        public String getValue() {
            throw new IllegalStateException("boom");
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class NonNullBean {
        public String name;
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class NonEmptyBean {
        public String name;
    }

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public static class NonDefaultBean {
        public String name = "foo";
    }

    private ObjectMapper mapper;
    private SerializationConfig config;
    private BeanDescription beanDesc;
    private TestablePropertyBuilder builder;

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        beanDesc = config.introspect(TypeFactory.defaultInstance().constructType(SimpleBean.class));
        builder = new TestablePropertyBuilder(config, beanDesc);
    }

    @After
    public void tearDown() {
        mapper = null;
        config = null;
        beanDesc = null;
        builder = null;
    }

    private BeanPropertyDefinition findProperty(BeanDescription desc, String name) {
        for (BeanPropertyDefinition prop : desc.findProperties()) {
            if (name.equals(prop.getName())) {
                return prop;
            }
        }
        throw new AssertionError("Property '" + name + "' not found");
    }

    private AnnotatedMember firstMember(BeanDescription desc) {
        List<BeanPropertyDefinition> props = desc.findProperties();
        assertFalse(props.isEmpty());
        AnnotatedMember member = props.get(0).getPrimaryMember();
        assertNotNull(member);
        return member;
    }

    private static class TestIntrospector extends JacksonAnnotationIntrospector {
        private final JavaType refinedType;
        private final JsonSerialize.Typing typing;

        TestIntrospector(JavaType refinedType, JsonSerialize.Typing typing) {
            this.refinedType = refinedType;
            this.typing = typing;
        }

        @Override
        public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType baseType) {
            return refinedType != null ? refinedType : baseType;
        }

        @Override
        public JsonSerialize.Typing findSerializationTyping(Annotated a) {
            return typing;
        }
    }

    private static class TestablePropertyBuilder extends PropertyBuilder {
        TestablePropertyBuilder(SerializationConfig config, BeanDescription beanDesc) {
            super(config, beanDesc);
        }

        public BeanPropertyWriter buildWriterForTest(SerializerProvider prov,
                BeanPropertyDefinition propDef, JavaType declaredType, JsonSerializer<?> ser,
                TypeSerializer typeSer, TypeSerializer contentTypeSer,
                AnnotatedMember am, boolean defaultUseStaticTyping) throws JsonMappingException {
            return buildWriter(prov, propDef, declaredType, ser, typeSer, contentTypeSer, am, defaultUseStaticTyping);
        }

        public JavaType findSerializationTypeForTest(Annotated a, boolean useStaticTyping, JavaType declaredType)
                throws JsonMappingException {
            return findSerializationType(a, useStaticTyping, declaredType);
        }

        public Object getDefaultBeanForTest() {
            return getDefaultBean();
        }

        public Object getDefaultValueForTest(JavaType type) {
            return getDefaultValue(type);
        }

        public Object getPropertyDefaultValueForTest(String name, AnnotatedMember member, JavaType type) {
            return getPropertyDefaultValue(name, member, type);
        }

        public Object throwWrappedForTest(Exception e, String propName, Object defaultBean) {
            return _throwWrapped(e, propName, defaultBean);
        }
    }

    @Test
    public void testGetClassAnnotations() {
        assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void testGetDefaultValue() {
        TypeFactory tf = TypeFactory.defaultInstance();
        assertEquals(Integer.valueOf(0), (Integer) builder.getDefaultValueForTest(tf.constructType(Integer.class)));
        assertEquals(Integer.valueOf(0), (Integer) builder.getDefaultValueForTest(tf.constructType(int.class)));
        assertEquals("", builder.getDefaultValueForTest(tf.constructType(String.class)));
        assertSame(JsonInclude.Include.NON_EMPTY, builder.getDefaultValueForTest(tf.constructType(List.class)));
        assertNull(builder.getDefaultValueForTest(tf.constructType(Object.class)));
    }

    @Test
    public void testGetDefaultBeanUsesAndCachesInstance() {
        Object defaultBean = builder.getDefaultBeanForTest();
        assertNotNull(defaultBean);
        assertTrue(defaultBean instanceof SimpleBean);
        assertSame(defaultBean, builder.getDefaultBeanForTest());
    }

    @Test
    public void testGetDefaultBeanReturnsNullWhenNoDefaultConstructor() throws Exception {
        SerializationConfig cfg = mapper.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(NoDefaultBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);

        assertNull(b.getDefaultBeanForTest());
        assertNull(b.getDefaultBeanForTest());
    }

    @Test
    public void testGetPropertyDefaultValue() {
        AnnotatedMember member = findProperty(beanDesc, "name").getPrimaryMember();
        Object value = builder.getPropertyDefaultValueForTest("name", member,
                TypeFactory.defaultInstance().constructType(String.class));
        assertEquals("foo", value);
    }

    @Test
    public void testGetPropertyDefaultValueWrapsRuntimeException() throws Exception {
        ObjectMapper m = new ObjectMapper();
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(ThrowingBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);
        AnnotatedMember member = findProperty(desc, "value").getPrimaryMember();

        try {
            b.getPropertyDefaultValueForTest("value", member,
                    TypeFactory.defaultInstance().constructType(String.class));
            fail("Should have thrown RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("boom", e.getMessage());
        }
    }

    @Test
    public void testThrowWrappedReurnsRuntimeExceptionCause() {
        try {
            builder.throwWrappedForTest(new RuntimeException(new IllegalStateException("root")), "p", new Object());
            fail("Should have thrown root RuntimeException");
        } catch (IllegalStateException e) {
            assertEquals("root", e.getMessage());
        }
    }

    @Test
    public void testThrowWrappedWrapsCheckedException() {
        try {
            builder.throwWrappedForTest(new Exception("checked"), "p", new Object());
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Failed to get property 'p'"));
        }
    }

    @Test
    public void testFindSerializationTypeReturnsNullWithoutStaticTyping() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.setAnnotationIntrospector(new TestIntrospector(null, JsonSerialize.Typing.DEFAULT_TYPING));
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(SimpleBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);

        JavaType declared = TypeFactory.defaultInstance().constructType(String.class);
        assertNull(b.findSerializationTypeForTest(firstMember(desc), false, declared));
    }

    @Test
    public void testFindSerializationTypeUsesStaticTyping() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.setAnnotationIntrospector(new TestIntrospector(null, JsonSerialize.Typing.STATIC));
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(SimpleBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);

        JavaType declared = TypeFactory.defaultInstance().constructType(String.class);
        JavaType result = b.findSerializationTypeForTest(firstMember(desc), false, declared);
        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationTypeAppliesRefinedType() throws Exception {
        ObjectMapper m = new ObjectMapper();
        JavaType refined = TypeFactory.defaultInstance().constructType(Number.class);
        m.setAnnotationIntrospector(new TestIntrospector(refined, JsonSerialize.Typing.STATIC));
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(SimpleBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);

        JavaType declared = TypeFactory.defaultInstance().constructType(Integer.class);
        JavaType result = b.findSerializationTypeForTest(firstMember(desc), false, declared);
        assertNotNull(result);
        assertEquals(Number.class, result.getRawClass());
    }

    @Test
    public void testFindSerializationTypeRejectsUnrelatedType() throws Exception {
        ObjectMapper m = new ObjectMapper();
        JavaType refined = TypeFactory.defaultInstance().constructType(Integer.class);
        m.setAnnotationIntrospector(new TestIntrospector(refined, JsonSerialize.Typing.STATIC));
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(SimpleBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);

        JavaType declared = TypeFactory.defaultInstance().constructType(String.class);
        try {
            b.findSerializationTypeForTest(firstMember(desc), false, declared);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Illegal concrete-type annotation"));
        }
    }

    @Test
    public void testBuildWriterNonNullInclusion() throws Exception {
        ObjectMapper m = new ObjectMapper();
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(NonNullBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);
        BeanPropertyDefinition prop = findProperty(desc, "name");
        AnnotatedMember member = prop.getPrimaryMember();

        BeanPropertyWriter bpw = b.buildWriterForTest(null, prop,
                TypeFactory.defaultInstance().constructType(String.class),
                null, null, null, member, false);

        assertNotNull(bpw);
        assertTrue(bpw.willSuppressNulls());
    }

    @Test
    public void testBuildWriterNonEmptyInclusion() throws Exception {
        ObjectMapper m = new ObjectMapper();
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(NonEmptyBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);
        BeanPropertyDefinition prop = findProperty(desc, "name");
        AnnotatedMember member = prop.getPrimaryMember();

        BeanPropertyWriter bpw = b.buildWriterForTest(null, prop,
                TypeFactory.defaultInstance().constructType(String.class),
                null, null, null, member, false);

        assertNotNull(bpw);
        assertTrue(bpw.willSuppressNulls());
    }

    @Test
    public void testBuildWriterNonDefaultInclusion() throws Exception {
        ObjectMapper m = new ObjectMapper();
        SerializationConfig cfg = m.getSerializationConfig();
        BeanDescription desc = cfg.introspect(TypeFactory.defaultInstance().constructType(NonDefaultBean.class));
        TestablePropertyBuilder b = new TestablePropertyBuilder(cfg, desc);
        BeanPropertyDefinition prop = findProperty(desc, "name");
        AnnotatedMember member = prop.getPrimaryMember();

        BeanPropertyWriter bpw = b.buildWriterForTest(null, prop,
                TypeFactory.defaultInstance().constructType(String.class),
                null, null, null, member, false);

        assertNotNull(bpw);
        assertFalse(bpw.willSuppressNulls());
    }
}