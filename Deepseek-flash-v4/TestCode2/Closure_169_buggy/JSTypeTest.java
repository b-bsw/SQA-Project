package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class JSTypeTest {

    private MockRegistry registry;
    private StubJSType noType, noObjectType, noResolvedType, unknownType, allType,
                     functionType, nullType, voidType, leastFunctionType,
                     globalThisType, checkedUnknownType, objectType;

    @Before
    public void setUp() {
        registry = new MockRegistry();
        noType = createStub(); noType.noType = true;
        noObjectType = createStub(); noObjectType.noObjectType = true;
        noResolvedType = createStub(); noResolvedType.noResolvedType = true;
        unknownType = createStub(); unknownType.unknownType = true;
        allType = createStub(); allType.allType = true;
        functionType = createStub(); functionType.functionType = true;
        nullType = createStub(); nullType.nullType = true;
        voidType = createStub(); voidType.voidType = true;
        leastFunctionType = createStub(); leastFunctionType.functionType = true;
        globalThisType = createStub();
        checkedUnknownType = createStub(); checkedUnknownType.checkedUnknownType = true;
        objectType = createStub(); objectType.isObject = true;

        registry.nativeTypes.put(JSTypeNative.NO_TYPE, noType);
        registry.nativeTypes.put(JSTypeNative.NO_OBJECT_TYPE, noObjectType);
        registry.nativeTypes.put(JSTypeNative.NO_RESOLVED_TYPE, noResolvedType);
        registry.nativeTypes.put(JSTypeNative.UNKNOWN_TYPE, unknownType);
        registry.nativeTypes.put(JSTypeNative.ALL_TYPE, allType);
        registry.nativeTypes.put(JSTypeNative.LEAST_FUNCTION_TYPE, leastFunctionType);
        registry.nativeTypes.put(JSTypeNative.NULL_TYPE, nullType);
        registry.nativeTypes.put(JSTypeNative.VOID_TYPE, voidType);
        registry.nativeTypes.put(JSTypeNative.GLOBAL_THIS, globalThisType);
        registry.nativeTypes.put(JSTypeNative.CHECKED_UNKNOWN_TYPE, checkedUnknownType);
        registry.nativeTypes.put(JSTypeNative.OBJECT_TYPE, objectType);
        registry.nativeTypes.put(JSTypeNative.NO_OBJECT_TYPE, noObjectType);
    }

    private StubJSType createStub() {
        return new StubJSType(registry);
    }

    // ===================== Tests =====================

    @Test
    public void testIsEmptyType_trueForNoType() {
        assertTrue(noType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_trueForNoObjectType() {
        assertTrue(noObjectType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_trueForNoResolvedType() {
        assertTrue(noResolvedType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_trueForLeastFunctionType() {
        assertTrue(leastFunctionType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_falseForOther() {
        assertFalse(createStub().isEmptyType());
    }

    @Test
    public void testHasDisplayName_null() {
        StubJSType t = createStub();
        t.displayName = null;
        assertFalse(t.hasDisplayName());
    }

    @Test
    public void testHasDisplayName_empty() {
        StubJSType t = createStub();
        t.displayName = "";
        assertFalse(t.hasDisplayName());
    }

    @Test
    public void testHasDisplayName_nonEmpty() {
        StubJSType t = createStub();
        t.displayName = "Foo";
        assertTrue(t.hasDisplayName());
    }

    @Test
    public void testIsGlobalThisType_true() {
        StubJSType t = createStub();
        // Simulate that registry returns this same object for GLOBAL_THIS
        registry.nativeTypes.put(JSTypeNative.GLOBAL_THIS, t);
        assertTrue(t.isGlobalThisType());
    }

    @Test
    public void testIsGlobalThisType_false() {
        assertFalse(createStub().isGlobalThisType());
    }

    @Test
    public void testIsNominalConstructor_notConstructor() {
        StubJSType t = createStub();
        t.isConstructor = false;
        t.isInterface = false;
        assertFalse(t.isNominalConstructor());
    }

    @Test
    public void testIsNominalConstructor_constructorWithNullFn() {
        StubJSType t = createStub();
        t.isConstructor = true;
        t.toMaybeFunctionTypeResult = null;
        assertFalse(t.isNominalConstructor());
    }

    @Test
    public void testIsNominalConstructor_constructorWithSource() {
        StubJSType t = createStub();
        t.isConstructor = true;
        FunctionType fn = new StubFunctionType(t.registry, true); // has source
        t.toMaybeFunctionTypeResult = fn;
        assertTrue(t.isNominalConstructor());
    }

    @Test
    public void testIsNominalConstructor_interfaceWithNative() {
        StubJSType t = createStub();
        t.isInterface = true;
        FunctionType fn = new StubFunctionType(t.registry, false); // native
        fn.isNativeObjectType = true;
        t.toMaybeFunctionTypeResult = fn;
        assertTrue(t.isNominalConstructor());
    }

    @Test
    public void testHasAnyTemplate_notInCheck() {
        StubJSType t = createStub();
        t.hasAnyTemplateInternalResult = false;
        assertFalse(t.hasAnyTemplate());
    }

    @Test
    public void testHasAnyTemplate_inCheckCycle() {
        StubJSType t = createStub();
        t.hasAnyTemplateInternalResult = true;
        // Call once to set flag
        assertTrue(t.hasAnyTemplate());
        // Second call while flag is still true should return false
        assertFalse(t.hasAnyTemplate());
    }

    @Test
    public void testIsEquivalent_sameReference() {
        StubJSType t = createStub();
        assertTrue(t.isEquivalentTo(t));
    }

    @Test
    public void testIsEquivalent_unknownBothTolerate() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        a.unknownType = true;
        b.unknownType = true;
        assertTrue(a.isInvariant(b)); // isInvariant uses tolerateUnknowns=false
        // differsFrom uses tolerateUnknowns=true
        assertFalse(a.differsFrom(b));
    }

    @Test
    public void testIsEquivalent_nominalSameName() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        a.isNominalType = true;
        b.isNominalType = true;
        a.referenceName = "Object";
        b.referenceName = "Object";
        // toObjectType must return non-null with getReferenceName
        a.toObjectTypeResult = new StubObjectType(a.registry, a.referenceName);
        b.toObjectTypeResult = new StubObjectType(b.registry, b.referenceName);
        assertTrue(a.isEquivalentTo(b));
    }

    @Test
    public void testIsEquivalent_nominalDifferentName() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        a.isNominalType = true;
        b.isNominalType = true;
        a.referenceName = "A";
        b.referenceName = "B";
        a.toObjectTypeResult = new StubObjectType(a.registry, a.referenceName);
        b.toObjectTypeResult = new StubObjectType(b.registry, b.referenceName);
        assertFalse(a.isEquivalentTo(b));
    }

    @Test
    public void testIsEquivalent_proxyType() {
        StubJSType a = createStub();
        StubJSType inner = createStub();
        a.proxyType = true;
        a.referencedType = inner;
        assertTrue(a.isEquivalentTo(inner));
        assertTrue(inner.isEquivalentTo(a));
    }

    @Test
    public void testEquals_sample() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        assertTrue(a.equals(a));
        assertFalse(a.equals("string"));
        assertFalse(a.equals(b));
    }

    @Test
    public void testHashCode_identity() {
        StubJSType a = createStub();
        assertEquals(System.identityHashCode(a), a.hashCode());
    }

    @Test
    public void testMatchesInt32Context_delegatesToNumberContext() {
        StubJSType t = createStub();
        t.matchesNumberContextResult = true;
        assertTrue(t.matchesInt32Context());
        t.matchesNumberContextResult = false;
        assertFalse(t.matchesInt32Context());
    }

    @Test
    public void testMatchesUint32Context_delegatesToNumberContext() {
        StubJSType t = createStub();
        t.matchesNumberContextResult = true;
        assertTrue(t.matchesUint32Context());
    }

    @Test
    public void testFindPropertyType_noAutobox() {
        StubJSType t = createStub();
        t.autoboxesToResult = null;
        assertNull(t.findPropertyType("prop"));
    }

    @Test
    public void testFindPropertyType_withAutobox() {
        StubJSType t = createStub();
        StubJSType autobox = createStub();
        autobox.isObject = true;
        autobox.isObject = true;
        // We need autobox.toObjectType() to return an ObjectType that has findPropertyType
        StubObjectType objType = new StubObjectType(autobox.registry, null);
        objType.propertyResult = autobox; // just some type
        autobox.toObjectTypeResult = objType;
        t.autoboxesToResult = autobox;
        assertNotNull(t.findPropertyType("prop"));
    }

    @Test
    public void testCanBeCalled_defaultFalse() {
        assertFalse(createStub().canBeCalled());
    }

    @Test
    public void testCanAssignTo_subtypeTrue() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        a.isSubtypeResult = true;
        assertTrue(a.canAssignTo(b));
    }

    @Test
    public void testCanAssignTo_subtypeFalse() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        a.isSubtypeResult = false;
        assertFalse(a.canAssignTo(b));
    }

    @Test
    public void testAutobox_restrictedNoAutobox() {
        StubJSType t = createStub();
        t.autoboxesToResult = null;
        assertEquals(t, t.autobox());
    }

    @Test
    public void testAutobox_returnsAutobox() {
        StubJSType t = createStub();
        StubJSType autobox = createStub();
        t.autoboxesToResult = autobox;
        assertSame(autobox, t.autobox());
    }

    @Test
    public void testDereference_autoboxThenToObject() {
        StubJSType t = createStub();
        StubJSType autobox = createStub();
        autobox.isObject = true;
        autobox.toObjectTypeResult = new StubObjectType(autobox.registry, null);
        t.autoboxesToResult = autobox;
        assertNotNull(t.dereference());
        assertTrue(t.dereference() instanceof ObjectType);
    }

    @Test
    public void testCanTestForEqualityWith_unknown() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        a.testForEqualityResult = TernaryValue.UNKNOWN;
        b.testForEqualityResult = TernaryValue.UNKNOWN;
        assertTrue(a.canTestForEqualityWith(b));
    }

    @Test
    public void testTestForEquality_allOrUnknownReturnsUnknown() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        b.allType = true;
        assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));
        b.allType = false; b.unknownType = true;
        assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));
    }

    @Test
    public void testTestForEquality_bothEmptyTrue() {
        StubJSType a = createStub(); a.noType = true;
        StubJSType b = createStub(); b.noType = true;
        assertEquals(TernaryValue.TRUE, a.testForEquality(b));
    }

    @Test
    public void testTestForEquality_oneEmptyUnknown() {
        StubJSType a = createStub(); a.noType = true;
        StubJSType b = createStub();
        assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));
    }

    @Test
    public void testTestForEquality_functionAgainstObjectNotNoType() {
        StubJSType fn = createStub(); fn.functionType = true;
        StubJSType obj = createStub(); obj.isObject = true;
        // Make getGreatestSubtype return non-empty (simulate meet)
        fn.greatestSubtypeResult = obj;
        assertEquals(TernaryValue.UNKNOWN, fn.testForEquality(obj));
    }

    @Test
    public void testTestForEquality_functionAgainstNoObjectType() {
        StubJSType fn = createStub(); fn.functionType = true;
        StubJSType noObj = createStub(); noObj.noObjectType = true;
        fn.greatestSubtypeResult = noObj;
        assertEquals(TernaryValue.FALSE, fn.testForEquality(noObj));
    }

    @Test
    public void testTestForEquality_enumDelegatesToEnum() {
        StubJSType a = createStub(); a.enumElementType = true;
        StubJSType b = createStub();
        b.testForEqualityResult = TernaryValue.TRUE;
        assertEquals(TernaryValue.TRUE, a.testForEquality(b));
    }

    @Test
    public void testTestForEquality_unionDelegatesToUnion() {
        StubJSType a = createStub(); a.isUnionType = true;
        StubJSType b = createStub();
        b.testForEqualityResult = TernaryValue.FALSE;
        assertEquals(TernaryValue.FALSE, a.testForEquality(b));
    }

    @Test
    public void testIsNullable_subtypeOfNull() {
        StubJSType t = createStub();
        t.isSubtypeResult = true;
        assertTrue(t.isNullable());
    }

    @Test
    public void testIsNullable_notSubtype() {
        StubJSType t = createStub();
        t.isSubtypeResult = false;
        assertFalse(t.isNullable());
    }

    @Test
    public void testCollapseUnion_returnsSelf() {
        StubJSType t = createStub();
        assertSame(t, t.collapseUnion());
    }

    @Test
    public void testIsSubtype_unknownThatTrue() {
        StubJSType that = createStub(); that.unknownType = true;
        StubJSType thisType = createStub();
        thisType.isSubtypeResult = false;
        assertTrue(that.isSubtype(that)); // both unknown
        // isSubtypeHelper checks thatType.isUnknownType() first, returns true
        assertTrue(thisType.isSubtype(that));
    }

    @Test
    public void testIsSubtype_allThatTrue() {
        StubJSType that = createStub(); that.allType = true;
        StubJSType thisType = createStub();
        assertTrue(thisType.isSubtype(that));
    }

    @Test
    public void testIsSubtype_equivalentTrue() {
        StubJSType t = createStub();
        assertTrue(t.isSubtype(t));
    }

    @Test
    public void testIsSubtype_unionContainsTrue() {
        StubJSType union = createStub(); union.isUnionType = true;
        StubUnionType unionType = new StubUnionType(union.registry);
        unionType.alternates = new ArrayList<>();
        unionType.alternates.add(createStub());
        union.toMaybeUnionTypeResult = unionType;
        StubJSType elem = createStub();
        elem.isSubtypeResult = true;
        unionType.alternates.get(0).isSubtypeResult = true; // needed?
        // isSubtypeHelper iterates union.alternates and calls thisType.isSubtype(element)
        // We need elem.isSubtype to return true
        // Set isSubtypeResult on elem
        elem.isSubtypeResult = true;
        assertTrue(elem.isSubtype(union));
    }

    @Test
    public void testIsSubtype_proxyType() {
        StubJSType proxy = createStub(); proxy.proxyType = true;
        StubJSType inner = createStub(); inner.isSubtypeResult = true;
        proxy.referencedType = inner;
        StubJSType that = createStub();
        assertTrue(that.isSubtype(proxy));
    }

    @Test
    public void testIsSubtype_false() {
        StubJSType a = createStub();
        StubJSType b = createStub();
        assertFalse(a.isSubtype(b));
    }

    @Test
    public void testResolve_alreadyResolvedCache() {
        StubJSType t = createStub();
        t.resolved = true;
        t.resolveResult = unknownType;
        assertSame(unknownType, t.resolve(null, null));
    }

    @Test
    public void testResolve_notResolvedCallsInternal() {
        StubJSType t = createStub();
        t.resolveResult = null;
        t.resolved = false;
        StubJSType internalResult = createStub();
        t.resolveInternalResult = internalResult;
        JSType result = t.resolve(null, null);
        assertSame(internalResult, result);
        assertTrue(t.resolved);
        assertSame(internalResult, t.resolveResult);
    }

    @Test
    public void testSafeResolve_nullReturnsNull() {
        assertNull(JSType.safeResolve(null, null, null));
    }

    @Test
    public void testSafeResolve_nonNullResolves() {
        StubJSType t = createStub();
        StubJSType resolved = createStub();
        t.resolveResult = resolved;
        t.resolved = true;
        assertSame(resolved, JSType.safeResolve(t, null, null));
    }

    @Test
    public void testFilterNoResolvedType_noResolvedReturnsNoResolvedType() {
        StubJSType t = createStub(); t.noResolvedType = true;
        assertSame(noResolvedType, JSType.filterNoResolvedType(t));
    }

    @Test
    public void testFilterNoResolvedType_unionWithNoResolved_givesBuilder() {
        StubJSType t = createStub(); t.isUnionType = true;
        StubUnionType union = new StubUnionType(t.registry);
        StubJSType alt1 = createStub();
        StubJSType alt2 = createStub(); alt2.noResolvedType = true;
        union.alternates = new ArrayList<>();
        union.alternates.add(alt1);
        union.alternates.add(alt2);
        t.toMaybeUnionTypeResult = union;
        JSType result = JSType.filterNoResolvedType(t);
        // Should be union without alt2, so only alt1 remains -> should be alt1 (since builder build might return single)
        assertSame(alt1, result);
    }

    // Additional tests for equality helpers, record, parameterized, etc. could be added but kept minimal.

    // ===================== Inner stub classes =====================

    private static class MockRegistry extends JSTypeRegistry {
        java.util.Map<JSTypeNative, JSType> nativeTypes = new java.util.HashMap<>();

        MockRegistry() {
            super((ErrorReporter) null); // assume acceptable
        }

        @Override
        public JSType getNativeType(JSTypeNative typeId) {
            return nativeTypes.get(typeId);
        }

        @Override
        public UnionType createUnionType(JSType... types) {
            StubUnionType u = new StubUnionType(this);
            u.alternates = new ArrayList<>();
            for (JSType t : types) u.alternates.add(t);
            return u;
        }
    }

    private static class StubJSType extends JSType {
        boolean noType, noObjectType, noResolvedType, unknownType, allType,
                functionType, nullType, voidType, checkedUnknownType, isObject,
                isConstructor, isInterface, isRecordType, isUnionType, isEnumElementType,
                isNominalType, isNamedType, proxyType;
        String displayName;
        String referenceName;
        boolean hasAnyTemplateInternalResult;
        JSType autoboxesToResult;
        boolean isSubtypeResult;
        boolean matchesNumberContextResult, matchesStringContextResult, matchesObjectContextResult;
        boolean canBeCalledResult;
        boolean canAssignToResult;
        TernaryValue testForEqualityResult;
        FunctionType toMaybeFunctionTypeResult;
        UnionType toMaybeUnionTypeResult;
        RecordType toMaybeRecordTypeResult;
        EnumElementType toMaybeEnumElementTypeResult;
        ParameterizedType toMaybeParameterizedTypeResult;
        TemplateType toMaybeTemplateTypeResult;
        ObjectType toObjectTypeResult;
        JSType greatestSubtypeResult;
        JSType referencedType;
        boolean resolved;
        JSType resolveResult;
        JSType resolveInternalResult;
        BooleanLiteralSet possibleToBooleanOutcomes = BooleanLiteralSet.BOTH;

        StubJSType(JSTypeRegistry registry) {
            super(registry);
        }

        @Override public boolean isNoType() { return noType; }
        @Override public boolean isNoObjectType() { return noObjectType; }
        @Override public boolean isNoResolvedType() { return noResolvedType; }
        @Override public boolean isUnknownType() { return unknownType; }
        @Override public boolean isAllType() { return allType; }
        @Override public boolean isFunctionType() { return functionType; }
        @Override public boolean isNullType() { return nullType; }
        @Override public boolean isVoidType() { return voidType; }
        @Override public boolean isCheckedUnknownType() { return checkedUnknownType; }
        @Override public boolean isObject() { return isObject; }
        @Override public boolean isConstructor() { return isConstructor; }
        @Override public boolean isInterface() { return isInterface; }
        @Override public boolean isRecordType() { return isRecordType; }
        @Override public boolean isUnionType() { return isUnionType; }
        @Override public boolean isEnumElementType() { return isEnumElementType; }
        @Override public boolean isNominalType() { return isNominalType; }
        @Override public boolean isNamedType() { return isNamedType; }
        @Override public String getDisplayName() { return displayName; }
        @Override public FunctionType toMaybeFunctionType() { return toMaybeFunctionTypeResult; }
        @Override public UnionType toMaybeUnionType() { return toMaybeUnionTypeResult; }
        @Override public RecordType toMaybeRecordType() { return toMaybeRecordTypeResult; }
        @Override public EnumElementType toMaybeEnumElementType() { return toMaybeEnumElementTypeResult; }
        @Override public ParameterizedType toMaybeParameterizedType() { return toMaybeParameterizedTypeResult; }
        @Override public TemplateType toMaybeTemplateType() { return toMaybeTemplateTypeResult; }
        @Override public ObjectType toObjectType() { return toObjectTypeResult; }
        @Override public boolean matchesNumberContext() { return matchesNumberContextResult; }
        @Override public boolean matchesStringContext() { return matchesStringContextResult; }
        @Override public boolean matchesObjectContext() { return matchesObjectContextResult; }
        @Override public boolean canBeCalled() { return canBeCalledResult; }
        @Override public boolean canAssignTo(JSType that) { return canAssignToResult; }
        @Override public JSType autoboxesTo() { return autoboxesToResult; }
        @Override public TernaryValue testForEquality(JSType that) { return testForEqualityResult; }
        @Override public boolean isSubtype(JSType that) { return isSubtypeResult; }
        @Override public JSType getGreatestSubtype(JSType that) { return greatestSubtypeResult; }
        @Override public JSType restrictByNotNullOrUndefined() { return this; }
        @Override boolean hasAnyTemplateInternal() { return hasAnyTemplateInternalResult; }
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return possibleToBooleanOutcomes; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return resolveInternalResult != null ? resolveInternalResult : this; }
        @Override String toStringHelper(boolean forAnnotations) { return displayName != null ? displayName : ""; }
        @Override void setResolvedTypeInternal(JSType type) { this.resolved = true; this.resolveResult = type; }
        @Override public boolean isResolved() { return resolved; }
        @Override public void clearResolved() { resolved = false; resolveResult = null; }
    }

    private static class StubUnionType extends UnionType {
        List<JSType> alternates;

        StubUnionType(JSTypeRegistry registry) {
            super(registry);
            alternates = new ArrayList<>();
        }

        @Override public Iterable<JSType> getAlternates() { return alternates; }

        @Override
        public JSType getLeastSupertype(JSType that) {
            // simplified
            return registry.createUnionType(this, that);
        }
    }

    private static class StubObjectType extends ObjectType {
        String refName;
        JSType propertyResult;

        StubObjectType(JSTypeRegistry registry, String refName) {
            super(registry);
            this.refName = refName;
        }

        @Override
        public String getReferenceName() { return refName; }

        @Override
        public FunctionType getConstructor() { return null; }

        @Override
        public JSType findPropertyType(String propertyName) { return propertyResult; }

        @Override
        public boolean hasProperty(String pname) { return propertyResult != null; }

        @Override
        ObjectType getImplicitPrototype() { return null; }

        @Override
        public boolean isSubtype(JSType that) { return false; }

        @Override
        public <T> T visit(Visitor<T> visitor) { return null; }

        @Override
        String toStringHelper(boolean forAnnotations) { return refName != null ? refName : ""; }

        @Override
        public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.BOTH; }

        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
    }

    private static class StubFunctionType extends FunctionType {
        boolean hasSource;
        boolean isNativeObjectType;

        StubFunctionType(JSTypeRegistry registry, boolean hasSource) {
            super(registry, null, null, null, null, null, false, null);
            this.hasSource = hasSource;
        }

        @Override public JSType getSource() { return hasSource ? this : null; }
        @Override public boolean isNativeObjectType() { return isNativeObjectType; }
        @Override public boolean makesStructs() { return false; }
        @Override public boolean makesDicts() { return false; }
        @Override public boolean isSubtype(JSType that) { return false; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override String toStringHelper(boolean forAnnotations) { return ""; }
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.BOTH; }
        @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
    }
}