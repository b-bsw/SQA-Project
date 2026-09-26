package org.apache.commons.collections.map;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.*;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.MultiMap;

public class MultiValueMapTest {

    private MultiValueMap map;
    private MultiValueMap mapWithArrayList;

    @Before
    public void setUp() {
        map = new MultiValueMap();
        mapWithArrayList = (MultiValueMap) MultiValueMap.decorate(new HashMap(), ArrayList.class);
    }

    @Test
    public void testDecorateWithMap() {
        Map base = new HashMap();
        MultiValueMap decorated = MultiValueMap.decorate(base);
        assertNotNull(decorated);
        assertEquals(0, decorated.size());
    }

    @Test
    public void testDecorateWithClass() {
        Map base = new HashMap();
        MultiValueMap decorated = MultiValueMap.decorate(base, ArrayList.class);
        assertNotNull(decorated);
    }

    @Test
    public void testDecorateWithFactory() {
        Map base = new HashMap();
        Factory factory = new Factory() {
            public Object create() {
                return new ArrayList();
            }
        };
        MultiValueMap decorated = MultiValueMap.decorate(base, factory);
        assertNotNull(decorated);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFactory() {
        new MultiValueMap(new HashMap(), null);
    }

    @Test
    public void testPutNormal() {
        Object value = map.put("key1", "value1");
        assertEquals("value1", value);
        Collection coll = map.getCollection("key1");
        assertNotNull(coll);
        assertEquals(1, coll.size());
        assertTrue(coll.contains("value1"));
    }

    @Test
    public void testPutDuplicateValue() {
        map.put("key1", "value1");
        Object result = map.put("key1", "value1");
        assertEquals("value1", result);
        Collection coll = map.getCollection("key1");
        assertEquals(2, coll.size());
    }

    @Test
    public void testPutToExistingKey() {
        map.put("key1", "value1");
        Object result = map.put("key1", "value2");
        assertEquals("value2", result);
        Collection coll = map.getCollection("key1");
        assertEquals(2, coll.size());
    }

    @Test
    public void testPutWithNullValue() {
        Object result = map.put("key1", null);
        assertNull(result);
        Collection coll = map.getCollection("key1");
        assertNotNull(coll);
        assertTrue(coll.contains(null));
    }

    @Test
    public void testGetCollectionNullKey() {
        assertNull(map.getCollection("nonexistent"));
    }

    @Test
    public void testContainsValueWithValue() {
        map.put("key1", "value1");
        assertTrue(map.containsValue("value1"));
    }

    @Test
    public void testContainsValueWithoutValue() {
        assertFalse(map.containsValue("nonexistent"));
    }

    @Test
    public void testContainsValueEmptyMap() {
        assertFalse(map.containsValue("anything"));
    }

    @Test
    public void testRemoveMappingExisting() {
        map.put("key1", "value1");
        Object result = map.removeMapping("key1", "value1");
        assertEquals("value1", result);
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testRemoveMappingNotPresent() {
        map.put("key1", "value1");
        Object result = map.removeMapping("key1", "value2");
        assertNull(result);
        assertNotNull(map.getCollection("key1"));
    }

    @Test
    public void testRemoveMappingFromNullColl() {
        Object result = map.removeMapping("nonexistent", "value");
        assertNull(result);
    }

    @Test
    public void testRemoveMappingLastValueRemovesKey() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.removeMapping("key1", "value1");
        assertNotNull(map.getCollection("key1"));
        map.removeMapping("key1", "value2");
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testClear() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.clear();
        assertEquals(0, map.size());
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testContainsValueWithKey() {
        map.put("key1", "value1");
        assertTrue(map.containsValue("key1", "value1"));
    }

    @Test
    public void testContainsValueWithKeyFalse() {
        map.put("key1", "value1");
        assertFalse(map.containsValue("key1", "value2"));
    }

    @Test
    public void testContainsValueWithKeyNull() {
        assertFalse(map.containsValue("nonexistent", "value"));
    }

    @Test
    public void testSizeForKeyExisting() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        assertEquals(2, map.size("key1"));
    }

    @Test
    public void testSizeForKeyNonexistent() {
        assertEquals(0, map.size("nonexistent"));
    }

    @Test
    public void testPutAllMultiMap() {
        MultiValueMap source = new MultiValueMap();
        source.put("key1", "value1");
        source.put("key1", "value2");
        Map normal = new HashMap();
        normal.put("key1", source.getCollection("key1"));
        map.putAll(normal);
        Collection coll = map.getCollection("key1");
        assertNotNull(coll);
        assertEquals(2, coll.size());
    }

    @Test
    public void testPutAllNormalMap() {
        Map source = new HashMap();
        source.put("key1", "value1");
        source.put("key2", "value2");
        map.putAll(source);
        assertEquals(2, map.size());
        assertTrue(map.containsValue("value1"));
        assertTrue(map.containsValue("value2"));
    }

    @Test
    public void testPutAllWithKeyAndCollection() {
        Collection values = new ArrayList();
        values.add("value1");
        values.add("value2");
        assertTrue(map.putAll("key1", values));
        Collection coll = map.getCollection("key1");
        assertNotNull(coll);
        assertEquals(2, coll.size());
    }

    @Test
    public void testPutAllWithKeyAndNullCollection() {
        assertFalse(map.putAll("key1", null));
    }

    @Test
    public void testPutAllWithKeyAndEmptyCollection() {
        assertFalse(map.putAll("key1", new ArrayList()));
    }

    @Test
    public void testPutAllToExistingKey() {
        map.put("key1", "existing");
        Collection values = new ArrayList();
        values.add("new1");
        values.add("new2");
        assertTrue(map.putAll("key1", values));
        assertEquals(3, map.getCollection("key1").size());
    }

    @Test
    public void testIteratorExistingKey() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Iterator it = map.iterator("key1");
        assertTrue(it.hasNext());
        assertEquals("value1", it.next());
        assertTrue(it.hasNext());
        assertEquals("value2", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorNonExistentKey() {
        Iterator it = map.iterator("nonexistent");
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorRemove() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        Iterator it = map.iterator("key1");
        it.next();
        it.remove();
        Collection coll = map.getCollection("key1");
        assertEquals(1, coll.size());
        assertFalse(coll.contains("value1"));
    }

    @Test
    public void testIteratorRemoveLastEmptiesKey() {
        map.put("key1", "value1");
        Iterator it = map.iterator("key1");
        it.next();
        it.remove();
        assertNull(map.getCollection("key1"));
    }

    @Test
    public void testTotalSizeEmpty() {
        assertEquals(0, map.totalSize());
    }

    @Test
    public void testTotalSizeWithValues() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        assertEquals(3, map.totalSize());
    }

    @Test
    public void testValuesCollection() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key2", "value3");
        Collection values = map.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("value1"));
        assertTrue(values.contains("value2"));
        assertTrue(values.contains("value3"));
    }

    @Test
    public void testValuesClear() {
        map.put("key1", "value1");
        Collection values = map.values();
        values.clear();
        assertEquals(0, map.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutAllWithNullMap() {
        map.putAll((Map) null);
    }

    @Test
    public void testDecorateWithNullMap() {
        try {
            MultiValueMap.decorate(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCreateCollection() {
        Collection coll = map.createCollection(1);
        assertNotNull(coll);
        assertTrue(coll.isEmpty());
    }

    @Test
    public void testReflectionFactoryException() {
        Factory badFactory = new Factory() {
            public Object create() {
                throw new RuntimeException("test");
            }
        };
        try {
            badFactory.create();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }
}