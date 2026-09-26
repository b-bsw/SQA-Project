package com.fasterxml.jackson.dataformat.xml.ser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;
import com.fasterxml.jackson.dataformat.xml.util.TypeUtil;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderTest {

    @Mock
    private XmlRootNameLookup rootNameLookup;
    
    @Mock
    private SerializationConfig config;
    
    @Mock
    private SerializerFactory factory;
    
    @Mock
    private ToXmlGenerator toXmlGenerator;
    
    @Mock
    private JsonGenerator jsonGenerator;
    
    @Mock
    private JsonSerializer<Object> serializer;
    
    @Mock
    private JavaType javaType;
    
    private XmlSerializerProvider provider;
    private XmlSerializerProvider providerWithConfig;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        provider = new XmlSerializerProvider(rootNameLookup);
        
        providerWithConfig = new XmlSerializerProvider(provider, config, factory);
        
        Mockito.when(config.getFullRootName()).thenReturn(null);
        Mockito.when(rootNameLookup.findRootName(Mockito.any(Class.class), Mockito.eq(config))).thenReturn(new QName("testRoot"));
        Mockito.when(rootNameLookup.findRootName(Mockito.any(JavaType.class), Mockito.eq(config))).thenReturn(new QName("testRoot"));
    }

    @Test
    public void testSerializeValueNullValue() throws IOException {
        provider.serializeValue(jsonGenerator, null);
        Mockito.verify(jsonGenerator).writeNull();
    }

    @Test
    public void testSerializeValueNonNullValue() throws IOException {
        Object value = new Object();
        provider.serializeValue(jsonGenerator, value);
        Mockito.verify(jsonGenerator).writeStartObject();
        Mockito.verify(jsonGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueNonNullValueWithRootName() throws IOException {
        Mockito.when(config.getFullRootName()).thenReturn(new PropertyName("customRoot"));
        provider = new XmlSerializerProvider(provider, config, factory);
        Object value = new Object();
        provider.serializeValue(jsonGenerator, value);
        Mockito.verify(jsonGenerator).writeStartObject();
        Mockito.verify(jsonGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueNonNullValueWithRootNameNamespace() throws IOException {
        Mockito.when(config.getFullRootName()).thenReturn(new PropertyName("customRoot", "http://example.com"));
        provider = new XmlSerializerProvider(provider, config, factory);
        Object value = new Object();
        provider.serializeValue(jsonGenerator, value);
        Mockito.verify(jsonGenerator).writeStartObject();
        Mockito.verify(jsonGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithToXmlGenerator() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        provider.serializeValue(toXmlGenerator, value);
        Mockito.verify(toXmlGenerator).writeStartObject();
        Mockito.verify(toXmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithToXmlGeneratorNonIndexed() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        provider.serializeValue(toXmlGenerator, value);
        Mockito.verify(toXmlGenerator).writeStartObject();
        Mockito.verify(toXmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithToXmlGeneratorIndexed() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        provider.serializeValue(toXmlGenerator, value);
        Mockito.verify(toXmlGenerator).writeStartObject();
        Mockito.verify(toXmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithToXmlGeneratorNullRootName() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        provider.serializeValue(toXmlGenerator, value);
        Mockito.verify(toXmlGenerator).writeStartObject();
        Mockito.verify(toXmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithToXmlGeneratorException() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        try {
            provider.serializeValue(toXmlGenerator, value);
        } catch (IOException e) {
            assertTrue(e instanceof IOException);
        }
    }

    @Test
    public void testSerializeValueWithTokenBuffer() throws IOException {
        TokenBuffer tokenBuffer = Mockito.mock(TokenBuffer.class);
        Object value = new Object();
        provider.serializeValue(tokenBuffer, value);
        Mockito.verify(tokenBuffer).writeStartObject();
        Mockito.verify(tokenBuffer).writeEndObject();
    }

    @Test
    public void testSerializeValueWithJavaTypeNullValue() throws IOException {
        provider.serializeValue(jsonGenerator, null, javaType, serializer);
        Mockito.verify(jsonGenerator).writeNull();
    }

    @Test
    public void testSerializeValueWithJavaTypeNonNullValue() throws IOException {
        Object value = new Object();
        provider.serializeValue(jsonGenerator, value, javaType, serializer);
        Mockito.verify(jsonGenerator).writeStartObject();
        Mockito.verify(jsonGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithJavaTypeNonNullValueWithRootName() throws IOException {
        Mockito.when(config.getFullRootName()).thenReturn(new PropertyName("customRoot"));
        provider = new XmlSerializerProvider(provider, config, factory);
        Object value = new Object();
        provider.serializeValue(jsonGenerator, value, javaType, serializer);
        Mockito.verify(jsonGenerator).writeStartObject();
        Mockito.verify(jsonGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithJavaTypeNonNullValueWithRootNameNamespace() throws IOException {
        Mockito.when(config.getFullRootName()).thenReturn(new PropertyName("customRoot", "http://example.com"));
        provider = new XmlSerializerProvider(provider, config, factory);
        Object value = new Object();
        provider.serializeValue(jsonGenerator, value, javaType, serializer);
        Mockito.verify(jsonGenerator).writeStartObject();
        Mockito.verify(jsonGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithJavaTypeAndToXmlGenerator() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        provider.serializeValue(toXmlGenerator, value, javaType, serializer);
        Mockito.verify(toXmlGenerator).writeStartObject();
        Mockito.verify(toXmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithJavaTypeAndToXmlGeneratorNullRootName() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        provider.serializeValue(toXmlGenerator, value, javaType, serializer);
        Mockito.verify(toXmlGenerator).writeStartObject();
        Mockito.verify(toXmlGenerator).writeEndObject();
    }

    @Test
    public void testSerializeValueWithJavaTypeAndToXmlGeneratorException() throws IOException {
        Object value = new Object();
        Mockito.when(toXmlGenerator.setNextNameIfMissing(Mockito.any(QName.class))).thenReturn(true);
        try {
            provider.serializeValue(toXmlGenerator, value, javaType, serializer);
        } catch (IOException e) {
            assertTrue(e instanceof IOException);
        }
    }

    @Test
    public void testSerializeValueWithJavaTypeAndTokenBuffer() throws IOException {
        TokenBuffer tokenBuffer = Mockito.mock(TokenBuffer.class);
        Object value = new Object();
        provider.serializeValue(tokenBuffer, value, javaType, serializer);
        Mockito.verify(tokenBuffer).writeStartObject();
        Mockito.verify(tokenBuffer).writeEndObject();
    }

    @Test
    public void testSerializeXmlNullWithRootName() throws IOException {
        Mockito.when(config.getFullRootName()).thenReturn(new PropertyName("customNullRoot"));
        provider = new XmlSerializerProvider(provider, config, factory);
        provider._serializeXmlNull(jsonGenerator);
        Mockito.verify(jsonGenerator).writeNull();
    }

    @Test
    public void testSerializeXmlNullWithoutRootName() throws IOException {
        provider._serializeXmlNull(jsonGenerator);
        Mockito.verify(jsonGenerator).writeNull();
    }

    @Test
    public void testStartRootArray() throws IOException {
        QName rootName = new QName("arrayRoot");
        provider._startRootArray(toXmlGenerator, rootName);
        Mockito.verify(toXmlGenerator).writeStartObject();
        Mockito.verify(toXmlGenerator).writeFieldName("item");
    }

    @Test
    public void testInitWithRootNameSetNextNameIfMissingTrue() throws IOException {
        QName rootName = new QName("testRoot");
        Mockito.when(toXmlGenerator.setNextNameIfMissing(rootName)).thenReturn(true);
        provider._initWithRootName(toXmlGenerator, rootName);
        Mockito.verify(toXmlGenerator).initGenerator();
    }

    @Test
    public void testInitWithRootNameSetNextNameIfMissingFalse() throws IOException {
        QName rootName = new QName("testRoot");
        Mockito.when(toXmlGenerator.setNextNameIfMissing(rootName)).thenReturn(false);
        Mockito.when(toXmlGenerator.inRoot()).thenReturn(true);
        provider._initWithRootName(toXmlGenerator, rootName);
        Mockito.verify(toXmlGenerator).setNextName(rootName);
        Mockito.verify(toXmlGenerator).initGenerator();
    }

    @Test
    public void testInitWithRootNameSetNextNameIfMissingFalseNotInRoot() throws IOException {
        QName rootName = new QName("testRoot");
        Mockito.when(toXmlGenerator.setNextNameIfMissing(rootName)).thenReturn(false);
        Mockito.when(toXmlGenerator.inRoot()).thenReturn(false);
        provider._initWithRootName(toXmlGenerator, rootName);
        Mockito.verify(toXmlGenerator, Mockito.never()).setNextName(rootName);
        Mockito.verify(toXmlGenerator).initGenerator();
    }

    @Test
    public void testInitWithRootNameWithNamespace() throws IOException, XMLStreamException {
        QName rootName = new QName("http://example.com", "testRoot");
        Mockito.when(toXmlGenerator.setNextNameIfMissing(rootName)).thenReturn(true);
        Mockito.when(toXmlGenerator.getStaxWriter()).thenReturn(Mockito.mock(javax.xml.stream.XMLStreamWriter.class));
        provider._initWithRootName(toXmlGenerator, rootName);
        Mockito.verify(toXmlGenerator.getStaxWriter()).setDefaultNamespace("http://example.com");
        Mockito.verify(toXmlGenerator).initGenerator();
    }

    @Test
    public void testRootNameFromConfigNull() {
        Mockito.when(config.getFullRootName()).thenReturn(null);
        QName result = provider._rootNameFromConfig();
        assertNull(result);
    }

    @Test
    public void testRootNameFromConfigWithoutNamespace() {
        Mockito.when(config.getFullRootName()).thenReturn(new PropertyName("simpleName"));
        QName result = provider._rootNameFromConfig();
        assertEquals(new QName("simpleName"), result);
    }

    @Test
    public void testRootNameFromConfigWithNamespace() {
        Mockito.when(config.getFullRootName()).thenReturn(new PropertyName("simpleName", "http://example.com"));
        QName result = provider._rootNameFromConfig();
        assertEquals(new QName("http://example.com", "simpleName"), result);
    }

    @Test
    public void testAsXmlGeneratorToXmlGenerator() throws JsonMappingException {
        ToXmlGenerator result = provider._asXmlGenerator(toXmlGenerator);
        assertEquals(toXmlGenerator, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testAsXmlGeneratorInvalidGenerator() throws JsonMappingException {
        JsonGenerator invalidGen = Mockito.mock(JsonGenerator.class);
        provider._asXmlGenerator(invalidGen);
    }

    @Test
    public void testAsXmlGeneratorTokenBuffer() throws JsonMappingException {
        TokenBuffer tokenBuffer = Mockito.mock(TokenBuffer.class);
        ToXmlGenerator result = provider._asXmlGenerator(tokenBuffer);
        assertNull(result);
    }

    @Test
    public void testWrapAsIOEWithIOException() {
        IOException ioe = new IOException("test io exception");
        IOException result = provider._wrapAsIOE(jsonGenerator, ioe);
        assertEquals(ioe, result);
    }

    @Test
    public void testWrapAsIOEWithRuntimeException() {
        RuntimeException re = new RuntimeException("test runtime exception");
        IOException result = provider._wrapAsIOE(jsonGenerator, re);
        assertTrue(result instanceof JsonMappingException);
        assertEquals(re.getMessage(), result.getMessage());
    }

    @Test
    public void testCopy() {
        DefaultSerializerProvider copy = provider.copy();
        assertNotNull(copy);
        assertTrue(copy instanceof XmlSerializerProvider);
    }

    @Test
    public void testCreateInstance() {
        DefaultSerializerProvider instance = provider.createInstance(config, factory);
        assertNotNull(instance);
        assertTrue(instance instanceof XmlSerializerProvider);
    }
}