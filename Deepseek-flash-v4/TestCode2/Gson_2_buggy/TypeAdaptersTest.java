package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TypeAdaptersTest {

    public enum TestEnum {
        @SerializedName("foo") VALUE1,
        VALUE2
    }

    private JsonReader reader(String json) {
        return new JsonReader(new StringReader(json));
    }

    private String writeReadable(TypeAdapter<?> adapter, Object value) throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, value);
        jw.close();
        return sw.toString();
    }

    @Test
    public void testBitSetReadWrite() throws Exception {
        assertNull(TypeAdapters.BIT_SET.read(reader("null")));
        BitSet empty = TypeAdapters.BIT_SET.read(reader("[]"));
        assertEquals(0, empty.length());
        BitSet single = TypeAdapters.BIT_SET.read(reader("[1]"));
        assertTrue(single.get(0));
        BitSet mixed = TypeAdapters.BIT_SET.read(reader("[1,0,true,false,\"1\",\"0\"]"));
        assertTrue(mixed.get(0));
        assertFalse(mixed.get(1));
        assertTrue(mixed.get(2));
        assertFalse(mixed.get(3));
        assertTrue(mixed.get(4));
        assertFalse(mixed.get(5));
        try {
            TypeAdapters.BIT_SET.read(reader("[\"abc\"]"));
            fail("Expected JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) { }
        try {
            TypeAdapters.BIT_SET.read(reader("[{}]"));
            fail("Expected JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) { }
        assertEquals("null", writeReadable(TypeAdapters.BIT_SET, null));
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        assertEquals("[1,0,1]", writeReadable(TypeAdapters.BIT_SET, bs));
    }

    @Test
    public void testBooleanReadWrite() throws Exception {
        assertNull(TypeAdapters.BOOLEAN.read(reader("null")));
        assertTrue(TypeAdapters.BOOLEAN.read(reader("\"true\"")));
        assertFalse(TypeAdapters.BOOLEAN.read(reader("false")));
        assertTrue(TypeAdapters.BOOLEAN.read(reader("true")));
        assertEquals("true", writeReadable(TypeAdapters.BOOLEAN, true));
        assertEquals("null", writeReadable(TypeAdapters.BOOLEAN, null));
        assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(reader("null")));
        assertTrue(TypeAdapters.BOOLEAN_AS_STRING.read(reader("\"true\"")));
        assertEquals("\"true\"", writeReadable(TypeAdapters.BOOLEAN_AS_STRING, true));
        assertEquals("\"null\"", writeReadable(TypeAdapters.BOOLEAN_AS_STRING, null));
    }

    @Test
    public void testIntegerReadWrite() throws Exception {
        assertNull(TypeAdapters.INTEGER.read(reader("null")));
        assertEquals(123, TypeAdapters.INTEGER.read(reader("123")).intValue());
        try {
            TypeAdapters.INTEGER.read(reader("\"abc\""));
            fail("Expected JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) { }
        assertEquals("123", writeReadable(TypeAdapters.INTEGER, 123));
    }

    @Test
    public void testStringReadWrite() throws Exception {
        assertNull(TypeAdapters.STRING.read(reader("null")));
        assertEquals("true", TypeAdapters.STRING.read(reader("true")));
        assertEquals("hello", TypeAdapters.STRING.read(reader("\"hello\"")));
        assertEquals("\"hello\"", writeReadable(TypeAdapters.STRING, "hello"));
        assertEquals("null", writeReadable(TypeAdapters.STRING, null));
    }

    @Test
    public void testNumberReadWrite() throws Exception {
        assertNull(TypeAdapters.NUMBER.read(reader("null")));
        assertNotNull(TypeAdapters.NUMBER.read(reader("3.14")));
        try {
            TypeAdapters.NUMBER.read(reader("\"abc\""));
            fail("Expected JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) { }
        assertEquals("42", writeReadable(TypeAdapters.NUMBER, 42));
    }

    @Test
    public void testJsonElementReadWrite() throws Exception {
        assertEquals("abc", TypeAdapters.JSON_ELEMENT.read(reader("\"abc\"")).getAsString());
        assertEquals(42, TypeAdapters.JSON_ELEMENT.read(reader("42")).getAsInt());
        assertTrue(TypeAdapters.JSON_ELEMENT.read(reader("true")).getAsBoolean());
        assertTrue(TypeAdapters.JSON_ELEMENT.read(reader("null")).isJsonNull());
        JsonArray arr = TypeAdapters.JSON_ELEMENT.read(reader("[]")).getAsJsonArray();
        assertEquals(0, arr.size());
        JsonArray arr2 = TypeAdapters.JSON_ELEMENT.read(reader("[1,\"two\"]")).getAsJsonArray();
        assertEquals(2, arr2.size());
        JsonObject obj = TypeAdapters.JSON_ELEMENT.read(reader("{}")).getAsJsonObject();
        assertEquals(0, obj.size());
        JsonObject obj2 = TypeAdapters.JSON_ELEMENT.read(reader("{\"a\":1}")).getAsJsonObject();
        assertEquals(1, obj2.size());
        assertEquals("null", writeReadable(TypeAdapters.JSON_ELEMENT, null));
        assertEquals("null", writeReadable(TypeAdapters.JSON_ELEMENT, JsonNull.INSTANCE));
        assertEquals("\"hello\"", writeReadable(TypeAdapters.JSON_ELEMENT, new JsonPrimitive("hello")));
        assertEquals("42", writeReadable(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(42)));
        assertEquals("true", writeReadable(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(true)));
        JsonArray a = new JsonArray();
        a.add(1);
        a.add(2);
        assertEquals("[1,2]", writeReadable(TypeAdapters.JSON_ELEMENT, a));
        JsonObject o = new JsonObject();
        o.addProperty("k", "v");
        assertEquals("{\"k\":\"v\"}", writeReadable(TypeAdapters.JSON_ELEMENT, o));
    }

    @Test
    public void testLocaleReadWrite() throws Exception {
        assertNull(TypeAdapters.LOCALE.read(reader("null")));
        Locale l1 = TypeAdapters.LOCALE.read(reader("\"en\""));
        assertEquals("en", l1.getLanguage());
        Locale l2 = TypeAdapters.LOCALE.read(reader("\"en_US\""));
        assertEquals("en", l2.getLanguage());
        assertEquals("US", l2.getCountry());
        Locale l3 = TypeAdapters.LOCALE.read(reader("\"en_US_WIN\""));
        assertEquals("en", l3.getLanguage());
        assertEquals("US", l3.getCountry());
        assertEquals("WIN", l3.getVariant());
        assertEquals("\"en\"", writeReadable(TypeAdapters.LOCALE, new Locale("en")));
        assertEquals("null", writeReadable(TypeAdapters.LOCALE, null));
    }

    @Test
    public void testEnumTypeAdapter() throws Exception {
        Gson gson = new Gson();
        TypeAdapter<TestEnum> adapter = (TypeAdapter<TestEnum>)
            TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(TestEnum.class));
        assertNotNull(adapter);
        assertNull(adapter.read(reader("null")));
        assertEquals(TestEnum.VALUE2, adapter.read(reader("\"VALUE2\"")));
        assertEquals(TestEnum.VALUE1, adapter.read(reader("\"foo\"")));
        assertEquals("\"foo\"", writeReadable(adapter, TestEnum.VALUE1));
        assertEquals("\"VALUE2\"", writeReadable(adapter, TestEnum.VALUE2));
        assertEquals("null", writeReadable(adapter, null));
    }

    @Test
    public void testNewFactory() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);
        Gson gson = new Gson();
        assertSame(TypeAdapters.STRING, factory.create(gson, TypeToken.get(String.class)));
        assertNull(factory.create(gson, TypeToken.get(Integer.class)));
        assertTrue(factory.toString().contains("String"));
    }

    @Test
    public void testNewFactoryWithBoxed() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER);
        Gson gson = new Gson();
        assertSame(TypeAdapters.INTEGER, factory.create(gson, TypeToken.get(int.class)));
        assertSame(TypeAdapters.INTEGER, factory.create(gson, TypeToken.get(Integer.class)));
        assertNull(factory.create(gson, TypeToken.get(String.class)));
    }

    @Test
    public void testNewFactoryForMultipleTypes() throws Exception {
        TypeAdapter<Calendar> calAdapter = TypeAdapters.CALENDAR;
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, calAdapter);
        Gson gson = new Gson();
        assertSame(calAdapter, factory.create(gson, TypeToken.get(Calendar.class)));
        assertSame(calAdapter, factory.create(gson, TypeToken.get(GregorianCalendar.class)));
        assertNull(factory.create(gson, TypeToken.get(java.util.Date.class)));
    }

    @Test
    public void testNewTypeHierarchyFactory() throws Exception {
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(JsonElement.class, TypeAdapters.JSON_ELEMENT);
        Gson gson = new Gson();
        assertSame(TypeAdapters.JSON_ELEMENT, factory.create(gson, TypeToken.get(JsonElement.class)));
        assertSame(TypeAdapters.JSON_ELEMENT, factory.create(gson, TypeToken.get(JsonObject.class)));
        assertNull(factory.create(gson, TypeToken.get(String.class)));
    }

}