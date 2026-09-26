package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayUtilsTest {

    // --- toString ---
    @Test
    public void testToStringNormal() {
        int[] arr = {1, 2, 3};
        String result = ArrayUtils.toString(arr);
        assertNotNull(result);
        assertTrue(result.contains("1"));
    }

    @Test
    public void testToStringNull() {
        assertEquals("{}", ArrayUtils.toString(null, "{}"));
        assertEquals("default", ArrayUtils.toString(null, "default"));
    }

    // --- toMap ---
    @Test
    public void testToMapNull() {
        assertNull(ArrayUtils.toMap(null));
    }

    @Test
    public void testToMapNormal() {
        Object[] input = new Object[] {new Object[] {"key1", "value1"}, new Object[] {"key2", "value2"}};
        java.util.Map<Object, Object> map = ArrayUtils.toMap(input);
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMapShortEntry() {
        ArrayUtils.toMap(new Object[] {new Object[] {"onlyKey"}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToMapInvalidElement() {
        ArrayUtils.toMap(new Object[] {"string"});
    }

    // --- clone (generic) ---
    @Test
    public void testCloneObjectArrayNull() {
        assertNull(ArrayUtils.clone((String[]) null));
    }

    @Test
    public void testCloneObjectArray() {
        String[] original = {"a", "b"};
        String[] cloned = ArrayUtils.clone(original);
        assertNotNull(cloned);
        assertArrayEquals(original, cloned);
        assertNotSame(original, cloned);
    }

    @Test
    public void testClonePrimitiveArray() {
        int[] original = {1, 2};
        int[] cloned = ArrayUtils.clone(original);
        assertNotNull(cloned);
        assertArrayEquals(original, cloned);
        assertNotSame(original, cloned);
    }

    // --- subarray (generic) ---
    @Test
    public void testSubarrayNull() {
        assertNull(ArrayUtils.subarray((String[]) null, 0, 1));
    }

    @Test
    public void testSubarrayStartNegative() {
        String[] arr = {"a", "b", "c"};
        String[] result = ArrayUtils.subarray(arr, -1, 2);
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testSubarrayEndBeyond() {
        String[] arr = {"a", "b"};
        String[] result = ArrayUtils.subarray(arr, 0, 5);
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testSubarrayEmptyResult() {
        String[] arr = {"a", "b"};
        String[] result = ArrayUtils.subarray(arr, 2, 1);
        assertEquals(0, result.length);
    }

    @Test
    public void testSubarrayNormal() {
        String[] arr = {"a", "b", "c"};
        String[] result = ArrayUtils.subarray(arr, 1, 3);
        assertArrayEquals(new String[]{"b", "c"}, result);
    }

    // --- isSameLength (Object) ---
    @Test
    public void testIsSameLengthBothNull() {
        assertTrue(ArrayUtils.isSameLength((Object[]) null, (Object[]) null));
    }

    @Test
    public void testIsSameLengthOneNullOtherNonEmpty() {
        assertFalse(ArrayUtils.isSameLength(null, new String[]{"a"}));
    }

    @Test
    public void testIsSameLengthEqualNonEmpty() {
        assertTrue(ArrayUtils.isSameLength(new String[]{"a"}, new String[]{"b"}));
    }

    @Test
    public void testIsSameLengthUnequal() {
        assertFalse(ArrayUtils.isSameLength(new String[]{"a"}, new String[]{"a", "b"}));
    }

    // --- indexOf (Object) ---
    @Test
    public void testIndexOfNullArray() {
        assertEquals(-1, ArrayUtils.indexOf((Object[]) null, "a"));
    }

    @Test
    public void testIndexOfStartNegative() {
        String[] arr = {"a", "b"};
        assertEquals(0, ArrayUtils.indexOf(arr, "a", -5));
    }

    @Test
    public void testIndexOfNullObjectFound() {
        String[] arr = {null, "a"};
        assertEquals(0, ArrayUtils.indexOf(arr, null));
    }

    @Test
    public void testIndexOfNotFound() {
        String[] arr = {"a", "b"};
        assertEquals(-1, ArrayUtils.indexOf(arr, "c"));
    }

    @Test
    public void testIndexOfNormal() {
        String[] arr = {"a", "b", "a"};
        assertEquals(0, ArrayUtils.indexOf(arr, "a", 0));
        assertEquals(2, ArrayUtils.indexOf(arr, "a", 1));
    }

    // --- lastIndexOf (Object) ---
    @Test
    public void testLastIndexOfNullArray() {
        assertEquals(-1, ArrayUtils.lastIndexOf((Object[]) null, "a"));
    }

    @Test
    public void testLastIndexOfStartNegative() {
        String[] arr = {"a", "b"};
        assertEquals(-1, ArrayUtils.lastIndexOf(arr, "a", -1));
    }

    @Test
    public void testLastIndexOfStartBeyond() {
        String[] arr = {"a", "b"};
        assertEquals(1, ArrayUtils.lastIndexOf(arr, "b", 10));
    }

    @Test
    public void testLastIndexOfNullObjectFound() {
        String[] arr = {"a", null, "b"};
        assertEquals(1, ArrayUtils.lastIndexOf(arr, null));
    }

    @Test
    public void testLastIndexOfNormal() {
        String[] arr = {"a", "b", "a"};
        assertEquals(2, ArrayUtils.lastIndexOf(arr, "a"));
    }

    // --- contains (Object) ---
    @Test
    public void testContainsTrue() {
        assertTrue(ArrayUtils.contains(new String[]{"a", "b"}, "a"));
    }

    @Test
    public void testContainsFalse() {
        assertFalse(ArrayUtils.contains(new String[]{"a", "b"}, "c"));
    }

    // --- reverse (Object) ---
    @Test
    public void testReverseNull() {
        ArrayUtils.reverse((Object[]) null);
        // no exception
    }

    @Test
    public void testReverseOddLength() {
        Integer[] arr = {1, 2, 3};
        ArrayUtils.reverse(arr);
        assertArrayEquals(new Integer[]{3, 2, 1}, arr);
    }

    @Test
    public void testReverseEvenLength() {
        Integer[] arr = {1, 2, 3, 4};
        ArrayUtils.reverse(arr);
        assertArrayEquals(new Integer[]{4, 3, 2, 1}, arr);
    }

    // --- add (generic, with element) ---
    @Test
    public void testAddElementNullArray() {
        String[] result = ArrayUtils.add(null, "a");
        assertArrayEquals(new String[]{"a"}, result);
    }

    @Test
    public void testAddElementNormal() {
        String[] arr = {"a", "b"};
        String[] result = ArrayUtils.add(arr, "c");
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    // --- add (with index) ---
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAtIndexInvalid() {
        ArrayUtils.add(new int[]{1, 2}, 5, 3);
    }

    @Test
    public void testAddAtIndexNullArrayIndex0() {
        String[] result = ArrayUtils.add(null, 0, "a");
        assertArrayEquals(new String[]{"a"}, result);
    }

    @Test
    public void testAddAtIndexNormal() {
        String[] arr = {"a", "b"};
        String[] result = ArrayUtils.add(arr, 1, "c");
        assertArrayEquals(new String[]{"a", "c", "b"}, result);
    }

    // --- remove ---
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexNegative() {
        ArrayUtils.remove(new int[]{1, 2}, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveIndexTooLarge() {
        ArrayUtils.remove(new int[]{1, 2}, 2);
    }

    @Test
    public void testRemoveNormal() {
        String[] arr = {"a", "b", "c"};
        String[] result = ArrayUtils.remove(arr, 1);
        assertArrayEquals(new String[]{"a", "c"}, result);
    }

    // --- removeElement ---
    @Test
    public void testRemoveElementFound() {
        String[] arr = {"a", "b", "a"};
        String[] result = ArrayUtils.removeElement(arr, "a");
        assertArrayEquals(new String[]{"b", "a"}, result);
    }

    @Test
    public void testRemoveElementNotFound() {
        String[] arr = {"a", "b"};
        String[] result = ArrayUtils.removeElement(arr, "c");
        assertArrayEquals(arr, result);
    }

    // --- isEmpty ---
    @Test
    public void testIsEmptyNull() {
        assertTrue(ArrayUtils.isEmpty((Object[]) null));
    }

    @Test
    public void testIsEmptyEmptyArray() {
        assertTrue(ArrayUtils.isEmpty(new Object[0]));
    }

    @Test
    public void testIsEmptyNonEmpty() {
        assertFalse(ArrayUtils.isEmpty(new Object[]{"a"}));
    }

    // --- toPrimitive (Character) ---
    @Test
    public void testToPrimitiveCharacterNull() {
        assertNull(ArrayUtils.toPrimitive((Character[]) null));
    }

    @Test
    public void testToPrimitiveCharacterEmpty() {
        assertArrayEquals(new char[0], ArrayUtils.toPrimitive(new Character[0]));
    }

    @Test
    public void testToPrimitiveCharacterNormal() {
        Character[] input = {'a', 'b'};
        char[] expected = {'a', 'b'};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input));
    }

    // --- toPrimitive (with valueForNull) ---
    @Test
    public void testToPrimitiveCharacterWithNullFallback() {
        Character[] input = {'a', null, 'b'};
        char[] expected = {'a', '!', 'b'};
        assertArrayEquals(expected, ArrayUtils.toPrimitive(input, '!'));
    }

    // --- toObject (char) ---
    @Test
    public void testToObjectCharNull() {
        assertNull(ArrayUtils.toObject((char[]) null));
    }

    @Test
    public void testToObjectCharNormal() {
        char[] input = {'x', 'y'};
        Character[] expected = {'x', 'y'};
        assertArrayEquals(expected, ArrayUtils.toObject(input));
    }

    // --- addAll (generic) ---
    @Test
    public void testAddAllFirstNull() {
        String[] result = ArrayUtils.addAll(null, "a", "b");
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testAddAllSecondNull() {
        String[] arr = {"a"};
        String[] result = ArrayUtils.addAll(arr, (String[]) null);
        assertArrayEquals(new String[]{"a"}, result);
    }

    @Test
    public void testAddAllBothNotNull() {
        String[] arr1 = {"a", "b"};
        String[] arr2 = {"c"};
        String[] result = ArrayUtils.addAll(arr1, arr2);
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    // --- reverse (primitive int) ---
    @Test
    public void testReverseIntArray() {
        int[] arr = {1, 2, 3, 4};
        ArrayUtils.reverse(arr);
        assertArrayEquals(new int[]{4, 3, 2, 1}, arr);
    }

    // --- indexOf (int) ---
    @Test
    public void testIndexOfIntNotFound() {
        assertEquals(-1, ArrayUtils.indexOf(new int[]{1,2}, 3));
    }

    @Test
    public void testIndexOfIntFound() {
        assertEquals(1, ArrayUtils.indexOf(new int[]{1,2,1}, 2));
    }

    // --- lastIndexOf (int) ---
    @Test
    public void testLastIndexOfInt() {
        assertEquals(2, ArrayUtils.lastIndexOf(new int[]{1,2,1}, 1));
    }

    // --- subarray (int) ---
    @Test
    public void testSubarrayIntNull() {
        assertNull(ArrayUtils.subarray((int[]) null, 0, 1));
    }

    @Test
    public void testSubarrayIntEmptyResult() {
        int[] arr = {1,2};
        assertArrayEquals(new int[0], ArrayUtils.subarray(arr, 2, 1));
    }

    // --- toMap with Map.Entry ---
    @Test
    public void testToMapWithEntry() {
        java.util.Map.Entry<String, String> entry = new java.util.AbstractMap.SimpleEntry<>("k", "v");
        Object[] input = new Object[] {entry};
        java.util.Map<Object, Object> map = ArrayUtils.toMap(input);
        assertEquals(1, map.size());
        assertEquals("v", map.get("k"));
    }
}