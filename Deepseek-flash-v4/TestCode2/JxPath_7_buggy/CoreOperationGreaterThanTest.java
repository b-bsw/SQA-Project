package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Assert;

public class CoreOperationGreaterThanTest {

    private static class ConstantExpression implements Expression {
        private final Object value;

        private ConstantExpression(Object value) {
            this.value = value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    private static class ExceptionThrowingExpression implements Expression {
        public Object computeValue(EvalContext context) {
            throw new RuntimeException("intentional exception");
        }
    }

    private static class StringExpression implements Expression {
        private final String str;
        private StringExpression(String str) { this.str = str; }
        public Object computeValue(EvalContext context) {
            return str;
        }
    }

    @Test
    public void testGreaterThanTrue() {
        Expression left = new ConstantExpression(10.0);
        Expression right = new ConstantExpression(5.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Assert.assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanFalse() {
        Expression left = new ConstantExpression(5.0);
        Expression right = new ConstantExpression(10.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Assert.assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanEqual() {
        Expression left = new ConstantExpression(7.0);
        Expression right = new ConstantExpression(7.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Assert.assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanNaNLeft() {
        Expression left = new ConstantExpression(Double.NaN);
        Expression right = new ConstantExpression(1.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Assert.assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanNaNRight() {
        Expression left = new ConstantExpression(1.0);
        Expression right = new ConstantExpression(Double.NaN);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Assert.assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanExtremeValues() {
        Expression left = new ConstantExpression(Double.MAX_VALUE);
        Expression right = new ConstantExpression(Double.MIN_VALUE);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Assert.assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanNullLeft() {
        Expression left = new ConstantExpression(null);
        Expression right = new ConstantExpression(1.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        // null is converted to 0.0 by InfoSetUtil.doubleValue -> 0 > 1 is false
        Assert.assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testGreaterThanNullRight() {
        Expression left = new ConstantExpression(1.0);
        Expression right = new ConstantExpression(null);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        // null is converted to 0.0 -> 1 > 0 is true
        Assert.assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testGreaterThanInvalidString() {
        Expression left = new StringExpression("not_a_number");
        Expression right = new ConstantExpression(1.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        op.computeValue(null);
    }

    @Test(expected = RuntimeException.class)
    public void testGreaterThanExceptionInArg() {
        Expression left = new ExceptionThrowingExpression();
        Expression right = new ConstantExpression(1.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        op.computeValue(null);
    }

    @Test
    public void testGetSymbol() {
        Expression left = new ConstantExpression(1.0);
        Expression right = new ConstantExpression(2.0);
        CoreOperationGreaterThan op = new CoreOperationGreaterThan(left, right);
        Assert.assertEquals(">", op.getSymbol());
    }
}