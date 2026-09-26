package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JavaUtilCollectionsDeserializersTest {

    private final TypeFactory TF = TypeFactory.defaultInstance();

    // --- findForCollection tests ---

    @Test
    public void testFindForCollectionAsArrayList() throws Exception {
        JavaType type = TF.constructType(Arrays.asList(1).getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollectionSingletonList() throws Exception {
        JavaType type = TF.constructType(Collections.singletonList("x").getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollectionSingletonSet() throws Exception {
        JavaType type = TF.constructType(Collections.singleton("x").getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollectionUnmodifiableList() throws Exception {
        List<String> list = Collections.unmodifiableList(Collections.singletonList("x"));
        JavaType type = TF.constructType(list.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollectionUnmodifiableSet() throws Exception {
        Set<String> set = Collections.unmodifiableSet(Collections.singleton("x"));
        JavaType type = TF.constructType(set.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollectionNoMatch() throws Exception {
        JavaType type = TF.constructType(ArrayList.class);
        assertNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    // --- findForMap tests ---

    @Test
    public void testFindForMapSingletonMap() throws Exception {
        JavaType type = TF.constructType(Collections.singletonMap("k", "v").getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMapUnmodifiableMap() throws Exception {
        Map<String,String> map = Collections.unmodifiableMap(Collections.singletonMap("k", "v"));
        JavaType type = TF.constructType(map.getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForMap(null, type);
        assertNotNull(deser);
        assertTrue(deser instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMapNoMatch() throws Exception {
        JavaType type = TF.constructType(HashMap.class);
        assertNull(JavaUtilCollectionsDeserializers.findForMap(null, type));
    }

    // --- JavaUtilCollectionsConverter tests ---

    // helper to build converter
    private JavaUtilCollectionsConverter createConverter(int kind, Class<?> rawSuper) {
        JavaType concreteType = TF.constructType(rawSuper == List.class ? ArrayList.class :
                rawSuper == Set.class ? HashSet.class : HashMap.class);
        return JavaUtilCollectionsDeserializers.converter(kind, concreteType, rawSuper);
    }

    @Test
    public void testConvertSingletonSet() {
        JavaUtilCollectionsConverter conv = createConverter(1, Set.class);
        Set<String> input = new HashSet<>();
        input.add("a");
        Object result = conv.convert(input);
        assertTrue(result instanceof Set);
        Set<?> set = (Set<?>) result;
        assertEquals(1, set.size());
        assertTrue(set.contains("a"));
        assertTrue(set.getClass().getName().contains("SingletonSet"));
    }

    @Test
    public void testConvertSingletonList() {
        JavaUtilCollectionsConverter conv = createConverter(2, List.class);
        List<String> input = new ArrayList<>();
        input.add("a");
        Object result = conv.convert(input);
        assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        assertEquals(1, list.size());
        assertEquals("a", list.get(0));
        assertTrue(list.getClass().getName().contains("SingletonList"));
    }

    @Test
    public void testConvertSingletonMap() {
        JavaUtilCollectionsConverter conv = createConverter(3, Map.class);
        Map<String,String> input = new HashMap<>();
        input.put("k", "v");
        Object result = conv.convert(input);
        assertTrue(result instanceof Map);
        Map<?,?> map = (Map<?,?>) result;
        assertEquals(1, map.size());
        assertEquals("v", map.get("k"));
        assertTrue(map.getClass().getName().contains("SingletonMap"));
    }

    @Test
    public void testConvertUnmodifiableSet() {
        JavaUtilCollectionsConverter conv = createConverter(4, Set.class);
        Set<String> input = new HashSet<>();
        input.add("a");
        Set<?> result = (Set<?>) conv.convert(input);
        // verify unmodifiable: add should throw
        try {
            ((Set<Object>) result).add("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testConvertUnmodifiableList() {
        JavaUtilCollectionsConverter conv = createConverter(5, List.class);
        List<String> input = new ArrayList<>();
        input.add("a");
        List<?> result = (List<?>) conv.convert(input);
        try {
            ((List<Object>) result).add("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testConvertUnmodifiableMap() {
        JavaUtilCollectionsConverter conv = createConverter(6, Map.class);
        Map<String,String> input = new HashMap<>();
        input.put("k", "v");
        Map<?,?> result = (Map<?,?>) conv.convert(input);
        try {
            ((Map<Object,Object>) result).put("k2", "v2");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testConvertAsList() {
        JavaUtilCollectionsConverter conv = createConverter(7, List.class);
        List<String> input = new ArrayList<>();
        input.add("a");
        Object result = conv.convert(input);
        assertSame(input, result); // should be same instance
    }

    @Test
    public void testConvertNull() {
        // need a converter with any kind; use 1 for simplicity
        JavaUtilCollectionsConverter conv = createConverter(1, Set.class);
        assertNull(conv.convert(null));
    }

    // --- singleton size check exception tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testConvertSingletonSetEmpty() {
        JavaUtilCollectionsConverter conv = createConverter(1, Set.class);
        Set<String> input = new HashSet<>(); // size 0
        conv.convert(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertSingletonListSizeTwo() {
        JavaUtilCollectionsConverter conv = createConverter(2, List.class);
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("b");
        conv.convert(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertSingletonMapSizeTwo() {
        JavaUtilCollectionsConverter conv = createConverter(3, Map.class);
        Map<String,String> input = new HashMap<>();
        input.put("k1", "v1");
        input.put("k2", "v2");
        conv.convert(input);
    }
}