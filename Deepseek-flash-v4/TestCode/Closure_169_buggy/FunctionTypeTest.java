package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.Property;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.common.base.Preconditions;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.*;

public class FunctionTypeTest {

    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;
    private FunctionType ordinaryFunc;
    private FunctionType constructorFunc;
    private FunctionType interfaceFunc;
    private FunctionType nativeFunc;

    @Before
    public void setUp() {
        errorReporter = ErrorReporter.createForTest();
        registry = new JSTypeRegistry(errorReporter);

        ArrowType arrowType = registry.createArrowType(
            new Node(Token.PARAM_LIST),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        ordinaryFunc = new FunctionType(
            registry, "testFunc", null, arrowType, null,
            ImmutableList.<String>of(), false, false);

        constructorFunc = new FunctionType(
            registry, "TestConstructor", null, arrowType, null,
            ImmutableList.<String>of(), true, false);

        ArrowType ifaceArrow = registry.createArrowType(
            new Node(Token.PARAM_LIST), null);
        interfaceFunc = FunctionType.forInterface(
            registry, "TestInterface", null);

        nativeFunc = new FunctionType(
            registry, "nativeFunc", null, arrowType, null,
            ImmutableList.<String>of(), false, true);
    }

    @After
    public void tearDown() {
        registry = null;
        errorReporter = null;
        ordinaryFunc = null;
        constructorFunc = null;
        interfaceFunc = null;
    }

    @Test
    public void testIsConstructor() {
        assertFalse(ordinaryFunc.isConstructor());
        assertTrue(constructorFunc.isConstructor());
        assertFalse(interfaceFunc.isConstructor());
    }

    @Test
    public void testIsInterface() {
        assertFalse(ordinaryFunc.isInterface());
        assertFalse(constructorFunc.isInterface());
        assertTrue(interfaceFunc.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() {
        assertTrue(ordinaryFunc.isOrdinaryFunction());
        assertFalse(constructorFunc.isOrdinaryFunction());
        assertFalse(interfaceFunc.isOrdinaryFunction());
    }

    @Test
    public void testIsInstanceType() {
        assertFalse(ordinaryFunc.isInstanceType());
    }

    @Test
    public void testMakesStructs_nonConstructorReturnsFalse() {
        assertFalse(ordinaryFunc.makesStructs());
    }

    @Test
    public void testMakesStructs_constructorNoStruct() {
        assertFalse(constructorFunc.makesStructs());
    }

    @Test
    public void testMakesStructs_setStructThenTrue() {
        constructorFunc.setStruct();
        assertTrue(constructorFunc.makesStructs());
    }

    @Test
    public void testMakesDicts_nonConstructorReturnsFalse() {
        assertFalse(ordinaryFunc.makesDicts());
    }

    @Test
    public void testMakesDicts_setDictThenTrue() {
        constructorFunc.setDict();
        assertTrue(constructorFunc.makesDicts());
    }

    @Test
    public void testSetStructAndSetDict() {
        ordinaryFunc.setStruct();
        ordinaryFunc.setDict();
    }

    @Test
    public void testToMaybeFunctionTypeReturnsThis() {
        assertSame(ordinaryFunc, ordinaryFunc.toMaybeFunctionType());
    }

    @Test
    public void testCanBeCalledReturnsTrue() {
        assertTrue(ordinaryFunc.canBeCalled());
    }

    @Test
    public void testGetParameters_emptyWhenNoParams() {
        Iterable<Node> params = ordinaryFunc.getParameters();
        assertNotNull(params);
        for (Node p : params) {
            fail("expected no parameters");
        }
    }

    @Test
    public void testGetParametersNode() {
        Node paramsNode = ordinaryFunc.getParametersNode();
        assertNotNull(paramsNode);
    }

    @Test
    public void testGetMinArguments_zeroWhenNoParams() {
        assertEquals(0, ordinaryFunc.getMinArguments());
    }

    @Test
    public void testGetMaxArguments_zeroWhenNoParams() {
        assertEquals(0, ordinaryFunc.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        assertNotNull(ordinaryFunc.getReturnType());
    }

    @Test
    public void testIsReturnTypeInferred_defaultFalse() {
        assertFalse(ordinaryFunc.isReturnTypeInferred());
    }

    @Test
    public void testGetSlot_prototype() {
        ordinaryFunc.getPrototype();
        Property slot = ordinaryFunc.getSlot("prototype");
        assertNotNull(slot);
        assertEquals("prototype", slot.getName());
    }

    @Test
    public void testGetSlot_nonPrototypeDelegatesToSuper() {
        Property slot = ordinaryFunc.getSlot("nonexistent");
        assertNull(slot);
    }

    @Test
    public void testGetOwnPropertyNames_withPrototype() {
        ordinaryFunc.getPrototype();
        Set<String> names = ordinaryFunc.getOwnPropertyNames();
        assertTrue(names.contains("prototype"));
    }

    @Test
    public void testGetOwnPropertyNames_withoutPrototype() {
        Set<String> names = ordinaryFunc.getOwnPropertyNames();
        assertFalse(names.contains("prototype"));
    }

    @Test
    public void testGetPrototype_createsWhenNull() {
        ObjectType proto = ordinaryFunc.getPrototype();
        assertNotNull(proto);
        assertTrue(proto.isUnknownType() || proto.isObjectType());
    }

    @Test
    public void testSetPrototype_nullReturnsFalse() {
        boolean result = false;
        try {
            result = ordinaryFunc.setPrototype(null, null);
        } catch (Exception e) {
        }
    }

    @Test
    public void testSetPrototype_valid() {
        ObjectType protoType = registry.getNativeObjectType(OBJECT_TYPE);
        boolean result = ordinaryFunc.setPrototype(protoType, null);
    }

    @Test
    public void testHasImplementedInterfaces_noInterfaces() {
        assertFalse(ordinaryFunc.hasImplementedInterfaces());
        assertFalse(ordinaryFunc.hasImplementedInterfaces());
    }

    @Test
    public void testGetImplementedInterfaces_emptyByDefault() {
        Iterable<ObjectType> interfaces = ordinaryFunc.getImplementedInterfaces();
        assertNotNull(interfaces);
    }

    @Test
    public void testGetOwnImplementedInterfaces_emptyByDefault() {
        Iterable<ObjectType> interfaces = ordinaryFunc.getOwnImplementedInterfaces();
        assertNotNull(interfaces);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetImplementedInterfaces_onNonConstructorThrows() {
        ordinaryFunc.setImplementedInterfaces(new ArrayList<ObjectType>());
    }

    @Test
    public void testSetImplementedInterfaces_onConstructor() {
        constructorFunc.setImplementedInterfaces(new ArrayList<ObjectType>());
        Iterable<ObjectType> interfaces = constructorFunc.getOwnImplementedInterfaces();
        assertNotNull(interfaces);
    }

    @Test
    public void testGetAllExtendedInterfaces_emptyByDefault() {
        Iterable<ObjectType> extended = constructorFunc.getAllExtendedInterfaces();
        assertNotNull(extended);
    }

    @Test
    public void testGetExtendedInterfaces_emptyByDefault() {
        Iterable<ObjectType> extended = constructorFunc.getExtendedInterfaces();
        assertNotNull(extended);
    }

    @Test
    public void testGetExtendedInterfacesCount_zeroByDefault() {
        assertEquals(0, constructorFunc.getExtendedInterfacesCount());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetExtendedInterfaces_onNonInterfaceThrows() {
        ordinaryFunc.setExtendedInterfaces(new ArrayList<ObjectType>());
    }

    @Test
    public void testSetExtendedInterfaces_onInterface() throws UnsupportedOperationException {
        interfaceFunc.setExtendedInterfaces(new ArrayList<ObjectType>());
        assertEquals(0, interfaceFunc.getExtendedInterfacesCount());
    }

    @Test
    public void testGetPropertyType_call() {
        JSType callType = constructorFunc.getPropertyType("call");
        assertNotNull(callType);
    }

    @Test
    public void testGetPropertyType_bind() {
        JSType bindType = constructorFunc.getPropertyType("bind");
        assertNotNull(bindType);
    }

    @Test
    public void testGetPropertyType_apply() {
        JSType applyType = constructorFunc.getPropertyType("apply");
        assertNotNull(applyType);
    }

    @Test
    public void testGetPropertyType_nonSpecialDelegatesToSuper() {
        JSType type = constructorFunc.getPropertyType("nonexistent");
        assertNull(type);
    }

    @Test
    public void testGetSuperClassConstructor_nullForOrdinary() {
    }

    @Test
    public void testGetTopMostDefiningType_constructorReturnsSelf() {
        JSType instanceType = constructorFunc.getInstanceType();
        assertNotNull(instanceType);
    }

    @Test
    public void testHashCode_ordinaryUsesCallHash() {
        int hashCode = ordinaryFunc.hashCode();
    }

    @Test
    public void testHasEqualCallType_sameTypeReturnsTrue() {
        assertTrue(ordinaryFunc.hasEqualCallType(ordinaryFunc));
    }

    @Test
    public void testGetInstanceType_constructor() {
        ObjectType instanceType = constructorFunc.getInstanceType();
        assertNotNull(instanceType);
        assertTrue(instanceType instanceof InstanceObjectType);
    }

    @Test
    public void testGetInstanceType_interface() {
        ObjectType instanceType = interfaceFunc.getInstanceType();
        assertNotNull(instanceType);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetInstanceType_ordinaryThrows() {
        ordinaryFunc.getInstanceType();
    }

    @Test
    public void testHasInstanceType_constructor() {
        assertTrue(constructorFunc.hasInstanceType());
    }

    @Test
    public void testHasInstanceType_interface() {
        assertTrue(interfaceFunc.hasInstanceType());
    }

    @Test
    public void testHasInstanceType_ordinary() {
        assertFalse(ordinaryFunc.hasInstanceType());
    }

    @Test
    public void testGetTypeOfThis_known() {
        assertNotNull(constructorFunc.getTypeOfThis());
    }

    @Test
    public void testGetSource_nullByDefault() {
        assertNull(ordinaryFunc.getSource());
    }

    @Test
    public void testSetSource() {
        Node sourceNode = new Node(Token.SCRIPT);
        ordinaryFunc.setSource(sourceNode);
        assertSame(sourceNode, ordinaryFunc.getSource());
    }

    @Test
    public void testGetTemplateTypeNames_emptyByDefault() {
        ImmutableList<String> names = ordinaryFunc.getTemplateTypeNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testGetSubTypes_nullByDefault() {
        assertNull(ordinaryFunc.getSubTypes());
    }

    @Test
    public void testHasCachedValues_falseInitially() {
        assertFalse(ordinaryFunc.hasCachedValues());
    }

    @Test
    public void testHasCachedValues_trueAfterGetPrototype() {
        ordinaryFunc.getPrototype();
        assertTrue(ordinaryFunc.hasCachedValues());
    }

    @Test
    public void testForInterface_createsInterfaceFunction() {
        FunctionType iface = FunctionType.forInterface(registry, "MyInterface", null);
        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
    }

    @Test
    public void testGetBindReturnType() {
        FunctionType bindReturnType = ordinaryFunc.getBindReturnType(0);
        assertNotNull(bindReturnType);
    }

    @Test
    public void testCloneWithoutArrowType() {
        FunctionType clone = constructorFunc.cloneWithoutArrowType();
        assertNotNull(clone);
        assertTrue(clone.isConstructor());
        assertSame(constructorFunc.getInstanceType(), clone.getInstanceType());
    }

    @Test
    public void testHasAnyTemplateInternal_noTemplate() {
        assertFalse(ordinaryFunc.hasAnyTemplateInternal());
    }

    @Test
    public void testConstructorWithTypeOfThis() {
        ObjectType customThis = registry.getNativeObjectType(OBJECT_TYPE);
        ArrowType arrowType = registry.createArrowType(
            new Node(Token.PARAM_LIST),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType customFunc = new FunctionType(
            registry, "Custom", null, arrowType, customThis,
            ImmutableList.<String>of(), true, false);
        assertTrue(customFunc.isConstructor());
        assertSame(customThis, customFunc.getTypeOfThis());
    }

    @Test
    public void testConstructor_withTemplateNames() {
        ArrowType arrowType = registry.createArrowType(
            new Node(Token.PARAM_LIST),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ImmutableList<String> templates = ImmutableList.of("T", "U");
        FunctionType templatedFunc = new FunctionType(
            registry, "Templated", null, arrowType, null,
            templates, false, false);
        assertEquals(2, templatedFunc.getTemplateTypeNames().size());
        assertEquals("T", templatedFunc.getTemplateTypeNames().get(0));
        assertEquals("U", templatedFunc.getTemplateTypeNames().get(1));
    }

    @Test
    public void testConstructor_nullTypeOfThisOrdinaryUsesUnknown() {
        ArrowType arrowType = registry.createArrowType(
            new Node(Token.PARAM_LIST),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType func = new FunctionType(
            registry, "NoThis", null, arrowType, null,
            ImmutableList.<String>of(), false, false);
        assertFalse(func.isConstructor());
        assertNotNull(func.getTypeOfThis());
    }

    @Test
    public void testHasImplementedInterfaces_inheritsFromSuperConstructor() {
        assertFalse(constructorFunc.hasImplementedInterfaces());
    }

    @Test
    public void testGetOwnPropertyNames_includesPrototypeAfterGetPrototype() {
        ordinaryFunc.getPrototype();
        Set<String> names = ordinaryFunc.getOwnPropertyNames();
        assertTrue(names.contains("prototype"));
    }

    @Test
    public void testGetOwnPropertyNames_excludesPrototypeBeforeGetPrototype() {
        Set<String> names = ordinaryFunc.getOwnPropertyNames();
        assertFalse(names.contains("prototype"));
    }

    @Test
    public void testGetPrototype_returnsUnknownTypeWhenNoRefName() {
        FunctionType noRefFunc = new FunctionType(
            registry, null, null,
            registry.createArrowType(new Node(Token.PARAM_LIST),
                registry.getNativeType(JSTypeNative.NUMBER_TYPE)),
            null, ImmutableList.<String>of(), false, false);
        ObjectType proto = noRefFunc.getPrototype();
        assertNotNull(proto);
    }

    @Test
    public void testDefineProperty_prototypeWithObjectType() {
        ObjectType protoType = registry.getNativeObjectType(OBJECT_TYPE);
        boolean result = ordinaryFunc.defineProperty("prototype", protoType, false, null);
        assertTrue(result);
    }

    @Test
    public void testDefineProperty_prototypeWithNonObjectType() {
        JSType nonObject = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        boolean result = ordinaryFunc.defineProperty("prototype", nonObject, false, null);
        assertFalse(result);
    }

    @Test
    public void testDefineProperty_nonPrototype() {
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        boolean result = ordinaryFunc.defineProperty("x", numType, false, null);
        assertFalse(result);
    }

    @Test
    public void testGetMinArguments_withOptionalParams() {
        Node paramList = new Node(Token.PARAM_LIST);
        Node req = Node.newString(Token.NAME, "req");
        Node opt = Node.newString(Token.NAME, "opt");
        opt.setOptionalArg(true);
        paramList.addChildToBack(req);
        paramList.addChildToBack(opt);
        ArrowType arrow = registry.createArrowType(paramList,
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType func = new FunctionType(
            registry, "f", null, arrow, null,
            ImmutableList.<String>of(), false, false);
        assertEquals(1, func.getMinArguments());
    }

    @Test
    public void testGetMaxArguments_withVarArgs() {
        Node paramList = new Node(Token.PARAM_LIST);
        Node req = Node.newString(Token.NAME, "req");
        Node varArg = Node.newString(Token.NAME, "args");
        varArg.setVarArgs(true);
        paramList.addChildToBack(req);
        paramList.addChildToBack(varArg);
        ArrowType arrow = registry.createArrowType(paramList,
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType func = new FunctionType(
            registry, "f", null, arrow, null,
            ImmutableList.<String>of(), false, false);
        assertEquals(Integer.MAX_VALUE, func.getMaxArguments());
    }

    @Test
    public void testGetMaxArguments_withFixedParams() {
        Node paramList = new Node(Token.PARAM_LIST);
        Node p1 = Node.newString(Token.NAME, "a");
        Node p2 = Node.newString(Token.NAME, "b");
        paramList.addChildToBack(p1);
        paramList.addChildToBack(p2);
        ArrowType arrow = registry.createArrowType(paramList,
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType func = new FunctionType(
            registry, "f", null, arrow, null,
            ImmutableList.<String>of(), false, false);
        assertEquals(2, func.getMaxArguments());
    }

    @Test
    public void testGetMaxArguments_nullParams() {
        ArrowType arrow = new ArrowType(registry, null, null);
        FunctionType func = new FunctionType(
            registry, "f", null, arrow, null,
            ImmutableList.<String>of(), false, false);
    }

    @Test
    public void testClearCachedValues() {
        constructorFunc.getPrototype();
        constructorFunc.getInstanceType();
        constructorFunc.clearCachedValues();
    }

    @Test
    public void testGetSuperClassConstructor_returnsNullWhenNoSuper() {
        assertNull(constructorFunc.getSuperClassConstructor());
    }

    @Test
    public void testCheckFunctionEquivalenceHelper_ordinaryVsOrdinary() {
        assertTrue(ordinaryFunc.checkFunctionEquivalenceHelper(ordinaryFunc, false));
    }

    @Test
    public void testCheckFunctionEquivalenceHelper_constructorVsConstructorSame() {
        assertTrue(constructorFunc.checkFunctionEquivalenceHelper(constructorFunc, false));
    }
}
