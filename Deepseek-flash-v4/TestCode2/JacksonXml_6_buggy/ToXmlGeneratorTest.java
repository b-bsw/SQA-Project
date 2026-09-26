package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamWriter;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.xml.XmlPrettyPrinter;
import com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;

public class ToXmlGeneratorTest {
    private IOContext ioContext;
    private XMLStreamWriter xmlStreamWriter;
    private ToXmlGenerator generator;

    @Before
    public void setUp() throws Exception {
        ioContext = new IOContext(IOContext.READ, null, null, null, null, null, 0);
        xmlStreamWriter = new TestXMLStreamWriter();
        generator = new ToXmlGenerator(ioContext, 0, 0, null, xmlStreamWriter);
    }

    @Test
    public void testInitGeneratorDefault() throws IOException {
        generator.initGenerator();
        assertTrue(generator._initialized);
    }

    @Test
    public void testInitGeneratorAlreadyInitialized() throws IOException {
        generator._initialized = true;
        generator.initGenerator();
        assertTrue(generator._initialized);
    }

    @Test
    public void testInitGeneratorWithDeclaration() throws IOException {
        ToXmlGenerator gen = new ToXmlGenerator(ioContext, 0, ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask(), null, xmlStreamWriter);
        gen.initGenerator();
        assertTrue(gen._initialized);
    }

    @Test
    public void testInitGeneratorWithXml11() throws IOException {
        ToXmlGenerator gen = new ToXmlGenerator(ioContext, 0, ToXmlGenerator.Feature.WRITE_XML_1_1.getMask(), null, xmlStreamWriter);
        gen.initGenerator();
        assertTrue(gen._initialized);
    }

    @Test
    public void testSetPrettyPrinter() {
        DefaultXmlPrettyPrinter pp = new DefaultXmlPrettyPrinter();
        generator.setPrettyPrinter(pp);
        assertNotNull(generator._xmlPrettyPrinter);
    }

    @Test
    public void testSetPrettyPrinterNull() {
        generator.setPrettyPrinter(null);
        assertNull(generator._xmlPrettyPrinter);
    }

    @Test
    public void testGetOutputTarget() {
        assertSame(xmlStreamWriter, generator.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered() {
        assertEquals(-1, generator.getOutputBuffered());
    }

    @Test
    public void testGetFormatFeatures() {
        assertEquals(0, generator.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeatures() {
        generator.overrideFormatFeatures(0xFF, 0xFF);
        assertEquals(0xFF, generator.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeaturesNoChange() {
        int old = generator.getFormatFeatures();
        generator.overrideFormatFeatures(0xFF, 0);
        assertEquals(old, generator.getFormatFeatures());
    }

    @Test
    public void testEnableFeature() {
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertTrue(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testDisableFeature() {
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        generator.disable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testConfigureTrue() {
        generator.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        assertTrue(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testConfigureFalse() {
        generator.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        generator.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, false);
        assertFalse(generator.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
    }

    @Test
    public void testCanWriteFormattedNumbers() {
        assertTrue(generator.canWriteFormattedNumbers());
    }

    @Test
    public void testInRoot() {
        assertTrue(generator.inRoot());
    }

    @Test
    public void testGetStaxWriter() {
        assertNotNull(generator.getStaxWriter());
    }

    @Test
    public void testSetNextIsAttribute() {
        generator.setNextIsAttribute(true);
        assertTrue(generator._nextIsAttribute);
    }

    @Test
    public void testSetNextIsUnwrapped() {
        generator.setNextIsUnwrapped(true);
        assertTrue(generator._nextIsUnwrapped);
    }

    @Test
    public void testSetNextIsCData() {
        generator.setNextIsCData(true);
        assertTrue(generator._nextIsCData);
    }

    @Test
    public void testSetNextName() {
        QName name = new QName("test");
        generator.setNextName(name);
        assertSame(name, generator._nextName);
    }

    @Test
    public void testSetNextNameIfMissingNull() {
        assertTrue(generator.setNextNameIfMissing(new QName("test")));
        assertEquals(new QName("test"), generator._nextName);
    }

    @Test
    public void testSetNextNameIfMissingNotNull() {
        QName name = new QName("existing");
        generator.setNextName(name);
        assertFalse(generator.setNextNameIfMissing(new QName("test")));
        assertSame(name, generator._nextName);
    }

    @Test
    public void testStartWrappedValueWithWrapper() throws IOException {
        QName wrapper = new QName("wrapper");
        QName wrapped = new QName("wrapped");
        generator.startWrappedValue(wrapper, wrapped);
        assertEquals(wrapped, generator._nextName);
    }

    @Test
    public void testStartWrappedValueNullWrapper() throws IOException {
        QName wrapped = new QName("wrapped");
        generator.startWrappedValue(null, wrapped);
        assertEquals(wrapped, generator._nextName);
    }

    @Test
    public void testFinishWrappedValueWithWrapper() throws IOException {
        QName wrapper = new QName("wrapper");
        QName wrapped = new QName("wrapped");
        generator.finishWrappedValue(wrapper, wrapped);
    }

    @Test
    public void testFinishWrappedValueNullWrapper() throws IOException {
        generator.finishWrappedValue(null, null);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteRepeatedFieldNameExpectValue() throws IOException {
        generator._writeContext = generator._writeContext.createChildObjectContext();
        generator.writeRepeatedFieldName();
    }

    @Test
    public void testWriteFieldNameString() throws IOException {
        generator._writeContext = generator._writeContext.createChildObjectContext();
        generator.setNextName(new QName("ns", "test"));
        generator.writeFieldName("field");
        assertEquals("field", generator._nextName.getLocalPart());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldNameStringExpectValue() throws IOException {
        generator.writeFieldName("field");
    }

    @Test
    public void testWriteStringField() throws IOException {
        generator._writeContext = generator._writeContext.createChildObjectContext();
        generator.writeStringField("field", "value");
        assertEquals("value", ((TestXMLStreamWriter)xmlStreamWriter).lastText);
    }

    @Test
    public void testWriteStartArray() throws IOException {
        generator._writeContext = generator._writeContext.createChildObjectContext();
        generator.writeStartArray();
        assertTrue(generator._writeContext.inArray());
    }

    @Test
    public void testWriteEndArray() throws IOException {
        generator._writeContext = generator._writeContext.createChildArrayContext();
        generator.writeEndArray();
        assertFalse(generator._writeContext.inArray());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArrayNotInArray() throws IOException {
        generator.writeEndArray();
    }

    @Test
    public void testWriteStartObject() throws IOException {
        generator._writeContext = generator._writeContext.createChildObjectContext();
        generator.writeStartObject();
        assertTrue(generator._writeContext.inObject());
    }

    @Test
    public void testWriteEndObject() throws IOException {
        generator._writeContext = generator._writeContext.createChildObjectContext().createChildObjectContext();
        generator.writeEndObject();
        assertTrue(generator._writeContext.inObject());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObjectNotInObject() throws IOException {
        generator.writeEndObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testHandleStartObjectMissingName() throws IOException {
        generator._nextName = null;
        generator._handleStartObject();
    }

    @Test
    public void testHandleStartObjectWithName() throws IOException {
        generator.setNextName(new QName("test"));
        generator._handleStartObject();
        assertEquals(1, generator._elementNameStack.size());
    }

    @Test(expected = JsonGenerationException.class)
    public void testHandleEndObjectEmptyStack() throws IOException {
        generator._elementNameStack.clear();
        generator._handleEndObject();
    }

    @Test
    public void testHandleEndObject() throws IOException {
        generator.setNextName(new QName("test"));
        generator._handleStartObject();
        generator._handleEndObject();
        assertTrue(generator._elementNameStack.isEmpty());
    }

    @Test
    public void testWriteStringAttribute() throws IOException {
        generator.setNextName(new QName("attr"));
        generator.setNextIsAttribute(true);
        generator.writeString("value");
        assertEquals("value", ((TestXMLStreamWriter)xmlStreamWriter).lastAttributeValue);
    }

    @Test
    public void testWriteStringUnwrapped() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.setNextIsUnwrapped(true);
        generator.writeString("value");
        assertEquals("value", ((TestXMLStreamWriter)xmlStreamWriter).lastCharacters);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteStringMissingName() throws IOException {
        generator.writeString("value");
    }

    @Test
    public void testWriteStringCharArray() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.setNextIsUnwrapped(true);
        generator.writeString(new char[]{'h','e','l','l','o'}, 0, 5);
        assertEquals("hello", ((TestXMLStreamWriter)xmlStreamWriter).lastCharacters);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteStringCharArrayMissingName() throws IOException {
        generator.writeString(new char[]{'t','e','s','t'}, 0, 4);
    }

    @Test
    public void testWriteStringSerializableString() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.setNextIsUnwrapped(true);
        generator.writeString(new TestSerializableString("test"));
        assertEquals("test", ((TestXMLStreamWriter)xmlStreamWriter).lastCharacters);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8String() throws IOException {
        generator.writeRawUTF8String(new byte[0], 0, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8String() throws IOException {
        generator.writeUTF8String(new byte[0], 0, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValueSerializableString() throws IOException {
        generator.writeRawValue(new TestSerializableString("test"));
    }

    @Test
    public void testWriteRawValueString() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.writeRawValue("raw");
        assertEquals("raw", ((TestXMLStreamWriter)xmlStreamWriter).lastRaw);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteRawValueStringMissingName() throws IOException {
        generator.writeRawValue("raw");
    }

    @Test
    public void testWriteRawValueStringOffsetLen() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.writeRawValue("rawValue", 0, 8);
        assertEquals("rawValue", ((TestXMLStreamWriter)xmlStreamWriter).lastRaw);
    }

    @Test
    public void testWriteRawValueCharArray() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.writeRawValue(new char[]{'r','a','w'}, 0, 3);
        assertEquals("raw", ((TestXMLStreamWriter)xmlStreamWriter).lastRaw);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteRawValueCharArrayMissingName() throws IOException {
        generator.writeRawValue(new char[]{'t'}, 0, 1);
    }

    @Test
    public void testWriteRawString() throws IOException {
        generator.writeRaw("raw string");
        assertEquals("raw string", ((TestXMLStreamWriter)xmlStreamWriter).lastRaw);
    }

    @Test
    public void testWriteRawStringOffsetLen() throws IOException {
        generator.writeRaw("raw string", 0, 10);
        assertEquals("raw string", ((TestXMLStreamWriter)xmlStreamWriter).lastRaw);
    }

    @Test
    public void testWriteRawCharArray() throws IOException {
        generator.writeRaw(new char[]{'r','a','w'}, 0, 3);
        assertEquals("raw", ((TestXMLStreamWriter)xmlStreamWriter).lastRaw);
    }

    @Test
    public void testWriteRawChar() throws IOException {
        generator.writeRaw('c');
        assertEquals("c", ((TestXMLStreamWriter)xmlStreamWriter).lastRaw);
    }

    @Test
    public void testWriteBinaryAttribute() throws IOException {
        generator.setNextName(new QName("bin"));
        generator.setNextIsAttribute(true);
        generator.writeBinary(Base64Variants.getDefaultVariant(), new byte[]{0x01, 0x02}, 0, 2);
        assertArrayEquals(new byte[]{0x01, 0x02}, ((TestXMLStreamWriter)xmlStreamWriter).lastBinaryAttribute);
    }

    @Test
    public void testWriteBinaryUnwrapped() throws IOException {
        generator.setNextName(new QName("bin"));
        generator.setNextIsUnwrapped(true);
        generator.writeBinary(Base64Variants.getDefaultVariant(), new byte[]{0x01, 0x02}, 0, 2);
        assertArrayEquals(new byte[]{0x01, 0x02}, ((TestXMLStreamWriter)xmlStreamWriter).lastBinary);
    }

    @Test
    public void testWriteBinaryNull() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.setNextIsUnwrapped(true);
        generator.writeBinary(Base64Variants.getDefaultVariant(), null, 0, 0);
        assertNull(((TestXMLStreamWriter)xmlStreamWriter).lastCharacters);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteBinaryMissingName() throws IOException {
        generator.writeBinary(Base64Variants.getDefaultVariant(), new byte[0], 0, 0);
    }

    @Test
    public void testWriteBooleanAttribute() throws IOException {
        generator.setNextName(new QName("bool"));
        generator.setNextIsAttribute(true);
        generator.writeBoolean(true);
        assertTrue(((TestXMLStreamWriter)xmlStreamWriter).lastBooleanAttribute);
    }

    @Test
    public void testWriteBooleanUnwrapped() throws IOException {
        generator.setNextName(new QName("bool"));
        generator.setNextIsUnwrapped(true);
        generator.writeBoolean(true);
        assertTrue(((TestXMLStreamWriter)xmlStreamWriter).lastBoolean);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteBooleanMissingName() throws IOException {
        generator.writeBoolean(true);
    }

    @Test
    public void testWriteNullAttribute() throws IOException {
        generator.setNextName(new QName("null"));
        generator.setNextIsAttribute(true);
        generator.writeNull();
    }

    @Test
    public void testWriteNullUnwrapped() throws IOException {
        generator.setNextName(new QName("null"));
        generator.setNextIsUnwrapped(true);
        generator.writeNull();
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteNullMissingName() throws IOException {
        generator.writeNull();
    }

    @Test
    public void testWriteNumberIntAttribute() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(42);
        assertEquals(42, ((TestXMLStreamWriter)xmlStreamWriter).lastIntAttribute);
    }

    @Test
    public void testWriteNumberIntUnwrapped() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(42);
        assertEquals(42, ((TestXMLStreamWriter)xmlStreamWriter).lastInt);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteNumberIntMissingName() throws IOException {
        generator.writeNumber(42);
    }

    @Test
    public void testWriteNumberLongAttribute() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(42L);
        assertEquals(42L, ((TestXMLStreamWriter)xmlStreamWriter).lastLongAttribute);
    }

    @Test
    public void testWriteNumberLongUnwrapped() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(42L);
        assertEquals(42L, ((TestXMLStreamWriter)xmlStreamWriter).lastLong);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteNumberLongMissingName() throws IOException {
        generator.writeNumber(42L);
    }

    @Test
    public void testWriteNumberDoubleAttribute() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(3.14);
        assertEquals(3.14, ((TestXMLStreamWriter)xmlStreamWriter).lastDoubleAttribute, 0.001);
    }

    @Test
    public void testWriteNumberDoubleUnwrapped() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(3.14);
        assertEquals(3.14, ((TestXMLStreamWriter)xmlStreamWriter).lastDouble, 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteNumberDoubleMissingName() throws IOException {
        generator.writeNumber(3.14);
    }

    @Test
    public void testWriteNumberFloatAttribute() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(2.71f);
        assertEquals(2.71f, ((TestXMLStreamWriter)xmlStreamWriter).lastFloatAttribute, 0.001);
    }

    @Test
    public void testWriteNumberFloatUnwrapped() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(2.71f);
        assertEquals(2.71f, ((TestXMLStreamWriter)xmlStreamWriter).lastFloat, 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteNumberFloatMissingName() throws IOException {
        generator.writeNumber(2.71f);
    }

    @Test
    public void testWriteNumberBigDecimalAttribute() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(new BigDecimal("123.45"));
        assertEquals("123.45", ((TestXMLStreamWriter)xmlStreamWriter).lastAttributeValue);
    }

    @Test
    public void testWriteNumberBigDecimalUnwrapped() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(new BigDecimal("123.45"));
        assertEquals(new BigDecimal("123.45"), ((TestXMLStreamWriter)xmlStreamWriter).lastDecimal);
    }

    @Test
    public void testWriteNumberBigDecimalNull() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber((BigDecimal) null);
        assertNull(((TestXMLStreamWriter)xmlStreamWriter).lastCharacters);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteNumberBigDecimalMissingName() throws IOException {
        generator.writeNumber(new BigDecimal("1"));
    }

    @Test
    public void testWriteNumberBigIntegerAttribute() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsAttribute(true);
        generator.writeNumber(new BigInteger("42"));
        assertEquals(new BigInteger("42"), ((TestXMLStreamWriter)xmlStreamWriter).lastIntegerAttribute);
    }

    @Test
    public void testWriteNumberBigIntegerUnwrapped() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber(new BigInteger("42"));
        assertEquals(new BigInteger("42"), ((TestXMLStreamWriter)xmlStreamWriter).lastInteger);
    }

    @Test
    public void testWriteNumberBigIntegerNull() throws IOException {
        generator.setNextName(new QName("elem"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber((BigInteger) null);
        assertNull(((TestXMLStreamWriter)xmlStreamWriter).lastCharacters);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteNumberBigIntegerMissingName() throws IOException {
        generator.writeNumber(new BigInteger("1"));
    }

    @Test
    public void testWriteNumberString() throws IOException {
        generator.setNextName(new QName("num"));
        generator.setNextIsUnwrapped(true);
        generator.writeNumber("123");
        assertEquals("123", ((TestXMLStreamWriter)xmlStreamWriter).lastCharacters);
    }

    @Test
    public void testFlushEnabled() throws IOException {
        generator.enable(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM);
        generator.flush();
        assertTrue(((TestXMLStreamWriter)xmlStreamWriter).flushed);
    }

    @Test
    public void testFlushDisabled() throws IOException {
        generator.flush();
        assertFalse(((TestXMLStreamWriter)xmlStreamWriter).flushed);
    }

    @Test
    public void testClose() throws IOException {
        generator.close();
        assertTrue(((TestXMLStreamWriter)xmlStreamWriter).closed);
    }

    @Test
    public void testCloseAutoCloseJsonContent() throws IOException {
        generator.enable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        generator._writeContext = generator._writeContext.createChildArrayContext();
        generator.close();
        assertTrue(generator._writeContext.inRoot());
    }

    @Test
    public void testCheckNextIsUnwrappedTrue() {
        generator._nextIsUnwrapped = true;
        assertTrue(generator.checkNextIsUnwrapped());
        assertFalse(generator._nextIsUnwrapped);
    }

    @Test
    public void testCheckNextIsUnwrappedFalse() {
        generator._nextIsUnwrapped = false;
        assertFalse(generator.checkNextIsUnwrapped());
    }

    @Test(expected = IllegalStateException.class)
    public void testHandleMissingName() {
        generator.handleMissingName();
    }

    public static class TestSerializableString implements SerializableString {
        private final String value;
        public TestSerializableString(String v) { value = v; }
        public String getValue() { return value; }
        public int charLength() { return value.length(); }
        public char[] asQuotedChars() { return value.toCharArray(); }
        public byte[] asUnquotedUTF8() { return value.getBytes(); }
        public byte[] asQuotedUTF8() { return value.getBytes(); }
        public byte[] asUnquotedUTF8(byte[] buffer, int offset) { return value.getBytes(); }
        public byte[] asQuotedUTF8(byte[] buffer, int offset) { return value.getBytes(); }
        public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
        public int appendQuoted(char[] buffer, int offset) { return 0; }
        public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
        public int appendUnquoted(char[] buffer, int offset) { return 0; }
        public int writeQuotedUTF8(OutputStream out) throws IOException { return 0; }
        public int writeUnquotedUTF8(OutputStream out) throws IOException { return 0; }
        public int putQuotedUTF8(OutputStream out) throws IOException { return 0; }
    }
}