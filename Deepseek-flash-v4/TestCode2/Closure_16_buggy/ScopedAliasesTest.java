package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ScopedAliasesTest {

    private static class MockCompiler extends AbstractCompiler {
        private final List<JSError> errors = new ArrayList<>();
        private boolean codeChanged = false;

        @Override
        public void report(JSError error) {
            errors.add(error);
        }

        @Override
        public void reportCodeChange() {
            codeChanged = true;
        }

        @Override
        public CompilerOptions getOptions() {
            return new CompilerOptions();
        }

        @Override
        public TypeRegistry getTypeRegistry() {
            return null;
        }

        @Override
        public ErrorManager getErrorManager() {
            return null;
        }

        @Override
        public void reportChange() {
            codeChanged = true;
        }

        @Override
        public boolean hasHaltingErrors() {
            return false;
        }

        @Override
        public void generateReport() {}

        @Override
        public void haltOnError() {}

        @Override
        public double getProgress() {
            return 0;
        }

        @Override
        public void setProgress(double p) {}

        @Override
        public void setErrorManager(ErrorManager em) {}

        @Override
        public void initOptions(CompilerOptions options) {}

        @Override
        public JSModuleGraph getModuleGraph() {
            return null;
        }

        @Override
        public void setModuleGraph(JSModuleGraph graph) {}

        @Override
        public SymbolTable getSymbolTable() {
            return null;
        }

        @Override
        public void setSymbolTable(SymbolTable st) {}

        @Override
        public void setTypeRegistry(TypeRegistry tr) {}

        @Override
        public void runInCompilerThread(Runnable r) {
            r.run();
        }

        @Override
        public void addChangeHandler(CodeChangeHandler handler) {}

        @Override
        public void removeChangeHandler(CodeChangeHandler handler) {}

        @Override
        public Node parseSyntheticCode(String code) {
            return null;
        }

        @Override
        public Node parseSyntheticCode(String filename, String code) {
            return null;
        }

        @Override
        public Node parseCode(String code) {
            return null;
        }

        @Override
        public Node parseCode(String filename, String code) {
            return null;
        }

        @Override
        public ScopeCreator getScopeCreator() {
            return new ScopeCreator() {
                @Override
                public Scope createScope(Node n, Scope parent) {
                    Scope scope = new Scope(parent, n);
                    // For function scopes, add variables found in var declarations
                    if (n.isFunction() && n.getLastChild().isBlock()) {
                        Node block = n.getLastChild();
                        for (Node child = block.getFirstChild(); child != null; child = child.getNext()) {
                            if (child.isVar()) {
                                for (Node nameNode = child.getFirstChild(); nameNode != null;
                                        nameNode = nameNode.getNext()) {
                                    if (nameNode.isName()) {
                                        String name = nameNode.getString();
                                        // Determine initial value
                                        Node init = nameNode.getFirstChild();
                                        // Create a Var for this name
                                        Var v = new Var(
                                                false, // isBleedingFunction
                                                scope,
                                                nameNode,
                                                init,
                                                null, // CompilerInput
                                                true, // isDeclared
                                                false, // isGlobal
                                                false); // isMember
                                        scope.declare(v);
                                    }
                                }
                            }
                        }
                    }
                    return scope;
                }

                @Override
                public boolean hasBlockScope() {
                    return false;
                }
            };
        }

        public boolean hasErrors() {
            return !errors.isEmpty();
        }

        public DiagnosticType getFirstErrorDiagnostic() {
            if (errors.isEmpty()) return null;
            return errors.get(0).getType();
        }

        public boolean codeChanged() {
            return codeChanged;
        }
    }

    private MockCompiler compiler;
    private AliasTransformationHandler transformationHandler;
    private ScopedAliases scopedAliases;

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        transformationHandler = new AliasTransformationHandler() {
            @Override
            public AliasTransformation logAliasTransformation(String sourceFile, SourcePosition<AliasTransformation> position) {
                return new AliasTransformation() {
                    @Override
                    public void addAlias(String alias, String definition) {
                        // no-op
                    }
                };
            }
        };
        scopedAliases = new ScopedAliases(compiler, null, transformationHandler);
    }

    @After
    public void tearDown() {
        compiler = null;
        scopedAliases = null;
    }

    // Helper methods to create AST nodes

    private Node createGoogScopeCall(boolean asExprResult, Node functionBody, boolean functionWithName,
            boolean functionWithParams) {
        // goog.scope name node
        Node googScopeName = new Node(Token.NAME);
        googScopeName.setString("goog.scope");

        Node callNode = new Node(Token.CALL, googScopeName);
        callNode.setLineno(1);
        callNode.setCharno(1);

        // Function node
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setLineno(1);
        functionNode.setCharno(1);

        // Function name (optional)
        Node functionNameNode = new Node(Token.NAME);
        if (functionWithName) {
            functionNameNode.setString("namedFn");
        } else {
            functionNameNode.setString("");
        }
        functionNode.addChildToBack(functionNameNode);

        // Parameters node (LP)
        Node paramsNode = new Node(Token.LP);
        if (functionWithParams) {
            Node paramName = new Node(Token.NAME);
            paramName.setString("p");
            paramsNode.addChildToBack(paramName);
        }
        functionNode.addChildToBack(paramsNode);

        // Function body (BLOCK)
        if (functionBody == null) {
            functionBody = new Node(Token.BLOCK);
        }
        functionNode.addChildToBack(functionBody);

        callNode.addChildToBack(functionNode);

        if (asExprResult) {
            Node exprResult = new Node(Token.EXPR_RESULT, callNode);
            return exprResult;
        } else {
            return callNode;
        }
    }

    private Node createVarDeclaration(String name, Node initValue) {
        Node nameNode = new Node(Token.NAME);
        nameNode.setString(name);
        if (initValue != null) {
            nameNode.addChildToBack(initValue);
        }
        Node varNode = new Node(Token.VAR, nameNode);
        return varNode;
    }

    // Test cases

    @Test
    public void testGoogScopeNotExprResult() {
        // goog.scope is not wrapped in EXPR_RESULT
        Node root = new Node(Token.SCRIPT);
        root.setLineno(1);
        root.setCharno(1);
        Node call = createGoogScopeCall(false, null, false, false);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testGoogScopeTooManyParameters() {
        // call with two parameters
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.EXPR_RESULT));

        Node googScopeName = new Node(Token.NAME);
        googScopeName.setString("goog.scope");
        Node callNode = new Node(Token.CALL, googScopeName);
        // add two parameters: two function nodes
        Node fn1 = new Node(Token.FUNCTION);
        fn1.addChildToBack(new Node(Token.NAME));
        fn1.addChildToBack(new Node(Token.LP));
        fn1.addChildToBack(new Node(Token.BLOCK));
        callNode.addChildToBack(fn1);
        Node fn2 = new Node(Token.FUNCTION);
        fn2.addChildToBack(new Node(Token.NAME));
        fn2.addChildToBack(new Node(Token.LP));
        fn2.addChildToBack(new Node(Token.BLOCK));
        callNode.addChildToBack(fn2);

        Node exprResult = new Node(Token.EXPR_RESULT, callNode);
        root.getFirstChild().replaceWith(exprResult);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testGoogScopeFunctionWithName() {
        Node body = new Node(Token.BLOCK);
        Node call = createGoogScopeCall(true, body, true, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testGoogScopeFunctionWithParams() {
        Node body = new Node(Token.BLOCK);
        Node call = createGoogScopeCall(true, body, false, true);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testGoogScopeUsesReturn() {
        Node block = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN);
        returnNode.setLineno(2);
        returnNode.setCharno(1);
        block.addChildToBack(returnNode);
        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_USES_RETURN, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testGoogScopeUsesThis() {
        Node block = new Node(Token.BLOCK);
        Node thisNode = new Node(Token.THIS);
        block.addChildToBack(thisNode);
        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testGoogScopeUsesThrow() {
        Node block = new Node(Token.BLOCK);
        Node throwCall = new Node(Token.THROW);
        throwCall.addChildToBack(new Node(Token.NAME)); // placeholder excp
        block.addChildToBack(throwCall);
        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_USES_THROW, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testAliasRedefined() {
        Node block = new Node(Token.BLOCK);

        // var x = goog.x
        Node googx = new Node(Token.NAME);
        googx.setString("goog.x");
        Node x1 = new Node(Token.NAME);
        x1.setString("x");
        x1.addChildToBack(googx);
        Node var1 = new Node(Token.VAR, x1);
        block.addChildToBack(var1);

        // var x = goog.y (redefinition)
        Node googy = new Node(Token.NAME);
        googy.setString("goog.y");
        Node x2 = new Node(Token.NAME);
        x2.setString("x");
        x2.addChildToBack(googy);
        Node var2 = new Node(Token.VAR, x2);
        block.addChildToBack(var2);

        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testNonAliasLocal() {
        Node block = new Node(Token.BLOCK);

        // var x = 5 (not a qualified name)
        Node five = new Node(Token.NUMBER);
        five.setDouble(5);
        Node x = new Node(Token.NAME);
        x.setString("x");
        x.addChildToBack(five);
        Node var = new Node(Token.VAR, x);
        block.addChildToBack(var);

        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);
        assertTrue(compiler.hasErrors());
        assertEquals(ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL, compiler.getFirstErrorDiagnostic());
    }

    @Test
    public void testSimpleAliasTransformation() {
        // Create: goog.scope(function() { var x = goog.x; x.foo(); })
        Node block = new Node(Token.BLOCK);

        // var x = goog.x
        Node googx = new Node(Token.NAME);
        googx.setString("goog.x");
        Node xName = new Node(Token.NAME);
        xName.setString("x");
        xName.addChildToBack(googx);
        Node varX = new Node(Token.VAR, xName);
        block.addChildToBack(varX);

        // x.foo() expression
        Node nameRef = new Node(Token.NAME);
        nameRef.setString("x");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, nameRef, new Node(Token.STRING, "foo")));
        Node exprResult = new Node(Token.EXPR_RESULT, callNode);
        block.addChildToBack(exprResult);

        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);

        // After processing, no errors, code changed, alias applied, definition removed
        assertFalse(compiler.hasErrors());
        assertTrue(compiler.codeChanged());

        // The script should have only one child: the collapsed block containing goog.x.foo()
        Node script = root;
        assertEquals(1, script.getChildCount());
        Node collapsedBlock = script.getFirstChild();
        assertNotNull(collapsedBlock);
        // The block should have one statement: expression statement with CALL
        assertEquals(Token.BLOCK, collapsedBlock.getType());
        // After merge, the block may be collapsed: check if it's actually the block from function
        // More robust: check that the call's first child is now a GETPROP with goog.x
        Node callAfter = collapsedBlock.getFirstChild().getFirstChild().getFirstChild().getFirstChild();
        //  collapsedBlock -> EXPR_RESULT -> CALL -> GETPROP (name 'x' replaced by goog.x)
        assertNotNull(callAfter);
        assertTrue(callAfter.isGetProp());
        // The getprop's first child should be a NAME with goog.x
        Node getPropFirstChild = callAfter.getFirstChild();
        assertTrue(getPropFirstChild.isName());
        assertEquals("goog.x", getPropFirstChild.getString());
    }

    @Test
    public void testTransitiveAlias() {
        // var g = goog; var d = g.dom; d.createElement('DIV')
        Node block = new Node(Token.BLOCK);

        // var g = goog
        Node goog = new Node(Token.NAME);
        goog.setString("goog");
        Node gName = new Node(Token.NAME);
        gName.setString("g");
        gName.addChildToBack(goog);
        block.addChildToBack(new Node(Token.VAR, gName));

        // var d = g.dom
        Node gDom = new Node(Token.GETPROP, new Node(Token.NAME, "g"), new Node(Token.STRING, "dom"));
        Node dName = new Node(Token.NAME);
        dName.setString("d");
        dName.addChildToBack(gDom);
        block.addChildToBack(new Node(Token.VAR, dName));

        // d.createElement('DIV')
        Node dRef = new Node(Token.NAME);
        dRef.setString("d");
        Node callNode = new Node(Token.CALL, new Node(Token.GETPROP, dRef, new Node(Token.STRING, "createElement")),
                new Node(Token.STRING, "DIV"));
        Node exprResult = new Node(Token.EXPR_RESULT, callNode);
        block.addChildToBack(exprResult);

        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);

        assertFalse(compiler.hasErrors());
        assertTrue(compiler.codeChanged());

        // Verify that the call now has goog.dom.createElement('DIV')
        Node script = root;
        assertEquals(1, script.getChildCount());
        Node collapsedBlock = script.getFirstChild();
        Node exprAfter = collapsedBlock.getFirstChild();
        Node callAfter = exprAfter.getFirstChild();
        Node getProp = callAfter.getFirstChild();
        // getProp should be goog.dom.createElement
        Node leftmost = getProp.getFirstChild().getFirstChild().getFirstChild().getFirstChild();
        // Actually trace: getProp (createElement) -> firstChild is GETPROP (goog.dom) -> firstChild is NAME goog
        // But after alias, g -> goog and d -> goog.dom
        // So the final call's first child should be GETPROP with leftmost goog.
        Node getPropChain = callAfter.getFirstChild();
        assertTrue(getPropChain.isGetProp());
        // chain: goog.dom.createElement -> goog.dom (GETPROP) -> goog (NAME)
        Node innerGetProp = getPropChain.getFirstChild();
        assertTrue(innerGetProp.isGetProp());
        Node leftName = innerGetProp.getFirstChild();
        assertTrue(leftName.isName());
        assertEquals("goog", leftName.getString());
    }

    @Test
    public void testEmptyScopeCall() {
        // goog.scope(function() { }) with nothing inside
        Node block = new Node(Token.BLOCK);
        Node call = createGoogScopeCall(true, block, false, false);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(call);

        scopedAliases.process(null, root);

        // No errors, code changed because we collapse the scope
        assertFalse(compiler.hasErrors());
        assertTrue(compiler.codeChanged());

        // Script should have one block child
        assertEquals(1, root.getChildCount());
        Node collapsed = root.getFirstChild();
        assertEquals(Token.BLOCK, collapsed.getType());
        // Block should have no children
        assertEquals(0, collapsed.getChildCount());
    }
}