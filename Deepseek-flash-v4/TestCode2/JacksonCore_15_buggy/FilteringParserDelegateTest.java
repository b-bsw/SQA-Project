package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserDelegate;

public class FilteringParserDelegateTest {

    private JsonParser delegate;
    private TokenFilter filter;
    private FilteringParserDelegate parser;

    @Before
    public void setUp() {
        delegate = new JsonParserDelegate(new JsonParser() {
            private int callCount = 0;
            private JsonToken currentToken;
            private String currentName;

            @Override
            public JsonToken nextToken() throws IOException {
                callCount++;
                if (callCount > 10) return null;
                return currentToken;
            }

            @Override
            public void close() throws IOException {}

            @Override
            public JsonToken getCurrentToken() { return currentToken; }

            @Override
            public int getCurrentTokenId() {
                return currentToken == null ? JsonTokenId.ID_NO_TOKEN : currentToken.id();
            }

            @Override
            public boolean hasCurrentToken() { return currentToken != null; }

            @Override
            public boolean hasTokenId(int id) {
                return currentToken != null && currentToken.id() == id;
            }

            @Override
            public boolean hasToken(JsonToken t) { return currentToken == t; }

            @Override
            public boolean isExpectedStartArrayToken() { return currentToken == JsonToken.START_ARRAY; }

            @Override
            public boolean isExpectedStartObjectToken() { return currentToken == JsonToken.START_OBJECT; }

            @Override
            public JsonLocation getCurrentLocation() { return JsonLocation.NA; }

            @Override
            public JsonStreamContext getParsingContext() {
                return new JsonStreamContext() {
                    @Override
                    public String getCurrentName() { return currentName; }
                    @Override
                    public JsonStreamContext getParent() { return null; }
                };
            }

            @Override
            public String getCurrentName() throws IOException { return currentName; }

            @Override
            public void clearCurrentToken() { currentToken = null; }

            @Override
            public JsonToken getLastClearedToken() { return null; }

            @Override
            public void overrideCurrentName(String name) {}

            @Override
            public void skipChildren() throws IOException {}

            public void setCurrentToken(JsonToken t) { currentToken = t; }
            public void setCurrentName(String n) { currentName = n; }

            @Override
            public String getText() throws IOException { return null; }
            @Override
            public boolean hasTextCharacters() { return false; }
            @Override
            public char[] getTextCharacters() throws IOException { return null; }
            @Override
            public int getTextLength() throws IOException { return 0; }
            @Override
            public int getTextOffset() throws IOException { return 0; }
            @Override
            public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override
            public boolean getBooleanValue() throws IOException { return false; }
            @Override
            public byte getByteValue() throws IOException { return 0; }
            @Override
            public short getShortValue() throws IOException { return 0; }
            @Override
            public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override
            public double getDoubleValue() throws IOException { return 0; }
            @Override
            public float getFloatValue() throws IOException { return 0; }
            @Override
            public int getIntValue() throws IOException { return 0; }
            @Override
            public long getLongValue() throws IOException { return 0; }
            @Override
            public NumberType getNumberType() throws IOException { return null; }
            @Override
            public Number getNumberValue() throws IOException { return null; }
            @Override
            public int getValueAsInt() throws IOException { return 0; }
            @Override
            public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override
            public long getValueAsLong() throws IOException { return 0; }
            @Override
            public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override
            public double getValueAsDouble() throws IOException { return 0; }
            @Override
            public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override
            public boolean getValueAsBoolean() throws IOException { return false; }
            @Override
            public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override
            public String getValueAsString() throws IOException { return null; }
            @Override
            public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override
            public Object getEmbeddedObject() throws IOException { return null; }
            @Override
            public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override
            public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override
            public JsonLocation getTokenLocation() { return JsonLocation.NA; }
        });
        filter = TokenFilter.INCLUDE_ALL;
        parser = new FilteringParserDelegate(delegate, filter, true, true);
    }

    @Test
    public void testConstructorAndGetFilter() {
        assertEquals(filter, parser.getFilter());
    }

    @Test
    public void testGetMatchCountInitial() {
        assertEquals(0, parser.getMatchCount());
    }

    @Test
    public void testGetCurrentTokenInitial() {
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testGetCurrentTokenIdNone() {
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void testHasCurrentTokenFalse() {
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testHasTokenIdFalse() {
        assertFalse(parser.hasTokenId(JsonTokenId.ID_FIELD_NAME));
    }

    @Test
    public void testHasTokenFalse() {
        assertFalse(parser.hasToken(JsonToken.START_OBJECT));
    }

    @Test
    public void testIsExpectedStartArrayTokenFalse() {
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectTokenFalse() {
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testClearCurrentToken() {
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testOverrideCurrentNameThrows() {
        try {
            parser.overrideCurrentName("test");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testNextTokenWithNullToken() throws IOException {
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithStartArrayAndIncludeAll() throws IOException {
        ((JsonParserDelegate) delegate).setCurrentToken(JsonToken.START_ARRAY);
    }
}