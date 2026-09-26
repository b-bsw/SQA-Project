package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class TypeAdaptersTest {

    // BIT_SET tests
    @Test
    public void testBitSetReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.BIT_SET.read(in));
    }

    @Test
    public void testBitSetReadNumbers() throws IOException {
        JsonReader in = new JsonReader(new StringReader("[1,0,1]"));
        BitSet bs = TypeAdapters.BIT_SET.read(in);
        assertTrue(bs.get(0));
        assertFalse(bs.get(1));
        assertTrue(bs.get(2));
    }

    @Test
    public void testBitSetReadBooleans() throws IOException {
        JsonReader in = new JsonReader(new StringReader("[true,false,true]"));
        BitSet bs = TypeAdapters.BIT_SET.read(in);
        assertTrue(bs.get(0));
        assertFalse(bs.get(1));
        assertTrue(bs.get(2));
    }

    @Test
    public void testBitSetReadStrings() throws IOException {
        JsonReader in = new JsonReader(new StringReader("[\"1\",\"0\",\"1\"]"));
        BitSet bs = TypeAdapters.BIT_SET.read(in);
        assertTrue(bs.get(0));
        assertFalse(bs.get(1));
        assertTrue(bs.get(2));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadInvalidString() throws IOException {
        JsonReader in = new JsonReader(new StringReader("[\"abc\"]"));
        TypeAdapters.BIT_SET.read(in);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBitSetReadInvalidType() throws IOException {
        JsonReader in = new JsonReader(new StringReader("[{}]"));
        TypeAdapters.BIT_SET.read(in);
    }

    @Test
    public void testBitSetWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BIT_SET.write(out, null);
        assertEquals("null", sw.toString());
    }

    @Test
    public void testBitSetWrite() throws IOException {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BIT_SET.write(out, bs);
        assertEquals("[1,0,1]", sw.toString());
    }

    // BOOLEAN tests
    @Test
    public void testBooleanReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.BOOLEAN.read(in));
    }

    @Test
    public void testBooleanReadString() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"true\""));
        assertTrue(TypeAdapters.BOOLEAN.read(in));
    }

    @Test
    public void testBooleanReadBoolean() throws IOException {
        JsonReader in = new JsonReader(new StringReader("false"));
        assertFalse(TypeAdapters.BOOLEAN.read(in));
    }

    @Test
    public void testBooleanWrite() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BOOLEAN.write(out, true);
        assertEquals("true", sw.toString());
    }

    // NUMBER tests
    @Test
    public void testNumberReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.NUMBER.read(in));
    }

    @Test
    public void testNumberReadNumber() throws IOException {
        JsonReader in = new JsonReader(new StringReader("123"));
        Number num = TypeAdapters.NUMBER.read(in);
        assertEquals("123", num.toString());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testNumberReadInvalidToken() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"abc\""));
        TypeAdapters.NUMBER.read(in);
    }

    // STRING tests
    @Test
    public void testStringReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.STRING.read(in));
    }

    @Test
    public void testStringReadBoolean() throws IOException {
        JsonReader in = new JsonReader(new StringReader("true"));
        assertEquals("true", TypeAdapters.STRING.read(in));
    }

    @Test
    public void testStringReadString() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"hello\""));
        assertEquals("hello", TypeAdapters.STRING.read(in));
    }

    @Test
    public void testStringWrite() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.STRING.write(out, "test");
        assertEquals("\"test\"", sw.toString());
    }

    // BIG_DECIMAL tests
    @Test
    public void testBigDecimalReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.BIG_DECIMAL.read(in));
    }

    @Test
    public void testBigDecimalReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("123.45"));
        assertEquals(new BigDecimal("123.45"), TypeAdapters.BIG_DECIMAL.read(in));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testBigDecimalReadInvalid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"abc\""));
        TypeAdapters.BIG_DECIMAL.read(in);
    }

    // JSON_ELEMENT tests
    @Test
    public void testJsonElementReadString() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"foo\""));
        JsonElement e = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(e.isJsonPrimitive() && e.getAsJsonPrimitive().isString());
        assertEquals("foo", e.getAsString());
    }

    @Test
    public void testJsonElementReadNumber() throws IOException {
        JsonReader in = new JsonReader(new StringReader("42"));
        JsonElement e = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(e.isJsonPrimitive() && e.getAsJsonPrimitive().isNumber());
        assertEquals(42, e.getAsInt());
    }

    @Test
    public void testJsonElementReadBoolean() throws IOException {
        JsonReader in = new JsonReader(new StringReader("false"));
        JsonElement e = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(e.isJsonPrimitive() && e.getAsJsonPrimitive().isBoolean());
        assertFalse(e.getAsBoolean());
    }

    @Test
    public void testJsonElementReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        JsonElement e = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(e.isJsonNull());
    }

    @Test
    public void testJsonElementReadArray() throws IOException {
        JsonReader in = new JsonReader(new StringReader("[1,2,3]"));
        JsonElement e = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(e.isJsonArray());
        JsonArray arr = e.getAsJsonArray();
        assertEquals(3, arr.size());
        assertEquals(1, arr.get(0).getAsInt());
    }

    @Test
    public void testJsonElementReadObject() throws IOException {
        JsonReader in = new JsonReader(new StringReader("{\"a\":\"b\"}"));
        JsonElement e = TypeAdapters.JSON_ELEMENT.read(in);
        assertTrue(e.isJsonObject());
        JsonObject obj = e.getAsJsonObject();
        assertEquals("b", obj.get("a").getAsString());
    }

    @Test
    public void testJsonElementWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, null);
        assertEquals("null", sw.toString());
    }

    @Test
    public void testJsonElementWriteJsonNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, JsonNull.INSTANCE);
        assertEquals("null", sw.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveString() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, new JsonPrimitive("hello"));
        assertEquals("\"hello\"", sw.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveNumber() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, new JsonPrimitive(123));
        assertEquals("123", sw.toString());
    }

    @Test
    public void testJsonElementWritePrimitiveBoolean() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, new JsonPrimitive(true));
        assertEquals("true", sw.toString());
    }

    @Test
    public void testJsonElementWriteArray() throws IOException {
        JsonArray arr = new JsonArray();
        arr.add(1);
        arr.add(2);
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, arr);
        assertEquals("[1,2]", sw.toString());
    }

    @Test
    public void testJsonElementWriteObject() throws IOException {
        JsonObject obj = new JsonObject();
        obj.addProperty("key", "val");
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.JSON_ELEMENT.write(out, obj);
        assertEquals("{\"key\":\"val\"}", sw.toString());
    }

    // ENUM_FACTORY tests
    enum TestEnum { @SerializedName("A") VALUE1, VALUE2 }
    enum EmptyEnum {}

    @Test
    public void testEnumFactoryCreatesAdapterForEnum() {
        Gson gson = new Gson();
        TypeAdapterFactory factory = TypeAdapters.ENUM_FACTORY;
        TypeAdapter<TestEnum> adapter = factory.create(gson, TypeToken.get(TestEnum.class));
        assertNotNull(adapter);
    }

    @Test
    public void testEnumFactoryReturnsNullForNonEnum() {
        Gson gson = new Gson();
        TypeAdapterFactory factory = TypeAdapters.ENUM_FACTORY;
        TypeAdapter<String> adapter = factory.create(gson, TypeToken.get(String.class));
        assertNull(adapter);
    }

    @Test
    public void testEnumFactoryForEnumWithoutConstants() {
        Gson gson = new Gson();
        TypeAdapterFactory factory = TypeAdapters.ENUM_FACTORY;
        TypeAdapter<EmptyEnum> adapter = factory.create(gson, TypeToken.get(EmptyEnum.class));
        assertNotNull(adapter);
    }

    @Test
    public void testEnumFactoryWrite() throws IOException {
        Gson gson = new Gson();
        TypeAdapter<TestEnum> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(TestEnum.class));
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        adapter.write(out, TestEnum.VALUE1);
        assertEquals("\"A\"", sw.toString());
    }

    @Test
    public void testEnumFactoryRead() throws IOException {
        Gson gson = new Gson();
        TypeAdapter<TestEnum> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(TestEnum.class));
        JsonReader in = new JsonReader(new StringReader("\"A\""));
        TestEnum val = adapter.read(in);
        assertEquals(TestEnum.VALUE1, val);
    }

    // factory method tests
    @Test
    public void testNewFactoryWithClass() {
        TypeAdapter<String> adapter = new TypeAdapter<String>() {
            @Override public void write(JsonWriter out, String value) throws IOException { out.value(value); }
            @Override public String read(JsonReader in) throws IOException { return in.nextString(); }
        };
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, adapter);
        Gson gson = new Gson();
        assertSame(adapter, factory.create(gson, TypeToken.get(String.class)));
        assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    }

    @Test
    public void testNewFactoryWithUnboxedBoxed() {
        TypeAdapter<Number> adapter = new TypeAdapter<Number>() {
            @Override public void write(JsonWriter out, Number value) throws IOException { out.value(value); }
            @Override public Number read(JsonReader in) throws IOException { return in.nextInt(); }
        };
        TypeAdapterFactory factory = TypeAdapters.newFactory(int.class, Integer.class, adapter);
        Gson gson = new Gson();
        assertSame(adapter, factory.create(gson, TypeToken.get(int.class)));
        assertSame(adapter, factory.create(gson, TypeToken.get(Integer.class)));
        assertNull(factory.create(gson, TypeToken.get(long.class)));
    }

    @Test
    public void testNewFactoryForMultipleTypes() {
        TypeAdapter<Number> adapter = new TypeAdapter<Number>() {
            @Override public void write(JsonWriter out, Number value) throws IOException { out.value(value); }
            @Override public Number read(JsonReader in) throws IOException { return in.nextInt(); }
        };
        TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(Number.class, Integer.class, adapter);
        Gson gson = new Gson();
        assertSame(adapter, factory.create(gson, TypeToken.get(Number.class)));
        assertSame(adapter, factory.create(gson, TypeToken.get(Integer.class)));
        assertNull(factory.create(gson, TypeToken.get(Double.class)));
    }

    @Test
    public void testNewTypeHierarchyFactory() {
        TypeAdapter<JsonElement> adapter = new TypeAdapter<JsonElement>() {
            @Override public void write(JsonWriter out, JsonElement value) throws IOException { out.value(value.toString()); }
            @Override public JsonElement read(JsonReader in) throws IOException { return new JsonPrimitive(in.nextString()); }
        };
        TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(JsonElement.class, adapter);
        Gson gson = new Gson();
        TypeAdapter<?> result = factory.create(gson, TypeToken.get(JsonPrimitive.class));
        assertNotNull(result);
    }

    // CLASS tests
    @Test
    public void testClassWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.CLASS.write(out, null);
        assertEquals("null", sw.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassWriteNonNullThrows() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.CLASS.write(out, String.class);
    }

    @Test
    public void testClassReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.CLASS.read(in));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClassReadNonNullThrows() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"java.lang.String\""));
        TypeAdapters.CLASS.read(in);
    }

    // INTEGER tests
    @Test
    public void testIntegerReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.INTEGER.read(in));
    }

    @Test
    public void testIntegerReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("42"));
        assertEquals(42, TypeAdapters.INTEGER.read(in).intValue());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testIntegerReadInvalid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"abc\""));
        TypeAdapters.INTEGER.read(in);
    }

    // LOCALE tests
    @Test
    public void testLocaleReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.LOCALE.read(in));
    }

    @Test
    public void testLocaleReadLanguageOnly() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"en\""));
        assertEquals(new Locale("en"), TypeAdapters.LOCALE.read(in));
    }

    @Test
    public void testLocaleReadLanguageCountry() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"en_US\""));
        assertEquals(new Locale("en", "US"), TypeAdapters.LOCALE.read(in));
    }

    @Test
    public void testLocaleReadFull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"en_US_WIN\""));
        assertEquals(new Locale("en", "US", "WIN"), TypeAdapters.LOCALE.read(in));
    }

    // CALENDAR tests
    @Test
    public void testCalendarReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.CALENDAR.read(in));
    }

    @Test
    public void testCalendarReadValid() throws IOException {
        String json = "{\"year\":2020,\"month\":0,\"dayOfMonth\":15,\"hourOfDay\":10,\"minute\":30,\"second\":0}";
        JsonReader in = new JsonReader(new StringReader(json));
        Calendar cal = TypeAdapters.CALENDAR.read(in);
        assertEquals(2020, cal.get(Calendar.YEAR));
        assertEquals(0, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(30, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
    }

    @Test
    public void testCalendarWrite() throws IOException {
        Calendar cal = new GregorianCalendar(2020, 0, 15, 10, 30, 0);
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.CALENDAR.write(out, cal);
        String expected = "{\"year\":2020,\"month\":0,\"dayOfMonth\":15,\"hourOfDay\":10,\"minute\":30,\"second\":0}";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testCalendarWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.CALENDAR.write(out, null);
        assertEquals("null", sw.toString());
    }

    // CURRENCY tests
    @Test
    public void testCurrencyRead() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"USD\""));
        assertEquals(Currency.getInstance("USD"), TypeAdapters.CURRENCY.read(in));
    }

    @Test
    public void testCurrencyWrite() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.CURRENCY.write(out, Currency.getInstance("EUR"));
        assertEquals("\"EUR\"", sw.toString());
    }

    // ATOMIC_INTEGER tests
    @Test
    public void testAtomicIntegerReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.ATOMIC_INTEGER.read(in));
    }

    @Test
    public void testAtomicIntegerReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("5"));
        assertEquals(5, TypeAdapters.ATOMIC_INTEGER.read(in).get());
    }

    @Test
    public void testAtomicIntegerWrite() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.ATOMIC_INTEGER.write(out, new AtomicInteger(10));
        assertEquals("10", sw.toString());
    }

    // ATOMIC_BOOLEAN tests
    @Test
    public void testAtomicBooleanReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.ATOMIC_BOOLEAN.read(in));
    }

    @Test
    public void testAtomicBooleanReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("true"));
        assertTrue(TypeAdapters.ATOMIC_BOOLEAN.read(in).get());
    }

    @Test
    public void testAtomicBooleanWrite() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.ATOMIC_BOOLEAN.write(out, new AtomicBoolean(false));
        assertEquals("false", sw.toString());
    }

    // BOOLEAN_AS_STRING tests
    @Test
    public void testBooleanAsStringReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.BOOLEAN_AS_STRING.read(in));
    }

    @Test
    public void testBooleanAsStringReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"true\""));
        assertTrue(TypeAdapters.BOOLEAN_AS_STRING.read(in));
    }

    @Test
    public void testBooleanAsStringWrite() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BOOLEAN_AS_STRING.write(out, false);
        assertEquals("\"false\"", sw.toString());
    }

    @Test
    public void testBooleanAsStringWriteNull() throws IOException {
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.BOOLEAN_AS_STRING.write(out, null);
        assertEquals("\"null\"", sw.toString());
    }

    // BYTE tests
    @Test
    public void testByteReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.BYTE.read(in));
    }

    @Test
    public void testByteReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("127"));
        assertEquals(Byte.valueOf((byte)127), TypeAdapters.BYTE.read(in));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testByteReadInvalid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"abc\""));
        TypeAdapters.BYTE.read(in);
    }

    // SHORT tests
    @Test
    public void testShortReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.SHORT.read(in));
    }

    @Test
    public void testShortReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("255"));
        assertEquals(Short.valueOf((short)255), TypeAdapters.SHORT.read(in));
    }

    // LONG tests
    @Test
    public void testLongReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.LONG.read(in));
    }

    @Test
    public void testLongReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("10000000000"));
        assertEquals(10000000000L, TypeAdapters.LONG.read(in).longValue());
    }

    // FLOAT tests
    @Test
    public void testFloatRead() throws IOException {
        JsonReader in = new JsonReader(new StringReader("3.14"));
        assertEquals(3.14f, TypeAdapters.FLOAT.read(in).floatValue(), 0.0001f);
    }

    // DOUBLE tests
    @Test
    public void testDoubleRead() throws IOException {
        JsonReader in = new JsonReader(new StringReader("2.718"));
        assertEquals(2.718, TypeAdapters.DOUBLE.read(in).doubleValue(), 0.0001);
    }

    // BIG_INTEGER tests
    @Test
    public void testBigIntegerReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.BIG_INTEGER.read(in));
    }

    @Test
    public void testBigIntegerReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("12345678901234567890"));
        assertEquals(new BigInteger("12345678901234567890"), TypeAdapters.BIG_INTEGER.read(in));
    }

    // STRING_BUILDER tests
    @Test
    public void testStringBuilderReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.STRING_BUILDER.read(in));
    }

    @Test
    public void testStringBuilderReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"hello\""));
        assertEquals("hello", TypeAdapters.STRING_BUILDER.read(in).toString());
    }

    // STRING_BUFFER tests
    @Test
    public void testStringBufferReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.STRING_BUFFER.read(in));
    }

    @Test
    public void testStringBufferReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"world\""));
        assertEquals("world", TypeAdapters.STRING_BUFFER.read(in).toString());
    }

    // URL tests
    @Test
    public void testUrlReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.URL.read(in));
    }

    @Test
    public void testUrlReadStringNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"null\""));
        assertNull(TypeAdapters.URL.read(in));
    }

    @Test
    public void testUrlReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"http://example.com\""));
        assertEquals(new URL("http://example.com"), TypeAdapters.URL.read(in));
    }

    // URI tests
    @Test
    public void testUriReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.URI.read(in));
    }

    @Test
    public void testUriReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"http://example.com\""));
        assertEquals(URI.create("http://example.com"), TypeAdapters.URI.read(in));
    }

    @Test(expected = com.google.gson.JsonIOException.class)
    public void testUriReadInvalidSyntax() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"invalid uri\""));
        TypeAdapters.URI.read(in);
    }

    // InetAddress test
    @Test
    public void testInetAddressRead() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"127.0.0.1\""));
        assertEquals(InetAddress.getByName("127.0.0.1"), TypeAdapters.INET_ADDRESS.read(in));
    }

    // UUID test
    @Test
    public void testUuidRead() throws IOException {
        UUID uuid = UUID.randomUUID();
        JsonReader in = new JsonReader(new StringReader("\"" + uuid.toString() + "\""));
        assertEquals(uuid, TypeAdapters.UUID.read(in));
    }

    // TIMESTAMP_FACTORY test
    @Test
    public void testTimestampFactory() {
        Gson gson = new Gson();
        TypeAdapterFactory factory = TypeAdapters.TIMESTAMP_FACTORY;
        TypeAdapter<Timestamp> adapter = factory.create(gson, TypeToken.get(Timestamp.class));
        assertNotNull(adapter);
        TypeAdapter<Date> dateAdapter = factory.create(gson, TypeToken.get(Date.class));
        assertNull(dateAdapter);
    }

    // CHARACTER tests
    @Test
    public void testCharacterReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.CHARACTER.read(in));
    }

    @Test
    public void testCharacterReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"A\""));
        assertEquals(Character.valueOf('A'), TypeAdapters.CHARACTER.read(in));
    }

    @Test(expected = JsonSyntaxException.class)
    public void testCharacterReadInvalidLength() throws IOException {
        JsonReader in = new JsonReader(new StringReader("\"AB\""));
        TypeAdapters.CHARACTER.read(in);
    }

    // ATOMIC_INTEGER_ARRAY tests
    @Test
    public void testAtomicIntegerArrayReadNull() throws IOException {
        JsonReader in = new JsonReader(new StringReader("null"));
        assertNull(TypeAdapters.ATOMIC_INTEGER_ARRAY.read(in));
    }

    @Test
    public void testAtomicIntegerArrayReadValid() throws IOException {
        JsonReader in = new JsonReader(new StringReader("[1,2,3]"));
        AtomicIntegerArray arr = TypeAdapters.ATOMIC_INTEGER_ARRAY.read(in);
        assertEquals(3, arr.length());
        assertEquals(1, arr.get(0));
        assertEquals(2, arr.get(1));
        assertEquals(3, arr.get(2));
    }

    @Test
    public void testAtomicIntegerArrayWrite() throws IOException {
        AtomicIntegerArray arr = new AtomicIntegerArray(new int[]{4,5,6});
        StringWriter sw = new StringWriter();
        JsonWriter out = new JsonWriter(sw);
        TypeAdapters.ATOMIC_INTEGER_ARRAY.write(out, arr);
        assertEquals("[4,5,6]", sw.toString());
    }

    // factory toString test
    @Test
    public void testFactoryToString() {
        TypeAdapter<String> adapter = TypeAdapters.STRING;
        TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, adapter);
        assertTrue(factory.toString().contains("Factory[type="));
    }
}