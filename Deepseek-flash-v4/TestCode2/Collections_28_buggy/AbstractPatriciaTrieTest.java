package org.apache.commons.collections4.trie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

import org.junit.Before;
import org.junit.Test;

public class AbstractPatriciaTrieTest {

    private static final KeyAnalyzer<String> STRING_KEY_ANALYZER = new StringKeyAnalyzer();

    private static class StringKeyAnalyzer extends KeyAnalyzer<String> {
        private static final long serialVersionUID = 1L;

        @Override
        public int bitsPerElement() {
            return 8;
        }

        @Override
        public int lengthInBits(String key) {
            return key == null ? 0 : key.length() * 8;
        }

        @Override
        public int bitIndex(String key, int offsetInBits, int lengthInBits,
                            String otherKey, int otherOffsetInBits, int otherLengthInBits) {
            if (key == null || otherKey == null) {
                return KeyAnalyzer.NULL_BIT_KEY;
            }
            int minLen = Math.min(lengthInBits, otherLengthInBits);
            for (int i = 0; i < minLen; i++) {
                int kBit = (key.charAt(i / 8) >> (7 - (i % 8))) & 1;
                int oBit = (otherKey.charAt(i / 8) >> (7 - (i % 8))) & 1;
                if (kBit != oBit) {
                    return i;
                }
            }
            if (lengthInBits != otherLengthInBits) {
                return minLen;
            }
            return KeyAnalyzer.EQUAL_BIT_KEY;
        }

        @Override
        public boolean isBitSet(String key, int bitIndex, int lengthInBits) {
            if (key == null) {
                return false;
            }
            int byteIndex = bitIndex / 8;
            int bitOffset = 7 - (bitIndex % 8);
            return (key.charAt(byteIndex) & (1 << bitOffset)) != 0;
        }

        @Override
        public boolean isPrefix(String prefix, int offsetInBits, int lengthInBits, String key) {
            if (prefix == null || key == null) {
                return false;
            }
            if (lengthInBits > lengthInBits(key)) {
                return false;
            }
            for (int i = 0; i < lengthInBits; i++) {
                int pBit = (prefix.charAt((offsetInBits + i) / 8) >> (7 - ((offsetInBits + i) % 8))) & 1;
                int kBit = (key.charAt(i / 8) >> (7 - (i % 8))) & 1;
                if (pBit != kBit) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int compare(String a, String b) {
            return a.compareTo(b);
        }
    }

    private static class SimplePatriciaTrie extends AbstractPatriciaTrie<String, String> {
        private static final long serialVersionUID = 1L;

        public SimplePatriciaTrie() {
            super(STRING_KEY_ANALYZER);
        }

        public SimplePatriciaTrie(Map<? extends String, ? extends String> map) {
            super(STRING_KEY_ANALYZER, map);
        }
    }

    private SimplePatriciaTrie trie;

    @Before
    public void setUp() {
        trie = new SimplePatriciaTrie();
    }

    @Test
    public void testPutAndGet() {
        assertNull(trie.put("key1", "value1"));
        assertEquals("value1", trie.get("key1"));
    }

    @Test
    public void testPutDuplicateKeyUpdatesValue() {
        trie.put("key", "value1");
        assertEquals("value1", trie.put("key", "value2"));
        assertEquals("value2", trie.get("key"));
    }

    @Test(expected = NullPointerException.class)
    public void testPutNullKeyThrowsException() {
        trie.put(null, "value");
    }

    @Test
    public void testGetNonExistentKeyReturnsNull() {
        assertNull(trie.get("nonexistent"));
    }

    @Test
    public void testGetNullKeyReturnsNull() {
        assertNull(trie.get(null));
    }

    @Test
    public void testSizeAfterPutAndRemove() {
        assertEquals(0, trie.size());
        trie.put("a", "1");
        assertEquals(1, trie.size());
        trie.put("b", "2");
        assertEquals(2, trie.size());
        trie.remove("a");
        assertEquals(1, trie.size());
    }

    @Test
    public void testContainsKey() {
        trie.put("key", "value");
        assertTrue(trie.containsKey("key"));
        assertFalse(trie.containsKey("nonexistent"));
        assertFalse(trie.containsKey(null));
    }

    @Test
    public void testRemoveExistingKey() {
        trie.put("key", "value");
        assertEquals("value", trie.remove("key"));
        assertNull(trie.get("key"));
    }

    @Test
    public void testRemoveNonExistentKeyReturnsNull() {
        assertNull(trie.remove("nonexistent"));
    }

    @Test
    public void testRemoveNullKeyReturnsNull() {
        assertNull(trie.remove(null));
    }

    @Test
    public void testClear() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.clear();
        assertEquals(0, trie.size());
        assertNull(trie.get("a"));
        assertTrue(trie.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKeyOnEmptyThrowsException() {
        trie.firstKey();
    }

    @Test
    public void testFirstKey() {
        trie.put("b", "2");
        trie.put("a", "1");
        assertEquals("a", trie.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKeyOnEmptyThrowsException() {
        trie.lastKey();
    }

    @Test
    public void testLastKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals("b", trie.lastKey());
    }

    @Test(expected = NullPointerException.class)
    public void testNextKeyWithNullThrowsException() {
        trie.nextKey(null);
    }

    @Test
    public void testNextKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals("b", trie.nextKey("a"));
        assertNull(trie.nextKey("b"));
    }

    @Test
    public void testNextKeyForNonExistentKeyReturnsNull() {
        trie.put("a", "1");
        assertNull(trie.nextKey("nonexistent"));
    }

    @Test(expected = NullPointerException.class)
    public void testPreviousKeyWithNullThrowsException() {
        trie.previousKey(null);
    }

    @Test
    public void testPreviousKey() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertNull(trie.previousKey("a"));
        assertEquals("a", trie.previousKey("b"));
    }

    @Test
    public void testPreviousKeyForNonExistentKeyReturnsNull() {
        trie.put("a", "1");
        assertNull(trie.previousKey("nonexistent"));
    }

    @Test
    public void testSelect() {
        trie.put("key", "value");
        Map.Entry<String, String> entry = trie.select("key");
        assertNotNull(entry);
        assertEquals("key", entry.getKey());
        assertEquals("value", entry.getValue());
    }

    @Test
    public void testSelectWithNonMatchingKeyReturnsNull() {
        trie.put("key1", "value1");
        assertNull(trie.select("key2"));
    }

    @Test
    public void testSelectKey() {
        trie.put("key", "value");
        assertEquals("key", trie.selectKey("key"));
    }

    @Test
    public void testSelectKeyWithNonMatchingKeyReturnsNull() {
        trie.put("key1", "value1");
        assertNull(trie.selectKey("key2"));
    }

    @Test
    public void testSelectValue() {
        trie.put("key", "value");
        assertEquals("value", trie.selectValue("key"));
    }

    @Test
    public void testSelectValueWithNonMatchingKeyReturnsNull() {
        trie.put("key1", "value1");
        assertNull(trie.selectValue("key2"));
    }

    @Test
    public void testSubMap() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        SortedMap<String, String> sub = trie.subMap("a", "c");
        assertEquals(2, sub.size());
        assertTrue(sub.containsKey("a"));
        assertTrue(sub.containsKey("b"));
        assertFalse(sub.containsKey("c"));
    }

    @Test
    public void testHeadMap() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        SortedMap<String, String> head = trie.headMap("b");
        assertEquals(1, head.size());
        assertTrue(head.containsKey("a"));
        assertFalse(head.containsKey("b"));
    }

    @Test
    public void testTailMap() {
        trie.put("a", "1");
        trie.put("b", "2");
        trie.put("c", "3");
        SortedMap<String, String> tail = trie.tailMap("b");
        assertEquals(2, tail.size());
        assertTrue(tail.containsKey("b"));
        assertTrue(tail.containsKey("c"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrefixMapWithInvalidOffsetThrowsException() {
        trie.prefixMap("");
    }

    @Test
    public void testKeySet() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.keySet().size());
        assertTrue(trie.keySet().contains("a"));
        assertTrue(trie.keySet().contains("b"));
    }

    @Test
    public void testValues() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertEquals(2, trie.values().size());
        assertTrue(trie.values().contains("1"));
        assertTrue(trie.values().contains("2"));
    }

    @Test
    public void testMapIterator() {
        trie.put("a", "1");
        trie.put("b", "2");
        OrderedMapIterator<String, String> it = trie.mapIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("a", it.getKey());
        assertEquals("1", it.getValue());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testMapIteratorSetValue() {
        trie.put("key", "old");
        OrderedMapIterator<String, String> it = trie.mapIterator();
        it.next();
        assertEquals("old", it.setValue("new"));
        assertEquals("new", trie.get("key"));
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorGetKeyBeforeNextThrows() {
        OrderedMapIterator<String, String> it = trie.mapIterator();
        it.getKey();
    }

    @Test(expected = IllegalStateException.class)
    public void testMapIteratorGetValueBeforeNextThrows() {
        OrderedMapIterator<String, String> it = trie.mapIterator();
        it.getValue();
    }

    @Test
    public void testEntrySetContains() {
        trie.put("key", "value");
        Map.Entry<String, String> entry = new java.util.AbstractMap.SimpleEntry<>("key", "value");
        assertTrue(trie.entrySet().contains(entry));
    }

    @Test
    public void testEntrySetRemove() {
        trie.put("key", "value");
        Map.Entry<String, String> entry = new java.util.AbstractMap.SimpleEntry<>("key", "value");
        assertTrue(trie.entrySet().remove(entry));
        assertFalse(trie.containsKey("key"));
    }

    @Test
    public void testIsEmptyAfterClear() {
        trie.put("key", "value");
        assertFalse(trie.isEmpty());
        trie.clear();
        assertTrue(trie.isEmpty());
    }

    @Test
    public void testPutWithEmptyKey() {
        assertNull(trie.put("", "empty"));
        assertEquals("empty", trie.get(""));
    }

    @Test
    public void testContainsValue() {
        trie.put("key", "value");
        assertTrue(trie.containsValue("value"));
        assertFalse(trie.containsValue("nonexistent"));
    }

    @Test
    public void testEquals() {
        SimplePatriciaTrie other = new SimplePatriciaTrie();
        trie.put("a", "1");
        other.put("a", "1");
        assertTrue(trie.equals(other));
        other.put("b", "2");
        assertFalse(trie.equals(other));
    }

    @Test
    public void testHashCode() {
        trie.put("a", "1");
        trie.put("b", "2");
        assertNotNull(trie.hashCode());
    }

    @Test
    public void testToString() {
        trie.put("a", "1");
        assertNotNull(trie.toString());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorOnEmptyTrieThrows() {
        trie.mapIterator().next();
    }

    @Test
    public void testMultiplePutAndGet() {
        for (int i = 0; i < 100; i++) {
            String key = "key" + i;
            String value = "value" + i;
            trie.put(key, value);
        }
        for (int i = 0; i < 100; i++) {
            assertEquals("value" + i, trie.get("key" + i));
        }
        assertEquals(100, trie.size());
    }

    @Test
    public void testRemoveAll() {
        for (int i = 0; i < 10; i++) {
            trie.put("key" + i, "value" + i);
        }
        for (int i = 0; i < 10; i++) {
            trie.remove("key" + i);
        }
        assertTrue(trie.isEmpty());
    }
}