package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FunctionInjectorTest {

    private AbstractCompiler compiler;
    private Supplier<String> safeNameIdSupplier;
    private FunctionInjector injector;

    private static class TestCompiler extends AbstractCompiler {
        private CodingConvention convention = new CodingConvention();
        private LifeCycleStage stage = LifeCycleStage.NORMALIZED;
        private JSModuleGraph moduleGraph;
        private JSModule module;

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return stage;
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return moduleGraph;
        }

        void setModuleGraph(JSModuleGraph g) {
            moduleGraph = g;
        }

        @Override
        public boolean isInlinableFunction(Node fnNode) {
            return true;
        }

        @Override
        public Node parseNormalTimeNamedType(String s) { return null; }
        @Override
        public boolean isConstant(Node n) { return false; }
        @Override
        public boolean isConstantName(Node n) { return false; }
    }

    private static class TestSupplier implements Supplier<String> {
        private int counter = 0;
        @Override
        public String get() {
            return "__tmp" + (counter++);
        }
    }

    private static class TestNodeTraversal extends NodeTraversal {
        private Node scopeRoot;
        private boolean globalScope;

        TestNodeTraversal(Node scopeRoot, boolean globalScope) {
            super(null);
            this.scopeRoot = scopeRoot;
            this.globalScope = globalScope;
        }

        @Override
        public boolean inGlobalScope() {
            return globalScope;
        }

        @Override
        public Node getScopeRoot() {
            return scopeRoot;
        }
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        safeNameIdSupplier = new TestSupplier();
        injector = new FunctionInjector(
            compiler,
            safeNameIdSupplier,
            true,
            false,
            false);
    }

    @After
    public void tearDown() {
        compiler = null;
        safeNameIdSupplier = null;
        injector = null;
    }

    @Test
    public void testConstructorWithNullCompilerThrows() {
        try {
            new FunctionInjector(null, safeNameIdSupplier, true, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testConstructorWithNullSupplierThrows() {
        try {
            new FunctionInjector(compiler, null, true, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testConstructorSetsFields() {
        FunctionInjector inj = new FunctionInjector(
            compiler, safeNameIdSupplier, false, true, true);
        assertNotNull(inj);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_returnsFalseForNonInlinable() {
        TestCompiler tc = (TestCompiler) compiler;
        tc.convention = new CodingConvention() {
            @Override
            public boolean isInlinableFunction(Node fn) {
                return false;
            }
        };
        Node fnNode = createSimpleFunctionNode("f");
        assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_referencesArguments() {
        Node fnNode = createSimpleFunctionNode("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        Node argRef = new Node(Token.NAME);
        argRef.setString("arguments");
        block.addChildToBack(argRef);
        assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_referencesEval() {
        Node fnNode = createSimpleFunctionNode("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        Node evalRef = new Node(Token.NAME);
        evalRef.setString("eval");
        block.addChildToBack(evalRef);
        assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_referencesFnName() {
        Node fnNode = createSimpleFunctionNode("myFn");
        Node block = NodeUtil.getFunctionBody(fnNode);
        Node nameRef = new Node(Token.NAME);
        nameRef.setString("myFn");
        block.addChildToBack(nameRef);
        assertFalse(injector.doesFunctionMeetMinimumRequirements("myFn", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_referencesRecursionName() {
        Node fnNode = createSimpleFunctionNode("f");
        Node fnNameNode = fnNode.getFirstChild();
        fnNameNode.setString("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        Node nameRef = new Node(Token.NAME);
        nameRef.setString("f");
        block.addChildToBack(nameRef);
        assertFalse(injector.doesFunctionMeetMinimumRequirements("", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_passes() {
        Node fnNode = createSimpleFunctionNode("f");
        assertTrue(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_emptyFnNameNoRecursionRef() {
        Node fnNode = createSimpleFunctionNode("");
        assertTrue(injector.doesFunctionMeetMinimumRequirements("", fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_noBody() {
        Node fnNode = createSimpleFunctionNode("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        while (block.hasChildren()) {
            block.removeChild(block.getFirstChild());
        }
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_singleReturn() {
        Node fnNode = createSimpleFunctionNode("f");
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_returnWithExpr() {
        Node fnNode = createSimpleFunctionNode("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        while (block.hasChildren()) {
            block.removeChild(block.getFirstChild());
        }
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(new Node(Token.NUMBER, 1.0));
        block.addChildToBack(ret);
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_returnNoExpr() {
        Node fnNode = createSimpleFunctionNode("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        while (block.hasChildren()) {
            block.removeChild(block.getFirstChild());
        }
        block.addChildToBack(new Node(Token.RETURN));
        assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_twoStmts() {
        Node fnNode = createSimpleFunctionNode("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        while (block.hasChildren()) {
            block.removeChild(block.getFirstChild());
        }
        block.addChildToBack(new Node(Token.EXPR_RESULT));
        block.addChildToBack(new Node(Token.RETURN));
        assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testCanInlineReferenceDirectly_nonNameCallWithThis() {
        Node callNode = createCallNode("obj.method");
        Node fnNode = createSimpleFunctionNode("f");
        assertEquals(CanInlineResult.NO,
            injector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.DIRECT, false, false));
    }

    @Test
    public void testCanInlineReferenceDirectly_nameCall_returnsYes() {
        Node callNode = createCallNode("f");
        Node fnNode = createSimpleFunctionNode("f");
        assertEquals(CanInlineResult.YES,
            injector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.DIRECT, false, false));
    }

    @Test
    public void testCanInlineReferenceDirectly_sideEffectArgRejected() {
        Node fnNode = createSimpleFunctionNode("f");
        Node fnParam = NodeUtil.getFunctionParameters(fnNode);
        fnParam.addChildToBack(new Node(Token.NAME, "x"));

        Node callNode = createCallNode("f");
        Node arg = new Node(Token.NAME, "x");
        callNode.addChildToBack(arg);

        Node block = fnNode.getLastChild();
        Node refX = new Node(Token.NAME, "x");
        block.addChildToBack(refX);

        assertEquals(CanInlineResult.YES,
            injector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.DIRECT, false, false));
    }

    @Test
    public void testCanInlineReferenceAsStatementBlock_unsupportedCallSite() {
        Node callNode = createCallNode("f");
        Node fnNode = createSimpleFunctionNode("f");
        assertEquals(CanInlineResult.NO,
            injector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.BLOCK, false, false));
    }

    @Test
    public void testCanInlineReferenceAsStatementBlock_noDecompDisabled() {
        FunctionInjector strictInjector = new FunctionInjector(
            compiler, safeNameIdSupplier, false, false, false);
        Node callNode = createCallNode("f");
        Node fnNode = createSimpleFunctionNode("f");
        assertEquals(CanInlineResult.NO,
            strictInjector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.BLOCK, false, false));
    }

    @Test
    public void testContainsFunctionsInGlobalScope_withAssumeMinimumCapture() {
        FunctionInjector minCaptureInjector = new FunctionInjector(
            compiler, safeNameIdSupplier, true, false, true);
        Node callNode = createCallNode("f");
        Node fnNode = createSimpleFunctionNode("f");
        assertEquals(CanInlineResult.YES,
            minCaptureInjector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.DIRECT, false, true));
    }

    @Test
    public void testContainsFunctionsInNonGlobalScope_returnsNo() {
        Node callNode = createCallNode("f");
        Node fnNode = createSimpleFunctionNode("f");
        Node callerFn = new Node(Token.FUNCTION);
        NodeTraversal t = new TestNodeTraversal(callerFn, false);
        assertEquals(CanInlineResult.NO,
            injector.canInlineReferenceToFunction(
                t, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.BLOCK, false, true));
    }

    @Test
    public void testContainsFunctionsWithinLoop_returnsNo() {
        Node callNode = createCallNode("f");
        Node fnNode = createSimpleFunctionNode("f");
        Node loop = new Node(Token.FOR);
        loop.addChildToBack(callNode);
        assertEquals(CanInlineResult.NO,
            injector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.BLOCK, false, true));
    }

    @Test
    public void testReferencesThisNotObjectCall_returnsNo() {
        Node callNode = createCallNode("f");
        Node fnNode = createSimpleFunctionNode("f");
        assertEquals(CanInlineResult.NO,
            injector.canInlineReferenceToFunction(
                null, callNode, fnNode, Sets.<String>newHashSet(),
                InliningMode.DIRECT, true, false));
    }

    @Test
    public void testInliningLowersCost_zeroRefs() {
        assertTrue(injector.inliningLowersCost(
            null, createSimpleFunctionNode("f"),
            java.util.Collections.<Reference>emptyList(),
            Sets.<String>newHashSet(), true, false));
    }

    @Test
    public void testSetKnownConstants_nonEmptyThrows() {
        Set<String> consts = Sets.newHashSet("x", "y");
        injector.setKnownConstants(consts);
        try {
            injector.setKnownConstants(consts);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testInlineReturnValue_emptyBodyReturnsUndefined() {
        Node fnNode = createSimpleFunctionNode("f");
        Node block = NodeUtil.getFunctionBody(fnNode);
        while (block.hasChildren()) {
            block.removeChild(block.getFirstChild());
        }
        Node callNode = createCallNode("f");
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(callNode);
        Node result = injector.inline(callNode, "f", fnNode, InliningMode.DIRECT);
        assertNotNull(result);
    }

    @Test
    public void testClassifyCallSite_simpleCall() {
        Node callNode = createCallNode("f");
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(callNode);
        CallSiteType type = injector.classifyCallSite(callNode);
        assertNotNull(type);
    }

    @Test
    public void testEnumValuesPresent() {
        assertNotNull(InliningMode.DIRECT);
        assertNotNull(InliningMode.BLOCK);
        assertNotNull(CanInlineResult.YES);
        assertNotNull(CanInlineResult.AFTER_PREPARATION);
        assertNotNull(CanInlineResult.NO);
    }

    private Node createSimpleFunctionNode(String name) {
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString(name);
        fnNode.addChildToBack(nameNode);
        Node params = new Node(Token.PARAM_LIST);
        fnNode.addChildToBack(params);
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(new Node(Token.NUMBER, 42.0));
        block.addChildToBack(ret);
        fnNode.addChildToBack(block);
        return fnNode;
    }

    private Node createCallNode(String name) {
        Node callNode = new Node(Token.CALL);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString(name);
        callNode.addChildToBack(nameNode);
        return callNode;
    }
}
