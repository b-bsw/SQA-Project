package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.*;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
    }

    // ---- findEnumValue ----
    // Normal case with @JsonProperty annotation
    @Test
    public void testFindEnumValueWithJsonProperty() {
        assertEquals("customValue", introspector.findEnumValue(TestEnum.WITH_ANNOTATION));
    }

    // No annotation, should return enum name
    @Test
    public void testFindEnumValueNoAnnotation() {
        assertEquals("NO_ANNOTATION", introspector.findEnumValue(TestEnum.NO_ANNOTATION));
    }

    // @JsonProperty with empty value
    @Test
    public void testFindEnumValueEmptyPropertyValue() {
        assertEquals("EMPTY_VALUE", introspector.findEnumValue(TestEnum.EMPTY_VALUE));
    }

    // Null input? Enum<?> is not nullable in practice but we can still test
    @Test(expected = NullPointerException.class)
    public void testFindEnumValueNull() {
        introspector.findEnumValue(null);
    }

    // ---- findRootName ----
    @Test
    public void testFindRootNameWithAnnotation() throws Exception {
        // Use a class annotated with @JsonRootName
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), JsonRootNameClass.class, null);
        PropertyName pn = introspector.findRootName(ac);
        assertNotNull(pn);
        assertEquals("rootName", pn.getSimpleName());
        assertNull(pn.getNamespace());
    }

    @Test
    public void testFindRootNameNoAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NoAnnotationClass.class, null);
        assertNull(introspector.findRootName(ac));
    }

    // ---- findPropertiesToIgnore (deprecated) ----
    @Test
    public void testFindPropertiesToIgnoreDeprecated() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), IgnorePropsClass.class, null);
        String[] props = introspector.findPropertiesToIgnore(ac);
        assertNotNull(props);
        assertEquals(2, props.length);
        assertEquals("prop1", props[0]);
        assertEquals("prop2", props[1]);
    }

    @Test
    public void testFindPropertiesToIgnoreDeprecatedNoAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NoAnnotationClass.class, null);
        assertNull(introspector.findPropertiesToIgnore(ac));
    }

    // ---- findPropertiesToIgnore with forSerialization ----
    @Test
    public void testFindPropertiesToIgnoreForSerializationAllowGetters() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), IgnorePropsAllowGetters.class, null);
        assertNull(introspector.findPropertiesToIgnore(ac, true));
    }

    @Test
    public void testFindPropertiesToIgnoreForDeserializationAllowSetters() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), IgnorePropsAllowSetters.class, null);
        assertNull(introspector.findPropertiesToIgnore(ac, false));
    }

    @Test
    public void testFindPropertiesToIgnoreBothFalse() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), IgnorePropsClass.class, null);
        String[] props = introspector.findPropertiesToIgnore(ac, false);
        assertNotNull(props);
        assertEquals(2, props.length);
    }

    // ---- isIgnorableType ----
    @Test
    public void testIsIgnorableTypeTrue() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), IgnoredType.class, null);
        assertEquals(Boolean.TRUE, introspector.isIgnorableType(ac));
    }

    @Test
    public void testIsIgnorableTypeFalse() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NotIgnoredType.class, null);
        assertEquals(Boolean.FALSE, introspector.isIgnorableType(ac));
    }

    @Test
    public void testIsIgnorableTypeNoAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NoAnnotationClass.class, null);
        assertNull(introspector.isIgnorableType(ac));
    }

    // ---- findFilterId ----
    @Test
    public void testFindFilterIdWithNonEmptyId() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), FilteredType.class, null);
        Object id = introspector.findFilterId(ac);
        assertEquals("myFilter", id);
    }

    @Test
    public void testFindFilterIdEmptyId() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), EmptyFilterId.class, null);
        assertNull(introspector.findFilterId(ac));
    }

    @Test
    public void testFindFilterIdNoAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NoAnnotationClass.class, null);
        assertNull(introspector.findFilterId(ac));
    }

    // ---- findNamingStrategy ----
    @Test
    public void testFindNamingStrategyWithAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NamingStrategyClass.class, null);
        Object strategy = introspector.findNamingStrategy(ac);
        assertNotNull(strategy);
        assertEquals(UpperCaseStrategy.class, strategy);
    }

    @Test
    public void testFindNamingStrategyNoAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NoAnnotationClass.class, null);
        assertNull(introspector.findNamingStrategy(ac));
    }

    // ---- findSubtypes ----
    @Test
    public void testFindSubtypesWithAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), SubTypeClass.class, null);
        List<NamedType> subtypes = introspector.findSubtypes(ac);
        assertNotNull(subtypes);
        assertEquals(2, subtypes.size());
        assertEquals("first", subtypes.get(0).getName());
        assertEquals("second", subtypes.get(1).getName());
    }

    @Test
    public void testFindSubtypesNoAnnotation() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                ObjectMapperProvider.mapper(), NoAnnotationClass.class, null);
        assertNull(introspector.findSubtypes(ac));
    }

    // ---- findSerializer for RawSerializer ----
    @Test
    public void testFindSerializerRawValue() throws Exception {
        // Create an AnnotatedMember that has @JsonRawValue(true)
        // We'll use a simple holder method
        Annotated a = new AnnotatedMethodStub("@JsonRawValue true");
        Object ser = introspector.findSerializer(a);
        assertNotNull(ser);
        assertTrue(ser instanceof RawSerializer);
    }

    @Test
    public void testFindSerializerNoAnnotation() {
        Annotated a = new AnnotatedMethodStub("");
        assertNull(introspector.findSerializer(a));
    }

    // ---- findSerializationInclusion: fallback to defValue ----
    @Test
    public void testFindSerializationInclusionNoAnnotation() {
        Annotated a = new AnnotatedMethodStub("");
        assertEquals(JsonInclude.Include.ALWAYS,
                introspector.findSerializationInclusion(a, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testFindSerializationInclusionFromJsonInclude() {
        Annotated a = new AnnotatedClassAnnotatedStub(JsonInclude.class,
                JsonInclude.Include.NON_NULL);
        assertEquals(JsonInclude.Include.NON_NULL,
                introspector.findSerializationInclusion(a, JsonInclude.Include.ALWAYS));
    }

    // ---- findPropertyInclusion ----
    @Test
    public void testFindPropertyInclusionWithJsonInclude() {
        Annotated a = new AnnotatedClassAnnotatedStub(JsonInclude.class,
                JsonInclude.Include.NON_EMPTY);
        JsonInclude.Value v = introspector.findPropertyInclusion(a);
        assertEquals(JsonInclude.Include.NON_EMPTY, v.getValueInclusion());
        assertEquals(JsonInclude.Include.USE_DEFAULTS, v.getContentInclusion());
    }

    @Test
    public void testFindPropertyInclusionNoAnnotation() {
        Annotated a = new AnnotatedMethodStub("");
        JsonInclude.Value v = introspector.findPropertyInclusion(a);
        assertEquals(JsonInclude.Include.USE_DEFAULTS, v.getValueInclusion());
        assertEquals(JsonInclude.Include.USE_DEFAULTS, v.getContentInclusion());
    }

    // ---- hasAsValueAnnotation ----
    @Test
    public void testHasAsValueAnnotationTrue() throws Exception {
        AnnotatedMethod am = new AnnotatedMethodStub("@JsonValue(true)");
        assertTrue(introspector.hasAsValueAnnotation(am));
    }

    @Test
    public void testHasAsValueAnnotationFalse() throws Exception {
        AnnotatedMethod am = new AnnotatedMethodStub("@JsonValue(false)");
        assertFalse(introspector.hasAsValueAnnotation(am));
    }

    @Test
    public void testHasAsValueAnnotationNoAnnotation() throws Exception {
        AnnotatedMethod am = new AnnotatedMethodStub("");
        assertFalse(introspector.hasAsValueAnnotation(am));
    }

    // ---- hasRequiredMarker ----
    @Test
    public void testHasRequiredMarkerTrue() {
        AnnotatedMember am = new AnnotatedMemberStub(JsonProperty.class,
                "value", true, JsonProperty.Access.AUTO);
        assertEquals(Boolean.TRUE, introspector.hasRequiredMarker(am));
    }

    @Test
    public void testHasRequiredMarkerFalse() {
        AnnotatedMember am = new AnnotatedMemberStub(JsonProperty.class,
                "value", false, JsonProperty.Access.AUTO);
        assertEquals(Boolean.FALSE, introspector.hasRequiredMarker(am));
    }

    @Test
    public void testHasRequiredMarkerNoAnnotation() {
        AnnotatedMember am = new AnnotatedMemberStub();
        assertNull(introspector.hasRequiredMarker(am));
    }

    // ---- isTypeId ----
    @Test
    public void testIsTypeIdTrue() {
        AnnotatedMember am = new AnnotatedMemberStub(JsonTypeId.class);
        assertEquals(Boolean.TRUE, introspector.isTypeId(am));
    }

    @Test
    public void testIsTypeIdFalse() {
        AnnotatedMember am = new AnnotatedMemberStub();
        assertEquals(Boolean.FALSE, introspector.isTypeId(am));
    }

    // ---- findEndableValueId ----
    @Test
    public void testFindInjectableValueIdWithValue() {
        AnnotatedMember am = new AnnotatedMemberStub(JacksonInject.class,
                "customId");
        assertEquals("customId", introspector.findInjectableValueId(am));
    }

    @Test
    public void testFindInjectableValueIdNoAnnotation() {
        AnnotatedMember am = new AnnotatedMemberStub();
        assertNull(introspector.findInjectableValueId(am));
    }

    // ---- findPropertyIndex ----
    @Test
    public void testFindPropertyIndexWithIndex() {
        Annotated ann = new AnnotatedMemberStub(JsonProperty.class,
                "prop", false, JsonProperty.Access.AUTO, 5);
        assertEquals(Integer.valueOf(5), introspector.findPropertyIndex(ann));
    }

    @Test
    public void testFindPropertyIndexDefault() {
        Annotated ann = new AnnotatedMemberStub(JsonProperty.class,
                "prop", false, JsonProperty.Access.AUTO, JsonProperty.INDEX_UNKNOWN);
        assertNull(introspector.findPropertyIndex(ann));
    }

    // ---- _propertyName ----
    @Test
    public void testPropertyNameLocalNameNotEmpty() {
        PropertyName pn = introspector._propertyName("foo", null);
        assertEquals("foo", pn.getSimpleName());
        assertNull(pn.getNamespace());
    }

    @Test
    public void testPropertyNameLocalNameEmpty() {
        PropertyName pn = introspector._propertyName("", "ns");
        assertSame(PropertyName.USE_DEFAULT, pn);
    }

    @Test
    public void testPropertyNameWithNamespace() {
        PropertyName pn = introspector._propertyName("foo", "ns");
        assertEquals("foo", pn.getSimpleName());
        assertEquals("ns", pn.getNamespace());
    }

    // ---------- Helper types and stubs ----------

    // Enum for testing findEnumValue
    enum TestEnum {
        @JsonProperty("customValue") WITH_ANNOTATION,
        NO_ANNOTATION,
        @JsonProperty("") EMPTY_VALUE
    }

    // AnnotatedClass helper: resolve from class via ObjectMapperProvider
    // We'll use a simple static mapper from a helper class
    static class ObjectMapperProvider {
        private static final ObjectMapper mapper = new ObjectMapper();
        static ObjectMapper mapper() { return mapper; }
    }

    // Test classes with annotations
    @JsonRootName("rootName")
    static class JsonRootNameClass {}

    static class NoAnnotationClass {}

    @JsonIgnoreProperties({"prop1", "prop2"})
    static class IgnorePropsClass {}

    @JsonIgnoreProperties(value={"prop1","prop2"}, allowGetters=true)
    static class IgnorePropsAllowGetters {}

    @JsonIgnoreProperties(value={"prop1","prop2"}, allowSetters=true)
    static class IgnorePropsAllowSetters {}

    @JsonIgnoreType(true)
    static class IgnoredType {}

    @JsonIgnoreType(false)
    static class NotIgnoredType {}

    @JsonFilter("myFilter")
    static class FilteredType {}

    @JsonFilter("")
    static class EmptyFilterId {}

    @JsonNaming(UpperCaseStrategy.class)
    static class NamingStrategyClass {}

    @JsonSubTypes({@JsonSubTypes.Type(value=String.class, name="first"),
                   @JsonSubTypes.Type(value=Integer.class, name="second")})
    static class SubTypeClass {}

    // Stub for Annotated (generic)
    static class AnnotatedMethodStub extends AnnotatedMethod {
        private final String description;

        AnnotatedMethodStub(String description) {
            super(null, null, null, null, null);
            this.description = description;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            // Return mock annotations based on description
            if (acls == JsonValue.class) {
                if (description.contains("@JsonValue(true)")) {
                    return (A) new JsonValue() {
                        @Override public Class<? extends Annotation> annotationType() { return JsonValue.class; }
                        @Override public boolean value() { return true; }
                    };
                } else if (description.contains("@JsonValue(false)")) {
                    return (A) new JsonValue() {
                        @Override public Class<? extends Annotation> annotationType() { return JsonValue.class; }
                        @Override public boolean value() { return false; }
                    };
                }
            }
            if (acls == JsonRawValue.class) {
                if (description.contains("@JsonRawValue true")) {
                    return (A) new JsonRawValue() {
                        @Override public Class<? extends Annotation> annotationType() { return JsonRawValue.class; }
                        @Override public boolean value() { return true; }
                    };
                }
            }
            return null;
        }

        @Override
        public boolean hasAnnotation(Class<?> acls) {
            return getAnnotation((Class<Annotation>)acls) != null;
        }

        @Override
        public Annotated withAnnotations(AnnotationMap annotations) {
            return this;
        }

        @Override
        public Class<?> getRawType() {
            return Object.class;
        }

        @Override
        public String getName() {
            return "";
        }

        @Override
        public String getFullName() {
            return "";
        }

        @Override
        public int getModifiers() {
            return 0;
        }

        @Override
        public boolean isStatic() {
            return false;
        }

        @Override
        public Type getGenericType() {
            return Object.class;
        }

        @Override
        public int getAnnotationCount() {
            return 0;
        }

        @Override
        public Iterable<Annotation> annotations() {
            return Collections.emptyList();
        }
    }

    // Stub for AnnotatedClass (implements Annotated)
    static class AnnotatedClassAnnotatedStub implements Annotated {
        private final Class<? extends Annotation> annotationClass;
        private final Object value;

        AnnotatedClassAnnotatedStub(Class<? extends Annotation> annotationClass, Object value) {
            this.annotationClass = annotationClass;
            this.value = value;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (acls == annotationClass) {
                return createAnnotation(acls, value);
            }
            return null;
        }

        @Override
        public boolean hasAnnotation(Class<?> acls) {
            return acls == annotationClass;
        }

        @Override
        public Annotated withAnnotations(AnnotationMap annotations) {
            return this;
        }

        @Override
        public Class<?> getRawType() {
            return Object.class;
        }

        @Override
        public String getName() {
            return "";
        }

        @Override
        public String getFullName() {
            return "";
        }

        @Override
        public int getModifiers() {
            return 0;
        }

        @Override
        public boolean isStatic() {
            return false;
        }

        @Override
        public Type getGenericType() {
            return Object.class;
        }

        @Override
        public int getAnnotationCount() {
            return 1;
        }

        @Override
        public Iterable<Annotation> annotations() {
            return Collections.singletonList(createAnnotation(annotationClass, value));
        }

        @SuppressWarnings("unchecked")
        private <A extends Annotation> A createAnnotation(Class<A> acls, Object value) {
            if (acls == JsonInclude.class) {
                JsonInclude.Include incl = (JsonInclude.Include) value;
                return (A) new JsonInclude() {
                    @Override public Class<? extends Annotation> annotationType() { return JsonInclude.class; }
                    @Override public JsonInclude.Include value() { return incl; }
                    @Override public JsonInclude.Include content() { return JsonInclude.Include.USE_DEFAULTS; }
                };
            }
            if (acls == JsonIgnore.class) {
                return (A) new JsonIgnore() {
                    @Override public Class<? extends Annotation> annotationType() { return JsonIgnore.class; }
                    @Override public boolean value() { return (Boolean) value; }
                };
            }
            throw new IllegalArgumentException("Unsupported annotation: " + acls);
        }
    }

    // Stub for AnnotatedMember
    static class AnnotatedMemberStub extends AnnotatedMember {
        // Stores annotation types and values for simplicity
        private final Map<Class<?>, Annotation> annotations = new HashMap<>();

        AnnotatedMemberStub() {}

        AnnotatedMemberStub(Class<? extends Annotation> annClass) {
            // For marker annotations without value
            if (annClass == JsonTypeId.class) {
                annotations.put(JsonTypeId.class, new JsonTypeId() {
                    @Override public Class<? extends Annotation> annotationType() { return JsonTypeId.class; }
                });
            } else if (annClass == JacksonInject.class) {
                annotations.put(JacksonInject.class, new JacksonInject() {
                    @Override public Class<? extends Annotation> annotationType() { return JacksonInject.class; }
                    @Override public String value() { return ""; }
                });
            }
        }

        AnnotatedMemberStub(Class<? extends Annotation> annClass, String value) {
            // For annotations with a string value
            if (annClass == JacksonInject.class) {
                annotations.put(JacksonInject.class, new JacksonInject() {
                    @Override public Class<? extends Annotation> annotationType() { return JacksonInject.class; }
                    @Override public String value() { return value; }
                });
            } else if (annClass == JsonProperty.class) {
                // For JsonProperty with required and index
                annotations.put(JsonProperty.class, new JsonProperty() {
                    @Override public Class<? extends Annotation> annotationType() { return JsonProperty.class; }
                    @Override public String value() { return value; }
                    @Override public boolean required() { return false; }
                    @Override public JsonProperty.Access access() { return JsonProperty.Access.AUTO; }
                    @Override public int index() { return JsonProperty.INDEX_UNKNOWN; }
                    @Override public String defaultValue() { return ""; }
                });
            }
        }

        // For JsonProperty with required, access, index
        AnnotatedMemberStub(Class<? extends Annotation> annClass, String value, boolean required,
                            JsonProperty.Access access) {
            this(annClass, value);
            if (annClass == JsonProperty.class) {
                annotations.put(JsonProperty.class, new JsonProperty() {
                    @Override public Class<? extends Annotation> annotationType() { return JsonProperty.class; }
                    @Override public String value() { return value; }
                    @Override public boolean required() { return required; }
                    @Override public JsonProperty.Access access() { return access; }
                    @Override public int index() { return JsonProperty.INDEX_UNKNOWN; }
                    @Override public String defaultValue() { return ""; }
                });
            }
        }

        // For JsonProperty with index
        AnnotatedMemberStub(Class<? extends Annotation> annClass, String value, boolean required,
                            JsonProperty.Access access, int index) {
            if (annClass == JsonProperty.class) {
                annotations.put(JsonProperty.class, new JsonProperty() {
                    @Override public Class<? extends Annotation> annotationType() { return JsonProperty.class; }
                    @Override public String value() { return value; }
                    @Override public boolean required() { return required; }
                    @Override public JsonProperty.Access access() { return access; }
                    @Override public int index() { return index; }
                    @Override public String defaultValue() { return ""; }
                });
            }
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return (A) annotations.get(acls);
        }

        @Override
        public boolean hasAnnotation(Class<?> acls) {
            return annotations.containsKey(acls);
        }

        @Override
        public Annotated withAnnotations(AnnotationMap annotations) {
            return this;
        }

        @Override
        public Class<?> getRawType() {
            return Object.class;
        }

        @Override
        public String getName() {
            return "";
        }

        @Override
        public String getFullName() {
            return "";
        }

        @Override
        public int getModifiers() {
            return 0;
        }

        @Override
        public boolean isStatic() {
            return false;
        }

        @Override
        public Type getGenericType() {
            return Object.class;
        }

        @Override
        public int getAnnotationCount() {
            return annotations.size();
        }

        @Override
        public Iterable<Annotation> annotations() {
            return annotations.values();
        }

        @Override
        protected AnnotationMap getAllAnnotations() {
            return null;
        }
    }

    // Provide a dummy UpperCaseStrategy for testing
    public static class UpperCaseStrategy extends PropertyNamingStrategy {
        @Override
        public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
            return defaultName.toUpperCase();
        }
    }
}