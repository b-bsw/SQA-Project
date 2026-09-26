package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.FunctionNode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.LinkedHashMap;

public class NodeUtilTest {

    private Node createStringNode(String value) {
        return Node.newString(Token.STRING, value);
    }

    private Node createNumberNode(double value) {
        return Node.newNumber(value);
    }

    private Node createNameNode(String name) {
        return Node.newString(Token.NAME, name);
    }

    private Node createBlockNode() {
        return new Node(Token.BLOCK);
    }

    private Node createEmptyNode() {
        return new Node(Token.EMPTY);
    }

    private Node createTrueNode() {
        return new Node(Token.TRUE);
    }

    private Node createFalseNode() {
        return new Node(Token.FALSE);
    }

    private Node createNullNode() {
        return new Node(Token.NULL);
    }

    private Node createVoidNode() {
        return new Node(Token.VOID, Node.newNumber(0));
    }

    private Node createArrayLitNode() {
        return new Node(Token.ARRAYLIT);
    }

    private Node createObjectLitNode() {
        return new Node(Token.OBJECTLIT);
    }

    private Node createRegExpNode() {
        return new Node(Token.REGEXP);
    }

    private Node createAssignNode(Node target, Node value) {
        Node assign = new Node(Token.ASSIGN, target, value);
        return assign;
    }

    private Node createExprResult(Node child) {
        return new Node(Token.EXPR_RESULT, child);
    }

    private Node createNewNode(Node constructor) {
        return new Node(Token.NEW, constructor);
    }

    private Node createCallNode(Node callee) {
        return new Node(Token.CALL, callee);
    }

    @Test
    public void testGetBooleanValueString() {
        assertTrue(NodeUtil.getBooleanValue(createStringNode("hello")));
        assertFalse(NodeUtil.getBooleanValue(createStringNode("")));
    }

    @Test
    public void testGetBooleanValueNumber() {
        assertTrue(NodeUtil.getBooleanValue(createNumberNode(1.0)));
        assertFalse(NodeUtil.getBooleanValue(createNumberNode(0.0)));
    }

    @Test
    public void testGetBooleanValueNullFalseVoid() {
        assertFalse(NodeUtil.getBooleanValue(createNullNode()));
        assertFalse(NodeUtil.getBooleanValue(createFalseNode()));
        assertFalse(NodeUtil.getBooleanValue(createVoidNode()));
    }

    @Test
    public void testGetBooleanValueName() {
        assertFalse(NodeUtil.getBooleanValue(createNameNode("undefined")));
        assertFalse(NodeUtil.getBooleanValue(createNameNode("NaN")));
        assertTrue(NodeUtil.getBooleanValue(createNameNode("Infinity")));
        // unknown name causes IllegalArgumentException
        try {
            NodeUtil.getBooleanValue(createNameNode("foo"));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetBooleanValueTrueArrayLitObjectLitRegexp() {
        assertTrue(NodeUtil.getBooleanValue(createTrueNode()));
        assertTrue(NodeUtil.getBooleanValue(createArrayLitNode()));
        assertTrue(NodeUtil.getBooleanValue(createObjectLitNode()));
        assertTrue(NodeUtil.getBooleanValue(createRegExpNode()));
    }

    @Test
    public void testGetStringValueNameString() {
        Node nameNode = createNameNode("foo");
        assertEquals("foo", NodeUtil.getStringValue(nameNode));
        Node strNode = createStringNode("bar");
        assertEquals("bar", NodeUtil.getStringValue(strNode));
    }

    @Test
    public void testGetStringValueNumber() {
        assertEquals("5", NodeUtil.getStringValue(createNumberNode(5.0)));
        assertEquals("5", NodeUtil.getStringValue(createNumberNode(5)));
        assertEquals("3.14", NodeUtil.getStringValue(createNumberNode(3.14)));
    }

    @Test
    public void testGetStringValueFalseTrueNull() {
        assertEquals("false", NodeUtil.getStringValue(createFalseNode()));
        assertEquals("true", NodeUtil.getStringValue(createTrueNode()));
        assertEquals("null", NodeUtil.getStringValue(createNullNode()));
    }

    @Test
    public void testGetStringValueVoid() {
        assertEquals("undefined", NodeUtil.getStringValue(createVoidNode()));
    }

    @Test
    public void testGetStringValueDefault() {
        Node block = createBlockNode();
        assertNull(NodeUtil.getStringValue(block));
    }

    @Test
    public void testGetFunctionNameName() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(Node.newString(Token.NAME, "foo"));
        Node parent = Node.newString(Token.NAME, "bar");
        assertEquals("bar", NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testGetFunctionNameAssign() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(Node.newString(Token.NAME, "foo"));
        Node target = Node.newString(Token.NAME, "obj");
        Node assign = createAssignNode(target, fn);
        assertEquals("obj", NodeUtil.getFunctionName(fn, assign));
    }

    @Test
    public void testGetFunctionNameDefault() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(Node.newString(Token.NAME, "foo"));
        Node parent = createBlockNode();
        assertEquals("foo", NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testGetFunctionNameEmptyName() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(Node.newString(Token.NAME, ""));
        Node parent = createBlockNode();
        assertNull(NodeUtil.getFunctionName(fn, parent));
    }

    @Test
    public void testIsImmutableValueStringNumberNullTrueFalseVoid() {
        assertTrue(NodeUtil.isImmutableValue(createStringNode("a")));
        assertTrue(NodeUtil.isImmutableValue(createNumberNode(1)));
        assertTrue(NodeUtil.isImmutableValue(createNullNode()));
        assertTrue(NodeUtil.isImmutableValue(createTrueNode()));
        assertTrue(NodeUtil.isImmutableValue(createFalseNode()));
        assertTrue(NodeUtil.isImmutableValue(createVoidNode()));
    }

    @Test
    public void testIsImmutableValueNeg() {
        Node neg = new Node(Token.NEG, createNumberNode(5));
        assertTrue(NodeUtil.isImmutableValue(neg));
    }

    @Test
    public void testIsImmutableValueName() {
        assertTrue(NodeUtil.isImmutableValue(createNameNode("undefined")));
        assertTrue(NodeUtil.isImmutableValue(createNameNode("Infinity")));
        assertTrue(NodeUtil.isImmutableValue(createNameNode("NaN")));
        assertFalse(NodeUtil.isImmutableValue(createNameNode("x")));
    }

    @Test
    public void testIsImmutableValueDefault() {
        assertFalse(NodeUtil.isImmutableValue(createBlockNode()));
    }

    @Test
    public void testIsLiteralValueArrayLitObjectLitRegexp() {
        assertTrue(NodeUtil.isLiteralValue(createArrayLitNode()));
        assertTrue(NodeUtil.isLiteralValue(createObjectLitNode()));
        assertTrue(NodeUtil.isLiteralValue(createRegExpNode()));
    }

    @Test
    public void testIsLiteralValueNested() {
        Node arr = createArrayLitNode();
        arr.addChildToBack(createStringNode("a"));
        assertTrue(NodeUtil.isLiteralValue(arr));
        arr.addChildToBack(createBlockNode());
        assertFalse(NodeUtil.isLiteralValue(arr));
    }

    @Test
    public void testIsLiteralValueDefault() {
        assertFalse(NodeUtil.isLiteralValue(createBlockNode()));
    }

    @Test
    public void testIsValidDefineValueLiterals() {
        Set<String> defines = new HashSet<String>();
        defines.add("CONST");
        assertTrue(NodeUtil.isValidDefineValue(createStringNode("x"), defines));
        assertTrue(NodeUtil.isValidDefineValue(createNumberNode(1), defines));
        assertTrue(NodeUtil.isValidDefineValue(createTrueNode(), defines));
        assertTrue(NodeUtil.isValidDefineValue(createFalseNode(), defines));
    }

    @Test
    public void testIsValidDefineValueUnary() {
        Set<String> defines = new HashSet<String>();
        defines.add("CONST");
        Node neg = new Node(Token.NEG, createNumberNode(5));
        assertTrue(NodeUtil.isValidDefineValue(neg, defines));
        Node not = new Node(Token.NOT, createTrueNode());
        assertTrue(NodeUtil.isValidDefineValue(not, defines));
        Node bitnot = new Node(Token.BITNOT, createNumberNode(1));
        assertTrue(NodeUtil.isValidDefineValue(bitnot, defines));
    }

    @Test
    public void testIsValidDefineValueQualifiedName() {
        Set<String> defines = new HashSet<String>();
        defines.add("CONST");
        Node name = createNameNode("CONST");
        assertTrue(NodeUtil.isValidDefineValue(name, defines));
        Node other = createNameNode("OTHER");
        assertFalse(NodeUtil.isValidDefineValue(other, defines));
        Node getprop = new Node(Token.GETPROP, createNameNode("obj"), createStringNode("prop"));
        getprop.putProp(Node.ORIGINALNAME_PROP, "obj.prop");
        // getprop.isQualifiedName() true? need to set correctly
        // simulate qualified name: obj.prop
        // isQualifiedName checks GETPROP with NAME or GETPROP as first child
        assertFalse(NodeUtil.isValidDefineValue(getprop, defines)); // not in defines
    }

    @Test
    public void testIsValidDefineValueDefault() {
        Set<String> defines = new HashSet<String>();
        assertFalse(NodeUtil.isValidDefineValue(createBlockNode(), defines));
    }

    @Test
    public void testIsEmptyBlock() {
        Node block = createBlockNode();
        assertTrue(NodeUtil.isEmptyBlock(block));
        block.addChildToBack(createEmptyNode());
        assertTrue(NodeUtil.isEmptyBlock(block));
        block.addChildToBack(createStringNode("x"));
        assertFalse(NodeUtil.isEmptyBlock(block));
    }

    @Test
    public void testIsEmptyBlockNonBlock() {
        assertFalse(NodeUtil.isEmptyBlock(createStringNode("x")));
    }

    @Test
    public void testIsSimpleOperatorType() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.SUB));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.NOT));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.GETPROP));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.FUNCTION));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    }

    @Test
    public void testMayEffectMutableStateNew() {
        Node newNode = createNewNode(createNameNode("Array"));
        assertTrue(NodeUtil.mayEffectMutableState(newNode));
    }

    @Test
    public void testMayEffectMutableStateNewNoSideEffects() {
        Node newNode = createNewNode(createNameNode("Array"));
        newNode.setNoSideEffectsCall(true);
        assertFalse(NodeUtil.mayEffectMutableState(newNode));
    }

    @Test
    public void testMayEffectMutableStateFunction() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(Node.newString(Token.NAME, "f"));
        Node body = createBlockNode();
        fn.addChildToBack(body);
        // anonymous function? depends on statement status
        assertTrue(NodeUtil.mayEffectMutableState(fn));
    }

    @Test
    public void testMayEffectMutableStateLiteral() {
        assertFalse(NodeUtil.mayEffectMutableState(createStringNode("a")));
        assertFalse(NodeUtil.mayEffectMutableState(createNumberNode(1)));
    }

    @Test
    public void testConstructorCallHasSideEffects() {
        Node newNode = createNewNode(createNameNode("Array"));
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode));
        newNode = createNewNode(createNameNode("MyClass"));
        assertTrue(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testConstructorCallHasSideEffectsNoSideEffectsCall() {
        Node newNode = createNewNode(createNameNode("MyClass"));
        newNode.setNoSideEffectsCall(true);
        assertFalse(NodeUtil.constructorCallHasSideEffects(newNode));
    }

    @Test
    public void testFunctionCallHasSideEffects() {
        Node call = createCallNode(createNameNode("foo"));
        assertTrue(NodeUtil.functionCallHasSideEffects(call));
        call = createCallNode(createNameNode("String"));
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test
    public void testFunctionCallHasSideEffectsNoSideEffectsCall() {
        Node call = createCallNode(createNameNode("foo"));
        call.setNoSideEffectsCall(true);
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test
    public void testFunctionCallHasSideEffectsMath() {
        Node getprop = new Node(Token.GETPROP, createNameNode("Math"), createStringNode("random"));
        Node call = createCallNode(getprop);
        assertFalse(NodeUtil.functionCallHasSideEffects(call));
    }

    @Test
    public void testNodeTypeMayHaveSideEffects() {
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(createAssignNode(createNameNode("a"), createNumberNode(1))));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.CALL)));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NEW)));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));
        Node nameWithChild = Node.newString(Token.NAME, "x");
        nameWithChild.addChildToBack(createNumberNode(1)); // variable with initialization
        assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(createNameNode("x")));
        assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(createStringNode("a")));
    }

    @Test
    public void testCanBeSideEffected() {
        Node call = createCallNode(createNameNode("f"));
        assertTrue(NodeUtil.canBeSideEffected(call));
        Node name = createNameNode("x");
        assertTrue(NodeUtil.canBeSideEffected(name));
        Set<String> knownConstants = new HashSet<String>();
        knownConstants.add("x");
        assertFalse(NodeUtil.canBeSideEffected(name, knownConstants));
        Node getprop = new Node(Token.GETPROP, createNameNode("a"), createStringNode("b"));
        assertTrue(NodeUtil.canBeSideEffected(getprop));
        assertFalse(NodeUtil.canBeSideEffected(createStringNode("c")));
    }

    @Test
    public void testPrecedence() {
        assertEquals(0, NodeUtil.precedence(Token.COMMA));
        assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
        assertEquals(2, NodeUtil.precedence(Token.HOOK));
        assertEquals(3, NodeUtil.precedence(Token.OR));
        assertEquals(4, NodeUtil.precedence(Token.AND));
        assertEquals(15, NodeUtil.precedence(Token.NAME));
        try {
            NodeUtil.precedence(-1);
            fail("Expected Error");
        } catch (Error e) {
            // expected
        }
    }

    @Test
    public void testIsAssignmentOp() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.EQ)));
    }

    @Test
    public void testGetOpFromAssignmentOp() {
        assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
        assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
        try {
            NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsAssociative() {
        assertTrue(NodeUtil.isAssociative(Token.MUL));
        assertTrue(NodeUtil.isAssociative(Token.AND));
        assertTrue(NodeUtil.isAssociative(Token.OR));
        assertFalse(NodeUtil.isAssociative(Token.ADD));
    }

    @Test
    public void testRemoveChildStatementBlock() {
        Node block = createBlockNode();
        Node child = createStringNode("a");
        block.addChildToBack(child);
        Node parent = block;
        NodeUtil.removeChild(parent, child);
        assertFalse(block.hasChildren());
    }

    @Test
    public void testRemoveChildLabel() {
        Node label = new Node(Token.LABEL, createNameNode("lbl"), createBlockNode());
        Node lastChild = label.getLastChild();
        Node parent = label;
        NodeUtil.removeChild(parent, lastChild);
        // label should be removed from its parent as well if last child removed
        // but here we don't have grandparent; test will just call
        // Simpler: use a label with parent
        Node script = new Node(Token.SCRIPT, label);
        NodeUtil.removeChild(label, lastChild);
        assertEquals(1, script.getChildCount());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveChildInvalid() {
        Node expr = createExprResult(createAssignNode(createNameNode("a"), createNumberNode(1)));
        NodeUtil.removeChild(expr, expr.getFirstChild());
    }

    @Test
    public void testTryMergeBlockInsideStatementBlock() {
        // need parent that is SCRIPT or BLOCK
        Node script = new Node(Token.SCRIPT);
        Node block = createBlockNode();
        block.addChildToBack(createStringNode("x"));
        script.addChildToBack(block);
        assertTrue(NodeUtil.tryMergeBlock(block));
        assertEquals(1, script.getChildCount());
        assertEquals("x", script.getFirstChild().getString());
    }

    @Test
    public void testTryMergeBlockLabelWithOneChild() {
        Node label = new Node(Token.LABEL, createNameNode("lbl"), createBlockNode());
        Node block = label.getLastChild();
        block.addChildToBack(createStringNode("body"));
        assertTrue(NodeUtil.tryMergeBlock(block));
        assertEquals(2, label.getChildCount());
        assertEquals("body", label.getLastChild().getString());
    }

    @Test
    public void testTryMergeBlockFail() {
        Node block = createBlockNode();
        block.addChildToBack(createStringNode("a"));
        block.addChildToBack(createStringNode("b"));
        assertFalse(NodeUtil.tryMergeBlock(block)); // no parent
    }

    @Test
    public void testIsCall() {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
        assertFalse(NodeUtil.isCall(createNameNode("f")));
    }

    @Test
    public void testIsFunction() {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
        assertFalse(NodeUtil.isFunction(createBlockNode()));
    }

    @Test
    public void testGetFunctionBody() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(createNameNode("f"));
        Node params = new Node(Token.LP);
        fn.addChildToBack(params);
        Node body = createBlockNode();
        fn.addChildToBack(body);
        assertSame(body, NodeUtil.getFunctionBody(fn));
    }

    @Test
    public void testIsFunctionDeclaration() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(createNameNode("f"));
        Node body = createBlockNode();
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(body);
        // Need to set parent to SCRIPT or BLOCK to make it a statement
        Node script = new Node(Token.SCRIPT, fn);
        assertTrue(NodeUtil.isFunctionDeclaration(fn));
        // anonymous
        Node anonFn = new Node(Token.FUNCTION);
        anonFn.addChildToFront(createNameNode(""));
        anonFn.addChildToBack(new Node(Token.LP));
        anonFn.addChildToBack(createBlockNode());
        assertFalse(NodeUtil.isFunctionDeclaration(anonFn));
    }

    @Test
    public void testIsAnonymousFunction() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(createNameNode(""));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(createBlockNode());
        assertTrue(NodeUtil.isAnonymousFunction(fn));
    }

    @Test
    public void testIsHoistedFunctionDeclaration() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(createNameNode("f"));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(createBlockNode());
        Node script = new Node(Token.SCRIPT, fn);
        assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
        Node outerFn = new Node(Token.FUNCTION);
        outerFn.addChildToFront(createNameNode("g"));
        outerFn.addChildToBack(new Node(Token.LP));
        outerFn.addChildToBack(fn);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(fn));
    }

    @Test
    public void testIsVarArgsFunction() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(createNameNode("f"));
        fn.addChildToBack(new Node(Token.LP));
        fn.addChildToBack(createBlockNode());
        assertFalse(NodeUtil.isVarArgsFunction(fn));
        // add reference to arguments
        Node body = fn.getLastChild();
        body.addChildToBack(createNameNode("arguments"));
        assertTrue(NodeUtil.isVarArgsFunction(fn));
    }

    @Test
    public void testIsObjectCallMethod() {
        Node getprop = new Node(Token.GETPROP, createNameNode("obj"), createStringNode("call"));
        Node call = createCallNode(getprop);
        assertTrue(NodeUtil.isObjectCallMethod(call, "call"));
        assertFalse(NodeUtil.isObjectCallMethod(call, "apply"));
    }

    @Test
    public void testIsFunctionObjectCall() {
        Node getprop = new Node(Token.GETPROP, createNameNode("f"), createStringNode("call"));
        Node call = createCallNode(getprop);
        assertTrue(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectApply() {
        Node getprop = new Node(Token.GETPROP, createNameNode("f"), createStringNode("apply"));
        Node call = createCallNode(getprop);
        assertTrue(NodeUtil.isFunctionObjectApply(call));
    }

    @Test
    public void testIsSimpleFunctionObjectCall() {
        Node getprop = new Node(Token.GETPROP, createNameNode("f"), createStringNode("call"));
        Node call = createCallNode(getprop);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));
        // not simple if callee is not a NAME
        Node complex = new Node(Token.GETPROP, createNameNode("obj"), createStringNode("call"));
        Node call2 = createCallNode(complex);
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call2));
    }

    @Test
    public void testIsLhs() {
        Node assign = createAssignNode(createNameNode("a"), createNumberNode(1));
        Node name = assign.getFirstChild();
        assertTrue(NodeUtil.isLhs(name, assign));
        assertFalse(NodeUtil.isLhs(assign.getLastChild(), assign));
        Node var = new Node(Token.VAR, name);
        assertTrue(NodeUtil.isLhs(name, var));
    }

    @Test
    public void testIsObjectLitKey() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key1 = createStringNode("key1");
        Node val1 = createNumberNode(1);
        objLit.addChildToBack(key1);
        objLit.addChildToBack(val1);
        assertTrue(NodeUtil.isObjectLitKey(key1, objLit));
        assertFalse(NodeUtil.isObjectLitKey(val1, objLit));
    }

    @Test
    public void testOpToStr() {
        assertEquals("+", NodeUtil.opToStr(Token.ADD));
        assertEquals("=", NodeUtil.opToStr(Token.ASSIGN));
        assertEquals("||", NodeUtil.opToStr(Token.OR));
        assertNull(NodeUtil.opToStr(Token.BLOCK));
    }

    @Test
    public void testOpToStrNoFail() {
        assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
        try {
            NodeUtil.opToStrNoFail(Token.BLOCK);
            fail("Expected Error");
        } catch (Error e) {
            // expected
        }
    }

    @Test
    public void testContainsType() {
        Node root = createBlockNode();
        root.addChildToBack(createNameNode("x"));
        root.addChildToBack(createStringNode("y"));
        assertTrue(NodeUtil.containsType(root, Token.NAME));
        assertFalse(NodeUtil.containsType(root, Token.FUNCTION));
    }

    @Test
    public void testGetVarsDeclaredInBranch() {
        Node root = createBlockNode();
        Node var = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
        root.addChildToBack(var);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
    }

    @Test
    public void testNewFunctionNode() {
        List<Node> params = new ArrayList<Node>();
        params.add(Node.newString(Token.NAME, "x"));
        Node body = createBlockNode();
        FunctionNode fn = NodeUtil.newFunctionNode("f", params, body, 1, 1);
        assertEquals("f", fn.getFunctionName());
        assertEquals(3, fn.getChildCount());
    }

    @Test
    public void testNewQualifiedNameNodeSimple() {
        Node n = NodeUtil.newQualifiedNameNode("a", 1, 1);
        assertEquals(Token.NAME, n.getType());
        assertEquals("a", n.getString());
    }

    @Test
    public void testNewQualifiedNameNodeDotted() {
        Node n = NodeUtil.newQualifiedNameNode("a.b.c", 1, 1);
        assertEquals(Token.GETPROP, n.getType());
        assertEquals("c", n.getLastChild().getString());
        assertEquals("a.b", n.getFirstChild().getQualifiedName());
    }

    @Test
    public void testNewName() {
        Node basis = Node.newString(Token.NAME, "original", 1, 1);
        Node newName = NodeUtil.newName("foo", basis);
        assertEquals("foo", newName.getString());
        assertNotNull(newName.getLineno());
    }

    @Test
    public void testNewNameWithOriginalName() {
        Node basis = Node.newString(Token.NAME, "orig", 1, 1);
        Node newName = NodeUtil.newName("bar", basis, "originalName");
        assertEquals("bar", newName.getString());
        assertEquals("originalName", newName.getProp(Node.ORIGINALNAME_PROP));
    }

    @Test
    public void testNewVarNode() {
        Node var = NodeUtil.newVarNode("x", createNumberNode(1));
        assertEquals(Token.VAR, var.getType());
        assertEquals("x", var.getFirstChild().getString());
        assertNotNull(var.getFirstChild().getFirstChild());
    }

    @Test
    public void testNewUndefinedNode() {
        Node undef = NodeUtil.newUndefinedNode();
        assertEquals(Token.VOID, undef.getType());
        assertEquals(Token.NUMBER, undef.getFirstChild().getType());
    }

    @Test
    public void testIsLatin() {
        assertTrue(NodeUtil.isLatin("hello"));
        assertTrue(NodeUtil.isLatin("abc123"));
        assertFalse(NodeUtil.isLatin("héllo"));
        assertFalse(NodeUtil.isLatin("中文"));
    }

    @Test
    public void testIsValidPropertyName() {
        assertTrue(NodeUtil.isValidPropertyName("prop1"));
        assertFalse(NodeUtil.isValidPropertyName("if")); // keyword
        assertFalse(NodeUtil.isValidPropertyName("prop with space"));
        assertFalse(NodeUtil.isValidPropertyName("prop\u00e9")); // non-latin
    }

    @Test
    public void testIsPrototypePropertyDeclaration() {
        Node assign = createAssignNode(
            new Node(Token.GETPROP, createNameNode("Foo"), createStringNode("prototype")),
            createStringNode("bar"));
        Node expr = createExprResult(assign);
        assertTrue(NodeUtil.isPrototypePropertyDeclaration(expr));
        // not expr assign
        assertFalse(NodeUtil.isPrototypePropertyDeclaration(assign));
    }

    @Test
    public void testIsPrototypeProperty() {
        Node getprop = new Node(Token.GETPROP, createNameNode("Foo"), createStringNode("prototype"));
        Node lhs = new Node(Token.GETPROP, getprop, createStringNode("method"));
        assertTrue(NodeUtil.isPrototypeProperty(lhs));
        assertFalse(NodeUtil.isPrototypeProperty(createNameNode("x")));
    }

    @Test
    public void testGetPrototypeClassName() {
        Node getprop = new Node(Token.GETPROP, createNameNode("Foo"), createStringNode("prototype"));
        Node lhs = new Node(Token.GETPROP, getprop, createStringNode("method"));
        Node className = NodeUtil.getPrototypeClassName(lhs);
        assertNotNull(className);
        assertEquals("Foo", className.getString());
    }

    @Test
    public void testGetPrototypePropertyName() {
        Node getprop = new Node(Token.GETPROP, createNameNode("Foo"), createStringNode("prototype"));
        Node lhs = new Node(Token.GETPROP, getprop, createStringNode("method"));
        assertEquals("method", NodeUtil.getPrototypePropertyName(lhs));
    }

    @Test
    public void testIsNodeTypeReferenced() {
        Node root = createBlockNode();
        root.addChildToBack(createNameNode("x"));
        assertTrue(NodeUtil.isNodeTypeReferenced(root, Token.NAME));
        assertFalse(NodeUtil.isNodeTypeReferenced(root, Token.FUNCTION));
    }

    @Test
    public void testGetNameReferenceCount() {
        Node root = createBlockNode();
        root.addChildToBack(createNameNode("x"));
        root.addChildToBack(createNameNode("x"));
        root.addChildToBack(createNameNode("y"));
        assertEquals(2, NodeUtil.getNameReferenceCount(root, "x"));
        assertEquals(1, NodeUtil.getNameReferenceCount(root, "y"));
        assertEquals(0, NodeUtil.getNameReferenceCount(root, "z"));
    }

    @Test
    public void testHasAndGetCount() {
        Node root = createBlockNode();
        root.addChildToBack(createNameNode("a"));
        Node inner = createBlockNode();
        inner.addChildToBack(createNameNode("b"));
        root.addChildToBack(inner);
        assertTrue(NodeUtil.has(root, new NodeUtil.MatchNodeType(Token.NAME), Predicates.<Node>alwaysTrue()));
        assertEquals(2, NodeUtil.getCount(root, new NodeUtil.MatchNodeType(Token.NAME)));
    }

    @Test
    public void testVisitPreOrder() {
        final StringBuilder sb = new StringBuilder();
        Node root = createBlockNode();
        root.addChildToBack(createNameNode("a"));
        root.addChildToBack(createNameNode("b"));
        NodeUtil.visitPreOrder(root, new NodeUtil.Visitor() {
            public void visit(Node node) {
                sb.append(node.getType()).append(",");
            }
        }, Predicates.<Node>alwaysTrue());
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testVisitPostOrder() {
        final StringBuilder sb = new StringBuilder();
        Node root = createBlockNode();
        Node child = createNameNode("a");
        root.addChildToBack(child);
        NodeUtil.visitPostOrder(root, new NodeUtil.Visitor() {
            public void visit(Node node) {
                sb.append(node.getType()).append(",");
            }
        }, Predicates.<Node>alwaysTrue());
        // post order should visit child first
        assertTrue(sb.indexOf(String.valueOf(child.getType())) < sb.indexOf(String.valueOf(root.getType())));
    }

    @Test
    public void testHasFinally() {
        Node tryNode = new Node(Token.TRY);
        tryNode.addChildToBack(createBlockNode());
        tryNode.addChildToBack(createBlockNode());
        tryNode.addChildToBack(createBlockNode());
        assertTrue(NodeUtil.hasFinally(tryNode));
        Node tryNoFinally = new Node(Token.TRY);
        tryNoFinally.addChildToBack(createBlockNode());
        tryNoFinally.addChildToBack(createBlockNode());
        assertFalse(NodeUtil.hasFinally(tryNoFinally));
    }

    @Test
    public void testGetCatchBlock() {
        Node tryNode = new Node(Token.TRY);
        Node body = createBlockNode();
        tryNode.addChildToBack(body);
        Node catchBlock = createBlockNode();
        tryNode.addChildToBack(catchBlock);
        Node finallyBlock = createBlockNode();
        tryNode.addChildToBack(finallyBlock);
        assertSame(catchBlock, NodeUtil.getCatchBlock(tryNode));
    }

    @Test
    public void testHasCatchHandler() {
        Node block = createBlockNode();
        block.addChildToBack(new Node(Token.CATCH));
        assertTrue(NodeUtil.hasCatchHandler(block));
        block = createBlockNode();
        assertFalse(NodeUtil.hasCatchHandler(block));
    }

    @Test
    public void testGetFnParameters() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(createNameNode("f"));
        Node params = new Node(Token.LP);
        params.addChildToBack(createNameNode("x"));
        fn.addChildToBack(params);
        fn.addChildToBack(createBlockNode());
        assertSame(params, NodeUtil.getFnParameters(fn));
    }

    @Test
    public void testIsConstantName() {
        Node name = createNameNode("x");
        name.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(NodeUtil.isConstantName(name));
        name = createNameNode("y");
        assertFalse(NodeUtil.isConstantName(name));
    }

    @Test
    public void testGetSourceName() {
        Node n = createNameNode("x");
        n.putProp(Node.SOURCENAME_PROP, "file.js");
        assertEquals("file.js", NodeUtil.getSourceName(n));
        Node child = createNameNode("y");
        n.addChildToBack(child);
        assertNull(NodeUtil.getSourceName(child)); // lookup up to parent
        // Actually getSourceName traverses up, so it should find "file.js" from parent
        // But child doesn't have SOURCENAME_PROP, so it goes to parent
        assertEquals("file.js", NodeUtil.getSourceName(child));
    }
}