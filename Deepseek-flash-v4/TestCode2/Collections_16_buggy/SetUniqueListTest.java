package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetUniqueListTest {
    
    private List<String> baseList;
    private SetUniqueList uniqueList;
    
    @Before
    public void setUp() {
        baseList = new ArrayList<String>();
        baseList.add("A");
        baseList.add("B");
        baseList.add("C");
        uniqueList = new SetUniqueList(baseList, new HashSet<String>(baseList));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDecorateNullList() {
        SetUniqueList.decorate(null);
    }
    
    @Test
    public void testDecorateEmptyList() {
        List<String> empty = new ArrayList<String>();
        SetUniqueList decorated = SetUniqueList.decorate(empty);
        assertTrue(decorated.isEmpty());
    }
    
    @Test
    public void testDecorateWithDuplicates() {
        List<String> dupList = new ArrayList<String>();
        dupList.add("X");
        dupList.add("Y");
        dupList.add("X");
        SetUniqueList decorated = SetUniqueList.decorate(dupList);
        assertEquals(2, decorated.size());
        assertEquals("X", decorated.get(0));
        assertEquals("Y", decorated.get(1));
    }
    
    @Test
    public void testConstructorNullSet() {
        try {
            new SetUniqueList(new ArrayList<String>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }
    
    @Test
    public void testAsSet() {
        Set<String> result = uniqueList.asSet();
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
        assertTrue(result.contains("C"));
    }
    
    @Test
    public void testAddNewElement() {
        assertTrue(uniqueList.add("D"));
        assertEquals(4, uniqueList.size());
        assertTrue(uniqueList.contains("D"));
    }
    
    @Test
    public void testAddDuplicateElement() {
        assertFalse(uniqueList.add("A"));
        assertEquals(3, uniqueList.size());
    }
    
    @Test
    public void testAddAtIndexUnique() {
        uniqueList.add(0, "Z");
        assertEquals("Z", uniqueList.get(0));
        assertEquals(4, uniqueList.size());
        assertTrue(uniqueList.contains("Z"));
    }
    
    @Test
    public void testAddAtIndexDuplicate() {
        uniqueList.add(1, "A");
        assertEquals(3, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
    }
    
    @Test
    public void testAddAllNoDuplicates() {
        List<String> toAdd = Arrays.asList("D", "E");
        assertTrue(uniqueList.addAll(toAdd));
        assertEquals(5, uniqueList.size());
    }
    
    @Test
    public void testAddAllAllDuplicates() {
        List<String> toAdd = Arrays.asList("A", "B");
        assertFalse(uniqueList.addAll(toAdd));
        assertEquals(3, uniqueList.size());
    }
    
    @Test
    public void testAddAllAtIndexNoOverlap() {
        List<String> toAdd = Arrays.asList("X", "Y");
        assertTrue(uniqueList.addAll(1, toAdd));
        assertEquals(5, uniqueList.size());
        assertEquals("X", uniqueList.get(1));
        assertEquals("Y", uniqueList.get(2));
    }
    
    @Test
    public void testAddAllAtIndexSomeDuplicates() {
        List<String> toAdd = Arrays.asList("A", "D");
        uniqueList.addAll(1, toAdd);
        assertEquals(4, uniqueList.size());
        assertEquals("A", uniqueList.get(0));
        assertEquals("D", uniqueList.get(1));
    }
    
    @Test
    public void testSetNewObject() {
        String old = uniqueList.set(0, "Z");
        assertEquals("A", old);
        assertEquals("Z", uniqueList.get(0));
        assertEquals(3, uniqueList.size());
    }
    
    @Test
    public void testSetDuplicateObjectDifferentIndex() {
        // Replace index 0 with object already at index 2
        String old = uniqueList.set(0, "C");
        assertEquals("A", old);
        assertEquals("C", uniqueList.get(0));
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
    }
    
    @Test
    public void testSetDuplicateObjectSameIndex() {
        String old = uniqueList.set(0, "A");
        assertEquals("A", old);
        assertEquals("A", uniqueList.get(0));
        assertEquals(3, uniqueList.size());
    }
    
    @Test
    public void testRemoveObject() {
        assertTrue(uniqueList.remove("A"));
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
    }
    
    @Test
    public void testRemoveNonExistentObject() {
        assertFalse(uniqueList.remove("Z"));
        assertEquals(3, uniqueList.size());
    }
    
    @Test
    public void testRemoveByIndex() {
        Object removed = uniqueList.remove(1);
        assertEquals("B", removed);
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
    }
    
    @Test
    public void testRemoveAll() {
        List<String> toRemove = Arrays.asList("A", "C");
        assertTrue(uniqueList.removeAll(toRemove));
        assertEquals(1, uniqueList.size());
        assertEquals("B", uniqueList.get(0));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndexOutOfBounds() {
        uniqueList.remove(5);
    }
    
    @Test
    public void testRetainAll() {
        List<String> toRetain = Arrays.asList("A", "B");
        assertTrue(uniqueList.retainAll(toRetain));
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("C"));
    }
    
    @Test
    public void testClear() {
        uniqueList.clear();
        assertTrue(uniqueList.isEmpty());
        assertTrue(uniqueList.asSet().isEmpty());
    }
    
    @Test
    public void testContains() {
        assertTrue(uniqueList.contains("A"));
        assertFalse(uniqueList.contains("Z"));
    }
    
    @Test
    public void testContainsAll() {
        List<String> testList = Arrays.asList("A", "B");
        assertTrue(uniqueList.containsAll(testList));
        testList = Arrays.asList("A", "Z");
        assertFalse(uniqueList.containsAll(testList));
    }
    
    @Test
    public void testIteratorRemove() {
        java.util.Iterator<String> it = uniqueList.iterator();
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        it.remove();
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("B"));
    }
    
    @Test
    public void testListIteratorRemoveForward() {
        java.util.ListIterator<String> lit = uniqueList.listIterator();
        assertEquals("A", lit.next());
        lit.remove();
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("A"));
    }
    
    @Test
    public void testListIteratorRemoveBackward() {
        java.util.ListIterator<String> lit = uniqueList.listIterator(3);
        assertEquals("C", lit.previous());
        lit.remove();
        assertEquals(2, uniqueList.size());
        assertFalse(uniqueList.contains("C"));
    }
    
    @Test
    public void testListIteratorAddUnique() {
        java.util.ListIterator<String> lit = uniqueList.listIterator();
        lit.add("Z");
        assertEquals("Z", uniqueList.get(0));
        assertEquals(4, uniqueList.size());
    }
    
    @Test
    public void testListIteratorAddDuplicate() {
        java.util.ListIterator<String> lit = uniqueList.listIterator();
        lit.add("A");
        assertEquals(3, uniqueList.size());
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testListIteratorSetUnsupported() {
        java.util.ListIterator<String> lit = uniqueList.listIterator();
        lit.next();
        lit.set("X");
    }
    
    @Test
    public void testSubList() {
        List<String> sub = uniqueList.subList(1, 3);
        assertEquals(2, sub.size());
        assertTrue(sub.contains("B"));
        assertTrue(sub.contains("C"));
    }
    
    @Test
    public void testAddAllEmptyCollection() {
        List<String> empty = new ArrayList<String>();
        assertFalse(uniqueList.addAll(empty));
        assertEquals(3, uniqueList.size());
    }
}