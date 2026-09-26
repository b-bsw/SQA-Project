package com.google.javascript.jscomp;
import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NodeUtilTest {
    private Node stringNode(String s) { return Node.newString(s); }
    private Node numberNode(double d) { return Node.newNumber(d); }
    private Node nameNode(String name) { return Node.newString(Token.NAME, name); }
    private Node blockNode() { return new Node(Token.BLOCK); }
    private Node assignNode(Node target, Node value) {
        Node n = new Node(Token.ASSIGN);
        n.addChildToBack(target);
        n.addChildToBack(value);
        return n;
    }
    private Node commaNode(Node left, Node right) {
        Node n = new Node(Token.COMMA);
        n.addChildToBack(left);
        n.addChildToBack(right);
        return n;
    }
    private Node notNode(Node child) {
        Node n = new Node(Token.NOT);
        n.addChildToBack(child);
        return n;
    }
    private Node andNode(Node left, Node right) {
        Node n = new Node(Token.AND);
        n.addChildToBack(left);
        n.addChildToBack(right);
        return n;
    }
    private Node orNode(Node left, Node right) {
        Node n = new Node(Token.OR);
        n.addChildToBack(left);
        n.addChildToBack(right);
        return n;
    }
    private Node hookNode(Node cond, Node trueExpr, Node falseExpr) {
        Node n = new Node(Token.HOOK);
        n.addChildToBack(cond);
        n.addChildToBack(trueExpr);
        n.addChildToBack(falseExpr);
        return n;
    }
    private Node callNode(Node target, Node... args) {
        Node c = new Node(Token.CALL);
        c.addChildToBack(target);
        for (Node a : args) c.addChildToBack(a);
        return c;
    }
    private Node newNode(Node target) {
        Node n = new Node(Token.NEW);
        n.addChildToBack(target);
        return n;
    }

    @Test
    public void testGetImpureBooleanValue_ASSIGN() {
        Node n = assignNode(nameNode("x"), stringNode(""));
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(n));
    }
    @Test
    public void testGetImpureBooleanValue_COMMA() {
        Node n = commaNode(numberNode(1), stringNode("a"));
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }
    @Test
    public void testGetImpureBooleanValue_NOT() {
        Node n = notNode(stringNode(""));
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }
    @Test
    public void testGetImpureBooleanValue_AND() {
        Node n = andNode(stringNode("a"), stringNode("b"));
        assertEquals(TernaryValue.forBoolean(true).and(TernaryValue.forBoolean(true)), NodeUtil.getImpureBooleanValue(n));
    }
    @Test
    public void testGetImpureBooleanValue_OR() {
        Node n = orNode(stringNode(""), stringNode("b"));
        assertEquals(TernaryValue.forBoolean(false).or(TernaryValue.forBoolean(true)), NodeUtil.getImpureBooleanValue(n));
    }
    @Test
    public void testGetImpureBooleanValue_HOOK_same() {
        Node n = hookNode(stringNode("c"), stringNode("x"), stringNode("x"));
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(n));
    }
    @Test
    public void testGetImpureBooleanValue_HOOK_diff() {
        Node n = hookNode(stringNode("c"), stringNode("x"), stringNode(""));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(n));
    }
    @Test
    public void testGetImpureBooleanValue_ARRAYLIT() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(new Node(Token.ARRAYLIT)));
    }
    @Test
    public void testGetImpureBooleanValue_OBJECTLIT() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(new Node(Token.OBJECTLIT)));
    }
    @Test
    public void testGetImpureBooleanValue_default() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(stringNode("x")));
    }

    @Test
    public void testGetPureBooleanValue_STRING_nonEmpty() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(stringNode("x")));
    }
    @Test
    public void testGetPureBooleanValue_STRING_empty() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(stringNode("")));
    }
    @Test
    public void testGetPureBooleanValue_NUMBER_nonZero() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(numberNode(1.5)));
    }
    @Test
    public void testGetPureBooleanValue_NUMBER_zero() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(numberNode(0)));
    }
    @Test
    public void testGetPureBooleanValue_NOT() {
        assertEquals(TernaryValue.FALSE.not(), NodeUtil.getPureBooleanValue(notNode(stringNode(""))));
    }
    @Test
    public void testGetPureBooleanValue_NULL() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.NULL)));
    }
    @Test
    public void testGetPureBooleanValue_FALSE() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.FALSE)));
    }
    @Test
    public void testGetPureBooleanValue_VOID() {
        Node v = new Node(Token.VOID);
        v.addChildToBack(numberNode(0));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(v));
    }
    @Test
    public void testGetPureBooleanValue_NAME_undefined() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("undefined")));
    }
    @Test
    public void testGetPureBooleanValue_NAME_NaN() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nameNode("NaN")));
    }
    @Test
    public void testGetPureBooleanValue_NAME_Infinity() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(nameNode("Infinity")));
    }
    @Test
    public void testGetPureBooleanValue_TRUE() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.TRUE)));
    }
    @Test
    public void testGetPureBooleanValue_REGEXP() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.REGEXP)));
    }
    @Test
    public void testGetPureBooleanValue_ARRAYLIT_noSideEffects() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.ARRAYLIT)));
    }
    @Test
    public void testGetPureBooleanValue_other() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(nameNode("x")));
    }

    @Test
    public void testGetStringValue_STRING() {
        assertEquals("abc", NodeUtil.getStringValue(stringNode("abc")));
    }
    @Test
    public void testGetStringValue_NAME_undefined() {
        assertEquals("undefined", NodeUtil.getStringValue(nameNode("undefined")));
    }
    @Test
    public void testGetStringValue_NAME_Infinity() {
        assertEquals("Infinity", NodeUtil.getStringValue(nameNode("Infinity")));
    }
    @Test
    public void testGetStringValue_NAME_NaN() {
        assertEquals("NaN", NodeUtil.getStringValue(nameNode("NaN")));
    }
    @Test
    public void testGetStringValue_NUMBER_integer() {
        assertEquals("5", NodeUtil.getStringValue(numberNode(5.0)));
    }
    @Test
    public void testGetStringValue_NUMBER_fraction() {
        assertEquals("3.14", NodeUtil.getStringValue(numberNode(3.14)));
    }
    @Test
    public void testGetStringValue_FALSE() {
        assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    }
    @Test
    public void testGetStringValue_TRUE() {
        assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    }
    @Test
    public void testGetStringValue_NULL() {
        assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    }
    @Test
    public void testGetStringValue_VOID() {
        Node v = new Node(Token.VOID);
        v.addChildToBack(numberNode(0));
        assertEquals("undefined", NodeUtil.getStringValue(v));
    }
    @Test
    public void testGetStringValue_NOT_constant() {
        assertEquals("true", NodeUtil.getStringValue(notNode(stringNode(""))));
    }
    @Test
    public void testGetStringValue_ARRAYLIT() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(stringNode("a"));
        arr.addChildToBack(stringNode("b"));
        assertEquals("a,b", NodeUtil.getStringValue(arr));
    }
    @Test
    public void testGetStringValue_OBJECTLIT() {
        assertEquals("[object Object]", NodeUtil.getStringValue(new Node(Token.OBJECTLIT)));
    }
    @Test
    public void testGetStringValue_NAME_other() {
        assertNull(NodeUtil.getStringValue(nameNode("x")));
    }

    @Test
    public void testArrayToString_simple() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(stringNode("a"));
        arr.addChildToBack(stringNode("b"));
        assertEquals("a,b", NodeUtil.arrayToString(arr));
    }
    @Test
    public void testArrayToString_withEmpty() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(new Node(Token.EMPTY));
        arr.addChildToBack(stringNode("b"));
        assertEquals(",b", NodeUtil.arrayToString(arr));
    }
    @Test
    public void testArrayToString_nullChild() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(nameNode("x"));
        assertNull(NodeUtil.arrayToString(arr));
    }

    @Test
    public void testGetNumberValue_TRUE() {
        assertEquals(1.0, NodeUtil.getNumberValue(new Node(Token.TRUE)), 0.0);
    }
    @Test
    public void testGetNumberValue_FALSE() {
        assertEquals(0.0, NodeUtil.getNumberValue(new Node(Token.FALSE)), 0.0);
    }
    @Test
    public void testGetNumberValue_NULL() {
        assertEquals(0.0, NodeUtil.getNumberValue(new Node(Token.NULL)), 0.0);
    }
    @Test
    public void testGetNumberValue_NUMBER() {
        assertEquals(42.5, NodeUtil.getNumberValue(numberNode(42.5)), 0.0);
    }
    @Test
    public void testGetNumberValue_VOID_noSideEffects() {
        Node v = new Node(Token.VOID);
        v.addChildToBack(numberNode(0));
        assertEquals(Double.NaN, NodeUtil.getNumberValue(v), 0.0);
    }
    @Test
    public void testGetNumberValue_NAME_undefined() {
        assertEquals(Double.NaN, NodeUtil.getNumberValue(nameNode("undefined")), 0.0);
    }
    @Test
    public void testGetNumberValue_NAME_NaN() {
        assertEquals(Double.NaN, NodeUtil.getNumberValue(nameNode("NaN")), 0.0);
    }
    @Test
    public void testGetNumberValue_NAME_Infinity() {
        assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(nameNode("Infinity")), 0.0);
    }
    @Test
    public void testGetNumberValue_NEG_Infinity() {
        Node neg = new Node(Token.NEG);
        neg.addChildToBack(nameNode("Infinity"));
        assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(neg), 0.0);
    }
    @Test
    public void testGetNumberValue_NOT() {
        assertEquals(0.0, NodeUtil.getNumberValue(notNode(stringNode("x"))), 0.0);
    }
    @Test
    public void testGetNumberValue_STRING() {
        assertEquals(3.14, NodeUtil.getNumberValue(stringNode("3.14")), 0.0);
    }
    @Test
    public void testGetNumberValue_ARRAYLIT() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(stringNode("1"));
        assertEquals(1.0, NodeUtil.getNumberValue(arr), 0.0);
    }

    @Test
    public void testIsImmutableValue_STRING() {
        assertTrue(NodeUtil.isImmutableValue(stringNode("x")));
    }
    @Test
    public void testIsImmutableValue_NUMBER() {
        assertTrue(NodeUtil.isImmutableValue(numberNode(1)));
    }
    @Test
    public void testIsImmutableValue_NULL() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    }
    @Test
    public void testIsImmutableValue_TRUE() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    }
    @Test
    public void testIsImmutableValue_FALSE() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    }
    @Test
    public void testIsImmutableValue_NOT() {
        assertTrue(NodeUtil.isImmutableValue(notNode(stringNode("x"))));
    }
    @Test
    public void testIsImmutableValue_VOID() {
        Node v = new Node(Token.VOID);
        v.addChildToBack(stringNode("x"));
        assertTrue(NodeUtil.isImmutableValue(v));
    }
    @Test
    public void testIsImmutableValue_NEG() {
        Node n = new Node(Token.NEG);
        n.addChildToBack(numberNode(1));
        assertTrue(NodeUtil.isImmutableValue(n));
    }
    @Test
    public void testIsImmutableValue_NAME_undefined() {
        assertTrue(NodeUtil.isImmutableValue(nameNode("undefined")));
    }
    @Test
    public void testIsImmutableValue_NAME_Infinity() {
        assertTrue(NodeUtil.isImmutableValue(nameNode("Infinity")));
    }
    @Test
    public void testIsImmutableValue_NAME_NaN() {
        assertTrue(NodeUtil.isImmutableValue(nameNode("NaN")));
    }
    @Test
    public void testIsImmutableValue_otherNAME() {
        assertFalse(NodeUtil.isImmutableValue(nameNode("x")));
    }

    @Test
    public void testIsLiteralValue_ARRAYLIT_allLiteral() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(stringNode("a"));
        arr.addChildToBack(numberNode(2));
        assertTrue(NodeUtil.isLiteralValue(arr, true));
    }
    @Test
    public void testIsLiteralValue_ARRAYLIT_nonLiteral() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(nameNode("x"));
        assertFalse(NodeUtil.isLiteralValue(arr, true));
    }
    @Test
    public void testIsLiteralValue_FUNCTION_includeTrue() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(nameNode("f"));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(func);
        assertTrue(NodeUtil.isLiteralValue(func, true));
    }
    @Test
    public void testIsLiteralValue_FUNCTION_includeFalse() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(nameNode("f"));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(func);
        assertFalse(NodeUtil.isLiteralValue(func, false));
    }
    @Test
    public void testIsLiteralValue_OBJECTLIT_allLiteral() {
        Node obj = new Node(Token.OBJECTLIT);
        Node key = stringNode("k");
        key.addChildToBack(stringNode("v"));
        obj.addChildToBack(key);
        assertTrue(NodeUtil.isLiteralValue(obj, true));
    }
    @Test
    public void testIsLiteralValue_defaultImmutable() {
        assertTrue(NodeUtil.isLiteralValue(stringNode("x"), true));
    }

    @Test
    public void testIsEmptyBlock_nonBlock() {
        assertFalse(NodeUtil.isEmptyBlock(stringNode("x")));
    }
    @Test
    public void testIsEmptyBlock_blockWithOnlyEmpty() {
        Node block = blockNode();
        block.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isEmptyBlock(block));
    }
    @Test
    public void testIsEmptyBlock_blockWithNonEmpty() {
        Node block = blockNode();
        block.addChildToBack(stringNode("x"));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsSimpleOperator_ADD() {
        assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    }
    @Test
    public void testIsSimpleOperator_CALL() {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.CALL)));
    }

    @Test
    public void testIsAssignmentOp_ASSIGN() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }
    @Test
    public void testIsAssignmentOp_ADD() {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }

    @Test
    public void testFunctionCallHasSideEffects_noSideEffectsCall() {
        Node call = callNode(nameNode("f"));
        call.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }
    @Test
    public void testFunctionCallHasSideEffects_builtinName() {
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode(nameNode("Object"))));
    }
    @Test
    public void testFunctionCallHasSideEffects_nonBuiltinName() {
        assertTrue(NodeUtil.functionCallHasSideEffects(callNode(nameNode("alert"))));
    }
    @Test
    public void testFunctionCallHasSideEffects_MathFloor() {
        Node getprop = new Node(Token.GETPROP);
        getprop.addChildToBack(nameNode("Math"));
        getprop.addChildToBack(stringNode("floor"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode(getprop)));
    }
    @Test
    public void testFunctionCallHasSideEffects_REGEXP_test() {
        Node regexp = new Node(Token.REGEXP);
        Node getprop = new Node(Token.GETPROP);
        getprop.addChildToBack(regexp);
        getprop.addChildToBack(stringNode("test"));
        assertFalse(NodeUtil.functionCallHasSideEffects(callNode(getprop)));
    }
    @Test(expected = IllegalStateException.class)
    public void testFunctionCallHasSideEffects_notCall() {
        NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
    }

    @Test
    public void testConstructorCallHasSideEffects_noSideEffectsCall() {
        Node n = newNode(nameNode("Array"));
        n.putBooleanProp(Node.NO_SIDE_EFFECTS_CALL, true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(n));
    }
    @Test
    public void testConstructorCallHasSideEffects_knownWithoutSideEffects() {
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode(nameNode("Date"))));
    }
    @Test
    public void testConstructorCallHasSideEffects_other() {
        assertTrue(NodeUtil.constructorCallHasSideEffects(newNode(nameNode("MyClass"))));
    }
    @Test(expected = IllegalStateException.class)
    public void testConstructorCallHasSideEffects_notNew() {
        NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
    }

    @Test
    public void testMayHaveSideEffects_simpleOp() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(numberNode(1));
        add.addChildToBack(numberNode(2));
        assertFalse(NodeUtil.mayHaveSideEffects(add));
    }
    @Test
    public void testMayHaveSideEffects_CALL_withSideEffects() {
        assertTrue(NodeUtil.mayHaveSideEffects(callNode(nameNode("eval"))));
    }
    @Test
    public void testMayHaveSideEffects_NAME_withChild() {
        Node name = nameNode("x");
        name.addChildToBack(numberNode(1));
        assertTrue(NodeUtil.mayHaveSideEffects(name));
    }
    @Test
    public void testMayHaveSideEffects_NEW_noSideEffects() {
        assertFalse(NodeUtil.mayHaveSideEffects(newNode(nameNode("Array"))));
    }
    @Test
    public void testMayHaveSideEffects_THROW() {
        assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW)));
    }

    @Test
    public void testGetFunctionName_default() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(nameNode("myFunc"));
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(func);
        assertEquals("myFunc", NodeUtil.getFunctionName(func));
    }
    @Test
    public void testGetNearestFunctionName_fromParentSET() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(nameNode(""));
        Node setNode = new Node(Token.SET);
        setNode.setString("setter");
        setNode.addChildToBack(func);
        assertEquals("setter", NodeUtil.getNearestFunctionName(func));
    }

    @Test
    public void testIsFunction() {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    }
    @Test
    public void testIsFunctionExpression() {
        Node func = new Node(Token.FUNCTION);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(func);
        assertTrue(NodeUtil.isFunctionExpression(func));
    }
    @Test
    public void testIsFunctionDeclaration() {
        Node func = new Node(Token.FUNCTION);
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(func);
        assertTrue(NodeUtil.isFunctionDeclaration(func));
    }

    @Test
    public void testGetFunctionBody() {
        Node func = new Node(Token.FUNCTION);
        Node name = nameNode("f");
        Node params = new Node(Token.LP);
        Node body = blockNode();
        func.addChildToBack(name);
        func.addChildToBack(params);
        func.addChildToBack(body);
        assertSame(body, NodeUtil.getFunctionBody(func));
    }

    @Test
    public void testIsCallOrNew_call() {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.CALL)));
    }
    @Test
    public void testIsCallOrNew_new() {
        assertTrue(NodeUtil.isCallOrNew(new Node(Token.NEW)));
    }
    @Test
    public void testIsCallOrNew_other() {
        assertFalse(NodeUtil.isCallOrNew(new Node(Token.NAME)));
    }

    @Test
    public void testIsVar() {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    }
    @Test
    public void testIsVarDeclaration() {
        Node var = new Node(Token.VAR);
        Node name = nameNode("x");
        var.addChildToBack(name);
        assertTrue(NodeUtil.isVarDeclaration(name));
    }

    @Test
    public void testIsString() {
        assertTrue(NodeUtil.isString(stringNode("x")));
    }
    @Test
    public void testIsAssign() {
        assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    }
    @Test
    public void testIsExprAssign() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(new Node(Token.ASSIGN));
        assertTrue(NodeUtil.isExprAssign(expr));
    }
    @Test
    public void testIsExprCall() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(new Node(Token.CALL));
        assertTrue(NodeUtil.isExprCall(expr));
    }

    @Test
    public void testIsForIn_3children() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(nameNode("x"));
        forNode.addChildToBack(stringNode("y"));
        forNode.addChildToBack(blockNode());
        assertTrue(NodeUtil.isForIn(forNode));
    }
    @Test
    public void testIsForIn_4children() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(blockNode());
        assertFalse(NodeUtil.isForIn(forNode));
    }

    @Test
    public void testIsLoopStructure_FOR() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
    }
    @Test
    public void testIsControlStructure_IF() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    }

    @Test
    public void testGetConditionExpression_IF() {
        Node ifNode = new Node(Token.IF);
        Node cond = stringNode("c");
        ifNode.addChildToBack(cond);
        ifNode.addChildToBack(blockNode());
        assertSame(cond, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testIsStatementBlock_BLOCK() {
        assertTrue(NodeUtil.isStatementBlock(blockNode()));
    }
    @Test
    public void testIsStatementBlock_SCRIPT() {
        assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsGetProp() {
        assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    }
    @Test
    public void testIsGet() {
        assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    }

    @Test
    public void testIsReferenceName_nonEmpty() {
        assertTrue(NodeUtil.isReferenceName(nameNode("x")));
    }
    @Test
    public void testIsReferenceName_empty() {
        assertFalse(NodeUtil.isReferenceName(nameNode("")));
    }

    @Test
    public void testValueCheck_ASSIGN() {
        Node n = assignNode(nameNode("x"), stringNode(""));
        assertTrue(NodeUtil.valueCheck(n, n1 -> n1.getType() == Token.STRING));
    }
    @Test
    public void testValueCheck_HOOK() {
        Node n = hookNode(stringNode("c"), numberNode(1), numberNode(2));
        assertTrue(NodeUtil.valueCheck(n, NodeUtil.NUMBERIC_RESULT_PREDICATE));
    }

    @Test
    public void testIsNumericResult_ADD_numbers() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(numberNode(1));
        add.addChildToBack(numberNode(2));
        assertTrue(NodeUtil.isNumericResult(add));
    }
    @Test
    public void testIsNumericResult_ADD_string() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(numberNode(1));
        add.addChildToBack(stringNode("x"));
        assertFalse(NodeUtil.isNumericResult(add));
    }

    @Test
    public void testMayBeStringHelper_STRING() {
        assertTrue(NodeUtil.mayBeStringHelper(stringNode("x")));
    }
    @Test
    public void testMayBeStringHelper_NUMBER() {
        assertFalse(NodeUtil.mayBeStringHelper(numberNode(1)));
    }

    @Test
    public void testIsBooleanResult_TRUE() {
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.TRUE)));
    }
    @Test
    public void testIsBooleanResult_EQ() {
        assertTrue(NodeUtil.isBooleanResult(new Node(Token.EQ)));
    }

    @Test
    public void testIsUndefined_VOID() {
        Node v = new Node(Token.VOID);
        v.addChildToBack(numberNode(0));
        assertTrue(NodeUtil.isUndefined(v));
    }
    @Test
    public void testIsUndefined_NAME() {
        assertTrue(NodeUtil.isUndefined(nameNode("undefined")));
    }
    @Test
    public void testIsNull() {
        assertTrue(NodeUtil.isNull(new Node(Token.NULL)));
    }
    @Test
    public void testIsNullOrUndefined_NULL() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    }
    @Test
    public void testIsNullOrUndefined_VOID() {
        Node v = new Node(Token.VOID);
        v.addChildToBack(numberNode(0));
        assertTrue(NodeUtil.isNullOrUndefined(v));
    }

    @Test
    public void testIsAssociative_MUL() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
    }
    @Test
    public void testIsCommutative_BITOR() {
        assertTrue(NodeUtil.isCommutative(Token.BITOR));
    }

    @Test
    public void testPrecedence_COMMA() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
    }
    @Test
    public void testPrecedence_HOOK() {
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
    }
    @Test
    public void testPrecedence_primary() {
        assertEquals(15, NodeUtil.precedence(Token.NUMBER));
    }

    @Test
    public void testOpToStr_ADD() {
        assertEquals("+", NodeUtil.opToStr(Token.ADD));
    }
    @Test
    public void testOpToStr_unknown() {
        assertNull(NodeUtil.opToStr(Token.FUNCTION));
    }
    @Test(expected = Error.class)
    public void testOpToStrNoFail_unknown() {
        NodeUtil.opToStrNoFail(Token.FUNCTION);
    }

    @Test
    public void testContainsType_finds() {
        Node block = blockNode();
        block.addChildToBack(new Node(Token.TRUE));
        assertTrue(NodeUtil.containsType(block, Token.TRUE));
    }
    @Test
    public void testGetCount() {
        Node block = blockNode();
        block.addChildToBack(nameNode("a"));
        block.addChildToBack(nameNode("b"));
        assertEquals(2, NodeUtil.getCount(block, new NodeUtil.MatchNodeType(Token.NAME), Predicates.<Node>alwaysTrue()));
    }

    @Test
    public void testIsNameReferenced_found() {
        Node block = blockNode();
        block.addChildToBack(nameNode("x"));
        assertTrue(NodeUtil.isNameReferenced(block, "x"));
    }
    @Test
    public void testGetNameReferenceCount() {
        Node block = blockNode();
        block.addChildToBack(nameNode("a"));
        block.addChildToBack(nameNode("a"));
        assertEquals(2, NodeUtil.getNameReferenceCount(block, "a"));
    }

    @Test
    public void testHasFinally_true() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(blockNode());
        tryNode.addChildToBack(blockNode());
        tryNode.addChildToBack(blockNode());
        assertTrue(NodeUtil.hasFinally(tryNode));
    }
    @Test
    public void testHasFinally_false() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(blockNode());
        tryNode.addChildToBack(blockNode());
        assertFalse(NodeUtil.hasFinally(tryNode));
    }

    @Test
    public void testNewUndefinedNode() {
        Node undef = NodeUtil.newUndefinedNode(null);
        assertEquals(Token.VOID, undef.getType());
        assertNotNull(undef.getFirstChild());
        assertEquals(Token.NUMBER, undef.getFirstChild().getType());
    }
    @Test
    public void testNewVarNode_withValue() {
        Node var = NodeUtil.newVarNode("x", numberNode(42));
        assertEquals(Token.VAR, var.getType());
        Node name = var.getFirstChild();
        assertEquals("x", name.getString());
        assertEquals(42.0, name.getFirstChild().getDouble(), 0.0);
    }
    @Test
    public void testNewVarNode_noValue() {
        Node var = NodeUtil.newVarNode("y", null);
        assertEquals(Token.VAR, var.getType());
        Node name = var.getFirstChild();
        assertEquals("y", name.getString());
        assertNull(name.getFirstChild());
    }

    @Test
    public void testNewFunctionNode() {
        List<Node> params = Arrays.asList(nameNode("p"));
        Node body = blockNode();
        Node func = NodeUtil.newFunctionNode("f", params, body, 1, 1);
        assertEquals(Token.FUNCTION, func.getType());
        assertEquals("f", func.getFirstChild().getString());
    }

    @Test
    public void testNewCallNode() {
        Node call = NodeUtil.newCallNode(nameNode("f"), stringNode("a"));
        assertEquals(Token.CALL, call.getType());
        assertTrue(call.getBooleanProp(Node.FREE_CALL));
        assertEquals(2, call.getChildCount());
    }

    @Test
    public void testGetArgumentForCallOrNew() {
        Node call = callNode(nameNode("f"), stringNode("a"), stringNode("b"));
        assertEquals("a", NodeUtil.getArgumentForCallOrNew(call, 0).getString());
        assertEquals("b", NodeUtil.getArgumentForCallOrNew(call, 1).getString());
    }

    @Test
    public void testIsLatin_ascii() {
        assertTrue(NodeUtil.isLatin("hello"));
    }
    @Test
    public void testIsLatin_nonLatin() {
        assertFalse(NodeUtil.isLatin("héllo"));
    }

    @Test
    public void testIsValidPropertyName_valid() {
        assertTrue(NodeUtil.isValidPropertyName("prop"));
    }
    @Test
    public void testIsValidPropertyName_keyword() {
        assertFalse(NodeUtil.isValidPropertyName("if"));
    }

    @Test
    public void testGetStringNumberValue_hex() {
        assertEquals(255.0, NodeUtil.getStringNumberValue("0xFF"), 0.0);
    }
    @Test
    public void testGetStringNumberValue_hexInvalid() {
        assertEquals(Double.NaN, NodeUtil.getStringNumberValue("0xGG"), 0.0);
    }
    @Test
    public void testGetStringNumberValue_signHex() {
        assertNull(NodeUtil.getStringNumberValue("-0x1"));
    }
    @Test
    public void testGetStringNumberValue_infinity() {
        assertNull(NodeUtil.getStringNumberValue("infinity"));
    }
    @Test
    public void testGetStringNumberValue_regular() {
        assertEquals(3.14, NodeUtil.getStringNumberValue("3.14"), 0.0);
    }
    @Test
    public void testGetStringNumberValue_empty() {
        assertEquals(0.0, NodeUtil.getStringNumberValue(""), 0.0);
    }

    @Test
    public void testTrimJsWhiteSpace_noSpaces() {
        assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc"));
    }
    @Test
    public void testTrimJsWhiteSpace_leadingTrailing() {
        assertEquals("x", NodeUtil.trimJsWhiteSpace("  x  "));
    }
    @Test
    public void testTrimJsWhiteSpace_onlySpaces() {
        assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
    }

    @Test
    public void testIsStrWhiteSpaceChar_space() {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    }
    @Test
    public void testIsStrWhiteSpaceChar_vtab() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    }
    @Test
    public void testIsStrWhiteSpaceChar_nonSpace() {
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    }

    @Test
    public void testGetOpFromAssignmentOp() {
        assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetOpFromAssignmentOp_nonAssignment() {
        NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD));
    }

    @Test
    public void testEvaluatesToLocalValue_FUNCTION() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.FUNCTION)));
    }
    @Test
    public void testEvaluatesToLocalValue_REGEXP() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    }
    @Test
    public void testEvaluatesToLocalValue_ARRAYLIT() {
        assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    }
    @Test
    public void testEvaluatesToLocalValue_GETPROP_withLocals() {
        Node get = new Node(Token.GETPROP);
        get.addChildToBack(nameNode("x"));
        get.addChildToBack(stringNode("p"));
        assertFalse(NodeUtil.evaluatesToLocalValue(get));
    }
}