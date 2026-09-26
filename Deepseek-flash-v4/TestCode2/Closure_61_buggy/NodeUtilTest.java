package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NodeUtilTest {

    private static Node stringNode(String s) { return Node.newString(Token.STRING, s); }
    private static Node numberNode(double d) { return Node.newNumber(d); }
    private static Node nameNode(String s) { return Node.newString(Token.NAME, s); }
    private static Node booleanNode(boolean v) { return v ? new Node(Token.TRUE) : new Node(Token.FALSE); }
    private static Node nullNode() { return new Node(Token.NULL); }
    private static Node voidNode(Node child) { return new Node(Token.VOID, child); }
    private static Node notNode(Node child) { return new Node(Token.NOT, child); }
    private static Node andNode(Node l, Node r) { return new Node(Token.AND, l, r); }
    private static Node orNode(Node l, Node r) { return new Node(Token.OR, l, r); }
    private static Node hookNode(Node c, Node t, Node f) { return new Node(Token.HOOK, c, t, f); }
    private static Node assignNode(Node t, Node v) { return new Node(Token.ASSIGN, t, v); }
    private static Node commaNode(Node l, Node r) { return new Node(Token.COMMA, l, r); }
    private static Node arrayLitNode(Node... children) {
        Node n = new Node(Token.ARRAYLIT);
        for (Node ch : children) n.addChildToBack(ch);
        return n;
    }
    private static Node objectLitNode() { return new Node(Token.OBJECTLIT); }
    private static Node emptyNode() { return new Node(Token.EMPTY); }
    private static Node blockNode(Node... children) {
        Node n = new Node(Token.BLOCK);
        for (Node ch : children) n.addChildToBack(ch);
        return n;
    }

    @Test
    public void testGetPureBooleanValue_StringEmpty() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(stringNode("")));
    }
    @Test
    public void testGetPureBooleanValue_StringNonEmpty() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(stringNode("a")));
    }
    @Test
    public void testGetPureBooleanValue_NumberZero() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(numberNode(0)));
    }
    @Test
    public void testGetPureBooleanValue_NumberNonZero() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(numberNode(1.5)));
    }
    @Test
    public void testGetPureBooleanValue_Not() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(notNode(numberNode(0))));
    }
    @Test
    public void testGetPureBooleanValue_Null() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nullNode()));
    }
    @Test
    public void testGetPureBooleanValue_False() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(booleanNode(false)));
    }
    @Test
    public void testGetPureBooleanValue_Void() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(voidNode(numberNode(0))));
    }
    @Test
    public void testGetPureBooleanValue_True() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(booleanNode(true)));
    }
    @Test
    public void testGetPureBooleanValue_RegExp() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.REGEXP)));
    }
    @Test
    public void testGetPureBooleanValue_UndefinedName() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("undefined")));
    }
    @Test
    public void testGetPureBooleanValue_NaNName() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("NaN")));
    }
    @Test
    public void testGetPureBooleanValue_InfinityName() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(nameNode("Infinity")));
    }
    @Test
    public void testGetPureBooleanValue_OtherName() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(nameNode("x")));
    }
    @Test
    public void testGetPureBooleanValue_ArrayLitNoSideEffects() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(arrayLitNode(numberNode(1))));
    }
    @Test
    public void testGetPureBooleanValue_ArrayLitWithSideEffects() {
        Node nameWithChild = nameNode("x");
        nameWithChild.addChildToBack(numberNode(1));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(arrayLitNode(nameWithChild)));
    }
    @Test
    public void testGetPureBooleanValue_AddOp() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(new Node(Token.ADD, numberNode(1), numberNode(2))));
    }
    @Test
    public void testGetImpureBooleanValue_Assign() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(assignNode(nameNode("x"), numberNode(0))));
    }
    @Test
    public void testGetImpureBooleanValue_Comma() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(commaNode(numberNode(1), numberNode(0))));
    }
    @Test
    public void testGetImpureBooleanValue_Not() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(notNode(numberNode(0))));
    }
    @Test
    public void testGetImpureBooleanValue_And() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(andNode(stringNode("a"), stringNode("b"))));
    }
    @Test
    public void testGetImpureBooleanValue_Or() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orNode(numberNode(0), numberNode(1))));
    }
    @Test
    public void testGetImpureBooleanValue_HookSame() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(hookNode(booleanNode(true), numberNode(0), numberNode(0))));
    }
    @Test
    public void testGetImpureBooleanValue_HookDifferent() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hookNode(booleanNode(true), numberNode(0), numberNode(1))));
    }
    @Test
    public void testGetImpureBooleanValue_ArrayLit() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arrayLitNode(numberNode(1))));
    }
    @Test
    public void testGetImpureBooleanValue_ObjectLit() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(objectLitNode()));
    }
    @Test
    public void testGetImpureBooleanValue_Default() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(stringNode("hello")));
    }
    @Test
    public void testGetStringValue_String() {
        assertEquals("abc", NodeUtil.getStringValue(stringNode("abc")));
    }
    @Test
    public void testGetStringValue_NameUndefined() {
        assertEquals("undefined", NodeUtil.getStringValue(nameNode("undefined")));
    }
    @Test
    public void testGetStringValue_NameInfinity() {
        assertEquals("Infinity", NodeUtil.getStringValue(nameNode("Infinity")));
    }
    @Test
    public void testGetStringValue_NameNaN() {
        assertEquals("NaN", NodeUtil.getStringValue(nameNode("NaN")));
    }
    @Test
    public void testGetStringValue_OtherName() {
        assertNull(NodeUtil.getStringValue(nameNode("x")));
    }
    @Test
    public void testGetStringValue_NumberInteger() {
        assertEquals("5", NodeUtil.getStringValue(numberNode(5)));
    }
    @Test
    public void testGetStringValue_NumberNonInteger() {
        assertEquals("1.5", NodeUtil.getStringValue(numberNode(1.5)));
    }
    @Test
    public void testGetStringValue_False() {
        assertEquals("false", NodeUtil.getStringValue(booleanNode(false)));
    }
    @Test
    public void testGetStringValue_True() {
        assertEquals("true", NodeUtil.getStringValue(booleanNode(true)));
    }
    @Test
    public void testGetStringValue_Null() {
        assertEquals("null", NodeUtil.getStringValue(nullNode()));
    }
    @Test
    public void testGetStringValue_Void() {
        assertEquals("undefined", NodeUtil.getStringValue(voidNode(numberNode(0))));
    }
    @Test
    public void testGetStringValue_NotBoolean() {
        assertEquals("true", NodeUtil.getStringValue(notNode(numberNode(0))));
    }
    @Test
    public void testGetStringValue_NotNonBoolean() {
        assertEquals("false", NodeUtil.getStringValue(notNode(stringNode("abc"))));
    }
    @Test
    public void testGetStringValue_NotUnknown() {
        assertNull(NodeUtil.getStringValue(notNode(nameNode("x"))));
    }
    @Test
    public void testGetStringValue_ArrayLitSimple() {
        assertEquals("a,b", NodeUtil.getStringValue(arrayLitNode(stringNode("a"), stringNode("b"))));
    }
    @Test
    public void testGetStringValue_ArrayLitNullChild() {
        assertEquals("", NodeUtil.getStringValue(arrayLitNode(nullNode())));
    }
    @Test
    public void testGetStringValue_ObjectLit() {
        assertEquals("[object Object]", NodeUtil.getStringValue(objectLitNode()));
    }
    @Test
    public void testGetNumberValue_True() {
        assertEquals(1.0, NodeUtil.getNumberValue(booleanNode(true)), 0.0);
    }
    @Test
    public void testGetNumberValue_False() {
        assertEquals(0.0, NodeUtil.getNumberValue(booleanNode(false)), 0.0);
    }
    @Test
    public void testGetNumberValue_Null() {
        assertEquals(0.0, NodeUtil.getNumberValue(nullNode()), 0.0);
    }
    @Test
    public void testGetNumberValue_Number() {
        assertEquals(42.5, NodeUtil.getNumberValue(numberNode(42.5)), 0.0);
    }
    @Test
    public void testGetNumberValue_VoidNoSideEffects() {
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(voidNode(numberNode(1)))));
    }
    @Test
    public void testGetNumberValue_VoidWithSideEffects() {
        assertNull(NodeUtil.getNumberValue(voidNode(new Node(Token.THROW, stringNode("err")))));
    }
    @Test
    public void testGetNumberValue_NameUndefined() {
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(nameNode("undefined"))));
    }
    @Test
    public void testGetNumberValue_NameNaN() {
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(nameNode("NaN"))));
    }
    @Test
    public void testGetNumberValue_NameInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(nameNode("Infinity")), 0.0);
    }
    @Test
    public void testGetNumberValue_OtherName() {
        assertNull(NodeUtil.getNumberValue(nameNode("x")));
    }
    @Test
    public void testGetNumberValue_NegInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(new Node(Token.NEG, nameNode("Infinity"))), 0.0);
    }
    @Test
    public void testGetNumberValue_NegOther() {
        assertNull(NodeUtil.getNumberValue(new Node(Token.NEG, nameNode("x"))));
    }
    @Test
    public void testGetNumberValue_NotBoolean() {
        assertEquals(0.0, NodeUtil.getNumberValue(notNode(numberNode(0))), 0.0);
    }
    @Test
    public void testGetNumberValue_NotUnknown() {
        assertNull(NodeUtil.getNumberValue(notNode(nameNode("x"))));
    }
    @Test
    public void testGetNumberValue_String() {
        assertEquals(3.14, NodeUtil.getNumberValue(stringNode("3.14")), 0.0);
    }
    @Test
    public void testGetNumberValue_ArrayLit() {
        assertEquals(42.0, NodeUtil.getNumberValue(arrayLitNode(stringNode("42"))), 0.0);
    }
    @Test
    public void testGetNumberValue_ObjectLit() {
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(objectLitNode())));
    }
    @Test
    public void testIsImmutableValue_String() {
        assertTrue(NodeUtil.isImmutableValue(stringNode("a")));
    }
    @Test
    public void testIsImmutableValue_Number() {
        assertTrue(NodeUtil.isImmutableValue(numberNode(1)));
    }
    @Test
    public void testIsImmutableValue_Null() {
        assertTrue(NodeUtil.isImmutableValue(nullNode()));
    }
    @Test
    public void testIsImmutableValue_True() {
        assertTrue(NodeUtil.isImmutableValue(booleanNode(true)));
    }
    @Test
    public void testIsImmutableValue_False() {
        assertTrue(NodeUtil.isImmutableValue(booleanNode(false)));
    }
    @Test
    public void testIsImmutableValue_Not() {
        assertTrue(NodeUtil.isImmutableValue(notNode(numberNode(1))));
    }
    @Test
    public void testIsImmutableValue_Void() {
        assertTrue(NodeUtil.isImmutableValue(voidNode(numberNode(1))));
    }
    @Test
    public void testIsImmutableValue_Neg() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, numberNode(1))));
    }
    @Test
    public void testIsImmutableValue_NameSpecial() {
        assertTrue(NodeUtil.isImmutableValue(nameNode("undefined")));
        assertTrue(NodeUtil.isImmutableValue(nameNode("Infinity")));
        assertTrue(NodeUtil.isImmutableValue(nameNode("NaN")));
    }
    @Test
    public void testIsImmutableValue_Other() {
        assertFalse(NodeUtil.isImmutableValue(nameNode("x")));
        assertFalse(NodeUtil.isImmutableValue(arrayLitNode()));
    }
    @Test
    public void testIsLiteralValue_ArrayLitAllLiteral() {
        assertTrue(NodeUtil.isLiteralValue(arrayLitNode(numberNode(1), stringNode("a")), false));
    }
    @Test
    public void testIsLiteralValue_ArrayLitWithNonLiteral() {
        assertFalse(NodeUtil.isLiteralValue(arrayLitNode(nameNode("x")), false));
    }
    @Test
    public void testIsLiteralValue_ArrayLitWithEmpty() {
        assertTrue(NodeUtil.isLiteralValue(arrayLitNode(emptyNode()), false));
    }
    @Test
    public void testIsLiteralValue_RegExp() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.REGEXP), false));
    }
    @Test
    public void testIsLiteralValue_ObjectLitLiteralKeys() {
        Node keyNode = Node.newString(Token.STRING, "prop");
        keyNode.addChildToBack(numberNode(42));
        Node objLit = new Node(Token.OBJECTLIT, keyNode);
        assertTrue(NodeUtil.isLiteralValue(objLit, false));
    }
    @Test
    public void testIsLiteralValue_FunctionNotIncluded() {
        assertFalse(NodeUtil.isLiteralValue(new Node(Token.FUNCTION), false));
    }
    @Test
    public void testIsLiteralValue_FunctionIncluded() {
        Node fn = new Node(Token.FUNCTION);
        new Node(Token.EXPR_RESULT, fn);
        assertTrue(NodeUtil.isLiteralValue(fn, true));
    }
    @Test
    public void testIsValidDefineValue_SimpleLiteral() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(numberNode(1), defines));
        assertTrue(NodeUtil.isValidDefineValue(stringNode("a"), defines));
        assertTrue(NodeUtil.isValidDefineValue(booleanNode(true), defines));
    }
    @Test
    public void testIsValidDefineValue_BinaryOpAllLiteral() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(new Node(Token.ADD, numberNode(1), numberNode(2)), defines));
    }
    @Test
    public void testIsValidDefineValue_BinaryOpWithName() {
        Set<String> defines = new HashSet<>();
        assertFalse(NodeUtil.isValidDefineValue(new Node(Token.ADD, numberNode(1), nameNode("x")), defines));
    }
    @Test
    public void testIsValidDefineValue_UnaryOp() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(new Node(Token.NOT, numberNode(0)), defines));
    }
    @Test
    public void testIsValidDefineValue_QualifiedNameInDefines() {
        Set<String> defines = new HashSet<>();
        defines.add("a.b.c");
        Node a = nameNode("a");
        Node b = Node.newString(Token.STRING, "b");
        Node getProp1 = new Node(Token.GETPROP, a, b);
        Node c = Node.newString(Token.STRING, "c");
        Node getProp2 = new Node(Token.GETPROP, getProp1, c);
        assertTrue(NodeUtil.isValidDefineValue(getProp2, defines));
    }
    @Test
    public void testIsValidDefineValue_QualifiedNameNotInDefines() {
        Set<String> defines = new HashSet<>();
        Node a = nameNode("a");
        Node b = Node.newString(Token.STRING, "b");
        Node getProp = new Node(Token.GETPROP, a, b);
        assertFalse(NodeUtil.isValidDefineValue(getProp, defines));
    }
    @Test
    public void testIsEmptyBlock_NonBlock() {
        assertFalse(NodeUtil.isEmptyBlock(numberNode(1)));
    }
    @Test
    public void testIsEmptyBlock_BlockWithOnlyEmpty() {
        assertTrue(NodeUtil.isEmptyBlock(blockNode(emptyNode(), emptyNode())));
    }
    @Test
    public void testIsEmptyBlock_BlockWithNonEmpty() {
        assertFalse(NodeUtil.isEmptyBlock(blockNode(numberNode(1))));
    }
    @Test
    public void testIsEmptyBlock_EmptyBlockNoChildren() {
        assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK)));
    }
    @Test
    public void testIsSimpleOperator_Add() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    }
    @Test
    public void testIsSimpleOperator_NotSimple() {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.FUNCTION)));
    }
    @Test
    public void testMayHaveSideEffects_Throw() {
        assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW)));
    }
    @Test
    public void testMayHaveSideEffects_Number() {
        assertFalse(NodeUtil.mayHaveSideEffects(numberNode(1)));
    }
    @Test
    public void testMayHaveSideEffects_NameNoChild() {
        assertFalse(NodeUtil.mayHaveSideEffects(nameNode("x")));
    }
    @Test
    public void testMayHaveSideEffects_NameWithChild() {
        Node name = nameNode("x");
        name.addChildToBack(numberNode(1));
        assertTrue(NodeUtil.mayHaveSideEffects(name));
    }
    @Test
    public void testMayHaveSideEffects_NewArray() {
        assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.NEW, nameNode("Array"))));
    }
    @Test
    public void testMayHaveSideEffects_NewCustom() {
        assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.NEW, nameNode("Custom"))));
    }
    @Test
    public void testMayHaveSideEffects_CallString() {
        assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.CALL, nameNode("String"))));
    }
    @Test
    public void testMayHaveSideEffects_CallCustom() {
        assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.CALL, nameNode("eval"))));
    }
    @Test
    public void testMayHaveSideEffects_AssignName() {
        assertTrue(NodeUtil.mayHaveSideEffects(assignNode(nameNode("x"), numberNode(1))));
    }
    @Test
    public void testArrayToString_Basic() {
        assertEquals("a,b", NodeUtil.arrayToString(arrayLitNode(stringNode("a"), stringNode("b"))));
    }
    @Test
    public void testArrayToString_NullChild() {
        assertEquals("", NodeUtil.arrayToString(arrayLitNode(nullNode())));
    }
    @Test
    public void testArrayToString_UndefinedChild() {
        assertEquals("", NodeUtil.arrayToString(arrayLitNode(nameNode("undefined"))));
    }
    @Test
    public void testArrayToString_ChildReturnsNull() {
        assertNull(NodeUtil.arrayToString(arrayLitNode(nameNode("x"))));
    }
    @Test
    public void testGetStringNumberValue_EmptyString() {
        assertEquals(0.0, NodeUtil.getStringNumberValue(""), 0.0);
    }
    @Test
    public void testGetStringNumberValue_Hex() {
        assertEquals(255.0, NodeUtil.getStringNumberValue("0xff"), 0.0);
    }
    @Test
    public void testGetStringNumberValue_HexInvalid() {
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xzz")));
    }
    @Test
    public void testGetStringNumberValue_VerticalTab() {
        assertNull(NodeUtil.getStringNumberValue("a\u000bb"));
    }
    @Test
    public void testGetStringNumberValue_Infinity() {
        assertNull(NodeUtil.getStringNumberValue("infinity"));
        assertNull(NodeUtil.getStringNumberValue("-infinity"));
    }
    @Test
    public void testGetStringNumberValue_NormalNumber() {
        assertEquals(3.14, NodeUtil.getStringNumberValue("3.14"), 0.0);
    }
    @Test
    public void testGetStringNumberValue_InvalidNumber() {
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("abc")));
    }
    @Test
    public void testTrimJsWhiteSpace_NoTrim() {
        assertEquals("hello", NodeUtil.trimJsWhiteSpace("hello"));
    }
    @Test
    public void testTrimJsWhiteSpace_TrimSpaces() {
        assertEquals("hello", NodeUtil.trimJsWhiteSpace("  hello  "));
    }
    @Test
    public void testTrimJsWhiteSpace_AllWhitespace() {
        assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
    }
    @Test
    public void testTrimJsWhiteSpace_WithVerticalTab() {
        assertEquals("\u000b", NodeUtil.trimJsWhiteSpace("\u000b"));
    }
    @Test
    public void testIsStrWhiteSpaceChar_VerticalTab() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    }
    @Test
    public void testIsStrWhiteSpaceChar_Space() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    }
    @Test
    public void testIsStrWhiteSpaceChar_NonSpace() {
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    }
    @Test
    public void testIsStrWhiteSpaceChar_OtherSeparator() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2000'));
    }
    @Test(expected = IllegalStateException.class)
    public void testFunctionCallHasSideEffects_NotCall() {
        NodeUtil.functionCallHasSideEffects(numberNode(1));
    }
    @Test
    public void testFunctionCallHasSideEffects_NoSideEffects() {
        assertFalse(NodeUtil.functionCallHasSideEffects(new Node(Token.CALL, nameNode("String"))));
    }
    @Test
    public void testFunctionCallHasSideEffects_WithSideEffects() {
        assertTrue(NodeUtil.functionCallHasSideEffects(new Node(Token.CALL, nameNode("foo"))));
    }
    @Test
    public void testFunctionCallHasSideEffects_ToStringMethod() {
        Node obj = nameNode("obj");
        Node prop = Node.newString(Token.STRING, "toString");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        Node call = new Node(Token.CALL, getProp);
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }
    @Test(expected = IllegalStateException.class)
    public void testConstructorCallHasSideEffects_NotNew() {
        NodeUtil.constructorCallHasSideEffects(numberNode(1));
    }
    @Test
    public void testConstructorCallHasSideEffects_Array() {
        assertFalse(NodeUtil.constructorCallHasSideEffects(new Node(Token.NEW, nameNode("Array"))));
    }
    @Test
    public void testConstructorCallHasSideEffects_Other() {
        assertTrue(NodeUtil.constructorCallHasSideEffects(new Node(Token.NEW, nameNode("MyClass"))));
    }
    @Test
    public void testIsAssignmentOp_Assign() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }
    @Test
    public void testIsAssignmentOp_AddAssign() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
    }
    @Test
    public void testIsAssignmentOp_NonAssignment() {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }
    @Test
    public void testPrecedence_Comma() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
    }
    @Test
    public void testPrecedence_Or() {
        assertEquals(3, NodeUtil.precedence(Token.OR));
    }
    @Test
    public void testPrecedence_Call() {
        assertEquals(15, NodeUtil.precedence(Token.CALL));
    }
    @Test(expected = Error.class)
    public void testPrecedence_Unknown() {
        NodeUtil.precedence(999);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_NonAssignment() {
        NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
    }
    @Test
    public void testGetOpFromAssignmentOp_AssignBitor() {
        assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    }
    @Test
    public void testIsNull() {
        assertTrue(NodeUtil.isNull(nullNode()));
        assertFalse(NodeUtil.isNull(nameNode("undefined")));
    }
    @Test
    public void testIsUndefined() {
        assertTrue(NodeUtil.isUndefined(nameNode("undefined")));
        assertTrue(NodeUtil.isUndefined(voidNode(numberNode(0))));
        assertFalse(NodeUtil.isUndefined(nullNode()));
    }
    @Test
    public void testIsNullOrUndefined() {
        assertTrue(NodeUtil.isNullOrUndefined(nullNode()));
        assertTrue(NodeUtil.isNullOrUndefined(nameNode("undefined")));
        assertFalse(NodeUtil.isNullOrUndefined(numberNode(0)));
    }
    @Test
    public void testMayBeString_Number() {
        assertFalse(NodeUtil.mayBeString(numberNode(1)));
    }
    @Test
    public void testMayBeString_String() {
        assertTrue(NodeUtil.mayBeString(stringNode("a")));
    }
    @Test
    public void testContainsFunction() {
        Node fn = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.containsFunction(new Node(Token.BLOCK, fn)));
        assertFalse(NodeUtil.containsFunction(numberNode(1)));
    }
    @Test
    public void testIsCall() {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
        assertFalse(NodeUtil.isCall(new Node(Token.NEW)));
    }
    @Test
    public void testIsNew() {
        assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
        assertFalse(NodeUtil.isNew(new Node(Token.CALL)));
    }
    @Test
    public void testEvaluatesToLocalValue_Number() {
        assertTrue(NodeUtil.evaluatesToLocalValue(numberNode(1)));
    }
    @Test
    public void testEvaluatesToLocalValue_NameImmutable() {
        assertTrue(NodeUtil.evaluatesToLocalValue(nameNode("undefined")));
    }
    @Test
    public void testEvaluatesToLocalValue_NameOther() {
        assertFalse(NodeUtil.evaluatesToLocalValue(nameNode("x")));
    }
    @Test
    public void testEvaluatesToLocalValue_ArrayLit() {
        assertTrue(NodeUtil.evaluatesToLocalValue(arrayLitNode()));
    }
    @Test
    public void testEvaluatesToLocalValue_Function() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.FUNCTION)));
    }
}