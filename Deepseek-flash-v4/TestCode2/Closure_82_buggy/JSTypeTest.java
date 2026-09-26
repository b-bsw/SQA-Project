package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;

public class JSTypeTest {

    private JSTypeRegistry registry;
    private JSType noType;
    private JSType noObjectType;
    private JSType noResolvedType;
    private JSType unknownType;
    private JSType allType;
    private JSType stringType;
    private JSType numberType;
    private JSType booleanType;
    private JSType nullType;
    private JSType voidType;
    private JSType objectType;
    private JSType functionType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null);
        noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        functionType = registry.getNativeType(JSTypeNative.FUNCTION_TYPE);
    }

    @Test
    public void testEmptyTypeCombinations() {
        assertTrue(noType.isEmptyType());
        assertTrue(noObjectType.isEmptyType());
        assertTrue(noResolvedType.isEmptyType());
        assertFalse(unknownType.isEmptyType());
        assertFalse(allType.isEmptyType());
    }

    @Test
    public void testHasDisplayName() {
        JSType jsType = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        assertFalse(jsType.hasDisplayName());
    }

    @Test
    public void testHasDisplayNameWithNotNullAndNotEmpty() {
        JSType jsType = new JSType(registry) {
            @Override public String getDisplayName() { return "MyType"; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        assertTrue(jsType.hasDisplayName());
    }

    @Test
    public void testIsEquivalentToSameInstance() {
        assertTrue(noType.isEquivalentTo(noType));
        assertTrue(unknownType.isEquivalentTo(unknownType));
    }

    @Test
    public void testIsEquivalentToNull() {
        assertFalse(noType.isEquivalentTo(null));
    }

    @Test
    public void testIsEquivalentToProxyObjectType() {
        JSType proxy = new ProxyObjectType(registry, noType) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        assertTrue(noType.isEquivalentTo(proxy));
    }

    @Test
    public void testStaticIsEquivalentBothNull() {
        assertTrue(JSType.isEquivalent(null, null));
    }

    @Test
    public void testStaticIsEquivalentOneNull() {
        assertFalse(JSType.isEquivalent(noType, null));
        assertFalse(JSType.isEquivalent(null, noType));
    }

    @Test
    public void testStaticIsEquivalentBothNonNull() {
        assertTrue(JSType.isEquivalent(noType, noType));
        assertFalse(JSType.isEquivalent(noType, unknownType));
    }

    @Test
    public void testEqualsWithJSType() {
        assertTrue(noType.equals(noType));
        assertFalse(noType.equals(unknownType));
    }

    @Test
    public void testEqualsWithNonJSType() {
        assertFalse(noType.equals("string"));
    }

    @Test
    public void testHashCode() {
        assertEquals(System.identityHashCode(noType), noType.hashCode());
    }

    @Test
    public void testMatchesInt32Context() {
        assertFalse(noType.matchesInt32Context());
        assertTrue(numberType.matchesInt32Context());
    }

    @Test
    public void testMatchesUint32Context() {
        assertFalse(noType.matchesUint32Context());
        assertTrue(numberType.matchesUint32Context());
    }

    @Test
    public void testFindPropertyTypeWithAutobox() {
        JSType jsType = new JSType(registry) {
            @Override public JSType autoboxesTo() { return objectType; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        assertNotNull(jsType.findPropertyType("length"));
    }

    @Test
    public void testFindPropertyTypeNoAutobox() {
        assertNull(noType.findPropertyType("length"));
    }

    @Test
    public void testCanBeCalled() {
        assertFalse(noType.canBeCalled());
        assertTrue(functionType.canBeCalled());
    }

    @Test
    public void testCanAssignToWhenSubtype() {
        assertTrue(noType.canAssignTo(noType));
        assertTrue(stringType.canAssignTo(allType));
        assertFalse(allType.canAssignTo(stringType));
    }

    @Test
    public void testAutoboxesTo() {
        assertNull(noType.autoboxesTo());
        assertNotNull(stringType.autoboxesTo());
    }

    @Test
    public void testUnboxesTo() {
        assertNull(noType.unboxesTo());
    }

    @Test
    public void testToObjectType() {
        assertNull(noType.toObjectType());
        assertNotNull(objectType.toObjectType());
    }

    @Test
    public void testDereferenceNoAutobox() {
        assertNull(noType.dereference());
        assertNotNull(objectType.dereference());
    }

    @Test
    public void testDereferenceWithAutobox() {
        JSType jsType = new JSType(registry) {
            @Override public JSType autoboxesTo() { return objectType; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        assertNotNull(jsType.dereference());
    }

    @Test
    public void testCanTestForEqualityWith() {
        assertTrue(unknownType.canTestForEqualityWith(noType));
        assertTrue(noType.canTestForEqualityWith(unknownType));
        assertTrue(allType.canTestForEqualityWith(unknownType));
    }

    @Test
    public void testTestForEqualityAllUnknownOrNoResolved() {
        assertEquals(TernaryValue.UNKNOWN, noType.testForEquality(unknownType));
        assertEquals(TernaryValue.UNKNOWN, unknownType.testForEquality(noType));
        assertEquals(TernaryValue.UNKNOWN, allType.testForEquality(noType));
        assertEquals(TernaryValue.UNKNOWN, noType.testForEquality(allType));
        assertEquals(TernaryValue.UNKNOWN, noResolvedType.testForEquality(unknownType));
    }

    @Test
    public void testTestForEqualityBothEmpty() {
        assertEquals(TernaryValue.TRUE, noType.testForEquality(noType));
        assertEquals(TernaryValue.TRUE, noObjectType.testForEquality(noObjectType));
    }

    @Test
    public void testTestForEqualityOneEmptyOneNot() {
        assertEquals(TernaryValue.UNKNOWN, noType.testForEquality(stringType));
        assertEquals(TernaryValue.UNKNOWN, stringType.testForEquality(noType));
    }

    @Test
    public void testTestForEqualityFunctionType() {
        assertEquals(TernaryValue.UNKNOWN, functionType.testForEquality(stringType));
        assertEquals(TernaryValue.UNKNOWN, stringType.testForEquality(functionType));
    }

    @Test
    public void testTestForEqualityFunctionTypeWithNullSubtype() {
        assertEquals(TernaryValue.FALSE, functionType.testForEquality(noType));
        assertEquals(TernaryValue.FALSE, noType.testForEquality(functionType));
    }

    @Test
    public void testTestForEqualityDelegatesToUnionOrEnum() {
        JSType enumType = registry.getNativeType(JSTypeNative.ENUM_TYPE);
        assertEquals(TernaryValue.UNKNOWN, stringType.testForEquality(enumType));
    }

    @Test
    public void testTestForEqualityHelperReturnsNullForNormalCase() {
        assertEquals(TernaryValue.FALSE, stringType.testForEquality(numberType));
    }

    @Test
    public void testCanTestForShallowEqualityWith() {
        assertTrue(stringType.canTestForShallowEqualityWith(stringType));
        assertTrue(stringType.canTestForShallowEqualityWith(allType));
        assertFalse(stringType.canTestForShallowEqualityWith(numberType));
    }

    @Test
    public void testIsNullable() {
        assertTrue(nullType.isNullable());
        assertTrue(voidType.isNullable());
        assertFalse(stringType.isNullable());
    }

    @Test
    public void testGetLeastSupertypeEquivalent() {
        assertEquals(noType, noType.getLeastSupertype(noType));
    }

    @Test
    public void testGetLeastSupertypeNonEquivalent() {
        JSType union = noType.getLeastSupertype(stringType);
        assertTrue(union.isUnionType());
    }

    @Test
    public void testGetLeastSupertypeWithUnionType() {
        JSType unionType = registry.createUnionType(stringType, numberType);
        JSType result = noType.getLeastSupertype(unionType);
        assertTrue(result.isUnionType());
    }

    @Test
    public void testGetGreatestSubtypeEquivalent() {
        assertEquals(noType, noType.getGreatestSubtype(noType));
    }

    @Test
    public void testGetGreatestSubtypeWithUnknown() {
        assertEquals(unknownType, noType.getGreatestSubtype(unknownType));
        assertEquals(unknownType, unknownType.getGreatestSubtype(noType));
    }

    @Test
    public void testGetGreatestSubtypeSubtype() {
        assertEquals(noType, noType.getGreatestSubtype(allType));
    }

    @Test
    public void testGetGreatestSubtypeNeitherSubtype() {
        JSType result = stringType.getGreatestSubtype(numberType);
        assertTrue(result.isNoType() || result.isNoObjectType());
    }

    @Test
    public void testGetGreatestSubtypeUnionType() {
        JSType unionType = registry.createUnionType(stringType, numberType);
        JSType result = unionType.getGreatestSubtype(allType);
        assertTrue(result.isUnionType() || result.isNoType() || result.equals(allType));
    }

    @Test
    public void testFilterNoResolvedTypeOnNoResolvedType() {
        JSType filtered = JSType.filterNoResolvedType(noResolvedType);
        assertEquals(registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE), filtered);
    }

    @Test
    public void testFilterNoResolvedTypeOnUnionWithNoResolved() {
        UnionType union = new UnionType(registry);
        union.addAlternate(stringType);
        union.addAlternate(noResolvedType);
        JSType filtered = JSType.filterNoResolvedType(union);
        assertFalse(filtered.isUnionType());
    }

    @Test
    public void testFilterNoResolvedTypeOnRegularType() {
        assertEquals(stringType, JSType.filterNoResolvedType(stringType));
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeContains() {
        assertEquals(stringType, stringType.getRestrictedTypeGivenToBooleanOutcome(true));
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeNotContains() {
        assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), nullType.getRestrictedTypeGivenToBooleanOutcome(true));
    }

    @Test
    public void testGetTypesUnderEqualityWithUnionType() {
        JSType unionType = registry.createUnionType(stringType, numberType);
        TypePair pair = stringType.getTypesUnderEquality(unionType);
        assertNotNull(pair);
    }

    @Test
    public void testGetTypesUnderEqualityFalseCase() {
        TypePair pair = stringType.getTypesUnderEquality(numberType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderEqualityTrueOrUnknownCase() {
        TypePair pair = stringType.getTypesUnderEquality(unknownType);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTypesUnderEqualityIllegalState() {
        JSType jsType = new JSType(registry) {
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.FALSE; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        jsType.getTypesUnderEquality(jsType);
    }

    @Test
    public void testGetTypesUnderInequalityWithUnionType() {
        JSType unionType = registry.createUnionType(stringType, numberType);
        TypePair pair = stringType.getTypesUnderInequality(unionType);
        assertNotNull(pair);
    }

    @Test
    public void testGetTypesUnderInequalityTrueCase() {
        TypePair pair = stringType.getTypesUnderInequality(stringType);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
        assertTrue(pair.typeA.isNoType());
        assertTrue(pair.typeB.isNoType());
    }

    @Test
    public void testGetTypesUnderInequalityFalseOrUnknownCase() {
        TypePair pair = stringType.getTypesUnderInequality(numberType);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTypesUnderInequalityIllegalState() {
        JSType jsType = new JSType(registry) {
            @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.TRUE; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        jsType.getTypesUnderInequality(jsType);
    }

    @Test
    public void testGetTypesUnderShallowEquality() {
        TypePair pair = stringType.getTypesUnderShallowEquality(stringType);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
        assertEquals(stringType, pair.typeA);
    }

    @Test
    public void testGetTypesUnderShallowInequalityWithUnionType() {
        JSType unionType = registry.createUnionType(stringType, numberType);
        TypePair pair = stringType.getTypesUnderShallowInequality(unionType);
        assertNotNull(pair);
    }

    @Test
    public void testGetTypesUnderShallowInequalityBothNull() {
        TypePair pair = nullType.getTypesUnderShallowInequality(nullType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequalityBothVoid() {
        TypePair pair = voidType.getTypesUnderShallowInequality(voidType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequalityOtherwise() {
        TypePair pair = stringType.getTypesUnderShallowInequality(numberType);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
    }

    @Test
    public void testRestrictByNotNullOrUndefined() {
        assertEquals(noType, noType.restrictByNotNullOrUndefined());
    }

    @Test
    public void testDiffersFromBothUnknown() {
        assertFalse(unknownType.differsFrom(unknownType));
    }

    @Test
    public void testDiffersFromOneUnknown() {
        assertTrue(unknownType.differsFrom(stringType));
        assertTrue(stringType.differsFrom(unknownType));
    }

    @Test
    public void testDiffersFromNeitherUnknownEquivalent() {
        assertFalse(stringType.differsFrom(stringType));
    }

    @Test
    public void testDiffersFromNeitherUnknownNotEquivalent() {
        assertTrue(stringType.differsFrom(numberType));
    }

    @Test
    public void testStaticIsSubtypeWithUnknownType() {
        assertTrue(JSType.isSubtype(stringType, unknownType));
    }

    @Test
    public void testStaticIsSubtypeEquivalent() {
        assertTrue(JSType.isSubtype(stringType, stringType));
    }

    @Test
    public void testStaticIsSubtypeWithAllType() {
        assertTrue(JSType.isSubtype(stringType, allType));
    }

    @Test
    public void testStaticIsSubtypeWithUnionType() {
        JSType unionType = registry.createUnionType(stringType, numberType);
        assertTrue(JSType.isSubtype(stringType, unionType));
    }

    @Test
    public void testStaticIsSubtypeWithNamedType() {
        JSType namedType = new NamedType(registry, "test", null, null, null);
        assertFalse(JSType.isSubtype(stringType, namedType));
    }

    @Test
    public void testStaticIsSubtypeOtherwise() {
        assertFalse(JSType.isSubtype(stringType, numberType));
    }

    @Test
    public void testForceResolve() {
        JSType jsType = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return unknownType; }
        };
        JSType result = jsType.forceResolve(null, null);
        assertEquals(unknownType, result);
    }

    @Test
    public void testResolveAlreadyResolvedWithNullResult() {
        JSType jsType = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return null; }
        };
        jsType.setResolvedTypeInternal(null);
        JSType result = jsType.resolve(null, null);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
    }

    @Test
    public void testResolveNotResolved() {
        JSType jsType = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return stringType; }
        };
        JSType result = jsType.resolve(null, null);
        assertEquals(stringType, result);
        assertTrue(jsType.isResolved());
    }

    @Test
    public void testIsResolved() {
        assertFalse(noType.isResolved());
    }

    @Test
    public void testClearResolved() {
        JSType jsType = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return stringType; }
        };
        jsType.resolve(null, null);
        jsType.clearResolved();
        assertFalse(jsType.isResolved());
    }

    @Test
    public void testSafeResolveWithNull() {
        assertNull(JSType.safeResolve(null, null, null));
    }

    @Test
    public void testSafeResolveWithNonNull() {
        assertEquals(stringType, JSType.safeResolve(stringType, null, null));
    }

    @Test
    public void testSetValidator() {
        JSType jsType = new JSType(registry) {
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return null; }
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        };
        assertTrue(jsType.setValidator(new Predicate<JSType>() {
            @Override public boolean apply(JSType input) { return true; }
        }));
    }

    @Test
    public void testToDebugHashCodeString() {
        String hashStr = noType.toDebugHashCodeString();
        assertTrue(hashStr.startsWith("{"));
        assertTrue(hashStr.endsWith("}"));
    }

    @Test
    public void testTypePair() {
        JSType.TypePair pair = new JSType.TypePair(stringType, numberType);
        assertEquals(stringType, pair.typeA);
        assertEquals(numberType, pair.typeB);
    }
}