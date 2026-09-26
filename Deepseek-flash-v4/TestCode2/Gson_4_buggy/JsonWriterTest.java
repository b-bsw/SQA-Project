package com.google.gson.stream;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;

public class JsonWriterTest {

    private StringWriter stringWriter;
    private JsonWriter writer;

    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        writer = new JsonWriter(stringWriter);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullWriter() {
        new JsonWriter(null);
    }

    @Test
    public void testLenientDefaultAndSetter() {
        assertFalse(writer.isLenient());
        writer.setLenient(true);
        assertTrue(writer.isLenient());
    }

    @Test
    public void testHtmlSafeDefaultAndSetter() {
        assertFalse(writer.isHtmlSafe());
        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
    }

    @Test
    public void testSerializeNullsDefaultAndSetter() {
        assertTrue(writer.getSerializeNulls());
        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
    }

    @Test
    public void testSetIndentEmptyMakesCompact() throws IOException {
        writer.setIndent("");
        writer.beginObject();
        writer.name("a").value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":1}", stringWriter.toString());
    }

    @Test
    public void testSetIndentNonEmptyPrettyPrint() throws IOException {
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("a").value(1);
        writer.endObject();
        writer.close();
        assertEquals("{\n  \"a\": 1\n}", stringWriter.toString());
    }

    @Test
    public void testEmptyArray() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testEmptyObject() throws IOException {
        writer.beginObject();
        writer.endObject();
        writer.close();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testArrayWithValues() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        writer.close();
        assertEquals("[1,2,3]", stringWriter.toString());
    }

    @Test
    public void testObjectWithValues() throws IOException {
        writer.beginObject();
        writer.name("name").value("Alice");
        writer.name("age").value(30);
        writer.endObject();
        writer.close();
        assertEquals("{\"name\":\"Alice\",\"age\":30}", stringWriter.toString());
    }

    @Test
    public void testNestedArrayInObject() throws IOException {
        writer.beginObject();
        writer.name("items");
        writer.beginArray();
        writer.value("a");
        writer.value("b");
        writer.endArray();
        writer.endObject();
        writer.close();
        assertEquals("{\"items\":[\"a\",\"b\"]}", stringWriter.toString());
    }

    @Test
    public void testNestedObjectInArray() throws IOException {
        writer.beginArray();
        writer.beginObject();
        writer.name("x").value(1);
        writer.endObject();
        writer.endArray();
        writer.close();
        assertEquals("[{\"x\":1}]", stringWriter.toString());
    }

    @Test
    public void testNullStringValue() throws IOException {
        writer.beginObject();
        writer.name("a").value((String) null);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test
    public void testExplicitNullValue() throws IOException {
        writer.beginObject();
        writer.name("a").nullValue();
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test
    public void testSerializeNullsFalseSkipsNull() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("a").nullValue();
        writer.endObject();
        writer.close();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testJsonValueRaw() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.jsonValue("{\"b\":1}");
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":{\"b\":1}}", stringWriter.toString());
    }

    @Test
    public void testBooleanValues() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.value(false);
        writer.endArray();
        writer.close();
        assertEquals("[true,false]", stringWriter.toString());
    }

    @Test
    public void testDoubleValue() throws IOException {
        writer.beginArray();
        writer.value(1.5);
        writer.value(-2.25);
        writer.endArray();
        writer.close();
        assertEquals("[1.5,-2.25]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleValueNaN() throws IOException {
        writer.beginArray();
        writer.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleValueInfinity() throws IOException {
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testLongValue() throws IOException {
        writer.beginArray();
        writer.value(1234567890L);
        writer.endArray();
        writer.close();
        assertEquals("[1234567890]", stringWriter.toString());
    }

    @Test
    public void testNumberValueNull() throws IOException {
        writer.beginObject();
        writer.name("a").value((Number) null);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test
    public void testNumberValue() throws IOException {
        writer.beginArray();
        writer.value(10);
        writer.endArray();
        writer.close();
        assertEquals("[10]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberValueNonFiniteStrict() throws IOException {
        writer.beginArray();
        writer.value(new Double(Double.NaN));
    }

    @Test
    public void testNumberValueNonFiniteLenient() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(new Double(Double.NaN));
        writer.endArray();
        writer.close();
        assertEquals("[NaN]", stringWriter.toString());
    }

    @Test
    public void testStringEscaping() throws IOException {
        writer.beginArray();
        writer.value("hello\nworld");
        writer.value("quote\"backslash\\");
        writer.value("\t\b\f\r");
        writer.endArray();
        writer.close();
        assertEquals("[\"hello\\nworld\",\"quote\\\"backslash\\\\\",\"\\t\\b\\f\\r\"]", stringWriter.toString());
    }

    @Test
    public void testControlCharactersEscape() throws IOException {
        writer.beginArray();
        writer.value("\u0000\u0001");
        writer.endArray();
        writer.close();
        assertEquals("[\"\\u0000\\u0001\"]", stringWriter.toString());
    }

    @Test
    public void testUnicodeLineSeparators() throws IOException {
        writer.beginArray();
        writer.value("\u2028\u2029");
        writer.endArray();
        writer.close();
        assertEquals("[\"\\u2028\\u2029\"]", stringWriter.toString());
    }

    @Test
    public void testHtmlSafeEscaping() throws IOException {
        writer.setHtmlSafe(true);
        writer.beginArray();
        writer.value("<>&='");
        writer.endArray();
        writer.close();
        assertEquals("[\"\\u003c\\u003e\\u0026\\u003d\\u0027\"]", stringWriter.toString());
    }

    @Test
    public void testHtmlSafeDefaultNoEscaping() throws IOException {
        writer.beginArray();
        writer.value("<>&='");
        writer.endArray();
        writer.close();
        assertEquals("[\"<>&='\"]", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testDanglingName() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.name("b");
    }

    @Test(expected = IllegalStateException.class)
    public void testDanglingNameAtClose() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.endObject();
    }

    @Test(expected = IllegalStateException.class)
    public void testNestingProblem() throws IOException {
        writer.beginObject();
        writer.endArray();
    }

    @Test(expected = IllegalStateException.class)
    public void testMultipleTopLevelStrict() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
    }

    @Test
    public void testMultipleTopLevelLenient() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.endArray();
        writer.beginArray();
        writer.endArray();
        writer.close();
        assertEquals("[][]", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testTopLevelScalarStrict() throws IOException {
        writer.value("hello");
    }

    @Test
    public void testTopLevelScalarLenient() throws IOException {
        writer.setLenient(true);
        writer.value("hello");
        writer.close();
        assertEquals("\"hello\"", stringWriter.toString());
    }

    @Test
    public void testFlush() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.flush();
    }

    @Test(expected = IllegalStateException.class)
    public void testFlushClosed() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.flush();
    }

    @Test(expected = IOException.class)
    public void testCloseIncompleteDocument() throws IOException {
        writer.beginObject();
        writer.close();
    }

    @Test
    public void testCloseCompleteDocument() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
    }

    @Test
    public void testNameThenBeginObject() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.beginObject();
        writer.name("b").value(1);
        writer.endObject();
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":{\"b\":1}}", stringWriter.toString());
    }

    @Test
    public void testNameThenBeginArray() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.beginArray();
        writer.value(1);
        writer.endArray();
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":[1]}", stringWriter.toString());
    }

    @Test
    public void testNullValueSkipWhenSerializeNullsFalse() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("a");
        writer.nullValue();
        writer.endObject();
        writer.close();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testNullValueWithSerializeNullsTrue() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.nullValue();
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test
    public void testArrayPrettyPrint() throws IOException {
        writer.setIndent("  ");
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.endArray();
        writer.close();
        assertEquals("[\n  1,\n  2\n]", stringWriter.toString());
    }

    @Test
    public void testObjectPrettyNested() throws IOException {
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("a").value(1);
        writer.name("b");
        writer.beginObject();
        writer.name("c").value(2);
        writer.endObject();
        writer.endObject();
        writer.close();
        assertEquals("{\n  \"a\": 1,\n  \"b\": {\n    \"c\": 2\n  }\n}", stringWriter.toString());
    }

    @Test
    public void testDeepNesting() throws IOException {
        for (int i = 0; i < 100; i++) {
            writer.beginArray();
        }
        for (int i = 0; i < 100; i++) {
            writer.endArray();
        }
        writer.close();
    }

    @Test(expected = NullPointerException.class)
    public void testNameNull() throws IOException {
        writer.name(null);
    }

    @Test
    public void testJsonValueNull() throws IOException {
        writer.beginObject();
        writer.name("a").jsonValue(null);
        writer.endObject();
        writer.close();
        assertEquals("{\"a\":null}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testOperationAfterClose() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.value(1);
    }

    @Test(expected = IllegalStateException.class)
    public void testBeginArrayAfterClose() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
        writer.beginArray();
    }
}