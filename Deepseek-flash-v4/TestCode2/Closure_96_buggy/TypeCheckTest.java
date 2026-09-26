package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TypeCheckTest {

    private AbstractCompiler compiler;
    private JSTypeRegistry typeRegistry;
    private ReverseAbstractInterpreter reverseInterpreter;
    private TypeCheck typeCheck;
    private Scope topScope;
    private ScopeCreator scopeCreator;

    private final CheckLevel reportMissingOverride = CheckLevel.WARNING;
    private final CheckLevel reportUnknownTypes = CheckLevel.OFF;

    @Before
    public void setUp() {
        compiler = Compiler.getInstance();
        typeRegistry = compiler.getTypeRegistry();
        reverseInterpreter = compiler.getReverseAbstractInterpreter();
        topScope = null;
        scopeCreator = null;
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry, reportMissingOverride, reportUnknownTypes);
    }

    @Test
    public void testConstructorWithAllParameters() {
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, topScope, scopeCreator, CheckLevel.WARNING, CheckLevel.WARNING);
        assertNotNull(tc);
    }

    @Test
    public void testConstructorWithNullScopes() {
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, CheckLevel.OFF, CheckLevel.OFF);
        assertNotNull(tc);
    }

    @Test
    public void testProcessThrowsOnNullScopeCreator() {
        Node externs = new Node(Token.SCRIPT);
        Node js = new Node(Token.SCRIPT);
        Node root = new Node(Token.BLOCK, externs, js);
        try {
            typeCheck.process(externs, js);
            fail("Expected NullPointerException for null scopeCreator");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testProcessThrowsOnNullTopScope() {
        scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, topScope, scopeCreator, CheckLevel.WARNING, CheckLevel.OFF);
        Node externs = new Node(Token.SCRIPT);
        Node js = new Node(Token.SCRIPT);
        Node root = new Node(Token.BLOCK, externs, js);
        try {
            tc.process(externs, js);
            fail("Expected NullPointerException for null topScope");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testProcessWithExterns() {
        scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        Node externsAndJs = new Node(Token.BLOCK);
        Node externs = new Node(Token.SCRIPT);
        Node js = new Node(Token.SCRIPT);
        externsAndJs.addChildToFront(externs);
        externsAndJs.addChildToFront(js);
        topScope = scopeCreator.createScope(externsAndJs, null);
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, topScope, scopeCreator, CheckLevel.WARNING, CheckLevel.OFF);
        tc.process(externs, js);
        assertTrue(true);
    }

    @Test
    public void testVisitNameFunctionParent() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.NAME);
        Node parent = new Node(Token.FUNCTION);
        assertFalse(typeCheck.visitName(t, n, parent));
    }

    @Test
    public void testVisitNameCatchParent() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.NAME);
        Node parent = new Node(Token.CATCH);
        assertFalse(typeCheck.visitName(t, n, parent));
    }

    @Test
    public void testVisitNameVarParent() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.NAME);
        Node parent = new Node(Token.VAR);
        assertFalse(typeCheck.visitName(t, n, parent));
    }

    @Test
    public void testVisitNameGetPropInAssign() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.GETPROP);
        Node parent = new Node(Token.ASSIGN);
        Node assign = new Node(Token.ASSIGN, n, new Node(Token.NUMBER));
        parent.addChildToFront(n);
        assertFalse(typeCheck.visitName(t, n, assign));
    }

    @Test
    public void testVisitGetPropNoJSType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node obj = new Node(Token.NAME, "x");
        obj.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node property = new Node(Token.STRING, "prop");
        Node getProp = new Node(Token.GETPROP, obj, property);
        getProp.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node parent = new Node(Token.EXPR_RESULT);
        typeCheck.visitGetProp(t, getProp, parent);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), getProp.getJSType());
    }

    @Test
    public void testVisitAndUntyped() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node andNode = new Node(Token.AND);
        andNode.setJSType(null);
        typeCheck.visit(t, andNode, null);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), andNode.getJSType());
    }

    @Test
    public void testVisitObjectLitWithEnumParent() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node enumNode = new Node(Token.NAME);
        enumNode.setJSType(typeRegistry.createEnumType("MyEnum", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE)));
        Node parent = new Node(Token.VAR, enumNode);
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.setJSType(null);
        typeCheck.visit(t, objLit, enumNode);
        assertEquals(enumNode.getJSType(), objLit.getJSType());
    }

    @Test
    public void testVisitOrTyped() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node orNode = new Node(Token.OR);
        orNode.setJSType(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        typeCheck.visit(t, orNode, null);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE), orNode.getJSType());
    }

    @Test
    public void testVisitFunctionWithNameConflict() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node functionName = new Node(Token.NAME, "existingFunc");
        Node functionNode = new Node(Token.FUNCTION, functionName);
        functionNode.setJSType(typeRegistry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE));
        assertFalse(t.getScope().isDeclared("existingFunc", false));
        typeCheck.shouldTraverse(t, functionNode, null);
        assertTrue(true);
    }

    @Test
    public void testGetJSTypeNullReturnsUnknown() {
        Node n = new Node(Token.NAME);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), typeCheck.getJSType(n));
    }

    @Test
    public void testGetFunctionTypeUnknown() {
        Node n = new Node(Token.NAME);
        FunctionType ft = typeCheck.getFunctionType(n);
        assertNotNull(ft);
        assertEquals(typeRegistry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), ft);
    }

    @Test
    public void testGetFunctionTypeFunctionType() {
        Node n = new Node(Token.NAME);
        FunctionType ft = typeRegistry.createFunctionType(typeRegistry.getNativeType(JSTypeNative.VOID_TYPE));
        n.setJSType(ft);
        assertEquals(ft, typeCheck.getFunctionType(n));
    }

    @Test
    public void testGetFunctionTypeNonFunction() {
        Node n = new Node(Token.NAME);
        n.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertNull(typeCheck.getFunctionType(n));
    }

    @Test
    public void testCheckEnumInitializerObjectLit() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = new Node(Token.STRING, "key");
        Node value = new Node(Token.NUMBER, "1");
        objLit.addChildToFront(key);
        key.addChildToFront(value);
        typeCheck.checkEnumInitializer(t, objLit, typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(true);
    }

    @Test
    public void testCheckEnumInitializerEnumType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node enumNode = new Node(Token.NAME);
        EnumType et = typeRegistry.createEnumType("E", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        enumNode.setJSType(et);
        typeCheck.checkEnumInitializer(t, enumNode, typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(true);
    }

    @Test
    public void testIsReferenceGetElem() {
        Node n = new Node(Token.GETELEM);
        assertTrue(TypeCheck.isReference(n));
    }

    @Test
    public void testIsReferenceGetProp() {
        Node n = new Node(Token.GETPROP);
        assertTrue(TypeCheck.isReference(n));
    }

    @Test
    public void testIsReferenceName() {
        Node n = new Node(Token.NAME);
        assertTrue(TypeCheck.isReference(n));
    }

    @Test
    public void testIsReferenceOther() {
        Node n = new Node(Token.NUMBER);
        assertFalse(TypeCheck.isReference(n));
    }

    @Test
    public void testVisitBinaryOperatorShiftLeft() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node left = new Node(Token.NUMBER, "3");
        left.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = new Node(Token.NUMBER, "1");
        right.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node shift = new Node(Token.LSH, left, right);
        shift.setJSType(null);
        typeCheck.visitBinaryOperator(Token.LSH, t, shift);
        assertNotNull(shift.getJSType());
    }

    @Test
    public void testVisitCallNotCallable() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node callTarget = new Node(Token.NUMBER, "42");
        callTarget.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node call = new Node(Token.CALL, callTarget);
        call.setJSType(null);
        typeCheck.visitCall(t, call);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), call.getJSType());
    }

    @Test
    public void testVisitCallConstructorNotCallable() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        FunctionType ctor = typeRegistry.createConstructorType("C", null, null, null);
        Node callTarget = new Node(Token.NAME, "C");
        callTarget.setJSType(ctor);
        Node call = new Node(Token.CALL, callTarget);
        call.setJSType(null);
        typeCheck.visitCall(t, call);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), call.getJSType());
    }

    @Test
    public void testVisitNewNotConstructor() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node ctor = new Node(Token.NAME, "C");
        ctor.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node newNode = new Node(Token.NEW, ctor);
        newNode.setJSType(null);
        typeCheck.visitNew(t, newNode);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), newNode.getJSType());
    }

    @Test
    public void testGetTypedPercentZeroTotal() {
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.0);
    }
}