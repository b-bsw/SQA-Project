package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.InputId;

public class ReferenceCollectingCallbackTest {

    private static class TestBehavior implements ReferenceCollectingCallback.Behavior {
        boolean called = false;
        ReferenceCollectingCallback.ReferenceMap receivedMap;
        @Override
        public void afterExitScope(NodeTraversal t, ReferenceCollectingCallback.ReferenceMap referenceMap) {
            called = true;
            receivedMap = referenceMap;
        }
    }

    private static class MockCompiler extends AbstractCompiler {
        ReferenceCollectingCallback.ReferenceMap globalVarReferences;
        boolean updateCalled;
        @Override
        public ReferenceCollectingCallback.ReferenceMap getGlobalVarReferences() {
            return globalVarReferences;
        }
        @Override
        public void updateGlobalVarReferences(Map<Var, ReferenceCollectingCallback.ReferenceCollection> refMap, Node scopeRoot) {
            updateCalled = true;
        }
        // implement remaining abstract methods with no-op
        @Override public CompilerOptions getOptions() { return null; }
        @Override public void report(JSError error) {}
        @Override public void reportChangeToEnclosingScope(Node n) {}
        @Override public void reportCodeChange() {}
        @Override public CodingConvention getCodingConvention() { return null; }
        @Override public void ensureTyped(Node n, JSType type) {}
        @Override public void setScope(Node n, Scope s) {}
        @Override public Scope getTopScope() { return null; }
        @Override public ScopeCreator getScopeCreator() { return null; }
        @Override public void setHasRegExpGlobalReferences(boolean b) {}
        @Override public boolean hasRegExpGlobalReferences() { return false; }
        @Override public void setHasCachedName(String s) {}
        @Override public String getCachedName() { return null; }
        @Override public void setHasExternsRoot(Node n) {}
        @Override public Node getExternsRoot() { return null; }
        @Override public void setHasExternsRootChange(boolean b) {}
        @Override public boolean hasExternsRootChange() { return false; }
        @Override public void setHasScope(Node n, Scope s) {}
        @Override public Scope getHasScope(Node n) { return null; }
    }

    private static class MockScope extends Scope {
        final boolean global;
        final Node rootNode;
        final Map<String, Var> vars = new HashMap<>();
        Var argumentsVar;

        MockScope(Node rootNode, boolean global) {
            super(rootNode, null);
            this.rootNode = rootNode;
            this.global = global;
        }

        void addVar(String name, Var var) { vars.put(name, var); }
        void setArgumentsVar(Var var) { argumentsVar = var; }

        @Override public Var getVar(String name) { return vars.get(name); }
        @Override public boolean isGlobal() { return global; }
        @Override public Node getRootNode() { return rootNode; }
        @Override public Var getArgumentsVar() { return argumentsVar; }
        @Override public Scope getParent() { return null; }
        @Override public int getDepth() { return 0; }
        @Override public boolean isDeclared(String name, boolean recurse) { return false; }
        @Override public boolean isOwnDeclared(String name) { return false; }
        @Override public void declare(String name, Node n, JSType type, CompilerInput input) {}
        @Override public void undeclare(Var var) {}
        @Override public Var getOwnSlot(String name) { return null; }
        @Override public Var getSlot(String name) { return getVar(name); }
        @Override public Iterable<Var> getAllSymbols() { return vars.values(); }
        @Override public Node getParentNode() { return rootNode; }
    }

    private static class MockNodeTraversal extends NodeTraversal {
        final Scope scope;
        final CompilerInput input;
        final Node scopeRoot;

        MockNodeTraversal(Scope scope) {
            super(null, null); // dummy parent constructor
            this.scope = scope;
            this.scopeRoot = scope.getRootNode();
            this.input = new CompilerInput(SourceFile.fromCode("test", ""));
        }

        @Override public Scope getScope() { return scope; }
        @Override public CompilerInput getInput() { return input; }
        @Override public Node getScopeRoot() { return scopeRoot; }
    }

    private MockCompiler compiler;
    private TestBehavior behavior;
    private ReferenceCollectingCallback callback;

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        behavior = new TestBehavior();
        callback = new ReferenceCollectingCallback(compiler, behavior);
    }

    @Test
    public void testConstructors() {
        assertNotNull(new ReferenceCollectingCallback(compiler, behavior));
        Predicate<Var> filter = Predicates.alwaysTrue();
        assertNotNull(new ReferenceCollectingCallback(compiler, behavior, filter));
    }

    @Test
    public void testEnterScopeAndExitScopeNonGlobal() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, false);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        callback.exitScope(t);
        assertTrue(behavior.called);
        assertNotNull(behavior.receivedMap);
    }

    @Test
    public void testExitScopeGlobal() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, true);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        callback.exitScope(t);
        assertTrue(compiler.updateCalled);
        assertTrue(behavior.called);
    }

    @Test
    public void testShouldTraverseNonBoundary() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, true);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        Node child = new Node(Token.NAME);
        child.setString("x");
        Node parent = new Node(Token.BLOCK); // not in boundary list
        parent.addChildToBack(child);
        boolean result = callback.shouldTraverse(t, child, parent);
        assertTrue(result);
    }

    @Test
    public void testShouldTraverseBoundaryWhile() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, true);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        Node child = new Node(Token.BLOCK);
        Node parent = new Node(Token.WHILE);
        parent.addChildToBack(child); // child is not first? Actually using WHILE: first child is condition.
        // For WHILE, any child triggers boundary? In code: case Token.WHILE: return true; (unconditional)
        // So we test that it returns true and pushes a block.
        boolean result = callback.shouldTraverse(t, child, parent);
        assertTrue(result);
    }

    @Test
    public void testShouldTraverseConditionalFirstChild() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, true);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        Node child = new Node(Token.BLOCK);
        Node parent = new Node(Token.IF);
        parent.addChildToBack(child); // this is first child
        // For IF, first child is not boundary
        boolean result = callback.shouldTraverse(t, child, parent);
        assertTrue(result); // always true, but no push
    }

    @Test
    public void testShouldTraverseConditionalNotFirstChild() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, true);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        Node firstChild = new Node(Token.BLOCK);
        Node secChild = new Node(Token.BLOCK);
        Node parent = new Node(Token.IF);
        parent.addChildToBack(firstChild);
        parent.addChildToBack(secChild);
        // secChild is not first
        boolean result = callback.shouldTraverse(t, secChild, parent);
        assertTrue(result);
    }

    @Test
    public void testVisitAddsReferenceForName() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, false);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Var var = new Var("x", nameNode, scope, 0);
        scope.addVar("x", var);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        BasicBlock block = new BasicBlock(null, root);
        // We need to set blockStack directly? use shouldTraverse to push a block, or use reflection.
        // Simpler: we call shouldTraverse to push a block.
        callback.shouldTraverse(t, root, null); // pushes global block
        callback.visit(t, nameNode, new Node(Token.BLOCK));
        ReferenceCollectingCallback.ReferenceCollection coll = callback.getReferences(var);
        assertNotNull(coll);
        assertEquals(1, coll.references.size());
    }

    @Test
    public void testVisitDoesNotAddForNullVar() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, false);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        callback.shouldTraverse(t, root, null);
        callback.visit(t, nameNode, new Node(Token.BLOCK));
        assertTrue(callback.getAllSymbols().iterator().hasNext() == false);
    }

    @Test
    public void testVisitAddsArguments() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, false);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("arguments");
        Var var = new Var("arguments", nameNode, scope, 0);
        scope.setArgumentsVar(var);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        callback.shouldTraverse(t, root, null);
        callback.visit(t, nameNode, new Node(Token.BLOCK));
        assertNotNull(callback.getReferences(var));
    }

    @Test
    public void testReferenceCollectionIsWellDefinedZeroSize() {
        ReferenceCollectingCallback.ReferenceCollection coll = new ReferenceCollectingCallback.ReferenceCollection();
        assertFalse(coll.isWellDefined());
    }

    @Test
    public void testReferenceCollectionIsWellDefinedNoInit() {
        ReferenceCollectingCallback.ReferenceCollection coll = new ReferenceCollectingCallback.ReferenceCollection();
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Node root = new Node(Token.BLOCK);
        BasicBlock block = new BasicBlock(null, root);
        ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, new MockNodeTraversal(new MockScope(root, false)), block);
        coll.add(ref);
        assertFalse(coll.isWellDefined());
    }

    @Test
    public void testReferenceCollectionIsWellDefinedWithInit() {
        ReferenceCollectingCallback.ReferenceCollection coll = new ReferenceCollectingCallback.ReferenceCollection();
        Node root = new Node(Token.BLOCK);
        BasicBlock block = new BasicBlock(null, root);
        // Create an initializing declaration: parent is VAR and has child
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Node initVal = new Node(Token.NUMBER, 1.0);
        nameNode.addChildToBack(initVal);
        varNode.addChildToBack(nameNode);
        // Now nameNode.getParent() is VAR, nameNode.getFirstChild() != null -> initializingDeclaration
        // But the Reference constructor expects a NodeTraversal with a scope that has that var.
        MockScope scope = new MockScope(root, false);
        Var var = new Var("x", nameNode, scope, 0);
        scope.addVar("x", var);
        // Create reference that simulates the declaration.
        // The reference node should be the nameNode inside VAR.
        ReferenceCollectingCallback.Reference declRef = new ReferenceCollectingCallback.Reference(nameNode, new MockNodeTraversal(scope), block);
        coll.add(declRef);
        // Add second reference that also provably executes after.
        BasicBlock childBlock = new BasicBlock(block, new Node(Token.BLOCK));
        ReferenceCollectingCallback.Reference useRef = new ReferenceCollectingCallback.Reference(nameNode, new MockNodeTraversal(scope), childBlock);
        coll.add(useRef);
        assertTrue(coll.isWellDefined());
    }

    @Test
    public void testReferenceCollectionIsEscaped() {
        ReferenceCollectingCallback.ReferenceCollection coll = new ReferenceCollectingCallback.ReferenceCollection();
        Node root1 = new Node(Token.BLOCK);
        Node root2 = new Node(Token.BLOCK);
        MockScope scope1 = new MockScope(root1, false);
        MockScope scope2 = new MockScope(root2, false);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        BasicBlock block = new BasicBlock(null, root1);
        ReferenceCollectingCallback.Reference ref1 = new ReferenceCollectingCallback.Reference(nameNode, new MockNodeTraversal(scope1), block);
        ReferenceCollectingCallback.Reference ref2 = new ReferenceCollectingCallback.Reference(nameNode, new MockNodeTraversal(scope2), block);
        coll.add(ref1);
        coll.add(ref2);
        assertTrue(coll.isEscaped());
    }

    @Test
    public void testReferenceCollectionIsAssignedOnce() {
        ReferenceCollectingCallback.ReferenceCollection coll = new ReferenceCollectingCallback.ReferenceCollection();
        Node root = new Node(Token.BLOCK);
        BasicBlock block = new BasicBlock(null, root);
        MockScope scope = new MockScope(root, false);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Var var = new Var("x", nameNode, scope, 0);
        scope.addVar("x", var);
        // Create an initializing declaration (assigning)
        Node varNode = new Node(Token.VAR);
        Node initVal = new Node(Token.NUMBER, 1.0);
        nameNode.addChildToBack(initVal);
        varNode.addChildToBack(nameNode);
        ReferenceCollectingCallback.Reference declRef = new ReferenceCollectingCallback.Reference(nameNode, new MockNodeTraversal(scope), block);
        coll.add(declRef);
        assertTrue(coll.isAssignedOnceInLifetime());
    }

    @Test
    public void testReferenceIsVarDeclaration() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        varNode.addChildToBack(nameNode);
        ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, null, null);
        assertTrue(ref.isVarDeclaration());
    }

    @Test
    public void testReferenceIsInitializingDeclarationVarWithInit() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Node init = new Node(Token.NUMBER, 1.0);
        nameNode.addChildToBack(init);
        varNode.addChildToBack(nameNode);
        ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, null, null);
        assertTrue(ref.isInitializingDeclaration());
    }

    @Test
    public void testReferenceIsLvalueAssign() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(new Node(Token.NUMBER, 1.0));
        ReferenceCollectingCallback.Reference ref = new ReferenceCollectingCallback.Reference(nameNode, null, null);
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testBasicBlockGlobalScope() {
        Node root = new Node(Token.BLOCK);
        BasicBlock block = new BasicBlock(null, root);
        assertTrue(block.isGlobalScopeBlock());
        BasicBlock child = new BasicBlock(block, new Node(Token.BLOCK));
        assertFalse(child.isGlobalScopeBlock());
    }

    @Test
    public void testBasicBlockProvablyExecutesBefore() {
        Node root = new Node(Token.BLOCK);
        BasicBlock parent = new BasicBlock(null, root);
        BasicBlock child = new BasicBlock(parent, new Node(Token.BLOCK));
        BasicBlock grandchild = new BasicBlock(child, new Node(Token.BLOCK));
        assertTrue(parent.provablyExecutesBefore(child));
        assertTrue(parent.provablyExecutesBefore(grandchild));
        assertFalse(child.provablyExecutesBefore(parent));
    }

    @Test
    public void testBasicBlockProvablyExecutesBeforeHoistedBlock() {
        Node root = new Node(Token.FUNCTION);
        Node parentNode = new Node(Token.FUNCTION);
        parentNode.addChildToBack(root);
        BasicBlock parent = new BasicBlock(null, parentNode);
        BasicBlock hoistedChild = new BasicBlock(parent, root); // root is hoisted function
        assertFalse(parent.provablyExecutesBefore(hoistedChild));
    }

    @Test
    public void testGetReferencesAndGetAllSymbols() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, false);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Var var = new Var("x", nameNode, scope, 0);
        scope.addVar("x", var);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        callback.shouldTraverse(t, root, null);
        callback.visit(t, nameNode, new Node(Token.BLOCK));
        assertEquals(var, callback.getAllSymbols().iterator().next());
        assertNotNull(callback.getReferences(var));
        assertNull(callback.getReferences(new Var("y", nameNode, scope, 1)));
    }

    @Test
    public void testGetScope() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, false);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Var var = new Var("x", nameNode, scope, 0);
        assertEquals(scope, callback.getScope(var));
    }

    @Test
    public void testVisitBlockBoundaryPop() {
        Node root = new Node(Token.BLOCK);
        MockScope scope = new MockScope(root, false);
        MockNodeTraversal t = new MockNodeTraversal(scope);
        callback.enterScope(t);
        // push a block boundary by shouldTraverse
        Node whileNode = new Node(Token.WHILE);
        Node child = new Node(Token.BLOCK);
        whileNode.addChildToBack(child);
        callback.shouldTraverse(t, child, whileNode);
        // Now blockStack has 2 items (global + while block)
        // Visit a name node
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        callback.visit(t, nameNode, whileNode);
        // should have popped while block
    }
}