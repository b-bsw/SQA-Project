package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class NodeUtilTest {
    private Node testNode;

    @Before
    public void setUp() {
        testNode = null;
    }

    @Test
    public void testGetBooleanValue_String() {
        Node stringNode = Node.newString(Token.STRING, "hello");
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(stringNode));
    }

    @Test
    public void testGetBooleanValue_EmptyString() {
        Node emptyStringNode = Node.newString(Token.STRING, "");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(emptyStringNode));
    }

    @Test
    public void testGetBooleanValue_NumberZero() {
        Node numberNode = Node.newNumber(0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(numberNode));
    }

    @Test
    public void testGetBooleanValue_NumberNonZero() {
        Node numberNode = Node.newNumber(42);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(numberNode));
    }

    @Test
    public void testGetBooleanValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nullNode));
    }

    @Test
    public void testGetBooleanValue_True() {
        Node trueNode = new Node(Token.TRUE);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));
    }

    @Test
    public void testGetBooleanValue_False() {
        Node falseNode = new Node(Token.FALSE);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(falseNode));
    }

    @Test
    public void testGetBooleanValue_UndefinedName() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nameNode));
    }

    @Test
    public void testGetBooleanValue_InfinityName() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(nameNode));
    }

    @Test
    public void testGetBooleanValue_NaNName() {
        Node nameNode = Node.newString(Token.NAME, "NaN");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nameNode));
    }

    @Test
    public void testGetBooleanValue_RegularName() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(nameNode));
    }

    @Test
    public void testGetBooleanValue_ArrayLit() {
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(arrayLitNode));
    }

    @Test
    public void testGetBooleanValue_ObjectLit() {
        Node objLitNode = new Node(Token.OBJECTLIT);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(objLitNode));
    }

    @Test
    public void testGetBooleanValue_RegExp() {
        Node regexpNode = new Node(Token.REGEXP);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(regexpNode));
    }

    @Test
    public void testGetBooleanValue_NotTrue() {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(notNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Assign() {
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(1));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assignNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Comma() {
        Node commaNode = new Node(Token.COMMA, new Node(Token.NAME), Node.newNumber(0));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(commaNode));
    }

    @Test
    public void testGetExpressionBooleanValue_And() {
        Node lhs = new Node(Token.TRUE);
        Node rhs = new Node(Token.FALSE);
        Node andNode = new Node(Token.AND, lhs, rhs);
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Or() {
        Node lhs = new Node(Token.FALSE);
        Node rhs = new Node(Token.TRUE);
        Node orNode = new Node(Token.OR, lhs, rhs);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValue_HookSameValues() {
        Node trueValue = Node.newNumber(42);
        Node falseValue = Node.newNumber(42);
        Node cond = new Node(Token.NAME);
        Node hookNode = new Node(Token.HOOK, cond, trueValue, falseValue);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetExpressionBooleanValue_HookDifferentValues() {
        Node trueValue = Node.newNumber(1);
        Node falseValue = Node.newNumber(0);
        Node cond = new Node(Token.NAME);
        Node hookNode = new Node(Token.HOOK, cond, trueValue, falseValue);
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Not() {
        Node falseNode = new Node(Token.FALSE);
        Node notNode = new Node(Token.NOT, falseNode);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(notNode));
    }

    @Test
    public void testGetStringValue_String() {
        Node strNode = Node.newString(Token.STRING, "test");
        assertEquals("test", NodeUtil.getStringValue(strNode));
    }

    @Test
    public void testGetStringValue_NameUndefined() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertEquals("undefined", NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testGetStringValue_NameInfinity() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        assertEquals("Infinity", NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testGetStringValue_NumberInteger() {
        Node numNode = Node.newNumber(5);
        assertEquals("5", NodeUtil.getStringValue(numNode));
    }

    @Test
    public void testGetStringValue_NumberDouble() {
        Node numNode = Node.newNumber(3.14);
        assertEquals("3.14", NodeUtil.getStringValue(numNode));
    }

    @Test
    public void testGetStringValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals("null", NodeUtil.getStringValue(nullNode));
    }

    @Test
    public void testGetStringValue_Void() {
        Node voidNode = new Node(Token.VOID);
        assertEquals("undefined", NodeUtil.getStringValue(voidNode));
    }

    @Test
    public void testGetStringValue_NotBooleanFalse() {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        assertEquals("false", NodeUtil.getStringValue(notNode));
    }

    @Test
    public void testGetStringValue_NotBooleanTrue() {
        Node falseNode = new Node(Token.FALSE);
        Node notNode = new Node(Token.NOT, falseNode);
        assertEquals("true", NodeUtil.getStringValue(notNode));
    }

    @Test
    public void testGetStringValue_ArrayLit() {
        Node arrLit = new Node(Token.ARRAYLIT);
        Node child = Node.newString(Token.STRING, "a");
        arrLit.addChildToBack(child);
        assertEquals("a", NodeUtil.getStringValue(arrLit));
    }

    @Test
    public void testGetStringValue_ObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        assertEquals("[object Object]", NodeUtil.getStringValue(objLit));
    }

    @Test
    public void testGetStringValue_UnhandledReturnsNull() {
        Node nameNode = Node.newString(Token.NAME, "foo");
        assertNull(NodeUtil.getStringValue(nameNode));
    }

    @Test
    public void testIsImmutableValue_String() {
        Node strNode = Node.newString(Token.STRING, "test");
        assertTrue(NodeUtil.isImmutableValue(strNode));
    }

    @Test
    public void testIsImmutableValue_Number() {
        Node numNode = Node.newNumber(42);
        assertTrue(NodeUtil.isImmutableValue(numNode));
    }

    @Test
    public void testIsImmutableValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertTrue(NodeUtil.isImmutableValue(nullNode));
    }

    @Test
    public void testIsImmutableValue_True() {
        Node trueNode = new Node(Token.TRUE);
        assertTrue(NodeUtil.isImmutableValue(trueNode));
    }

    @Test
    public void testIsImmutableValue_NotImmutable() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isImmutableValue(nameNode));
    }

    @Test
    public void testIsImmutableValue_NotBoolean() {
        Node falseNode = new Node(Token.FALSE);
        Node notNode = new Node(Token.NOT, falseNode);
        assertTrue(NodeUtil.isImmutableValue(notNode));
    }

    @Test
    public void testIsImmutableValue_VoidWithImmutableChild() {
        Node numNode = Node.newNumber(0);
        Node voidNode = new Node(Token.VOID, numNode);
        assertTrue(NodeUtil.isImmutableValue(voidNode));
    }

    @Test
    public void testIsImmutableValue_Neg() {
        Node numNode = Node.newNumber(5);
        Node negNode = new Node(Token.NEG, numNode);
        assertTrue(NodeUtil.isImmutableValue(negNode));
    }

    @Test
    public void testIsLiteralValue_ArrayLitWithImmutable() {
        Node arrLit = new Node(Token.ARRAYLIT);
        arrLit.addChildToBack(Node.newNumber(1));
        assertTrue(NodeUtil.isLiteralValue(arrLit, false));
    }

    @Test
    public void testIsLiteralValue_ArrayLitWithNonLiteral() {
        Node arrLit = new Node(Token.ARRAYLIT);
        arrLit.addChildToBack(new Node(Token.NAME));
        assertFalse(NodeUtil.isLiteralValue(arrLit, false));
    }

    @Test
    public void testIsLiteralValue_ObjectLitWithImmutable() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key");
        key.addChildToBack(Node.newNumber(1));
        objLit.addChildToBack(key);
        assertTrue(NodeUtil.isLiteralValue(objLit, false));
    }

    @Test
    public void testIsLiteralValue_FunctionInclude() {
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToBack(Node.newString(Token.NAME, "f"));
        funcNode.addChildToBack(new Node(Token.LP));
        funcNode.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isLiteralValue(funcNode, true));
    }

    @Test
    public void testIsLiteralValue_FunctionExclude() {
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToBack(Node.newString(Token.NAME, "f"));
        funcNode.addChildToBack(new Node(Token.LP));
        funcNode.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.isLiteralValue(funcNode, false));
    }

    @Test
    public void testIsLiteralValue_ImmutableDefault() {
        Node strNode = Node.newString(Token.STRING, "x");
        assertTrue(NodeUtil.isLiteralValue(strNode, false));
    }

    @Test
    public void testIsValidDefineValue_String() {
        Node val = Node.newString(Token.STRING, "a");
        assertTrue(NodeUtil.isValidDefineValue(val, new HashSet<String>()));
    }

    @Test
    public void testIsValidDefineValue_Number() {
        Node val = Node.newNumber(1);
        assertTrue(NodeUtil.isValidDefineValue(val, new HashSet<String>()));
    }

    @Test
    public void testIsValidDefineValue_BinaryOpBothValid() {
        Set<String> defines = new HashSet<String>();
        defines.add("A");
        Node lhs = Node.newString(Token.NAME, "A");
        Node rhs = Node.newNumber(2);
        Node addNode = new Node(Token.ADD, lhs, rhs);
        assertTrue(NodeUtil.isValidDefineValue(addNode, defines));
    }

    @Test
    public void testIsValidDefineValue_BinaryOpSecondInvalid() {
        Set<String> defines = new HashSet<String>();
        defines.add("A");
        Node lhs = Node.newString(Token.NAME, "A");
        Node rhs = new Node(Token.NAME);
        Node addNode = new Node(Token.ADD, lhs, rhs);
        assertFalse(NodeUtil.isValidDefineValue(addNode, defines));
    }

    @Test
    public void testIsValidDefineValue_UnaryOpValid() {
        Set<String> defines = new HashSet<String>();
        defines.add("A");
        Node val = Node.newString(Token.NAME, "A");
        Node notNode = new Node(Token.NOT, val);
        assertTrue(NodeUtil.isValidDefineValue(notNode, defines));
    }

    @Test
    public void testIsValidDefineValue_UnaryOpInvalid() {
        Set<String> defines = new HashSet<String>();
        Node val = new Node(Token.NAME);
        Node notNode = new Node(Token.NOT, val);
        assertFalse(NodeUtil.isValidDefineValue(notNode, defines));
    }

    @Test
    public void testIsValidDefineValue_QualifiedNameInDefines() {
        Set<String> defines = new HashSet<String>();
        defines.add("a.b");
        Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString(Token.STRING, "b"));
        assertTrue(NodeUtil.isValidDefineValue(getProp, defines));
    }

    @Test
    public void testIsValidDefineValue_QualifiedNameNotInDefines() {
        Set<String> defines = new HashSet<String>();
        Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString(Token.STRING, "b"));
        assertFalse(NodeUtil.isValidDefineValue(getProp, defines));
    }

    @Test
    public void testIsEmptyBlock_BlockWithEmptyChildren() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_BlockWithNonEmpty() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.NAME));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlock_NonBlockNode() {
        Node nameNode = new Node(Token.NAME);
        assertFalse(NodeUtil.isEmptyBlock(nameNode));
    }

    @Test
    public void testIsSimpleOperator_SimpleType() {
        Node addNode = new Node(Token.ADD);
        assertTrue(NodeUtil.isSimpleOperator(addNode));
    }

    @Test
    public void testIsSimpleOperator_NonSimpleType() {
        Node ifNode = new Node(Token.IF);
        assertFalse(NodeUtil.isSimpleOperator(ifNode));
    }

    @Test
    public void testGetFunctionName_NameParent() {
        Node nameNode = Node.newString(Token.NAME, "f");
        Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        nameNode.addChildToBack(funcNode);
        assertEquals("f", NodeUtil.getFunctionName(funcNode));
    }

    @Test
    public void testGetFunctionName_AssignParent() {
        Node nameNode = Node.newString(Token.NAME, "a.b");
        Node assignNode = new Node(Token.ASSIGN, nameNode, new Node(Token.FUNCTION));
        Node funcNode = assignNode.getLastChild();
        funcNode.addChildToFront(Node.newString(Token.NAME, ""));
        assertEquals("a.b", NodeUtil.getFunctionName(funcNode));
    }

    @Test
    public void testGetFunctionName_DefaultReturnsNull() {
        Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        assertEquals("f", NodeUtil.getFunctionName(funcNode));
    }

    @Test
    public void testIsAssignmentOp_Assign() {
        Node assign = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isAssignmentOp(assign));
    }

    @Test
    public void testIsAssignmentOp_NonAssign() {
        Node add = new Node(Token.ADD);
        assertFalse(NodeUtil.isAssignmentOp(add));
    }

    @Test
    public void testIsAssignmentOp_AddAssign() {
        Node assignAdd = new Node(Token.ASSIGN_ADD);
        assertTrue(NodeUtil.isAssignmentOp(assignAdd));
    }

    @Test
    public void testGetOpFromAssignmentOp_Add() {
        Node assignAdd = new Node(Token.ASSIGN_ADD);
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(assignAdd));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_Invalid() {
        Node add = new Node(Token.ADD);
        NodeUtil.getOpFromAssignmentOp(add);
    }

    @Test
    public void testIsExpressionNode_True() {
        Node expr = new Node(Token.EXPR_RESULT);
        assertTrue(NodeUtil.isExpressionNode(expr));
    }

    @Test
    public void testIsExpressionNode_False() {
        Node block = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isExpressionNode(block));
    }

    @Test
    public void testIsGet_GetProp() {
        Node getProp = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(getProp));
    }

    @Test
    public void testIsGet_GetElem() {
        Node getElem = new Node(Token.GETELEM);
        assertTrue(NodeUtil.isGet(getElem));
    }

    @Test
    public void testIsGet_NonGet() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isGet(name));
    }

    @Test
    public void testIsName_True() {
        Node name = new Node(Token.NAME);
        assertTrue(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_False() {
        Node num = Node.newNumber(1);
        assertFalse(NodeUtil.isName(num));
    }

    @Test
    public void testIsVar_True() {
        Node var = new Node(Token.VAR);
        assertTrue(NodeUtil.isVar(var));
    }

    @Test
    public void testIsVar_False() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isVar(name));
    }

    @Test
    public void testIsVarDeclaration_True() {
        Node name = Node.newString(Token.NAME, "x");
        Node var = new Node(Token.VAR, name);
        assertTrue(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testIsVarDeclaration_False() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testIsString_True() {
        Node str = Node.newString(Token.STRING, "a");
        assertTrue(NodeUtil.isString(str));
    }

    @Test
    public void testIsString_False() {
        Node num = Node.newNumber(1);
        assertFalse(NodeUtil.isString(num));
    }

    @Test
    public void testIsExprAssign_True() {
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(1));
        Node expr = new Node(Token.EXPR_RESULT, assign);
        assertTrue(NodeUtil.isExprAssign(expr));
    }

    @Test
    public void testIsExprAssign_False() {
        Node call = new Node(Token.CALL);
        Node expr = new Node(Token.EXPR_RESULT, call);
        assertFalse(NodeUtil.isExprAssign(expr));
    }

    @Test
    public void testIsForIn_True() {
        Node forIn = new Node(Token.FOR, new Node(Token.NAME), new Node(Token.NAME), new Node(Token.BLOCK));
        assertTrue(NodeUtil.isForIn(forIn));
    }

    @Test
    public void testIsForIn_False() {
        Node forNode = new Node(Token.FOR, new Node(Token.NAME), new Node(Token.NAME), new Node(Token.NAME), new Node(Token.BLOCK));
        assertFalse(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsLoopStructure_For() {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isLoopStructure(forNode));
    }

    @Test
    public void testIsLoopStructure_Do() {
        Node doNode = new Node(Token.DO);
        assertTrue(NodeUtil.isLoopStructure(doNode));
    }

    @Test
    public void testIsLoopStructure_While() {
        Node whileNode = new Node(Token.WHILE);
        assertTrue(NodeUtil.isLoopStructure(whileNode));
    }

    @Test
    public void testIsLoopStructure_NonLoop() {
        Node ifNode = new Node(Token.IF);
        assertFalse(NodeUtil.isLoopStructure(ifNode));
    }

    @Test
    public void testIsControlStructure_If() {
        Node ifNode = new Node(Token.IF);
        assertTrue(NodeUtil.isControlStructure(ifNode));
    }

    @Test
    public void testIsControlStructure_For() {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isControlStructure(forNode));
    }

    @Test
    public void testIsControlStructure_NonControl() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isControlStructure(name));
    }

    @Test
    public void testIsControlStructureCodeBlock_ForLastChild() {
        Node forNode = new Node(Token.FOR, new Node(Token.NAME), new Node(Token.NAME), new Node(Token.NAME), new Node(Token.BLOCK));
        Node block = forNode.getLastChild();
        assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, block));
    }

    @Test
    public void testIsControlStructureCodeBlock_NonBlock() {
        Node forNode = new Node(Token.FOR, new Node(Token.NAME), new Node(Token.NAME), new Node(Token.NAME), new Node(Token.BLOCK));
        Node first = forNode.getFirstChild();
        assertFalse(NodeUtil.isControlStructureCodeBlock(forNode, first));
    }

    @Test
    public void testGetConditionExpression_If() {
        Node cond = new Node(Token.NAME);
        Node ifNode = new Node(Token.IF, cond, new Node(Token.BLOCK));
        assertSame(cond, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testGetConditionExpression_While() {
        Node cond = new Node(Token.NAME);
        Node whileNode = new Node(Token.WHILE, cond, new Node(Token.BLOCK));
        assertSame(cond, NodeUtil.getConditionExpression(whileNode));
    }

    @Test
    public void testGetConditionExpression_Do() {
        Node cond = new Node(Token.NAME);
        Node doNode = new Node(Token.DO, new Node(Token.BLOCK), cond);
        assertSame(cond, NodeUtil.getConditionExpression(doNode));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConditionExpression_InvalidNode() {
        Node name = new Node(Token.NAME);
        NodeUtil.getConditionExpression(name);
    }

    @Test
    public void testIsStatementBlock_Script() {
        Node script = new Node(Token.SCRIPT);
        assertTrue(NodeUtil.isStatementBlock(script));
    }

    @Test
    public void testIsStatementBlock_Block() {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatementBlock(block));
    }

    @Test
    public void testIsStatementBlock_NonBlock() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isStatementBlock(name));
    }

    @Test
    public void testIsFunction_True() {
        Node func = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.isFunction(func));
    }

    @Test
    public void testIsFunction_False() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isFunction(name));
    }

    @Test
    public void testGetFunctionBody() {
        Node body = new Node(Token.BLOCK);
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.LP), body);
        assertSame(body, NodeUtil.getFunctionBody(func));
    }

    @Test
    public void testIsThis_True() {
        Node thisNode = new Node(Token.THIS);
        assertTrue(NodeUtil.isThis(thisNode));
    }

    @Test
    public void testIsThis_False() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isThis(name));
    }

    @Test
    public void testIsArrayLiteral_True() {
        Node arr = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.isArrayLiteral(arr));
    }

    @Test
    public void testIsArrayLiteral_False() {
        Node obj = new Node(Token.OBJECTLIT);
        assertFalse(NodeUtil.isArrayLiteral(obj));
    }

    @Test
    public void testIsSparseArray_True() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.putProp(Node.SKIP_INDEXES_PROP, new int[]{1});
        assertTrue(NodeUtil.isSparseArray(arr));
    }

    @Test
    public void testIsSparseArray_False() {
        Node arr = new Node(Token.ARRAYLIT);
        assertFalse(NodeUtil.isSparseArray(arr));
    }

    @Test
    public void testIsFunctionDeclaration_True() {
        Node func = new Node(Token.FUNCTION);
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(func);
        assertTrue(NodeUtil.isFunctionDeclaration(func));
    }

    @Test
    public void testIsFunctionDeclaration_False() {
        Node func = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isFunctionDeclaration(func));
    }

    @Test
    public void testIsFunctionExpression_True() {
        Node func = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.isFunctionExpression(func));
    }

    @Test
    public void testIsFunctionExpression_False() {
        Node func = new Node(Token.FUNCTION);
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(func);
        assertFalse(NodeUtil.isFunctionExpression(func));
    }

    @Test
    public void testIsEmptyFunctionExpression_True() {
        Node block = new Node(Token.BLOCK);
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), block);
        assertTrue(NodeUtil.isEmptyFunctionExpression(func));
    }

    @Test
    public void testIsEmptyFunctionExpression_NonEmpty() {
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.NAME));
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), block);
        assertFalse(NodeUtil.isEmptyFunctionExpression(func));
    }

    @Test
    public void testIsFunctionObjectCall_True() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getProp);
        assertTrue(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectCall_False() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "apply"));
        Node call = new Node(Token.CALL, getProp);
        assertFalse(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectApply_True() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "apply"));
        Node call = new Node(Token.CALL, getProp);
        assertTrue(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectApply_False() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getProp);
        assertFalse(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_True() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getProp);
        assertTrue(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsFunctionObjectCallOrApply_False() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "bind"));
        Node call = new Node(Token.CALL, getProp);
        assertFalse(NodeUtil.isFunctionObjectCallOrApply(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_True() {
        Node nameNode = new Node(Token.NAME);
        Node getProp = new Node(Token.GETPROP, nameNode, Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getProp);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall_False() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "call"));
        Node getProp2 = new Node(Token.GETPROP, getProp, Node.newString(Token.STRING, "call"));
        Node call = new Node(Token.CALL, getProp2);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call));
    }

    @Test
    public void testIsLhs_Assign() {
        Node name = new Node(Token.NAME);
        Node assign = new Node(Token.ASSIGN, name, Node.newNumber(1));
        assertTrue(NodeUtil.isLhs(name, assign));
    }

    @Test
    public void testIsLhs_Var() {
        Node name = new Node(Token.NAME);
        Node var = new Node(Token.VAR, name);
        assertTrue(NodeUtil.isLhs(name, var));
    }

    @Test
    public void testIsLhs_NotLhs() {
        Node name = new Node(Token.NAME);
        Node call = new Node(Token.CALL, name);
        assertFalse(NodeUtil.isLhs(name, call));
    }

    @Test
    public void testIsObjectLitKey_StringInObjectLit() {
        Node key = Node.newString(Token.STRING, "key");
        Node objLit = new Node(Token.OBJECTLIT);
        key.setParent(objLit);
        assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    }

    @Test
    public void testIsObjectLitKey_NumberInObjectLit() {
        Node key = Node.newNumber(0);
        Node objLit = new Node(Token.OBJECTLIT);
        key.setParent(objLit);
        assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    }

    @Test
    public void testIsObjectLitKey_StringNotInObjectLit() {
        Node key = Node.newString(Token.STRING, "key");
        Node assign = new Node(Token.ASSIGN);
        key.setParent(assign);
        assertFalse(NodeUtil.isObjectLitKey(key, assign));
    }

    @Test
    public void testIsGetOrSetKey_Get() {
        Node getNode = new Node(Token.GET);
        assertTrue(NodeUtil.isGetOrSetKey(getNode));
    }

    @Test
    public void testIsGetOrSetKey_Set() {
        Node setNode = new Node(Token.SET);
        assertTrue(NodeUtil.isGetOrSetKey(setNode));
    }

    @Test
    public void testIsGetOrSetKey_Neither() {
        Node strNode = Node.newString(Token.STRING, "a");
        assertFalse(NodeUtil.isGetOrSetKey(strNode));
    }

    @Test
    public void testOpToStr_Bitor() {
        assertEquals("|", NodeUtil.opToStr(Token.BITOR));
    }

    @Test
    public void testOpToStr_Or() {
        assertEquals("||", NodeUtil.opToStr(Token.OR));
    }

    @Test
    public void testOpToStr_Unknown() {
        assertNull(NodeUtil.opToStr(Token.IF));
    }

    @Test
    public void testOpToStrNoFail_Valid() {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
    }

    @Test(expected = Error.class)
    public void testOpToStrNoFail_Invalid() {
        NodeUtil.opToStrNoFail(Token.IF);
    }

    @Test
    public void testMayBeString_NumericResult() {
        Node numNode = Node.newNumber(1);
        assertFalse(NodeUtil.mayBeString(numNode));
    }

    @Test
    public void testMayBeString_BooleanResult() {
        Node trueNode = new Node(Token.TRUE);
        assertFalse(NodeUtil.mayBeString(trueNode));
    }

    @Test
    public void testMayBeString_StringResult() {
        Node strNode = Node.newString(Token.STRING, "a");
        assertTrue(NodeUtil.mayBeString(strNode));
    }

    @Test
    public void testMayBeString_Undefined() {
        Node voidNode = new Node(Token.VOID);
        assertFalse(NodeUtil.mayBeString(voidNode));
    }

    @Test
    public void testMayBeString_Null() {
        Node nullNode = new Node(Token.NULL);
        assertFalse(NodeUtil.mayBeString(nullNode));
    }

    @Test
    public void testIsAssociative_Mul() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }

    @Test
    public void testIsAssociative_Add() {
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testIsCommutative_Mul() {
        assertTrue(NodeUtil.isCommutative(Token.MUL));
    }

    @Test
    public void testIsCommutative_Add() {
        assertFalse(NodeUtil.isCommutative(Token.ADD));
    }

    @Test
    public void testPrecedence_Comma() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
    }

    @Test
    public void testPrecedence_Assign() {
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    }

    @Test
    public void testPrecedence_Hook() {
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
    }

    @Test
    public void testPrecedence_Or() {
        assertEquals(3, NodeUtil.precedence(Token.OR));
    }

    @Test
    public void testPrecedence_Name() {
        assertEquals(15, NodeUtil.precedence(Token.NAME));
    }

    @Test(expected = Error.class)
    public void testPrecedence_Invalid() {
        NodeUtil.precedence(Token.IF);
    }

    @Test
    public void testTrimJsWhiteSpace_NoTrim() {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc"));
    }

    @Test
    public void testTrimJsWhiteSpace_LeadingSpaces() {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc"));
    }

    @Test
    public void testTrimJsWhiteSpace_TrailingSpaces() {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc  "));
    }

    @Test
    public void testTrimJsWhiteSpace_BothSpaces() {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc  "));
    }

    @Test
    public void testTrimJsWhiteSpace_OnlySpaces() {
        assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
    }

    @Test
    public void testTrimJsWhiteSpace_Newlines() {
        assertEquals("a", NodeUtil.trimJsWhiteSpace("\na\n"));
    }

    @Test
    public void testIsStrWhiteSpaceChar_Space() {
        assertTrue(NodeUtil.isStrWhiteSpaceChar(' '));
    }

    @Test
    public void testIsStrWhiteSpaceChar_Newline() {
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\n'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_NonWhitespace() {
        assertFalse(NodeUtil.isStrWhiteSpaceChar('a'));
    }

    @Test
    public void testGetStringNumberValue_Empty() {
        assertEquals(0.0, NodeUtil.getStringNumberValue(""), 0.0);
    }

    @Test
    public void testGetStringNumberValue_Hex() {
        assertEquals(255.0, NodeUtil.getStringNumberValue("0xff"), 0.0);
    }

    @Test
    public void testGetStringNumberValue_InvalidHex() {
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xgg")));
    }

    @Test
    public void testGetStringNumberValue_SignedHex() {
        assertNull(NodeUtil.getStringNumberValue("-0x1"));
    }

    @Test
    public void testGetStringNumberValue_Infinity() {
        assertNull(NodeUtil.getStringNumberValue("infinity"));
    }

    @Test
    public void testGetStringNumberValue_NumericString() {
        assertEquals(3.14, NodeUtil.getStringNumberValue("3.14"), 0.0);
    }

    @Test
    public void testGetStringNumberValue_InvalidNumeric() {
        assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("abc")));
    }

    @Test
    public void testGetNumberValue_True() {
        Node trueNode = new Node(Token.TRUE);
        assertEquals(1.0, NodeUtil.getNumberValue(trueNode), 0.0);
    }

    @Test
    public void testGetNumberValue_False() {
        Node falseNode = new Node(Token.FALSE);
        assertEquals(0.0, NodeUtil.getNumberValue(falseNode), 0.0);
    }

    @Test
    public void testGetNumberValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals(0.0, NodeUtil.getNumberValue(nullNode), 0.0);
    }

    @Test
    public void testGetNumberValue_Number() {
        Node numNode = Node.newNumber(42.5);
        assertEquals(42.5, NodeUtil.getNumberValue(numNode), 0.0);
    }

    @Test
    public void testGetNumberValue_VoidWithSideEffects() {
        Node callNode = new Node(Token.CALL);
        Node voidNode = new Node(Token.VOID, callNode);
        assertNull(NodeUtil.getNumberValue(voidNode));
    }

    @Test
    public void testGetNumberValue_VoidNoSideEffects() {
        Node nameNode = new Node(Token.NAME);
        Node voidNode = new Node(Token.VOID, nameNode);
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(voidNode)));
    }

    @Test
    public void testGetNumberValue_UndefinedName() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(nameNode)));
    }

    @Test
    public void testGetNumberValue_NaNName() {
        Node nameNode = Node.newString(Token.NAME, "NaN");
        assertTrue(Double.isNaN(NodeUtil.getNumberValue(nameNode)));
    }

    @Test
    public void testGetNumberValue_InfinityName() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(nameNode), 0.0);
    }

    @Test
    public void testGetNumberValue_NegInfinity() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        Node negNode = new Node(Token.NEG, nameNode);
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negNode), 0.0);
    }

    @Test
    public void testGetNumberValue_NotTrue() {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        assertEquals(0.0, NodeUtil.getNumberValue(notNode), 0.0);
    }

    @Test
    public void testGetNumberValue_NotFalse() {
        Node falseNode = new Node(Token.FALSE);
        Node notNode = new Node(Token.NOT, falseNode);
        assertEquals(1.0, NodeUtil.getNumberValue(notNode), 0.0);
    }

    @Test
    public void testGetNumberValue_String() {
        Node strNode = Node.newString(Token.STRING, "3.14");
        assertEquals(3.14, NodeUtil.getNumberValue(strNode), 0.0);
    }

    @Test
    public void testGetNumberValue_ArrayLit() {
        Node arrLit = new Node(Token.ARRAYLIT);
        arrLit.addChildToBack(Node.newString(Token.STRING, "1"));
        assertEquals(1.0, NodeUtil.getNumberValue(arrLit), 0.0);
    }

    @Test
    public void testGetNumberValue_UnhandledNode() {
        Node name = Node.newString(Token.NAME, "x");
        assertNull(NodeUtil.getNumberValue(name));
    }

    @Test
    public void testIsUndefined_Void() {
        Node voidNode = new Node(Token.VOID);
        assertTrue(NodeUtil.isUndefined(voidNode));
    }

    @Test
    public void testIsUndefined_UndefinedName() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertTrue(NodeUtil.isUndefined(nameNode));
    }

    @Test
    public void testIsUndefined_NotUndefined() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isUndefined(nameNode));
    }

    @Test
    public void testIsNull_True() {
        Node nullNode = new Node(Token.NULL);
        assertTrue(NodeUtil.isNull(nullNode));
    }

    @Test
    public void testIsNull_False() {
        Node voidNode = new Node(Token.VOID);
        assertFalse(NodeUtil.isNull(voidNode));
    }

    @Test
    public void testIsNullOrUndefined_Null() {
        Node nullNode = new Node(Token.NULL);
        assertTrue(NodeUtil.isNullOrUndefined(nullNode));
    }

    @Test
    public void testIsNullOrUndefined_Void() {
        Node voidNode = new Node(Token.VOID);
        assertTrue(NodeUtil.isNullOrUndefined(voidNode));
    }

    @Test
    public void testIsNullOrUndefined_Neither() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isNullOrUndefined(name));
    }

    @Test
    public void testIsNumericResult_Number() {
        Node num = Node.newNumber(1);
        assertTrue(NodeUtil.isNumericResult(num));
    }

    @Test
    public void testIsNumericResult_AddNumeric() {
        Node lhs = Node.newNumber(1);
        Node rhs = Node.newNumber(2);
        Node add = new Node(Token.ADD, lhs, rhs);
        assertTrue(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResult_AddString() {
        Node lhs = Node.newString(Token.STRING, "a");
        Node rhs = Node.newNumber(1);
        Node add = new Node(Token.ADD, lhs, rhs);
        assertFalse(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testIsNumericResult_NaNName() {
        Node name = Node.newString(Token.NAME, "NaN");
        assertTrue(NodeUtil.isNumericResult(name));
    }

    @Test
    public void testIsNumericResult_InfinityName() {
        Node name = Node.newString(Token.NAME, "Infinity");
        assertTrue(NodeUtil.isNumericResult(name));
    }

    @Test
    public void testIsNumericResult_OtherName() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isNumericResult(name));
    }

    @Test
    public void testIsBooleanResult_True() {
        Node trueNode = new Node(Token.TRUE);
        assertTrue(NodeUtil.isBooleanResult(trueNode));
    }

    @Test
    public void testIsBooleanResult_Eq() {
        Node eq = new Node(Token.EQ);
        assertTrue(NodeUtil.isBooleanResult(eq));
    }

    @Test
    public void testIsBooleanResult_NonBoolean() {
        Node add = new Node(Token.ADD);
        assertFalse(NodeUtil.isBooleanResult(add));
    }

    @Test
    public void testIsNumericResultHelper_AddBothNumeric() {
        Node lhs = Node.newNumber(1);
        Node rhs = Node.newNumber(2);
        Node add = new Node(Token.ADD, lhs, rhs);
        assertTrue(NodeUtil.isNumericResultHelper(add));
    }

    @Test
    public void testIsNumericResultHelper_AddMayBeString() {
        Node lhs = Node.newString(Token.STRING, "a");
        Node rhs = Node.newNumber(1);
        Node add = new Node(Token.ADD, lhs, rhs);
        assertFalse(NodeUtil.isNumericResultHelper(add));
    }

    @Test
    public void testIsNumericResultHelper_BitOp() {
        Node bitOr = new Node(Token.BITOR);
        assertTrue(NodeUtil.isNumericResultHelper(bitOr));
    }

    @Test
    public void testIsNumericResultHelper_NumberNode() {
        Node num = Node.newNumber(1);
        assertTrue(NodeUtil.isNumericResultHelper(num));
    }

    @Test
    public void testIsNumericResultHelper_NaN() {
        Node name = Node.newString(Token.NAME, "NaN");
        assertTrue(NodeUtil.isNumericResultHelper(name));
    }

    @Test
    public void testIsNumericResultHelper_Infinity() {
        Node name = Node.newString(Token.NAME, "Infinity");
        assertTrue(NodeUtil.isNumericResultHelper(name));
    }

    @Test
    public void testIsNumericResultHelper_OtherName() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isNumericResultHelper(name));
    }

    @Test
    public void testIsBooleanResultHelper_True() {
        Node trueNode = new Node(Token.TRUE);
        assertTrue(NodeUtil.isBooleanResultHelper(trueNode));
    }

    @Test
    public void testIsBooleanResultHelper_Eq() {
        Node eq = new Node(Token.EQ);
        assertTrue(NodeUtil.isBooleanResultHelper(eq));
    }

    @Test
    public void testIsBooleanResultHelper_NonBoolean() {
        Node num = Node.newNumber(1);
        assertFalse(NodeUtil.isBooleanResultHelper(num));
    }

    @Test
    public void testMayBeStringHelper_Numeric() {
        Node num = Node.newNumber(1);
        assertFalse(NodeUtil.mayBeStringHelper(num));
    }

    @Test
    public void testMayBeStringHelper_Boolean() {
        Node trueNode = new Node(Token.TRUE);
        assertFalse(NodeUtil.mayBeStringHelper(trueNode));
    }

    @Test
    public void testMayBeStringHelper_String() {
        Node str = Node.newString(Token.STRING, "a");
        assertTrue(NodeUtil.mayBeStringHelper(str));
    }

    @Test
    public void testMayBeStringHelper_Undefined() {
        Node voidNode = new Node(Token.VOID);
        assertFalse(NodeUtil.mayBeStringHelper(voidNode));
    }

    @Test
    public void testMayBeStringHelper_Null() {
        Node nullNode = new Node(Token.NULL);
        assertFalse(NodeUtil.mayBeStringHelper(nullNode));
    }

    @Test
    public void testMayBeStringHelper_Other() {
        Node name = new Node(Token.NAME);
        assertTrue(NodeUtil.mayBeStringHelper(name));
    }

    @Test
    public void testMayBeString_RecurseTrue() {
        Node lhs = Node.newString(Token.STRING, "a");
        Node rhs = Node.newNumber(1);
        Node add = new Node(Token.ADD, lhs, rhs);
        assertTrue(NodeUtil.mayBeString(add, true));
    }

    @Test
    public void testMayBeString_RecurseFalse() {
        Node lhs = Node.newString(Token.STRING, "a");
        Node rhs = Node.newNumber(1);
        Node add = new Node(Token.ADD, lhs, rhs);
        assertFalse(NodeUtil.mayBeString(add, false));
    }

    @Test
    public void testGetArrayElementStringValue_Null() {
        Node nullNode = new Node(Token.NULL);
        assertEquals("", NodeUtil.getArrayElementStringValue(nullNode));
    }

    @Test
    public void testGetArrayElementStringValue_String() {
        Node strNode = Node.newString(Token.STRING, "abc");
        assertEquals("abc", NodeUtil.getArrayElementStringValue(strNode));
    }

    @Test
    public void testArrayToString_Empty() {
        Node arr = new Node(Token.ARRAYLIT);
        assertEquals("", NodeUtil.arrayToString(arr));
    }

    @Test
    public void testArrayToString_SingleElement() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(Node.newString(Token.STRING, "a"));
        assertEquals("a", NodeUtil.arrayToString(arr));
    }

    @Test
    public void testArrayToString_MultipleElements() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(Node.newString(Token.STRING, "a"));
        arr.addChildToBack(Node.newString(Token.STRING, "b"));
        assertEquals("a,b", NodeUtil.arrayToString(arr));
    }

    @Test
    public void testArrayToString_SkipIndexes() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(Node.newString(Token.STRING, "a"));
        arr.putProp(Node.SKIP_INDEXES_PROP, new int[]{0});
        assertEquals("", NodeUtil.arrayToString(arr));
    }

    @Test
    public void testArrayToString_NullElement() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(new Node(Token.NULL));
        assertEquals("", NodeUtil.arrayToString(arr));
    }

    @Test
    public void testArrayToString_UnknownElement() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(new Node(Token.NAME));
        assertNull(NodeUtil.arrayToString(arr));
    }

    @Test
    public void testFunctionCallHasSideEffects_NoSideEffectsFlag() {
        Node call = new Node(Token.CALL, new Node(Token.NAME));
        call.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test
    public void testFunctionCallHasSideEffects_BuiltinFunction() {
        Node nameNode = Node.newString(Token.NAME, "String");
        Node call = new Node(Token.CALL, nameNode);
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test
    public void testFunctionCallHasSideEffects_ObjectToString() {
        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME), Node.newString(Token.STRING, "toString"));
        Node call = new Node(Token.CALL, getProp);
        call.addChildToBack(new Node(Token.NAME));
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test
    public void testFunctionCallHasSideEffects_MathMethod() {
        Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "Math"), Node.newString(Token.STRING, "random"));
        Node call = new Node(Token.CALL, getProp);
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test
    public void testFunctionCallHasSideEffects_RegExpTestWithCompiler() {
        Node regexp = new Node(Token.REGEXP);
        Node getProp = new Node(Token.GETPROP, regexp, Node.newString(Token.STRING, "test"));
        Node call = new Node(Token.CALL, getProp);
        assertTrue(NodeUtil.functionCallHasSideEffects(call, null));
    }

    @Test
    public void testFunctionCallHasSideEffects_GeneralCall() {
        Node nameNode = Node.newString(Token.NAME, "foo");
        Node call = new Node(Token.CALL, nameNode);
        assertTrue(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test(expected = IllegalStateException.class)
    public void testFunctionCallHasSideEffects_NonCallNode() {
        Node neww = new Node(Token.NEW);
        NodeUtil.functionCallHasSideEffects(neww);
    }

    @Test
    public void testConstructorCallHasSideEffects_NoSideEffectsFlag() {
        Node neww = new Node(Token.NEW, new Node(Token.NAME));
        neww.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(neww));
    }

    @Test
    public void testConstructorCallHasSideEffects_Builtin() {
        Node nameNode = Node.newString(Token.NAME, "Array");
        Node neww = new Node(Token.NEW, nameNode);
        assertFalse(NodeUtil.constructorCallHasSideEffects(neww));
    }

    @Test
    public void testConstructorCallHasSideEffects_General() {
        Node nameNode = Node.newString(Token.NAME, "MyClass");
        Node neww = new Node(Token.NEW, nameNode);
        assertTrue(NodeUtil.constructorCallHasSideEffects(neww));
    }

    @Test(expected = IllegalStateException.class)
    public void testConstructorCallHasSideEffects_NonNewNode() {
        Node call = new Node(Token.CALL);
        NodeUtil.constructorCallHasSideEffects(call);
    }

    @Test
    public void testMayHaveSideEffects_Throw() {
        Node throwNode = new Node(Token.THROW);
        assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
    }

    @Test
    public void testMayHaveSideEffects_NoSideEffects() {
        Node numNode = Node.newNumber(1);
        assertFalse(NodeUtil.mayHaveSideEffects(numNode));
    }

    @Test
    public void testMayHaveSideEffects_NewWithSideEffects() {
        Node nameNode = Node.newString(Token.NAME, "MyClass");
        Node neww = new Node(Token.NEW, nameNode);
        assertTrue(NodeUtil.mayHaveSideEffects(neww));
    }

    @Test
    public void testMayHaveSideEffects_NewWithoutSideEffects() {
        Node nameNode = Node.newString(Token.NAME, "Array");
        Node neww = new Node(Token.NEW, nameNode);
        assertFalse(NodeUtil.mayHaveSideEffects(neww));
    }

    @Test
    public void testMayHaveSideEffects_CallWithSideEffects() {
        Node nameNode = Node.newString(Token.NAME, "foo");
        Node call = new Node(Token.CALL, nameNode);
        assertTrue(NodeUtil.mayHaveSideEffects(call));
    }

    @Test
    public void testMayHaveSideEffects_CallWithoutSideEffects() {
        Node nameNode = Node.newString(Token.NAME, "String");
        Node call = new Node(Token.CALL, nameNode);
        assertFalse(NodeUtil.mayHaveSideEffects(call));
    }

    @Test
    public void testMayHaveSideEffects_Assign() {
        Node assignTarget = Node.newString(Token.NAME, "x");
        Node assign = new Node(Token.ASSIGN, assignTarget, Node.newNumber(1));
        assertTrue(NodeUtil.mayHaveSideEffects(assign));
    }

    @Test
    public void testMayHaveSideEffects_VarWithInit() {
        Node name = Node.newString(Token.NAME, "x");
        name.addChildToBack(Node.newNumber(1));
        Node var = new Node(Token.VAR, name);
        assertTrue(NodeUtil.mayHaveSideEffects(var));
    }

    @Test
    public void testMayHaveSideEffects_VarNoInit() {
        Node name = Node.newString(Token.NAME, "x");
        Node var = new Node(Token.VAR, name);
        assertFalse(NodeUtil.mayHaveSideEffects(var));
    }

    @Test
    public void testMayEffectMutableState_NewObject() {
        Node nameNode = Node.newString(Token.NAME, "MyClass");
        Node neww = new Node(Token.NEW, nameNode);
        assertTrue(NodeUtil.mayEffectMutableState(neww));
    }

    @Test
    public void testMayEffectMutableState_ArrayLit() {
        Node arr = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.mayEffectMutableState(arr));
    }

    @Test
    public void testMayEffectMutableState_ObjectLit() {
        Node obj = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.mayEffectMutableState(obj));
    }

    @Test
    public void testMayEffectMutableState_Number() {
        Node num = Node.newNumber(1);
        assertFalse(NodeUtil.mayEffectMutableState(num));
    }

    @Test
    public void testMayEffectMutableState_FunctionExpression() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(Node.newString(Token.NAME, "f"));
        func.addChildToBack(new Node(Token.LP));
        func.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.mayEffectMutableState(func));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_AssignmentOp() {
        Node assign = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(assign));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_DelProp() {
        Node del = new Node(Token.DELPROP);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(del));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_Call() {
        Node call = new Node(Token.CALL);
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(call));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_NameWithChildren() {
        Node name = new Node(Token.NAME);
        name.addChildToBack(new Node(Token.NAME));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(name));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_NameNoChildren() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(name));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects_NoSideEffects() {
        Node num = Node.newNumber(1);
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(num));
    }

    @Test
    public void testCallHasLocalResult_True() {
        Node call = new Node(Token.CALL);
        call.putSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
        assertTrue(NodeUtil.callHasLocalResult(call));
    }

    @Test
    public void testCallHasLocalResult_False() {
        Node call = new Node(Token.CALL);
        assertFalse(NodeUtil.callHasLocalResult(call));
    }

    @Test
    public void testNewHasLocalResult_True() {
        Node neww = new Node(Token.NEW);
        assertFalse(NodeUtil.newHasLocalResult(neww));
    }

    @Test
    public void testNewHasLocalResult_OnlyModifiesThis() {
        Node neww = new Node(Token.NEW);
        neww.putBooleanProp(Node.ONLY_MODIFIES_THIS_CALL, true);
        assertTrue(NodeUtil.newHasLocalResult(neww));
    }

    @Test
    public void testCanBeSideEffected_Call() {
        Node call = new Node(Token.CALL);
        assertTrue(NodeUtil.canBeSideEffected(call));
    }

    @Test
    public void testCanBeSideEffected_NameNotConstant() {
        Node name = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.canBeSideEffected(name));
    }

    @Test
    public void testCanBeSideEffected_NameConstant() {
        Node name = Node.newString(Token.NAME, "x");
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertFalse(NodeUtil.canBeSideEffected(name));
    }

    @Test
    public void testCanBeSideEffected_GetProp() {
        Node getProp = new Node(Token.GETPROP);
        assertTrue(NodeUtil.canBeSideEffected(getProp));
    }

    @Test
    public void testCanBeSideEffected_FunctionExpression() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(Node.newString(Token.NAME, "f"));
        func.addChildToBack(new Node(Token.LP));
        func.addChildToBack(new Node(Token.BLOCK));
        assertFalse(NodeUtil.canBeSideEffected(func));
    }

    @Test
    public void testCanBeSideEffected_Number() {
        Node num = Node.newNumber(1);
        Set<String> knownConstants = new HashSet<String>();
        assertFalse(NodeUtil.canBeSideEffected(num, knownConstants));
    }

    @Test
    public void testCanBeSideEffected_NameInKnownConstants() {
        Node name = Node.newString(Token.NAME, "x");
        Set<String> knownConstants = new HashSet<String>();
        knownConstants.add("x");
        assertFalse(NodeUtil.canBeSideEffected(name, knownConstants));
    }

    @Test
    public void testCanBeSideEffected_UnknownConstant() {
        Node name = Node.newString(Token.NAME, "x");
        Node getProp = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "y"));
        assertTrue(NodeUtil.canBeSideEffected(getProp, new HashSet<String>()));
    }

    @Test
    public void testValueCheck_Assign() {
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(1));
        assertTrue(NodeUtil.valueCheck(assign, NodeUtil.NUMBERIC_RESULT_PREDICATE));
    }

    @Test
    public void testValueCheck_Comma() {
        Node comma = new Node(Token.COMMA, new Node(Token.NAME), Node.newNumber(1));
        assertTrue(NodeUtil.valueCheck(comma, NodeUtil.NUMBERIC_RESULT_PREDICATE));
    }

    @Test
    public void testValueCheck_And() {
        Node lhs = Node.newNumber(1);
        Node rhs = Node.newNumber(2);
        Node and = new Node(Token.AND, lhs, rhs);
        assertTrue(NodeUtil.valueCheck(and, NodeUtil.NUMBERIC_RESULT_PREDICATE));
    }

    @Test
    public void testValueCheck_Or() {
        Node lhs = Node.newNumber(1);
        Node rhs = Node.newNumber(2);
        Node or = new Node(Token.OR, lhs, rhs);
        assertTrue(NodeUtil.valueCheck(or, NodeUtil.NUMBERIC_RESULT_PREDICATE));
    }

    @Test
    public void testValueCheck_Hook() {
        Node cond = new Node(Token.NAME);
        Node trueVal = Node.newNumber(1);
        Node falseVal = Node.newNumber(2);
        Node hook = new Node(Token.HOOK, cond, trueVal, falseVal);
        assertTrue(NodeUtil.valueCheck(hook, NodeUtil.NUMBERIC_RESULT_PREDICATE));
    }

    @Test
    public void testValueCheck_DefaultPredicate() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.valueCheck(name, NodeUtil.NUMBERIC_RESULT_PREDICATE));
    }

    @Test
    public void testNewExpr() {
        Node child = new Node(Token.NAME);
        Node expr = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(child, expr.getFirstChild());
    }

    @Test
    public void testGetNearestFunctionName_FromFunction() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
        Node parent = new Node(Token.NAME, func);
        assertEquals("foo", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_SetParent() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        Node setNode = new Node(Token.SET, func);
        assertEquals("", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_GetParent() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        Node getNode = new Node(Token.GET, func);
        assertEquals("", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_StringParent() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        Node strNode = Node.newString(Token.STRING, "method");
        strNode.addChildToBack(func);
        assertEquals("method", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_NumberParent() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        Node numNode = Node.newNumber(0);
        numNode.addChildToBack(func);
        assertEquals("0", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetNearestFunctionName_OtherParent() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
        Node sibling = new Node(Token.NAME);
        assertEquals("foo", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testGetRootOfQualifiedName_Name() {
        Node name = Node.newString(Token.NAME, "a");
        assertSame(name, NodeUtil.getRootOfQualifiedName(name));
    }

    @Test
    public void testGetRootOfQualifiedName_GetProp() {
        Node name = Node.newString(Token.NAME, "a");
        Node getProp = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "b"));
        assertSame(name, NodeUtil.getRootOfQualifiedName(getProp));
    }

    @Test
    public void testGetRootOfQualifiedName_This() {
        Node thisNode = new Node(Token.THIS);
        assertSame(thisNode, NodeUtil.getRootOfQualifiedName(thisNode));
    }

    @Test
    public void testIsConstantName_True() {
        Node name = Node.newString(Token.NAME, "x");
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(name));
    }

    @Test
    public void testIsConstantName_False() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isConstantName(name));
    }

    @Test
    public void testIsLatin_AllAscii() {
        assertTrue(NodeUtil.isLatin("hello"));
    }

    @Test
    public void testIsLatin_NonAscii() {
        assertFalse(NodeUtil.isLatin("héllo"));
    }

    @Test
    public void testIsLatin_Empty() {
        assertTrue(NodeUtil.isLatin(""));
    }

    @Test
    public void testIsValidPropertyName_Valid() {
        assertTrue(NodeUtil.isValidPropertyName("foo"));
    }

    @Test
    public void testIsValidPropertyName_InvalidNonIdentifier() {
        assertFalse(NodeUtil.isValidPropertyName("123"));
    }

    @Test
    public void testIsValidPropertyName_InvalidKeyword() {
        assertFalse(NodeUtil.isValidPropertyName("if"));
    }

    @Test
    public void testIsValidPropertyName_NonLatin() {
        assertFalse(NodeUtil.isValidPropertyName("fóo"));
    }

    @Test
    public void testIsConstantByConvention_GetPropConstantKey() {
        CodingConvention convention = new CodingConvention() {
            public boolean isConstantKey(String name) { return true; }
            public boolean isConstant(String name) { return false; }
        };
        Node name = Node.newString(Token.NAME, "x");
        Node getProp = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "CONST"));
        assertTrue(NodeUtil.isConstantByConvention(convention, getProp.getLastChild(), getProp));
    }

    @Test
    public void testIsConstantByConvention_ObjectLitKey() {
        CodingConvention convention = new CodingConvention() {
            public boolean isConstantKey(String name) { return true; }
            public boolean isConstant(String name) { return false; }
        };
        Node key = Node.newString(Token.STRING, "KEY");
        Node objLit = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.isConstantByConvention(convention, key, objLit));
    }

    @Test
    public void testIsConstantByConvention_VarConstant() {
        CodingConvention convention = new CodingConvention() {
            public boolean isConstantKey(String name) { return false; }
            public boolean isConstant(String name) { return true; }
        };
        Node name = Node.newString(Token.NAME, "CONST");
        Node var = new Node(Token.VAR, name);
        assertTrue(NodeUtil.isConstantByConvention(convention, name, var));
    }

    @Test
    public void testIsConstantByConvention_NonConstant() {
        CodingConvention convention = new CodingConvention() {
            public boolean isConstantKey(String name) { return false; }
            public boolean isConstant(String name) { return false; }
        };
        Node name = Node.newString(Token.NAME, "x");
        Node var = new Node(Token.VAR, name);
        assertFalse(NodeUtil.isConstantByConvention(convention, name, var));
    }

    @Test
    public void testNewUndefinedNode() {
        Node ref = new Node(Token.NAME);
        Node undef = NodeUtil.newUndefinedNode(ref);
        assertEquals(Token.VOID, undef.getType());
        assertEquals(Token.NUMBER, undef.getFirstChild().getType());
        assertEquals(0.0, undef.getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testNewVarNode() {
        Node val = Node.newNumber(42);
        Node var = NodeUtil.newVarNode("x", val);
        assertEquals(Token.VAR, var.getType());
        Node nameNode = var.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("x", nameNode.getString());
        assertEquals(val, nameNode.getFirstChild());
    }

    @Test
    public void testNewVarNodeNullValue() {
        Node var = NodeUtil.newVarNode("x", null);
        assertEquals(Token.VAR, var.getType());
        Node nameNode = var.getFirstChild();
        assertEquals(Token.NAME, nameNode.getType());
        assertEquals("x", nameNode.getString());
        assertNull(nameNode.getFirstChild());
    }

    @Test
    public void testNewFunctionNode() {
        List<Node> params = Arrays.asList(Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
        Node body = new Node(Token.BLOCK);
        Node func = NodeUtil.newFunctionNode("foo", params, body, 1, 2);
        assertEquals(Token.FUNCTION, func.getType());
        assertEquals("foo", func.getFirstChild().getString());
        assertEquals(Token.LP, func.getFirstChild().getNext().getType());
        assertEquals(2, func.getFirstChild().getNext().getChildCount());
        assertEquals(body, func.getLastChild());
    }

    @Test
    public void testNewQualifiedNameNode_Simple() {
        CodingConvention convention = new CodingConvention() {
            public boolean isConstant(String name) { return false; }
            public boolean isConstantKey(String name) { return false; }
        };
        Node name = NodeUtil.newQualifiedNameNode(convention, "x", 1, 2);
        assertEquals(Token.NAME, name.getType());
        assertEquals("x", name.getString());
    }

    @Test
    public void testNewQualifiedNameNode_Qualified() {
        CodingConvention convention = new CodingConvention() {
            public boolean isConstant(String name) { return false; }
            public boolean isConstantKey(String name) { return false; }
        };
        Node name = NodeUtil.newQualifiedNameNode(convention, "a.b", 1, 2);
        assertEquals(Token.GETPROP, name.getType());
        assertEquals(Token.NAME, name.getFirstChild().getType());
        assertEquals("a", name.getFirstChild().getString());
        assertEquals(Token.STRING, name.getLastChild().getType());
        assertEquals("b", name.getLastChild().getString());
    }

    @Test
    public void testNewQualifiedNameNode_WithConstantKey() {
        CodingConvention convention = new CodingConvention() {
            public boolean isConstant(String name) { return false; }
            public boolean isConstantKey(String name) { return name.equals("CONST"); }
        };
        Node name = NodeUtil.newQualifiedNameNode(convention, "a.CONST", 1, 2);
        assertTrue(name.getLastChild().getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testGetSourceName_Exists() {
        Node n = new Node(Token.NAME);
        n.putProp(Node.SOURCENAME_PROP, "test.js");
        assertEquals("test.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetSourceName_FromParent() {
        Node parent = new Node(Token.BLOCK);
        parent.putProp(Node.SOURCENAME_PROP, "test.js");
        Node child = new Node(Token.NAME);
        parent.addChildToBack(child);
        assertEquals("test.js", NodeUtil.getSourceName(child));
    }

    @Test
    public void testGetSourceName_NotFound() {
        Node n = new Node(Token.NAME);
        assertNull(NodeUtil.getSourceName(n));
    }

    @Test
    public void testNewCallNode() {
        Node target = new Node(Token.NAME);
        Node param1 = new Node(Token.NAME);
        Node param2 = new Node(Token.NAME);
        Node call = NodeUtil.newCallNode(target, param1, param2);
        assertEquals(Token.CALL, call.getType());
        assertTrue(call.getBooleanProp(Node.FREE_CALL));
        assertEquals(3, call.getChildCount());
        assertSame(target, call.getFirstChild());
        assertSame(param1, target.getNext());
        assertSame(param2, param1.getNext());
    }

    @Test
    public void testNewCallNode_NotFreeCall() {
        Node target = Node.newString(Token.STRING, "a");
        Node call = NodeUtil.newCallNode(target);
        assertFalse(call.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testGetArgumentForFunction() {
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "f");
        Node params = new Node(Token.LP);
        params.addChildToBack(Node.newString(Token.NAME, "a"));
        params.addChildToBack(Node.newString(Token.NAME, "b"));
        func.addChildToBack(name);
        func.addChildToBack(params);
        func.addChildToBack(new Node(Token.BLOCK));
        Node arg = NodeUtil.getArgumentForFunction(func, 1);
        assertEquals("b", arg.getString());
    }

    @Test
    public void testGetArgumentForFunction_OutOfRange() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(Node.newString(Token.NAME, "f"));
        func.addChildToBack(new Node(Token.LP));
        func.addChildToBack(new Node(Token.BLOCK));
        assertNull(NodeUtil.getArgumentForFunction(func, 0));
    }

    @Test
    public void testGetArgumentForCallOrNew() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME));
        call.addChildToBack(Node.newNumber(1));
        call.addChildToBack(Node.newNumber(2));
        Node arg = NodeUtil.getArgumentForCallOrNew(call, 1);
        assertEquals(2.0, arg.getDouble(), 0.0);
    }

    @Test
    public void testGetArgumentForCallOrNew_OutOfRange() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME));
        assertNull(NodeUtil.getArgumentForCallOrNew(call, 1));
    }

    @Test
    public void testEvaluatesToLocalValue_Immutable() {
        Node str = Node.newString(Token.STRING, "x");
        assertTrue(NodeUtil.evaluatesToLocalValue(str));
    }

    @Test
    public void testEvaluatesToLocalValue_AssignImmutable() {
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME), Node.newNumber(1));
        assertTrue(NodeUtil.evaluatesToLocalValue(assign));
    }

    @Test
    public void testEvaluatesToLocalValue_Comma() {
        Node comma = new Node(Token.COMMA, new Node(Token.NAME), Node.newNumber(1));
        assertTrue(NodeUtil.evaluatesToLocalValue(comma));
    }

    @Test
    public void testEvaluatesToLocalValue_And() {
        Node and = new Node(Token.AND, Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.evaluatesToLocalValue(and));
    }

    @Test
    public void testEvaluatesToLocalValue_Or() {
        Node or = new Node(Token.OR, Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.evaluatesToLocalValue(or));
    }

    @Test
    public void testEvaluatesToLocalValue_Hook() {
        Node hook = new Node(Token.HOOK, new Node(Token.NAME), Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.evaluatesToLocalValue(hook));
    }

    @Test
    public void testEvaluatesToLocalValue_Function() {
        Node func = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.evaluatesToLocalValue(func));
    }

    @Test
    public void testEvaluatesToLocalValue_RegExp() {
        Node regexp = new Node(Token.REGEXP);
        assertTrue(NodeUtil.evaluatesToLocalValue(regexp));
    }

    @Test
    public void testEvaluatesToLocalValue_ArrayLit() {
        Node arr = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.evaluatesToLocalValue(arr));
    }

    @Test
    public void testEvaluatesToLocalValue_ObjectLit() {
        Node obj = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.evaluatesToLocalValue(obj));
    }

    @Test
    public void testEvaluatesToLocalValue_In() {
        Node inNode = new Node(Token.IN);
        assertTrue(NodeUtil.evaluatesToLocalValue(inNode));
    }

    @Test
    public void testEvaluatesToLocalValue_LocalsPredicate() {
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.evaluatesToLocalValue(name, Predicates.<Node>alwaysFalse()));
        assertTrue(NodeUtil.evaluatesToLocalValue(name, Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testEvaluatesToLocalValue_CallLocalResult() {
        Node call = new Node(Token.CALL);
        call.putSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
        assertTrue(NodeUtil.evaluatesToLocalValue(call));
    }

    @Test
    public void testEvaluatesToLocalValue_NewLocalResult() {
        Node neww = new Node(Token.NEW);
        neww.putBooleanProp(Node.ONLY_MODIFIES_THIS_CALL, true);
        assertTrue(NodeUtil.evaluatesToLocalValue(neww));
    }

    @Test
    public void testEvaluatesToLocalValue_SimpleOperator() {
        Node add = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertTrue(NodeUtil.evaluatesToLocalValue(add));
    }

    @Test
    public void testContainsType_Function() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(Node.newString(Token.NAME, "f"));
        func.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.CALL));
        func.addChildToBack(body);
        assertTrue(NodeUtil.containsType(func, Token.CALL));
    }

    @Test
    public void testContainsType_NotPresent() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.containsType(n, Token.CALL));
    }

    @Test
    public void testContainsType_WithPredicate() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(Node.newString(Token.NAME, "f"));
        func.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.CALL));
        func.addChildToBack(body);
        assertFalse(NodeUtil.containsType(func, Token.CALL, new MatchNotFunction()));
    }

    @Test
    public void testContainsFunction_True() {
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(new Node(Token.FUNCTION));
        assertTrue(NodeUtil.containsFunction(script));
    }

    @Test
    public void testContainsFunction_False() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.containsFunction(n));
    }

    @Test
    public void testReferencesThis_True() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(Node.newString(Token.NAME, "f"));
        func.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.THIS));
        func.addChildToBack(body);
        assertTrue(NodeUtil.referencesThis(func));
    }

    @Test
    public void testReferencesThis_False() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(Node.newString(Token.NAME, "f"));
        func.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        func.addChildToBack(body);
        assertFalse(NodeUtil.referencesThis(func));
    }
}