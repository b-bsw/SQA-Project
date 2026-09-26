package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class ObjectNodeTest {

    private JsonNodeFactory factory;
    private ObjectNode emptyNode;
    private ObjectNode sampleNode;

    @Before
    public void setUp() {
        factory = new JsonNodeFactory();
        emptyNode = new ObjectNode(factory);
        sampleNode = new ObjectNode(factory);
        sampleNode.put("name", "test");
        sampleNode.put("count", 42);
        sampleNode.put("active", true);
    }

    @Test
    public void testConstructorAndSize() {
        assertEquals(0, emptyNode.size());
        assertEquals(3, sampleNode.size());
    }

    @Test
    public void testDeepCopy() {
        ObjectNode copy = sampleNode.deepCopy();
        assertEquals(sampleNode, copy);
        assertNotSame(sampleNode, copy);
        assertNotSame(sampleNode.get("name"), copy.get("name"));
    }

    @Test
    public void testGetReturnsNullForMissingKey() {
        assertNull(emptyNode.get("nonexistent"));
    }

    @Test
    public void testGetExistingKey() {
        assertNotNull(sampleNode.get("name"));
        assertTrue(sampleNode.get("name").isTextual());
        assertEquals("test", sampleNode.get("name").asText());
    }

    @Test
    public void testPathMissingReturnsMissingNode() {
        assertTrue(emptyNode.path("missing") instanceof MissingNode);
    }

    @Test
    public void testPathExistingReturnsNode() {
        assertSame(sampleNode.get("name"), sampleNode.path("name"));
    }

    @Test
    public void testWithCreatesNewObjectNode() {
        ObjectNode result = emptyNode.with("newProp");
        assertNotNull(result);
        assertTrue(emptyNode.get("newProp") instanceof ObjectNode);
        assertSame(result, emptyNode.get("newProp"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithThrowsOnNonObjectNode() {
        sampleNode.with("name");
    }

    @Test
    public void testWithArrayCreatesNewArrayNode() {
        ArrayNode arr = emptyNode.withArray("arr");
        assertNotNull(arr);
        assertTrue(emptyNode.get("arr") instanceof ArrayNode);
        assertSame(arr, emptyNode.get("arr"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithArrayThrowsOnNonArrayNode() {
        sampleNode.withArray("name");
    }

    @Test
    public void testSetNewField() {
        JsonNode val = factory.textNode("value");
        JsonNode ret = emptyNode.set("key", val);
        assertSame(emptyNode, ret);
        assertSame(val, emptyNode.get("key"));
    }

    @Test
    public void testSetNullBecomesNullNode() {
        emptyNode.set("key", null);
        assertTrue(emptyNode.get("key") instanceof NullNode);
    }

    @Test
    public void testReplaceReturnsOldValue() {
        JsonNode old = sampleNode.replace("name", factory.textNode("newName"));
        assertNotNull(old);
        assertEquals("test", old.asText());
        assertEquals("newName", sampleNode.get("name").asText());
    }

    @Test
    public void testReplaceNonExistentReturnsNull() {
        JsonNode old = emptyNode.replace("nonexistent", factory.textNode("val"));
        assertNull(old);
        assertNotNull(emptyNode.get("nonexistent"));
    }

    @Test
    public void testRemoveExistingField() {
        JsonNode removed = sampleNode.remove("name");
        assertNotNull(removed);
        assertEquals("test", removed.asText());
        assertNull(sampleNode.get("name"));
        assertEquals(2, sampleNode.size());
    }

    @Test
    public void testRemoveNonExistentReturnsNull() {
        assertNull(emptyNode.remove("nothing"));
    }

    @Test
    public void testRemoveCollection() {
        sampleNode.remove(Arrays.asList("name", "active"));
        assertEquals(1, sampleNode.size());
        assertNull(sampleNode.get("name"));
        assertNull(sampleNode.get("active"));
        assertNotNull(sampleNode.get("count"));
    }

    @Test
    public void testRemoveAll() {
        sampleNode.removeAll();
        assertEquals(0, sampleNode.size());
    }

    @Test
    public void testSetAllMap() {
        Map<String, JsonNode> map = new HashMap<>();
        map.put("a", factory.textNode("1"));
        map.put("b", factory.numberNode(2));
        emptyNode.setAll(map);
        assertEquals(2, emptyNode.size());
        assertEquals("1", emptyNode.get("a").asText());
        assertEquals(2, emptyNode.get("b").asInt());
    }

    @Test
    public void testSetAllObjectNode() {
        ObjectNode other = new ObjectNode(factory);
        other.put("x", 10);
        sampleNode.setAll(other);
        assertEquals(4, sampleNode.size());
        assertEquals(10, sampleNode.get("x").asInt());
    }

    @Test
    public void testWithoutRemovesSingleField() {
        sampleNode.without("name");
        assertNull(sampleNode.get("name"));
        assertEquals(2, sampleNode.size());
    }

    @Test
    public void testWithoutCollection() {
        sampleNode.without(Arrays.asList("count", "active"));
        assertEquals(1, sampleNode.size());
        assertNotNull(sampleNode.get("name"));
    }

    @Test
    public void testRetainCollection() {
        sampleNode.retain(Arrays.asList("name"));
        assertEquals(1, sampleNode.size());
        assertNotNull(sampleNode.get("name"));
        assertNull(sampleNode.get("count"));
    }

    @Test
    public void testRetainVarargs() {
        sampleNode.retain("name", "active");
        assertEquals(2, sampleNode.size());
        assertNull(sampleNode.get("count"));
    }

    @Test
    public void testPutJsonNode() {
        JsonNode old = sampleNode.put("name", factory.textNode("newName"));
        assertNotNull(old);
        assertEquals("test", old.asText());
    }

    @Test
    public void testPutNullJsonNode() {
        JsonNode old = sampleNode.put("name", (JsonNode) null);
        assertNotNull(old);
        assertTrue(sampleNode.get("name") instanceof NullNode);
    }

    @Test
    public void testPutString() {
        emptyNode.put("s", "hello");
        assertEquals("hello", emptyNode.get("s").asText());
    }

    @Test
    public void testPutNullString() {
        emptyNode.put("s", (String) null);
        assertTrue(emptyNode.get("s") instanceof NullNode);
    }

    @Test
    public void testPutInt() {
        emptyNode.put("i", 123);
        assertEquals(123, emptyNode.get("i").asInt());
    }

    @Test
    public void testPutIntegerNull() {
        emptyNode.put("i", (Integer) null);
        assertTrue(emptyNode.get("i") instanceof NullNode);
    }

    @Test
    public void testPutLong() {
        emptyNode.put("l", 456L);
        assertEquals(456L, emptyNode.get("l").asLong());
    }

    @Test
    public void testPutLongNull() {
        emptyNode.put("l", (Long) null);
        assertTrue(emptyNode.get("l") instanceof NullNode);
    }

    @Test
    public void testPutDouble() {
        emptyNode.put("d", 3.14);
        assertEquals(3.14, emptyNode.get("d").asDouble(), 0.0001);
    }

    @Test
    public void testPutDoubleNull() {
        emptyNode.put("d", (Double) null);
        assertTrue(emptyNode.get("d") instanceof NullNode);
    }

    @Test
    public void testPutBoolean() {
        emptyNode.put("b", true);
        assertTrue(emptyNode.get("b").asBoolean());
    }

    @Test
    public void testPutBooleanNull() {
        emptyNode.put("b", (Boolean) null);
        assertTrue(emptyNode.get("b") instanceof NullNode);
    }

    @Test
    public void testPutBigDecimal() {
        emptyNode.put("bd", BigDecimal.valueOf(123.456));
        assertEquals(0, BigDecimal.valueOf(123.456).compareTo(emptyNode.get("bd").decimalValue()));
    }

    @Test
    public void testPutBigDecimalNull() {
        emptyNode.put("bd", (BigDecimal) null);
        assertTrue(emptyNode.get("bd") instanceof NullNode);
    }

    @Test
    public void testPutByteArray() {
        byte[] bytes = {1,2,3};
        emptyNode.put("bin", bytes);
        assertArrayEquals(bytes, emptyNode.get("bin").binaryValue());
    }

    @Test
    public void testPutByteArrayNull() {
        emptyNode.put("bin", (byte[]) null);
        assertTrue(emptyNode.get("bin") instanceof NullNode);
    }

    @Test
    public void testPutArray() {
        ArrayNode arr = emptyNode.putArray("arr");
        assertNotNull(arr);
        assertTrue(emptyNode.get("arr") instanceof ArrayNode);
    }

    @Test
    public void testPutObject() {
        ObjectNode obj = emptyNode.putObject("obj");
        assertNotNull(obj);
        assertTrue(emptyNode.get("obj") instanceof ObjectNode);
    }

    @Test
    public void testPutPOJO() {
        ObjectNode ret = emptyNode.putPOJO("pojo", "someValue");
        assertSame(emptyNode, ret);
        assertNotNull(emptyNode.get("pojo"));
    }

    @Test
    public void testPutNull() {
        ObjectNode ret = emptyNode.putNull("n");
        assertSame(emptyNode, ret);
        assertTrue(emptyNode.get("n") instanceof NullNode);
    }

    @Test
    public void testFindValueFoundDirect() {
        assertSame(sampleNode.get("name"), sampleNode.findValue("name"));
    }

    @Test
    public void testFindValueFoundInNested() {
        ObjectNode nested = new ObjectNode(factory);
        nested.put("inner", "value");
        sampleNode.set("nested", nested);
        assertSame(nested.get("inner"), sampleNode.findValue("inner"));
    }

    @Test
    public void testFindValueNotFound() {
        assertNull(sampleNode.findValue("nonexistent"));
    }

    @Test
    public void testFindValuesCollectDirect() {
        List<JsonNode> results = sampleNode.findValues("name", null);
        assertEquals(1, results.size());
        assertEquals(sampleNode.get("name"), results.get(0));
    }

    @Test
    public void testFindValuesCollectNested() {
        ObjectNode nested = new ObjectNode(factory);
        nested.put("name", "nestedValue");
        sampleNode.set("nested", nested);
        List<JsonNode> results = sampleNode.findValues("name", null);
        assertEquals(2, results.size());
    }

    @Test
    public void testFindValuesAsText() {
        List<String> texts = sampleNode.findValuesAsText("name", null);
        assertEquals(1, texts.size());
        assertEquals("test", texts.get(0));
    }

    @Test
    public void testFindParentFoundDirect() {
        assertSame(sampleNode, sampleNode.findParent("name"));
    }

    @Test
    public void testFindParentFoundNested() {
        ObjectNode nested = new ObjectNode(factory);
        nested.put("inner", "val");
        sampleNode.set("nested", nested);
        assertSame(nested, sampleNode.findParent("inner"));
    }

    @Test
    public void testFindParentNotFound() {
        assertNull(sampleNode.findParent("nonexist"));
    }

    @Test
    public void testFindParentsDirect() {
        List<JsonNode> parents = sampleNode.findParents("name", null);
        assertEquals(1, parents.size());
        assertSame(sampleNode, parents.get(0));
    }

    @Test
    public void testEqualsSameContent() {
        ObjectNode other = new ObjectNode(factory);
        other.put("name", "test");
        other.put("count", 42);
        other.put("active", true);
        assertTrue(sampleNode.equals(other));
        assertEquals(sampleNode.hashCode(), other.hashCode());
    }

    @Test
    public void testEqualsDifferentContent() {
        ObjectNode other = new ObjectNode(factory);
        other.put("name", "test");
        assertFalse(sampleNode.equals(other));
    }

    @Test
    public void testEqualsWithSelf() {
        assertTrue(sampleNode.equals(sampleNode));
    }

    @Test
    public void testEqualsWithNull() {
        assertFalse(sampleNode.equals(null));
    }

    @Test
    public void testToStringEmpty() {
        assertEquals("{}", emptyNode.toString());
    }

    @Test
    public void testToStringNonEmpty() {
        String str = sampleNode.toString();
        assertTrue(str.startsWith("{"));
        assertTrue(str.endsWith("}"));
        assertTrue(str.contains("\"name\""));
    }

    @Test
    public void testElementsIterator() {
        Iterator<JsonNode> it = sampleNode.elements();
        assertTrue(it.hasNext());
        while (it.hasNext()) {
            assertNotNull(it.next());
        }
    }

    @Test
    public void testFieldNamesIterator() {
        Iterator<String> it = sampleNode.fieldNames();
        assertTrue(it.hasNext());
        assertEquals("name", it.next());
        assertEquals("count", it.next());
        assertEquals("active", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testFieldsIterator() {
        Iterator<Map.Entry<String, JsonNode>> it = sampleNode.fields();
        assertTrue(it.hasNext());
        Map.Entry<String, JsonNode> entry = it.next();
        assertEquals("name", entry.getKey());
        assertEquals("test", entry.getValue().asText());
    }

    @Test
    public void testGetNodeType() {
        assertEquals(JsonNodeType.OBJECT, sampleNode.getNodeType());
    }

    @Test
    public void testAsToken() {
        assertEquals(JsonToken.START_OBJECT, sampleNode.asToken());
    }

    @Test
    public void testGetIntReturnsNull() {
        assertNull(sampleNode.get(0));
    }

    @Test
    public void testPathIntReturnsMissingNode() {
        assertTrue(sampleNode.path(0) instanceof MissingNode);
    }
}