package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.javascript.jscomp.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.IR;

import java.lang.reflect.Field;
import java.util.*;

public class ProcessClosurePrimitivesTest {

    private StubCompiler compiler;
    private ProcessClosurePrimitives processor;
    private TestNodeTraversal t;
    private JSModule module;

    // ---------- stubs ----------
    static class StubCompiler extends AbstractCompiler {
        List<JSError> errors = new ArrayList<>();
        CodingConvention convention = new CodingConvention() {
            @Override public boolean isConstant(String name) { return false; }
            @Override public List<String> identifyTypeDeclarationCall(Node n) { return null; }
            @Override public void applyForCall(Node n, Node parent) {}
            @Override public boolean isExported(String name) { return false; }
            @Override public boolean isPrivate(String name) { return false; }
            @Override public String getExportPropertyFunction() { return null; }
            @Override public String getExportSymbolFunction() { return null; }
            @Override public String getGlobalObject() { return "window"; }
            @Override public SubclassRelationship getClassesImplementedByCall(Node n) { return null; }
            @Override public SubclassRelationship getObjectLiteralCase(Node n) { return null; }
            @Override public boolean isSuperCall(Node n) { return false; }
            @Override public boolean isSubclassCall(Node n) { return false; }
            @Override public SubclassType getSubclassType(Node n) { return null; }
            @Override public String getClassOrEnumName(Node n) { return null; }
            @Override public boolean isObjectLiteralCast(Node n) { return false; }
            @Override public String getInterfaceOfInstantiatedObject(Node n) { return null; }
            @Override public Collection<String> getIndirectlyDeclaredNames(Node n) { return Collections.emptyList(); }
            @Override public Collection<String> getKnownIndirectlyDeclaredNames(Node n) { return Collections.emptyList(); }
            @Override public boolean isValidPackageName(String name) { return true; }
            @Override public boolean isOptionalParameter(Node n) { return false; }
            @Override public boolean isVarArgsParameter(Node n) { return false; }
            @Override public boolean isUsedAsIndirectClassOrEnumName(Node n) { return false; }
            @Override public boolean isUsedAsForwardClassDeclaration(Node n) { return false; }
            @Override public boolean isAliasedClassName(Node n) { return false; }
            @Override public boolean isPromiseConstructor(Node n) { return false; }
            @Override public boolean isAsyncFunction(Node n) { return false; }
            @Override public boolean isAsyncGeneratorFunction(Node n) { return false; }
            @Override public boolean isGeneratorFunction(Node n) { return false; }
            @Override public boolean isInstanceOfCheck(Node n) { return false; }
            @Override public boolean isOptionalCall(Node n) { return false; }
            @Override public boolean isOptionalNew(Node n) { return false; }
            @Override public boolean isOptionalChain(Node n) { return false; }
            @Override public boolean isNullishCoalesce(Node n) { return false; }
            @Override public boolean isLogicalAssignment(Node n) { return false; }
        };
        JSModuleGraph moduleGraph = new JSModuleGraph() {
            @Override
            public JSModule getDeepestCommonDependencyInclusive(JSModule a, JSModule b) { return a; }
            @Override
            public boolean dependsOn(JSModule from, JSModule to) { return false; }
            @Override public JSModule getModuleForSourceNode(Node n) { return null; }
            @Override public List<JSModule> getModules() { return Collections.emptyList(); }
            @Override public JSModule getRootModule() { return null; }
            @Override public JSModule getSmallestModuleForSource(String src) { return null; }
            @Override public void removeModule(JSModule m) {}
            @Override public void addModule(JSModule m) {}
        };
        TypeRegistry typeRegistry = new TypeRegistry() {
            @Override public JSType createAnonymousObjectType(@Nullable JSType owner) { return null; }
            @Override public void forwardDeclareType(String type) {}
            @Override public JSType getNativeType(JSTypeNative type) { return null; }
            @Override public JSType getNativeObjectType(JSTypeNative type) { return null; }
            @Override public JSType getType(String name) { return null; }
            @Override public void registerType(JSType type, String name) {}
            @Override public void handleTypeDeclaration(String name, Node n) {}
            @Override public String getTypeNameFor(JSType type) { return ""; }
        };
        boolean codeChanged = false;

        @Override public void report(JSError error) { errors.add(error); }
        @Override public CodingConvention getCodingConvention() { return convention; }
        @Override public JSModuleGraph getModuleGraph() { return moduleGraph; }
        @Override public TypeRegistry getTypeRegistry() { return typeRegistry; }
        @Override public Node getNodeForCodeInsertion(JSModule module) { return new Node(Token.SCRIPT); }
        @Override public void setCssRenamingMap(CssRenamingMap map) { this.cssRenamingMap = map; }
        @Override public void reportCodeChange() { codeChanged = true; }
        @Override public String getSourceName() { return "test.js"; }
        @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
        @Override public boolean hasErrors() { return !errors.isEmpty(); }
        @Override public boolean hasWarnings() { return false; }
        @Override public boolean hasHaltingErrors() { return false; }
        @Override public boolean isTypeCheckingEnabled() { return false; }
        @Override public boolean isNormalized() { return false; }
        @Override public void setNormalized() {}
        @Override public boolean areDatastructuresEmpty() { return false; }
        @Override public void clearDatastructures() {}
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public SourceAst getSourceAst(String sourceName) { return null; }
        @Override public String getSourceLine(String sourceName, int lineNumber) { return null; }
        @Override public Region getSourceRegion(String sourceName) { return null; }
        @Override public CompilerInput getInput(String sourceName) { return null; }
        @Override public CompilerInput getInputById(String id) { return null; }
        @Override public CompilerInput getExternInput(String sourceName) { return null; }
        @Override public List<String> getSourceNames() { return Collections.emptyList(); }
        @Override public List<CompilerInput> getInputs() { return Collections.emptyList(); }
        @Override public List<CompilerInput> getExternInputs() { return Collections.emptyList(); }
        @Override public void addInput(CompilerInput input) {}
        @Override public void addExternInput(CompilerInput input) {}
        @Override public void removeInput(CompilerInput input) {}
        @Override public void clearInputs() {}
        @Override public void clearExternInputs() {}
        @Override public void setSourceMap(SourceMap sourceMap) {}
        @Override public SourceMap getSourceMap() { return null; }
        @Override public void setRunTimeState(RunTimeState state) {}
        @Override public RunTimeState getRunTimeState() { return null; }
        @Override public void setCssRenamingMap(CssRenamingMap map) {}
    }

    static class StubModule extends JSModule {
        String name;
        StubModule(String name) { this.name = name; }
        @Override public String getName() { return name; }
        @Override public List<CompilerInput> getInputs() { return Collections.emptyList(); }
        @Override public void addInput(CompilerInput input) {}
        @Override public void removeInput(CompilerInput input) {}
        @Override public void removeAll() {}
        @Override public boolean containsInput(CompilerInput input) { return false; }
        @Override public boolean isEmpty() { return true; }
    }

    static class TestNodeTraversal extends NodeTraversal {
        private JSModule module;
        private Node scopeRoot;
        private boolean globalScope = true;

        TestNodeTraversal(AbstractCompiler compiler, Node scopeRoot, JSModule module) {
            super(compiler, new AbstractPostOrderCallback() {
                @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            });
            this.module = module;
            this.scopeRoot = scopeRoot;
        }

        @Override public JSModule getModule() { return module; }
        @Override public Node getScopeRoot() { return scopeRoot; }
        @Override public String getSourceName() { return "test.js"; }
        @Override public boolean inGlobalScope() { return globalScope; }
        public void setGlobalScope(boolean b) { globalScope = b; }
    }

    // ---------- helper methods ----------
    @SuppressWarnings("unchecked")
    private Map<String, ProvidedName> getProvidedNames() {
        try {
            Field f = ProcessClosurePrimitives.class.getDeclaredField("providedNames");
            f.setAccessible(true);
            return (Map<String, ProvidedName>) f.get(processor);
        } catch (Exception e) {
            fail(e.getMessage());
            return null;
        }
    }

    private List<Node> getDefineCalls() {
        try {
            Field f = ProcessClosurePrimitives.class.getDeclaredField("defineCalls");
            f.setAccessible(true);
            return (List<Node>) f.get(processor);
        } catch (Exception e) {
            fail(e.getMessage());
            return null;
        }
    }

    private List<UnrecognizedRequire> getUnrecognizedRequires() {
        try {
            Field f = ProcessClosurePrimitives.class.getDeclaredField("unrecognizedRequires");
            f.setAccessible(true);
            return (List<UnrecognizedRequire>) f.get(processor);
        } catch (Exception e) {
            fail(e.getMessage());
            return null;
        }
    }

    private Set<String> getExportedVariables() {
        return processor.getExportedVariableNames();
    }

    @Before
    public void setUp() {
        compiler = new StubCompiler();
        processor = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
        module = new StubModule("testModule");
        Node scopeRoot = new Node(Token.SCRIPT);
        t = new TestNodeTraversal(compiler, scopeRoot, module);
    }

    // ---------- tests ----------
    @Test
    public void testConstructorCreatesGoogProvidedName() {
        Map<String, ProvidedName> names = getProvidedNames();
        assertTrue(names.containsKey("goog"));
        ProvidedName goog = names.get("goog");
        assertFalse(goog.isExplicitlyProvided());
    }

    @Test
    public void testExportSymbolAddsExportedVariable() {
        Node call = IR.call(
            IR.getprop(IR.name("goog"), IR.string("exportSymbol")),
            IR.string("foo.bar"));
        Node expr = IR.exprResult(call);
        processor.visit(t, call, expr);
        Set<String> exported = getExportedVariables();
        assertTrue(exported.contains("foo"));
        assertEquals(1, exported.size());
    }

    @Test
    public void testProvideCallAddsNamespace() {
        Node call = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("test.Foo"));
        Node exprResult = IR.exprResult(call);
        call.setSourceEncodedPosition(1);
        exprResult.setSourceEncodedPosition(1);
        processor.visit(t, call, exprResult);
        Map<String, ProvidedName> names = getProvidedNames();
        assertTrue(names.containsKey("test.Foo"));
        assertTrue(names.get("test.Foo").isExplicitlyProvided());
        assertTrue(names.containsKey("test"));
        assertFalse(names.get("test").isExplicitlyProvided());
        assertEquals(0, compiler.errors.size());
    }

    @Test
    public void testProvideDuplicateReportsError() {
        Node call1 = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("test.Foo"));
        Node expr1 = IR.exprResult(call1);
        Node call2 = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("test.Foo"));
        Node expr2 = IR.exprResult(call2);
        processor.visit(t, call1, expr1);
        processor.visit(t, call2, expr2);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testRequireCallUnknownAddsUnrecognized() {
        Node call = IR.call(
            IR.getprop(IR.name("goog"), IR.string("require")),
            IR.string("unknown.Namespace"));
        Node expr = IR.exprResult(call);
        call.setSourceEncodedPosition(1);
        expr.setSourceEncodedPosition(1);
        processor.visit(t, call, expr);
        List<UnrecognizedRequire> unrecognized = getUnrecognizedRequires();
        assertEquals(1, unrecognized.size());
        assertEquals("unknown.Namespace", unrecognized.get(0).namespace);
    }

    @Test
    public void testRequireCallWithProvidedNamespaceRemovesParent() {
        Node provideCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("already.Provided"));
        Node provideExpr = IR.exprResult(provideCall);
        provideCall.setSourceEncodedPosition(1);
        provideExpr.setSourceEncodedPosition(1);
        processor.visit(t, provideCall, provideExpr);
        Node requireCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("require")),
            IR.string("already.Provided"));
        Node requireExpr = IR.exprResult(requireCall);
        requireCall.setSourceEncodedPosition(1);
        requireExpr.setSourceEncodedPosition(1);
        processor.visit(t, requireCall, requireExpr);
        assertNull(requireExpr.getParent());
    }

    @Test
    public void testRequireCrossModuleReportsWarning() {
        JSModule module1 = new StubModule("module1");
        t = new TestNodeTraversal(compiler, new Node(Token.SCRIPT), module1);
        Node provideCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("some.Module"));
        Node provideExpr = IR.exprResult(provideCall);
        provideCall.setSourceEncodedPosition(1);
        provideExpr.setSourceEncodedPosition(1);
        processor.visit(t, provideCall, provideExpr);
        JSModule module2 = new StubModule("module2");
        t = new TestNodeTraversal(compiler, new Node(Token.SCRIPT), module2);
        Node requireCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("require")),
            IR.string("some.Module"));
        Node requireExpr = IR.exprResult(requireCall);
        requireCall.setSourceEncodedPosition(1);
        requireExpr.setSourceEncodedPosition(1);
        processor.visit(t, requireCall, requireExpr);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.XMODULE_REQUIRE_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testDefineCallValidAddsToDefineCalls() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordDefine();
        JSDocInfo info = builder.build(null);
        Node defineCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("define")),
            IR.string("MY_DEFINE"),
            IR.number(42));
        Node exprResult = IR.exprResult(defineCall);
        exprResult.setJSDocInfo(info);
        defineCall.setSourceEncodedPosition(1);
        exprResult.setSourceEncodedPosition(1);
        processor.visit(t, defineCall, exprResult);
        List<Node> defines = getDefineCalls();
        assertEquals(1, defines.size());
        assertEquals(defineCall, defines.get(0));
    }

    @Test
    public void testDefineCallMissingAnnotationReportsError() {
        Node defineCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("define")),
            IR.string("MY_DEFINE"),
            IR.number(42));
        Node exprResult = IR.exprResult(defineCall);
        defineCall.setSourceEncodedPosition(1);
        exprResult.setSourceEncodedPosition(1);
        processor.visit(t, defineCall, exprResult);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.MISSING_DEFINE_ANNOTATION, compiler.errors.get(0).getType());
    }

    @Test
    public void testBaseClassCallMissingThisReportsError() {
        Node baseCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("base")));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(baseCall);
        processor.visit(t, baseCall, parent);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testSetCssNameMappingNonObjectLiteralReportsError() {
        Node call = IR.call(
            IR.getprop(IR.name("goog"), IR.string("setCssNameMapping")),
            IR.string("notObject"));
        Node expr = IR.exprResult(call);
        processor.visit(t, call, expr);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.EXPECTED_OBJECTLIT_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testSetCssNameMappingByPartWithHyphenKeyReportsError() {
        Node objLit = IR.objectlit();
        Node key = Node.newString(Token.STRING_KEY, "foo-bar");
        key.addChildToBack(IR.string("value"));
        objLit.addChildToBack(key);
        Node call = IR.call(
            IR.getprop(IR.name("goog"), IR.string("setCssNameMapping")),
            objLit);
        Node expr = IR.exprResult(call);
        processor.visit(t, call, expr);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP, compiler.errors.get(0).getType());
    }

    @Test
    public void testFunctionNamespaceConflictReportsError() {
        Node provideCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("conflict.Func"));
        Node provideExpr = IR.exprResult(provideCall);
        provideCall.setSourceEncodedPosition(1);
        provideExpr.setSourceEncodedPosition(1);
        processor.visit(t, provideCall, provideExpr);
        Node fun = new Node(Token.FUNCTION);
        Node name = IR.name("conflict.Func");
        fun.addChildToFront(name);
        Node parent = new Node(Token.SCRIPT);
        parent.addChildToBack(fun);
        processor.visit(t, fun, parent);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testProvideInvalidIdentifierReportsError() {
        Node call = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("invalid.id-"));
        Node expr = IR.exprResult(call);
        call.setSourceEncodedPosition(1);
        expr.setSourceEncodedPosition(1);
        processor.visit(t, call, expr);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.INVALID_PROVIDE_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testGoogBaseUsedAsPropertyReportsError() {
        Node getProp = IR.getprop(IR.name("goog"), IR.string("base"));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(getProp);
        processor.visit(t, getProp, parent);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testProcessReportsMissingForUnrecognizedRequire() {
        Node requireCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("require")),
            IR.string("missing.Namespace"));
        Node requireExpr = IR.exprResult(requireCall);
        requireCall.setSourceEncodedPosition(1);
        requireExpr.setSourceEncodedPosition(1);
        processor.visit(t, requireCall, requireExpr);
        Node root = new Node(Token.SCRIPT);
        processor.process(null, root);
        assertEquals(1, compiler.errors.size());
        assertEquals(ProcessClosurePrimitives.MISSING_PROVIDE_ERROR, compiler.errors.get(0).getType());
    }

    @Test
    public void testRegisterPrefixes() {
        Node call = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("a.b.c"));
        Node expr = IR.exprResult(call);
        call.setSourceEncodedPosition(1);
        expr.setSourceEncodedPosition(1);
        processor.visit(t, call, expr);
        Map<String, ProvidedName> names = getProvidedNames();
        assertTrue(names.containsKey("a"));
        assertTrue(names.containsKey("a.b"));
        assertTrue(names.containsKey("a.b.c"));
        assertFalse(names.get("a").isExplicitlyProvided());
        assertFalse(names.get("a.b").isExplicitlyProvided());
        assertTrue(names.get("a.b.c").isExplicitlyProvided());
    }

    @Test
    public void testExportedVariablesInitiallyEmpty() {
        assertTrue(getExportedVariables().isEmpty());
    }

    @Test
    public void testProcessReplacesNamespaceWithDefinition() {
        Node provideCall = IR.call(
            IR.getprop(IR.name("goog"), IR.string("provide")),
            IR.string("test.Replaced"));
        Node provideExpr = IR.exprResult(provideCall);
        provideCall.setSourceEncodedPosition(1);
        provideExpr.setSourceEncodedPosition(1);
        processor.visit(t, provideCall, provideExpr);
        Node assign = IR.assign(IR.name("test.Replaced"), IR.objectlit());
        Node defExpr = IR.exprResult(assign);
        defExpr.setSourceEncodedPosition(1);
        processor.visit(t, assign, defExpr);
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(provideExpr);
        root.addChildToBack(defExpr);
        processor.process(null, root);
        assertTrue(compiler.codeChanged);
        assertNull(provideExpr.getParent());
    }

    @Test
    public void testHotSwapScriptDelegatesToProcess() {
        Node scriptRoot = new Node(Token.SCRIPT);
        Node originalRoot = new Node(Token.SCRIPT);
        processor.hotSwapScript(scriptRoot, originalRoot);
        assertTrue(compiler.codeChanged); // process called
    }
}