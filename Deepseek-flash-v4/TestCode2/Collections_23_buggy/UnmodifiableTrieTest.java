package org.apache.commons.collections4.trie;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class UnmodifiableTrieTest {

    private static class SimpleTrie<K, V> extends java.util.AbstractMap<K, V> implements Trie<K, V>, Serializable {
        private static final long serialVersionUID = 1L;
        private final java.util.TreeMap<K, V> map = new java.util.TreeMap<K, V>();

        public SimpleTrie() {}

        @Override
        public Set<Entry<K, V>> entrySet() {
            return map.entrySet();
        }

        @Override
        public V put(K key, V value) {
            return map.put(key, value);
        }

        @Override
        public V get(Object key) {
            return map.get(key);
        }

        public Comparator<? super K> comparator() {
            return map.comparator();
        }

        public K firstKey() {
            return map.firstKey();
        }

        public K lastKey() {
            return map.lastKey();
        }

        public SortedMap<K, V> headMap(K toKey) {
            return map.headMap(toKey);
        }

        public SortedMap<K, V> subMap(K fromKey, K toKey) {
            return map.subMap(fromKey, toKey);
        }

        public SortedMap<K, V> tailMap(K fromKey) {
            return map.tailMap(fromKey);
        }

        public SortedMap<K, V> prefixMap(K key) {
            return map.headMap(key);
        }

        @Override
        public void clear() {
            map.clear();
        }

        @Override
        public boolean containsKey(Object key) {
            return map.containsKey(key);
        }

        @Override
        public boolean containsValue(Object value) {
            return map.containsValue(value);
        }

        @Override
        public boolean isEmpty() {
            return map.isEmpty();
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {
            map.putAll(m);
        }

        @Override
        public V remove(Object key) {
            return map.remove(key);
        }

        @Override
        public int size() {
            return map.size();
        }

        @Override
        public boolean equals(Object o) {
            return map.equals(o);
        }

        @Override
        public int hashCode() {
            return map.hashCode();
        }

        @Override
        public String toString() {
            return map.toString();
        }

        public OrderedMapIterator<K, V> mapIterator() {
            final Iterator<Entry<K, V>> it = entrySet().iterator();
            return new OrderedMapIterator<K, V>() {
                private Entry<K, V> last = null;
                public boolean hasNext() { return it.hasNext(); }
                public K next() { last = it.next(); return last.getKey(); }
                public K getKey() { return last.getKey(); }
                public V getValue() { return last.getValue(); }
                public V setValue(V value) { throw new UnsupportedOperationException(); }
                public void remove() { it.remove(); }
                public boolean hasPrevious() { return false; }
                public K previous() { return null; }
                public K nextKey(K key) { return null; }
                public K previousKey(K key) { return null; }
            };
        }

        public K nextKey(K key) {
            return map.higherKey(key);
        }

        public K previousKey(K key) {
            return map.lowerKey(key);
        }
    }

    private UnmodifiableTrie<String, String> emptyTrie;
    private UnmodifiableTrie<String, String> nonEmptyTrie;
    private SimpleTrie<String, String> delegate;

    @Before
    public void setUp() {
        delegate = new SimpleTrie<String, String>();
        delegate.put("a", "1");
        delegate.put("b", "2");
        delegate.put("c", "3");
        nonEmptyTrie = new UnmodifiableTrie<String, String>(delegate);
        emptyTrie = new UnmodifiableTrie<String, String>(new SimpleTrie<String, String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTrie() {
        new UnmodifiableTrie<String, String>(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableTrieNull() {
        UnmodifiableTrie.unmodifiableTrie(null);
    }

    @Test
    public void testUnmodifiableTrieFactory() {
        UnmodifiableTrie<String, String> trie = UnmodifiableTrie.unmodifiableTrie(delegate);
        assertNotNull(trie);
    }

    @Test
    public void testSize() {
        assertEquals(3, nonEmptyTrie.size());
        assertEquals(0, emptyTrie.size());
    }

    @Test
    public void testIsEmpty() {
        assertFalse(nonEmptyTrie.isEmpty());
        assertTrue(emptyTrie.isEmpty());
    }

    @Test
    public void testContainsKey() {
        assertTrue(nonEmptyTrie.containsKey("a"));
        assertFalse(nonEmptyTrie.containsKey("z"));
        assertFalse(emptyTrie.containsKey("a"));
    }

    @Test
    public void testContainsValue() {
        assertTrue(nonEmptyTrie.containsValue("1"));
        assertFalse(nonEmptyTrie.containsValue("9"));
        assertFalse(emptyTrie.containsValue("1"));
    }

    @Test
    public void testGet() {
        assertEquals("1", nonEmptyTrie.get("a"));
        assertNull(nonEmptyTrie.get("z"));
        assertNull(emptyTrie.get("a"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPut() {
        nonEmptyTrie.put("x", "y");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPutAll() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("x", "y");
        nonEmptyTrie.putAll(map);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove() {
        nonEmptyTrie.remove("a");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testClear() {
        nonEmptyTrie.clear();
    }

    @Test
    public void testKeys() {
        assertEquals("a", nonEmptyTrie.firstKey());
        assertEquals("c", nonEmptyTrie.lastKey());
    }

    @Test
    public void testEntrySet() {
        Set<Map.Entry<String, String>> entries = nonEmptyTrie.entrySet();
        assertEquals(3, entries.size());
        assertTrue(entries.contains(new AbstractMap.SimpleEntry<String, String>("a", "1")));
    }

    @Test
    public void testKeySet() {
        Set<String> keys = nonEmptyTrie.keySet();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("a"));
        assertFalse(keys.contains("z"));
    }

    @Test
    public void testValues() {
        Collection<String> values = nonEmptyTrie.values();
        assertEquals(3, values.size());
        assertTrue(values.contains("1"));
    }

    @Test
    public void testHeadMap() {
        SortedMap<String, String> head = nonEmptyTrie.headMap("b");
        assertEquals(1, head.size());
        assertEquals("1", head.get("a"));
    }

    @Test
    public void testSubMap() {
        SortedMap<String, String> sub = nonEmptyTrie.subMap("a", "c");
        assertEquals(2, sub.size());
    }

    @Test
    public void testTailMap() {
        SortedMap<String, String> tail = nonEmptyTrie.tailMap("b");
        assertEquals(2, tail.size());
    }

    @Test
    public void testPrefixMap() {
        SortedMap<String, String> prefix = nonEmptyTrie.prefixMap("b");
        assertEquals(2, prefix.size());
    }

    @Test
    public void testComparator() {
        assertNull(nonEmptyTrie.comparator());
    }

    @Test
    public void testMapIterator() {
        OrderedMapIterator<String, String> it = nonEmptyTrie.mapIterator();
        assertNotNull(it);
        assertTrue(it.hasNext());
    }

    @Test
    public void testNextKey() {
        assertEquals("b", nonEmptyTrie.nextKey("a"));
        assertNull(nonEmptyTrie.nextKey("c"));
    }

    @Test
    public void testPreviousKey() {
        assertEquals("a", nonEmptyTrie.previousKey("b"));
        assertNull(nonEmptyTrie.previousKey("a"));
    }

    @Test
    public void testHashCode() {
        assertEquals(delegate.hashCode(), nonEmptyTrie.hashCode());
    }

    @Test
    public void testEquals() {
        assertTrue(nonEmptyTrie.equals(delegate));
        assertFalse(nonEmptyTrie.equals(emptyTrie));
    }

    @Test
    public void testToString() {
        assertEquals(delegate.toString(), nonEmptyTrie.toString());
    }
}