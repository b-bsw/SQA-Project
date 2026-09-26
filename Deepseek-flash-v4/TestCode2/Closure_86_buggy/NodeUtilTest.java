package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class NodeUtilTest {
    private Node stringNode;
    private Node numberNode;
    private Node trueNode;
    private Node falseNode;
    private Node nullNode;
    private Node voidNode;
    private Node nameUndefined;
    private Node nameNaN;
    private Node nameInfinity;
    private Node nameOther;
    private Node blockEmpty;
    private Node blockWithNonEmpty;
    private Node blockWithOnlyEmpty;
    private Node functionNode;
    private Node assignNode;
    private Node commaNode;
    private Node notNode;
    private Node andNode;
    private Node orNode;
    private Node hookNode;
    private Node callNode;
    private Node newArrayNode;
    private Node newDateNode;
    private Node newCustomNode;
    private Node getPropNode;
    private Node getElemNode;
    private Node incNode;
    private Node decNode;
    private Node thisNode;
    private Node arraylitNode;
    private Node objectlitNode;
    private Node regexpNode;
    private Node varNode;
    private Node nameNode;
    private Node varWithInitNode;
    private Node exprResultNode;
    private Node forInNode;
    private Node forNode;
    private Node whileNode;
    private Node doNode;
    private Node ifNode;
    private Node tryNode;
    private Node catchNode;
    private Node switchNode;
    private Node caseNode;
    private Node defaultNode;
    private Node labelNode;
    private Node withNode;
    private Node throwNode;
    private Node scriptNode;
    private Node functionExprNode;
    private Node functionDeclNode;

    @Before
    public void setUp() {
        stringNode = Node.newString("hello");
        numberNode = Node.newNumber(42.0);
        trueNode = new Node(Token.TRUE);
        falseNode = new Node(Token.FALSE);
        nullNode = new Node(Token.NULL);
        voidNode = new Node(Token.VOID, Node.newNumber(0));
        nameUndefined = Node.newString(Token.NAME, "undefined");
        nameNaN = Node.newString(Token.NAME, "NaN");
        nameInfinity = Node.newString(Token.NAME, "Infinity");
        nameOther = Node.newString(Token.NAME, "x");
        blockEmpty = new Node(Token.BLOCK);
        blockWithNonEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));
        blockWithOnlyEmpty = new Node(Token.BLOCK, new Node(Token.EMPTY));

        functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToFront(Node.newString(Token.NAME, "f"));
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK));

        assignNode = new Node(Token.ASSIGN, nameOther, stringNode);
        commaNode = new Node(Token.COMMA, numberNode, trueNode);
        notNode = new Node(Token.NOT, falseNode);
        andNode = new Node(Token.AND, trueNode, falseNode);
        orNode = new Node(Token.OR, falseNode, trueNode);
        hookNode = new Node(Token.HOOK, trueNode, stringNode, numberNode);
        callNode = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
        newArrayNode = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
        newDateNode = new Node(Token.NEW, Node.newString(Token.NAME, "Date"));
        newCustomNode = new Node(Token.NEW, Node.newString(Token.NAME, "MyClass"));
        getPropNode = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "length"));
        getElemNode = new Node(Token.GETELEM, nameOther, numberNode);
        incNode = new Node(Token.INC, nameOther);
        incNode.putBooleanProp(Node.INCRDECR_PROP, true);
        decNode = new Node(Token.DEC, nameOther);
        decNode.putBooleanProp(Node.INCRDECR_PROP, false);
        thisNode = new Node(Token.THIS);
        arraylitNode = new Node(Token.ARRAYLIT, stringNode, numberNode);
        objectlitNode = new Node(Token.OBJECTLIT, new Node(Token.STRING, "key", stringNode));
        regexpNode = new Node(Token.REGEXP);
        varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        nameNode = Node.newString(Token.NAME, "x");
        varWithInitNode = new Node(Token.VAR, new Node(Token.NAME, "x", numberNode));
        exprResultNode = new Node(Token.EXPR_RESULT, assignNode);
        forInNode = new Node(Token.FOR, nameOther, nameOther, nameOther);
        forNode = new Node(Token.FOR, nameOther, numberNode, trueNode, new Node(Token.BLOCK));
        whileNode = new Node(Token.WHILE, trueNode, new Node(Token.BLOCK));
        doNode = new Node(Token.DO, new Node(Token.BLOCK), trueNode);
        ifNode = new Node(Token.IF, trueNode, new Node(Token.BLOCK));
        tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.CATCH));
        catchNode = new Node(Token.CATCH, nameOther, new Node(Token.BLOCK));
        switchNode = new Node(Token.SWITCH, nameOther);
        caseNode = new Node(Token.CASE, stringNode);
        defaultNode = new Node(Token.DEFAULT);
        labelNode = new Node(Token.LABEL, Node.newString(Token.LABEL_NAME, "label"), new Node(Token.BLOCK));
        withNode = new Node(Token.WITH, nameOther, new Node(Token.BLOCK));
        throwNode = new Node(Token.THROW, nameOther);
        scriptNode = new Node(Token.SCRIPT);
        functionExprNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        functionDeclNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "g"), new Node(Token.LP), new Node(Token.BLOCK));
        scriptNode.addChildToFront(functionDeclNode);
    }

    @Test
    public void testGetExpressionBooleanValueAssign() {
        assignNode.addChildToBack(Node.newNumber(1));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assignNode));
    }

    @Test
    public void testGetExpressionBooleanValueComma() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(commaNode));
    }

    @Test
    public void testGetExpressionBooleanValueNot() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(notNode));
    }

    @Test
    public void testGetExpressionBooleanValueAnd() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValueOr() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValueHookSame() {
        Node hookSame = new Node(Token.HOOK, trueNode, numberNode, numberNode);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookSame));
    }

    @Test
    public void testGetExpressionBooleanValueHookDifferent() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetBooleanValueString() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(stringNode));
        Node emptyString = Node.newString("");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(emptyString));
    }

    @Test
    public void testGetBooleanValueNumber() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(numberNode));
        Node zeroNode = Node.newNumber(0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(zeroNode));
    }

    @Test
    public void testGetBooleanValueNullFalseVoid() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nullNode));
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(falseNode));
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(voidNode));
    }

    @Test
    public void testGetBooleanValueName() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nameUndefined));
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nameNaN));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(nameInfinity));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(nameOther));
    }

    @Test
    public void testGetBooleanValueTrueArraylitObjectlitRegexp() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(arraylitNode));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(objectlitNode));
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(regexpNode));
    }

    @Test
    public void testGetStringValueString() {
        assertEquals("hello", NodeUtil.getStringValue(stringNode));
    }

    @Test
    public void testGetStringValueName() {
        assertEquals("undefined", NodeUtil.getStringValue(nameUndefined));
        assertEquals("Infinity", NodeUtil.getStringValue(nameInfinity));
        assertEquals("NaN", NodeUtil.getStringValue(nameNaN));
        assertNull(NodeUtil.getStringValue(nameOther));
    }

    @Test
    public void testGetStringValueNumber() {
        assertEquals("42", NodeUtil.getStringValue(numberNode));
        Node doubleNode = Node.newNumber(3.14);
        assertEquals("3.14", NodeUtil.getStringValue(doubleNode));
    }

    @Test
    public void testGetStringValueFalseTrueNull() {
        assertEquals("false", NodeUtil.getStringValue(falseNode));
        assertEquals("true", NodeUtil.getStringValue(trueNode));
        assertEquals("null", NodeUtil.getStringValue(nullNode));
    }

    @Test
    public void testGetStringValueVoid() {
        assertEquals("undefined", NodeUtil.getStringValue(voidNode));
    }

    @Test
    public void testGetNumberValueTrue() {
        assertEquals(1.0, NodeUtil.getNumberValue(trueNode), 0.0);
    }

    @Test
    public void testGetNumberValueFalseNull() {
        assertEquals(0.0, NodeUtil.getNumberValue(falseNode), 0.0);
        assertEquals(0.0, NodeUtil.getNumberValue(nullNode), 0.0);
    }

    @Test
    public void testGetNumberValueNumber() {
        assertEquals(42.0, NodeUtil.getNumberValue(numberNode), 0.0);
    }

    @Test
    public void testGetNumberValueVoid() {
        assertEquals(Double.NaN, NodeUtil.getNumberValue(voidNode), 0.0);
    }

    @Test
    public void testGetNumberValueName() {
        assertEquals(Double.NaN, NodeUtil.getNumberValue(nameUndefined), 0.0);
        assertEquals(Double.NaN, NodeUtil.getNumberValue(nameNaN), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(nameInfinity), 0.0);
        assertNull(NodeUtil.getNumberValue(nameOther));
    }

    @Test
    public void testGetFunctionNameNameParent() {
        Node nameParent = new Node(Token.NAME, functionNode);
        functionNode.setParent(nameParent);
        assertEquals("x", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionNameAssignParent() {
        Node assignParent = new Node(Token.ASSIGN, nameOther, functionNode);
        functionNode.setParent(assignParent);
        assertEquals("x", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionNameOtherParent() {
        Node otherParent = new Node(Token.BLOCK);
        functionNode.setParent(otherParent);
        assertEquals("f", NodeUtil.getFunctionName(functionNode));
    }

    @Test
    public void testGetFunctionNameEmptyName() {
        Node funcNoName = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        funcNoName.setParent(new Node(Token.BLOCK));
        assertNull(NodeUtil.getFunctionName(funcNoName));
    }

    @Test
    public void testIsImmutableValueString() {
        assertTrue(NodeUtil.isImmutableValue(stringNode));
    }

    @Test
    public void testIsImmutableValueNumber() {
        assertTrue(NodeUtil.isImmutableValue(numberNode));
    }

    @Test
    public void testIsImmutableValueNullTrueFalse() {
        assertTrue(NodeUtil.isImmutableValue(nullNode));
        assertTrue(NodeUtil.isImmutableValue(trueNode));
        assertTrue(NodeUtil.isImmutableValue(falseNode));
    }

    @Test
    public void testIsImmutableValueVoidNeg() {
        assertTrue(NodeUtil.isImmutableValue(voidNode));
        Node negNode = new Node(Token.NEG, numberNode);
        assertTrue(NodeUtil.isImmutableValue(negNode));
    }

    @Test
    public void testIsImmutableValueNameSpecial() {
        assertTrue(NodeUtil.isImmutableValue(nameUndefined));
        assertTrue(NodeUtil.isImmutableValue(nameInfinity));
        assertTrue(NodeUtil.isImmutableValue(nameNaN));
        assertFalse(NodeUtil.isImmutableValue(nameOther));
    }

    @Test
    public void testIsLiteralValueArraylitRegexp() {
        assertTrue(NodeUtil.isLiteralValue(arraylitNode, false));
        assertTrue(NodeUtil.isLiteralValue(regexpNode, false));
    }

    @Test
    public void testIsLiteralValueObjectlit() {
        assertTrue(NodeUtil.isLiteralValue(objectlitNode, false));
    }

    @Test
    public void testIsLiteralValueFunction() {
        assertFalse(NodeUtil.isLiteralValue(functionNode, false));
        assertTrue(NodeUtil.isLiteralValue(functionExprNode, true));
    }

    @Test
    public void testIsLiteralValueDefault() {
        assertTrue(NodeUtil.isLiteralValue(stringNode, false));
    }

    @Test
    public void testIsValidDefineValueStringNumberTrueFalse() {
        Set<String> defines = new HashSet<>();
        assertTrue(NodeUtil.isValidDefineValue(stringNode, defines));
        assertTrue(NodeUtil.isValidDefineValue(numberNode, defines));
        assertTrue(NodeUtil.isValidDefineValue(trueNode, defines));
        assertTrue(NodeUtil.isValidDefineValue(falseNode, defines));
    }

    @Test
    public void testIsValidDefineValueBinary() {
        Set<String> defines = new HashSet<>();
        Node addNode = new Node(Token.ADD, numberNode, numberNode);
        assertTrue(NodeUtil.isValidDefineValue(addNode, defines));
    }

    @Test
    public void testIsValidDefineValueUnary() {
        Set<String> defines = new HashSet<>();
        Node notNodeUnary = new Node(Token.NOT, numberNode);
        assertTrue(NodeUtil.isValidDefineValue(notNodeUnary, defines));
    }

    @Test
    public void testIsValidDefineValueNameGetprop() {
        Set<String> defines = new HashSet<>(Arrays.asList("a.b"));
        Node nameNodeVal = Node.newString(Token.NAME, "a");
        Node getpropNode = new Node(Token.GETPROP, nameNodeVal, Node.newString(Token.STRING, "b"));
        assertTrue(NodeUtil.isValidDefineValue(getpropNode, defines));
    }

    @Test
    public void testIsValidDefineValueNameNotInDefines() {
        Set<String> defines = new HashSet<>();
        assertFalse(NodeUtil.isValidDefineValue(nameOther, defines));
    }

    @Test
    public void testIsEmptyBlockNotBlock() {
        assertFalse(NodeUtil.isEmptyBlock(stringNode));
    }

    @Test
    public void testIsEmptyBlockEmptyBlock() {
        assertTrue(NodeUtil.isEmptyBlock(blockEmpty));
    }

    @Test
    public void testIsEmptyBlockBlockWithOnlyEmpty() {
        assertTrue(NodeUtil.isEmptyBlock(blockWithOnlyEmpty));
    }

    @Test
    public void testIsEmptyBlockBlockWithNonEmpty() {
        assertFalse(NodeUtil.isEmptyBlock(blockWithNonEmpty));
    }

    @Test
    public void testIsSimpleOperatorTrue() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    }

    @Test
    public void testIsSimpleOperatorFalse() {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.FUNCTION)));
    }

    @Test
    public void testMayEffectMutableStateNew() {
        assertTrue(NodeUtil.mayEffectMutableState(newArrayNode));
    }

    @Test
    public void testMayEffectMutableStateThrow() {
        assertTrue(NodeUtil.mayEffectMutableState(throwNode));
    }

    @Test
    public void testMayEffectMutableStateVar() {
        assertTrue(NodeUtil.mayEffectMutableState(varNode));
    }

    @Test
    public void testMayEffectMutableStateNameWithChild() {
        nameNode.addChildToFront(numberNode);
        assertTrue(NodeUtil.mayEffectMutableState(nameNode));
    }

    @Test
    public void testMayEffectMutableStateFunction() {
        assertFalse(NodeUtil.mayEffectMutableState(functionExprNode));
    }

    @Test
    public void testMayEffectMutableStateNewNoSideEffects() {
        assertFalse(NodeUtil.mayEffectMutableState(newArrayNode));
    }

    @Test
    public void testMayEffectMutableStateCallNoSideEffects() {
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "Object"));
        assertFalse(NodeUtil.mayEffectMutableState(call));
    }

    @Test
    public void testMayEffectMutableStateAssignTargetLocal() {
        Node assignLocal = new Node(Token.ASSIGN, nameOther, stringNode);
        assertTrue(NodeUtil.mayEffectMutableState(assignLocal));
    }

    @Test
    public void testMayHaveSideEffectsThrow() {
        assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
    }

    @Test
    public void testMayHaveSideEffectsNewCheckFalse() {
        assertFalse(NodeUtil.mayHaveSideEffects(newArrayNode));
    }

    @Test
    public void testMayHaveSideEffectsCallNoSideEffects() {
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "Array"));
        assertFalse(NodeUtil.mayHaveSideEffects(call));
    }

    @Test
    public void testConstructorCallHasSideEffectsNoSideEffectsCall() {
        newArrayNode.setNoSideEffectsCall(true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(newArrayNode));
    }

    @Test
    public void testConstructorCallHasSideEffectsNameInSet() {
        assertFalse(NodeUtil.constructorCallHasSideEffects(newArrayNode));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newDateNode));
    }

    @Test
    public void testConstructorCallHasSideEffectsNameNotInSet() {
        assertTrue(NodeUtil.constructorCallHasSideEffects(newCustomNode));
    }

    @Test(expected = IllegalStateException.class)
    public void testConstructorCallHasSideEffectsNotNew() {
        NodeUtil.constructorCallHasSideEffects(callNode);
    }

    @Test
    public void testFunctionCallHasSideEffectsNoSideEffectsCall() {
        callNode.setNoSideEffectsCall(true);
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test
    public void testFunctionCallHasSideEffectsNameBuiltin() {
        Node callBuiltin = new Node(Token.CALL, Node.newString(Token.NAME, "Object"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callBuiltin));
    }

    @Test
    public void testFunctionCallHasSideEffectsGetpropObjectMethods() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "toString"));
        Node callMethod = new Node(Token.CALL, getprop, stringNode);
        assertFalse(NodeUtil.functionCallHasSideEffects(callMethod));
    }

    @Test
    public void testFunctionCallHasSideEffectsGetpropMath() {
        Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "random"));
        Node callMath = new Node(Token.CALL, getprop);
        assertFalse(NodeUtil.functionCallHasSideEffects(callMath));
    }

    @Test
    public void testFunctionCallHasSideEffectsDefault() {
        assertTrue(NodeUtil.functionCallHasSideEffects(callNode));
    }

    @Test(expected = IllegalStateException.class)
    public void testFunctionCallHasSideEffectsNotCall() {
        NodeUtil.functionCallHasSideEffects(newNode);
    }

    @Test
    public void testNodeTypeMayHaveSideEffectsAssignment() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(assignNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffectsDelpropDecIncThrow() {
        Node delprop = new Node(Token.DELPROP);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(delprop));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(incNode));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(decNode));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(throwNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffectsCallNew() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(callNode));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newArrayNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffectsNameWithChildren() {
        nameNode.addChildToFront(numberNode);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testNodeTypeMayHaveSideEffectsNameNoChildren() {
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(nameNode));
    }

    @Test
    public void testCanBeSideEffectedCallNew() {
        assertTrue(NodeUtil.canBeSideEffected(callNode));
        assertTrue(NodeUtil.canBeSideEffected(newArrayNode));
    }

    @Test
    public void testCanBeSideEffectedNameNotConstant() {
        assertTrue(NodeUtil.canBeSideEffected(nameOther));
    }

    @Test
    public void testCanBeSideEffectedNameConstant() {
        Node constantName = Node.newString(Token.NAME, "CONST");
        constantName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(constantName, Collections.<String>emptySet()));
    }

    @Test
    public void testCanBeSideEffectedGetpropGetelem() {
        assertTrue(NodeUtil.canBeSideEffected(getPropNode));
        assertTrue(NodeUtil.canBeSideEffected(getElemNode));
    }

    @Test
    public void testCanBeSideEffectedFunctionExpression() {
        assertFalse(NodeUtil.canBeSideEffected(functionExprNode));
    }

    @Test
    public void testCanBeSideEffectedOther() {
        assertFalse(NodeUtil.canBeSideEffected(numberNode));
    }

    @Test
    public void testPrecedenceComma() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
    }

    @Test
    public void testPrecedenceAssign() {
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    }

    @Test
    public void testPrecedenceHook() {
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
    }

    @Test
    public void testPrecedenceOr() {
        assertEquals(3, NodeUtil.precedence(Token.OR));
    }

    @Test
    public void testPrecedenceAnd() {
        assertEquals(4, NodeUtil.precedence(Token.AND));
    }

    @Test
    public void testPrecedenceBitwise() {
        assertEquals(5, NodeUtil.precedence(Token.BITOR));
        assertEquals(6, NodeUtil.precedence(Token.BITXOR));
        assertEquals(7, NodeUtil.precedence(Token.BITAND));
    }

    @Test
    public void testPrecedenceEquality() {
        assertEquals(8, NodeUtil.precedence(Token.EQ));
    }

    @Test
    public void testPrecedenceRelational() {
        assertEquals(9, NodeUtil.precedence(Token.LT));
    }

    @Test
    public void testPrecedenceShift() {
        assertEquals(10, NodeUtil.precedence(Token.LSH));
    }

    @Test
    public void testPrecedenceAddSub() {
        assertEquals(11, NodeUtil.precedence(Token.ADD));
    }

    @Test
    public void testPrecedenceMulDiv() {
        assertEquals(12, NodeUtil.precedence(Token.MUL));
    }

    @Test
    public void testPrecedenceUnary() {
        assertEquals(13, NodeUtil.precedence(Token.NOT));
    }

    @Test
    public void testPrecedencePrimary() {
        assertEquals(15, NodeUtil.precedence(Token.NAME));
    }

    @Test
    public void testIsAssociativeTrue() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
        assertTrue(NodeUtil.isAssociative(Token.AND));
    }

    @Test
    public void testIsAssociativeFalse() {
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsCommutativeTrue() {
        assertTrue(NodeUtil.isCommutative(Token.MUL));
    }

    @Test
    public void testIsCommutativeFalse() {
        assertFalse(NodeUtil.isCommutative(Token.ADD));
    }

    @Test
    public void testIsAssignmentOpTrue() {
        assertTrue(NodeUtil.isAssignmentOp(assignNode));
        Node assignBitOr = new Node(Token.ASSIGN_BITOR);
        assertTrue(NodeUtil.isAssignmentOp(assignBitOr));
    }

    @Test
    public void testIsAssignmentOpFalse() {
        assertFalse(NodeUtil.isAssignmentOp(numberNode));
    }

    @Test
    public void testGetOpFromAssignmentOp() {
        assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOpInvalid() {
        NodeUtil.getOpFromAssignmentOp(assignNode);
    }

    @Test
    public void testIsExpressionNodeTrue() {
        assertTrue(NodeUtil.isExpressionNode(exprResultNode));
    }

    @Test
    public void testIsExpressionNodeFalse() {
        assertFalse(NodeUtil.isExpressionNode(numberNode));
    }

    @Test
    public void testContainsFunctionTrue() {
        assertTrue(NodeUtil.containsFunction(functionNode));
    }

    @Test
    public void testContainsFunctionFalse() {
        assertFalse(NodeUtil.containsFunction(numberNode));
    }

    @Test
    public void testReferencesThisTrue() {
        Node body = new Node(Token.BLOCK, thisNode);
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), body);
        assertTrue(NodeUtil.referencesThis(body));
    }

    @Test
    public void testReferencesThisFalse() {
        assertFalse(NodeUtil.referencesThis(numberNode));
    }

    @Test
    public void testIsGetProp() {
        assertTrue(NodeUtil.isGetProp(getPropNode));
        assertFalse(NodeUtil.isGetProp(getElemNode));
    }

    @Test
    public void testIsGet() {
        assertTrue(NodeUtil.isGet(getPropNode));
        assertTrue(NodeUtil.isGet(getElemNode));
        assertFalse(NodeUtil.isGet(numberNode));
    }

    @Test
    public void testIsNameTrue() {
        assertTrue(NodeUtil.isName(nameNode));
    }

    @Test
    public void testIsNameFalse() {
        assertFalse(NodeUtil.isName(numberNode));
    }

    @Test
    public void testIsNewTrue() {
        assertTrue(NodeUtil.isNew(newArrayNode));
    }

    @Test
    public void testIsNewFalse() {
        assertFalse(NodeUtil.isNew(callNode));
    }

    @Test
    public void testIsVarTrue() {
        assertTrue(NodeUtil.isVar(varNode));
    }

    @Test
    public void testIsVarFalse() {
        assertFalse(NodeUtil.isVar(numberNode));
    }

    @Test
    public void testIsVarDeclarationTrue() {
        Node varDecl = new Node(Token.VAR, nameOther);
        nameOther.setParent(varDecl);
        assertTrue(NodeUtil.isVarDeclaration(nameOther));
    }

    @Test
    public void testIsVarDeclarationFalse() {
        assertFalse(NodeUtil.isVarDeclaration(nameOther));
    }

    @Test
    public void testGetAssignedValueVar() {
        Node var = new Node(Token.VAR, nameNode);
        nameNode.setParent(var);
        nameNode.addChildToFront(numberNode);
        assertEquals(numberNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValueAssign() {
        Node assign = new Node(Token.ASSIGN, nameNode, numberNode);
        nameNode.setParent(assign);
        assertEquals(numberNode, NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testGetAssignedValueNull() {
        assertNull(NodeUtil.getAssignedValue(nameNode));
    }

    @Test
    public void testIsStringTrue() {
        assertTrue(NodeUtil.isString(stringNode));
    }

    @Test
    public void testIsStringFalse() {
        assertFalse(NodeUtil.isString(numberNode));
    }

    @Test
    public void testIsExprAssignTrue() {
        assertTrue(NodeUtil.isExprAssign(exprResultNode));
    }

    @Test
    public void testIsExprAssignFalse() {
        assertFalse(NodeUtil.isExprAssign(numberNode));
    }

    @Test
    public void testIsAssignTrue() {
        assertTrue(NodeUtil.isAssign(assignNode));
    }

    @Test
    public void testIsAssignFalse() {
        assertFalse(NodeUtil.isAssign(numberNode));
    }

    @Test
    public void testIsExprCallTrue() {
        Node exprCall = new Node(Token.EXPR_RESULT, callNode);
        assertTrue(NodeUtil.isExprCall(exprCall));
    }

    @Test
    public void testIsExprCallFalse() {
        assertFalse(NodeUtil.isExprCall(exprResultNode));
    }

    @Test
    public void testIsForInTrue() {
        assertTrue(NodeUtil.isForIn(forInNode));
    }

    @Test
    public void testIsForInFalse() {
        assertFalse(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsLoopStructureTrue() {
        assertTrue(NodeUtil.isLoopStructure(forNode));
        assertTrue(NodeUtil.isLoopStructure(whileNode));
        assertTrue(NodeUtil.isLoopStructure(doNode));
    }

    @Test
    public void testIsLoopStructureFalse() {
        assertFalse(NodeUtil.isLoopStructure(ifNode));
    }

    @Test
    public void testGetLoopCodeBlockForWhile() {
        assertEquals(forNode.getLastChild(), NodeUtil.getLoopCodeBlock(forNode));
        assertEquals(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));
    }

    @Test
    public void testGetLoopCodeBlockDo() {
        assertEquals(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));
    }

    @Test
    public void testGetLoopCodeBlockOther() {
        assertNull(NodeUtil.getLoopCodeBlock(numberNode));
    }

    @Test
    public void testIsWithinLoopTrue() {
        Node forBlock = forNode.getLastChild();
        Node nameInside = Node.newString(Token.NAME, "y");
        forBlock.addChildToFront(nameInside);
        assertTrue(NodeUtil.isWithinLoop(nameInside));
    }

    @Test
    public void testIsWithinLoopFalse() {
        assertFalse(NodeUtil.isWithinLoop(nameNode));
    }

    @Test
    public void testIsControlStructureTrue() {
        assertTrue(NodeUtil.isControlStructure(ifNode));
        assertTrue(NodeUtil.isControlStructure(forNode));
        assertTrue(NodeUtil.isControlStructure(tryNode));
    }

    @Test
    public void testIsControlStructureFalse() {
        assertFalse(NodeUtil.isControlStructure(numberNode));
    }

    @Test
    public void testIsControlStructureCodeBlock() {
        assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementBlockScriptBlock() {
        assertTrue(NodeUtil.isStatementBlock(scriptNode));
        assertTrue(NodeUtil.isStatementBlock(blockEmpty));
    }

    @Test
    public void testIsStatementBlockOther() {
        assertFalse(NodeUtil.isStatementBlock(numberNode));
    }

    @Test
    public void testIsStatementTrue() {
        Node stmt = new Node(Token.EXPR_RESULT);
        scriptNode.addChildToFront(stmt);
        stmt.setParent(scriptNode);
        assertTrue(NodeUtil.isStatement(stmt));
    }

    @Test
    public void testIsStatementFalse() {
        assertFalse(NodeUtil.isStatement(numberNode));
    }

    @Test
    public void testIsSwitchCaseCase() {
        assertTrue(NodeUtil.isSwitchCase(caseNode));
    }

    @Test
    public void testIsSwitchCaseDefault() {
        assertTrue(NodeUtil.isSwitchCase(defaultNode));
    }

    @Test
    public void testIsSwitchCaseOther() {
        assertFalse(NodeUtil.isSwitchCase(numberNode));
    }

    @Test
    public void testIsReferenceNameTrue() {
        assertTrue(NodeUtil.isReferenceName(nameNode));
    }

    @Test
    public void testIsReferenceNameEmpty() {
        Node emptyName = Node.newString(Token.NAME, "");
        assertFalse(NodeUtil.isReferenceName(emptyName));
    }

    @Test
    public void testIsLabelNameTrue() {
        Node labelName = Node.newString(Token.LABEL_NAME, "label");
        assertTrue(NodeUtil.isLabelName(labelName));
    }

    @Test
    public void testIsLabelNameNull() {
        assertFalse(NodeUtil.isLabelName(null));
    }

    @Test
    public void testIsTryFinallyNodeTrue() {
        Node tryNode3 = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
        Node finallyBlock = tryNode3.getLastChild();
        assertTrue(NodeUtil.isTryFinallyNode(tryNode3, finallyBlock));
    }

    @Test
    public void testIsTryFinallyNodeFalse() {
        assertFalse(NodeUtil.isTryFinallyNode(tryNode, tryNode.getFirstChild()));
    }

    @Test
    public void testIsCallTrue() {
        assertTrue(NodeUtil.isCall(callNode));
    }

    @Test
    public void testIsCallFalse() {
        assertFalse(NodeUtil.isCall(numberNode));
    }

    @Test
    public void testIsCallOrNewCall() {
        assertTrue(NodeUtil.isCallOrNew(callNode));
    }

    @Test
    public void testIsCallOrNewNew() {
        assertTrue(NodeUtil.isCallOrNew(newArrayNode));
    }

    @Test
    public void testIsCallOrNewOther() {
        assertFalse(NodeUtil.isCallOrNew(numberNode));
    }

    @Test
    public void testIsFunctionTrue() {
        assertTrue(NodeUtil.isFunction(functionNode));
    }

    @Test
    public void testIsFunctionFalse() {
        assertFalse(NodeUtil.isFunction(numberNode));
    }

    @Test
    public void testGetFunctionBody() {
        Node body = functionNode.getLastChild();
        assertEquals(body, NodeUtil.getFunctionBody(functionNode));
    }

    @Test
    public void testIsThisTrue() {
        assertTrue(NodeUtil.isThis(thisNode));
    }

    @Test
    public void testIsThisFalse() {
        assertFalse(NodeUtil.isThis(numberNode));
    }

    @Test
    public void testContainsCallTrue() {
        assertTrue(NodeUtil.containsCall(callNode));
    }

    @Test
    public void testContainsCallFalse() {
        assertFalse(NodeUtil.containsCall(numberNode));
    }

    @Test
    public void testIsFunctionDeclarationTrue() {
        assertTrue(NodeUtil.isFunctionDeclaration(functionDeclNode));
    }

    @Test
    public void testIsFunctionDeclarationFalse() {
        assertFalse(NodeUtil.isFunctionDeclaration(functionExprNode));
    }

    @Test
    public void testIsHoistedFunctionDeclarationTrue() {
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(functionDeclNode));
    }

    @Test
    public void testIsHoistedFunctionDeclarationFalse() {
        Node innerFunc = new Node(Token.FUNCTION, Node.newString(Token.NAME, "h"), new Node(Token.LP), new Node(Token.BLOCK));
        Node block = new Node(Token.BLOCK, innerFunc);
        innerFunc.setParent(block);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(innerFunc));
    }

    @Test
    public void testIsFunctionExpressionTrue() {
        assertTrue(NodeUtil.isFunctionExpression(functionExprNode));
    }

    @Test
    public void testIsFunctionExpressionFalse() {
        assertFalse(NodeUtil.isFunctionExpression(functionNode));
    }

    @Test
    public void testIsEmptyFunctionExpressionTrue() {
        assertTrue(NodeUtil.isEmptyFunctionExpression(functionExprNode));
    }

    @Test
    public void testIsEmptyFunctionExpressionFalse() {
        assertFalse(NodeUtil.isEmptyFunctionExpression(functionNode));
    }

    @Test
    public void testIsVarArgsFunctionTrue() {
        Node body = functionNode.getLastChild();
        Node argRef = Node.newString(Token.NAME, "arguments");
        body.addChildToFront(argRef);
        assertTrue(NodeUtil.isVarArgsFunction(functionNode));
    }

    @Test
    public void testIsVarArgsFunctionFalse() {
        assertFalse(NodeUtil.isVarArgsFunction(functionNode));
    }

    @Test
    public void testIsObjectCallMethodTrue() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getprop);
        assertTrue(NodeUtil.isObjectCallMethod(call, "call"));
    }

    @Test
    public void testIsObjectCallMethodFalse() {
        assertFalse(NodeUtil.isObjectCallMethod(callNode, "call"));
    }

    @Test
    public void testIsFunctionObjectCallTrue() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getprop);
        assertTrue(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectApplyTrue() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "apply"));
        Node call = new Node(Token.CALL, getprop);
        assertTrue(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApplyTrue() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getprop);
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCallTrue() {
        Node getprop = new Node(Token.GETPROP, Node.newString(Token.NAME, "f"), Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getprop);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCallFalse() {
        Node getprop = new Node(Token.GETPROP, stringNode, Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getprop);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsLhsAssign() {
        assertTrue(NodeUtil.isLhs(nameOther, assignNode));
    }

    @Test
    public void testIsLhsVar() {
        assertTrue(NodeUtil.isLhs(nameNode, varNode));
    }

    @Test
    public void testIsLhsFalse() {
        assertFalse(NodeUtil.isLhs(nameOther, numberNode));
    }

    @Test
    public void testIsObjectLitKeyString() {
        Node key = Node.newString(Token.STRING, "key");
        Node obj = new Node(Token.OBJECTLIT, key);
        assertTrue(NodeUtil.isObjectLitKey(key, obj));
    }

    @Test
    public void testIsObjectLitKeyNumber() {
        Node key = Node.newNumber(0);
        Node obj = new Node(Token.OBJECTLIT, key);
        assertTrue(NodeUtil.isObjectLitKey(key, obj));
    }

    @Test
    public void testIsObjectLitKeyGetSet() {
        Node getter = new Node(Token.GET);
        assertTrue(NodeUtil.isObjectLitKey(getter, null));
    }

    @Test
    public void testIsObjectLitKeyOther() {
        assertFalse(NodeUtil.isObjectLitKey(numberNode, null));
    }

    @Test
    public void testIsGetOrSetKeyTrue() {
        Node getter = new Node(Token.GET);
        assertTrue(NodeUtil.isGetOrSetKey(getter));
        Node setter = new Node(Token.SET);
        assertTrue(NodeUtil.isGetOrSetKey(setter));
    }

    @Test
    public void testIsGetOrSetKeyFalse() {
        assertFalse(NodeUtil.isGetOrSetKey(numberNode));
    }

    @Test
    public void testOpToStrBitor() {
        assertEquals("|", NodeUtil.opToStr(Token.BITOR));
    }

    @Test
    public void testOpToStrOr() {
        assertEquals("||", NodeUtil.opToStr(Token.OR));
    }

    @Test
    public void testOpToStrSheq() {
        assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    }

    @Test
    public void testOpToStrDefault() {
        assertNull(NodeUtil.opToStr(Token.FUNCTION));
    }

    @Test
    public void testOpToStrNoFail() {
        assertEquals("||", NodeUtil.opToStrNoFail(Token.OR));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFailUnknown() {
        NodeUtil.opToStrNoFail(Token.FUNCTION);
    }

    @Test
    public void testGetVarsDeclaredInBranchEmpty() {
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(blockEmpty);
        assertTrue(vars.isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranchWithVar() {
        Node branch = new Node(Token.BLOCK, varNode);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(1, vars.size());
        assertEquals("x", vars.iterator().next().getString());
    }

    @Test
    public void testIsPrototypePropertyDeclarationTrue() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "prototype"));
        Node getprop2 = new Node(Token.GETPROP, getprop, Node.newString(Token.STRING, "method"));
        Node assign = new Node(Token.ASSIGN, getprop2, stringNode);
        Node expr = new Node(Token.EXPR_RESULT, assign);
        assertTrue(NodeUtil.isPrototypePropertyDeclaration(expr));
    }

    @Test
    public void testIsPrototypePropertyDeclarationFalse() {
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(exprResultNode));
    }

    @Test
    public void testIsPrototypePropertyTrue() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "prototype"));
        Node getprop2 = new Node(Token.GETPROP, getprop, Node.newString(Token.STRING, "method"));
        assertTrue(NodeUtil.isPrototypeProperty(getprop2));
    }

    @Test
    public void testIsPrototypePropertyFalse() {
        assertFalse(NodeUtil.isPrototypeProperty(nameOther));
    }

    @Test
    public void testGetPrototypeClassName() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "prototype"));
        assertEquals(nameOther, NodeUtil.getPrototypeClassName(getprop));
    }

    @Test
    public void testGetPrototypeClassNameNotFound() {
        assertNull(NodeUtil.getPrototypeClassName(nameOther));
    }

    @Test
    public void testGetPrototypePropertyName() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "prototype"));
        Node getprop2 = new Node(Token.GETPROP, getprop, Node.newString(Token.STRING, "method"));
        assertEquals("method", NodeUtil.getPrototypePropertyName(getprop2));
    }

    @Test
    public void testNewUndefinedNode() {
        Node undef = NodeUtil.newUndefinedNode(null);
        assertEquals(Token.VOID, undef.getType());
        assertNotNull(undef.getFirstChild());
    }

    @Test
    public void testNewVarNodeWithValue() {
        Node var = NodeUtil.newVarNode("x", numberNode);
        assertEquals(Token.VAR, var.getType());
        Node name = var.getFirstChild();
        assertEquals(Token.NAME, name.getType());
        assertEquals("x", name.getString());
        assertEquals(numberNode, name.getFirstChild());
    }

    @Test
    public void testNewVarNodeNoValue() {
        Node var = NodeUtil.newVarNode("x", null);
        assertEquals(Token.VAR, var.getType());
        Node name = var.getFirstChild();
        assertNull(name.getFirstChild());
    }

    @Test
    public void testHasMatchNodeType() {
        assertTrue(NodeUtil.has(stringNode, new NodeUtil.MatchNodeType(Token.STRING), Predicates.<Node>alwaysTrue()));
        assertFalse(NodeUtil.has(numberNode, new NodeUtil.MatchNodeType(Token.STRING), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testHasMatchNameNode() {
        assertTrue(NodeUtil.has(nameOther, new NodeUtil.MatchNameNode("x"), Predicates.<Node>alwaysTrue()));
        assertFalse(NodeUtil.has(nameOther, new NodeUtil.MatchNameNode("y"), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testGetCount() {
        Node root = new Node(Token.BLOCK, stringNode, numberNode);
        assertEquals(1, NodeUtil.getCount(root, new NodeUtil.MatchNodeType(Token.STRING), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testGetCountNoMatch() {
        assertEquals(0, NodeUtil.getCount(numberNode, new NodeUtil.MatchNodeType(Token.STRING), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testVisitPreOrder() {
        final int[] count = {0};
        NodeUtil.visitPreOrder(stringNode, new NodeUtil.Visitor() {
            public void visit(Node node) {
                count[0]++;
            }
        }, Predicates.<Node>alwaysTrue());
        assertEquals(1, count[0]);
    }

    @Test
    public void testVisitPostOrder() {
        final int[] count = {0};
        NodeUtil.visitPostOrder(stringNode, new NodeUtil.Visitor() {
            public void visit(Node node) {
                count[0]++;
            }
        }, Predicates.<Node>alwaysTrue());
        assertEquals(1, count[0]);
    }

    @Test
    public void testHasFinallyTrue() {
        Node tryNode3 = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK), new Node(Token.BLOCK));
        assertTrue(NodeUtil.hasFinally(tryNode3));
    }

    @Test
    public void testHasFinallyFalse() {
        assertFalse(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testGetCatchBlock() {
        Node catchBlock = tryNode.getFirstChild().getNext();
        assertEquals(catchBlock, NodeUtil.getCatchBlock(tryNode));
    }

    @Test
    public void testHasCatchHandlerTrue() {
        Node block = new Node(Token.BLOCK, catchNode);
        assertTrue(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testHasCatchHandlerFalse() {
        assertFalse(NodeUtil.hasCatchHandler(blockEmpty));
    }

    @Test
    public void testGetFnParameters() {
        Node params = functionNode.getFirstChild().getNext();
        assertEquals(params, NodeUtil.getFnParameters(functionNode));
    }

    @Test
    public void testIsConstantNameTrue() {
        Node constantName = Node.newString(Token.NAME, "CONST");
        constantName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(constantName));
    }

    @Test
    public void testIsConstantNameFalse() {
        assertFalse(NodeUtil.isConstantName(nameOther));
    }

    @Test
    public void testGetInfoForNameNodeNull() {
        assertNull(NodeUtil.getInfoForNameNode(null));
    }

    @Test
    public void testGetInfoForNameNodeWithInfo() {
        Node name = Node.newString(Token.NAME, "x");
        JSDocInfo info = new JSDocInfo();
        name.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getInfoForNameNode(name));
    }

    @Test
    public void testGetInfoForNameNodeFromParentVar() {
        Node name = Node.newString(Token.NAME, "x");
        Node var = new Node(Token.VAR, name);
        JSDocInfo info = new JSDocInfo();
        var.setJSDocInfo(info);
        name.setParent(var);
        assertEquals(info, NodeUtil.getInfoForNameNode(name));
    }

    @Test
    public void testGetFunctionInfoFromNode() {
        JSDocInfo info = new JSDocInfo();
        functionNode.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getFunctionInfo(functionNode));
    }

    @Test
    public void testGetFunctionInfoFromAssignParent() {
        Node assign = new Node(Token.ASSIGN, nameOther, functionNode);
        functionNode.setParent(assign);
        JSDocInfo info = new JSDocInfo();
        assign.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getFunctionInfo(functionNode));
    }

    @Test
    public void testGetSourceName() {
        stringNode.putProp(Node.SOURCENAME_PROP, "test.js");
        assertEquals("test.js", NodeUtil.getSourceName(stringNode));
    }

    @Test
    public void testGetSourceNameFromParent() {
        Node parent = new Node(Token.BLOCK);
        parent.putProp(Node.SOURCENAME_PROP, "test.js");
        parent.addChildToFront(stringNode);
        stringNode.setParent(parent);
        assertEquals("test.js", NodeUtil.getSourceName(stringNode));
    }

    @Test
    public void testGetSourceNameNull() {
        assertNull(NodeUtil.getSourceName(stringNode));
    }

    @Test
    public void testNewCallNode() {
        Node call = NodeUtil.newCallNode(nameOther, numberNode, stringNode);
        assertEquals(Token.CALL, call.getType());
        assertTrue(call.getBooleanProp(Node.FREE_CALL));
        assertEquals(nameOther, call.getFirstChild());
        assertEquals(2, call.getChildCount() - 1);
    }

    @Test
    public void testIsLatinTrue() {
        assertTrue(NodeUtil.isLatin("hello"));
    }

    @Test
    public void testIsLatinFalse() {
        assertFalse(NodeUtil.isLatin("héllo"));
    }

    @Test
    public void testIsValidPropertyNameTrue() {
        assertTrue(NodeUtil.isValidPropertyName("foo"));
    }

    @Test
    public void testIsValidPropertyNameFalse() {
        assertFalse(NodeUtil.isValidPropertyName(""));
        assertFalse(NodeUtil.isValidPropertyName("1a"));
    }

    @Test
    public void testGetNthSibling() {
        Node first = stringNode;
        Node second = numberNode;
        Node third = trueNode;
        first.setNext(second);
        second.setNext(third);
        assertEquals(second, NodeUtil.getNthSibling(first, 1));
        assertEquals(third, NodeUtil.getNthSibling(first, 2));
        assertNull(NodeUtil.getNthSibling(first, 5));
    }

    @Test
    public void testGetArgumentForFunction() {
        Node params = functionNode.getFirstChild().getNext();
        Node param1 = Node.newString(Token.NAME, "a");
        Node param2 = Node.newString(Token.NAME, "b");
        params.addChildToBack(param1);
        params.addChildToBack(param2);
        assertEquals(param1, NodeUtil.getArgumentForFunction(functionNode, 0));
        assertEquals(param2, NodeUtil.getArgumentForFunction(functionNode, 1));
        assertNull(NodeUtil.getArgumentForFunction(functionNode, 2));
    }

    @Test
    public void testGetArgumentForCallOrNew() {
        Node call = new Node(Token.CALL, nameOther, numberNode, stringNode);
        assertEquals(numberNode, NodeUtil.getArgumentForCallOrNew(call, 0));
        assertEquals(stringNode, NodeUtil.getArgumentForCallOrNew(call, 1));
        assertNull(NodeUtil.getArgumentForCallOrNew(call, 2));
    }

    @Test
    public void testEvaluatesToLocalValueAssign() {
        Node assign = new Node(Token.ASSIGN, nameOther, stringNode);
        assertTrue(NodeUtil.evaluatesToLocalValue(assign));
    }

    @Test
    public void testEvaluatesToLocalValueComma() {
        Node comma = new Node(Token.COMMA, numberNode, trueNode);
        assertTrue(NodeUtil.evaluatesToLocalValue(comma));
    }

    @Test
    public void testEvaluatesToLocalValueAndOr() {
        Node and = new Node(Token.AND, trueNode, numberNode);
        Node or = new Node(Token.OR, falseNode, stringNode);
        assertTrue(NodeUtil.evaluatesToLocalValue(and));
        assertTrue(NodeUtil.evaluatesToLocalValue(or));
    }

    @Test
    public void testEvaluatesToLocalValueHook() {
        Node hook = new Node(Token.HOOK, trueNode, numberNode, stringNode);
        assertTrue(NodeUtil.evaluatesToLocalValue(hook));
    }

    @Test
    public void testEvaluatesToLocalValueIncDecPrefix() {
        incNode.putBooleanProp(Node.INCRDECR_PROP, true);
        assertTrue(NodeUtil.evaluatesToLocalValue(incNode));
    }

    @Test
    public void testEvaluatesToLocalValueIncDecPostfix() {
        decNode.putBooleanProp(Node.INCRDECR_PROP, false);
        assertTrue(NodeUtil.evaluatesToLocalValue(decNode));
    }

    @Test
    public void testEvaluatesToLocalValueThis() {
        assertFalse(NodeUtil.evaluatesToLocalValue(thisNode));
    }

    @Test
    public void testEvaluatesToLocalValueThisLocal() {
        assertTrue(NodeUtil.evaluatesToLocalValue(thisNode, Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testEvaluatesToLocalValueNameImmutable() {
        assertTrue(NodeUtil.evaluatesToLocalValue(nameUndefined));
    }

    @Test
    public void testEvaluatesToLocalValueNameLocal() {
        assertTrue(NodeUtil.evaluatesToLocalValue(nameOther, Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testEvaluatesToLocalValueGetpropLocal() {
        assertTrue(NodeUtil.evaluatesToLocalValue(getPropNode, Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testEvaluatesToLocalValueCallLocal() {
        callNode.getSideEffectFlags();
        assertFalse(NodeUtil.evaluatesToLocalValue(callNode));
    }

    @Test
    public void testEvaluatesToLocalValueToString() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "toString"));
        Node call = new Node(Token.CALL, getprop);
        assertTrue(NodeUtil.evaluatesToLocalValue(call));
    }

    @Test
    public void testEvaluatesToLocalValueNew() {
        assertTrue(NodeUtil.evaluatesToLocalValue(newArrayNode));
    }

    @Test
    public void testEvaluatesToLocalValueFunctionRegexpArraylitObjectlit() {
        assertTrue(NodeUtil.evaluatesToLocalValue(functionExprNode));
        assertTrue(NodeUtil.evaluatesToLocalValue(regexpNode));
        assertTrue(NodeUtil.evaluatesToLocalValue(arraylitNode));
        assertTrue(NodeUtil.evaluatesToLocalValue(objectlitNode));
    }

    @Test
    public void testEvaluatesToLocalValueIn() {
        Node inNode = new Node(Token.IN, nameOther, stringNode);
        assertTrue(NodeUtil.evaluatesToLocalValue(inNode));
    }

    @Test
    public void testEvaluatesToLocalValueAssignmentOp() {
        Node assignBitAnd = new Node(Token.ASSIGN_BITAND, nameOther, numberNode);
        assertTrue(NodeUtil.evaluatesToLocalValue(assignBitAnd));
    }

    @Test
    public void testEvaluatesToLocalValueSimpleOperator() {
        assertTrue(NodeUtil.evaluatesToLocalValue(notNode));
    }

    @Test
    public void testIsToStringMethodCallTrue() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "toString"));
        Node call = new Node(Token.CALL, getprop);
        assertTrue(NodeUtil.isToString(call.getFirstChild()));
    }

    @Test
    public void testIsToStringMethodCallFalse() {
        Node getprop = new Node(Token.GETPROP, nameOther, Node.newString(Token.STRING, "valueOf"));
        Node call = new Node(Token.CALL, getprop);
        assertFalse(NodeUtil.isToString(call.getFirstChild()));
    }
}