package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;

import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonMappingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnyGetterWriterTest {

    private ObjectMapper mapper;
    private SerializerProvider provider;
    private StringWriter sw;
    private JsonGenerator gen;

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        provider = mapper.getSerializerProvider();
        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        gen.writeStartObject();
    }

    @After
    public void tearDown() throws Exception {
        if (gen != null) {
            gen.close();
        }
    }

    public static class MapBean {
        private final Object value;
        public MapBean(Object value) {
            this.value = value;
        }
        public Object getValue() {
            return value;
        }
    }

    private AnnotatedMethod getValueAccessor() throws Exception {
        Method method = MapBean.class.getMethod("getValue");
        return new AnnotatedMethod(null, method, null, null);
    }

    private AnyGetterWriter newWriter(MapSerializer serializer) throws Exception {
        return new AnyGetterWriter(null, getValueAccessor(), serializer);
    }

    private Map<String, String> mapOf(String key, String value) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put(key, value);
        return map;
    }

    @Test
    public void testGetAndSerializeNullValueIsNoOp() throws Exception {
        AnyGetterWriter writer = newWriter(MapSerializer.instance);

        writer.getAndSerialize(new MapBean(null), gen, provider);

        gen.writeEndObject();
        gen.close();
        gen = null;

        assertEquals("{}", sw.toString());
    }

    @Test
    public void testGetAndSerializeNonMapThrows() throws Exception {
        AnyGetterWriter writer = newWriter(MapSerializer.instance);

        try {
            writer.getAndSerialize(new MapBean("not-a-map"), gen, provider);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not java.util.Map"));
            assertTrue(e.getMessage().contains("getValue()"));
        }
    }

    @Test
    public void testGetAndSerializeMapWithSerializer() throws Exception {
        AnyGetterWriter writer = newWriter(MapSerializer.instance);

        writer.getAndSerialize(new MapBean(mapOf("a", "b")), gen, provider);

        gen.writeEndObject();
        gen.close();
        gen = null;

        assertEquals("{\"a\":\"b\"}", sw.toString());
    }

    @Test
    public void testGetAndSerializeMapWithNullSerializerIsNoOp() throws Exception {
        AnyGetterWriter writer = newWriter(null);

        writer.getAndSerialize(new MapBean(mapOf("a", "b")), gen, provider);

        gen.writeEndObject();
        gen.close();
        gen = null;

        assertEquals("{}", sw.toString());
    }

    @Test
    public void testGetAndFilterNullValueIsNoOp() throws Exception {
        AnyGetterWriter writer = newWriter(MapSerializer.instance);

        writer.getAndFilter(new MapBean(null), gen, provider, null);

        gen.writeEndObject();
        gen.close();
        gen = null;

        assertEquals("{}", sw.toString());
    }

    @Test
    public void testGetAndFilterNonMapThrows() throws Exception {
        AnyGetterWriter writer = newWriter(MapSerializer.instance);

        try {
            writer.getAndFilter(new MapBean("not-a-map"), gen, provider, null);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("not java.util.Map"));
        }
    }

    @Test
    public void testGetAndFilterMapWithSerializer() throws Exception {
        AnyGetterWriter writer = newWriter(MapSerializer.instance);

        writer.getAndFilter(new MapBean(mapOf("a", "b")), gen, provider, null);

        gen.writeEndObject();
        gen.close();
        gen = null;

        assertEquals("{\"a\":\"b\"}", sw.toString());
    }

    @Test
    public void testGetAndFilterMapWithNullSerializerIsNoOp() throws Exception {
        AnyGetterWriter writer = newWriter(null);

        writer.getAndFilter(new MapBean(mapOf("a", "b")), gen, provider, null);

        gen.writeEndObject();
        gen.close();
        gen = null;

        assertEquals("{}", sw.toString());
    }

    @Test
    public void testResolveUpdatesMapSerializer() throws Exception {
        AnnotatedMethod accessor = getValueAccessor();
        JavaType type = mapper.constructType(Map.class);
        BeanProperty property = new BeanProperty.Std("value", type, null, false, accessor);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, MapSerializer.instance);
        writer.resolve(provider);

        writer.getAndSerialize(new MapBean(mapOf("a", "b")), gen, provider);

        gen.writeEndObject();
        gen.close();
        gen = null;

        assertEquals("{\"a\":\"b\"}", sw.toString());
    }

    @Test
    public void testMayNeedJsonBeanPropertyTestEntries() throws Exception {
        assertTrue(true);
    }
}