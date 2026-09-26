package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class JsonTreeWriterTest {

    @Test
    public void testEmptyTree() {
        JsonTreeWriter writer = new JsonTreeWriter();
        JsonElement result = writer.get();
        assertTrue(result instanceof JsonNull);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNonEmptyStack() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.get();
    }

    @Test
    public void testWritePrimitiveString() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value("hello");
        JsonElement result = writer.get();
        assertTrue(result instanceof JsonPrimitive);
        assertEquals("hello", result.getAsString());
    }

    @Test
    public void testWriteNullString() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((String) null);
        JsonElement result = writer.get();
        assertTrue(result instanceof JsonNull);
    }

    @Test
    public void testNullValue() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.nullValue();
        JsonElement result = writer.get();
        assertTrue(result instanceof JsonNull);
    }

    @Test
    public void testWriteBoolean() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(true);
        assertTrue(writer.get().getAsBoolean());
    }

    @Test
    public void testWriteLong() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(123L);
        assertEquals(123L, writer.get().getAsLong());
    }

    @Test
    public void testWriteDouble() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(3.14);
        assertEquals(3.14, writer.get().getAsDouble(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteDoubleNaNNonLenient() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteDoubleInfinityNonLenient() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testWriteDoubleNaNLenient() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.value(Double.NaN);
        assertTrue(Double.isNaN(writer.get().getAsDouble()));
    }

    @Test
    public void testWriteNumberNull() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value((Number) null);
        assertTrue(writer.get() instanceof JsonNull);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteNumberNaNNonLenient() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(Double.NaN);
    }

    @Test
    public void testWriteNumberInfinityLenient() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setLenient(true);
        writer.value(Double.POSITIVE_INFINITY);
        assertTrue(Double.isInfinite(writer.get().getAsDouble()));
    }

    @Test
    public void testArray() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        JsonElement result = writer.get();
        assertTrue(result instanceof JsonArray);
        JsonArray array = (JsonArray) result;
        assertEquals(2, array.size());
        assertEquals(1, array.get(0).getAsInt());
        assertEquals(2, array.get(1).getAsInt());
    }

    @Test
    public void testObject() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("name");
        writer.value("test");
        writer.endObject();
        JsonElement result = writer.get();
        assertTrue(result instanceof JsonObject);
        JsonObject obj = (JsonObject) result;
        assertEquals("test", obj.get("name").getAsString());
    }

    @Test
    public void testNestedArrayInObject() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("arr");
        writer.beginArray();
        writer.value(10);
        writer.endArray();
        writer.endObject();
        JsonObject obj = (JsonObject) writer.get();
        assertTrue(obj.get("arr").isJsonArray());
        assertEquals(1, obj.getAsJsonArray("arr").size());
    }

    @Test(expected = IllegalStateException.class)
    public void testNameOnEmptyStack() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.name("x");
    }

    @Test(expected = IllegalStateException.class)
    public void testNameTwice() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("a");
        writer.name("b");
    }

    @Test(expected = IllegalStateException.class)
    public void testNameOnArray() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.name("x");
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayOnEmptyStack() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObjectOnEmptyStack() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayMismatch() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObjectMismatch() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayWithPendingName() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("x");
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObjectWithPendingName() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("x");
        writer.endObject();
    }

    @Test
    public void testCloseOnEmptyStack() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.close();
        // no exception expected
    }

    @Test(expected = IOException.class)
    public void testCloseOnIncompleteDocument() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.close();
    }

    @Test
    public void testGetAfterClose() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.close();
        JsonElement product = writer.get();
        assertTrue(product instanceof JsonNull);
    }

    @Test
    public void testFlush() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.flush();
    }

    @Test
    public void testNullPropertyNotAddedByDefault() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginObject();
        writer.name("nullKey");
        writer.nullValue();
        writer.endObject();
        JsonObject obj = (JsonObject) writer.get();
        assertFalse(obj.has("nullKey"));
    }

    @Test
    public void testNullPropertyAddedWhenSerializeNullsTrue() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.setSerializeNulls(true);
        writer.beginObject();
        writer.name("nullKey");
        writer.nullValue();
        writer.endObject();
        JsonObject obj = (JsonObject) writer.get();
        assertTrue(obj.has("nullKey"));
        assertTrue(obj.get("nullKey").isJsonNull());
    }

    @Test
    public void testWriteNumber() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.value(42);
        assertEquals(42, writer.get().getAsInt());
    }

    @Test
    public void testMultipleValuesInArray() {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.beginArray();
        writer.value(true);
        writer.value("hello");
        writer.value(3.14);
        writer.endArray();
        JsonArray arr = (JsonArray) writer.get();
        assertEquals(3, arr.size());
        assertTrue(arr.get(0).getAsBoolean());
        assertEquals("hello", arr.get(1).getAsString());
        assertEquals(3.14, arr.get(2).getAsDouble(), 0.0);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteAfterClose() throws Exception {
        JsonTreeWriter writer = new JsonTreeWriter();
        writer.close();
        writer.value("x");
    }
}