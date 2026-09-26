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
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeTraversingParserTest {

    private static final JsonNodeFactory FACTORY = JsonNodeFactory.instance;

    @Test
    public void testValueNodeTraversal() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.textNode("hello"));
        assertNull(parser.getCurrentToken());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
        assertNull(parser.nextToken());
    }

    @Test
    public void testArrayTraversal() throws Exception {
        ArrayNode array = FACTORY.arrayNode();
        array.add(FACTORY.textNode("x"));
        array.add(FACTORY.numberNode(2));

        TreeTraversingParser parser = new TreeTraversingParser(array);

        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("x", parser.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testObjectTraversalAndFieldNames() throws Exception {
        ObjectNode object = FACTORY.objectNode();
        object.set("name", FACTORY.textNode("value"));

        TreeTraversingParser parser = new TreeTraversingParser(object);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals("name", parser.getText());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals("name", parser.getCurrentName());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testEmptyObjectAndArray() throws Exception {
        TreeTraversingParser objectParser = new TreeTraversingParser(FACTORY.objectNode());
        assertEquals(JsonToken.START_OBJECT, objectParser.nextToken());
        assertEquals(JsonToken.END_OBJECT, objectParser.nextToken());
        assertNull(objectParser.nextToken());

        TreeTraversingParser arrayParser = new TreeTraversingParser(FACTORY.arrayNode());
        assertEquals(JsonToken.START_ARRAY, arrayParser.nextToken());
        assertEquals(JsonToken.END_ARRAY, arrayParser.nextToken());
        assertNull(arrayParser.nextToken());
    }

    @Test
    public void testNumericAccessors() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.numberNode(42));

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonParser.NumberType.INT, parser.getNumberType());
        assertEquals(42, parser.getIntValue());
        assertEquals(42L, parser.getLongValue());
        assertEquals(BigInteger.valueOf(42), parser.getBigIntegerValue());
        assertEquals(0, BigDecimal.valueOf(42).compareTo(parser.getDecimalValue()));
        assertEquals(42, parser.getNumberValue().intValue());
        assertEquals("42", parser.getText());
    }

    @Test
    public void testBigIntegerValue() throws Exception {
        BigInteger big = new BigInteger("12345678901234567890");
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.numberNode(big));

        assertNotNull(parser.nextToken());
        assertEquals(big, parser.getBigIntegerValue());
        assertEquals(JsonParser.NumberType.BIG_INTEGER, parser.getNumberType());
    }

    @Test
    public void testDoubleAccessorsAndIsNaN() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.numberNode(12.5));
        parser.nextToken();

        assertEquals(12.5, parser.getDoubleValue(), 0.0);
        assertEquals(12.5f, parser.getFloatValue(), 0.0f);
        assertFalse(parser.isNaN());

        TreeTraversingParser nanParser = new TreeTraversingParser(FACTORY.numberNode(Double.NaN));
        nanParser.nextToken();

        assertTrue(nanParser.isNaN());
    }

    @Test
    public void testBinaryAccess() throws Exception {
        byte[] data = new byte[]{1, 2, 3};
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.binaryNode(data));

        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertArrayEquals(data, parser.getBinaryValue(Base64Variants.MIME_DEFAULT));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(3, parser.readBinaryValue(Base64Variants.MIME_DEFAULT, out));
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testReadBinaryValueFromBase64Text() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.textNode("YQ=="));
        parser.nextToken();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(1, parser.readBinaryValue(Base64Variants.MIME_DEFAULT, out));
        assertArrayEquals(new byte[]{97}, out.toByteArray());
    }

    @Test
    public void testReadBinaryValueWithNonBinaryReturnsZero() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.numberNode(7));
        parser.nextToken();

        assertEquals(0, parser.readBinaryValue(Base64Variants.MIME_DEFAULT, new ByteArrayOutputStream()));
    }

    @Test
    public void testEmbeddedObject() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.pojoNode("value"));

        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, parser.nextToken());
        assertEquals("value", parser.getEmbeddedObject());
    }

    @Test
    public void testSkipChildrenOnNestedObject() throws Exception {
        ObjectNode root = FACTORY.objectNode();
        ObjectNode child = FACTORY.objectNode();
        child.set("x", FACTORY.numberNode(1));
        root.set("child", child);
        root.set("after", FACTORY.numberNode(2));

        TreeTraversingParser parser = new TreeTraversingParser(root);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("child", parser.getCurrentName());

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertSame(parser, parser.skipChildren());
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("after", parser.getCurrentName());
    }

    @Test
    public void testClose() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.textNode("x"));
        assertFalse(parser.isClosed());

        parser.close();
        assertTrue(parser.isClosed());
        assertNull(parser.getText());

        parser.close();
    }

    @Test
    public void testLocationAndTextHelpers() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.textNode("abc"));
        parser.nextToken();

        assertNotNull(parser.getParsingContext());
        assertSame(JsonLocation.NA, parser.getTokenLocation());
        assertSame(JsonLocation.NA, parser.getCurrentLocation());

        char[] chars = parser.getTextCharacters();
        assertEquals(0, parser.getTextOffset());
        assertEquals(3, parser.getTextLength());
        assertEquals("abc", new String(chars, parser.getTextOffset(), parser.getTextLength()));
    }

    @Test
    public void testCodec() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.textNode("x"), mapper);

        assertSame(mapper, parser.getCodec());

        parser.setCodec(null);
        assertNull(parser.getCodec());
    }

    @Test(expected = JsonParseException.class)
    public void testGetIntValueOnNonNumericThrows() throws Exception {
        TreeTraversingParser parser = new TreeTraversingParser(FACTORY.textNode("abc"));
        parser.nextToken();
        parser.getIntValue();
    }
}