package com.fasterxml.jackson.dataformat.xml.ser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.namespace.QName;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderTest {

    private XmlSerializerProvider provider;
    private XmlRootNameLookup rootNameLookup;
    private SerializationConfig config;
    private SerializerFactory factory;
    private StringWriter stringWriter;

    @Before
    public void setUp() throws Exception {
        rootNameLookup = new XmlRootNameLookup();
        provider = new XmlSerializerProvider(rootNameLookup);
        ObjectMapper mapper = new XmlMapper();
        config = mapper.getSerializationConfig();
        factory = mapper.getSerializerFactory();
        stringWriter = new StringWriter();
    }

    @Test
    public void testCreateInstance() {
        DefaultSerializerProvider instance = provider.createInstance(config, factory);
        assertNotNull(instance);
        assertTrue(instance instanceof XmlSerializerProvider);
    }

    @Test
    public void testSerializeValueNull() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, null);
        assertNotNull(sw.toString());
    }

    @Test
    public void testSerializeValueNullWithToXmlGenerator() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, null);
        assertTrue(sw.toString().contains("<null/>"));
    }

    @Test
    public void testSerializeValueNonNull() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        provider.serializeValue(gen, "testValue");
        assertTrue(sw.toString().contains("testValue"));
    }

    @Test
    public void testSerializeValueWithRootTypeNull() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        JavaType javaType = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
        provider.serializeValue(gen, null, javaType);
        assertTrue(sw.toString().contains("<null/>"));
    }

    @Test
    public void testSerializeValueWithRootTypeNonNull() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        JavaType javaType = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
        provider.serializeValue(gen, "testRoot", javaType);
        assertTrue(sw.toString().contains("testRoot"));
    }

    @Test
    public void testSerializeValueWithRootTypeAndSerializerNull() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        JavaType javaType = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
        provider.serializeValue(gen, null, javaType, null);
        assertTrue(sw.toString().contains("<null/>"));
    }

    @Test
    public void testSerializeValueWithRootTypeAndSerializerNonNull() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        JavaType javaType = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
        JsonSerializer<Object> ser = provider.findTypedValueSerializer(javaType, true, null);
        provider.serializeValue(gen, "testWithSer", javaType, ser);
        assertTrue(sw.toString().contains("testWithSer"));
    }

    @Test
    public void test_serializeXmlNull() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        provider._serializeXmlNull(gen);
        assertTrue(sw.toString().contains("<null/>"));
    }

    @Test
    public void test_startRootArray() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        if (gen instanceof ToXmlGenerator) {
            provider._startRootArray((ToXmlGenerator) gen, new QName("testRoot"));
            assertTrue(sw.toString().contains("item"));
        }
    }

    @Test
    public void test_initWithRootName() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        if (gen instanceof ToXmlGenerator) {
            provider._initWithRootName((ToXmlGenerator) gen, new QName("testRoot"));
        }
    }

    @Test
    public void test_rootNameFromConfigReturnsNull() {
        PropertyName name = provider._rootNameFromConfig();
        assertNull(name);
    }

    @Test
    public void test_rootNameFromConfigWithNamespace() {
        SerializationConfig configWithRoot = config.withRootName(new PropertyName("myRoot", "http://example.com"));
        XmlSerializerProvider prov = new XmlSerializerProvider(rootNameLookup);
        prov = new XmlSerializerProvider(prov, configWithRoot, factory);
        QName qname = prov._rootNameFromConfig();
        assertNotNull(qname);
        assertEquals("myRoot", qname.getLocalPart());
        assertEquals("http://example.com", qname.getNamespaceURI());
    }

    @Test
    public void test_rootNameFromConfigWithoutNamespace() {
        SerializationConfig configWithRoot = config.withRootName(new PropertyName("simpleRoot"));
        XmlSerializerProvider prov = new XmlSerializerProvider(rootNameLookup);
        prov = new XmlSerializerProvider(prov, configWithRoot, factory);
        QName qname = prov._rootNameFromConfig();
        assertNotNull(qname);
        assertEquals("simpleRoot", qname.getLocalPart());
        assertEquals("", qname.getNamespaceURI());
    }

    @Test
    public void test_asXmlGeneratorWithToXmlGenerator() throws JsonMappingException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        try {
            JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
            ToXmlGenerator result = provider._asXmlGenerator(gen);
            assertNotNull(result);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test(expected = JsonMappingException.class)
    public void test_asXmlGeneratorWithInvalidGenerator() throws JsonMappingException, IOException {
        JsonGenerator gen = new JsonGenerator() {
            @Override
            public JsonGenerator setPrettyPrinter(com.fasterxml.jackson.core.util.Instantiatable<?> pp) { return this; }
            @Override
            public JsonGenerator useDefaultPrettyPrinter() { return this; }
            @Override
            public void writeStartArray() throws IOException {}
            @Override
            public void writeEndArray() throws IOException {}
            @Override
            public void writeStartObject() throws IOException {}
            @Override
            public void writeEndObject() throws IOException {}
            @Override
            public void writeFieldName(String name) throws IOException {}
            @Override
            public void writeFieldName(com.fasterxml.jackson.core.SerializableString name) throws IOException {}
            @Override
            public void writeString(String text) throws IOException {}
            @Override
            public void writeString(char[] text, int offset, int len) throws IOException {}
            @Override
            public void writeString(com.fasterxml.jackson.core.SerializableString text) throws IOException {}
            @Override
            public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
            @Override
            public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
            @Override
            public void writeRaw(String text) throws IOException {}
            @Override
            public void writeRaw(String text, int offset, int len) throws IOException {}
            @Override
            public void writeRaw(char[] text, int offset, int len) throws IOException {}
            @Override
            public void writeRaw(char c) throws IOException {}
            @Override
            public void writeRawValue(String text) throws IOException {}
            @Override
            public void writeRawValue(String text, int offset, int len) throws IOException {}
            @Override
            public void writeRawValue(char[] text, int offset, int len) throws IOException {}
            @Override
            public void writeBinary(com.fasterxml.jackson.core.Base64Variant bv, byte[] data, int offset, int len) throws IOException {}
            @Override
            public int writeBinary(com.fasterxml.jackson.core.Base64Variant bv, java.io.InputStream data, int dataLength) throws IOException { return 0; }
            @Override
            public void writeNumber(int v) throws IOException {}
            @Override
            public void writeNumber(long v) throws IOException {}
            @Override
            public void writeNumber(java.math.BigInteger v) throws IOException {}
            @Override
            public void writeNumber(double v) throws IOException {}
            @Override
            public void writeNumber(float v) throws IOException {}
            @Override
            public void writeNumber(java.math.BigDecimal v) throws IOException {}
            @Override
            public void writeNumber(String encodedValue) throws IOException, UnsupportedOperationException {}
            @Override
            public void writeBoolean(boolean state) throws IOException {}
            @Override
            public void writeNull() throws IOException {}
            @Override
            public void writeObject(Object value) throws IOException {}
            @Override
            public void writeTree(com.fasterxml.jackson.core.TreeNode rootNode) throws IOException {}
            @Override
            public com.fasterxml.jackson.core.JsonStreamContext getOutputContext() { return null; }
            @Override
            public void flush() throws IOException {}
            @Override
            public boolean isClosed() { return false; }
            @Override
            public void close() throws IOException {}
            @Override
            public com.fasterxml.jackson.core.JsonGenerator setCodec(ObjectMapper mapper) { return this; }
        };
        provider._asXmlGenerator(gen);
    }

    @Test
    public void testSerializeValueThrowsIOException() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        try {
            provider.serializeValue(gen, new Object() {
                @Override
                public String toString() {
                    throw new RuntimeException("test exception");
                }
            });
            fail("Expected IOException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("test exception"));
        }
    }

    @Test
    public void testSerializeValueWithRootTypeAndSerializerThrowsIOException() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        JavaType javaType = TypeFactory.defaultInstance().uncheckedSimpleType(Object.class);
        try {
            provider.serializeValue(gen, new Object() {
                @Override
                public String toString() {
                    throw new RuntimeException("test exception");
                }
            }, javaType, null);
            fail("Expected IOException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("test exception"));
        }
    }
}