package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.util.List;
import java.util.ArrayList;

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
    public void testConstructorWithOrdinaryFunction() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "testFn", null, arrowType, null, null, false, false);
        assertFalse(fn.isConstructor());
        assertFalse(fn.isInterface());
        assertTrue(fn.isOrdinaryFunction());
        assertTrue(fn.isFunctionType());
        assertTrue(fn.canBeCalled());
    }
    
    @Test
    public void testConstructorWithConstructorType() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "Test", null, arrowType, null, null, true, false);
        assertTrue(fn.isConstructor());
        assertFalse(fn.isInterface());
        assertFalse(fn.isOrdinaryFunction());
        assertTrue(fn.hasInstanceType());
    }
    
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullArrowType() {
        new FunctionType(registry, "test", null, null, null, null, false, false);
    }
    
    @Test
    public void testConstructorWithInvalidSource() {
        Node invalidSource = new Node(Token.ADD);
        try {
            ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
            new FunctionType(registry, "test", invalidSource, arrowType, null, null, false, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testForInterface() {
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = FunctionType.forInterface(registry, "MyInterface", source);
        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
        assertTrue(iface.hasInstanceType());
    }
    
    @Test
    public void testGetParametersNode() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertNotNull(fn.getParametersNode());
    }
    
    @Test
    public void testGetMinArgumentsWithNoParameters() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(0, fn.getMinArguments());
    }
    
    @Test
    public void testGetMinArgumentsWithOptionalAndVarArgs() {
        Node params = new Node(Token.LP);
        Node param1 = Node.newString(Token.NAME, "a");
        param1.setOptionalArg(true);
        params.addChildToBack(param1);
        Node param2 = Node.newString(Token.NAME, "b");
        param2.setVarArgs(true);
        params.addChildToBack(param2);
        ArrowType arrowType = new ArrowType(registry, params, null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(0, fn.getMinArguments());
    }
    
    @Test
    public void testGetMinArgumentsWithRequiredParams() {
        Node params = new Node(Token.LP);
        Node param1 = Node.newString(Token.NAME, "a");
        params.addChildToBack(param1);
        Node param2 = Node.newString(Token.NAME, "b");
        param2.setOptionalArg(true);
        params.addChildToBack(param2);
        ArrowType arrowType = new ArrowType(registry, params, null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(1, fn.getMinArguments());
    }
    
    @Test
    public void testGetMaxArgumentsWithNoParams() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(0, fn.getMaxArguments());
    }
    
    @Test
    public void testGetMaxArgumentsWithVarArgs() {
        Node params = new Node(Token.LP);
        Node param = Node.newString(Token.NAME, "a");
        param.setVarArgs(true);
        params.addChildToBack(param);
        ArrowType arrowType = new ArrowType(registry, params, null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
    }
    
    @Test
    public void testGetMaxArgumentsWithFixedParams() {
        Node params = new Node(Token.LP);
        params.addChildToBack(Node.newString(Token.NAME, "a"));
        params.addChildToBack(Node.newString(Token.NAME, "b"));
        ArrowType arrowType = new ArrowType(registry, params, null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(2, fn.getMaxArguments());
    }
    
    @Test
    public void testGetReturnType() {
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), returnType);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(returnType, fn.getReturnType());
    }
    
    @Test
    public void testIsReturnTypeInferred() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertFalse(fn.isReturnTypeInferred());
    }
    
    @Test
    public void testGetPrototype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        assertNotNull(fn.getPrototype());
        assertTrue(fn.getPrototype() instanceof FunctionPrototypeType);
    }
    
    @Test
    public void testSetPrototypeBasedOnWithNullPrototype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        ObjectType baseType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        fn.setPrototypeBasedOn(baseType);
        assertNotNull(fn.getPrototype());
    }
    
    @Test
    public void testSetPrototypeNull() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        assertFalse(fn.setPrototype(null));
    }
    
    @Test
    public void testSetPrototypeWithInstanceType() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        ObjectType instanceType = fn.getInstanceType();
        FunctionPrototypeType proto = new FunctionPrototypeType(registry, fn, null);
        assertTrue(fn.setPrototype(proto));
    }
    
    @Test
    public void testSetPrototypeSameAsInstanceType() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        FunctionPrototypeType proto = fn.getPrototype();
        assertFalse(fn.setPrototype(proto));
    }
    
    @Test
    public void testSetImplementedInterfaces() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        List<ObjectType> interfaces = new ArrayList<>();
        fn.setImplementedInterfaces(interfaces);
        assertFalse(fn.getAllImplementedInterfaces().iterator().hasNext());
    }
    
    @Test
    public void testHasPropertyPrototype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        assertTrue(fn.hasProperty("prototype"));
    }
    
    @Test
    public void testHasOwnPropertyPrototype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        assertTrue(fn.hasOwnProperty("prototype"));
    }
    
    @Test
    public void testGetPropertyTypePrototype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        JSType propType = fn.getPropertyType("prototype");
        assertNotNull(propType);
    }
    
    @Test
    public void testIsEquivalentToNonFunctionType() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        JSType other = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(fn.isEquivalentTo(other));
    }
    
    @Test
    public void testIsEquivalentToSameFunction() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn1 = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertTrue(fn1.isEquivalentTo(fn1));
    }
    
    @Test
    public void testIsSubtypeHandlesInterface() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = FunctionType.forInterface(registry, "MyInterface", source);
        assertTrue(fn.isSubtype(iface));
    }
    
    @Test
    public void testGetSuperClassConstructorWithNoSuper() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        assertNull(fn.getSuperClassConstructor());
    }
    
    @Test
    public void testHasUnknownSupertypeWithNoSuper() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        assertFalse(fn.hasUnknownSupertype());
    }
    
    @Test
    public void testHashCodeInterface() {
        Node source = new Node(Token.FUNCTION);
        FunctionType iface1 = FunctionType.forInterface(registry, "MyInterface", source);
        FunctionType iface2 = FunctionType.forInterface(registry, "MyInterface", source);
        assertEquals(iface1.hashCode(), iface2.hashCode());
    }
    
    @Test
    public void testGetTypeOfThis() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertNotNull(fn.getTypeOfThis());
        assertFalse(fn.getTypeOfThis().isNoObjectType());
    }
    
    @Test
    public void testGetInstanceTypeForConstructor() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        assertTrue(fn.hasInstanceType());
        assertNotNull(fn.getInstanceType());
    }
    
    @Test
    public void testGetInstanceTypeForInterface() {
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = FunctionType.forInterface(registry, "MyInterface", source);
        assertTrue(iface.hasInstanceType());
        assertNotNull(iface.getInstanceType());
    }
    
    @Test
    public void testSetSource() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        Node newSource = new Node(Token.FUNCTION);
        fn.setSource(newSource);
        assertEquals(newSource, fn.getSource());
    }
    
    @Test
    public void testGetTemplateTypeName() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, "T", false, false);
        assertEquals("T", fn.getTemplateTypeName());
    }
    
    @Test
    public void testGetTemplateTypeNameNull() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertNull(fn.getTemplateTypeName());
    }
    
    @Test
    public void testHasCachedValuesWithPrototype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, true, false);
        fn.getPrototype();
        assertTrue(fn.hasCachedValues());
    }
    
    @Test
    public void testHasCachedValuesWithoutPrototype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
        FunctionType fn = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertFalse(fn.hasCachedValues());
    }
}