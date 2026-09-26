package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;

public class StringArrayDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private static class MockDeserializationContext extends DefaultDeserializationContext.Impl {
        private final JsonDeserializer<?> customDeser;
        private final boolean useDefault;

        MockDeserializationContext(DeserializationConfig config, JsonDeserializer<?> customDeser, boolean useDefault) {
            super(config, 0);
            this.customDeser = customDeser;
            this.useDefault = useDefault;
        }

        @Override
        public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException {
            if (customDeser != null) return (JsonDeserializer<Object>) customDeser;
            return (JsonDeserializer<Object>) com.fasterxml.jackson.databind.deser.std.StringDeserializer.instance;
        }

        @Override
        public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty prop) throws JsonMappingException {
            return deser;
        }

        @Override
        public JavaType constructType(Class<?> cls) {
            return TypeFactory.defaultInstance().constructType(cls);
        }
    }

    @Test
    public void testDeserializeEmptyArray() throws Exception {
        String[] result = mapper.readValue("[]", String[].class);
        assertEquals(0, result.length);
    }

    @Test
    public void testDeserializeStringArray() throws Exception {
        String[] result = mapper.readValue("[\"a\",\"b\"]", String[].class);
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testDeserializeArrayWithNonString() throws Exception {
        String[] result = mapper.readValue("[123, true, 2.5]", String[].class);
        assertArrayEquals(new String[]{"123", "true", "2.5"}, result);
    }

    @Test
    public void testDeserializeSingleStringAsArrayEnabled() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String[] result = localMapper.readValue("\"single\"", String[].class);
        assertArrayEquals(new String[]{"single"}, result);
    }

    @Test
    public void testDeserializeSingleStringAsArrayDisabled() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        try {
            localMapper.readValue("\"single\"", String[].class);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeEmptyStringAsNullObjectEnabled() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        localMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String[] result = localMapper.readValue("\"\"", String[].class);
        assertNull(result);
    }

    @Test
    public void testDeserializeNullAsArrayEnabled() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String[] result = localMapper.readValue("null", String[].class);
        assertArrayEquals(new String[]{null}, result);
    }

    @Test(expected = NullPointerException.class)
    public void testDeserializeArrayWithNullDefault() throws Exception {
        // Default inline path has bug: _elementDeserializer is null, causing NPE on getNullValue().
        mapper.readValue("[null]", String[].class);
    }

    @Test
    public void testDeserializeCustomDeserializer() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        final StringArrayDeserializer customDeser = new StringArrayDeserializer(new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom:" + p.getText();
            }

            @Override
            public String getNullValue() {
                return "nullCustom";
            }
        });
        module.addDeserializer(String[].class, customDeser);
        localMapper.registerModule(module);

        // Large array (20 elements) to trigger chunk expansion, and includes null
        int size = 20;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(",");
            if (i == size / 2) {
                sb.append("null");
            } else {
                sb.append("\"").append(i).append("\"");
            }
        }
        sb.append("]");
        String[] result = localMapper.readValue(sb.toString(), String[].class);
        assertEquals(size, result.length);
        for (int i = 0; i < size; i++) {
            if (i == size / 2) {
                assertEquals("nullCustom", result[i]);
            } else {
                assertEquals("custom:" + i, result[i]);
            }
        }
    }

    @Test
    public void testDeserializeLargeArray() throws Exception {
        int size = 20;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(",");
            sb.append("\"").append(i).append("\"");
        }
        sb.append("]");
        String[] result = mapper.readValue(sb.toString(), String[].class);
        assertEquals(size, result.length);
        for (int i = 0; i < size; i++) {
            assertEquals(String.valueOf(i), result[i]);
        }
    }

    @Test
    public void testDeserializeWithType() throws IOException {
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonFactory jf = new JsonFactory();
        JsonParser jp = jf.createParser("[]");
        jp.nextToken(); // START_ARRAY
        ObjectMapper localMapper = new ObjectMapper();
        MockDeserializationContext ctxt = new MockDeserializationContext(localMapper.getDeserializationConfig(), null, true);
        TypeDeserializer typeDeser = new TypeDeserializer() {
            @Override
            public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "typed";
            }

            @Override
            public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override
            public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override
            public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override
            public TypeSerializer getTypeSerializer() { throw new UnsupportedOperationException(); }
            @Override
            public String getPropertyName() { throw new UnsupportedOperationException(); }
            @Override
            public TypeIdResolver getTypeIdResolver() { throw new UnsupportedOperationException(); }
        };
        Object result = deser.deserializeWithType(jp, ctxt, typeDeser);
        assertEquals("typed", result);
    }

    @Test
    public void testCreateContextualReturnsSameInstance() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        MockDeserializationContext ctxt = new MockDeserializationContext(localMapper.getDeserializationConfig(), null, true);
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonDeserializer<?> result = deser.createContextual(ctxt, null);
        assertSame(deser, result);
    }

    @Test
    public void testCreateContextualReturnsNewInstance() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        JsonDeserializer<String> customDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom";
            }

            @Override
            public String getNullValue() {
                return "nullCustom";
            }
        };
        MockDeserializationContext ctxt = new MockDeserializationContext(localMapper.getDeserializationConfig(), customDeser, false);
        StringArrayDeserializer deser = new StringArrayDeserializer();
        JsonDeserializer<?> result = deser.createContextual(ctxt, null);
        assertNotSame(deser, result);
        assertTrue(result instanceof StringArrayDeserializer);
        StringArrayDeserializer newDeser = (StringArrayDeserializer) result;
        assertNotNull(newDeser._elementDeserializer);
    }
}