package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class CoreOperationRelationalExpressionTest {
    private CoreOperationRelationalExpression expression;
    private Expression[] args;

    @Before
    public void setUp() {
        args = new Expression[2];
    }

    @After
    public void tearDown() {
        expression = null;
        args = null;
    }

    @Test
    public void testGetPrecedence() {
        args[0] = new Constant("a");
        args[1] = new Constant("b");
        expression = new CoreOperationRelationalExpression(args) {
            public Object computeValue(org.apache.commons.jxpath.ri.EvalContext context) {
                return null;
            }
            public String getSymbol() {
                return "?";
            }
        };
        Assert.assertEquals(3, expression.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        args[0] = new Constant("a");
        args[1] = new Constant("b");
        expression = new CoreOperationRelationalExpression(args) {
            public Object computeValue(org.apache.commons.jxpath.ri.EvalContext context) {
                return null;
            }
            public String getSymbol() {
                return "?";
            }
        };
        Assert.assertFalse(expression.isSymmetric());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullArgs() {
        expression = new CoreOperationRelationalExpression(null) {
            public Object computeValue(org.apache.commons.jxpath.ri.EvalContext context) {
                return null;
            }
            public String getSymbol() {
                return "?";
            }
        };
        Assert.assertNotNull(expression);
    }

    @Test
    public void testConstructorEmptyArgs() {
        args = new Expression[0];
        expression = new CoreOperationRelationalExpression(args) {
            public Object computeValue(org.apache.commons.jxpath.ri.EvalContext context) {
                return null;
            }
            public String getSymbol() {
                return "?";
            }
        };
        Assert.assertNotNull(expression);
    }

    @Test
    public void testConstructorTwoArgs() {
        args[0] = new Constant("x");
        args[1] = new Constant("y");
        expression = new CoreOperationRelationalExpression(args) {
            public Object computeValue(org.apache.commons.jxpath.ri.EvalContext context) {
                return null;
            }
            public String getSymbol() {
                return "?";
            }
        };
        Assert.assertNotNull(expression);
        Assert.assertEquals(2, expression.getOperands().length);
    }
}