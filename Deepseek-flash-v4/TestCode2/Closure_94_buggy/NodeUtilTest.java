package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

public class NodeUtilTest {
    private Node numberNode;
    private Node stringNode;
    private Node nameNode;
    private Node assignNode;
    private Node commaNode;
    private Node notNode;
    private Node andNode;
    private Node orNode;
    private Node hookNode;
    private Node trueNode;
    private Node falseNode;
    private Node nullNode;
    private Node voidNode;
    private Node negNode;
    private Node functionNode;
    private Node blockNode;
    private Node emptyBlockNode;
    private Node callNode;
    private Node newNode;
    private Node getpropNode;
    private Node getelemNode;
    private Node objectLitNode;
    private Node arrayLitNode;
    private Node regexpNode;
    private Node varNode;
    private Node exprResultNode;
    private Node throwNode;
    private Node ifNode;

    @Before
    public void setUp() {
        numberNode = Node.newNumber(42);
        stringNode = Node.newString("hello");
        nameNode = Node.newString(Token.NAME, "x");
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newNumber(1);
        assignNode = new Node(Token.ASSIGN, lhs, rhs);
        Node first = Node.newNumber(1);
        Node second = Node.newNumber(2);
        commaNode = new Node(Token.COMMA, first, second);
        Node inner = Node.newNumber(0);
        notNode = new Node(Token.NOT, inner);
        Node left = Node.newString(Token.TRUE);
        Node right = Node.newString(Token.FALSE);
        andNode = new Node(Token.AND, left, right);
        orNode = new Node(Token.OR, left, right);
        Node cond = Node.newNumber(1);
        Node trueVal = Node.newString(Token.TRUE);
        Node falseVal = Node.newString(Token.FALSE);
        hookNode = new Node(Token.HOOK, cond, trueVal, falseVal);
        trueNode = new Node(Token.TRUE);
        falseNode = new Node(Token.FALSE);
        nullNode = new Node(Token.NULL);
        voidNode = new Node(Token.VOID, Node.newNumber(0));
        negNode = new Node(Token.NEG, Node.newNumber(-5));
        Node fnName = Node.newString(Token.NAME, "f");
        Node params = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        functionNode = new Node(Token.FUNCTION, fnName, params, body);
        blockNode = new Node(Token.BLOCK, Node.newNumber(1));
        emptyBlockNode = new Node(Token.BLOCK);
        Node callTarget = Node.newString(Token.NAME, "eval");
        callNode = new Node(Token.CALL, callTarget);
        Node newTarget = Node.newString(Token.NAME, "Array");
        newNode = new Node(Token.NEW, newTarget);
        Node propObj = Node.newString(Token.NAME, "obj");
        Node propName = Node.newString(Token.STRING, "prop");
        getpropNode = new Node(Token.GETPROP, propObj, propName);
        getelemNode = new Node(Token.GETELEM, propObj, Node.newNumber(0));
        Node objLitName = Node.newString(Token.STRING, "key");
        Node objLitVal = Node.newNumber(1);
        objectLitNode = new Node(Token.OBJECTLIT, objLitName, objLitVal);
        arrayLitNode = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
        Node regexpChild = Node.newString(Token.STRING, "abc");
        regexpNode = new Node(Token.REGEXP, regexpChild);
        Node varName = Node.newString(Token.NAME, "y");
        Node varValue = Node.newNumber(5);
        varName.addChildToBack(varValue);
        varNode = new Node(Token.VAR, varName);
        Node exprChild = Node.newNumber(1);
        exprResultNode = new Node(Token.EXPR_RESULT, exprChild);
        throwNode = new Node(Token.THROW, Node.newString("error"));
        Node ifCond = Node.newNumber(1);
        Node ifBody = new Node(Token.BLOCK);
        ifNode = new Node(Token.IF, ifCond, ifBody);
    }

    @Test
    public void testGetExpressionBooleanValue_Assign() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assignNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Comma() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(commaNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Not() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(notNode));
    }

    @Test
    public void testGetExpressionBooleanValue_And() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Or() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValue_HookSame() {
        Node sameHook = new Node(Token.HOOK, Node.newNumber(0), Node.newString(Token.TRUE), Node.newString(Token.TRUE));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(sameHook));
    }

    @Test
    public void testGetExpressionBooleanValue_HookDifferent() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Default() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(stringNode));
    }

    @Test
    public void testGetBooleanValue_StringEmpty() {
        Node emptyString = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(emptyString));
    }

    @Test
    public void testGetBooleanValue_StringNonEmpty() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(stringNode));
    }

    @Test
    public void testGetBooleanValue_NumberZero() {
        Node zero = Node.newNumber(0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(zero));
    }

    @Test
    public void testGetBooleanValue_NumberNonZero() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(numberNode));
    }

    @Test
    public void testGetBooleanValue_Null() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nullNode));
    }

    @Test
    public void testGetBooleanValue_False() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(falseNode));
    }

    @Test
    public void testGetBooleanValue_Void() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(voidNode));
    }

    @Test
    public void testGetBooleanValue_True() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));
    }

    @Test
    public void testGetBooleanValue_NameUndefined() {
        Node undefNode = Node.newString(Token.NAME, "undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(undefNode));
    }

    @Test
    public void testGetBooleanValue_NameNaN() {
        Node nanNode = Node.newString(Token.NAME, "NaN");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nanNode));
    }

    @Test
    public void testGetBooleanValue_NameInfinity() {
        Node infNode = Node.newString(Token.NAME, "Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(infNode));
    }

    @Test
    public void testGetBooleanValue_ArrayLit() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(arrayLitNode));
    }

    @Test
    public void testGetBooleanValue_ObjectLit() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(objectLitNode));
    }

    @Test
    public void testGetBooleanValue_Regexp() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(regexpNode));
    }

    @Test
    public void testGetBooleanValue_Unknown() {
        Node unknown = new Node(Token.THIS);
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(unknown));
    }

    @Test
    public void testGetStringValue_Name() {
        assertEquals("x", NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testGetStringValue_String() {
        assertEquals("hello", NodeUtil.getStringValue(stringNode));
    }

    @Test
    public void testGetStringValue_NumberInteger() {
        Node intNum = Node.newNumber(5);
        assertEquals("5", NodeUtil.getStringValue(intNum));
    }

    @Test
    public void testGetStringValue_NumberDouble() {
        Node doubleNum = Node.newNumber(3.14);
        assertEquals("3.14", NodeUtil.getStringValue(doubleNum));
    }

    @Test
    public void testGetStringValue_False() {
        assertEquals("false", NodeUtil.getStringValue(falseNode));
    }

    @Test
    public void testGetStringValue_True() {
        assertEquals("true", NodeUtil.getStringValue(trueNode));
    }

    @Test
    public void testGetStringValue_Null() {
        assertEquals("null", NodeUtil.getStringValue(nullNode));
    }

    @Test
    public void testGetStringValue_Void() {
        assertEquals("undefined", NodeUtil.getStringValue(voidNode));
    }

    @Test
    public void testGetStringValue_Other() {
        Node other = new Node(Token.THIS);
        assertNull(NodeUtil.getStringValue(other));
    }

    @Test
    public void testGetFunctionName_Named() {
        Node parent = new Node(Token.NAME, "g");
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        parent.addChildToBack(func);
        assertEquals("g", NodeUtil.getFunctionName(func));
    }

    @Test
    public void testGetFunctionName_Assign() {
        Node assignParent = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK)));
        Node func = assignParent.getLastChild();
        assertEquals("x", NodeUtil.getFunctionName(func));
    }

    @Test
    public void testGetFunctionName_NoName() {
        Node parent = new Node(Token.EXPR_RESULT);
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        parent.addChildToBack(func);
        assertNull(NodeUtil.getFunctionName(func));
    }

    @Test
    public void testIsImmutableValue_String() {
        assertTrue(NodeUtil.isImmutableValue(stringNode));
    }

    @Test
    public void testIsImmutableValue_Number() {
        assertTrue(NodeUtil.isImmutableValue(numberNode));
    }

    @Test
    public void testIsImmutableValue_Null() {
        assertTrue(NodeUtil.isImmutableValue(nullNode));
    }

    @Test
    public void testIsImmutableValue_True() {
        assertTrue(NodeUtil.isImmutableValue(trueNode));
    }

    @Test
    public void testIsImmutableValue_False() {
        assertTrue(NodeUtil.isImmutableValue(falseNode));
    }

    @Test
    public void testIsImmutableValue_Void() {
        assertTrue(NodeUtil.isImmutableValue(voidNode));
    }

    @Test
    public void testIsImmutableValue_Neg() {
        assertTrue(NodeUtil.isImmutableValue(negNode));
    }

    @Test
    public void testIsImmutableValue_NameUndefined() {
        Node undef = Node.newString(Token.NAME, "undefined");
        assertTrue(NodeUtil.isImmutableValue(undef));
    }

    @Test
    public void testIsImmutableValue_NameInfinity() {
        Node inf = Node.newString(Token.NAME, "Infinity");
        assertTrue(NodeUtil.isImmutableValue(inf));
    }

    @Test
    public void testIsImmutableValue_NameNaN() {
        Node nan = Node.newString(Token.NAME, "NaN");
        assertTrue(NodeUtil.isImmutableValue(nan));
    }

    @Test
    public void testIsImmutableValue_OtherName() {
        assertFalse(NodeUtil.isImmutableValue(nameNode));
    }

    @Test
    public void testIsImmutableValue_OtherNode() {
        Node other = new Node(Token.THIS);
        assertFalse(NodeUtil.isImmutableValue(other));
    }

    @Test
    public void testIsLiteralValue_ArrayLit() {
        assertTrue(NodeUtil.isLiteralValue(arrayLitNode, false));
    }

    @Test
    public void testIsLiteralValue_ObjectLit() {
        assertTrue(NodeUtil.isLiteralValue(objectLitNode, false));
    }

    @Test
    public void testIsLiteralValue_Regexp() {
        assertTrue(NodeUtil.isLiteralValue(regexpNode, false));
    }

    @Test
    public void testIsLiteralValue_FunctionWithInclude() {
        assertTrue(NodeUtil.isLiteralValue(functionNode, true));
    }

    @Test
    public void testIsLiteralValue_FunctionWithoutInclude() {
        assertFalse(NodeUtil.isLiteralValue(functionNode, false));
    }

    @Test
    public void testIsLiteralValue_Immutable() {
        assertTrue(NodeUtil.isLiteralValue(numberNode, false));
    }

    @Test
    public void testIsLiteralValue_NonLiteralChild() {
        Node nonLitArray = new Node(Token.ARRAYLIT, new Node(Token.THIS));
        assertFalse(NodeUtil.isLiteralValue(nonLitArray, false));
    }

    @Test
    public void testIsValidDefineValue_String() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(stringNode, defines));
    }

    @Test
    public void testIsValidDefineValue_Number() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(numberNode, defines));
    }

    @Test
    public void testIsValidDefineValue_True() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(trueNode, defines));
    }

    @Test
    public void testIsValidDefineValue_False() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(falseNode, defines));
    }

    @Test
    public void testIsValidDefineValue_Unary() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(notNode, defines));
    }

    @Test
    public void testIsValidDefineValue_NameInDefines() {
        Set<String> defines = new HashSet<>();
        defines.add("x");
        assertTrue(NodeUtil.isValidDefineValue(nameNode, defines));
    }

    @Test
    public void testIsValidDefineValue_NameNotInDefines() {
        Set<String> defines = new HashSet<>();
        assertFalse(NodeUtil.isValidDefineValue(nameNode, defines));
    }

    @Test
    public void testIsValidDefineValue_Other() {
        Set<String> defines = new HashSet<>();
        Node other = new Node(Token.THIS);
        assertFalse(NodeUtil.isValidDefineValue(other, defines));
    }

    @Test
    public void testIsEmptyBlock_NotBlock() {
        assertFalse(NodeUtil.isEmptyBlock(numberNode));
    }

    @Test
    public void testIsEmptyBlock_EmptyBlock() {
        assertTrue(NodeUtil.isEmptyBlock(emptyBlockNode));
    }

    @Test
    public void testIsEmptyBlock_NonEmptyBlock() {
        assertFalse(NodeUtil.isEmptyBlock(blockNode));
    }

    @Test
    public void testIsEmptyBlock_BlockWithEmptyStmts() {
        Node emptyBlockWithEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(emptyBlockWithEmpty));
    }

    @Test
    public void testIsSimpleOperator_Add() {
        Node addNode = new Node(Token.ADD);
        assertTrue(NodeUtil.isSimpleOperator(addNode));
    }

    @Test
    public void testIsSimpleOperator_Assign() {
        assertFalse(NodeUtil.isSimpleOperator(assignNode));
    }

    @Test
    public void testMayEffectMutableState_Simple() {
        assertFalse(NodeUtil.mayEffectMutableState(numberNode));
    }

    @Test
    public void testMayEffectMutableState_Throw() {
        assertTrue(NodeUtil.mayEffectMutableState(throwNode));
    }

    @Test
    public void testMayEffectMutableState_ObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.mayEffectMutableState(objLit));
    }

    @Test
    public void testMayEffectMutableState_ArrayLit() {
        Node arrLit = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.mayEffectMutableState(arrLit));
    }

    @Test
    public void testMayEffectMutableState_Regexp() {
        assertTrue(NodeUtil.mayEffectMutableState(regexpNode));
    }

    @Test
    public void testMayEffectMutableState_Var() {
        assertTrue(NodeUtil.mayEffectMutableState(varNode));
    }

    @Test
    public void testMayEffectMutableState_NameWithChild() {
        Node nameWithChild = Node.newString(Token.NAME, "x");
        nameWithChild.addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.mayEffectMutableState(nameWithChild));
    }

    @Test
    public void testMayEffectMutableState_NameWithoutChild() {
        assertFalse(NodeUtil.mayEffectMutableState(nameNode));
    }

    @Test
    public void testMayEffectMutableState_Function() {
        assertTrue(NodeUtil.mayEffectMutableState(functionNode));
    }

    @Test
    public void testMayEffectMutableState_New() {
        assertTrue(NodeUtil.mayEffectMutableState(newNode));
    }

    @Test
    public void testMayEffectMutableState_Call() {
        Node callEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"));
        assertTrue(NodeUtil.mayEffectMutableState(callEval));
    }

    @Test
    public void testMayHaveSideEffects_Assign() {
        Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
        assertTrue(NodeUtil.mayHaveSideEffects(assign));
    }

    @Test
    public void testMayHaveSideEffects_Simple() {
        assertFalse(NodeUtil.mayHaveSideEffects(numberNode));
    }

    @Test
    public void testConstructorCallHasSideEffects_NoSideEffects() {
        Node noSideEffect = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(noSideEffect));
    }

    @Test
    public void testConstructorCallHasSideEffects_WithSideEffects() {
        Node withSideEffect = new Node(Token.NEW, Node.newString(Token.NAME, "CustomClass"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(withSideEffect));
    }

    @Test
    public void testConstructorCallHasSideEffects_NoSideEffectsCallFlag() {
        Node flagged = new Node(Token.NEW, Node.newString(Token.NAME, "Anything"));
        flagged.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(flagged));
    }

    @Test
    public void testFunctionCallHasSideEffects_NameBuiltin() {
        Node callString = new Node(Token.CALL, Node.newString(Token.NAME, "String"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callString));
    }

    @Test
    public void testFunctionCallHasSideEffects_NameOther() {
        Node callEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"));
        assertTrue(NodeUtil.functionCallHasSideEffects(callEval));
    }

    @Test
    public void testFunctionCallHasSideEffects_GetpropMath() {
        Node mathProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "random"));
        Node callMath = new Node(Token.CALL, mathProp);
        assertFalse(NodeUtil.functionCallHasSideEffects(callMath));
    }

    @Test
    public void testFunctionCallHasSideEffects_NoSideEffectsFlag() {
        Node flagged = new Node(Token.CALL, Node.newString(Token.NAME, "something"));
        flagged.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.functionCallHasSideEffects(flagged));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Assignment() {
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(assignNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Delprop() {
        Node delpropNode = new Node(Token.DELPROP);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(delpropNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Dec() {
        Node decNode = new Node(Token.DEC);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(decNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Inc() {
        Node incNode = new Node(Token.INC);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(incNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Throw() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(throwNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Call() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(callNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_New() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_NameWithChild() {
        Node nameWithChild = Node.newString(Token.NAME, "x");
        nameWithChild.addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_NameWithoutChild() {
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Other() {
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(numberNode));
    }

    @Test
    public void testCanBeSideEffected_Call() {
        assertTrue(NodeUtil.canBeSideEffected(callNode));
    }

    @Test
    public void testCanBeSideEffected_New() {
        assertTrue(NodeUtil.canBeSideEffected(newNode));
    }

    @Test
    public void testCanBeSideEffected_NameConstant() {
        Node constName = Node.newString(Token.NAME, "CONST");
        constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Set<String> emptySet = new HashSet<>();
        assertFalse(NodeUtil.canBeSideEffected(constName, emptySet));
    }

    @Test
    public void testCanBeSideEffected_NameKnownConstant() {
        Node knownName = Node.newString(Token.NAME, "KNOWN");
        Set<String> knownConstants = new HashSet<>();
        knownConstants.add("KNOWN");
        assertFalse(NodeUtil.canBeSideEffected(knownName, knownConstants));
    }

    @Test
    public void testCanBeSideEffected_Getprop() {
        assertTrue(NodeUtil.canBeSideEffected(getpropNode));
    }

    @Test
    public void testCanBeSideEffected_Getelem() {
        assertTrue(NodeUtil.canBeSideEffected(getelemNode));
    }

    @Test
    public void testCanBeSideEffected_FunctionExpression() {
        assertFalse(NodeUtil.canBeSideEffected(functionNode));
    }

    @Test
    public void testCanBeSideEffected_Other() {
        assertFalse(NodeUtil.canBeSideEffected(numberNode));
    }

    @Test
    public void testIsAssociative_Mul() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }

    @Test
    public void testIsAssociative_And() {
        assertTrue(NodeUtil.isAssociative(Token.AND));
    }

    @Test
    public void testIsAssociative_Or() {
        assertTrue(NodeUtil.isAssociative(Token.OR));
    }

    @Test
    public void testIsAssociative_Not() {
        assertFalse(NodeUtil.isAssociative(Token.NOT));
    }

    @Test
    public void testIsExpressionNode_ExprResult() {
        assertTrue(NodeUtil.isExpressionNode(exprResultNode));
    }

    @Test
    public void testIsExpressionNode_Other() {
        assertFalse(NodeUtil.isExpressionNode(numberNode));
    }

    @Test
    public void testContainsFunction_WithFunction() {
        Node parent = new Node(Token.BLOCK, functionNode);
        assertTrue(NodeUtil.containsFunction(parent));
    }

    @Test
    public void testContainsFunction_WithoutFunction() {
        assertFalse(NodeUtil.containsFunction(numberNode));
    }

    @Test
    public void testReferencesThis_WithThis() {
        Node thisNode = new Node(Token.THIS);
        Node parent = new Node(Token.BLOCK, thisNode);
        assertTrue(NodeUtil.referencesThis(parent));
    }

    @Test
    public void testReferencesThis_WithoutThis() {
        assertFalse(NodeUtil.referencesThis(numberNode));
    }

    @Test
    public void testGetFunctionName_NullName() {
        Node parent = new Node(Token.NAME, "");
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        parent.addChildToBack(func);
        assertNull(NodeUtil.getFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_WithFunctionName() {
        Node parent = new Node(Token.NAME, "g");
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        parent.addChildToBack(func);
        assertEquals("g", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_ObjectLitParent() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "funKey");
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        objLit.addChildrenToBack(key, func);
        Node parent = new Node(Token.OBJECTLIT);
        func.setParent(parent);
        assertEquals("funKey", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_NoName() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(func);
        assertNull(NodeUtil.getNearestFunctionName(func));
    }
}