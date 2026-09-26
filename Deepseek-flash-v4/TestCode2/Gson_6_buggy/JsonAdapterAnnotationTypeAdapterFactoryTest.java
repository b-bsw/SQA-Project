package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

public class JsonAdapterAnnotationTypeAdapterFactoryTest {

    // ---------- Stub classes ----------
    static class MyTypeAdapter extends TypeAdapter<String> {
        @Override
        public void write(JsonWriter out, String value) throws IOException {
        }

        @Override
        public String read(JsonReader in) throws IOException {
            return null;
        }
    }

    static class MyTypeAdapterFactory implements TypeAdapterFactory {
        @Override
        @SuppressWarnings("unchecked")
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            return (TypeAdapter<T>) new MyTypeAdapter();
        }
    }

    // ---------- Annotated test types ----------
    @JsonAdapter(MyTypeAdapter.class)
    static class WithAdapter {
    }

    @JsonAdapter(MyTypeAdapterFactory.class)
    static class WithFactory {
    }

    @JsonAdapter(String.class)
    static class WithInvalid {
    }

    static class NoAnnotation {
    }

    // ---------- Stub ConstructorConstructor ----------
    // Extends ConstructorConstructor to override get() and return our stubs
    static class MockConstructorConstructor extends ConstructorConstructor {
        public MockConstructorConstructor() {
            super(Collections.<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>>emptyMap());
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
            Class<? super T> raw = typeToken.getRawType();
            if (raw == MyTypeAdapter.class) {
                return new ObjectConstructor<T>() {
                    @Override
                    public T construct() {
                        return (T) new MyTypeAdapter();
                    }
                };
            } else if (raw == MyTypeAdapterFactory.class) {
                return new ObjectConstructor<T>() {
                    @Override
                    public T construct() {
                        return (T) new MyTypeAdapterFactory();
                    }
                };
            }
            return super.get(typeToken);
        }
    }

    // ---------- Tests ----------
    @Test
    public void testCreateNullAnnotation() {
        Gson gson = new Gson();
        TypeToken<NoAnnotation> token = TypeToken.get(NoAnnotation.class);
        MockConstructorConstructor constructorConstructor = new MockConstructorConstructor();
        JsonAdapterAnnotationTypeAdapterFactory factory =
                new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        assertNull("Expected null when no @JsonAdapter annotation", factory.create(gson, token));
    }

    @Test
    public void testCreateWithTypeAdapterAnnotation() {
        Gson gson = new Gson();
        TypeToken<WithAdapter> token = TypeToken.get(WithAdapter.class);
        MockConstructorConstructor constructorConstructor = new MockConstructorConstructor();
        JsonAdapterAnnotationTypeAdapterFactory factory =
                new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        TypeAdapter<?> adapter = factory.create(gson, token);
        assertNotNull("Expected non-null TypeAdapter for @JsonAdapter(MyTypeAdapter.class)", adapter);
        // The returned adapter should be the result of nullSafe(), not null
        assertNotNull("nullSafe() should not be null", adapter);
    }

    @Test
    public void testCreateWithTypeAdapterFactoryAnnotation() {
        Gson gson = new Gson();
        TypeToken<WithFactory> token = TypeToken.get(WithFactory.class);
        MockConstructorConstructor constructorConstructor = new MockConstructorConstructor();
        JsonAdapterAnnotationTypeAdapterFactory factory =
                new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        TypeAdapter<?> adapter = factory.create(gson, token);
        assertNotNull("Expected non-null TypeAdapter for @JsonAdapter(MyTypeAdapterFactory.class)", adapter);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithInvalidAnnotation() {
        Gson gson = new Gson();
        TypeToken<WithInvalid> token = TypeToken.get(WithInvalid.class);
        MockConstructorConstructor constructorConstructor = new MockConstructorConstructor();
        JsonAdapterAnnotationTypeAdapterFactory factory =
                new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        factory.create(gson, token);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test
    public void testGetTypeAdapterWithTypeAdapter() {
        Gson gson = new Gson();
        MockConstructorConstructor constructorConstructor = new MockConstructorConstructor();
        TypeToken<WithAdapter> fieldType = TypeToken.get(WithAdapter.class);
        JsonAdapter annotation = WithAdapter.class.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> result =
                JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                        constructorConstructor, gson, fieldType, annotation);
        assertNotNull("getTypeAdapter with TypeAdapter should return non-null", result);
        // It should be a nullSafe wrapped adapter, so it should not be null
        assertNotNull("nullSafe() result should be non-null", result);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test
    public void testGetTypeAdapterWithTypeAdapterFactory() {
        Gson gson = new Gson();
        MockConstructorConstructor constructorConstructor = new MockConstructorConstructor();
        TypeToken<WithFactory> fieldType = TypeToken.get(WithFactory.class);
        JsonAdapter annotation = WithFactory.class.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> result =
                JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                        constructorConstructor, gson, fieldType, annotation);
        assertNotNull("getTypeAdapter with TypeAdapterFactory should return non-null", result);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test(expected = IllegalArgumentException.class)
    public void testGetTypeAdapterWithInvalidType() {
        Gson gson = new Gson();
        MockConstructorConstructor constructorConstructor = new MockConstructorConstructor();
        TypeToken<WithInvalid> fieldType = TypeToken.get(WithInvalid.class);
        JsonAdapter annotation = WithInvalid.class.getAnnotation(JsonAdapter.class);
        JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                constructorConstructor, gson, fieldType, annotation);
    }
}