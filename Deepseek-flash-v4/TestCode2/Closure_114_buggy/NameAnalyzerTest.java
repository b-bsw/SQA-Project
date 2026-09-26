package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import com.google.javascript.jscomp.NameAnalyzer.JsName; // cannot directly access private inner class
import com.google.javascript.jscomp.NameAnalyzer.RefNode;
import com.google.javascript.jscomp.NameAnalyzer.AliasSet;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;

public class NameAnalyzerTest {

    private NameAnalyzer analyzer;

    @Before
    public void setUp() throws Exception {
        analyzer = new NameAnalyzer(null, false);
    }

    // Helper methods
    private Object invokeMethod(String name, Class<?>[] paramTypes, Object... args) throws Exception {
        Method method = NameAnalyzer.class.getDeclaredMethod(name, paramTypes);
        method.setAccessible(true);
        return method.invoke(analyzer, args);
    }

    private Object getField(String name) throws Exception {
        Field field = NameAnalyzer.class.getDeclaredField(name);
        field.setAccessible(true);
        return field.get(analyzer);
    }

    private void setField(String name, Object value) throws Exception {
        Field field = NameAnalyzer.class.getDeclaredField(name);
        field.setAccessible(true);
        field.set(analyzer, value);
    }

    private Object getRefType(String name) throws Exception {
        Class<?> clazz = Class.forName("com.google.javascript.jscomp.NameAnalyzer$RefType");
        return Enum.valueOf((Class<Enum>) clazz, name);
    }

    private Object getTriState(String name) throws Exception {
        Class<?> clazz = Class.forName("com.google.javascript.jscomp.NameAnalyzer$TriState");
        return Enum.valueOf((Class<Enum>) clazz, name);
    }

    // Stub compiler for removeUnreferenced
    private static class StubCompiler extends AbstractCompiler {
        @Override
        public void reportCodeChange() {}
        @Override
        public CodingConvention getCodingConvention() {
            InvocationHandler handler = new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String mn = method.getName();
                    if (mn.equals("getClassesDefinedByCall")) return null;
                    if (mn.equals("getSingletonGetterClassName")) return null;
                    if (mn.equals("isExported")) return false;
                    throw new UnsupportedOperationException(mn);
                }
            };
            return (CodingConvention) Proxy.newProxyInstance(
                CodingConvention.class.getClassLoader(),
                new Class<?>[]{CodingConvention.class},
                handler);
        }
        @Override
        public SourceResolver getSourceResolver() { return null; }
        @Override
        public ErrorManager getErrorManager() { return null; }
        @Override
        public Node parseSyntheticCode(String code) { return null; }
        @Override
        public Node parseSourceFile(String filename) throws Exception { return null; }
        @Override
        public TypeRegistry getTypeRegistry() { return null; }
        @Override
        public ModuleGraph getModuleGraph() { return null; }
        @Override
        public String getSourceName() { return ""; }
        @Override
        public SourceFile getSourceFile(String name) { return null; }
        @Override
        public boolean hasErrors() { return false; }
        @Override
        public void reportChange() {}
        @Override
        public void report(JSError error) {}
        @Override
        public void reportWarning(JSError warning) {}
        @Override
        public void reportError(JSError error) {}
        @Override
        public boolean acceptSourceFile(String name) { return false; }
        @Override
        public void setSourceName(String name) {}
        @Override
        public Logger getLogger() { return null; }
        @Override
        public void setLogger(Logger logger) {}
    }

    // Tests
    @Test
    public void testGetNameNewAndExisting() throws Exception {
        // create new name
        Object nameObj = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "testName", true);
        assertNotNull("getName should return non-null", nameObj);
        // access name field via reflection since JsName is private
        Field nameField = nameObj.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        assertEquals("testName", nameField.get(nameObj));
        // verify stored in allNames
        Map<String, Object> allNames = (Map<String, Object>) getField("allNames");
        assertTrue(allNames.containsKey("testName"));
        // get existing
        Object same = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "testName", false);
        assertSame(nameObj, same);
    }

    @Test
    public void testRecordReference() throws Exception {
        Object regular = getRefType("REGULAR");
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a", true);
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "b", true);
        invokeMethod("recordReference", new Class<?>[]{String.class, String.class, regular.getClass()}, "a", "b", regular);
        DiGraph<Object, Object> graph = (DiGraph<Object, Object>) getField("referenceGraph");
        // check that edge exists by looking at outEdges of node a
        Object nodeA = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a", false);
        // getOutEdges requires node in graph, we can check by iterating
        List<?> outEdges = graph.getOutEdges(nodeA);
        assertEquals(1, outEdges.size());
    }

    @Test
    public void testRecordAlias() throws Exception {
        invokeMethod("recordAlias", new Class<?>[]{String.class, String.class}, "x", "y");
        Map<String, Object> aliases = (Map<String, Object>) getField("aliases");
        assertTrue(aliases.containsKey("x"));
        assertTrue(aliases.containsKey("y"));
        assertSame(aliases.get("x"), aliases.get("y"));
    }

    @Test
    public void testReferenceParentNames() throws Exception {
        // create name with dot
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a.b.c", true);
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a.b", true);
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a", true);
        // call referenceParentNames
        invokeMethod("referenceParentNames", new Class<?>[]{});
        DiGraph<Object, Object> graph = (DiGraph<Object, Object>) getField("referenceGraph");
        Object nodeAbc = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a.b.c", false);
        Object nodeAb = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a.b", false);
        Object nodeA = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a", false);
        // should have edges: abc -> ab, ab -> abc, ab -> a, a -> ab
        assertTrue(graph.isConnectedInDirection(nodeAbc, getRefType("REGULAR"), nodeAb));
        assertTrue(graph.isConnectedInDirection(nodeAb, getRefType("REGULAR"), nodeAbc));
        assertTrue(graph.isConnectedInDirection(nodeAb, getRefType("REGULAR"), nodeA));
        assertTrue(graph.isConnectedInDirection(nodeA, getRefType("REGULAR"), nodeAb));
    }

    @Test
    public void testReferenceAliases() throws Exception {
        // create name with hasWrittenDescendants
        Object target = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "target", true);
        Field writtenField = target.getClass().getDeclaredField("hasWrittenDescendants");
        writtenField.setAccessible(true);
        writtenField.setBoolean(target, true);
        // record alias
        invokeMethod("recordAlias", new Class<?>[]{String.class, String.class}, "alias", "target");
        invokeMethod("referenceAliases", new Class<?>[]{});
        DiGraph<Object, Object> graph = (DiGraph<Object, Object>) getField("referenceGraph");
        Object aliasNode = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "alias", false);
        Object targetNode = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "target", false);
        assertTrue(graph.isConnectedInDirection(aliasNode, getRefType("REGULAR"), targetNode));
    }

    @Test
    public void testCalculateReferences() throws Exception {
        // create window and Function names
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "window", true);
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "Function", true);
        Object other = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "other", true);
        // add reference from window to other
        invokeMethod("recordReference", new Class<?>[]{String.class, String.class, getRefType("REGULAR").getClass()}, "window", "other", getRefType("REGULAR"));
        invokeMethod("calculateReferences", new Class<?>[]{});
        Field referencedField = other.getClass().getDeclaredField("referenced");
        referencedField.setAccessible(true);
        assertTrue("other should be referenced after propagation", referencedField.getBoolean(other));
    }

    @Test
    public void testCountOf() throws Exception {
        Object classA = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "ClassA", true);
        Field protoField = classA.getClass().getDeclaredField("prototypeNames");
        protoField.setAccessible(true);
        ((List<String>) protoField.get(classA)).add("method");
        Field refField = classA.getClass().getDeclaredField("referenced");
        refField.setAccessible(true);
        refField.setBoolean(classA, true);
        Object funcB = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "funcB", true);
        Field refFieldB = funcB.getClass().getDeclaredField("referenced");
        refFieldB.setAccessible(true);
        refFieldB.setBoolean(funcB, false);
        Object both = getTriState("BOTH");
        Object trueTri = getTriState("TRUE");
        Object falseTri = getTriState("FALSE");
        int total = (Integer) invokeMethod("countOf", new Class<?>[]{both.getClass(), both.getClass()}, both, both);
        assertEquals(2, total);
        int classes = (Integer) invokeMethod("countOf", new Class<?>[]{trueTri.getClass(), both.getClass()}, trueTri, both);
        assertEquals(1, classes);
        int referencedFuncs = (Integer) invokeMethod("countOf", new Class<?>[]{falseTri.getClass(), trueTri.getClass()}, falseTri, trueTri);
        assertEquals(0, referencedFuncs);
    }

    @Test
    public void testGetHtmlReport() throws Exception {
        Object nameA = invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "a", true);
        Field protoField = nameA.getClass().getDeclaredField("prototypeNames");
        protoField.setAccessible(true);
        ((List<String>) protoField.get(nameA)).add("method");
        Field refField = nameA.getClass().getDeclaredField("referenced");
        refField.setAccessible(true);
        refField.setBoolean(nameA, true);
        invokeMethod("getName", new Class<?>[]{String.class, boolean.class}, "b", true);
        String report = analyzer.getHtmlReport();
        assertNotNull(report);
        assertTrue(report.contains("a"));
        assertTrue(report.contains("method"));
        assertTrue(report.contains("OVERALL STATS"));
    }

    @Test
    public void testRemoveUnreferencedEmpty() throws Exception {
        setField("compiler", new StubCompiler());
        List<RefNode> refNodes = (List<RefNode>) getField("refNodes");
        refNodes.clear();
        analyzer.removeUnreferenced();
        // should not throw
    }

    @Test
    public void testProcessNoExterns() throws Exception {
        // minimal test that process doesn't throw with empty nodes
        setField("compiler", new StubCompiler());
        Node externs = new Node(0); // EMPTY
        Node root = new Node(0);
        analyzer.process(externs, root);
        // no exception
    }
}