package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

public class CoreOperationGreaterThanOrEqualTest {

    @Test
    public void testGetSymbol() {
        assertEquals(">=", new CoreOperationGreaterThanOrEqual(constant(0), constant(0)).getSymbol());
    }

    @Test
    public void testComputeValueTrue() {
        assertSame(Boolean.TRUE,
                new CoreOperationGreaterThanOrEqual(constant(5), constant(3)).computeValue(null));
    }

    @Test
    public void testComputeValueFalse() {
        assertSame(Boolean.FALSE,
                new CoreOperationGreaterThanOrEqual(constant(3), constant(5)).computeValue(null));
    }

    @Test
    public void testComputeValueEqual() {
        assertSame(Boolean.TRUE,
                new CoreOperationGreaterThanOrEqual(constant(4), constant(4)).computeValue(null));
    }

    @Test
    public void testComputeValueNegative() {
        assertSame(Boolean.TRUE,
                new CoreOperationGreaterThanOrEqual(constant(-1), constant(-2)).computeValue(null));
        assertSame(Boolean.FALSE,
                new CoreOperationGreaterThanOrEqual(constant(-2), constant(-1)).computeValue(null));
    }

    @Test
    public void testComputeValueNaN() {
        assertSame(Boolean.FALSE,
                new CoreOperationGreaterThanOrEqual(constant(Double.NaN), constant(5)).computeValue(null));
        assertSame(Boolean.FALSE,
                new CoreOperationGreaterThanOrEqual(constant(5), constant(Double.NaN)).computeValue(null));
        assertSame(Boolean.FALSE,
                new CoreOperationGreaterThanOrEqual(constant(Double.NaN), constant(Double.NaN))
                        .computeValue(null));
    }

    @Test
    public void testComputeValueNull() {
        // doubleValue(null) generally returns 0.0
        assertSame(Boolean.FALSE,
                new CoreOperationGreaterThanOrEqual(constant(null), constant(5)).computeValue(null));
        assertSame(Boolean.TRUE,
                new CoreOperationGreaterThanOrEqual(constant(5), constant(null)).computeValue(null));
        assertSame(Boolean.TRUE,
                new CoreOperationGreaterThanOrEqual(constant(null), constant(null)).computeValue(null));
    }

    private static Expression constant(final Object value) {
        return new StubExpression(value);
    }

    private static class StubExpression extends Expression {

        private final Object value;

        StubExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return value;
        }

        // The following methods are provided to satisfy any abstract methods
        // from Expression (if they exist). They are never called in these tests.
        public Expression getPointer(EvalContext context) { return null; }

        public Object getNodeSet(EvalContext context) { return null; }

        public EvalContext getEvalContext(EvalContext context) { return null; }

        public boolean isContextDependent() { return false; }

        public boolean isConstant() { return true; }

        public String getType() { return "stub"; }

        public void reset() { }

        public boolean isNotUsedAsMember() { return true; }
    }
}