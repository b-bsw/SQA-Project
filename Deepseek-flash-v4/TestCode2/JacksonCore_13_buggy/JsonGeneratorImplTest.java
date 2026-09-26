package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import org.junit.*;
import java.io.IOException;
import static org.junit.Assert.*;

public class JsonGeneratorImplTest {
    
    private static class DummyGenerator extends JsonGeneratorImpl {
        public DummyGenerator(IOContext ctxt, int features, ObjectCodec codec) {
            super(ctxt, features, codec);
        }
        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeFieldName(SerializableString name) throws IOException {}
        @Override public void writeString(String text) throws IOException {}
        @Override public void writeString(char[] text, int offset, int len) throws IOException {}
        @Override public void writeString(SerializableString text) throws IOException {}
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeRaw(String text) throws IOException {}
        @Override public void writeRaw(String text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char c) throws IOException {}
        @Override public void writeRawValue(String text) throws IOException {}
        @Override public void writeRawValue(String text, int offset, int len) throws IOException {}
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException {}
        @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException {}
        @Override public int writeBinary(Base64Variant b64variant, java.io.InputStream data, int dataBytes) throws IOException { return 0; }
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(java.math.BigDecimal v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeNull() throws IOException {}
        @Override public void writeObject(Object pojo) throws IOException {}
        @Override public void writeTree(com.fasterxml.jackson.core.TreeNode rootNode) throws IOException {}
        @Override public void copyCurrentEvent(JsonParser jp) throws IOException {}
        @Override public void copyCurrentStructure(JsonParser jp) throws IOException {}
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public void flush() throws IOException {}
        @Override public boolean isClosed() { return false; }
        @Override public void close() throws IOException {}
        @Override public JsonGenerator setCodec(ObjectCodec oc) { return this; }
        @Override public ObjectCodec getCodec() { return null; }
    }

    private IOContext ctxt;
    private DummyGenerator gen;
    private ObjectCodec codec;

    @Before
    public void setUp() {
        ctxt = new IOContext(com.fasterxml.jackson.core.json.UTF8StreamJsonParserTest.this, null, null, null);
        
    }

    @Test
    public void testConstructorDefaultEscapes() {
        int features = 0;
        DummyGenerator gen = new DummyGenerator(ctxt, features, null);
        assertNotNull(gen._outputEscapes);
        assertSame(JsonGeneratorImpl.sOutputEscapes, gen._outputEscapes);
        assertEquals(0, gen._maximumNonEscapedChar);
        assertTrue(gen._cfgUnqNames);
    }

    @Test
    public void testConstructorEscapeNonAscii() {
        int features = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        DummyGenerator gen = new DummyGenerator(ctxt, features, null);
        assertEquals(127, gen._maximumNonEscapedChar);
    }

    @Test
    public void testConstructorQuoteFieldNames() {
        int features = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        DummyGenerator gen = new DummyGenerator(ctxt, features, null);
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testConstructorNoQuoteFieldNames() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        assertTrue(gen._cfgUnqNames);
    }

    @Test
    public void testEnableQuoteFieldNames() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        assertTrue(gen._cfgUnqNames);
        gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testCheckStdFeatureChanges() {
        int features = 0;
        int changed = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        gen._checkStdFeatureChanges(features | JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask(), changed);
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testSetHighestNonEscapedCharNormal() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        gen.setHighestNonEscapedChar(255);
        assertEquals(255, gen._maximumNonEscapedChar);
    }

    @Test
    public void testSetHighestNonEscapedCharNegative() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        gen.setHighestNonEscapedChar(-5);
        assertEquals(0, gen._maximumNonEscapedChar);
    }

    @Test
    public void testSetHighestNonEscapedCharZero() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        gen.setHighestNonEscapedChar(0);
        assertEquals(0, gen._maximumNonEscapedChar);
    }

    @Test
    public void testGetHighestEscapedChar() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        gen._maximumNonEscapedChar = 100;
        assertEquals(100, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetCharacterEscapesNull() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        gen.setCharacterEscapes(null);
        assertNull(gen._characterEscapes);
        assertSame(JsonGeneratorImpl.sOutputEscapes, gen._outputEscapes);
    }

    @Test
    public void testSetCharacterEscapesNonNull() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        CharacterEscapes esc = new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                return new int[128];
            }
            @Override
            public com.fasterxml.jackson.core.SerializableString getEscapeSequence(int ch) {
                return null;
            }
        };
        gen.setCharacterEscapes(esc);
        assertSame(esc, gen._characterEscapes);
        assertNotNull(gen._outputEscapes);
        assertEquals(128, gen._outputEscapes.length);
    }

    @Test
    public void testGetCharacterEscapesInitiallyNull() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        assertNull(gen.getCharacterEscapes());
    }

    @Test
    public void testGetCharacterEscapesAfterSet() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        CharacterEscapes esc = new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                return new int[128];
            }
            @Override
            public com.fasterxml.jackson.core.SerializableString getEscapeSequence(int ch) {
                return null;
            }
        };
        gen.setCharacterEscapes(esc);
        assertSame(esc, gen.getCharacterEscapes());
    }

    @Test
    public void testSetRootValueSeparator() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        SerializableString sep = new SerializableString() {
            @Override public String getValue() { return "SEP"; }
            @Override public int charLength() { return 3; }
            @Override public char[] asQuotedChars() { return new char[]{'S','E','P'}; }
            @Override public byte[] asUnquotedUTF8() { return new byte[]{'S','E','P'}; }
            @Override public byte[] asQuotedUTF8() { return new byte[]{'S','E','P'}; }
        };
        gen.setRootValueSeparator(sep);
        assertSame(sep, gen._rootValueSeparator);
    }

    @Test
    public void testRootValueSeparatorDefault() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        assertNotNull(gen._rootValueSeparator);
        assertEquals(" ", gen._rootValueSeparator.getValue());
    }

    @Test
    public void testVersion() {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null);
        assertNotNull(gen.version());
    }

    @Test
    public void testWriteStringField() throws IOException {
        DummyGenerator gen = new DummyGenerator(ctxt, 0, null) {
            private String lastField;
            private String lastValue;
            @Override public void writeFieldName(String name) { lastField = name; }
            @Override public void writeString(String value) { lastValue = value; }
        };
        gen.writeStringField("foo", "bar");
        assertEquals("foo", ((DummyGenerator)gen).lastField);
        assertEquals("bar", ((DummyGenerator)gen).lastValue);
    }
}