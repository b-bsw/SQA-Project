package org.apache.commons.jxpath.ri.compiler;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CoreFunctionTest {

    private CoreFunction function;
    private EvalContext context;
    private JXPathContext jxpathContext;

    @Before
    public void setUp() {
        context = new EvalContext(null, null) {
            public boolean nextNode() {
                return false;
            }
            public NodePointer getCurrentNodePointer() {
                return null;
            }
            public int getCurrentPosition() {
                return 0;
            }
            public void reset() {}
            public JXPathContext getJXPathContext() {
                return jxpathContext;
            }
        };
        jxpathContext = JXPathContext.newContext(new Object());
    }

    @Test
    public void testGetFunctionName() {
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertEquals("last", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        assertEquals("position", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        assertEquals("count", function.getFunctionName());
        function = new CoreFunction(Compiler.FUNCTION_UNKNOWN, null);
        assertEquals("unknownFunction0()", function.getFunctionName());
    }

    @Test
    public void testGetArgumentCountNoArgs() {
        function = new CoreFunction(0, null);
        assertEquals(0, function.getArgumentCount());
    }

    @Test
    public void testGetArgumentCountWithArgs() {
        Expression[] args = new Expression[2];
        function = new CoreFunction(0, args);
        assertEquals(2, function.getArgumentCount());
    }

    @Test
    public void testComputeContextDependentLast() {
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertTrue(function.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentBooleanNoArgs() {
        function = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        assertTrue(function.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentBooleanWithArgs() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("test");
        function = new CoreFunction(Compiler.FUNCTION_BOOLEAN, args);
        assertFalse(function.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentCount() {
        function = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        assertFalse(function.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentFormatNumberTwoArgs() {
        Expression[] args = new Expression[2];
        function = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, args);
        assertTrue(function.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentFormatNumberThreeArgs() {
        Expression[] args = new Expression[3];
        function = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, args);
        assertFalse(function.computeContextDependent());
    }

    @Test
    public void testToStringWithArgs() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("hello");
        function = new CoreFunction(Compiler.FUNCTION_STRING, args);
        assertEquals("string(hello)", function.toString());
    }

    @Test
    public void testToStringNoArgs() {
        function = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals("true()", function.toString());
    }

    @Test
    public void testComputeValueLast() {
        function = new CoreFunction(Compiler.FUNCTION_LAST, null);
        Object result = function.computeValue(context);
        assertEquals(0.0, ((Double) result).doubleValue(), 0.0);
    }

    @Test
    public void testComputeValuePosition() {
        function = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        Object result = function.computeValue(context);
        assertEquals(0, ((Integer) result).intValue());
    }

    @Test
    public void testComputeValueTrue() {
        function = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(Boolean.TRUE, function.computeValue(context));
    }

    @Test
    public void testComputeValueFalse() {
        function = new CoreFunction(Compiler.FUNCTION_FALSE, null);
        assertEquals(Boolean.FALSE, function.computeValue(context));
    }

    @Test
    public void testComputeValueNull() {
        function = new CoreFunction(Compiler.FUNCTION_NULL, null);
        assertNull(function.computeValue(context));
    }

    @Test
    public void testComputeValueUnknown() {
        function = new CoreFunction(9999, null);
        assertNull(function.computeValue(context));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLastWrongArgCount() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("x");
        function = new CoreFunction(Compiler.FUNCTION_LAST, args);
        function.computeValue(context);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionPositionWrongArgCount() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("x");
        function = new CoreFunction(Compiler.FUNCTION_POSITION, args);
        function.computeValue(context);
    }

    @Test
    public void testFunctionCountWithNull() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(null);
        function = new CoreFunction(Compiler.FUNCTION_COUNT, args);
        assertEquals(0.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionCountWithString() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("abc");
        function = new CoreFunction(Compiler.FUNCTION_COUNT, args);
        assertEquals(1.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionLangNullPointer() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("en");
        function = new CoreFunction(Compiler.FUNCTION_LANG, args);
        assertEquals(Boolean.FALSE, function.computeValue(context));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionLangWrongArgCount() {
        function = new CoreFunction(Compiler.FUNCTION_LANG, null);
        function.computeValue(context);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionStringWrongArgCountExcess() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("a");
        args[1] = new Constant("b");
        function = new CoreFunction(Compiler.FUNCTION_STRING, args);
        function.computeValue(context);
    }

    @Test
    public void testFunctionStringNoArgs() {
        function = new CoreFunction(Compiler.FUNCTION_STRING, null);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionStringWithArg() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(42.0));
        function = new CoreFunction(Compiler.FUNCTION_STRING, args);
        assertEquals("42.0", function.computeValue(context));
    }

    @Test
    public void testFunctionConcatWithTwoArgs() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("Hello ");
        args[1] = new Constant("World");
        function = new CoreFunction(Compiler.FUNCTION_CONCAT, args);
        assertEquals("Hello World", function.computeValue(context));
    }

    @Test
    public void testFunctionConcatWithThreeArgs() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("a");
        args[1] = new Constant("b");
        args[2] = new Constant("c");
        function = new CoreFunction(Compiler.FUNCTION_CONCAT, args);
        assertEquals("abc", function.computeValue(context));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionConcatLessThanTwoArgs() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("x");
        function = new CoreFunction(Compiler.FUNCTION_CONCAT, args);
        function.computeValue(context);
    }

    @Test
    public void testFunctionStartsWithTrue() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("Hello");
        function = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, args);
        assertEquals(Boolean.TRUE, function.computeValue(context));
    }

    @Test
    public void testFunctionStartsWithFalse() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("World");
        function = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, args);
        assertEquals(Boolean.FALSE, function.computeValue(context));
    }

    @Test
    public void testFunctionContainsTrue() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("World");
        function = new CoreFunction(Compiler.FUNCTION_CONTAINS, args);
        assertEquals(Boolean.TRUE, function.computeValue(context));
    }

    @Test
    public void testFunctionContainsFalse() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("XYZ");
        function = new CoreFunction(Compiler.FUNCTION_CONTAINS, args);
        assertEquals(Boolean.FALSE, function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringBeforeFound() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("World");
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, args);
        assertEquals("Hello", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringBeforeNotFound() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("XYZ");
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, args);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringAfterFound() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("Hello");
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, args);
        assertEquals("World", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringAfterNotFound() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant("XYZ");
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, args);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringTwoArgsNormal() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant(new Double(3));
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        assertEquals("lloWorld", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringTwoArgsFromZero() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("Hello");
        args[1] = new Constant(new Double(0));
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        assertEquals("Hello", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringTwoArgsOutOfRange() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("Hi");
        args[1] = new Constant(new Double(10));
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringTwoArgsNaN() {
        Expression[] args = new Expression[2];
        args[0] = new Constant("Test");
        args[1] = new Constant(Double.NaN);
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringThreeArgsNormal() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("HelloWorld");
        args[1] = new Constant(new Double(3));
        args[2] = new Constant(new Double(5));
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        assertEquals("lloWo", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringThreeArgsNegativeLength() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("Hello");
        args[1] = new Constant(new Double(1));
        args[2] = new Constant(new Double(-1));
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionSubstringThreeArgsFromBeforeOne() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("AB");
        args[1] = new Constant(new Double(0.5));
        args[2] = new Constant(new Double(2));
        function = new CoreFunction(Compiler.FUNCTION_SUBSTRING, args);
        assertEquals("AB", function.computeValue(context));
    }

    @Test
    public void testFunctionStringLengthNoArgs() {
        function = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, null);
        assertEquals(0.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionStringLengthWithArg() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("Hello");
        function = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, args);
        assertEquals(5.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionNormalizeSpace() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("  Hello   World  ");
        function = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, args);
        assertEquals("Hello World", function.computeValue(context));
    }

    @Test
    public void testFunctionNormalizeSpaceEmpty() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("");
        function = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, args);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionNormalizeSpaceOnlySpaces() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("   ");
        function = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, args);
        assertEquals("", function.computeValue(context));
    }

    @Test
    public void testFunctionNormalizeSpaceTabsNewlines() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("\t\n  A  \r\n");
        function = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, args);
        assertEquals("A", function.computeValue(context));
    }

    @Test
    public void testFunctionTranslateAllMapped() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("abc");
        args[1] = new Constant("abc");
        args[2] = new Constant("XYZ");
        function = new CoreFunction(Compiler.FUNCTION_TRANSLATE, args);
        assertEquals("XYZ", function.computeValue(context));
    }

    @Test
    public void testFunctionTranslateSomeMapped() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("hello");
        args[1] = new Constant("aeiou");
        args[2] = new Constant("AEIOU");
        function = new CoreFunction(Compiler.FUNCTION_TRANSLATE, args);
        assertEquals("hEllO", function.computeValue(context));
    }

    @Test
    public void testFunctionTranslateNoMatch() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("abc");
        args[1] = new Constant("x");
        args[2] = new Constant("Y");
        function = new CoreFunction(Compiler.FUNCTION_TRANSLATE, args);
        assertEquals("abc", function.computeValue(context));
    }

    @Test
    public void testFunctionTranslateRemoveChars() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("abcdef");
        args[1] = new Constant("bdf");
        args[2] = new Constant("");
        function = new CoreFunction(Compiler.FUNCTION_TRANSLATE, args);
        assertEquals("ace", function.computeValue(context));
    }

    @Test
    public void testFunctionBooleanTrue() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("non-empty");
        function = new CoreFunction(Compiler.FUNCTION_BOOLEAN, args);
        assertEquals(Boolean.TRUE, function.computeValue(context));
    }

    @Test
    public void testFunctionBooleanFalse() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("");
        function = new CoreFunction(Compiler.FUNCTION_BOOLEAN, args);
        assertEquals(Boolean.FALSE, function.computeValue(context));
    }

    @Test
    public void testFunctionNotTrue() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("");
        function = new CoreFunction(Compiler.FUNCTION_NOT, args);
        assertEquals(Boolean.TRUE, function.computeValue(context));
    }

    @Test
    public void testFunctionNotFalse() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("x");
        function = new CoreFunction(Compiler.FUNCTION_NOT, args);
        assertEquals(Boolean.FALSE, function.computeValue(context));
    }

    @Test
    public void testFunctionNumberNoArgs() {
        function = new CoreFunction(Compiler.FUNCTION_NUMBER, null);
        assertNotNull(function.computeValue(context));
    }

    @Test
    public void testFunctionNumberWithArg() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("42.5");
        function = new CoreFunction(Compiler.FUNCTION_NUMBER, args);
        assertEquals(42.5, ((Double) function.computeValue(context)).doubleValue(), 0.01);
    }

    @Test
    public void testFunctionSumWithNull() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(null);
        function = new CoreFunction(Compiler.FUNCTION_SUM, args);
        assertEquals(0.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test(expected = JXPathException.class)
    public void testFunctionSumWrongType() {
        Expression[] args = new Expression[1];
        args[0] = new Constant("string");
        function = new CoreFunction(Compiler.FUNCTION_SUM, args);
        function.computeValue(context);
    }

    @Test
    public void testFunctionFloor() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(3.7));
        function = new CoreFunction(Compiler.FUNCTION_FLOOR, args);
        assertEquals(3.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionFloorNegative() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(-3.7));
        function = new CoreFunction(Compiler.FUNCTION_FLOOR, args);
        assertEquals(-4.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionCeiling() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(3.2));
        function = new CoreFunction(Compiler.FUNCTION_CEILING, args);
        assertEquals(4.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionCeilingNegative() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(-3.2));
        function = new CoreFunction(Compiler.FUNCTION_CEILING, args);
        assertEquals(-3.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionRound() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(3.5));
        function = new CoreFunction(Compiler.FUNCTION_ROUND, args);
        assertEquals(4.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test
    public void testFunctionRoundDown() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(3.4));
        function = new CoreFunction(Compiler.FUNCTION_ROUND, args);
        assertEquals(3.0, ((Double) function.computeValue(context)).doubleValue(), 0.0);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFormatNumberWrongArgCount() {
        Expression[] args = new Expression[1];
        args[0] = new Constant(new Double(1));
        function = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, args);
        function.computeValue(context);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testFunctionFormatNotTwoOrThreeArgs() {
        Expression[] args = new Expression[4];
        function = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, args);
        function.computeValue(context);
    }

    @Test
    public void testGetArg1() {
        Expression[] args = new Expression[3];
        args[0] = new Constant("a");
        args[1] = new Constant("b");
        args[2] = new Constant("c");
        function = new CoreFunction(0, args);
        assertNotNull(function.getArg1());
        assertNotNull(function.getArg2());
        assertNotNull(function.getArg3());
    }

    @Test
    public void testGetArg1Null() {
        function = new CoreFunction(0, null);
        assertNull(function.getArg1());
        assertNull(function.getArg2());
        assertNull(function.getArg3());
    }

    static class Constant extends Expression {
        private Object value;
        Constant(Object value) { this.value = value; }
        public String toString() { return String.valueOf(value); }
        public Object compute(EvalContext ctx) { return value; }
        public Object computeValue(EvalContext ctx) { return value; }
        public boolean isContextDependent() { return false; }
        public boolean computeContextDependent() { return false; }
    }
}