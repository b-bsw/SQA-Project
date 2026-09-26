package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.Test;

public class CoreOperationCompareTest {

    private static class TestExpression extends Expression {
        private final Object value;

        TestExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object compute(EvalContext context) {
            return value;
        }

        @Override
        public String toString() {
            return "Expr(" + value + ")";
        }
    }

    private static TestExpression expr(Object value) {
        return new TestExpression(value);
    }

    private static CoreOperationCompare createCompare(final Expression left, final Expression right) {
        return new CoreOperationCompare(left, right) {
            @Override
            public String getSymbol() {
                return "op";
            }
        };
    }

    private static final EvalContext NULL_CONTEXT = null;

    private static Pointer createPointer(final Object value) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                switch (method.getName()) {
                    case "getValue":
                        return value;
                    case "setValue":
                        return null;
                    case "equals":
                        if (proxy == args[0]) {
                            return true;
                        }
                        if (!(args[0] instanceof Pointer)) {
                            return false;
                        }
                        return value != null && value.equals(((Pointer) args[0]).getValue());
                    case "hashCode":
                        return System.identityHashCode(proxy);
                    default:
                        Class<?> rt = method.getReturnType();
                        if (rt == boolean.class) {
                            return false;
                        }
                        if (rt == int.class) {
                            return 0;
                        }
                        return null;
                }
            }
        };
        return (Pointer) Proxy.newProxyInstance(
                CoreOperationCompareTest.class.getClassLoader(),
                new Class[]{Pointer.class},
                handler);
    }

    @Test
    public void testEqualSameObject() {
        Object o = new Object();
        assertTrue(createCompare(null, null).equal(o, o));
    }

    @Test
    public void testEqualNullNonNull() {
        CoreOperationCompare op = createCompare(null, null);
        assertFalse(op.equal(null, "x"));
        assertFalse(op.equal("x", null));
    }

    @Test
    public void testEqualStrings() {
        CoreOperationCompare op = createCompare(null, null);
        assertTrue(op.equal("foo", "foo"));
        assertFalse(op.equal("foo", "bar"));
    }

    @Test
    public void testEqualNumbers() {
        CoreOperationCompare op = createCompare(null, null);
        assertTrue(op.equal(1.0, 1));
        assertFalse(op.equal(1.0, 2));
    }

    @Test
    public void testEqualBooleanConversion() {
        CoreOperationCompare op = createCompare(null, null);
        assertTrue(op.equal(Boolean.TRUE, "true"));
        assertTrue(op.equal(1, Boolean.TRUE));
    }

    @Test
    public void testEqualStringAndNumber() {
        CoreOperationCompare op = createCompare(null, null);
        assertTrue(op.equal("1", 1));
    }

    @Test
    public void testEqualPointerSameValue() {
        CoreOperationCompare op = createCompare(null, null);
        Pointer p1 = createPointer("value");
        Pointer p2 = createPointer("value");
        assertTrue(op.equal(p1, p2));
    }

    @Test
    public void testEqualPointerUnwrapValue() {
        CoreOperationCompare op = createCompare(null, null);
        Pointer p = createPointer("abc");
        assertTrue(op.equal(p, "abc"));
    }

    @Test
    public void testEqualPointerNullValue() {
        CoreOperationCompare op = createCompare(null, null);
        Pointer p = createPointer(null);
        assertTrue(op.equal(p, null));
    }

    @Test
    public void testEqualCollectionContainsValueUsingExpression() {
        CoreOperationCompare op = createCompare(
                expr(Arrays.asList("a", "b", "c")),
                expr("b"));
        assertTrue(op.equal(NULL_CONTEXT, expr(Arrays.asList("a", "b", "c")), expr("b")));
        assertFalse(op.equal(NULL_CONTEXT, expr(Arrays.asList("a", "b", "c")), expr("z")));
    }

    @Test
    public void testEqualValueInCollectionUsingExpression() {
        CoreOperationCompare op = createCompare(
                expr("b"),
                expr(Arrays.asList("a", "b", "c")));
        assertTrue(op.equal(NULL_CONTEXT, expr("b"), expr(Arrays.asList("a", "b", "c"))));
    }

    @Test
    public void testEqualBothCollectionsFindMatch() {
        CoreOperationCompare op = createCompare(
                expr(Arrays.asList("a", "b")),
                expr(Arrays.asList("x", "b")));
        assertTrue(op.equal(NULL_CONTEXT,
                expr(Arrays.asList("a", "b")),
                expr(Arrays.asList("x", "b"))));

        assertFalse(op.equal(NULL_CONTEXT,
                expr(Arrays.asList("a")),
                expr(Arrays.asList("b", "c"))));
    }

    @Test
    public void testContainsZeroLoop() {
        CoreOperationCompare op = createCompare(
                expr(Collections.emptyList()),
                expr("x"));
        assertFalse(op.equal(NULL_CONTEXT, expr(Collections.emptyList()), expr("x")));
    }

    @Test
    public void testContainsOneLoop() {
        CoreOperationCompare op = createCompare(
                expr(Collections.singletonList("a")),
                expr("a"));
        assertTrue(op.equal(NULL_CONTEXT, expr(Collections.singletonList("a")), expr("a")));
    }

    @Test
    public void testFindMatchLeftEmpty() {
        CoreOperationCompare op = createCompare(
                expr(Collections.emptyList()),
                expr(Arrays.asList("a")));
        assertFalse(op.equal(NULL_CONTEXT, expr(Collections.emptyList()), expr(Arrays.asList("a"))));
    }

    @Test
    public void testFindMatchRightEmpty() {
        CoreOperationCompare op = createCompare(
                expr(Arrays.asList("a")),
                expr(Collections.emptyList()));
        assertFalse(op.equal(NULL_CONTEXT, expr(Arrays.asList("a")), expr(Collections.emptyList())));
    }

    @Test
    public void testEqualCollectionAndScalar() {
        CoreOperationCompare op = createCompare(
                expr(Collections.singletonList("a")),
                expr("a"));
        assertTrue(op.equal(NULL_CONTEXT,
                expr(Collections.singletonList("a")),
                expr("a")));
        assertTrue(op.equal(NULL_CONTEXT,
                expr("a"),
                expr(Collections.singletonList("a"))));
    }
}