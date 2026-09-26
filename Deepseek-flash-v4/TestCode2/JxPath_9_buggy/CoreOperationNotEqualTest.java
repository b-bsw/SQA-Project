package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.JXPathContext;

public class CoreOperationNotEqualTest {

    private EvalContext context;
    private JXPathContext jxpathContext;

    @Before
    public void setUp() {
        jxpathContext = JXPathContext.newContext(new Object());
        context = new org.apache.commons.jxpath.ri.EvalContext(jxpathContext, null) {
            @Override
            public Object getValue() {
                return null;
            }
        };
    }

    @After
    public void tearDown() {
        context = null;
        jxpathContext = null;
    }

    @Test
    public void testNotEqual_SimpleValues_Equal() {
        Expression left = new Constant("hello");
        Expression right = new Constant("hello");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_SimpleValues_NotEqual() {
        Expression left = new Constant("hello");
        Expression right = new Constant("world");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_NumericValues_Equal() {
        Expression left = new Constant(new Double(5.0));
        Expression right = new Constant(new Double(5.0));
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_NumericValues_NotEqual() {
        Expression left = new Constant(new Double(5.0));
        Expression right = new Constant(new Double(10.0));
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_NullLeft() {
        Expression left = new Constant(null);
        Expression right = new Constant("value");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_NullRight() {
        Expression left = new Constant("value");
        Expression right = new Constant(null);
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_BothNull() {
        Expression left = new Constant(null);
        Expression right = new Constant(null);
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_EmptyStringVsNull() {
        Expression left = new Constant("");
        Expression right = new Constant(null);
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_ZeroVsNull() {
        Expression left = new Constant(new Integer(0));
        Expression right = new Constant(null);
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_BooleanTrueVsStringTrue() {
        Expression left = new Constant(Boolean.TRUE);
        Expression right = new Constant("true");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_BooleanFalseVsStringFalse() {
        Expression left = new Constant(Boolean.FALSE);
        Expression right = new Constant("false");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_MixedTypes_EqualByConversion() {
        Expression left = new Constant("5");
        Expression right = new Constant(new Double(5.0));
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_MixedTypes_NotEqualByConversion() {
        Expression left = new Constant("5");
        Expression right = new Constant(new Double(6.0));
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_GetSymbol() {
        Expression left = new Constant("a");
        Expression right = new Constant("b");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        assertEquals("!=", op.getSymbol());
    }

    @Test
    public void testNotEqual_ArrayIterator_Equal() {
        Expression left = new Constant(new String[]{"a", "b"});
        Expression right = new Constant("a");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_ArrayIterator_NotEqual() {
        Expression left = new Constant(new String[]{"a", "b"});
        Expression right = new Constant("c");
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testNotEqual_ArrayIterator_BothArray_Equal() {
        Expression left = new Constant(new String[]{"a", "b"});
        Expression right = new Constant(new String[]{"a", "b"});
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testNotEqual_ArrayIterator_BothArray_NotEqual() {
        Expression left = new Constant(new String[]{"a", "b"});
        Expression right = new Constant(new String[]{"a", "c"});
        CoreOperationNotEqual op = new CoreOperationNotEqual(left, right);
        Object result = op.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    private static class Constant extends Expression {
        private final Object value;

        public Constant(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + value;
        }

        @Override
        public String asString() {
            return value == null ? "" : value.toString();
        }

        @Override
        public Object compute(EvalContext context) {
            return value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }

        @Override
        public boolean isContextDependent() {
            return false;
        }
    }
}