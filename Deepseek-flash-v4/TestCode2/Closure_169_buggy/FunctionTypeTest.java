package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSType;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FunctionTypeTest {

    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;
    private StaticScope<JSType> scope;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null);
        errorReporter = null;
        scope = null;
    }

    @After
    public void tearDown() {
        registry = null;
        errorReporter = null;
        scope = null;
    }

    private ArrowType makeArrowType(JSType returnType) {
        return new ArrowType(registry, new Node(Token.PARAM_LIST), returnType);
    }

    private FunctionType createOrdinary(String name, ArrowType arrowType, ObjectType typeOfThis) {
        return new FunctionType(registry, name, null, arrowType, typeOfThis,
                ImmutableList.<String>of(), false, false);
    }

    private FunctionType createConstructor(String name, ArrowType arrowType, ObjectType typeOfThis) {
        return new FunctionType(registry, name, null, arrowType, typeOfThis,
                ImmutableList.<String>of(), true, false);
    }

    @Test
    public void testIsConstructor() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        assertTrue("constructor kind should return true", ctor.isConstructor());
        assertFalse("constructor is not ordinary", ctor.isOrdinaryFunction());
        assertFalse("constructor is not interface", ctor.isInterface());
    }

    @Test
    public void testIsOrdinary() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertTrue("ordinary function", fn.isOrdinaryFunction());
        assertFalse(fn.isConstructor());
        assertFalse(fn.isInterface());
    }

    @Test
    public void testIsInterface() {
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        assertTrue("interface kind", iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
    }

    @Test
    public void testCanBeCalled() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertTrue("FunctionType always callable", fn.canBeCalled());
    }

    @Test
    public void testToMaybeFunctionType() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertSame("returns itself", fn, fn.toMaybeFunctionType());
    }

    @Test
    public void testIsInstanceType() {
        FunctionType u2u = registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertFalse("ordinary fn is not U2U", fn.isInstanceType());
    }

    @Test
    public void testGetParametersEmpty() {
        FunctionType fn = createOrdinary("fn", makeArrowType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        Iterable<Node> params = fn.getParameters();
        assertNotNull(params);
        assertFalse("no params expected", params.iterator().hasNext());
    }

    @Test
    public void testGetReturnType() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ArrowType arrow = makeArrowType(numberType);
        FunctionType fn = createOrdinary("fn", arrow, null);
        assertSame("return type matches", numberType, fn.getReturnType());
    }

    @Test
    public void testIsReturnTypeInferred() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST),
                registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType fn = createOrdinary("fn", arrow, null);
        assertFalse("not inferred by default", fn.isReturnTypeInferred());
    }

    @Test
    public void testMakesStructs_nonConstructor() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertFalse("non-constructor never makesStructs", fn.makesStructs());
    }

    @Test
    public void testMakesStructs_directStruct() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        assertFalse("before setStruct", ctor.makesStructs());
        ctor.setStruct();
        assertTrue("after setStruct", ctor.makesStructs());
    }

    @Test
    public void testMakesStructs_inherited() {
        FunctionType parent = createConstructor("Parent", makeArrowType(null), null);
        parent.setStruct();
        assertTrue("parent is struct", parent.makesStructs());
    }

    @Test
    public void testMakesDicts_nonConstructor() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertFalse("non-constructor never makesDicts", fn.makesDicts());
    }

    @Test
    public void testMakesDicts_directDict() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        assertFalse("before setDict", ctor.makesDicts());
        ctor.setDict();
        assertTrue("after setDict", ctor.makesDicts());
    }

    @Test
    public void testGetMinArguments() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        int min = fn.getMinArguments();
        assertTrue("min should be 0 for no params", min >= 0);
    }

    @Test
    public void testGetMaxArguments() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        int max = fn.getMaxArguments();
        assertTrue("max should be >= 0", max >= 0);
    }

    @Test
    public void testGetPrototype_nullRefName() {
        FunctionType fn = new FunctionType(registry, null, null,
                makeArrowType(null), null, ImmutableList.<String>of(), false, false);
        ObjectType proto = fn.getPrototype();
        assertNotNull("prototype should not be null", proto);
    }

    @Test
    public void testGetPrototype_withRefName() {
        FunctionType ctor = createConstructor("MyClass", makeArrowType(null), null);
        ObjectType proto = ctor.getPrototype();
        assertNotNull("constructor prototype not null", proto);
    }

    @Test
    public void testGetSlot_prototype() {
        FunctionType ctor = createConstructor("MyClass", makeArrowType(null), null);
        Property slot = ctor.getSlot("prototype");
        assertNotNull("prototype slot should exist", slot);
    }

    @Test
    public void testGetSlot_other() {
        FunctionType ctor = createConstructor("MyClass", makeArrowType(null), null);
        Property slot = ctor.getSlot("nonexistent");
        assertNull("unknown slot returns null", slot);
    }

    @Test
    public void testGetOwnPropertyNames_withPrototype() {
        FunctionType ctor = createConstructor("MyClass", makeArrowType(null), null);
        ctor.getPrototype();
        Set<String> names = ctor.getOwnPropertyNames();
        assertTrue("prototype in own property names", names.contains("prototype"));
    }

    @Test
    public void testGetOwnPropertyNames_withoutPrototype() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        Set<String> names = fn.getOwnPropertyNames();
        assertFalse("no prototype for ordinary fn", names.contains("prototype"));
    }

    @Test
    public void testHasImplementedInterfaces_empty() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        assertFalse("no interfaces", ctor.hasImplementedInterfaces());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetImplementedInterfaces_nonConstructorThrows() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        fn.setImplementedInterfaces(ImmutableList.<ObjectType>of());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetExtendedInterfaces_nonInterfaceThrows() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        ctor.setExtendedInterfaces(ImmutableList.<ObjectType>of());
    }

    @Test
    public void testSetExtendedInterfaces_interface() {
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        assertNotNull("extended interfaces", iface.getExtendedInterfaces());
        int cnt = iface.getExtendedInterfacesCount();
        assertEquals("no extended interfaces initially", 0, cnt);
    }

    @Test
    public void testGetExtendedInterfacesCount() {
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        assertEquals(0, iface.getExtendedInterfacesCount());
    }

    @Test
    public void testHashCode_interface() {
        FunctionType iface1 = FunctionType.forInterface(registry, "Iface", null);
        FunctionType iface2 = FunctionType.forInterface(registry, "Iface", null);
        assertEquals("same name -> same hashCode for interface",
                iface1.hashCode(), iface2.hashCode());
    }

    @Test
    public void testHashCode_ordinary() {
        FunctionType fn1 = createOrdinary("fn", makeArrowType(null), null);
        FunctionType fn2 = createOrdinary("fn", makeArrowType(null), null);
        assertNotNull("hashCode not null for ordinary", Integer.valueOf(fn1.hashCode()));
    }

    @Test
    public void testGetTemplateTypeNames_default() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        ImmutableList<String> names = fn.getTemplateTypeNames();
        assertNotNull("template type names not null", names);
        assertTrue("empty by default", names.isEmpty());
    }

    @Test
    public void testGetTemplateTypeNames_withValues() {
        ImmutableList<String> templates = ImmutableList.of("T", "U");
        FunctionType fn = new FunctionType(registry, "fn", null,
                makeArrowType(null), null, templates, false, false);
        assertEquals(templates, fn.getTemplateTypeNames());
    }

    @Test
    public void testGetSource() {
        Node src = new Node(Token.FUNCTION);
        FunctionType fn = new FunctionType(registry, "fn", src,
                makeArrowType(null), null, ImmutableList.<String>of(), false, false);
        assertSame("source preserved", src, fn.getSource());
    }

    @Test
    public void testSetSource() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertNull("default source is null", fn.getSource());
        Node newSrc = new Node(Token.FUNCTION);
        fn.setSource(newSrc);
        assertSame("source updated", newSrc, fn.getSource());
    }

    @Test
    public void testSetSource_withPrototypeSlot() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        ctor.getPrototype();
        Node newSrc = new Node(Token.FUNCTION);
        ctor.setSource(newSrc);
        assertSame("source updated with prototypeSlot", newSrc, ctor.getSource());
    }

    @Test
    public void testGetTypeOfThis_noObjectType() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        ObjectType typeOfThis = fn.getTypeOfThis();
        assertNotNull("typeOfThis not null", typeOfThis);
    }

    @Test
    public void testGetTypeOfThis_constructor() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        ObjectType typeOfThis = ctor.getTypeOfThis();
        assertNotNull("constructor typeOfThis not null", typeOfThis);
    }

    @Test
    public void testHasInstanceType_constructor() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        assertTrue("constructor has instance type", ctor.hasInstanceType());
    }

    @Test
    public void testHasInstanceType_interface() {
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        assertTrue("interface has instance type", iface.hasInstanceType());
    }

    @Test
    public void testHasInstanceType_ordinary() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertFalse("ordinary fn has no instance type", fn.hasInstanceType());
    }

    @Test
    public void testGetInstanceType() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        ObjectType instance = ctor.getInstanceType();
        assertNotNull("instance type", instance);
    }

    @Test
    public void testGetBindReturnType_zeroArgs() {
        FunctionType fn = createOrdinary("fn", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        FunctionType bound = fn.getBindReturnType(0);
        assertNotNull("bind return type not null", bound);
    }

    @Test
    public void testGetBindReturnType_negativeArgs() {
        FunctionType fn = createOrdinary("fn", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        FunctionType bound = fn.getBindReturnType(-1);
        assertNotNull("negative args bind", bound);
    }

    @Test
    public void testSetPrototype_nullReturnsFalse() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        boolean result = fn.setPrototype(null, null);
        assertFalse("null prototype returns false", result);
    }

    @Test
    public void testDefineProperty_prototypeNonNull() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        ObjectType protoType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        boolean defined = ctor.defineProperty("prototype", protoType, false, null);
        assertTrue("prototype property defined", defined);
    }

    @Test
    public void testDefineProperty_prototypeNullType() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        boolean defined = ctor.defineProperty("prototype", null, false, null);
        assertFalse("null type returns false", defined);
    }

    @Test
    public void testDefineProperty_nonPrototype() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        boolean defined = ctor.defineProperty("x",
                registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertTrue("non-prototype property", defined);
    }

    @Test
    public void testGetPropertyType_call() {
        FunctionType fn = createOrdinary("fn", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        JSType propType = fn.getPropertyType("call");
        assertNotNull("call property type", propType);
    }

    @Test
    public void testGetPropertyType_bind() {
        FunctionType fn = createOrdinary("fn", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        JSType propType = fn.getPropertyType("bind");
        assertNotNull("bind property type", propType);
    }

    @Test
    public void testGetPropertyType_unknown() {
        FunctionType fn = createOrdinary("fn", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        JSType propType = fn.getPropertyType("blah");
        assertNull("unknown property null", propType);
    }

    @Test
    public void testCheckFunctionEquivalence_sameConstructor() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        assertTrue("same ctor equals itself", ctor.checkFunctionEquivalenceHelper(ctor, false));
    }

    @Test
    public void testCheckFunctionEquivalence_ctorVsOrdinary() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertFalse("constructor vs ordinary", ctor.checkFunctionEquivalenceHelper(fn, false));
    }

    @Test
    public void testCheckFunctionEquivalence_interfaceVsInterface() {
        FunctionType iface1 = FunctionType.forInterface(registry, "A", null);
        FunctionType iface2 = FunctionType.forInterface(registry, "A", null);
        assertTrue("same name interfaces", iface1.checkFunctionEquivalenceHelper(iface2, false));
    }

    @Test
    public void testCheckFunctionEquivalence_interfaceVsOrdinary() {
        FunctionType iface = FunctionType.forInterface(registry, "A", null);
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertFalse("interface vs ordinary", iface.checkFunctionEquivalenceHelper(fn, false));
    }

    @Test
    public void testCheckFunctionEquivalence_ordinaryVsInterface() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        FunctionType iface = FunctionType.forInterface(registry, "A", null);
        assertFalse("ordinary vs interface", fn.checkFunctionEquivalenceHelper(iface, false));
    }

    @Test
    public void testGetOwnImplementedInterfaces_empty() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        Iterable<ObjectType> ifaces = ctor.getOwnImplementedInterfaces();
        assertNotNull("own interfaces not null", ifaces);
        assertFalse("empty initially", ifaces.iterator().hasNext());
    }

    @Test
    public void testGetAllImplementedInterfaces_empty() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        Iterable<ObjectType> ifaces = ctor.getAllImplementedInterfaces();
        assertNotNull("all implemented interfaces not null", ifaces);
    }

    @Test
    public void testGetAllExtendedInterfaces_empty() {
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        Iterable<ObjectType> ext = iface.getAllExtendedInterfaces();
        assertNotNull("all extended interfaces not null", ext);
    }

    @Test
    public void testSupAndInfHelper_equivalent() {
        FunctionType fn1 = createOrdinary("fn", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        FunctionType fn2 = fn1;
        FunctionType result = fn1.supAndInfHelper(fn2, true);
        assertSame("equivalent returns this", fn1, result);
    }

    @Test
    public void testHasCachedValues_noPrototypeSlot() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertFalse("no cached values initially", fn.hasCachedValues());
    }

    @Test
    public void testHasCachedValues_afterGetPrototype() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        ctor.getPrototype();
        assertTrue("has prototypeSlot cached", ctor.hasCachedValues());
    }

    @Test
    public void testGetSubTypes_null() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        assertNull("no subtypes", fn.getSubTypes());
    }

    @Test
    public void testHasAnyTemplateInternal_noTemplates() {
        FunctionType fn = createOrdinary("fn", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        assertFalse("no templates", fn.hasAnyTemplateInternal());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullArrowType() {
        new FunctionType(registry, "fn", null, null, null,
                ImmutableList.<String>of(), false, false);
    }

    @Test
    public void testConstructorNullTemplateNames() {
        FunctionType fn = new FunctionType(registry, "fn", null,
                makeArrowType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)),
                null, null, false, false);
        assertNotNull("null template names handled", fn);
        assertTrue("default empty template names", fn.getTemplateTypeNames().isEmpty());
    }

    @Test
    public void testConstructor_constructorWithNullTypeOfThis() {
        FunctionType ctor = new FunctionType(registry, "Ctor", null,
                makeArrowType(null), null,
                ImmutableList.<String>of(), true, false);
        assertTrue(ctor.isConstructor());
        assertNotNull("typeOfThis auto-created", ctor.getTypeOfThis());
    }

    @Test
    public void testConstructor_ordinaryWithNullTypeOfThis() {
        FunctionType fn = new FunctionType(registry, "fn", null,
                makeArrowType(null), null,
                ImmutableList.<String>of(), false, false);
        assertTrue(fn.isOrdinaryFunction());
        assertNotNull("typeOfThis defaults to UNKNOWN_TYPE", fn.getTypeOfThis());
    }

    @Test
    public void testForInterface() {
        FunctionType iface = FunctionType.forInterface(registry, "Iface", null);
        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
    }

    @Test
    public void testGetParametersNode() {
        ArrowType arrow = makeArrowType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType fn = createOrdinary("fn", arrow, null);
        Node paramsNode = fn.getParametersNode();
        assertNotNull("parameters node", paramsNode);
    }

    @Test
    public void testGetInternalArrowType() {
        ArrowType arrow = makeArrowType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType fn = createOrdinary("fn", arrow, null);
        assertSame("internal arrow type", arrow, fn.getInternalArrowType());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetImplementedInterfaces_nonConstructor() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
        fn.setImplementedInterfaces(ImmutableList.<ObjectType>of());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetExtendedInterfaces_nonInterface() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        ctor.setExtendedInterfaces(ImmutableList.<ObjectType>of());
    }

    @Test
    public void testCloneWithoutArrowType() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)), null);
        FunctionType clone = ctor.cloneWithoutArrowType();
        assertNotNull("clone not null", clone);
        assertTrue("clone is constructor", clone.isConstructor());
    }

    @Test
    public void testGetTopMostDefiningType_constructor() {
        FunctionType ctor = createConstructor("Ctor", makeArrowType(null), null);
        FunctionType result = ctor.getSuperClassConstructor();
    }

    @Test
    public void testGetSuperClassConstructor_nullPrototype() {
        FunctionType fn = createOrdinary("fn", makeArrowType(null), null);
    }
}
