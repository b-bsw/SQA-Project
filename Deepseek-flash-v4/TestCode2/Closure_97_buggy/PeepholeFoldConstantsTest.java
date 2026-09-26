package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

public class PeepholeFoldConstantsTest {

    private Compiler compiler;
    private PeepholeFoldConstants pass;

    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        pass = new PeepholeFoldConstants();
    }

    private Node parseAndFold(String js) {
        Node root = compiler.parse(js);
        assertNotNull("Parsing failed: " + js, root);
        NodeTraversal.traverse(compiler, root, pass);
        return root.getFirstChild();
    }

    private Node parseAndFoldExpr(String expr) {
        return parseAndFold("var x = " + expr + ";").getFirstChild().getFirstChild().getFirstChild();
    }

    private String printNode(Node n) {
        StringBuilder sb = new StringBuilder();
        n.toStringTree(sb);
        return sb.toString();
    }

    @Test
    public void testFoldTypeofString() {
        Node result = parseAndFoldExpr("typeof 'hello'");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("string", result.getString());
    }

    @Test
    public void testFoldTypeofNumber() {
        Node result = parseAndFoldExpr("typeof 123");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("number", result.getString());
    }

    @Test
    public void testFoldTypeofBoolean() {
        Node result = parseAndFoldExpr("typeof true");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testFoldTypeofNull() {
        Node result = parseAndFoldExpr("typeof null");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofUndefined() {
        Node result = parseAndFoldExpr("typeof undefined");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testFoldTypeofObjectLit() {
        Node result = parseAndFoldExpr("typeof {}");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofArrayLit() {
        Node result = parseAndFoldExpr("typeof []");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofVariable() {
        Node result = parseAndFoldExpr("typeof x");
        assertEquals("TYPEOF", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldNotBoolean() {
        Node result = parseAndFoldExpr("!true");
        assertEquals("FALSE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldNotFalse() {
        Node result = parseAndFoldExpr("!false");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldNotNonBoolean() {
        Node result = parseAndFoldExpr("!x");
        assertEquals("NOT", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldNegNumber() {
        Node result = parseAndFoldExpr("-7");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(-7.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldNegInfinity() {
        Node result = parseAndFoldExpr("-Infinity");
        assertEquals("NEG", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldBitNotNumber() {
        Node result = parseAndFoldExpr("~5");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(~5, (int) result.getDouble());
    }

    @Test
    public void testFoldBitNotLarge() {
        Node result = parseAndFoldExpr("~1e10");
        assertEquals("BITNOT", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldBitNotFractional() {
        Node result = parseAndFoldExpr("~3.5");
        assertEquals("BITNOT", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAddString() {
        Node result = parseAndFoldExpr("'a' + 'b'");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("ab", result.getString());
    }

    @Test
    public void testFoldAddNumber() {
        Node result = parseAndFoldExpr("3 + 4");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(7.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldAddNumberString() {
        Node result = parseAndFoldExpr("3 + 'a'");
        assertTrue("Expected ADD node", Node.tokenToName(result.getType()).equals("ADD"));
    }

    @Test
    public void testFoldSub() {
        Node result = parseAndFoldExpr("10 - 3");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(7.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldMul() {
        Node result = parseAndFoldExpr("6 * 7");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(42.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldDiv() {
        Node result = parseAndFoldExpr("10 / 2");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldDivByZero() {
        Node result = parseAndFoldExpr("10 / 0");
        assertEquals("DIV", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldBitAnd() {
        Node result = parseAndFoldExpr("3 & 5");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(1.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldBitOr() {
        Node result = parseAndFoldExpr("3 | 5");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(7.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldLsh() {
        Node result = parseAndFoldExpr("3 << 2");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(12.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldRsh() {
        Node result = parseAndFoldExpr("-5 >> 1");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(-3.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldUrsh() {
        Node result = parseAndFoldExpr("5 >>> 1");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(2.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldGetPropStringLength() {
        Node result = parseAndFoldExpr("'hello'.length");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldGetPropArrayLength() {
        Node result = parseAndFoldExpr("[1,2,3].length");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(3.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldGetPropLengthNoFold() {
        Node result = parseAndFoldExpr("x.length");
        assertEquals("GETPROP", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldGetElemArray() {
        Node result = parseAndFoldExpr("[10,20,30][1]");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(20.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldGetElemOutOfBounds() {
        Node result = parseAndFoldExpr("[10,20,30][5]");
        assertEquals("GETELEM", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldGetElemNegativeIndex() {
        Node result = parseAndFoldExpr("[10,20,30][-1]");
        assertEquals("GETELEM", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldGetElemNonNumberIndex() {
        Node result = parseAndFoldExpr("[10,20,30]['a']");
        assertEquals("GETELEM", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldInstanceofLiteral() {
        Node result = parseAndFoldExpr("'a' instanceof Object");
        assertEquals("FALSE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldInstanceofObject() {
        Node result = parseAndFoldExpr("x instanceof Object");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldInstanceofNonLiteral() {
        Node result = parseAndFoldExpr("x instanceof y");
        assertEquals("INSTANCEOF", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAndLeftFalse() {
        Node result = parseAndFoldExpr("false && x");
        assertEquals("FALSE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAndLeftTrue() {
        Node result = parseAndFoldExpr("true && 5");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldOrLeftTrue() {
        Node result = parseAndFoldExpr("true || x");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldOrLeftFalse() {
        Node result = parseAndFoldExpr("false || 5");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldStringIndexOf() {
        Node result = parseAndFoldExpr("'hello'.indexOf('l', 0)");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(2.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldStringLastIndexOf() {
        Node result = parseAndFoldExpr("'hello'.lastIndexOf('l')");
        assertEquals("NUMBER", Node.tokenToName(result.getType()));
        assertEquals(3.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldStringJoinEmptyArray() {
        Node result = parseAndFoldExpr("[].join(',')");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("", result.getString());
    }

    @Test
    public void testFoldStringJoinOneElement() {
        Node result = parseAndFoldExpr("['a'].join(',')");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("a", result.getString());
    }

    @Test
    public void testFoldStringJoinMultiple() {
        Node result = parseAndFoldExpr("['a','b','c'].join('-')");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("a-b-c", result.getString());
    }

    @Test
    public void testFoldStringJoinWithNonString() {
        Node result = parseAndFoldExpr("['a', 1, 'b'].join(',')");
        assertTrue("Expected ADD", Node.tokenToName(result.getType()).equals("ADD"));
    }

    @Test
    public void testFoldComparisonEq() {
        Node result = parseAndFoldExpr("3 == 3");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonNe() {
        Node result = parseAndFoldExpr("3 != 4");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonLt() {
        Node result = parseAndFoldExpr("3 < 4");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonGt() {
        Node result = parseAndFoldExpr("4 > 3");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonLe() {
        Node result = parseAndFoldExpr("3 <= 3");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonGe() {
        Node result = parseAndFoldExpr("3 >= 3");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonSheq() {
        Node result = parseAndFoldExpr("3 === 3");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonShne() {
        Node result = parseAndFoldExpr("3 !== 4");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonStringEq() {
        Node result = parseAndFoldExpr("'a' == 'a'");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonStringNe() {
        Node result = parseAndFoldExpr("'a' != 'b'");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonNullUndefined() {
        Node result = parseAndFoldExpr("null == undefined");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonNullNonNull() {
        Node result = parseAndFoldExpr("null == 1");
        assertEquals("FALSE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonNumString() {
        Node result = parseAndFoldExpr("5 == '5'");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonNameUndefined() {
        Node result = parseAndFoldExpr("undefined == null");
        assertEquals("TRUE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonUndefinedEq() {
        Node result = parseAndFoldExpr("undefined == 1");
        assertEquals("FALSE", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonDifferentTypesNoFold() {
        Node result = parseAndFoldExpr("x < 5");
        assertEquals("LT", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldComparisonEqualNamesNoFold() {
        Node result = parseAndFoldExpr("x == x");
        assertEquals("EQ", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToAdd() {
        Node result = parseAndFoldExpr("x = x + 1");
        assertEquals("ASSIGN_ADD", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToSub() {
        Node result = parseAndFoldExpr("x = x - 1");
        assertEquals("ASSIGN_SUB", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToMul() {
        Node result = parseAndFoldExpr("x = x * 1");
        assertEquals("ASSIGN_MUL", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToDiv() {
        Node result = parseAndFoldExpr("x = x / 1");
        assertEquals("ASSIGN_DIV", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToBitAnd() {
        Node result = parseAndFoldExpr("x = x & 1");
        assertEquals("ASSIGN_BITAND", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToBitOr() {
        Node result = parseAndFoldExpr("x = x | 1");
        assertEquals("ASSIGN_BITOR", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToLsh() {
        Node result = parseAndFoldExpr("x = x << 1");
        assertEquals("ASSIGN_LSH", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToRsh() {
        Node result = parseAndFoldExpr("x = x >> 1");
        assertEquals("ASSIGN_RSH", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignToUrsh() {
        Node result = parseAndFoldExpr("x = x >>> 1");
        assertEquals("ASSIGN_URSH", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignWithSideEffects() {
        Node result = parseAndFoldExpr("x = a() + 1");
        assertEquals("ASSIGN", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldAssignDifferentVar() {
        Node result = parseAndFoldExpr("x = y + 1");
        assertEquals("ASSIGN", Node.tokenToName(result.getType()));
    }

    @Test
    public void testFoldLeftChildAdd() {
        Node result = parseAndFoldExpr("('a' + 'b') + 'c'");
        assertEquals("STRING", Node.tokenToName(result.getType()));
        assertEquals("abc", result.getString());
    }

    @Test
    public void testFoldLeftChildAddOnlyRightLiteral() {
        Node result = parseAndFoldExpr("('a' + x) + 'b'");
        assertTrue("Expected ADD", Node.tokenToName(result.getType()).equals("ADD"));
    }

    @Test
    public void testOptimizeSubtreeUnknownType() {
        Node root = parseAndFold("var x = 1;");
        assertNotNull(root);
    }
}