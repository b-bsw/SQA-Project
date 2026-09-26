package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.Locale;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class StringArrayDeserializerTest {

    private String[] read(String json) throws IOException {
        return new ObjectMapper().readValue(json, String[].class);
    }

    @Test
    public void testEmptyArray() throws Exception {
        assertArrayEquals(new String[0], read("[]"));
    }

    @Test
    public void testSingleElementArray() throws Exception {
        assertArrayEquals(new String[] {"value"}, read("[\"value\"]"));
    }

    @Test
    public void testNullNumericAndBooleanElements() throws Exception {
        assertArrayEquals(new String[] {"a", null, "1", "true"},
                read("[\"a\", null, 1, true]"));
    }

    @Test
    public void testLargeArrayTriggersObjectBufferGrowth() throws Exception {
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < 100; i++) {
            if (i > 0) {
                json.append(',');
            }
            json.append('"').append(i).append('"');
        }
        json.append(']');

        String[] result = read(json.toString());
        assertEquals(100, result.length);
        assertEquals("0", result[0]);
        assertEquals("99", result[99]);
    }

    @Test
    public void testAcceptSingleValueAsArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        assertArrayEquals(new String[] {"abc"},
                mapper.readValue("\"abc\"", String[].class));
    }

    @Test
    public void testEmptyStringAsNullObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        assertNull(mapper.readValue("\"\"", String[].class));
    }

    @Test(expected = JsonMappingException.class)
    public void testNonEmptyStringWithEmptyStringAsNullObjectStillThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.readValue("\"x\"", String[].class);
    }

    @Test(expected = JsonMappingException.class)
    public void testObjectWithoutSingleValueAsArrayThrows() throws Exception {
        read("{}");
    }

    @Test(expected = JsonMappingException.class)
    public void testArrayWithObjectElementThrows() throws Exception {
        read("[{}]");
    }

    @Test
    public void testCustomStringDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule("upper", Version.unknownVersion());
        module.addDeserializer(String.class, new UpperCaseStringDeserializer());
        mapper.registerModule(module);

        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < 100; i++) {
            if (i > 0) {
                json.append(',');
            }
            json.append('"').append("s").append(i).append('"');
        }
        json.append(",null]");

        String[] result = mapper.readValue(json.toString(), String[].class);
        assertEquals(101, result.length);
        assertEquals("S0", result[0]);
        assertEquals("NULL", result[100]);
    }

    @Test
    public void testDeserializeWithTypeDelegatesToTypeDeserializer() throws Exception {
        StringArrayDeserializer deserializer = new StringArrayDeserializer();
        JsonParser parser = new ObjectMapper().getFactory().createParser("[]");
        try {
            Object result = deserializer.deserializeWithType(parser, null, new StubTypeDeserializer());
            assertArrayEquals(new String[] {"typed-array"}, (String[]) result);
        } finally {
            parser.close();
        }
    }

    static class UpperCaseStringDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return p.getText().toUpperCase(Locale.ROOT);
        }

        @Override
        public String getNullValue() {
            return "NULL";
        }
    }

    static class StubTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(BeanProperty property) {
            return this;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            return new String[] {"typed-array"};
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }
}