package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.Before;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private EvalContext dummyContext;
    private Expression[] args;

    @Before
    public void setUp() {
        dummyContext = new EvalContext(null, null) {
            @Override
            public Object getSingleNodePointer() {
                return null;
            }

            @Override
            public boolean nextNode() {
                return false;
            }

            @Override
            public int getCurrentPosition() {
                return 0;
            }

            @Override
            public boolean setPosition(int position) {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getJXPathContext() {
                return null;
            }
        };
        args = new Expression[2];
    }

    private CoreOperationRelationalExpression createInstance(Expression left, Expression right) {
        args[0] = left;
        args[1] = right;
        return new CoreOperationRelationalExpression(args) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
    }

    // Normal case: both values are numbers, equal
    @Test
    public void testComputeEqualNumbers() {
        Expression left = new Constant("5");
        Expression right = new Constant("5");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertTrue((Boolean) op.computeValue(dummyContext));
    }

    // Normal case: both values are numbers, not equal
    @Test
    public void testComputeNotEqualNumbers() {
        Expression left = new Constant("5");
        Expression right = new Constant("10");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertFalse((Boolean) op.computeValue(dummyContext));
    }

    // Boundary value: NaN on left
    @Test
    public void testComputeNaNLeft() {
        Expression left = new Constant("NaN");
        Expression right = new Constant("5");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertFalse((Boolean) op.computeValue(dummyContext));
    }

    // Boundary value: NaN on right
    @Test
    public void testComputeNaNRight() {
        Expression left = new Constant("5");
        Expression right = new Constant("NaN");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertFalse((Boolean) op.computeValue(dummyContext));
    }

    // Null/empty input: null left
    @Test
    public void testComputeNullLeft() {
        Expression left = new Constant(null);
        Expression right = new Constant("5");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertFalse((Boolean) op.computeValue(dummyContext));
    }

    // Null/empty input: null right
    @Test
    public void testComputeNullRight() {
        Expression left = new Constant("5");
        Expression right = new Constant(null);
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertFalse((Boolean) op.computeValue(dummyContext));
    }

    // Iterator on left only: containsMatch path
    @Test
    public void testComputeIteratorLeft() {
        final List<Object> leftList = new ArrayList<>();
        leftList.add("5");
        leftList.add("10");
        Expression left = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return leftList.iterator();
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "leftIterator";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        Expression right = new Constant("5");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertTrue((Boolean) op.computeValue(dummyContext));
    }

    // Iterator on right only: containsMatch path (symmetry)
    @Test
    public void testComputeIteratorRight() {
        final List<Object> rightList = new ArrayList<>();
        rightList.add("5");
        rightList.add("10");
        Expression left = new Constant("5");
        Expression right = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return rightList.iterator();
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "rightIterator";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertTrue((Boolean) op.computeValue(dummyContext));
    }

    // Both iterators: findMatch path
    @Test
    public void testComputeBothIteratorsMatch() {
        final List<Object> leftList = new ArrayList<>();
        leftList.add("1");
        leftList.add("2");
        final List<Object> rightList = new ArrayList<>();
        rightList.add("2");
        rightList.add("3");
        Expression left = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return leftList.iterator();
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "leftIterator";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return rightList.iterator();
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "rightIterator";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertTrue((Boolean) op.computeValue(dummyContext));
    }

    // Both iterators no match: findMatch path
    @Test
    public void testComputeBothIteratorsNoMatch() {
        final List<Object> leftList = new ArrayList<>();
        leftList.add("1");
        leftList.add("2");
        final List<Object> rightList = new ArrayList<>();
        rightList.add("3");
        rightList.add("4");
        Expression left = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return leftList.iterator();
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "leftIterator";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        Expression right = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return rightList.iterator();
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "rightIterator";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertFalse((Boolean) op.computeValue(dummyContext));
    }

    // SelfContext reduction
    @Test
    public void testComputeWithSelfContext() {
        final SelfContext selfContext = new SelfContext(null, null) {
            @Override
            public Object getSingleNodePointer() {
                return "5";
            }
        };
        Expression left = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return selfContext;
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "selfContext";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        Expression right = new Constant("5");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertTrue((Boolean) op.computeValue(dummyContext));
    }

    // Collection reduction to iterator
    @Test
    public void testComputeWithCollection() {
        final Collection<Object> collection = new ArrayList<>();
        collection.add("5");
        Expression left = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return collection;
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "collection";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        Expression right = new Constant("5");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertTrue((Boolean) op.computeValue(dummyContext));
    }

    // InitialContext reset
    @Test
    public void testComputeWithInitialContext() {
        final InitialContext initialContext = new InitialContext(null) {
            boolean resetCalled = false;
            @Override
            public void reset() {
                resetCalled = true;
            }

            @Override
            public Object getSingleNodePointer() {
                return "5";
            }
        };
        Expression left = new Expression() {
            @Override
            public Object computeValue(EvalContext context) {
                return initialContext;
            }

            @Override
            public boolean isContextDependent() {
                return false;
            }

            @Override
            public boolean computeContextDependent() {
                return false;
            }

            @Override
            public String toString() {
                return "initialContext";
            }

            @Override
            public Object getPointer(EvalContext context) {
                return null;
            }

            @Override
            public Object getNodePointer(EvalContext context) {
                return null;
            }

            @Override
            public boolean isSimpleElementPath() {
                return false;
            }

            @Override
            public boolean isPath() {
                return false;
            }

            @Override
            public Expression getExpression() {
                return this;
            }

            @Override
            public void setExpression(Expression expression) {
            }

            @Override
            public boolean isCollection() {
                return false;
            }

            @Override
            public boolean isStatic() {
                return false;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public boolean isSubclassOf(Class clazz) {
                return false;
            }

            @Override
            public boolean isContainer() {
                return false;
            }

            @Override
            public Object getContainer() {
                return null;
            }
        };
        Expression right = new Constant("5");
        CoreOperationRelationalExpression op = createInstance(left, right);
        assertTrue((Boolean) op.computeValue(dummyContext));
    }
}