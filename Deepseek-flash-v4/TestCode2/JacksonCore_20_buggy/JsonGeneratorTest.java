package com.fasterxml.jackson.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JsonGeneratorTest {

    private TestJsonGenerator generator;

    @Before
    public void setUp() throws Exception {
        generator = new TestJsonGenerator();
    }

    @After
    public void tearDown() throws Exception {
        generator = null;
    }

    @Test
    public void testFeatureCollectDefaults() {
        int flags = JsonGenerator.Feature.collectDefaults();
        assertTrue((flags & JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask()) != 0);
        assertTrue((flags & JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask()) != 0);
        assertTrue((flags & JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask()) != 0);
        assertTrue((flags & JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask()) != 0);
        assertTrue((flags & JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.getMask()) != 0);
        assertTrue((flags & JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask()) == 0);
        assertTrue((flags & JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask()) == 0);
        assertTrue((flags & JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) == 0);
        assertTrue((flags & JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask()) == 0);
        assertTrue((flags & JsonGenerator.Feature.IGNORE_UNKNOWN.getMask()) == 0);
    }

    @Test
    public void testFeatureEnabledByDefault() {
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledByDefault());
        assertFalse(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledByDefault());
    }

    @Test
    public void testFeatureEnabledIn() {
        int flags = JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask() | JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledIn(flags));
        assertTrue(JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(flags));
        assertFalse(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.enabledIn(flags));
    }

    @Test
    public void testFeatureGetMask() {
        assertEquals(1, JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask());
        assertEquals(2, JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask());
        assertEquals(4, JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask());
    }

    @Test
    public void testConfigure() {
        assertSame(generator, generator.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true));
        assertTrue(generator.enabled.contains(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        assertSame(generator, generator.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false));
        assertFalse(generator.enabled.contains(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testOverrideStdFeatures() {
        generator.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        generator.overrideStdFeatures(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask(), JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask() | JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask());
        assertFalse(generator.enabled.contains(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        assertTrue(generator.enabled.contains(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM));
    }

    @Test
    public void testGetFormatFeatures() {
        assertEquals(0, generator.getFormatFeatures());
    }

    @Test
    public void testOverrideFormatFeaturesThrows() {
        try {
            generator.overrideFormatFeatures(0, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("No FormatFeatures defined"));
        }
    }

    @Test
    public void testSetSchemaThrows() {
        try {
            generator.setSchema(new TestFormatSchema());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("does not support schema"));
        }
    }

    @Test
    public void testGetSchemaReturnsNull() {
        assertNull(generator.getSchema());
    }

    @Test
    public void testSetPrettyPrinter() {
        TestPrettyPrinter pp = new TestPrettyPrinter();
        assertSame(generator, generator.setPrettyPrinter(pp));
        assertSame(pp, generator.getPrettyPrinter());
    }

    @Test
    public void testGetPrettyPrinterInitiallyNull() {
        assertNull(generator.getPrettyPrinter());
    }

    @Test
    public void testSetHighestNonEscapedChar() {
        assertSame(generator, generator.setHighestNonEscapedChar(127));
    }

    @Test
    public void testGetHighestEscapedChar() {
        assertEquals(0, generator.getHighestEscapedChar());
    }

    @Test
    public void testSetCharacterEscapes() {
        TestCharacterEscapes esc = new TestCharacterEscapes();
        assertSame(generator, generator.setCharacterEscapes(esc));
    }

    @Test
    public void testSetRootValueSeparatorThrows() {
        try {
            generator.setRootValueSeparator(new TestSerializableString("sep"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testGetOutputTarget() {
        assertNull(generator.getOutputTarget());
    }

    @Test
    public void testGetCurrentValue() {
        assertNull(generator.getCurrentValue());
        generator.currentValue = "test";
        assertEquals("test", generator.getCurrentValue());
    }

    @Test
    public void testSetCurrentValue() {
        generator.setCurrentValue("value");
        assertEquals("value", generator.currentContext.getCurrentValue());
    }

    @Test
    public void testSetCurrentValueNullContext() {
        generator.context = null;
        generator.setCurrentValue("value");
    }

    @Test
    public void testCanUseSchema() {
        assertFalse(generator.canUseSchema(new TestFormatSchema()));
    }

    @Test
    public void testCanWriteObjectId() {
        assertFalse(generator.canWriteObjectId());
    }

    @Test
    public void testCanWriteTypeId() {
        assertFalse(generator.canWriteTypeId());
    }

    @Test
    public void testCanWriteBinaryNatively() {
        assertFalse(generator.canWriteBinaryNatively());
    }

    @Test
    public void testCanOmitFields() {
        assertTrue(generator.canOmitFields());
    }

    @Test
    public void testCanWriteFormattedNumbers() {
        assertFalse(generator.canWriteFormattedNumbers());
    }

    @Test
    public void testGetOutputBuffered() {
        assertEquals(-1, generator.getOutputBuffered());
    }

    @Test
    public void testWriteStartArrayWithSize() throws IOException {
        generator.writeStartArray(5);
        assertTrue(generator.startArrayCalled);
    }

    @Test
    public void testWriteStartObjectWithValue() throws IOException {
        Object value = new Object();
        generator.writeStartObject(value);
        assertTrue(generator.startObjectCalled);
        assertSame(value, generator.currentContext.getCurrentValue());
    }

    @Test
    public void testWriteFieldId() throws IOException {
        generator.writeFieldId(123L);
        assertEquals("123", generator.lastFieldName);
    }

    @Test
    public void testWriteArrayIntNull() throws IOException {
        try {
            generator.writeArray((int[]) null, 0, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("null array", e.getMessage());
        }
    }

    @Test
    public void testWriteArrayIntInvalidOffsets() throws IOException {
        try {
            generator.writeArray(new int[]{1,2,3}, -1, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid argument(s)"));
        }
        try {
            generator.writeArray(new int[]{1,2,3}, 0, 4);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid argument(s)"));
        }
    }

    @Test
    public void testWriteArrayIntNormal() throws IOException {
        generator.writeArray(new int[]{1,2,3}, 0, 3);
        assertTrue(generator.startArrayCalled);
        assertEquals(3, generator.numbersWritten.size());
    }

    @Test
    public void testWriteArrayIntEmpty() throws IOException {
        generator.writeArray(new int[]{}, 0, 0);
        assertTrue(generator.startArrayCalled);
        assertTrue(generator.numbersWritten.isEmpty());
    }

    @Test
    public void testWriteArrayLongNull() throws IOException {
        try {
            generator.writeArray((long[]) null, 0, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("null array", e.getMessage());
        }
    }

    @Test
    public void testWriteArrayLong() throws IOException {
        generator.writeArray(new long[]{1L, 2L}, 0, 2);
        assertTrue(generator.startArrayCalled);
        assertEquals(2, generator.numbersWritten.size());
    }

    @Test
    public void testWriteArrayDoubleNull() throws IOException {
        try {
            generator.writeArray((double[]) null, 0, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("null array", e.getMessage());
        }
    }

    @Test
    public void testWriteArrayDouble() throws IOException {
        generator.writeArray(new double[]{1.1, 2.2}, 0, 2);
        assertTrue(generator.startArrayCalled);
        assertEquals(2, generator.numbersWritten.size());
    }

    @Test
    public void testWriteRawSerializableString() throws IOException {
        TestSerializableString raw = new TestSerializableString("test");
        generator.writeRaw(raw);
        assertEquals("test", generator.lastRawText);
    }

    @Test
    public void testWriteRawValueSerializableString() throws IOException {
        TestSerializableString raw = new TestSerializableString("value");
        generator.writeRawValue(raw);
        assertEquals("value", generator.lastRawValueText);
    }

    @Test
    public void testWriteBinaryBytesOffsetLen() throws IOException {
        byte[] data = new byte[]{1,2,3};
        generator.writeBinary(data, 0, 3);
        assertTrue(generator.binaryWritten);
    }

    @Test
    public void testWriteBinaryBytes() throws IOException {
        byte[] data = new byte[]{1,2,3};
        generator.writeBinary(data);
        assertTrue(generator.binaryWritten);
    }

    @Test
    public void testWriteBinaryInputStream() throws IOException {
        int written = generator.writeBinary(new java.io.ByteArrayInputStream(new byte[]{1,2}), 2);
        assertEquals(2, written);
    }

    @Test
    public void testWriteNumberShort() throws IOException {
        generator.writeNumber((short) 42);
        assertEquals(42, generator.lastIntNumber);
    }

    @Test
    public void testWriteEmbeddedObjectThrows() throws IOException {
        try {
            generator.writeEmbeddedObject(new Object());
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("No native support for writing embedded objects"));
        }
    }

    @Test
    public void testWriteObjectIdThrows() throws IOException {
        try {
            generator.writeObjectId("id");
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("No native support for writing Object Ids"));
        }
    }

    @Test
    public void testWriteObjectRefThrows() throws IOException {
        try {
            generator.writeObjectRef("id");
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("No native support for writing Object Ids"));
        }
    }

    @Test
    public void testWriteTypeIdThrows() throws IOException {
        try {
            generator.writeTypeId("id");
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("No native support for writing Type Ids"));
        }
    }

    @Test
    public void testWriteStringField() throws IOException {
        generator.writeStringField("name", "value");
        assertEquals("name", generator.lastFieldName);
        assertEquals("value", generator.lastString);
    }

    @Test
    public void testWriteBooleanField() throws IOException {
        generator.writeBooleanField("flag", true);
        assertEquals("flag", generator.lastFieldName);
        assertTrue(generator.lastBoolean);
    }

    @Test
    public void testWriteNullField() throws IOException {
        generator.writeNullField("field");
        assertEquals("field", generator.lastFieldName);
        assertTrue(generator.nullWritten);
    }

    @Test
    public void testWriteNumberFieldInt() throws IOException {
        generator.writeNumberField("num", 42);
        assertEquals("num", generator.lastFieldName);
        assertEquals(42, generator.lastIntNumber);
    }

    @Test
    public void testWriteNumberFieldLong() throws IOException {
        generator.writeNumberField("num", 123L);
        assertEquals("num", generator.lastFieldName);
        assertEquals(123L, generator.lastLongNumber);
    }

    @Test
    public void testWriteNumberFieldDouble() throws IOException {
        generator.writeNumberField("num", 3.14);
        assertEquals("num", generator.lastFieldName);
        assertEquals(3.14, generator.lastDoubleNumber, 0.001);
    }

    @Test
    public void testWriteNumberFieldFloat() throws IOException {
        generator.writeNumberField("num", 2.5f);
        assertEquals("num", generator.lastFieldName);
        assertEquals(2.5f, generator.lastFloatNumber, 0.001);
    }

    @Test
    public void testWriteNumberFieldBigDecimal() throws IOException {
        BigDecimal bd = new BigDecimal("99.99");
        generator.writeNumberField("num", bd);
        assertEquals("num", generator.lastFieldName);
        assertEquals(bd, generator.lastBigDecimalNumber);
    }

    @Test
    public void testWriteBinaryField() throws IOException {
        byte[] data = new byte[]{1,2};
        generator.writeBinaryField("bin", data);
        assertEquals("bin", generator.lastFieldName);
        assertTrue(generator.binaryWritten);
    }

    @Test
    public void testWriteArrayFieldStart() throws IOException {
        generator.writeArrayFieldStart("arr");
        assertEquals("arr", generator.lastFieldName);
        assertTrue(generator.startArrayCalled);
    }

    @Test
    public void testWriteObjectFieldStart() throws IOException {
        generator.writeObjectFieldStart("obj");
        assertEquals("obj", generator.lastFieldName);
        assertTrue(generator.startObjectCalled);
    }

    @Test
    public void testWriteObjectField() throws IOException {
        Object pojo = new Object();
        generator.writeObjectField("pojo", pojo);
        assertEquals("pojo", generator.lastFieldName);
        assertSame(pojo, generator.lastObjectWritten);
    }

    @Test
    public void testWriteOmittedField() throws IOException {
        generator.writeOmittedField("field");
    }

    @Test
    public void testCopyCurrentEventNullToken() throws IOException {
        try {
            generator.copyCurrentEvent(new TestJsonParser(null));
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("No current event to copy"));
        }
    }

    @Test
    public void testCopyCurrentEventStartObject() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.START_OBJECT);
        generator.copyCurrentEvent(p);
        assertTrue(generator.startObjectCalled);
    }

    @Test
    public void testCopyCurrentEventEndObject() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.END_OBJECT);
        generator.copyCurrentEvent(p);
        assertTrue(generator.endObjectCalled);
    }

    @Test
    public void testCopyCurrentEventStartArray() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.START_ARRAY);
        generator.copyCurrentEvent(p);
        assertTrue(generator.startArrayCalled);
    }

    @Test
    public void testCopyCurrentEventEndArray() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.END_ARRAY);
        generator.copyCurrentEvent(p);
        assertTrue(generator.endArrayCalled);
    }

    @Test
    public void testCopyCurrentEventFieldName() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.FIELD_NAME);
        p.currentName = "field";
        generator.copyCurrentEvent(p);
        assertEquals("field", generator.lastFieldName);
    }

    @Test
    public void testCopyCurrentEventString() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_STRING);
        p.text = "hello";
        generator.copyCurrentEvent(p);
        assertEquals("hello", generator.lastString);
    }

    @Test
    public void testCopyCurrentEventStringWithTextChars() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_STRING);
        p.hasTextChars = true;
        p.textChars = new char[]{'w','o','r','l','d'};
        p.textOffset = 0;
        p.textLength = 5;
        generator.copyCurrentEvent(p);
        assertEquals("world", generator.lastString);
    }

    @Test
    public void testCopyCurrentEventNumberInt() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_NUMBER_INT);
        p.numberType = JsonParser.NumberType.INT;
        p.intValue = 42;
        generator.copyCurrentEvent(p);
        assertEquals(42, generator.lastIntNumber);
    }

    @Test
    public void testCopyCurrentEventNumberBigInteger() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_NUMBER_INT);
        p.numberType = JsonParser.NumberType.BIG_INTEGER;
        p.bigIntValue = BigInteger.valueOf(123456789L);
        generator.copyCurrentEvent(p);
        assertEquals(BigInteger.valueOf(123456789L), generator.lastBigIntegerNumber);
    }

    @Test
    public void testCopyCurrentEventNumberLong() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_NUMBER_INT);
        p.numberType = JsonParser.NumberType.LONG;
        p.longValue = 100L;
        generator.copyCurrentEvent(p);
        assertEquals(100L, generator.lastLongNumber);
    }

    @Test
    public void testCopyCurrentEventNumberFloatBigDecimal() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_NUMBER_FLOAT);
        p.numberType = JsonParser.NumberType.BIG_DECIMAL;
        p.decimalValue = new BigDecimal("3.14");
        generator.copyCurrentEvent(p);
        assertEquals(new BigDecimal("3.14"), generator.lastBigDecimalNumber);
    }

    @Test
    public void testCopyCurrentEventNumberFloatFloat() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_NUMBER_FLOAT);
        p.numberType = JsonParser.NumberType.FLOAT;
        p.floatValue = 2.5f;
        generator.copyCurrentEvent(p);
        assertEquals(2.5f, generator.lastFloatNumber, 0.001);
    }

    @Test
    public void testCopyCurrentEventNumberFloatDouble() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_NUMBER_FLOAT);
        p.numberType = JsonParser.NumberType.DOUBLE;
        p.doubleValue = 1.23;
        generator.copyCurrentEvent(p);
        assertEquals(1.23, generator.lastDoubleNumber, 0.001);
    }

    @Test
    public void testCopyCurrentEventTrue() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_TRUE);
        generator.copyCurrentEvent(p);
        assertTrue(generator.lastBoolean);
    }

    @Test
    public void testCopyCurrentEventFalse() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_FALSE);
        generator.copyCurrentEvent(p);
        assertFalse(generator.lastBoolean);
    }

    @Test
    public void testCopyCurrentEventNull() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_NULL);
        generator.copyCurrentEvent(p);
        assertTrue(generator.nullWritten);
    }

    @Test
    public void testCopyCurrentEventEmbeddedObject() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_EMBEDDED_OBJECT);
        p.embeddedObject = "embedded";
        generator.copyCurrentEvent(p);
        assertEquals("embedded", generator.lastObjectWritten);
    }

    @Test
    public void testCopyCurrentStructureNullToken() throws IOException {
        try {
            generator.copyCurrentStructure(new TestJsonParser(null));
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("No current event to copy"));
        }
    }

    @Test
    public void testCopyCurrentStructureFieldName() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.FIELD_NAME);
        p.currentName = "field";
        p.nextToken = JsonToken.VALUE_STRING;
        p.text = "value";
        generator.copyCurrentStructure(p);
        assertEquals("field", generator.lastFieldName);
        assertEquals("value", generator.lastString);
    }

    @Test
    public void testCopyCurrentStructureStartObject() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.START_OBJECT);
        p.nextToken = JsonToken.END_OBJECT;
        generator.copyCurrentStructure(p);
        assertTrue(generator.startObjectCalled);
        assertTrue(generator.endObjectCalled);
    }

    @Test
    public void testCopyCurrentStructureStartArray() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.START_ARRAY);
        p.nextToken = JsonToken.END_ARRAY;
        generator.copyCurrentStructure(p);
        assertTrue(generator.startArrayCalled);
        assertTrue(generator.endArrayCalled);
    }

    @Test
    public void testCopyCurrentStructureEvent() throws IOException {
        TestJsonParser p = new TestJsonParser(JsonToken.VALUE_STRING);
        p.text = "event";
        generator.copyCurrentStructure(p);
        assertEquals("event", generator.lastString);
    }

    @Test
    public void testReportError() {
        try {
            generator._reportError("test error");
            fail("Expected JsonGenerationException");
        } catch (JsonGenerationException e) {
            assertEquals("test error", e.getMessage());
        }
    }

    @Test
    public void testVerifyOffsetsValid() {
        generator._verifyOffsets(10, 0, 5);
    }

    @Test
    public void testVerifyOffsetsNegativeOffset() {
        try {
            generator._verifyOffsets(10, -1, 5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid argument(s)"));
        }
    }

    @Test
    public void testVerifyOffsetsExceedsLength() {
        try {
            generator._verifyOffsets(10, 5, 6);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid argument(s)"));
        }
    }

    @Test
    public void testWriteSimpleObjectNull() throws IOException {
        generator._writeSimpleObject(null);
        assertTrue(generator.nullWritten);
    }

    @Test
    public void testWriteSimpleObjectString() throws IOException {
        generator._writeSimpleObject("test");
        assertEquals("test", generator.lastString);
    }

    @Test
    public void testWriteSimpleObjectInteger() throws IOException {
        generator._writeSimpleObject(42);
        assertEquals(42, generator.lastIntNumber);
    }

    @Test
    public void testWriteSimpleObjectLong() throws IOException {
        generator._writeSimpleObject(123L);
        assertEquals(123L, generator.lastLongNumber);
    }

    @Test
    public void testWriteSimpleObjectDouble() throws IOException {
        generator._writeSimpleObject(3.14);
        assertEquals(3.14, generator.lastDoubleNumber, 0.001);
    }

    @Test
    public void testWriteSimpleObjectFloat() throws IOException {
        generator._writeSimpleObject(2.5f);
        assertEquals(2.5f, generator.lastFloatNumber, 0.001);
    }

    @Test
    public void testWriteSimpleObjectShort() throws IOException {
        generator._writeSimpleObject((short) 10);
        assertEquals(10, generator.lastIntNumber);
    }

    @Test
    public void testWriteSimpleObjectByte() throws IOException {
        generator._writeSimpleObject((byte) 7);
        assertEquals(7, generator.lastIntNumber);
    }

    @Test
    public void testWriteSimpleObjectBigInteger() throws IOException {
        BigInteger bi = BigInteger.valueOf(999);
        generator._writeSimpleObject(bi);
        assertEquals(bi, generator.lastBigIntegerNumber);
    }

    @Test
    public void testWriteSimpleObjectBigDecimal() throws IOException {
        BigDecimal bd = new BigDecimal("88.88");
        generator._writeSimpleObject(bd);
        assertEquals(bd, generator.lastBigDecimalNumber);
    }

    @Test
    public void testWriteSimpleObjectAtomicInteger() throws IOException {
        generator._writeSimpleObject(new AtomicInteger(55));
        assertEquals(55, generator.lastIntNumber);
    }

    @Test
    public void testWriteSimpleObjectAtomicLong() throws IOException {
        generator._writeSimpleObject(new AtomicLong(200L));
        assertEquals(200L, generator.lastLongNumber);
    }

    @Test
    public void testWriteSimpleObjectByteArray() throws IOException {
        generator._writeSimpleObject(new byte[]{1,2,3});
        assertTrue(generator.binaryWritten);
    }

    @Test
    public void testWriteSimpleObjectBoolean() throws IOException {
        generator._writeSimpleObject(true);
        assertTrue(generator.lastBoolean);
    }

    @Test
    public void testWriteSimpleObjectAtomicBoolean() throws IOException {
        generator._writeSimpleObject(new AtomicBoolean(true));
        assertTrue(generator.lastBoolean);
    }

    @Test
    public void testWriteSimpleObjectUnknown() throws IOException {
        try {
            generator._writeSimpleObject(new Object());
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("can only serialize simple wrapper types"));
        }
    }

    private class TestJsonGenerator extends JsonGenerator {
        java.util.Set<Feature> enabled = new java.util.HashSet<>();
        String lastFieldName;
        String lastString;
        String lastRawText;
        String lastRawValueText;
        int lastIntNumber;
        long lastLongNumber;
        double lastDoubleNumber;
        float lastFloatNumber;
        BigDecimal lastBigDecimalNumber;
        BigInteger lastBigIntegerNumber;
        boolean lastBoolean;
        boolean nullWritten;
        boolean startArrayCalled;
        boolean endArrayCalled;
        boolean startObjectCalled;
        boolean endObjectCalled;
        boolean binaryWritten;
        Object lastObjectWritten;
        Object currentValue;
        TestStreamContext currentContext = new TestStreamContext();
        TestStreamContext context = currentContext;

        @Override
        public JsonGenerator setCodec(ObjectCodec oc) { return this; }

        @Override
        public ObjectCodec getCodec() { return null; }

        @Override
        public Version version() { return Version.unknownVersion(); }

        @Override
        public JsonGenerator enable(Feature f) {
            enabled.add(f);
            return this;
        }

        @Override
        public JsonGenerator disable(Feature f) {
            enabled.remove(f);
            return this;
        }

        @Override
        public boolean isEnabled(Feature f) {
            return enabled.contains(f);
        }

        @Override
        public int getFeatureMask() {
            int mask = 0;
            for (Feature f : enabled) {
                mask |= f.getMask();
            }
            return mask;
        }

        @Override
        public JsonGenerator setFeatureMask(int values) {
            enabled.clear();
            for (Feature f : Feature.values()) {
                if ((values & f.getMask()) != 0) {
                    enabled.add(f);
                }
            }
            return this;
        }

        @Override
        public JsonGenerator useDefaultPrettyPrinter() { return this; }

        @Override
        public void writeStartArray() { startArrayCalled = true; }

        @Override
        public void writeEndArray() { endArrayCalled = true; }

        @Override
        public void writeStartObject() { startObjectCalled = true; }

        @Override
        public void writeEndObject() { endObjectCalled = true; }

        @Override
        public void writeFieldName(String name) { lastFieldName = name; }

        @Override
        public void writeFieldName(SerializableString name) { lastFieldName = name.getValue(); }

        @Override
        public void writeString(String text) { lastString = text; }

        @Override
        public void writeString(char[] text, int offset, int len) { lastString = new String(text, offset, len); }

        @Override
        public void writeString(SerializableString text) { lastString = text.getValue(); }

        @Override
        public void writeRawUTF8String(byte[] text, int offset, int length) {}

        @Override
        public void writeUTF8String(byte[] text, int offset, int length) {}

        @Override
        public void writeRaw(String text) { lastRawText = text; }

        @Override
        public void writeRaw(String text, int offset, int len) { lastRawText = text.substring(offset, offset+len); }

        @Override
        public void writeRaw(char[] text, int offset, int len) { lastRawText = new String(text, offset, len); }

        @Override
        public void writeRaw(char c) { lastRawText = String.valueOf(c); }

        @Override
        public void writeRawValue(String text) { lastRawValueText = text; }

        @Override
        public void writeRawValue(String text, int offset, int len) { lastRawValueText = text.substring(offset, offset+len); }

        @Override
        public void writeRawValue(char[] text, int offset, int len) { lastRawValueText = new String(text, offset, len); }

        @Override
        public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) { binaryWritten = true; }

        @Override
        public int writeBinary(Base64Variant bv, java.io.InputStream data, int dataLength) { return dataLength; }

        @Override
        public void writeNumber(int v) { lastIntNumber = v; }

        @Override
        public void writeNumber(long v) { lastLongNumber = v; }

        @Override
        public void writeNumber(BigInteger v) { lastBigIntegerNumber = v; }

        @Override
        public void writeNumber(double v) { lastDoubleNumber = v; }

        @Override
        public void writeNumber(float v) { lastFloatNumber = v; }

        @Override
        public void writeNumber(BigDecimal v) { lastBigDecimalNumber = v; }

        @Override
        public void writeNumber(String encodedValue) {}

        @Override
        public void writeBoolean(boolean state) { lastBoolean = state; }

        @Override
        public void writeNull() { nullWritten = true; }

        @Override
        public void writeObject(Object pojo) { lastObjectWritten = pojo; }

        @Override
        public void writeTree(TreeNode rootNode) {}

        @Override
        public JsonStreamContext getOutputContext() { return context; }

        @Override
        public void flush() {}

        @Override
        public boolean isClosed() { return false; }

        @Override
        public void close() {}
    }

    private class TestStreamContext extends JsonStreamContext {
        Object currentValue;

        @Override
        public Object getCurrentValue() { return currentValue; }

        @Override
        public void setCurrentValue(Object v) { currentValue = v; }

        @Override
        public String getCurrentName() { return null; }

        @Override
        public JsonStreamContext getParent() { return null; }
    }

    private class TestFormatSchema implements FormatSchema {
        @Override
        public String getSchemaType() { return "test"; }
    }

    private class TestPrettyPrinter implements PrettyPrinter {
        @Override
        public void writeRootValueSeparator(JsonGenerator jg) {}
        @Override
        public void writeStartObject(JsonGenerator jg) {}
        @Override
        public void writeEndObject(JsonGenerator jg, int nrOfEntries) {}
        @Override
        public void writeObjectEntrySeparator(JsonGenerator jg) {}
        @Override
        public void writeObjectFieldValueSeparator(JsonGenerator jg) {}
        @Override
        public void writeStartArray(JsonGenerator jg) {}
        @Override
        public void writeEndArray(JsonGenerator jg, int nrOfValues) {}
        @Override
        public void writeArrayValueSeparator(JsonGenerator jg) {}
        @Override
        public void beforeObjectEntries(JsonGenerator jg) {}
        @Override
        public void beforeArrayValues(JsonGenerator jg) {}
    }

    private class TestCharacterEscapes extends CharacterEscapes {
        @Override
        public int[] getEscapeCodesForAscii() { return new int[128]; }

        @Override
        public SerializableString getEscapeSequence(int ch) { return null; }
    }

    private class TestSerializableString implements SerializableString {
        private final String value;

        TestSerializableString(String value) { this.value = value; }

        @Override
        public String getValue() { return value; }

        @Override
        public int charLength() { return value.length(); }

        @Override
        public char[] asQuotedChars() { return value.toCharArray(); }

        @Override
        public byte[] asUnquotedUTF8() { return value.getBytes(java.nio.charset.StandardCharsets.UTF_8); }

        @Override
        public byte[] asQuotedUTF8() { return value.getBytes(java.nio.charset.StandardCharsets.UTF_8); }
    }

    private class TestJsonParser extends JsonParser {
        private final JsonToken token;
        String currentName;
        String text;
        boolean hasTextChars;
        char[] textChars;
        int textOffset;
        int textLength;
        NumberType numberType;
        int intValue;
        long longValue;
        float floatValue;
        double doubleValue;
        BigInteger bigIntValue;
        BigDecimal decimalValue;
        Object embeddedObject;
        JsonToken nextToken;

        TestJsonParser(JsonToken token) { this.token = token; }

        @Override
        public JsonToken currentToken() { return token; }

        @Override
        public JsonToken nextToken() { return nextToken; }

        @Override
        public String getCurrentName() { return currentName; }

        @Override
        public String getText() { return text; }

        @Override
        public boolean hasTextCharacters() { return hasTextChars; }

        @Override
        public char[] getTextCharacters() { return textChars; }

        @Override
        public int getTextOffset() { return textOffset; }

        @Override
        public int getTextLength() { return textLength; }

        @Override
        public NumberType getNumberType() { return numberType; }

        @Override
        public int getIntValue() { return intValue; }

        @Override
        public long getLongValue() { return longValue; }

        @Override
        public BigInteger getBigIntegerValue() { return bigIntValue; }

        @Override
        public float getFloatValue() { return floatValue; }

        @Override
        public double getDoubleValue() { return doubleValue; }

        @Override
        public BigDecimal getDecimalValue() { return decimalValue; }

        @Override
        public Object getEmbeddedObject() { return embeddedObject; }

        @Override
        public JsonStreamContext getParsingContext() { return null; }

        @Override
        public void clearCurrentToken() {}

        @Override
        public JsonToken getLastClearedToken() { return null; }

        @Override
        public void overrideCurrentName(String name) {}

        @Override
        public boolean isClosed() { return false; }

        @Override
        public void close() {}
    }
}