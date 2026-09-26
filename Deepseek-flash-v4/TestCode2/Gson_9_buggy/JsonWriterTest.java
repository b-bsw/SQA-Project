package com.google.gson.stream;

import java.io.IOException;
import java.io.StringWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JsonWriterTest {
    private StringWriter stringWriter;
    private JsonWriter writer;

    @Before
    public void setUp() throws Exception {
        stringWriter = new StringWriter();
        writer = new JsonWriter(stringWriter);
    }

    @After
    public void tearDown() throws Exception {
        writer.close();
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullWriter() {
        new JsonWriter(null);
    }

    @Test
    public void testEmptyObject() throws IOException {
        writer.beginObject();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testEmptyArray() throws IOException {
        writer.beginArray();
        writer.endArray();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testSimpleObject() throws IOException {
        writer.beginObject();
        writer.name("a").value(1);
        writer.name("b").value("hello");
        writer.endObject();
        assertEquals("{\"a\":1,\"b\":\"hello\"}", stringWriter.toString());
    }

    @Test
    public void testSimpleArray() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        assertEquals("[1,2,3]", stringWriter.toString());
    }

    @Test
    public void testNestedObjectAndArray() throws IOException {
        writer.beginObject();
        writer.name("data");
        writer.beginArray();
        writer.value("x");
        writer.value("y");
        writer.endArray();
        writer.endObject();
        assertEquals("{\"data\":[\"x\",\"y\"]}", stringWriter.toString());
    }

    @Test
    public void testNullValue() throws IOException {
        writer.beginObject();
        writer.name("n").nullValue();
        writer.endObject();
        assertEquals("{\"n\":null}", stringWriter.toString());
    }

    @Test
    public void testSerializeNullsFalseSkipsNull() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("n").nullValue();
        writer.endObject();
        assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testValueStringNullBecomesNullLiteral() throws IOException {
        writer.beginObject();
        writer.name("x").value((String) null);
        writer.endObject();
        assertEquals("{\"x\":null}", stringWriter.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testNameNullThrows() throws IOException {
        writer.beginObject();
        writer.name(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testNameAfterDeferredNameThrows() throws IOException {
        writer.beginObject();
        writer.name("a").name("b");
    }

    @Test
    public void testBooleanValue() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.value(false);
        writer.endArray();
        assertEquals("[true,false]", stringWriter.toString());
    }

    @Test
    public void testDoubleValue() throws IOException {
        writer.beginArray();
        writer.value(3.14);
        writer.endArray();
        assertTrue(stringWriter.toString().contains("3.14"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleNaNThrows() throws IOException {
        writer.value(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoubleInfinityThrows() throws IOException {
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testLongValue() throws IOException {
        writer.beginArray();
        writer.value(1234567890123L);
        writer.endArray();
        assertEquals("[1234567890123]", stringWriter.toString());
    }

    @Test
    public void testNumberValue() throws IOException {
        writer.beginObject();
        writer.name("val").value(42);
        writer.endObject();
        assertEquals("{\"val\":42}", stringWriter.toString());
    }

    @Test
    public void testNumberNullBecomesNullLiteral() throws IOException {
        writer.beginObject();
        writer.name("n").value((Number) null);
        writer.endObject();
        assertEquals("{\"n\":null}", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberNonFiniteNonLenientThrows() throws IOException {
        writer.value(Double.NaN);
    }

    @Test
    public void testNumberNonFiniteLenientAllows() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.NaN);
        writer.endArray();
        assertEquals("[NaN]", stringWriter.toString());
    }

    @Test
    public void testJsonValue() throws IOException {
        writer.beginObject();
        writer.name("raw").jsonValue("{\"a\":1}");
        writer.endObject();
        assertEquals("{\"raw\":{\"a\":1}}", stringWriter.toString());
    }

    @Test
    public void testJsonValueNullBecomesNullLiteral() throws IOException {
        writer.beginObject();
        writer.name("x").jsonValue(null);
        writer.endObject();
        assertEquals("{\"x\":null}", stringWriter.toString());
    }

    @Test
    public void testFlush() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.flush();
        assertTrue(stringWriter.toString().startsWith("[1"));
    }

    @Test(expected = IllegalStateException.class)
    public void testFlushAfterClose() throws IOException {
        writer.close();
        writer.flush();
    }

    @Test(expected = IOException.class)
    public void testCloseIncompleteDocument() throws IOException {
        writer.beginArray();
        writer.close();
    }

    @Test
    public void testSetIndentWithEmptyString() throws IOException {
        writer.setIndent("");
        writer.beginObject();
        writer.name("k").value("v");
        writer.endObject();
        assertEquals("{\"k\":\"v\"}", stringWriter.toString());
    }

    @Test
    public void testSetIndentWithNonEmptyString() throws IOException {
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("k").value("v");
        writer.endObject();
        String expected = "{\n  \"k\": \"v\"\n}";
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    public void testHtmlSafeEscapesAngleBrackets() throws IOException {
        writer.setHtmlSafe(true);
        writer.value("<>&'=\"");
        assertEquals("\"\\u003c\\u003e\\u0026\\u0027\\u003d\\\"\"", stringWriter.toString());
    }

    @Test
    public void testStringEscapesSpecialCharacters() throws IOException {
        writer.value("\"\\\t\b\n\r\f");
        assertEquals("\"\\\"\\\\\\t\\b\\n\\r\\f\"", stringWriter.toString());
    }

    @Test
    public void testStringEscapes2028And2029() throws IOException {
        writer.value("\u2028\u2029");
        assertEquals("\"\\u2028\\u2029\"", stringWriter.toString());
    }

    @Test
    public void testMultipleTopLevelValuesLenient() throws IOException {
        writer.setLenient(true);
        writer.beginObject();
        writer.endObject();
        writer.beginArray();
        writer.endArray();
        assertEquals("{}[]", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testMultipleTopLevelValuesStrictThrows() throws IOException {
        writer.beginObject();
        writer.endObject();
        writer.beginArray();
    }

    @Test
    public void testDanglingNameInCloseThrows() throws IOException {
        writer.beginObject();
        writer.name("x");
        try {
            writer.endObject();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Dangling name"));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testNameWhenClosedThrows() throws IOException {
        writer.close();
        writer.name("x");
    }

    @Test(expected = IllegalStateException.class)
    public void testValueAfterClosedThrows() throws IOException {
        writer.close();
        writer.value("x");
    }

    @Test
    public void testNestingProblemOnEndArray() throws IOException {
        writer.beginObject();
        try {
            writer.endArray();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Nesting problem"));
        }
    }

    @Test
    public void testNonEmptyArrayNewline() throws IOException {
        writer.setIndent(" ");
        writer.beginArray();
        writer.value(1);
        writer.endArray();
        assertTrue(stringWriter.toString().contains("\n"));
    }

    @Test
    public void testEmptyArrayNoNewline() throws IOException {
        writer.setIndent(" ");
        writer.beginArray();
        writer.endArray();
        assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testBeforeNameInNonObjectThrows() throws IOException {
        writer.beginArray();
        try {
            writer.name("x");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Nesting problem"));
        }
    }

    @Test
    public void testDeferredNameWrittenOnce() throws IOException {
        writer.beginObject();
        writer.name("a").name("b").value(1);
        // Second name overwrites, only "b" written
        assertEquals("{\"b\":1}", stringWriter.toString());
    }

    @Test
    public void testSerializeNullsDefaultTrue() {
        assertTrue(writer.getSerializeNulls());
    }

    @Test
    public void testIsLenientDefaultFalse() {
        assertFalse(writer.isLenient());
    }

    @Test
    public void testIsHtmlSafeDefaultFalse() {
        assertFalse(writer.isHtmlSafe());
    }

    @Test
    public void testSetterGetterRoundtrip() {
        writer.setLenient(true);
        assertTrue(writer.isLenient());
        writer.setLenient(false);
        assertFalse(writer.isLenient());

        writer.setHtmlSafe(true);
        assertTrue(writer.isHtmlSafe());
        writer.setHtmlSafe(false);
        assertFalse(writer.isHtmlSafe());

        writer.setSerializeNulls(false);
        assertFalse(writer.getSerializeNulls());
        writer.setSerializeNulls(true);
        assertTrue(writer.getSerializeNulls());
    }
}