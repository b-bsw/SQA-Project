package com.google.gson.stream;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
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
    public void testEmptyObject() throws IOException {
        writer.beginObject();
        writer.endObject();
        writer.close();
        Assert.assertEquals("{}", stringWriter.toString());
    }

    @Test
    public void testEmptyArray() throws IOException {
        writer.beginArray();
        writer.endArray();
        writer.close();
        Assert.assertEquals("[]", stringWriter.toString());
    }

    @Test
    public void testSimpleObject() throws IOException {
        writer.beginObject();
        writer.name("a").value(1);
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"a\":1}", stringWriter.toString());
    }

    @Test
    public void testNestedArrayWithInts() throws IOException {
        writer.beginArray();
        writer.value(1);
        writer.value(2);
        writer.value(3);
        writer.endArray();
        writer.close();
        Assert.assertEquals("[1,2,3]", stringWriter.toString());
    }

    @Test
    public void testStringEscaping() throws IOException {
        writer.beginObject();
        writer.name("msg").value("hello \"world\"\n\t");
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"msg\":\"hello \\\"world\\\"\\n\\t\"}", stringWriter.toString());
    }

    @Test
    public void testHtmlSafeEscaping() throws IOException {
        writer.setHtmlSafe(true);
        writer.beginObject();
        writer.name("html").value("<tag> & '=\"");
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"html\":\"\\u003ctag\\u003e \\u0026 \\u0027\\u003d\\\"\"}", stringWriter.toString());
    }

    @Test
    public void testSerializeNullsFalseSkipsNull() throws IOException {
        writer.setSerializeNulls(false);
        writer.beginObject();
        writer.name("a").nullValue();
        writer.name("b").value("keep");
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"b\":\"keep\"}", stringWriter.toString());
    }

    @Test
    public void testDeferredNameAndValue() throws IOException {
        writer.beginObject();
        writer.name("x").value(42);
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"x\":42}", stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testDuplicateNameWithoutValue() throws IOException {
        writer.beginObject();
        writer.name("a");
        writer.name("b");
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidNestingEndArrayInObject() throws IOException {
        writer.beginObject();
        writer.endArray();
    }

    @Test
    public void testLenientTopLevelValue() throws IOException {
        writer.setLenient(true);
        writer.value("top");
        writer.close();
        Assert.assertEquals("\"top\"", stringWriter.toString());
    }

    @Test(expected = IOException.class)
    public void testCloseIncompleteDocument() throws IOException {
        writer.beginArray();
        writer.close(); // closes underlying writer, but document incomplete
    }

    @Test(expected = IllegalStateException.class)
    public void testFlushAfterClose() throws IOException {
        writer.close();
        writer.flush();
    }

    @Test
    public void testValueNull() throws IOException {
        writer.beginObject();
        writer.name("n").value((String) null);
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"n\":null}", stringWriter.toString());
    }

    @Test
    public void testValueBoolean() throws IOException {
        writer.beginArray();
        writer.value(true);
        writer.value(false);
        writer.endArray();
        writer.close();
        Assert.assertEquals("[true,false]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueDoubleNonFiniteStrict() throws IOException {
        writer.beginArray();
        writer.value(Double.NaN);
    }

    @Test
    public void testValueDoubleNonFiniteLenient() throws IOException {
        writer.setLenient(true);
        writer.beginArray();
        writer.value(Double.NaN);
        writer.endArray();
        writer.close();
        Assert.assertEquals("[NaN]", stringWriter.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueNumberNonFiniteStrict() throws IOException {
        writer.beginArray();
        writer.value(Double.POSITIVE_INFINITY);
    }

    @Test
    public void testJsonValue() throws IOException {
        writer.beginObject();
        writer.name("raw").jsonValue("{\"inner\":true}");
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"raw\":{\"inner\":true}}", stringWriter.toString());
    }

    @Test
    public void testSetIndentCompact() throws IOException {
        writer.setIndent("");
        writer.beginObject();
        writer.name("k").value("v");
        writer.endObject();
        writer.close();
        Assert.assertEquals("{\"k\":\"v\"}", stringWriter.toString());
    }

    @Test
    public void testSetIndentPrettyPrint() throws IOException {
        writer.setIndent("  ");
        writer.beginObject();
        writer.name("k").value("v");
        writer.endObject();
        writer.close();
        String expected = "{\n  \"k\": \"v\"\n}";
        Assert.assertEquals(expected, stringWriter.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testNameAfterClose() throws IOException {
        writer.close();
        writer.name("x");
    }
}