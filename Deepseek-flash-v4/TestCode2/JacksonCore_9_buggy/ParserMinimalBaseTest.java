package com.fasterxml.jackson.core.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;

public class ParserMinimalBaseTest {

    private static class TestParser extends ParserMinimalBase {
        private JsonToken nextTokenResult;
        private String currentName;
        private boolean closed;
        private IOException nextTokenException;
        private IOException getTextException;
        private IOException getBinaryValueException;
        private IOException getEmbeddedObjectException;
        private IOException getIntValueException;
        private IOException getLongValueException;
        private IOException getDoubleValueException;
        private IOException getTextCharactersException;
        private IOException getTextLengthException;
        private IOException getTextOffsetException;
        private IOException overrideCurrentNameException;
        private IOException getParsingContextException;
        private IOException getCurrentLocationException;
        private IOException getTokenLocationException;

        public TestParser() {
            super(0);
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (nextTokenException != null) {
                throw nextTokenException;
            }
            _currToken = nextTokenResult;
            return nextTokenResult;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            throw new JsonParseException("EOF", JsonLocation.NA);
        }

        @Override
        public String getCurrentName() throws IOException {
            if (overrideCurrentNameException != null) {
                throw overrideCurrentNameException;
            }
            return currentName;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        @Override
        public boolean isClosed() {
            return closed;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return null;
        }

        @Override
        public JsonLocation getTokenLocation() {
            return null;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return null;
        }

        @Override
        public void overrideCurrentName(String name) {
            currentName = name;
        }

        @Override
        public String getText() throws IOException {
            if (getTextException != null) {
                throw getTextException;
            }
            return currentName;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            if (getTextCharactersException != null) {
                throw getTextCharactersException;
            }
            return new char[0];
        }

        @Override
        public boolean hasTextCharacters() {
            return false;
        }

        @Override
        public int getTextLength() throws IOException {
            if (getTextLengthException != null) {
                throw getTextLengthException;
            }
            return 0;
        }

        @Override
        public int getTextOffset() throws IOException {
            if (getTextOffsetException != null) {
                throw getTextOffsetException;
            }
            return 0;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
            if (getBinaryValueException != null) {
                throw getBinaryValueException;
            }
            return new byte[0];
        }

        @Override
        public Object getEmbeddedObject() throws IOException {
            if (getEmbeddedObjectException != null) {
                throw getEmbeddedObjectException;
            }
            return null;
        }

        @Override
        public int getIntValue() throws IOException {
            if (getIntValueException != null) {
                throw getIntValueException;
            }
            return 42;
        }

        @Override
        public long getLongValue() throws IOException {
            if (getLongValueException != null) {
                throw getLongValueException;
            }
            return 42L;
        }

        @Override
        public double getDoubleValue() throws IOException {
            if (getDoubleValueException != null) {
                throw getDoubleValueException;
            }
            return 42.0;
        }

        @Override
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) {
        }

        @Override
        public Version version() {
            return null;
        }
    }

    private TestParser parser;

    @Before
    public void setUp() throws Exception {
        parser = new TestParser();
    }

    // getCurrentToken tests
    @Test
    public void testGetCurrentTokenReturnsNullInitially() {
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testGetCurrentTokenAfterNextToken() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        assertSame(JsonToken.START_ARRAY, parser.getCurrentToken());
    }

    // getCurrentTokenId tests
    @Test
    public void testGetCurrentTokenIdReturnsNoTokenWhenNull() {
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void testGetCurrentTokenIdReturnsTokenId() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        assertEquals(JsonToken.START_ARRAY.id(), parser.getCurrentTokenId());
    }

    // hasCurrentToken tests
    @Test
    public void testHasCurrentTokenFalseWhenNull() {
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testHasCurrentTokenTrueWhenNotNull() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        assertTrue(parser.hasCurrentToken());
    }

    // hasTokenId tests
    @Test
    public void testHasTokenIdWithNullToken() {
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
    }

    @Test
    public void testHasTokenIdWithToken() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        assertTrue(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
    }

    // hasToken tests
    @Test
    public void testHasTokenNull() {
        assertFalse(parser.hasToken(JsonToken.START_ARRAY));
    }

    @Test
    public void testHasTokenMatch() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        assertTrue(parser.hasToken(JsonToken.START_ARRAY));
    }

    @Test
    public void testHasTokenNoMatch() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        assertFalse(parser.hasToken(JsonToken.START_OBJECT));
    }

    // isExpectedStartArrayToken tests
    @Test
    public void testIsExpectedStartArrayTokenFalse() {
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartArrayTokenTrue() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        assertTrue(parser.isExpectedStartArrayToken());
    }

    // isExpectedStartObjectToken tests
    @Test
    public void testIsExpectedStartObjectTokenFalse() {
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testIsExpectedStartObjectTokenTrue() throws IOException {
        parser.nextTokenResult = JsonToken.START_OBJECT;
        parser.nextToken();
        assertTrue(parser.isExpectedStartObjectToken());
    }

    // nextValue tests
    @Test
    public void testNextValueWithFieldName() throws IOException {
        parser.nextTokenResult = JsonToken.FIELD_NAME;
        parser.nextValue();
        assertSame(JsonToken.FIELD_NAME, parser.getCurrentToken());
    }

    @Test
    public void testNextValueWithNonFieldName() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextValue();
        assertSame(JsonToken.START_ARRAY, parser.getCurrentToken());
    }

    // skipChildren tests
    @Test
    public void testSkipChildrenWhenNotStartObjectOrArray() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.skipChildren();
        assertSame(JsonToken.VALUE_STRING, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildrenWithNestedStructures() throws IOException {
        parser.nextTokenResult = JsonToken.START_OBJECT;
        parser.skipChildren();
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testSkipChildrenWhenNullToken() throws IOException {
        parser.nextTokenResult = JsonToken.START_OBJECT;
        parser.skipChildren();
        assertNull(parser.getCurrentToken());
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildrenWhenEOF() throws IOException {
        parser.nextTokenResult = null;
        parser.skipChildren();
    }

    // clearCurrentToken tests
    @Test
    public void testClearCurrentTokenWhenNotNull() throws IOException {
        parser.nextTokenResult = JsonToken.START_ARRAY;
        parser.nextToken();
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertSame(JsonToken.START_ARRAY, parser.getLastClearedToken());
    }

    @Test
    public void testClearCurrentTokenWhenNull() {
        parser.clearCurrentToken();
        assertNull(parser.getLastClearedToken());
    }

    // getLastClearedToken tests
    @Test
    public void testGetLastClearedTokenInitiallyNull() {
        assertNull(parser.getLastClearedToken());
    }

    // getValueAsBoolean tests
    @Test
    public void testGetValueAsBooleanDefault() throws IOException {
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanStringTrue() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "true";
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanStringFalse() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "false";
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanStringNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "null";
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanNumberIntNonZero() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_INT;
        parser.nextToken();
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanTrue() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_TRUE;
        parser.nextToken();
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanFalse() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_FALSE;
        parser.nextToken();
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NULL;
        parser.nextToken();
        assertFalse(parser.getValueAsBoolean(true));
    }

    // getValueAsInt tests
    @Test
    public void testGetValueAsIntNoArg() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_INT;
        parser.nextToken();
        assertEquals(42, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntNoArgFloat() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_FLOAT;
        parser.nextToken();
        assertEquals(42, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntDefault() throws IOException {
        assertNull(parser.getCurrentToken());
        assertEquals(10, parser.getValueAsInt(10));
    }

    @Test
    public void testGetValueAsIntWithDefault() throws IOException {
        assertEquals(10, parser.getValueAsInt(10));
    }

    @Test
    public void testGetValueAsIntString() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "123";
        assertEquals(123, parser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsIntStringNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "null";
        assertEquals(0, parser.getValueAsInt(10));
    }

    @Test
    public void testGetValueAsIntTrue() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_TRUE;
        parser.nextToken();
        assertEquals(1, parser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsIntFalse() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_FALSE;
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt(10));
    }

    @Test
    public void testGetValueAsIntNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NULL;
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt(10));
    }

    // getValueAsLong tests
    @Test
    public void testGetValueAsLongNoArg() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_INT;
        parser.nextToken();
        assertEquals(42L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongNoArgFloat() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_FLOAT;
        parser.nextToken();
        assertEquals(42L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongDefault() throws IOException {
        assertEquals(10L, parser.getValueAsLong(10L));
    }

    @Test
    public void testGetValueAsLongString() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "123";
        assertEquals(123L, parser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsLongStringNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "null";
        assertEquals(0L, parser.getValueAsLong(10L));
    }

    @Test
    public void testGetValueAsLongTrue() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_TRUE;
        parser.nextToken();
        assertEquals(1L, parser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsLongFalse() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_FALSE;
        parser.nextToken();
        assertEquals(0L, parser.getValueAsLong(10L));
    }

    @Test
    public void testGetValueAsLongNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NULL;
        parser.nextToken();
        assertEquals(0L, parser.getValueAsLong(10L));
    }

    // getValueAsDouble tests
    @Test
    public void testGetValueAsDoubleDefault() throws IOException {
        assertEquals(10.0, parser.getValueAsDouble(10.0), 0.0);
    }

    @Test
    public void testGetValueAsDoubleString() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "1.5";
        assertEquals(1.5, parser.getValueAsDouble(0.0), 0.0);
    }

    @Test
    public void testGetValueAsDoubleStringNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "null";
        assertEquals(0.0, parser.getValueAsDouble(10.0), 0.0);
    }

    @Test
    public void testGetValueAsDoubleNumberInt() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_INT;
        parser.nextToken();
        assertEquals(42.0, parser.getValueAsDouble(0.0), 0.0);
    }

    @Test
    public void testGetValueAsDoubleNumberFloat() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_FLOAT;
        parser.nextToken();
        assertEquals(42.0, parser.getValueAsDouble(0.0), 0.0);
    }

    @Test
    public void testGetValueAsDoubleTrue() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_TRUE;
        parser.nextToken();
        assertEquals(1.0, parser.getValueAsDouble(0.0), 0.0);
    }

    @Test
    public void testGetValueAsDoubleFalse() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_FALSE;
        parser.nextToken();
        assertEquals(0.0, parser.getValueAsDouble(10.0), 0.0);
    }

    @Test
    public void testGetValueAsDoubleNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NULL;
        parser.nextToken();
        assertEquals(0.0, parser.getValueAsDouble(10.0), 0.0);
    }

    // getValueAsString tests
    @Test
    public void testGetValueAsStringNoArg() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        parser.nextToken();
        parser.currentName = "test";
        assertEquals("test", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringNoArgNotString() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_INT;
        parser.nextToken();
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringDefault() throws IOException {
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringDefaultWhenNull() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NULL;
        parser.nextToken();
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringDefaultWhenScalar() throws IOException {
        parser.nextTokenResult = JsonToken.VALUE_NUMBER_INT;
        parser.nextToken();
        parser.currentName = "42";
        assertEquals("42", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringWhenNullToken() throws IOException {
        assertNull(parser.getCurrentToken());
        assertEquals("default", parser.getValueAsString("default"));
    }

    // _hasTextualNull tests
    @Test
    public void testHasTextualNullWithNullString() {
        assertTrue(parser._hasTextualNull("null"));
    }

    @Test
    public void testHasTextualNullWithNonNull() {
        assertFalse(parser._hasTextualNull("not null"));
    }

    // close tests
    @Test
    public void testClose() throws IOException {
        parser.close();
        assertTrue(parser.isClosed());
    }

    // isClosed tests
    @Test
    public void testIsClosedInitially() {
        assertFalse(parser.isClosed());
    }

    // overrideCurrentName tests
    @Test
    public void testOverrideCurrentName() throws IOException {
        parser.overrideCurrentName("newName");
        assertEquals("newName", parser.getCurrentName());
    }

    // _decodeBase64 tests
    @Test(expected = JsonParseException.class)
    public void testDecodeBase64Invalid() throws IOException {
        parser._decodeBase64("invalid", new ByteArrayBuilder(), Base64Variant.STD_BASE64);
    }

    // _reportInvalidBase64 tests
    @Test(expected = JsonParseException.class)
    public void testReportInvalidBase64() throws JsonParseException {
        parser._reportInvalidBase64(Base64Variant.STD_BASE64, '!', 0, "test");
    }

    // _reportBase64EOF tests
    @Test(expected = JsonParseException.class)
    public void testReportBase64EOF() throws JsonParseException {
        parser._reportBase64EOF();
    }

    // _reportUnexpectedChar tests
    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedChar() throws JsonParseException {
        parser._reportUnexpectedChar(65, "test");
    }

    // _reportInvalidEOF tests
    @Test(expected = JsonParseException.class)
    public void testReportInvalidEOF() throws JsonParseException {
        parser._reportInvalidEOF();
    }

    // _reportInvalidEOFInValue tests
    @Test(expected = JsonParseException.class)
    public void testReportInvalidEOFInValue() throws JsonParseException {
        parser._reportInvalidEOFInValue();
    }

    // _reportMissingRootWS tests
    @Test(expected = JsonParseException.class)
    public void testReportMissingRootWS() throws JsonParseException {
        parser._reportMissingRootWS(65);
    }

    // _throwInvalidSpace tests
    @Test(expected = JsonParseException.class)
    public void testThrowInvalidSpace() throws JsonParseException {
        parser._throwInvalidSpace(1);
    }

    // _throwUnquotedSpace tests
    @Test(expected = JsonParseException.class)
    public void testThrowUnquotedSpace() throws JsonParseException {
        parser._throwUnquotedSpace(1, "string value");
    }

    // _handleUnrecognizedCharacterEscape tests
    @Test(expected = JsonParseException.class)
    public void testHandleUnrecognizedCharacterEscape() throws JsonProcessingException {
        parser._handleUnrecognizedCharacterEscape('a');
    }

    // _getCharDesc tests
    @Test
    public void testGetCharDescCtrlChar() {
        String desc = ParserMinimalBase._getCharDesc(0);
        assertTrue(desc.contains("CTRL-CHAR"));
    }

    @Test
    public void testGetCharDescAscii() {
        String desc = ParserMinimalBase._getCharDesc(65);
        assertEquals("'A' (code 65)", desc);
    }

    @Test
    public void testGetCharDescNonAscii() {
        String desc = ParserMinimalBase._getCharDesc(256);
        assertEquals("'Ā' (code 256 / 0x100)", desc);
    }

    // _reportError tests
    @Test(expected = JsonParseException.class)
    public void testReportError() throws JsonParseException {
        parser._reportError("test error");
    }

    // _wrapError tests
    @Test(expected = JsonParseException.class)
    public void testWrapError() throws JsonParseException {
        parser._wrapError("test", new RuntimeException("cause"));
    }

    // _throwInternal tests
    @Test(expected = RuntimeException.class)
    public void testThrowInternal() {
        parser._throwInternal();
    }

    // _constructError tests
    @Test
    public void testConstructError() {
        JsonParseException e = parser._constructError("test", null);
        assertEquals("test", e.getMessage());
    }

    // _asciiBytes tests
    @Test
    public void testAsciiBytes() {
        byte[] bytes = ParserMinimalBase._asciiBytes("ABC");
        assertEquals(3, bytes.length);
        assertEquals(65, bytes[0]);
        assertEquals(66, bytes[1]);
        assertEquals(67, bytes[2]);
    }

    // _ascii tests
    @Test
    public void testAscii() {
        String str = ParserMinimalBase._ascii(new byte[] {65, 66, 67});
        assertEquals("ABC", str);
    }
}