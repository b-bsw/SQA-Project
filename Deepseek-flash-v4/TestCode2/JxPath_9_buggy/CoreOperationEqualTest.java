package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.junit.Before;
import org.junit.Test;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class CoreOperationEqualTest {

    private EvalContext context;
    private Expression constantA;
    private Expression constantB;

    @Before
    public void setUp() {
        context = new org.apache.commons.jxpath.ri.EvalContext(null, null) {
            public Object getValue() { return null; }
            public int getPosition() { return 0; }
            public boolean nextSet() { return false; }
            public boolean nextNode() { return false; }
            public boolean hasNext() { return false; }
            public Object next() { return null; }
            public void remove() {}
        };
        constantA = new Constant("hello");
        constantB = new Constant("hello");
    }

    @Test
    public void testEqualStrings() {
        CoreOperationEqual op = new CoreOperationEqual(constantA, constantB);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testNotEqualStrings() {
        Expression constantC = new Constant("world");
        CoreOperationEqual op = new CoreOperationEqual(constantA, constantC);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testEqualNumbers() {
        Expression num1 = new Constant(5);
        Expression num2 = new Constant(5);
        CoreOperationEqual op = new CoreOperationEqual(num1, num2);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testNotEqualNumbers() {
        Expression num1 = new Constant(5);
        Expression num2 = new Constant(10);
        CoreOperationEqual op = new CoreOperationEqual(num1, num2);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testNullLeft() {
        Expression nullExpr = new Constant(null);
        CoreOperationEqual op = new CoreOperationEqual(nullExpr, constantA);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testNullRight() {
        Expression nullExpr = new Constant(null);
        CoreOperationEqual op = new CoreOperationEqual(constantA, nullExpr);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testBothNull() {
        Expression null1 = new Constant(null);
        Expression null2 = new Constant(null);
        CoreOperationEqual op = new CoreOperationEqual(null1, null2);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testDifferentTypesNumberAndString() {
        Expression num = new Constant(42);
        Expression str = new Constant("42");
        CoreOperationEqual op = new CoreOperationEqual(num, str);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testBooleanTrueVsString() {
        Expression boolExpr = new Constant(Boolean.TRUE);
        Expression strExpr = new Constant("true");
        CoreOperationEqual op = new CoreOperationEqual(boolExpr, strExpr);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testSymbol() {
        CoreOperationEqual op = new CoreOperationEqual(constantA, constantB);
        assertEquals("=", op.getSymbol());
    }

    @Test
    public void testComputeValueWithIterator() {
        Expression litExpr = new Expression() {
            public String asString() { return null; }
            public Object compute(EvalContext ctx) { return null; }
            public Object computeValue(EvalContext ctx) {
                ArrayList list = new ArrayList();
                list.add("a");
                list.add("b");
                return list.iterator();
            }
            public boolean isContextDependent() { return false; }
        };
        Expression ritExpr = new Expression() {
            public String asString() { return null; }
            public Object compute(EvalContext ctx) { return null; }
            public Object computeValue(EvalContext ctx) {
                ArrayList list = new ArrayList();
                list.add("b");
                list.add("c");
                return list.iterator();
            }
            public boolean isContextDependent() { return false; }
        };
        CoreOperationEqual op = new CoreOperationEqual(litExpr, ritExpr);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testComputeValueWithIteratorNoMatch() {
        Expression litExpr = new Expression() {
            public String asString() { return null; }
            public Object compute(EvalContext ctx) { return null; }
            public Object computeValue(EvalContext ctx) {
                ArrayList list = new ArrayList();
                list.add("x");
                list.add("y");
                return list.iterator();
            }
            public boolean isContextDependent() { return false; }
        };
        Expression ritExpr = new Expression() {
            public String asString() { return null; }
            public Object compute(EvalContext ctx) { return null; }
            public Object computeValue(EvalContext ctx) {
                ArrayList list = new ArrayList();
                list.add("z");
                return list.iterator();
            }
            public boolean isContextDependent() { return false; }
        };
        CoreOperationEqual op = new CoreOperationEqual(litExpr, ritExpr);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    static class Constant implements Expression {
        private Object value;
        Constant(Object value) { this.value = value; }
        public String asString() { return value == null ? null : value.toString(); }
        public Object compute(EvalContext ctx) { return value; }
        public Object computeValue(EvalContext ctx) { return value; }
        public boolean isContextDependent() { return false; }
    }
}