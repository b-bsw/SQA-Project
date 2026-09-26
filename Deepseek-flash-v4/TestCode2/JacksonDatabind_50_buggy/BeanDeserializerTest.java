package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Test;

public class BeanDeserializerTest {

    // ----- test beans -----

    public static class Person {
        private String name;
        private int age;

        public Person() {
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

    public static class Name {
        public String first;
        public String last;
    }

    public static class UnwrappedBean {
        @JsonUnwrapped
        public Name name = new Name();
    }

    public static class Views {
        public static class Public {
        }

        public static class Internal {
        }
    }

    public static class ViewBean {
        @JsonView(Views.Public.class)
        public int publicVal;

        @JsonView(Views.Internal.class)
        public int internalVal = -1;
    }

    public static class CreatorBean {
        public final int id;
        public final String name;

        @JsonCreator
        public CreatorBean(@JsonProperty("id") int id,
                           @JsonProperty("name") String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static class AnyBean {
        public String name;
        Map<String, Object> extra = new HashMap<String, Object>();

        @JsonAnySetter
        public void setExtra(String key, Object value) {
            extra.put(key, value);
        }
    }

    @JsonIdentityInfo(property = "id")
    public static class Node {
        public int id;
        public String name;
        public Node next;
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class Point {
        public int x;
        public int y;
    }

    // ----- tests -----

    @Test
    public void testDeserializeNormalBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Person person = mapper.readValue(
                "{\"name\":\"Alice\",\"age\":30}", Person.class);

        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    public void testDeserializeNullValueReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNull(mapper.readValue("null", Person.class));
    }

    @Test
    public void testDeserializeFromArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Point point = mapper.readValue("[1,2]", Point.class);

        assertEquals(1, point.x);
        assertEquals(2, point.y);
    }

    @Test
    public void testDeserializeWithPropertyBasedCreator() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        CreatorBean bean = mapper.readValue(
                "{\"name\":\"Bob\",\"id\":5,\"extra\":true}",
                CreatorBean.class);

        assertEquals(5, bean.id);
        assertEquals("Bob", bean.name);
    }

    @Test
    public void testDeserializeWithUnwrappedProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        UnwrappedBean bean = mapper.readValue(
                "{\"first\":\"John\",\"last\":\"Doe\"}",
                UnwrappedBean.class);

        assertEquals("John", bean.name.first);
        assertEquals("Doe", bean.name.last);
    }

    @Test
    public void testDeserializeWithView() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        ViewBean bean = mapper.readerFor(ViewBean.class)
                .withView(Views.Public.class)
                .readValue("{\"publicVal\":10,\"internalVal\":20}");

        assertEquals(10, bean.publicVal);
        assertEquals(-1, bean.internalVal);
    }

    @Test
    public void testDeserializeWithAnySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        AnyBean bean = mapper.readValue(
                "{\"name\":\"x\",\"extraProp\":42}", AnyBean.class);

        assertEquals("x", bean.name);
        assertEquals(42, bean.extra.get("extraProp"));
    }

    @Test
    public void testDeserializeWithObjectIdentity() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Node node = mapper.readValue(
                "{\"id\":7,\"name\":\"root\",\"next\":7}", Node.class);

        assertNotNull(node);
        assertEquals(7, node.id);
        assertSame(node, node.next);
    }

    @Test(expected = JsonMappingException.class)
    public void testUnknownPropertyFailsByDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        mapper.readValue("{\"name\":\"x\",\"unknown\":1}", Person.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testTypeMismatchFailsWithWrappedException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        mapper.readValue("{\"age\":\"not-an-int\"}", Person.class);
    }

    @Test
    public void testCopyMethodsAndUnwrappingDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        JsonDeserializer<Object> raw = mapper.getDeserializerForType(
                mapper.getTypeFactory().constructType(Person.class),
                mapper.getDeserializationConfig());

        assertNotNull(raw);
        assertTrue("Expected BeanDeserializer, got "
                + raw.getClass().getName(), raw instanceof BeanDeserializer);

        BeanDeserializer deserializer = (BeanDeserializer) raw;

        assertNotNull(deserializer.withObjectIdReader(null));
        assertNotNull(deserializer.withIgnorableProperties(
                Collections.<String>emptySet()));

        NameTransformer nop = new NameTransformer() {
            @Override
            public String transform(String name) {
                return name;
            }

            @Override
            public String reverse(String transformed) {
                return transformed;
            }
        };

        JsonDeserializer<Object> unwrapped =
                deserializer.unwrappingDeserializer(nop);

        assertNotNull(unwrapped);
        assertTrue(unwrapped instanceof BeanDeserializer);

        BeanDeserializerBase arrayDeserializer = deserializer.asArrayDeserializer();
        assertNotNull(arrayDeserializer);
        assertTrue(arrayDeserializer instanceof BeanAsArrayDeserializer);
    }
}