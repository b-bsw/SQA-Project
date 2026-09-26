package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;
import org.junit.Test;
import java.io.*;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import static org.junit.Assert.*;

public class TypeAdaptersTest {

    private JsonReader reader(String json) {
        return new JsonReader(new StringReader(json));
    }

    private JsonWriter writer() throws IOException {
        return new JsonWriter(new StringWriter());
    }

    // ---- CLASS adapter ----
    @Test
    public void testClassWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.CLASS.write(out, null);
        out.flush();
        assertEquals("null", sw.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassWriteNonNull() throws IOException {
        JsonWriter out = writer();
        TypeAdapters.CLASS.write(out, String.class);
    }

    @Test
    public void testClassReadNull() throws IOException {
        JsonReader in = reader("null");
        assertNull(TypeAdapters.CLASS.read(in));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassReadNonNull() throws IOException {
        JsonReader in = reader("\"test\"");
        TypeAdapters.CLASS.read(in);
    }

    // ---- BitSet adapter ----
    @Test
    public void testBitSetReadEmptyArray() throws IOException {
        JsonReader in = reader("[]");
        BitSet bs = TypeAdapters.BIT_SET.read(in);
        assertNotNull(bs);
        assertEquals(0, bs.length());
    }

    @Test
    public void testBitSetReadNumbers() throws IOException {
        JsonReader in = reader("[1,0,1]");
        BitSet bs = TypeAdapters.BIT_SET.read(in);
        assertTrue(bs.get(0));
        assertFalse(bs.get(1));
        assertTrue(bs.get(2));
    }

    @Test
    public void testBitSetReadBoolean() throws IOException {
        JsonReader in = reader("[true,false]");
        BitSet bs = TypeAdapters.BIT_SET.read(in);
        assertTrue(bs.get(0));
        assertFalse(bs.get(1));
    }

    @Test
    public void testBitSetReadString() throws IOException {
        JsonReader in = reader("[\"1\",\"0\"]");
        BitSet bs = TypeAdapters.BIT_SET.read(in);
        assertTrue(bs.get(0));
        assertFalse(bs.get(1));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadInvalidToken() throws IOException {
        JsonReader in = reader("[\"x\"]");
        TypeAdapters.BIT_SET.read(in);
    }

    @Test
    public void testBitSetWriteNull() throws IOException {
        JsonWriter out = writer();
        TypeAdapters.BIT_SET.write(out, null);
        out.flush();
        // write method writes null value for null
        // Actually the write method does: if (src == null) { out.nullValue(); return; }
        // So we expect "null"
        // But we need to check
        StringWriter sw = new StringWriter();
        JsonWriter out2 = new JsonWriter(sw);
        TypeAdapters.BIT_SET.write(out2, null);
        out2.flush();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBitSetWriteNormal() throws IOException {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BIT_SET.write(out, bs);
        out.flush();
        assertEquals("[1,0,1]", sw.toString());
    }

    // ---- Boolean adapter ----
    @Test
    public void testBooleanReadNull() throws IOException {
        JsonReader in = reader("null");
        assertNull(TypeAdapters.BOOLEAN.read(in));
    }

    @Test
    public void testBooleanReadString() throws IOException {
        JsonReader in = reader("\"true\"");
        assertTrue(TypeAdapters.BOOLEAN.read(in));
    }

    @Test
    public void testBooleanReadBoolean() throws IOException {
        JsonReader in = reader("false");
        assertFalse(TypeAdapters.BOOLEAN.read(in));
    }

    @Test
    public void testBooleanWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BOOLEAN.write(out, null);
        out.flush();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBooleanWriteValue() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BOOLEAN.write(out, Boolean.TRUE);
        out.flush();
        assertEquals("true", sw.toString());
    }

    // ---- NUMBER adapter ----
    @Test
    public void testNumberReadNull() throws IOException {
        JsonReader in = reader("null");
        assertNull(TypeAdapters.NUMBER.read(in));
    }

    @Test
    public void testNumberReadNumber() throws IOException {
        JsonReader in = reader("42.5");
        Number n = TypeAdapters.NUMBER.read(in);
        assertNotNull(n);
        assertEquals("42.5", n.toString());
        assertTrue(n instanceof LazilyParsedNumber);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testNumberReadUnexpectedToken() throws IOException {
        JsonReader in = reader("\"abc\"");
        TypeAdapters.NUMBER.read(in);
    }

    // ---- BigDecimal adapter ----
    @Test
    public void testBigDecimalReadNull() throws IOException {
        JsonReader in = reader("null");
        assertNull(TypeAdapters.BIG_DECIMAL.read(in));
    }

    @Test
    public void testBigDecimalReadNormal() throws IOException {
        JsonReader in = reader("123.456");
        BigDecimal bd = TypeAdapters.BIG_DECIMAL.read(in);
        assertEquals(new BigDecimal("123.456"), bd);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBigDecimalReadInvalidFormat() throws IOException {
        JsonReader in = reader("\"notanumber\"");
        TypeAdapters.BIG_DECIMAL.read(in);
    }

    // ---- JSON_ELEMENT adapter ----
    @Test
    public void testJsonElementReadString() throws IOException {
        JsonReader in = reader("\"hello\"");
        JsonElement el = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(el.isJsonPrimitive());
        assertEquals("hello", el.getAsString());
    }

    @Test
    public void testJsonElementReadNumber() throws IOException {
        JsonReader in = reader("42");
        JsonElement el = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(el.isJsonPrimitive());
        assertEquals(42, el.getAsInt());
    }

    @Test
    public void testJsonElementReadBoolean() throws IOException {
        JsonReader in = reader("true");
        JsonElement el = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(el.isJsonPrimitive());
        assertTrue(el.getAsBoolean());
    }

    @Test
    public void testJsonElementReadNull() throws IOException {
        JsonReader in = reader("null");
        JsonElement el = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(el.isJsonNull());
    }

    @Test
    public void testJsonElementReadArray() throws IOException {
        JsonReader in = reader("[1,2,3]");
        JsonElement el = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(el.isJsonArray());
        JsonArray arr = el.getAsJsonArray();
        assertEquals(3, arr.size());
        assertEquals(1, arr.get(0).getAsInt());
    }

    @Test
    public void testJsonElementReadObject() throws IOException {
        JsonReader in = reader("{\"a\":1,\"b\":\"x\"}");
        JsonElement el = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(el.isJsonObject());
        JsonObject obj = el.getAsJsonObject();
        assertEquals(1, obj.get("a").getAsInt());
        assertEquals("x", obj.get("b").getAsString());
    }

    @Test
    public void testJsonElementWritePrimitive() throws IOException {
        JsonElement el = new JsonPrimitive(42);
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, el);
        out.flush();
        assertEquals("42", sw.toString());
    }

    @Test
    public void testJsonElementWriteArray() throws IOException {
        JsonArray arr = new JsonArray();
        arr.add(new JsonPrimitive(1));
        arr.add(new JsonPrimitive(2));
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, arr);
        out.flush();
        assertEquals("[1,2]", sw.toString());
    }

    @Test
    public void testJsonElementWriteObject() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("a", 10);
        obj.addProperty("b", "hello");
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, obj);
        out.flush();
        assertEquals("{\"a\":10,\"b\":\"hello\"}", sw.toString());
    }

    // ---- Enum factory ----
    // Define a simple enum with @SerializedName
    public enum MyEnum {
        @SerializedName(value = "FIRST", alternate = {"uno"})
        A,
        @SerializedName(value = "SECOND")
        B
    }

    @Test
    public void testEnumRead() throws IOException {
        TypeAdapter<MyEnum> adapter = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(MyEnum.class));
        assertNotNull(adapter);
        JsonReader in = reader("\"FIRST\"");
        assertEquals(MyEnum.A, adapter.read(in));
    }

    @Test
    public void testEnumReadAlternate() throws IOException {
        TypeAdapter<MyEnum> adapter = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(MyEnum.class));
        JsonReader in = reader("\"uno\"");
        assertEquals(MyEnum.A, adapter.read(in));
    }

    @Test
    public void testEnumReadNull() throws IOException {
        TypeAdapter<MyEnum> adapter = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(MyEnum.class));
        JsonReader in = reader("null");
        assertNull(adapter.read(in));
    }

    @Test
    public void testEnumWrite() throws IOException {
        TypeAdapter<MyEnum> adapter = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(MyEnum.class));
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        adapter.write(out, MyEnum.B);
        out.flush();
        assertEquals("\"SECOND\"", sw.toString());
    }

    @Test
    public void testEnumWriteNull() throws IOException {
        TypeAdapter<MyEnum> adapter = TypeAdapters.ENUM_FACTORY.create(new Gson(), TypeToken.get(MyEnum.class));
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        adapter.write(out, null);
        out.flush();
        assertEquals("null", sw.toString());
    }

    // ---- Factory methods ----
    @Test
    public void testNewFactory() {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, adapter);
        Gson gson = new Gson();
        TypeToken<String> token = TypeToken.get(String.class);
        assertSame(adapter, factory.create(gson, token));
        TypeToken<Integer> wrongToken = TypeToken.get(Integer.class);
        assertNull(factory.create(gson, wrongToken));
    }

    @Test
    public void testNewFactoryForMultipleTypes() {
        TypeAdapter<Number> adapter = TypeAdapters.NUMBER;
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(Number.class, Integer.class, adapter);
        Gson gson = new Gson();
        assertNotNull(factory.create(gson, TypeToken.get(Number.class)));
        assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
        assertNull(factory.create(gson, TypeToken.get(String.class)));
    }

    @Test
    public void testNewTypeHierarchyFactory() {
        TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(JsonElement.class, adapter);
        Gson gson = new Gson();
        assertNotNull(factory.create(gson, TypeToken.get(JsonObject.class)));
        assertNotNull(factory.create(gson, TypeToken.get(JsonArray.class)));
        assertNull(factory.create(gson, TypeToken.get(String.class)));
    }

    // ---- Private constructor ----
    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<TypeAdapters> c = TypeAdapters.class.getDeclaredConstructor();
        c.setAccessible(true);
        try {
            c.newInstance();
            fail("Expected UnsupportedOperationException");
        } catch (Exception e) {
            assertTrue(e.getCause() instanceof UnsupportedOperationException);
        }
    }
}