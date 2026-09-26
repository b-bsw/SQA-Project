import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class JacksonAnnotationIntrospectorTest {

    private ObjectMapper mapper;
    private JacksonAnnotationIntrospector introspector;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        introspector = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospector(introspector);
    }

    // ------------------------------------------------------------------
    // Helper methods
    // ------------------------------------------------------------------

    private AnnotatedClass annotatedClass(Class<?> cls) {
        return mapper.getSerializationConfig()
                .introspect(mapper.constructType(cls))
                .getClassInfo();
    }

    private AnnotatedMember property(Class<?> cls, String name) {
        BeanDescription description = mapper.getSerializationConfig()
                .introspect(mapper.constructType(cls));

        for (BeanPropertyDefinition property : description.findProperties()) {
            if (name.equals(property.getName())) {
                if (property.getField() != null) {
                    return property.getField();
                }
                if (property.getGetter() != null) {
                    return property.getGetter();
                }
            }
        }

        throw new IllegalArgumentException("Cannot find property: " + name);
    }

    // ------------------------------------------------------------------
    // Test types
    // ------------------------------------------------------------------

    public static class EmptyBean {
    }

    @JsonIgnoreProperties({"a", "b"})
    public static class IgnorePropsBean {
        public String a, b, c;
    }

    @JsonFilter("filter-id")
    public static class FilterBean {
    }

    @JsonFilter("")
    public static class EmptyFilterBean {
    }

    @JsonClassDescription("some class")
    public static class ClassDescBean {
    }

    @JsonTypeName("beanType")
    public static class TypeNameBean {
    }

    @JsonPropertyOrder({"b", "a"})
    public static class OrderBean {
        public String a, b;
    }

    @JsonIdentityInfo(
            generator = ObjectIdGenerators.IntSequenceGenerator.class,
            property = "id")
    public static class IdentityBean {
        public int id;
    }

    public static class MySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen,
                SerializerProvider serializers) throws IOException {
            gen.writeString("x");
        }
    }

    public static class MemberBean {

        @JsonProperty(required = true)
        public String required;

        @JsonPropertyDescription("some desc")
        public String described;

        @JsonProperty(defaultValue = "42")
        public String defaulted;

        @JsonFormat(pattern = "yyyy")
        public String formatted;

        @JsonBackReference("back")
        public MemberBean backRef;

        @JsonManagedReference("forward")
        public MemberBean forward;

        @JsonUnwrapped(prefix = "pre.", suffix = ".suf")
        public String unwrapped;

        @JacksonInject("injectId")
        public String injected;

        @JsonRawValue
        public String raw;

        @JsonSerialize(using = MySerializer.class)
        public Object custom;
    }

    // ------------------------------------------------------------------
    // Class-level annotation tests
    // ------------------------------------------------------------------

    @Test
    public void findPropertiesToIgnoreReturnsExplicitlyIgnored() {
        AnnotatedClass ac = annotatedClass(IgnorePropsBean.class);
        assertArrayEquals(new String[]{"a", "b"},
                introspector.findPropertiesToIgnore(ac));
    }

    @Test
    public void findPropertiesToIgnoreWhenNoAnnotationReturnsNull() {
        assertNull(introspector.findPropertiesToIgnore(annotatedClass(EmptyBean.class)));
    }

    @Test
    public void findFilterIdReturnsValue() {
        assertEquals("filter-id", introspector.findFilterId(annotatedClass(FilterBean.class)));
    }

    @Test
    public void findFilterIdWhenEmptyReturnsNull() {
        assertNull(introspector.findFilterId(annotatedClass(EmptyFilterBean.class)));
    }

    @Test
    public void findFilterIdWhenMissingReturnsNull() {
        assertNull(introspector.findFilterId(annotatedClass(EmptyBean.class)));
    }

    @Test
    public void findClassDescriptionReturnsValue() {
        assertEquals("some class",
                introspector.findClassDescription(annotatedClass(ClassDescBean.class)));
    }

    @Test
    public void findClassDescriptionWhenMissingReturnsNull() {
        assertNull(introspector.findClassDescription(annotatedClass(EmptyBean.class)));
    }

    @Test
    public void findTypeNameReturnsValue() {
        assertEquals("beanType",
                introspector.findTypeName(annotatedClass(TypeNameBean.class)));
    }

    @Test
    public void findTypeNameWhenMissingReturnsNull() {
        assertNull(introspector.findTypeName(annotatedClass(EmptyBean.class)));
    }

    @Test
    public void findSerializationPropertyOrderReturnsValue() {
        AnnotatedClass ac = annotatedClass(OrderBean.class);
        assertArrayEquals(new String[]{"b", "a"},
                introspector.findSerializationPropertyOrder(ac));
    }

    @Test
    public void findSerializationPropertyOrderWhenMissingReturnsNull() {
        assertNull(introspector.findSerializationPropertyOrder(
                annotatedClass(EmptyBean.class)));
    }

    @Test
    public void findObjectIdInfoReturnsValue() {
        ObjectIdInfo info = introspector.findObjectIdInfo(
                annotatedClass(IdentityBean.class));

        assertNotNull(info);
        assertEquals("id", info.getPropertyName().getSimpleName());
    }

    @Test
    public void findObjectIdInfoWhenMissingReturnsNull() {
        assertNull(introspector.findObjectIdInfo(annotatedClass(EmptyBean.class)));
    }

    // ------------------------------------------------------------------
    // Member-level annotation tests
    // ------------------------------------------------------------------

    @Test
    public void findPropertyDescriptionReturnsValue() {
        AnnotatedMember member = property(MemberBean.class, "described");
        assertEquals("some desc",
                introspector.findPropertyDescription(member));
    }

    @Test
    public void findPropertyDefaultValueReturnsValue() {
        AnnotatedMember member = property(MemberBean.class, "defaulted");
        assertEquals("42", introspector.findPropertyDefaultValue(member));
    }

    @Test
    public void findFormatReturnsPattern() {
        AnnotatedMember member = property(MemberBean.class, "formatted");
        JsonFormat.Value format = introspector.findFormat(member);

        assertNotNull(format);
        assertEquals("yyyy", format.getPattern());
    }

    @Test
    public void findBackReferenceTypeReturnsBackReference() {
        AnnotatedMember member = property(MemberBean.class, "backRef");
        AnnotationIntrospector.ReferenceProperty ref =
                introspector.findReferenceType(member);

        assertNotNull(ref);
        assertTrue(ref.isBackReference());
        assertEquals("back", ref.getName());
    }

    @Test
    public void findManagedReferenceTypeReturnsManagedReference() {
        AnnotatedMember member = property(MemberBean.class, "forward");
        AnnotationIntrospector.ReferenceProperty ref =
                introspector.findReferenceType(member);

        assertNotNull(ref);
        assertTrue(ref.isManagedReference());
        assertEquals("forward", ref.getName());
    }

    @Test
    public void findUnwrappingNameTransformerReturnsTransformer() {
        AnnotatedMember member = property(MemberBean.class, "unwrapped");
        NameTransformer transformer =
                introspector.findUnwrappingNameTransformer(member);

        assertNotNull(transformer);
    }

    @Test
    public void findInjectableValueIdReturnsId() {
        AnnotatedMember member = property(MemberBean.class, "injected");
        Object id = introspector.findInjectableValueId(member);

        assertEquals("injectId", id);
    }

    @Test
    public void hasRequiredMarkerTrueWhenAnnotated() {
        AnnotatedMember member = property(MemberBean.class, "required");
        assertEquals(Boolean.TRUE, introspector.hasRequiredMarker(member));
    }

    @Test
    public void findSerializerReturnsAnnotatedType() {
        AnnotatedMember member = property(MemberBean.class, "custom");
        Object serializer = introspector.findSerializer(member);

        assertEquals(MySerializer.class, serializer);
    }

    @Test
    public void findSerializerHonorsRawJson() {
        AnnotatedMember member = property(MemberBean.class, "raw");
        Object serializer = introspector.findSerializer(member);

        assertNotNull(serializer);
        assertFalse(serializer instanceof Class);
    }
}