package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.stream.XMLStreamReader;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FromXmlParserTest {

    private FromXmlParser createParser() {
        IOContext ctxt = new IOContext(IOContext.allocationContext(), null, null, true);
        XMLStreamReader xmlReader = null;
        XmlMapper mapper = new XmlMapper();
        return new FromXmlParser(ctxt, 0, 0, mapper, xmlReader);
    }

    @Test
    public void testInitialState() throws IOException {
        FromXmlParser parser = createParser();
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertFalse(parser.isClosed());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCurrentNameNullThrows() throws IOException {
        FromXmlParser parser = createParser();
        parser.nextToken();
        parser.nextToken();
    }

    @Test
    public void testOverrideCurrentName() throws IOException {
        FromXmlParser parser = createParser();
        parser.nextToken();
        parser.overrideCurrentName("testName");
        assertEquals("testName", parser.getCurrentName());
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        FromXmlParser parser = createParser();
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        parser.close();
    }

    @Test
    public void testVersion() {
        FromXmlParser parser = createParser();
        assertNotNull(parser.version());
    }

    @Test
    public void testGetCodecAndSetCodec() {
        FromXmlParser parser = createParser();
        assertNotNull(parser.getCodec());
        parser.setCodec(null);
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetXMLTextElementName() {
        FromXmlParser parser = createParser();
        parser.setXMLTextElementName("customName");
        assertEquals("customName", parser._cfgNameForTextElement);
    }

    @Test
    public void testRequiresCustomCodec() {
        FromXmlParser parser = createParser();
        assertTrue(parser.requiresCustomCodec());
    }

    @Test
    public void testEnableDisableFeature() {
        FromXmlParser parser = createParser();
        assertFalse(parser.isEnabled(FromXmlParser.Feature.values()[0]));
        parser.enable(FromXmlParser.Feature.values()[0]);
        assertTrue(parser.isEnabled(FromXmlParser.Feature.values()[0]));
        parser.disable(FromXmlParser.Feature.values()[0]);
        assertFalse(parser.isEnabled(FromXmlParser.Feature.values()[0]));
    }

    @Test
    public void testConfigureFeature() {
        FromXmlParser parser = createParser();
        parser.configure(FromXmlParser.Feature.values()[0], true);
        assertTrue(parser.isEnabled(FromXmlParser.Feature.values()[0]));
        parser.configure(FromXmlParser.Feature.values()[0], false);
        assertFalse(parser.isEnabled(FromXmlParser.Feature.values()[0]));
    }

    @Test
    public void testGetFormatFeatures() {
        FromXmlParser parser = createParser();
        assertEquals(0, parser.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeatures() {
        FromXmlParser parser = createParser();
        parser.overrideFormatFeatures(1, 1);
        assertEquals(1, parser.getFormatFeatures());
        parser.overrideFormatFeatures(0, 0);
        assertEquals(1, parser.getFormatFeatures());
    }

    @Test
    public void testGetStaxReader() {
        FromXmlParser parser = createParser();
        assertNull(parser.getStaxReader());
    }

    @Test
    public void testAddVirtualWrappingNullName() {
        FromXmlParser parser = createParser();
        Set<String> names = new HashSet<>();
        names.add("test");
        parser.addVirtualWrapping(names);
        assertNull(parser._namesToWrap);
    }

    @Test
    public void testIsExpectedStartArrayTokenStartObject() {
        FromXmlParser parser = createParser();
        parser.nextToken();
        assertTrue(parser.isExpectedStartArrayToken());
        assertEquals(JsonToken.START_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testIsExpectedStartArrayTokenStartArray() {
        FromXmlParser parser = createParser();
        parser.nextToken();
        parser.isExpectedStartArrayToken();
        assertTrue(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartArrayTokenOther() throws IOException {
        FromXmlParser parser = createParser();
        parser.nextToken();
        parser.isExpectedStartArrayToken();
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testGetTextNullToken() throws IOException {
        FromXmlParser parser = createParser();
        parser.clearCurrentToken();
        assertNull(parser.getText());
    }

    @Test
    public void testGetTextCharacters() throws IOException {
        FromXmlParser parser = createParser();
        parser.nextToken();
        assertNotNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLength() throws IOException {
        FromXmlParser parser = createParser();
        parser.nextToken();
        assertTrue(parser.getTextLength() >= 0);
    }

    @Test
    public void testGetTextOffset() {
        FromXmlParser parser = createParser();
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testHasTextCharacters() {
        FromXmlParser parser = createParser();
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetEmbeddedObject() throws IOException {
        FromXmlParser parser = createParser();
        assertNull(parser.getEmbeddedObject());
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongToken() throws IOException {
        FromXmlParser parser = createParser();
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testGetBigIntegerValue() throws IOException {
        FromXmlParser parser = createParser();
        assertNull(parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws IOException {
        FromXmlParser parser = createParser();
        assertNull(parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws IOException {
        FromXmlParser parser = createParser();
        assertEquals(0.0, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testGetFloatValue() throws IOException {
        FromXmlParser parser = createParser();
        assertEquals(0.0f, parser.getFloatValue(), 0.0f);
    }

    @Test
    public void testGetIntValue() throws IOException {
        FromXmlParser parser = createParser();
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws IOException {
        FromXmlParser parser = createParser();
        assertEquals(0L, parser.getLongValue());
    }

    @Test
    public void testGetNumberType() throws IOException {
        FromXmlParser parser = createParser();
        assertNull(parser.getNumberType());
    }

    @Test
    public void testGetNumberValue() throws IOException {
        FromXmlParser parser = createParser();
        assertNull(parser.getNumberValue());
    }

    @Test
    public void testGetValueAsStringNull() throws IOException {
        FromXmlParser parser = createParser();
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws IOException {
        FromXmlParser parser = createParser();
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testIsEmptyString() {
        FromXmlParser parser = createParser();
        assertTrue(parser._isEmpty(""));
        assertTrue(parser._isEmpty("   "));
        assertFalse(parser._isEmpty("a"));
        assertFalse(parser._isEmpty(" a "));
        assertTrue(parser._isEmpty(null));
    }
}