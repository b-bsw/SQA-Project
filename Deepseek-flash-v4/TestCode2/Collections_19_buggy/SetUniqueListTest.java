package org.apache.commons.collections.list;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUniqueListTest {

    private SetUniqueList<String> list;
    private List<String> baseList;

    @Before
    public void setUp() {
        baseList = new ArrayList<String>();
        list = new SetUniqueList<String>(baseList, new HashSet<String>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetUniqueListNullList() {
        SetUniqueList.setUniqueList(null);
    }

    @Test
    public void testSetUniqueListEmptyList() {
        List<String> empty = new ArrayList<String>();
        SetUniqueList<String> result = SetUniqueList.setUniqueList(empty);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSetUniqueListWithDuplicates() {
        List<String> input = new ArrayList<String>(Arrays.asList("a", "b", "a", "c"));
        SetUniqueList<String> result = SetUniqueList.setUniqueList(input);
        assertEquals(3, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test
    public void testConstructorNullSet() {
        try {
            new SetUniqueList<String>(new ArrayList<String>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAsSet() {
        list.add("x");
        list.add("y");
        Set<String> setView = list.asSet();
        assertEquals(2, setView.size());
        assertTrue(setView.contains("x"));
        assertTrue(setView.contains("y"));
        try {
            setView.add("z");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAddUniqueElement() {
        assertTrue(list.add("a"));
        assertEquals(1, list.size());
        assertTrue(list.contains("a"));
    }

    @Test
    public void testAddDuplicateElement() {
        list.add("a");
        assertFalse(list.add("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testAddAtIndexUnique() {
        list.add("a");
        list.add(1, "b");
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddAtIndexDuplicate() {
        list.add("a");
        list.add("b");
        list.add(1, "a");
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddAllEmptyCollection() {
        assertFalse(list.addAll(new ArrayList<String>()));
        assertEquals(0, list.size());
    }

    @Test
    public void testAddAllWithAllNew() {
        Collection<String> coll = Arrays.asList("a", "b", "c");
        assertTrue(list.addAll(coll));
        assertEquals(3, list.size());
    }

    @Test
    public void testAddAllWithDuplicates() {
        list.add("a");
        Collection<String> coll = Arrays.asList("a", "b", "b");
        assertTrue(list.addAll(coll));
        assertEquals(2, list.size());
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
    }

    @Test
    public void testAddAllAtIndexAllNew() {
        list.add("c");
        Collection<String> coll = Arrays.asList("a", "b");
        assertTrue(list.addAll(0, coll));
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddAllAtIndexWithDuplicates() {
        list.add("a");
        list.add("c");
        Collection<String> coll = Arrays.asList("a", "b");
        assertTrue(list.addAll(1, coll));
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testSetNewElement() {
        list.add("a");
        list.add("b");
        String old = list.set(0, "c");
        assertEquals("a", old);
        assertEquals("c", list.get(0));
        assertEquals(2, list.size());
    }

    @Test
    public void testSetExistingElementAtDifferentIndex() {
        list.add("a");
        list.add("b");
        list.add("c");
        String old = list.set(0, "b");
        assertEquals("a", old);
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testSetSameElement() {
        list.add("a");
        list.add("b");
        String old = list.set(0, "a");
        assertEquals("a", old);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
    }

    @Test
    public void testRemoveObject() {
        list.add("a");
        assertTrue(list.remove("a"));
        assertFalse(list.contains("a"));
        assertEquals(0, list.size());
    }

    @Test
    public void testRemoveObjectNotPresent() {
        list.add("a");
        assertFalse(list.remove("b"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveByIndex() {
        list.add("a");
        list.add("b");
        String removed = list.remove(1);
        assertEquals("b", removed);
        assertEquals(1, list.size());
        assertTrue(list.contains("a"));
    }

    @Test
    public void testRemoveAllEmpty() {
        assertFalse(list.removeAll(new ArrayList<String>()));
    }

    @Test
    public void testRemoveAllSomePresent() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertTrue(list.removeAll(Arrays.asList("a", "c")));
        assertEquals(1, list.size());
        assertTrue(list.contains("b"));
    }

    @Test
    public void testRetainAllNoChange() {
        list.add("a");
        list.add("b");
        assertFalse(list.retainAll(Arrays.asList("a", "b")));
        assertEquals(2, list.size());
    }

    @Test
    public void testRetainAllEmpty() {
        list.add("a");
        list.add("b");
        assertTrue(list.retainAll(new ArrayList<String>()));
        assertEquals(0, list.size());
    }

    @Test
    public void testRetainAllPartial() {
        list.add("a");
        list.add("b");
        list.add("c");
        assertTrue(list.retainAll(Arrays.asList("a", "c")));
        assertEquals(2, list.size());
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testClear() {
        list.add("a");
        list.add("b");
        list.clear();
        assertEquals(0, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testContains() {
        list.add("a");
        assertTrue(list.contains("a"));
        assertFalse(list.contains("b"));
    }

    @Test
    public void testContainsAll() {
        list.add("a");
        list.add("b");
        assertTrue(list.containsAll(Arrays.asList("a", "b")));
        assertFalse(list.containsAll(Arrays.asList("a", "c")));
    }

    @Test
    public void testIterator() {
        list.add("a");
        list.add("b");
        java.util.Iterator<String> it = list.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        it.remove();
        assertEquals(1, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testListIterator() {
        list.add("a");
        list.add("b");
        java.util.ListIterator<String> it = list.listIterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        it.add("c");
        assertEquals(3, list.size());
        assertTrue(list.contains("c"));
        it.previous();
        it.remove();
        assertEquals(2, list.size());
        assertFalse(list.contains("c"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSet() {
        list.add("a");
        java.util.ListIterator<String> it = list.listIterator();
        it.next();
        it.set("b");
    }

    @Test
    public void testSubList() {
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> sub = list.subList(0, 2);
        assertEquals(2, sub.size());
        assertTrue(sub instanceof SetUniqueList);
    }

    @Test
    public void testCreateSetBasedOnListHashSet() {
        Set<String> originalSet = new HashSet<String>();
        originalSet.add("a");
        List<String> sourceList = new ArrayList<String>(Arrays.asList("a", "b"));
        Set<String> result = list.createSetBasedOnList(originalSet, sourceList);
        assertTrue(result instanceof HashSet);
        assertEquals(2, result.size());
    }
}