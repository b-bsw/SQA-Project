package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class MapLikeTypeTest {

    private JavaType strType;
    private JavaType intType;
    private JavaType longType;
    private MapLikeType mapLike;

    @Before
    public void setUp() {
        TypeFactory tf = TypeFactory.instance;
        strType = tf.constructType(String.class);
        intType = tf.constructType(Integer.class);
        longType = tf.constructType(Long.class);
        mapLike = MapLikeType.construct(HashMap.class, strType, intType);
    }

    @Test
    public void testConstructionAndBasicFlags() {
        assertTrue(mapLike.isContainerType());
        assertTrue(mapLike.isMapLikeType());
        assertTrue(mapLike.isTrueMapType());

        MapLikeType nonMap = MapLikeType.construct(String.class, strType, intType);
        assertFalse(nonMap.isTrueMapType());

        assertSame(strType, mapLike.getKeyType());
        assertSame(intType, mapLike.getContentType());
    }

    @Test
    public void testWithKeyTypeAndContentType() {
        assertSame(mapLike, mapLike.withKeyType(mapLike.getKeyType()));

        MapLikeType newKey = mapLike.withKeyType(longType);
        assertNotSame(mapLike, newKey);
        assertSame(longType, newKey.getKeyType());
        assertSame(intType, newKey.getContentType());

        assertSame(mapLike, mapLike.withContentType(mapLike.getContentType()));

        MapLikeType newValue = mapLike.withContentType(longType);
        assertNotSame(mapLike, newValue);
        assertSame(longType, newValue.getContentType());
        assertSame(strType, newValue.getKeyType());
    }

    @Test
    public void testHandlerModificationMethods() {
        Object handler = new Object();

        MapLikeType keyHandler = mapLike.withKeyTypeHandler(handler);
        assertNotSame(mapLike, keyHandler);
        assertSame(handler, keyHandler.getKeyType().getTypeHandler());

        MapLikeType keyValueHandler = mapLike.withKeyValueHandler("kvHandler");
        assertSame("kvHandler", keyValueHandler.getKeyType().getValueHandler());

        MapLikeType typeHandler = mapLike.withTypeHandler(handler);
        assertSame(handler, typeHandler.getTypeHandler());

        MapLikeType contentTypeHandler = mapLike.withContentTypeHandler(handler);
        assertSame(handler, contentTypeHandler.getContentTypeHandler());

        MapLikeType contentValueHandler = mapLike.withContentValueHandler("cvHandler");
        assertSame("cvHandler", contentValueHandler.getContentValueHandler());
    }

    @Test
    public void testHasHandlers() {
        assertFalse(mapLike.hasHandlers());

        assertTrue(mapLike.withContentTypeHandler("x").hasHandlers());
        assertTrue(mapLike.withKeyTypeHandler("x").hasHandlers());
        assertTrue(mapLike.withValueHandler("x").hasHandlers());
    }

    @Test
    public void testWithStaticTyping() {
        MapLikeType staticType = mapLike.withStaticTyping();
        assertNotSame(mapLike, staticType);
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testUpgradeFrom() {
        MapLikeType upgraded = MapLikeType.upgradeFrom(mapLike, longType, strType);
        assertNotNull(upgraded);
        assertSame(longType, upgraded.getKeyType());
        assertSame(strType, upgraded.getContentType());
        assertEquals(HashMap.class, upgraded.getRawClass());
    }

    @Test
    public void testRefine() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        MapLikeType refined = mapLike.refine(TreeMap.class, bindings, null, null);

        assertNotSame(mapLike, refined);
        assertEquals(TreeMap.class, refined.getRawClass());
        assertSame(strType, refined.getKeyType());
        assertSame(intType, refined.getContentType());
    }

    @Test
    public void testBuildCanonicalName() {
        String canonical = mapLike.buildCanonicalName();
        assertTrue(canonical.startsWith("java.util.HashMap<"));
        assertTrue(canonical.contains("java.lang.String"));
        assertTrue(canonical.contains("java.lang.Integer"));
        assertTrue(canonical.endsWith(">"));
    }

    @Test
    public void testToString() {
        String s = mapLike.toString();
        assertTrue(s.startsWith("[map-like type; class "));
        assertTrue(s.contains("java.util.HashMap"));
        assertTrue(s.contains("java.lang.String"));
        assertTrue(s.contains("java.lang.Integer"));
    }

    @Test
    public void testErasedSignature() {
        String erased = mapLike.getErasedSignature(new StringBuilder()).toString();
        assertEquals("Ljava/util/HashMap;", erased);
    }

    @Test
    public void testGenericSignature() {
        String generic = mapLike.getGenericSignature(new StringBuilder()).toString();
        assertTrue(generic.startsWith("Ljava/util/HashMap<"));
        assertTrue(generic.contains("Ljava/lang/String;"));
        assertTrue(generic.contains("Ljava/lang/Integer;"));
        assertTrue(generic.endsWith(">;"));
    }

    @Test
    public void testEquals() {
        assertTrue(mapLike.equals(mapLike));
        assertFalse(mapLike.equals(null));
        assertFalse(mapLike.equals("not a MapLikeType"));

        MapLikeType same = MapLikeType.construct(HashMap.class, strType, intType);
        assertEquals(mapLike, same);

        assertFalse(mapLike.equals(MapLikeType.construct(HashMap.class, strType, longType)));
        assertFalse(mapLike.equals(MapLikeType.construct(HashMap.class, longType, intType)));
        assertFalse(mapLike.equals(MapLikeType.construct(String.class, strType, intType)));
    }
}