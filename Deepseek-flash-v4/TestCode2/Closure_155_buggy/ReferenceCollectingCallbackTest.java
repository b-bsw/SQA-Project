package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ReferenceCollectingCallbackTest {

    // Token constants (simplified)
    static final int NAME = 1;
    static final int VAR = 2;
    static final int FUNCTION = 3;
    static final int CATCH = 4;
    static final int LP = 5;
    static final int ASSIGN = 6;
    static final int INC = 7;
    static final int DEC = 8;
    static final int DO = 9;
    static final int FOR = 10;
    static final int TRY = 11;
    static final int WHILE = 12;
    static final int WITH = 13;
    static final int AND = 14;
    static final int HOOK = 15;
    static final int IF = 16;
    static final int OR = 17;
    static final int CASE = 18;
    static final int BLOCK = 19;

    // Stub classes (simulate rhino.Node, jscomp.Scope, etc.)
    static class Node {
        int type;
        String string;
        Node firstChild, parent;
        Node(int type, String string) { this.type = type; this.string = string; }
        int getType() { return type; }
        String getString() { return string; }
        Node getFirstChild() { return firstChild; }
        Node getParent() { return parent; }
        void setFirstChild(Node c) { firstChild = c; }
        void setParent(Node p) { parent = p; }
    }

    static class Scope {
        Node rootNode;
        Map<String, Var> vars = new HashMap<>();
        Scope(Node root) { this.rootNode = root; }
        Var getVar(String name) { return vars.get(name); }
        Node getRootNode() { return rootNode; }
    }

    static class Var {
        String name;
        Node parentNode, initialValue;
        Var(String name) { this.name = name; }
        String getName() { return name; }
        Node getParentNode() { return parentNode; }
        Node getInitialValue() { return initialValue; }
    }

    static class NodeTraversal {
        Scope scope;
        String sourceName;
        NodeTraversal(Scope scope, String sourceName) {
            this.scope = scope;
            this.sourceName = sourceName;
        }
        Scope getScope() { return scope; }
        String getSourceName() { return sourceName; }
    }

    static class AbstractCompiler {
        // empty stub
    }

    private ReferenceCollectingCallback collector;
    private ReferenceCollectingCallback.Behavior behavior;
    private AbstractCompiler compiler;
    private NodeTraversal traversal;
    private Scope scope;
    private Node root;

    @Before
    public void setUp() {
        compiler = new AbstractCompiler();
        behavior = new ReferenceCollectingCallback.Behavior() {
            @Override
            public void afterExitScope(NodeTraversal t,
                    Map<Var, ReferenceCollection> referenceMap) {
                // do nothing
            }
        };
        root = new Node(BLOCK, "root");
        scope = new Scope(root);
        traversal = new NodeTraversal(scope, "test.js");
        collector = new ReferenceCollectingCallback(compiler, behavior);
    }

    // ---------- ReferenceCollection tests ----------
    @Test
    public void testIsWellDefined_noReferences() {
        ReferenceCollection coll = new ReferenceCollection();
        assertFalse(coll.isWellDefined());
    }

    @Test
    public void testIsWellDefined_initDeclaration() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("a");
        Node nameNode = new Node(NAME, "a");
        Node varNode = new Node(VAR, "var");
        varNode.setFirstChild(nameNode);
        nameNode.setParent(varNode);
        Node init = new Node(ASSIGN, "init");
        nameNode.setFirstChild(init);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        coll.add(ref, traversal, v);
        assertTrue(coll.isWellDefined());
    }

    @Test
    public void testIsWellDefined_initAssignment() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("b");
        Node nameNode = new Node(NAME, "b");
        Node varNode = new Node(VAR, "var");
        varNode.setFirstChild(nameNode);
        nameNode.setParent(varNode);
        Reference declRef = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        coll.add(declRef, traversal, v);

        Node assignNode = new Node(ASSIGN, "=");
        Node nameNode2 = new Node(NAME, "b");
        assignNode.setFirstChild(nameNode2);
        nameNode2.setParent(assignNode);
        Reference assignRef = new Reference(nameNode2, assignNode, traversal, new BasicBlock(null, root));
        coll.add(assignRef, traversal, v);
        assertTrue(coll.isWellDefined());
    }

    @Test
    public void testIsWellDefined_notWellDefined() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("c");
        Node nameNode = new Node(NAME, "c");
        Node parentNode = new Node(IF, "if");
        nameNode.setParent(parentNode);
        Reference ref = new Reference(nameNode, parentNode, traversal, new BasicBlock(null, root));
        coll.add(ref, traversal, v);
        assertFalse(coll.isWellDefined());
    }

    @Test
    public void testIsEscaped_sameScope() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("d");
        Node nameNode1 = new Node(NAME, "d");
        Node parent1 = new Node(VAR, "var");
        nameNode1.setParent(parent1);
        Reference ref1 = new Reference(nameNode1, parent1, traversal, new BasicBlock(null, root));
        coll.add(ref1, traversal, v);
        Node nameNode2 = new Node(NAME, "d");
        Node parent2 = new Node(ASSIGN, "=");
        nameNode2.setParent(parent2);
        Reference ref2 = new Reference(nameNode2, parent2, traversal, new BasicBlock(null, root));
        coll.add(ref2, traversal, v);
        assertFalse(coll.isEscaped());
    }

    @Test
    public void testIsEscaped_differentScopes() {
        ReferenceCollection coll = new ReferenceCollection();
        Scope scope1 = new Scope(new Node(BLOCK, "s1"));
        NodeTraversal t1 = new NodeTraversal(scope1, "t1.js");
        Scope scope2 = new Scope(new Node(BLOCK, "s2"));
        NodeTraversal t2 = new NodeTraversal(scope2, "t2.js");

        Var v = new Var("e");
        Node nameNode1 = new Node(NAME, "e");
        Node parent1 = new Node(VAR, "var");
        nameNode1.setParent(parent1);
        Reference ref1 = new Reference(nameNode1, parent1, t1, new BasicBlock(null, root));
        coll.add(ref1, t1, v);

        Node nameNode2 = new Node(NAME, "e");
        Node parent2 = new Node(ASSIGN, "=");
        nameNode2.setParent(parent2);
        Reference ref2 = new Reference(nameNode2, parent2, t2, new BasicBlock(null, root));
        coll.add(ref2, t2, v);
        assertTrue(coll.isEscaped());
    }

    @Test
    public void testIsAssignedOnceInLifetime_singleAssignNotInLoop() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("f");
        Node nameNode = new Node(NAME, "f");
        Node varNode = new Node(VAR, "var");
        varNode.setFirstChild(nameNode);
        nameNode.setParent(varNode);
        Node init = new Node(ASSIGN, "init");
        nameNode.setFirstChild(init);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        coll.add(ref, traversal, v);
        Node useNode = new Node(NAME, "f");
        Node useParent = new Node(IF, "if");
        useNode.setParent(useParent);
        Reference useRef = new Reference(useNode, useParent, traversal, new BasicBlock(null, root));
        coll.add(useRef, traversal, v);
        assertTrue(coll.isAssignedOnceInLifetime());
    }

    @Test
    public void testIsAssignedOnceInLifetime_inLoop() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("g");
        Node loopParent = new Node(FOR, "for");
        Node loopRoot = new Node(BLOCK, "body");
        loopParent.setFirstChild(loopRoot);
        loopRoot.setParent(loopParent);
        BasicBlock loopBlock = new BasicBlock(null, loopRoot);

        Node nameNode = new Node(NAME, "g");
        Node varNode = new Node(VAR, "var");
        varNode.setFirstChild(nameNode);
        nameNode.setParent(varNode);
        Node init = new Node(ASSIGN, "init");
        nameNode.setFirstChild(init);
        Reference ref = new Reference(nameNode, varNode, traversal, loopBlock);
        coll.add(ref, traversal, v);
        assertFalse(coll.isAssignedOnceInLifetime());
    }

    @Test
    public void testIsNeverAssigned() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("h");
        Node nameNode = new Node(NAME, "h");
        Node parent = new Node(IF, "if");
        nameNode.setParent(parent);
        Reference ref = new Reference(nameNode, parent, traversal, new BasicBlock(null, root));
        coll.add(ref, traversal, v);
        assertTrue(coll.isNeverAssigned());
    }

    @Test
    public void testFirstReferenceIsAssigningDeclaration() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("i");
        Node nameNode = new Node(NAME, "i");
        Node varNode = new Node(VAR, "var");
        varNode.setFirstChild(nameNode);
        nameNode.setParent(varNode);
        Node init = new Node(ASSIGN, "init");
        nameNode.setFirstChild(init);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        coll.add(ref, traversal, v);
        assertTrue(coll.firstReferenceIsAssigningDeclaration());
    }

    @Test
    public void testFirstReferenceIsNotAssigningDeclaration() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("j");
        Node nameNode = new Node(NAME, "j");
        Node parent = new Node(IF, "if");
        nameNode.setParent(parent);
        Reference ref = new Reference(nameNode, parent, traversal, new BasicBlock(null, root));
        coll.add(ref, traversal, v);
        assertFalse(coll.firstReferenceIsAssigningDeclaration());
    }

    @Test
    public void testGetInitializingReferenceForConstants() {
        ReferenceCollection coll = new ReferenceCollection();
        Var v = new Var("k");
        Node nameNode = new Node(NAME, "k");
        Node varNode = new Node(VAR, "var");
        varNode.setFirstChild(nameNode);
        nameNode.setParent(varNode);
        Reference declRef = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        coll.add(declRef, traversal, v);

        Node assignNode = new Node(ASSIGN, "=");
        Node nameNode2 = new Node(NAME, "k");
        assignNode.setFirstChild(nameNode2);
        nameNode2.setParent(assignNode);
        Reference assignRef = new Reference(nameNode2, assignNode, traversal, new BasicBlock(null, root));
        coll.add(assignRef, traversal, v);

        assertNotNull(coll.getInitializingReferenceForConstants());
    }

    // ---------- BasicBlock tests ----------
    @Test
    public void testProvablyExecutesBefore_ancestor() {
        Node blockRoot = new Node(BLOCK, "root");
        BasicBlock parent = new BasicBlock(null, blockRoot);
        BasicBlock child = new BasicBlock(parent, blockRoot);
        assertTrue(parent.provablyExecutesBefore(child));
        assertFalse(child.provablyExecutesBefore(parent));
    }

    @Test
    public void testProvablyExecutesBefore_unrelated() {
        Node root1 = new Node(BLOCK, "block1");
        BasicBlock block1 = new BasicBlock(null, root1);
        Node root2 = new Node(BLOCK, "block2");
        BasicBlock block2 = new BasicBlock(null, root2);
        assertFalse(block1.provablyExecutesBefore(block2));
    }

    // ---------- Reference tests ----------
    @Test
    public void testIsDeclaration_var() {
        Node nameNode = new Node(NAME, "x");
        Node varNode = new Node(VAR, "var");
        nameNode.setParent(varNode);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        assertTrue(ref.isDeclaration());
    }

    @Test
    public void testIsDeclaration_function() {
        Node nameNode = new Node(NAME, "f");
        Node funcNode = new Node(FUNCTION, "function");
        nameNode.setParent(funcNode);
        Reference ref = new Reference(nameNode, funcNode, traversal, new BasicBlock(null, root));
        assertTrue(ref.isDeclaration());
    }

    @Test
    public void testIsVarDeclaration() {
        Node nameNode = new Node(NAME, "x");
        Node varNode = new Node(VAR, "var");
        nameNode.setParent(varNode);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        assertTrue(ref.isVarDeclaration());

        Node ifNode = new Node(IF, "if");
        Reference ref2 = new Reference(nameNode, ifNode, traversal, new BasicBlock(null, root));
        assertFalse(ref2.isVarDeclaration());
    }

    @Test
    public void testIsInitializingDeclaration_withInit() {
        Node nameNode = new Node(NAME, "a");
        Node varNode = new Node(VAR, "var");
        nameNode.setParent(varNode);
        Node init = new Node(ASSIGN, "init");
        nameNode.setFirstChild(init);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        assertTrue(ref.isInitializingDeclaration());
    }

    @Test
    public void testIsInitializingDeclaration_withoutInit() {
        Node nameNode = new Node(NAME, "a");
        Node varNode = new Node(VAR, "var");
        nameNode.setParent(varNode);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        assertFalse(ref.isInitializingDeclaration());
    }

    @Test
    public void testIsSimpleAssignmentToName() {
        Node nameNode = new Node(NAME, "b");
        Node assignNode = new Node(ASSIGN, "=");
        assignNode.setFirstChild(nameNode);
        nameNode.setParent(assignNode);
        Reference ref = new Reference(nameNode, assignNode, traversal, new BasicBlock(null, root));
        assertTrue(ref.isSimpleAssignmentToName());
    }

    @Test
    public void testIsLvalue_varWithInit() {
        Node nameNode = new Node(NAME, "c");
        Node varNode = new Node(VAR, "var");
        varNode.setFirstChild(nameNode);
        nameNode.setParent(varNode);
        Node init = new Node(ASSIGN, "init");
        nameNode.setFirstChild(init);
        Reference ref = new Reference(nameNode, varNode, traversal, new BasicBlock(null, root));
        assertTrue(ref.isLvalue());
    }

    @Test
    public void testIsLvalue_useOnly() {
        Node nameNode = new Node(NAME, "c");
        Node ifNode = new Node(IF, "if");
        nameNode.setParent(ifNode);
        Reference ref = new Reference(nameNode, ifNode, traversal, new BasicBlock(null, root));
        assertFalse(ref.isLvalue());
    }

    // ---------- ReferenceCollectingCallback integration tests ----------
    @Test
    public void testProcess_noReferences() {
        Node externs = null;
        Node rootNode = new Node(BLOCK, "root");
        collector.process(externs, rootNode);
        assertTrue(collector.getReferencedVariables().isEmpty());
    }

    @Test
    public void testVisit_addsReference() {
        Var v = new Var("x");
        scope.vars.put("x", v);
        Node nameNode = new Node(NAME, "x");
        Node parent = new Node(VAR, "var");
        nameNode.setParent(parent);
        collector.visit(traversal, nameNode, parent);
        ReferenceCollection coll = collector.getReferenceCollection(v);
        assertNotNull(coll);
        assertEquals(1, coll.references.size());
        assertTrue(collector.getReferencedVariables().contains(v));
    }

    @Test
    public void testEnterExitScope_callsBehavior() {
        final boolean[] called = new boolean[]{false};
        ReferenceCollectingCallback.Behavior customBehavior =
            new ReferenceCollectingCallback.Behavior() {
                @Override
                public void afterExitScope(NodeTraversal t,
                        Map<Var, ReferenceCollection> referenceMap) {
                    called[0] = true;
                }
            };
        ReferenceCollectingCallback customCollector =
            new ReferenceCollectingCallback(compiler, customBehavior);
        customCollector.enterScope(traversal);
        customCollector.exitScope(traversal);
        assertTrue(called[0]);
    }
}