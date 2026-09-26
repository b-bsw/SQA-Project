package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTypeTest {

    private MapType mapType;
    private JavaType keyType;
    private JavaType valueType;
    private JavaType otherKeyType;
    private JavaType otherValueType;

    @Before
    public void setUp() {
        keyType = SimpleType.construct(String.class);
        valueType = SimpleType.construct(Integer.class);
        otherKeyType = SimpleType.construct(Long.class);
        otherValueType = SimpleType.construct(Double.class);
        mapType = MapType.construct(HashMap.class, keyType, valueType);
    }

    @After
    public void tearDown() {
        // no cleanup needed
    }

    @Test
    public void testConstruct() {
        assertNotNull("MapType should not be null", mapType);
        assertEquals("Raw type should be HashMap", HashMap.class, mapType.getRawClass());
        assertEquals("Key type should match", keyType, mapType.getKeyType());
        assertEquals("Content type should match", valueType, mapType.getContentType());
    }

    @Test
    public void testWithTypeHandler() {
        Object handler = new Object();
        MapType withHandler = mapType.withTypeHandler(handler);
        assertNotNull("withTypeHandler should return non-null", withHandler);
        assertNotSame("Should be a new instance", mapType, withHandler);

        // calling again with same handler returns a new instance (no identity check)
        MapType withHandlerAgain = mapType.withTypeHandler(handler);
        assertNotSame("Should still be new", withHandler, withHandlerAgain);
    }

    @Test
    public void testWithContentTypeHandler() {
        Object handler = new Object();
        MapType withHandler = mapType.withContentTypeHandler(handler);
        assertNotNull("withContentTypeHandler should return non-null", withHandler);
        assertNotSame("Should be a new instance", mapType, withHandler);
    }

    @Test
    public void testWithValueHandler() {
        Object handler = new Object();
        MapType withHandler = mapType.withValueHandler(handler);
        assertNotNull("withValueHandler should return non-null", withHandler);
        assertNotSame("Should be a new instance", mapType, withHandler);
    }

    @Test
    public void testWithContentValueHandler() {
        Object handler = new Object();
        MapType withHandler = mapType.withContentValueHandler(handler);
        assertNotNull("withContentValueHandler should return non-null", withHandler);
        assertNotSame("Should be a new instance", mapType, withHandler);
    }

    @Test
    public void testWithStaticTyping() {
        MapType firstStatic = mapType.withStaticTyping();
        assertNotNull("withStaticTyping should return non-null", firstStatic);
        assertNotSame("Should be a new instance (asStatic false)", mapType, firstStatic);

        // second call on the instance that already has static typing => returns itself
        MapType secondStatic = firstStatic.withStaticTyping();
        assertSame("Should return same instance when already static", firstStatic, secondStatic);
    }

    @Test
    public void testWithContentType() {
        // same content type as existing -> returns this
        MapType same = mapType.withContentType(valueType);
        assertSame("Should return same instance when content type identical", mapType, same);

        // different content type -> new instance
        MapType different = mapType.withContentType(otherValueType);
        assertNotNull("withContentType should return non-null", different);
        assertNotSame("Should be a new instance", mapType, different);
        assertEquals("Content type should be updated", otherValueType, different.getContentType());
    }

    @Test
    public void testWithKeyType() {
        // same key type -> returns this
        MapType same = mapType.withKeyType(keyType);
        assertSame("Should return same instance when key type identical", mapType, same);

        // different key type -> new instance
        MapType different = mapType.withKeyType(otherKeyType);
        assertNotNull("withKeyType should return non-null", different);
        assertNotSame("Should be a new instance", mapType, different);
        assertEquals("Key type should be updated", otherKeyType, different.getKeyType());
    }

    @Test
    public void testRefine() {
        // use null bindings, superClass, superInterfaces
        MapType refined = mapType.refine(LinkedHashMap.class, null, null, null);
        assertNotNull("refine should return non-null", refined);
        assertEquals("Refined raw type should be LinkedHashMap", LinkedHashMap.class, refined.getRawClass());
        assertNotSame("Should be a new instance", mapType, refined);
    }

    @Test
    public void testWithKeyTypeHandler() {
        Object handler = new Object();
        MapType withHandler = mapType.withKeyTypeHandler(handler);
        assertNotNull("withKeyTypeHandler should return non-null", withHandler);
        assertNotSame("Should be a new instance", mapType, withHandler);
    }

    @Test
    public void testWithKeyValueHandler() {
        Object handler = new Object();
        MapType withHandler = mapType.withKeyValueHandler(handler);
        assertNotNull("withKeyValueHandler should return non-null", withHandler);
        assertNotSame("Should be a new instance", mapType, withHandler);
    }

    @Test
    public void testToString() {
        String str = mapType.toString();
        assertTrue("toString should start with '[map type; class '",
                str.startsWith("[map type; class "));
        assertTrue("toString should contain ' -> '", str.contains(" -> "));
        assertTrue("toString should end with ']'", str.endsWith("]"));
    }
}