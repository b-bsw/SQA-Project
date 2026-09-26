package com.fasterxml.jackson.core.filter;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.*;

public class FilteringParserDelegateTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    private FilteringParserDelegate createDelegate(String json, TokenFilter filter,
                                                   boolean includePath, boolean allowMultipleMatches) throws IOException {
        return new FilteringParserDelegate(factory.createParser(json), filter,
                includePath, allowMultipleMatches);
    }

    private void assertToken(FilteringParserDelegate d, JsonToken expected) throws IOException {
        assertEquals("nextToken", expected, d.nextToken());
        assertEquals("getCurrentToken", expected, d.getCurrentToken());
        if (expected != null) {
            assertEquals("getCurrentTokenId", expected.id(), d.getCurrentTokenId());
            assertEquals("currentTokenId", expected.id(), d.currentTokenId());
            assertTrue("hasCurrentToken", d.hasCurrentToken());
        } else {
            assertEquals("id zero", JsonTokenId.ID_NO_TOKEN, d.getCurrentTokenId());
            assertEquals("currentTokenId null", JsonTokenId.ID_NO_TOKEN, d.currentTokenId());
            assertFalse("hasCurrentToken false", d.hasCurrentToken());
        }
    }

    @Test
    public void testAllIncludedMatchesUnderlyingParser() throws Exception {
        String json = "[true, null, {\"a\":1}, [2,3]]";
        try (JsonParser raw = factory.createParser(json)) {
            FilteringParserDelegate d = new FilteringParserDelegate(factory.createParser(json),
                    TokenFilter.INCLUDE_ALL, true, false);
            JsonToken expected;
            while ((expected = raw.nextToken()) != null) {
                assertEquals(expected, d.nextToken());
                assertEquals(expected, d.getCurrentToken());
            }
            assertNull(d.nextToken());
        }
    }

    @Test
    public void testEmptyInput() throws Exception {
        FilteringParserDelegate d = createDelegate("", TokenFilter.INCLUDE_ALL, false, false);
        assertToken(d, null);

        assertEquals(42, d.getValueAsInt(42));
        assertEquals(43L, d.getValueAsLong(43L));
        assertEquals(44.0, d.getValueAsDouble(44.0), 0.0);
        assertTrue(d.getValueAsBoolean(true));
        assertEquals("default", d.getValueAsString("default"));
    }

    @Test
    public void testFieldFilterIncludesOnlySelected() throws Exception {
        String json = "{\"a\":1,\"b\":2}";
        FilteringParserDelegate d = createDelegate(json, new FieldFilter("a"), true, false);

        assertToken(d, JsonToken.START_OBJECT);
        assertNull(d.getCurrentName());

        assertToken(d, JsonToken.FIELD_NAME);
        assertEquals("a", d.getCurrentName());

        assertToken(d, JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, d.getIntValue());
        assertEquals("a", d.getCurrentName());

        assertToken(d, JsonToken.END_OBJECT);
        assertToken(d, null);
    }

    @Test
    public void testFilterExcludesScalarRootValue() throws Exception {
        FilteringParserDelegate d = createDelegate("42", new ExcludingValueFilter(), false, false);
        assertNull(d.nextToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, d.getCurrentTokenId());
        assertFalse(d.hasCurrentToken());
    }

    @Test
    public void testSkipChildren() throws Exception {
        FilteringParserDelegate d = createDelegate("{\"a\":{\"b\":1},\"c\":2}",
                TokenFilter.INCLUDE_ALL, true, false);

        assertToken(d, JsonToken.START_OBJECT);
        assertSame(d, d.skipChildren());
        assertEquals(JsonToken.END_OBJECT, d.getCurrentToken());
        assertToken(d, null);
    }

    @Test
    public void testNextValue() throws Exception {
        FilteringParserDelegate d = createDelegate("{\"a\":7}", TokenFilter.INCLUDE_ALL, true, false);

        assertToken(d, JsonToken.START_OBJECT);
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextValue());
        assertEquals(7, d.getIntValue());

        assertToken(d, JsonToken.END_OBJECT);
        assertToken(d, null);
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        FilteringParserDelegate d = createDelegate("{\"a\":1}", TokenFilter.INCLUDE_ALL, true, false);

        assertToken(d, JsonToken.START_OBJECT);
        d.clearCurrentToken();
        assertNull(d.getCurrentToken());
        assertEquals(JsonToken.START_OBJECT, d.getLastClearedToken());
    }

    @Test
    public void testValueAccessors() throws Exception {
        String json = "[1, 2.5, true, \"abc\", null]";
        FilteringParserDelegate d = createDelegate(json, TokenFilter.INCLUDE_ALL, false, false);

        assertToken(d, JsonToken.START_ARRAY);

        assertToken(d, JsonToken.VALUE_NUMBER_INT);
        assertEquals(1, d.getIntValue());
        assertEquals(1L, d.getLongValue());
        assertEquals(1.0, d.getDoubleValue(), 0.0);
        assertEquals(1.0f, d.getFloatValue(), 0.0f);
        assertEquals(BigDecimal.ONE, d.getDecimalValue());
        assertEquals(BigInteger.ONE, d.getBigIntegerValue());
        assertEquals(1, d.getValueAsInt(42));
        assertEquals("1", d.getValueAsString());

        assertToken(d, JsonToken.VALUE_NUMBER_FLOAT);
        assertEquals(2.5, d.getDoubleValue(), 0.0);
        assertEquals(2.5f, d.getFloatValue(), 0.0f);
        BigDecimal bd = d.getDecimalValue();
        assertTrue(bd.compareTo(new BigDecimal("2.5")) == 0);

        assertToken(d, JsonToken.VALUE_TRUE);
        assertTrue(d.getBooleanValue());
        assertTrue(d.getValueAsBoolean(false));

        assertToken(d, JsonToken.VALUE_STRING);
        assertEquals("abc", d.getValueAsString());
        assertEquals("abc", d.getValueAsString("default"));
        assertEquals(123, d.getValueAsInt(123));

        assertToken(d, JsonToken.VALUE_NULL);
        assertNull(d.getEmbeddedObject());
        assertEquals(99, d.getValueAsInt(99));

        assertToken(d, JsonToken.END_ARRAY);
        assertToken(d, null);
    }

    @Test
    public void testCurrentName() throws Exception {
        FilteringParserDelegate d = createDelegate("{\"field\":42}", TokenFilter.INCLUDE_ALL, true, false);

        assertToken(d, JsonToken.START_OBJECT);
        assertNull(d.getCurrentName());

        assertToken(d, JsonToken.FIELD_NAME);
        assertEquals("field", d.getCurrentName());

        assertToken(d, JsonToken.VALUE_NUMBER_INT);
        assertEquals("field", d.getCurrentName());

        assertToken(d, JsonToken.END_OBJECT);
        assertToken(d, null);
    }

    @Test
    public void testTokenStateMethods() throws Exception {
        FilteringParserDelegate d = createDelegate("[{}]", TokenFilter.INCLUDE_ALL, false, false);

        assertToken(d, JsonToken.START_ARRAY);
        assertTrue(d.isExpectedStartArrayToken());
        assertFalse(d.isExpectedStartObjectToken());
        assertNotNull(d.getCurrentLocation());
        assertNotNull(d.getTokenLocation());
        assertNotNull(d.getParsingContext());

        assertToken(d, JsonToken.START_OBJECT);
        assertTrue(d.isExpectedStartObjectToken());
        assertFalse(d.isExpectedStartArrayToken());

        assertToken(d, JsonToken.END_OBJECT);
        assertToken(d, JsonToken.END_ARRAY);
        assertToken(d, null);
    }

    @Test
    public void testGetFilter() throws Exception {
        FieldFilter filter = new FieldFilter("x");
        FilteringParserDelegate d = createDelegate("{}", filter, false, false);
        assertSame(filter, d.getFilter());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrows() throws Exception {
        FilteringParserDelegate d = createDelegate("{}", TokenFilter.INCLUDE_ALL, false, false);
        d.overrideCurrentName("x");
    }

    private static class FieldFilter extends TokenFilter {
        private final String includedName;

        FieldFilter(String includedName) {
            this.includedName = includedName;
        }

        @Override
        public TokenFilter includeProperty(String name) {
            return includedName.equals(name) ? TokenFilter.INCLUDE_ALL : null;
        }

        @Override
        public boolean includeValue(JsonParser p) throws IOException {
            return true;
        }
    }

    private static class ExcludingValueFilter extends TokenFilter {
        @Override
        public boolean includeValue(JsonParser p) throws IOException {
            return false;
        }
    }
}