package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

public class JsonValueSerializerTest {

    static class NoopSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("noop");
        }
    }

    public static class SimpleBean {
        private final String value;
        public SimpleBean(String value) { this.value = value; }
        @JsonValue
        public String value() { return value; }
    }

    public static class NonFinalBean {
        @JsonValue
        public NonFinalResult value() { return new NonFinalResult(); }
    }

    public static class NonFinalResult { }

    public static class ThrowingBean {
        @JsonValue
        public String value() { throw new IllegalStateException("boom"); }
    }

    public enum SimpleEnum {
        A("alpha"), B("beta");
        private final String label;
        SimpleEnum(String label) { this.label = label; }
        @JsonValue
        public String label() { return label; }
    }

    static class TestStringFormatVisitor implements JsonStringFormatVisitor {
        Set<String> enums;
        public void enumTypes(Set<String> enums) { this.enums = new LinkedHashSet<String>(enums); }
        public void format(JsonValueFormat format) { }
    }

    private static AnnotatedMethod accessor(Class<?> cls, String method) {
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass annotated = mapper.getSerializationConfig().introspect(mapper.getTypeFactory().constructType(cls));
        AnnotatedMethod m = annotated.findMethod(method, new Class<?>[0]);
        if (m == null) {
            throw new IllegalStateException("No method " + method + " on " + cls);
        }
        return m;
    }

    private static JsonFormatVisitorWrapper formatVisitor(final SerializerProvider provider,
            final TestStringFormatVisitor stringVisitor, final boolean[] calledString) {
        return (JsonFormatVisitorWrapper) Proxy.newProxyInstance(
                JsonFormatVisitorWrapper.class.getClassLoader(),
                new Class<?>[] { JsonFormatVisitorWrapper.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        if (method.getName().equals("expectStringFormat")) {
                            calledString[0] = true;
                            return stringVisitor;
                        }
                        if (method.getName().equals("getProvider")) {
                            return provider;
                        }
                        if (method.getName().equals("setProvider")) {
                            return null;
                        }
                        if (method.getName().equals("toString")) {
                            return "TestFormatVisitorWrapper";
                        }
                        if (method.getName().equals("hashCode")) {
                            return System.identityHashCode(proxy);
                        }
                        if (method.getName().equals("equals")) {
                            return (args != null) && (args.length == 1) && (proxy == args[0]);
                        }
                        return null;
                    }
                });
    }

    @Test
    public void testConstructorAndToString() {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), null);
        assertNotNull(ser);
        assertTrue(ser.toString().contains("SimpleBean"));
        assertTrue(ser.toString().contains("value"));
    }

    @Test
    public void testSerializeNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), null);
        StringWriter out = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(out);
        ser.serialize(new SimpleBean(null), gen, mapper.getSerializerProvider());
        gen.flush();
        assertEquals("null", out.toString());
        gen.close();
    }

    @Test
    public void testSerializeWithoutValueSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), null);
        StringWriter out = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(out);
        ser.serialize(new SimpleBean("hello"), gen, mapper.getSerializerProvider());
        gen.flush();
        assertEquals("\"hello\"", out.toString());
        gen.close();
    }

    @Test
    public void testSerializeWithValueSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), new NoopSerializer());
        StringWriter out = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(out);
        ser.serialize(new SimpleBean("hello"), gen, mapper.getSerializerProvider());
        gen.flush();
        assertEquals("\"noop\"", out.toString());
        gen.close();
    }

    @Test
    public void testSerializeWrapsAccessorException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(ThrowingBean.class, "value"), null);
        StringWriter out = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(out);
        try {
            ser.serialize(new ThrowingBean(), gen, mapper.getSerializerProvider());
            fail("Should throw JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("value()"));
        } finally {
            gen.close();
        }
    }

    @Test
    public void testWithResolved() {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), null);
        assertSame(ser, ser.withResolved(null, null, ser._forceTypeInformation));
        JsonValueSerializer changed = ser.withResolved(null, null, !ser._forceTypeInformation);
        assertNotSame(ser, changed);
        assertNull(changed._valueSerializer);
        assertFalse(changed._forceTypeInformation);
    }

    @Test
    public void testCreateContextualResolvesFinalType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), null);
        JsonSerializer<?> contextual = ser.createContextual(mapper.getSerializerProvider(), null);
        assertTrue(contextual instanceof JsonValueSerializer);
        JsonValueSerializer resolved = (JsonValueSerializer) contextual;
        assertNotNull(resolved._valueSerializer);
        assertNotSame(ser, contextual);
    }

    @Test
    public void testCreateContextualReturnsSameForNonFinal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(NonFinalBean.class, "value"), null);
        assertSame(ser, ser.createContextual(mapper.getSerializerProvider(), null));
    }

    @Test
    public void testCreateContextualWithExistingSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), new NoopSerializer());
        JsonSerializer<?> contextual = ser.createContextual(mapper.getSerializerProvider(), null);
        assertNotNull(contextual);
    }

    @Test
    public void testGetSchema() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), new NoopSerializer());
        JsonNode schema = ser.getSchema(mapper.getSerializerProvider(), null);
        assertNotNull(schema);
    }

    @Test
    public void testAcceptJsonFormatVisitorNonEnum() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleBean.class, "value"), null);
        TestStringFormatVisitor stringVisitor = new TestStringFormatVisitor();
        boolean[] calledString = { false };
        JsonFormatVisitorWrapper visitor = formatVisitor(mapper.getSerializerProvider(), stringVisitor, calledString);
        ser.acceptJsonFormatVisitor(visitor, null);
        assertTrue(calledString[0]);
    }

    @Test
    public void testAcceptJsonFormatVisitorEnum() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonValueSerializer ser = new JsonValueSerializer(accessor(SimpleEnum.class, "label"), null);
        TestStringFormatVisitor stringVisitor = new TestStringFormatVisitor();
        boolean[] calledString = { false };
        JsonFormatVisitorWrapper visitor = formatVisitor(mapper.getSerializerProvider(), stringVisitor, calledString);
        ser.acceptJsonFormatVisitor(visitor, null);
        assertTrue(calledString[0]);
        assertEquals(new LinkedHashSet<String>(Arrays.asList("alpha", "beta")), stringVisitor.enums);
    }

    @Test
    public void testSerializeWithTypeViaDefaultTyping() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.WRAPPER_ARRAY);
        String json = mapper.writeValueAsString(new SimpleBean("abc"));
        assertTrue(json.contains("\"abc\""));
    }
}