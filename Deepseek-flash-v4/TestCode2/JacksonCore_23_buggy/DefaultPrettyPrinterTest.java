package com.fasterxml.jackson.core.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class DefaultPrettyPrinterTest {

    private DefaultPrettyPrinter printer;
    private TestJsonGenerator generator;

    @Before
    public void setUp() throws Exception {
        printer = new DefaultPrettyPrinter();
        generator = new TestJsonGenerator();
    }

    @After
    public void tearDown() throws Exception {
        generator = null;
        printer = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(printer);
        assertTrue(printer._arrayIndenter instanceof DefaultPrettyPrinter.FixedSpaceIndenter);
        assertTrue(printer._objectIndenter instanceof DefaultIndenter);
        assertTrue(printer._spacesInObjectEntries);
        assertNotNull(printer._separators);
        assertEquals(" ", printer._rootSeparator.getValue());
    }

    @Test
    public void testConstructorWithNullStringRootSeparator() {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter((String) null);
        assertNull(p._rootSeparator);
    }

    @Test
    public void testConstructorWithNonNullStringRootSeparator() {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter("---");
        assertNotNull(p._rootSeparator);
        assertEquals("---", p._rootSeparator.getValue());
    }

    @Test
    public void testConstructorWithNullSerializableRootSeparator() {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter((SerializableString) null);
        assertNull(p._rootSeparator);
    }

    @Test
    public void testCopyConstructor() {
        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(printer);
        assertNotNull(copy);
        assertTrue(copy._spacesInObjectEntries);
        assertEquals(" ", copy._rootSeparator.getValue());
    }

    @Test
    public void testCopyConstructorWithDifferentRootSeparator() {
        SerializedString sep = new SerializedString("X");
        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(printer, sep);
        assertEquals("X", copy._rootSeparator.getValue());
    }

    @Test
    public void testWithRootSeparatorSameInstance() {
        DefaultPrettyPrinter result = printer.withRootSeparator(printer._rootSeparator);
        assertSame(printer, result);
    }

    @Test
    public void testWithRootSeparatorDifferentInstance() {
        SerializedString newSep = new SerializedString(">>");
        DefaultPrettyPrinter result = printer.withRootSeparator(newSep);
        assertNotSame(printer, result);
        assertEquals(">>", result._rootSeparator.getValue());
    }

    @Test
    public void testWithRootSeparatorNull() {
        DefaultPrettyPrinter result = printer.withRootSeparator((SerializableString) null);
        assertNotSame(printer, result);
        assertNull(result._rootSeparator);
    }

    @Test
    public void testWithRootSeparatorStringNull() {
        DefaultPrettyPrinter result = printer.withRootSeparator((String) null);
        assertNull(result._rootSeparator);
    }

    @Test
    public void testIndentArraysWithNull() {
        printer.indentArraysWith(null);
        assertTrue(printer._arrayIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testIndentArraysWithNonNull() {
        DefaultPrettyPrinter.NopIndenter ind = new DefaultPrettyPrinter.NopIndenter();
        printer.indentArraysWith(ind);
        assertSame(ind, printer._arrayIndenter);
    }

    @Test
    public void testIndentObjectsWithNull() {
        printer.indentObjectsWith(null);
        assertTrue(printer._objectIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testIndentObjectsWithNonNull() {
        DefaultPrettyPrinter.NopIndenter ind = new DefaultPrettyPrinter.NopIndenter();
        printer.indentObjectsWith(ind);
        assertSame(ind, printer._objectIndenter);
    }

    @Test
    public void testWithArrayIndenterSameInstance() {
        DefaultPrettyPrinter result = printer.withArrayIndenter(printer._arrayIndenter);
        assertSame(printer, result);
    }

    @Test
    public void testWithArrayIndenterDifferentInstance() {
        DefaultPrettyPrinter.NopIndenter ind = new DefaultPrettyPrinter.NopIndenter();
        DefaultPrettyPrinter result = printer.withArrayIndenter(ind);
        assertNotSame(printer, result);
        assertSame(ind, result._arrayIndenter);
    }

    @Test
    public void testWithArrayIndenterNull() {
        DefaultPrettyPrinter result = printer.withArrayIndenter(null);
        assertTrue(result._arrayIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testWithObjectIndenterSameInstance() {
        DefaultPrettyPrinter result = printer.withObjectIndenter(printer._objectIndenter);
        assertSame(printer, result);
    }

    @Test
    public void testWithObjectIndenterDifferentInstance() {
        DefaultPrettyPrinter.NopIndenter ind = new DefaultPrettyPrinter.NopIndenter();
        DefaultPrettyPrinter result = printer.withObjectIndenter(ind);
        assertNotSame(printer, result);
        assertSame(ind, result._objectIndenter);
    }

    @Test
    public void testWithObjectIndenterNull() {
        DefaultPrettyPrinter result = printer.withObjectIndenter(null);
        assertTrue(result._objectIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testWithSpacesInObjectEntriesAlreadyTrue() {
        DefaultPrettyPrinter result = printer.withSpacesInObjectEntries();
        assertSame(printer, result);
    }

    @Test
    public void testWithoutSpacesInObjectEntriesAlreadyFalse() {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter();
        DefaultPrettyPrinter noSpaces = p.withoutSpacesInObjectEntries();
        assertFalse(noSpaces._spacesInObjectEntries);
        DefaultPrettyPrinter result = noSpaces.withoutSpacesInObjectEntries();
        assertSame(noSpaces, result);
    }

    @Test
    public void testWithSpacesInObjectEntriesFromFalse() {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter();
        DefaultPrettyPrinter noSpaces = p.withoutSpacesInObjectEntries();
        DefaultPrettyPrinter result = noSpaces.withSpacesInObjectEntries();
        assertTrue(result._spacesInObjectEntries);
        assertNotSame(noSpaces, result);
    }

    @Test
    public void testWithoutSpacesInObjectEntriesFromTrue() {
        DefaultPrettyPrinter result = printer.withoutSpacesInObjectEntries();
        assertFalse(result._spacesInObjectEntries);
        assertNotSame(printer, result);
    }

    @Test
    public void testWithSeparators() {
        Separators customSep = Separators.createDefaultInstance();
        DefaultPrettyPrinter result = printer.withSeparators(customSep);
        assertSame(customSep, result._separators);
        assertNotNull(result._objectFieldValueSeparatorWithSpaces);
    }

    @Test
    public void testCreateInstance() {
        DefaultPrettyPrinter instance = printer.createInstance();
        assertNotNull(instance);
        assertNotSame(printer, instance);
        assertTrue(instance._spacesInObjectEntries);
        assertEquals(" ", instance._rootSeparator.getValue());
    }

    @Test
    public void testWriteRootValueSeparatorWithNonNullSeparator() throws Exception {
        generator = new TestJsonGenerator();
        printer.writeRootValueSeparator(generator);
        assertEquals(" ", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteRootValueSeparatorWithNullSeparator() throws Exception {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter((SerializableString) null);
        generator = new TestJsonGenerator();
        p.writeRootValueSeparator(generator);
        assertEquals("", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteStartObjectWithInlineIndenter() throws Exception {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter();
        p._objectIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        int oldNesting = p._nesting;
        p.writeStartObject(generator);
        assertEquals("{", generator.getWrittenRaw().toString());
        assertEquals(oldNesting, p._nesting);
    }

    @Test
    public void testWriteStartObjectWithNonInlineIndenter() throws Exception {
        int oldNesting = printer._nesting;
        printer.writeStartObject(generator);
        assertEquals("{", generator.getWrittenRaw().toString());
        assertEquals(oldNesting + 1, printer._nesting);
    }

    @Test
    public void testBeforeObjectEntries() throws Exception {
        printer._nesting = 2;
        printer.beforeObjectEntries(generator);
        assertNotNull(generator.getWrittenRaw());
    }

    @Test
    public void testWriteObjectFieldValueSeparatorWithSpaces() throws Exception {
        assertTrue(printer._spacesInObjectEntries);
        printer.writeObjectFieldValueSeparator(generator);
        assertEquals(" : ", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteObjectFieldValueSeparatorWithoutSpaces() throws Exception {
        DefaultPrettyPrinter p = printer.withoutSpacesInObjectEntries();
        generator = new TestJsonGenerator();
        p.writeObjectFieldValueSeparator(generator);
        assertEquals(":", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteObjectEntrySeparator() throws Exception {
        printer._nesting = 1;
        generator = new TestJsonGenerator();
        printer.writeObjectEntrySeparator(generator);
        assertEquals(",", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteEndObjectWithPositiveEntries() throws Exception {
        printer._nesting = 1;
        int oldNesting = printer._nesting;
        generator = new TestJsonGenerator();
        printer.writeEndObject(generator, 2);
        assertEquals("}", generator.getWrittenRaw().toString());
        assertEquals(oldNesting - 1, printer._nesting);
    }

    @Test
    public void testWriteEndObjectWithZeroEntries() throws Exception {
        printer._nesting = 1;
        generator = new TestJsonGenerator();
        printer.writeEndObject(generator, 0);
        assertEquals(" }", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteEndObjectWithInlineIndenter() throws Exception {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter();
        p._objectIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        p._nesting = 1;
        generator = new TestJsonGenerator();
        p.writeEndObject(generator, 3);
        assertEquals("}", generator.getWrittenRaw().toString());
        assertEquals(1, p._nesting);
    }

    @Test
    public void testWriteStartArrayWithInlineIndenter() throws Exception {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter();
        p._arrayIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        int oldNesting = p._nesting;
        p.writeStartArray(generator);
        assertEquals("[", generator.getWrittenRaw().toString());
        assertEquals(oldNesting, p._nesting);
    }

    @Test
    public void testWriteStartArrayWithNonInlineIndenter() throws Exception {
        int oldNesting = printer._nesting;
        printer.writeStartArray(generator);
        assertEquals("[", generator.getWrittenRaw().toString());
        assertEquals(oldNesting + 1, printer._nesting);
    }

    @Test
    public void testBeforeArrayValues() throws Exception {
        printer._nesting = 2;
        printer.beforeArrayValues(generator);
        assertNotNull(generator.getWrittenRaw());
    }

    @Test
    public void testWriteArrayValueSeparator() throws Exception {
        printer._nesting = 1;
        generator = new TestJsonGenerator();
        printer.writeArrayValueSeparator(generator);
        assertEquals(",", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteEndArrayWithPositiveValues() throws Exception {
        printer._nesting = 1;
        int oldNesting = printer._nesting;
        generator = new TestJsonGenerator();
        printer.writeEndArray(generator, 3);
        assertEquals("]", generator.getWrittenRaw().toString());
        assertEquals(oldNesting - 1, printer._nesting);
    }

    @Test
    public void testWriteEndArrayWithZeroValues() throws Exception {
        printer._nesting = 1;
        generator = new TestJsonGenerator();
        printer.writeEndArray(generator, 0);
        assertEquals(" ]", generator.getWrittenRaw().toString());
    }

    @Test
    public void testWriteEndArrayWithInlineIndenter() throws Exception {
        DefaultPrettyPrinter p = new DefaultPrettyPrinter();
        p._arrayIndenter = DefaultPrettyPrinter.NopIndenter.instance;
        p._nesting = 1;
        generator = new TestJsonGenerator();
        p.writeEndArray(generator, 1);
        assertEquals("]", generator.getWrittenRaw().toString());
        assertEquals(1, p._nesting);
    }

    @Test
    public void testNopIndenterInstance() {
        DefaultPrettyPrinter.NopIndenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        assertTrue(indenter.isInline());
    }

    @Test
    public void testNopIndenterWriteIndentation() throws Exception {
        DefaultPrettyPrinter.NopIndenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        generator = new TestJsonGenerator();
        indenter.writeIndentation(generator, 5);
        assertEquals("", generator.getWrittenRaw().toString());
    }

    @Test
    public void testFixedSpaceIndenterInstance() {
        DefaultPrettyPrinter.FixedSpaceIndenter indenter = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        assertTrue(indenter.isInline());
    }

    @Test
    public void testFixedSpaceIndenterWriteIndentation() throws Exception {
        DefaultPrettyPrinter.FixedSpaceIndenter indenter = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        generator = new TestJsonGenerator();
        indenter.writeIndentation(generator, 3);
        assertEquals(" ", generator.getWrittenRaw().toString());
    }

    @Test
    public void testIndentArraysWithNopIndenter() {
        printer.indentArraysWith(DefaultPrettyPrinter.NopIndenter.instance);
        assertTrue(printer._arrayIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    private static class TestJsonGenerator extends JsonGenerator {
        private StringBuilder written = new StringBuilder();

        @Override
        public JsonGenerator writeRaw(String raw) throws IOException {
            written.append(raw);
            return this;
        }

        @Override
        public JsonGenerator writeRaw(char raw) throws IOException {
            written.append(raw);
            return this;
        }

        @Override
        public JsonGenerator writeRaw(char[] raw, int offset, int len) throws IOException {
            written.append(raw, offset, len);
            return this;
        }

        public String getWrittenRaw() {
            return written.toString();
        }

        // Abstract methods required to compile
        @Override public void close() throws IOException {}
        @Override public void flush() throws IOException {}
        @Override public ObjectCodec getCodec() { return null; }
        @Override public int getOutputBuffered() { return 0; }
        @Override public boolean isClosed() { return false; }
        @Override public JsonGenerator setCodec(ObjectCodec oc) { return this; }
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public JsonGenerator writeStartArray() throws IOException { return this; }
        @Override public JsonGenerator writeEndArray() throws IOException { return this; }
        @Override public JsonGenerator writeStartObject() throws IOException { return this; }
        @Override public JsonGenerator writeEndObject() throws IOException { return this; }
        @Override public JsonGenerator writeFieldName(String name) throws IOException { return this; }
        @Override public JsonGenerator writeFieldName(SerializableString name) throws IOException { return this; }
        @Override public JsonGenerator writeString(String text) throws IOException { return this; }
        @Override public JsonGenerator writeString(char[] text, int offset, int len) throws IOException { return this; }
        @Override public JsonGenerator writeRawUTF8String(byte[] text, int offset, int len) throws IOException { return this; }
        @Override public JsonGenerator writeUTF8String(byte[] text, int offset, int len) throws IOException { return this; }
        @Override public JsonGenerator writeNull() throws IOException { return this; }
        @Override public JsonGenerator writeNumber(int v) throws IOException { return this; }
        @Override public JsonGenerator writeNumber(long v) throws IOException { return this; }
        @Override public JsonGenerator writeNumber(BigDecimal v) throws IOException { return this; }
        @Override public JsonGenerator writeNumber(double v) throws IOException { return this; }
        @Override public JsonGenerator writeNumber(float v) throws IOException { return this; }
        @Override public JsonGenerator writeBoolean(boolean state) throws IOException { return this; }
        @Override public JsonGenerator writeObject(Object pojo) throws IOException { return this; }
        @Override public JsonGenerator writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { return this; }
        @Override public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException { return 0; }
        @Override public int writeBinary(InputStream data, int dataLength) throws IOException { return 0; }
        @Override public void writeValue(JsonParser p) throws IOException {}
        @Override public JsonGenerator writeNumber(char[] encodedValue, int offset, int len) throws IOException { return this; }
        @Override public JsonGenerator writeNumber(Short v) throws IOException { return this; }
        @Override public JsonGenerator writeNumber(BigInteger v) throws IOException { return this; }
        @Override public JsonGenerator writeBoolean(boolean state, boolean asInt) throws IOException { return this; }
    }
}