package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonTypeInfo;
import com.fasterxml.jackson.core.Version;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testDefaultConstructionAndFactoryCodec() {
        assertNotNull(mapper.getFactory());
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
        assertNotNull(mapper.getTypeFactory());
        assertNotNull(mapper.version());

        JsonFactory f = new JsonFactory();
        ObjectMapper m = new ObjectMapper(f);
        assertSame(f, m.getFactory());
        assertSame(m, f.getCodec());
    }

    @Test
    public void testCopyIsIndependent() {
        mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        ObjectMapper copy = mapper.copy();
        assertNotSame(mapper, copy);
        assertTrue(copy.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        copy.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        assertTrue(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        assertFalse(copy.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
    }

    @Test(expected = IllegalStateException.class)
    public void testCopyOnSubclassFails() {
        new NonCopyableMapper().copy();
    }

    @Test
    public void testFeatureConfigurationRoundTrip() {
        assertFalse(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        assertTrue(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        assertFalse(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT);
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));

        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertTrue(mapper.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        assertFalse(mapper.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));

        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, false);
        assertFalse(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));

        assertTrue(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testBeanWriteRead() throws Exception {
        Person person = new Person("Bob", 3);
        String json = mapper.writeValueAsString(person);

        JsonNode tree = mapper.readTree(json);
        assertEquals("Bob", tree.get("name").asText());
        assertEquals(3, tree.get("age").asInt());

        Person fromString = mapper.readValue(json, Person.class);
        assertEquals("Bob", fromString.getName());
        assertEquals(3, fromString.getAge());

        byte[] bytes = mapper.writeValueAsBytes(person);
        Person fromBytes = mapper.readValue(bytes, Person.class);
        assertEquals("Bob", fromBytes.getName());

        JsonParser p = mapper.getFactory().createParser(json);
        try {
            Person fromParser = mapper.readValue(p, Person.class);
            assertEquals("Bob", fromParser.getName());
        } finally {
            p.close();
        }
    }

    @Test
    public void testNullValues() throws Exception {
        assertEquals("null", mapper.writeValueAsString(null));
        assertNull(mapper.readValue("null", Person.class));

        JsonNode nullTree = mapper.valueToTree(null);
        assertNull(nullTree);

        JsonNode n = mapper.readTree("null");
        assertNotNull(n);
        assertTrue(n.isNull());
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadEmptyThrows() throws Exception {
        mapper.readValue("", Person.class);
    }

    @Test
    public void testReadTreeParserNoContent() throws Exception {
        JsonParser p = mapper.getFactory().createParser("");
        try {
            JsonNode n = mapper.readTree(p);
            assertNull(n);
        } finally {
            p.close();
        }
    }

    @Test
    public void testReadValueMapUsesRootDeserializerCache() throws Exception {
        Map<?, ?> first = mapper.readValue("{\"a\":1}", Map.class);
        assertEquals(1, first.get("a"));

        Map<?, ?> second = mapper.readValue("{\"b\":2}", Map.class);
        assertEquals(2, second.get("b"));
    }

    @Test
    public void testWriterReader() throws Exception {
        ObjectWriter writer = mapper.writer();
        ObjectReader reader = mapper.reader();
        assertNotNull(writer);
        assertNotNull(reader);

        String json = writer.writeValueAsString(new Person("Alice", 1));
        Person p = mapper.readerFor(Person.class).readValue(json);
        assertEquals("Alice", p.getName());
        assertEquals(1, p.getAge());
    }

    @Test
    public void testValueTreeAndTreeValue() throws Exception {
        JsonNode tree = mapper.valueToTree(new Person("Bob", 3));
        assertTrue(tree.isObject());
        assertEquals("Bob", tree.get("name").asText());

        Person p = mapper.treeToValue(tree, Person.class);
        assertEquals("Bob", p.getName());

        JsonNode objectNode = mapper.createObjectNode();
        assertSame(objectNode, mapper.treeToValue(objectNode, JsonNode.class));
    }

    @Test
    public void testConvertValue() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Alice");
        map.put("age", 30);

        Person p = mapper.convertValue(map, Person.class);
        assertEquals("Alice", p.getName());
        assertEquals(30, p.getAge());

        String same = "abc";
        assertSame(same, mapper.convertValue(same, String.class));
    }

    @Test
    public void testRegisterModuleNormalAndDuplicateSuppression() {
        ObjectMapper m = new ObjectMapper();
        TestModule module = new TestModule("test", Version.unknownVersion(), "typeId");
        assertSame(m, m.registerModule(module));

        ObjectMapper dup = new ObjectMapper();
        dup.enable(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS);
        TestModule m1 = new TestModule("one", Version.unknownVersion(), "same");
        TestModule m2 = new TestModule("two", Version.unknownVersion(), "same");
        assertSame(dup, dup.registerModule(m1));
        assertSame(dup, dup.registerModule(m2));
    }

    @Test
    public void testRegisterModuleRejectsMissingNameOrVersion() {
        ObjectMapper m = new ObjectMapper();
        try {
            m.registerModule(new TestModule(null, Version.unknownVersion(), "id"));
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }

        try {
            m.registerModule(new TestModule("no-version", null, "id"));
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testCanSerializeAndCanDeserialize() {
        assertTrue(mapper.canSerialize(String.class));
        assertTrue(mapper.canDeserialize(mapper.constructType(String.class)));

        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        assertTrue(mapper.canSerialize(String.class, cause));
    }

    @Test
    public void testDefaultTypingEnableDisable() {
        assertSame(mapper, mapper.enableDefaultTyping());
        assertSame(mapper, mapper.disableDefaultTyping());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDefaultTypingExternalPropertyRejected() {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE,
                JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test
    public void testDefaultTypeResolverBuilderUseForType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType objectType = tf.constructType(Object.class);
        JavaType stringType = tf.constructType(String.class);
        JavaType listType = tf.constructType(List.class);
        JavaType jsonNodeType = tf.constructType(JsonNode.class);
        JavaType stringArrayType = tf.constructType(String[].class);
        JavaType objectArrayType = tf.constructType(Object[].class);
        JavaType nestedStringArrayType = tf.constructType(String[][].class);

        ObjectMapper.DefaultTypeResolverBuilder javaLang =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertTrue(javaLang.useForType(objectType));
        assertFalse(javaLang.useForType(stringType));

        ObjectMapper.DefaultTypeResolverBuilder objNonConcrete =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertTrue(objNonConcrete.useForType(objectType));
        assertFalse(objNonConcrete.useForType(stringType));
        assertTrue(objNonConcrete.useForType(listType));
        assertFalse(objNonConcrete.useForType(jsonNodeType));

        ObjectMapper.DefaultTypeResolverBuilder nonConcreteArrays =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertTrue(nonConcreteArrays.useForType(objectArrayType));
        assertTrue(nonConcreteArrays.useForType(listType));
        assertFalse(nonConcreteArrays.useForType(stringArrayType));
        assertFalse(nonConcreteArrays.useForType(nestedStringArrayType));

        ObjectMapper.DefaultTypeResolverBuilder nonFinal =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertTrue(nonFinal.useForType(listType));
        assertFalse(nonFinal.useForType(stringType));
        assertFalse(nonFinal.useForType(jsonNodeType));
        assertFalse(nonFinal.useForType(stringArrayType));
    }

    @Test
    public void testDefaultTypeResolverBuildReturnsNullForUnusedType() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        JavaType stringType = mapper.constructType(String.class);

        assertNull(b.buildTypeDeserializer(mapper.getDeserializationConfig(), stringType, null));
        assertNull(b.buildTypeSerializer(mapper.getSerializationConfig(), stringType, null));
    }

    @Test
    public void testReadValuesFromParser() throws Exception {
        JsonParser p = mapper.getFactory().createParser("[1,2,3]");
        try {
            MappingIterator<Integer> it = mapper.readValues(p, Integer.class);
            List<Integer> values = new ArrayList<Integer>();
            while (it.hasNext()) {
                values.add(it.next());
            }
            assertEquals(Arrays.asList(1, 2, 3), values);
        } finally {
            p.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitorNullType() throws Exception {
        mapper.acceptJsonFormatVisitor((JavaType) null, null);
    }

    public static class Person {
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    private static class TestModule extends Module {
        private final String name;
        private final Version version;
        private final Object typeId;

        TestModule(String name, Version version, Object typeId) {
            this.name = name;
            this.version = version;
            this.typeId = typeId;
        }

        @Override
        public String getModuleName() {
            return name;
        }

        @Override
        public Version version() {
            return version;
        }

        @Override
        public Object getTypeId() {
            return typeId;
        }

        @Override
        public void setupModule(Module.SetupContext context) {
        }
    }

    private static class NonCopyableMapper extends ObjectMapper {
        private static final long serialVersionUID = 1L;
    }
}