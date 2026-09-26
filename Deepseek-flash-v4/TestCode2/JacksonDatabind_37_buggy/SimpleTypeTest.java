package com.fasterxml.jackson.databind.type;

import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SimpleTypeTest {

    private SimpleType stringType;
    private SimpleType stringTypeStatic;
    private Object handler;

    @Before
    public void setUp() {
        stringType = new SimpleType(String.class, TypeBindings.emptyBindings(), null, null);
        stringTypeStatic = new SimpleType(String.class, TypeBindings.emptyBindings(), null, null, null, null, true);
        handler = new Object();
    }

    @Test
    public void testConstructUnsafe() {
        SimpleType type = SimpleType.constructUnsafe(Integer.class);
        assertNotNull(type);
        assertFalse(type.isContainerType());
    }

    @Test
    public void testConstructValid() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertFalse(type.isContainerType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructMapThrows() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructCollectionThrows() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructArrayThrows() {
        SimpleType.construct(int[].class);
    }

    @Test
    public void testWithTypeHandler() {
        assertSame(stringType, stringType.withTypeHandler(null));
        SimpleType newType = stringType.withTypeHandler(handler);
        assertNotSame(stringType, newType);
    }

    @Test
    public void testWithValueHandler() {
        assertSame(stringType, stringType.withValueHandler(null));
        SimpleType newType = stringType.withValueHandler(handler);
        assertNotSame(stringType, newType);
    }

    @Test
    public void testWithStaticTyping() {
        assertNotSame(stringType, stringType.withStaticTyping());
        assertSame(stringTypeStatic, stringTypeStatic.withStaticTyping());
    }

    @Test
    public void testEquals() {
        assertTrue(stringType.equals(stringType));
        assertFalse(stringType.equals(null));
        assertFalse(stringType.equals("a string"));
        SimpleType integerType = new SimpleType(Integer.class, TypeBindings.emptyBindings(), null, null);
        assertFalse(stringType.equals(integerType));
        SimpleType anotherString = new SimpleType(String.class, TypeBindings.emptyBindings(), null, null);
        assertTrue(stringType.equals(anotherString));
    }

    @Test
    public void testBuildCanonicalName() {
        assertEquals("java.lang.String", stringType.buildCanonicalName());
    }

    @Test
    public void testToString() {
        assertEquals("[simple type, class java.lang.String]", stringType.toString());
    }

    @Test
    public void testIsContainerType() {
        assertFalse(stringType.isContainerType());
    }

    @Test
    public void testGetErasedSignature() {
        StringBuilder sb = new StringBuilder();
        stringType.getErasedSignature(sb);
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test
    public void testGetGenericSignature() {
        StringBuilder sb = new StringBuilder();
        stringType.getGenericSignature(sb);
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeThrows() {
        stringType.withContentType(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandlerThrows() {
        stringType.withContentTypeHandler(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandlerThrows() {
        stringType.withContentValueHandler(null);
    }

    @Test
    public void testRefine() {
        assertNull(stringType.refine(null, null, null, null));
    }
}