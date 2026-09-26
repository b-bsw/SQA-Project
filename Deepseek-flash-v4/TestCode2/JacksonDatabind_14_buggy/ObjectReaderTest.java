package com.fasterxml.jackson.databind;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;

public class ObjectReaderTest {

    private ObjectMapper mapper;
    private ObjectReader reader;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        reader = mapper.reader();
    }

    @Test
    public void testWithInjectableValuesSameReturnsThis() {
        InjectableValues inj = new InjectableValues.Std();
        ObjectReader r = reader.with(inj);
        ObjectReader r2 = r.with(inj);
        assertSame("same InjectableValues should return this", r, r2);
    }

    @Test
    public void testWithInjectableValuesDifferentReturnsNew() {
        InjectableValues inj1 = new InjectableValues.Std();
        InjectableValues inj2 = new InjectableValues.Std();
        ObjectReader r = reader.with(inj1);
        ObjectReader r2 = r.with(inj2);
        assertNotNull(r2);
        assertNotSame("different InjectableValues should give new reader", r, r2);
    }

    @Test
    public void testWithJsonFactorySameReturnsThis() {
        JsonFactory f = reader._parserFactory;
        ObjectReader r = reader.with(f);
        assertSame("same JsonFactory should return this", reader, r);
    }

    @Test
    public void testWithJsonFactoryDifferentReturnsNewAndSetsCodec() {
        JsonFactory f = new JsonFactory();
        ObjectReader r = reader.with(f);
        assertNotNull(r);
        assertNotSame("different JsonFactory should return new reader", reader, r);
        assertSame("new factory's codec should be the returned reader", r, f.getCodec());
    }

    @Test
    public void testForTypeSameTypeReturnsThis() {
        JavaType type = reader.getTypeFactory().constructType(String.class);
        ObjectReader r = reader.forType(type);
        ObjectReader r2 = r.forType(type);
        assertSame("forType with same type should return this", r, r2);
    }

    @Test
    public void testForTypeDifferentTypeReturnsNew() {
        JavaType type1 = reader.getTypeFactory().constructType(String.class);
        JavaType type2 = reader.getTypeFactory().constructType(Integer.class);
        ObjectReader r = reader.forType(type1);
        ObjectReader r2 = r.forType(type2);
        assertNotNull(r2);
        assertNotSame("forType with different type should return new reader", r, r2);
    }

    @Test
    public void testForTypeNullTypeReturnsThis() {
        ObjectReader r = reader.forType((JavaType) null);
        assertSame("forType(null) should return the same reader if _valueType also null", reader, r);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithValueToUpdateNullThrows() {
        reader.withValueToUpdate(null);
    }

    @Test
    public void testWithValueToUpdateSameReturnsThis() {
        Object value = new Object();
        ObjectReader r = reader.withValueToUpdate(value);
        ObjectReader r2 = r.withValueToUpdate(value);
        assertSame("same valueToUpdate should return this", r, r2);
    }

    @Test
    public void testWithValueToUpdateDifferentReturnsNew() {
        Object value1 = new Object();
        Object value2 = new Object();
        ObjectReader r = reader.withValueToUpdate(value1);
        ObjectReader r2 = r.withValueToUpdate(value2);
        assertNotNull(r2);
        assertNotSame("different valueToUpdate should return new reader", r, r2);
    }

    @Test
    public void testVerifySchemaTypeNullDoesNotThrow() {
        reader._verifySchemaType(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifySchemaTypeIncompatibleThrows() {
        FormatSchema schema = new FormatSchema() {
            @Override
            public String getSchemaType() { return "not-json"; }
        };
        reader._verifySchemaType(schema);
    }

    @Test
    public void testIsEnabledDeserializationFeature() {
        assertTrue("FAIL_ON_UNKNOWN_PROPERTIES should be enabled by default",
                reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testIsEnabledMapperFeature() {
        assertTrue("AUTO_DETECT_GETTERS should be enabled by default",
                reader.isEnabled(MapperFeature.AUTO_DETECT_GETTERS));
    }

    @Test(expected = JsonMappingException.class)
    public void testInitForReadingNoContentThrows() throws Exception {
        StubJsonParser p = new StubJsonParser(null, null);
        reader._initForReading(p);
    }

    @Test
    public void testInitForReadingCurrentTokenNotNull() throws Exception {
        StubJsonParser p = new StubJsonParser(JsonToken.START_OBJECT, null);
        JsonToken t = reader._initForReading(p);
        assertSame("should return current token", JsonToken.START_OBJECT, t);
    }

    @Test
    public void testBindNullTokenReturnsNull() throws Exception {
        ObjectReader r = reader.forType(String.class);
        StubJsonParser p = new StubJsonParser(JsonToken.VALUE_NULL, null);
        Object result = r._bind(p, null);
        assertNull("binding null token should return null", result);
    }

    @Test
    public void testBindEndObjectReturnsNullValueToUpdate() throws Exception {
        ObjectReader r = reader.forType(String.class);
        StubJsonParser p = new StubJsonParser(JsonToken.END_OBJECT, null);
        Object result = r._bind(p, null);
        assertNull("binding END_OBJECT should return null when no valueToUpdate", result);
    }

    @Test
    public void testBindWithValueToUpdateNullToken() throws Exception {
        ObjectReader r = reader.forType(String.class);
        Object value = new Object();
        StubJsonParser p = new StubJsonParser(JsonToken.VALUE_NULL, null);
        Object result = r._bind(p, value);
        assertSame("binding VALUE_NULL with valueToUpdate should return the value", value, result);
    }

    @Test
    public void testFindRootDeserializerPrefetched() throws Exception {
        ObjectReader r = reader.forType(String.class);
        DeserializationContext ctxt = r.createDeserializationContext(null, r._config);
        JsonDeserializer<Object> deser = r._findRootDeserializer(ctxt,
                r.getTypeFactory().constructType(String.class));
        assertNotNull("should find deserializer for String", deser);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindRootDeserializerNullTypeThrows() throws Exception {
        DeserializationContext ctxt = reader.createDeserializationContext(null, reader._config);
        reader._findRootDeserializer(ctxt, null);
    }

    @Test
    public void testPrefetchRootDeserializerDisabledFeature() {
        DeserializationConfig config = reader._config.without(DeserializationFeature.EAGER_DESERIALIZER_FETCH);
        ObjectReader r = new ObjectReader(reader, config);
        JavaType type = r.getTypeFactory().constructType(Integer.class);
        JsonDeserializer<Object> deser = r._prefetchRootDeserializer(config, type);
        assertNull("should return null when feature disabled", deser);
    }

    @Test
    public void testWithRootName() {
        ObjectReader r = reader.withRootName("root");
        assertNotNull(r);
        assertNotSame("withRootName should return new reader", reader, r);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithSchemaIncompatibleThrows() {
        FormatSchema schema = new FormatSchema() {
            @Override public String getSchemaType() { return "unknown"; }
        };
        reader.with(schema);
    }

    @Test
    public void testReadValueString() throws Exception {
        String json = "\"hello\"";
        ObjectReader r = reader.forType(String.class);
        String result = (String) r.readValue(json);
        assertEquals("hello", result);
    }

    @Test
    public void testReadTreeString() throws Exception {
        JsonNode node = reader.readTree("{\"a\":1}");
        assertNotNull(node);
        assertTrue(node.isObject());
    }

    @Test
    public void testReadValuesString() throws Exception {
        ObjectReader r = reader.forType(Integer.class);
        MappingIterator<Integer> it = r.readValues("[1,2,3]");
        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(1), it.next());
    }

    @Test
    public void testReadValueParserSimple() throws Exception {
        String json = "\"test\"";
        JsonParser p = reader.getFactory().createParser(json);
        ObjectReader r = reader.forType(String.class);
        String result = r.readValue(p);
        assertEquals("test", result);
    }

    @Test
    public void testWithDeserializationFeature() {
        ObjectReader r = reader.with(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS);
        assertNotSame("with feature should return new reader", reader, r);
        assertTrue(r.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS));
    }

    @Test
    public void testWithDeserializationConfig() {
        DeserializationConfig newConfig = reader._config.with(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        ObjectReader r = reader.with(newConfig);
        assertNotNull(r);
        assertTrue(r.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteTreeThrows() {
        reader.writeTree(null, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteValueThrows() throws Exception {
        reader.writeValue(null, null);
    }

    private static class StubJsonParser extends JsonParser {
        private JsonToken currentToken;
        private JsonToken nextToken;
        private boolean closed;

        StubJsonParser(JsonToken current, JsonToken next) {
            this.currentToken = current;
            this.nextToken = next;
        }

        @Override public JsonToken getCurrentToken() { return currentToken; }
        @Override public JsonToken nextToken() throws IOException {
            currentToken = nextToken;
            return currentToken;
        }
        @Override public void clearCurrentToken() { currentToken = null; }
        @Override public void close() throws IOException { closed = true; }
        @Override public boolean isClosed() { return closed; }
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) {}
        @Override public void overrideCurrentName(String name) {}
        @Override public Version version() { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public String getText() throws IOException { return null; }
        @Override public char[] getTextCharacters() throws IOException { return null; }
        @Override public int getTextLength() throws IOException { return 0; }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public Number getNumberValue() throws IOException { return null; }
        @Override public NumberType getNumberType() throws IOException { return null; }
        @Override public int getIntValue() throws IOException { return 0; }
        @Override public long getLongValue() throws IOException { return 0; }
        @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
        @Override public float getFloatValue() throws IOException { return 0; }
        @Override public double getDoubleValue() throws IOException { return 0; }
        @Override public BigDecimal getDecimalValue() throws IOException { return null; }
        @Override public byte[] getBinaryValue(Base64Variant bv) throws IOException { return null; }
        @Override public JsonToken nextValue() throws IOException { return null; }
        @Override public JsonParser skipChildren() throws IOException { return this; }
    }
}