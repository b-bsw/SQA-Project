package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.*;
import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {

    private static class MockNode extends Node {
        Node parent;
        JSType jsType;
        String str;

        MockNode(int type) { super(type); }
        MockNode(int type, Node child) { super(type, child); }

        @Override public Node getParent() { return parent; }
        @Override public JSType getJSType() { return jsType; }
        @Override public void setJSType(JSType t) { jsType = t; }
        @Override public String getString() { return str; }
    }

    private static class MockJSType extends JSType {
        boolean unknown, number, string, bool, isVoid, isNull, object, func, cons, iface, callable;
        JSType restrictResult;

        MockJSType(JSTypeRegistry reg) { super(reg); }

        @Override public boolean isUnknownType() { return unknown; }
        @Override public boolean isNumber() { return number; }
        @Override public boolean isString() { return string; }
        @Override public boolean isBooleanType() { return bool; }
        @Override public boolean isVoidType() { return isVoid; }
        @Override public boolean isNullType() { return isNull; }
        @Override public boolean isObjectType() { return object; }
        @Override public boolean isFunctionType() { return func; }
        @Override public boolean isConstructor() { return cons; }
        @Override public boolean isInterface() { return iface; }
        @Override public boolean canBeCalled() { return callable; }
        @Override public JSType restrictByNotNullOrUndefined() { return restrictResult != null ? restrictResult : this; }
        @Override public boolean matchesInt32Context() { return true; }
        @Override public boolean matchesUint32Context() { return true; }
        @Override public boolean matchesNumberContext() { return true; }
        @Override public ObjectType dereference() { return null; }
        @Override public boolean canAssignTo(JSType t) { return true; }
        @Override public String toString() { return "MockJSType"; }
        @Override public JSType getReturnType() { return null; }
        @Override public boolean isEmptyType() { return false; }
        @Override public TernaryValue testForEquality(JSType t) { return TernaryValue.UNKNOWN; }
        @Override public boolean canTestForShallowEqualityWith(JSType t) { return true; }
        @Override public <T> T visit(Visitor<T> v) { return null; }
        @Override public boolean isSubtype(JSType t) { return false; }
        @Override public JSType getLeastSupertype(JSType t) { return this; }
        @Override public JSType getGreatestSubtype(JSType t) { return this; }
    }

    private static class MockRegistry extends JSTypeRegistry {
        final JSType numberType, unknownType, stringType, boolType, voidType, nullType, objectType;

        MockRegistry() {
            super(null);
            numberType = createMock(true, false, false, false, false, false, false, false, false, false);
            unknownType = createMock(false, true, false, false, false, false, false, false, false, false);
            stringType = createMock(false, false, true, false, false, false, false, false, false, false);
            boolType = createMock(false, false, false, true, false, false, false, false, false, false);
            voidType = createMock(false, false, false, false, true, false, false, false, false, false);
            nullType = createMock(false, false, false, false, false, true, false, false, false, false);
            objectType = createMock(false, false, false, false, false, false, true, false, false, false);
        }

        private JSType createMock(boolean num, boolean unk, boolean str, boolean bl, boolean vd, boolean nl, boolean obj,
                                  boolean fn, boolean cn, boolean ifc) {
            MockJSType m = new MockJSType(this);
            m.number = num; m.unknown = unk; m.string = str; m.bool = bl; m.isVoid = vd; m.isNull = nl;
            m.object = obj; m.func = fn; m.cons = cn; m.iface = ifc;
            return m;
        }

        @Override public JSType getNativeType(JSTypeNative type) {
            switch (type) {
                case NUMBER_TYPE: return numberType;
                case UNKNOWN_TYPE: return unknownType;
                case STRING_TYPE: return stringType;
                case BOOLEAN_TYPE: return boolType;
                case VOID_TYPE: return voidType;
                case NULL_TYPE: return nullType;
                case OBJECT_TYPE: return objectType;
                default: return unknownType;
            }
        }

        @Override public FunctionType getNativeFunctionType(JSTypeNative t) { return null; }
    }

    private static class MockScope implements Scope {
        java.util.Map<String, Var> vars = new java.util.HashMap<>();
        JSType typeOfThis;

        @Override public Var getVar(String name) { return vars.get(name); }
        @Override public boolean isDeclared(String name, boolean recurse) { return vars.containsKey(name); }
        @Override public JSType getTypeOfThis() { return typeOfThis; }
        @Override public Scope getParent() { return null; }
        @Override public Node getRootNode() { return null; }
        @Override public java.util.Iterator<Var> getVars() { return vars.values().iterator(); }
        @Override public Var getOwnSlot(String name) { return vars.get(name); }
        @Override public Scope getGlobalScope() { return this; }
        @Override public int getDepth() { return 0; }
        @Override public boolean isGlobal() { return true; }
        @Override public boolean isLocal() { return false; }
    }

    private static class MockVar implements Scope.Var {
        String name;
        JSType type;
        boolean inferred;

        MockVar(String n, JSType t, boolean i) { name = n; type = t; inferred = i; }

        @Override public String getName() { return name; }
        @Override public Node getNode() { return null; }
        @Override public Scope getScope() { return null; }
        @Override public JSType getType() { return type; }
        @Override public boolean isTypeInferred() { return inferred; }
        @Override public Node getInitialValue() { return null; }
        @Override public String getInputName() { return null; }
        @Override public boolean isParam() { return false; }
        @Override public boolean isLocal() { return false; }
        @Override public boolean isGlobal() { return true; }
        @Override public boolean isExtern() { return false; }
        @Override public boolean isInterface() { return false; }
        @Override public boolean isThis() { return false; }
        @Override public boolean isLet() { return false; }
        @Override public boolean isConst() { return false; }
        @Override public int getIndex() { return 0; }
        @Override public JSType getPotentialValues() { return null; }
        @Override public boolean isImplicit() { return false; }
    }

    private static class TestNodeTraversal extends NodeTraversal {
        Scope scope;

        TestNodeTraversal(AbstractCompiler compiler, Callback callback, ScopeCreator creator, Scope scope) {
            super(compiler, callback, creator);
            this.scope = scope;
        }

        @Override public Scope getScope() { return scope; }
        @Override public Node getEnclosingFunction() { return null; }
        @Override public void report(Node n, DiagnosticType dt, String... args) {}
        @Override public JSError makeError(Node n, CheckLevel level, DiagnosticType dt, String... args) {
            return JSError.make(n, dt.name(), dt.key(), args);
        }
        @Override public JSError makeError(Node n, DiagnosticType dt, String... args) {
            return JSError.make(n, dt.name(), dt.key(), args);
        }
    }

    private static class MinimalCompiler extends AbstractCompiler {
        TypeValidator validator;
        CodingConvention convention = new CodingConvention();

        MinimalCompiler(TypeValidator v) { validator = v; }

        @Override public TypeValidator getTypeValidator() { return validator; }
        @Override public CodingConvention getCodingConvention() { return convention; }
        @Override public void report(JSError error) {}
        @Override public Node parseSyntheticCode(String code) { return null; }
        @Override public Node parseTestCode(String code) { return null; }
        @Override public com.google.javascript.jscomp.ErrorManager getErrorManager() { return null; }
        @Override public com.google.javascript.jscomp.SourceFile getSourceFileByName(String name) { return null; }
        @Override public com.google.javascript.jscomp.SourceAst getSourceAst(String inputId) { return null; }
        @Override public void report(JSError... errors) {}
        @Override public void setCodingConvention(CodingConvention cc) { convention = cc; }
    }

    private static class MockValidator extends TypeValidator {
        MockValidator(AbstractCompiler c) { super(c); }
        @Override public void expectNumber(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override public void expectString(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override public void expectObject(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override public boolean expectCanAssignTo(NodeTraversal t, Node n, JSType right, JSType left, String msg) { return true; }
        @Override public void expectNotNullOrUndefined(NodeTraversal t, Node n, JSType type, String msg, JSType nativeType) {}
        @Override public void expectAnyObject(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override public void expectActualObject(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override public void expectBitwiseable(NodeTraversal t, Node n, JSType type, String msg) {}
        @Override public void expectIndexMatch(NodeTraversal t, Node n, JSType left, JSType right) {}
        @Override public void expectSwitchMatchesCase(NodeTraversal t, Node n, JSType switchType, JSType caseType) {}
        @Override public void expectArgumentMatchesParameter(NodeTraversal t, Node arg, JSType argType, JSType paramType, Node call, int ordinal) {}
        @Override public boolean expectCanAssignToPropertyOf(NodeTraversal t, Node n, JSType right, JSType left, Node owner, String prop) { return true; }
        @Override public void expectAllInterfaceProperties(NodeTraversal t, Node n, FunctionType type) {}
        @Override public void setShouldReport(boolean report) {}
        @Override public String getReadableJSTypeName(Node n, boolean dereference) { return "Mock"; }
        @Override public void expectCanCast(NodeTraversal t, Node n, JSType castTo, JSType from) {}
    }

    private MockRegistry registry;
    private MockScope scope;
    private MinimalCompiler compiler;
    private TypeCheck typeCheck;

    @Before
    public void setUp() {
        registry = new MockRegistry();
        scope = new MockScope();
        MockValidator validator = new MockValidator(null);
        compiler = new MinimalCompiler(validator);
        typeCheck = new TypeCheck(compiler, null, registry, CheckLevel.WARNING, CheckLevel.OFF);
    }

    @Test
    public void testInitialTypedPercentZero() {
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.0);
    }

    @Test
    public void testTypedPercentAfterNumber() {
        MockNode node = new MockNode(Token.NUMBER);
        node.setJSType(registry.numberType);
        MockNode parent = new MockNode(Token.SCRIPT);
        TestNodeTraversal t = new TestNodeTraversal(compiler, typeCheck, null, scope);
        typeCheck.visit(t, node, parent);
        assertEquals(100.0, typeCheck.getTypedPercent(), 0.0);
    }

    @Test
    public void testTypedPercentAfterUnknown() {
        MockNode node = new MockNode(Token.NAME);
        node.setJSType(registry.unknownType);
        MockNode parent = new MockNode(Token.ASSIGN);
        TestNodeTraversal t = new TestNodeTraversal(compiler, typeCheck, null, scope);
        typeCheck.visit(t, node, parent);
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.0);
    }

    @Test
    public void testTypedPercentMixed() {
        // one typed, one unknown -> typedCount=1, unknownCount=1, total=2 -> 50%
        MockNode numNode = new MockNode(Token.NUMBER);
        numNode.setJSType(registry.numberType);
        MockNode unkNode = new MockNode(Token.NAME);
        unkNode.setJSType(registry.unknownType);
        MockNode parent = new MockNode(Token.ASSIGN);
        TestNodeTraversal t = new TestNodeTraversal(compiler, typeCheck, null, scope);
        typeCheck.visit(t, numNode, parent);
        typeCheck.visit(t, unkNode, parent);
        assertEquals(50.0, typeCheck.getTypedPercent(), 0.01);
    }

    @Test(expected = NullPointerException.class)
    public void testProcessWithNullScopeCreator() {
        // create TypeCheck without scopeCreator using constructor with nulls
        TypeCheck tc = new TypeCheck(compiler, null, registry, CheckLevel.WARNING, CheckLevel.OFF);
        MockNode externs = new MockNode(Token.SCRIPT);
        MockNode jsRoot = new MockNode(Token.BLOCK);
        MockNode prnt = new MockNode(Token.SCRIPT);
        jsRoot.parent = prnt;
        tc.process(externs, jsRoot);
    }

    @Test(expected = NullPointerException.class)
    public void testProcessWithNullTopScope() {
        // create TypeCheck with scopeCreator but null topScope
        // constructor that takes topScope; we pass null for topScope
        TypeCheck tc = new TypeCheck(compiler, null, registry, null, null, CheckLevel.WARNING, CheckLevel.OFF);
        MockNode externs = new MockNode(Token.SCRIPT);
        MockNode jsRoot = new MockNode(Token.BLOCK);
        MockNode prnt = new MockNode(Token.SCRIPT);
        jsRoot.parent = prnt;
        tc.process(externs, jsRoot);
    }

    @Test
    public void testShouldTraverseFunctionMasksVariable() {
        // create function node with name that is already declared as non-function
        MockNode funcNode = new MockNode(Token.FUNCTION);
        MockNode nameChild = new MockNode(Token.NAME);
        nameChild.str = "maskedFunc";
        funcNode.addChildToFront(nameChild);
        funcNode.setJSType(new MockJSType(registry) {{
            func = true; // function type
        }});
        // set up scope with var "maskedFunc" of non-function type
        MockVar existingVar = new MockVar("maskedFunc", registry.numberType, false);
        scope.vars.put("maskedFunc", existingVar);
        // parent can be any
        TestNodeTraversal t = new TestNodeTraversal(compiler, typeCheck, null, scope);
        // shouldTraverse should return true, and we cannot check side effect directly (report goes to compiler.report)
        // At least no exception
        boolean result = typeCheck.shouldTraverse(t, funcNode, null);
        assertTrue(result);
    }
}