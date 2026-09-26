package org.apache.commons.collections.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SetUniqueListTest {

    private SetUniqueList list;
    private List<String> base;

    @Before
    public void setUp() {
        base = new ArrayList<String>();
        list = (SetUniqueList) SetUniqueList.decorate(base);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullList() {
        SetUniqueList.decorate(null);
    }

    @Test
    public void testDecorateEmptyList() {
        List<String> empty = new ArrayList<String>();
        SetUniqueList sul = (SetUniqueList) SetUniqueList.decorate(empty);
        assertTrue(sul.isEmpty());
        assertEquals(0, sul.size());
    }

    @Test
    public void testDecorateListWithDuplicates() {
        List<String> dup = new ArrayList<String>(Arrays.asList("a", "b", "a", "c", "b"));
        SetUniqueList sul = (SetUniqueList) SetUniqueList.decorate(dup);
        assertEquals(3, sul.size());
        assertEquals("a", sul.get(0));
        assertEquals("b", sul.get(1));
        assertEquals("c", sul.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullSet() {
        new SetUniqueList(new ArrayList<String>(), null);
    }

    @Test
    public void testAddUnique() {
        assertTrue(list.add("x"));
        assertEquals(1, list.size());
        assertTrue(list.contains("x"));
    }

    @Test
    public void testAddDuplicate() {
        list.add("y");
        assertFalse(list.add("y"));
        assertEquals(1, list.size());
    }

    @Test
    public void testAddAtIndexUnique() {
        list.add("a");
        list.add("c");
        list.add(1, "b");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddAtIndexDuplicate() {
        list.add("a");
        list.add("b");
        list.add(0, "b");
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddAllUnique() {
        assertTrue(list.addAll(Arrays.asList("a", "b", "c")));
        assertEquals(3, list.size());
    }

    @Test
    public void testAddAllWithDuplicates() {
        list.addAll(Arrays.asList("a", "b", "a", "c", "b"));
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddAllAtIndex() {
        list.add("a");
        list.add("d");
        assertTrue(list.addAll(1, Arrays.asList("b", "c")));
        assertEquals(4, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("d", list.get(3));
    }

    @Test
    public void testAddAllAtIndexWithDuplicates() {
        list.add("x");
        list.add("y");
        assertFalse(list.addAll(0, Arrays.asList("x", "y")));
        assertEquals(2, list.size());
    }

    @Test
    public void testSetNormal() {
        list.add("a");
        list.add("b");
        Object old = list.set(0, "c");
        assertEquals("a", old);
        assertEquals(2, list.size());
        assertEquals("c", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testSetWithExistingElementSameIndex() {
        list.add("a");
        list.add("b");
        Object old = list.set(1, "b");
        assertEquals("b", old);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testSetWithExistingElementDifferentIndex() {
        list.add("a");
        list.add("b");
        Object old = list.set(0, "b");
        assertEquals("a", old);
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
    }

    @Test
    public void testRemoveObject() {
        list.add("a");
        list.add("b");
        assertTrue(list.remove("a"));
        assertEquals(1, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testRemoveObjectNotFound() {
        list.add("a");
        assertFalse(list.remove("b"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveAtIndex() {
        list.add("a");
        list.add("b");
        Object removed = list.remove(1);
        assertEquals("b", removed);
        assertEquals(1, list.size());
        assertFalse(list.contains("b"));
    }

    @Test
    public void testRemoveAll() {
        list.addAll(Arrays.asList("a", "b", "c", "d"));
        assertTrue(list.removeAll(Arrays.asList("b", "d")));
        assertEquals(2, list.size());
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testRetainAll() {
        list.addAll(Arrays.asList("a", "b", "c", "d"));
        assertTrue(list.retainAll(Arrays.asList("b", "c")));
        assertEquals(2, list.size());
        assertTrue(list.contains("b"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testClear() {
        list.add("a");
        list.add("b");
        list.clear();
        assertEquals(0, list.size());
        assertFalse(list.contains("a"));
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        list.add("a");
        assertTrue(list.contains("a"));
        assertFalse(list.contains("b"));
    }

    @Test
    public void testContainsAll() {
        list.addAll(Arrays.asList("a", "b", "c"));
        assertTrue(list.containsAll(Arrays.asList("a", "c")));
        assertFalse(list.containsAll(Arrays.asList("a", "d")));
    }

    @Test
    public void testAsSet() {
        list.add("a");
        list.add("b");
        Set<String> view = list.asSet();
        assertEquals(2, view.size());
        assertTrue(view.contains("a"));
        assertTrue(view.contains("b"));
    }

    @Test
    public void testIteratorRemove() {
        list.add("a");
        list.add("b");
        list.add("c");
        java.util.Iterator<String> it = list.iterator();
        it.next();
        it.remove();
        assertEquals(2, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testListIteratorAdd() {
        list.add("a");
        list.add("c");
        java.util.ListIterator<String> lit = list.listIterator(1);
        lit.add("b");
        assertEquals(3, list.size());
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testListIteratorAddDuplicate() {
        list.add("a");
        list.add("b");
        java.util.ListIterator<String> lit = list.listIterator(0);
        lit.add("a");
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetThrows() {
        list.add("a");
        java.util.ListIterator<String> lit = list.listIterator();
        lit.next();
        lit.set("b");
    }

    @Test
    public void testListIteratorRemove() {
        list.add("a");
        list.add("b");
        java.util.ListIterator<String> lit = list.listIterator();
        lit.next();
        lit.remove();
        assertEquals(1, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testSubList() {
        list.addAll(Arrays.asList("a", "b", "c", "d"));
        List<String> sub = list.subList(1, 3);
        assertEquals(2, sub.size());
        assertEquals("b", sub.get(0));
        assertEquals("c", sub.get(1));
    }
}