package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExternalTypeHandlerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    public static class Value {
        public String common;
    }

    @JsonTypeName("alpha")
    public static class Alpha extends Value {
        public int a;
    }

    @JsonTypeName("beta")
    public static class Beta extends Value {
        public int b;
    }

    public static class Container {
        public String id;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
                      include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
                      property = "type")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Alpha.class, name = "alpha"),
            @JsonSubTypes.Type(value = Beta.class, name = "beta")
        })
        public Value value;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
                  include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
                  property = "type",
                  defaultImpl = Alpha.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(value = Alpha.class, name = "alpha")
    })
    public static class DefaultContainer {
        public Value value;
    }

    public static class NaturalContainer {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
                      include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
                      property = "type")
        public Object value;
    }

    @Test
    public void testBuilderFactoryCreatesBuilder() {
        JavaType type = mapper.getTypeFactory().constructType(Container.class);
        assertNotNull(ExternalTypeHandler.builder(type));
    }

    @Test
    public void testTypeIdBeforeValue() throws Exception {
        Container c = mapper.readValue(
                "{\"id\":\"c1\",\"type\":\"alpha\",\"value\":{\"common\":\"c\",\"a\":7}}",
                Container.class);

        assertNotNull(c);
        assertEquals("c1", c.id);
        assertTrue(c.value instanceof Alpha);

        Alpha a = (Alpha) c.value;
        assertEquals("c", a.common);
        assertEquals(7, a.a);
    }

    @Test
    public void testValueBeforeTypeId() throws Exception {
        Container c = mapper.readValue(
                "{\"id\":\"c2\",\"value\":{\"common\":\"d\",\"b\":9},\"type\":\"beta\"}",
                Container.class);

        assertNotNull(c);
        assertEquals("c2", c.id);
        assertTrue(c.value instanceof Beta);

        Beta b = (Beta) c.value;
        assertEquals("d", b.common);
        assertEquals(9, b.b);
    }

    @Test
    public void testMissingBothTypeAndValueUsesNull() throws Exception {
        Container c = mapper.readValue("{\"id\":\"empty\"}", Container.class);

        assertNotNull(c);
        assertEquals("empty", c.id);
        assertNull(c.value);
    }

    @Test
    public void testMissingTypeIdFallsBackToDefaultType() throws Exception {
        DefaultContainer c = mapper.readValue(
                "{\"value\":{\"common\":\"def\",\"a\":4}}",
                DefaultContainer.class);

        assertNotNull(c);
        assertTrue(c.value instanceof Alpha);

        Alpha a = (Alpha) c.value;
        assertEquals("def", a.common);
        assertEquals(4, a.a);
    }

    @Test(expected = JsonMappingException.class)
    public void testMissingTypeIdWithoutDefaultFails() throws Exception {
        mapper.readValue("{\"value\":{\"common\":\"boom\"}}", Container.class);
    }

    @Test
    public void testMissingValuePropertyWithTypeIdWhenFeatureDisabled() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.disable(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY);

        Container c = m.readValue("{\"type\":\"alpha\"}", Container.class);

        assertNotNull(c);
        assertNull(c.value);
    }

    @Test
    public void testMissingValuePropertyWithTypeIdWhenFeatureEnabledFails() throws Exception {
        ObjectMapper m = new ObjectMapper();
        m.enable(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY);

        try {
            m.readValue("{\"type\":\"alpha\"}", Container.class);
            fail("Expected JsonMappingException because value property is missing");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testNaturalScalarValueWithoutTypeId() throws Exception {
        NaturalContainer c = mapper.readValue("{\"value\":\"plain\"}", NaturalContainer.class);

        assertNotNull(c);
        assertEquals("plain", c.value);
    }

    @Test
    public void testRootNull() throws Exception {
        Container c = mapper.readValue("null", Container.class);
        assertNull(c);
    }

    @Test
    public void testEmptyObject() throws Exception {
        Container c = mapper.readValue("{}", Container.class);

        assertNotNull(c);
        assertNull(c.value);
    }
}