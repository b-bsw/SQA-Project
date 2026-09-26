package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.*;

public class GlobalNamespaceTest {

    private AbstractCompiler compiler;
    private Node root;
    private Node externsRoot;
    private GlobalNamespace namespace;
    private Node nameNode;
    private Node assignNode;
    private Node varNode;
    private Node getPropNode;
    private Node objLitNode;
    private Node functionNode;

    @Before
    public void setUp() {
        compiler = new FakeCompiler();
        root = new Node(Token.BLOCK);
        externsRoot = new Node(Token.BLOCK);
        namespace = new GlobalNamespace(compiler, externsRoot, root);
    }

    private Node createNameNode(String name) {
        return Node.newString(Token.NAME, name);
    }

    private Node createVarNode(String name, Node value) {
        Node var = new Node(Token.VAR);
        Node nameNode = createNameNode(name);
        if (value != null) {
            nameNode.addChildToFront(value);
        }
        var.addChildToFront(nameNode);
        return var;
    }

    private Node createAssignNode(Node target, Node value) {
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToFront(target);
        assign.addChildToFront(value);
        return assign;
    }

    private Node createGetPropNode(String qualifiedName) {
        String[] parts = qualifiedName.split("\\.");
        Node current = createNameNode(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            Node getProp = new Node(Token.GETPROP);
            getProp.addChildToFront(current);
            getProp.addChildToFront(Node.newString(Token.STRING, parts[i]));
            current = getProp;
        }
        return current;
    }

    private Node createFunctionNode() {
        return new Node(Token.FUNCTION);
    }

    private Node createObjectLitNode() {
        return new Node(Token.OBJECTLIT);
    }

    @Test
    public void testInitialState() {
        assertTrue(namespace.getNameForest().isEmpty());
        assertTrue(namespace.getNameIndex().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testNullCompiler() {
        new GlobalNamespace(null, root);
    }

    @Test
    public void testProcessWithExternsAndRoot() {
        Node externName = createNameNode("ext");
        externsRoot.addChildToFront(externName);
        Node rootName = createNameNode("myVar");
        root.addChildToFront(rootName);
        namespace.getNameForest();
        assertFalse(namespace.getNameForest().isEmpty());
    }

    @Test
    public void testGlobalNameReference() {
        Node name = createNameNode("x");
        root.addChildToFront(createVarNode("x", null));
        namespace.getNameForest();
        assertTrue(namespace.getNameIndex().containsKey("x"));
    }

    @Test
    public void testGetNameForestGenerates() {
        root.addChildToFront(createVarNode("a", null));
        List<GlobalNamespace.Name> forest = namespace.getNameForest();
        assertEquals(1, forest.size());
        assertEquals("a", forest.get(0).name);
    }

    @Test
    public void testGetNameIndexGenerates() {
        root.addChildToFront(createVarNode("b", null));
        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        assertTrue(index.containsKey("b"));
    }

    @Test
    public void testMultipleGlobalSets() {
        Node name = createNameNode("c");
        name.addChildToFront(Node.newNumber(1));
        root.addChildToFront(createVarNode("c", Node.newNumber(1)));
        root.addChildToFront(createAssignNode(name.cloneTree(), Node.newNumber(2)));
        namespace.getNameForest();
        GlobalNamespace.Name nameObj = namespace.getNameIndex().get("c");
        assertEquals(2, nameObj.globalSets);
    }

    @Test
    public void testLocalSetKeepsCount() {
        Node func = createFunctionNode();
        Node name = createNameNode("d");
        name.addChildToFront(func);
        root.addChildToFront(createVarNode("d", func));
        namespace.getNameForest();
        GlobalNamespace.Name nameObj = namespace.getNameIndex().get("d");
        assertEquals(1, nameObj.localSets);
    }

    @Test
    public void testGetPropGlobalSet() {
        Node getProp = createGetPropNode("e.f");
        root.addChildToFront(createAssignNode(getProp, Node.newNumber(1)));
        namespace.getNameForest();
        assertTrue(namespace.getNameIndex().containsKey("e"));
    }

    @Test
    public void testObjectLitKeyCreatesName() {
        Node objLit = createObjectLitNode();
        Node key = Node.newString(Token.STRING, "g");
        Node val = Node.newNumber(1);
        key.addChildToFront(val);
        objLit.addChildToFront(key);
        Node assign = createAssignNode(createNameNode("h"), objLit);
        root.addChildToFront(assign);
        namespace.getNameForest();
        assertTrue(namespace.getNameIndex().containsKey("h"));
    }

    @Test
    public void testFunctionDeclaration() {
        Node func = createFunctionNode();
        Node name = createNameNode("myFunc");
        name.addChildToFront(func);
        root.addChildToFront(createVarNode("myFunc", func));
        namespace.getNameForest();
        GlobalNamespace.Name nameObj = namespace.getNameIndex().get("myFunc");
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, nameObj.type);
    }

    @Test
    public void testObjectLitType() {
        Node objLit = createObjectLitNode();
        root.addChildToFront(createVarNode("obj", objLit));
        namespace.getNameForest();
        GlobalNamespace.Name nameObj = namespace.getNameIndex().get("obj");
        assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, nameObj.type);
    }

    @Test
    public void testCanEliminateFalseWhenGets() {
        root.addChildToFront(createVarNode("x", null));
        namespace.getNameForest();
        GlobalNamespace.Name nameObj = namespace.getNameIndex().get("x");
        assertFalse(nameObj.canEliminate());
    }

    @Test
    public void testIsNamespace() {
        Node objLit = createObjectLitNode();
        root.addChildToFront(createVarNode("ns", objLit));
        namespace.getNameForest();
        GlobalNamespace.Name nameObj = namespace.getNameIndex().get("ns");
        assertFalse(nameObj.isNamespace());
    }

    @Test
    public void testAddRefIncreasesCounts() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("test", null, false);
        GlobalNamespace.Ref ref1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        name.addRef(ref1);
        assertEquals(1, name.globalSets);
        GlobalNamespace.Ref ref2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        name.addRef(ref2);
        assertEquals(1, name.totalGets);
    }

    @Test
    public void testRemoveRefDecreasesCounts() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("test", null, false);
        GlobalNamespace.Ref ref1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        name.addRef(ref1);
        GlobalNamespace.Ref ref2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        name.addRef(ref2);
        name.removeRef(ref1);
        assertEquals(0, name.globalSets);
        assertEquals(1, name.totalGets);
        name.removeRef(ref2);
        assertEquals(0, name.totalGets);
    }

    @Test
    public void testIsSetReturnsTrueForSetTypes() {
        GlobalNamespace.Ref setRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        assertTrue(setRef.isSet());
        GlobalNamespace.Ref getRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        assertFalse(getRef.isSet());
    }

    @Test
    public void testMarkTwinsCreatesTwinRelationship() {
        GlobalNamespace.Ref refA = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
        GlobalNamespace.Ref refB = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        GlobalNamespace.Ref.markTwins(refA, refB);
        assertNotNull(refA.getTwin());
        assertNotNull(refB.getTwin());
        assertSame(refB, refA.getTwin());
        assertSame(refA, refB.getTwin());
    }

    @Test
    public void testAliasingGetIncrementsAliasingGets() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("test", null, false);
        GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
        name.addRef(ref);
        assertEquals(1, name.aliasingGets);
        assertEquals(1, name.totalGets);
    }

    @Test
    public void testCallGetIncrementsCallGets() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("test", null, false);
        GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);
        name.addRef(ref);
        assertEquals(1, name.callGets);
        assertEquals(1, name.totalGets);
    }

    private static class FakeCompiler extends AbstractCompiler {
        @Override
        public void report(JSError error) {}

        @Override
        public String getSourceLine(String sourceName, int lineNumber) {
            return null;
        }

        @Override
        public Region getRegion(String sourceName) {
            return null;
        }

        @Override
        public CompilerInput getInput(String sourceName) {
            return null;
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return null;
        }

        @Override
        public boolean hasHaltingErrors() {
            return false;
        }

        @Override
        public boolean hasErrors() {
            return false;
        }

        @Override
        public boolean hasWarnings() {
            return false;
        }

        @Override
        public void process(JSError error) {}

        @Override
        public String toSourceLine(Node n) {
            return null;
        }

        @Override
        public Scope getTopScope() {
            return new Scope(null, null);
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention() {
                @Override
                public boolean isConstant(String variableName) {
                    return false;
                }

                @Override
                public boolean isConstantByConvention(CodingConvention convention, Node node, Node parent) {
                    return false;
                }
            };
        }

        @Override
        public Supplier<String> getUniqueNameIdSupplier() {
            return null;
        }

        @Override
        public boolean acceptEcmaScript5() {
            return false;
        }

        @Override
        public boolean acceptConstKeyword() {
            return false;
        }

        @Override
        public boolean acceptComputedPropertyNames() {
            return false;
        }

        @Override
        public boolean acceptSyntaxVariant(SyntaxVariant variant) {
            return false;
        }

        @Override
        public boolean isIdeMode() {
            return false;
        }

        @Override
        public boolean isInliningForbidden() {
            return false;
        }
    }
}