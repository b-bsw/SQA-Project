package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.util.RawValue;
import org.junit.Test;

import static org.junit.Assert.*;

public class POJONodeTest {

    @Test
    public void testGetValue() {
        Object value = new Object();
        POJONode node = new POJONode(value);

        assertSame(value, node.getValue());
    }

    @Test
    public void testGetValueNull() {
        POJONode node = new POJONode(null);

        assertNull(node.getValue());
    }

    @Test
    public void testNodeType() {
        POJONode node = new POJONode("value");

        assertEquals(JsonNodeType.POJO, node.nodeType());
    }

    @Test
    public void testAsToken() {
        POJONode node = new POJONode("value");

        assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, node.asToken());
    }

    @Test
    public void testAsText() {
        POJONode textNode = new POJONode("hello");
        POJONode numberNode = new POJONode(123);
        POJONode nullNode = new POJONode(null);

        assertEquals("hello", textNode.asText());
        assertEquals("123", numberNode.asText());
        assertEquals("null", nullNode.asText());
    }

    @Test
    public void testToString() {
        POJONode byteArrayNode = new POJONode(new byte[]{1, 2, 3});
        POJONode emptyByteArrayNode = new POJONode(new byte[0]);
        POJONode rawValueNode = new POJONode(new RawValue("abc"));
        POJONode nullNode = new POJONode(null);
        POJONode textNode = new POJONode("plain");

        assertEquals("(binary value of 3 bytes)", byteArrayNode.toString());
        assertEquals("(binary value of 0 bytes)", emptyByteArrayNode.toString());
        assertEquals("(raw value 'abc')", rawValueNode.toString());
        assertEquals("null", nullNode.toString());
        assertEquals("plain", textNode.toString());
    }

    @Test
    public void testEquals() {
        POJONode a = new POJONode("value");
        POJONode b = new POJONode("value");
        POJONode c = new POJONode("other");

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
        assertFalse(a.equals(null));
        assertFalse(a.equals("value"));

        POJONode nullA = new POJONode(null);
        POJONode nullB = new POJONode(null);
        POJONode value = new POJONode("value");

        assertTrue(nullA.equals(nullB));
        assertFalse(nullA.equals(value));
        assertFalse(value.equals(nullA));
    }

    @Test
    public void testHashCode() {
        POJONode a = new POJONode("value");
        POJONode b = new POJONode("value");

        assertNotNull(a.hashCode());
        assertEquals(a.hashCode(), b.hashCode());
    }
}