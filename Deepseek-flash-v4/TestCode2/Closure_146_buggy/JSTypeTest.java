package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class JSTypeTest {

    private TestRegistry registry;
    private TestJSType typeA, typeB, typeNoType, typeUnknown, typeAllType, typeNull, typeVoid, typeEnumElem;
    private ErrorReporter reporter;
    private StaticScope<JSType> scope;

    @Before
    public void setUp() {
        reporter = new ErrorReporter() {
            @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        scope = new StaticScope<JSType>() {
            @Override public StaticScope<JSType> getParentScope() { return null; }
            @Override public JSType findSlot(String name) { return null; }
        };
        registry = new TestRegistry(reporter);
        typeA = new TestJSType(registry);
        typeB = new TestJSType(registry);
        typeNoType = new TestJSType(registry) {{ noType = true; }};
        typeUnknown = new TestJSType(registry) {{ unknownType = true; }};
        typeAllType = new TestJSType(registry) {{ allType = true; }};
        typeNull = new TestJSType(registry) {{ nullType = true; }};
        typeVoid = new TestJSType(registry) {{ voidType = true; }};
        typeEnumElem = new TestJSType(registry) {{ enumElemType = true; }};
        registry.addNativeType(JSTypeNative.NULL_TYPE, typeNull);
        registry.addNativeType(JSTypeNative.VOID_TYPE, typeVoid);
        registry.addNativeType(JSTypeNative.UNKNOWN_TYPE, typeUnknown);
        registry.addNativeType(JSTypeNative.NO_TYPE, typeNoType);
    }

    static class TestJSType extends JSType {
        boolean noType, noObjectType, unknownType, allType, objectType, unionType, enumElemType,
            nullType, voidType, recordType, functionType, stringValueType, numberValueType,
            booleanValueType, arrayType, regexpType, dateType, checkedUnknownType, templateType,
            instanceType, interfaceType, ordinaryFunctionType, constructorType, nominalType, namedType;
        boolean subtypeResult;
        BooleanLiteralSet boolOutcomes = BooleanLiteralSet.BOTH;
        JSType autoboxTo, unboxTo, restrictByNotNull, getGreatestSubtypeResult;
        TernaryValue testForEqualityReturn;

        TestJSType(JSTypeRegistry registry) {
            super(registry);
        }

        @Override public boolean isNoType() { return noType; }
        @Override public boolean isNoObjectType() { return noObjectType; }
        @Override public boolean isUnknownType() { return unknownType; }
        @Override public boolean isAllType() { return allType; }
        @Override public boolean isObject() { return objectType; }
        @Override public boolean isUnionType() { return unionType; }
        @Override public boolean isEnumElementType() { return enumElemType; }
        @Override public boolean isNullType() { return nullType; }
        @Override public boolean isVoidType() { return voidType; }
        @Override public boolean isRecordType() { return recordType; }
        @Override public boolean isFunctionType() { return functionType; }
        @Override public boolean isStringValueType() { return stringValueType; }
        @Override public boolean isNumberValueType() { return numberValueType; }
        @Override public boolean isBooleanValueType() { return booleanValueType; }
        @Override public boolean isArrayType() { return arrayType; }
        @Override public boolean isRegexpType() { return regexpType; }
        @Override public boolean isDateType() { return dateType; }
        @Override public boolean isCheckedUnknownType() { return checkedUnknownType; }
        @Override public boolean isTemplateType() { return templateType; }
        @Override public boolean isInstanceType() { return instanceType; }
        @Override public boolean isInterface() { return interfaceType; }
        @Override public boolean isOrdinaryFunction() { return ordinaryFunctionType; }
        @Override public boolean isConstructor() { return constructorType; }
        @Override public boolean isNominalType() { return nominalType; }
        @Override boolean isNamedType() { return namedType; }
        @Override public boolean isSubtype(JSType that) { return subtypeResult; }
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return boolOutcomes; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        @Override public JSType autoboxesTo() { return autoboxTo; }
        @Override public JSType unboxesTo() { return unboxTo; }
        @Override public JSType restrictByNotNullOrUndefined() { return restrictByNotNull != null ? restrictByNotNull : this; }
        @Override public TernaryValue testForEquality(JSType that) { return testForEqualityReturn != null ? testForEqualityReturn : super.testForEquality(that); }
        @Override public JSType getGreatestSubtype(JSType that) {
            return getGreatestSubtypeResult != null ? getGreatestSubtypeResult : super.getGreatestSubtype(that);
        }
    }

    static class TestRegistry extends JSTypeRegistry {
        private Map<JSTypeNative, JSType> nativeTypes = new HashMap<>();
        private ResolveMode resolveMode = ResolveMode.LAZY;

        TestRegistry(ErrorReporter reporter) {
            super(reporter);
        }

        void addNativeType(JSTypeNative id, JSType type) { nativeTypes.put(id, type); }
        @Override public JSType getNativeType(JSTypeNative id) { return nativeTypes.get(id); }
        @Override public ResolveMode getResolveMode() { return resolveMode; }
        @Override public void setResolveMode(ResolveMode mode) { resolveMode = mode; }
        @Override public JSType createUnionType(JSType... types) {
            return new TestUnionType(this, types);
        }
    }

    @Test
    public void testIsEmptyType() {
        assertFalse(typeA.isEmptyType());
        typeA.noType = true;
        assertTrue(typeA.isEmptyType());
        typeA.noType = false; typeA.noObjectType = true;
        assertTrue(typeA.isEmptyType());
    }

    @Test
    public void testIsString() {
        TestJSType nativeType = new TestJSType(registry);
        registry.addNativeType(JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE, nativeType);
        typeA.subtypeResult = false;
        assertFalse(typeA.isString());
        typeA.subtypeResult = true;
        assertTrue(typeA.isString());
    }

    @Test
    public void testIsNumber() {
        TestJSType nativeType = new TestJSType(registry);
        registry.addNativeType(JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE, nativeType);
        typeA.subtypeResult = false;
        assertFalse(typeA.isNumber());
        typeA.subtypeResult = true;
        assertTrue(typeA.isNumber());
    }

    @Test
    public void testIsEquivalentTo() {
        assertTrue(typeA.isEquivalentTo(typeA));
        assertFalse(typeA.isEquivalentTo(typeB));
        // ProxyObjectType delegation branch
        TestProxyObjectType proxy = new TestProxyObjectType(registry, typeB);
        proxy.proxyEquivResult = true;
        assertTrue(typeA.isEquivalentTo(proxy));
        proxy.proxyEquivResult = false;
        assertFalse(typeA.isEquivalentTo(proxy));
    }

    @Test
    public void testIsEquivalentStatic() {
        assertTrue(JSType.isEquivalent(null, null));
        assertFalse(JSType.isEquivalent(typeA, null));
        assertFalse(JSType.isEquivalent(null, typeA));
        assertTrue(JSType.isEquivalent(typeA, typeA));
        assertFalse(JSType.isEquivalent(typeA, typeB));
    }

    @Test
    public void testEquals() {
        assertTrue(typeA.equals(typeA));
        assertFalse(typeA.equals(new Object()));
        assertFalse(typeA.equals(typeB));
    }

    @Test
    public void testMatchesNumberContext() {
        assertFalse(typeA.matchesNumberContext());
        typeA.matchesNumberContextResult = true;
        assertFalse(typeA.matchesInt32Context()); // ยังใช้ matchesNumberContext default
    }

    @Test
    public void testFindPropertyType_autoboxNull() {
        assertNull(typeA.findPropertyType("prop"));
    }

    @Test
    public void testCanBeCalled() {
        assertFalse(typeA.canBeCalled());
    }

    @Test
    public void testCanAssignTo() {
        typeA.subtypeResult = true;
        assertTrue(typeA.canAssignTo(typeB));
        typeA.subtypeResult = false;
        assertFalse(typeA.canAssignTo(typeB));
    }

    @Test
    public void testAutoboxesTo() {
        assertNull(typeA.autoboxesTo());
    }

    @Test
    public void testUnboxesTo() {
        assertNull(typeA.unboxesTo());
    }

    @Test
    public void testToObjectType() {
        assertNull(typeA.toObjectType());
    }

    @Test
    public void testDereference_simple() {
        // restrictByNotNullOrUndefined returns this, autoboxesTo null
        assertNull(typeA.dereference());
    }

    @Test
    public void testCanTestForEqualityWith() {
        assertTrue(typeA.canTestForEqualityWith(typeAllType));
    }

    @Test
    public void testTestForEquality() {
        assertEquals(UNKNOWN, typeA.testForEquality(typeAllType));
        assertEquals(UNKNOWN, typeA.testForEquality(typeNoType));
        assertEquals(UNKNOWN, typeA.testForEquality(typeUnknown));
        // enum element branch
        typeEnumElem.testForEqualityReturn = UNKNOWN;
        assertEquals(UNKNOWN, typeA.testForEquality(typeEnumElem));
        // other returns null
        assertNull(typeA.testForEquality(typeB));
    }

    @Test
    public void testIsNullable() {
        typeA.subtypeResult = false;
        assertFalse(typeA.isNullable());
        typeA.subtypeResult = true;
        assertTrue(typeA.isNullable());
    }

    @Test
    public void testGetLeastSupertype_nonUnion() {
        JSType result = typeA.getLeastSupertype(typeB);
        assertTrue(result instanceof UnionType);
    }

    @Test
    public void testGetGreatestSubtype() {
        // empty type branch
        typeNoType.getGreatestSubtypeResult = typeB;
        assertSame(typeB, typeA.getGreatestSubtype(typeNoType));
        // all type branch
        typeAllType.getGreatestSubtypeResult = typeB;
        assertSame(typeB, typeA.getGreatestSubtype(typeAllType));
        // unknown type equivalent
        typeUnknown.getGreatestSubtypeResult = typeUnknown;
        assertSame(typeUnknown, typeA.getGreatestSubtype(typeUnknown));
        // this subtype that -> returns this
        typeA.subtypeResult = true;
        assertSame(typeA, typeA.getGreatestSubtype(typeB));
        // that subtype this -> returns that
        typeA.subtypeResult = false; typeB.subtypeResult = true;
        assertSame(typeB, typeA.getGreatestSubtype(typeB));
    }

    @Test
    public void testDiffersFrom() {
        assertTrue(typeA.differsFrom(typeB));
        typeA.unknownType = true;
        typeB.unknownType = false;
        assertTrue(typeA.differsFrom(typeB));
        typeA.unknownType = true; typeB.unknownType = true;
        assertFalse(typeA.differsFrom(typeB));
    }

    @Test
    public void testIsSubtypeStatic() {
        // that unknown -> true
        assertTrue(JSType.isSubtype(typeA, typeUnknown));
        // equivalent -> true
        assertTrue(JSType.isSubtype(typeA, typeA));
        // that all -> true
        assertTrue(JSType.isSubtype(typeA, typeAllType));
        // otherwise false
        assertFalse(JSType.isSubtype(typeA, typeB));
    }

    @Test
    public void testResolve_unresolved() {
        JSType resolved = typeA.resolve(reporter, scope);
        assertNotNull(resolved);
        assertTrue(typeA.isResolved());
    }

    @Test
    public void testResolve_resolvedNullResult() {
        typeA.setResolvedTypeInternal(null);
        JSType resolved = typeA.resolve(reporter, scope);
        assertSame(typeUnknown, resolved);
    }

    @Test
    public void testResolve_resolvedWithResult() {
        typeA.setResolvedTypeInternal(typeB);
        JSType resolved = typeA.resolve(reporter, scope);
        assertSame(typeB, resolved);
    }

    @Test
    public void testForceResolve() {
        JSType resolved = typeA.forceResolve(reporter, scope);
        assertNotNull(resolved);
        assertTrue(typeA.isResolved());
    }

    @Test
    public void testClearResolved() {
        typeA.setResolvedTypeInternal(typeB);
        assertTrue(typeA.isResolved());
        typeA.clearResolved();
        assertFalse(typeA.isResolved());
    }

    @Test
    public void testSafeResolve() {
        assertNull(JSType.safeResolve(null, reporter, scope));
        assertNotNull(JSType.safeResolve(typeA, reporter, scope));
    }

    // Helper inner classes for Proxy and Union

    static class TestProxyObjectType extends ProxyObjectType {
        boolean proxyEquivResult = true;
        TestProxyObjectType(JSTypeRegistry registry, JSType referencedType) {
            super(registry, referencedType);
        }
        @Override public boolean isEquivalentTo(JSType other) { return proxyEquivResult; }
        @Override public boolean isSubtype(JSType that) { return false; }
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.BOTH; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
    }

    static class TestUnionType extends UnionType {
        TestUnionType(JSTypeRegistry registry, JSType... alternates) {
            super(registry, alternates);
        }
        @Override public boolean isSubtype(JSType that) { return false; }
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.BOTH; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        @Override public JSType getLeastSupertype(JSType that) { return that; }
    }
}