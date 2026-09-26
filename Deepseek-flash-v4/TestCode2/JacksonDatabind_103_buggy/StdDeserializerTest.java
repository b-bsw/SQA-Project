package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StdDeserializerTest {

    private ObjectMapper mapper;
    private TestStdDeserializer deser;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        deser = new TestStdDeserializer();
    }

    private DeserializationContext ctxt() {
        return mapper.getDeserializationContext();
    }

    private JsonParser jsonParser(String json) throws IOException {
        JsonParser p = mapper.getFactory().createParser(json);
        p.nextToken();
        return p;
    }

    @Test
    public void testBasicAccessors() {
        assertEquals(Object.class, deser.handledType());
        assertEquals(Object.class, deser.getValueClass());
    }

    @Test
    public void testTextualNullHelpers() {
        assertTrue(deser.hasTextualNull("null"));
        assertFalse(deser.hasTextualNull(""));
        assertFalse(deser.hasTextualNull("NULL"));
        assertFalse(deser.hasTextualNull(null));

        assertTrue(deser.isEmptyOrTextualNull(""));
        assertTrue(deser.isEmptyOrTextualNull("null"));
        assertFalse(deser.isEmptyOrTextualNull("NULL"));
        assertFalse(deser.isEmptyOrTextualNull(null));
    }

    @Test
    public void testNumberOverflowHelpers() {
        assertFalse(deser.byteOverflow(Byte.MIN_VALUE));
        assertFalse(deser.byteOverflow(255));
        assertTrue(deser.byteOverflow(Byte.MIN_VALUE - 1));
        assertTrue(deser.byteOverflow(256));

        assertFalse(deser.shortOverflow(Short.MIN_VALUE));
        assertFalse(deser.shortOverflow(Short.MAX_VALUE));
        assertTrue(deser.shortOverflow(Short.MIN_VALUE - 1));
        assertTrue(deser.shortOverflow(Short.MAX_VALUE + 1));

        assertFalse(deser.intOverflow(Integer.MIN_VALUE));
        assertFalse(deser.intOverflow(Integer.MAX_VALUE));
        assertTrue(deser.intOverflow(Integer.MIN_VALUE - 1L));
        assertTrue(deser.intOverflow(Integer.MAX_VALUE + 1L));
    }

    @Test
    public void testParseIntPrimitive() throws Exception {
        JsonParser p = jsonParser("42");
        try {
            assertEquals(42, deser.parseInt(p, ctxt()));
        } finally {
            p.close();
        }

        p = jsonParser("\" -42 \"");
        try {
            assertEquals(-42, deser.parseInt(p, ctxt()));
        } finally {
            p.close();
        }

        p = jsonParser("\"\"");
        try {
            assertEquals(0, deser.parseInt(p, ctxt()));
        } finally {
            p.close();
        }

        p = jsonParser("\"null\"");
        try {
            assertEquals(0, deser.parseInt(p, ctxt()));
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseIntPrimitiveOverflowFails() throws Exception {
        JsonParser p = jsonParser("\"2147483648\"");
        try {
            deser.parseInt(p, ctxt());
            fail("Expected JsonMappingException on integer overflow");
        } catch (JsonMappingException e) {
            // expected
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseLongPrimitive() throws Exception {
        JsonParser p = jsonParser("1234567890123");
        try {
            assertEquals(1234567890123L, deser.parseLong(p, ctxt()));
        } finally {
            p.close();
        }

        p = jsonParser("\" -42 \"");
        try {
            assertEquals(-42L, deser.parseLong(p, ctxt()));
        } finally {
            p.close();
        }

        p = jsonParser("\"\"");
        try {
            assertEquals(0L, deser.parseLong(p, ctxt()));
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseLongPrimitiveOverflowFails() throws Exception {
        JsonParser p = jsonParser("\"9223372036854775808\"");
        try {
            deser.parseLong(p, ctxt());
            fail("Expected JsonMappingException on long overflow");
        } catch (JsonMappingException e) {
            // expected
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseDoublePrimitive() throws Exception {
        JsonParser p = jsonParser("1.25");
        try {
            assertEquals(1.25, deser.parseDouble(p, ctxt()), 0.0d);
        } finally {
            p.close();
        }

        p = jsonParser("\"NaN\"");
        try {
            assertTrue(Double.isNaN(deser.parseDouble(p, ctxt())));
        } finally {
            p.close();
        }

        p = jsonParser("\"Infinity\"");
        try {
            assertTrue(Double.isInfinite(deser.parseDouble(p, ctxt())));
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseDoublePrimitiveInvalidFails() throws Exception {
        JsonParser p = jsonParser("\"abc\"");
        try {
            deser.parseDouble(p, ctxt());
            fail("Expected JsonMappingException for invalid double");
        } catch (JsonMappingException e) {
            // expected
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseFloatPrimitive() throws Exception {
        JsonParser p = jsonParser("2.5");
        try {
            assertEquals(2.5f, deser.parseFloat(p, ctxt()), 0.0f);
        } finally {
            p.close();
        }

        p = jsonParser("\"NaN\"");
        try {
            assertTrue(Float.isNaN(deser.parseFloat(p, ctxt())));
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseDateFromNumber() throws Exception {
        JsonParser p = jsonParser("1234567890123");
        try {
            Date d = deser.parseDate(p, ctxt());
            assertNotNull(d);
            assertEquals(1234567890123L, d.getTime());
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseDateFromNullString() throws Exception {
        JsonParser p = jsonParser("\"null\"");
        try {
            assertNull(deser.parseDate(p, ctxt()));
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseDateFromEmptyArrayAllowed() throws Exception {
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        JsonParser p = jsonParser("[]");
        try {
            assertNull(deser.parseDateFromArray(p, ctxt()));
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseDateFromEmptyArrayFails() throws Exception {
        JsonParser p = jsonParser("[]");
        try {
            deser.parseDateFromArray(p, ctxt());
            fail("Expected JsonMappingException for empty array");
        } catch (JsonMappingException e) {
            // expected
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseString() throws Exception {
        JsonParser p = jsonParser("\"hello\"");
        try {
            assertEquals("hello", deser.parseString(p, ctxt()));
        } finally {
            p.close();
        }

        p = jsonParser("123");
        try {
            assertEquals("123", deser.parseString(p, ctxt()));
        } finally {
            p.close();
        }
    }

    @Test
    public void testParseStringFromNullFails() throws Exception {
        JsonParser p = jsonParser("null");
        try {
            deser.parseString(p, ctxt());
            fail("Expected JsonMappingException for null string");
        } catch (JsonMappingException e) {
            // expected
        } finally {
            p.close();
        }
    }

    private static class TestStdDeserializer extends StdDeserializer<Object> {

        private static final long serialVersionUID = 1L;

        TestStdDeserializer() {
            super(Object.class);
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        boolean byteOverflow(int value) {
            return _byteOverflow(value);
        }

        boolean shortOverflow(int value) {
            return _shortOverflow(value);
        }

        boolean intOverflow(long value) {
            return _intOverflow(value);
        }

        boolean hasTextualNull(String value) {
            return _hasTextualNull(value);
        }

        boolean isEmptyOrTextualNull(String value) {
            return _isEmptyOrTextualNull(value);
        }

        int parseInt(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _parseIntPrimitive(p, ctxt);
        }

        long parseLong(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _parseLongPrimitive(p, ctxt);
        }

        float parseFloat(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _parseFloatPrimitive(p, ctxt);
        }

        double parseDouble(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _parseDoublePrimitive(p, ctxt);
        }

        Date parseDate(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _parseDate(p, ctxt);
        }

        Date parseDateFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _parseDateFromArray(p, ctxt);
        }

        String parseString(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _parseString(p, ctxt);
        }
    }
}