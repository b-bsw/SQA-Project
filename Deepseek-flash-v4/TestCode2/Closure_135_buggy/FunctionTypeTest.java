package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.StaticScope;

public class FunctionTypeTest {

    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;

    @Before
    public void setUp() {
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(errorReporter);
    }

    private Node createParamNode(boolean isOptional, boolean isVarArgs) {
        Node param = new Node(Token.NAME, "param");
        param.setOptionalArg(isOptional);
        param.setVarArgs(isVarArgs);
        return param;
    }

    private Node createParamList(Node... params) {
        Node paramList = new Node(Token.PARAM_LIST);
        for (Node p : params) {
            paramList.addChildToBack(p);
        }
        return paramList;
    }

    // ---------- Test ordinary function ----------
    @Test
    public void testOrdinaryFunction() {
        Node params = createParamList(createParamNode(false, false));
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType func = new FunctionType(registry, "testFunc", null, params, returnType);
        assertTrue(func.isOrdinaryFunction());
        assertFalse(func.isConstructor());
        assertFalse(func.isInterface());
        assertTrue(func.isFunctionType());
        assertTrue(func.canBeCalled());
        assertNotNull(func.getParameters());
        assertEquals(1, func.getMinArguments());
        assertEquals(1, func.getMaxArguments());
        assertEquals(returnType, func.getReturnType());
    }

    // ---------- Test constructor function ----------
    @Test
    public void testConstructorFunction() {
        Node params = createParamList();
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType func = new FunctionType(registry, "MyConstructor", null, params,
                returnType, typeOfThis, null, true, false);
        assertTrue(func.isConstructor());
        assertFalse(func.isOrdinaryFunction());
        assertFalse(func.isInterface());
        assertTrue(func.hasInstanceType());
        assertNotNull(func.getInstanceType());
        assertNotNull(func.getPrototype());
    }

    // ---------- Test interface function ----------
    @Test
    public void testInterfaceFunction() {
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = new FunctionType(registry, "MyInterface", source);
        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
        assertTrue(iface.isFunctionType());
        assertTrue(iface.canBeCalled());
        assertNull(iface.getReturnType());
        assertNull(iface.getParametersNode());
        assertNotNull(iface.getPrototype());
    }

    // ---------- Test getMinArguments / getMaxArguments ----------
    @Test
    public void testMinMaxArguments() {
        // no params
        FunctionType func = new FunctionType(registry, "f", null,
                createParamList(), registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(0, func.getMinArguments());
        assertEquals(0, func.getMaxArguments());

        // one required param
        func = new FunctionType(registry, "f", null,
                createParamList(createParamNode(false, false)),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(1, func.getMinArguments());
        assertEquals(1, func.getMaxArguments());

        // optional param
        func = new FunctionType(registry, "f", null,
                createParamList(createParamNode(true, false)),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(0, func.getMinArguments());
        assertEquals(1, func.getMaxArguments());

        // varargs param
        func = new FunctionType(registry, "f", null,
                createParamList(createParamNode(false, true)),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(0, func.getMinArguments());
        assertEquals(Integer.MAX_VALUE, func.getMaxArguments());

        // required + varargs
        func = new FunctionType(registry, "f", null,
                createParamList(createParamNode(false, false), createParamNode(false, true)),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(1, func.getMinArguments());
        assertEquals(Integer.MAX_VALUE, func.getMaxArguments());
    }

    // ---------- Test getPrototype lazy creation ----------
    @Test
    public void testGetPrototypeLazy() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertNotNull(func.getPrototype());
        assertSame(func.getPrototype(), func.getPrototype());
    }

    // ---------- Test setPrototype ----------
    @Test
    public void testSetPrototype() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionPrototypeType newProto = new FunctionPrototypeType(registry, func, null);
        assertTrue(func.setPrototype(newProto));
        assertSame(newProto, func.getPrototype());

        // null prototype returns false
        assertFalse(func.setPrototype(null));
    }

    @Test
    public void testSetPrototypeForConstructor() {
        Node params = createParamList();
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        ObjectType instanceType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, params, returnType,
                instanceType, null, true, false);
        FunctionPrototypeType proto = ctor.getPrototype();
        assertNotNull(proto);
        // Setting prototype to the same as getInstanceType() should fail
        // getInstanceType() returns InstanceObjectType, not FunctionPrototypeType,
        // so the condition may never be true, but we test that setPrototype works.
        assertTrue(ctor.setPrototype(new FunctionPrototypeType(registry, ctor, null)));
    }

    // ---------- Test setPrototypeBasedOn ----------
    @Test
    public void testSetPrototypeBasedOn() {
        Node params = createParamList();
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        ObjectType baseType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType func = new FunctionType(registry, "Test", null, params, returnType);
        func.setPrototypeBasedOn(baseType);
        assertNotNull(func.getPrototype());
        assertEquals(baseType, func.getPrototype().getImplicitPrototype());
    }

    // ---------- Test equals / hashCode ----------
    @Test
    public void testEquals() {
        Node params1 = createParamList(createParamNode(false, false));
        JSType ret1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType f1 = new FunctionType(registry, "f1", null, params1, ret1);
        FunctionType f2 = new FunctionType(registry, "f2", null, params1, ret1);
        // ordinary functions with same call and same typeOfThis (unknown) should be equal
        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));

        // different return type -> not equal
        FunctionType f3 = new FunctionType(registry, "f3", null, params1,
                registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertFalse(f1.equals(f3));

        // constructor vs ordinary -> not equal
        FunctionType ctor = new FunctionType(registry, "f1", null, params1, ret1,
                registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), null, true, false);
        assertFalse(f1.equals(ctor));
        assertFalse(ctor.equals(f1));

        // two constructors with same names -> not equal (reference equality)
        FunctionType ctor2 = new FunctionType(registry, "f1", null, params1, ret1,
                registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), null, true, false);
        assertFalse(ctor.equals(ctor2));

        // interface equality by name
        FunctionType iface1 = new FunctionType(registry, "MyInterface", null);
        FunctionType iface2 = new FunctionType(registry, "MyInterface", null);
        assertTrue(iface1.equals(iface2));
        FunctionType iface3 = new FunctionType(registry, "Other", null);
        assertFalse(iface1.equals(iface3));

        // non-FunctionType objects
        assertFalse(f1.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        FunctionType iface = new FunctionType(registry, "Iface", null);
        FunctionType iface2 = new FunctionType(registry, "Iface", null);
        assertEquals(iface.hashCode(), iface2.hashCode());

        FunctionType ordinary = new FunctionType(registry, "f", null,
                createParamList(), registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertNotNull(ordinary.hashCode()); // just ensure no exception
    }

    // ---------- Test hasEqualCallType ----------
    @Test
    public void testHasEqualCallType() {
        Node params = createParamList(createParamNode(false, false));
        JSType ret = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType f1 = new FunctionType(registry, "f1", null, params, ret);
        FunctionType f2 = new FunctionType(registry, "f2", null, params, ret);
        assertTrue(f1.hasEqualCallType(f2));

        FunctionType f3 = new FunctionType(registry, "f3", null, params,
                registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertFalse(f1.hasEqualCallType(f3));
    }

    // ---------- Test getPropertyType (prototype, call, apply) ----------
    @Test
    public void testGetPropertyTypePrototype() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        JSType proto = func.getPropertyType("prototype");
        assertNotNull(proto);
        assertTrue(proto instanceof FunctionPrototypeType);
        assertSame(func.getPrototype(), proto);
    }

    @Test
    public void testGetPropertyTypeCall() {
        Node params = createParamList(createParamNode(false, false));
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        JSType callType = func.getPropertyType("call");
        assertNotNull(callType);
        assertTrue(callType instanceof FunctionType);
        FunctionType callFunc = (FunctionType) callType;
        // should have added 'this' param as first optional
        assertNotNull(callFunc.getParametersNode());
        // after first access, property should be defined
        assertTrue(func.hasProperty("call"));
    }

    @Test
    public void testGetPropertyTypeApply() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        JSType applyType = func.getPropertyType("apply");
        assertNotNull(applyType);
        assertTrue(applyType instanceof FunctionType);
    }

    // ---------- Test defineProperty (prototype case) ----------
    @Test
    public void testDefinePropertyPrototype() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType newProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertTrue(func.defineProperty("prototype", newProto, false, false));
        // after define, prototype should be a FunctionPrototypeType wrapping that object type
        assertNotNull(func.getPrototype());
        assertEquals(newProto, func.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testDefinePropertyNonPrototype() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(func.defineProperty("x", numType, false, false));
        assertTrue(func.hasProperty("x"));
        assertEquals(numType, func.getPropertyType("x"));
    }

    // ---------- Test toString ----------
    @Test
    public void testToStringOrdinary() {
        Node params = createParamList(createParamNode(false, false));
        FunctionType func = new FunctionType(registry, "Test", null, params,
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        String str = func.toString();
        assertTrue(str.startsWith("function ("));
        assertTrue(str.contains("): number"));
        // no 'this:' because typeOfThis is unknown
        assertFalse(str.contains("this:"));
    }

    @Test
    public void testToStringWithThis() {
        Node params = createParamList();
        ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType func = new FunctionType(registry, "Test2", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE), thisType);
        assertTrue(func.toString().contains("this:"));
    }

    @Test
    public void testToStringFunctionInstance() {
        JSType funcInst = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertEquals("Function", funcInst.toString());
    }

    // ---------- Test isSubtype ----------
    @Test
    public void testIsSubtype() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "f", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        // equal
        assertTrue(func.isSubtype(func));
        // function instance type
        JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertTrue(func.isSubtype(functionInstance));
        // interface -> returns true
        FunctionType iface = new FunctionType(registry, "Iface", null);
        assertTrue(func.isSubtype(iface));
        // if this is interface, that is not interface -> false
        assertFalse(iface.isSubtype(func));
        // non-function type
        JSType objType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertFalse(func.isSubtype(objType));
    }

    // ---------- Test getLeastSupertype ----------
    @Test
    public void testGetLeastSupertype() {
        Node params = createParamList(createParamNode(false, false));
        FunctionType f1 = new FunctionType(registry, "f1", null, params,
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType f2 = new FunctionType(registry, "f2", null, params,
                registry.getNativeType(JSTypeNative.STRING_TYPE));
        JSType least = f1.getLeastSupertype(f2);
        assertNotNull(least);
        assertEquals(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), least);
    }

    // ---------- Test getGreatestSubtype ----------
    @Test
    public void testGetGreatestSubtype() {
        Node params = createParamList(createParamNode(false, false));
        FunctionType f1 = new FunctionType(registry, "f1", null, params,
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType f2 = new FunctionType(registry, "f2", null, params,
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        JSType greatest = f1.getGreatestSubtype(f2);
        // equal functions return this
        assertEquals(f1, greatest);
    }

    // ---------- Test getSuperClassConstructor ----------
    @Test
    public void testGetSuperClassConstructor() {
        Node params = createParamList();
        JSType ret = registry.getNativeType(JSTypeNative.VOID_TYPE);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType parent = new FunctionType(registry, "Parent", null, params, ret,
                objType, null, true, false);
        FunctionType child = new FunctionType(registry, "Child", null, params, ret,
                objType, null, true, false);
        child.setPrototypeBasedOn(parent.getInstanceType());
        assertEquals(parent, child.getSuperClassConstructor());
    }

    // ---------- Test hasUnknownSupertype ----------
    @Test
    public void testHasUnknownSupertype() {
        Node params = createParamList();
        JSType ret = registry.getNativeType(JSTypeNative.VOID_TYPE);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType func = new FunctionType(registry, "Test", null, params, ret,
                objType, null, true, false);
        assertFalse(func.hasUnknownSupertype());
    }

    // ---------- Test getTopMostDefiningType ----------
    @Test
    public void testGetTopMostDefiningType() {
        Node params = createParamList();
        JSType ret = registry.getNativeType(JSTypeNative.VOID_TYPE);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType parent = new FunctionType(registry, "Parent", null, params, ret,
                objType, null, true, false);
        FunctionType child = new FunctionType(registry, "Child", null, params, ret,
                objType, null, true, false);
        child.setPrototypeBasedOn(parent.getInstanceType());
        // define a property on parent prototype
        parent.getPrototype().defineDeclaredProperty("prop",
                registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
        // the property exists on parent's prototype; child's prototype inherits it
        // getTopMostDefiningType should return parent's instance type
        JSType top = child.getTopMostDefiningType("prop");
        assertNotNull(top);
        assertEquals(parent.getInstanceType(), top);
    }

    // ---------- Test isInstanceType ----------
    @Test
    public void testIsInstanceType() {
        JSType u2u = registry.getNativeType(U2U_CONSTRUCTOR_TYPE);
        assertTrue(u2u.isInstanceType()); // U2U_CONSTRUCTOR_TYPE is a FunctionType that equals itself
        // ordinary function is not instance type
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "f", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(func.isInstanceType());
    }

    // ---------- Test getTypeOfThis ----------
    @Test
    public void testGetTypeOfThis() {
        Node params = createParamList();
        // ordinary: typeOfThis is unknown, getTypeOfThis returns OBJECT_TYPE
        FunctionType func = new FunctionType(registry, "f", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
                func.getTypeOfThis());

        // constructor with explicit noObjectType -> returns OBJECT_TYPE
        ObjectType noObj = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE), noObj, null, true, false);
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
                ctor.getTypeOfThis());
    }

    // ---------- Test source get/set ----------
    @Test
    public void testSource() {
        Node source = new Node(Token.FUNCTION);
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "f", source, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(source, func.getSource());
        Node newSource = new Node(Token.FUNCTION);
        func.setSource(newSource);
        assertEquals(newSource, func.getSource());
    }

    // ---------- Test getTemplateTypeName ----------
    @Test
    public void testTemplateTypeName() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "f", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE), null, "T");
        assertEquals("T", func.getTemplateTypeName());
    }

    // ---------- Test hasCachedValues ----------
    @Test
    public void testHasCachedValues() {
        Node params = createParamList();
        FunctionType func = new FunctionType(registry, "f", null, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertFalse(func.hasCachedValues());
        func.getPrototype(); // creates prototype cache
        assertTrue(func.hasCachedValues());
    }

    // ---------- Test getSubTypes ----------
    @Test
    public void testGetSubTypes() {
        Node params = createParamList();
        JSType ret = registry.getNativeType(JSTypeNative.VOID_TYPE);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType parent = new FunctionType(registry, "Parent", null, params, ret,
                objType, null, true, false);
        FunctionType child = new FunctionType(registry, "Child", null, params, ret,
                objType, null, true, false);
        child.setPrototypeBasedOn(parent.getInstanceType());
        // parent.addSubType is called inside child.setPrototype? Actually setPrototype calls addSubType for constructor/interface
        // But we use setPrototypeBasedOn which does not call setPrototype? It calls setPrototype( new FunctionPrototypeType(...)) internally? No, setPrototypeBasedOn creates a new FunctionPrototypeType and then calls setPrototype(prototype) eventually? Let's check: setPrototypeBasedOn: if prototype == null { setPrototype(new FunctionPrototypeType(registry, this, baseType, isNativeObjectType())); } else { prototype.setImplicitPrototype(baseType); }
        // setPrototype then calls addSubType if isConstructor or isInterface and superClass exists.
        // So child.setPrototypeBasedOn will set child's prototype, and then setPrototype will call parent.addSubType(child) because parent is superClass?
        // Actually setPrototype does: if (isConstructor() || isInterface()) { FunctionType superClass = getSuperClassConstructor(); if (superClass != null) { superClass.addSubType(this); } }
        // But at the time of setPrototypeBasedOn, child's prototype is new, and child.getSuperClassConstructor() should return null because child's prototype's implicit prototype is baseType (which is parent.getInstanceType()) but parent.getInstanceType()'s constructor is parent. However, child.getSuperClassConstructor() relies on getPrototype().getImplicitPrototype().getConstructor(). At the time of setPrototypeBasedOn, we are inside that method and before we set the prototype, getPrototype() returns null? Actually the first condition in setPrototypeBasedOn: if (prototype == null) { setPrototype(new FunctionPrototypeType(...)); } else { ... }. So it calls setPrototype which will compute superClass. At that moment, child.prototype is null, so getPrototype() will lazy-init? Wait, setPrototype is a method that sets this.prototype. But before that, we don't have a prototype, so superClass computation might be flawed. However, after setPrototypeBasedOn completes, child's prototype is set and superClass should be parent. So we can test getSubTypes on parent after that.
        assertNotNull(parent.getSubTypes());
        // After setPrototypeBasedOn, parent should have child in subTypes
        assertTrue(parent.getSubTypes().contains(child));
    }

    // ---------- Test resolveInternal ----------
    @Test
    public void testResolveInternal() {
        Node params = createParamList();
        JSType ret = registry.getNativeType(JSTypeNative.VOID_TYPE);
        FunctionType func = new FunctionType(registry, "f", null, params, ret);
        final StaticScope<JSType> scope = new StaticScope<JSType>() {
            @Override
            public StaticScope<JSType> getParentScope() { return null; }
            @Override
            public StaticSlot<JSType> getSlot(String name) { return null; }
            @Override
            public StaticSlot<JSType> getOwnSlot(String name) { return null; }
        };
        JSType resolved = func.resolveInternal(errorReporter, scope);
        assertSame(func, resolved);
        // also verify that call, prototype, typeOfThis were resolved
        assertNotNull(func.getReturnType()); // should still be void
    }
}