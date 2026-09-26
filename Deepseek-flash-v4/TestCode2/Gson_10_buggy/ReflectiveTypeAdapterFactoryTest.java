package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReflectiveTypeAdapterFactoryTest {

    private Excluder excluderAlwaysFalse;
    private Excluder excluderAlwaysTrue;
    private FieldNamingStrategy identityNaming;
    private ConstructorConstructor dummyConstructor;
    private ReflectiveTypeAdapterFactory factory;

    @Before
    public void setUp() throws Exception {
        excluderAlwaysFalse = new Excluder() {
            @Override
            public boolean excludeClass(Class<?> clazz, boolean serialize) {
                return false;
            }
            @Override
            public boolean excludeField(Field f, boolean serialize) {
                return false;
            }
        };
        excluderAlwaysTrue = new Excluder() {
            @Override
            public boolean excludeClass(Class<?> clazz, boolean serialize) {
                return true;
            }
            @Override
            public boolean excludeField(Field f, boolean serialize) {
                return true;
            }
        };
        identityNaming = new FieldNamingStrategy() {
            @Override
            public String translateName(Field f) {
                return f.getName();
            }
        };
        dummyConstructor = new ConstructorConstructor() {
            @Override
            public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
                return new ObjectConstructor<T>() {
                    @Override
                    public T construct() {
                        try {
                            return typeToken.getRawType().newInstance();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                };
            }
        };
        factory = new ReflectiveTypeAdapterFactory(dummyConstructor, identityNaming, excluderAlwaysFalse);
    }

    @After
    public void tearDown() throws Exception {
        // no cleanup needed
    }

    // ---------------- helper inner classes ----------------
    static class SimpleClass {
        String name;
    }

    static class AnnotatedClass {
        @SerializedName("customName")
        String field;

        String unannotated;
    }

    static class MultiNameClass {
        @SerializedName(value = "primary", alternate = {"alt1", "alt2"})
        String name;
    }

    static class PrivateFieldClass {
        private int x;
    }

    // ---------------- tests for excludeField ----------------
    @Test
    public void testExcludeFieldStatic() throws Exception {
        Field f = SimpleClass.class.getDeclaredField("name");
        // excluder returns false for both -> not excluded -> excludeField returns true
        assertTrue(ReflectiveTypeAdapterFactory.excludeField(f, true, excluderAlwaysFalse));
        assertTrue(ReflectiveTypeAdapterFactory.excludeField(f, false, excluderAlwaysFalse));

        // excluder excludes class -> excludeClass returns false (because negated) -> excludeField returns false
        assertFalse(ReflectiveTypeAdapterFactory.excludeField(f, true, excluderAlwaysTrue));
    }

    @Test
    public void testExcludeFieldInstance() throws Exception {
        Field f = SimpleClass.class.getDeclaredField("name");
        // delegate to static with same excluder
        assertTrue(factory.excludeField(f, true));
        assertTrue(factory.excludeField(f, false));
    }

    // ---------------- tests for getFieldNames (via createBoundField behavior) ----------------
    @Test
    public void testGetFieldNamesNoAnnotation() throws Exception {
        Field f = SimpleClass.class.getDeclaredField("name");
        // We'll use a custom factory with a FieldNamingStrategy that translates to uppercase
        FieldNamingStrategy upperNaming = new FieldNamingStrategy() {
            @Override
            public String translateName(Field f) {
                return f.getName().toUpperCase();
            }
        };
        ReflectiveTypeAdapterFactory customFactory = new ReflectiveTypeAdapterFactory(
                dummyConstructor, upperNaming, excluderAlwaysFalse);
        // Test indirectly via Adapter: by creating boundFields from getBoundFields?
        // Instead, test via Adapter read/write by constructing an Adapter with boundFields
        // But we want to verify that the field names used are from the naming strategy.
        // We'll create an Adapter for SimpleClass with a single BoundField and check during write
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        final Field nameField = f;
        ReflectiveTypeAdapterFactory.BoundField bf = new ReflectiveTypeAdapterFactory.BoundField("NAME", true, true) {
            @Override
            boolean writeField(Object value) throws IOException, IllegalAccessException {
                return true;
            }
            @Override
            void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException {
                writer.value("test");
            }
            @Override
            void read(JsonReader reader, Object value) throws IOException, IllegalAccessException {
                // do nothing for this test
            }
        };
        boundFields.put("NAME", bf);
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        SimpleClass instance = new SimpleClass();
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, instance);
        jw.flush();
        String json = sw.toString();
        // Should contain "NAME" because we created BoundField with that name
        assertTrue(json.contains("\"NAME\""));
    }

    // ---------------- tests for Adapter.read ----------------
    @Test
    public void testReadNull() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> emptyMap = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        emptyMap);
        JsonReader reader = new JsonReader(new StringReader("null"));
        SimpleClass result = adapter.read(reader);
        assertNull(result);
    }

    @Test
    public void testReadEmptyObject() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> emptyMap = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        emptyMap);
        JsonReader reader = new JsonReader(new StringReader("{}"));
        SimpleClass result = adapter.read(reader);
        assertNotNull(result);
    }

    @Test
    public void testReadWithField() throws IOException {
        final SimpleClass instance = new SimpleClass();
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.BoundField bf = new ReflectiveTypeAdapterFactory.BoundField("name", true, true) {
            @Override
            boolean writeField(Object value) throws IOException, IllegalAccessException {
                return false;
            }
            @Override
            void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException {
                // not used
            }
            @Override
            void read(JsonReader reader, Object value) throws IOException, IllegalAccessException {
                assertEquals("name", this.name);
                String v = reader.nextString();
                ((SimpleClass)value).name = v;
            }
        };
        boundFields.put("name", bf);
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        JsonReader reader = new JsonReader(new StringReader("{\"name\":\"Alice\"}"));
        SimpleClass result = adapter.read(reader);
        assertEquals("Alice", result.name);
    }

    @Test
    public void testReadSkipsUnknownField() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        JsonReader reader = new JsonReader(new StringReader("{\"unknown\":123}"));
        SimpleClass result = adapter.read(reader);
        assertNotNull(result);
    }

    @Test
    public void testReadSkipsFieldWhenDeserializedFalse() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.BoundField bf = new ReflectiveTypeAdapterFactory.BoundField("name", true, false) {
            @Override
            boolean writeField(Object value) throws IOException, IllegalAccessException {
                return false;
            }
            @Override
            void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException {
            }
            @Override
            void read(JsonReader reader, Object value) throws IOException, IllegalAccessException {
                fail("Should not be called because deserialized is false");
            }
        };
        boundFields.put("name", bf);
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        JsonReader reader = new JsonReader(new StringReader("{\"name\":\"Bob\"}"));
        SimpleClass result = adapter.read(reader);
        assertNotNull(result);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testReadThrowsJsonSyntaxOnIllegalState() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.BoundField bf = new ReflectiveTypeAdapterFactory.BoundField("name", true, true) {
            @Override
            boolean writeField(Object value) throws IOException, IllegalAccessException {
                return false;
            }
            @Override
            void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException {
            }
            @Override
            void read(JsonReader reader, Object value) throws IOException, IllegalAccessException {
                // Simulate an IllegalStateException inside field read
                throw new IllegalStateException("test");
            }
        };
        boundFields.put("name", bf);
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        JsonReader reader = new JsonReader(new StringReader("{\"name\":\"x\"}"));
        adapter.read(reader); // should throw JsonSyntaxException
    }

    // ---------------- tests for Adapter.write ----------------
    @Test
    public void testWriteNull() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> emptyMap = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        emptyMap);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, null);
        jw.flush();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testWriteEmptyObject() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> emptyMap = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        emptyMap);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, new SimpleClass());
        jw.flush();
        assertEquals("{}", sw.toString());
    }

    @Test
    public void testWriteWithField() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.BoundField bf = new ReflectiveTypeAdapterFactory.BoundField("name", true, true) {
            @Override
            boolean writeField(Object value) throws IOException, IllegalAccessException {
                return true;
            }
            @Override
            void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException {
                writer.value("testValue");
            }
            @Override
            void read(JsonReader reader, Object value) throws IOException, IllegalAccessException {
                // not used
            }
        };
        boundFields.put("name", bf);
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, new SimpleClass());
        jw.flush();
        String json = sw.toString();
        assertTrue(json.contains("\"name\""));
        assertTrue(json.contains("\"testValue\""));
    }

    @Test
    public void testWriteSkipsFieldWhenWriteFieldReturnsFalse() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.BoundField bf = new ReflectiveTypeAdapterFactory.BoundField("skip", true, true) {
            @Override
            boolean writeField(Object value) throws IOException, IllegalAccessException {
                return false;
            }
            @Override
            void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException {
                fail("Should not be called because writeField returns false");
            }
            @Override
            void read(JsonReader reader, Object value) throws IOException, IllegalAccessException {
            }
        };
        boundFields.put("skip", bf);
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, new SimpleClass());
        jw.flush();
        assertEquals("{}", sw.toString());
    }

    @Test(expected = AssertionError.class)
    public void testWriteThrowsAssertionOnIllegalAccess() throws IOException {
        Map<String, ReflectiveTypeAdapterFactory.BoundField> boundFields = new LinkedHashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
        ReflectiveTypeAdapterFactory.BoundField bf = new ReflectiveTypeAdapterFactory.BoundField("bad", true, true) {
            @Override
            boolean writeField(Object value) throws IOException, IllegalAccessException {
                throw new IllegalAccessException("test");
            }
            @Override
            void write(JsonWriter writer, Object value) throws IOException, IllegalAccessException {
            }
            @Override
            void read(JsonReader reader, Object value) throws IOException, IllegalAccessException {
            }
        };
        boundFields.put("bad", bf);
        ReflectiveTypeAdapterFactory.Adapter<SimpleClass> adapter =
                new ReflectiveTypeAdapterFactory.Adapter<SimpleClass>(
                        dummyConstructor.get(TypeToken.get(SimpleClass.class)),
                        boundFields);
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        adapter.write(jw, new SimpleClass());
    }

    // ---------------- test for create return null on primitive type ----------------
    @Test
    public void testCreateReturnsNullForPrimitiveType() {
        TypeToken<Integer> intType = TypeToken.get(Integer.class);
        assertNull(factory.create(null, intType)); // Gson parameter can be null for test
    }

    @Test
    public void testCreateReturnsAdapterForObjectType() {
        TypeToken<SimpleClass> objType = TypeToken.get(SimpleClass.class);
        TypeAdapter<?> adapter = factory.create(null, objType);
        assertNotNull(adapter);
        assertTrue(adapter instanceof ReflectiveTypeAdapterFactory.Adapter);
    }

    // ---------------- test for getBoundFields with interface returns empty map (via create) ----------------
    @Test
    public void testCreateInterfaceReturnsEmptyBoundFields() {
        // Use a Gson that returns adapter from our factory (or just rely on create's return)
        // We cannot test getBoundFields directly, but we can verify behavior: create returns Adapter with empty map for interface?
        // Actually for interface, create returns null? No, create checks if Object.class.isAssignableFrom raw -> interface is assignable? Yes, Object is assignable from interface? No, interface not subclass of Object? Actually Object.class.isAssignableFrom(interface) returns true because all classes inherit Object. So it will not return null. But then getBoundFields early returns empty map because raw.isInterface() is true.
        // So Adapter will have empty boundFields.
        TypeToken<Runnable> runnableType = TypeToken.get(Runnable.class);
        TypeAdapter<?> adapter = factory.create(null, runnableType);
        assertNotNull(adapter);
        assertTrue(adapter instanceof ReflectiveTypeAdapterFactory.Adapter);
        // Write empty object
        StringWriter sw = new StringWriter();
        JsonWriter jw = new JsonWriter(sw);
        try {
            adapter.write(jw, new Runnable() {
                public void run() {}
            });
            jw.flush();
            assertEquals("{}", sw.toString());
        } catch (IOException e) {
            fail("IOException not expected");
        }
    }
}