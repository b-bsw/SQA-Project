package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class JsonReaderTest {

    private JsonReader reader(String json) {
        return new JsonReader(new StringReader(json));
    }

    @Test(expected = NullPointerException.class)
    public void testNullReader() {
        new JsonReader(null);
    }

    @Test
    public void testSetLenient() {
        JsonReader r = reader("{}");
        assertFalse(r.isLenient());
        r.setLenient(true);
        assertTrue(r.isLenient());
    }

    @Test(expected = EOFException.class)
    public void testEmptyDocument() throws IOException {
        reader("").peek();
    }

    @Test
    public void testEmptyArray() throws IOException {
        JsonReader r = reader("[]");
        r.beginArray();
        assertFalse(r.hasNext());
        assertEquals(JsonToken.END_ARRAY, r.peek());
        r.endArray();
        assertEquals(JsonToken.END_DOCUMENT, r.peek());
    }

    @Test
    public void testArrayValues() throws IOException {
        JsonReader r = reader("[1, \"hello\", true, null, 2.5, 10000000000]");
        r.beginArray();
        assertEquals(1, r.nextInt());
        assertEquals("hello", r.nextString());
        assertTrue(r.nextBoolean());
        r.nextNull();
        assertEquals(2.5, r.nextDouble(), 1e-9);
        assertEquals(10000000000L, r.nextLong());
        assertFalse(r.hasNext());
        r.endArray();
    }

    @Test
    public void testObject() throws IOException {
        JsonReader r = reader("{\"a\":1,\"b\":\"text\",\"c\":false}");
        r.beginObject();
        assertEquals("a", r.nextName());
        assertEquals(1, r.nextInt());
        assertEquals("b", r.nextName());
        assertEquals("text", r.nextString());
        assertEquals("c", r.nextName());
        assertFalse(r.nextBoolean());
        r.endObject();
        assertEquals(JsonToken.END_DOCUMENT, r.peek());
    }

    @Test
    public void testNestedStructures() throws IOException {
        JsonReader r = reader("[[1,2],{\"k\":[3,4]}]");
        r.beginArray();
        r.beginArray();
        assertEquals(1, r.nextInt());
        assertEquals(2, r.nextInt());
        r.endArray();
        r.beginObject();
        assertEquals("k", r.nextName());
        r.beginArray();
        assertEquals(3, r.nextInt());
        assertEquals(4, r.nextInt());
        r.endArray();
        r.endObject();
        r.endArray();
    }

    @Test
    public void testSkipValue() throws IOException {
        JsonReader r = reader("{\"a\":1,\"b\":[2,3],\"c\":4}");
        r.beginObject();
        assertEquals("a", r.nextName());
        r.skipValue();
        assertEquals("b", r.nextName());
        r.skipValue();
        assertEquals("c", r.nextName());
        assertEquals(4, r.nextInt());
        r.endObject();
    }

    @Test
    public void testPeek() throws IOException {
        JsonReader r = reader("[true]");
        assertEquals(JsonToken.BEGIN_ARRAY, r.peek());
        r.beginArray();
        assertEquals(JsonToken.BOOLEAN, r.peek());
        assertTrue(r.nextBoolean());
        assertEquals(JsonToken.END_ARRAY, r.peek());
        r.endArray();
        assertEquals(JsonToken.END_DOCUMENT, r.peek());
    }

    @Test
    public void testClose() throws IOException {
        JsonReader r = reader("[1]");
        r.close();
        try {
            r.beginArray();
            fail();
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArrayOnObject() throws IOException {
        reader("{}").beginArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayOnObject() throws IOException {
        reader("{}").endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testNextNameOnArray() throws IOException {
        JsonReader r = reader("[1]");
        r.beginArray();
        r.nextName();
    }

    @Test
    public void testLenientComments() throws IOException {
        JsonReader r = reader("/* comment */ [1]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(1, r.nextInt());
        r.endArray();
    }

    @Test(expected = MalformedJsonException.class)
    public void testStrictComments() throws IOException {
        reader("/* comment */ [1]").beginArray();
    }

    @Test(expected = MalformedJsonException.class)
    public void testStrictDoubleInfinity() throws IOException {
        JsonReader r = reader("[Infinity]");
        r.beginArray();
        r.nextDouble();
    }

    @Test
    public void testLenientDoubleInfinity() throws IOException {
        JsonReader r = reader("[Infinity]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(Double.POSITIVE_INFINITY, r.nextDouble(), 0.0);
        r.endArray();
    }

    @Test(expected = NumberFormatException.class)
    public void testNextIntWithDecimal() throws IOException {
        JsonReader r = reader("[1.5]");
        r.beginArray();
        r.nextInt();
    }

    @Test(expected = EOFException.class)
    public void testEOFInArray() throws IOException {
        JsonReader r = reader("[1,");
        r.beginArray();
        r.nextInt();
        r.hasNext();
    }

    @Test
    public void testGetPath() throws IOException {
        JsonReader r = reader("{\"a\":[1,2]}");
        assertEquals("$", r.getPath());
        r.beginObject();
        assertEquals("$.", r.getPath());
        r.nextName();
        assertEquals("$.a", r.getPath());
        r.beginArray();
        assertEquals("$.a[0]", r.getPath());
        r.nextInt();
        assertEquals("$.a[1]", r.getPath());
        r.nextInt();
        r.endArray();
        r.endObject();
    }

    @Test
    public void testSingleQuotedName() throws IOException {
        JsonReader r = reader("{'key':1}");
        r.setLenient(true);
        r.beginObject();
        assertEquals("key", r.nextName());
        assertEquals(1, r.nextInt());
        r.endObject();
    }

    @Test
    public void testUnquotedName() throws IOException {
        JsonReader r = reader("{key:1}");
        r.setLenient(true);
        r.beginObject();
        assertEquals("key", r.nextName());
        assertEquals(1, r.nextInt());
        r.endObject();
    }

    @Test
    public void testEscapeSequences() throws IOException {
        JsonReader r = reader("[\"hello\\nworld\"]");
        r.beginArray();
        assertEquals("hello\nworld", r.nextString());
        r.endArray();
    }

    @Test
    public void testLongBoundary() throws IOException {
        JsonReader r = reader("[9223372036854775807, -9223372036854775808]");
        r.beginArray();
        assertEquals(Long.MAX_VALUE, r.nextLong());
        assertEquals(Long.MIN_VALUE, r.nextLong());
        r.endArray();
    }

    @Test(expected = NumberFormatException.class)
    public void testNextIntOverflow() throws IOException {
        JsonReader r = reader("[2147483648]");
        r.beginArray();
        r.nextInt();
    }

    @Test(expected = NumberFormatException.class)
    public void testNextLongWithStringLossy() throws IOException {
        JsonReader r = reader("[\"1.5\"]");
        r.beginArray();
        r.nextLong();
    }

    @Test(expected = IllegalStateException.class)
    public void testNextNullOnNonNull() throws IOException {
        JsonReader r = reader("[1]");
        r.beginArray();
        r.nextNull();
    }

    @Test
    public void testHasNextMultipleCalls() throws IOException {
        JsonReader r = reader("[1,2]");
        r.beginArray();
        assertTrue(r.hasNext());
        r.nextInt();
        assertTrue(r.hasNext());
        r.nextInt();
        assertFalse(r.hasNext());
        r.endArray();
    }

    @Test
    public void testNextDoubleFromString() throws IOException {
        JsonReader r = reader("[\"3.14\"]");
        r.beginArray();
        assertEquals(3.14, r.nextDouble(), 1e-9);
        r.endArray();
    }

    @Test
    public void testUnquotedValueLenient() throws IOException {
        JsonReader r = reader("[hello]");
        r.setLenient(true);
        r.beginArray();
        assertEquals("hello", r.nextString());
        r.endArray();
    }

    @Test(expected = MalformedJsonException.class)
    public void testSyntaxErrorStrict() throws IOException {
        JsonReader r = reader("{1}");
        r.beginObject();
        r.nextName();
    }

    @Test(expected = IllegalStateException.class)
    public void testOperationsAfterClose() throws IOException {
        JsonReader r = reader("[]");
        r.close();
        r.beginArray();
    }

    @Test
    public void testNonExecutePrefixLenient() throws IOException {
        JsonReader r = reader(")]}'\n [1]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(1, r.nextInt());
        r.endArray();
    }

    @Test(expected = MalformedJsonException.class)
    public void testNonExecutePrefixStrict() throws IOException {
        reader(")]}'\n [1]").beginArray();
    }

    @Test
    public void testLenientHashComment() throws IOException {
        JsonReader r = reader("# comment\n[1]");
        r.setLenient(true);
        r.beginArray();
        assertEquals(1, r.nextInt());
        r.endArray();
    }

    @Test
    public void testUnicodeEscape() throws IOException {
        JsonReader r = reader("[\"\\u0041\"]");
        r.beginArray();
        assertEquals("A", r.nextString());
        r.endArray();
    }
}