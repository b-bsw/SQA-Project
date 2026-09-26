package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collection;
import java.util.List;

public class FunctionRewriterTest {

    private static class TestCompiler extends AbstractCompiler {
        Node parseResult;
        Node insertNode;
        boolean codeChanged;
        private ErrorManager errorManager;
        private SourceFile sourceFile;
        private CodingConvention codingConvention;
        private TypeRegistry typeRegistry;
        private Budget budget;

        TestCompiler(Node parseResult, Node insertNode) {
            this.parseResult = parseResult;
            this.insertNode = insertNode;
            this.codeChanged = false;
        }

        @Override
        Node parseSyntheticCode(String sourceName, String source) {
            return parseResult;
        }

        @Override
        Node getNodeForCodeInsertion(Node node) {
            return insertNode;
        }

        @Override
        void reportCodeChange() {
            codeChanged = true;
        }

        @Override
        ErrorManager getErrorManager() { return errorManager; }

        @Override
        SourceFile getSourceFile(String name) { return sourceFile; }

        @Override
        String getSourceLine(String sourceName, int lineNumber) { return null; }

        @Override
        String getSourceLineSource(String sourceName, int lineNumber) { return null; }

        @Override
        CodingConvention getCodingConvention() { return codingConvention; }

        @Override
        void setCodingConvention(CodingConvention convention) { this.codingConvention = convention; }

        @Override
        TypeRegistry getTypeRegistry() { return typeRegistry; }

        @Override
        void setTypeRegistry(TypeRegistry registry) { this.typeRegistry = registry; }

        @Override
        Budget getBudget() { return budget; }

        @Override
        void setBudget(Budget budget) { this.budget = budget; }

        @Override
        boolean hasCompilerProperty(String name) { return false; }

        @Override
        void setCompilerProperty(String name, Object value) { }
    }

    private static Node createGetterAssign(String objVar, String methodName, String getProp) {
        Node name = Node.newString(Token.NAME, objVar);
        Node prototype = Node.newString(Token.STRING, "prototype");
        Node methodStr = Node.newString(Token.STRING, methodName);
        Node lhsBase = new Node(Token.GETPROP);
        lhsBase.addChildToBack(name);
        lhsBase.addChildToBack(prototype);
        Node lhs = new Node(Token.GETPROP);
        lhs.addChildToBack(lhsBase);
        lhs.addChildToBack(methodStr);

        Node func = new Node(Token.FUNCTION);
        Node funcName = Node.newString(Token.NAME, "");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        Node thisNode = new Node(Token.THIS);
        Node propStr = Node.newString(Token.STRING, getProp);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToBack(thisNode);
        getPropNode.addChildToBack(propStr);
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(getPropNode);
        body.addChildToBack(ret);
        func.addChildrenToBack(funcName);
        func.addChildrenToBack(params);
        func.addChildrenToBack(body);

        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(lhs);
        assign.addChildToBack(func);
        func.setParent(assign);

        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(assign);
        return exprResult;
    }

    private TestCompiler compiler;
    private Node root;
    private Node insertRoot;

    @Before
    public void setUp() {
        root = new Node(Token.SCRIPT);
        insertRoot = new Node(Token.SCRIPT);
        Node helperNode = new Node(Token.SCRIPT);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(helperNode);
        compiler = new TestCompiler(body, insertRoot);
    }

    @Test
    public void testParseHelperCodeSuccess() {
        FunctionRewriter.Reducer testReducer = new FunctionRewriter.Reducer() {
            @Override
            String getHelperSource() {
                return "function helper(){}";
            }
            @Override
            Node reduce(Node node) {
                return node;
            }
        };
        FunctionRewriter rewriter = new FunctionRewriter(compiler);
        Node result = rewriter.parseHelperCode(testReducer);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testParseHelperCodeNull() {
        compiler.parseResult = null;
        FunctionRewriter.Reducer testReducer = new FunctionRewriter.Reducer() {
            @Override
            String getHelperSource() { return "dummy"; }
            @Override
            Node reduce(Node node) { return node; }
        };
        FunctionRewriter rewriter = new FunctionRewriter(compiler);
        Node result = rewriter.parseHelperCode(testReducer);
        assertNull(result);
    }

    @Test
    public void testProcessNoReductions() {
        root.addChildToBack(new Node(Token.EXPR_RESULT));
        FunctionRewriter rewriter = new FunctionRewriter(compiler);
        rewriter.process(null, root);
        assertFalse(compiler.codeChanged);
        assertEquals(0, insertRoot.getChildCount());
    }

    @Test
    public void testProcessHelperCodeNull() {
        root.addChildToBack(createGetterAssign("a", "getX", "x_"));
        compiler.parseResult = null;
        FunctionRewriter rewriter = new FunctionRewriter(compiler);
        rewriter.process(null, root);
        assertFalse(compiler.codeChanged);
        Node assign = root.getFirstChild().getFirstChild();
        Node rhs = assign.getLastChild();
        assertTrue(NodeUtil.isFunctionExpression(rhs));
    }

    @Test
    public void testProcessSavingsNotEnough() {
        root.addChildToBack(createGetterAssign("a", "getX", "x_"));
        FunctionRewriter rewriter = new FunctionRewriter(compiler);
        rewriter.process(null, root);
        assertFalse(compiler.codeChanged);
        Node rhs = root.getFirstChild().getFirstChild().getLastChild();
        assertTrue(NodeUtil.isFunctionExpression(rhs));
    }

    @Test
    public void testProcessSavingsEnough() {
        for (int i = 0; i < 5; i++) {
            root.addChildToBack(createGetterAssign("a", "get" + i, "x_"));
        }
        FunctionRewriter rewriter = new FunctionRewriter(compiler);
        rewriter.process(null, root);
        assertTrue(compiler.codeChanged);
        assertTrue(insertRoot.hasOneChild());
        for (int i = 0; i < 5; i++) {
            Node child = root.getChildAtIndex(i);
            Node assign = child.getFirstChild();
            Node rhs = assign.getLastChild();
            assertEquals(Token.CALL, rhs.getType());
            Node methodNameNode = rhs.getFirstChild();
            assertEquals(Token.NAME, methodNameNode.getType());
            assertEquals("JSCompiler_get", methodNameNode.getString());
        }
    }
}