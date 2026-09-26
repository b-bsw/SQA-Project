package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class StubExpression extends Expression {
        private Object value;

        public StubExpression(Object value) {
            super();
            this.value = value;
        }

        public Object computeValue(org.apache.commons.jxpath.ri.EvalContext context) {
            return value;
        }

        public int getType() {
            return 0;
        }

        public String toString() {
            return "StubExpression";
        }
    }

    private static class CompareTestOperation extends CoreOperationRelationalExpression {
        public CompareTestOperation(Expression[] args) {
            super(args);
        }

        protected boolean evaluateCompare(int compare) {
            return compare == 0;
        }
    }

    @Test
    public void testDoubleEqual() {
        Expression[] args = new Expression[]{
            new StubExpression(5.0),
            new StubExpression(5.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test
    public void testDoubleLess() {
        Expression[] args = new Expression[]{
            new StubExpression(3.0),
            new StubExpression(5.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertFalse((Boolean) op.computeValue(null));
    }

    @Test
    public void testDoubleGreater() {
        Expression[] args = new Expression[]{
            new StubExpression(7.0),
            new StubExpression(5.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertFalse((Boolean) op.computeValue(null));
    }

    @Test
    public void testBothIteratorsMatch() {
        Collection<Double> left = new HashSet<Double>();
        left.add(5.0);
        Collection<Double> right = new HashSet<Double>();
        right.add(5.0);
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(right)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test
    public void testBothIteratorsNoMatch() {
        Collection<Double> left = new HashSet<Double>();
        left.add(3.0);
        Collection<Double> right = new HashSet<Double>();
        right.add(5.0);
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(right)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertFalse((Boolean) op.computeValue(null));
    }

    @Test
    public void testIteratorAndScalarMatch() {
        Collection<Double> left = new HashSet<Double>();
        left.add(5.0);
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(5.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test
    public void testIteratorAndScalarNoMatch() {
        Collection<Double> left = new HashSet<Double>();
        left.add(3.0);
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(5.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertFalse((Boolean) op.computeValue(null));
    }

    @Test
    public void testEmptyLeftIterator() {
        Collection<Double> left = new HashSet<Double>();
        Collection<Double> right = new HashSet<Double>();
        right.add(5.0);
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(right)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertFalse((Boolean) op.computeValue(null));
    }

    @Test
    public void testEmptyRightIterator() {
        Collection<Double> left = new HashSet<Double>();
        left.add(5.0);
        Collection<Double> right = new HashSet<Double>();
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(right)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertFalse((Boolean) op.computeValue(null));
    }

    @Test
    public void testMultipleLeftOneRightThatExists() {
        Collection<Double> left = new HashSet<Double>();
        left.add(1.0);
        left.add(2.0);
        left.add(3.0);
        Collection<Double> right = new HashSet<Double>();
        right.add(2.0);
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(right)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test
    public void testMultipleLeftOneRightNotExists() {
        Collection<Double> left = new HashSet<Double>();
        left.add(1.0);
        left.add(2.0);
        left.add(3.0);
        Collection<Double> right = new HashSet<Double>();
        right.add(4.0);
        Expression[] args = new Expression[]{
            new StubExpression(left),
            new StubExpression(right)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertFalse((Boolean) op.computeValue(null));
    }

    @Test
    public void testIntegerEqualityWithDouble() {
        Expression[] args = new Expression[]{
            new StubExpression(1),
            new StubExpression(1.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test
    public void testStringConversionToDouble() {
        Expression[] args = new Expression[]{
            new StubExpression("5"),
            new StubExpression(5.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test
    public void testBooleanTrueAsOne() {
        Expression[] args = new Expression[]{
            new StubExpression(true),
            new StubExpression(1.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test
    public void testBooleanFalseAsZero() {
        Expression[] args = new Expression[]{
            new StubExpression(false),
            new StubExpression(0.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        assertTrue((Boolean) op.computeValue(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testNonNumericStringThrowsException() {
        Expression[] args = new Expression[]{
            new StubExpression("abc"),
            new StubExpression(5.0)
        };
        CompareTestOperation op = new CompareTestOperation(args);
        op.computeValue(null);
    }
}