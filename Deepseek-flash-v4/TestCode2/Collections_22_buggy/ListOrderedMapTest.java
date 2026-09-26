package org.apache.commons.collections4.map;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ListOrderedMapTest {

    private ListOrderedMap<String, String> map;
    private ListOrderedMap<String, String> emptyMap;

    @Before
    public void setUp() {
        map = new ListOrderedMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        emptyMap = new ListOrderedMap<String, String>();
    }

    @After
    public void tearDown() {
        map = null;
        emptyMap = null;
    }

    @Test
    public void testFirstKeyNormal() {
        Assert.assertEquals("a", map.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirstKeyEmpty() {
        emptyMap.firstKey();
    }

    @Test
    public void testLastKeyNormal() {
        Assert.assertEquals("c", map.lastKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void testLastKeyEmpty() {
        emptyMap.lastKey();
    }

    @Test
    public void testNextKeyMiddle() {
        Assert.assertEquals("c", map.nextKey("b"));
    }

    @Test
    public void testNextKeyLast() {
        Assert.assertNull(map.nextKey("c"));
    }

    @Test
    public void testNextKeyNonExistent() {
        Assert.assertNull(map.nextKey("z"));
    }

    @Test
    public void testPreviousKeyFirst() {
        Assert.assertNull(map.previousKey("a"));
    }

    @Test
    public void testPreviousKeyMiddle() {
        Assert.assertEquals("a", map.previousKey("b"));
    }

    @Test
    public void testPreviousKeyNonExistent() {
        Assert.assertNull(map.previousKey("z"));
    }

    @Test
    public void testPutNewKey() {
        Assert.assertNull(map.put("d", "4"));
        Assert.assertEquals("4", map.get("d"));
        Assert.assertEquals(4, map.size());
    }

    @Test
    public void testPutExistingKey() {
        Assert.assertEquals("1", map.put("a", "10"));
        Assert.assertEquals("10", map.get("a"));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void testRemoveExistingKey() {
        Assert.assertEquals("2", map.remove("b"));
        Assert.assertNull(map.get("b"));
        Assert.assertEquals(2, map.size());
    }

    @Test
    public void testRemoveNonExistentKey() {
        Assert.assertNull(map.remove("z"));
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void testIsEmptyAfterClear() {
        map.clear();
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testIndexOfNormal() {
        Assert.assertEquals(0, map.indexOf("a"));
        Assert.assertEquals(2, map.indexOf("c"));
    }

    @Test
    public void testIndexOfNonExistent() {
        Assert.assertEquals(-1, map.indexOf("z"));
    }

    @Test
    public void testGetByIndex() {
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("c", map.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        map.get(5);
    }

    @Test
    public void testGetValueByIndex() {
        Assert.assertEquals("1", map.getValue(0));
        Assert.assertEquals("3", map.getValue(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueByIndexOutOfBounds() {
        map.getValue(5);
    }

    @Test
    public void testPutAtIndexNewKey() {
        Assert.assertNull(map.put(1, "x", "99"));
        Assert.assertEquals("x", map.get(1));
        Assert.assertEquals("99", map.get("x"));
        Assert.assertEquals(4, map.size());
    }

    @Test
    public void testPutAtIndexExistingKey() {
        Assert.assertEquals("2", map.put(2, "b", "22"));
        Assert.assertEquals("22", map.get("b"));
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("c", map.get(2));
    }

    @Test
    public void testSetValueByIndex() {
        Assert.assertEquals("2", map.setValue(1, "20"));
        Assert.assertEquals("20", map.get("b"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueByIndexOutOfBounds() {
        map.setValue(5, "x");
    }

    @Test
    public void testRemoveByIndex() {
        Assert.assertEquals("2", map.remove(1));
        Assert.assertNull(map.get("b"));
        Assert.assertEquals(2, map.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndexOutOfBounds() {
        map.remove(5);
    }

    @Test
    public void testKeyListUnmodifiable() {
        try {
            map.keyList().add("z");
            Assert.fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testToStringNonEmpty() {
        String str = map.toString();
        Assert.assertTrue(str.contains("a=1"));
        Assert.assertTrue(str.contains("b=2"));
        Assert.assertTrue(str.contains("c=3"));
    }

    @Test
    public void testToStringEmpty() {
        Assert.assertEquals("{}", emptyMap.toString());
    }

    @Test
    public void testPutAllWithMap() {
        Map<String, String> extra = new HashMap<String, String>();
        extra.put("d", "4");
        extra.put("e", "5");
        map.putAll(extra);
        Assert.assertEquals(5, map.size());
        Assert.assertEquals("4", map.get("d"));
        Assert.assertEquals("5", map.get("e"));
    }

    @Test
    public void testPutAllEmptyMap() {
        Map<String, String> extra = new HashMap<String, String>();
        map.putAll(extra);
        Assert.assertEquals(3, map.size());
    }
}