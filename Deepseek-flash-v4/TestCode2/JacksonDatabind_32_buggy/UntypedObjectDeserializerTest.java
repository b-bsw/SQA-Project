package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import org.junit.Before;
import org.junit.Test;

public class UntypedObjectDeserializerTest {

    // --- Mock implementations ---
    private static class MockJsonParser extends JsonParser {
        int currentTokenId;
        int nextTokenId;
        String text;
        Object embedded;
        Number numberValue;
        double doubleVal;
        BigDecimal decimalVal;
        boolean useBigDecimal;
        JsonToken currentToken;
        String fieldName;
        boolean endArrayReached;
        int arrayTokenIndex = 0;
        int[] arrayTokenIds;
        int fieldNameIndex = -1;
        List<String> fieldNamesList = new ArrayList<>();
        int tokenSequenceIndex = 0;
        int[] tokenSequence;
        String[] tokenTexts;
        boolean hasNext;

        void setTokenSequence(int... ids) { tokenSequence = ids; tokenSequenceIndex = 0; }
        void setTokenTexts(String... txts) { tokenTexts = txts; }

        @Override public int getCurrentTokenId() { return currentTokenId; }
        @Override public JsonToken getCurrentToken() { return currentToken; }
        @Override public int nextToken() throws IOException {
            if (tokenSequence != null && tokenSequenceIndex < tokenSequence.length) {
                currentTokenId = tokenSequence[tokenSequenceIndex];
                if (tokenTexts != null && tokenSequenceIndex < tokenTexts.length) text = tokenTexts[tokenSequenceIndex];
                tokenSequenceIndex++;
                if (currentTokenId == JsonTokenId.ID_END_ARRAY) endArrayReached = true;
                return currentTokenId;
            }
            if (endArrayReached) return JsonTokenId.ID_END_ARRAY;
            return nextTokenId;
        }
        @Override public String nextFieldName() throws IOException {
            if (fieldNamesList != null && fieldNameIndex < fieldNamesList.size() - 1) {
                fieldNameIndex++;
                return fieldNamesList.get(fieldNameIndex);
            }
            return null;
        }
        @Override public String getText() throws IOException { return text; }
        @Override public Object getEmbeddedObject() throws IOException { return embedded; }
        @Override public Number getNumberValue() throws IOException { return numberValue; }
        @Override public double getDoubleValue() throws IOException { return doubleVal; }
        @Override public BigDecimal getDecimalValue() throws IOException { return decimalVal; }
        @Override public BigInteger getBigIntegerValue() throws IOException { return BigInteger.valueOf(numberValue.longValue()); }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public JsonToken nextValue() throws IOException { return null; }
        @Override public void close() throws IOException {}
        @Override public void clearCurrentToken() {}
        @Override public JsonParser skipChildren() throws IOException { return this; }
        @Override public boolean isClosed() { return false; }
    }

    private static class MockDeserializationContext extends DeserializationContext {
        TypeFactory typeFactory;
        boolean useJavaArrayForJsonArray;
        boolean useBigDecimalForFloats;
        boolean useBigIntegerForInts;
        boolean hasSomeOfFeatures;
        int fMask;
        ObjectBuffer objectBuffer = new ObjectBuffer();
        JsonDeserializer<Object> customListDeser;
        JsonDeserializer<Object> customMapDeser;
        JsonDeserializer<Object> customStringDeser;
        JsonDeserializer<Object> customNumberDeser;

        MockDeserializationContext() { super(null, null, null, null, null, null, null, null); }

        @Override
        public JavaType constructType(Class<?> cls) {
            return TypeFactory.defaultInstance().constructType(cls);
        }

        @Override
        public TypeFactory getTypeFactory() {
            if (typeFactory == null) typeFactory = new MockTypeFactory();
            return typeFactory;
        }

        @Override
        public JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType type) {
            if (type.getRawClass() == List.class) return customListDeser;
            if (type.getRawClass() == Map.class) return customMapDeser;
            if (type.getRawClass() == String.class) return customStringDeser;
            if (type.getRawClass() == Number.class) return customNumberDeser;
            return null;
        }

        @Override
        public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty property, JavaType type) {
            return deser;
        }

        @Override
        public boolean isEnabled(DeserializationFeature feature) {
            if (feature == DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) return useJavaArrayForJsonArray;
            if (feature == DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) return useBigDecimalForFloats;
            if (feature == DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) return useBigIntegerForInts;
            return false;
        }

        @Override
        public boolean hasSomeOfFeatures(int featureMask) {
            return hasSomeOfFeatures;
        }

        @Override
        public ObjectBuffer leaseObjectBuffer() { return objectBuffer; }

        @Override
        public JsonMappingException mappingException(Class<?> valueClass, JsonToken token) {
            return new JsonMappingException("mapping exception");
        }

        @Override
        public JsonMappingException mappingException(String msg) { return new JsonMappingException(msg); }

        @Override
        public JsonParser getParser() { return null; }
        @Override
        public JsonDeserializer<?> findRootValueDeserializer(JavaType type) { return null; }
        @Override
        public DeserializationConfig getConfig() { return null; }
        @Override
        public Class<?> getActiveView() { return null; }
        @Override
        public Object getAttribute(Object key) { return null; }
        @Override
        public void setAttribute(Object key, Object value) {}
        @Override
        public JsonDeserializer<?> handlePrimaryContextualization(JsonDeserializer<?> deser, BeanProperty property, JavaType type) { return deser; }
        @Override
        public int getFeatureFlags() { return 0; }
        @Override
        public void reportUnresolvedObjectId(Object reader, Object bean) {}
    }

    private static class MockTypeFactory extends TypeFactory {
        @Override
        public JavaType constructType(Class<?> cls) {
            return new JavaType() {
                @Override public Class<?> getRawClass() { return cls; }
                @Override public boolean isContainerType() { return false; }
                @Override public JavaType getContentType() { return null; }
                @Override public int containedTypeCount() { return 0; }
                @Override public String containedTypeName(int index) { return null; }
                @Override public JavaType containedType(int index) { return null; }
                @Override public JavaType getKeyType() { return null; }
                @Override public JavaType getReferencedType() { return null; }
                @Override public JavaType withContentType(JavaType contentType) { return null; }
                @Override public JavaType withTypeHandler(Object h) { return null; }
                @Override public JavaType withValueHandler(Object h) { return null; }
                @Override public JavaType withContentTypeHandler(Object h) { return null; }
                @Override public JavaType withContentValueHandler(Object h) { return null; }
                @Override public JavaType narrowBy(Class<?> subclass) { return null; }
                @Override public JavaType forceNarrowBy(Class<?> subclass) { return null; }
                @Override public JavaType widenBy(Class<?> superclass) { return null; }
                @Override public boolean isAbstract() { return false; }
                @Override public boolean isPrimitive() { return false; }
                @Override public boolean isFinal() { return false; }
                @Override public String genericSignature() { return null; }
                @Override public boolean isGenericType() { return false; }
                @Override public String toCanonical() { return null; }
                @Override public StringBuilder getGenericSignature(StringBuilder sb) { return null; }
                @Override public StringBuilder getErasedSignature(StringBuilder sb) { return null; }
            };
        }

        @Override
        public JavaType constructCollectionType(Class<? extends Collection> collectionClass, JavaType elementType) {
            return constructType(collectionClass);
        }

        @Override
        public JavaType constructMapType(Class<? extends Map> mapClass, JavaType keyType, JavaType valueType) {
            return constructType(mapClass);
        }

        @Override
        public JavaType unknownType() {
            return constructType(Object.class);
        }
    }

    // --- Tests for UntypedObjectDeserializer ---
    @Test
    public void testDefaultConstructor() {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertNull(d._listType);
        assertNull(d._mapType);
        assertNull(d._mapDeserializer);
        assertNull(d._listDeserializer);
        assertNull(d._stringDeserializer);
        assertNull(d._numberDeserializer);
    }

    @Test
    public void testConstructorWithTypes() {
        JavaType listType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType mapType = TypeFactory.defaultInstance().constructType(Map.class);
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(listType, mapType);
        assertSame(listType, d._listType);
        assertSame(mapType, d._mapType);
    }

    @Test
    public void testIsCachable() {
        assertTrue(new UntypedObjectDeserializer().isCachable());
    }

    @Test
    public void testResolveNullTypes() throws Exception {
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        // set custom deserializers to simulate non-std
        JsonDeserializer<Object> listDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };
        JsonDeserializer<Object> mapDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };
        JsonDeserializer<Object> stringDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };
        JsonDeserializer<Object> numberDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };
        ctxt.customListDeser = listDeser;
        ctxt.customMapDeser = mapDeser;
        ctxt.customStringDeser = stringDeser;
        ctxt.customNumberDeser = numberDeser;
        d.resolve(ctxt);
        assertSame(listDeser, d._listDeserializer);
        assertSame(mapDeser, d._mapDeserializer);
        assertSame(stringDeser, d._stringDeserializer);
        assertSame(numberDeser, d._numberDeserializer);
    }

    @Test
    public void testResolveWithTypes() throws Exception {
        MockDeserializationContext ctxt = new MockDeserializationContext();
        JavaType listType = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JavaType mapType = TypeFactory.defaultInstance().constructType(HashMap.class);
        UntypedObjectDeserializer d = new UntypedObjectDeserializer(listType, mapType);
        // custom deserializers for these types
        JsonDeserializer<Object> listDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };
        JsonDeserializer<Object> mapDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };
        ctxt.customListDeser = listDeser;
        ctxt.customMapDeser = mapDeser;
        d.resolve(ctxt);
        assertSame(listDeser, d._listDeserializer);
        assertSame(mapDeser, d._mapDeserializer);
    }

    @Test
    public void testCreateContextualAllNullReturnsVanilla() {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        MockDeserializationContext ctxt = new MockDeserializationContext();
        JsonDeserializer<?> result = d.createContextual(ctxt, null);
        assertTrue(result instanceof UntypedObjectDeserializer.Vanilla);
    }

    @Test
    public void testCreateContextualWithDeserializerReturnsThis() {
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        d._stringDeserializer = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };
        MockDeserializationContext ctxt = new MockDeserializationContext();
        JsonDeserializer<?> result = d.createContextual(ctxt, null);
        assertSame(d, result);
    }

    @Test
    public void testDeserializeStartObjectWithMapDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_OBJECT;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        JsonDeserializer<Object> mapDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return "map-result"; }
        };
        d._mapDeserializer = mapDeser;
        Object result = d.deserialize(p, ctxt);
        assertEquals("map-result", result);
    }

    @Test
    public void testDeserializeStartObjectNoMapDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_OBJECT;
        p.currentToken = JsonToken.START_OBJECT;
        p.tokenSequence = new int[]{JsonTokenId.ID_FIELD_NAME, JsonTokenId.ID_END_OBJECT};
        p.fieldNamesList = Arrays.asList("a", null);
        p.tokenTexts = null; // text used later?
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        Object result = d.deserialize(p, ctxt);
        assertTrue(result instanceof LinkedHashMap);
        assertEquals(0, ((LinkedHashMap)result).size());
    }

    @Test
    public void testDeserializeStartArrayWithJavaArray() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_ARRAY;
        p.nextTokenId = JsonTokenId.ID_END_ARRAY;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        ctxt.useJavaArrayForJsonArray = true;
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        Object result = d.deserialize(p, ctxt);
        assertTrue(result instanceof Object[]);
        assertEquals(0, ((Object[])result).length);
    }

    @Test
    public void testDeserializeStartArrayWithListDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_ARRAY;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        JsonDeserializer<Object> listDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return "list-result"; }
        };
        d._listDeserializer = listDeser;
        Object result = d.deserialize(p, ctxt);
        assertEquals("list-result", result);
    }

    @Test
    public void testDeserializeStartArrayNoListDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_ARRAY;
        p.tokenSequence = new int[]{JsonTokenId.ID_END_ARRAY};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        Object result = d.deserialize(p, ctxt);
        assertTrue(result instanceof ArrayList);
        assertEquals(0, ((ArrayList)result).size());
    }

    @Test
    public void testDeserializeStringWithStringDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_STRING;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        JsonDeserializer<Object> stringDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return "string-result"; }
        };
        d._stringDeserializer = stringDeser;
        assertEquals("string-result", d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeStringNoStringDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_STRING;
        p.text = "hello";
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertEquals("hello", d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeNumberIntWithNumberDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NUMBER_INT;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        JsonDeserializer<Object> numberDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return 42; }
        };
        d._numberDeserializer = numberDeser;
        assertEquals(42, d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeNumberIntWithCoercion() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NUMBER_INT;
        p.numberValue = 123;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        ctxt.hasSomeOfFeatures = true;
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        // will call _coerceIntegral -> we cannot test exact output without actual impl, but we can verify it returns something
        Object result = d.deserialize(p, ctxt);
        assertNotNull(result);
    }

    @Test
    public void testDeserializeNumberIntDefault() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NUMBER_INT;
        p.numberValue = 456;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        ctxt.hasSomeOfFeatures = false;
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertEquals(456, d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeNumberFloatWithNumberDeser() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NUMBER_FLOAT;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        JsonDeserializer<Object> numberDeser = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return 1.5; }
        };
        d._numberDeserializer = numberDeser;
        assertEquals(1.5, d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeNumberFloatWithBigDecimal() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NUMBER_FLOAT;
        p.decimalVal = new BigDecimal("2.5");
        MockDeserializationContext ctxt = new MockDeserializationContext();
        ctxt.useBigDecimalForFloats = true;
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertEquals(new BigDecimal("2.5"), d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeNumberFloatDefault() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NUMBER_FLOAT;
        p.doubleVal = 3.14;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertEquals(3.14, d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeTrue() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_TRUE;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertEquals(Boolean.TRUE, d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeFalse() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_FALSE;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertEquals(Boolean.FALSE, d.deserialize(p, ctxt));
    }

    @Test
    public void testDeserializeNull() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NULL;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertNull(d.deserialize(p, ctxt));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeDefaultToken() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_NOT_AVAILABLE;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        d.deserialize(p, ctxt);
    }

    @Test
    public void testDeserializeWithTypeStartArray() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_ARRAY;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        TypeDeserializer typeDeser = new TypeDeserializer() {
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) { return "typed-array"; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return null; }
        };
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        assertEquals("typed-array", d.deserializeWithType(p, ctxt, typeDeser));
    }

    @Test
    public void testMapArrayEmpty() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.nextTokenId = JsonTokenId.ID_END_ARRAY;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        Object result = d.mapArray(p, ctxt);
        assertTrue(result instanceof ArrayList);
        assertEquals(0, ((ArrayList)result).size());
    }

    @Test
    public void testMapArrayOneElement() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.tokenSequence = new int[]{JsonTokenId.ID_STRING, JsonTokenId.ID_END_ARRAY};
        p.tokenTexts = new String[]{"a", null};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        @SuppressWarnings("unchecked")
        ArrayList<Object> result = (ArrayList<Object>) d.mapArray(p, ctxt);
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    public void testMapArrayTwoElements() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.tokenSequence = new int[]{JsonTokenId.ID_STRING, JsonTokenId.ID_STRING, JsonTokenId.ID_END_ARRAY};
        p.tokenTexts = new String[]{"x", "y", null};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        @SuppressWarnings("unchecked")
        ArrayList<Object> result = (ArrayList<Object>) d.mapArray(p, ctxt);
        assertEquals(2, result.size());
        assertEquals("x", result.get(0));
        assertEquals("y", result.get(1));
    }

    @Test
    public void testMapArrayManyElements() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.tokenSequence = new int[]{JsonTokenId.ID_STRING, JsonTokenId.ID_STRING, JsonTokenId.ID_STRING, JsonTokenId.ID_END_ARRAY};
        p.tokenTexts = new String[]{"a", "b", "c", null};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        @SuppressWarnings("unchecked")
        ArrayList<Object> result = (ArrayList<Object>) d.mapArray(p, ctxt);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
        assertEquals("c", result.get(2));
    }

    @Test
    public void testMapObjectEmpty() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentToken = JsonToken.START_OBJECT;
        p.tokenSequence = new int[]{JsonTokenId.ID_END_OBJECT};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        Object result = d.mapObject(p, ctxt);
        assertTrue(result instanceof LinkedHashMap);
        assertEquals(0, ((LinkedHashMap)result).size());
    }

    @Test
    public void testMapObjectOneKey() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentToken = JsonToken.START_OBJECT;
        p.fieldNamesList = Arrays.asList("k1", null);
        p.tokenSequence = new int[]{JsonTokenId.ID_FIELD_NAME, JsonTokenId.ID_STRING, JsonTokenId.ID_END_OBJECT};
        p.tokenTexts = new String[]{null, "v1", null};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        @SuppressWarnings("unchecked")
        LinkedHashMap<String, Object> result = (LinkedHashMap<String, Object>) d.mapObject(p, ctxt);
        assertEquals(1, result.size());
        assertEquals("v1", result.get("k1"));
    }

    @Test
    public void testMapObjectTwoKeys() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentToken = JsonToken.START_OBJECT;
        p.fieldNamesList = Arrays.asList("k1", "k2", null);
        p.tokenSequence = new int[]{JsonTokenId.ID_FIELD_NAME, JsonTokenId.ID_STRING, JsonTokenId.ID_FIELD_NAME, JsonTokenId.ID_STRING, JsonTokenId.ID_END_OBJECT};
        p.tokenTexts = new String[]{null, "v1", null, "v2", null};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        @SuppressWarnings("unchecked")
        LinkedHashMap<String, Object> result = (LinkedHashMap<String, Object>) d.mapObject(p, ctxt);
        assertEquals(2, result.size());
        assertEquals("v1", result.get("k1"));
        assertEquals("v2", result.get("k2"));
    }

    @Test
    public void testMapObjectManyKeys() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentToken = JsonToken.START_OBJECT;
        p.fieldNamesList = Arrays.asList("k1", "k2", "k3", null);
        p.tokenSequence = new int[]{JsonTokenId.ID_FIELD_NAME, JsonTokenId.ID_STRING,
                JsonTokenId.ID_FIELD_NAME, JsonTokenId.ID_STRING,
                JsonTokenId.ID_FIELD_NAME, JsonTokenId.ID_STRING,
                JsonTokenId.ID_END_OBJECT};
        p.tokenTexts = new String[]{null, "v1", null, "v2", null, "v3", null};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        @SuppressWarnings("unchecked")
        LinkedHashMap<String, Object> result = (LinkedHashMap<String, Object>) d.mapObject(p, ctxt);
        assertEquals(3, result.size());
        assertEquals("v1", result.get("k1"));
        assertEquals("v2", result.get("k2"));
        assertEquals("v3", result.get("k3"));
    }

    @Test
    public void testMapArrayToArrayEmpty() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.nextTokenId = JsonTokenId.ID_END_ARRAY;
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        Object[] result = d.mapArrayToArray(p, ctxt);
        assertSame(UntypedObjectDeserializer.NO_OBJECTS, result);
    }

    @Test
    public void testMapArrayToArrayNonEmpty() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.tokenSequence = new int[]{JsonTokenId.ID_STRING, JsonTokenId.ID_STRING, JsonTokenId.ID_END_ARRAY};
        p.tokenTexts = new String[]{"a", "b", null};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer d = new UntypedObjectDeserializer();
        Object[] result = d.mapArrayToArray(p, ctxt);
        assertArrayEquals(new Object[]{"a", "b"}, result);
    }

    @Test
    public void testVanillaDeserialize() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_OBJECT;
        p.currentToken = JsonToken.START_OBJECT;
        p.tokenSequence = new int[]{JsonTokenId.ID_END_OBJECT};
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        Object result = v.deserialize(p, ctxt);
        assertTrue(result instanceof LinkedHashMap);
        assertEquals(0, ((LinkedHashMap)result).size());
    }

    @Test
    public void testVanillaDeserializeWithType() throws Exception {
        MockJsonParser p = new MockJsonParser();
        p.currentTokenId = JsonTokenId.ID_START_ARRAY;
        TypeDeserializer typeDeser = new TypeDeserializer() {
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) { return "vanilla-typed"; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return null; }
        };
        MockDeserializationContext ctxt = new MockDeserializationContext();
        UntypedObjectDeserializer.Vanilla v = new UntypedObjectDeserializer.Vanilla();
        assertEquals("vanilla-typed", v.deserializeWithType(p, ctxt, typeDeser));
    }
}