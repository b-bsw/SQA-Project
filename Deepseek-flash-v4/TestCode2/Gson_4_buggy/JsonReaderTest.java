package com.google.gson.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;

public class JsonReaderTest {
    private JsonReader reader;

    @After
    public void tearDown() throws Exception {
        if (reader != null) {
            reader.close();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNull() {
        new JsonReader(null);
    }

    @Test
    public void testLenientDefaultFalse() {
        reader = new JsonReader(new StringReader(""));
        assertFalse(reader.isLenient());
    }

    @Test
    public void testSetLenientTrue() {
        reader = new JsonReader(new StringReader(""));
        reader.setLenient(true);
        assertTrue(reader.isLenient());
    }

    @Test
    public void testBeginEndArray() throws IOException {
        reader = new JsonReader(new StringReader("[1]"));
        reader.beginArray();
        assertEquals(JsonToken.NUMBER, reader.peek());
        reader.nextInt();
        reader.endArray();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArrayNotArray() throws IOException {
        reader = new JsonReader(new StringReader("{}"));
        reader.beginArray();
    }

    @Test
    public void testBeginEndObject() throws IOException {
        reader = new JsonReader(new StringReader("{\"a\":1}"));
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1, reader.nextInt());
        reader.endObject();
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginObjectNotObject() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.beginObject();
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
    public void testHasNextEmptyArray() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.beginArray();
        assertFalse(reader.hasNext());
        reader.endArray();
    }

    @Test
    public void testPeekTypes() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        assertEquals(JsonToken.BOOLEAN, reader.peek());
        reader.nextBoolean();

        reader = new JsonReader(new StringReader("null"));
        assertEquals(JsonToken.NULL, reader.peek());
        reader.nextNull();

        reader = new JsonReader(new StringReader("\"hello\""));
        assertEquals(JsonToken.STRING, reader.peek());
        reader.nextString();

        reader = new JsonReader(new StringReader("42"));
        assertEquals(JsonToken.NUMBER, reader.peek());
        reader.nextInt();

        reader = new JsonReader(new StringReader("[]"));
        assertEquals(JsonToken.BEGIN_ARRAY, reader.peek());

        reader = new JsonReader(new StringReader("{}"));
        assertEquals(JsonToken.BEGIN_OBJECT, reader.peek());
    }

    @Test
    public void testMultiplePeek() throws IOException {
        reader = new JsonReader(new StringReader("42"));
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(JsonToken.NUMBER, reader.peek());
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testNextName() throws IOException {
        reader = new JsonReader(new StringReader("{\"key\":1}"));
        reader.beginObject();
        assertEquals("key", reader.nextName());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextNameNotName() throws IOException {
        reader = new JsonReader(new StringReader("[1]"));
        reader.beginArray();
        reader.nextName();
    }

    @Test
    public void testNextString() throws IOException {
        reader = new JsonReader(new StringReader("\"hello\""));
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNextStringNumber() throws IOException {
        reader = new JsonReader(new StringReader("42"));
        assertEquals("42", reader.nextString());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextStringBoolean() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        reader.nextString();
    }

    @Test
    public void testNextStringEscaped() throws IOException {
        reader = new JsonReader(new StringReader("\"hello\\nworld\""));
        assertEquals("hello\nworld", reader.nextString());
    }

    @Test
    public void testNextBooleanTrue() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        assertTrue(reader.nextBoolean());
    }

    @Test
    public void testNextBooleanFalse() throws IOException {
        reader = new JsonReader(new StringReader("false"));
        assertFalse(reader.nextBoolean());
    }

    @Test(expected = IllegalStateException.class)
    public void testNextBooleanNotBoolean() throws IOException {
        reader = new JsonReader(new StringReader("1"));
        reader.nextBoolean();
    }

    @Test
    public void testNextNull() throws IOException {
        reader = new JsonReader(new StringReader("null"));
        reader.nextNull();
    }

    @Test(expected = IllegalStateException.class)
    public void testNextNullNotNull() throws IOException {
        reader = new JsonReader(new StringReader("true"));
        reader.nextNull();
    }

    @Test
    public void testNextDoubleInteger() throws IOException {
        reader = new JsonReader(new StringReader("42"));
        assertEquals(42.0, reader.nextDouble(), 0.0);
    }

    @Test
    public void testNextDoubleFraction() throws IOException {
        reader = new JsonReader(new StringReader("3.14"));
        assertEquals(3.14, reader.nextDouble(), 0.001);
    }

    @Test(expected = MalformedJsonException.class)
    public void testNextDoubleNaNStrict() throws IOException {
        reader = new JsonReader(new StringReader("NaN"));
        reader.nextDouble();
    }

    @Test
    public void testNextDoubleScientific() throws IOException {
        reader = new JsonReader(new StringReader("1e10"));
        assertEquals(1e10, reader.nextDouble(), 0.0);
    }

    @Test
    public void testNextLong() throws IOException {
        reader = new JsonReader(new StringReader("123"));
        assertEquals(123L, reader.nextLong());
    }

    @Test
    public void testNextLongNumber() throws IOException {
        reader = new JsonReader(new StringReader("123.0"));
        assertEquals(123L, reader.nextLong());
    }

    @Test(expected = NumberFormatException.class)
    public void testNextLongFractional() throws IOException {
        reader = new JsonReader(new StringReader("123.5"));
        reader.nextLong();
    }

    @Test
    public void testNextLongMinValue() throws IOException {
        reader = new JsonReader(new StringReader("-9223372036854775808"));
        assertEquals(Long.MIN_VALUE, reader.nextLong());
    }

    @Test
    public void testNextInt() throws IOException {
        reader = new JsonReader(new StringReader("42"));
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testNextIntZero() throws IOException {
        reader = new JsonReader(new StringReader("0"));
        assertEquals(0, reader.nextInt());
    }

    @Test
    public void testNextIntNegative() throws IOException {
        reader = new JsonReader(new StringReader("-42"));
        assertEquals(-42, reader.nextInt());
    }

    @Test(expected = NumberFormatException.class)
    public void testNextIntOverflow() throws IOException {
        reader = new JsonReader(new StringReader("2147483648"));
        reader.nextInt();
    }

    @Test
    public void testSkipValueObject() throws IOException {
        reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.skipValue();
        assertEquals("b", reader.nextName());
        reader.nextInt();
        reader.endObject();
    }

    @Test
    public void testSkipValueNested() throws IOException {
        reader = new JsonReader(new StringReader("[[1,2],3]"));
        reader.beginArray();
        reader.skipValue();
        assertEquals(3, reader.nextInt());
        reader.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testClosePreventsFurtherRead() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.close();
        reader.peek();
    }

    @Test(expected = IllegalStateException.class)
    public void testClosePreventsBeginArray() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.close();
        reader.beginArray();
    }

    @Test
    public void testGetPath() throws IOException {
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
        assertEquals("$", reader.getPath());
    }

    @Test(expected = MalformedJsonException.class)
    public void testStrictModeSingleQuote() throws IOException {
        reader = new JsonReader(new StringReader("{'a':1}"));
        reader.beginObject();
    }

    @Test
    public void testLenientModeSingleQuote() throws IOException {
        reader = new JsonReader(new StringReader("{'a':1}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("a", reader.nextName());
        assertEquals(1, reader.nextInt());
        reader.endObject();
    }

    @Test
    public void testLenientUnquotedName() throws IOException {
        reader = new JsonReader(new StringReader("{hello:1}"));
        reader.setLenient(true);
        reader.beginObject();
        assertEquals("hello", reader.nextName());
        reader.nextInt();
        reader.endObject();
    }

    @Test
    public void testLenientUnquotedValue() throws IOException {
        reader = new JsonReader(new StringReader("hello"));
        reader.setLenient(true);
        assertEquals("hello", reader.nextString());
    }

    @Test
    public void testNonExecutePrefix() throws IOException {
        reader = new JsonReader(new StringReader(")]}'\n[]"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
    }

    @Test
    public void testLenientBlockComment() throws IOException {
        reader = new JsonReader(new StringReader("/* comment */ []"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
    }

    @Test
    public void testLenientLineComment() throws IOException {
        reader = new JsonReader(new StringReader("// line comment\n[]"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
    }

    @Test(expected = EOFException.class)
    public void testEmptyInput() throws IOException {
        reader = new JsonReader(new StringReader(""));
        reader.peek();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndArrayNotArray() throws IOException {
        reader = new JsonReader(new StringReader("{}"));
        reader.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testEndObjectNotObject() throws IOException {
        reader = new JsonReader(new StringReader("[]"));
        reader.endObject();
    }

    @Test
    public void testNextIntQuotedString() throws IOException {
        reader = new JsonReader(new StringReader("\"42\""));
        assertEquals(42, reader.nextInt());
    }

    @Test
    public void testNextLongQuotedString() throws IOException {
        reader = new JsonReader(new StringReader("\"123\""));
        assertEquals(123L, reader.nextLong());
    }

    @Test
    public void testNextDoubleQuotedString() throws IOException {
        reader = new JsonReader(new StringReader("\"3.14\""));
        assertEquals(3.14, reader.nextDouble(), 0.001);
    }

    @Test
    public void testNestedStructures() throws IOException {
        reader = new JsonReader(new StringReader("{\"a\":{\"b\":[]}}"));
        reader.beginObject();
        assertEquals("a", reader.nextName());
        reader.beginObject();
        assertEquals("b", reader.nextName());
        reader.beginArray();
        reader.endArray();
        reader.endObject();
        reader.endObject();
    }

    @Test
    public void testEOFAfterAllTokens() throws IOException {
        reader = new JsonReader(new StringReader("42"));
        assertEquals(42, reader.nextInt());
        assertEquals(JsonToken.END_DOCUMENT, reader.peek());
    }
}