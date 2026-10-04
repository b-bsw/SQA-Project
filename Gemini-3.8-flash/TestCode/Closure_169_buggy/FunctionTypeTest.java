package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class FunctionTypeTest {

private JSTypeRegistry registry;
private Node functionNode;
private Node paramListNode;
private ArrowType dummyArrow;

@Before
public void setUp() {
registry = new JSTypeRegistry(null);
functionNode = new Node(Token.FUNCTION);
paramListNode = new Node(Token.PARAM_LIST);
dummyArrow = new ArrowType(
registry,
paramListNode,
registry.getNativeType(JSTypeNative.NUMBER_TYPE),
false);
}

// ==========================================
// Constructors and Factory Methods
// ==========================================

@Test
public void constructor_givenInvalidSourceNodeType_shouldThrowIllegalArgumentException() {
Node invalidNode = new Node(Token.NAME);
try {
new FunctionType(
registry, "MyFn", invalidNode, dummyArrow, null, null, false, false);
fail("Expected IllegalArgumentException when source is not Token.FUNCTION");
} catch (IllegalArgumentException e) {
// Expected
}
}

@Test
public void constructor_givenNullArrowType_shouldThrowNullPointerException() {
try {
new FunctionType(
registry, "MyFn", functionNode, null, null, null, false, false);
fail("Expected NullPointerException when arrowType is null");
} catch (NullPointerException e) {
// Expected
}
}

@Test
public void constructor_givenOrdinaryFunctionWithNullTypeOfThis_shouldDefaultToUnknownType() {
FunctionType fn = new FunctionType(
registry, "foo", functionNode, dummyArrow, null, null, false, false);

assertTrue(fn.isOrdinaryFunction());
assertFalse(fn.isConstructor());
assertFalse(fn.isInterface());
assertEquals(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), fn.getTypeOfThis());
assertEquals(0, fn.getTemplateTypeNames().size());

}

@Test
public void constructor_givenOrdinaryFunctionWithExplicitTypeOfThisAndTemplates_shouldRetainThem() {
ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
ImmutableList templates = ImmutableList.of("T", "U");
FunctionType fn = new FunctionType(
registry, "foo", null, dummyArrow, thisType, templates, false, false);

assertTrue(fn.isOrdinaryFunction());
assertEquals(thisType, fn.getTypeOfThis());
assertEquals(2, fn.getTemplateTypeNames().size());
assertEquals("T", fn.getTemplateTypeNames().get(0));
assertEquals("U", fn.getTemplateTypeNames().get(1));

}

@Test
public void constructor_givenConstructorWithNullTypeOfThis_shouldCreateInstanceObjectType() {
FunctionType ctor = new FunctionType(
registry, "MyClass", functionNode, dummyArrow, null, null, true, false);

assertTrue(ctor.isConstructor());
assertFalse(ctor.isOrdinaryFunction());
assertFalse(ctor.isInterface());
assertTrue(ctor.hasInstanceType());
assertNotNull(ctor.getInstanceType());
assertEquals(ctor.getInstanceType(), ctor.getTypeOfThis());

}

@Test
public void constructor_givenConstructorWithExplicitTypeOfThis_shouldRetainProvidedInstance() {
ObjectType customInstance = new PrototypeObjectType(
registry, "Custom", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
FunctionType ctor = new FunctionType(
registry, "MyClass", null, dummyArrow, customInstance, null, true, false);

assertTrue(ctor.isConstructor());
assertEquals(customInstance, ctor.getInstanceType());
assertEquals(customInstance, ctor.getTypeOfThis());

}

@Test
public void forInterface_givenValidInputs_shouldInitializeInterfaceKind() {
FunctionType iface = FunctionType.forInterface(registry, "MyInterface", functionNode);

assertTrue(iface.isInterface());
assertFalse(iface.isConstructor());
assertFalse(iface.isOrdinaryFunction());
assertTrue(iface.hasInstanceType());
assertNotNull(iface.getInstanceType());
assertEquals(0, iface.getTemplateTypeNames().size());

}

@Test
public void forInterface_givenNullName_shouldThrowIllegalArgumentException() {
try {
FunctionType.forInterface(registry, null, functionNode);
fail("Expected IllegalArgumentException when interface name is null");
} catch (IllegalArgumentException e) {
// Expected
}
}

@Test
public void forInterface_givenInvalidSourceNode_shouldThrowIllegalArgumentException() {
Node invalidNode = new Node(Token.BLOCK);
try {
FunctionType.forInterface(registry, "MyInterface", invalidNode);
fail("Expected IllegalArgumentException when source is not Token.FUNCTION");
} catch (IllegalArgumentException e) {
// Expected
}
}

// ==========================================
// Basic Type Queries and Simple Methods
// ==========================================

@Test
public void canBeCalled_always_shouldReturnTrue() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertTrue(fn.canBeCalled());
}

@Test
public void toMaybeFunctionType_always_shouldReturnSelf() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertSame(fn, fn.toMaybeFunctionType());
}

@Test
public void isInstanceType_whenComparedToU2UConstructor_shouldEvaluateEquivalence() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertFalse(fn.isInstanceType());

FunctionType u2u = registry.getNativeFunctionType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
if (u2u != null) {
  assertTrue(u2u.isInstanceType());
}

}

@Test
public void getInstanceType_whenOrdinaryFunction_shouldThrowIllegalStateException() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertFalse(fn.hasInstanceType());
try {
fn.getInstanceType();
fail("Expected IllegalStateException when calling getInstanceType on ordinary function");
} catch (IllegalStateException e) {
// Expected
}
}

@Test
public void setInstanceType_givenNewInstance_shouldUpdateInstanceAndTypeOfThis() {
FunctionType ctor = new FunctionType(
registry, "MyClass", null, dummyArrow, null, null, true, false);
ObjectType newInst = new PrototypeObjectType(
registry, "NewInst", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));

ctor.setInstanceType(newInst);
assertSame(newInst, ctor.getInstanceType());
assertSame(newInst, ctor.getTypeOfThis());

}

@Test
public void getTypeOfThis_whenTypeOfThisIsNoObjectType_shouldReturnUnknownType() {
ObjectType noObj = registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE);
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, noObj, null, false, false);

assertEquals(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), fn.getTypeOfThis());

}

@Test
public void source_getterAndSetter_shouldUpdatePropertySlotNodeWhenSlotExists() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertNull(fn.getSource());

fn.getPrototype(); // Force initialization of prototypeSlot
Node newSource = new Node(Token.FUNCTION);
fn.setSource(newSource);

assertSame(newSource, fn.getSource());
Property slot = fn.getSlot("prototype");
assertNotNull(slot);
assertSame(newSource, slot.getNode());

}

// ==========================================
// Structs and Dicts Handling
// ==========================================

@Test
public void makesStructs_whenOrdinaryFunction_shouldReturnFalse() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
fn.setStruct();
assertFalse(fn.makesStructs());
}

@Test
public void makesStructs_whenConstructorWithStructPropAccess_shouldReturnTrue() {
FunctionType ctor = new FunctionType(
registry, "Ctor", null, dummyArrow, null, null, true, false);
assertFalse(ctor.makesStructs());
ctor.setStruct();
assertTrue(ctor.makesStructs());
}

@Test
public void makesStructs_whenSuperClassMakesStructs_shouldInheritAndSetStruct() {
FunctionType parentCtor = new FunctionType(
registry, "Parent", null, dummyArrow, null, null, true, false);
parentCtor.setStruct();

FunctionType childCtor = new FunctionType(
    registry, "Child", null, dummyArrow, null, null, true, false);
childCtor.setPrototypeBasedOn(parentCtor.getInstanceType());

assertTrue(childCtor.makesStructs());

}

@Test
public void makesDicts_whenOrdinaryFunction_shouldReturnFalse() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
fn.setDict();
assertFalse(fn.makesDicts());
}

@Test
public void makesDicts_whenConstructorWithDictPropAccess_shouldReturnTrue() {
FunctionType ctor = new FunctionType(
registry, "Ctor", null, dummyArrow, null, null, true, false);
assertFalse(ctor.makesDicts());
ctor.setDict();
assertTrue(ctor.makesDicts());
}

@Test
public void makesDicts_whenSuperClassMakesDicts_shouldInheritAndSetDict() {
FunctionType parentCtor = new FunctionType(
registry, "Parent", null, dummyArrow, null, null, true, false);
parentCtor.setDict();

FunctionType childCtor = new FunctionType(
    registry, "Child", null, dummyArrow, null, null, true, false);
childCtor.setPrototypeBasedOn(parentCtor.getInstanceType());

assertTrue(childCtor.makesDicts());

}

// ==========================================
// Parameters and Arguments Counting
// ==========================================

@Test
public void getParameters_whenNoParams_shouldReturnEmpty() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
Iterator it = fn.getParameters().iterator();
assertFalse(it.hasNext());
assertEquals(0, fn.getMinArguments());
assertEquals(0, fn.getMaxArguments());
}

@Test
public void getParameters_whenHasRequiredOptionalAndVarArgs_shouldCalculateCorrectMinMax() {
Node param1 = Node.newString(Token.NAME, "a");
param1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

Node param2 = Node.newString(Token.NAME, "b");
param2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
param2.setOptionalArg(true);

Node param3 = Node.newString(Token.NAME, "c");
param3.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
param3.setVarArgs(true);

Node params = new Node(Token.PARAM_LIST, param1, param2, param3);
ArrowType arrow = new ArrowType(
    registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE), false);
FunctionType fn = new FunctionType(
    registry, "fn", null, arrow, null, null, false, false);

assertEquals(1, fn.getMinArguments());
assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());

}

@Test
public void getMaxArguments_whenLastParamIsNotVarArgs_shouldReturnChildCount() {
Node param1 = Node.newString(Token.NAME, "a");
Node param2 = Node.newString(Token.NAME, "b");
Node params = new Node(Token.PARAM_LIST, param1, param2);
ArrowType arrow = new ArrowType(
registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE), false);
FunctionType fn = new FunctionType(
registry, "fn", null, arrow, null, null, false, false);

assertEquals(2, fn.getMinArguments());
assertEquals(2, fn.getMaxArguments());

}

@Test
public void returnType_queries_shouldDelegateToArrowType() {
ArrowType arrow = new ArrowType(
registry,
paramListNode,
registry.getNativeType(JSTypeNative.STRING_TYPE),
true);
FunctionType fn = new FunctionType(
registry, "fn", null, arrow, null, null, false, false);

assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), fn.getReturnType());
assertTrue(fn.isReturnTypeInferred());
assertSame(arrow, fn.getInternalArrowType());

}

// ==========================================
// Prototypes and Properties
// ==========================================

@Test
public void getPrototype_whenAnonymousFunction_shouldDefaultToUnknownType() {
FunctionType fn = new FunctionType(
registry, null, null, dummyArrow, null, null, false, false);
ObjectType proto = fn.getPrototype();

assertEquals(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), proto);

}

@Test
public void getPrototype_whenNamedFunction_shouldCreatePrototypeObjectWithNamedReference() {
FunctionType fn = new FunctionType(
registry, "Greeter", null, dummyArrow, null, null, false, false);
ObjectType proto = fn.getPrototype();

assertNotNull(proto);
assertEquals("Greeter.prototype", proto.getReferenceName());

}

@Test
public void setPrototype_givenNullPrototype_shouldReturnFalse() {
FunctionType fn = new FunctionType(
registry, "Greeter", null, dummyArrow, null, null, false, false);
assertFalse(fn.setPrototype(null, null));
}

@Test
public void setPrototype_whenConstructorAndPrototypeIsInstanceType_shouldReturnFalse() {
FunctionType ctor = new FunctionType(
registry, "Greeter", null, dummyArrow, null, null, true, false);
assertFalse(ctor.setPrototype(ctor.getInstanceType(), null));
}

@Test
public void setPrototype_whenValidPrototypeReplacement_shouldUpdateOldAndNewOwnerFunctions() {
FunctionType ctor = new FunctionType(
registry, "Greeter", null, dummyArrow, null, null, true, false);
ObjectType proto1 = ctor.getPrototype();
assertSame(ctor, proto1.getOwnerFunction());

ObjectType proto2 = new PrototypeObjectType(
    registry, "NewProto", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
boolean updated = ctor.setPrototype(proto2, null);

assertTrue(updated);
assertSame(proto2, ctor.getPrototype());
assertSame(ctor, proto2.getOwnerFunction());
assertNull(proto1.getOwnerFunction());

}

@Test
public void defineProperty_whenPropertyNameIsPrototypeAndNotObjectType_shouldReturnFalse() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
boolean defined = fn.defineProperty(
"prototype", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

assertFalse(defined);

}

@Test
public void defineProperty_whenPropertyNameIsPrototypeAndEquivalentToCurrent_shouldReturnTrueWithoutReset() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
ObjectType proto = fn.getPrototype();

boolean defined = fn.defineProperty("prototype", proto, false, null);
assertTrue(defined);
assertSame(proto, fn.getPrototype());

}

@Test
public void defineProperty_whenPropertyNameIsPrototypeAndNewObject_shouldSetPrototypeBasedOn() {
FunctionType fn = new FunctionType(
registry, "Greeter", null, dummyArrow, null, null, false, false);
ObjectType newProto = new PrototypeObjectType(
registry, "CustomType", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));

boolean defined = fn.defineProperty("prototype", newProto, false, null);
assertTrue(defined);
assertTrue(fn.getPrototype().getReferenceName().contains("Greeter.prototype"));

}

@Test
public void defineProperty_whenPropertyNameIsNotPrototype_shouldDelegateToSuper() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
boolean defined = fn.defineProperty(
"customProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

assertTrue(defined);
assertTrue(fn.hasOwnProperty("customProp"));

}

@Test
public void getSlot_whenPrototypeQueried_shouldReturnPrototypeSlot() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
Property slot = fn.getSlot("prototype");

assertNotNull(slot);
assertEquals("prototype", slot.getName());

}

@Test
public void getOwnPropertyNames_whenPrototypeSlotExists_shouldIncludePrototype() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
fn.getPrototype();

Set<String> propNames = fn.getOwnPropertyNames();
assertTrue(propNames.contains("prototype"));

}

// ==========================================
// Builtin Method Signatures: call, bind, apply
// ==========================================

@Test
public void getPropertyType_whenCallQueried_shouldSynthesizeCallSignature() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
JSType callPropType = fn.getPropertyType("call");

assertNotNull(callPropType);
assertTrue(callPropType.isFunctionType());
FunctionType callFn = callPropType.toMaybeFunctionType();
assertTrue(callFn.getParameters().iterator().next().isOptionalArg());

}

@Test
public void getPropertyType_whenBindQueried_shouldSynthesizeBindSignature() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
JSType bindPropType = fn.getPropertyType("bind");

assertNotNull(bindPropType);
assertTrue(bindPropType.isFunctionType());

}

@Test
public void getPropertyType_whenApplyQueried_shouldSynthesizeApplySignature() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
JSType applyPropType = fn.getPropertyType("apply");

assertNotNull(applyPropType);
assertTrue(applyPropType.isFunctionType());
assertEquals(fn.getReturnType(), applyPropType.toMaybeFunctionType().getReturnType());

}

@Test
public void getBindReturnType_givenArgsToBind_shouldTrimParametersAppropriately() {
Node p1 = Node.newString(Token.NAME, "a");
Node p2 = Node.newString(Token.NAME, "b");
Node p3 = Node.newString(Token.NAME, "c");
Node params = new Node(Token.PARAM_LIST, p1, p2, p3);
ArrowType arrow = new ArrowType(
registry, params, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
FunctionType fn = new FunctionType(
registry, "fn", null, arrow, null, null, false, false);

FunctionType bound2 = fn.getBindReturnType(2);
assertEquals(2, bound2.getParametersNode().getChildCount());

FunctionType boundNegative = fn.getBindReturnType(-1);
assertEquals(0, boundNegative.getParametersNode().getChildCount());

}

@Test
public void getBindReturnType_whenVarArgsEncountered_shouldStopTrimming() {
Node p1 = Node.newString(Token.NAME, "a");
p1.setVarArgs(true);
Node p2 = Node.newString(Token.NAME, "b");
Node params = new Node(Token.PARAM_LIST, p1, p2);
ArrowType arrow = new ArrowType(
registry, params, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false);
FunctionType fn = new FunctionType(
registry, "fn", null, arrow, null, null, false, false);

FunctionType bound = fn.getBindReturnType(3);
assertEquals(2, bound.getParametersNode().getChildCount());

}

// ==========================================
// Interfaces and Inheritance
// ==========================================

@Test
public void setImplementedInterfaces_whenOrdinaryFunction_shouldThrowUnsupportedOperationException() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
try {
fn.setImplementedInterfaces(Collections.emptyList());
fail("Expected UnsupportedOperationException when calling setImplementedInterfaces on non-constructor");
} catch (UnsupportedOperationException e) {
// Expected
}
}

@Test
public void setImplementedInterfaces_whenConstructor_shouldStoreInterfaces() {
FunctionType ctor = new FunctionType(
registry, "Ctor", null, dummyArrow, null, null, true, false);
FunctionType iface = FunctionType.forInterface(registry, "IFoo", null);
List ifaces = new ArrayList();
ifaces.add(iface.getInstanceType());

ctor.setImplementedInterfaces(ifaces);
assertTrue(ctor.hasImplementedInterfaces());

Iterator<ObjectType> it = ctor.getOwnImplementedInterfaces().iterator();
assertTrue(it.hasNext());
assertSame(iface.getInstanceType(), it.next());

}

@Test
public void setExtendedInterfaces_whenNotInterface_shouldThrowUnsupportedOperationException() {
FunctionType ctor = new FunctionType(
registry, "Ctor", null, dummyArrow, null, null, true, false);
try {
ctor.setExtendedInterfaces(Collections.emptyList());
fail("Expected UnsupportedOperationException when calling setExtendedInterfaces on constructor");
} catch (UnsupportedOperationException e) {
// Expected
}
}

@Test
public void setExtendedInterfaces_whenInterface_shouldStoreAndCount() {
FunctionType ifaceChild = FunctionType.forInterface(registry, "IChild", null);
FunctionType ifaceParent = FunctionType.forInterface(registry, "IParent", null);
List list = new ArrayList();
list.add(ifaceParent.getInstanceType());

ifaceChild.setExtendedInterfaces(list);
assertEquals(1, ifaceChild.getExtendedInterfacesCount());
assertSame(ifaceParent.getInstanceType(), ifaceChild.getExtendedInterfaces().iterator().next());

}

@Test
public void getAllImplementedInterfaces_givenHierarchicalInterfaces_shouldTraverseAll() {
FunctionType ifaceRoot = FunctionType.forInterface(registry, "IRoot", null);
FunctionType ifaceMid = FunctionType.forInterface(registry, "IMid", null);
ifaceMid.setExtendedInterfaces(Collections.singletonList(ifaceRoot.getInstanceType()));

FunctionType ctor = new FunctionType(
    registry, "Ctor", null, dummyArrow, null, null, true, false);
ctor.setImplementedInterfaces(Collections.singletonList(ifaceMid.getInstanceType()));

Set<ObjectType> all = (Set<ObjectType>) ctor.getAllImplementedInterfaces();
assertTrue(all.contains(ifaceMid.getInstanceType()));
assertTrue(all.contains(ifaceRoot.getInstanceType()));

}

@Test
public void getAllExtendedInterfaces_givenHierarchy_shouldTraverseAll() {
FunctionType ifaceA = FunctionType.forInterface(registry, "IA", null);
FunctionType ifaceB = FunctionType.forInterface(registry, "IB", null);
ifaceB.setExtendedInterfaces(Collections.singletonList(ifaceA.getInstanceType()));

Set<ObjectType> all = (Set<ObjectType>) ifaceB.getAllExtendedInterfaces();
assertTrue(all.contains(ifaceA.getInstanceType()));

}

@Test
public void getSuperClassConstructor_whenNeitherConstructorNorInterface_shouldThrowPreconditionError() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
try {
fn.getSuperClassConstructor();
fail("Expected IllegalArgumentException when calling getSuperClassConstructor on ordinary function");
} catch (IllegalArgumentException e) {
// Expected
}
}

@Test
public void getSuperClassConstructor_whenInheritingFromAnotherConstructor_shouldReturnSuperConstructor() {
FunctionType superCtor = new FunctionType(
registry, "SuperClass", null, dummyArrow, null, null, true, false);
FunctionType subCtor = new FunctionType(
registry, "SubClass", null, dummyArrow, null, null, true, false);

subCtor.setPrototypeBasedOn(superCtor.getInstanceType());
assertSame(superCtor, subCtor.getSuperClassConstructor());

}

@Test
public void getTopMostDefiningType_whenClassHasPropertyInHierarchy_shouldReturnTopmostType() {
FunctionType baseCtor = new FunctionType(
registry, "Base", null, dummyArrow, null, null, true, false);
baseCtor.getPrototype().defineProperty(
"myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

FunctionType derivedCtor = new FunctionType(
    registry, "Derived", null, dummyArrow, null, null, true, false);
derivedCtor.setPrototypeBasedOn(baseCtor.getInstanceType());

derivedCtor.getInstanceType().defineProperty(
    "myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

ObjectType topType = derivedCtor.getTopMostDefiningType("myProp");
assertEquals(baseCtor.getInstanceType(), topType);

}

// ==========================================
// Equivalence, HashCode, and Subtyping
// ==========================================

@Test
public void checkFunctionEquivalenceHelper_forConstructors_shouldRequireReferenceIdentity() {
FunctionType ctor1 = new FunctionType(
registry, "Ctor", null, dummyArrow, null, null, true, false);
FunctionType ctor2 = new FunctionType(
registry, "Ctor", null, dummyArrow, null, null, true, false);

assertTrue(ctor1.checkFunctionEquivalenceHelper(ctor1, false));
assertFalse(ctor1.checkFunctionEquivalenceHelper(ctor2, false));

}

@Test
public void checkFunctionEquivalenceHelper_forInterfaces_shouldCompareReferenceNames() {
FunctionType iface1 = FunctionType.forInterface(registry, "IFoo", null);
FunctionType iface2 = FunctionType.forInterface(registry, "IFoo", null);
FunctionType iface3 = FunctionType.forInterface(registry, "IBar", null);

assertTrue(iface1.checkFunctionEquivalenceHelper(iface2, false));
assertFalse(iface1.checkFunctionEquivalenceHelper(iface3, false));

}

@Test
public void checkFunctionEquivalenceHelper_forOrdinaryFunctions_shouldCompareTypeOfThisAndCall() {
FunctionType fn1 = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
FunctionType fn2 = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);

assertTrue(fn1.checkFunctionEquivalenceHelper(fn2, false));
assertTrue(fn1.hasEqualCallType(fn2));

}

@Test
public void hashCode_whenInterface_shouldDependOnReferenceName() {
FunctionType iface = FunctionType.forInterface(registry, "IFoo", null);
assertEquals("IFoo".hashCode(), iface.hashCode());
}

@Test
public void isSubtype_whenTargetIsInterface_shouldReturnTrue() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
FunctionType iface = FunctionType.forInterface(registry, "IFoo", null);

assertTrue(fn.isSubtype(iface));

}

@Test
public void isSubtype_whenThisIsInterfaceAndTargetIsNot_shouldReturnFalse() {
FunctionType iface = FunctionType.forInterface(registry, "IFoo", null);
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);

assertFalse(iface.isSubtype(fn));

}

// ==========================================
// Super and Inf Helper (Least Supertype / Greatest Subtype)
// ==========================================

@Test
public void supAndInfHelper_whenSelfEquivalent_shouldReturnThis() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertSame(fn, fn.supAndInfHelper(fn, true));
assertSame(fn, fn.supAndInfHelper(fn, false));
}

@Test
public void supAndInfHelper_givenNull_shouldThrowNullPointerException() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
try {
fn.supAndInfHelper(null, true);
fail("Expected NullPointerException when comparing with null");
} catch (NullPointerException e) {
// Expected
}
}

// ==========================================
// String Formats: toStringHelper and toDebugHashCodeString
// ==========================================

@Test
public void toStringHelper_whenPrettyPrintIsFalse_shouldReturnFunctionLiteral() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
fn.setPrettyPrint(false);

assertEquals("Function", fn.toStringHelper(false));

}

@Test
public void toStringHelper_whenPrettyPrintIsTrue_shouldFormatParametersAndReturn() {
Node p1 = Node.newString(Token.NAME, "optArg");
p1.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
p1.setOptionalArg(true);

Node p2 = Node.newString(Token.NAME, "restArg");
p2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
p2.setVarArgs(true);

Node params = new Node(Token.PARAM_LIST, p1, p2);
ArrowType arrow = new ArrowType(
    registry, params, registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false);
FunctionType fn = new FunctionType(
    registry, "fn", null, arrow, null, null, false, false);

String str = fn.toStringHelper(false);
assertTrue(str.startsWith("function ("));
assertTrue(str.contains("string="));
assertTrue(str.contains("...[number]"));
assertTrue(str.endsWith("): boolean"));

}

@Test
public void toDebugHashCodeString_forStandardFunction_shouldContainParamAndReturnHashes() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
String debugStr = fn.toDebugHashCodeString();

assertNotNull(debugStr);
assertTrue(debugStr.startsWith("function ("));

}

// ==========================================
// Visitor, Cloning, Cache, and Template Internal
// ==========================================

@Test
public void visit_shouldInvokeCaseFunctionType() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);

Visitor<String> visitor = new Visitor<String>() {
  @Override
  public String caseFunctionType(FunctionType type) {
    return "visitedFunction";
  }

  @Override
  public String caseObjectType(ObjectType type) {
    return "visitedObject";
  }

  @Override
  public String caseUnknownType() {
    return "visitedUnknown";
  }

  @Override
  public String caseNullType() {
    return "visitedNull";
  }

  @Override
  public String caseNumberType() {
    return "visitedNumber";
  }

  @Override
  public String caseStringType() {
    return "visitedString";
  }

  @Override
  public String caseBooleanType() {
    return "visitedBoolean";
  }

  @Override
  public String caseUnionType(UnionType type) {
    return "visitedUnion";
  }

  @Override
  public String caseAllType() {
    return "visitedAll";
  }

  @Override
  public String caseNoType() {
    return "visitedNo";
  }

  @Override
  public String caseNoObjectType() {
    return "visitedNoObject";
  }

  @Override
  public String caseVoidType() {
    return "visitedVoid";
  }

  @Override
  public String caseParameterizedType(ParameterizedType type) {
    return "visitedParameterized";
  }

  @Override
  public String caseTemplateType(TemplateType templateType) {
    return "visitedTemplate";
  }
};

assertEquals("visitedFunction", fn.visit(visitor));

}

@Test
public void cloneWithoutArrowType_shouldProduceConstructorWithEmptyArrow() {
FunctionType ctor = new FunctionType(
registry, "MyClass", functionNode, dummyArrow, null, null, true, false);
FunctionType clone = ctor.cloneWithoutArrowType();

assertTrue(clone.isConstructor());
assertEquals("MyClass", clone.getReferenceName());
assertEquals(0, clone.getParametersNode().getChildCount());

}

@Test
public void clearCachedValues_and_hasCachedValues_shouldUpdateProperly() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertFalse(fn.hasCachedValues());

fn.getPrototype();
assertTrue(fn.hasCachedValues());

fn.clearCachedValues();
assertTrue(fn.hasCachedValues());

}

@Test
public void hasAnyTemplateInternal_whenTemplatePresent_shouldReturnTrue() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, ImmutableList.of("T"), false, false);
assertTrue(fn.hasAnyTemplateInternal());
}

@Test
public void hasAnyTemplateInternal_whenNoTemplatePresent_shouldReturnFalse() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
assertFalse(fn.hasAnyTemplateInternal());
}

@Test
public void resolveInternal_shouldResolveComponentsAndReturnResolved() {
FunctionType fn = new FunctionType(
registry, "fn", null, dummyArrow, null, null, false, false);
fn.getPrototype();

JSType resolved = fn.resolveInternal(null, null);
assertNotNull(resolved);
assertSame(fn, resolved);

}
}
