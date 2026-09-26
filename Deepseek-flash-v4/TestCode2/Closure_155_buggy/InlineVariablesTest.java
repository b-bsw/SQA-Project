package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.lang.reflect.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class InlineVariablesTest {

    private static class StubAbstractCompiler extends AbstractCompiler {
        private CodingConvention codingConvention = new StubCodingConvention();
        boolean reportCodeChangeCalled = false;

        @Override public CodingConvention getCodingConvention() { return codingConvention; }
        @Override public void reportCodeChange() { reportCodeChangeCalled = true; }
        @Override public CompilerOptions getOptions() { throw new UnsupportedOperationException(); }
        @Override public void report(JSError error) { }
        @Override public void reportChangeToEnclosingScope(Node n) { }
        @Override public Node getRoot() { return null; }
        @Override public Scope getTopScope() { return null; }
        @Override public JSModuleGraph getModuleGraph() { return null; }
    }

    private static class StubCodingConvention implements CodingConvention {
        @Override public boolean isExported(String name) { return name.startsWith("exported"); }
        @Override public String getSingletonGetterClassName(Call callNode) { return null; }
        @Override public void applySubclassRelationship(FunctionType parentCtor, FunctionType childCtor, SubclassType type) {}
        @Override public String getClassesDefinedByCall(Call callNode) { return null; }
        @Override public SubclassRelationship getClassesDefinedByCall(Node callNode) { return null; }
        @Override public boolean isConstant(String variableName) { return false; }
        @Override public boolean isConstantKey(String keyName) { return false; }
    }

    private static class StubNodeTraversal extends NodeTraversal {
        private Scope scope;
        StubNodeTraversal(AbstractCompiler compiler, Scope scope) {
            super(compiler, null);
            this.scope = scope;
        }
        @Override public Scope getScope() { return scope; }
        @Override public boolean inGlobalScope() { return false; }
        @Override public boolean hasScope() { return true; }
    }

    private static class StubScope implements Scope {
        private final Map<String, Var> vars = new LinkedHashMap<>();
        private final boolean local;
        StubScope(boolean local) { this.local = local; }
        void addVar(Var var) { vars.put(var.getName(), var); }
        @Override public Iterator<Var> getVars() { return vars.values().iterator(); }
        @Override public boolean isLocal() { return local; }
        @Override public boolean isGlobal() { return !local; }
        @Override public Var getVar(String name) { return vars.get(name); }
        @Override public Var getOwnSlot(String name) { return vars.get(name); }
        @Override public StaticScope<JSType> getParentScope() { return null; }
        @Override public StaticSlot<JSType> getSlot(String name) { return vars.get(name); }
        @Override public JSType getTypeOfThis() { return null; }
        @Override public String getSourceName() { return null; }
        @Override public Node getRootNode() { return null; }
        @Override public Scope getGlobalScope() { return null; }
        @Override public Scope getDeclarativelyUnboundScope() { return null; }
        @Override public Scope createChildScope(Node node) { return null; }
        @Override public void clear() {}
        @Override public void removeSlot(String name) {}
        @Override public String getOwnVarName(String name) { return name; }
    }

    private static class StubVar implements Var {
        private final String name;
        private final boolean isConst;
        private final StubScope scope;
        private final Node initialValue;
        private final Node nameNode;
        StubVar(String name, boolean isConst, StubScope scope, Node initialValue) {
            this.name = name;
            this.isConst = isConst;
            this.scope = scope;
            this.initialValue = initialValue;
            this.nameNode = new Node(Token.NAME);
            this.nameNode.setString(name);
        }
        @Override public String getName() { return name; }
        @Override public boolean isConst() { return isConst; }
        @Override public boolean isGlobal() { return !scope.isLocal(); }
        @Override public boolean isLocal() { return scope.isLocal(); }
        @Override public Node getInitialValue() { return initialValue; }
        @Override public Node getNameNode() { return nameNode; }
        @Override public Node getParentNode() { return null; }
        @Override public Reference getDeclaration() { return null; }
        @Override public JSType getType() { return null; }
        @Override public boolean isBleedingFunction() { return false; }
        @Override public boolean isDefine() { return false; }
        @Override public StaticScope<JSType> getScope() { return scope; }
    }

    private static class StubReferenceCollection extends ReferenceCollection {
        List<Reference> references;
        boolean wellDefined, assignedOnce, neverAssigned;
        Reference initRef, initRefConstants;
        StubReferenceCollection(List<Reference> refs) {
            super(null);
            this.references = refs;
        }
        @Override public boolean isWellDefined() { return wellDefined; }
        @Override public boolean isAssignedOnceInLifetime() { return assignedOnce; }
        @Override public boolean isNeverAssigned() { return neverAssigned; }
        @Override public Reference getInitializingReference() { return initRef; }
        @Override public Reference getInitializingReferenceForConstants() { return initRefConstants; }
    }

    private static class StubReference extends Reference {
        private final Node nameNode;
        private final Node parent;
        private final Node grandparent;
        private final boolean declaration, isLvalue, simpleAssign;
        private final Node assignedValue;
        private final BasicBlock block;
        StubReference(Node nameNode, Node parent, Node grandparent,
                      boolean declaration, boolean isLvalue, boolean simpleAssign,
                      Node assignedValue, BasicBlock block) {
            super(null, null, null, null, null, null);
            this.nameNode = nameNode;
            this.parent = parent;
            this.grandparent = grandparent;
            this.declaration = declaration;
            this.isLvalue = isLvalue;
            this.simpleAssign = simpleAssign;
            this.assignedValue = assignedValue;
            this.block = block;
        }
        @Override public Node getNameNode() { return nameNode; }
        @Override public Node getParent() { return parent; }
        @Override public Node getGrandparent() { return grandparent; }
        @Override public boolean isDeclaration() { return declaration; }
        @Override public boolean isLvalue() { return isLvalue; }
        @Override public boolean isSimpleAssignmentToName() { return simpleAssign; }
        @Override public Node getAssignedValue() { return assignedValue; }
        @Override public BasicBlock getBasicBlock() { return block; }
    }

    private StubAbstractCompiler compiler;
    private StubScope scope;

    @Before
    public void setUp() throws Exception {
        compiler = new StubAbstractCompiler();
        scope = new StubScope(true);
    }

    private Object getInliningBehavior(InlineVariables iv) throws Exception {
        Class<?> innerClass = null;
        for (Class<?> clazz : InlineVariables.class.getDeclaredClasses()) {
            if (clazz.getSimpleName().equals("InliningBehavior")) {
                innerClass = clazz;
                break;
            }
        }
        if (innerClass == null) throw new RuntimeException("InliningBehavior not found");
        Constructor<?> ctor = innerClass.getDeclaredConstructor(InlineVariables.class);
        ctor.setAccessible(true);
        return ctor.newInstance(iv);
    }

    @Test
    public void testModeAllFilter() {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        assertNotNull(iv);
    }

    @Test
    public void testInlineDeclaredConstant() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        Object behavior = getInliningBehavior(iv);
        Node valueNode = new Node(Token.NUMBER);
        valueNode.setDouble(5);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        StubVar var = new StubVar("x", true, scope, valueNode);
        StubReference declRef = new StubReference(nameNode, new Node(Token.VAR), new Node(Token.SCRIPT), true, false, false, null, null);
        StubReference useRef = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, null);
        useRef.getNameNode().setString("x");
        List<Reference> refs = new ArrayList<>();
        refs.add(declRef);
        refs.add(useRef);
        StubReferenceCollection rc = new StubReferenceCollection(refs);
        rc.wellDefined = true;
        rc.assignedOnce = true;
        rc.initRef = declRef;
        rc.initRefConstants = declRef;
        Map<Var, ReferenceCollection> map = new HashMap<>();
        map.put(var, rc);
        StubNodeTraversal t = new StubNodeTraversal(compiler, scope);
        Method afterExit = behavior.getClass().getDeclaredMethod("afterExitScope", NodeTraversal.class, Map.class);
        afterExit.setAccessible(true);
        afterExit.invoke(behavior, t, map);
        assertTrue(compiler.reportCodeChangeCalled);
    }

    @Test
    public void testInlineNonConstantsRefCountMoreThanOne() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node valueNode = new Node(Token.NUMBER);
        valueNode.setDouble(10);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("y");
        StubVar varNonConst = new StubVar("y", false, scope, valueNode);
        StubReference decl = new StubReference(nameNode, new Node(Token.VAR), new Node(Token.SCRIPT), true, false, false, null, null);
        StubReference init = new StubReference(nameNode, new Node(Token.ASSIGN), new Node(Token.EXPR_RESULT), false, false, true, valueNode, null);
        StubReference use1 = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, null);
        use1.getNameNode().setString("y");
        StubReference use2 = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, null);
        use2.getNameNode().setString("y");
        List<Reference> refs = new ArrayList<>();
        refs.add(decl);
        refs.add(init);
        refs.add(use1);
        refs.add(use2);
        StubReferenceCollection rc = new StubReferenceCollection(refs);
        rc.wellDefined = true;
        rc.assignedOnce = true;
        rc.initRef = init;
        rc.neverAssigned = false;
        Map<Var, ReferenceCollection> map = new HashMap<>();
        map.put(varNonConst, rc);
        StubNodeTraversal t = new StubNodeTraversal(compiler, scope);
        Method afterExit = behavior.getClass().getDeclaredMethod("afterExitScope", NodeTraversal.class, Map.class);
        afterExit.setAccessible(true);
        afterExit.invoke(behavior, t, map);
        assertTrue(compiler.reportCodeChangeCalled);
    }

    @Test
    public void testVarIsExportedForbidden() throws Exception {
        compiler.codingConvention = new StubCodingConvention() {
            @Override public boolean isExported(String name) { return true; }
        };
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        StubVar exportedVar = new StubVar("exportedVar", false, scope, null);
        StubReferenceCollection rc = new StubReferenceCollection(new ArrayList<>());
        Map<Var, ReferenceCollection> map = new HashMap<>();
        map.put(exportedVar, rc);
        StubNodeTraversal t = new StubNodeTraversal(compiler, scope);
        Method afterExit = behavior.getClass().getDeclaredMethod("afterExitScope", NodeTraversal.class, Map.class);
        afterExit.setAccessible(true);
        afterExit.invoke(behavior, t, map);
        assertFalse(compiler.reportCodeChangeCalled);
    }

    @Test
    public void testIsStringWorthInliningBoundary() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        Object behavior = getInliningBehavior(iv);
        Node stringValue = new Node(Token.STRING);
        stringValue.setString("abc");
        StubVar stringVar = new StubVar("s", true, scope, stringValue);
        StubReference decl = new StubReference(new Node(Token.NAME), new Node(Token.VAR), new Node(Token.SCRIPT), true, false, false, null, null);
        decl.getNameNode().setString("s");
        StubReference use = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, null);
        use.getNameNode().setString("s");
        List<Reference> refs = new ArrayList<>();
        refs.add(decl);
        refs.add(use);
        StubReferenceCollection rc = new StubReferenceCollection(refs);
        rc.assignedOnce = true;
        rc.initRef = decl;
        rc.initRefConstants = decl;
        Map<Var, ReferenceCollection> map = new HashMap<>();
        map.put(stringVar, rc);
        StubNodeTraversal t = new StubNodeTraversal(compiler, scope);
        Method afterExit = behavior.getClass().getDeclaredMethod("afterExitScope", NodeTraversal.class, Map.class);
        afterExit.setAccessible(true);
        afterExit.invoke(behavior, t, map);
        assertTrue(compiler.reportCodeChangeCalled);
    }

    @Test
    public void testCanInlineCrossBlockReturnsFalse() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node valueNode = new Node(Token.NUMBER);
        valueNode.setDouble(1);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("z");
        StubReference decl = new StubReference(nameNode, new Node(Token.VAR), new Node(Token.SCRIPT), true, false, false, null, null);
        StubReference init = new StubReference(nameNode, new Node(Token.VAR), new Node(Token.SCRIPT), true, false, true, valueNode, null);
        BasicBlock blockB = new BasicBlock();
        StubReference ref = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, blockB);
        ref.getNameNode().setString("z");
        StubVar var = new StubVar("z", false, scope, valueNode);
        Method canInlineMethod = behavior.getClass().getDeclaredMethod("canInline", Reference.class, Reference.class, Reference.class);
        canInlineMethod.setAccessible(true);
        boolean result = (Boolean) canInlineMethod.invoke(behavior, decl, init, ref);
        assertFalse(result);
    }

    @Test
    public void testCollectAliasCandidates() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node assignedName = new Node(Token.NAME);
        assignedName.setString("aliasTarget");
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("alias");
        StubReference decl = new StubReference(nameNode, new Node(Token.VAR), new Node(Token.SCRIPT), true, false, false, null, null);
        Node assignParent = new Node(Token.ASSIGN);
        assignParent.addChildToFront(nameNode);
        assignParent.addChildToBack(assignedName);
        StubReference init = new StubReference(nameNode, assignParent, new Node(Token.EXPR_RESULT), false, false, true, assignedName, null);
        StubReference use = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, null);
        use.getNameNode().setString("alias");
        List<Reference> refs = new ArrayList<>();
        refs.add(decl);
        refs.add(init);
        refs.add(use);
        StubReferenceCollection rc = new StubReferenceCollection(refs);
        rc.wellDefined = true;
        rc.assignedOnce = true;
        rc.initRef = init;
        StubVar aliasVar = new StubVar("alias", false, scope, assignedName);
        Map<Var, ReferenceCollection> referenceMap = new HashMap<>();
        referenceMap.put(aliasVar, rc);
        StubVar targetVar = new StubVar("aliasTarget", false, scope, new Node(Token.NUMBER));
        targetVar.getNameNode().setDouble(0);
        referenceMap.put(targetVar, new StubReferenceCollection(new ArrayList<>()));
        StubNodeTraversal t = new StubNodeTraversal(compiler, scope);
        Method collect = behavior.getClass().getDeclaredMethod("collectAliasCandidates", NodeTraversal.class, Map.class);
        collect.setAccessible(true);
        collect.invoke(behavior, t, referenceMap);
        Field aliasCandidatesField = behavior.getClass().getDeclaredField("aliasCandidates");
        aliasCandidatesField.setAccessible(true);
        Map<Node, ?> aliasCandidates = (Map<Node, ?>) aliasCandidatesField.get(behavior);
        assertTrue(aliasCandidates.containsKey(assignedName));
    }

    @Test
    public void testRemoveDeclarationWhenVarEmpty() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Node varNode = new Node(Token.VAR);
        varNode.addChildToFront(nameNode);
        Node grandparent = new Node(Token.SCRIPT);
        grandparent.addChildToFront(varNode);
        StubReference decl = new StubReference(nameNode, varNode, grandparent, true, false, false, null, null);
        Method removeDecl = behavior.getClass().getDeclaredMethod("removeDeclaration", Reference.class);
        removeDecl.setAccessible(true);
        removeDecl.invoke(behavior, decl);
        assertFalse(varNode.hasChildren());
        assertFalse(grandparent.hasChildren());
        assertTrue(compiler.reportCodeChangeCalled);
    }

    @Test
    public void testInlineValueAndBlacklist() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(nameNode);
        Node grandparent = new Node(Token.SCRIPT);
        grandparent.addChildToFront(parent);
        StubReference ref = new StubReference(nameNode, parent, grandparent, false, false, false, null, null);
        Node value = new Node(Token.NUMBER);
        value.setDouble(42);
        Method inlineValue = behavior.getClass().getDeclaredMethod("inlineValue", Var.class, Reference.class, Node.class);
        inlineValue.setAccessible(true);
        StubVar var = new StubVar("x", false, scope, null);
        inlineValue.invoke(behavior, var, ref, value);
        Node first = parent.getFirstChild();
        assertSame(value, first);
        assertTrue(compiler.reportCodeChangeCalled);
    }

    @Test
    public void testInlineWellDefinedVariable() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node valueNode = new Node(Token.NUMBER);
        valueNode.setDouble(7);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("w");
        StubReference decl = new StubReference(nameNode, new Node(Token.VAR), new Node(Token.SCRIPT), true, false, false, null, null);
        StubReference use1 = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, null);
        use1.getNameNode().setString("w");
        StubReference use2 = new StubReference(new Node(Token.NAME), new Node(Token.EXPR_RESULT), new Node(Token.SCRIPT), false, false, false, null, null);
        use2.getNameNode().setString("w");
        List<Reference> refs = new ArrayList<>();
        refs.add(decl);
        refs.add(use1);
        refs.add(use2);
        StubVar var = new StubVar("w", false, scope, valueNode);
        Method inlineWell = behavior.getClass().getDeclaredMethod("inlineWellDefinedVariable", Var.class, Node.class, List.class);
        inlineWell.setAccessible(true);
        inlineWell.invoke(behavior, var, valueNode, refs);
        Field staleVarsField = behavior.getClass().getDeclaredField("staleVars");
        staleVarsField.setAccessible(true);
        Set<Var> staleVars = (Set<Var>) staleVarsField.get(behavior);
        assertTrue(staleVars.contains(var));
    }

    @Test
    public void testDoInlinesForScopeStopsWhenRefInfoNull() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
        Object behavior = getInliningBehavior(iv);
        StubVar var = new StubVar("v", false, scope, null);
        Map<Var, ReferenceCollection> map = new HashMap<>();
        map.put(var, null);
        StubNodeTraversal t = new StubNodeTraversal(compiler, scope);
        Method doInlines = behavior.getClass().getDeclaredMethod("doInlinesForScope", NodeTraversal.class, Map.class);
        doInlines.setAccessible(true);
        doInlines.invoke(behavior, t, map);
        assertFalse(compiler.reportCodeChangeCalled);
    }

    @Test
    public void testIsValidDeclarationReturnsFalseForForLoop() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("i");
        Node varNode = new Node(Token.VAR);
        varNode.addChildToFront(nameNode);
        Node forNode = new Node(Token.FOR);
        forNode.addChildToFront(varNode);
        StubReference decl = new StubReference(nameNode, varNode, forNode, true, false, false, null, null);
        Method isValidDecl = behavior.getClass().getDeclaredMethod("isValidDeclaration", Reference.class);
        isValidDecl.setAccessible(true);
        boolean result = (Boolean) isValidDecl.invoke(behavior, decl);
        assertFalse(result);
    }

    @Test
    public void testCanInlineGetPropInCallContext() throws Exception {
        InlineVariables iv = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
        Object behavior = getInliningBehavior(iv);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("a");
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToFront(nameNode);
        getProp.addChildToBack(new Node(Token.STRING));
        getProp.getLastChild().setString("b");
        Node callNode = new Node(Token.CALL);
        callNode.addChildToFront(getProp);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToFront(callNode);
        Node grandparent = new Node(Token.SCRIPT);
        grandparent.addChildToFront(exprResult);
        StubReference decl = new StubReference(nameNode, new Node(Token.VAR), new Node(Token.SCRIPT), true, false, false, null, null);
        StubReference init = new StubReference(nameNode, new Node(Token.ASSIGN), exprResult, false, false, true, getProp, null);
        StubReference ref = new StubReference(nameNode, callNode, grandparent, false, false, false, null, null);
        Method canInline = behavior.getClass().getDeclaredMethod("canInline", Reference.class, Reference.class, Reference.class);
        canInline.setAccessible(true);
        boolean result = (Boolean) canInline.invoke(behavior, decl, init, ref);
        assertFalse(result);
    }
}