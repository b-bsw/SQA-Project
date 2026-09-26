package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;

public class SerializerProviderTest {

    private ObjectMapper mapper;
    private SerializerProvider provider;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        provider = mapper.getSerializerProvider();
    }

    private JsonGenerator generator(StringWriter writer) throws Exception {
        return mapper.getFactory().createGenerator(writer);
    }

    @Test
    public void testDefaultSerializeNullWritesNull() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = generator(writer);

        provider.defaultSerializeNull(gen);
        gen.flush();

        assertEquals("null", writer.toString());
        gen.close();
    }

    @Test
    public void testSetNullValueSerializerAffectsDefaultNull() throws Exception {
        JsonSerializer<Object> customNull = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers)
                    throws IOException {
                gen.writeString("custom-null-value");
            }
        };

        provider.setNullValueSerializer(customNull);

        assertSame(customNull, provider.getDefaultNullValueSerializer());

        StringWriter writer = new StringWriter();
        JsonGenerator gen = generator(writer);

        provider.defaultSerializeNull(gen);
        gen.flush();

        assertEquals("\"custom-null-value\"", writer.toString());
        gen.close();
    }

    @Test
    public void testSetNullKeySerializerUpdatesDefault() {
        JsonSerializer<Object> customKey = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers)
                    throws IOException {
                gen.writeString("key");
            }
        };

        provider.setNullKeySerializer(customKey);

        assertSame(customKey, provider.getDefaultNullKeySerializer());
    }

    @Test
    public void testNullValueSerializerRejectsNull() {
        try {
            provider.setNullValueSerializer(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testNullKeySerializerRejectsNull() {
        try {
            provider.setNullKeySerializer(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testDefaultKeySerializerRejectsNull() {
        try {
            provider.setDefaultKeySerializer(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testDefaultSerializeValueWritesValue() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = generator(writer);

        gen.writeStartObject();
        gen.writeFieldName("value");
        provider.defaultSerializeValue("abc", gen);
        gen.writeEndObject();

        gen.flush();

        assertEquals("{\"value\":\"abc\"}", writer.toString());
        gen.close();
    }

    @Test
    public void testDefaultSerializeFieldWritesFieldAndValue() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = generator(writer);

        gen.writeStartObject();
        provider.defaultSerializeField("name", "value", gen);
        gen.writeEndObject();

        gen.flush();

        assertEquals("{\"name\":\"value\"}", writer.toString());
        gen.close();
    }

    @Test
    public void testDefaultSerializeFieldWritesNullValue() throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = generator(writer);

        gen.writeStartObject();
        provider.defaultSerializeField("maybe", null, gen);
        gen.writeEndObject();

        gen.flush();

        assertEquals("{\"maybe\":null}", writer.toString());
        gen.close();
    }

    @Test
    public void testFindValueSerializerFindsStringSerializer() throws Exception {
        assertNotNull(provider.findValueSerializer(String.class, null));
    }

    @Test
    public void testFindValueSerializerRejectsNullJavaType() throws Exception {
        try {
            provider.findValueSerializer((JavaType) null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testMappingExceptionFormatsMessage() {
        JsonMappingException exception = provider.mappingException("Problem with %s", "value");
        assertTrue(exception.getMessage().contains("Problem with value"));
    }

    @Test
    public void testSetAttributeIsReadable() {
        SerializerProvider updated = provider.setAttribute("key", "value");
        assertEquals("value", updated.getAttribute("key"));
    }

    @Test
    public void testIsUnknownTypeSerializerHandlesNull() {
        assertTrue(provider.isUnknownTypeSerializer(null));
    }
}