package com.fasterxml.jackson.core.base;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.json.DupDetector;
import java.io.IOException;
import java.math.BigDecimal;

public class GeneratorBaseTest {

    private TestGenerator generator;

    @Before
    public void setUp() {
        generator = new TestGenerator(0, null);
    }

    @Test
    public void testConstructorWithNullCodec() {
        TestGenerator gen = new TestGenerator(Feature.WRITE_NUMBERS_AS_STRINGS.getMask(), null);
        assertTrue(gen.isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS));
        assertTrue(gen._cfgNumbersAsStrings);
        assertNull(gen.getCodec());
        assertNotNull(gen.getOutputContext());
    }

    @Test
    public void testConstructorWithCodec() {
        ObjectCodec codec = new DummyObjectCodec();
        TestGenerator gen = new TestGenerator(0, codec);
        assertSame(codec, gen.getCodec());
    }

    @Test
    public void testConstructorWithContext() {
        JsonWriteContext ctx = JsonWriteContext.createRootContext(null);
        TestGenerator gen = new TestGenerator(0, null, ctx);
        assertSame(ctx, gen.getOutputContext());
    }

    @Test
    public void testIsEnabled() {
        assertFalse(generator.isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS));
        generator.enable(Feature.WRITE_NUMBERS_AS_STRINGS);
        assertTrue(generator.isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testEnableFeature() {
        generator.enable(Feature.WRITE_NUMBERS_AS_STRINGS);
        assertTrue(generator._cfgNumbersAsStrings);
        int mask = Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        assertTrue((generator._features & mask) != 0);
    }

    @Test
    public void testEnableStrictDuplicateDetection() {
        assertNull(generator.getOutputContext().getDupDetector());
        generator.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testEnableEscapeNonAscii() {
        generator.enable(Feature.ESCAPE_NON_ASCII);
        assertEquals(127, generator.getHighestNonEscapedChar());
    }

    @Test
    public void testDisableFeature() {
        generator.enable(Feature.WRITE_NUMBERS_AS_STRINGS);
        generator.disable(Feature.WRITE_NUMBERS_AS_STRINGS);
        assertFalse(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testDisableStrictDuplicateDetection() {
        generator.enable(Feature.STRICT_DUPLICATE_DETECTION);
        generator.disable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testDisableEscapeNonAscii() {
        generator.enable(Feature.ESCAPE_NON_ASCII);
        generator.disable(Feature.ESCAPE_NON_ASCII);
        assertEquals(0, generator.getHighestNonEscapedChar());
    }

    @Test
    public void testSetFeatureMask() {
        generator.setFeatureMask(Feature.WRITE_NUMBERS_AS_STRINGS.getMask());
        assertTrue(generator.isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS));
        assertTrue(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testOverrideStdFeatures() {
        generator.enable(Feature.WRITE_NUMBERS_AS_STRINGS);
        generator.overrideStdFeatures(0, Feature.WRITE_NUMBERS_AS_STRINGS.getMask());
        assertFalse(generator.isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS));
        assertFalse(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testGetCurrentValue() {
        assertNull(generator.getCurrentValue());
    }

    @Test
    public void testSetCurrentValue() {
        Object value = new Object();
        generator.setCurrentValue(value);
        assertSame(value, generator.getCurrentValue());
    }

    @Test
    public void testWriteFieldNameWithSerializableString() throws IOException {
        SerializableString ss = new SerializedString("test");
        generator.writeFieldName(ss);
        assertEquals("test", generator.lastFieldName);
    }

    @Test
    public void testWriteStringWithSerializableString() throws IOException {
        SerializableString ss = new SerializedString("value");
        generator.writeString(ss);
        assertEquals("value", generator.lastString);
    }

    @Test
    public void testWriteRawValueString() throws IOException {
        generator.writeRawValue("raw");
        assertTrue(generator.verifyValueWriteCalled);
        assertEquals("raw", generator.lastRaw);
    }

    @Test
    public void testWriteRawValueStringWithOffset() throws IOException {
        generator.writeRawValue("rawtext", 0, 3);
        assertTrue(generator.verifyValueWriteCalled);
    }

    @Test
    public void testWriteRawValueCharArray() throws IOException {
        generator.writeRawValue(new char[]{'a', 'b'}, 0, 2);
        assertTrue(generator.verifyValueWriteCalled);
    }

    @Test
    public void testWriteRawValueSerializableString() throws IOException {
        SerializableString ss = new SerializedString("raw");
        generator.writeRawValue(ss);
        assertTrue(generator.verifyValueWriteCalled);
    }

    @Test
    public void testWriteBinaryUnsupported() throws IOException {
        try {
            generator.writeBinary(null, null, 0);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testWriteObjectNull() throws IOException {
        generator.writeObject(null);
        assertTrue(generator.nullWritten);
    }

    @Test
    public void testWriteObjectWithCodec() throws IOException {
        ObjectCodec codec = new DummyObjectCodec();
        generator.setCodec(codec);
        generator.writeObject("test");
        assertTrue(codec.writeValueCalled);
    }

    @Test
    public void testWriteObjectWithoutCodec() throws IOException {
        generator.writeObject("test");
        assertTrue(generator.simpleObjectWritten);
    }

    @Test
    public void testWriteTreeNull() throws IOException {
        generator.writeTree(null);
        assertTrue(generator.nullWritten);
    }

    @Test
    public void testWriteTreeWithoutCodec() throws IOException {
        try {
            generator.writeTree(new DummyTreeNode());
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("ObjectCodec"));
        }
    }

    @Test
    public void testWriteTreeWithCodec() throws IOException {
        ObjectCodec codec = new DummyObjectCodec();
        generator.setCodec(codec);
        generator.writeTree(new DummyTreeNode());
        assertTrue(codec.writeValueCalled);
    }

    @Test
    public void testClose() throws IOException {
        assertFalse(generator.isClosed());
        generator.close();
        assertTrue(generator.isClosed());
    }

    @Test
    public void testUseDefaultPrettyPrinter() {
        assertNull(generator.getPrettyPrinter());
        generator.useDefaultPrettyPrinter();
        assertNotNull(generator.getPrettyPrinter());
    }

    @Test
    public void testUseDefaultPrettyPrinterAlreadySet() {
        generator.setPrettyPrinter(new com.fasterxml.jackson.core.util.DefaultPrettyPrinter());
        generator.useDefaultPrettyPrinter();
        assertNotNull(generator.getPrettyPrinter());
    }

    @Test
    public void testSetCodec() {
        ObjectCodec codec = new DummyObjectCodec();
        generator.setCodec(codec);
        assertSame(codec, generator.getCodec());
    }

    @Test
    public void testGetCodec() {
        assertNull(generator.getCodec());
    }

    @Test
    public void testGetOutputContext() {
        assertNotNull(generator.getOutputContext());
    }

    @Test
    public void testVersion() {
        assertNotNull(generator.version());
    }

    @Test
    public void testAsString() throws IOException {
        BigDecimal bd = new BigDecimal("123.456");
        String result = generator._asString(bd);
        assertEquals("123.456", result);
    }

    @Test
    public void testDecodeSurrogateValid() throws IOException {
        int result = generator._decodeSurrogate(0xD800, 0xDC00);
        assertEquals(0x10000, result);
    }

    @Test(expected = IOException.class)
    public void testDecodeSurrogateInvalid() throws IOException {
        generator._decodeSurrogate(0xD800, 0xE000);
    }

    @Test
    public void testCheckStdFeatureChangesNoChange() {
        int features = Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        generator._checkStdFeatureChanges(features, 0);
        assertFalse(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testCheckStdFeatureChangesNumbersAsStrings() {
        int changed = Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        generator._checkStdFeatureChanges(changed, changed);
        assertTrue(generator._cfgNumbersAsStrings);
    }

    @Test
    public void testCheckStdFeatureChangesEscapeNonAsciiEnable() {
        int changed = Feature.ESCAPE_NON_ASCII.getMask();
        generator._checkStdFeatureChanges(changed, changed);
        assertEquals(127, generator.getHighestNonEscapedChar());
    }

    @Test
    public void testCheckStdFeatureChangesEscapeNonAsciiDisable() {
        int changed = Feature.ESCAPE_NON_ASCII.getMask();
        generator._checkStdFeatureChanges(0, changed);
        assertEquals(0, generator.getHighestNonEscapedChar());
    }

    @Test
    public void testCheckStdFeatureChangesStrictDupEnable() {
        int changed = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        generator._checkStdFeatureChanges(changed, changed);
        assertNotNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testCheckStdFeatureChangesStrictDupDisable() {
        generator.enable(Feature.STRICT_DUPLICATE_DETECTION);
        int changed = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        generator._checkStdFeatureChanges(0, changed);
        assertNull(generator.getOutputContext().getDupDetector());
    }

    @Test
    public void testFeatureMaskInitialValue() {
        TestGenerator gen = new TestGenerator(Feature.ESCAPE_NON_ASCII.getMask(), null);
        assertTrue(gen.isEnabled(Feature.ESCAPE_NON_ASCII));
    }

    private static class TestGenerator extends GeneratorBase {
        String lastFieldName;
        String lastString;
        String lastRaw;
        boolean verifyValueWriteCalled;
        boolean nullWritten;
        boolean simpleObjectWritten;
        int highestNonEscapedChar;

        public TestGenerator(int features, ObjectCodec codec) {
            super(features, codec);
        }

        public TestGenerator(int features, ObjectCodec codec, JsonWriteContext ctxt) {
            super(features, codec, ctxt);
        }

        @Override
        public void flush() throws IOException {}

        @Override
        protected void _releaseBuffers() {}

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException {
            verifyValueWriteCalled = true;
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            lastFieldName = name;
        }

        @Override
        public void writeString(String text) throws IOException {
            lastString = text;
        }

        @Override
        public void writeRaw(String text) throws IOException {
            lastRaw = text;
        }

        @Override
        public void writeRaw(String text, int offset, int len) throws IOException {
            lastRaw = text.substring(offset, offset + len);
        }

        @Override
        public void writeRaw(char[] text, int offset, int len) throws IOException {}

        @Override
        public void writeNull() throws IOException {
            nullWritten = true;
        }

        @Override
        protected void _writeSimpleObject(Object value) throws IOException {
            simpleObjectWritten = true;
        }

        @Override
        public void setHighestNonEscapedChar(int c) {
            highestNonEscapedChar = c;
        }

        @Override
        public int getHighestNonEscapedChar() {
            return highestNonEscapedChar;
        }
    }

    private static class DummyObjectCodec extends ObjectCodec {
        boolean writeValueCalled;

        @Override
        public void writeValue(JsonGenerator gen, Object value) throws IOException {
            writeValueCalled = true;
        }

        @Override
        public <T> T readValue(com.fasterxml.jackson.core.JsonParser p, Class<T> valueType) throws IOException {
            return null;
        }

        @Override
        public <T> T readValue(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException {
            return null;
        }

        @Override
        public <T> T readValue(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.databind.JavaType valueType) throws IOException {
            return null;
        }

        @Override
        public com.fasterxml.jackson.core.JsonParser treeAsTokens(TreeNode n) {
            return null;
        }

        @Override
        public TreeNode createArrayNode() {
            return null;
        }

        @Override
        public TreeNode createObjectNode() {
            return null;
        }

        @Override
        public JsonParserFactory getFactory() {
            return null;
        }

        @Override
        public JsonFactory getJsonFactory() {
            return null;
        }

        @Override
        public Version version() {
            return null;
        }
    }

    private static class DummyTreeNode implements TreeNode {
        @Override
        public JsonToken asToken() { return null; }
        @Override
        public JsonParser.NumberType numberType() { return null; }
        @Override
        public int size() { return 0; }
        @Override
        public TreeNode get(int index) { return null; }
        @Override
        public TreeNode get(String fieldName) { return null; }
        @Override
        public TreeNode path(int index) { return null; }
        @Override
        public TreeNode path(String fieldName) { return null; }
        @Override
        public Iterator<String> fieldNames() { return null; }
        @Override
        public TreeNode at(com.fasterxml.jackson.core.JsonPointer ptr) { return null; }
        @Override
        public TreeNode at(String jsonPointerExpr) { return null; }
    }
}