package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayUtilsTest {

    @Test
    public void testToString() {
        assertEquals("{}", ArrayUtils.toString(null));
        assertEquals("{}", ArrayUtils.toString(null, "{}"));
        assertEquals("{1, 2}", ArrayUtils.toString(new int[]{1, 2}, "{}"));
        int[] array = {1, 2, 3};
        String result = ArrayUtils.toString(array);
        assertTrue(result.contains("1"));
        assertTrue(result.contains("2"));
        assertTrue(result.contains("3"));
    }

    @Test
    public void testToMap() {
        assertNull(ArrayUtils.toMap(null));

        Object[] valid = new Object[]{new Object[]{ "key1", "value1" }, new java.util.AbstractMap.SimpleEntry<>("key2", "value2")};
        java.util.Map<Object, Object> map = ArrayUtils.toMap(valid);
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));

        Object[] shortEntry = new Object[]{new Object[]{"onlyKey"}};
        try {
            ArrayUtils.toMap(shortEntry);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("length less than 2"));
        }

        Object[] invalidElement = new Object[]{"string"};
        try {
            ArrayUtils.toMap(invalidElement);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("neither of type Map.Entry nor an Array"));
        }
    }

    @Test
    public void testClone() {
        assertNull(ArrayUtils.clone((Object[]) null));
        assertNull(ArrayUtils.clone((int[]) null));

        String[] original = {"a", "b"};
        String[] cloned = ArrayUtils.clone(original);
        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertArrayEquals(original, cloned);

        int[] intOrig = {1, 2, 3};
        int[] intClone = ArrayUtils.clone(intOrig);
        assertNotNull(intClone);
        assertNotSame(intOrig, intClone);
        assertArrayEquals(intOrig, intClone);
    }

    @Test
    public void testSubarray() {
        assertNull(ArrayUtils.subarray((int[]) null, 0, 1));

        int[] array = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{2, 3}, ArrayUtils.subarray(array, 1, 3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayUtils.subarray(array, -1, 100));
        assertArrayEquals(new int[]{}, ArrayUtils.subarray(array, 3, 2));
        assertArrayEquals(new int[]{}, ArrayUtils.subarray(array, 0, 0));
    }

    @Test
    public void testIsSameLength() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
        assertFalse(ArrayUtils.isSameLength((Object[]) null, new Object[]{"a"}));
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a"}, (Object[]) null));
        assertTrue(ArrayUtils.isSameLength(new Object[]{"a"}, new Object[]{"b"}));
        assertFalse(ArrayUtils.isSameLength(new Object[]{"a", "b"}, new Object[]{"c"}));
    }

    @Test
    public void testReverse() {
        ArrayUtils.reverse((int[]) null);
        int[] empty = {};
        ArrayUtils.reverse(empty);
        assertArrayEquals(new int[]{}, empty);

        int[] single = {1};
        ArrayUtils.reverse(single);
        assertArrayEquals(new int[]{1}, single);

        int[] even = {1, 2, 3, 4};
        ArrayUtils.reverse(even);
        assertArrayEquals(new int[]{4, 3, 2, 1}, even);

        int[] odd = {1, 2, 3, 4, 5};
        ArrayUtils.reverse(odd);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, odd);
    }

    @Test
    public void testIndexOfObject() {
        assertEquals(-1, ArrayUtils.indexOf((Object[]) null, "a"));
        Object[] array = {"a", "b", null, "c"};
        assertEquals(0, ArrayUtils.indexOf(array, "a", -1));
        assertEquals(2, ArrayUtils.indexOf(array, null));
        assertEquals(-1, ArrayUtils.indexOf(array, "d"));
        Object[] stringArray = {"a", "b"};
        assertEquals(1, ArrayUtils.indexOf(stringArray, "b"));
    }

    @Test
    public void testLastIndexOfObject() {
        assertEquals(-1, ArrayUtils.lastIndexOf((Object[]) null, "a"));
        Object[] array = {"a", "b", "a", null};
        assertEquals(0, ArrayUtils.lastIndexOf(array, "a", 1));
        assertEquals(2, ArrayUtils.lastIndexOf(array, "a"));
        assertEquals(3, ArrayUtils.lastIndexOf(array, null, 3));
        assertEquals(-1, ArrayUtils.lastIndexOf(array, "c"));
    }

    @Test
    public void testContainsInt() {
        int[] array = {3, 1, 2};
        assertTrue(ArrayUtils.contains(array, 1));
        assertFalse(ArrayUtils.contains(array, 4));
        assertFalse(ArrayUtils.contains((int[]) null, 1));
    }

    @Test
    public void testToPrimitiveToObjectInt() {
        assertNull(ArrayUtils.toPrimitive((Integer[]) null));
        assertArrayEquals(new int[]{}, ArrayUtils.toPrimitive(new Integer[]{}));
        Integer[] input = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 3}, ArrayUtils.toPrimitive(input));

        assertNull(ArrayUtils.toObject((int[]) null));
        assertArrayEquals(new Integer[]{}, ArrayUtils.toObject(new int[]{}));
        int[] prim = {4, 5, 6};
        assertArrayEquals(new Integer[]{4, 5, 6}, ArrayUtils.toObject(prim));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(ArrayUtils.isEmpty((int[]) null));
        assertTrue(ArrayUtils.isEmpty(new int[]{}));
        assertFalse(ArrayUtils.isEmpty(new int[]{1}));
    }

    @Test
    public void testAddAll() {
        assertNull(ArrayUtils.addAll((int[]) null, (int[]) null));
        int[] a = {1, 2};
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.addAll(a, (int[]) null));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.addAll((int[]) null, a));
        assertArrayEquals(new int[]{1, 2, 3, 4}, ArrayUtils.addAll(a, new int[]{3, 4}));
    }

    @Test
    public void testAdd() {
        int[] empty = {};
        assertArrayEquals(new int[]{1}, ArrayUtils.add(empty, 1));
        int[] array = {1, 2};
        assertArrayEquals(new int[]{1, 2, 3}, ArrayUtils.add(array, 3));
        assertArrayEquals(new int[]{1}, ArrayUtils.add((int[]) null, 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexOutOfBounds() {
        ArrayUtils.remove(new int[]{1, 2}, 5);
    }

    @Test
    public void testRemove() {
        int[] array = {1, 2, 3};
        assertArrayEquals(new int[]{1, 3}, ArrayUtils.remove(array, 1));
        assertArrayEquals(new int[]{2, 3}, ArrayUtils.remove(array, 0));
        assertArrayEquals(new int[]{1, 2}, ArrayUtils.remove(array, 2));
    }

    @Test
    public void testRemoveElement() {
        int[] array = {1, 2, 3, 2};
        assertArrayEquals(new int[]{1, 2, 3, 2}, ArrayUtils.removeElement(array, 5));
        assertArrayEquals(new int[]{1, 3, 2}, ArrayUtils.removeElement(array, 2));
    }
}