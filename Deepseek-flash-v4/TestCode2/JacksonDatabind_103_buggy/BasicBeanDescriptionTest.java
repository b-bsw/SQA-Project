import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
import org.junit.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.util.Converter;

public class BasicBeanDescriptionTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private BasicBeanDescription describe(Class<?> cls) {
        return (BasicBeanDescription) mapper.getDeserializationConfig()
                .introspect(mapper.getTypeFactory().constructType(cls));
    }

    // ------------------------------------------------------------------
    // Sample classes used by tests
    // ------------------------------------------------------------------

    public static class SampleBean {
        public String name;
        public int value;
        @JsonIgnore
        public String ignored;

        public SampleBean() {}
        public SampleBean(String name) { this.name = name; }

        public String foo(String s) { return s; }
    }

    public static class NoDefaultBean {
        public NoDefaultBean(String s) { }
    }

    public static class ThrowCtorBean {
        public ThrowCtorBean() throws Exception {
            throw new Exception("boom");
        }
    }

    public static class AnyGetterValid {
        private Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        @JsonAnyGetter
        public Map<String, Integer> getMap() { return map; }
    }

    public static class AnyGetterInvalid {
        @JsonAnyGetter
        public String notMap() { return "nope"; }
    }

    public static class AnySetterValid {
        private Map<String, Object> stuff = new LinkedHashMap<String, Object>();

        @JsonAnySetter
        public void add(String key, Object value) { stuff.put(key, value); }
    }

    public static class AnySetterInvalidMethod {
        @JsonAnySetter
        public void add(int key, Object value) { }
    }

    public static class InjectBean {
        @JacksonInject("id")
        public String id;

        public String name;
    }

    public static class FactoryBean {
        private String value;

        public FactoryBean() { }

        @JsonCreator
        public static FactoryBean fromString(String v) {
            FactoryBean b = new FactoryBean();
            b.value = v;
            return b;
        }
    }

    public static class SingleCtorBean {
        public SingleCtorBean() { }
        public SingleCtorBean(String s) { }
    }

    public static class ViewBean {
        public static class MyView { }
        public String name;
    }

    @JsonView(ViewBean.MyView.class)
    public static class AnnotatedViewBean {
        public String name;
    }

    @JsonFormat(pattern = "yyyyMMdd")
    public static class FormatBean {
        public String name;
    }

    public static class StringListConverter implements Converter<Object, Object> {
        public StringListConverter() { }

        @Override
        public Object convert(Object value) { return value; }

        @Override
        public JavaType getInputType(com.fasterxml.jackson.databind.type.TypeFactory typeFactory) {
            return typeFactory.constructType(Object.class);
        }

        @Override
        public JavaType getOutputType(com.fasterxml.jackson.databind.type.TypeFactory typeFactory) {
            return typeFactory.constructType(Object.class);
        }
    }

    @JsonSerialize(converter = StringListConverter.class)
    public static class SerializeConverterBean { }

    @JsonDeserialize(converter = StringListConverter.class)
    public static class DeserializeConverterBean { }

    public static class ManagedParent {
        @JsonManagedReference
        public ManagedChild child;
    }

    public static class ManagedChild {
        @JsonBackReference
        public ManagedParent parent;
    }

    // ------------------------------------------------------------------
    // Tests
    // ------------------------------------------------------------------

    @Test
    public void testPropertiesAndPropertyLookup() {
        BasicBeanDescription desc = describe(SampleBean.class);

        List<BeanPropertyDefinition> props = desc.findProperties();
        assertNotNull(props);
        assertTrue(props.size() >= 2);

        assertTrue(desc.hasProperty(new PropertyName("name")));
        assertFalse(desc.hasProperty(new PropertyName("missing")));

        assertNotNull(desc.findProperty(new PropertyName("name")));
        assertNull(desc.findProperty(new PropertyName("nope")));
    }

    @Test
    public void testRemoveProperty() {
        BasicBeanDescription desc = describe(SampleBean.class);
        int before = desc.findProperties().size();

        assertTrue(desc.removeProperty("name"));
        assertEquals(before - 1, desc.findProperties().size());

        assertFalse(desc.removeProperty("name"));
        assertFalse(desc.removeProperty("doesNotExist"));
    }

    @Test
    public void testFindMethodAndResolveType() {
        BasicBeanDescription desc = describe(SampleBean.class);

        AnnotatedMethod method = desc.findMethod("foo", new Class<?>[] { String.class });
        assertNotNull(method);
        assertEquals("foo", method.getName());

        assertNull(desc.findMethod("missing", new Class<?>[] { String.class }));

        JavaType type = desc.resolveType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());

        assertNull(desc.resolveType(null));
    }

    @Test
    public void testConstructorsAndInstantiate() {
        BasicBeanDescription desc = describe(SampleBean.class);

        AnnotatedConstructor constructor = desc.findDefaultConstructor();
        assertNotNull(constructor);
        assertFalse(desc.getConstructors().isEmpty());

        Object bean = desc.instantiateBean(true);
        assertNotNull(bean);
        assertTrue(bean instanceof SampleBean);
    }

    @Test
    public void testNoDefaultConstructor() {
        BasicBeanDescription desc = describe(NoDefaultBean.class);

        assertNull(desc.findDefaultConstructor());
        assertNull(desc.instantiateBean(true));
    }

    @Test
    public void testInstantiateBeanThrowsIllegalArgumentException() {
        BasicBeanDescription desc = describe(ThrowCtorBean.class);

        try {
            desc.instantiateBean(true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertNotNull(expected.getCause());
        }
    }

    @Test
    public void testFindAnyGetter() {
        BasicBeanDescription valid = describe(AnyGetterValid.class);
        AnnotatedMember anyGetter = valid.findAnyGetter();
        assertNotNull(anyGetter);

        BasicBeanDescription invalid = describe(AnyGetterInvalid.class);
        try {
            invalid.findAnyGetter();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testFindAnySetterValid() {
        BasicBeanDescription desc = describe(AnySetterValid.class);
        AnnotatedMember anySetter = desc.findAnySetterAccessor();
        assertNotNull(anySetter);
    }

    @Test
    public void testFindAnySetterInvalidMethod() {
        BasicBeanDescription desc = describe(AnySetterInvalidMethod.class);
        try {
            desc.findAnySetterAccessor();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testFindInjectables() {
        BasicBeanDescription desc = describe(InjectBean.class);
        Map<Object, AnnotatedMember> injectables = desc.findInjectables();
        assertNotNull(injectables);
        assertEquals(1, injectables.size());
    }

    @Test
    public void testIgnoredPropertyNames() {
        BasicBeanDescription desc = describe(SampleBean.class);
        Set<String> ignored = desc.getIgnoredPropertyNames();

        assertNotNull(ignored);
        assertTrue(ignored.contains("ignored"));
        assertFalse(ignored.contains("name"));
    }

    @Test
    public void testDefaultViewsWithInclusionDisabled() {
        mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);

        BasicBeanDescription desc = describe(ViewBean.class);
        Class<?>[] views = desc.findDefaultViews();

        assertNotNull(views);
        assertEquals(0, views.length);
        assertSame(views, desc.findDefaultViews());
    }

    @Test
    public void testDefaultViewsFromAnnotation() {
        BasicBeanDescription desc = describe(AnnotatedViewBean.class);

        Class<?>[] views = desc.findDefaultViews();
        assertNotNull(views);
        assertTrue(views.length >= 1);
        assertEquals(ViewBean.MyView.class, views[0]);
    }

    @Test
    public void testFindExpectedFormat() {
        BasicBeanDescription desc = describe(FormatBean.class);

        JsonFormat.Value format = desc.findExpectedFormat(null);
        assertNotNull(format);
        assertEquals("yyyyMMdd", format.getPattern());
    }

    @Test
    public void testConverters() {
        BasicBeanDescription serializeDesc = describe(SerializeConverterBean.class);
        assertTrue(serializeDesc.findSerializationConverter() instanceof StringListConverter);

        BasicBeanDescription deserializeDesc = describe(DeserializeConverterBean.class);
        assertTrue(deserializeDesc.findDeserializationConverter() instanceof StringListConverter);
    }

    @Test
    public void testSingleArgConstructor() throws Exception {
        BasicBeanDescription desc = describe(SingleCtorBean.class);

        Constructor<?> constructor = desc.findSingleArgConstructor(String.class);
        assertNotNull(constructor);
        assertEquals(String.class, constructor.getParameterTypes()[0]);

        assertNull(desc.findSingleArgConstructor(Integer.class));
    }

    @Test
    public void testFactoryMethod() throws Exception {
        BasicBeanDescription desc = describe(FactoryBean.class);

        Method method = desc.findFactoryMethod(String.class);
        assertNotNull(method);
        assertEquals("fromString", method.getName());
    }

    @Test
    public void testBackReferences() {
        BasicBeanDescription desc = describe(ManagedChild.class);

        List<BeanPropertyDefinition> backReferences = desc.findBackReferences();
        assertNotNull(backReferences);
        assertFalse(backReferences.isEmpty());
    }
}