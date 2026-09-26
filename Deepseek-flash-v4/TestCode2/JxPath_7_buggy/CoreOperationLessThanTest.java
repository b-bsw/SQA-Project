package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;

public class CoreOperationLessThanTest {
    private EvalContext context;
    
    @Before
    public void setUp() {
        context = new org.apache.commons.jxpath.ri.EvalContext(null, null) {
            @Override
            public Object getValue() {
                return null;
            }
        };
    }

    @Test
    public void testLessThanWithIntegersTrue() {
        Constant arg1 = new Constant(5);
        Constant arg2 = new Constant(10);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testLessThanWithIntegersFalse() {
        Constant arg1 = new Constant(10);
        Constant arg2 = new Constant(5);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testLessThanWithEqualValues() {
        Constant arg1 = new Constant(7);
        Constant arg2 = new Constant(7);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testLessThanWithNegativeValues() {
        Constant arg1 = new Constant(-3);
        Constant arg2 = new Constant(0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testLessThanWithBothNegative() {
        Constant arg1 = new Constant(-10);
        Constant arg2 = new Constant(-5);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testLessThanWithDoubles() {
        Constant arg1 = new Constant(3.14);
        Constant arg2 = new Constant(2.71);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }

    @Test
    public void testLessThanWithStringNumbers() {
        Constant arg1 = new Constant("20");
        Constant arg2 = new Constant("100");
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test(expected = org.apache.commons.jxpath.JXPathException.class)
    public void testLessThanWithNullArg1() {
        Constant arg1 = new Constant(null);
        Constant arg2 = new Constant(5);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        op.computeValue(context);
    }

    @Test(expected = org.apache.commons.jxpath.JXPathException.class)
    public void testLessThanWithNullArg2() {
        Constant arg1 = new Constant(5);
        Constant arg2 = new Constant(null);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        op.computeValue(context);
    }

    @Test
    public void testGetSymbol() {
        Constant arg1 = new Constant(1);
        Constant arg2 = new Constant(2);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals("<", op.getSymbol());
    }

    @Test
    public void testLessThanWithBooleanTrue() {
        Constant arg1 = new Constant(true);
        Constant arg2 = new Constant(2);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.TRUE, op.computeValue(context));
    }

    @Test
    public void testLessThanWithBooleanFalse() {
        Constant arg1 = new Constant(false);
        Constant arg2 = new Constant(0);
        CoreOperationLessThan op = new CoreOperationLessThan(arg1, arg2);
        assertEquals(Boolean.FALSE, op.computeValue(context));
    }
}