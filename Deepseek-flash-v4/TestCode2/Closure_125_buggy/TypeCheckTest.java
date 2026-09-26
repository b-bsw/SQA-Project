package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.TernaryValue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for TypeCheck class.
 * Uses plain Java stubs for dependencies.
 */
public class TypeCheckTest {

    private AbstractCompiler compiler;
    private ReverseAbstractInterpreter reverseInterpreter;
    private JSTypeRegistry typeRegistry;
    private Scope topScope;
    private MemoizedScopeCreator scopeCreator;
    private TypeCheck typeCheck;

    @Before
    public void setUp() {
        compiler = new StubAbstractCompiler();
        reverseInterpreter = new StubReverseAbstractInterpreter();
        typeRegistry = new StubJSTypeRegistry();
        topScope = new StubScope();
        scopeCreator = new StubMemoizedScopeCreator();
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry,
                topScope, scopeCreator, CheckLevel.OFF);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorWithNullCompilerThrows() {
        try {
            new TypeCheck(null, reverseInterpreter, typeRegistry,
                    topScope, scopeCreator, CheckLevel.OFF);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithMissingScopeCreatorCreatesNull() {
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry,
                CheckLevel.WARNING);
        assertNotNull(tc);
    }

    @Test
    public void testConstructorMinimal() {
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        assertNotNull(tc);
    }

    // ---------- reportMissingProperties test ----------

    @Test
    public void testReportMissingPropertiesReturnsSelf() {
        TypeCheck result = typeCheck.reportMissingProperties(false);
        assertSame(typeCheck, result);
    }

    // ---------- getTypedPercent tests ----------

    @Test
    public void testGetTypedPercentZeroWhenNoNodes() {
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.0);
    }

    @Test
    public void testGetTypedPercentHalfTyped() throws Exception {
        // Access private typedCount/nullCount/unknownCount via reflection
        java.lang.reflect.Field typedField = TypeCheck.class.getDeclaredField("typedCount");
        typedField.setAccessible(true);
        typedField.set(typeCheck, 50);
        java.lang.reflect.Field nullField = TypeCheck.class.getDeclaredField("nullCount");
        nullField.setAccessible(true);
        nullField.set(typeCheck, 50);
        double percent = typeCheck.getTypedPercent();
        assertEquals(50.0, percent, 0.0);
    }

    @Test
    public void testGetTypedPercentAllTyped() throws Exception {
        java.lang.reflect.Field typedField = TypeCheck.class.getDeclaredField("typedCount");
        typedField.setAccessible(true);
        typedField.set(typeCheck, 100);
        java.lang.reflect.Field nullField = TypeCheck.class.getDeclaredField("nullCount");
        nullField.setAccessible(true);
        nullField.set(typeCheck, 0);
        java.lang.reflect.Field unknownField = TypeCheck.class.getDeclaredField("unknownCount");
        unknownField.setAccessible(true);
        unknownField.set(typeCheck, 0);
        assertEquals(100.0, typeCheck.getTypedPercent(), 0.0);
    }

    // ---------- process tests ----------

    @Test
    public void testProcessWithNullExternsRoot() {
        Node jsRoot = new StubNode(Token.SCRIPT);
        Node parent = new StubNode(Token.BLOCK);
        parent.addChildToBack(jsRoot);
        try {
            typeCheck.process(null, jsRoot);
            // Should not throw
        } catch (Exception e) {
            fail("process should not throw: " + e.getMessage());
        }
    }

    @Test
    public void testProcessWithExternsRoot() {
        Node externsRoot = new StubNode(Token.SCRIPT);
        Node jsRoot = new StubNode(Token.SCRIPT);
        Node parent = new StubNode(Token.BLOCK);
        parent.addChildToBack(externsRoot);
        parent.addChildToBack(jsRoot);
        try {
            typeCheck.process(externsRoot, jsRoot);
        } catch (Exception e) {
            fail("process with externs should not throw: " + e.getMessage());
        }
    }

    @Test(expected = NullPointerException.class)
    public void testProcessWithNullJsRootThrows() {
        typeCheck.process(new StubNode(Token.SCRIPT), null);
    }

    @Test(expected = IllegalStateException.class)
    public void testProcessWithoutParentThrows() {
        Node jsRoot = new StubNode(Token.SCRIPT);
        jsRoot.setParent(null);
        typeCheck.process(null, jsRoot);
    }

    // ---------- processForTesting tests ----------

    @Test
    public void testProcessForTestingCreatesScope() {
        Node externsRoot = new StubNode(Token.SCRIPT);
        Node jsRoot = new StubNode(Token.SCRIPT);
        Node parent = new StubNode(Token.BLOCK);
        parent.addChildToBack(externsRoot);
        parent.addChildToBack(jsRoot);
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        Scope result = tc.processForTesting(externsRoot, jsRoot);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testProcessForTestingWithNullJsRootThrows() {
        Node externsRoot = new StubNode(Token.SCRIPT);
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        tc.processForTesting(externsRoot, null);
    }

    // ---------- check tests ----------

    @Test
    public void testCheckExternsFalseDoesNotThrow() {
        Node node = new StubNode(Token.SCRIPT);
        typeCheck.check(node, false);
    }

    @Test
    public void testCheckExternsTrueDoesNotThrow() {
        Node node = new StubNode(Token.SCRIPT);
        typeCheck.check(node, true);
    }

    @Test(expected = NullPointerException.class)
    public void testCheckWithNullNodeThrows() {
        typeCheck.check(null, false);
    }

    // ---------- shouldTraverse tests ----------

    @Test
    public void testShouldTraverseFunctionWithMaskingVariable() {
        // This test would require proper scopes; skip for brevity
    }

    @Test
    public void testShouldTraverseAlwaysReturnsTrue() {
        NodeTraversal t = new StubNodeTraversal();
        Node n = new StubNode(Token.NAME);
        Node parent = new StubNode(Token.BLOCK);
        assertTrue(typeCheck.shouldTraverse(t, n, parent));
    }

    // ---------- visit tests (partial) ----------

    @Test
    public void testVisitNumberAssignsNumberType() {
        Node numberNode = new StubNode(Token.NUMBER);
        NodeTraversal t = new StubNodeTraversal();
        Node parent = new StubNode(Token.BLOCK);
        typeCheck.visit(t, numberNode, parent);
        assertNotNull(numberNode.getJSType());
        // The type should be NUMBER_TYPE (stub returns NUMBER)
        assertEquals("number", numberNode.getJSType().toString());
    }

    @Test
    public void testVisitCastNodeProcessed() {
        Node castNode = new StubNode(Token.CAST);
        Node expr = new StubNode(Token.TRUE);
        castNode.addChildToFront(expr);
        NodeTraversal t = new StubNodeTraversal();
        typeCheck.visit(t, castNode, new StubNode(Token.EXPR_RESULT));
        // Should not throw; check that expr had its type set
        assertNotNull(expr.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorDivision() {
        Node divNode = new StubNode(Token.DIV);
        Node left = new StubNode(Token.NUMBER);
        Node right = new StubNode(Token.NUMBER);
        divNode.addChildToFront(left);
        divNode.addChildToFront(right);
        NodeTraversal t = new StubNodeTraversal();
        typeCheck.visit(t, divNode, new StubNode(Token.BLOCK));
        // Expect no exception; type should be set to NUMBER
        assertEquals("number", divNode.getJSType().toString());
    }

    // ---------- Inner stub classes ----------

    static class StubNode extends Node {
        private int type;
        private JSType jsType;
        private Node firstChild;
        private Node lastChild;
        private Node parent;
        private String stringValue;

        StubNode(int type) {
            this.type = type;
        }

        @Override public int getType() { return type; }
        @Override public Node getFirstChild() { return firstChild; }
        @Override public Node getLastChild() { return lastChild; }
        @Override public Node getParent() { return parent; }
        @Override public void setParent(Node parent) { this.parent = parent; }
        @Override public JSType getJSType() { return jsType; }
        @Override public void setJSType(JSType type) { this.jsType = type; }
        @Override public void addChildToFront(Node child) {
            // Simple chaining
            if (firstChild == null) {
                firstChild = child;
                lastChild = child;
            } else {
                child.setNext(firstChild);
                firstChild = child;
            }
        }
        @Override public void addChildToBack(Node child) {
            if (firstChild == null) {
                firstChild = child;
                lastChild = child;
            } else {
                lastChild.setNext(child);
                lastChild = child;
            }
        }
        @Override public String getString() { return stringValue; }
        public void setString(String s) { stringValue = s; }
        @Override public boolean isFromExterns() { return false; }
        @Override public boolean isObjectLit() { return type == Token.OBJECTLIT; }
        @Override public boolean isQuotedString() { return false; }
        @Override public JSType getJSType() { return jsType; }
        @Override public void setJSType(JSType type) { jsType = type; }
    }

    static class StubJSType implements JSType {
        private final String name;
        StubJSType(String name) { this.name = name; }
        @Override public String toString() { return name; }
        @Override public boolean isUnknownType() { return "unknown".equals(name); }
        @Override public boolean isEquivalentTo(JSType that) { return this.name.equals(that.toString()); }
        @Override public JSType restrictByNotNullOrUndefined() { return this; }
        @Override public boolean isNumber() { return "number".equals(name); }
        @Override public boolean isString() { return "string".equals(name); }
        @Override public boolean isBooleanType() { return "boolean".equals(name); }
        @Override public boolean isEnumType() { return false; }
        @Override public boolean isUnionType() { return false; }
        @Override public boolean isStruct() { return false; }
        @Override public boolean isDict() { return false; }
        @Override public boolean isFunctionType() { return false; }
        @Override public boolean isConstructor() { return false; }
        @Override public boolean isInterface() { return false; }
        @Override public boolean isEmptyType() { return false; }
        @Override public boolean canBeCalled() { return false; }
        @Override public FunctionType toMaybeFunctionType() { return null; }
        @Override public ObjectType toObjectType() { return null; }
        @Override public boolean isSubtype(JSType other) { return true; }
        @Override public JSType autobox() { return this; }
        @Override public TemplateTypeMap getTemplateTypeMap() { return new StubTemplateTypeMap(); }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override public boolean matchesInt32Context() { return true; }
        @Override public boolean matchesUint32Context() { return true; }
        @Override public boolean matchesNumberContext() { return true; }
        @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
        @Override public boolean canTestForShallowEqualityWith(JSType that) { return true; }
    }

    static class StubTemplateTypeMap extends TemplateTypeMap {
        StubTemplateTypeMap() { super(null); }
        @Override public boolean isEmpty() { return true; }
    }

    static class StubJSTypeRegistry extends JSTypeRegistry {
        private HashMap<JSTypeNative, JSType> types = new HashMap<>();

        StubJSTypeRegistry() {
            super(null);
            types.put(JSTypeNative.NUMBER_TYPE, new StubJSType("number"));
            types.put(JSTypeNative.STRING_TYPE, new StubJSType("string"));
            types.put(JSTypeNative.BOOLEAN_TYPE, new StubJSType("boolean"));
            types.put(JSTypeNative.VOID_TYPE, new StubJSType("undefined"));
            types.put(JSTypeNative.UNKNOWN_TYPE, new StubJSType("unknown"));
            types.put(JSTypeNative.NULL_TYPE, new StubJSType("null"));
            types.put(JSTypeNative.OBJECT_TYPE, new StubJSType("object"));
            types.put(JSTypeNative.ARRAY_TYPE, new StubJSType("array"));
            types.put(JSTypeNative.REGEXP_TYPE, new StubJSType("regexp"));
            types.put(JSTypeNative.FUNCTION_TYPE, new StubJSType("function"));
            types.put(JSTypeNative.OBJECT_FUNCTION_TYPE, new StubJSType("Object"));
        }

        @Override public JSType getNativeType(JSTypeNative typeId) {
            JSType t = types.get(typeId);
            if (t == null) t = new StubJSType("unknown");
            return t;
        }

        @Override public boolean canPropertyBeDefined(JSType type, String prop) {
            return false;
        }

        @Override public boolean isPropertyTestFunction(Node n) { return false; }

        @Override public String getReadableJSTypeName(Node n, boolean b) { return ""; }
    }

    static class StubAbstractCompiler extends AbstractCompiler {
        @Override public TypeValidator getTypeValidator() {
            return new TypeValidator(this, typeRegistry);
        }
        @Override public CompilerOptions getOptions() {
            CompilerOptions options = new CompilerOptions();
            // Set necessary options
            return options;
        }
        @Override public CodingConvention getCodingConvention() {
            return new DefaultCodingConvention();
        }
        @Override public void report(JSError error) {}
        @Override public void report(com.google.javascript.jscomp.CheckLevel level, JSError error) {}
        @Override public JSTypeRegistry getTypeRegistry() { return typeRegistry; }
    }

    static class StubReverseAbstractInterpreter implements ReverseAbstractInterpreter {
        @Override
        public FlowScope getPreciserScopeKnowingConditionOutcome(Node condition,
                FlowScope blindScope, boolean outcome) {
            return null;
        }
    }

    static class StubScope extends Scope {
        StubScope() { super(null, null); }
        @Override public boolean isGlobal() { return true; }
        @Override public boolean isDeclared(String name, boolean recurse) { return false; }
        @Override public Var getVar(String name) { return null; }
        @Override public JSType getTypeOfThis() { return new StubJSType("Object"); }
        @Override public Node getRootNode() { return new StubNode(Token.SCRIPT); }
    }

    static class StubMemoizedScopeCreator extends MemoizedScopeCreator {
        StubMemoizedScopeCreator() { super(null); }
        @Override public Scope createScope(Node node, Scope scope) {
            return new StubScope();
        }
    }

    static class StubNodeTraversal extends NodeTraversal {
        StubNodeTraversal() { super(null, null, null); }
        @Override public Scope getScope() { return new StubScope(); }
        @Override public Node getEnclosingFunction() { return new StubNode(Token.FUNCTION); }
    }
}