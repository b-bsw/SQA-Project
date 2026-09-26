package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testConstructorKind() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, arrow, typeOfThis, null, true, false);
        assertTrue(ctor.isConstructor());
        assertFalse(ctor.isInterface());
        assertFalse(ctor.isOrdinaryFunction());
        assertTrue(ctor.isFunctionType());
    }

    @Test
    public void testOrdinaryKind() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType func = new FunctionType(registry, "func", null, arrow, typeOfThis, null, false, false);
        assertFalse(func.isConstructor());
        assertTrue(func.isOrdinaryFunction());
    }

    @Test
    public void testInterfaceKind() {
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
    }

    @Test
    public void testGetMinArguments() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME, "a");
        p1.setOptionalArg(true);
        params.addChildToBack(p1);
        Node p2 = new Node(Token.NAME, "b");
        params.addChildToBack(p2);
        ArrowType arrow = new ArrowType(registry, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType func = new FunctionType(registry, "f", null, arrow, typeOfThis, null, false, false);
        assertEquals(1, func.getMinArguments());
    }

    @Test
    public void testGetMaxArgumentsWithoutVarArgs() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME, "a");
        params.addChildToBack(p1);
        ArrowType arrow = new ArrowType(registry, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType func = new FunctionType(registry, "f", null, arrow, typeOfThis, null, false, false);
        assertEquals(1, func.getMaxArguments());
    }

    @Test
    public void testGetMaxArgumentsWithVarArgs() {
        Node params = new Node(Token.LP);
        Node p1 = new Node(Token.NAME, "a");
        p1.setVarArgs(true);
        params.addChildToBack(p1);
        ArrowType arrow = new ArrowType(registry, params,
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType func = new FunctionType(registry, "f", null, arrow, typeOfThis, null, false, false);
        assertEquals(Integer.MAX_VALUE, func.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP), returnType);
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType func = new FunctionType(registry, "f", null, arrow, typeOfThis, null, false, false);
        assertSame(returnType, func.getReturnType());
    }

    @Test
    public void testSetPrototype() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, arrow, typeOfThis, null, true, false);
        FunctionPrototypeType proto = new FunctionPrototypeType(registry, ctor, null, false);
        assertTrue(ctor.setPrototype(proto));
        assertSame(proto, ctor.getPrototype());
    }

    @Test
    public void testSetPrototypeReturnsFalseForNull() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, arrow, typeOfThis, null, true, false);
        assertFalse(ctor.setPrototype(null));
    }

    @Test
    public void testGetTypeOfThisWithNoObjectType() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType noObj = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, arrow, noObj, null, true, false);
        ObjectType typeOfThis = ctor.getTypeOfThis();
        assertNotNull(typeOfThis);
        assertFalse(typeOfThis.isNoObjectType());
        assertTrue(typeOfThis.isObjectType());
    }

    @Test
    public void testHasInstanceType() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, arrow, typeOfThis, null, true, false);
        assertTrue(ctor.hasInstanceType());
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        assertTrue(iface.hasInstanceType());
        FunctionType ord = new FunctionType(registry, "ord", null, arrow, typeOfThis, null, false, false);
        assertFalse(ord.hasInstanceType());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullArrowTypeThrowsNullPointer() {
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        new FunctionType(registry, "f", null, null, typeOfThis, null, false, false);
    }

    @Test
    public void testSetImplementedInterfaces() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP),
                registry.getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        FunctionType ctor = new FunctionType(registry, "Ctor", null, arrow, typeOfThis, null, true, false);
        List<ObjectType> interfaces = new ArrayList<>();
        interfaces.add(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        ctor.setImplementedInterfaces(interfaces);
        Iterable<ObjectType> result = ctor.getImplementedInterfaces();
        assertNotNull(result);
        int count = 0;
        for (ObjectType ignored : result) {
            count++;
        }
        assertTrue(count > 0);
    }
}