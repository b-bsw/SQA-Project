package org.apache.commons.collections4;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IteratorUtilsTest {

    private List<String> list;

    @Before
    public void setUp() {
        list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
    }

    @After
    public void tearDown() {
        list = null;
    }

    @Test
    public void testEmptyIterator() {
        assertNotNull(IteratorUtils.emptyIterator());
        assertFalse(IteratorUtils.emptyIterator().hasNext());
    }

    @Test
    public void testEmptyListIterator() {
        assertNotNull(IteratorUtils.emptyListIterator());
        assertFalse(IteratorUtils.emptyListIterator().hasNext());
    }

    @Test
    public void testEmptyOrderedIterator() {
        assertNotNull(IteratorUtils.emptyOrderedIterator());
        assertFalse(IteratorUtils.emptyOrderedIterator().hasNext());
    }

    @Test
    public void testEmptyMapIterator() {
        assertNotNull(IteratorUtils.emptyMapIterator());
        assertFalse(IteratorUtils.emptyMapIterator().hasNext());
    }

    @Test
    public void testEmptyOrderedMapIterator() {
        assertNotNull(IteratorUtils.emptyOrderedMapIterator());
        assertFalse(IteratorUtils.emptyOrderedMapIterator().hasNext());
    }

    @Test
    public void testSingletonIterator() {
        Iterator<String> it = IteratorUtils.singletonIterator("x");
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testSingletonListIterator() {
        ListIterator<String> it = IteratorUtils.singletonListIterator("x");
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
    }

    @Test
    public void testArrayIteratorVarargs() {
        Iterator<String> it = IteratorUtils.arrayIterator("x", "y", "z");
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
        assertEquals("y", it.next());
        assertEquals("z", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorObjectArray() {
        Iterator<String> it = IteratorUtils.arrayIterator((Object) new String[]{"a", "b"});
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testArrayIteratorNullObject() {
        IteratorUtils.arrayIterator((Object) null);
    }

    @Test
    public void testArrayListIteratorVarargs() {
        ListIterator<String> it = IteratorUtils.arrayListIterator("x", "y");
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
    }

    @Test
    public void testBoundedIteratorNoOffset() {
        Iterator<String> it = IteratorUtils.boundedIterator(list.iterator(), 2);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testBoundedIteratorWithOffset() {
        Iterator<String> it = IteratorUtils.boundedIterator(list.iterator(), 1, 2);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testUnmodifiableIterator() {
        Iterator<String> it = IteratorUtils.unmodifiableIterator(list.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIteratorNullIterator() {
        IteratorUtils.transformedIterator(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIteratorNullTransform() {
        IteratorUtils.transformedIterator(list.iterator(), null);
    }

    @Test
    public void testFilteredIterator() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String s) { return s.equals("b"); }
        };
        Iterator<String> it = IteratorUtils.filteredIterator(list.iterator(), pred);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredIteratorNullIterator() {
        IteratorUtils.filteredIterator(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredListIteratorNull() {
        IteratorUtils.filteredListIterator(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingIteratorNull() {
        IteratorUtils.loopingIterator(null);
    }

    @Test
    public void testLoopingIterator() {
        Collection<String> coll = Arrays.asList("x");
        Iterator<String> it = IteratorUtils.loopingIterator(coll);
        assertTrue(it.hasNext());
        assertEquals("x", it.next());
        assertEquals("x", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingListIteratorNull() {
        IteratorUtils.loopingListIterator(null);
    }

    @Test(expected = NullPointerException.class)
    public void testNodeListIteratorNullNodeList() {
        IteratorUtils.nodeListIterator((NodeList) null);
    }

    @Test(expected = NullPointerException.class)
    public void testNodeListIteratorNullNode() {
        IteratorUtils.nodeListIterator((Node) null);
    }

    @Test
    public void testAsIteratorFromEnumeration() {
        Vector<String> v = new Vector<String>();
        v.add("a");
        Iterator<String> it = IteratorUtils.asIterator(v.elements());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testAsIteratorNullEnumeration() {
        IteratorUtils.asIterator((Enumeration) null);
    }

    @Test(expected = NullPointerException.class)
    public void testAsIteratorNullRemoveCollection() {
        IteratorUtils.asIterator(Collections.emptyEnumeration(), null);
    }

    @Test
    public void testAsEnumeration() {
        Enumeration<String> e = IteratorUtils.asEnumeration(list.iterator());
        assertTrue(e.hasMoreElements());
        assertEquals("a", e.nextElement());
    }

    @Test(expected = NullPointerException.class)
    public void testAsEnumerationNull() {
        IteratorUtils.asEnumeration(null);
    }

    @Test
    public void testAsIterable() {
        Iterable<String> it = IteratorUtils.asIterable(list.iterator());
        Iterator<String> iter = it.iterator();
        assertTrue(iter.hasNext());
        assertEquals("a", iter.next());
    }

    @Test(expected = NullPointerException.class)
    public void testAsIterableNull() {
        IteratorUtils.asIterable(null);
    }

    @Test
    public void testAsMultipleUseIterable() {
        Iterator<String> src = list.iterator();
        Iterable<String> it = IteratorUtils.asMultipleUseIterable(src);
        Iterator<String> first = it.iterator();
        assertTrue(first.hasNext());
        assertEquals("a", first.next());
    }

    @Test(expected = NullPointerException.class)
    public void testAsMultipleUseIterableNull() {
        IteratorUtils.asMultipleUseIterable(null);
    }

    @Test
    public void testToListIterator() {
        ListIterator<String> it = IteratorUtils.toListIterator(list.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testToListIteratorNull() {
        IteratorUtils.toListIterator(null);
    }

    @Test
    public void testToArrayObject() {
        Object[] arr = IteratorUtils.toArray(list.iterator());
        assertEquals(3, arr.length);
        assertEquals("a", arr[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayObjectNull() {
        IteratorUtils.toArray((Iterator) null);
    }

    @Test
    public void testToArrayTyped() {
        String[] arr = IteratorUtils.toArray(list.iterator(), String.class);
        assertEquals(3, arr.length);
        assertEquals("a", arr[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayTypedNullIterator() {
        IteratorUtils.toArray(null, String.class);
    }

    @Test(expected = NullPointerException.class)
    public void testToArrayTypedNullClass() {
        IteratorUtils.toArray(list.iterator(), null);
    }

    @Test
    public void testToList() {
        List<String> result = IteratorUtils.toList(list.iterator());
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void testToListNull() {
        IteratorUtils.toList((Iterator) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToListInvalidEstimatedSize() {
        IteratorUtils.toList(list.iterator(), 0);
    }

    @Test
    public void testGetIteratorNull() {
        Iterator<?> it = IteratorUtils.getIterator(null);
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetIteratorIterator() {
        Iterator<String> it = IteratorUtils.getIterator(list.iterator());
        assertTrue(it instanceof Iterator);
    }

    @Test
    public void testGetIteratorIterable() {
        Iterable<String> iterable = new Iterable<String>() {
            public Iterator<String> iterator() { return list.iterator(); }
        };
        Iterator<?> it = IteratorUtils.getIterator(iterable);
        assertTrue(it.hasNext());
    }

    @Test
    public void testGetIteratorObjectArray() {
        Iterator<?> it = IteratorUtils.getIterator(new String[]{"x"});
        assertTrue(it.hasNext());
    }

    @Test
    public void testGetIteratorEnumeration() {
        Vector<String> v = new Vector<String>();
        v.add("a");
        Iterator<?> it = IteratorUtils.getIterator(v.elements());
        assertTrue(it.hasNext());
    }

    @Test
    public void testGetIteratorMap() {
        Map<String, String> m = new HashMap<String, String>();
        m.put("k", "v");
        Iterator<?> it = IteratorUtils.getIterator(m);
        assertTrue(it.hasNext());
    }

    @Test
    public void testGetIteratorDictionary() {
        Dictionary<String, String> d = new Hashtable<String, String>();
        d.put("k", "v");
        Iterator<?> it = IteratorUtils.getIterator(d);
        assertTrue(it.hasNext());
    }

    @Test
    public void testGetIteratorPrimitiveArray() {
        Iterator<?> it = IteratorUtils.getIterator(new int[]{1, 2});
        assertTrue(it.hasNext());
    }

    @Test
    public void testGetIteratorWithIteratorMethod() {
        class MyClass {
            public Iterator<String> iterator() { return list.iterator(); }
        }
        Iterator<?> it = IteratorUtils.getIterator(new MyClass());
        assertTrue(it.hasNext());
    }

    @Test
    public void testGetIteratorFallback() {
        Iterator<?> it = IteratorUtils.getIterator("string");
        assertTrue(it.hasNext());
        assertEquals("string", it.next());
    }

    @Test
    public void testApply() {
        final StringBuilder sb = new StringBuilder();
        Closure<String> closure = new Closure<String>() {
            public void execute(String input) { sb.append(input); }
        };
        IteratorUtils.apply(list.iterator(), closure);
        assertEquals("abc", sb.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testApplyNullClosure() {
        IteratorUtils.apply(list.iterator(), null);
    }

    @Test
    public void testApplyNullIterator() {
        IteratorUtils.apply(null, new Closure<String>() {
            public void execute(String input) { fail("should not be called"); }
        });
    }

    @Test
    public void testFind() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String s) { return s.equals("b"); }
        };
        String result = IteratorUtils.find(list.iterator(), pred);
        assertEquals("b", result);
    }

    @Test
    public void testFindNotFound() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String s) { return s.equals("z"); }
        };
        assertNull(IteratorUtils.find(list.iterator(), pred));
    }

    @Test(expected = NullPointerException.class)
    public void testFindNullPredicate() {
        IteratorUtils.find(list.iterator(), null);
    }

    @Test
    public void testFindNullIterator() {
        assertNull(IteratorUtils.find(null, new Predicate<String>() {
            public boolean evaluate(String s) { return true; }
        }));
    }

    @Test
    public void testMatchesAnyTrue() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String s) { return s.equals("b"); }
        };
        assertTrue(IteratorUtils.matchesAny(list.iterator(), pred));
    }

    @Test
    public void testMatchesAnyFalse() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String s) { return s.equals("z"); }
        };
        assertFalse(IteratorUtils.matchesAny(list.iterator(), pred));
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesAnyNullPredicate() {
        IteratorUtils.matchesAny(list.iterator(), null);
    }

    @Test
    public void testMatchesAllTrue() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String s) { return s.length() == 1; }
        };
        assertTrue(IteratorUtils.matchesAll(list.iterator(), pred));
    }

    @Test
    public void testMatchesAllFalse() {
        Predicate<String> pred = new Predicate<String>() {
            public boolean evaluate(String s) { return s.equals("a"); }
        };
        assertFalse(IteratorUtils.matchesAll(list.iterator(), pred));
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesAllNullPredicate() {
        IteratorUtils.matchesAll(list.iterator(), null);
    }

    @Test
    public void testMatchesAllNullIterator() {
        assertTrue(IteratorUtils.matchesAll(null, new Predicate<String>() {
            public boolean evaluate(String s) { return false; }
        }));
    }

    @Test
    public void testIsEmptyNull() {
        assertTrue(IteratorUtils.isEmpty(null));
    }

    @Test
    public void testIsEmptyNonEmpty() {
        assertFalse(IteratorUtils.isEmpty(list.iterator()));
    }

    @Test
    public void testIsEmptyEmpty() {
        assertTrue(IteratorUtils.isEmpty(Collections.emptyIterator()));
    }

    @Test
    public void testContainsTrue() {
        assertTrue(IteratorUtils.contains(list.iterator(), "b"));
    }

    @Test
    public void testContainsFalse() {
        assertFalse(IteratorUtils.contains(list.iterator(), "z"));
    }

    @Test
    public void testGetByIndex() {
        assertEquals("b", IteratorUtils.get(list.iterator(), 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        IteratorUtils.get(list.iterator(), 10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetByIndexNegative() {
        IteratorUtils.get(list.iterator(), -1);
    }

    @Test
    public void testSizeNull() {
        assertEquals(0, IteratorUtils.size(null));
    }

    @Test
    public void testSizeNonEmpty() {
        assertEquals(3, IteratorUtils.size(list.iterator()));
    }

    @Test
    public void testSizeEmpty() {
        assertEquals(0, IteratorUtils.size(Collections.emptyIterator()));
    }

    @Test
    public void testToStringDefault() {
        String result = IteratorUtils.toString(list.iterator());
        assertEquals("[a, b, c]", result);
    }

    @Test
    public void testToStringCustomTransformer() {
        Transformer<String, String> transformer = new Transformer<String, String>() {
            public String transform(String input) { return input.toUpperCase(); }
        };
        String result = IteratorUtils.toString(list.iterator(), transformer);
        assertEquals("[A, B, C]", result);
    }

    @Test
    public void testToStringFull() {
        Transformer<String, String> transformer = new Transformer<String, String>() {
            public String transform(String input) { return input; }
        };
        String result = IteratorUtils.toString(list.iterator(), transformer, "|", "<", ">");
        assertEquals("<a|b|c>", result);
    }

    @Test
    public void testToStringNullIterator() {
        String result = IteratorUtils.toString(null);
        assertEquals("[]", result);
    }

    @Test(expected = NullPointerException.class)
    public void testToStringNullTransformer() {
        IteratorUtils.toString(list.iterator(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testToStringNullDelimiter() {
        IteratorUtils.toString(list.iterator(), new Transformer<String, String>() {
            public String transform(String input) { return input; }
        }, null, "[", "]");
    }

    @Test(expected = NullPointerException.class)
    public void testToStringNullPrefix() {
        IteratorUtils.toString(list.iterator(), new Transformer<String, String>() {
            public String transform(String input) { return input; }
        }, ",", null, "]");
    }

    @Test(expected = NullPointerException.class)
    public void testToStringNullSuffix() {
        IteratorUtils.toString(list.iterator(), new Transformer<String, String>() {
            public String transform(String input) { return input; }
        }, ",", "[", null);
    }

    @Test
    public void testToStringEmptyIterator() {
        String result = IteratorUtils.toString(Collections.emptyIterator());
        assertEquals("[]", result);
    }

    @Test
    public void testGetIteratorEmpty() {
        Iterator<?> it = IteratorUtils.getIterator(new ArrayList<Object>());
        assertTrue(it instanceof Iterator);
    }
}