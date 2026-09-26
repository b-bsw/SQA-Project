package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.HashMap;
import java.util.Set;

public class TypeCheckTest {

    private AbstractCompiler compiler;
    private ReverseAbstractInterpreter reverseInterpreter;
    private JSTypeRegistry typeRegistry;
    private Scope topScope;
    private ScopeCreator scopeCreator;
    private CheckLevel reportMissingOverride;
    private CheckLevel reportUnknownTypes;
    private TypeCheck typeCheck;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        reverseInterpreter = new TestReverseAbstractInterpreter();
        typeRegistry = compiler.getTypeRegistry();
        topScope = null;
        scopeCreator = null;
        reportMissingOverride = CheckLevel.WARNING;
        reportUnknownTypes = CheckLevel.OFF;
        typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry,
                reportMissingOverride, reportUnknownTypes);
    }

    @Test
    public void testProcessWithNullScopeCreator() {
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, CheckLevel.WARNING, CheckLevel.OFF);
        try {
            tc.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testProcessWithNullTopScope() {
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, CheckLevel.WARNING, CheckLevel.OFF);
        try {
            tc.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testProcessForTestingCreatesScopeCreator() {
        Node jsRoot = new Node(Token.SCRIPT);
        Node externsAndJsRoot = new Node(Token.BLOCK);
        externsAndJsRoot.addChildToBack(jsRoot);
        TypeCheck tc = new TypeCheck(compiler, reverseInterpreter, typeRegistry, CheckLevel.WARNING, CheckLevel.OFF);
        Scope result = tc.processForTesting(null, jsRoot);
        assertNotNull(result);
    }

    @Test
    public void testCheckWithNullNode() {
        try {
            typeCheck.check(null, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testVisitNameWithParentFunction() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node name = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.FUNCTION);
        parent.addChildToBack(name);
        boolean result = typeCheck.visitName(t, name, parent);
        assertEquals(false, result);
    }

    @Test
    public void testVisitNameWithNullType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node name = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(name);
        boolean result = typeCheck.visitName(t, name, parent);
        assertEquals(true, result);
    }

    @Test
    public void testVisitNewWithNonConstructor() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.NEW);
        Node constructor = Node.newString(Token.NAME, "foo");
        n.addChildToBack(constructor);
        typeCheck.visitNew(t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitNewWithConstructor() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.NEW);
        Node constructor = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "Object");
        constructor.addChildToBack(obj);
        constructor.addChildToBack(Node.newString(Token.STRING, "prototype"));
        n.addChildToBack(constructor);
        typeCheck.visitNew(t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitCallWithNotCallable() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.CALL);
        Node child = new Node(Token.NUMBER);
        child.putIntProp(Node.SOURCENAME_PROP, 1);
        n.addChildToBack(child);
        typeCheck.visitCall(t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitGetPropWithPropertyAccessCheck() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node getProp = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME);
        objNode.setJSType(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        getProp.addChildToBack(objNode);
        getProp.addChildToBack(Node.newString(Token.STRING, "foo"));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(getProp);
        typeCheck.visitGetProp(t, getProp, parent);
        assertNotNull(getProp.getJSType());
    }

    @Test
    public void testVisitGetPropWithInexistentProperty() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node getProp = new Node(Token.GETPROP);
        Node objNode = new Node(Token.THIS);
        objNode.setJSType(typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        getProp.addChildToBack(objNode);
        getProp.addChildToBack(Node.newString(Token.STRING, "nonexistent"));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(getProp);
        typeCheck.visitGetProp(t, getProp, parent);
        assertNotNull(getProp.getJSType());
    }

    @Test
    public void testVisitFunctionWithConstructorAndInterface() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node functionNode = new Node(Token.FUNCTION);
        FunctionType functionType = FunctionType.forConstructor(typeRegistry, new Node(Token.NAME), null, null);
        functionNode.setJSType(functionType);
        typeCheck.visitFunction(t, functionNode);
        assertNotNull(functionNode.getJSType());
    }

    @Test
    public void testVisitFunctionWithInterface() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node functionNode = new Node(Token.FUNCTION);
        FunctionType functionType = FunctionType.forInterface(typeRegistry, new Node(Token.NAME), null);
        functionNode.setJSType(functionType);
        typeCheck.visitFunction(t, functionNode);
        assertNotNull(functionNode.getJSType());
    }

    @Test
    public void testEnsureTypedWithFunctionType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node functionNode = new Node(Token.FUNCTION);
        FunctionType functionType = FunctionType.forConstructor(typeRegistry, new Node(Token.NAME), null, null);
        typeCheck.ensureTyped(t, functionNode, functionType);
        assertNotNull(functionNode.getJSType());
    }

    @Test
    public void testEnsureTypedWithUnknownType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node nameNode = Node.newString(Token.NAME, "x");
        typeCheck.ensureTyped(t, nameNode, typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        assertNotNull(nameNode.getJSType());
    }

    @Test
    public void testGetTypedPercentReturnsZero() {
        double percent = typeCheck.getTypedPercent();
        assertEquals(0.0, percent, 0.001);
    }

    @Test
    public void testReportMissingProperties() {
        TypeCheck tc = typeCheck.reportMissingProperties(false);
        assertSame(typeCheck, tc);
    }

    @Test
    public void testCheckNoTypeCheckSectionEnter() {
        Node n = new Node(Token.SCRIPT);
        JSDocInfo info = new JSDocInfo();
        info.setNoTypeCheck(true);
        n.setJSDocInfo(info);
        typeCheck.checkNoTypeCheckSection(n, true);
        assertTrue(true);
    }

    @Test
    public void testCheckNoTypeCheckSectionExit() {
        Node n = new Node(Token.VAR);
        JSDocInfo info = new JSDocInfo();
        info.setNoTypeCheck(true);
        n.setJSDocInfo(info);
        typeCheck.checkNoTypeCheckSection(n, false);
        assertTrue(true);
    }

    @Test
    public void testShouldTraverseWithFunctionMaskingVariable() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "existingVar");
        functionNode.addChildToFront(nameNode);
        FunctionType functionType = FunctionType.forConstructor(typeRegistry, nameNode, null, null);
        functionNode.setJSType(functionType);
        boolean result = typeCheck.shouldTraverse(t, functionNode, null);
        assertTrue(result);
    }

    @Test
    public void testVisitBinaryOperatorWithAdd() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.ADD);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.ADD, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithSub() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.SUB);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.SUB, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithMul() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.MUL);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.MUL, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithDiv() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.DIV);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.DIV, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithMod() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.MOD);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.MOD, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithBitAnd() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.BITAND);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.BITAND, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithBitOr() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.BITOR);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.BITOR, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithLsh() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.LSH);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.LSH, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithRsh() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.RSH);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.RSH, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithUrsh() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.URSH);
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.URSH, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorWithDefault() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node n = new Node(Token.ASSIGN);
        Node left = new Node(Token.NAME);
        Node right = new Node(Token.NUMBER);
        n.addChildToBack(left);
        n.addChildToBack(right);
        typeCheck.visitBinaryOperator(Token.ASSIGN, t, n);
        assertNotNull(n.getJSType());
    }

    @Test
    public void testGetJSTypeReturnsUnknownType() {
        Node n = new Node(Token.NAME);
        JSType result = typeCheck.getJSType(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
    }

    @Test
    public void testGetJSTypeReturnsSetType() {
        Node n = new Node(Token.NUMBER);
        n.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        JSType result = typeCheck.getJSType(n);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
    }

    @Test
    public void testGetFunctionTypeReturnsUnknownType() {
        Node n = new Node(Token.NAME);
        FunctionType result = typeCheck.getFunctionType(n);
        assertNotNull(result);
    }

    @Test
    public void testGetFunctionTypeReturnsFunctionType() {
        Node n = new Node(Token.FUNCTION);
        FunctionType functionType = FunctionType.forConstructor(typeRegistry, new Node(Token.NAME), null, null);
        n.setJSType(functionType);
        FunctionType result = typeCheck.getFunctionType(n);
        assertSame(functionType, result);
    }

    @Test
    public void testGetFunctionTypeReturnsNull() {
        Node n = new Node(Token.NUMBER);
        n.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType result = typeCheck.getFunctionType(n);
        assertNull(result);
    }

    @Test
    public void testCheckEnumInitializerWithObjectLit() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key");
        Node propValue = new Node(Token.NUMBER);
        propValue.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        key.addChildToBack(propValue);
        objLit.addChildToBack(key);
        typeCheck.checkEnumInitializer(t, objLit, typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertNotNull(objLit.getJSType());
    }

    @Test
    public void testCheckEnumInitializerWithEnumType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node enumNode = new Node(Token.NAME);
        EnumType enumType = new EnumType(typeRegistry, new Node(Token.NAME), typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        enumNode.setJSType(enumType);
        typeCheck.checkEnumInitializer(t, enumNode, typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        assertNotNull(enumNode.getJSType());
    }

    @Test
    public void testVisitReturnWithEnclosingFunction() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node returnNode = new Node(Token.RETURN);
        Node function = new Node(Token.FUNCTION);
        FunctionType functionType = FunctionType.forConstructor(typeRegistry, new Node(Token.NAME), null, null);
        function.setJSType(functionType);
        t.traverseWithScope(function, topScope);
        typeCheck.visitReturn(t, returnNode);
        assertNotNull(returnNode.getJSType());
    }

    @Test
    public void testVisitReturnWithoutEnclosingFunction() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node returnNode = new Node(Token.RETURN);
        typeCheck.visitReturn(t, returnNode);
        assertNotNull(returnNode.getJSType());
    }

    @Test
    public void testVisitVarWithInferredType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "x");
        Node value = new Node(Token.NUMBER);
        name.addChildToBack(value);
        var.addChildToBack(name);
        Scope scope = new Scope(topScope, var);
        scope.declare(name.getString(), name, typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null, false);
        t.traverseWithScope(var, scope);
        typeCheck.visitVar(t, var);
        assertNotNull(name.getJSType());
    }

    @Test
    public void testVisitObjLitKeyWithValidProperty() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "prop");
        Node rvalue = new Node(Token.NUMBER);
        key.addChildToBack(rvalue);
        objLit.addChildToBack(key);
        ObjectType objType = typeRegistry.createAnonymousObjectType(null);
        objLit.setJSType(objType);
        typeCheck.visitObjLitKey(t, key, objLit);
        assertNotNull(key.getJSType());
    }

    @Test
    public void testPropertyIsImplicitCastWithDocInfo() {
        ObjectType objType = typeRegistry.createAnonymousObjectType(null);
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setImplicitCast(true);
        objType.setOwnPropertyJSDocInfo("prop", docInfo);
        boolean result = typeCheck.propertyIsImplicitCast(objType, "prop");
        assertTrue(result);
    }

    @Test
    public void testPropertyIsImplicitCastWithoutDocInfo() {
        ObjectType objType = typeRegistry.createAnonymousObjectType(null);
        boolean result = typeCheck.propertyIsImplicitCast(objType, "nonexistent");
        assertTrue(!result);
    }

    @Test
    public void testCheckPropertyAccessWithEnumType() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck, scopeCreator);
        Node getProp = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME);
        EnumType enumType = new EnumType(typeRegistry, new Node(Token.NAME), typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        objNode.setJSType(enumType);
        getProp.addChildToBack(objNode);
        getProp.addChildToBack(Node.newString(Token.STRING, "nonexistent"));
        JSType propType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        getProp.setJSType(propType);
        typeCheck.checkPropertyAccess(objNode.getJSType(), "nonexistent", t, getProp);
        assertNotNull(getProp.getJSType());
    }

    @Test
    public void testIsPropertyTestWithCall() {
        Node getProp = new Node(Token.GETPROP);
        Node call = new Node(Token.CALL);
        call.addChildToBack(Node.newString(Token.NAME, "propertyTestFunction"));
        call.addChildToBack(getProp);
        getProp.setParent(call);
        boolean result = typeCheck.isPropertyTest(getProp);
        assertTrue(result);
    }

    @Test
    public void testIsPropertyTestWithIf() {
        Node getProp = new Node(Token.GETPROP);
        Node ifNode = new Node(Token.IF);
        ifNode.addChildToBack(getProp);
        getProp.setParent(ifNode);
        boolean result = typeCheck.isPropertyTest(getProp);
        assertTrue(result);
    }

    @Test
    public void testIsPropertyTestWithInstanceOf() {
        Node getProp = new Node(Token.GETPROP);
        Node instanceOfNode = new Node(Token.INSTANCEOF);
        instanceOfNode.addChildToBack(getProp);
        getProp.setParent(instanceOfNode);
        boolean result = typeCheck.isPropertyTest(getProp);
        assertTrue(result);
    }

    @Test
    public void testIsPropertyTestWithTypeOf() {
        Node getProp = new Node(Token.GETPROP);
        Node typeOfNode = new Node(Token.TYPEOF);
        typeOfNode.addChildToBack(getProp);
        getProp.setParent(typeOfNode);
        boolean result = typeCheck.isPropertyTest(getProp);
        assertTrue(result);
    }

    @Test
    public void testIsPropertyTestWithAnd() {
        Node getProp = new Node(Token.GETPROP);
        Node andNode = new Node(Token.AND);
        andNode.addChildToBack(getProp);
        getProp.setParent(andNode);
        boolean result = typeCheck.isPropertyTest(getProp);
        assertTrue(result);
    }

    @Test
    public void testIsPropertyTestWithNot() {
        Node getProp = new Node(Token.GETPROP);
        Node notNode = new Node(Token.NOT);
        notNode.addChildToBack(getProp);
        Node orNode = new Node(Token.OR);
        orNode.addChildToBack(notNode);
        getProp.setParent(notNode);
        notNode.setParent(orNode);
        boolean result = typeCheck.isPropertyTest(getProp);
        assertTrue(result);
    }

    @Test
    public void testIsPropertyTestWithDefault() {
        Node getProp = new Node(Token.GETPROP);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(getProp);
        getProp.setParent(exprResult);
        boolean result = typeCheck.isPropertyTest(getProp);
        assertTrue(!result);
    }

    @Test
    public void testIsReferenceWithName() {
        Node name = Node.newString(Token.NAME, "x");
        boolean result = TypeCheck.isReference(name);
        assertTrue(result);
    }

    @Test
    public void testIsReferenceWithGetProp() {
        Node getProp = new Node(Token.GETPROP);
        boolean result = TypeCheck.isReference(getProp);
        assertTrue(result);
    }

    @Test
    public void testIsReferenceWithGetElem() {
        Node getElem = new Node(Token.GETELEM);
        boolean result = TypeCheck.isReference(getElem);
        assertTrue(result);
    }

    @Test
    public void testIsReferenceWithNumber() {
        Node number = new Node(Token.NUMBER);
        boolean result = TypeCheck.isReference(number);
        assertTrue(!result);
    }
}