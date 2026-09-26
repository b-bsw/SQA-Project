package com.google.gson.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.StringReader;
import java.io.EOFException;
import java.io.IOException;
import static org.junit.Assert.*;

public class JsonReaderTest {
    private JsonReader reader;

    @After
    public void tearDown() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullReader() {
        new JsonReader(null);
    }

    @Test
    public void testEmptyArray() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.beginArray();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testEmptyObject() throws IOException {
        reader = new JsonReader(new StringReader("{}"));
        reader.beginObject();
        assertFalse(reader.hasNext());
        reader.endObject();
    }

    @Test
    public void testStringValue() throws IOException {
        reader = new JsonReader(new StringReader("\"hello\""));
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testIntegerValue() throws IOException {
        reader = new JsonReader(new StringReader("42"));
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testLongValue() throws IOException {
        reader = new JsonReader(new StringReader("2147483648"));
        assertEquals(2147483648L, reader.nextLong());
    }

    @Test
    public void testDoubleValue() throws IOException {
        reader = new JsonReader(new StringReader("3.14"));
        assertEquals(3.14, reader.nextDouble(), 1e-9);
    }

    @Test
    public void testScientificNotation() throws IOException {
        reader = new JsonReader(new StringReader("1e10"));
        assertEquals(1e10, reader.nextDouble(), 1e9);
    }

    @Test
    public void testBooleanTrueFalse() throws IOException {
        reader = new JsonReader(new StringReader("true false"));
        assertTrue(reader.nextBoolean());
        assertFalse(reader.nextBoolean());
    }

    @Test
    public void testNullValue() throws IOException {
        reader = new JsonReader(new StringReader("null"));
        reader.nextNull();
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArrayOnObject() throws IOException {
        reader = new JsonReader(new StringReader("{}"));
        reader.beginArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayOnObject() throws IOException {
        reader = new JsonReader(new StringReader("{}"));
        reader.endArray();
    }

    @Test(expected = EOFException.class)
    public void testEofThrows() throws IOException {
        reader = new JsonReader(new StringReader(""));
        reader.nextString();
    }

    @Test
    public void testHasNextInArray() throws IOException {
        reader = new JsonReader(new StringReader("[1,2]"));
        reader.beginArray();
        assertTrue(reader.hasNext());
        reader.nextInt();
        assertTrue(reader.hasNext());
        reader.nextInt();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testNestedArrayAndObject() throws IOException {
        reader = new JsonReader(new StringReader("{\"arr\":[1,2]}"));
        reader.beginObject();
        assertEquals("arr", reader.nextName());
        reader.beginArray();
        assertEquals(1, reader.nextInt());
        assertEquals(2, reader.nextInt());
        reader.endArray();
        reader.endObject();
    }

    @Test
    public void testSkipValue() throws IOException {
        reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        assertEquals("a", reader.nextName());
        reader.skipValue();
        assertEquals("b", reader.nextName());
        assertEquals(2, reader.nextInt());
        reader.endObject();
    }

    @Test
    public void testLenientSingleQuotedString() throws IOException {
        reader = new JsonReader(new StringReader("{'key':'value'}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("key", reader.nextName());
        assertEquals("value", reader.nextString());
        reader.endObject();
    }

    @Test
    public void testLenientUnquotedNames() throws IOException {
        reader = new JsonReader(new StringReader("{key:123}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("key", reader.nextName());
        assertEquals(123, reader.nextInt());
        reader.endObject();
    }

    @Test(expected = IOException.class)
    public void testNonLenientStrictMode() throws IOException {
        reader = new JsonReader(new StringReader("{x:1}"));
        reader.beginObject();
    }

    @Test
    public void testCloseAfterRead() throws IOException {
        reader = new JsonReader(new StringReader("\"done\""));
        assertEquals("done", reader.nextString());
        reader.close();
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekAfterClose() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.close();
        reader.peek();
    }

    @Test
    public void testPathTracking() throws IOException {
        reader = new JsonReader(new StringReader("{\"a\":[1]}"));
        assertEquals("$", reader.getPath());
        reader.beginObject();
        assertEquals("$.", reader.getPath());
        reader.nextName();
        assertEquals("$.a", reader.getPath());
        reader.beginArray();
        assertEquals("$.a[0]", reader.getPath());
        reader.nextInt();
        assertEquals("$.a[1]", reader.getPath());
        reader.endArray();
        reader.endObject();
    }

    @Test(expected = NumberFormatException.class)
    public void testIntOverflow() throws IOException {
        reader = new JsonReader(new StringReader("2147483648"));
        reader.nextInt();
    }

    @Test
    public void testLongOverflowToDouble() throws IOException {
        reader = new JsonReader(new StringReader("999999999999999999"));
        double d = reader.nextDouble();
        assertTrue(d > 0);
    }

    @Test
    public void testNegativeNumber() throws IOException {
        reader = new JsonReader(new StringReader("-42"));
        assertEquals(-42, reader.nextInt());
    }

    @Test(expected = MalformedJsonException.class)
    public void testInvalidToken() throws IOException {
        reader = new JsonReader(new StringReader("undefined"));
        reader.nextString();
    }

    @Test
    public void testSkipMultipleNested() throws IOException {
        reader = new JsonReader(new StringReader("[[1],{\"a\":2}]"));
        reader.beginArray();
        reader.skipValue();
        reader.skipValue();
        reader.endArray();
    }

    @Test
    public void testLenientComment() throws IOException {
        reader = new JsonReader(new StringReader("/* comment */ 42"));
        reader.setLenient(true);
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testLenientHashComment() throws IOException {
        reader = new JsonReader(new StringReader("# comment\n42"));
        reader.setLenient(true);
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testPeekReturnsCorrectToken() throws IOException {
        reader = new JsonReader(new StringReader("{\"k\":\"v\"}"));
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
        reader.beginObject();
        assertEquals(JsonToken.NAME, reader.peek());
        reader.nextName();
        assertEquals(JsonToken.STRING, reader.peek());
        reader.nextString();
        assertEquals(JsonToken.END_OBJECT, reader.peek());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }
}