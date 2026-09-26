package com.fasterxml.jackson.core.base;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;

public class ParserBaseTest {

    private static class TestIOContext extends IOContext {
        public TestIOContext() {
            super(null, null, false, null);
        }
        @Override
        public TextBuffer constructTextBuffer() {
            return new TextBuffer(null);
        }
        @Override
        public void releaseNameCopyBuffer(char[] buf) {
        }
        @Override
        public Object getSourceReference() {
            return null;
        }
    }

    private static class TestParser extends ParserBase {
        public TestParser(IOContext ctxt, int features) {
            super(ctxt, features);
        }
        @Override
        protected void _closeInput() throws IOException {}
        @Override
        public JsonToken nextToken() throws IOException { return null; }
        @Override
        public String getText() throws IOException { return "0"; }
        @Override
        public char[] getTextCharacters() throws IOException { return new char[0]; }
        @Override
        public int getTextLength() throws IOException { return 0; }
        @Override
        public int getTextOffset() throws IOException { return 0; }
        @Override
        public Object getEmbeddedObject() throws IOException { return null; }
        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override
        public boolean hasTextCharacters() { return false; }
        @Override
        public void clearCurrentToken() {}
        @Override
        public JsonLocation getTokenLocation() { return null; }
        @Override
        public JsonLocation getCurrentLocation() { return null; }
        @Override
        public int releaseBuffered(OutputStream out) throws IOException { return 0; }
    }

    private TestParser parser;

    @Before
    public void setUp() throws Exception {
        int features = 0;
        parser = new TestParser(new TestIOContext(), features);
    }

    @Test
    public void testConstructorAndVersion() {
        assertNotNull(parser._textBuffer);
        assertNotNull(parser._parsingContext);
        assertFalse(parser._closed);
        assertNotNull(parser.version());
    }

    @Test
    public void testEnableDisable() {
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        parser.disable(Feature.STRICT_DUPLICATE_DETECTION);
        assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testSetFeatureMask() {
        int oldMask = parser._features;
        int newMask = oldMask | Feature.STRICT_DUPLICATE_DETECTION.getMask();
        parser.setFeatureMask(newMask);
        assertEquals(newMask, parser._features);
        parser.setFeatureMask(oldMask);
        assertEquals(oldMask, parser._features);
    }

    @Test
    public void testOverrideStdFeatures() {
        int values = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        int mask = values;
        parser.overrideStdFeatures(values, mask);
        assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        parser.overrideStdFeatures(0, mask);
        assertFalse(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testGetCurrentName() throws IOException {
        assertNull(parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() {
        parser.overrideCurrentName("test");
        assertEquals("test", parser._parsingContext.getCurrentName());
    }

    @Test
    public void testClose() throws IOException {
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetParsingContext() {
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testHasTextCharacters() {
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetTokenCharacterOffset() {
        assertEquals(0L, parser.getTokenCharacterOffset());
    }

    @Test
    public void testGetTokenLineNr() {
        assertEquals(1, parser.getTokenLineNr());
    }

    @Test
    public void testGetTokenColumnNr() {
        assertEquals(1, parser.getTokenColumnNr());
    }

    @Test
    public void testReleaseBuffers() throws IOException {
        parser._releaseBuffers();
        assertNull(parser._nameCopyBuffer);
    }

    @Test(expected = JsonParseException.class)
    public void testHandleEOFInArray() throws IOException {
        parser._parsingContext = JsonReadContext.createRootContext(null);
        parser._handleEOF();
    }

    @Test
    public void testEofAsNextChar() throws IOException {
        try {
            parser._eofAsNextChar();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
        }
    }

    @Test
    public void testGetByteArrayBuilder() {
        ByteArrayBuilder builder = parser._getByteArrayBuilder();
        assertNotNull(builder);
        assertSame(builder, parser._getByteArrayBuilder());
    }

    @Test
    public void testReset() {
        JsonToken token = parser.reset(false, 1, 0, 0);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(1, parser._intLength);
        assertEquals(0, parser._fractLength);
        assertEquals(0, parser._expLength);
        assertFalse(parser._numberNegative);
        token = parser.reset(false, 1, 2, 3);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertEquals(1, parser._intLength);
        assertEquals(2, parser._fractLength);
        assertEquals(3, parser._expLength);
    }

    @Test
    public void testResetInt() {
        JsonToken token = parser.resetInt(true, 5);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertTrue(parser._numberNegative);
        assertEquals(5, parser._intLength);
        assertEquals(0, parser._fractLength);
        assertEquals(0, parser._expLength);
    }

    @Test
    public void testResetFloat() {
        JsonToken token = parser.resetFloat(false, 2, 3, 4);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertFalse(parser._numberNegative);
        assertEquals(2, parser._intLength);
        assertEquals(3, parser._fractLength);
        assertEquals(4, parser._expLength);
    }

    @Test
    public void testResetAsNaN() {
        JsonToken token = parser.resetAsNaN("NaN", Double.NaN);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, token);
        assertTrue(Double.isNaN(parser._numberDouble));
    }

    @Test
    public void testIsNaN() {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser._numTypesValid = ParserBase.NR_DOUBLE;
        parser._numberDouble = Double.NaN;
        assertTrue(parser.isNaN());
        parser._numberDouble = 1.0;
        assertFalse(parser.isNaN());
    }

    @Test
    public void testGetNumberValueFromInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = ParserBase.NR_INT;
        parser._numberInt = 42;
        assertEquals(42, parser.getNumberValue());
    }

    @Test
    public void testGetNumberTypeForInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = ParserBase.NR_INT;
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetIntValue() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = ParserBase.NR_INT;
        parser._numberInt = 10;
        assertEquals(10, parser.getIntValue());
    }

    @Test
    public void testGetLongValue() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = ParserBase.NR_LONG;
        parser._numberLong = 100L;
        assertEquals(100L, parser.getLongValue());
    }

    @Test
    public void testGetBigIntegerValue() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = ParserBase.NR_BIGINT;
        parser._numberBigInt = java.math.BigInteger.TEN;
        assertEquals(java.math.BigInteger.TEN, parser.getBigIntegerValue());
    }

    @Test
    public void testGetFloatValue() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser._numTypesValid = ParserBase.NR_DOUBLE;
        parser._numberDouble = 3.14;
        assertEquals(3.14f, parser.getFloatValue(), 0.0001f);
    }

    @Test
    public void testGetDoubleValue() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser._numTypesValid = ParserBase.NR_DOUBLE;
        parser._numberDouble = 2.718;
        assertEquals(2.718, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testGetDecimalValue() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser._numTypesValid = ParserBase.NR_BIGDECIMAL;
        parser._numberBigDecimal = new java.math.BigDecimal("1.23");
        assertEquals(new java.math.BigDecimal("1.23"), parser.getDecimalValue());
    }

    @Test
    public void testConvertNumberToIntFromLong() throws IOException {
        parser._numTypesValid = ParserBase.NR_LONG;
        parser._numberLong = 123L;
        parser.convertNumberToInt();
        assertEquals(123, parser._numberInt);
    }

    @Test(expected = JsonParseException.class)
    public void testConvertNumberToIntFromLongOverflow() throws IOException {
        parser._numTypesValid = ParserBase.NR_LONG;
        parser._numberLong = (long) Integer.MAX_VALUE + 1L;
        parser.convertNumberToInt();
    }

    @Test
    public void testConvertNumberToLongFromInt() throws IOException {
        parser._numTypesValid = ParserBase.NR_INT;
        parser._numberInt = 456;
        parser.convertNumberToLong();
        assertEquals(456L, parser._numberLong);
    }

    @Test
    public void testGetCurrentValue() {
        assertNull(parser.getCurrentValue());
        parser.setCurrentValue("testValue");
        assertEquals("testValue", parser.getCurrentValue());
    }

    @Test
    public void testGrowArrayByForNull() {
        int[] result = ParserBase.growArrayBy(null, 5);
        assertEquals(5, result.length);
    }

    @Test
    public void testGrowArrayByForNonNull() {
        int[] arr = {1, 2, 3};
        int[] result = ParserBase.growArrayBy(arr, 2);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

    @Test
    public void testGetSourceReference() {
        assertNull(parser._getSourceReference());
    }

    @Test
    public void testCheckStdFeatureChangesEnable() {
        int newFlags = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        int changedFields = newFlags;
        parser._checkStdFeatureChanges(newFlags, changedFields);
        assertNotNull(parser._parsingContext.getDupDetector());
    }

    @Test
    public void testCheckStdFeatureChangesDisable() {
        parser._parsingContext = JsonReadContext.createRootContext(DupDetector.rootDetector(parser));
        int newFlags = 0;
        int changedFields = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        parser._checkStdFeatureChanges(newFlags, changedFields);
        assertNull(parser._parsingContext.getDupDetector());
    }

    @Test(expected = JsonParseException.class)
    public void testHandleEOFInObject() throws IOException {
        parser._parsingContext = JsonReadContext.createRootContext(null);
        parser._handleEOF();
        fail();
    }

    @Test
    public void testParseIntValueShort() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._intLength = 5;
        parser._numberNegative = false;
        parser._textBuffer = new TextBuffer(null);
        parser._textBuffer.resetWithString("12345");
        int val = parser._parseIntValue();
        assertEquals(12345, val);
    }

    @Test
    public void testParseNumericValueIntShort() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._intLength = 9;
        parser._numberNegative = false;
        parser._textBuffer = new TextBuffer(null);
        parser._textBuffer.resetWithString("123456789");
        parser._parseNumericValue(ParserBase.NR_INT);
        assertEquals(ParserBase.NR_INT, parser._numTypesValid);
    }
}