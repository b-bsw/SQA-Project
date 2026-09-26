package com.fasterxml.jackson.databind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectMapperTest {

    private static class NotOverridingObjectMapper extends ObjectMapper {
        private static final long serialVersionUID = 1L;

        NotOverridingObjectMapper() {
            super();
        }
    }

    @Test
    public void testConstructionAndVersion() {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull(mapper.version());
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
        assertNotNull(mapper.writer());
        assertNotNull(mapper.reader());

        ObjectMapper copy = mapper.copy();
        assertNotSame(mapper, copy);
    }

    @Test
    public void testCopyFromSubclassWithoutOverrideThrows() {
        ObjectMapper sub = new NotOverridingObjectMapper();
        try {
            sub.copy();
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testConfigToggles() {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        assertTrue(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        assertFalse(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT);
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testSerializationRoundTrip() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Integer> input = new LinkedHashMap<String, Integer>();
        input.put("a", 1);

        String json = mapper.writeValueAsString(input);
        assertEquals("{\"a\":1}", json);

        Object raw = mapper.readValue(json, Map.class);
        assertTrue(raw instanceof Map);
        Map<?, ?> output = (Map<?, ?>) raw;
        assertEquals(Integer.valueOf(1), output.get("a"));
    }

    @Test
    public void testTreeAndConversion() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode objectNode = mapper.readTree("{\"x\":2}");
        assertTrue(objectNode.isObject());
        assertEquals(2, objectNode.get("x").asInt());

        assertTrue(mapper.readTree("null").isNull());

        JsonNode numberNode = mapper.valueToTree(42);
        assertTrue(numberNode.isNumber());
        assertEquals(42, mapper.treeToValue(numberNode, Integer.class).intValue());

        String text = "abc";
        assertSame(text, mapper.convertValue(text, String.class));
        assertNull(mapper.convertValue(null, String.class));
    }

    @Test
    public void testRegisterModuleValidation() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.registerModule(moduleWithNullName());
            fail("Expected IllegalArgumentException for null module name");
        } catch (IllegalArgumentException expected) {
        }

        try {
            mapper.registerModule(moduleWithNullVersion());
            fail("Expected IllegalArgumentException for null module version");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTypingRejectsExternalProperty() {
        new ObjectMapper().enableDefaultTyping(
                ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE,
                JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test
    public void testDefaultTypeResolverUseForType() {
        TypeFactory tf = TypeFactory.defaultInstance();

        assertUseForType(tf, ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, Object.class, true);
        assertUseForType(tf, ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, String.class, false);

        assertUseForType(tf, ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, Object.class, true);
        assertUseForType(tf, ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, String.class, false);
        assertUseForType(tf, ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, List.class, true);
        assertUseForType(tf, ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonNode.class, false);

        assertUseForType(tf, ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS, List.class, true);
        assertUseForType(tf, ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS, Object[].class, true);
        assertUseForType(tf, ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS, String[].class, false);

        assertUseForType(tf, ObjectMapper.DefaultTyping.NON_FINAL, String.class, false);
        assertUseForType(tf, ObjectMapper.DefaultTyping.NON_FINAL, StringBuilder.class, true);
        assertUseForType(tf, ObjectMapper.DefaultTyping.NON_FINAL, JsonNode.class, false);
    }

    @Test(expected = JsonProcessingException.class)
    public void testEmptyInputThrows() throws Exception {
        new ObjectMapper().readValue("", String.class);
    }

    @Test
    public void testAcceptJsonFormatVisitorRequiresType() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.acceptJsonFormatVisitor((JavaType) null, (JsonFormatVisitorWrapper) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMixInSupport() {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(0, mapper.mixInCount());

        mapper.addMixIn(String.class, Comparable.class);
        assertEquals(1, mapper.mixInCount());
        assertSame(Comparable.class, mapper.findMixInClassFor(String.class));
        assertNull(mapper.findMixInClassFor(Integer.class));
    }

    private static void assertUseForType(TypeFactory tf,
            ObjectMapper.DefaultTyping dti, Class<?> cls, boolean expected) {
        JavaType type = tf.constructType(cls);
        boolean actual = new ObjectMapper.DefaultTypeResolverBuilder(dti).useForType(type);
        if (expected) {
            assertTrue("Expected useForType true for " + cls + " with " + dti, actual);
        } else {
            assertFalse("Expected useForType false for " + cls + " with " + dti, actual);
        }
    }

    private static Module moduleWithNullName() {
        return new Module() {
            @Override
            public String getModuleName() {
                return null;
            }

            @Override
            public Version version() {
                return Version.unknownVersion();
            }

            @Override
            public void setupModule(Module.SetupContext context) {
            }
        };
    }

    private static Module moduleWithNullVersion() {
        return new Module() {
            @Override
            public String getModuleName() {
                return "test-module";
            }

            @Override
            public Version version() {
                return null;
            }

            @Override
            public void setupModule(Module.SetupContext context) {
            }
        };
    }
}