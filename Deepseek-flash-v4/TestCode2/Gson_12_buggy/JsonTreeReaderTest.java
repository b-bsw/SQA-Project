package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;

import com.google.gson.*;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

public class JsonTreeReaderTest {

    @Test
    public void testBasicArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(1));
        array.add(new JsonPrimitive("two"));
        array.add(new JsonPrimitive(true));
        array.add(JsonNull.INSTANCE);
        array.add(new JsonPrimitive(3.5));
        JsonTreeReader reader = new JsonTreeReader(array);
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertTrue(reader.hasNext());
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(1, reader.nextInt());
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("two", reader.nextString());
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        assertTrue(reader.nextBoolean());
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(3.5, reader.nextDouble(), 0.0);
        assertFalse(reader.hasNext());
        assertEquals(JsonToken.END_ARRAY, reader.peek());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testBasicObject() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("key", "value");
        obj.addProperty("num", 42);
        JsonTreeReader reader = new JsonTreeReader(obj);
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
        reader.beginObject();
        assertTrue(reader.hasNext());
        assertEquals(JsonToken.NAME, reader.peek());
        assertEquals("key", reader.nextName());
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("value", reader.nextString());
        assertEquals(JsonToken.NAME, reader.peek());
        assertEquals("num", reader.nextName());
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(42, reader.nextInt());
        assertFalse(reader.hasNext());
        assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testNestedArrayInObject() throws IOException {
        JsonObject obj = new JsonObject();
        JsonArray arr = new JsonArray();
        arr.add(new JsonPrimitive(10));
        arr.add(new JsonPrimitive(20));
        obj.add("items", arr);
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        assertEquals("items", reader.nextName());
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());
        reader.beginArray();
        assertEquals(10, reader.nextInt());
        assertEquals(20, reader.nextInt());
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testEmptyArray() throws IOException {
        JsonArray array = new JsonArray();
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        assertFalse(reader.hasNext());
        assertEquals(JsonToken.END_ARRAY, reader.peek());
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test
    public void testEmptyObject() throws IOException {
        JsonObject obj = new JsonObject();
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        assertFalse(reader.hasNext());
        assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test(expected = IllegalStateException.class)
    public void testCloseThrowsOnPeek() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonObject());
        reader.close();
        reader.peek();
    }

    @Test
    public void testSkipValueInArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add(1);
        array.add(2);
        array.add(3);
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        reader.skipValue();
        assertEquals(2, reader.nextInt());
        reader.skipValue();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testPromoteNameToValue() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("a", "b");
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        reader.promoteNameToValue();
        assertEquals(JsonToken.STRING, reader.peek());
        assertEquals("a", reader.nextString());
        assertEquals("b", reader.nextString());
        reader.endObject();
    }

    @Test
    public void testGetPath() throws IOException {
        JsonObject root = new JsonObject();
        JsonArray arr = new JsonArray();
        arr.add(new JsonPrimitive(1));
        arr.add(new JsonPrimitive(2));
        root.add("list", arr);
        JsonTreeReader reader = new JsonTreeReader(root);
        assertEquals("$", reader.getPath());
        reader.beginObject();
        assertEquals("$.", reader.getPath());
        assertEquals("list", reader.nextName());
        assertEquals("$.list", reader.getPath());
        reader.beginArray();
        assertEquals("$.list[0]", reader.getPath());
        assertEquals(1, reader.nextInt());
        assertEquals("$.list[1]", reader.getPath());
        assertEquals(2, reader.nextInt());
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testNextBooleanAndNull() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(false));
        array.add(JsonNull.INSTANCE);
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        assertFalse(reader.nextBoolean());
        reader.nextNull();
        reader.endArray();
    }

    @Test
    public void testNextDoubleLongInt() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(1.5));
        array.add(new JsonPrimitive(100));
        array.add(new JsonPrimitive(200));
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        assertEquals(1.5, reader.nextDouble(), 0.0);
        assertEquals(100L, reader.nextLong());
        assertEquals(200, reader.nextInt());
        reader.endArray();
    }

    @Test(expected = NumberFormatException.class)
    public void testNextDoubleNonLenientNaN() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(Double.NaN));
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.setLenient(false);
        reader.beginArray();
        reader.nextDouble();
    }

    @Test(expected = IllegalStateException.class)
    public void testNextNameInArray() throws IOException {
        JsonArray array = new JsonArray();
        array.add(new JsonPrimitive(1));
        JsonTreeReader reader = new JsonTreeReader(array);
        reader.beginArray();
        reader.nextName();
    }

    @Test(expected = IllegalStateException.class)
    public void testNextStringOnObject() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("k", "v");
        JsonTreeReader reader = new JsonTreeReader(obj);
        reader.beginObject();
        reader.nextString();
    }

    @Test
    public void testPathAfterNested() throws IOException {
        JsonObject outer = new JsonObject();
        JsonObject inner = new JsonObject();
        inner.addProperty("x", 5);
        outer.add("inner", inner);
        JsonTreeReader reader = new JsonTreeReader(outer);
        reader.beginObject();
        assertEquals("inner", reader.nextName());
        reader.beginObject();
        assertEquals("$.inner.", reader.getPath());
        assertEquals("x", reader.nextName());
        assertEquals("$.inner.x", reader.getPath());
        assertEquals(5, reader.nextInt());
        reader.endObject();
        reader.endObject();
    }

    @Test
    public void testToString() {
        JsonTreeReader reader = new JsonTreeReader(new JsonObject());
        assertEquals("JsonTreeReader", reader.toString());
    }
}