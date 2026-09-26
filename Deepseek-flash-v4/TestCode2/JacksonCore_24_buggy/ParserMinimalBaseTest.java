package com.fasterxml.jackson.core.base;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.type.TypeReference;

public class ParserMinimalBaseTest {

    private static class TestParser extends ParserMinimalBase {
        private JsonToken next = JsonToken.NOT_AVAILABLE;
        private String text = "";
        private String currentName = "";
        private int intVal;
        private long longVal;
        private double doubleVal;
        private Object embeddedObject;
        private boolean closed;
        private boolean eof;

        public void setNextToken(JsonToken t) { this.next = t; }
        public void setText(String s) { this.text = s; }
        public void setCurrentName(String n) { this.currentName = n; }
        public void setIntVal(int v) { this.intVal = v; }
        public void setLongVal(long v) { this.longVal = v; }
        public void setDoubleVal(double v) { this.doubleVal = v; }
        public void setEmbeddedObject(Object o) { this.embeddedObject = o; }
        public void setEOF(boolean e) { this.eof = e; }

        @Override public JsonToken nextToken() throws IOException {
            if (eof) return null;
            _currToken = next;
            return next;
        }
        @Override public String getCurrentName() throws IOException { return currentName; }
        @Override public void close() throws IOException { closed = true; }
        @Override public boolean isClosed() { return closed; }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public String getText() throws IOException { return text; }
        @Override public char[] getTextCharacters() throws IOException { return text.toCharArray(); }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public int getTextLength() throws IOException { return text.length(); }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override public int getIntValue() throws IOException { return intVal; }
        @Override public long getLongValue() throws IOException { return longVal; }
        @Override public double getDoubleValue() throws IOException { return doubleVal; }
        @Override public Object getEmbeddedObject() throws IOException { return embeddedObject; }
        @Override public void overrideCurrentName(String name) { currentName = name; }
        @Override protected void _handleEOF() throws JsonParseException {
            throw new JsonEOFException(this, _currToken, "Unexpected end-of-input");
        }
        @Override public boolean hasCurrentToken() { return _currToken != null; }
        @Override public JsonToken currentToken() { return _currToken; }
        @Override public int currentTokenId() {
            final JsonToken t = _currToken;
            return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();
        }
        @Override public JsonToken getCurrentToken() { return _currToken; }
        @Override public int getCurrentTokenId() {
            final JsonToken t = _currToken;
            return (t == null) ? JsonTokenId.ID_NO_TOKEN : t.id();
        }
        @Override public boolean hasTokenId(int id) {
            final JsonToken t = _currToken;
            if (t == null) {
                return (JsonTokenId.ID_NO_TOKEN == id);
            }
            return t.id() == id;
        }
        @Override public boolean hasToken(JsonToken t) { return (_currToken == t); }
        @Override public boolean isExpectedStartArrayToken() { return _currToken == JsonToken.START_ARRAY; }
        @Override public boolean isExpectedStartObjectToken() { return _currToken == JsonToken.START_OBJECT; }
    }

    @Test
    public void testCurrentTokenAndId() {
        TestParser p = new TestParser();
        assertNull(p.currentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, p.currentTokenId());
        p.setNextToken(JsonToken.START_ARRAY);
        try {
            p.nextToken();
        } catch (IOException e) {
            fail();
        }
        assertEquals(JsonToken.START_ARRAY, p.currentToken());
        assertEquals(JsonTokenId.ID_START_ARRAY, p.currentTokenId());
    }

    @Test
    public void testHasTokenId() {
        TestParser p = new TestParser();
        assertTrue(p.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(p.hasTokenId(JsonTokenId.ID_START_ARRAY));
        p.setNextToken(JsonToken.START_ARRAY);
        try { p.nextToken(); } catch (IOException e) { fail(); }
        assertFalse(p.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertTrue(p.hasTokenId(JsonTokenId.ID_START_ARRAY));
    }

    @Test
    public void testHasToken() {
        TestParser p = new TestParser();
        assertFalse(p.hasToken(JsonToken.START_OBJECT));
        p.setNextToken(JsonToken.START_OBJECT);
        try { p.nextToken(); } catch (IOException e) { fail(); }
        assertTrue(p.hasToken(JsonToken.START_OBJECT));
        assertFalse(p.hasToken(JsonToken.START_ARRAY));
    }

    @Test
    public void testIsExpectedStartArrayToken() {
        TestParser p = new TestParser();
        assertFalse(p.isExpectedStartArrayToken());
        p.setNextToken(JsonToken.START_ARRAY);
        try { p.nextToken(); } catch (IOException e) { fail(); }
        assertTrue(p.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectToken() {
        TestParser p = new TestParser();
        assertFalse(p.isExpectedStartObjectToken());
        p.setNextToken(JsonToken.START_OBJECT);
        try { p.nextToken(); } catch (IOException e) { fail(); }
        assertTrue(p.isExpectedStartObjectToken());
    }

    @Test
    public void testNextValueFieldName() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.FIELD_NAME);
        p.setCurrentName("field");
        JsonToken t = p.nextValue();
        assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
    }

    @Test
    public void testNextValueNonFieldName() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_INT);
        p.setIntVal(42);
        JsonToken t = p.nextValue();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
    }

    @Test
    public void testSkipChildrenNonStruct() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("hello");
        p.nextToken();
        JsonParser result = p.skipChildren();
        assertSame(p, result);
    }

    @Test
    public void testSkipChildrenStartObject() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.START_OBJECT);
        p.nextToken();
        p.setNextToken(JsonToken.END_OBJECT);
        JsonParser result = p.skipChildren();
        assertSame(p, result);
        assertEquals(JsonToken.END_OBJECT, p.getCurrentToken());
    }

    @Test
    public void testSkipChildrenStartArray() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.START_ARRAY);
        p.nextToken();
        p.setNextToken(JsonToken.END_ARRAY);
        JsonParser result = p.skipChildren();
        assertSame(p, result);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildrenNotAvailable() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.START_ARRAY);
        p.nextToken();
        p.setNextToken(JsonToken.NOT_AVAILABLE);
        p.skipChildren();
    }

    @Test
    public void testSkipChildrenNested() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.START_OBJECT);
        p.nextToken();
        p.setNextToken(JsonToken.START_ARRAY);
        JsonToken t = p.nextToken();
        p.setNextToken(JsonToken.END_ARRAY);
        t = p.nextToken();
        p.setNextToken(JsonToken.END_OBJECT);
        t = p.nextToken();
    }

    @Test
    public void testClearCurrentToken() {
        TestParser p = new TestParser();
        assertNull(p.getLastClearedToken());
        p.setNextToken(JsonToken.VALUE_TRUE);
        try { p.nextToken(); } catch (IOException e) { fail(); }
        assertNotNull(p.getCurrentToken());
        p.clearCurrentToken();
        assertNull(p.getCurrentToken());
        assertEquals(JsonToken.VALUE_TRUE, p.getLastClearedToken());
        p.clearCurrentToken();
        assertEquals(JsonToken.VALUE_TRUE, p.getLastClearedToken());
    }

    @Test
    public void testGetValueAsBooleanNullToken() throws IOException {
        TestParser p = new TestParser();
        assertFalse(p.getValueAsBoolean(false));
        assertTrue(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanStringTrue() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("true");
        p.nextToken();
        assertTrue(p.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanStringFalse() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("false");
        p.nextToken();
        assertFalse(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanStringNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("null");
        p.nextToken();
        assertFalse(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanStringNonBoolean() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("other");
        p.nextToken();
        assertTrue(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanNumberInt() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_INT);
        p.setIntVal(0);
        p.nextToken();
        assertFalse(p.getValueAsBoolean(true));
        p.setIntVal(1);
        assertTrue(p.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanTrue() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_TRUE);
        p.nextToken();
        assertTrue(p.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanFalseNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_FALSE);
        p.nextToken();
        assertFalse(p.getValueAsBoolean(true));
        p.setNextToken(JsonToken.VALUE_NULL);
        p.nextToken();
        assertFalse(p.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanEmbeddedObjectBoolean() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Boolean.TRUE);
        p.nextToken();
        assertTrue(p.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsBooleanEmbeddedObjectNonBoolean() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject("notBoolean");
        p.nextToken();
        assertFalse(p.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsIntFromNumber() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_INT);
        p.setIntVal(42);
        p.nextToken();
        assertEquals(42, p.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntDefault() throws IOException {
        TestParser p = new TestParser();
        assertEquals(10, p.getValueAsInt(10));
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("foo");
        p.nextToken();
        assertEquals(10, p.getValueAsInt(10));
    }

    @Test
    public void testGetValueAsIntString() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("99");
        p.nextToken();
        assertEquals(99, p.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsIntStringNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("null");
        p.nextToken();
        assertEquals(0, p.getValueAsInt(123));
    }

    @Test
    public void testGetValueAsIntTrue() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_TRUE);
        p.nextToken();
        assertEquals(1, p.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsIntFalseNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_FALSE);
        p.nextToken();
        assertEquals(0, p.getValueAsInt(5));
        p.setNextToken(JsonToken.VALUE_NULL);
        p.nextToken();
        assertEquals(0, p.getValueAsInt(5));
    }

    @Test
    public void testGetValueAsIntEmbeddedNumber() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Integer.valueOf(77));
        p.nextToken();
        assertEquals(77, p.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsLongFromNumber() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_INT);
        p.setLongVal(123456789L);
        p.nextToken();
        assertEquals(123456789L, p.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongDefault() throws IOException {
        TestParser p = new TestParser();
        assertEquals(999L, p.getValueAsLong(999L));
    }

    @Test
    public void testGetValueAsLongString() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("1000000");
        p.nextToken();
        assertEquals(1000000L, p.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsLongStringNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("null");
        p.nextToken();
        assertEquals(0L, p.getValueAsLong(5L));
    }

    @Test
    public void testGetValueAsLongTrue() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_TRUE);
        p.nextToken();
        assertEquals(1L, p.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsLongFalseNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_FALSE);
        p.nextToken();
        assertEquals(0L, p.getValueAsLong(7L));
        p.setNextToken(JsonToken.VALUE_NULL);
        p.nextToken();
        assertEquals(0L, p.getValueAsLong(7L));
    }

    @Test
    public void testGetValueAsLongEmbeddedNumber() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Long.valueOf(500L));
        p.nextToken();
        assertEquals(500L, p.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsDoubleDefault() throws IOException {
        TestParser p = new TestParser();
        assertEquals(3.14, p.getValueAsDouble(3.14), 0.001);
    }

    @Test
    public void testGetValueAsDoubleString() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("2.5");
        p.nextToken();
        assertEquals(2.5, p.getValueAsDouble(0.0), 0.001);
    }

    @Test
    public void testGetValueAsDoubleStringNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("null");
        p.nextToken();
        assertEquals(0.0, p.getValueAsDouble(1.0), 0.001);
    }

    @Test
    public void testGetValueAsDoubleNumber() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_FLOAT);
        p.setDoubleVal(3.1415);
        p.nextToken();
        assertEquals(3.1415, p.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void testGetValueAsDoubleTrue() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_TRUE);
        p.nextToken();
        assertEquals(1.0, p.getValueAsDouble(0.0), 0.001);
    }

    @Test
    public void testGetValueAsDoubleFalseNull() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_FALSE);
        p.nextToken();
        assertEquals(0.0, p.getValueAsDouble(2.0), 0.001);
        p.setNextToken(JsonToken.VALUE_NULL);
        p.nextToken();
        assertEquals(0.0, p.getValueAsDouble(2.0), 0.001);
    }

    @Test
    public void testGetValueAsDoubleEmbeddedNumber() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.setEmbeddedObject(Double.valueOf(9.99));
        p.nextToken();
        assertEquals(9.99, p.getValueAsDouble(0.0), 0.001);
    }

    @Test
    public void testGetValueAsStringNullToken() throws IOException {
        TestParser p = new TestParser();
        assertNull(p.getValueAsString());
        assertEquals("default", p.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringValueString() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_STRING);
        p.setText("hello");
        p.nextToken();
        assertEquals("hello", p.getValueAsString());
        assertEquals("hello", p.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringFieldName() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.FIELD_NAME);
        p.setCurrentName("myField");
        p.nextToken();
        assertEquals("myField", p.getValueAsString());
        assertEquals("myField", p.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringNullTokenValue() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NULL);
        p.nextToken();
        assertNull(p.getValueAsString());
        assertEquals("default", p.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringNonScalar() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.START_OBJECT);
        p.nextToken();
        assertEquals("default", p.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringScalar() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_INT);
        p.setText("123");
        p.setIntVal(123);
        p.nextToken();
        assertEquals("123", p.getValueAsString("default"));
    }

    @Test
    public void testHasTextualNull() {
        TestParser p = new TestParser();
        assertTrue(p._hasTextualNull("null"));
        assertFalse(p._hasTextualNull("NULL"));
        assertFalse(p._hasTextualNull(""));
        assertFalse(p._hasTextualNull("notnull"));
    }

    @Test
    public void testReportUnexpectedNumberChar() {
        TestParser p = new TestParser();
        try {
            p.reportUnexpectedNumberChar('x', "test comment");
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("x"));
        }
    }

    @Test
    public void testReportInvalidNumber() {
        TestParser p = new TestParser();
        try {
            p.reportInvalidNumber("bad number");
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("bad number"));
        }
    }

    @Test
    public void testReportOverflowIntNoArg() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_INT);
        p.setText("999999999999999999999999999");
        p.setIntVal(0);
        p.nextToken();
        try {
            p.reportOverflowInt();
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of int"));
        }
    }

    @Test
    public void testReportOverflowIntWithArg() throws IOException {
        TestParser p = new TestParser();
        try {
            p.reportOverflowInt("999999999999999999999999999");
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of int"));
        }
    }

    @Test
    public void testReportOverflowLongNoArg() throws IOException {
        TestParser p = new TestParser();
        p.setNextToken(JsonToken.VALUE_NUMBER_INT);
        p.setText("999999999999999999999999999");
        p.setLongVal(0L);
        p.nextToken();
        try {
            p.reportOverflowLong();
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of long"));
        }
    }

    @Test
    public void testReportOverflowLongWithArg() throws IOException {
        TestParser p = new TestParser();
        try {
            p.reportOverflowLong("999999999999999999999999999");
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of long"));
        }
    }

    @Test
    public void testReportInputCoercion() {
        TestParser p = new TestParser();
        try {
            p._reportInputCoercion("coercion error", JsonToken.VALUE_NUMBER_INT, Integer.class);
            fail();
        } catch (InputCoercionException e) {
            assertEquals("coercion error", e.getMessage());
            assertEquals(JsonToken.VALUE_NUMBER_INT, e.getInputType());
            assertEquals(Integer.class, e.getTargetType());
        }
    }

    @Test
    public void testLongIntegerDescShort() {
        TestParser p = new TestParser();
        String result = p._longIntegerDesc("12345");
        assertEquals("12345", result);
    }

    @Test
    public void testLongIntegerDescLong() {
        TestParser p = new TestParser();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append('9');
        }
        String longNum = sb.toString();
        String result = p._longIntegerDesc(longNum);
        assertTrue(result.startsWith("[Integer with"));
        assertTrue(result.endsWith("digits]"));
    }

    @Test
    public void testLongIntegerDescNegativeLong() {
        TestParser p = new TestParser();
        StringBuilder sb = new StringBuilder("-");
        for (int i = 0; i < 1000; i++) {
            sb.append('9');
        }
        String result = p._longIntegerDesc(sb.toString());
        assertTrue(result.startsWith("[Integer with"));
    }

    @Test
    public void testLongNumberDescShort() {
        TestParser p = new TestParser();
        String result = p._longNumberDesc("123.456");
        assertEquals("123.456", result);
    }

    @Test
    public void testLongNumberDescLong() {
        TestParser p = new TestParser();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append('9');
        }
        String longNum = sb.toString();
        String result = p._longNumberDesc(longNum);
        assertTrue(result.startsWith("[number with"));
    }

    @Test
    public void testReportUnexpectedChar() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportUnexpectedChar(-1, "test");
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unexpected end-of-input"));
        }
        try {
            p._reportUnexpectedChar('!', "unexpected bang");
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("!"));
        }
    }

    @Test
    public void testReportInvalidEOF() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportInvalidEOF();
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unexpected end-of-input"));
        }
    }

    @Test
    public void testReportInvalidEOFInValueString() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportInvalidEOFInValue(JsonToken.VALUE_STRING);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("String value"));
        }
    }

    @Test
    public void testReportInvalidEOFInValueNumber() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Number value"));
        }
    }

    @Test
    public void testReportInvalidEOFInValueOther() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportInvalidEOFInValue(JsonToken.START_ARRAY);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("in a value"));
        }
    }

    @Test
    public void testReportInvalidEOFWithMsgAndToken() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportInvalidEOF(" in custom", JsonToken.VALUE_STRING);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("custom"));
        }
    }

    @Test
    public void testReportInvalidEOFDEPRECATED() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportInvalidEOF(" in deprecated");
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("deprecated"));
        }
    }

    @Test
    public void testReportMissingRootWS() throws IOException {
        TestParser p = new TestParser();
        try {
            p._reportMissingRootWS(' ');
            fail();
        } catch (JsonParseException e) {
            // Expected
        }
    }

    @Test
    public void testThrowInvalidSpace() throws IOException {
        TestParser p = new TestParser();
        try {
            p._throwInvalidSpace(0x01);
            fail();
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Illegal character"));
        }
    }

    @Test
    public void testGetCharDescControl() {
        assertEquals("(CTRL-CHAR, code 0)", ParserMinimalBase._getCharDesc(0));
        assertEquals("(CTRL-CHAR, code 31)", ParserMinimalBase._getCharDesc(31));
    }

    @Test
    public void testGetCharDescHigh() {
        String desc = ParserMinimalBase._getCharDesc(0x0100);
        assertTrue(desc.contains("code 256"));
    }

    @Test
    public void testGetCharDescNormal() {
        String desc = ParserMinimalBase._getCharDesc('A');
        assertTrue(desc.contains("'A'"));
    }

    @Test
    public void testReportError() {
        TestParser p = new TestParser();
        try {
            p._reportError("error message");
            fail();
        } catch (JsonParseException e) {
            assertEquals("error message", e.getMessage());
        }
    }

    @Test
    public void testReportErrorWithArg() {
        TestParser p = new TestParser();
        try {
            p._reportError("error %s", "arg1");
            fail();
        } catch (JsonParseException e) {
            assertEquals("error arg1", e.getMessage());
        }
    }

    @Test
    public void testReportErrorWithTwoArgs() {
        TestParser p = new TestParser();
        try {
            p._reportError("error %s %s", "a", "b");
            fail();
        } catch (JsonParseException e) {
            assertEquals("error a b", e.getMessage());
        }
    }

    @Test
    public void testWrapError() {
        TestParser p = new TestParser();
        Throwable cause = new RuntimeException("cause");
        try {
            p._wrapError("wrapped", cause);
            fail();
        } catch (JsonParseException e) {
            assertEquals("wrapped", e.getMessage());
            assertSame(cause, e.getCause());
        }
    }

    @Test
    public void testConstructErrorWithThrowable() {
        TestParser p = new TestParser();
        Throwable cause = new IOException("io");
        JsonParseException e = p._constructError("msg", cause);
        assertEquals("msg", e.getMessage());
        assertSame(cause, e.getCause());
    }

    @Test
    public void testAsciiBytes() {
        byte[] expected = new byte[] { (byte) 'A', (byte) 'B', (byte) 'C' };
        assertArrayEquals(expected, ParserMinimalBase._asciiBytes("ABC"));
    }

    @Test
    public void testAscii() {
        byte[] input = new byte[] { (byte) 'x', (byte) 'y', (byte) 'z' };
        assertEquals("xyz", ParserMinimalBase._ascii(input));
    }

    @Test(expected = RuntimeException.class)
    public void testAsciiWithIOException() {
        byte[] input = new byte[] { (byte) 0x80 };
        ParserMinimalBase._ascii(input);
    }
}