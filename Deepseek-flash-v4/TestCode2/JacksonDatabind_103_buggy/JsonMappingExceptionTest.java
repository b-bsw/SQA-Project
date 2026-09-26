package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

public class JsonMappingExceptionTest {

    private static final String TEST_CLASS_REF = "com.fasterxml.jackson.databind.JsonMappingExceptionTest";

    @Test
    public void testReferenceDefaults() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference();
        assertNull(ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
        assertEquals("UNKNOWN[?]", ref.getDescription());
        assertEquals("UNKNOWN[?]", ref.toString());
    }

    @Test
    public void testReferenceFromClassAndFieldName() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String.class, "id");
        assertSame(String.class, ref.getFrom());
        assertEquals("id", ref.getFieldName());
        assertEquals(-1, ref.getIndex());
        assertEquals("java.lang.String[\"id\"]", ref.getDescription());
    }

    @Test
    public void testReferenceFromClassAndIndex() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(getClass(), 3);
        assertSame(getClass(), ref.getFrom());
        assertEquals(3, ref.getIndex());
        assertEquals(TEST_CLASS_REF + "[3]", ref.getDescription());
    }

    @Test
    public void testReferenceNullFieldNameThrows() {
        try {
            new JsonMappingException.Reference("value", null);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals("Cannot pass null fieldName", expected.getMessage());
        }
    }

    @Test
    public void testReferenceWithoutFieldOrIndexUsesQuestionMark() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String.class);
        assertEquals("java.lang.String[?]", ref.getDescription());
    }

    @Test
    public void testSimpleConstructorAndGetMessage() {
        JsonMappingException e = new JsonMappingException("boom");
        assertEquals("boom", e.getMessage());
        assertNull(e.getCause());
        assertNull(e.getProcessor());
    }

    @Test
    public void testConstructorWithCause() {
        RuntimeException cause = new RuntimeException("root cause");
        JsonMappingException e = new JsonMappingException("boom", cause);
        assertSame(cause, e.getCause());
        assertEquals("boom", e.getMessage());
    }

    @Test
    public void testConstructorWithCloseableProcessor() {
        Closeable processor = newCloseable();
        JsonMappingException e = new JsonMappingException(processor, "boom");
        assertSame(processor, e.getProcessor());
        assertEquals("boom", e.getMessage());
    }

    @Test
    public void testConstructorWithProcessorAndCause() {
        Closeable processor = newCloseable();
        IOException cause = new IOException("io failure");
        JsonMappingException e = new JsonMappingException(processor, "boom", cause);
        assertSame(processor, e.getProcessor());
        assertSame(cause, e.getCause());
    }

    @Test
    public void testToString() {
        JsonMappingException e = new JsonMappingException("boom");
        assertEquals("com.fasterxml.jackson.databind.JsonMappingException: boom", e.toString());
    }

    @Test
    public void testFromJsonParserFactoryMethods() {
        JsonMappingException e = JsonMappingException.from((JsonParser) null, "parse failed");
        assertEquals("parse failed", e.getMessage());
        assertNull(e.getProcessor());

        Throwable problem = new RuntimeException("parse problem");
        JsonMappingException withCause = JsonMappingException.from((JsonParser) null, "parse failed", problem);
        assertSame(problem, withCause.getCause());
    }

    @Test
    public void testFromJsonGeneratorFactoryMethods() {
        JsonMappingException e = JsonMappingException.from((JsonGenerator) null, "generator failed");
        assertEquals("generator failed", e.getMessage());
        assertNull(e.getProcessor());

        Throwable problem = new RuntimeException("generator problem");
        JsonMappingException withCause = JsonMappingException.from((JsonGenerator) null, "generator failed", problem);
        assertSame(problem, withCause.getCause());
    }

    @Test
    public void testGetMessageContainsPathInformation() {
        JsonMappingException e = new JsonMappingException("problem");
        e.prependPath(String.class, "field");

        String message = e.getMessage();
        assertTrue(message.contains("problem"));
        assertTrue(message.contains("through reference chain"));
        assertTrue(message.contains("java.lang.String[\"field\"]"));
    }

    @Test
    public void testGetPathReferenceWithFieldName() {
        JsonMappingException e = new JsonMappingException("x");
        e.prependPath(String.class, "field");
        assertEquals("java.lang.String[\"field\"]", e.getPathReference());
    }

    @Test
    public void testGetPathReferenceWithIndex() {
        JsonMappingException e = new JsonMappingException("x");
        e.prependPath(getClass(), 3);
        assertEquals(TEST_CLASS_REF + "[3]", e.getPathReference());
    }

    @Test
    public void testPrependOrderIsFirstToLast() {
        JsonMappingException e = new JsonMappingException("x");
        e.prependPath(String.class, "outer");
        e.prependPath(getClass(), "inner");

        assertEquals(
                TEST_CLASS_REF + "[\"inner\"]->java.lang.String[\"outer\"]",
                e.getPathReference()
        );
    }

    @Test
    public void testGetPathIsEmptyWhenNoReferences() {
        JsonMappingException e = new JsonMappingException("x");
        assertTrue(e.getPath().isEmpty());
        assertEquals("N/A", e.getPathReference());
    }

    @Test
    public void testGetPathIsUnmodifiable() {
        JsonMappingException e = new JsonMappingException("x");
        e.prependPath(String.class, "field");

        List<JsonMappingException.Reference> path = e.getPath();
        assertEquals(1, path.size());
        assertSame(String.class, path.get(0).getFrom());

        try {
            path.add(null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testGetPathReferenceAppendsToExistingBuilder() {
        JsonMappingException e = new JsonMappingException("x");
        e.prependPath(String.class, "field");

        StringBuilder builder = new StringBuilder("prefix:");
        assertSame(builder, e.getPathReference(builder));
        assertEquals("prefix:java.lang.String[\"field\"]", builder.toString());
    }

    @Test
    public void testPrependPathWithNullFieldNameThrows() {
        JsonMappingException e = new JsonMappingException("x");
        try {
            e.prependPath(String.class, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals("Cannot pass null fieldName", expected.getMessage());
        }
    }

    @Test
    public void testWrapWithPathNewException() {
        IllegalStateException original = new IllegalStateException("bad state");
        JsonMappingException e = JsonMappingException.wrapWithPath(original, getClass(), "field");

        assertSame(original, e.getCause());
        assertTrue(e.getMessage().contains("bad state"));
        assertEquals(1, e.getPath().size());
        assertEquals(TEST_CLASS_REF + "[\"field\"]", e.getPathReference());
    }

    @Test
    public void testWrapWithPathWithNullOriginalMessage() {
        IllegalStateException original = new IllegalStateException();
        JsonMappingException e = JsonMappingException.wrapWithPath(original, getClass(), "field");

        assertSame(original, e.getCause());
        assertTrue(e.getMessage().contains("(was java.lang.IllegalStateException)"));
    }

    @Test
    public void testWrapWithPathWithIndex() {
        JsonMappingException e = JsonMappingException.wrapWithPath(
                new RuntimeException("boom"), getClass(), 42);

        assertEquals(1, e.getPath().size());
        assertEquals(42, e.getPath().get(0).getIndex());
        assertEquals(TEST_CLASS_REF + "[42]", e.getPathReference());
    }

    @Test
    public void testWrapWithPathOnExistingJsonMappingException() {
        JsonMappingException original = new JsonMappingException("original");
        JsonMappingException result = JsonMappingException.wrapWithPath(original, String.class, "field");

        assertSame(original, result);
        assertEquals(1, result.getPath().size());
        assertEquals(1, result.getPath().size());
        assertTrue(result.getPathReference().contains("java.lang.String[\"field\"]"));
    }

    private static Closeable newCloseable() {
        return new Closeable() {
            @Override
            public void close() throws IOException {
            }
        };
    }
}