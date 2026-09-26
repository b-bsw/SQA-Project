package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.*;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import java.util.*;

public class DevirtualizePrototypeMethodsTest {

    private MockCompiler compiler;
    private DevirtualizePrototypeMethods pass;

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        pass = new DevirtualizePrototypeMethods(compiler);
    }

    private Node createValidMethodNode() {
        Node nameNode = Node.newString(Token.NAME, "a");
        Node protoNode = Node.newString(Token.GETPROP, "prototype");
        protoNode.addChildToFront(nameNode);
        Node methodNode = Node.newString(Token.GETPROP, "b");
        methodNode.addChildToFront(protoNode);
        Node functionNode = new Node(Token.FUNCTION);
        new Node(Token.ASSIGN, methodNode, functionNode);
        new Node(Token.EXPR_RESULT, methodNode.getParent());
        return methodNode;
    }

    private Definition createMockDefinition(Node lValue, Node rValue) {
        return new Definition() {
            @Override public Node getLValue() { return lValue; }
            @Override public Node getRValue() { return rValue; }
        };
    }

    private UseSite createMockUseSite(Node node, JSModule module) {
        return new UseSite() {
            @Override public Node getNode() { return node; }
            @Override public JSModule getModule() { return module; }
        };
    }

    private DefinitionSite createDefinitionSite(boolean inExterns, boolean inGlobalScope, Node node, Definition def, JSModule module) {
        return new DefinitionSite() {
            @Override public boolean isInExterns() { return inExterns; }
            @Override public boolean isInGlobalScope() { return inGlobalScope; }
            @Override public Node getNode() { return node; }
            @Override public Definition getDefinition() { return def; }
            @Override public JSModule getModule() { return module; }
        };
    }

    private void invokeRewrite(DevirtualizePrototypeMethods instance, DefinitionSite site, SimpleDefinitionFinder finder) throws Exception {
        java.lang.reflect.Method m = DevirtualizePrototypeMethods.class.getDeclaredMethod(
                "rewriteDefinitionIfEligible", DefinitionSite.class, SimpleDefinitionFinder.class);
        m.setAccessible(true);
        m.invoke(instance, site, finder);
    }

    // ---------- Test cases ----------

    @Test
    public void testRewriteDefinitionIfEligible_inExterns_skips() throws Exception {
        Node methodNode = createValidMethodNode();
        Definition def = createMockDefinition(methodNode, methodNode.getParent().getLastChild());
        DefinitionSite site = createDefinitionSite(true, true, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        finder.setUseSites(def, Collections.emptyList());
        finder.setDefinitionsAtNode(methodNode, Collections.singletonList(def));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertFalse("No code change expected for externs definition", compiler.codeChangeReported);
    }

    @Test
    public void testRewriteDefinitionIfEligible_notGlobalScope_skips() throws Exception {
        Node methodNode = createValidMethodNode();
        Definition def = createMockDefinition(methodNode, methodNode.getParent().getLastChild());
        DefinitionSite site = createDefinitionSite(false, false, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        finder.setUseSites(def, Collections.emptyList());
        finder.setDefinitionsAtNode(methodNode, Collections.singletonList(def));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertFalse("No code change expected for non‑global scope", compiler.codeChangeReported);
    }

    @Test
    public void testRewriteDefinitionIfEligible_exportedMethod_skips() throws Exception {
        compiler.codingConvention.exported = true;
        Node methodNode = createValidMethodNode();
        Node functionNode = methodNode.getParent().getLastChild();
        Definition def = createMockDefinition(methodNode, functionNode);
        DefinitionSite site = createDefinitionSite(false, true, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        finder.setUseSites(def, Collections.emptyList());
        finder.setDefinitionsAtNode(methodNode, Collections.singletonList(def));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertFalse("No code change expected for exported method", compiler.codeChangeReported);
        compiler.codingConvention.exported = false;
    }

    @Test
    public void testRewriteDefinitionIfEligible_noUseSites_skips() throws Exception {
        Node methodNode = createValidMethodNode();
        Node functionNode = methodNode.getParent().getLastChild();
        Definition def = createMockDefinition(methodNode, functionNode);
        DefinitionSite site = createDefinitionSite(false, true, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        finder.setUseSites(def, Collections.emptyList());
        finder.setDefinitionsAtNode(methodNode, Collections.singletonList(def));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertFalse("No code change expected when no use sites", compiler.codeChangeReported);
    }

    @Test
    public void testRewriteDefinitionIfEligible_useSiteNotCall_skips() throws Exception {
        Node methodNode = createValidMethodNode();
        Node functionNode = methodNode.getParent().getLastChild();
        Definition def = createMockDefinition(methodNode, functionNode);
        DefinitionSite site = createDefinitionSite(false, true, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        // Not a CALL node: parent is NAME
        Node notCallNode = Node.newString(Token.NAME, "x");
        notCallNode.addChildToFront(methodNode); // methodNode becomes child, but parent is NAME
        UseSite useSite = createMockUseSite(notCallNode, null);
        finder.setUseSites(def, Collections.singletonList(useSite));
        finder.setDefinitionsAtNode(methodNode, Collections.singletonList(def));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertFalse("No code change when use site is not a call", compiler.codeChangeReported);
    }

    @Test
    public void testRewriteDefinitionIfEligible_multipleDefinitions_skips() throws Exception {
        Node methodNode = createValidMethodNode();
        Node functionNode = methodNode.getParent().getLastChild();
        Definition def = createMockDefinition(methodNode, functionNode);
        Definition otherDef = createMockDefinition(methodNode, functionNode);
        DefinitionSite site = createDefinitionSite(false, true, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        Node callNode = new Node(Token.CALL, methodNode);
        UseSite useSite = createMockUseSite(callNode, null);
        finder.setUseSites(def, Collections.singletonList(useSite));
        finder.setDefinitionsAtNode(methodNode, Lists.newArrayList(def, otherDef));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertFalse("No code change when multiple definitions at use site", compiler.codeChangeReported);
    }

    @Test
    public void testRewriteDefinitionIfEligible_controlStructureAncestor_skips() throws Exception {
        // Wrap method definition inside an IF
        Node nameNode = Node.newString(Token.NAME, "a");
        Node protoNode = Node.newString(Token.GETPROP, "prototype");
        protoNode.addChildToFront(nameNode);
        Node methodNode = Node.newString(Token.GETPROP, "b");
        methodNode.addChildToFront(protoNode);
        Node functionNode = new Node(Token.FUNCTION);
        Node assignNode = new Node(Token.ASSIGN, methodNode, functionNode);
        Node exprNode = new Node(Token.EXPR_RESULT, assignNode);
        Node ifNode = new Node(Token.IF, exprNode); // control structure
        // Now methodNode is inside IF

        Definition def = createMockDefinition(methodNode, functionNode);
        DefinitionSite site = createDefinitionSite(false, true, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        Node callNode = new Node(Token.CALL, methodNode);
        UseSite useSite = createMockUseSite(callNode, null);
        finder.setUseSites(def, Collections.singletonList(useSite));
        finder.setDefinitionsAtNode(methodNode, Collections.singletonList(def));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertFalse("No code change when inside control structure", compiler.codeChangeReported);
    }

    @Test
    public void testRewriteDefinitionIfEligible_normalRewrite() throws Exception {
        Node methodNode = createValidMethodNode();
        Node functionNode = methodNode.getParent().getLastChild();
        Definition def = createMockDefinition(methodNode, functionNode);
        DefinitionSite site = createDefinitionSite(false, true, methodNode, def, null);
        MockSimpleDefinitionFinder finder = new MockSimpleDefinitionFinder(compiler);
        finder.setDefinitionSites(Collections.singletonList(site));
        Node callNode = new Node(Token.CALL, methodNode);
        UseSite useSite = createMockUseSite(callNode, null);
        finder.setUseSites(def, Collections.singletonList(useSite));
        finder.setDefinitionsAtNode(methodNode, Collections.singletonList(def));
        compiler.codeChangeReported = false;
        invokeRewrite(pass, site, finder);
        assertTrue("Code change should be reported for eligible rewrite", compiler.codeChangeReported);
    }

    // ---------- Stub classes ----------

    static class MockCompiler extends AbstractCompiler {
        MockCodingConvention codingConvention = new MockCodingConvention();
        MockJSModuleGraph moduleGraph = new MockJSModuleGraph();
        MockJSTypeRegistry typeRegistry = new MockJSTypeRegistry();
        boolean codeChangeReported = false;

        @Override public CodingConvention getCodingConvention() { return codingConvention; }
        @Override public JSModuleGraph getModuleGraph() { return moduleGraph; }
        @Override public JSTypeRegistry getTypeRegistry() { return typeRegistry; }
        @Override public void reportCodeChange() { codeChangeReported = true; }

        @Override public Node getRoot() { return null; }
        @Override public CompilerOptions getOptions() { return null; }
        @Override public Result getResult() { return null; }
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public DiagnosticType getDefaultExterns() { return null; }
        @Override public SourceFile getSourceFile() { return null; }
        @Override public String getSourceLine() { return null; }
        @Override public int getSourceLineno() { return 0; }
    }

    static class MockCodingConvention extends CodingConvention {
        boolean exported = false;
        @Override public boolean isExported(String name) { return exported; }
    }

    static class MockJSModuleGraph extends JSModuleGraph {
        @Override public boolean dependsOn(JSModule a, JSModule b) { return true; }
    }

    static class MockJSTypeRegistry extends JSTypeRegistry {
        @Override public ObjectType getNativeObjectType(JSTypeNative type) { return null; }
        @Override public JSType createFunctionType(ObjectType thisType, JSType returnType, List<JSType> paramTypes) { return null; }
    }

    static class MockSimpleDefinitionFinder extends SimpleDefinitionFinder {
        private List<DefinitionSite> definitionSites = new ArrayList<>();
        private Map<Definition, Collection<UseSite>> useSitesMap = new HashMap<>();
        private Map<Node, Collection<Definition>> defsAtNodeMap = new HashMap<>();

        MockSimpleDefinitionFinder(AbstractCompiler compiler) {
            super(compiler);
        }

        void setDefinitionSites(List<DefinitionSite> sites) { definitionSites = sites; }
        void setUseSites(Definition def, Collection<UseSite> sites) { useSitesMap.put(def, sites); }
        void setDefinitionsAtNode(Node node, Collection<Definition> defs) { defsAtNodeMap.put(node, defs); }

        @Override public Collection<DefinitionSite> getDefinitionSites() { return definitionSites; }
        @Override public Collection<UseSite> getUseSites(Definition def) { return useSitesMap.get(def); }
        @Override public Collection<Definition> getDefinitionsReferencedAt(Node node) { return defsAtNodeMap.get(node); }
        @Override public void process(Node externs, Node root) { }
    }
}