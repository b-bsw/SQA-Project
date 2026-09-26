package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FunctionTypeTest {
    private JSTypeRegistry registry;
    private FunctionType ordinaryFunction;
    private FunctionType constructorFunction;
    private FunctionType interfaceFunction;

    @Before
    public void setUp() {
        registry = new TestRegistry();
        // Ordinary function: no constructor, no interface, with parameters
        Node params = new TestNode(Token.LP);
        params.addChildToBack(new TestNode(Token.NAME).setOptionalArg(true));
        params.addChildToBack(new TestNode(Token.NAME)); // required
        ArrowType arrow = new ArrowType(registry, params, new TestObjectType("return"), false);
        ordinaryFunction = new FunctionType(registry, "myFunc", null, arrow,
                new TestObjectType("thisType"), null, false, false);
        // Constructor function
        ArrowType ctorArrow = new ArrowType(registry, new TestNode(Token.LP), new TestObjectType("ctorReturn"), false);
        constructorFunction = new FunctionType(registry, "MyClass", null, ctorArrow,
                new TestObjectType("instance"), null, true, false);
        // Interface function via factory method
        interfaceFunction = FunctionType.forInterface(registry, "MyInterface", null);
    }

    @Test
    public void testOrdinaryFunction() {
        assertTrue(ordinaryFunction.isOrdinaryFunction());
        assertFalse(ordinaryFunction.isConstructor());
        assertFalse(ordinaryFunction.isInterface());
        assertTrue(ordinaryFunction.canBeCalled());
        assertTrue(ordinaryFunction.hasInstanceType() == false);
    }

    @Test
    public void testConstructorFunction() {
        assertTrue(constructorFunction.isConstructor());
        assertFalse(constructorFunction.isOrdinaryFunction());
        assertFalse(constructorFunction.isInterface());
        assertTrue(constructorFunction.hasInstanceType());
        assertNotNull(constructorFunction.getInstanceType());
    }

    @Test
    public void testInterfaceFunction() {
        assertTrue(interfaceFunction.isInterface());
        assertFalse(interfaceFunction.isConstructor());
        assertFalse(interfaceFunction.isOrdinaryFunction());
        assertTrue(interfaceFunction.hasInstanceType());
        assertEquals("MyInterface", interfaceFunction.getReferenceName());
    }

    @Test
    public void testGetMinArguments() {
        // ordinaryFunction has one optional and one required param => min=1 after iteration
        assertEquals(1, ordinaryFunction.getMinArguments());
        // constructorFunction has empty params => min=0
        assertEquals(0, constructorFunction.getMinArguments());
    }

    @Test
    public void testGetMaxArguments() {
        // ordinaryFunction has no varargs => childCount=2
        assertEquals(2, ordinaryFunction.getMaxArguments());
        // constructorFunction has no children => childCount=0
        assertEquals(0, constructorFunction.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        assertEquals("return", ordinaryFunction.getReturnType().toString());
        assertEquals("ctorReturn", constructorFunction.getReturnType().toString());
    }

    @Test
    public void testGetPrototype() {
        assertNotNull(ordinaryFunction.getPrototype());
        // Should be a PrototypeObjectType
        assertTrue(ordinaryFunction.getPrototype() instanceof PrototypeObjectType);
    }

    @Test
    public void testSetPrototypeNull() {
        assertFalse(ordinaryFunction.setPrototype(null));
    }

    @Test
    public void testSetPrototypeConstructorSameAsInstance() {
        // For a constructor, setting prototype equal to instance type should return false
        ObjectType instanceType = constructorFunction.getInstanceType();
        assertNotNull(instanceType);
        assertTrue(instanceType instanceof PrototypeObjectType);
        assertFalse(constructorFunction.setPrototype((PrototypeObjectType) instanceType));
    }

    @Test
    public void testHasImplementedInterfacesEmpty() {
        assertFalse(ordinaryFunction.hasImplementedInterfaces());
    }

    @Test
    public void testHasImplementedInterfacesWithInterfaces() {
        List<ObjectType> interfaces = Arrays.asList(new TestObjectType("Iface1"), new TestObjectType("Iface2"));
        ordinaryFunction.setImplementedInterfaces(interfaces);
        assertTrue(ordinaryFunction.hasImplementedInterfaces());
    }

    @Test
    public void testSetExtendedInterfacesOnNonInterfaceThrows() {
        try {
            ordinaryFunction.setExtendedInterfaces(Arrays.asList(new TestObjectType("Iface")));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetExtendedInterfacesOnInterface() {
        List<ObjectType> interfaces = Arrays.asList(new TestObjectType("ExtIface"));
        interfaceFunction.setExtendedInterfaces(interfaces);
        assertEquals(1, interfaceFunction.getExtendedInterfacesCount());
    }

    @Test
    public void testGetPropertyTypeCallWhenNotOwn() {
        JSType callType = ordinaryFunction.getPropertyType("call");
        assertNotNull(callType);
        assertTrue(callType instanceof FunctionType);
    }

    @Test
    public void testGetPropertyTypeApplyWhenNotOwn() {
        JSType applyType = ordinaryFunction.getPropertyType("apply");
        assertNotNull(applyType);
        assertTrue(applyType instanceof FunctionType);
    }

    @Test
    public void testDefinePropertyPrototypeWithObjectType() {
        ObjectType obj = new TestObjectType("prototypeObj");
        assertTrue(ordinaryFunction.defineProperty("prototype", obj, false, null));
        assertEquals(obj, ordinaryFunction.getPrototype());
    }

    @Test
    public void testDefinePropertyPrototypeWithNonObjectReturnsFalse() {
        JSType nonObj = new JSType(registry) { };
        assertFalse(ordinaryFunction.defineProperty("prototype", nonObj, false, null));
    }

    @Test
    public void testIsEquivalentToConstructors() {
        // Two constructors equal only if same reference
        assertTrue(constructorFunction.isEquivalentTo(constructorFunction));
        assertFalse(constructorFunction.isEquivalentTo(ordinaryFunction));
    }

    @Test
    public void testIsEquivalentToInterfaces() {
        FunctionType anotherInterface = FunctionType.forInterface(registry, "MyInterface", null);
        assertTrue(interfaceFunction.isEquivalentTo(anotherInterface));
    }

    @Test
    public void testIsEquivalentToOrdinary() {
        // Two ordinary functions with same typeOfThis and same call
        FunctionType otherOrdinary = new FunctionType(registry, "other", null,
                ordinaryFunction.getInternalArrowType(),
                ordinaryFunction.getTypeOfThis(), null, false, false);
        assertTrue(ordinaryFunction.isEquivalentTo(otherOrdinary));
    }

    @Test
    public void testIsSubtypeToInterfaceReturnsTrue() {
        assertTrue(ordinaryFunction.isSubtype(interfaceFunction));
    }

    @Test
    public void testIsSubtypeNullThat() {
        // That is not a function type => will go to else branch and call getNativeType(...).isSubtype(that)
        JSType nonFunction = registry.getNativeType(JSTypeNative.VOID_TYPE);
        assertFalse(ordinaryFunction.isSubtype(nonFunction));
    }

    @Test
    public void testToStringOrdinary() {
        String str = ordinaryFunction.toString();
        assertTrue(str.startsWith("function ("));
        assertTrue(str.contains("this:thisType"));
        assertTrue(str.contains("): return"));
    }

    @Test
    public void testToStringFunctionInstance() {
        // Case where this is the built-in function instance
        FunctionType fnInstance = (FunctionType) registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertEquals("Function", fnInstance.toString());
    }

    // Stub implementations for testing (Plain Java Objects)
    private static class TestRegistry extends JSTypeRegistry {
        public TestRegistry() {
            super(null, null);
        }
        @Override
        public ObjectType getNativeObjectType(JSTypeNative type) {
            return new TestObjectType(type.name());
        }
        @Override
        public JSType getNativeType(JSTypeNative type) {
            if (type == JSTypeNative.FUNCTION_INSTANCE_TYPE) {
                return new TestObjectType("Function");
            }
            return new TestObjectType(type.name());
        }
        @Override
        public FunctionType getNativeFunctionType(JSTypeNative type) {
            return new FunctionType(this, type.name(), null,
                    new ArrowType(this, new TestNode(Token.LP), new TestObjectType("return"), false),
                    new TestObjectType("this"), null, false, false);
        }
        @Override
        public JSType createNullableType(JSType type) {
            return type;
        }
        @Override
        public JSType createOptionalNullableType(JSType type) {
            return type;
        }
        @Override
        public void registerTypeImplementingInterface(FunctionType implementor, ObjectType interfaceType) {
            // no-op
        }
    }

    private static class TestObjectType extends PrototypeObjectType {
        private final String name;
        public TestObjectType(String name) {
            super(null, name, null, false);
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
        @Override
        public boolean isEquivalentTo(JSType that) {
            if (that instanceof TestObjectType) {
                return name.equals(((TestObjectType) that).name);
            }
            return false;
        }
        @Override
        public FunctionType getConstructor() {
            return null;
        }
        @Override
        public Iterable<ObjectType> getCtorExtendedInterfaces() {
            return java.util.Collections.emptyList();
        }
        @Override
        public boolean hasProperty(String name) {
            return false;
        }
    }

    private static class TestNode extends Node {
        private boolean optionalArg;
        private boolean varArgs;
        public TestNode(int type) {
            super(type);
        }
        public TestNode setOptionalArg(boolean optional) {
            this.optionalArg = optional;
            return this;
        }
        @Override
        public boolean isOptionalArg() {
            return optionalArg;
        }
        @Override
        public boolean isVarArgs() {
            return varArgs;
        }
        public TestNode setVarArgs(boolean var) {
            this.varArgs = var;
            return this;
        }
        @Override
        public Node cloneTree() {
            TestNode clone = new TestNode(this.getType());
            clone.optionalArg = this.optionalArg;
            clone.varArgs = this.varArgs;
            return clone;
        }
    }
}