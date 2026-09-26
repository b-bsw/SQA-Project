package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AtomicReferenceDeserializerTest {

    private JavaType fullType;
    private AtomicReferenceDeserializer deserializer;

    @Before
    public void setUp() {
        fullType = TypeFactory.defaultInstance().constructType(AtomicReference.class);
        deserializer = new AtomicReferenceDeserializer(fullType, null, null, null);
    }

    @Test
    public void testGetNullValueReturnsEmptyReference() throws Exception {
        AtomicReference<Object> ref = deserializer.getNullValue(null);

        assertNotNull(ref);
        assertNull(ref.get());
    }

    @Test
    public void testGetNullValueReturnsNewReferenceEachCall() throws Exception {
        assertNotSame(deserializer.getNullValue(null), deserializer.getNullValue(null));
    }

    @Test
    public void testGetEmptyValueReturnsEmptyReference() {
        AtomicReference<?> ref = (AtomicReference<?>) deserializer.getEmptyValue(null);

        assertNotNull(ref);
        assertNull(ref.get());
    }

    @Test
    public void testReferenceValueWrapsContents() {
        Object value = new Object();

        AtomicReference<Object> ref = deserializer.referenceValue(value);

        assertNotNull(ref);
        assertSame(value, ref.get());
    }

    @Test
    public void testReferenceValueAcceptsNullContents() {
        AtomicReference<Object> ref = deserializer.referenceValue(null);

        assertNotNull(ref);
        assertNull(ref.get());
    }

    @Test
    public void testGetReferencedReturnsContents() {
        Object value = new Object();
        AtomicReference<Object> ref = new AtomicReference<Object>(value);

        assertSame(value, deserializer.getReferenced(ref));
    }

    @Test
    public void testGetReferencedReturnsNullForEmptyReference() {
        assertNull(deserializer.getReferenced(new AtomicReference<Object>()));
    }

    @Test
    public void testUpdateReferenceSetsAndReturnsSameReference() {
        AtomicReference<Object> ref = new AtomicReference<Object>("old");

        AtomicReference<Object> result = deserializer.updateReference(ref, "new");

        assertSame(ref, result);
        assertEquals("new", ref.get());
    }

    @Test
    public void testUpdateReferenceWithNullContents() {
        AtomicReference<Object> ref = new AtomicReference<Object>("old");

        AtomicReference<Object> result = deserializer.updateReference(ref, null);

        assertSame(ref, result);
        assertNull(ref.get());
    }

    @Test
    public void testSupportsUpdateReturnsTrue() {
        assertEquals(Boolean.TRUE, deserializer.supportsUpdate(null));
    }

    @Test
    public void testWithResolvedReturnsNewInstance() {
        AtomicReferenceDeserializer resolved = deserializer.withResolved(null, null);

        assertNotNull(resolved);
        assertNotSame(deserializer, resolved);
    }
}