package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class CoreOperationLessThanOrEqualTest {
    private CoreOperationLessThanOrEqual operation;
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testNormalCaseLessThan() {
        operation = new CoreOperationLessThanOrEqual(new Constant("1"), new Constant("2"));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testNormalCaseEqual() {
        operation = new CoreOperationLessThanOrEqual(new Constant("5"), new Constant("5"));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testNormalCaseGreater() {
        operation = new CoreOperationLessThanOrEqual(new Constant("10"), new Constant("3"));
        assertEquals(Boolean.FALSE, operation.computeValue(null));
    }
    
    @Test
    public void testNullLeftArgument() {
        operation = new CoreOperationLessThanOrEqual(new Constant(null), new Constant("1"));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testNullRightArgument() {
        operation = new CoreOperationLessThanOrEqual(new Constant("1"), new Constant(null));
        assertEquals(Boolean.FALSE, operation.computeValue(null));
    }
    
    @Test
    public void testBothNull() {
        operation = new CoreOperationLessThanOrEqual(new Constant(null), new Constant(null));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testEmptyStringLeft() {
        operation = new CoreOperationLessThanOrEqual(new Constant(""), new Constant("5"));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testEmptyStringRight() {
        operation = new CoreOperationLessThanOrEqual(new Constant("5"), new Constant(""));
        assertEquals(Boolean.FALSE, operation.computeValue(null));
    }
    
    @Test
    public void testNonNumericStringLeft() {
        operation = new CoreOperationLessThanOrEqual(new Constant("abc"), new Constant("10"));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testNonNumericStringRight() {
        operation = new CoreOperationLessThanOrEqual(new Constant("10"), new Constant("xyz"));
        assertEquals(Boolean.FALSE, operation.computeValue(null));
    }
    
    @Test
    public void testNegativeValues() {
        operation = new CoreOperationLessThanOrEqual(new Constant("-5"), new Constant("-3"));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testZeroAndNegative() {
        operation = new CoreOperationLessThanOrEqual(new Constant("0"), new Constant("-1"));
        assertEquals(Boolean.FALSE, operation.computeValue(null));
    }
    
    @Test
    public void testDecimalValues() {
        operation = new CoreOperationLessThanOrEqual(new Constant("3.14"), new Constant("3.14"));
        assertEquals(Boolean.TRUE, operation.computeValue(null));
    }
    
    @Test
    public void testSymbol() {
        operation = new CoreOperationLessThanOrEqual(new Constant("1"), new Constant("2"));
        assertEquals("<=", operation.getSymbol());
    }
}