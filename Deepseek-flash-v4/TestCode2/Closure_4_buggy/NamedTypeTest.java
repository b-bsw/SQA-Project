package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.ErrorReporter;

public class NamedTypeTest {

    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        registry = createRegistry();
    }

    private static JSTypeRegistry createRegistry() {
        ErrorReporter reporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {
            }

            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {
            }
        };
        return new JSTypeRegistry(reporter);
    }

    @Test
    public void testConstructorStoresReference() {
        NamedType type = new NamedType(registry, "foo.Bar", "source", 1, 2);
        assertEquals("foo.Bar", type.getReferenceName());
    }

    @Test
    public void testConstructorAllowsEmptyReference() {
        NamedType type = new NamedType(registry, "", null, 0, 0);
        assertEquals("", type.getReferenceName());
        assertTrue(type.hasReferenceName());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorRejectsNullReference() {
        new NamedType(registry, null, null, 0, 0);
    }

    @Test
    public void testHashCodeUsesReference() {
        NamedType type = new NamedType(registry, "abc", null, 0, 0);
        assertEquals("abc".hashCode(), type.hashCode());
    }

    @Test
    public void testInitiallyUnresolved() {
        NamedType type = new NamedType(registry, "foo", null, 0, 0);
        assertFalse(type.isResolved());
    }

    @Test
    public void testIsNamedType() {
        NamedType type = new NamedType(registry, "foo", null, 0, 0);
        assertTrue(type.isNamedType());
    }

    @Test
    public void testHasReferenceName() {
        NamedType type = new NamedType(registry, "foo", null, 0, 0);
        assertTrue(type.hasReferenceName());
    }

    @Test
    public void testDefinePropertySavesWhenUnresolved() {
        NamedType type = new NamedType(registry, "foo", null, 0, 0);
        JSType propertyType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        assertTrue(type.defineProperty("prop", propertyType, false, null));
    }
}