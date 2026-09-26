package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

public class TreeTraversingParserTest {

    private final JsonNodeFactory factory = JsonNodeFactory.instance;

    private TreeTraversingParser parser(JsonNode n) {
        return new TreeTraversingParser(n);
    }

    @Test
    public void testTextValueAccessors() throws Exception {
        TreeTraversingParser p = parser(factory.textNode("hello"));
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
        assertArrayEquals("hello".toCharArray(), p.getTextCharacters());
        assertEquals(5, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
        assertFalse(p.isClosed());
    }

    @Test
    public void testNumericValueAccessors() throws Exception {
        TreeTraversingParser p = parser(factory.numberNode(42));
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonParser.NumberType.INT, p.getNumberType());
        assertEquals(42, p.getIntValue());
        assertEquals(42L, p.getLongValue());
        assertEquals(42.0, p.getDoubleValue(), 0.0);
        assertEquals(42.0f, p.getFloatValue(), 0.0f);
        assertEquals(42, p.getNumberValue().intValue());
        assertEquals(BigInteger.valueOf(42), p.getBigIntegerValue());
        assertEquals(0, new BigDecimal("42").compareTo(p.getDecimalValue()));
        assertEquals("42", p.getText());
    }

    @Test
    public void testRootArrayTraversal() throws Exception {
        ArrayNode arr = factory.arrayNode();
        arr.add("a");
        arr.add(2);

        TreeTraversingParser p = parser(arr);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a", p.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testRootObjectTraversalAndFieldName() throws Exception {
        ObjectNode obj = factory.objectNode();
        obj.set("name", factory.textNode("x"));

        TreeTraversingParser p = parser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getText());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("x", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNestedContainerSkipChildren() throws Exception {
        ObjectNode obj = factory.objectNode();
        ArrayNode arr = factory.arrayNode();
        arr.add(1);
        arr.add(2);
        obj.set("a", arr);

        TreeTraversingParser p = parser(obj);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());

        assertSame(p, p.skipChildren());
        assertEquals(JsonToken.END_ARRAY, p.getCurrentToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testEmptyContainerOptimization() throws Exception {
        TreeTraversingParser p = parser(factory.arrayNode());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());

        p = parser(factory.objectNode());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testBinaryValueFromBinaryNode() throws Exception {
        byte[] data = new byte[]{1, 2, 3};
        TreeTraversingParser p = parser(new BinaryNode(data));
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());

        assertArrayEquals(data, (byte[]) p.getEmbeddedObject());
        assertArrayEquals(data, p.getBinaryValue(Base64Variants.STD_B64));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(data.length, p.readBinaryValue(Base64Variants.STD_B64, out));
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testBinaryValueFromTextNode() throws Exception {
        byte[] data = new byte[]{1, 2, 3};
        TreeTraversingParser p = parser(factory.textNode("AQID"));
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertArrayEquals(data, p.getBinaryValue(Base64Variants.STD_B64));
    }

    @Test
    public void testBinaryGettersReturnNullAndZeroOnNonBinary() throws Exception {
        TreeTraversingParser p = parser(factory.numberNode(1));
        p.nextToken();

        assertNull(p.getBinaryValue(Base64Variants.STD_B64));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0, p.readBinaryValue(Base64Variants.STD_B64, out));
        assertEquals(0, out.size());
    }

    @Test
    public void testEmbeddedPojo() throws Exception {
        Object pojo = new Object();
        TreeTraversingParser p = parser(new POJONode(pojo));
        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.nextToken());
        assertSame(pojo, p.getEmbeddedObject());
    }

    @Test(expected = JsonParseException.class)
    public void testNumericAccessFailsOnNonNumeric() throws Exception {
        TreeTraversingParser p = parser(factory.textNode("x"));
        p.nextToken();
        p.getIntValue();
    }

    @Test(expected = JsonParseException.class)
    public void testNumericAccessFailsAtEnd() throws Exception {
        TreeTraversingParser p = parser(factory.numberNode(1));
        p.nextToken();
        assertNull(p.nextToken());
        p.getDoubleValue();
    }

    @Test
    public void testCloseIsIdempotent() throws Exception {
        TreeTraversingParser p = parser(factory.numberNode(1));
        p.nextToken();
        p.close();
        p.close();
        assertTrue(p.isClosed());
        assertNull(p.nextToken());
        assertNull(p.getText());
    }

    @Test
    public void testOverrideFieldName() throws Exception {
        ObjectNode obj = factory.objectNode();
        obj.set("a", factory.textNode("v"));

        TreeTraversingParser p = parser(obj);
        p.nextToken();
        p.nextToken();
        assertEquals("a", p.getCurrentName());

        p.overrideCurrentName("b");
        assertEquals("b", p.getCurrentName());
    }

    @Test
    public void testLocationAndVersion() throws Exception {
        TreeTraversingParser p = parser(factory.nullNode());
        assertNotNull(p.version());
        assertSame(JsonLocation.NA, p.getTokenLocation());
        assertSame(JsonLocation.NA, p.getCurrentLocation());
    }

    @Test
    public void testDoubleNaN() throws Exception {
        TreeTraversingParser p = parser(factory.numberNode(Double.NaN));
        p.nextToken();
        assertTrue(p.isNaN());

        p = parser(factory.numberNode(1.0));
        p.nextToken();
        assertFalse(p.isNaN());
    }
}