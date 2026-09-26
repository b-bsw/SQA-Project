package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

public class TypedScopeCreatorTest {
    private AbstractCompiler compiler;
    private TypedScopeCreator creator;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        compiler = CompilerTestCase.createCompiler();
        compiler.initOptions(new CompilerOptions());
        compiler.getTypeRegistry().resetForTypeCheck();
        registry = compiler.getTypeRegistry();
        creator = new TypedScopeCreator(compiler, compiler.getCodingConvention());
    }

    @Test
    public void testCreateScopeWithNullParent() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        assertNotNull(scope.getVar("undefined"));
        assertNotNull(scope.getVar("Array"));
        assertNotNull(scope.getVar("Object"));
    }

    @Test
    public void testCreateScopeWithNonNullParent() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Scope global = creator.createScope(root, null);
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "f");
        fnNode.addChildToFront(nameNode);
        root.addChildToFront(fnNode);
        Scope local = creator.createScope(root, global);
        assertNotNull(local);
        assertFalse(local.isGlobal());
    }

    @Test
    public void testCreateInitialScopeDeclaresNativeTypes() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Scope scope = creator.createInitialScope(root);
        assertNotNull(scope.getVar("Array"));
        assertNotNull(scope.getVar("Function"));
        assertNotNull(scope.getVar("Object"));
        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), scope.getVar("undefined").getType());
    }

    @Test
    public void testCreateInitialScopeDeclaresLegacyTypedef() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Scope scope = creator.createInitialScope(root);
        Var typedefVar = scope.getVar("goog.typedef");
        assertNotNull(typedefVar);
        assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), typedefVar.getType());
    }

    @Test
    public void testDiscoverEnumsAndTypedefsEnum() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "MyEnum");
        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(registry.createStringType());
        nameNode.setJSDocInfo(info);
        varNode.addChildToFront(nameNode);
        root.addChildToFront(varNode);
        creator.createScope(root, null);
        assertTrue(registry.isNonNullableName("MyEnum"));
    }

    @Test
    public void testDiscoverEnumsAndTypedefsTypedef() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "MyType");
        JSDocInfo info = new JSDocInfo();
        info.setTypedefType(registry.createStringType());
        nameNode.setJSDocInfo(info);
        varNode.addChildToFront(nameNode);
        root.addChildToFront(varNode);
        creator.createScope(root, null);
        assertTrue(registry.isNonNullableName("MyType"));
    }

    @Test
    public void testGetPrototypePropertyOwnerReturnsNullForNonGetProp() {
        Node n = new Node(Token.NAME);
        assertNull(TypedScopeCreator.getPrototypePropertyOwner(n));
    }

    @Test
    public void testGetPrototypePropertyOwnerReturnsOwnerForPrototype() {
        Node getProp = new Node(Token.GETPROP);
        Node owner = Node.newString(Token.NAME, "Foo");
        Node prop = Node.newString(Token.STRING, "prototype");
        getProp.addChildToFront(owner);
        getProp.addChildToFront(prop);
        Node outerGetProp = new Node(Token.GETPROP);
        outerGetProp.addChildToFront(getProp);
        outerGetProp.addChildToFront(Node.newString(Token.STRING, "bar"));
        assertNull(TypedScopeCreator.getPrototypePropertyOwner(outerGetProp));
    }

    @Test
    public void testGetBestJSDocInfoFromNode() {
        Node n = new Node(Token.SCRIPT);
        JSDocInfo info = new JSDocInfo();
        n.setJSDocInfo(info);
        assertEquals(info, TypedScopeCreator.getBestJSDocInfo(n));
    }

    @Test
    public void testGetBestJSDocInfoFromNameParent() {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode);
        JSDocInfo info = new JSDocInfo();
        parent.setJSDocInfo(info);
        assertEquals(info, TypedScopeCreator.getBestJSDocInfo(nameNode));
    }

    @Test
    public void testGetBestJSDocInfoFromAssignParent() {
        Node assign = new Node(Token.ASSIGN);
        JSDocInfo info = new JSDocInfo();
        assign.setJSDocInfo(info);
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = new Node(Token.NUMBER, 1.0);
        assign.addChildToFront(lhs);
        assign.addChildToFront(rhs);
        assertEquals(info, TypedScopeCreator.getBestJSDocInfo(lhs));
    }

    @Test
    public void testGetBestLValueForFunctionDeclaration() {
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "f");
        fnNode.addChildToFront(nameNode);
        assertEquals(nameNode, TypedScopeCreator.getBestLValue(fnNode));
    }

    @Test
    public void testGetBestLValueForNameParent() {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(nameNode);
        assertEquals(parent, TypedScopeCreator.getBestLValue(nameNode));
    }

    @Test
    public void testGetBestLValueForAssign() {
        Node assign = new Node(Token.ASSIGN);
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = new Node(Token.NUMBER, 1.0);
        assign.addChildToFront(lhs);
        assign.addChildToFront(rhs);
        assertEquals(lhs, TypedScopeCreator.getBestLValue(rhs));
    }

    @Test
    public void testGetBestLValueForObjectLitKey() {
        Node keyNode = Node.newString(Token.STRING, "key");
        Node parent = new Node(Token.STRING);
        parent.addChildToFront(keyNode);
        assertEquals(parent, TypedScopeCreator.getBestLValue(keyNode));
    }

    @Test
    public void testGetBestLValueReturnsNullForOther() {
        Node n = new Node(Token.NUMBER, 1.0);
        assertNull(TypedScopeCreator.getBestLValue(n));
    }

    @Test
    public void testGetBestLValueNameReturnsQualifiedName() {
        Node n = Node.newString(Token.NAME, "foo");
        assertEquals("foo", TypedScopeCreator.getBestLValueName(n));
    }

    @Test
    public void testGetBestLValueNameReturnsNullForNull() {
        assertNull(TypedScopeCreator.getBestLValueName(null));
    }

    @Test
    public void testCreateScopeWithVarDeclaration() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        varNode.addChildToFront(nameNode);
        root.addChildToFront(varNode);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("x"));
    }

    @Test
    public void testCreateScopeWithFunctionDeclaration() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "f");
        fnNode.addChildToFront(nameNode);
        root.addChildToFront(fnNode);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("f"));
    }

    @Test
    public void testCreateScopeWithObjectLiteralEnum() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "MyEnum");
        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(registry.createStringType());
        nameNode.setJSDocInfo(info);
        varNode.addChildToFront(nameNode);
        root.addChildToFront(varNode);
        Node objLit = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING, "A");
        key1.addChildToFront(new Node(Token.NUMBER, 1.0));
        objLit.addChildToFront(key1);
        nameNode.addChildToFront(objLit);
        Scope scope = creator.createScope(root, null);
        Var enumVar = scope.getVar("MyEnum");
        assertNotNull(enumVar);
        JSType type = enumVar.getType();
        assertTrue(type instanceof com.google.javascript.rhino.jstype.EnumType);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateScopeWithNullRootThrowsException() {
        creator.createScope(null, null);
    }

    @Test
    public void testStubDeclarationResolved() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node getProp = new Node(Token.GETPROP);
        Node owner = Node.newString(Token.NAME, "a");
        Node prop = Node.newString(Token.STRING, "b");
        getProp.addChildToFront(owner);
        getProp.addChildToFront(prop);
        exprResult.addChildToFront(getProp);
        root.addChildToFront(exprResult);
        Scope scope = creator.createScope(root, null);
        Var varB = scope.getVar("a.b");
        assertNull(varB);
    }

    @Test
    public void testCatchBlockDeclaresVariable() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node tryNode = new Node(Token.TRY);
        Node catchNode = new Node(Token.CATCH);
        Node catchName = Node.newString(Token.NAME, "e");
        catchNode.addChildToFront(catchName);
        tryNode.addChildToFront(catchNode);
        root.addChildToFront(tryNode);
        Scope scope = creator.createScope(root, null);
        assertNull(scope.getVar("e"));
    }

    @Test
    public void testCreateScopeWithMultipleVarDeclarations() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node varNode = new Node(Token.VAR);
        Node name1 = Node.newString(Token.NAME, "x");
        Node name2 = Node.newString(Token.NAME, "y");
        varNode.addChildToFront(name1);
        varNode.addChildToFront(name2);
        root.addChildToFront(varNode);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("x"));
        assertNotNull(scope.getVar("y"));
    }

    @Test
    public void testCreateScopeWithGlobalThis() {
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileName("test.js");
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "Window");
        JSDocInfo info = new JSDocInfo();
        info.setConstructor(true);
        nameNode.setJSDocInfo(info);
        varNode.addChildToFront(nameNode);
        root.addChildToFront(varNode);
        Node fnNode = new Node(Token.FUNCTION);
        nameNode.addChildToFront(fnNode);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("Window"));
    }

    @Test
    public void testGetNativeTypeFromRegistry() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNotNull(type);
        assertTrue(type.isNumberType());
    }
}