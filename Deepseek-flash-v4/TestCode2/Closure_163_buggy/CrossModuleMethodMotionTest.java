package com.google.javascript.jscomp;

import com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.Property;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CrossModuleMethodMotionTest {

    // ---------- Stub classes ----------
    static class StubNode extends Node {
        private boolean func;
        private boolean getterDef;
        private boolean setterDef;
        private Node parentNode;
        private List<Node> children = new ArrayList<>();

        StubNode(boolean func, boolean getter, boolean setter) {
            super(0);
            this.func = func;
            this.getterDef = getter;
            this.setterDef = setter;
        }

        @Override public boolean isFunction() { return func; }
        @Override public Node getParent() { return parentNode; }
        public void setParent(Node p) { parentNode = p; }
        @Override public boolean isGetterDef() { return getterDef; }
        @Override public boolean isSetterDef() { return setterDef; }
        @Override public void addChildToFront(Node child) { children.add(0, child); }
        @Override public void replaceChild(Node oldChild, Node newChild) {
            int idx = children.indexOf(oldChild);
            if (idx >= 0) children.set(idx, newChild);
        }
        @Override public Node cloneTree() {
            StubNode clone = new StubNode(func, getterDef, setterDef);
            clone.children = new ArrayList<>(children);
            clone.parentNode = parentNode;
            return clone;
        }
        @Override public Node removeChildren() {
            Node first = children.isEmpty() ? null : children.get(0);
            children.clear();
            return first;
        }
        @Override public void putBooleanProp(int key, boolean value) {}
        @Override public Node copyInformationFromForTree(Node other) { return this; }
    }

    static class StubNameInfo extends NameInfo {
        public String name;
        private boolean referenced;
        private boolean readsClosure;
        private JSModule deepestRef;
        private NavigableSet<Symbol> declarations;

        StubNameInfo(String name, boolean ref, boolean reads, JSModule deepest, NavigableSet<Symbol> decls) {
            this.name = name;
            this.referenced = ref;
            this.readsClosure = reads;
            this.deepestRef = deepest;
            this.declarations = decls;
        }

        @Override public boolean isReferenced() { return referenced; }
        @Override public boolean readsClosureVariables() { return readsClosure; }
        @Override public JSModule getDeepestCommonModuleRef() { return deepestRef; }
        @Override public NavigableSet<Symbol> getDeclarations() { return declarations; }
    }

    static class StubProperty extends Property {
        private Node value;
        private JSModule module;
        private Node prototype;

        StubProperty(Node v, JSModule m, Node p) {
            this.value = v;
            this.module = m;
            this.prototype = p;
        }

        @Override public Node getValue() { return value; }
        @Override public JSModule getModule() { return module; }
        @Override public Node getPrototype() { return prototype; }
    }

    static class StubModuleGraph extends JSModuleGraph {
        int count;
        boolean dependsOnResult;

        StubModuleGraph(int c, boolean d) { count = c; dependsOnResult = d; }

        @Override public int getModuleCount() { return count; }
        @Override public boolean dependsOn(JSModule a, JSModule b) { return dependsOnResult; }
        @Override public JSModule getRootModule() { return null; }
        @Override public Collection<JSModule> getModules() { return Collections.emptyList(); }
        @Override public JSModule getModuleByName(String name) { return null; }
        @Override public Iterator<JSModule> iterator() { return Collections.emptyIterator(); }
    }

    static class StubAnalyzer extends AnalyzePrototypeProperties {
        Collection<NameInfo> nameInfos;

        StubAnalyzer(AbstractCompiler compiler, JSModuleGraph graph, boolean canModify, boolean frozen) {
            super(compiler, graph, canModify, frozen);
        }

        @Override public void process(Node externRoot, Node root) {}
        @Override public Collection<NameInfo> getAllNameInfo() { return nameInfos; }
    }

    static class StubCompiler extends AbstractCompiler {
        JSModuleGraph moduleGraph;
        Node codeInsertionNode;
        Node syntheticCodeResult;
        boolean codeChangeReported;
        JSError lastError;
        String syntheticCodeInput;

        @Override public JSModuleGraph getModuleGraph() { return moduleGraph; }
        @Override public Node getNodeForCodeInsertion(JSModule module) { return codeInsertionNode; }
        @Override public Node parseSyntheticCode(String code) {
            syntheticCodeInput = code;
            return syntheticCodeResult;
        }
        @Override public void reportCodeChange() { codeChangeReported = true; }
        @Override public void report(JSError error) { lastError = error; }

        // remaining abstract methods – default implementations
        @Override public void report(JSError... errors) {}
        @Override public void reportChangeToEnclosingScope(Node n) {}
        @Override public void reportChangeToScope(Node n) {}
        @Override public void reportFunctionDeleted(Node n) {}
        @Override public CompilerOptions getOptions() { return null; }
        @Override public String toSource(Node n) { return null; }
        @Override public Node getRoot() { return null; }
        @Override public CodingConvention getCodingConvention() { return null; }
        @Override public void setCodingConvention(CodingConvention convention) {}
        @Override public void setErrorManager(MessageFormatter formatter) {}
        @Override public void setOptions(CompilerOptions options) {}
        @Override public Logger getLogger() { return Logger.getLogger("test"); }
        @Override public void reportChangeToScope(Scope scope) {}
        @Override public void reportChangeToEnclosingScope(Scope scope) {}
    }

    // ---------- Tests ----------
    @Test
    public void testNullModuleGraph() {
        StubCompiler compiler = new StubCompiler();
        compiler.moduleGraph = null;
        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, new CrossModuleMethodMotion.IdGenerator(), true);
        pass.process(null, null);
        assertFalse(compiler.codeChangeReported);
        assertNull(compiler.lastError);
    }

    @Test
    public void testSingleModule() {
        StubCompiler compiler = new StubCompiler();
        StubModuleGraph graph = new StubModuleGraph(1, true);
        compiler.moduleGraph = graph;
        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, new CrossModuleMethodMotion.IdGenerator(), true);
        pass.process(null, null);
        assertFalse(compiler.codeChangeReported);
    }

    @Test
    public void testUnreferencedNameInfo() throws Exception {
        StubCompiler compiler = new StubCompiler();
        StubModuleGraph graph = new StubModuleGraph(2, true);
        compiler.moduleGraph = graph;

        StubNameInfo nameInfo = new StubNameInfo("x", false, false, null, new TreeSet<Symbol>());
        List<NameInfo> list = Collections.singletonList(nameInfo);

        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, new CrossModuleMethodMotion.IdGenerator(), true);
        replaceAnalyzer(pass, compiler, graph, list);

        pass.process(null, null);
        assertFalse(compiler.codeChangeReported);
        assertNull(compiler.lastError);
    }

    @Test
    public void testReadsClosureVariables() throws Exception {
        StubCompiler compiler = new StubCompiler();
        StubModuleGraph graph = new StubModuleGraph(2, true);
        compiler.moduleGraph = graph;

        StubNameInfo nameInfo = new StubNameInfo("x", true, true, null, new TreeSet<Symbol>());
        List<NameInfo> list = Collections.singletonList(nameInfo);

        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, new CrossModuleMethodMotion.IdGenerator(), true);
        replaceAnalyzer(pass, compiler, graph, list);

        pass.process(null, null);
        assertFalse(compiler.codeChangeReported);
        assertNull(compiler.lastError);
    }

    @Test
    public void testDeepestCommonModuleRefNull() throws Exception {
        StubCompiler compiler = new StubCompiler();
        StubModuleGraph graph = new StubModuleGraph(2, true);
        compiler.moduleGraph = graph;

        StubNameInfo nameInfo = new StubNameInfo("x", true, false, null, new TreeSet<Symbol>());
        List<NameInfo> list = Collections.singletonList(nameInfo);

        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, new CrossModuleMethodMotion.IdGenerator(), true);
        replaceAnalyzer(pass, compiler, graph, list);

        pass.process(null, null);
        assertNotNull(compiler.lastError);
        assertFalse(compiler.codeChangeReported);
    }

    @Test
    public void testNonFunctionProperty() throws Exception {
        StubCompiler compiler = new StubCompiler();
        StubModuleGraph graph = new StubModuleGraph(2, true);
        compiler.moduleGraph = graph;

        StubNode valueNode = new StubNode(false, false, false); // not function
        JSModule deepModule = new JSModule("deep");
        JSModule propModule = new JSModule("prop");
        StubNode protoNode = new StubNode(false, false, false);
        StubProperty prop = new StubProperty(valueNode, propModule, protoNode);

        TreeSet<Symbol> decls = new TreeSet<>();
        decls.add(prop);
        StubNameInfo nameInfo = new StubNameInfo("x", true, false, deepModule, decls);
        List<NameInfo> list = Collections.singletonList(nameInfo);

        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, new CrossModuleMethodMotion.IdGenerator(), true);
        replaceAnalyzer(pass, compiler, graph, list);

        pass.process(null, null);
        assertFalse(compiler.codeChangeReported);
        assertNull(compiler.lastError);
    }

    @Test
    public void testGetterSetterProperty() throws Exception {
        StubCompiler compiler = new StubCompiler();
        StubModuleGraph graph = new StubModuleGraph(2, true);
        compiler.moduleGraph = graph;

        // getter
        StubNode valueNode = new StubNode(true, true, false); // function and getter
        JSModule deepModule = new JSModule("deep");
        JSModule propModule = new JSModule("prop");
        StubNode protoNode = new StubNode(false, false, false);
        StubProperty prop = new StubProperty(valueNode, propModule, protoNode);

        TreeSet<Symbol> decls = new TreeSet<>();
        decls.add(prop);
        StubNameInfo nameInfo = new StubNameInfo("x", true, false, deepModule, decls);
        List<NameInfo> list = Collections.singletonList(nameInfo);

        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, new CrossModuleMethodMotion.IdGenerator(), true);
        replaceAnalyzer(pass, compiler, graph, list);

        pass.process(null, null);
        assertFalse(compiler.codeChangeReported);
        assertNull(compiler.lastError);
    }

    @Test
    public void testValidMoveMethod() throws Exception {
        StubCompiler compiler = new StubCompiler();
        StubModuleGraph graph = new StubModuleGraph(2, true);
        compiler.moduleGraph = graph;

        StubNode funcNode = new StubNode(true, false, false); // isFunction=true, not getter/setter
        JSModule deepModule = new JSModule("deep");
        JSModule propModule = new JSModule("prop");
        StubNode protoNode = new StubNode(false, false, false);
        StubProperty prop = new StubProperty(funcNode, propModule, protoNode);

        TreeSet<Symbol> decls = new TreeSet<>();
        decls.add(prop);
        StubNameInfo nameInfo = new StubNameInfo("MyClass.prototype.method", true, false, deepModule, decls);
        List<NameInfo> list = Collections.singletonList(nameInfo);

        // code insertion target
        StubNode codeTarget = new StubNode(false, false, false);
        compiler.codeInsertionNode = codeTarget;

        // synthetic code root for stub declarations
        StubNode synthRoot = new StubNode(false, false, false);
        synthRoot.addChildToFront(new StubNode(false, false, false));
        compiler.syntheticCodeResult = synthRoot;

        CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();

        CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, true);
        replaceAnalyzer(pass, compiler, graph, list);

        pass.process(null, null);

        assertTrue(compiler.codeChangeReported);
        assertNull(compiler.lastError);
        assertTrue(idGen.hasGeneratedAnyIds());
        assertEquals(CrossModuleMethodMotion.STUB_DECLARATIONS, compiler.syntheticCodeInput);
    }

    @Test
    public void testIdGeneratorInitiallyNoIds() {
        CrossModuleMethodMotion.IdGenerator gen = new CrossModuleMethodMotion.IdGenerator();
        assertFalse(gen.hasGeneratedAnyIds());
    }

    @Test
    public void testIdGeneratorAfterNewId() {
        CrossModuleMethodMotion.IdGenerator gen = new CrossModuleMethodMotion.IdGenerator();
        gen.newId();
        assertTrue(gen.hasGeneratedAnyIds());
        int nextId = gen.newId();
        assertEquals(1, nextId);
    }

    // ---------- Helper ----------
    private void replaceAnalyzer(CrossModuleMethodMotion pass, AbstractCompiler compiler,
                                 JSModuleGraph graph, Collection<NameInfo> nameInfos) throws Exception {
        Field analyzerField = CrossModuleMethodMotion.class.getDeclaredField("analyzer");
        analyzerField.setAccessible(true);
        StubAnalyzer stub = new StubAnalyzer(compiler, graph, true, false);
        stub.nameInfos = nameInfos;
        analyzerField.set(pass, stub);
    }
}