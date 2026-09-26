package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import java.util.*;

public class AnalyzePrototypePropertiesTest {

    // ---------- Mock implementations ----------

    private static class MockCodingConvention implements CodingConvention {
        @Override public boolean isExported(String name) { return false; }
        @Override public boolean isConstant(String name) { return false; }
        @Override public boolean isExported(String name, boolean local) { return false; }
        @Override public boolean isExported(Node nameNode) { return false; }
        @Override public String getVarNameForImplicitGet() { return null; }
        @Override public String identifyTypeDeclaration(Node n) { return null; }
        @Override public String identifyTypeDeclaration(Node n, Node parent) { return null; }
        @Override public SubclassType getSubclassType(Node n) { return null; }
        @Override public String getSingletonGetterClassName(Node callNode) { return null; }
        @Override public boolean isOptionalParameter(Node parameter) { return false; }
        @Override public boolean isVarArgsParameter(Node parameter) { return false; }
        @Override public String exportSymbolAlias(String name) { return null; }
        @Override public boolean isEnumKey(Node nameNode) { return false; }
        @Override public boolean isEnum(Node typeNode) { return false; }
        @Override public boolean isConstantOrdinalValue(Node nameNode) { return false; }
        @Override public boolean isConstantSymbol(String name) { return false; }
        @Override public boolean isPrivate(String name) { return false; }
    }

    private static class MockCompiler extends AbstractCompiler {
        private CodingConvention cc = new MockCodingConvention();
        private Map<Node, JSModule> moduleMap = new HashMap<>();
        void setModuleForNode(Node n, JSModule m) { moduleMap.put(n, m); }
        @Override public CodingConvention getCodingConvention() { return cc; }
        @Override public JSModule getModuleForNode(Node n) { return moduleMap.get(n); }
        @Override public void report(JSError error) {}
        @Override public boolean hasHaltingErrors() { return false; }
        @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.OFF; }
        @Override public boolean hasErrors() { return false; }
        @Override public boolean hasWarnings() { return false; }
        @Override public JSError makeError(Node n, int type, String key, Object... args) { return null; }
        @Override public JSError makeError(Node n, String messageId, String message, Object... args) { return null; }
        @Override public JSError makeWarning(Node n, int type, String messageId, String message, Object... args) { return null; }
        @Override public JSError makeWarning(Node n, int type, String messageId, String message) { return null; }
        @Override public void addToDebugLog(String message) {}
        @Override public String getLog() { return ""; }
        @Override public SourceFile getSourceFile(String name) { return null; }
        @Override public SourceFile getSourceFileByPath(String path) { return null; }
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public String parseUnknown(String js) { return null; }
        @Override public Node parseSyntheticCode(String js) { return null; }
        @Override public Node parseSyntheticCode(String sourceName, String js) { return null; }
        @Override public Node parseCode(String js) { return null; }
        @Override public Node parseCode(SourceFile sourceFile) { return null; }
        @Override public Node parseCode(String sourceName, String js) { return null; }
    }

    private static class MockJSModule extends JSModule {
        private String name;
        private List<JSModule> deps = new ArrayList<>();
        MockJSModule(String name) { super(name); this.name = name; }
        void addDepend(JSModule m) { deps.add(m); }
        @Override public String getName() { return name; }
        @Override public List<JSModule> getDependencies() { return deps; }
        @Override public boolean equals(Object o) { return o instanceof MockJSModule && ((MockJSModule)o).name.equals(name); }
        @Override public int hashCode() { return name.hashCode(); }
    }

    private static class MockJSModuleGraph extends JSModuleGraph {
        private JSModule root;
        private List<JSModule> allModules;
        MockJSModuleGraph(JSModule root, List<JSModule> allModules) { this.root = root; this.allModules = allModules; }
        @Override public JSModule getRootModule() { return root; }
        @Override public List<JSModule> getAllModules() { return allModules; }
        @Override public JSModule getDeepestCommonDependencyInclusive(JSModule a, JSModule b) {
            if (dependsOn(a, b)) return a;
            if (dependsOn(b, a)) return b;
            return root;
        }
        @Override public boolean dependsOn(JSModule src, JSModule dest) { return src.getDependencies().contains(dest); }
    }

    private static class MockLinkedDirectedGraph extends LinkedDirectedGraph<AnalyzePrototypeProperties.NameInfo, JSModule> {
        private Set<AnalyzePrototypeProperties.NameInfo> nodes = new HashSet<>();
        private Map<AnalyzePrototypeProperties.NameInfo, Map<AnalyzePrototypeProperties.NameInfo, JSModule>> edges = new HashMap<>();
        static MockLinkedDirectedGraph createWithoutAnnotations() { return new MockLinkedDirectedGraph(); }
        @Override public void createNode(AnalyzePrototypeProperties.NameInfo node) { nodes.add(node); }
        @Override public void connect(AnalyzePrototypeProperties.NameInfo src, JSModule edge, AnalyzePrototypeProperties.NameInfo dest) {
            edges.computeIfAbsent(src, k -> new HashMap<>()).put(dest, edge);
        }
        @Override public Collection<JSModule> getEdges(AnalyzePrototypeProperties.NameInfo src, AnalyzePrototypeProperties.NameInfo dest) {
            JSModule m = edges.getOrDefault(src, Collections.emptyMap()).get(dest);
            return m == null ? Collections.emptyList() : Collections.singleton(m);
        }
        @Override public Collection<AnalyzePrototypeProperties.NameInfo> getNodes() { return nodes; }
        @Override public boolean hasNode(AnalyzePrototypeProperties.NameInfo node) { return nodes.contains(node); }
    }

    private static class MockFixedPointGraphTraversal extends FixedPointGraphTraversal<AnalyzePrototypeProperties.NameInfo, JSModule> {
        private EdgeCallback<AnalyzePrototypeProperties.NameInfo, JSModule> callback;
        MockFixedPointGraphTraversal(EdgeCallback<AnalyzePrototypeProperties.NameInfo, JSModule> cb) { this.callback = cb; }
        @Override public void computeFixedPoint(LinkedDirectedGraph<AnalyzePrototypeProperties.NameInfo, JSModule> graph, Set<AnalyzePrototypeProperties.NameInfo> roots) {
            MockLinkedDirectedGraph mg = (MockLinkedDirectedGraph) graph;
            Set<AnalyzePrototypeProperties.NameInfo> visited = new HashSet<>();
            Deque<AnalyzePrototypeProperties.NameInfo> queue = new ArrayDeque<>(roots);
            while (!queue.isEmpty()) {
                AnalyzePrototypeProperties.NameInfo cur = queue.poll();
                if (!visited.add(cur)) continue;
                Map<AnalyzePrototypeProperties.NameInfo, JSModule> out = mg.edges.get(cur);
                if (out != null) {
                    for (Map.Entry<AnalyzePrototypeProperties.NameInfo, JSModule> e : out.entrySet()) {
                        if (callback.traverseEdge(cur, e.getValue(), e.getKey())) {
                            queue.add(e.getKey());
                        }
                    }
                }
            }
        }
    }

    // ---------- Fixture ----------

    private MockCompiler compiler;
    private MockJSModuleGraph moduleGraph;
    private MockJSModule module1, module2;
    private AnalyzePrototypeProperties analyzer;

    private AnalyzePrototypeProperties createAnalyzer(boolean canModifyExterns, boolean anchorUnusedVars) {
        return new AnalyzePrototypeProperties(compiler, moduleGraph, canModifyExterns, anchorUnusedVars);
    }

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        module1 = new MockJSModule("m1");
        module2 = new MockJSModule("m2");
        module2.addDepend(module1);
        List<JSModule> all = Arrays.asList(module1, module2);
        moduleGraph = new MockJSModuleGraph(module1, all);
    }

    // ---------- Tests ----------

    @Test
    public void testProcessWithGetProp() {
        analyzer = createAnalyzer(false, false);
        Node root = new Node(Token.BLOCK);
        Node getProp = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "obj");
        Node prop = Node.newString(Token.STRING, "myProp");
        getProp.addChildToFront(obj);
        getProp.addChildToBack(prop);
        root.addChildToBack(getProp);
        compiler.setModuleForNode(root, module1);
        Node externRoot = new Node(Token.BLOCK);
        analyzer.process(externRoot, root);
        Collection<AnalyzePrototypeProperties.NameInfo> infos = analyzer.getAllNameInfo();
        AnalyzePrototypeProperties.NameInfo info = null;
        for (AnalyzePrototypeProperties.NameInfo i : infos)
            if ("myProp".equals(i.name)) { info = i; break; }
        assertNotNull("myProp NameInfo should exist", info);
        assertTrue("myProp should be referenced", info.isReferenced());
    }

    @Test
    public void testProcessWithObjectLiteral() {
        analyzer = createAnalyzer(false, false);
        Node root = new Node(Token.BLOCK);
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "x");
        Node objLit = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING, "a");
        Node val1 = new Node(Token.NUMBER);
        Node key2 = Node.newString(Token.STRING, "b");
        Node val2 = new Node(Token.NUMBER);
        key1.addChildToBack(val1);
        key2.addChildToBack(val2);
        objLit.addChildToBack(key1);
        objLit.addChildToBack(key2);
        assign.addChildToFront(name);
        assign.addChildToBack(objLit);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToFront(assign);
        root.addChildToBack(exprResult);
        compiler.setModuleForNode(root, module1);
        Node externRoot = new Node(Token.BLOCK);
        analyzer.process(externRoot, root);
        Collection<AnalyzePrototypeProperties.NameInfo> infos = analyzer.getAllNameInfo();
        boolean foundA = false, foundB = false;
        for (AnalyzePrototypeProperties.NameInfo i : infos) {
            if ("a".equals(i.name)) foundA = true;
            if ("b".equals(i.name)) foundB = true;
        }
        assertTrue("a NameInfo created", foundA);
        assertTrue("b NameInfo created", foundB);
    }

    @Test
    public void testProcessWithGlobalFunctionDeclaration() {
        analyzer = createAnalyzer(false, false);
        Node root = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR);
        Node fnName = Node.newString(Token.NAME, "foo");
        Node func = new Node(Token.FUNCTION);
        varNode.addChildToFront(fnName);
        fnName.addChildToBack(func);
        root.addChildToBack(varNode);
        compiler.setModuleForNode(root, module1);
        Node externRoot = new Node(Token.BLOCK);
        analyzer.process(externRoot, root);
        Collection<AnalyzePrototypeProperties.NameInfo> infos = analyzer.getAllNameInfo();
        AnalyzePrototypeProperties.NameInfo fooInfo = null;
        for (AnalyzePrototypeProperties.NameInfo i : infos)
            if ("foo".equals(i.name)) { fooInfo = i; break; }
        assertNotNull("foo NameInfo should exist", fooInfo);
        assertEquals(1, fooInfo.getDeclarations().size());
    }

    @Test
    public void testProcessWithPrototypePropertyAssign() {
        analyzer = createAnalyzer(false, false);
        Node root = new Node(Token.BLOCK);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        Node getProp2 = new Node(Token.GETPROP);
        Node name = Node.newString(Token.NAME, "Foo");
        Node protoStr = Node.newString(Token.STRING, "prototype");
        Node barStr = Node.newString(Token.STRING, "bar");
        Node func = new Node(Token.FUNCTION);
        getProp2.addChildToFront(name);
        getProp2.addChildToBack(protoStr);
        getProp.addChildToFront(getProp2);
        getProp.addChildToBack(barStr);
        assign.addChildToFront(getProp);
        assign.addChildToBack(func);
        exprResult.addChildToFront(assign);
        root.addChildToBack(exprResult);
        compiler.setModuleForNode(root, module1);
        Node externRoot = new Node(Token.BLOCK);
        analyzer.process(externRoot, root);
        Collection<AnalyzePrototypeProperties.NameInfo> infos = analyzer.getAllNameInfo();
        AnalyzePrototypeProperties.NameInfo barInfo = null;
        for (AnalyzePrototypeProperties.NameInfo i : infos)
            if ("bar".equals(i.name)) { barInfo = i; break; }
        assertNotNull("bar NameInfo should exist", barInfo);
        assertEquals(1, barInfo.getDeclarations().size());
        AnalyzePrototypeProperties.Symbol sym = barInfo.getDeclarations().peekFirst();
        assertTrue(sym instanceof AnalyzePrototypeProperties.AssignmentProperty);
        AnalyzePrototypeProperties.AssignmentProperty ap = (AnalyzePrototypeProperties.AssignmentProperty) sym;
        ap.remove();
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testProcessWithLiteralPropertyAssign() {
        analyzer = createAnalyzer(false, false);
        Node root = new Node(Token.BLOCK);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        Node name = Node.newString(Token.NAME, "Foo");
        Node protoStr = Node.newString(Token.STRING, "prototype");
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "myMethod");
        Node func = new Node(Token.FUNCTION);
        key.addChildToBack(func);
        objLit.addChildToBack(key);
        getProp.addChildToFront(name);
        getProp.addChildToBack(protoStr);
        assign.addChildToFront(getProp);
        assign.addChildToBack(objLit);
        exprResult.addChildToFront(assign);
        root.addChildToBack(exprResult);
        compiler.setModuleForNode(root, module1);
        Node externRoot = new Node(Token.BLOCK);
        analyzer.process(externRoot, root);
        Collection<AnalyzePrototypeProperties.NameInfo> infos = analyzer.getAllNameInfo();
        boolean foundMethod = false;
        for (AnalyzePrototypeProperties.NameInfo i : infos)
            if ("myMethod".equals(i.name)) { foundMethod = true; break; }
        assertTrue("myMethod NameInfo created", foundMethod);
        AnalyzePrototypeProperties.NameInfo methodInfo = null;
        for (AnalyzePrototypeProperties.NameInfo i : infos)
            if ("myMethod".equals(i.name)) { methodInfo = i; break; }
        assertNotNull(methodInfo);
        assertEquals(1, methodInfo.getDeclarations().size());
        AnalyzePrototypeProperties.Symbol sym = methodInfo.getDeclarations().peekFirst();
        assertTrue(sym instanceof AnalyzePrototypeProperties.LiteralProperty);
        AnalyzePrototypeProperties.LiteralProperty lp = (AnalyzePrototypeProperties.LiteralProperty) sym;
        lp.remove();
        assertEquals(0, objLit.getChildCount());
    }

    @Test
    public void testNameInfoMarkReference() {
        analyzer = createAnalyzer(false, false);
        AnalyzePrototypeProperties.NameInfo info = analyzer.new NameInfo("test");
        assertFalse(info.isReferenced());
        assertNull(info.getDeepestCommonModuleRef());
        info.markReference(module1);
        assertTrue(info.isReferenced());
        assertEquals(module1, info.getDeepestCommonModuleRef());
        info.markReference(module2);
        assertEquals(module1, info.getDeepestCommonModuleRef());
    }

    @Test
    public void testGlobalFunctionRemove() {
        analyzer = createAnalyzer(false, false);
        Node root = new Node(Token.BLOCK);
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "foo");
        func.addChildToFront(name);
        root.addChildToFront(func);
        AnalyzePrototypeProperties.GlobalFunction gf = analyzer.new GlobalFunction(name, func, root, module1);
        assertEquals(1, root.getChildCount());
        gf.remove();
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testAssignmentPropertyRemove() {
        analyzer = createAnalyzer(false, false);
        Node root = new Node(Token.BLOCK);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        exprResult.addChildToFront(assign);
        root.addChildToBack(exprResult);
        AnalyzePrototypeProperties.AssignmentProperty ap = analyzer.new AssignmentProperty(exprResult, module1);
        assertEquals(1, root.getChildCount());
        ap.remove();
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testLiteralPropertyRemove() {
        analyzer = createAnalyzer(false, false);
        Node key = Node.newString(Token.STRING, "prop");
        Node val = new Node(Token.NUMBER);
        Node map = new Node(Token.OBJECTLIT);
        Node assign = new Node(Token.ASSIGN);
        key.addChildToBack(val);
        map.addChildToBack(key);
        assign.addChildToBack(map);
        AnalyzePrototypeProperties.LiteralProperty lp = analyzer.new LiteralProperty(key, val, map, assign, module1);
        assertEquals(1, map.getChildCount());
        lp.remove();
        assertEquals(0, map.getChildCount());
    }
}