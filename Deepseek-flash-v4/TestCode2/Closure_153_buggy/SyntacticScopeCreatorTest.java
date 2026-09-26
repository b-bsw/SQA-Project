package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Preconditions;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SyntacticScopeCreatorTest {

    private StubCompiler compiler;
    private SyntacticScopeCreator creator;

    @Before
    public void setUp() {
        compiler = new StubCompiler();
        creator = new SyntacticScopeCreator(compiler);
    }

    @After
    public void tearDown() {
        compiler = null;
        creator = null;
    }

    // ---------- Basic createScope tests ----------

    @Test
    public void testCreateScopeGlobal() {
        Node script = createScript();
        Scope scope = creator.createScope(script, null);
        assertNotNull("Scope should not be null", scope);
        assertTrue("Global scope expected", scope.isGlobal());
        assertNull("Global scope should have no parent", scope.getParent());
    }

    @Test
    public void testCreateScopeWithParent() {
        Node script = createScript();
        Scope global = creator.createScope(script, null);
        Node func = createFunctionNode("f", false);
        Scope funcScope = creator.createScope(func, global);
        assertNotNull("Function scope should not be null", funcScope);
        assertFalse("Function scope should be local", funcScope.isGlobal());
        assertSame("Parent should be global", global, funcScope.getParent());
    }

    @Test
    public void testCreateScopeNullParent() {
        // Passing null parent with a non-function root (global)
        Node script = createScript();
        Scope scope = creator.createScope(script, null);
        assertNotNull(scope);
    }

    // ---------- Declaration tests ----------

    @Test
    public void testGlobalVarDeclaration() {
        Node script = createScript();
        Node var = new Node(Token.VAR);
        Node nameA = new Node(Token.NAME, "a");
        var.addChild(nameA);
        script.addChild(var);

        Scope scope = creator.createScope(script, null);
        assertTrue("Variable 'a' should be declared", scope.isDeclared("a", false));
    }

    @Test
    public void testGlobalMultipleVarDeclarations() {
        Node script = createScript();
        Node var = new Node(Token.VAR);
        var.addChild(new Node(Token.NAME, "x"));
        var.addChild(new Node(Token.NAME, "y"));
        var.addChild(new Node(Token.NAME, "z"));
        script.addChild(var);

        Scope scope = creator.createScope(script, null);
        assertTrue("Variable 'x' should be declared", scope.isDeclared("x", false));
        assertTrue("Variable 'y' should be declared", scope.isDeclared("y", false));
        assertTrue("Variable 'z' should be declared", scope.isDeclared("z", false));
    }

    @Test
    public void testFunctionDeclarationNameInEnclosingScope() {
        Node script = createScript();
        Node func = createFunctionNode("myFunc", false);
        script.addChild(func);

        Scope scope = creator.createScope(script, null);
        assertTrue("Function name 'myFunc' should be declared in global scope",
                scope.isDeclared("myFunc", false));
    }

    @Test
    public void testFunctionExpressionBleedName() {
        // Create global scope first
        Node script = createScript();
        Scope global = creator.createScope(script, null);

        // Function expression with a name
        Node func = createFunctionNode("innerFn", true);
        Scope funcScope = creator.createScope(func, global);

        // The function name should be declared in the function's own scope
        assertTrue("Function expression name should be declared in its scope",
                funcScope.isDeclared("innerFn", false));
    }

    @Test
    public void testFunctionExpressionEmptyNameNoDeclaration() {
        Node script = createScript();
        Scope global = creator.createScope(script, null);

        Node func = createFunctionNode("", true);
        Scope funcScope = creator.createScope(func, global);
        assertFalse("Empty function name should not be declared",
                funcScope.isDeclared("", false));
    }

    @Test
    public void testFunctionParametersDeclared() {
        Node script = createScript();
        Scope global = creator.createScope(script, null);

        Node func = new Node(Token.FUNCTION);
        func.functionExpr = false;
        Node name = new Node(Token.NAME, "f");
        func.addChild(name);
        Node args = new Node(Token.LP);
        args.addChild(new Node(Token.NAME, "p1"));
        args.addChild(new Node(Token.NAME, "p2"));
        func.addChild(args);
        Node body = new Node(Token.BLOCK);
        func.addChild(body);

        Scope funcScope = creator.createScope(func, global);
        assertTrue("Parameter 'p1' should be declared", funcScope.isDeclared("p1", false));
        assertTrue("Parameter 'p2' should be declared", funcScope.isDeclared("p2", false));
    }

    @Test
    public void testCatchVarDeclaration() {
        Node script = createScript();
        Node tryNode = new Node(Token.TRY);
        Node body = new Node(Token.BLOCK);
        tryNode.addChild(body);
        Node catchNode = new Node(Token.CATCH);
        Node catchVar = new Node(Token.NAME, "e");
        Node catchBody = new Node(Token.BLOCK);
        catchNode.addChild(catchVar);
        catchNode.addChild(catchBody);
        tryNode.addChild(catchNode);
        script.addChild(tryNode);

        Scope scope = creator.createScope(script, null);
        assertTrue("Catch variable 'e' should be declared in global scope",
                scope.isDeclared("e", false));
    }

    @Test
    public void testVarInsideControlStructure() {
        Node script = createScript();
        Node ifNode = new Node(Token.IF);
        Node condition = new Node(Token.NAME, "cond");
        ifNode.addChild(condition);
        Node thenBlock = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        var.addChild(new Node(Token.NAME, "innerVar"));
        thenBlock.addChild(var);
        ifNode.addChild(thenBlock);
        script.addChild(ifNode);

        Scope scope = creator.createScope(script, null);
        assertTrue("Variable inside if should be declared", scope.isDeclared("innerVar", false));
    }

    // ---------- Redeclaration / error tests ----------

    @Test
    public void testGlobalDuplicateVarReportsError() {
        Node script = createScript();
        // First var x
        Node var1 = new Node(Token.VAR);
        var1.addChild(new Node(Token.NAME, "x"));
        script.addChild(var1);
        // Second var x
        Node var2 = new Node(Token.VAR);
        var2.addChild(new Node(Token.NAME, "x"));
        script.addChild(var2);

        creator.createScope(script, null);
        assertEquals("Should report one error for duplicate var",
                1, compiler.reportedErrors.size());
        JSError error = compiler.reportedErrors.get(0);
        assertEquals("Should be VAR_MULTIPLY_DECLARED_ERROR",
                SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR,
                error.type);
    }

    @Test
    public void testGlobalDuplicateVarWithSuppression() {
        Node script = createScript();
        // First var x
        Node var1 = new Node(Token.VAR);
        var1.addChild(new Node(Token.NAME, "x"));
        script.addChild(var1);
        // Second var x with @suppress {duplicate}
        Node var2 = new Node(Token.VAR);
        Node nameX = new Node(Token.NAME, "x");
        JSDocInfo info = new JSDocInfo();
        info.addSuppression("duplicate");
        nameX.setJSDocInfo(info);
        var2.addChild(nameX);
        script.addChild(var2);

        creator.createScope(script, null);
        assertEquals("No error expected due to suppression",
                0, compiler.reportedErrors.size());
    }

    @Test
    public void testGlobalCatchBothSameVarNoError() {
        Node script = createScript();
        // First catch block with var e
        Node try1 = new Node(Token.TRY);
        try1.addChild(new Node(Token.BLOCK));
        Node catch1 = new Node(Token.CATCH);
        catch1.addChild(new Node(Token.NAME, "e"));
        catch1.addChild(new Node(Token.BLOCK));
        try1.addChild(catch1);
        script.addChild(try1);
        // Second catch block with var e
        Node try2 = new Node(Token.TRY);
        try2.addChild(new Node(Token.BLOCK));
        Node catch2 = new Node(Token.CATCH);
        catch2.addChild(new Node(Token.NAME, "e"));
        catch2.addChild(new Node(Token.BLOCK));
        try2.addChild(catch2);
        script.addChild(try2);

        creator.createScope(script, null);
        assertEquals("No error expected for catch duplicate",
                0, compiler.reportedErrors.size());
    }

    @Test
    public void testArgumentsShadowedInLocalScope() {
        Node script = createScript();
        Scope global = creator.createScope(script, null);

        // Function with parameter named "arguments"
        Node func = new Node(Token.FUNCTION);
        func.functionExpr = false;
        func.addChild(new Node(Token.NAME, "f"));
        Node args = new Node(Token.LP);
        args.addChild(new Node(Token.NAME, "arguments"));
        func.addChild(args);
        func.addChild(new Node(Token.BLOCK));

        creator.createScope(func, global);
        assertEquals("Should report one error for shadowing arguments",
                1, compiler.reportedErrors.size());
        JSError error = compiler.reportedErrors.get(0);
        assertEquals("Should be VAR_ARGUMENTS_SHADOWED_ERROR",
                SyntacticScopeCreator.VAR_ARGUMENTS_SHADOWED_ERROR,
                error.type);
    }

    @Test
    public void testArgumentsVarDeclarationNoError() {
        Node script = createScript();
        Scope global = creator.createScope(script, null);

        // Local function with a var named "arguments" (allowed)
        Node func = new Node(Token.FUNCTION);
        func.functionExpr = false;
        func.addChild(new Node(Token.NAME, "g"));
        func.addChild(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        var.addChild(new Node(Token.NAME, "arguments"));
        body.addChild(var);
        func.addChild(body);

        creator.createScope(func, global);
        assertEquals("No error expected for var arguments",
                0, compiler.reportedErrors.size());
    }

    // ---------- Edge cases ----------

    @Test
    public void testInvalidFunctionEmptyNameDoesNotDeclare() {
        Node script = createScript();
        Node func = new Node(Token.FUNCTION);
        func.functionExpr = false;
        func.addChild(new Node(Token.NAME, "")); // empty name
        func.addChild(new Node(Token.LP));
        func.addChild(new Node(Token.BLOCK));
        script.addChild(func);

        Scope scope = creator.createScope(script, null);
        assertFalse("Empty function name should not be declared",
                scope.isDeclared("", false));
    }

    @Test
    public void testFunctionExpressionDoesNotScanChildren() {
        Node script = createScript();
        Node func = createFunctionNode("outer", false);
        // Put a function expression inside the body
        Node body = func.getFirstChild().getNext().getNext(); // body node
        Node innerExpr = createFunctionNode("inner", true);
        body.addChild(innerExpr); // add as child of body, but scanVars for FUNCTION should return early
        // Actually function expression inside body will not be scanned by scanVars because
        // scanVars returns for FUNCTION, but for function expression it returns earlier.
        // We just verify no error and no declaration of inner name in outer scope.
        script.addChild(func);
        Scope scope = creator.createScope(script, null);
        assertFalse("Inner function expression name should not be in global scope",
                scope.isDeclared("inner", false));
    }

    @Test
    public void testLoopZeroIterationsDoesNotCauseIssue() {
        // Just ensure scanning an empty block works
        Node script = createScript();
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.VAR);
        init.addChild(new Node(Token.NAME, "i"));
        forNode.addChild(init);
        Node cond = new Node(Token.TRUE);
        forNode.addChild(cond);
        Node incr = new Node(Token.EMPTY);
        forNode.addChild(incr);
        Node body = new Node(Token.BLOCK);
        forNode.addChild(body);
        script.addChild(forNode);

        Scope scope = creator.createScope(script, null);
        assertTrue("Loop variable 'i' should be declared", scope.isDeclared("i", false));
    }

    // ---------- Helper methods ----------

    private Node createScript() {
        Node script = new Node(Token.SCRIPT);
        script.props.put(Node.SOURCENAME_PROP, "test.js");
        return script;
    }

    private Node createFunctionNode(String name, boolean expression) {
        Node func = new Node(Token.FUNCTION);
        func.functionExpr = expression;
        func.addChild(new Node(Token.NAME, name));
        Node args = new Node(Token.LP);
        func.addChild(args);
        Node body = new Node(Token.BLOCK);
        func.addChild(body);
        return func;
    }

    // =============== Stub classes ===============

    static class Token {
        static final int FUNCTION = 1;
        static final int VAR = 2;
        static final int NAME = 3;
        static final int LP = 4;
        static final int CATCH = 5;
        static final int SCRIPT = 6;
        static final int BLOCK = 7;
        static final int IF = 8;
        static final int FOR = 9;
        static final int WHILE = 10;
        static final int TRY = 11;
        static final int DO = 12;
        static final int SWITCH = 13;
        static final int CASE = 14;
        static final int EMPTY = 15;
        static final int TRUE = 16;
    }

    static class Node {
        static final String SOURCENAME_PROP = "sourceName";
        int type;
        String str = "";
        Node firstChild, next, parent;
        Map<String, Object> props = new HashMap<>();
        JSDocInfo jsDoc;
        int childCount = 0;
        boolean functionExpr; // for isFunctionExpression

        Node(int type) {
            this.type = type;
        }

        Node(int type, String str) {
            this.type = type;
            this.str = str;
        }

        int getType() {
            return type;
        }

        Node getFirstChild() {
            return firstChild;
        }

        Node getNext() {
            return next;
        }

        String getString() {
            return str;
        }

        Object getProp(String key) {
            return props.get(key);
        }

        int getChildCount() {
            return childCount;
        }

        JSDocInfo getJSDocInfo() {
            return jsDoc;
        }

        void setJSDocInfo(JSDocInfo info) {
            this.jsDoc = info;
        }

        Node getParent() {
            return parent;
        }

        void setParent(Node p) {
            parent = p;
        }

        void addChild(Node child) {
            if (firstChild == null) {
                firstChild = child;
            } else {
                Node last = firstChild;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = child;
            }
            child.parent = this;
            childCount++;
        }

        void addChildren(Node... children) {
            for (Node c : children) {
                addChild(c);
            }
        }
    }

    static class JSDocInfo {
        Set<String> suppressions = new HashSet<>();

        Set<String> getSuppressions() {
            return suppressions;
        }

        void addSuppression(String s) {
            suppressions.add(s);
        }
    }

    static class Scope {
        boolean global;
        Scope parent;
        Map<String, Var> vars = new HashMap<>();

        Scope(Node rootNode, AbstractCompiler compiler) {
            this.global = true;
        }

        Scope(Scope parent, Node node) {
            this.parent = parent;
            this.global = false;
            // Automatically declare "arguments" in local scopes
            declare("arguments", node, null, null);
        }

        boolean isDeclared(String name, boolean recurse) {
            if (vars.containsKey(name)) {
                return true;
            }
            if (recurse && parent != null) {
                return parent.isDeclared(name, true);
            }
            return false;
        }

        void declare(String name, Node n, Object type, Object input) {
            vars.put(name, new Var(name, n, this, input, null));
        }

        Var getVar(String name) {
            return vars.get(name);
        }

        boolean isGlobal() {
            return global;
        }

        boolean isLocal() {
            return !global;
        }

        Scope getParent() {
            return parent;
        }

        void setGlobal(boolean g) {
            global = g;
        }

        static class Var {
            String name;
            Node node;
            Scope scope;
            Object input;
            Node parentNode;

            Var(String name, Node node, Scope scope, Object input, Node parentNode) {
                this.name = name;
                this.node = node;
                this.scope = scope;
                this.input = input;
                this.parentNode = parentNode;
            }

            Node getParentNode() {
                return parentNode;
            }
        }
    }

    static class DiagnosticType {
        String key;
        String format;

        private DiagnosticType(String key, String format) {
            this.key = key;
            this.format = format;
        }

        static DiagnosticType error(String key, String format) {
            return new DiagnosticType(key, format);
        }
    }

    static class JSError {
        String sourceName;
        Node node;
        DiagnosticType type;
        String[] arguments;

        JSError(String sourceName, Node node, DiagnosticType type, String... arguments) {
            this.sourceName = sourceName;
            this.node = node;
            this.type = type;
            this.arguments = arguments;
        }

        static JSError make(String sourceName, Node node, DiagnosticType type, String... arguments) {
            return new JSError(sourceName, node, type, arguments);
        }
    }

    abstract static class AbstractCompiler {
        abstract void report(JSError error);
        abstract Object getInput(String sourceName);
    }

    static class StubCompiler extends AbstractCompiler {
        List<JSError> reportedErrors = new ArrayList<>();

        @Override
        void report(JSError error) {
            reportedErrors.add(error);
        }

        @Override
        Object getInput(String sourceName) {
            return null;
        }
    }

    static class NodeUtil {
        static boolean isFunctionExpression(Node n) {
            return n.getType() == Token.FUNCTION && n.functionExpr;
        }

        static boolean isVarDeclaration(Node n) {
            return n.getParent() != null && n.getParent().getType() == Token.VAR;
        }

        static boolean isControlStructure(Node n) {
            int t = n.getType();
            return t == Token.IF || t == Token.FOR || t == Token.WHILE || t == Token.DO
                    || t == Token.SWITCH || t == Token.CASE;
        }

        static boolean isStatementBlock(Node n) {
            int t = n.getType();
            return t == Token.BLOCK || t == Token.SCRIPT;
        }
    }

}