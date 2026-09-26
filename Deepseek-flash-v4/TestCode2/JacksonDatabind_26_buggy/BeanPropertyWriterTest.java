package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.SerializerCache;

public class BeanPropertyWriterTest {

    public static class TestBean {
        public String val;
        public TestBean self;
    }

    private ObjectMapper mapper;
    private TypeFactory typeFactory;
    private final JsonSerializer<Object> testStringSerializer = new JsonSerializer<Object>() {
        @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString(value.toString());
        }
        @Override public boolean isEmpty(SerializerProvider prov, Object value) {
            return (value == null) || ((String)value).isEmpty();
        }
    };

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        typeFactory = mapper.getTypeFactory();
    }

    private BeanPropertyWriter createWriter(String fieldName, JsonSerializer<?> ser) throws Exception {
        return createWriter(fieldName, ser, null, false);
    }

    @SuppressWarnings("unchecked")
    private BeanPropertyWriter createWriter(String fieldName, JsonSerializer<?> ser, Object suppressableValue, boolean suppressNulls) throws Exception {
        Field f = TestBean.class.getField(fieldName);
        AnnotatedField af = new AnnotatedField(f, null);
        BeanPropertyDefinition def = new BeanPropertyDefinition() {
            @Override public String getName() { return fieldName; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public Annotations getAnnotations() { return null; }
            @Override public AnnotatedMember getPrimaryMember() { return null; }
            @Override public BeanPropertyDefinition withName(PropertyName name) { return null; }
            @Override public BeanPropertyDefinition withSimpleName(String name) { return null; }
            @Override public JsonInclude.Value findInclusion() { return null; }
            @Override public ObjectIdInfo findObjectIdInfo() { return null; }
        };
        JavaType declaredType = typeFactory.constructType(f.getGenericType());
        return new BeanPropertyWriter(def, af, null, declaredType, (JsonSerializer<Object>)ser, null, null, suppressNulls, suppressableValue);
    }

    // ---- assignSerializer ----
    @Test
    public void testAssignSerializerNew() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        JsonSerializer<Object> ser = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        };
        bpw.assignSerializer(ser);
        assertSame(ser, bpw.getSerializer());
        assertTrue(bpw.hasSerializer());
    }

    @Test
    public void testAssignSerializerOverride() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        JsonSerializer<Object> ser1 = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        };
        bpw.assignSerializer(ser1);
        JsonSerializer<Object> ser2 = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        };
        try {
            bpw.assignSerializer(ser2);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) { }
    }

    // ---- assignNullSerializer ----
    @Test
    public void testAssignNullSerializerNew() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        };
        bpw.assignNullSerializer(nullSer);
        assertTrue(bpw.hasNullSerializer());
    }

    @Test
    public void testAssignNullSerializerOverride() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        bpw.assignNullSerializer(new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        });
        try {
            bpw.assignNullSerializer(new JsonSerializer<Object>() {
                @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
            });
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) { }
    }

    // ---- wouldConflictWithName ----
    @Test
    public void testWouldConflictWithName() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertTrue(bpw.wouldConflictWithName(new PropertyName("val")));
        assertFalse(bpw.wouldConflictWithName(new PropertyName("val", "ns")));

        // wrapper not null
        Field f = TestBean.class.getField("val");
        AnnotatedField af = new AnnotatedField(f, null);
        BeanPropertyDefinition def = new BeanPropertyDefinition() {
            @Override public String getName() { return "val"; }
            @Override public PropertyName getWrapperName() { return new PropertyName("wrapper", null); }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public Annotations getAnnotations() { return null; }
            @Override public AnnotatedMember getPrimaryMember() { return null; }
            @Override public BeanPropertyDefinition withName(PropertyName name) { return null; }
            @Override public BeanPropertyDefinition withSimpleName(String name) { return null; }
            @Override public JsonInclude.Value findInclusion() { return null; }
            @Override public ObjectIdInfo findObjectIdInfo() { return null; }
        };
        BeanPropertyWriter bpw2 = new BeanPropertyWriter(def, af, null, typeFactory.constructType(String.class), null, null, null, false, null);
        assertTrue(bpw2.wouldConflictWithName(new PropertyName("wrapper")));
        assertFalse(bpw2.wouldConflictWithName(new PropertyName("other")));
    }

    // ---- internal settings ----
    @Test
    public void testInternalSettings() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertNull(bpw.getInternalSetting("key"));
        assertNull(bpw.setInternalSetting("key", "value"));
        assertEquals("value", bpw.getInternalSetting("key"));
        assertEquals("value", bpw.removeInternalSetting("key"));
        assertNull(bpw.getInternalSetting("key"));
        assertNull(bpw.removeInternalSetting("nonexistent"));
    }

    // ---- rename ----
    @Test
    public void testRenameSameName() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        NameTransformer identity = new NameTransformer() {
            @Override public String transform(String name) { return name; }
            @Override public String reverse(String transformed) { return transformed; }
        };
        assertSame(bpw, bpw.rename(identity));
    }

    @Test
    public void testRenameDifferentName() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        NameTransformer prefixer = new NameTransformer() {
            @Override public String transform(String name) { return "pfx."+name; }
            @Override public String reverse(String transformed) { return transformed.substring(4); }
        };
        BeanPropertyWriter renamed = bpw.rename(prefixer);
        assertNotSame(bpw, renamed);
        assertEquals("pfx.val", renamed.getName());
    }

    // ---- unwrappingWriter ----
    @Test
    public void testUnwrappingWriter() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        NameTransformer unwrapper = new NameTransformer() {
            @Override public String transform(String name) { return "uw."+name; }
            @Override public String reverse(String transformed) { return transformed.substring(3); }
        };
        assertTrue(bpw.unwrappingWriter(unwrapper) instanceof UnwrappingBeanPropertyWriter);
    }

    // ---- get operations ----
    @Test
    public void testGet() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        TestBean bean = new TestBean();
        bean.val = "testValue";
        assertEquals("testValue", bpw.get(bean));
    }

    @Test
    public void testGetPropertyType() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertEquals(String.class, bpw.getPropertyType());
    }

    @Test
    public void testGetRawSerializationType() throws Exception {
        Field f = TestBean.class.getField("val");
        AnnotatedField af = new AnnotatedField(f, null);
        BeanPropertyDefinition def = new BeanPropertyDefinition() {
            @Override public String getName() { return "val"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public Annotations getAnnotations() { return null; }
            @Override public AnnotatedMember getPrimaryMember() { return null; }
            @Override public BeanPropertyDefinition withName(PropertyName name) { return null; }
            @Override public BeanPropertyDefinition withSimpleName(String name) { return null; }
            @Override public JsonInclude.Value findInclusion() { return null; }
            @Override public ObjectIdInfo findObjectIdInfo() { return null; }
        };
        JavaType serType = typeFactory.constructType(String.class);
        BeanPropertyWriter bpw = new BeanPropertyWriter(def, af, null, typeFactory.constructType(String.class), null, null, serType, false, null);
        assertEquals(String.class, bpw.getRawSerializationType());

        BeanPropertyWriter bpw2 = new BeanPropertyWriter(def, af, null, typeFactory.constructType(String.class), null, null, null, false, null);
        assertNull(bpw2.getRawSerializationType());
    }

    // ---- toString ----
    @Test
    public void testToStringVirtual() throws Exception {
        BeanPropertyWriter virtual = new BeanPropertyWriter() {};
        String str = virtual.toString();
        assertTrue(str.contains("virtual"));
    }

    @Test
    public void testToStringField() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertTrue(bpw.toString().contains("field"));
    }

    @Test
    public void testToStringWithSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        bpw.assignSerializer(new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) {}
        });
        String str = bpw.toString();
        assertTrue(str.contains("static serializer"));
    }

    // ---- serializeAsField ----
    @Test
    public void testSerializeAsFieldNullValueNoNullSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer);
        TestBean bean = new TestBean();
        bean.val = null;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsField(bean, gen, prov);
        gen.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testSerializeAsFieldNullValueWithNullSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer);
        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
                gen.writeString("NULL");
            }
        };
        bpw.assignNullSerializer(nullSer);
        TestBean bean = new TestBean();
        bean.val = null;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsField(bean, gen, prov);
        gen.flush();
        String result = sw.toString();
        assertTrue(result.contains("\"val\""));
        assertTrue(result.contains("\"NULL\""));
    }

    @Test
    public void testSerializeAsFieldDynamicSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        TestBean bean = new TestBean();
        bean.val = "dynamic";
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsField(bean, gen, prov);
        gen.flush();
        String result = sw.toString();
        assertTrue(result.contains("\"val\""));
        assertTrue(result.contains("\"dynamic\""));
    }

    @Test
    public void testSerializeAsFieldSuppressExactValue() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer, "suppress", false);
        TestBean bean = new TestBean();
        bean.val = "suppress";
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsField(bean, gen, prov);
        gen.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testSerializeAsFieldSuppressMarkerForEmpty() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer, BeanPropertyWriter.MARKER_FOR_EMPTY, false);
        TestBean bean = new TestBean();
        bean.val = "";
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsField(bean, gen, prov);
        gen.flush();
        assertEquals("", sw.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeAsFieldSelfReference() throws Exception {
        ObjectMapper mapper2 = new ObjectMapper();
        mapper2.enable(SerializationFeature.FAIL_ON_SELF_REFERENCES);
        SerializationConfig config = mapper2.getSerializationConfig();
        SerializerFactory factory = mapper2.getSerializerFactory();
        DefaultSerializerProvider prov = new DefaultSerializerProvider.Impl(config, factory, new SerializerCache());

        Field f = TestBean.class.getField("self");
        AnnotatedField af = new AnnotatedField(f, null);
        BeanPropertyDefinition def = new BeanPropertyDefinition() {
            @Override public String getName() { return "self"; }
            @Override public PropertyName getWrapperName() { return null; }
            @Override public PropertyMetadata getMetadata() { return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL; }
            @Override public Class<?>[] findViews() { return null; }
            @Override public Annotations getAnnotations() { return null; }
            @Override public AnnotatedMember getPrimaryMember() { return null; }
            @Override public BeanPropertyDefinition withName(PropertyName name) { return null; }
            @Override public BeanPropertyDefinition withSimpleName(String name) { return null; }
            @Override public JsonInclude.Value findInclusion() { return null; }
            @Override public ObjectIdInfo findObjectIdInfo() { return null; }
        };
        JavaType declaredType = typeFactory.constructType(TestBean.class);
        BeanPropertyWriter bpw = new BeanPropertyWriter(def, af, null, declaredType, null, null, null, false, null);
        TestBean bean = new TestBean();
        bean.self = bean;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper2.getFactory().createGenerator(sw);
        bpw.serializeAsField(bean, gen, prov);
    }

    // ---- serializeAsElement ----
    @Test
    public void testSerializeAsElementNullValueNoNullSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer);
        TestBean bean = new TestBean();
        bean.val = null;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsElement(bean, gen, prov);
        gen.flush();
        assertEquals("null", sw.toString().trim());
    }

    @Test
    public void testSerializeAsElementNullValueWithNullSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer);
        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
                gen.writeString("ELEM_NULL");
            }
        };
        bpw.assignNullSerializer(nullSer);
        TestBean bean = new TestBean();
        bean.val = null;
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsElement(bean, gen, prov);
        gen.flush();
        assertEquals("\"ELEM_NULL\"", sw.toString().trim());
    }

    @Test
    public void testSerializeAsElementSuppressExactValue() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer, "suppress", false);
        TestBean bean = new TestBean();
        bean.val = "suppress";
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsElement(bean, gen, prov);
        gen.flush();
        assertEquals("null", sw.toString().trim());
    }

    // ---- serializeAsPlaceholder ----
    @Test
    public void testSerializeAsPlaceholderWithNullSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer);
        JsonSerializer<Object> nullSer = new JsonSerializer<Object>() {
            @Override public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
                gen.writeString("PH");
            }
        };
        bpw.assignNullSerializer(nullSer);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsPlaceholder(null, gen, prov);
        gen.flush();
        assertEquals("\"PH\"", sw.toString().trim());
    }

    @Test
    public void testSerializeAsPlaceholderWithoutNullSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", testStringSerializer);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = mapper.getSerializerProvider();
        bpw.serializeAsPlaceholder(null, gen, prov);
        gen.flush();
        assertEquals("null", sw.toString().trim());
    }

    // ---- misc simple methods ----
    @Test
    public void testHasSerializer() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertFalse(bpw.hasSerializer());
        bpw.assignSerializer(testStringSerializer);
        assertTrue(bpw.hasSerializer());
    }

    @Test
    public void testWillSuppressNulls() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null, null, false);
        assertFalse(bpw.willSuppressNulls());
        BeanPropertyWriter bpw2 = createWriter("val", null, null, true);
        assertTrue(bpw2.willSuppressNulls());
    }

    @Test
    public void testIsUnwrapping() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertFalse(bpw.isUnwrapping());
    }

    @Test
    public void testGetSerializedName() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertEquals("val", bpw.getSerializedName().getValue());
    }

    @Test
    public void testGetGenericPropertyType() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        assertEquals(String.class, bpw.getGenericPropertyType());
    }

    @Test
    public void testDepositSchemaProperty() throws Exception {
        BeanPropertyWriter bpw = createWriter("val", null);
        bpw.depositSchemaProperty(null); // should not throw
    }
}