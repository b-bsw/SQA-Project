package org.apache.commons.jxpath.ri.compiler;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;

public class CoreOperationCompareTest {

    // ---- Helper classes ----

    static class TestExpression extends Expression {
        private Object value;
        TestExpression(Object value) { this.value = value; }
        public Object compute(EvalContext ctx) { return value; }
    }

    static class TestPointer implements Pointer {
        private Object value;
        TestPointer(Object value) { this.value = value; }
        public Object getValue() { return value; }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TestPointer)) return false;
            return Objects.equals(value, ((TestPointer)o).value);
        }
        @Override
        public int hashCode() { return Objects.hashCode(value); }
        // stub the remaining Pointer methods
        public Object getNode() { return null; }
        public String asPath() { return null; }
    }

    static class TestInitialContext extends InitialContext {
        TestInitialContext() { super(null, null); }
        public void reset() { /* no-op */ }
    }

    static class TestSelfContext extends SelfContext {
        private Pointer pointer;
        TestSelfContext(Pointer p) { super(null); this.pointer = p; }
        public Pointer getSingleNodePointer() { return pointer; }
    }

    static class TestableCompare extends CoreOperationCompare {
        TestableCompare(Expression a1, Expression a2) { super(a1, a2); }
        public boolean callEqual(EvalContext ctx, Expression l, Expression r) { return equal(ctx, l, r); }
        public boolean callContains(Iterator it, Object value) { return contains(it, value); }
        public boolean callFindMatch(Iterator lit, Iterator rit) { return findMatch(lit, rit); }
        public boolean callEqual(Object l, Object r) { return equal(l, r); }
    }

    private static final Expression DUMMY = new TestExpression(null);
    private final TestableCompare op = new TestableCompare(DUMMY, DUMMY);

    // ======== equal(Object, Object) ========

    @Test
    public void testEqualNullBoth() {
        assertTrue(op.callEqual(null, null));
    }

    @Test
    public void testEqualOneNull() {
        assertFalse(op.callEqual("value", null));
        assertFalse(op.callEqual(null, "value"));
    }

    @Test
    public void testEqualStringEqual() {
        assertTrue(op.callEqual("abc", "abc"));
    }

    @Test
    public void testEqualStringNotEqual() {
        assertFalse(op.callEqual("abc", "xyz"));
    }

    @Test
    public void testEqualBooleanTrue() {
        assertTrue(op.callEqual(Boolean.TRUE, Boolean.TRUE));
    }

    @Test
    public void testEqualNumberEqual() {
        assertTrue(op.callEqual(1.0, 1.0));
    }

    @Test
    public void testEqualPointerSame() {
        TestPointer p1 = new TestPointer("val");
        assertTrue(op.callEqual(p1, p1));
    }

    @Test
    public void testEqualPointerDifferent() {
        TestPointer p1 = new TestPointer("val");
        TestPointer p2 = new TestPointer("val");
        assertTrue(op.callEqual(p1, p2));
    }

    @Test
    public void testEqualPointerAndValue() {
        TestPointer p = new TestPointer("val");
        assertTrue(op.callEqual(p, "val"));
    }

    @Test
    public void testEqualCustomObject() {
        Object o1 = new Object();
        Object o2 = new Object();
        assertFalse(op.callEqual(o1, o2));
        assertTrue(op.callEqual(o1, o1));
    }

    // ======== contains ========

    @Test
    public void testContainsMatch() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertTrue(op.callContains(list.iterator(), "a"));
    }

    @Test
    public void testContainsNoMatch() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertFalse(op.callContains(list.iterator(), "d"));
    }

    @Test
    public void testContainsEmptyIterator() {
        List<String> empty = Collections.emptyList();
        assertFalse(op.callContains(empty.iterator(), "a"));
    }

    // ======== findMatch ========

    @Test
    public void testFindMatchBothEmpty() {
        List<String> empty1 = Collections.emptyList();
        List<String> empty2 = Collections.emptyList();
        assertFalse(op.callFindMatch(empty1.iterator(), empty2.iterator()));
    }

    @Test
    public void testFindMatchLeftEmpty() {
        List<String> leftEmpty = Collections.emptyList();
        List<String> right = Arrays.asList("a");
        assertFalse(op.callFindMatch(leftEmpty.iterator(), right.iterator()));
    }

    @Test
    public void testFindMatchRightEmpty() {
        List<String> left = Arrays.asList("a");
        List<String> rightEmpty = Collections.emptyList();
        assertFalse(op.callFindMatch(left.iterator(), rightEmpty.iterator()));
    }

    @Test
    public void testFindMatchFound() {
        List<String> left = Arrays.asList("x", "y", "z");
        List<String> right = Arrays.asList("a", "y", "b");
        assertTrue(op.callFindMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testFindMatchNotFound() {
        List<String> left = Arrays.asList("x", "y", "z");
        List<String> right = Arrays.asList("a", "b", "c");
        assertFalse(op.callFindMatch(left.iterator(), right.iterator()));
    }

    // ======== equal(EvalContext, Expression, Expression) – branch coverage ========

    @Test
    public void testEqualBothSimple() {
        Expression left = new TestExpression("hello");
        Expression right = new TestExpression("hello");
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithPointer() {
        TestPointer p = new TestPointer("value");
        Expression left = new TestExpression(p);
        Expression right = new TestExpression("value");
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithCollection() {
        List<String> col = Arrays.asList("a", "b");
        Expression left = new TestExpression(col);
        Expression right = new TestExpression("a");
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualCollectionNoMatch() {
        List<String> col = Arrays.asList("x", "y");
        Expression left = new TestExpression(col);
        Expression right = new TestExpression("a");
        assertFalse(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualBothCollections() {
        List<String> leftCol = Arrays.asList("a","b");
        List<String> rightCol = Arrays.asList("b","c");
        Expression left = new TestExpression(leftCol);
        Expression right = new TestExpression(rightCol);
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithIterator() {
        List<String> list = Arrays.asList("p", "q");
        Expression left = new TestExpression(list.iterator());
        Expression right = new TestExpression("q");
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithRightIterator() {
        List<String> list = Arrays.asList("p", "q");
        Expression left = new TestExpression("q");
        Expression right = new TestExpression(list.iterator());
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualBothIterators() {
        List<String> leftList = Arrays.asList("1", "2");
        List<String> rightList = Arrays.asList("2", "3");
        Expression left = new TestExpression(leftList.iterator());
        Expression right = new TestExpression(rightList.iterator());
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualBothIteratorsNoMatch() {
        List<String> leftList = Arrays.asList("1", "3");
        List<String> rightList = Arrays.asList("2", "4");
        Expression left = new TestExpression(leftList.iterator());
        Expression right = new TestExpression(rightList.iterator());
        assertFalse(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithSelfContext() {
        TestPointer p = new TestPointer("target");
        SelfContext sc = new TestSelfContext(p);
        Expression left = new TestExpression(sc);
        Expression right = new TestExpression("target");
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithSelfContextNoMatch() {
        TestPointer p = new TestPointer("target");
        SelfContext sc = new TestSelfContext(p);
        Expression left = new TestExpression(sc);
        Expression right = new TestExpression("other");
        assertFalse(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithInitialContext() {
        class CustomInitialContext extends InitialContext {
            CustomInitialContext() { super(null, null); }
            @Override
            public boolean equals(Object o) { return o != null && o.equals("special"); }
        }
        InitialContext ic = new CustomInitialContext();
        Expression left = new TestExpression(ic);
        Expression right = new TestExpression("special");
        assertTrue(op.callEqual(null, left, right));
    }

    @Test
    public void testEqualWithRightInitialContext() {
        class CustomInitialContext extends InitialContext {
            CustomInitialContext() { super(null, null); }
            @Override
            public boolean equals(Object o) { return o != null && o.equals("magic"); }
        }
        InitialContext ic = new CustomInitialContext();
        Expression left = new TestExpression("magic");
        Expression right = new TestExpression(ic);
        assertTrue(op.callEqual(null, left, right));
    }
}