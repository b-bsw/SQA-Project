package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.JSTypeRegistry;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TypeCheckTest {

    private AbstractCompiler compiler;
    private JSTypeRegistry typeRegistry;
    private ReverseAbstractInterpreter reverseInterpreter;
    private TypeCheck typeCheck;
    private Node externsRoot;
    private Node jsRoot;
    private Scope topScope;
    private ScopeCreator scopeCreator;

    @Before
    public void setUp() {
        compiler = Compiler.getInstance();
        typeRegistry = compiler.getTypeRegistry();
        reverseInterpreter = new ReverseAbstractInterpreter(compiler);
        externsRoot = new Node(Token.SCRIPT);
        jsRoot = new Node(Token.BLOCK);
        topScope = null;
        scopeCreator = null;
    }

    @Test
    public void testConstructorWithAllParameters() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry, null, null, CheckLevel.WARNING, CheckLevel.OFF);
        assertNotNull(typeCheck);
    }

    @Test
    public void testConstructorWithAbstractCompilerOnly() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        assertNotNull(typeCheck);
    }

    @Test(expected = NullPointerException.class)
    public void testProcessNullScopeCreator() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry, null, null, CheckLevel.WARNING, CheckLevel.OFF);
        typeCheck.process(externsRoot, jsRoot);
    }

    @Test(expected = NullPointerException.class)
    public void testProcessNullTopScope() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        topScope = scopeCreator.createScope(new Node(Token.SCRIPT), null);
        typeCheck.topScope = null;
        typeCheck.scopeCreator = scopeCreator;
        typeCheck.process(externsRoot, jsRoot);
    }

    @Test(expected = NullPointerException.class)
    public void testProcessNullParent() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        typeCheck.topScope = new Scope(null, null);
        typeCheck.scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        Node orphanNode = new Node(Token.BLOCK);
        typeCheck.process(externsRoot, orphanNode);
    }

    @Test
    public void testGetTypedPercentZero() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.001);
    }

    @Test
    public void testGetTypedPercentNonZero() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        typeCheck.nullCount = 0;
        typeCheck.unknownCount = 0;
        typeCheck.typedCount = 10;
        assertEquals(100.0, typeCheck.getTypedPercent(), 0.001);
    }

    @Test
    public void testGetTypedPercentMixed() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        typeCheck.nullCount = 5;
        typeCheck.unknownCount = 3;
        typeCheck.typedCount = 2;
        double expected = (100.0 * 2) / (5 + 3 + 2);
        assertEquals(expected, typeCheck.getTypedPercent(), 0.001);
    }

    @Test
    public void testReportMissingPropertiesTrue() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        TypeCheck returned = typeCheck.reportMissingProperties(true);
        assertTrue(returned.reportMissingProperties);
    }

    @Test
    public void testReportMissingPropertiesFalse() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        typeCheck.reportMissingProperties(false);
        assertTrue(!typeCheck.reportMissingProperties);
    }

    @Test
    public void testShouldTraverseFunctionNoMasking() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, null);
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "myFunc");
        functionNode.addChildToFront(nameNode);
        Node parent = new Node(Token.SCRIPT);
        boolean result = typeCheck.shouldTraverse(t, functionNode, parent);
        assertTrue(result);
    }

    @Test
    public void testShouldTraverseFunctionMasksVariable() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, null);
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "existingVar");
        functionNode.addChildToFront(nameNode);
        Node parent = new Node(Token.VAR);
        parent.addChildToBack(nameNode);
        boolean result = typeCheck.shouldTraverse(t, functionNode, parent);
        assertTrue(result);
    }

    @Test
    public void testVisitNameWithNullType() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, null);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.EXPR_RESULT);
        boolean result = typeCheck.visitName(t, nameNode, parent);
        assertTrue(result);
    }

    @Test
    public void testVisitNameInFunctionParam() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, null);
        Node nameNode = Node.newString(Token.NAME, "param");
        Node parent = new Node(Token.LP);
        boolean result = typeCheck.visitName(t, nameNode, parent);
        assertTrue(!result);
    }

    @Test
    public void testVisitGetPropWithKnownProperty() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = Node.newString(Token.NAME, "obj");
        Node propNode = Node.newString(Token.STRING, "prop");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNode);
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToFront(getPropNode);
        JSType objType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        objNode.setJSType(objType);
        typeCheck.visitGetProp(null, getPropNode, parent);
        assertNotNull(getPropNode.getJSType());
    }

    @Test
    public void testVisitGetPropNullObject() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = Node.newString(Token.NULL);
        Node propNode = Node.newString(Token.STRING, "x");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNode);
        Node parent = new Node(Token.EXPR_RESULT);
        typeCheck.visitGetProp(null, getPropNode, parent);
        assertNotNull(getPropNode.getJSType());
    }

    @Test
    public void testCheckPropertyAccessExistingProperty() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = Node.newString(Token.NAME, "arr");
        JSType objType = typeRegistry.getNativeType(JSTypeNative.ARRAY_TYPE);
        objNode.setJSType(objType);
        Node propNode = Node.newString(Token.STRING, "length");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, null);
        typeCheck.checkPropertyAccess(objType, "length", t, getPropNode);
    }

    @Test
    public void testCheckPropertyAccessNonExistentProperty() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        typeCheck.reportMissingProperties(true);
        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = Node.newString(Token.NAME, "obj");
        JSType objType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        objNode.setJSType(objType);
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(Node.newString(Token.STRING, "nonExistent"));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, null);
        typeCheck.checkPropertyAccess(objType, "nonExistent", t, getPropNode);
        assertEquals(JSTypeNative.UNKNOWN_TYPE, getPropNode.getJSType().getNativeType());
    }

    @Test
    public void testVisitNewWithConstructor() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node newNode = new Node(Token.NEW);
        Node constructorNode = Node.newString(Token.NAME, "Array");
        FunctionType arrFuncType = typeRegistry.getNativeFunctionType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        constructorNode.setJSType(arrFuncType);
        newNode.addChildToFront(constructorNode);
        typeCheck.visitNew(null, newNode);
        assertNotNull(newNode.getJSType());
    }

    @Test
    public void testVisitNewNonConstructor() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node newNode = new Node(Token.NEW);
        Node constructorNode = Node.newString(Token.NAME, "number");
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        constructorNode.setJSType(numType);
        newNode.addChildToFront(constructorNode);
        typeCheck.visitNew(null, newNode);
        assertNotNull(newNode.getJSType());
    }

    @Test
    public void testVisitReturnVoid() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node returnNode = new Node(Token.RETURN);
        Node functionNode = new Node(Token.FUNCTION);
        FunctionType funcType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.VOID_TYPE));
        functionNode.setJSType(funcType);
        typeCheck.visitReturn(null, returnNode);
    }

    @Test
    public void testVisitReturnWithValue() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node returnNode = new Node(Token.RETURN);
        Node valueNode = Node.newString(Token.NUMBER, "42");
        returnNode.addChildToFront(valueNode);
        Node functionNode = new Node(Token.FUNCTION);
        FunctionType funcType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        functionNode.setJSType(funcType);
        typeCheck.visitReturn(null, returnNode);
    }

    @Test
    public void testVisitBinaryOperatorShift() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node left = Node.newString(Token.NUMBER, "1");
        Node right = Node.newString(Token.NUMBER, "2");
        Node binOp = new Node(Token.LSH, left, right);
        typeCheck.visitBinaryOperator(Token.LSH, null, binOp);
        assertNotNull(binOp.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorAdd() {
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Node left = Node.newString(Token.STRING, "a");
        Node right = Node.newString(Token.STRING, "b");
        Node binOp = new Node(Token.ADD, left, right);
        typeCheck.visitBinaryOperator(Token.ADD, null, binOp);
        assertNotNull(binOp.getJSType());
    }
}