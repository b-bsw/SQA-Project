package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.*;
import org.junit.Before;
import org.junit.Test;

public class TypedScopeCreatorTest {

    private AbstractCompiler compiler;
    private CodingConvention codingConvention;
    private TypeValidator validator;
    private JSTypeRegistry typeRegistry;
    private ErrorReporter errorReporter;
    private TypedScopeCreator creator;

    @Before
    public void setUp() {
        compiler = CompilerTestHelper.createCompiler();
        codingConvention = compiler.getCodingConvention();
        validator = compiler.getTypeValidator();
        typeRegistry = compiler.getTypeRegistry();
        errorReporter = typeRegistry.getErrorReporter();
        creator = new TypedScopeCreator(compiler, codingConvention);
    }

    @Test
    public void testCreateInitialScope_addsNativeTypes() {
        Node root = new Node(Token.SCRIPT);
        Scope scope = creator.createInitialScope(root);
        assertNotNull(scope);
        assertNotNull(scope.getVar("Array"));
        assertTrue(scope.getVar("Array").getType() instanceof FunctionType);
        assertNotNull(scope.getVar("undefined"));
        assertEquals(typeRegistry.getNativeType(JSTypeNative.VOID_TYPE), scope.getVar("undefined").getType());
        assertNotNull(scope.getVar("goog.typedef"));
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NO_TYPE), scope.getVar("goog.typedef").getType());
        assertNotNull(scope.getVar("ActiveXObject"));
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), scope.getVar("ActiveXObject").getType());
    }

    @Test
    public void testCreateScope_nullParent_createsGlobalScope() {
        Node root = new Node(Token.SCRIPT);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
    }

    @Test
    public void testCreateScope_nonNullParent_createsLocalScope() {
        Node root = new Node(Token.FUNCTION);
        Scope parent = new Scope(null, root);
        Scope scope = creator.createScope(root, parent);
        assertNotNull(scope);
        assertFalse(scope.isGlobal());
        assertEquals(parent, scope.getParent());
    }

    @Test(expected = NullPointerException.class)
    public void testCreateScope_rootNull_throwsException() {
        creator.createScope(null, null);
    }

    @Test
    public void testAttachLiteralTypes_nullToken() {
        Node n = new Node(Token.NULL);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NULL_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_voidToken() {
        Node n = new Node(Token.VOID);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.VOID_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_stringToken() {
        Node n = new Node(Token.STRING);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_numberToken() {
        Node n = new Node(Token.NUMBER);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_trueToken() {
        Node n = new Node(Token.TRUE);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_falseToken() {
        Node n = new Node(Token.FALSE);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_regexpToken() {
        Node n = new Node(Token.REGEXP);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.REGEXP_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_refSpecialToken() {
        Node n = new Node(Token.REF_SPECIAL);
        creator.attachLiteralTypes(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), n.getJSType());
    }

    @Test
    public void testAttachLiteralTypes_objectlitToken_noExistingType() {
        Node n = new Node(Token.OBJECTLIT);
        creator.attachLiteralTypes(n);
        assertNotNull(n.getJSType());
        assertTrue(n.getJSType() instanceof ObjectType);
    }

    @Test
    public void testAttachLiteralTypes_objectlitToken_existingType() {
        Node n = new Node(Token.OBJECTLIT);
        JSType existingType = typeRegistry.createAnonymousObjectType();
        n.setJSType(existingType);
        creator.attachLiteralTypes(n);
        assertSame(existingType, n.getJSType());
    }

    @Test
    public void testGetNativeType_returnsCorrectType() {
        JSType result = creator.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
    }

    @Test
    public void testGetNativeType_unknownType() {
        JSType result = creator.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
    }

    @Test
    public void testDeferredSetType_constructor() {
        Node node = new Node(Token.NAME);
        JSType type = typeRegistry.createAnonymousObjectType();
        TypedScopeCreator.DeferredSetType dst = new TypedScopeCreator.DeferredSetType(node, type);
        assertNotNull(dst);
        assertEquals(node, dst.node);
        assertEquals(type, dst.type);
    }

    @Test(expected = NullPointerException.class)
    public void testDeferredSetType_nullNode_throwsException() {
        new TypedScopeCreator.DeferredSetType(null, typeRegistry.createAnonymousObjectType());
    }

    @Test(expected = NullPointerException.class)
    public void testDeferredSetType_nullType_throwsException() {
        new TypedScopeCreator.DeferredSetType(new Node(Token.NAME), null);
    }
}