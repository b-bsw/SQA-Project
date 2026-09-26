package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.QName;

import java.util.*;

public class ExpressionTest {

    private EvalContext context;
    private Locale locale;
    private QName qname;

    @Before
    public void setUp() {
        locale = Locale.US;
        qname = new QName(null, "test");
        context = createMockEvalContext();
    }

    @After
    public void tearDown() {
        context = null;
        locale = null;
        qname = null;
    }

    private EvalContext createMockEvalContext() {
        return new EvalContext(null, null) {
            public Pointer getCurrentNodePointer() {
                return NodePointer.newNodePointer(qname, "root", locale);
            }
            public EvalContext getRootContext() {
                return this;
            }
            public boolean hasNext() {
                return false;
            }
            public Object next() {
                return null;
            }
            public void reset() {
            }
            public boolean nextNode() {
                return false;
            }
            public boolean previousNode() {
                return false;
            }
            public NodePointer getCurrentNodePointer() {
                return NodePointer.newNodePointer(qname, "root", locale);
            }
            public int getCurrentPosition() {
                return 0;
            }
        };
    }

    // --- Expression inner class for testing ---
    private static class TestExpression extends Expression {
        private boolean contextDependent;
        private Object computeValueResult;
        private Object computeResult;

        TestExpression(boolean contextDependent, Object computeValueResult, Object computeResult) {
            this.contextDependent = contextDependent;
            this.computeValueResult = computeValueResult;
            this.computeResult = computeResult;
        }

        public boolean computeContextDependent() {
            return contextDependent;
        }

        public Object computeValue(EvalContext ctx) {
            return computeValueResult;
        }

        public Object compute(EvalContext ctx) {
            return computeResult;
        }
    }

    // --- isContextDependent tests ---
    @Test
    public void testIsContextDependent_True() {
        Expression expr = new TestExpression(true, null, null);
        assertTrue(expr.isContextDependent());
        assertTrue(expr.isContextDependent()); // cached
    }

    @Test
    public void testIsContextDependent_False() {
        Expression expr = new TestExpression(false, null, null);
        assertFalse(expr.isContextDependent());
        assertFalse(expr.isContextDependent()); // cached
    }

    // --- iterate tests (EvalContext result) ---
    @Test
    public void testIterate_ReturnsEvalContext() {
        EvalContext evalCtx = createMockEvalContext();
        Expression expr = new TestExpression(false, null, evalCtx);
        Iterator result = expr.iterate(context);
        assertTrue(result instanceof Expression.ValueIterator);
        // Verify ValueIterator wraps EvalContext lazily
        assertFalse(result.hasNext());
    }

    @Test
    public void testIterate_ReturnsNonEvalContext_List() {
        List<String> list = Arrays.asList("a", "b");
        Expression expr = new TestExpression(false, null, list);
        Iterator result = expr.iterate(context);
        assertTrue(result instanceof Iterator);
        assertTrue(result.hasNext());
        assertEquals("a", result.next());
        assertTrue(result.hasNext());
        assertEquals("b", result.next());
        assertFalse(result.hasNext());
    }

    @Test
    public void testIterate_ReturnsNull() {
        Expression expr = new TestExpression(false, null, null);
        Iterator result = expr.iterate(context);
        assertNull(result);
    }

    // --- iteratePointers tests ---
    @Test
    public void testIteratePointers_NullResult() {
        Expression expr = new TestExpression(false, null, null);
        Iterator result = expr.iteratePointers(context);
        assertNotNull(result);
        assertFalse(result.hasNext());
    }

    @Test
    public void testIteratePointers_EvalContextResult() {
        EvalContext evalCtx = createMockEvalContext();
        Expression expr = new TestExpression(false, null, evalCtx);
        Iterator result = expr.iteratePointers(context);
        assertTrue(result instanceof EvalContext);
    }

    @Test
    public void testIteratePointers_ListOfPointers() {
        NodePointer pointer = NodePointer.newNodePointer(qname, "value", locale);
        List<Pointer> list = Collections.singletonList((Pointer) pointer);
        Expression expr = new TestExpression(false, null, list);
        Iterator result = expr.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object next = result.next();
        assertTrue(next instanceof Pointer);
        assertEquals("value", ((Pointer) next).getValue());
    }

    @Test
    public void testIteratePointers_ListOfNonPointers() {
        List<String> list = Collections.singletonList("item");
        Expression expr = new TestExpression(false, null, list);
        Iterator result = expr.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object next = result.next();
        assertTrue(next instanceof Pointer);
        assertEquals("item", ((Pointer) next).getValue());
    }

    @Test
    public void testIteratePointers_EmptyList() {
        List<Object> emptyList = Collections.emptyList();
        Expression expr = new TestExpression(false, null, emptyList);
        Iterator result = expr.iteratePointers(context);
        assertNotNull(result);
        assertFalse(result.hasNext());
    }

    // --- PointerIterator tests ---
    @Test
    public void testPointerIterator_HasNext() {
        List<String> list = new ArrayList<>();
        list.add("x");
        Expression.PointerIterator it = new Expression.PointerIterator(list.iterator(), qname, locale);
        assertTrue(it.hasNext());
        assertTrue(it.hasNext()); // idempotent
    }

    @Test
    public void testPointerIterator_Next_PointerInstance() {
        Pointer ptr = NodePointer.newNodePointer(qname, "data", locale);
        List<Pointer> list = Collections.singletonList(ptr);
        Expression.PointerIterator it = new Expression.PointerIterator(list.iterator(), qname, locale);
        assertSame(ptr, it.next());
    }

    @Test
    public void testPointerIterator_Next_NonPointerCreatesNodePointer() {
        List<String> list = Collections.singletonList("value");
        Expression.PointerIterator it = new Expression.PointerIterator(list.iterator(), qname, locale);
        Object result = it.next();
        assertTrue(result instanceof NodePointer);
        assertEquals("value", ((NodePointer) result).getValue());
    }

    @Test(expected = NoSuchElementException.class)
    public void testPointerIterator_Next_NoSuchElement() {
        List<Object> emptyList = Collections.emptyList();
        Expression.PointerIterator it = new Expression.PointerIterator(emptyList.iterator(), qname, locale);
        it.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPointerIterator_Remove_Throws() {
        List<String> list = Collections.singletonList("x");
        Expression.PointerIterator it = new Expression.PointerIterator(list.iterator(), qname, locale);
        it.remove();
    }

    // --- ValueIterator tests ---
    @Test
    public void testValueIterator_HasNext() {
        List<String> list = Collections.singletonList("a");
        Expression.ValueIterator it = new Expression.ValueIterator(list.iterator());
        assertTrue(it.hasNext());
        assertTrue(it.hasNext()); // idempotent
    }

    @Test
    public void testValueIterator_Next_PointerReturnsValue() {
        Pointer ptr = NodePointer.newNodePointer(qname, "hello", locale);
        List<Pointer> list = Collections.singletonList(ptr);
        Expression.ValueIterator it = new Expression.ValueIterator(list.iterator());
        assertEquals("hello", it.next());
    }

    @Test
    public void testValueIterator_Next_NonPointerReturnsDirect() {
        List<Integer> list = Collections.singletonList(42);
        Expression.ValueIterator it = new Expression.ValueIterator(list.iterator());
        assertEquals(42, it.next());
    }

    @Test(expected = NoSuchElementException.class)
    public void testValueIterator_Next_NoSuchElement() {
        List<Object> emptyList = Collections.emptyList();
        Expression.ValueIterator it = new Expression.ValueIterator(emptyList.iterator());
        it.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testValueIterator_Remove_Throws() {
        List<String> list = Collections.singletonList("x");
        Expression.ValueIterator it = new Expression.ValueIterator(list.iterator());
        it.remove();
    }
}