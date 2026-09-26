package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class CheckGlobalThisTest {

    private CheckGlobalThis check;
    private AbstractCompiler compiler;
    private CheckLevel level;

    private static class TestCompiler extends AbstractCompiler {
        @Override
        void report(JSError error) {
            reported = error;
        }
        JSError reported;
    }

    private TestCompiler testCompiler;

    @Before
    public void setUp() {
        testCompiler = new TestCompiler();
        level = CheckLevel.WARNING;
        check = new CheckGlobalThis(testCompiler, level);
    }

    @Test
    public void testShouldNotTraverseConstructorFunction() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        func.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        assertFalse(check.shouldTraverse(null, func, parent));
    }

    @Test
    public void testShouldNotTraverseFunctionWithThisTypeAnnotation() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setThisType(new JSTypeExpression(null, null));
        func.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        assertFalse(check.shouldTraverse(null, func, parent));
    }

    @Test
    public void testShouldNotTraverseFunctionWithOverrideAnnotation() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setOverride(true);
        func.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        assertFalse(check.shouldTraverse(null, func, parent));
    }

    @Test
    public void testTraverseAnonymousFunctionInVarDeclaration() {
        Node func = new Node(Token.FUNCTION);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        name.addChildToFront(func);
        var.addChildToFront(name);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToFront(var);
        assertTrue(check.shouldTraverse(null, func, name));
    }

    @Test
    public void testDoNotTraverseAnonymousFunctionInExprResult() {
        Node func = new Node(Token.FUNCTION);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node parent = new Node(Token.SCRIPT);
        exprResult.addChildToFront(func);
        parent.addChildToFront(exprResult);
        assertTrue(check.shouldTraverse(null, func, exprResult));
    }

    @Test
    public void testTraverseLeftSideOfAssignment() {
        Node assign = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.NAME, "a");
        Node rhs = new Node(Token.THIS);
        assign.addChildToFront(lhs);
        assign.addChildToFront(rhs);
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToFront(assign);
        assertTrue(check.shouldTraverse(null, lhs, assign));
    }

    @Test
    public void testDoNotTraverseRightSideOfPrototypeAssignment() {
        Node assign = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.GETPROP);
        Node object = new Node(Token.NAME, "Foo");
        Node property = new Node(Token.STRING, "prototype");
        lhs.addChildToFront(object);
        lhs.addChildToFront(property);
        Node rhs = new Node(Token.FUNCTION);
        assign.addChildToFront(lhs);
        assign.addChildToFront(rhs);
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToFront(assign);
        assertFalse(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testDoNotTraverseRightSideOfQualifiedPrototypeAssignment() {
        Node assign = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.GETPROP);
        Node qualifier = new Node(Token.GETPROP);
        Node object = new Node(Token.NAME, "Foo");
        Node protoProperty = new Node(Token.STRING, "prototype");
        qualifier.addChildToFront(object);
        qualifier.addChildToFront(protoProperty);
        Node methodProperty = new Node(Token.STRING, "method");
        lhs.addChildToFront(qualifier);
        lhs.addChildToFront(methodProperty);
        Node rhs = new Node(Token.FUNCTION);
        assign.addChildToFront(lhs);
        assign.addChildToFront(rhs);
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToFront(assign);
        assertFalse(check.shouldTraverse(null, rhs, assign));
    }

    @Test
    public void testVisitReportsThisOnLeftSideOfAssignment() {
        Node assign = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.THIS);
        Node rhs = new Node(Token.STRING, "value");
        assign.addChildToFront(lhs);
        assign.addChildToFront(rhs);
        Node parent = new Node(Token.BLOCK);
        NodeTraversal t = new NodeTraversal(testCompiler);
        check.visit(t, lhs, assign);
        assertNotNull(testCompiler.reported);
    }

    @Test
    public void testVisitReportsThisWithPropertyAccess() {
        Node getProp = new Node(Token.GETPROP);
        Node thisNode = new Node(Token.THIS);
        Node propName = new Node(Token.STRING, "property");
        getProp.addChildToFront(thisNode);
        getProp.addChildToFront(propName);
        Node parent = new Node(Token.BLOCK);
        NodeTraversal t = new NodeTraversal(testCompiler);
        check.visit(t, thisNode, getProp);
        assertNotNull(testCompiler.reported);
    }

    @Test
    public void testVisitDoesNotReportThisWithoutPropertyAccess() {
        Node thisNode = new Node(Token.THIS);
        Node parent = new Node(Token.BLOCK);
        NodeTraversal t = new NodeTraversal(testCompiler);
        check.visit(t, thisNode, parent);
        assertNull(testCompiler.reported);
    }

    @Test
    public void testVisitClearsAssignLhsChild() {
        Node assign = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.THIS);
        Node rhs = new Node(Token.STRING, "value");
        assign.addChildToFront(lhs);
        assign.addChildToFront(rhs);
        Node parent = new Node(Token.BLOCK);
        NodeTraversal t = new NodeTraversal(testCompiler);
        check.shouldTraverse(t, lhs, assign);
        check.visit(t, lhs, assign);
    }

    @Test
    public void testJSDocInfoFoundOnNameParent() {
        Node func = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME, "f");
        JSDocInfo funcDoc = new JSDocInfo();
        funcDoc.setConstructor(true);
        name.setJSDocInfo(funcDoc);
        name.addChildToFront(func);
        Node var = new Node(Token.VAR);
        var.addChildToFront(name);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToFront(var);
        assertFalse(check.shouldTraverse(null, func, name));
    }

    @Test
    public void testJSDocInfoFoundOnVarParent() {
        Node func = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME, "f");
        name.addChildToFront(func);
        Node var = new Node(Token.VAR);
        JSDocInfo varDoc = new JSDocInfo();
        varDoc.setConstructor(true);
        var.setJSDocInfo(varDoc);
        var.addChildToFront(name);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToFront(var);
        assertFalse(check.shouldTraverse(null, func, name));
    }

    @Test
    public void testJSDocInfoNullOnAssignment() {
        Node func = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToFront(new Node(Token.NAME, "x"));
        assign.addChildToFront(func);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToFront(assign);
        assertTrue(check.shouldTraverse(null, func, assign));
    }

    @Test
    public void testAssignLhsChildSetNullInitially() {
        Node thisNode = new Node(Token.THIS);
        check.visit(null, thisNode, null);
        assertNull(check.assignLhsChild);
    }
}