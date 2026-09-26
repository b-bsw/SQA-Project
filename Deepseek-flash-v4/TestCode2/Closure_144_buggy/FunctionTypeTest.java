package com.google.javascript.rhino.jstype;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;
import java.util.HashMap;

public class FunctionTypeTest {

    private JSTypeRegistry registry;
    private Node mockNode;
    private ArrowType mockArrowType;
    private JSType mockReturnType;
    private ObjectType mockTypeOfThis;

    @Before
    public void setUp() {
        registry = new MockRegistry();
        mockNode = new Node(Token.FUNCTION);
        mockReturnType = new MockObjectType("returnType");
        mockTypeOfThis = new MockObjectType("typeOfThis");
        mockArrowType = new ArrowType(registry, new Node(Token.LP), mockReturnType);
    }

    @Test
    public void testOrdinaryFunction() {
        FunctionType func = new FunctionType(registry, "testFunction", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertFalse(func.isConstructor());
        assertFalse(func.isInterface());
        assertTrue(func.isOrdinaryFunction());
        assertTrue(func.isFunctionType());
        assertEquals("testFunction", func.getReferenceName());
    }

    @Test
    public void testConstructor() {
        FunctionType ctor = new FunctionType(registry, "TestCtor", mockNode,
                mockArrowType, null, null, true, false);
        assertTrue(ctor.isConstructor());
        assertFalse(ctor.isInterface());
        assertFalse(ctor.isOrdinaryFunction());
        assertTrue(ctor.hasInstanceType());
        assertNotNull(ctor.getInstanceType());
        assertTrue(ctor.getInstanceType() instanceof InstanceObjectType);
    }

    @Test
    public void testInterface() {
        FunctionType iface = FunctionType.forInterface(registry, "MyInterface", mockNode);
        assertFalse(iface.isConstructor());
        assertTrue(iface.isInterface());
        assertFalse(iface.isOrdinaryFunction());
        assertTrue(iface.hasInstanceType());
        assertEquals("MyInterface", iface.getReferenceName());
    }

    @Test
    public void testGetMinArguments() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME);
        p1.setOptionalArg(false);
        p1.setVarArgs(false);
        Node p2 = new Node(Token.NAME);
        p2.setOptionalArg(true);
        p2.setVarArgs(false);
        Node p3 = new Node(Token.NAME);
        p3.setOptionalArg(false);
        p3.setVarArgs(true);
        params.addChildToFront(p3);
        params.addChildToFront(p2);
        params.addChildToFront(p1);
        ArrowType arrow = new ArrowType(registry, params, mockReturnType);
        FunctionType func = new FunctionType(registry, "f", null, arrow, mockTypeOfThis, null, false, false);
        assertEquals(1, func.getMinArguments());
    }

    @Test
    public void testGetMinArgumentsAllOptional() {
        Node params = new Node(Token.LP);
        Node opt = new Node(Token.NAME);
        opt.setOptionalArg(true);
        params.addChildToFront(opt);
        ArrowType arrow = new ArrowType(registry, params, mockReturnType);
        FunctionType func = new FunctionType(registry, "f", null, arrow, mockTypeOfThis, null, false, false);
        assertEquals(0, func.getMinArguments());
    }

    @Test
    public void testGetMinArgumentsNoParams() {
        Node params = new Node(Token.LP);
        ArrowType arrow = new ArrowType(registry, params, mockReturnType);
        FunctionType func = new FunctionType(registry, "f", null, arrow, mockTypeOfThis, null, false, false);
        assertEquals(0, func.getMinArguments());
    }

    @Test
    public void testGetMaxArgumentsNoVarArgs() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME);
        p1.setVarArgs(false);
        Node p2 = new Node(Token.NAME);
        p2.setVarArgs(false);
        params.addChildToFront(p2);
        params.addChildToFront(p1);
        ArrowType arrow = new ArrowType(registry, params, mockReturnType);
        FunctionType func = new FunctionType(registry, "f", null, arrow, mockTypeOfThis, null, false, false);
        assertEquals(2, func.getMaxArguments());
    }

    @Test
    public void testGetMaxArgumentsWithVarArgs() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME);
        p1.setVarArgs(false);
        Node var = new Node(Token.NAME);
        var.setVarArgs(true);
        params.addChildToFront(var);
        params.addChildToFront(p1);
        ArrowType arrow = new ArrowType(registry, params, mockReturnType);
        FunctionType func = new FunctionType(registry, "f", null, arrow, mockTypeOfThis, null, false, false);
        assertEquals(Integer.MAX_VALUE, func.getMaxArguments());
    }

    @Test
    public void testSetPrototypeNullReturnsFalse() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertFalse(func.setPrototype(null));
    }

    @Test
    public void testSetPrototypeSuccess() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        FunctionPrototypeType proto = new FunctionPrototypeType(registry, func, null);
        assertTrue(func.setPrototype(proto));
        assertSame(proto, func.getPrototype());
    }

    @Test
    public void testHasPropertyPrototype() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertTrue(func.hasProperty("prototype"));
        assertTrue(func.hasOwnProperty("prototype"));
    }

    @Test
    public void testHasPropertyOther() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertFalse(func.hasProperty("someProp"));
        assertFalse(func.hasOwnProperty("someProp"));
    }

    @Test
    public void testGetPropertyTypePrototype() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        JSType protoType = func.getPropertyType("prototype");
        assertNotNull(protoType);
        assertTrue(protoType instanceof FunctionPrototypeType);
    }

    @Test
    public void testIsEquivalentToSameReference() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertTrue(func.isEquivalentTo(func));
    }

    @Test
    public void testIsEquivalentToDifferentKinds() {
        FunctionType ordinary = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        FunctionType ctor = new FunctionType(registry, "Ctor", mockNode,
                mockArrowType, null, null, true, false);
        assertFalse(ordinary.isEquivalentTo(ctor));
        assertFalse(ctor.isEquivalentTo(ordinary));
    }

    @Test
    public void testIsEquivalentToNonFunctionType() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        JSType nonFunc = new MockObjectType("nonFunc");
        assertFalse(func.isEquivalentTo(nonFunc));
    }

    @Test
    public void testGetReturnType() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertSame(mockReturnType, func.getReturnType());
    }

    @Test
    public void testGetTypeOfThisNoObjectType() {
        JSType noObj = new MockObjectType("noObject") {
            @Override public boolean isNoObjectType() { return true; }
        };
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP), mockReturnType);
        FunctionType func = new FunctionType(registry, "f", mockNode,
                arrow, (ObjectType) noObj, null, false, false);
        ObjectType result = func.getTypeOfThis();
        assertNotNull(result);
        assertEquals("OBJECT_TYPE", result.getReferenceName());
    }

    @Test
    public void testToString() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME);
        p1.setJSType(new MockObjectType("number"));
        Node p2 = new Node(Token.NAME);
        p2.setJSType(new MockObjectType("string"));
        params.addChildToFront(p2);
        params.addChildToFront(p1);
        ArrowType arrow = new ArrowType(registry, params, mockReturnType);
        FunctionType func = new FunctionType(registry, "f", null, arrow,
                mockTypeOfThis, null, false, false);
        String str = func.toString();
        assertTrue(str.startsWith("function ("));
        assertTrue(str.contains("): "));
        assertTrue(str.contains("number"));
        assertTrue(str.contains("string"));
    }

    @Test
    public void testGetSuperClassConstructorForConstructorWithoutSuper() {
        FunctionType ctor = new FunctionType(registry, "Ctor", mockNode,
                mockArrowType, null, null, true, false);
        assertNull(ctor.getSuperClassConstructor());
    }

    @Test
    public void testIsReturnTypeInferred() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP), mockReturnType, true);
        FunctionType func = new FunctionType(registry, "f", null, arrow,
                mockTypeOfThis, null, false, false);
        assertTrue(func.isReturnTypeInferred());
    }

    @Test
    public void testGetParameters() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME);
        p1.setJSType(new MockObjectType("number"));
        params.addChildToFront(p1);
        ArrowType arrow = new ArrowType(registry, params, mockReturnType);
        FunctionType func = new FunctionType(registry, "f", null, arrow,
                mockTypeOfThis, null, false, false);
        Iterable<Node> it = func.getParameters();
        assertNotNull(it);
        int count = 0;
        for (Node n : it) {
            count++;
        }
        assertEquals(1, count);
    }

    @Test
    public void testGetSubTypesInitiallyNull() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertNull(func.getSubTypes());
    }

    @Test
    public void testHasCachedValuesInitial() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertFalse(func.hasCachedValues());
    }

    @Test
    public void testGetTemplateTypeName() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, "T", false, false);
        assertEquals("T", func.getTemplateTypeName());
    }

    @Test
    public void testGetSource() {
        FunctionType func = new FunctionType(registry, "f", mockNode,
                mockArrowType, mockTypeOfThis, null, false, false);
        assertSame(mockNode, func.getSource());
    }

    // Inner stub classes

    static class MockRegistry extends JSTypeRegistry {
        private final Map<JSTypeNative, JSType> nativeTypes = new HashMap<>();

        public MockRegistry() {
            nativeTypes.put(JSTypeNative.U2U_CONSTRUCTOR_TYPE, new MockObjectType("U2U"));
            nativeTypes.put(JSTypeNative.FUNCTION_INSTANCE_TYPE, new MockObjectType("FunctionInstance"));
            nativeTypes.put(JSTypeNative.UNKNOWN_TYPE, new MockObjectType("Unknown"));
            nativeTypes.put(JSTypeNative.OBJECT_TYPE, new MockObjectType("OBJECT_TYPE"));
            nativeTypes.put(JSTypeNative.NO_OBJECT_TYPE, new MockObjectType("NoObject"));
            nativeTypes.put(JSTypeNative.FUNCTION_PROTOTYPE, new MockObjectType("FunctionPrototype"));
            nativeTypes.put(JSTypeNative.VOID_TYPE, new MockObjectType("Void"));
        }

        @Override
        public JSType getNativeType(JSTypeNative type) {
            return nativeTypes.get(type);
        }

        @Override
        public ObjectType getNativeObjectType(JSTypeNative type) {
            JSType t = nativeTypes.get(type);
            if (t instanceof ObjectType) return (ObjectType) t;
            MockObjectType obj = new MockObjectType(type.name());
            nativeTypes.put(type, obj);
            return obj;
        }

        @Override
        public JSType createOptionalNullableType(JSType type) {
            return type;
        }

        @Override
        public JSType createNullableType(JSType type) {
            return type;
        }

        @Override
        public void registerTypeImplementingInterface(FunctionType implementor, ObjectType iface) {
            // no-op
        }
    }

    static class MockObjectType extends ObjectType {
        private final String name;
        private boolean noObjectType;
        private boolean unknownType;

        public MockObjectType(String name) {
            super(null);
            this.name = name;
        }

        @Override
        public String getReferenceName() { return name; }

        @Override
        public boolean isNoObjectType() { return noObjectType; }
        public void setNoObjectType(boolean b) { noObjectType = b; }

        @Override
        public boolean isUnknownType() { return unknownType; }
        public void setUnknownType(boolean b) { unknownType = b; }

        @Override
        public String toString() { return name; }

        @Override
        public boolean isEquivalentTo(JSType other) {
            if (other instanceof MockObjectType) {
                return name.equals(((MockObjectType)other).name);
            }
            return false;
        }

        @Override
        public int hashCode() { return name.hashCode(); }

        @Override
        public JSType getLeastSupertype(JSType that) { return this; }

        @Override
        public JSType getGreatestSubtype(JSType that) { return this; }

        @Override
        public FunctionType getConstructor() { return null; }
    }
}