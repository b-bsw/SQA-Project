package com.fasterxml.jackson.databind.ser.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class WritableObjectIdTest {

    @SuppressWarnings("unchecked")
    private ObjectIdGenerator<Object> objectIdGenerator() {
        return mock(ObjectIdGenerator.class);
    }

    @SuppressWarnings("unchecked")
    private JsonSerializer<Object> serializer() {
        return mock(JsonSerializer.class);
    }

    private SerializerProvider provider() {
        return mock(SerializerProvider.class);
    }

    private ObjectIdWriter writer(String propName, boolean alwaysAsId, JsonSerializer<Object> serializer) {
        return ObjectIdWriter.construct(null, propName, serializer, alwaysAsId);
    }

    @Test
    public void constructorStoresGeneratorAndInitializesState() {
        ObjectIdGenerator<Object> generator = objectIdGenerator();
        WritableObjectId oid = new WritableObjectId(generator);

        assertSame(generator, oid.generator);
        assertNull(oid.id);
        assertFalse(oid.idWritten);
    }

    @Test
    public void generateIdReturnsGeneratedIdAndUpdatesField() {
        ObjectIdGenerator<Object> generator = objectIdGenerator();
        when(generator.generateId("pojo")).thenReturn(42);
        WritableObjectId oid = new WritableObjectId(generator);

        Object generated = oid.generateId("pojo");

        assertEquals(Integer.valueOf(42), generated);
        assertEquals(Integer.valueOf(42), oid.id);
        verify(generator).generateId("pojo");
    }

    @Test
    public void generateIdAcceptsNullForPojo() {
        ObjectIdGenerator<Object> generator = objectIdGenerator();
        when(generator.generateId(null)).thenReturn("generated");
        WritableObjectId oid = new WritableObjectId(generator);

        assertEquals("generated", oid.generateId(null));
        verify(generator).generateId(null);
    }

    @Test
    public void generateIdReusesExistingIdWhenAlreadyPresent() {
        ObjectIdGenerator<Object> generator = objectIdGenerator();
        when(generator.generateId("pojo")).thenReturn("generated");
        WritableObjectId oid = new WritableObjectId(generator);
        oid.id = "existing";

        Object result = oid.generateId("pojo");

        verify(generator, never()).generateId("pojo");
        assertEquals("existing", result);
    }

    @Test
    public void writeAsIdReturnsFalseWhenIdIsNull() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.idWritten = true;
        ObjectIdWriter w = writer("prop", true, serializer);

        assertFalse(oid.writeAsId(gen, provider, w));

        verifyZeroInteractions(gen, provider, serializer);
    }

    @Test
    public void writeAsIdReturnsFalseWhenIdNotWrittenAndNotAlwaysAsId() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.id = "abc";
        ObjectIdWriter w = writer("prop", false, serializer);

        assertFalse(oid.writeAsId(gen, provider, w));

        verifyZeroInteractions(gen, provider, serializer);
    }

    @Test
    public void writeAsIdWritesNativeObjectRefWhenIdAlreadyWritten() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        when(gen.canWriteObjectId()).thenReturn(true);
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.id = 123;
        oid.idWritten = true;
        ObjectIdWriter w = writer("prop", false, serializer);

        assertTrue(oid.writeAsId(gen, provider, w));

        verify(gen).canWriteObjectId();
        verify(gen).writeObjectRef("123");
        verifyNoMoreInteractions(gen);
        verifyZeroInteractions(serializer);
    }

    @Test
    public void writeAsIdUsesSerializerWhenAlwaysAsIdAndNativeNotSupported() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        when(gen.canWriteObjectId()).thenReturn(false);
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.id = "abc";
        ObjectIdWriter w = writer("prop", true, serializer);

        assertTrue(oid.writeAsId(gen, provider, w));

        verify(gen).canWriteObjectId();
        verify(serializer).serialize("abc", gen, provider);
        verifyNoMoreInteractions(gen);
    }

    @Test(expected = IOException.class)
    public void writeAsIdPropagatesIOExceptionFromSerializer() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        when(gen.canWriteObjectId()).thenReturn(false);
        doThrow(new IOException("boom")).when(serializer).serialize("abc", gen, provider);
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.id = "abc";
        oid.idWritten = true;
        ObjectIdWriter w = writer("prop", false, serializer);

        oid.writeAsId(gen, provider, w);
    }

    @Test
    public void writeAsFieldWritesNativeObjectIdWhenSupported() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        when(gen.canWriteObjectId()).thenReturn(true);
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.id = "id1";
        oid.idWritten = false;
        ObjectIdWriter w = writer("prop", false, serializer);

        oid.writeAsField(gen, provider, w);

        assertTrue(oid.idWritten);
        verify(gen).canWriteObjectId();
        verify(gen).writeObjectId("id1");
        verifyNoMoreInteractions(gen);
        verifyZeroInteractions(serializer);
    }

    @Test
    public void writeAsFieldWritesPropertyNameAndSerializesWhenNativeNotSupported() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        when(gen.canWriteObjectId()).thenReturn(false);
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.id = "field";
        oid.idWritten = false;
        ObjectIdWriter w = writer("prop", false, serializer);

        oid.writeAsField(gen, provider, w);

        assertTrue(oid.idWritten);
        verify(gen).canWriteObjectId();
        verify(gen).writeFieldName(w.propertyName);
        verify(serializer).serialize("field", gen, provider);
        verifyNoMoreInteractions(gen);
    }

    @Test
    public void writeAsFieldSetsWrittenAndSkipsWhenNoPropertyNameAndNoNativeIds() throws IOException {
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider provider = provider();
        JsonSerializer<Object> serializer = serializer();
        when(gen.canWriteObjectId()).thenReturn(false);
        WritableObjectId oid = new WritableObjectId(objectIdGenerator());
        oid.id = "field";
        oid.idWritten = false;
        ObjectIdWriter w = writer(null, false, serializer);

        oid.writeAsField(gen, provider, w);

        assertTrue(oid.idWritten);
        verify(gen).canWriteObjectId();
        verifyNoMoreInteractions(gen);
        verifyZeroInteractions(serializer);
    }
}