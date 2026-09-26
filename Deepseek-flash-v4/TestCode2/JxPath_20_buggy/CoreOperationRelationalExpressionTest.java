package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;

public class CoreOperationRelationalExpressionTest {

    private CoreOperationRelationalExpression op;

    @Before
    public void setUp() {
        op = new CoreOperationRelationalExpression(new Expression[]{}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0 || compare == 1;
            }
        };
    }

    @Test
    public void testComputeValueBothNull() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return null;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return null;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.FALSE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueBothNaN() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return Double.NaN;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return Double.NaN;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.FALSE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueEqualNumbers() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 5.0;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 5.0;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.TRUE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueLessThan() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 3.0;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 7.0;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == -1;
            }
        };
        assertEquals(Boolean.TRUE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueGreaterThan() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 7.0;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 3.0;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 1;
            }
        };
        assertEquals(Boolean.TRUE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueIteratorLeft() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return new Iterator() {
                    private int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index < 2;
                    }
                    @Override
                    public Object next() {
                        if (index == 0) { index++; return 5.0; }
                        if (index == 1) { index++; return 10.0; }
                        return null;
                    }
                    @Override
                    public void remove() {
                    }
                };
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 10.0;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.TRUE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueIteratorRight() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 10.0;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return new Iterator() {
                    private int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index < 2;
                    }
                    @Override
                    public Object next() {
                        if (index == 0) { index++; return 5.0; }
                        if (index == 1) { index++; return 10.0; }
                        return null;
                    }
                    @Override
                    public void remove() {
                    }
                };
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.TRUE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueBothIterators() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return new Iterator() {
                    private int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index < 2;
                    }
                    @Override
                    public Object next() {
                        if (index == 0) { index++; return 3.0; }
                        if (index == 1) { index++; return 6.0; }
                        return null;
                    }
                    @Override
                    public void remove() {
                    }
                };
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return new Iterator() {
                    private int index = 0;
                    @Override
                    public boolean hasNext() {
                        return index < 2;
                    }
                    @Override
                    public Object next() {
                        if (index == 0) { index++; return 6.0; }
                        if (index == 1) { index++; return 9.0; }
                        return null;
                    }
                    @Override
                    public void remove() {
                    }
                };
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.TRUE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueSelfContext() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                SelfContext sc = new SelfContext(null, null);
                return sc;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 5.0;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.FALSE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueCollection() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return new ArrayList(Arrays.asList(3.0, 6.0));
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 6.0;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.TRUE, op2.computeValue(null));
    }

    @Test
    public void testComputeValueInitialContext() {
        Expression left = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                InitialContext ic = new InitialContext(null);
                return ic;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object compute(EvalContext context) {
                return 5.0;
            }
        };
        CoreOperationRelationalExpression op2 = new CoreOperationRelationalExpression(new Expression[]{left, right}) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertEquals(Boolean.FALSE, op2.computeValue(null));
    }

    @Test
    public void testGetPrecedence() {
        assertEquals(CoreOperation.RELATIONAL_EXPR_PRECEDENCE, op.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        assertFalse(op.isSymmetric());
    }
}