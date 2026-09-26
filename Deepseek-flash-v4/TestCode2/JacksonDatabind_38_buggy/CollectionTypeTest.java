package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

@SuppressWarnings("deprecation")
public class CollectionTypeTest {

    private JavaType stringType() {
        return SimpleType.construct(String.class);
    }

    private JavaType intType() {
        return SimpleType.construct(Integer.class);
    }

    private CollectionType collectionOf(JavaType elementType) {
        return CollectionType.construct(ArrayList.class, elementType);
    }

    @Test
    public void testConstructTwoArg() {
        JavaType element = stringType();
        CollectionType type = CollectionType.construct(ArrayList.class, element);
        assertSame(ArrayList.class, type.getRawClass());
        assertSame(element, type.getContentType());
    }

    @Test
    public void testConstructFiveArg() {
        JavaType element = stringType();
        CollectionType type = CollectionType.construct(ArrayList.class, null, null, null, element);
        assertSame(ArrayList.class, type.getRawClass());
        assertSame(element, type.getContentType());
    }

    @Test
    public void testWithContentTypeSameInstance() {
        CollectionType type = collectionOf(stringType());
        assertSame(type, type.withContentType(type.getContentType()));
    }

    @Test
    public void testWithContentTypeDifferent() {
        CollectionType type = collectionOf(stringType());
        JavaType newElement = intType();
        CollectionType changed = type.withContentType(newElement);
        assertNotSame(type, changed);
        assertSame(newElement, changed.getContentType());
    }

    @Test
    public void testWithTypeHandler() {
        CollectionType type = collectionOf(stringType());
        Object handler = new Object();
        CollectionType typed = type.withTypeHandler(handler);
        assertNotSame(type, typed);
        assertSame(handler, typed.getTypeHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler() {
        CollectionType type = collectionOf(stringType());
        Object handler = new Object();
        CollectionType typed = type.withContentTypeHandler(handler);
        assertNotSame(type, typed);
        assertSame(handler, typed.getContentType().getTypeHandler());
        assertNull(type.getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler() {
        CollectionType type = collectionOf(stringType());
        Object handler = new Object();
        CollectionType typed = type.withValueHandler(handler);
        assertNotSame(type, typed);
        assertSame(handler, typed.getValueHandler());
        assertNull(type.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler() {
        CollectionType type = collectionOf(stringType());
        Object handler = new Object();
        CollectionType typed = type.withContentValueHandler(handler);
        assertNotSame(type, typed);
        assertSame(handler, typed.getContentType().getValueHandler());
        assertNull(type.getContentType().getValueHandler());
    }

    @Test
    public void testNullValueHandlerClearsHandler() {
        Object originalHandler = "handler";
        CollectionType type = collectionOf(stringType()).withValueHandler(originalHandler);
        CollectionType cleared = type.withValueHandler(null);
        assertNotSame(type, cleared);
        assertNull(cleared.getValueHandler());
        assertSame(originalHandler, type.getValueHandler());
    }

    @Test
    public void testWithStaticTyping() {
        CollectionType type = collectionOf(stringType());
        CollectionType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testNarrow() {
        CollectionType type = collectionOf(stringType());
        JavaType narrowed = type._narrow(LinkedList.class);
        assertTrue(narrowed instanceof CollectionType);
        assertNotSame(type, narrowed);
        assertSame(LinkedList.class, narrowed.getRawClass());
        assertSame(type.getContentType(), narrowed.getContentType());
    }

    @Test
    public void testRefine() {
        CollectionType type = collectionOf(stringType());
        JavaType refined = type.refine(LinkedList.class, null, null, null);
        assertTrue(refined instanceof CollectionType);
        assertNotSame(type, refined);
        assertSame(LinkedList.class, refined.getRawClass());
        assertSame(type.getContentType(), refined.getContentType());
    }

    @Test
    public void testToString() {
        JavaType element = stringType();
        CollectionType type = CollectionType.construct(ArrayList.class, element);
        assertEquals("[collection type; class " + ArrayList.class.getName()
                + ", contains " + element.toString() + "]", type.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructNullRawTypeFails() {
        CollectionType.construct(null, stringType());
    }
}