package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature;
import javax.xml.stream.XMLStreamReader;

public class FromXmlParserTest {
    private FromXmlParser parser;
    private IOContext ctxt;
    private ObjectCodec codec;
    private XMLStreamReader xmlReader;

    @Before
    public void setUp() {
        ctxt = new IOContext(null, null, false);
        codec = null;
        xmlReader = null;
        parser = new FromXmlParser(ctxt, 0, 0, codec, xmlReader);
    }

    @Test
    public void testVersion() {
        assertNotNull(parser.version());
    }

    @Test
    public void testGetCodec() {
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodec() {
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testSetXMLTextElementName() {
        parser.setXMLTextElementName("testName");
    }

    @Test
    public void testRequiresCustomCodec() {
        assertTrue(parser.requiresCustomCodec());
    }

    @Test
    public void testEnableAndIsEnabled() {
        Feature f = null;
        try {
            f = Feature.values()[0];
        } catch (Exception e) {
            return;
        }
        parser.enable(f);
        assertTrue(parser.isEnabled(f));
    }

    @Test
    public void testDisableAndIsEnabled() {
        Feature f = null;
        try {
            f = Feature.values()[0];
        } catch (Exception e) {
            return;
        }
        parser.enable(f);
        parser.disable(f);
        assertFalse(parser.isEnabled(f));
    }

    @Test
    public void testConfigureTrue() {
        Feature f = null;
        try {
            f = Feature.values()[0];
        } catch (Exception e) {
            return;
        }
        parser.configure(f, true);
        assertTrue(parser.isEnabled(f));
    }

    @Test
    public void testConfigureFalse() {
        Feature f = null;
        try {
            f = Feature.values()[0];
        } catch (Exception e) {
            return;
        }
        parser.configure(f, false);
        assertFalse(parser.isEnabled(f));
    }

    @Test
    public void testGetFormatFeatures() {
        assertEquals(0, parser.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeatures() {
        parser.overrideFormatFeatures(0xFF, 0xFF);
        assertEquals(0xFF, parser.getFormatFeatures());
    }

    @Test
    public void testGetStaxReader() {
        assertNull(parser.getStaxReader());
    }

    @Test
    public void testAddVirtualWrappingEmpty() {
        parser.addVirtualWrapping(null);
        assertNull(parser.getParsingContext().getNamesToWrap());
    }

    @Test
    public void testIsClosedInitially() {
        assertFalse(parser.isClosed());
    }

    @Test
    public void testCloseAndIsClosed() throws Exception {
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetParsingContext() {
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testGetTokenLocation() {
        assertNotNull(parser.getTokenLocation());
    }

    @Test
    public void testGetCurrentLocation() {
        assertNotNull(parser.getCurrentLocation());
    }

    @Test
    public void testIsExpectedStartArrayTokenBase() {
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testGetCurrentNameNullCurrToken() {
        parser._currToken = JsonToken.START_OBJECT;
        try {
            parser.getCurrentName();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testOverrideCurrentName() {
        parser._currToken = JsonToken.START_OBJECT;
        parser.overrideCurrentName("newName");
    }

    @Test
    public void testGetTextNullToken() throws Exception {
        parser._currToken = null;
        assertNull(parser.getText());
    }

    @Test
    public void testGetTextFieldName() throws Exception {
        parser._currToken = JsonToken.FIELD_NAME;
        parser._parsingContext.setCurrentName("field");
        assertEquals("field", parser.getText());
    }

    @Test
    public void testGetTextValueString() throws Exception {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "value";
        assertEquals("value", parser.getText());
    }

    @Test
    public void testGetValueAsStringNullToken() throws Exception {
        parser._currToken = null;
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringFieldName() throws Exception {
        parser._currToken = JsonToken.FIELD_NAME;
        parser._parsingContext.setCurrentName("field");
        assertEquals("field", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringValueString() throws Exception {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "val";
        assertEquals("val", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringStartObject() throws Exception {
        parser._currToken = JsonToken.START_OBJECT;
        assertNull(parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringScalar() throws Exception {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertEquals("0", parser.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharacters() throws Exception {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "abc";
        char[] chars = parser.getTextCharacters();
        assertArrayEquals(new char[]{'a', 'b', 'c'}, chars);
    }

    @Test
    public void testGetTextCharactersNull() throws Exception {
        parser._currToken = null;
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLength() throws Exception {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._currText = "12345";
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthNull() throws Exception {
        parser._currToken = null;
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testHasTextCharacters() {
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetEmbeddedObject() throws Exception {
        assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValueNotValueString() throws Exception {
        parser._currToken = JsonToken.START_OBJECT;
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testGetBinaryValueEmbeddedObjectWithBinary() throws Exception {
        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser._binaryValue = new byte[]{1,2,3};
        byte[] result = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[]{1,2,3}, result);
    }

    @Test
    public void testGetBigIntegerValue() throws Exception {
        assertNull(parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws Exception {
        assertNull(parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        assertEquals(0.0, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testGetFloatValue() throws Exception {
        assertEquals(0.0f, parser.getFloatValue(), 0.0f);
    }

    @Test
    public void testGetIntValue() throws Exception {
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws Exception {
        assertEquals(0L, parser.getLongValue());
    }

    @Test
    public void testGetNumberType() throws Exception {
        assertNull(parser.getNumberType());
    }

    @Test
    public void testGetNumberValue() throws Exception {
        assertNull(parser.getNumberValue());
    }

    @Test
    public void testIsEmptyNull() {
        assertTrue(parser._isEmpty(null));
    }

    @Test
    public void testIsEmptyEmpty() {
        assertTrue(parser._isEmpty(""));
    }

    @Test
    public void testIsEmptyOnlySpaces() {
        assertTrue(parser._isEmpty("   "));
    }

    @Test
    public void testIsEmptyNonEmpty() {
        assertFalse(parser._isEmpty("a"));
    }

    @Test
    public void testGetByteArrayBuilderFirstCall() {
        assertNotNull(parser._getByteArrayBuilder());
    }

    @Test
    public void testGetByteArrayBuilderSecondCallResets() {
        parser._getByteArrayBuilder();
        assertNotNull(parser._getByteArrayBuilder());
    }

    @Test
    public void testReleaseBuffers() throws Exception {
        parser._releaseBuffers();
    }

    @Test
    public void testCollectDefaults() {
        assertEquals(0, Feature.collectDefaults());
    }

    @Test
    public void testFeatureEnabledByDefault() {
        Feature f = null;
        try {
            f = Feature.values()[0];
        } catch (Exception e) {
            return;
        }
        assertFalse(f.enabledByDefault());
    }

    @Test
    public void testFeatureGetMask() {
        Feature f = null;
        try {
            f = Feature.values()[0];
        } catch (Exception e) {
            return;
        }
        assertEquals(1, f.getMask());
    }

    @Test
    public void testFeatureEnabledIn() {
        Feature f = null;
        try {
            f = Feature.values()[0];
        } catch (Exception e) {
            return;
        }
        assertTrue(f.enabledIn(1));
        assertFalse(f.enabledIn(0));
    }
}