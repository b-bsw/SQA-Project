package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GlobalNamespaceTest {

    private AbstractCompiler compiler;
    private Node root;
    private Node externsRoot;

    @Before
    public void setUp() {
        compiler = new FakeCompiler();
        root = new Node(Token.BLOCK);
        externsRoot = null;
    }

    @After
    public void tearDown() {
        compiler = null;
        root = null;
    }

    @Test
    public void testConstructorWithExterns() {
        externsRoot = new Node(Token.BLOCK);
        GlobalNamespace namespace = new GlobalNamespace(compiler, externsRoot, root);
        assertTrue(namespace.hasExternsRoot());
    }

    @Test
    public void testConstructorWithoutExterns() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertFalse(namespace.hasExternsRoot());
    }

    @Test
    public void testGetRootNode() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertEquals(root.getParent(), namespace.getRootNode());
    }

    @Test
    public void testGetParentScope() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertNull(namespace.getParentScope());
    }

    @Test
    public void testGetSlotAndGetOwnSlot() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertNull(namespace.getSlot("nonexistent"));
        assertNull(namespace.getOwnSlot("nonexistent"));
    }

    @Test
    public void testEnsureGenerated() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertTrue(namespace.getNameForest().isEmpty());
        assertTrue(namespace.getNameIndex().isEmpty());
    }

    @Test
    public void testGetAllSymbols() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertTrue(namespace.getAllSymbols().iterator().hasNext());
    }

    @Test
    public void testScanNewNodesWithQualifiedName() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node assign = new Node(Token.ASSIGN, nameNode, new Node(Token.NUMBER, 1));
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        root.addChildToBack(exprResult);
        ArrayList<GlobalNamespace.AstChange> newNodes = new ArrayList<>();
        newNodes.add(new GlobalNamespace.AstChange(null, null, nameNode));
        namespace.scanNewNodes(newNodes);
        assertNotNull(namespace.getOwnSlot("a"));
    }

    @Test
    public void testScanNewNodesWithObjectLitKey() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Node keyNode = Node.newString(Token.STRING, "key");
        // Set up parent chain to simulate object literal assignment
        Node objectLit = new Node(Token.OBJECTLIT, keyNode);
        Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "obj"), objectLit);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        root.addChildToBack(exprResult);
        ArrayList<GlobalNamespace.AstChange> newNodes = new ArrayList<>();
        newNodes.add(new GlobalNamespace.AstChange(null, null, keyNode));
        namespace.scanNewNodes(newNodes);
        assertNotNull(namespace.getOwnSlot("obj.key"));
    }

    @Test
    public void testScanNewNodesIgnoreNonQualifiedName() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Node literal = new Node(Token.NUMBER, 1);
        ArrayList<GlobalNamespace.AstChange> newNodes = new ArrayList<>();
        newNodes.add(new GlobalNamespace.AstChange(null, null, literal));
        namespace.scanNewNodes(newNodes);
        assertTrue(namespace.getNameForest().isEmpty());
    }

    @Test
    public void testProcessWithExternsRoot() {
        externsRoot = new Node(Token.BLOCK);
        GlobalNamespace namespace = new GlobalNamespace(compiler, externsRoot, root);
        Node nameNode = Node.newString(Token.NAME, "ext");
        Node var = new Node(Token.VAR, nameNode);
        externsRoot.addChildToBack(var);
        // process is called automatically by ensureGenerated
        namespace.getNameForest();
        assertNotNull(namespace.getOwnSlot("ext"));
    }

    @Test
    public void testNameAddRefAndCounts() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);
        assertEquals(0, name.globalSets);
        assertEquals(0, name.localSets);
        assertEquals(0, name.totalGets);
        assertEquals(0, name.aliasingGets);
        assertEquals(0, name.callGets);
        assertEquals(0, name.deleteProps);

        // Add a SET_FROM_GLOBAL ref
        Node dummy = new Node(Token.NAME, "x");
        GlobalNamespace.Ref ref = new GlobalNamespace.Ref(null, null, dummy, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        name.addRef(ref);
        assertEquals(1, name.globalSets);
        assertNotNull(name.getDeclaration());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, name.getDeclaration().type);
        assertEquals(1, name.getRefs().size());
    }

    @Test
    public void testNameRemoveRef() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("y", null, false);
        Node dummy = new Node(Token.NAME, "y");
        GlobalNamespace.Ref ref = new GlobalNamespace.Ref(null, null, dummy, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        name.addRef(ref);
        assertEquals(1, name.globalSets);
        name.removeRef(ref);
        assertEquals(0, name.globalSets);
        assertNull(name.getDeclaration());
    }

    @Test
    public void testNameCanCollapse() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("z", null, false);
        Node dummy = new Node(Token.NAME, "z");
        GlobalNamespace.Ref ref = new GlobalNamespace.Ref(null, null, dummy, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        name.addRef(ref);
        // By default, type=OTHER, globalSets=1, localSets=0, deleteProps=0, no externs
        assertTrue(name.canCollapse());
    }

    @Test
    public void testNameCanCollapseExterns() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("ext", null, true);
        assertFalse(name.canCollapse());
    }

    @Test
    public void testNameCanEliminate() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("e", null, false);
        assertTrue(name.canEliminate()); // no refs at all
    }

    @Test
    public void testNameIsSimpleStubDeclaration() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("s", null, false);
        Node dummy = new Node(Token.NAME, "s");
        Node exprResult = new Node(Token.EXPR_RESULT, dummy);
        GlobalNamespace.Ref ref = new GlobalNamespace.Ref(null, null, dummy, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        name.addRef(ref);
        assertTrue(name.isSimpleStubDeclaration());
    }

    @Test
    public void testNameAddProperty() {
        GlobalNamespace.Name parent = new GlobalNamespace.Name("p", null, false);
        GlobalNamespace.Name child = parent.addProperty("c", false);
        assertNotNull(child);
        assertEquals(parent, child.parent);
        assertEquals("p.c", child.getFullName());
        assertTrue(parent.props.contains(child));
    }

    @Test
    public void testRefMarkTwins() {
        Node dummy = new Node(Token.NAME, "x");
        GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);
        GlobalNamespace.Ref set = new GlobalNamespace.Ref(null, null, dummy, name,
                GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        GlobalNamespace.Ref alias = new GlobalNamespace.Ref(null, null, dummy, name,
                GlobalNamespace.Ref.Type.ALIASING_GET, 1);
        GlobalNamespace.Ref.markTwins(set, alias);
        assertSame(set, alias.getTwin());
        assertSame(alias, set.getTwin());
    }

    @Test
    public void testRefCreateRefForTesting() {
        GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        assertNotNull(ref);
        assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, ref.type);
        assertNull(ref.node);
        assertEquals(-1, ref.preOrderIndex);
    }

    @Test
    public void testRefCloneAndReclassify() {
        Node dummy = new Node(Token.NAME, "x");
        GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);
        GlobalNamespace.Ref original = new GlobalNamespace.Ref(null, null, dummy, name,
                GlobalNamespace.Ref.Type.DIRECT_GET, 5);
        GlobalNamespace.Ref cloned = original.cloneAndReclassify(GlobalNamespace.Ref.Type.CALL_GET);
        assertEquals(GlobalNamespace.Ref.Type.CALL_GET, cloned.type);
        assertEquals(original.preOrderIndex, cloned.preOrderIndex);
        assertEquals(original.node, cloned.node);
        assertEquals(original.name, cloned.name);
    }

    @Test
    public void testTrackerProcess() {
        // Minimal test for Tracker inner class
        Node block = new Node(Token.BLOCK);
        Node rootNode = new Node(Token.BLOCK);
        Node nameNode = Node.newString(Token.NAME, "foo");
        Node var = new Node(Token.VAR, nameNode);
        rootNode.addChildToBack(var);
        PrintStream stream = System.out;
        GlobalNamespace.Tracker tracker = new GlobalNamespace.Tracker(compiler, stream,
                new com.google.common.base.Predicate<String>() {
                    @Override
                    public boolean apply(String input) {
                        return input.startsWith("f");
                    }
                });
        tracker.process(block, rootNode);
        // output printed to stream; no assertion
    }

    @Test
    public void testGetTypeOfThis() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertNotNull(namespace.getTypeOfThis());
    }

    // ------------------------------------------------------------------
    // Inner stub classes for testing (minimal)
    // ------------------------------------------------------------------
    private static class FakeCompiler extends AbstractCompiler {
        @Override
        public JSTypeRegistry getTypeRegistry() {
            return new JSTypeRegistry();
        }

        @Override
        public String getLastPassName() {
            return "testPass";
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention();
        }

        @Override
        public Scope getTopScope() {
            return null;
        }
    }
}