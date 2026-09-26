package org.apache.commons.collections.set;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ListOrderedSetTest {

    private ListOrderedSet<String> set;

    @Before
    public void setUp() {
        set = new ListOrderedSet<String>();
    }

    @Test
    public void testFactorySetAndListBothNull() {
        try {
            ListOrderedSet.listOrderedSet(null, new ArrayList<String>());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set must not be null", e.getMessage());
        }
        try {
            ListOrderedSet.listOrderedSet(new HashSet<String>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testFactorySetAndListNonEmpty() {
        Set<String> s = new HashSet<String>();
        s.add("a");
        List<String> l = new ArrayList<String>();
        try {
            ListOrderedSet.listOrderedSet(s, l);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set and List must be empty", e.getMessage());
        }
    }

    @Test
    public void testFactorySetAndListEmpty() {
        ListOrderedSet<String> los = ListOrderedSet.listOrderedSet(new HashSet<String>(), new ArrayList<String>());
        assertTrue(los.isEmpty());
    }

    @Test
    public void testFactorySetOnlyNull() {
        try {
            ListOrderedSet.listOrderedSet((Set<String>) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set must not be null", e.getMessage());
        }
    }

    @Test
    public void testFactoryListNull() {
        try {
            ListOrderedSet.listOrderedSet((List<String>) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testAddNewElement() {
        assertTrue(set.add("A"));
        assertEquals(1, set.size());
        assertEquals("A", set.get(0));
    }

    @Test
    public void testAddDuplicate() {
        set.add("A");
        assertFalse(set.add("A"));
        assertEquals(1, set.size());
        assertEquals("A", set.get(0));
    }

    @Test
    public void testAddNullElement() {
        assertTrue(set.add(null));
        assertTrue(set.contains(null));
    }

    @Test
    public void testAddAllNormal() {
        List<String> items = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        assertTrue(set.addAll(items));
        assertEquals(3, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
        assertEquals("C", set.get(2));
    }

    @Test
    public void testAddAllSomeDuplicates() {
        set.add("A");
        List<String> items = new ArrayList<String>(Arrays.asList("A", "B"));
        assertTrue(set.addAll(items));
        assertEquals(2, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
    }

    @Test
    public void testAddAllEmptyCollection() {
        set.add("A");
        assertFalse(set.addAll(new ArrayList<String>()));
        assertEquals(1, set.size());
    }

    @Test
    public void testRemoveExisting() {
        set.add("A");
        assertTrue(set.remove("A"));
        assertTrue(set.isEmpty());
    }

    @Test
    public void testRemoveNonExisting() {
        set.add("A");
        assertFalse(set.remove("B"));
        assertEquals(1, set.size());
    }

    @Test
    public void testRemoveByIndex() {
        set.add("A");
        set.add("B");
        assertEquals("A", set.remove(0));
        assertEquals(1, set.size());
        assertEquals("B", set.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndexOutOfBounds() {
        set.remove(0);
    }

    @Test
    public void testRemoveAllExisting() {
        set.add("A");
        set.add("B");
        set.add("C");
        assertTrue(set.removeAll(Arrays.asList("A", "C")));
        assertEquals(1, set.size());
        assertEquals("B", set.get(0));
    }

    @Test
    public void testRemoveAllNonExisting() {
        set.add("A");
        assertFalse(set.removeAll(Arrays.asList("B", "C")));
        assertEquals(1, set.size());
    }

    @Test
    public void testRetainAllNoChange() {
        set.add("A");
        set.add("B");
        assertFalse(set.retainAll(Arrays.asList("A", "B", "C")));
        assertEquals(2, set.size());
    }

    @Test
    public void testRetainAllSomeRemoved() {
        set.add("A");
        set.add("B");
        set.add("C");
        assertTrue(set.retainAll(Arrays.asList("A", "C")));
        assertEquals(2, set.size());
        assertEquals("A", set.get(0));
        assertEquals("C", set.get(1));
    }

    @Test
    public void testRetainAllEmpty() {
        set.add("A");
        set.add("B");
        assertTrue(set.retainAll(Arrays.asList()));
        assertTrue(set.isEmpty());
    }

    @Test
    public void testClear() {
        set.add("A");
        set.add("B");
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());
    }

    @Test
    public void testGet() {
        set.add("X");
        set.add("Y");
        assertEquals("X", set.get(0));
        assertEquals("Y", set.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        set.get(0);
    }

    @Test
    public void testIndexOfExisting() {
        set.add("A");
        set.add("B");
        assertEquals(0, set.indexOf("A"));
        assertEquals(1, set.indexOf("B"));
    }

    @Test
    public void testIndexOfNonExisting() {
        set.add("A");
        assertEquals(-1, set.indexOf("B"));
    }

    @Test
    public void testAddAtIndexNew() {
        set.add("A");
        set.add("C");
        set.add(1, "B");
        assertEquals(3, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
        assertEquals("C", set.get(2));
    }

    @Test
    public void testAddAtIndexDuplicate() {
        set.add("A");
        set.add("B");
        set.add(0, "A");
        assertEquals(2, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
    }

    @Test
    public void testAddAllAtIndex() {
        set.add("A");
        set.add("D");
        List<String> toAdd = Arrays.asList("B", "C");
        assertTrue(set.addAll(1, toAdd));
        assertEquals(4, set.size());
        assertEquals("A", set.get(0));
        assertEquals("B", set.get(1));
        assertEquals("C", set.get(2));
        assertEquals("D", set.get(3));
    }

    @Test
    public void testAddAllAtIndexWithDuplicates() {
        set.add("A");
        set.add("B");
        List<String> toAdd = Arrays.asList("A", "C");
        assertTrue(set.addAll(1, toAdd));
        assertEquals(3, set.size());
        assertEquals("A", set.get(0));
        assertEquals("C", set.get(1));
        assertEquals("B", set.get(2));
    }

    @Test
    public void testAddAllAtIndexEmpty() {
        set.add("A");
        assertFalse(set.addAll(0, new ArrayList<String>()));
        assertEquals(1, set.size());
    }

    @Test
    public void testIterator() {
        set.add("A");
        set.add("B");
        set.add("C");
        java.util.Iterator<String> it = set.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertTrue(it.hasNext());
        assertEquals("B", it.next());
        it.remove();
        assertEquals(2, set.size());
        assertFalse(set.contains("B"));
        assertTrue(it.hasNext());
        assertEquals("C", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testToList() {
        set.add("A");
        set.add("B");
        List<String> list = set.asList();
        assertEquals(2, list.size());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        try {
            list.add("C");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testToArray() {
        set.add("X");
        set.add("Y");
        Object[] arr = set.toArray();
        assertEquals(2, arr.length);
        assertEquals("X", arr[0]);
        assertEquals("Y", arr[1]);
    }

    @Test
    public void testToArrayWithTyped() {
        set.add("M");
        set.add("N");
        String[] arr = set.toArray(new String[0]);
        assertEquals(2, arr.length);
        assertEquals("M", arr[0]);
        assertEquals("N", arr[1]);
    }

    @Test
    public void testToString() {
        set.add("a");
        set.add("b");
        assertEquals("[a, b]", set.toString());
    }

    @Test
    public void testConstructorWithSetAndList() {
        Set<String> s = new HashSet<String>();
        s.add("A");
        List<String> l = new ArrayList<String>();
        l.add("A");
        ListOrderedSet<String> los = new ListOrderedSet<String>(s, l);
        assertEquals(1, los.size());
        assertEquals("A", los.get(0));
    }

    @Test
    public void testConstructorWithSetAndListNullList() {
        try {
            new ListOrderedSet<String>(new HashSet<String>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }
}