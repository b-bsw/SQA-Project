package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

/**
 * Unit tests for selected annotation-introspection methods of
 * {@link JacksonAnnotationIntrospector}.
 */
public class JacksonAnnotationIntrospectorTest {

    private ObjectMapper mapper;
    private JacksonAnnotationIntrospector intr;

    @Before
    public void setUp() {
        intr = new JacksonAnnotationIntrospector();
        mapper = new ObjectMapper();
        mapper.setAnnotationIntrospector(intr);
    }

    /* ------------------------------------------------------------------
     * Helpers
     * ---------------------------------------------------------------- */

    private AnnotatedClass _ann(Class<?> cls) {
        return mapper.getSerializationConfig().introspectClassAnnotations(cls);
    }

    private AnnotatedField _field(AnnotatedClass ac, String name) {
        for (AnnotatedField f : ac.fields()) {
            if (name.equals(f.getName())) {
                return f;
            }
        }
        fail("Unable to find field '" + name + "'");
        return null;
    }

    private AnnotatedMethod _method(AnnotatedClass ac, String name) {
        for (AnnotatedMethod m : ac.memberMethods()) {
            if (name.equals(m.getName())) {
                return m;
            }
        }
        fail("Unable to find method '" + name + "'");
        return null;
    }

    /* ------------------------------------------------------------------
     * Version
     * ---------------------------------------------------------------- */

    @Test
    public void testVersion() {
        assertNotNull(intr.version());
    }

    /* ------------------------------------------------------------------
     * Enum support
     * ---------------------------------------------------------------- */

    public enum EnumWithJsonProperty {
        @JsonProperty("renamed") VALUE,
        OTHER
    }

    @Test
    public void testFindEnumValue() {
        assertEquals("renamed", intr.findEnumValue(EnumWithJsonProperty.VALUE));
        assertEquals("OTHER", intr.findEnumValue(EnumWithJsonProperty.OTHER));
    }

    public enum EnumWithNames {
        @JsonProperty("first") A,
        @JsonProperty("second") B,
        C
    }

    @Test
    public void testFindEnumValues() {
        Enum<?>[] values = new Enum<?>[] {
                EnumWithNames.A, EnumWithNames.B, EnumWithNames.C
        };
        String[] existingNames = new String[] { "x", "y", "z" };

        String[] result = intr.findEnumValues(EnumWithNames.class, values, existingNames);

        assertEquals("first", result[0]);
        assertEquals("second", result[1]);
        assertEquals("z", result[2]);
    }

    public enum EnumWithDefault {
        A,
        @JsonEnumDefaultValue B
    }

    @Test
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void testFindDefaultEnumValue() {
        assertEquals(EnumWithDefault.B,
                intr.findDefaultEnumValue((Class) EnumWithDefault.class));
    }

    /* ------------------------------------------------------------------
     * Property naming
     * ---------------------------------------------------------------- */

    static class DeserializedNameBean {
        @JsonProperty("fromField")
        public String value;

        @JsonSetter("fromSetter")
        public void setValue(String value) {
            this.value = value;
        }
    }

    @Test
    public void testFindDeserializationName() {
        AnnotatedClass ac = _ann(DeserializedNameBean.class);

        AnnotatedField field = _field(ac, "value");
        assertEquals("fromField", intr.findDeserializationName(field).getSimpleName());

        AnnotatedMethod setter = _method(ac, "setValue");
        assertEquals("fromSetter", intr.findDeserializationName(setter).getSimpleName());
    }

    static class SerializedNameBean {
        @JsonProperty("renamed")
        public String value;
    }

    @Test
    public void testFindSerializationName() {
        AnnotatedClass ac = _ann(SerializedNameBean.class);
        AnnotatedField field = _field(ac, "value");
        assertEquals("renamed", intr.findSerializationName(field).getSimpleName());
    }

    /* ------------------------------------------------------------------
     * Ignore / required / descriptions
     * ---------------------------------------------------------------- */

    static class IgnoreBean {
        @JsonIgnore
        public String ignored;

        @JsonIgnore(false)
        public String notIgnored;
    }

    @Test
    public void testHasIgnoreMarker() {
        AnnotatedClass ac = _ann(IgnoreBean.class);

        assertTrue(intr.hasIgnoreMarker(_field(ac, "ignored")));
        assertFalse(intr.hasIgnoreMarker(_field(ac, "notIgnored")));
    }

    static class RequiredBean {
        @JsonProperty(required = true)
        public String required;

        @JsonProperty(required = false)
        public String optional;
    }

    @Test
    public void testHasRequiredMarker() {
        AnnotatedClass ac = _ann(RequiredBean.class);

        assertEquals(Boolean.TRUE, intr.hasRequiredMarker(_field(ac, "required")));
        assertEquals(Boolean.FALSE, intr.hasRequiredMarker(_field(ac, "optional")));
    }

    static class DescriptionBean {
        @JsonPropertyDescription("some description")
        public String value;
    }

    @Test
    public void testFindPropertyDescription() {
        AnnotatedClass ac = _ann(DescriptionBean.class);
        assertEquals("some description", intr.findPropertyDescription(_field(ac, "value")));
    }

    static class IndexBean {
        @JsonProperty(index = 3)
        public String value;
    }

    @Test
    public void testFindPropertyIndex() {
        AnnotatedClass ac = _ann(IndexBean.class);
        assertEquals(Integer.valueOf(3), intr.findPropertyIndex(_field(ac, "value")));
    }

    static class DefaultValueBean {
        @JsonProperty(defaultValue = "dflt")
        public String value;
    }

    @Test
    public void testFindPropertyDefaultValue() {
        AnnotatedClass ac = _ann(DefaultValueBean.class);
        assertEquals("dflt", intr.findPropertyDefaultValue(_field(ac, "value")));
    }

    /* ------------------------------------------------------------------
     * Format / references / injection
     * ---------------------------------------------------------------- */

    static class FormatBean {
        @JsonFormat(pattern = "yyyy-MM-dd")
        public String date;
    }

    @Test
    public void testFindFormat() {
        AnnotatedClass ac = _ann(FormatBean.class);
        JsonFormat.Value value = intr.findFormat(_field(ac, "date"));
        assertNotNull(value);
        assertEquals("yyyy-MM-dd", value.getPattern());
    }

    static class ReferenceBean {
        @JsonBackReference
        public Object back;

        @JsonManagedReference
        public Object managed;
    }

    @Test
    public void testFindReferenceType() {
        AnnotatedClass ac = _ann(ReferenceBean.class);

        ReferenceProperty back = intr.findReferenceType(_field(ac, "back"));
        assertNotNull(back);
        assertTrue(back.isBackReference());

        ReferenceProperty managed = intr.findReferenceType(_field(ac, "managed"));
        assertNotNull(managed);
        assertTrue(managed.isManagedReference());
    }

    static class InjectBean {
        @JacksonInject("beanId")
        public String value;
    }

    @Test
    public void testFindInjectableValueId() {
        AnnotatedClass ac = _ann(InjectBean.class);
        assertEquals("beanId", intr.findInjectableValueId(_field(ac, "value")));
    }

    /* ------------------------------------------------------------------
     * Views
     * ---------------------------------------------------------------- */

    public static class ViewMarker {}

    static class ViewsBean {
        @JsonView(ViewMarker.class)
        public String value;
    }

    @Test
    public void testFindViews() {
        AnnotatedClass ac = _ann(ViewsBean.class);
        Class<?>[] views = intr.findViews(_field(ac, "value"));
        assertArrayEquals(new Class<?>[] { ViewMarker.class }, views);
    }

    /* ------------------------------------------------------------------
     * Type / identity / builder support
     * ---------------------------------------------------------------- */

    @JsonTypeName("customType")
    static class TypeNameBean {}

    @Test
    public void testFindTypeName() {
        assertEquals("customType", intr.findTypeName(_ann(TypeNameBean.class)));
    }

    static class TypeIdBean {
        @JsonTypeId
        public String typeId;
    }

    @Test
    public void testIsTypeId() {
        AnnotatedClass ac = _ann(TypeIdBean.class);
        assertTrue(intr.isTypeId(_field(ac, "typeId")));
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    static class ObjectIdBean {}

    @Test
    public void testFindObjectIdInfo() {
        assertNotNull(intr.findObjectIdInfo(_ann(ObjectIdBean.class)));
    }

    @JsonIgnoreProperties({ "a", "b" })
    static class IgnorePropsBean {}

    @Test
    public void testFindPropertyIgnorals() {
        JsonIgnoreProperties.Value value = intr.findPropertyIgnorals(_ann(IgnorePropsBean.class));
        assertNotNull(value);
        assertTrue(value.getIgnored().contains("a"));
        assertTrue(value.getIgnored().contains("b"));
    }

    @JsonPropertyOrder({ "b", "a" })
    static class OrderBean {}

    @Test
    public void testFindSerializationPropertyOrder() {
        String[] order = intr.findSerializationPropertyOrder(_ann(OrderBean.class));
        assertArrayEquals(new String[] { "b", "a" }, order);
    }

    @JsonPropertyOrder(alphabetic = true)
    static class AlphaBean {}

    @Test
    public void testFindSerializationSortAlpha() {
        assertEquals(Boolean.TRUE, intr.findSerializationSortAlpha(_ann(AlphaBean.class)));
    }

    @JsonDeserialize(builder = DeserPOJO.Builder.class)
    static class DeserPOJO {
        static class Builder {
            public DeserPOJO build() {
                return new DeserPOJO();
            }
        }
    }

    static class ConfiguredBuilder {
        @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "make")
        public static class Builder {}
    }

    @Test
    public void testFindPOJOBuilder() {
        AnnotatedClass ac = _ann(DeserPOJO.class);
        assertEquals(DeserPOJO.Builder.class, intr.findPOJOBuilder(ac));
    }

    @Test
    public void testFindPOJOBuilderConfig() {
        AnnotatedClass ac = _ann(ConfiguredBuilder.Builder.class);
        JsonPOJOBuilder.Value config = intr.findPOJOBuilderConfig(ac);
        assertNotNull(config);
        assertEquals("create", config.getBuildMethodName());
        assertEquals("make", config.getWithPrefix());
    }

    /* ------------------------------------------------------------------
     * Custom serializer / deserializer support
     * ---------------------------------------------------------------- */

    static class TestSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            gen.writeString("serialized");
        }
    }

    static class TestDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            return p.getText();
        }
    }

    static class SerializerBean {
        @JsonSerialize(using = TestSerializer.class)
        public String value;
    }

    @Test
    public void testFindSerializer() {
        AnnotatedClass ac = _ann(SerializerBean.class);
        assertSame(TestSerializer.class, intr.findSerializer(_field(ac, "value")));
    }

    static class DeserializerBean {
        @JsonDeserialize(using = TestDeserializer.class)
        public String value;
    }

    @Test
    public void testFindDeserializer() {
        AnnotatedClass ac = _ann(DeserializerBean.class);
        assertSame(TestDeserializer.class, intr.findDeserializer(_field(ac, "value")));
    }

    static class ContentDeserializerBean {
        @JsonDeserialize(contentUsing = TestDeserializer.class)
        public List<String> values;
    }

    @Test
    public void testFindContentDeserializer() {
        AnnotatedClass ac = _ann(ContentDeserializerBean.class);
        assertSame(TestDeserializer.class, intr.findContentDeserializer(_field(ac, "values")));
    }

    /* ------------------------------------------------------------------
     * Any-getter / JsonValue
     * ---------------------------------------------------------------- */

    static class AnyGetterBean {
        @JsonAnyGetter
        public Map<String, Object> any() {
            return null;
        }

        @JsonAnySetter
        public void add(String key, Object value) {
        }
    }

    @Test
    public void testHasAnyGetter() {
        AnnotatedClass ac = _ann(AnyGetterBean.class);
        AnnotatedMethod method = _method(ac, "any");
        assertEquals(Boolean.TRUE, intr.hasAnyGetter(method));
    }

    static class JsonValueBean {
        @JsonValue
        public String value() {
            return "value";
        }
    }

    @Test
    public void testHasAsValue() {
        AnnotatedClass ac = _ann(JsonValueBean.class);
        AnnotatedMethod method = _method(ac, "value");
        assertEquals(Boolean.TRUE, intr.hasAsValue(method));
    }

    /* ------------------------------------------------------------------
     * Type refinement
     * ---------------------------------------------------------------- */

    static class BaseType {}

    static class SubType extends BaseType {}

    static class DeserializationTypeBean {
        @JsonDeserialize(as = SubType.class)
        public BaseType value;
    }

    @Test
    public void testFindDeserializationType() {
        AnnotatedClass ac = _ann(DeserializationTypeBean.class);
        JavaType baseType = mapper.getTypeFactory().constructType(BaseType.class);
        assertEquals(SubType.class, intr.findDeserializationType(_field(ac, "value"), baseType));
    }

    static class SerializationTypeBean {
        @JsonSerialize(as = SubType.class)
        public BaseType value;
    }

    @Test
    public void testFindSerializationType() {
        AnnotatedClass ac = _ann(SerializationTypeBean.class);
        assertEquals(SubType.class, intr.findSerializationType(_field(ac, "value")));
    }
}