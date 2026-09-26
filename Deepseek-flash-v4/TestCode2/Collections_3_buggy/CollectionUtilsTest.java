package org.apache.commons.collections;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionUtilsTest {

    @Test
    public void testUnionNormal() {
        Collection<Integer> a = Arrays.asList(1, 2, 2, 3);
        Collection<Integer> b = Arrays.asList(2, 3, 4);
        Collection<Integer> result = CollectionUtils.union(a, b);
        assertEquals(5, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
    }

    @Test
    public void testUnionEmptyWithNonEmpty() {
        Collection<Integer> a = Arrays.asList();
        Collection<Integer> b = Arrays.asList(1, 2);
        Collection<Integer> result = CollectionUtils.union(a, b);
        assertEquals(2, result.size());
    }

    @Test
    public void testIntersectionNormal() {
        Collection<Integer> a = Arrays.asList(1, 2, 2, 3);
        Collection<Integer> b = Arrays.asList(2, 3, 4);
        Collection<Integer> result = CollectionUtils.intersection(a, b);
        assertEquals(2, result.size());
        for (Integer i : result) {
            assertTrue(i == 2 || i == 3);
        }
    }

    @Test
    public void testIntersectionEmpty() {
        Collection<Integer> a = Arrays.asList(1);
        Collection<Integer> b = Arrays.asList(2);
        Collection<Integer> result = CollectionUtils.intersection(a, b);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testDisjunctionNormal() {
        Collection<Integer> a = Arrays.asList(1, 2, 2, 3);
        Collection<Integer> b = Arrays.asList(2, 3, 4);
        Collection<Integer> result = CollectionUtils.disjunction(a, b);
        assertEquals(2, result.size());
        int oneCount = 0;
        int fourCount = 0;
        for (Integer i : result) {
            if (i == 1) oneCount++;
            if (i == 4) fourCount++;
        }
        assertEquals(1, oneCount);
        assertEquals(1, fourCount);
    }

    @Test
    public void testDisjunctionEmpty() {
        Collection<Integer> a = Arrays.asList();
        Collection<Integer> b = Arrays.asList(1, 2);
        Collection<Integer> result = CollectionUtils.disjunction(a, b);
        assertEquals(2, result.size());
    }

    @Test
    public void testSubtractNormal() {
        Collection<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        Collection<Integer> b = Arrays.asList(2, 4);
        Collection<Integer> result = CollectionUtils.subtract(a, b);
        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(3));
    }

    @Test
    public void testSubtractEmptyFromNonEmpty() {
        Collection<Integer> a = new ArrayList<>(Arrays.asList(1, 2));
        Collection<Integer> b = new ArrayList<>();
        Collection<Integer> result = CollectionUtils.subtract(a, b);
        assertEquals(2, result.size());
    }

    @Test
    public void testContainsAnyTrue() {
        Collection<Integer> a = Arrays.asList(1, 2, 3);
        Collection<Integer> b = Arrays.asList(3, 4);
        assertTrue(CollectionUtils.containsAny(a, b));
    }

    @Test
    public void testContainsAnyFalse() {
        Collection<Integer> a = Arrays.asList(1, 2);
        Collection<Integer> b = Arrays.asList(3, 4);
        assertFalse(CollectionUtils.containsAny(a, b));
    }

    @Test
    public void testContainsAnyEmptyCollection() {
        Collection<Integer> a = new ArrayList<>();
        Collection<Integer> b = Arrays.asList(1, 2);
        assertFalse(CollectionUtils.containsAny(a, b));
    }

    @Test
    public void testGetCardinalityMapNormal() {
        Collection<String> coll = Arrays.asList("a", "b", "a", "c");
        Map<String, Integer> map = CollectionUtils.getCardinalityMap(coll);
        assertEquals(3, map.size());
        assertEquals(2, map.get("a").intValue());
        assertEquals(1, map.get("b").intValue());
        assertEquals(1, map.get("c").intValue());
    }

    @Test
    public void testGetCardinalityMapEmpty() {
        Map<String, Integer> map = CollectionUtils.getCardinalityMap(new ArrayList<>());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testIsSubCollectionTrue() {
        Collection<Integer> a = Arrays.asList(1, 2);
        Collection<Integer> b = Arrays.asList(1, 2, 3);
        assertTrue(CollectionUtils.isSubCollection(a, b));
    }

    @Test
    public void testIsSubCollectionFalseDueToFreq() {
        Collection<Integer> a = Arrays.asList(1, 1, 2);
        Collection<Integer> b = Arrays.asList(1, 2, 3);
        assertFalse(CollectionUtils.isSubCollection(a, b));
    }

    @Test
    public void testIsProperSubCollectionTrue() {
        Collection<Integer> a = Arrays.asList(1);
        Collection<Integer> b = Arrays.asList(1, 2);
        assertTrue(CollectionUtils.isProperSubCollection(a, b));
    }

    @Test
    public void testIsProperSubCollectionFalseSameSize() {
        Collection<Integer> a = Arrays.asList(1, 2);
        Collection<Integer> b = Arrays.asList(1, 2);
        assertFalse(CollectionUtils.isProperSubCollection(a, b));
    }

    @Test
    public void testIsEqualCollectionTrue() {
        Collection<String> a = Arrays.asList("a", "b", "a");
        Collection<String> b = Arrays.asList("a", "a", "b");
        assertTrue(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollectionFalseDifferentSize() {
        Collection<String> a = Arrays.asList("a");
        Collection<String> b = Arrays.asList("a", "b");
        assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollectionFalseDifferentFreq() {
        Collection<String> a = Arrays.asList("a", "a", "b");
        Collection<String> b = Arrays.asList("a", "b", "b");
        assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testCardinalityInSet() {
        Set<String> set = new HashSet<>(Arrays.asList("a", "b"));
        assertEquals(1, CollectionUtils.cardinality("a", set));
        assertEquals(0, CollectionUtils.cardinality("c", set));
    }

    @Test
    public void testCardinalityInListWithNull() {
        List<String> list = new ArrayList<>(Arrays.asList("a", null, "b", null));
        assertEquals(2, CollectionUtils.cardinality(null, list));
    }

    @Test
    public void testCardinalityInListWithoutNull() {
        List<String> list = Arrays.asList("a", "b", "a");
        assertEquals(2, CollectionUtils.cardinality("a", list));
    }

    @Test
    public void testFindFirstMatch() {
        Collection<String> coll = Arrays.asList("apple", "banana", "cherry");
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return ((String)o).startsWith("b"); }
        };
        assertEquals("banana", CollectionUtils.find(coll, p));
    }

    @Test
    public void testFindNoMatch() {
        Collection<String> coll = Arrays.asList("apple", "banana");
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return ((String)o).startsWith("z"); }
        };
        assertNull(CollectionUtils.find(coll, p));
    }

    @Test
    public void testForAllDo() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b"));
        Closure<Object> c = new Closure<Object>() {
            public void execute(Object o) { /* no op */ }
        };
        CollectionUtils.forAllDo(list, c);
        assertEquals(2, list.size());
    }

    @Test
    public void testForAllDoNullCollection() {
        CollectionUtils.forAllDo(null, null);
        // no exception expected
    }

    @Test
    public void testFilterKeepOnly() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return ((String)o).length() >= 2; }
        };
        CollectionUtils.filter(list, p);
        assertEquals(2, list.size());
        assertTrue(list.contains("bb"));
        assertTrue(list.contains("ccc"));
    }

    @Test
    public void testFilterEmpty() {
        List<String> list = new ArrayList<>();
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return true; }
        };
        CollectionUtils.filter(list, p);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testTransformList() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b"));
        Transformer<Object, String> t = new Transformer<Object, String>() {
            public String transform(Object o) { return ((String)o).toUpperCase(); }
        };
        CollectionUtils.transform(list, t);
        assertEquals(Arrays.asList("A", "B"), list);
    }

    @Test
    public void testTransformNonList() {
        Collection<String> coll = new HashSet<>(Arrays.asList("a", "b"));
        Transformer<Object, String> t = new Transformer<Object, String>() {
            public String transform(Object o) { return ((String)o).toUpperCase(); }
        };
        CollectionUtils.transform(coll, t);
        assertTrue(coll.contains("A"));
        assertTrue(coll.contains("B"));
        assertEquals(2, coll.size());
    }

    @Test
    public void testCountMatches() {
        Collection<String> coll = Arrays.asList("a", "bb", "c");
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return ((String)o).length() == 1; }
        };
        assertEquals(2, CollectionUtils.countMatches(coll, p));
    }

    @Test
    public void testCountMatchesNullInput() {
        assertEquals(0, CollectionUtils.countMatches(null, null));
    }

    @Test
    public void testExistsTrue() {
        Collection<String> coll = Arrays.asList("a");
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return "a".equals(o); }
        };
        assertTrue(CollectionUtils.exists(coll, p));
    }

    @Test
    public void testExistsFalse() {
        Collection<String> coll = Arrays.asList("a");
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return "b".equals(o); }
        };
        assertFalse(CollectionUtils.exists(coll, p));
    }

    @Test
    public void testSelect() {
        Collection<Integer> input = Arrays.asList(1, 2, 3, 4);
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return (Integer)o % 2 == 0; }
        };
        Collection<Integer> result = CollectionUtils.select(input, p);
        assertEquals(2, result.size());
        assertTrue(result.contains(2));
        assertTrue(result.contains(4));
    }

    @Test
    public void testSelectRejected() {
        Collection<Integer> input = Arrays.asList(1, 2, 3);
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return (Integer)o > 1; }
        };
        Collection<Integer> result = CollectionUtils.selectRejected(input, p);
        assertEquals(1, result.size());
        assertTrue(result.contains(1));
    }

    @Test
    public void testCollectCollectionTransformer() {
        Collection<String> input = Arrays.asList("a", "b");
        Transformer<Object, String> t = new Transformer<Object, String>() {
            public String transform(Object o) { return ((String)o).toUpperCase(); }
        };
        Collection<String> result = CollectionUtils.collect(input, t);
        assertEquals(2, result.size());
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
    }

    @Test
    public void testCollectIteratorTransformer() {
        List<String> list = Arrays.asList("x", "y");
        Iterator<String> it = list.iterator();
        Transformer<Object, String> t = new Transformer<Object, String>() {
            public String transform(Object o) { return ((String)o).toUpperCase(); }
        };
        Collection<String> result = CollectionUtils.collect(it, t);
        assertEquals(2, result.size());
        assertTrue(result.contains("X"));
    }

    @Test
    public void testAddIgnoreNullTrue() {
        List<String> list = new ArrayList<>();
        assertTrue(CollectionUtils.addIgnoreNull(list, "a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testAddIgnoreNullFalse() {
        List<String> list = new ArrayList<>();
        assertFalse(CollectionUtils.addIgnoreNull(list, null));
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddAllIterator() {
        List<String> list = new ArrayList<>();
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        CollectionUtils.addAll(list, it);
        assertEquals(2, list.size());
    }

    @Test
    public void testAddAllEnumeration() {
        List<String> list = new ArrayList<>();
        Vector<String> v = new Vector<>(Arrays.asList("x", "y"));
        Enumeration<String> e = v.elements();
        CollectionUtils.addAll(list, e);
        assertEquals(2, list.size());
    }

    @Test
    public void testAddAllArray() {
        List<String> list = new ArrayList<>();
        String[] arr = {"p", "q"};
        CollectionUtils.addAll(list, arr);
        assertEquals(2, list.size());
    }

    @Test
    public void testIndexMapByKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        assertEquals("value", CollectionUtils.index(map, "key"));
    }

    @Test
    public void testIndexListByInt() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertEquals("b", CollectionUtils.index(list, 1));
    }

    @Test
    public void testIndexArrayByInt() {
        String[] arr = {"x", "y"};
        assertEquals("y", CollectionUtils.index(arr, 1));
    }

    @Test
    public void testIndexIteratorByInt() {
        List<String> list = Arrays.asList("a", "b");
        Iterator<String> it = list.iterator();
        assertEquals("b", CollectionUtils.index(it, 1));
    }

    @Test
    public void testIndexCollectionByInt() {
        Collection<Integer> coll = new ArrayList<>(Arrays.asList(10, 20, 30));
        assertEquals(20, CollectionUtils.index(coll, 1));
    }

    @Test
    public void testIndexEnumerationByInt() {
        Vector<String> v = new Vector<>(Arrays.asList("a", "b"));
        Enumeration<String> e = v.elements();
        assertEquals("b", CollectionUtils.index(e, 1));
    }

    @Test
    public void testIndexNonCollectionObject() {
        Integer obj = 42;
        assertEquals(obj, CollectionUtils.index(obj, 0));
    }

    @Test
    public void testGetFromList() {
        List<String> list = Arrays.asList("a", "b");
        assertEquals("a", CollectionUtils.get(list, 0));
        assertEquals("b", CollectionUtils.get(list, 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNegativeIndex() {
        CollectionUtils.get(new ArrayList<>(), -1);
    }

    @Test
    public void testGetFromArray() {
        String[] arr = {"x", "y", "z"};
        assertEquals("y", CollectionUtils.get(arr, 1));
    }

    @Test
    public void testGetFromIterator() {
        List<String> list = Arrays.asList("a", "b");
        Iterator<String> it = list.iterator();
        assertEquals("a", CollectionUtils.get(it, 0));
    }

    @Test
    public void testGetFromCollection() {
        Collection<Integer> coll = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(2, CollectionUtils.get(coll, 1));
    }

    @Test
    public void testGetFromEnumeration() {
        Vector<String> v = new Vector<>(Arrays.asList("a"));
        Enumeration<String> e = v.elements();
        assertEquals("a", CollectionUtils.get(e, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNullObject() {
        CollectionUtils.get(null, 0);
    }

    @Test
    public void testSizeList() {
        List<String> list = Arrays.asList("a", "b");
        assertEquals(2, CollectionUtils.size(list));
    }

    @Test
    public void testSizeArray() {
        String[] arr = {"a"};
        assertEquals(1, CollectionUtils.size(arr));
    }

    @Test
    public void testSizeIterator() {
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> it = list.iterator();
        assertEquals(3, CollectionUtils.size(it));
    }

    @Test
    public void testSizeEnumeration() {
        Vector<String> v = new Vector<>(Arrays.asList("a"));
        Enumeration<String> e = v.elements();
        assertEquals(1, CollectionUtils.size(e));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSizeNull() {
        CollectionUtils.size(null);
    }

    @Test
    public void testSizeIsEmptyCollection() {
        assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList<>()));
        assertFalse(CollectionUtils.sizeIsEmpty(Arrays.asList(1)));
    }

    @Test
    public void testSizeIsEmptyIterator() {
        Iterator<String> emptyIt = new ArrayList<String>().iterator();
        assertTrue(CollectionUtils.sizeIsEmpty(emptyIt));
        Iterator<String> nonEmptyIt = Arrays.asList("a").iterator();
        assertFalse(CollectionUtils.sizeIsEmpty(nonEmptyIt));
    }

    @Test
    public void testIsEmptyNull() {
        assertTrue(CollectionUtils.isEmpty(null));
    }

    @Test
    public void testIsEmptyEmpty() {
        assertTrue(CollectionUtils.isEmpty(new ArrayList<>()));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(CollectionUtils.isNotEmpty(null));
        assertTrue(CollectionUtils.isNotEmpty(Arrays.asList(1)));
    }

    @Test
    public void testReverseArray() {
        String[] arr = {"a", "b", "c"};
        CollectionUtils.reverseArray(arr);
        assertArrayEquals(new String[]{"c", "b", "a"}, arr);
    }

    @Test
    public void testReverseArraySingle() {
        String[] arr = {"a"};
        CollectionUtils.reverseArray(arr);
        assertArrayEquals(new String[]{"a"}, arr);
    }

    @Test
    public void testIsFullNonBounded() {
        List<String> list = new ArrayList<>();
        assertFalse(CollectionUtils.isFull(list));
    }

    @Test(expected = NullPointerException.class)
    public void testIsFullNull() {
        CollectionUtils.isFull(null);
    }

    @Test
    public void testMaxSizeNonBounded() {
        List<String> list = new ArrayList<>();
        assertEquals(-1, CollectionUtils.maxSize(list));
    }

    @Test(expected = NullPointerException.class)
    public void testMaxSizeNull() {
        CollectionUtils.maxSize(null);
    }

    @Test
    public void testSynchronizedCollection() {
        Collection<String> coll = new ArrayList<>();
        Collection<String> sync = CollectionUtils.synchronizedCollection(coll);
        assertNotNull(sync);
    }

    @Test
    public void testUnmodifiableCollection() {
        Collection<String> coll = new ArrayList<>();
        Collection<String> unmod = CollectionUtils.unmodifiableCollection(coll);
        assertNotNull(unmod);
    }

    @Test
    public void testPredicatedCollection() {
        Collection<String> coll = new ArrayList<>();
        Predicate<Object> p = new Predicate<Object>() {
            public boolean evaluate(Object o) { return o instanceof String; }
        };
        Collection<String> pred = CollectionUtils.predicatedCollection(coll, p);
        assertNotNull(pred);
    }

    @Test
    public void testTypedCollection() {
        Collection<String> coll = new ArrayList<>();
        Collection<String> typed = CollectionUtils.typedCollection(coll, String.class);
        assertNotNull(typed);
    }

    @Test
    public void testTransformedCollection() {
        Collection<String> coll = new ArrayList<>();
        Transformer<Object, String> t = new Transformer<Object, String>() {
            public String transform(Object o) { return ((String)o).toUpperCase(); }
        };
        Collection<String> trans = CollectionUtils.transformedCollection(coll, t);
        assertNotNull(trans);
    }
}