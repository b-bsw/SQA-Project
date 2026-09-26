package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;

import org.junit.Test;

public class ObjectReaderTest {

    public static class Bean {
        public int id;
        public String name;
        public Bean() { }
    }

    private ObjectReader beanReader() {
        return new ObjectMapper().reader().forType(Bean.class);
    }

    @Test
    public void testVersionAndBasicAccessors() {
        ObjectReader reader = new ObjectMapper().reader();
        assertNotNull(reader.version());
        assertNotNull(reader.getFactory());
        assertNotNull(reader.getConfig());
        assertNotNull(reader.getTypeFactory());
    }

    @Test
    public void testFeatureMutationsReturnNewReader() {
        ObjectReader base = new ObjectMapper().reader();

        ObjectReader withUnknown = base.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotSame(base, withUnknown);
        assertTrue(withUnknown.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader withoutUnknown = withUnknown.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(withoutUnknown.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader withComments = base.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(withComments.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testReadValueFromString() throws Exception {
        Bean bean = beanReader().readValue("{\"id\":7,\"name\":\"seven\"}");
        assertEquals(7, bean.id);
        assertEquals("seven", bean.name);
    }

    @Test
    public void testReadValueWithTypeReference() throws Exception {
        ObjectReader reader = new ObjectMapper().reader()
                .forType(new TypeReference<Bean>() {});
        Bean bean = reader.readValue("{\"id\":8,\"name\":\"eight\"}");
        assertEquals(8, bean.id);
    }

    @Test
    public void testReadValueWithJavaType() throws Exception {
        JavaType type = new ObjectMapper().getTypeFactory().constructType(Bean.class);
        Bean bean = new ObjectMapper().reader().forType(type)
                .readValue("{\"id\":9,\"name\":\"nine\"}");
        assertEquals(9, bean.id);
    }

    @Test
    public void testReadValueFromJsonParser() throws Exception {
        try (JsonParser parser = new JsonFactory().createParser("{\"id\":10,\"name\":\"ten\"}")) {
            Bean bean = beanReader().readValue(parser);
            assertEquals(10, bean.id);
        }
    }

    @Test
    public void testReadValueFromBytesAndStreams() throws Exception {
        Bean bean;

        bean = beanReader().readValue("{\"id\":11}".getBytes("UTF-8"));
        assertEquals(11, bean.id);

        byte[] bytes = "{\"id\":12}".getBytes("UTF-8");
        bean = beanReader().readValue(bytes, 0, bytes.length);
        assertEquals(12, bean.id);

        bean = beanReader().readValue(new ByteArrayInputStream("{\"id\":13}".getBytes("UTF-8")));
        assertEquals(13, bean.id);

        bean = beanReader().readValue(new StringReader("{\"id\":14,\"name\":\"x\"}"));
        assertEquals(14, bean.id);

        DataInput input = new DataInputStream(
                new ByteArrayInputStream("{\"id\":15}".getBytes("UTF-8")));
        bean = beanReader().readValue(input);
        assertEquals(15, bean.id);
    }

    @Test
    public void testReadValueFromFileAndUrl() throws Exception {
        File file = File.createTempFile("object-reader", ".json");
        try {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("{\"id\":16,\"name\":\"file\"}");
            }

            Bean bean = beanReader().readValue(file);
            assertEquals(16, bean.id);

            bean = beanReader().readValue(file.toURI().toURL());
            assertEquals(16, bean.id);
        } finally {
            file.delete();
        }
    }

    @Test
    public void testReadTree() throws Exception {
        ObjectReader reader = new ObjectMapper().reader();

        JsonNode obj = reader.readTree("{\"a\":1}");
        assertEquals("1", obj.get("a").asText());

        JsonNode arr = reader.readTree(new StringReader("[1,2,3]"));
        assertEquals(3, arr.size());

        JsonNode stream = reader.readTree(new ByteArrayInputStream("{\"b\":true}".getBytes("UTF-8")));
        assertTrue(stream.get("b").asBoolean());

        JsonNode commented = reader
                .with(JsonParser.Feature.ALLOW_COMMENTS)
                .readTree("/* comment */ {\"c\":2}");
        assertEquals(2, commented.get("c").asInt());
    }

    @Test
    public void testReadValues() throws Exception {
        MappingIterator<Bean> iterator = new ObjectMapper().reader()
                .forType(Bean.class)
                .readValues("{\"id\":1} {\"id\":2}");

        List<Bean> beans = new ArrayList<Bean>();
        while (iterator.hasNext()) {
            beans.add(iterator.next());
        }

        assertEquals(2, beans.size());
        assertEquals(1, beans.get(0).id);
        assertEquals(2, beans.get(1).id);
    }

    @Test
    public void testReadValuesEmpty() throws Exception {
        MappingIterator<Bean> iterator = new ObjectMapper().reader()
                .forType(Bean.class)
                .readValues("");

        assertNotNull(iterator);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testWithValueToUpdate() throws Exception {
        Bean existing = new Bean();
        Bean result = new ObjectMapper().reader()
                .withValueToUpdate(existing)
                .readValue("{\"id\":20,\"name\":\"updated\"}");

        assertSame(existing, result);
        assertEquals(20, existing.id);
        assertEquals("updated", existing.name);
    }

    @Test
    public void testAtPointer() throws Exception {
        JsonNode node = new ObjectMapper().reader()
                .at("/a/b")
                .readTree("{\"a\":{\"b\":42}}");

        assertEquals(42, node.asInt());
    }

    @Test(expected = JsonProcessingException.class)
    public void testMalformedInputFails() throws Exception {
        beanReader().readValue("{");
    }
}