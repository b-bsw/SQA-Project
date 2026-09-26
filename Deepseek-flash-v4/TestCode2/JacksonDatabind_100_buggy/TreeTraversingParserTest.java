package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;

public class TreeTraversingParserTest {

    private TreeTraversingParser parser;

    @After
    public void tearDown() throws IOException {
        if (parser != null && !parser.isClosed()) {
            parser.close();
        }
    }

    // ---------- Constructor variants ----------

    @Test
    public void testConstructorWithArrayNode() throws Exception {
        ArrayNode arr = new ArrayNode(null);
        arr.add(1);
        arr.add("two");
        parser = new TreeTraversingParser(arr);
        assertNull(parser.getCodec());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("two", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        assertTrue(parser.isClosed());
    }

    @Test
    public void testConstructorWithObjectNode() throws Exception {
        ObjectNode obj = new ObjectNode(null);
        obj.put("x", 10);
        obj.put("y", true);
        parser = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("x", parser.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(10, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("y", parser.getText());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testConstructorWithValueNode() throws Exception {
        TextNode text = new TextNode("hello");
        parser = new TreeTraversingParser(text);
        assertNull(parser.getCodec());
        // nextToken yields the value itself
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        // next after value returns null and sets closed
        assertNull(parser.nextToken());
        assertTrue(parser.isClosed());
    }

    @Test
    public void testConstructorWithObjectCodec() throws Exception {
        ObjectCodec dummyCodec = new ObjectCodec() {
            @Override public Version version() { return null; }
            @Override public ObjectCodec getCodec() { return this; }
            @Override public void setCodec(ObjectCodec c) {}
            @Override public JsonParser treeAsTokens(JsonNode n) { return null; }
            @Override public <T> T treeToValue(JsonNode n, Class<T> valueType) { return null; }
            @Override public JsonNode createObjectNode() { return null; }
            @Override public JsonNode createArrayNode() { return null; }
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override public JsonNode readTree(JsonParser p) { return null; }
        };
        TextNode text = new TextNode("foo");
        parser = new TreeTraversingParser(text, dummyCodec);
        assertSame(dummyCodec, parser.getCodec());
    }

    // ---------- nextToken branches ----------

    @Test
    public void testNextTokenEmptyArray() throws Exception {
        ArrayNode emptyArr = new ArrayNode(null);
        parser = new TreeTraversingParser(emptyArr);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        // immediate end because no children
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenEmptyObject() throws Exception {
        ObjectNode emptyObj = new ObjectNode(null);
        parser = new TreeTraversingParser(emptyObj);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenNestedStructure() throws Exception {
        ArrayNode outer = new ArrayNode(null);
        ObjectNode inner = new ObjectNode(null);
        inner.put("a", 1);
        outer.add(inner);
        parser = new TreeTraversingParser(outer);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWhenClosed() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        parser.close();
        // calling nextToken on closed parser should return null
        assertNull(parser.nextToken());
        // also closed flag remains true
        assertTrue(parser.isClosed());
    }

    // ---------- skipChildren ----------

    @Test
    public void testSkipChildrenOnArray() throws Exception {
        ArrayNode arr = new ArrayNode(null);
        arr.add(1);
        arr.add(2);
        parser = new TreeTraversingParser(arr);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.skipChildren();
        // after skip, current token should be END_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSkipChildrenOnObject() throws Exception {
        ObjectNode obj = new ObjectNode(null);
        obj.put("x", 10);
        parser = new TreeTraversingParser(obj);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSkipChildrenOnValue() throws Exception {
        parser = new TreeTraversingParser(new TextNode("val"));
        parser.nextToken(); // VALUE_STRING
        parser.skipChildren();
        // value tokens are not containers, so skipChildren does nothing
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken());
    }

    // ---------- getText variations ----------

    @Test
    public void testGetTextFieldName() throws Exception {
        ObjectNode obj = new ObjectNode(null);
        obj.put("key", 99);
        parser = new TreeTraversingParser(obj);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        assertEquals("key", parser.getText());
    }

    @Test
    public void testGetTextNumber() throws Exception {
        parser = new TreeTraversingParser(new IntNode(42));
        parser.nextToken();
        assertEquals("42", parser.getText());
    }

    @Test
    public void testGetTextDecimal() throws Exception {
        DecimalNode dec = new DecimalNode(new BigDecimal("3.14"));
        parser = new TreeTraversingParser(dec);
        parser.nextToken();
        assertEquals("3.14", parser.getText());
    }

    @Test
    public void testGetTextBinaryNode() throws Exception {
        byte[] data = {1,2,3};
        BinaryNode bin = new BinaryNode(data);
        parser = new TreeTraversingParser(bin);
        parser.nextToken(); // VALUE_EMBEDDED_OBJECT
        // asText() on binary node returns base64 encoded string
        assertNotNull(parser.getText());
    }

    @Test
    public void testGetTextNullToken() throws Exception {
        parser = new TreeTraversingParser(new NullNode());
        parser.nextToken();
        assertEquals("null", parser.getText());
    }

    @Test
    public void testGetTextWhenClosed() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        parser.close();
        assertNull(parser.getText());
    }

    // ---------- currentNumericNode (exception path) ----------

    @Test(expected = JsonParseException.class)
    public void testGetIntValueOnNonNumeric() throws Exception {
        parser = new TreeTraversingParser(new TextNode("not number"));
        parser.nextToken(); // VALUE_STRING
        parser.getIntValue(); // should throw
    }

    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValueOnNonNumeric() throws Exception {
        parser = new TreeTraversingParser(new BooleanNode(true));
        parser.nextToken();
        parser.getBigIntegerValue();
    }

    // ---------- getEmbeddedObject ----------

    @Test
    public void testGetEmbeddedObjectPOJO() throws Exception {
        Object pojo = new Object();
        POJONode pojoNode = new POJONode(pojo);
        parser = new TreeTraversingParser(pojoNode);
        parser.nextToken();
        assertSame(pojo, parser.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObjectBinary() throws Exception {
        byte[] data = {10,20};
        BinaryNode binNode = new BinaryNode(data);
        parser = new TreeTraversingParser(binNode);
        parser.nextToken();
        assertArrayEquals(data, (byte[]) parser.getEmbeddedObject());
    }

    @Test
    public void testGetEmbeddedObjectClosed() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        parser.close();
        assertNull(parser.getEmbeddedObject());
    }

    // ---------- isNaN ----------

    @Test
    public void testIsNaNOnNaN() throws Exception {
        DoubleNode nanNode = new DoubleNode(Double.NaN);
        parser = new TreeTraversingParser(nanNode);
        parser.nextToken();
        assertTrue(parser.isNaN());
    }

    @Test
    public void testIsNaNOnNormal() throws Exception {
        parser = new TreeTraversingParser(new IntNode(7));
        parser.nextToken();
        assertFalse(parser.isNaN());
    }

    @Test
    public void testIsNaNWhenClosed() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        parser.close();
        assertFalse(parser.isNaN());
    }

    // ---------- getBinaryValue ----------

    @Test
    public void testGetBinaryValueFromBinaryNode() throws Exception {
        byte[] data = {1,2,3,4};
        BinaryNode bin = new BinaryNode(data);
        parser = new TreeTraversingParser(bin);
        parser.nextToken();
        assertArrayEquals(data, parser.getBinaryValue(null));
    }

    @Test
    public void testGetBinaryValueFromTextNode() throws Exception {
        // TextNode with binary data is not supported; should return null
        parser = new TreeTraversingParser(new TextNode("not binary"));
        parser.nextToken();
        assertNull(parser.getBinaryValue(null));
    }

    @Test
    public void testGetBinaryValueFromPOJONodeWithByteArray() throws Exception {
        byte[] data = {5,6,7};
        POJONode pojo = new POJONode(data);
        parser = new TreeTraversingParser(pojo);
        parser.nextToken();
        assertArrayEquals(data, parser.getBinaryValue(null));
    }

    // ---------- readBinaryValue ----------

    @Test
    public void testReadBinaryValue() throws Exception {
        byte[] data = {10,20,30};
        BinaryNode bin = new BinaryNode(data);
        parser = new TreeTraversingParser(bin);
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int length = parser.readBinaryValue(null, out);
        assertEquals(data.length, length);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testReadBinaryValueEmpty() throws Exception {
        parser = new TreeTraversingParser(new TextNode("no binary"));
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0, parser.readBinaryValue(null, out));
    }

    // ---------- getCurrentName, overrideCurrentName ----------

    @Test
    public void testGetCurrentName() throws Exception {
        ObjectNode obj = new ObjectNode(null);
        obj.put("name", "val");
        parser = new TreeTraversingParser(obj);
        assertNull(parser.getCurrentName()); // before any token
        parser.nextToken(); // START_OBJECT
        assertNull(parser.getCurrentName());
        parser.nextToken(); // FIELD_NAME
        assertEquals("name", parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        ObjectNode obj = new ObjectNode(null);
        obj.put("original", 1);
        parser = new TreeTraversingParser(obj);
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.overrideCurrentName("overridden");
        assertEquals("overridden", parser.getCurrentName());
    }

    // ---------- getParsingContext, getTokenLocation, getCurrentLocation ----------

    @Test
    public void testGetParsingContext() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testTokenLocation() {
        parser = new TreeTraversingParser(new TextNode("x"));
        assertEquals(JsonLocation.NA, parser.getTokenLocation());
        assertEquals(JsonLocation.NA, parser.getCurrentLocation());
    }

    // ---------- getNumberType, getNumberValue ----------

    @Test
    public void testGetNumberType() throws Exception {
        parser = new TreeTraversingParser(new IntNode(42));
        parser.nextToken();
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeOnNonNumeric() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        parser.nextToken();
        assertNull(parser.getNumberType());
    }

    @Test
    public void testGetNumberValue() throws Exception {
        parser = new TreeTraversingParser(new LongNode(99L));
        parser.nextToken();
        assertEquals(99L, parser.getNumberValue());
    }

    @Test
    public void testGetDecimalValue() throws Exception {
        BigDecimal val = new BigDecimal("123.456");
        parser = new TreeTraversingParser(new DecimalNode(val));
        parser.nextToken();
        assertEquals(val, parser.getDecimalValue());
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        parser = new TreeTraversingParser(new DoubleNode(3.14));
        parser.nextToken();
        assertEquals(3.14, parser.getDoubleValue(), 1e-9);
    }

    @Test
    public void testGetFloatValue() throws Exception {
        parser = new TreeTraversingParser(new FloatNode(2.5f));
        parser.nextToken();
        assertEquals(2.5f, parser.getFloatValue(), 1e-6);
    }

    @Test
    public void testGetLongValue() throws Exception {
        parser = new TreeTraversingParser(new LongNode(1234567890123L));
        parser.nextToken();
        assertEquals(1234567890123L, parser.getLongValue());
    }

    @Test
    public void testGetBigIntegerValue() throws Exception {
        BigInteger big = new BigInteger("12345678901234567890");
        parser = new TreeTraversingParser(new BigIntegerNode(big));
        parser.nextToken();
        assertEquals(big, parser.getBigIntegerValue());
    }

    // ---------- codec set/get ----------

    @Test
    public void testSetCodec() {
        parser = new TreeTraversingParser(new NullNode());
        assertNull(parser.getCodec());
        ObjectCodec dummy = new ObjectCodec() {
            @Override public Version version() { return null; }
            @Override public ObjectCodec getCodec() { return this; }
            @Override public void setCodec(ObjectCodec c) {}
            @Override public JsonParser treeAsTokens(JsonNode n) { return null; }
            @Override public <T> T treeToValue(JsonNode n, Class<T> valueType) { return null; }
            @Override public JsonNode createObjectNode() { return null; }
            @Override public JsonNode createArrayNode() { return null; }
            @Override public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override public JsonNode readTree(JsonParser p) { return null; }
        };
        parser.setCodec(dummy);
        assertSame(dummy, parser.getCodec());
    }

    // ---------- version ----------

    @Test
    public void testVersionNotNull() {
        parser = new TreeTraversingParser(new NullNode());
        assertNotNull(parser.version());
    }

    // ---------- close / isClosed ----------

    @Test
    public void testClose() throws Exception {
        parser = new TreeTraversingParser(new TextNode("a"));
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        // calling close again should not throw
        parser.close();
        assertTrue(parser.isClosed());
    }

    // ---------- getTextCharacters / length / offset / hasTextCharacters ----------

    @Test
    public void testTextAccessMethods() throws Exception {
        parser = new TreeTraversingParser(new TextNode("abc"));
        parser.nextToken();
        assertArrayEquals("abc".toCharArray(), parser.getTextCharacters());
        assertEquals(3, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertFalse(parser.hasTextCharacters());
    }

    // ---------- skipChildren on null token ----------

    @Test
    public void testSkipChildrenOnNullToken() throws Exception {
        parser = new TreeTraversingParser(new NullNode());
        parser.nextToken(); // VALUE_NULL
        parser.skipChildren();
        assertNotNull(parser.getCurrentToken()); // no change
    }

    // ---------- empty cursor after closing ----------

    @Test
    public void testGetCurrentNameAfterClose() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        parser.close();
        assertNull(parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentNameAfterClose() throws Exception {
        parser = new TreeTraversingParser(new TextNode("x"));
        parser.close();
        // should not throw, but does nothing
        parser.overrideCurrentName("test");
    }
}