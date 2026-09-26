package org.apache.commons.collections.map;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

public class CaseInsensitiveMapTest {
    
    private CaseInsensitiveMap map;
    
    @Before
    public void setUp() {
        map = new CaseInsensitiveMap();
    }
    
    @After
    public void tearDown() {
        map = null;
    }
    
    @Test
    public void testDefaultConstructor() {
        assertNotNull("Map should not be null", map);
        assertTrue("Map should be empty", map.isEmpty());
        assertEquals("Map size should be 0", 0, map.size());
    }
    
    @Test
    public void testCapacityConstructor() {
        CaseInsensitiveMap capMap = new CaseInsensitiveMap(10);
        assertNotNull("Map should not be null", capMap);
        assertTrue("Map should be empty", capMap.isEmpty());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCapacityConstructorNegative() {
        new CaseInsensitiveMap(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCapacityConstructorZero() {
        new CaseInsensitiveMap(0);
    }
    
    @Test
    public void testCapacityLoadFactorConstructor() {
        CaseInsensitiveMap capMap = new CaseInsensitiveMap(10, 0.75f);
        assertNotNull("Map should not be null", capMap);
        assertTrue("Map should be empty", capMap.isEmpty());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCapacityLoadFactorConstructorNegativeCapacity() {
        new CaseInsensitiveMap(-1, 0.75f);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCapacityLoadFactorConstructorNegativeLoadFactor() {
        new CaseInsensitiveMap(10, -0.1f);
    }
    
    @Test
    public void testMapConstructor() {
        HashMap<String, String> source = new HashMap<String, String>();
        source.put("Key1", "Value1");
        source.put("KEY2", "Value2");
        CaseInsensitiveMap capMap = new CaseInsensitiveMap(source);
        assertNotNull("Map should not be null", capMap);
        assertEquals("Map size should be 2", 2, capMap.size());
        assertEquals("Value for 'key1' should exist", "Value1", capMap.get("key1"));
        assertEquals("Value for 'key2' should exist", "Value2", capMap.get("key2"));
    }
    
    @Test(expected = NullPointerException.class)
    public void testMapConstructorNull() {
        new CaseInsensitiveMap((Map) null);
    }
    
    @Test
    public void testPutAndGetCaseInsensitive() {
        map.put("Hello", "World");
        assertEquals("get('hello') should return 'World'", "World", map.get("hello"));
        assertEquals("get('HELLO') should return 'World'", "World", map.get("HELLO"));
        assertEquals("get('HelLo') should return 'World'", "World", map.get("HelLo"));
    }
    
    @Test
    public void testPutOverrideCaseInsensitive() {
        map.put("Key", "Value1");
        map.put("KEY", "Value2");
        assertEquals("Should have only one entry", 1, map.size());
        assertEquals("Value should be 'Value2'", "Value2", map.get("key"));
    }
    
    @Test
    public void testPutAndGetNullKey() {
        map.put(null, "NullValue");
        assertEquals("get(null) should return 'NullValue'", "NullValue", map.get(null));
        assertTrue("Map should contain null key", map.containsKey(null));
        assertEquals("Map size should be 1", 1, map.size());
    }
    
    @Test
    public void testGetNonExistentKey() {
        assertNull("get for non-existent key should return null", map.get("nonexistent"));
    }
    
    @Test
    public void testContainsKeyCaseInsensitive() {
        map.put("TestKey", "TestValue");
        assertTrue("ContainsKey 'testkey' should be true", map.containsKey("testkey"));
        assertTrue("ContainsKey 'TESTKEY' should be true", map.containsKey("TESTKEY"));
        assertFalse("ContainsKey 'other' should be false", map.containsKey("other"));
    }
    
    @Test
    public void testContainsKeyNull() {
        map.put(null, "value");
        assertTrue("ContainsKey null should be true", map.containsKey(null));
        map.clear();
        assertFalse("ContainsKey null should be false after clear", map.containsKey(null));
    }
    
    @Test
    public void testRemove() {
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        assertEquals("Remove should return 'Value1'", "Value1", map.remove("KEY1"));
        assertEquals("Map size should be 1", 1, map.size());
        assertNull("Get after remove should return null", map.get("key1"));
    }
    
    @Test
    public void testRemoveNullKey() {
        map.put(null, "NullValue");
        assertEquals("Remove null should return 'NullValue'", "NullValue", map.remove(null));
        assertTrue("Map should be empty after remove", map.isEmpty());
    }
    
    @Test
    public void testClear() {
        map.put("A", "1");
        map.put("B", "2");
        map.put(null, "3");
        assertEquals("Map size should be 3 before clear", 3, map.size());
        map.clear();
        assertTrue("Map should be empty after clear", map.isEmpty());
    }
    
    @Test
    public void testPutAll() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("Alpha", "First");
        source.put("beta", "Second");
        source.put(null, "Third");
        map.putAll(source);
        assertEquals("Map size after putAll should be 3", 3, map.size());
        assertEquals("Get 'ALPHA' should return 'First'", "First", map.get("ALPHA"));
        assertEquals("Get 'Beta' should return 'Second'", "Second", map.get("Beta"));
        assertEquals("Get null should return 'Third'", "Third", map.get(null));
    }
    
    @Test
    public void testPutAllWithDuplicateKeys() {
        map.put("Duplicate", "Original");
        Map<String, String> source = new HashMap<String, String>();
        source.put("DUPLICATE", "Override");
        map.putAll(source);
        assertEquals("Map size should still be 1", 1, map.size());
        assertEquals("Value should be 'Override'", "Override", map.get("duplicate"));
    }
    
    @Test
    public void testKeySet() {
        map.put("KeyOne", "Value1");
        map.put("KeyTwo", "Value2");
        map.put(null, "NullValue");
        map.put("KEYONE", "Override");
        assertEquals("KeySet size should be 3", 3, map.keySet().size());
        assertTrue("KeySet should contain 'keyone'", map.keySet().contains("keyone"));
        assertTrue("KeySet should contain 'keytwo'", map.keySet().contains("keytwo"));
        assertTrue("KeySet should contain null", map.keySet().contains(null));
    }
    
    @Test
    public void testValues() {
        map.put("A", "First");
        map.put("B", "Second");
        assertEquals("Values collection size should be 2", 2, map.values().size());
        assertTrue("Values should contain 'First'", map.values().contains("First"));
        assertTrue("Values should contain 'Second'", map.values().contains("Second"));
    }
    
    @Test
    public void testEntrySet() {
        map.put("Key", "Value");
        assertEquals("EntrySet size should be 1", 1, map.entrySet().size());
    }
    
    @Test
    public void testClone() {
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        CaseInsensitiveMap cloned = (CaseInsensitiveMap) map.clone();
        assertNotNull("Clone should not be null", cloned);
        assertEquals("Cloned map size should be 2", 2, cloned.size());
        assertEquals("Get from clone should work", "Value1", cloned.get("key1"));
        map.put("Key3", "Value3");
        assertEquals("Original should have 3 entries", 3, map.size());
        assertEquals("Clone should still have 2 entries", 2, cloned.size());
    }
    
    @Test
    public void testEmptyMap() {
        assertTrue("Empty map should be empty", map.isEmpty());
        assertEquals("Empty map size should be 0", 0, map.size());
        assertNull("Get from empty map should be null", map.get("anything"));
        assertNull("Remove from empty map should be null", map.remove("anything"));
        assertFalse("ContainsKey on empty map should be false", map.containsKey("anything"));
    }
    
    @Test
    public void testIsEmpty() {
        assertTrue("New map should be empty", map.isEmpty());
        map.put("test", "value");
        assertFalse("Map with entry should not be empty", map.isEmpty());
        map.remove("test");
        assertTrue("Map after remove all should be empty", map.isEmpty());
    }
    
    @Test
    public void testSize() {
        assertEquals("Initial size should be 0", 0, map.size());
        map.put("A", "1");
        assertEquals("After first put, size should be 1", 1, map.size());
        map.put("B", "2");
        assertEquals("After second put, size should be 2", 2, map.size());
        map.put("a", "3");
        assertEquals("After duplicate key put, size should still be 2", 2, map.size());
        map.clear();
        assertEquals("After clear, size should be 0", 0, map.size());
    }
    
    @Test
    public void testMultipleEntries() {
        Map<String, String> source = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            source.put("Key" + i, "Value" + i);
        }
        CaseInsensitiveMap largeMap = new CaseInsensitiveMap(source);
        assertEquals("Map should have 10 entries", 10, largeMap.size());
        for (int i = 0; i < 10; i++) {
            assertEquals("Get key" + i, "Value" + i, largeMap.get("key" + i));
            assertEquals("Get KEY" + i, "Value" + i, largeMap.get("KEY" + i));
        }
    }
    
    @Test
    public void testNullValue() {
        map.put("key", null);
        assertTrue("Map should contain key with null value", map.containsKey("key"));
        assertNull("Value should be null", map.get("key"));
        map.put("KEY", "newValue");
        assertEquals("After override, value should be 'newValue'", "newValue", map.get("key"));
    }
    
    @Test
    public void testContainsValue() {
        map.put("Key", "Value");
        assertTrue("ContainsValue should find 'Value'", map.containsValue("Value"));
        assertFalse("ContainsValue should not find 'Other'", map.containsValue("Other"));
    }
}