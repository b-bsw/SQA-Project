import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;

public class UTF8StreamJsonParserTest {

    private static JsonParser parser(String json) throws Exception {
        return new JsonFactory().createParser(
                new ByteArrayInputStream(json.getBytes("UTF-8")));
    }

    private static JsonParser parser(JsonFactory f, String json) throws Exception {
        return f.createParser(
                new ByteArrayInputStream(json.getBytes("UTF-8")));
    }

    private static void assertToken(JsonToken expected, JsonToken actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyInputAndWhitespace() throws Exception {
        try (JsonParser p = parser("   ")) {
            assertNull(p.nextToken());
            assertNull(p.getText());
        }
    }

    @Test
    public void testSimpleObjectAndInputSource() throws Exception {
        try (JsonParser p = parser("{\"a\":1}")) {
            assertTrue(p.getInputSource() instanceof InputStream);

            assertToken(JsonToken.START_OBJECT, p.nextToken());
            assertToken(JsonToken.FIELD_NAME, p.nextToken());
            assertEquals("a", p.getCurrentName());

            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(1, p.getIntValue());

            assertToken(JsonToken.END_OBJECT, p.nextToken());
            assertNull(p.nextToken());
        }
    }

    @Test
    public void testReleaseBuffered() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try (JsonParser p = parser("{\"a\":1}")) {
            assertToken(JsonToken.START_OBJECT, p.nextToken());

            int released = p.releaseBuffered(out);
            assertEquals(6, released);
            assertEquals("\"a\":1}", out.toString("UTF-8"));
        }

        out.reset();

        try (JsonParser p = parser("{}")) {
            assertToken(JsonToken.START_OBJECT, p.nextToken());
            assertToken(JsonToken.END_OBJECT, p.nextToken());
            assertNull(p.nextToken());

            assertEquals(0, p.releaseBuffered(out));
            assertEquals(0, out.size());
        }
    }

    @Test
    public void testGetTextAndValueAsString() throws Exception {
        try (JsonParser p = parser("{\"field\":\"value\",\"num\":42}")) {
            assertToken(JsonToken.START_OBJECT, p.nextToken());

            assertToken(JsonToken.FIELD_NAME, p.nextToken());
            assertEquals("field", p.getText());
            assertEquals(5, p.getTextLength());
            assertEquals(0, p.getTextOffset());
            assertEquals("field", new String(
                    p.getTextCharacters(),
                    p.getTextOffset(),
                    p.getTextLength()));

            assertToken(JsonToken.VALUE_STRING, p.nextToken());
            assertEquals("value", p.getText());
            assertEquals("value", p.getValueAsString());
            assertEquals("value", p.getValueAsString("def"));
            assertEquals("value", new String(
                    p.getTextCharacters(),
                    p.getTextOffset(),
                    p.getTextLength()));

            assertToken(JsonToken.FIELD_NAME, p.nextToken());
            assertEquals("num", p.getText());

            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(42, p.getIntValue());
            assertEquals("42", p.getValueAsString());
            assertEquals("42", p.getValueAsString("def"));
        }
    }

    @Test
    public void testNullValueAsString() throws Exception {
        try (JsonParser p = parser("null")) {
            assertToken(JsonToken.VALUE_NULL, p.nextToken());
            assertNull(p.getValueAsString());
            assertEquals("def", p.getValueAsString("def"));
        }
    }

    @Test
    public void testArrayPrimitivesAndNumbers() throws Exception {
        try (JsonParser p = parser("[true,false,null,0,1.5,-2e2,1234567890123]")) {
            assertToken(JsonToken.START_ARRAY, p.nextToken());

            assertEquals(Boolean.TRUE, p.nextBooleanValue());
            assertToken(JsonToken.VALUE_FALSE, p.nextToken());

            assertToken(JsonToken.VALUE_NULL, p.nextToken());

            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(0, p.getIntValue());

            assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
            assertEquals(1.5, p.getDoubleValue(), 0.0);

            assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
            assertEquals(-2e2, p.getDoubleValue(), 0.0);

            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(1234567890123L, p.getLongValue());

            assertToken(JsonToken.END_ARRAY, p.nextToken());
        }
    }

    @Test
    public void testConvenienceNextMethods() throws Exception {
        try (JsonParser p = parser(
                "{\"a\":1,\"b\":true,\"c\":1234567890123,\"d\":\"x\"}")) {

            assertToken(JsonToken.START_OBJECT, p.nextToken());

            assertTrue(p.nextFieldName(new SerializedString("a")));
            assertEquals("a", p.getCurrentName());
            assertEquals(1, p.nextIntValue(-1));

            assertTrue(p.nextFieldName(new SerializedString("b")));
            assertEquals(Boolean.TRUE, p.nextBooleanValue());

            assertTrue(p.nextFieldName(new SerializedString("c")));
            assertEquals(1234567890123L, p.nextLongValue(-1L));

            assertTrue(p.nextFieldName(new SerializedString("d")));
            assertEquals("x", p.nextTextValue());

            assertToken(JsonToken.END_OBJECT, p.nextToken());
        }
    }

    @Test
    public void testNextFieldNameNonMatch() throws Exception {
        try (JsonParser p = parser("{\"a\":1}")) {
            assertToken(JsonToken.START_OBJECT, p.nextToken());
            assertFalse(p.nextFieldName(new SerializedString("z")));
            assertEquals("a", p.getCurrentName());

            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(1, p.getIntValue());
        }
    }

    @Test
    public void testSingleQuotes() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);

        try (JsonParser p = parser(f, "['text']")) {
            assertToken(JsonToken.START_ARRAY, p.nextToken());
            assertEquals("text", p.nextTextValue());
            assertToken(JsonToken.END_ARRAY, p.nextToken());
        }
    }

    @Test
    public void testComments() throws Exception {
        JsonFactory f = new JsonFactory();
        f.enable(JsonParser.Feature.ALLOW_COMMENTS);

        try (JsonParser p = parser(f, "{\"a\"/*c*/:1//line\n}")) {
            assertToken(JsonToken.START_OBJECT, p.nextToken());

            assertToken(JsonToken.FIELD_NAME, p.nextToken());
            assertEquals("a", p.getText());

            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(1, p.getIntValue());

            assertToken(JsonToken.END_OBJECT, p.nextToken());
        }
    }

    @Test
    public void testUnicodeEscape() throws Exception {
        try (JsonParser p = parser("\"\\u0041\"")) {
            assertToken(JsonToken.VALUE_STRING, p.nextToken());
            assertEquals("A", p.getText());
        }
    }

    @Test
    public void testLongStringValue() throws Exception {
        String value = new String(new char[1000]).replace('\0', 'x');

        try (JsonParser p = parser("\"" + value + "\"")) {
            assertToken(JsonToken.VALUE_STRING, p.nextToken());
            assertEquals(value, p.getText());
        }
    }

    @Test
    public void testManyFields() throws Exception {
        int count = 100;
        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i < count; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append("\"f").append(i).append("\":").append(i);
        }
        sb.append('}');

        try (JsonParser p = parser(sb.toString())) {
            assertToken(JsonToken.START_OBJECT, p.nextToken());

            for (int i = 0; i < count; i++) {
                assertToken(JsonToken.FIELD_NAME, p.nextToken());
                assertEquals("f" + i, p.getText());

                assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
                assertEquals(i, p.getIntValue());
            }

            assertToken(JsonToken.END_OBJECT, p.nextToken());
        }
    }

    @Test
    public void testNumericValues() throws Exception {
        try (JsonParser p = parser("[-0, 1.25, 1e3, -2.5E-2]")) {
            assertToken(JsonToken.START_ARRAY, p.nextToken());

            assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals("-0", p.getText());
            assertEquals(0, p.getIntValue());

            assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
            assertEquals(1.25, p.getDoubleValue(), 0.0);

            assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
            assertEquals(1000.0, p.getDoubleValue(), 0.0);

            assertToken(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
            assertEquals(-0.025, p.getDoubleValue(), 1e-9);
        }
    }

    @Test
    public void testBinaryData() throws Exception {
        byte[] data = new byte[] {0, 1, 2, 10, 127, (byte)128, (byte)255};
        Base64Variant b64 = Base64Variants.getDefaultVariant();
        String encoded = b64.encode(data);

        try (JsonParser p = parser("\"" + encoded + "\"")) {
            assertToken(JsonToken.VALUE_STRING, p.nextToken());
            assertArrayEquals(data, p.getBinaryValue(b64));
        }

        try (JsonParser p = parser("\"" + encoded + "\"")) {
            assertToken(JsonToken.VALUE_STRING, p.nextToken());

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int count = p.readBinaryValue(b64, out);

            assertEquals(data.length, count);
            assertArrayEquals(data, out.toByteArray());
        }
    }

    @Test
    public void testCodecAccessors() throws Exception {
        try (JsonParser p = parser("[]")) {
            assertNull(p.getCodec());
            p.setCodec(null);
        }
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidValue() throws Exception {
        try (JsonParser p = parser("[tru]")) {
            assertToken(JsonToken.START_ARRAY, p.nextToken());
            p.nextToken();
            fail("Should have thrown JsonParseException");
        }
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedEof() throws Exception {
        try (JsonParser p = parser("{\"a\":")) {
            p.nextToken();
            p.nextToken();
            p.nextToken();
        }
    }
}