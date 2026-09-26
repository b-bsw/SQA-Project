package org.apache.commons.collections.map;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.iterators.EmptyIterator;
import org.apache.commons.collections.iterators.EmptyMapIterator;
public class Flat3MapTest {
    private Flat3Map map;
    @Before
    public void setUp() {
        map = new Flat3Map();
    }
    @Test
    public void testNewMapIsEmpty() {
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }
    @Test
    public void testPutAndGetOne() {
        assertNull(map.put("key1", "value1"));
        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
        assertEquals("value1", map.get("key1"));
    }
    @Test
    public void testPutAndGetTwo() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }
    @Test
    public void testPutAndGetThree() {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals(3, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
        assertEquals("value3", map.get("key3"));
    }
    @Test
    public void testPutOverwritesExistingKey() {
        assertNull(map.put("key1", "value1"));
        assertEquals("value1", map.put("key1", "newValue"));
        assertEquals("newValue", map.get("key1"));
        assertEquals(1, map.size());
    }
    @Test
    public void testPutFourConvertsToDelegate() {
        map.put("key1", "v1");
        map.put("key2", "v2");
        map.put("key3", "v3");
        map.put("key4", "v4");
        assertEquals(4, map.size());
        assertEquals("v1", map.get("key1"));
        assertEquals("v2", map.get("key2"));
        assertEquals("v3", map.get("key3"));
        assertEquals("v4", map.get("key4"));
    }
    @Test
    public void testPutAllEmptyMap() {
        map.put("key1", "v1");
        map.putAll(new Flat3Map());
        assertEquals(1, map.size());
        assertEquals("v1", map.get("key1"));
    }
    @Test
    public void testPutAllSmallMap() {
        Flat3Map other = new Flat3Map();
        other.put("a", "1");
        other.put("b", "2");
        map.put("existing", "old");
        map.putAll(other);
        assertEquals(3, map.size());
        assertEquals("1", map.get("a"));
        assertEquals("2", map.get("b"));
        assertEquals("old", map.get("existing"));
    }
    @Test
    public void testPutAllLargeMap() {
        Flat3Map other = new Flat3Map();
        other.put("k1", "v1");
        other.put("k2", "v2");
        other.put("k3", "v3");
        other.put("k4", "v4");
        map.putAll(other);
        assertEquals(4, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v4", map.get("k4"));
    }
    @Test
    public void testRemoveFromEmpty() {
        assertNull(map.remove("nonexistent"));
    }
    @Test
    public void testRemoveOnlyEntry() {
        map.put("key", "value");
        assertEquals("value", map.remove("key"));
        assertTrue(map.isEmpty());
    }
    @Test
    public void testRemoveFirstEntry() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals("v1", map.remove("k1"));
        assertEquals(1, map.size());
        assertEquals("v2", map.get("k2"));
        assertNull(map.get("k1"));
    }
    @Test
    public void testRemoveSecondEntry() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        assertEquals("v2", map.remove("k2"));
        assertEquals(1, map.size());
        assertEquals("v1", map.get("k1"));
    }
    @Test
    public void testRemoveMiddleEntryWhenThree() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v2", map.remove("k2"));
        assertEquals(2, map.size());
        assertEquals("v1", map.get("k1"));
        assertEquals("v3", map.get("k3"));
    }
    @Test
    public void testRemoveReorders() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        assertEquals("v1", map.remove("k1"));
        assertEquals(2, map.size());
        assertEquals("v2", map.get("k2"));
        assertEquals("v3", map.get("k3"));
    }
    @Test
    public void testContainsKey() {
        assertFalse(map.containsKey("anything"));
        map.put("a", "1");
        assertTrue(map.containsKey("a"));
        assertFalse(map.containsKey("b"));
        map.put("b", "2");
        assertTrue(map.containsKey("b"));
    }
    @Test
    public void testContainsValue() {
        assertFalse(map.containsValue("anything"));
        map.put("a", "1");
        assertTrue(map.containsValue("1"));
        assertFalse(map.containsValue("2"));
        map.put("b", "2");
        assertTrue(map.containsValue("2"));
    }
    @Test
    public void testClear() {
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
        assertNull(map.get("a"));
    }
    @Test
    public void testClearEmpty() {
        map.clear();
        assertTrue(map.isEmpty());
    }
    @Test(expected = NoSuchElementException.class)
    public void testMapIteratorNextOnEmpty() {
        MapIterator it = map.mapIterator();
        assertFalse(it.hasNext());
        it.next();
    }
    @Test
    public void testMapIterator() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        MapIterator it = map.mapIterator();
        assertTrue(it.hasNext());
        Object key = it.next();
        assertNotNull(key);
        assertEquals("v1", it.getValue());
        it.setValue("new1");
        assertEquals("new1", map.get(key));
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
    }
    @Test
    public void testMapIteratorRemove() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        MapIterator it = map.mapIterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
        assertNull(map.get("k1"));
    }
    @Test
    public void testMapIteratorReset() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Flat3Map.FlatMapIterator it = (Flat3Map.FlatMapIterator) map.mapIterator();
        it.next();
        it.reset();
        assertTrue(it.hasNext());
        assertEquals("k1", it.next());
    }
    @Test
    public void testEntrySetSize() {
        assertEquals(0, map.entrySet().size());
        map.put("a", "1");
        assertEquals(1, map.entrySet().size());
    }
    @Test
    public void testEntrySetIterator() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        assertTrue(it.hasNext());
        Map.Entry entry = (Map.Entry) it.next();
        assertEquals("k1", entry.getKey());
        assertEquals("v1", entry.getValue());
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
    }
    @Test
    public void testEntrySetRemove() {
        map.put("k1", "v1");
        map.put("k2", "v2");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        it.next();
        it.remove();
        assertEquals(1, map.size());
        assertNull(map.get("k1"));
    }
    @Test
    public void testKeySet() {
        map.put("a", "1");
        map.put("b", "2");
        Set keys = map.keySet();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("a"));
        assertTrue(keys.contains("b"));
        assertFalse(keys.contains("c"));
    }
    @Test
    public void testValues() {
        map.put("a", "1");
        map.put("b", "2");
        Collection values = map.values();
        assertEquals(2, values.size());
        assertTrue(values.contains("1"));
        assertTrue(values.contains("2"));
    }
    @Test
    public void testEqualsAndHashCode() {
        Flat3Map other = new Flat3Map();
        assertTrue(map.equals(other));
        assertEquals(map.hashCode(), other.hashCode());
        map.put("a", "1");
        assertFalse(map.equals(other));
        other.put("a", "1");
        assertTrue(map.equals(other));
        assertEquals(map.hashCode(), other.hashCode());
    }
    @Test
    public void testClone() {
        map.put("a", "1");
        map.put("b", "2");
        Flat3Map cloned = (Flat3Map) map.clone();
        assertEquals(map.size(), cloned.size());
        assertEquals("1", cloned.get("a"));
        assertEquals("2", cloned.get("b"));
        cloned.put("c", "3");
        assertEquals(2, map.size());
    }
    @Test
    public void testToString() {
        assertEquals("{}", map.toString());
        map.put("a", "1");
        String str = map.toString();
        assertTrue(str.contains("a") && str.contains("1"));
    }
    @Test
    public void testNullKey() {
        map.put(null, "nullVal");
        assertEquals(1, map.size());
        assertEquals("nullVal", map.get(null));
        assertTrue(map.containsKey(null));
        assertTrue(map.containsValue("nullVal"));
    }
    @Test
    public void testNullValue() {
        map.put("key", null);
        assertEquals(1, map.size());
        assertNull(map.get("key"));
        assertTrue(map.containsValue(null));
    }
    @Test
    public void testRemoveNullKey() {
        map.put(null, "val");
        map.put("a", "1");
        assertEquals(2, map.size());
        assertEquals("val", map.remove(null));
        assertEquals(1, map.size());
        assertNull(map.get(null));
    }
}