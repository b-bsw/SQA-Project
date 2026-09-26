package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static com.fasterxml.jackson.core.JsonTokenId.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegateTest {

    private JsonParser delegate;
    private TokenFilter includeAllFilter;
    private TokenFilter excludeAllFilter;
    private TokenFilter propertyFilter;

    @Before
    public void setUp() {
        includeAllFilter = TokenFilter.INCLUDE_ALL;
        excludeAllFilter = new TokenFilter() {
            @Override
            public boolean includeValue(JsonParser p) {
                return false;
            }
            @Override
            public TokenFilter filterStartArray() {
                return null;
            }
            @Override
            public TokenFilter filterStartObject() {
                return null;
            }
            @Override
            public void filterFinishArray() {
            }
            @Override
            public TokenFilter includeProperty(String name) {
                return null;
            }
        };
        propertyFilter = new TokenFilter() {
            @Override
            public boolean includeValue(JsonParser p) {
                return true;
            }
            @Override
            public TokenFilter filterStartArray() {
                return TokenFilter.INCLUDE_ALL;
            }
            @Override
            public TokenFilter filterStartObject() {
                return TokenFilter.INCLUDE_ALL;
            }
            @Override
            public void filterFinishArray() {
            }
            @Override
            public TokenFilter includeProperty(String name) {
                if ("a".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullParser() {
        new FilteringParserDelegate(null, includeAllFilter, true, false);
    }

    @Test
    public void testGetFilterReturnsRootFilter() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertSame(includeAllFilter, fpd.getFilter());
    }

    @Test
    public void testGetMatchCountInitialZero() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(0, fpd.getMatchCount());
    }

    @Test
    public void testGetCurrentTokenNullInitially() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.getCurrentToken());
    }

    @Test
    public void testCurrentTokenNullInitially() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.currentToken());
    }

    @Test
    public void testGetCurrentTokenIdNoToken() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(JsonTokenId.ID_NO_TOKEN, fpd.getCurrentTokenId());
    }

    @Test
    public void testCurrentTokenIdNoToken() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(JsonTokenId.ID_NO_TOKEN, fpd.currentTokenId());
    }

    @Test
    public void testHasCurrentTokenFalse() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertFalse(fpd.hasCurrentToken());
    }

    @Test
    public void testHasTokenIdNoToken() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertTrue(fpd.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(fpd.hasTokenId(JsonTokenId.ID_FIELD_NAME));
    }

    @Test
    public void testHasTokenFalse() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertFalse(fpd.hasToken(JsonToken.START_OBJECT));
    }

    @Test
    public void testIsExpectedStartArrayTokenFalse() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertFalse(fpd.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectTokenFalse() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertFalse(fpd.isExpectedStartObjectToken());
    }

    @Test
    public void testGetCurrentLocationNull() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.getCurrentLocation());
    }

    @Test
    public void testGetParsingContextReturnsHeadContext() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNotNull(fpd.getParsingContext());
    }

    @Test
    public void testGetCurrentNameNull() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.getCurrentName());
    }

    @Test
    public void testClearCurrentTokenNull() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        fpd.clearCurrentToken();
        assertNull(fpd.getCurrentToken());
        assertNull(fpd.getLastClearedToken());
    }

    @Test
    public void testGetLastClearedTokenNull() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.getLastClearedToken());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrows() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        fpd.overrideCurrentName("test");
    }

    @Test
    public void testNextTokenWithNullToken() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.nextToken());
    }

    @Test
    public void testNextValueWithNullToken() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.nextValue());
    }

    @Test
    public void testSkipChildrenWithCurrentTokenNull() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertSame(fpd, fpd.skipChildren());
    }

    @Test
    public void testGetText() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.getText());
    }

    @Test
    public void testHasTextCharacters() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.hasTextCharacters(), fpd.hasTextCharacters());
    }

    @Test
    public void testGetTextCharacters() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertNull(fpd.getTextCharacters());
    }

    @Test
    public void testGetTextLength() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getTextLength(), fpd.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getTextOffset(), fpd.getTextOffset());
    }

    @Test
    public void testGetBigIntegerValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getBigIntegerValue(), fpd.getBigIntegerValue());
    }

    @Test
    public void testGetBooleanValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getBooleanValue(), fpd.getBooleanValue());
    }

    @Test
    public void testGetByteValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getByteValue(), fpd.getByteValue());
    }

    @Test
    public void testGetShortValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getShortValue(), fpd.getShortValue());
    }

    @Test
    public void testGetDecimalValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getDecimalValue(), fpd.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getDoubleValue(), fpd.getDoubleValue(), 0.0);
    }

    @Test
    public void testGetFloatValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getFloatValue(), fpd.getFloatValue(), 0.0f);
    }

    @Test
    public void testGetIntValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getIntValue(), fpd.getIntValue());
    }

    @Test
    public void testGetLongValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getLongValue(), fpd.getLongValue());
    }

    @Test
    public void testGetNumberType() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getNumberType(), fpd.getNumberType());
    }

    @Test
    public void testGetNumberValue() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getNumberValue(), fpd.getNumberValue());
    }

    @Test
    public void testGetValueAsIntDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsInt(), fpd.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntCustomDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsInt(42), fpd.getValueAsInt(42));
    }

    @Test
    public void testGetValueAsLongDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsLong(), fpd.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongCustomDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsLong(42L), fpd.getValueAsLong(42L));
    }

    @Test
    public void testGetValueAsDoubleDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsDouble(), fpd.getValueAsDouble(), 0.0);
    }

    @Test
    public void testGetValueAsDoubleCustomDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsDouble(42.0), fpd.getValueAsDouble(42.0), 0.0);
    }

    @Test
    public void testGetValueAsBooleanDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsBoolean(), fpd.getValueAsBoolean());
    }

    @Test
    public void testGetValueAsBooleanCustomDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsBoolean(true), fpd.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsStringDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsString(), fpd.getValueAsString());
    }

    @Test
    public void testGetValueAsStringCustomDefault() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getValueAsString("default"), fpd.getValueAsString("default"));
    }

    @Test
    public void testGetEmbeddedObject() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getEmbeddedObject(), fpd.getEmbeddedObject());
    }

    @Test(expected = NullPointerException.class)
    public void testGetBinaryValueNullVariant() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        fpd.getBinaryValue(null);
    }

    @Test(expected = NullPointerException.class)
    public void testReadBinaryValueNullVariant() throws IOException {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        fpd.readBinaryValue(null, null);
    }

    @Test
    public void testGetTokenLocation() {
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegate, includeAllFilter, true, false);
        assertEquals(delegate.getTokenLocation(), fpd.getTokenLocation());
    }
}