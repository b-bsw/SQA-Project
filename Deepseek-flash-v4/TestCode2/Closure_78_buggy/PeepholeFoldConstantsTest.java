package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.jscomp.CompilerOptions;

public class PeepholeFoldConstantsTest {

    private Compiler compiler;
    private PeepholeFoldConstants peephole;
    
    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setFoldConstants(true);
        compiler.initOptions(options);
        peephole = new PeepholeFoldConstants();
    }
    
    private Node parseAndFold(String code) {
        Node ast = compiler.parseSyntheticCode("test", code);
        if (ast == null) {
            fail("Parsing failed for: " + code);
        }
        Node scriptBlock = ast.getFirstChild();
        return peephole.optimizeSubtree(scriptBlock);
    }
    
    @Test
    public void testFoldTypeofString() {
        Node result = parseAndFold("typeof 'hello'");
        assertNotNull(result);
        assertTrue(result.isString());
        assertEquals("string", result.getString());
    }
    
    @Test
    public void testFoldTypeofNumber() {
        Node result = parseAndFold("typeof 42");
        assertNotNull(result);
        assertEquals("number", result.getString());
    }
    
    @Test
    public void testFoldTypeofBoolean() {
        Node result = parseAndFold("typeof true");
        assertNotNull(result);
        assertEquals("boolean", result.getString());
    }
    
    @Test
    public void testFoldTypeofNull() {
        Node result = parseAndFold("typeof null");
        assertNotNull(result);
        assertEquals("object", result.getString());
    }
    
    @Test
    public void testFoldTypeofUndefinedName() {
        Node result = parseAndFold("typeof undefined");
        assertNotNull(result);
        assertEquals("undefined", result.getString());
    }
    
    @Test
    public void testFoldTypeofNonLiteral() {
        Node result = parseAndFold("typeof x");
        assertNotNull(result);
        assertEquals(Token.TYPEOF, result.getType());
    }
    
    @Test
    public void testFoldNotTrue() {
        Node result = parseAndFold("!true");
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldNotFalse() {
        Node result = parseAndFold("!false");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldNotNumber() {
        Node result = parseAndFold("!0");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldNotNonLiteral() {
        Node result = parseAndFold("!x");
        assertNotNull(result);
        assertEquals(Token.NOT, result.getType());
    }
    
    @Test
    public void testFoldPosNumber() {
        Node result = parseAndFold("+5");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldPosNonNumeric() {
        Node result = parseAndFold("+'hello'");
        assertNotNull(result);
        assertEquals(Token.POS, result.getType());
    }
    
    @Test
    public void testFoldNegNumber() {
        Node result = parseAndFold("-(5)");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldNegNaN() {
        Node result = parseAndFold("-(NaN)");
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("NaN", result.getString());
    }
    
    @Test
    public void testFoldNegInfinity() {
        Node result = parseAndFold("-(Infinity)");
        assertNotNull(result);
        assertEquals(Token.NEG, result.getType());
    }
    
    @Test
    public void testFoldBitnotInteger() {
        Node result = parseAndFold("~5");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-6.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldBitnotLarge() {
        Node result = parseAndFold("~9999999999999");
        assertNotNull(result);
        assertEquals(Token.BITNOT, result.getType());
    }
    
    @Test
    public void testFoldAddString() {
        Node result = parseAndFold("'hello' + ' world'");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello world", result.getString());
    }
    
    @Test
    public void testFoldAddNumber() {
        Node result = parseAndFold("2 + 3");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldSub() {
        Node result = parseAndFold("10 - 4");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldMul() {
        Node result = parseAndFold("3 * 4");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(12.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldDiv() {
        Node result = parseAndFold("8 / 2");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(4.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldMod() {
        Node result = parseAndFold("10 % 3");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldDivByZero() {
        Node result = parseAndFold("10 / 0");
        assertNotNull(result);
        assertEquals(Token.DIV, result.getType());
    }
    
    @Test
    public void testFoldModByZero() {
        Node result = parseAndFold("10 % 0");
        assertNotNull(result);
        assertEquals(Token.MOD, result.getType());
    }
    
    @Test
    public void testFoldShiftLeft() {
        Node result = parseAndFold("5 << 2");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldShiftRight() {
        Node result = parseAndFold("-8 >> 2");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-2.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldUnsignedShiftRight() {
        Node result = parseAndFold("-8 >>> 2");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1073741822.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldShiftInvalidLeft() {
        Node result = parseAndFold("99999999999999999 << 1");
        assertNotNull(result);
        assertEquals(Token.LSH, result.getType());
    }
    
    @Test
    public void testFoldShiftNegativeAmount() {
        Node result = parseAndFold("5 << -1");
        assertNotNull(result);
        assertEquals(Token.LSH, result.getType());
    }
    
    @Test
    public void testFoldShiftTooLargeAmount() {
        Node result = parseAndFold("5 << 32");
        assertNotNull(result);
        assertEquals(Token.LSH, result.getType());
    }
    
    @Test
    public void testFoldAndOrTrueLeft() {
        Node result = parseAndFold("true && false");
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldAndOrFalseLeft() {
        Node result = parseAndFold("false && true");
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldOrTrueLeft() {
        Node result = parseAndFold("true || false");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldOrFalseLeft() {
        Node result = parseAndFold("false || true");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonEqSameType() {
        Node result = parseAndFold("1 == 1");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonEqDifferentType() {
        Node result = parseAndFold("1 == '1'");
        assertNotNull(result);
        assertEquals(Token.EQ, result.getType());
    }
    
    @Test
    public void testFoldComparisonStrictEq() {
        Node result = parseAndFold("1 === 1");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonStrictNeq() {
        Node result = parseAndFold("1 !== 2");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonLt() {
        Node result = parseAndFold("1 < 2");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonGt() {
        Node result = parseAndFold("3 > 2");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonLe() {
        Node result = parseAndFold("2 <= 2");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonGe() {
        Node result = parseAndFold("2 >= 3");
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldComparisonNullEqUndefined() {
        Node result = parseAndFold("null == undefined");
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldComparisonNullStrictEqUndefined() {
        Node result = parseAndFold("null === undefined");
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldGetPropArrayLength() {
        Node result = parseAndFold("[1, 2, 3].length");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldGetPropStringLength() {
        Node result = parseAndFold("'hello'.length");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldGetPropNonLiteral() {
        Node result = parseAndFold("x.length");
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }
    
    @Test
    public void testFoldGetElemArray() {
        Node result = parseAndFold("[10, 20, 30][1]");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldGetElemArrayOutOfBounds() {
        Node result = parseAndFold("[10, 20][5]");
        assertNotNull(result);
        assertEquals(Token.GETELEM, result.getType());
    }
    
    @Test
    public void testFoldGetElemArrayNegativeIndex() {
        Node result = parseAndFold("[10, 20][-1]");
        assertNotNull(result);
        assertEquals(Token.GETELEM, result.getType());
    }
    
    @Test
    public void testFoldInstanceofLiteralOnLeft() {
        Node result = parseAndFold("'hello' instanceof Object");
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldInstanceofNonLiteral() {
        Node result = parseAndFold("x instanceof Array");
        assertNotNull(result);
        assertEquals(Token.INSTANCEOF, result.getType());
    }
    
    @Test
    public void testFoldStringToLowerCase() {
        Node result = parseAndFold("'HELLO'.toLowerCase()");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }
    
    @Test
    public void testFoldStringToUpperCase() {
        Node result = parseAndFold("'hello'.toUpperCase()");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("HELLO", result.getString());
    }
    
    @Test
    public void testFoldArrayJoinNoArgs() {
        Node result = parseAndFold("['a', 'b', 'c'].join()");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("a,b,c", result.getString());
    }
    
    @Test
    public void testFoldArrayJoinWithSeparator() {
        Node result = parseAndFold("['a', 'b', 'c'].join('-')");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("a-b-c", result.getString());
    }
    
    @Test
    public void testFoldArrayJoinSingleElement() {
        Node result = parseAndFold("['hello'].join(',')");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }
    
    @Test
    public void testFoldArrayJoinEmpty() {
        Node result = parseAndFold("[].join(',')");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("", result.getString());
    }
    
    @Test
    public void testFoldStringIndexOf() {
        Node result = parseAndFold("'hello world'.indexOf('world')");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldStringLastIndexOf() {
        Node result = parseAndFold("'hello world hello'.lastIndexOf('hello')");
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(12.0, result.getDouble(), 0.0);
    }
    
    @Test
    public void testFoldStringSubstr() {
        Node result = parseAndFold("'hello world'.substr(0, 5)");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }
    
    @Test
    public void testFoldStringSubstrNoLength() {
        Node result = parseAndFold("'hello world'.substr(6)");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("world", result.getString());
    }
    
    @Test
    public void testFoldStringSubstrInvalid() {
        Node result = parseAndFold("'hello'.substr(-1, 2)");
        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
    }
    
    @Test
    public void testFoldStringSubstring() {
        Node result = parseAndFold("'hello world'.substring(0, 5)");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }
    
    @Test
    public void testFoldStringSubstringNoEnd() {
        Node result = parseAndFold("'hello world'.substring(6)");
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("world", result.getString());
    }
    
    @Test
    public void testFoldStringSubstringInvalidStart() {
        Node result = parseAndFold("'hello'.substring(-1, 5)");
        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
    }
    
    @Test
    public void testFoldStringSubstringInvalidEnd() {
        Node result = parseAndFold("'hello'.substring(0, 10)");
        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
    }
}