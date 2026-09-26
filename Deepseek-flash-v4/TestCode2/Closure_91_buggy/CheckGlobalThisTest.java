package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CheckGlobalThisTest {

    private CheckGlobalThis check;
    private AbstractCompiler compiler;
    private NodeTraversal traversal;

    private static class TestCompiler extends AbstractCompiler {
        @Override
        public void report(JSError error) {
            reportedError = error;
        }

        @Override
        public CheckLevel getErrorLevel(JSError error) {
            return error.getDefaultLevel();
        }
    }

    private static JSError reportedError;

    @Before
    public void setUp() {
        reportedError = null;
        compiler = new TestCompiler();
        check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
        traversal = new NodeTraversal(compiler, check);
    }

    @Test
    public void shouldTraverseNormalFunction() {
        Node func = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK);
        assertTrue(check.shouldTraverse(traversal, func, parent));
    }

    @Test
    public void shouldNotTraverseConstructor() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        func.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        assertFalse(check.shouldTraverse(traversal, func, parent));
    }

    @Test
    public void shouldNotTraverseInterface() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setInterface(true);
        func.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        assertFalse(check.shouldTraverse(traversal, func, parent));
    }

    @Test
    public void shouldNotTraverseWithThisType() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setThisType(new Node(Token.STRING));
        func.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        assertFalse(check.shouldTraverse(traversal, func, parent));
    }

    @Test
    public void shouldNotTraverseOverride() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setOverride(true);
        func.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        assertFalse(check.shouldTraverse(traversal, func, parent));
    }

    @Test
    public void shouldTraverseFunctionWithNoJsDoc() {
        Node func = new Node(Token.FUNCTION);
        Node parent = new Node(Token.BLOCK);
        assertTrue(check.shouldTraverse(traversal, func, parent));
    }

    @Test
    public void shouldNotTraverseFunctionInGetPropAssign() {
        Node func = new Node(Token.FUNCTION);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToFront(new Node(Token.THIS));
        getProp.addChildToBack(Node.newString("prototype"));
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToFront(getProp);
        assign.addChildToBack(func);
        Node parent = new Node(Token.BLOCK);
        assign.setParent(parent);
        getProp.setParent(assign);
        func.setParent(assign);
        assertFalse(check.shouldTraverse(traversal, func, assign));
    }

    @Test
    public void shouldTraverseFunctionInBlock() {
        Node func = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        block.addChildToFront(func);
        func.setParent(block);
        assertTrue(check.shouldTraverse(traversal, func, block));
    }

    @Test
    public void shouldVisitThisAndReport() {
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToFront(thisNode);
        getProp.addChildToBack(Node.newString("x"));
        thisNode.setParent(getProp);
        check.visit(traversal, thisNode, getProp);
        assertNotNull(reportedError);
    }

    @Test
    public void shouldNotVisitThisWithoutPropertyAccess() {
        Node thisNode = new Node(Token.THIS);
        Node parent = new Node(Token.EXPR_RESULT);
        thisNode.setParent(parent);
        check.visit(traversal, thisNode, parent);
        assertNull(reportedError);
    }

    @Test
    public void shouldReportThisOnLeftSideOfAssign() {
        Node thisNode = new Node(Token.THIS);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToFront(thisNode);
        assign.addChildToBack(new Node(Token.NUMBER, 1));
        thisNode.setParent(assign);
        // simulate assignLhsChild being set in shouldTraverse
        check = new CheckGlobalThis(compiler, CheckLevel.WARNING) {
            {
                assignLhsChild = thisNode;
            }
        };
        traversal = new NodeTraversal(compiler, check);
        check.visit(traversal, thisNode, assign);
        assertNotNull(reportedError);
    }

    @Test
    public void shouldClearAssignLhsChildAfterVisit() {
        Node thisNode = new Node(Token.THIS);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToFront(thisNode);
        assign.addChildToBack(new Node(Token.NUMBER, 1));
        thisNode.setParent(assign);
        check = new CheckGlobalThis(compiler, CheckLevel.WARNING) {
            {
                assignLhsChild = thisNode;
            }
        };
        traversal = new NodeTraversal(compiler, check);
        check.visit(traversal, thisNode, assign);
        assertNull(check.assignLhsChild);
    }

    @Test
    public void getFunctionJsDocInfoFromNameParent() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        Node name = new Node(Token.NAME, "f");
        name.setJSDocInfo(jsDoc);
        name.addChildToFront(func);
        func.setParent(name);
        JSDocInfo result = check.getFunctionJsDocInfo(func);
        assertNotNull(result);
        assertTrue(result.isConstructor());
    }

    @Test
    public void getFunctionJsDocInfoFromAssignParent() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setInterface(true);
        Node assign = new Node(Token.ASSIGN);
        assign.setJSDocInfo(jsDoc);
        assign.addChildToFront(new Node(Token.NAME, "x"));
        assign.addChildToBack(func);
        func.setParent(assign);
        JSDocInfo result = check.getFunctionJsDocInfo(func);
        assertNotNull(result);
        assertTrue(result.isInterface());
    }

    @Test
    public void getFunctionJsDocInfoFromVarParent() {
        Node func = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setOverride(true);
        Node name = new Node(Token.NAME, "f");
        name.addChildToFront(func);
        func.setParent(name);
        Node var = new Node(Token.VAR);
        var.setJSDocInfo(jsDoc);
        var.addChildToFront(name);
        name.setParent(var);
        JSDocInfo result = check.getFunctionJsDocInfo(func);
        assertNotNull(result);
        assertTrue(result.isOverride());
    }

    @Test
    public void shouldNotTraverseFunctionWithNestedGetProp() {
        Node func = new Node(Token.FUNCTION);
        Node innerGetProp = new Node(Token.GETPROP);
        innerGetProp.addChildToFront(new Node(Token.THIS));
        innerGetProp.addChildToBack(Node.newString("prototype"));
        Node outerGetProp = new Node(Token.GETPROP);
        outerGetProp.addChildToFront(innerGetProp);
        outerGetProp.addChildToBack(Node.newString("foo"));
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToFront(outerGetProp);
        assign.addChildToBack(func);
        func.setParent(assign);
        outerGetProp.setParent(assign);
        innerGetProp.setParent(outerGetProp);
        assertFalse(check.shouldTraverse(traversal, func, assign));
    }
}