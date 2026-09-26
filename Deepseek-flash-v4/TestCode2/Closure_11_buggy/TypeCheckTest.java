package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import static com.google.javascript.rhino.jstype.JSTypeNative.*;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.BasicErrorManager;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.jscomp.TypedScope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

public class TypeCheckTest {

    private Compiler compiler;
    private TypeCheck typeCheck;
    private Scope topScope;
    private ScopeCreator scopeCreator;
    private Node externsAndJsRoot;

    @Before
    public void setUp() {
        compiler = new Compiler(new BasicErrorManager());
        compiler.initOptions(new CompilerOptions());
        externsAndJsRoot = new Node(Token.BLOCK);
        Node jsRoot = new Node(Token.SCRIPT);
        externsAndJsRoot.addChildToBack(jsRoot);
        scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        topScope = scopeCreator.createScope(externsAndJsRoot, null);
        typeCheck = new TypeCheck(compiler, null, compiler.getTypeRegistry(),
                topScope, scopeCreator, CheckLevel.WARNING, CheckLevel.OFF);
    }

    @Test
    public void testProcessBasic() {
        Node jsRoot = externsAndJsRoot.getLastChild();
        typeCheck.process(null, jsRoot);
        BasicErrorManager errorManager = (BasicErrorManager) compiler.getErrorManager();
        assertEquals(0, errorManager.getErrorCount());
    }

    @Test
    public void testProcessWithExterns() {
        Node jsRoot = externsAndJsRoot.getLastChild();
        Node externsRoot = new Node(Token.SCRIPT);
        externsAndJsRoot.addChildToBack(externsRoot);
        typeCheck.process(externsRoot, jsRoot);
        BasicErrorManager errorManager = (BasicErrorManager) compiler.getErrorManager();
        assertEquals(0, errorManager.getErrorCount());
    }

    private void assertLiteralType(int token, JSTypeNative expectedNative) {
        Node node = new Node(token);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(node);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        t.traverseWithScope(parent, topScope);
        JSType expected = compiler.getTypeRegistry().getNativeType(expectedNative);
        assertTrue("Expected " + expected + " but got " + node.getJSType(),
                node.getJSType().isEquivalentTo(expected));
    }

    @Test
    public void testLiteralTypes() {
        assertLiteralType(Token.TRUE, BOOLEAN_TYPE);
        assertLiteralType(Token.FALSE, BOOLEAN_TYPE);
        assertLiteralType(Token.NUMBER, NUMBER_TYPE);
        assertLiteralType(Token.STRING, STRING_TYPE);
        assertLiteralType(Token.NULL, NULL_TYPE);
        assertLiteralType(Token.VOID, VOID_TYPE);
        assertLiteralType(Token.TYPEOF, STRING_TYPE);
        assertLiteralType(Token.NOT, BOOLEAN_TYPE);
    }

    @Test
    public void testVisitEqDeterministic() {
        JSType nullType = compiler.getTypeRegistry().getNativeType(NULL_TYPE);
        Node left = new Node(Token.NULL);
        left.setJSType(nullType);
        Node right = new Node(Token.NULL);
        right.setJSType(nullType);
        Node eq = new Node(Token.EQ, left, right);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(eq);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        t.traverseWithScope(parent, topScope);
        BasicErrorManager errorManager = (BasicErrorManager) compiler.getErrorManager();
        assertEquals(1, errorManager.getErrorCount());
        assertEquals(TypeCheck.DETERMINISTIC_TEST, errorManager.getErrors().get(0).getType());
    }

    @Test
    public void testVisitNewNonConstructor() {
        JSType stringType = compiler.getTypeRegistry().getNativeType(STRING_TYPE);
        Node constructor = new Node(Token.NAME);
        constructor.setString("Foo");
        constructor.setJSType(stringType);
        Node newExpr = new Node(Token.NEW, constructor);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(newExpr);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        t.traverseWithScope(parent, topScope);
        BasicErrorManager errorManager = (BasicErrorManager) compiler.getErrorManager();
        assertEquals(1, errorManager.getErrorCount());
        assertEquals(TypeCheck.NOT_A_CONSTRUCTOR, errorManager.getErrors().get(0).getType());
    }

    @Test
    public void testVisitReturn() {
        JSTypeRegistry registry = compiler.getTypeRegistry();
        JSType returnType = registry.getNativeType(STRING_TYPE);
        FunctionType functionType = registry.createFunctionType(returnType);
        Node funcNode = createFunctionNode("testFunc", functionType, returnType);
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(funcNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        t.traverseWithScope(parent, topScope);
        BasicErrorManager errorManager = (BasicErrorManager) compiler.getErrorManager();
        assertEquals(0, errorManager.getErrorCount());
    }

    private Node createFunctionNode(String name, FunctionType funcType, JSType returnType) {
        Node nameNode = Node.newString(name);
        Node paramsNode = new Node(Token.PARAM_LIST);
        Node bodyNode = new Node(Token.BLOCK);
        Node valueNode = Node.newString("value");
        valueNode.setJSType(returnType);
        Node returnNode = new Node(Token.RETURN, valueNode);
        bodyNode.addChildToBack(returnNode);
        Node funcNode = new Node(Token.FUNCTION, nameNode, paramsNode, bodyNode);
        funcNode.setJSType(funcType);
        return funcNode;
    }

    @Test
    public void testShouldTraverseFunctionMasksVariable() {
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node nameNode = Node.newString("f");
        topScope.declare("f", nameNode, registry.getNativeType(STRING_TYPE), false);
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        Node funcNode = new Node(Token.FUNCTION, nameNode, params, body);
        funcNode.setJSType(registry.createFunctionType(registry.getNativeType(VOID_TYPE)));
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(funcNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        t.traverseWithScope(parent, topScope);
        BasicErrorManager errorManager = (BasicErrorManager) compiler.getErrorManager();
        assertEquals(1, errorManager.getErrorCount());
        assertEquals(TypeCheck.FUNCTION_MASKS_VARIABLE, errorManager.getErrors().get(0).getType());
    }
}