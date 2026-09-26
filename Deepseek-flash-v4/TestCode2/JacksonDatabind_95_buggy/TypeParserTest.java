package com.fasterxml.jackson.type;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class TypeParserTest {

    private final TypeParser parser = new TypeParser(TypeFactory.instance);

    private JavaType parse(String typeString) {
        return parser.parse(typeString);
    }

    @Test
    public void testParseSimpleType() {
        JavaType type = parse("java.lang.String");
        assertSame(String.class, type.getRawClass());
    }

    @Test
    public void testParseGenericList() {
        JavaType type = parse("java.util.List<java.lang.String>");
        assertSame(List.class, type.getRawClass());
        assertSame(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testParseMapType() {
        JavaType type = parse("java.util.Map<java.lang.String,java.lang.Integer>");
        assertSame(Map.class, type.getRawClass());
        assertSame(String.class, type.getKeyType().getRawClass());
        assertSame(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testParseNestedGenericType() {
        JavaType type = parse("java.util.Map<java.lang.String,java.util.List<java.lang.Integer>>");
        assertSame(Map.class, type.getRawClass());

        JavaType valueType = type.getContentType();
        assertSame(List.class, valueType.getRawClass());
        assertSame(Integer.class, valueType.getContentType().getRawClass());
    }

    @Test
    public void testParseTrimsWhitespace() {
        JavaType type = parse("  java.util.List < java.lang.String >  ");
        assertSame(List.class, type.getRawClass());
        assertSame(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testParseNullThrowsNullPointerException() {
        try {
            parse(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testParseEmptyInputThrows() {
        try {
            parse("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Unexpected"));
        }
    }

    @Test
    public void testParseTrailingDelimiterThrows() {
        try {
            parse("java.lang.String,");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Unexpected"));
        }
    }

    @Test
    public void testParseUnknownClassThrows() {
        try {
            parse("no.such.Class");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("no.such.Class"));
        }
    }

    @Test
    public void testParseMissingClosingAngleThrows() {
        try {
            parse("java.util.List<java.lang.String");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Unexpected"));
        }
    }

    @Test
    public void testParseEmptyParameterListThrows() {
        try {
            parse("java.util.List<");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Unexpected"));
        }
    }

    @Test
    public void testParseUnexpectedTokenBetweenTypesThrows() {
        try {
            parse("java.util.List<java.util.List<java.lang.String><java.lang.Integer>>");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("Unexpected"));
        }
    }

    @Test
    public void testWithFactoryReturnsSameInstanceForSameFactory() {
        TypeParser localParser = new TypeParser(TypeFactory.instance);
        assertSame(localParser, localParser.withFactory(TypeFactory.instance));
    }

    @Test
    public void testWithFactoryReturnsNewInstanceForDifferentFactory() {
        TypeParser localParser = new TypeParser(TypeFactory.instance);
        TypeParser different = localParser.withFactory(null);
        assertNotNull(different);
        assertNotSame(localParser, different);
    }
}