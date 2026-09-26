package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.*;

public class PropertyBuilderTest {
    private SerializationConfig config;
    private BeanDescription beanDesc;
    private PropertyBuilder builder;

    @Before
    public void setUp() {
        config = new SerializationConfig(null, null) {
            public AnnotationIntrospector getAnnotationIntrospector() {
                return new AnnotationIntrospector() {
                    public JavaType refineSerializationType(MapperConfig<?> config, Annotated a, JavaType declaredType) {
                        return declaredType;
                    }
                    public JsonSerialize.Typing findSerializationTyping(Annotated a) {
                        return null;
                    }
                    public Object findNullSerializer(Annotated a) {
                        return null;
                    }
                    public NameTransformer findUnwrappingNameTransformer(Annotated a) {
                        return null;
                    }
                    public JsonInclude.Value findPropertyInclusion(Annotated a) {
                        return JsonInclude.Value.empty();
                    }
                    public Class<?>[] findViews(Annotated a) {
                        return null;
                    }
                };
            }
            public JsonInclude.Value getDefaultPropertyInclusion() {
                return JsonInclude.Value.empty();
            }
            public JsonInclude.Value getDefaultPropertyInclusion(Class<?> baseType, JsonInclude.Value defaultValue) {
                return defaultValue;
            }
            public JsonInclude.Value getDefaultInclusion(Class<?> rawPropertyType, Class<?> rawAccessorType, JsonInclude.Value defaultValue) {
                return defaultValue;
            }
            public boolean isEnabled(MapperFeature f) {
                return false;
            }
            public boolean isEnabled(SerializationFeature f) {
                return false;
            }
            public boolean canOverrideAccessModifiers() {
                return false;
            }
        };
        beanDesc = new BeanDescription(null) {
            public Annotations getClassAnnotations() {
                return new Annotations() {
                    public <A> A get(Class<A> cls) { return null; }
                    public int size() { return 0; }
                };
            }
            public JavaType getType() { return null; }
            public Class<?> getBeanClass() { return Object.class; }
            public Object instantiateBean(boolean fixAccess) { return null; }
            public Class<?>[] findDefaultViews() { return null; }
            public JsonInclude.Value findPropertyInclusion(JsonInclude.Value defValue) {
                return JsonInclude.Value.empty();
            }
        };
        builder = new PropertyBuilder(config, beanDesc);
    }

    @Test
    public void testGetClassAnnotations() {
        assertNotNull(builder.getClassAnnotations());
    }

    @Test
    public void testGetDefaultBeanWhenNull() {
        assertNull(builder.getDefaultBean());
    }

    @Test
    public void testGetDefaultBeanTwice() {
        assertNull(builder.getDefaultBean());
        assertNull(builder.getDefaultBean());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSerializationTypeIllegalArg() throws JsonMappingException {
        Annotated a = new Annotated() {
            public String getName() { return "test"; }
            public Class<?> getRawType() { return String.class; }
            public <A> A getAnnotation(Class<A> cls) { return null; }
            public Annotations getAnnotations() { return null; }
            public Annotated withAnnotations(Annotations annotations) { return null; }
            public Annotated withFallBackAnnotationsFrom(Annotated annotated) { return null; }
            public boolean hasAnnotation(Class<?> cls) { return false; }
            public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) { return false; }
            public <A> void addOrOverride(Annotation value) {}
            public <A> A getAnnotated() { return null; }
            public int getModifiers() { return 0; }
            public void fixAccess(boolean force) {}
        };
        JavaType declaredType = JavaType.construct(Object.class);
        builder.findSerializationType(a, false, declaredType);
    }

    @Test
    public void testFindSerializationTypeNull() throws JsonMappingException {
        Annotated a = new Annotated() {
            public String getName() { return "test"; }
            public Class<?> getRawType() { return String.class; }
            public <A> A getAnnotation(Class<A> cls) { return null; }
            public Annotations getAnnotations() { return null; }
            public Annotated withAnnotations(Annotations annotations) { return null; }
            public Annotated withFallBackAnnotationsFrom(Annotated annotated) { return null; }
            public boolean hasAnnotation(Class<?> cls) { return false; }
            public boolean hasOneOf(Class<? extends Annotation>[] annoClasses) { return false; }
            public <A> void addOrOverride(Annotation value) {}
            public <A> A getAnnotated() { return null; }
            public int getModifiers() { return 0; }
            public void fixAccess(boolean force) {}
        };
        JavaType declaredType = JavaType.construct(String.class);
        assertNull(builder.findSerializationType(a, false, declaredType));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowWrapped() {
        builder._throwWrapped(new RuntimeException("test"), "prop", new Object());
    }

    @Test
    public void testBuildWriterWithNullPropDef() throws JsonMappingException {
        SerializerProvider prov = new SerializerProvider() {
            public <T> T reportBadDefinition(JavaType type, String msg) {
                throw new RuntimeException(msg);
            }
        };
        BeanPropertyDefinition propDef = null;
        JavaType declaredType = JavaType.construct(String.class);
        JsonSerializer<?> ser = null;
        TypeSerializer typeSer = null;
        TypeSerializer contentTypeSer = null;
        AnnotatedMember am = null;
        try {
            builder.buildWriter(prov, propDef, declaredType, ser, typeSer, contentTypeSer, am, false);
            fail("Expected exception");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }
}