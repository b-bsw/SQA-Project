package com.google.javascript.rhino.jstype;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import static org.junit.Assert.*;

public class RecordTypeBuilderTest {

    private static enum JSTypeNative {
        OBJECT_TYPE
    }

    private static class ErrorReporter {
        public void warning(String message, String sourceName, int line, String lineSource) {}
        public void error(String message, String sourceName, int line, String lineSource) {}
    }

    private static class StubJSType extends JSType {
        StubJSType() {}
    }

    private StubJSType objectType;
    private ErrorReporter reporter;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        objectType = new StubJSType();
        reporter = new ErrorReporter();
        registry = new JSTypeRegistry(reporter) {
            @Override
            public JSType getNativeObjectType(JSTypeNative type) {
                return objectType;
            }
        };
    }

    @Test
    public void testEmptyBuildReturnsObjectType() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        JSType result = builder.build();
        assertSame("Empty builder must return native object type", objectType, result);
    }

    @Test
    public void testAddPropertyReturnsBuilder() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        Node propNode = new Node(0);
        JSType propType = new StubJSType();
        RecordTypeBuilder returned = builder.addProperty("prop1", propType, propNode);
        assertSame("addProperty must return the builder for chaining", builder, returned);
    }

    @Test
    public void testBuildAfterAddPropertiesReturnsRecordType() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty("a", new StubJSType(), new Node(0));
        JSType result = builder.build();
        assertNotNull("Build result must not be null when properties exist", result);
        assertTrue("Result must be an instance of RecordType", result instanceof RecordType);
    }

    @Test
    public void testDuplicatePropertyReturnsNull() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        Node propNode = new Node(0);
        JSType propType = new StubJSType();
        builder.addProperty("dup", propType, propNode);
        RecordTypeBuilder secondAttempt = builder.addProperty("dup", propType, propNode);
        assertNull("Adding duplicate property must return null", secondAttempt);
    }

    @Test
    public void testMultipleProperties() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty("x", new StubJSType(), new Node(0));
        builder.addProperty("y", new StubJSType(), new Node(0));
        builder.addProperty("z", new StubJSType(), new Node(0));
        JSType result = builder.build();
        assertNotNull("Build result must not be null", result);
        assertTrue("Result must be RecordType", result instanceof RecordType);
    }

    @Test
    public void testAddPropertyWithNullNameAllowed() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty(null, new StubJSType(), new Node(0));
        JSType result = builder.build();
        assertNotNull("Build must succeed even with null property name", result);
        assertTrue("Result must be RecordType", result instanceof RecordType);
    }

    @Test
    public void testAddPropertyWithNullType() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty("nullable", null, new Node(0));
        JSType result = builder.build();
        assertNotNull("Build must succeed with null type", result);
        assertTrue("Result must be RecordType", result instanceof RecordType);
    }

    @Test
    public void testAddPropertyWithNullPropertyNode() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty("noNode", new StubJSType(), null);
        JSType result = builder.build();
        assertNotNull("Build must succeed with null property node", result);
        assertTrue("Result must be RecordType", result instanceof RecordType);
    }

    @Test
    public void testEmptyBuildAfterAddThenRemoveNotPossible() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty("temp", new StubJSType(), new Node(0));
        // No remove method; just verify that the flag stays non-empty
        JSType result = builder.build();
        assertFalse("Result should not be the native object type because isEmpty is false", result == objectType);
    }
}