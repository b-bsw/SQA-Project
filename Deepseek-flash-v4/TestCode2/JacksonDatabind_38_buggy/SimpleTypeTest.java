package com.fasterxml.jackson.databind.type;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleTypeTest {

    // constructUnsafe
    @Test
    public void testConstructUnsafe() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructUnsafeNull() {
        SimpleType.constructUnsafe(null);
    }

    // construct
    @Test
    public void testConstructValid() {
        SimpleType type = SimpleType.construct(Integer.class);
        assertNotNull(type);
        assertEquals(Integer.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructMap() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructCollection() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructArray() {
        SimpleType.construct(int[].class);
    }

    // _narrow
    @Test
    public void testNarrowSameClass() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        JavaType narrowed = type._narrow(String.class);
        assertSame(type, narrowed);
    }

    @Test
    public void testNarrowDifferentClass() {
        SimpleType type = SimpleType.constructUnsafe(Object.class);
        JavaType narrowed = type._narrow(String.class);
        assertNotNull(narrowed);
        assertEquals(String.class, narrowed.getRawClass());
        assertNotSame(type, narrowed);
    }

    @Test(expected = NullPointerException.class)
    public void testNarrowNull() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type._narrow(null);
    }

    // withTypeHandler
    @Test
    public void testWithTypeHandlerSame() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType result = type.withTypeHandler(null);
        assertSame(type, result);
    }

    @Test
    public void testWithTypeHandlerDifferent() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object h = new Object();
        SimpleType result = type.withTypeHandler(h);
        assertNotNull(result);
        assertNotSame(type, result);
    }

    // withValueHandler
    @Test
    public void testWithValueHandlerSame() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType result = type.withValueHandler(null);
        assertSame(type, result);
    }

    @Test
    public void testWithValueHandlerDifferent() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object h = new Object();
        SimpleType result = type.withValueHandler(h);
        assertNotNull(result);
        assertNotSame(type, result);
    }

    // withStaticTyping
    @Test
    public void testWithStaticTypingWhenStaticReturnsThis() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType staticType = type.withStaticTyping();
        SimpleType again = staticType.withStaticTyping();
        assertSame(staticType, again);
    }

    @Test
    public void testWithStaticTypingNonStaticReturnsNew() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType result = type.withStaticTyping();
        assertNotNull(result);
        assertNotSame(type, result);
    }

    // refine
    @Test
    public void testRefineReturnsNull() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNull(type.refine(String.class, null, null, null));
    }

    // withContentType throws
    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeThrows() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentType(null);
    }

    // withContentTypeHandler throws
    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandlerThrows() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentTypeHandler(null);
    }

    // withContentValueHandler throws
    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandlerThrows() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        type.withContentValueHandler(null);
    }

    // isContainerType
    @Test
    public void testIsContainerType() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.isContainerType());
    }

    // toString
    @Test
    public void testToString() {
        SimpleType type = SimpleType.construct(String.class);
        String str = type.toString();
        assertTrue(str.startsWith("[simple type, class "));
        assertTrue(str.contains("java.lang.String"));
        assertTrue(str.endsWith("]"));
    }

    // buildCanonicalName
    @Test
    public void testBuildCanonicalName() {
        SimpleType type = SimpleType.construct(String.class);
        String name = type.buildCanonicalName();
        assertEquals("java.lang.String", name);
    }

    // getErasedSignature
    @Test
    public void testGetErasedSignature() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertSame(sb, result);
        String sig = sb.toString();
        assertTrue(sig.contains("Ljava/lang/String;"));
    }

    // getGenericSignature
    @Test
    public void testGetGenericSignature() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertSame(sb, result);
        String sig = sb.toString();
        assertTrue(sig.startsWith("Ljava/lang/String;"));
        assertTrue(sig.endsWith(";"));
    }

    // equals
    @Test
    public void testEqualsSameObject() {
        SimpleType type = SimpleType.construct(String.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEqualsNull() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.equals("string"));
    }

    @Test
    public void testEqualsDifferentRawClass() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(Integer.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEqualsSameRawAndBindings() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        assertTrue(type1.equals(type2));
    }
}