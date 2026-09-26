package com.fasterxml.jackson.core.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import com.fasterxml.jackson.core.*;

public class JsonParserSequenceTest {

    private static class MockJsonParser extends JsonParser {
        private JsonToken[] tokens;
        private int index = 0;
        private boolean closed = false;

        public MockJsonParser(JsonToken... tokens) {
            this.tokens = tokens;
        }

        @Override
        public JsonToken nextToken() throws IOException, JsonParseException {
            if (index < tokens.length) {
                return tokens[index++];
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        public boolean isClosed() {
            return closed;
        }

        @Override
        public String getCurrentName() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public JsonToken getCurrentToken() {
            return null;
        }

        @Override
        public int getCurrentTokenId() {
            return 0;
        }

        @Override
        public boolean hasCurrentToken() {
            return false;
        }

        @Override
        public boolean hasTokenId(int id) {
            return false;
        }

        @Override
        public boolean hasToken(JsonToken t) {
            return false;
        }

        @Override
        public void clearCurrentToken() {
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return null;
        }

        @Override
        public JsonLocation getTokenLocation() {
            return null;
        }

        @Override
        public String getText() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public char[] getTextCharacters() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public int getTextLength() throws IOException, JsonParseException {
            return 0;
        }

        @Override
        public int getTextOffset() throws IOException, JsonParseException {
            return 0;
        }

        @Override
        public Number getNumberValue() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public Number getNumberValueExact() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public JsonParser.NumberType getNumberType() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public int getIntValue() throws IOException, JsonParseException {
            return 0;
        }

        @Override
        public long getLongValue() throws IOException, JsonParseException {
            return 0L;
        }

        @Override
        public BigInteger getBigIntegerValue() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public float getFloatValue() throws IOException, JsonParseException {
            return 0.0f;
        }

        @Override
        public double getDoubleValue() throws IOException, JsonParseException {
            return 0.0;
        }

        @Override
        public BigDecimal getDecimalValue() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant bv) throws IOException, JsonParseException {
            return null;
        }

        @Override
        public String getValueAsString(String def) throws IOException, JsonParseException {
            return def;
        }

        @Override
        public boolean getValueAsBoolean(boolean def) throws IOException, JsonParseException {
            return def;
        }

        @Override
        public int getValueAsInt(int def) throws IOException, JsonParseException {
            return def;
        }

        @Override
        public long getValueAsLong(long def) throws IOException, JsonParseException {
            return def;
        }

        @Override
        public double getValueAsDouble(double def) throws IOException, JsonParseException {
            return def;
        }

        @Override
        public boolean isClosed() {
            return closed;
        }

        @Override
        public JsonToken nextValue() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public JsonParser skipChildren() throws IOException, JsonParseException {
            return this;
        }

        @Override
        public boolean canReadObjectId() {
            return false;
        }

        @Override
        public boolean canReadTypeId() {
            return false;
        }

        @Override
        public Object getObjectId() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public Object getTypeId() throws IOException, JsonParseException {
            return null;
        }

        @Override
        public <T> T readValueAs(Class<T> valueType) throws IOException, JsonParseException {
            return null;
        }

        @Override
        public <T> T readValueAs(TypeReference<?> valueTypeRef) throws IOException, JsonParseException {
            return null;
        }

        @Override
        public <T extends TreeNode> T readValueAsTree() throws IOException, JsonParseException {
            return null;
        }
    }

    @Test
    public void testNextTokenWithNoTokens() throws Exception {
        MockJsonParser p1 = new MockJsonParser();
        MockJsonParser p2 = new MockJsonParser();
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertNull(seq.nextToken());
    }

    @Test
    public void testNextTokenSingleParser() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.START_OBJECT, JsonToken.END_OBJECT);
        MockJsonParser p2 = new MockJsonParser();
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(JsonToken.START_OBJECT, seq.nextToken());
        assertEquals(JsonToken.END_OBJECT, seq.nextToken());
        assertNull(seq.nextToken());
    }

    @Test
    public void testNextTokenMultipleTokens() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.START_ARRAY, JsonToken.END_ARRAY);
        MockJsonParser p2 = new MockJsonParser(JsonToken.START_OBJECT, JsonToken.END_OBJECT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(JsonToken.START_ARRAY, seq.nextToken());
        assertEquals(JsonToken.END_ARRAY, seq.nextToken());
        assertEquals(JsonToken.START_OBJECT, seq.nextToken());
        assertEquals(JsonToken.END_OBJECT, seq.nextToken());
        assertNull(seq.nextToken());
    }

    @Test
    public void testCloseClosesAllParsers() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.START_OBJECT);
        MockJsonParser p2 = new MockJsonParser(JsonToken.END_OBJECT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        seq.close();
        assertTrue(p1.isClosed());
        assertTrue(p2.isClosed());
    }

    @Test
    public void testCloseWhenNoToken() throws Exception {
        MockJsonParser p1 = new MockJsonParser();
        MockJsonParser p2 = new MockJsonParser();
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        seq.close();
        assertTrue(p1.isClosed());
        assertTrue(p2.isClosed());
    }

    @Test
    public void testContainedParsersCount() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.VALUE_TRUE);
        MockJsonParser p2 = new MockJsonParser(JsonToken.VALUE_FALSE);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(2, seq.containedParsersCount());
    }

    @Test
    public void testCreateFlattenedWithNonSequence() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.START_ARRAY);
        MockJsonParser p2 = new MockJsonParser(JsonToken.END_ARRAY);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertNotNull(seq);
        assertEquals(2, seq.containedParsersCount());
    }

    @Test
    public void testCreateFlattenedWithNestedSequenceFirst() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.VALUE_NUMBER_INT);
        MockJsonParser p2 = new MockJsonParser(JsonToken.VALUE_STRING);
        JsonParserSequence inner = JsonParserSequence.createFlattened(p1, p2);
        MockJsonParser p3 = new MockJsonParser(JsonToken.VALUE_TRUE);
        JsonParserSequence outer = JsonParserSequence.createFlattened(inner, p3);
        assertEquals(3, outer.containedParsersCount());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertEquals(JsonToken.VALUE_STRING, outer.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, outer.nextToken());
        assertNull(outer.nextToken());
    }

    @Test
    public void testCreateFlattenedWithNestedSequenceSecond() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.VALUE_NUMBER_INT);
        MockJsonParser p2 = new MockJsonParser(JsonToken.VALUE_STRING);
        JsonParserSequence inner = JsonParserSequence.createFlattened(p1, p2);
        MockJsonParser p3 = new MockJsonParser(JsonToken.VALUE_TRUE);
        JsonParserSequence outer = JsonParserSequence.createFlattened(p3, inner);
        assertEquals(3, outer.containedParsersCount());
        assertEquals(JsonToken.VALUE_TRUE, outer.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, outer.nextToken());
        assertEquals(JsonToken.VALUE_STRING, outer.nextToken());
        assertNull(outer.nextToken());
    }

    @Test
    public void testSwitchToNextWhenNoMoreParsers() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.START_OBJECT);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, new MockJsonParser());
        assertFalse(seq.switchToNext());
    }

    @Test
    public void testSwitchToNextWhenParserExists() throws Exception {
        MockJsonParser p1 = new MockJsonParser();
        MockJsonParser p2 = new MockJsonParser();
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertTrue(seq.switchToNext());
    }

    @Test
    public void testSwitchToNextMultipleTimes() throws Exception {
        MockJsonParser p1 = new MockJsonParser();
        MockJsonParser p2 = new MockJsonParser();
        MockJsonParser p3 = new MockJsonParser();
        JsonParser[] parsers = new JsonParser[] { p1, p2, p3 };
        JsonParserSequence seq = new JsonParserSequence(parsers) {};
        assertTrue(seq.switchToNext());
        assertTrue(seq.switchToNext());
        assertFalse(seq.switchToNext());
    }

    @Test
    public void testNextTokenReturnsFirstTokenImmediately() throws Exception {
        MockJsonParser p1 = new MockJsonParser(JsonToken.VALUE_NUMBER_INT);
        MockJsonParser p2 = new MockJsonParser(JsonToken.VALUE_STRING);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
    }

    @Test
    public void testNextTokenSkipsEmptyParser() throws Exception {
        MockJsonParser p1 = new MockJsonParser();
        MockJsonParser p2 = new MockJsonParser(JsonToken.VALUE_TRUE);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        assertEquals(JsonToken.VALUE_TRUE, seq.nextToken());
    }

    @Test
    public void testNextTokenSkipsMultipleEmptyParsers() throws Exception {
        MockJsonParser p1 = new MockJsonParser();
        MockJsonParser p2 = new MockJsonParser();
        MockJsonParser p3 = new MockJsonParser(JsonToken.VALUE_FALSE);
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence seq2 = JsonParserSequence.createFlattened(seq, p3);
        assertEquals(JsonToken.VALUE_FALSE, seq2.nextToken());
    }

    @Test
    public void testCloseWithNestedSequence() throws Exception {
        MockJsonParser p1 = new MockJsonParser();
        MockJsonParser p2 = new MockJsonParser();
        JsonParserSequence inner = JsonParserSequence.createFlattened(p1, p2);
        MockJsonParser p3 = new MockJsonParser();
        JsonParserSequence outer = JsonParserSequence.createFlattened(inner, p3);
        outer.close();
        assertTrue(p1.isClosed());
        assertTrue(p2.isClosed());
        assertTrue(p3.isClosed());
    }
}