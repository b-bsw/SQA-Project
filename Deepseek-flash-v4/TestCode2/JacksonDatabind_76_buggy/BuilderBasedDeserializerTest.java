package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BuilderBasedDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @JsonDeserialize(builder = SampleBuilder.class)
    public static class Sample {
        public int value;
        public Sample() { }
        public Sample(int v) { value = v; }
    }

    public static class SampleBuilder {
        private int value;
        public SampleBuilder withValue(int v) { this.value = v; return this; }
        public Sample build() { return new Sample(value); }
    }

    @JsonDeserialize(builder = ThrowingBuilder.class)
    public static class Throwing {
    }

    public static class ThrowingBuilder {
        public Throwing build() {
            throw new IllegalStateException("boom");
        }
    }

    private BuilderBasedDeserializer getBuilderDeserializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(Sample.class);
        JsonDeserializer<Object> d = mapper.getDeserializationContext().findRootValueDeserializer(type);
        assertTrue("Expected BuilderBasedDeserializer but got " + d.getClass().getName(), d instanceof BuilderBasedDeserializer);
        return (BuilderBasedDeserializer) d;
    }

    @Test
    public void testDeserializeStartObjectNormal() throws Exception {
        Sample result = mapper.readValue("{\"value\":3}", Sample.class);
        assertEquals(3, result.value);
    }

    @Test
    public void testDeserializeBoundaryIntegerValues() throws Exception {
        Sample min = mapper.readValue("{\"value\":-2147483648}", Sample.class);
        Sample max = mapper.readValue("{\"value\":2147483647}", Sample.class);
        assertEquals(Integer.MIN_VALUE, min.value);
        assertEquals(Integer.MAX_VALUE, max.value);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeStringTokenFails() throws Exception {
        mapper.readValue("\"value\"", Sample.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNumberIntTokenFails() throws Exception {
        mapper.readValue("42", Sample.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeNumberFloatTokenFails() throws Exception {
        mapper.readValue("4.25", Sample.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeBooleanTokenFails() throws Exception {
        mapper.readValue("true", Sample.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeArrayTokenFails() throws Exception {
        mapper.readValue("[1,2]", Sample.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testEmptyContentFails() throws Exception {
        mapper.readValue("", Sample.class);
    }

    @Test
    public void testNullContentRejected() throws Exception {
        try {
            mapper.readValue((String) null, Sample.class);
            fail("Expected exception for null input");
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void testUnknownPropertyFailsByDefault() throws Exception {
        mapper.readValue("{\"unknown\":1}", Sample.class);
    }

    @Test
    public void testDeserializeObjectIgnoresUnknownWhenConfigured() throws Exception {
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Sample result = mapper.readValue("{\"value\":4,\"extra\":true}", Sample.class);
        assertEquals(4, result.value);
    }

    @Test
    public void testBuildExceptionPropagates() throws Exception {
        try {
            mapper.readValue("{}", Throwing.class);
            fail("Expected build failure");
        } catch (Exception e) {
            boolean foundBoom = false;
            Throwable t = e;
            while (t != null) {
                if ("boom".equals(t.getMessage())) {
                    foundBoom = true;
                    break;
                }
                t = t.getCause();
            }
            assertTrue("Expected boom in exception chain but got " + e, foundBoom);
        }
    }

    @Test
    public void testUnwrappingDeserializerReturnsBuilderBased() throws Exception {
        BuilderBasedDeserializer d = getBuilderDeserializer();
        JsonDeserializer<Object> unwrapped = d.unwrappingDeserializer(NameTransformer.simpleTransformer("", ""));
        assertTrue(unwrapped instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testWithObjectIdReaderReturnsBuilderBased() throws Exception {
        BuilderBasedDeserializer d = getBuilderDeserializer();
        BeanDeserializerBase result = d.withObjectIdReader(null);
        assertNotNull(result);
        assertTrue(result instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testWithIgnorablePropertiesReturnsBuilderBased() throws Exception {
        BuilderBasedDeserializer d = getBuilderDeserializer();
        BeanDeserializerBase result = d.withIgnorableProperties(Collections.<String>singleton("ignored"));
        assertNotNull(result);
        assertTrue(result instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testWithBeanPropertiesReturnsBuilderBased() throws Exception {
        BuilderBasedDeserializer d = getBuilderDeserializer();
        BeanPropertyMap props = d._beanProperties;
        assertNotNull(props);
        BeanDeserializerBase result = d.withBeanProperties(props);
        assertNotNull(result);
        assertTrue(result instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testAsArrayDeserializerReturnsBeanAsArrayBuilder() throws Exception {
        BuilderBasedDeserializer d = getBuilderDeserializer();
        assertTrue(d.asArrayDeserializer() instanceof BeanAsArrayBuilderDeserializer);
    }

    @Test
    public void testDeserializeWithExistingBuilder() throws Exception {
        BuilderBasedDeserializer d = getBuilderDeserializer();
        JsonParser p = mapper.getFactory().createParser("{\"value\":7}");
        try {
            assertEquals(JsonToken.START_OBJECT, p.nextToken());
            Object result = d.deserialize(p, mapper.getDeserializationContext(), new SampleBuilder());
            assertTrue(result instanceof Sample);
            assertEquals(7, ((Sample) result).value);
        } finally {
            p.close();
        }
    }
}