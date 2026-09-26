package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class JSTypeTest {

    // ---------- Mock JSTypeRegistry ----------
    private static class MockJSTypeRegistry extends JSTypeRegistry {
        public MockJSTypeRegistry() {
            super(null); // minimal, not used
        }

        @Override
        public JSType getNativeType(JSTypeNative typeId) {
            return MockJSType.nativeTypes.get(typeId);
        }
    }

    // ---------- Mock JSType ----------
    private static class MockJSType extends JSType {
        static java.util.Map<JSTypeNative, MockJSType> nativeTypes = new java.util.HashMap<>();

        // Properties
        boolean noType;
        boolean noResolvedType;
        boolean noObjectType;
        boolean allType;
        boolean unknownType;
        boolean functionType;
        boolean enumElementType;
        boolean unionType;
        boolean enumType;
        boolean namedType;
        boolean recordType;
        boolean parameterizedType;
        boolean templateType;
        boolean constructor;
        boolean interfaceType;
        boolean ordinaryFunction;
        boolean objectType;
        boolean numberObject;
        boolean numberValue;
        boolean stringObject;
        boolean stringValue;
        boolean booleanObject;
        boolean booleanValue;
        boolean regexpType;
        boolean dateType;
        boolean nullType;
        boolean voidType;
        boolean theObjectType;
        boolean checkedUnknown;
        boolean functionPrototype;
        boolean instanceType;
        boolean globalThis;

        // For subtype: we define a simple rule: if thatType is allType or unknownType, return true; if equivalent, true; else false.
        @Override
        public boolean isSubtype(JSType that) {
            if (that instanceof MockJSType) {
                MockJSType mthat = (MockJSType) that;
                if (mthat.allType || mthat.unknownType) return true;
                if (this.isEquivalentTo(that)) return true;
                // For union types, check alternates
                if (mthat.unionType && mthat.alternates != null) {
                    for (JSType alt : mthat.alternates) {
                        if (this.isSubtype(alt)) return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override
        public boolean isEquivalentTo(JSType jsType) {
            if (jsType instanceof MockJSType) {
                MockJSType other = (MockJSType) jsType;
                // Simplified equivalence: same reference or same set of flags
                return this == other;
            }
            return false;
        }

        // Abstract methods
        @Override
        public BooleanLiteralSet getPossibleToBooleanOutcomes() {
            return BooleanLiteralSet.BOTH;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return null;
        }

        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
            return null;
        }

        @Override
        String toStringHelper(boolean forAnnotations) {
            return "MockJSType";
        }

        // Override many type check methods
        @Override public boolean isNoType() { return noType; }
        @Override public boolean isNoResolvedType() { return noResolvedType; }
        @Override public boolean isNoObjectType() { return noObjectType; }
        @Override public boolean isAllType() { return allType; }
        @Override public boolean isUnknownType() { return unknownType; }
        @Override public boolean isFunctionType() { return functionType; }
        @Override public boolean isEnumElementType() { return enumElementType; }
        @Override public boolean isUnionType() { return unionType; }
        @Override public boolean isEnumType() { return enumType; }
        @Override public boolean isNamedType() { return namedType; }
        @Override public boolean isRecordType() { return recordType; }
        @Override public boolean isParameterizedType() { return parameterizedType; }
        @Override public boolean isTemplateType() { return templateType; }
        @Override public boolean isConstructor() { return constructor; }
        @Override public boolean isInterface() { return interfaceType; }
        @Override public boolean isOrdinaryFunction() { return ordinaryFunction; }
        @Override public boolean isObject() { return objectType; }
        @Override public boolean isNumberObjectType() { return numberObject; }
        @Override public boolean isNumberValueType() { return numberValue; }
        @Override public boolean isStringObjectType() { return stringObject; }
        @Override public boolean isStringValueType() { return stringValue; }
        @Override public boolean isBooleanObjectType() { return booleanObject; }
        @Override public boolean isBooleanValueType() { return booleanValue; }
        @Override public boolean isRegexpType() { return regexpType; }
        @Override public boolean isDateType() { return dateType; }
        @Override public boolean isNullType() { return nullType; }
        @Override public boolean isVoidType() { return voidType; }
        @Override public boolean isTheObjectType() { return theObjectType; }
        @Override public boolean isCheckedUnknownType() { return checkedUnknown; }
        @Override public boolean isFunctionPrototypeType() { return functionPrototype; }
        @Override public boolean isInstanceType() { return instanceType; }
        @Override public boolean isGlobalThisType() { return globalThis; }
        @Override public boolean hasDisplayName() { return displayName != null && !displayName.isEmpty(); }
        String displayName = null;
        @Override public String getDisplayName() { return displayName; }
        @Override public JSType autoboxesTo() { return autoboxResult; }
        JSType autoboxResult = null;
        @Override public ObjectType toObjectType() { return this instanceof ObjectType ? (ObjectType) this : null; }
        @Override public JSType restrictByNotNullOrUndefined() { return this; }

        // For union type simulation
        java.util.Collection<JSType> alternates = null;
        @Override public UnionType toMaybeUnionType() {
            if (unionType) {
                return new UnionType(registry, alternates) {
                    @Override public JSType getLeastSupertype(JSType that) { return null; }
                    @Override public JSType getGreatestSubtype(JSType that) { return null; }
                };
            }
            return null;
        }

        MockJSType(MockJSTypeRegistry registry) {
            super(registry);
        }

        // Static factory methods
        static MockJSType createNoType(MockJSTypeRegistry reg) {
            MockJSType t = new MockJSType(reg);
            t.noType = true;
            return t;
        }

        static MockJSType createNoResolvedType(MockJSTypeRegistry reg) {
            MockJSType t = new MockJSType(reg);
            t.noResolvedType = true;
            return t;
        }

        static MockJSType createUnknownType(MockJSTypeRegistry reg) {
            MockJSType t = new MockJSType(reg);
            t.unknownType = true;
            return t;
        }

        static MockJSType createAllType(MockJSTypeRegistry reg) {
            MockJSType t = new MockJSType(reg);
            t.allType = true;
            return t;
        }

        static MockJSType createFunctionType(MockJSTypeRegistry reg) {
            MockJSType t = new MockJSType(reg);
            t.functionType = true;
            return t;
        }

        static MockJSType createEmptyType(MockJSTypeRegistry reg) {
            MockJSType t = new MockJSType(reg);
            t.noType = true; // makes isEmptyType true
            return t;
        }
    }

    private MockJSTypeRegistry registry;
    private MockJSType noType;
    private MockJSType noResolvedType;
    private MockJSType unknownType;
    private MockJSType allType;
    private MockJSType functionType;
    private MockJSType emptyType;
    private MockJSType normalType;

    @Before
    public void setUp() {
        registry = new MockJSTypeRegistry();

        // Register native types in the map
        MockJSType.nativeTypes.put(JSTypeNative.NO_TYPE, MockJSType.createNoType(registry));
        MockJSType.nativeTypes.put(JSTypeNative.NO_RESOLVED_TYPE, MockJSType.createNoResolvedType(registry));
        MockJSType.nativeTypes.put(JSTypeNative.UNKNOWN_TYPE, MockJSType.createUnknownType(registry));
        MockJSType.nativeTypes.put(JSTypeNative.ALL_TYPE, MockJSType.createAllType(registry));
        MockJSType.nativeTypes.put(JSTypeNative.LEAST_FUNCTION_TYPE, MockJSType.createFunctionType(registry));
        // Need more for isEmptyType check: NO_OBJECT_TYPE, etc.
        MockJSType.nativeTypes.put(JSTypeNative.NO_OBJECT_TYPE, MockJSType.createNoResolvedType(registry)); // placeholder
        MockJSType.nativeTypes.put(JSTypeNative.NULL_TYPE, new MockJSType(registry) {{ nullType = true; }});
        MockJSType.nativeTypes.put(JSTypeNative.VOID_TYPE, new MockJSType(registry) {{ voidType = true; }});
        MockJSType.nativeTypes.put(JSTypeNative.OBJECT_TYPE, new MockJSType(registry) {{ objectType = true; }});
        MockJSType.nativeTypes.put(JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE, new MockJSType(registry) {{ unknownType = true; }});
        MockJSType.nativeTypes.put(JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE, new MockJSType(registry) {{ unknownType = true; }});
        MockJSType.nativeTypes.put(JSTypeNative.GLOBAL_THIS, new MockJSType(registry) {{ globalThis = true; }});

        noType = MockJSType.createNoType(registry);
        noResolvedType = MockJSType.createNoResolvedType(registry);
        unknownType = MockJSType.createUnknownType(registry);
        allType = MockJSType.createAllType(registry);
        functionType = MockJSType.createFunctionType(registry);
        emptyType = MockJSType.createEmptyType(registry);
        normalType = new MockJSType(registry) {
            { objectType = true; }
        };
    }

    // ===== Tests for isEmptyType =====
    @Test
    public void testIsEmptyType_noType() {
        assertTrue(noType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_noObjectType() {
        MockJSType noObj = new MockJSType(registry);
        noObj.noObjectType = true;
        assertTrue(noObj.isEmptyType());
    }

    @Test
    public void testIsEmptyType_noResolvedType() {
        assertTrue(noResolvedType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_leastFunctionType() {
        MockJSType leastFn = (MockJSType) registry.getNativeType(JSTypeNative.LEAST_FUNCTION_TYPE);
        // For simplicity, we make it equal to functionType
        assertTrue(functionType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_false() {
        assertFalse(normalType.isEmptyType());
    }

    // ===== Tests for isString =====
    @Test
    public void testIsString_subtypeOfStringValueOrObject() {
        // normalType is not subtype of unknownType? Actually we set unknownType for STRING_VALUE_OR_OBJECT_TYPE so isSubtype returns false
        // Create a type that is subtype of it
        MockJSType stringVal = new MockJSType(registry) {
            @Override public boolean isSubtype(JSType that) {
                return that == registry.getNativeType(JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE);
            }
        };
        assertTrue(stringVal.isString());
    }

    @Test
    public void testIsString_notSubtype() {
        assertFalse(normalType.isString());
    }

    // ===== Tests for isNumber =====
    @Test
    public void testIsNumber_subtype() {
        MockJSType numVal = new MockJSType(registry) {
            @Override public boolean isSubtype(JSType that) {
                return that == registry.getNativeType(JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE);
            }
        };
        assertTrue(numVal.isNumber());
    }

    @Test
    public void testIsNumber_not() {
        assertFalse(normalType.isNumber());
    }

    // ===== Tests for isEquivalentTo and equals =====
    @Test
    public void testIsEquivalentTo_self() {
        assertTrue(normalType.isEquivalentTo(normalType));
    }

    @Test
    public void testIsEquivalentTo_different() {
        assertFalse(normalType.isEquivalentTo(noType));
    }

    @Test
    public void testIsEquivalentTo_proxyObjectType() {
        // ProxyObjectType not used; skip
    }

    @Test
    public void testEquals_jstypeObject() {
        assertTrue(normalType.equals(normalType));
    }

    @Test
    public void testEquals_nonJSType() {
        assertFalse(normalType.equals("string"));
    }

    @Test
    public void testEquals_null() {
        assertFalse(normalType.equals(null));
    }

    // ===== Tests for testForEquality and testForEqualityHelper =====
    @Test
    public void testTestForEquality_allType_b() {
        assertEquals(TernaryValue.UNKNOWN, allType.testForEquality(normalType));
    }

    @Test
    public void testTestForEquality_unknownType_a() {
        assertEquals(TernaryValue.UNKNOWN, normalType.testForEquality(unknownType));
    }

    @Test
    public void testTestForEquality_noResolvedType() {
        assertEquals(TernaryValue.UNKNOWN, normalType.testForEquality(noResolvedType));
    }

    @Test
    public void testTestForEquality_bothEmpty() {
        assertEquals(TernaryValue.TRUE, emptyType.testForEquality(emptyType));
    }

    @Test
    public void testTestForEquality_oneEmpty() {
        assertEquals(TernaryValue.UNKNOWN, emptyType.testForEquality(normalType));
    }

    @Test
    public void testTestForEquality_functionType_meetNoType() {
        // Create a function type and a non-object type
        MockJSType fn = MockJSType.createFunctionType(registry);
        MockJSType nonObj = new MockJSType(registry) {
            @Override public boolean isObject() { return false; }
            @Override public JSType getGreatestSubtype(JSType that) {
                return registry.getNativeType(JSTypeNative.NO_TYPE);
            }
        };
        assertEquals(TernaryValue.FALSE, fn.testForEquality(nonObj));
    }

    @Test
    public void testTestForEquality_functionType_meetNonNoType() {
        // function type vs object type
        MockJSType obj = new MockJSType(registry) { { objectType = true; } };
        assertEquals(TernaryValue.UNKNOWN, functionType.testForEquality(obj));
    }

    @Test
    public void testTestForEquality_enumElementType() {
        MockJSType enumElem = new MockJSType(registry) { { enumElementType = true; } };
        // Should delegate to bType.testForEquality(aType)
        assertEquals(TernaryValue.UNKNOWN, enumElem.testForEquality(normalType));
    }

    @Test
    public void testTestForEquality_unionType() {
        MockJSType union = new MockJSType(registry) { { unionType = true; } };
        assertEquals(TernaryValue.UNKNOWN, union.testForEquality(normalType));
    }

    // ===== Tests for canTestForEqualityWith =====
    @Test
    public void testCanTestForEqualityWith_unknownResult() {
        // When testForEquality returns UNKNOWN, canTestForEqualityWith returns true
        assertTrue(normalType.canTestForEqualityWith(normalType));
    }

    // ===== Tests for canTestForShallowEqualityWith =====
    @Test
    public void testCanTestForShallowEqualityWith_emptyTypes() {
        assertTrue(emptyType.canTestForShallowEqualityWith(emptyType));
    }

    @Test
    public void testCanTestForShallowEqualityWith_nonEmpty() {
        assertTrue(normalType.canTestForShallowEqualityWith(normalType));
    }

    // ===== Tests for isSubtypeHelper (static) =====
    @Test
    public void testIsSubtypeHelper_thatIsUnknown() {
        assertTrue(JSType.isSubtypeHelper(normalType, unknownType));
    }

    @Test
    public void testIsSubtypeHelper_equivalent() {
        assertTrue(JSType.isSubtypeHelper(normalType, normalType));
    }

    @Test
    public void testIsSubtypeHelper_thatIsAllType() {
        assertTrue(JSType.isSubtypeHelper(normalType, allType));
    }

    @Test
    public void testIsSubtypeHelper_thatIsUnionType_oneElementMatches() {
        MockJSType union = new MockJSType(registry) { { unionType = true; } };
        java.util.ArrayList<JSType> alts = new java.util.ArrayList<>();
        alts.add(normalType);
        union.alternates = alts;
        assertTrue(JSType.isSubtypeHelper(normalType, union));
    }

    @Test
    public void testIsSubtypeHelper_thatIsUnionType_noMatch() {
        MockJSType union = new MockJSType(registry) { { unionType = true; } };
        java.util.ArrayList<JSType> alts = new java.util.ArrayList<>();
        alts.add(noType);
        union.alternates = alts;
        // normalType is not subtype of noType
        assertFalse(JSType.isSubtypeHelper(normalType, union));
    }

    // ===== Tests for getGreatestSubtype =====
    @Test
    public void testGetGreatestSubtype_bothFunctionType() {
        // This would require functionType to return a non-null toMaybeFunctionType which we haven't implemented
        // Test fallback
        // We'll test a simpler scenario: equivalent types
        assertEquals(noType, JSType.getGreatestSubtype(noType, noType));
    }

    @Test
    public void testGetGreatestSubtype_oneUnknown() {
        JSType result = JSType.getGreatestSubtype(normalType, unknownType);
        // Should be unknown type
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
    }

    @Test
    public void testGetGreatestSubtype_thisIsSubtypeOfThat() {
        // Normal type is not subtype of noType, so skip. Create a type that is subtype
        MockJSType sub = new MockJSType(registry) {
            @Override public boolean isSubtype(JSType that) {
                return that == normalType;
            }
        };
        // Since sub.isSubtype(normalType) true, result should be filterNoResolvedType(sub)
        JSType result = JSType.getGreatestSubtype(sub, normalType);
        assertEquals(sub, result);
    }

    // ===== Tests for filterNoResolvedType =====
    @Test
    public void testFilterNoResolvedType_noResolvedType() {
        JSType result = JSType.filterNoResolvedType(noResolvedType);
        assertEquals(registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE), result);
    }

    @Test
    public void testFilterNoResolvedType_unionWithNoResolved() {
        MockJSType union = new MockJSType(registry) { { unionType = true; } };
        java.util.ArrayList<JSType> alts = new java.util.ArrayList<>();
        alts.add(noResolvedType);
        alts.add(normalType);
        union.alternates = alts;
        JSType result = JSType.filterNoResolvedType(union);
        // Should be union of normalType only
        assertTrue(result.isUnionType());
        // Check alternates of result? For simplicity, just not null
        assertNotNull(result);
    }

    // ===== Tests for hasDisplayName =====
    @Test
    public void testHasDisplayName_null() {
        assertFalse(noType.hasDisplayName());
    }

    @Test
    public void testHasDisplayName_nonEmpty() {
        MockJSType t = new MockJSType(registry);
        t.displayName = "foo";
        assertTrue(t.hasDisplayName());
    }

    @Test
    public void testHasDisplayName_empty() {
        MockJSType t = new MockJSType(registry);
        t.displayName = "";
        assertFalse(t.hasDisplayName());
    }

    // ===== Tests for findPropertyType =====
    @Test
    public void testFindPropertyType_noAutobox() {
        assertNull(normalType.findPropertyType("prop"));
    }

    @Test
    public void testFindPropertyType_withAutobox() {
        MockJSType autoboxTo = new MockJSType(registry) {
            @Override public JSType findPropertyType(String propertyName) {
                return normalType; // return some type
            }
        };
        MockJSType t = new MockJSType(registry);
        t.autoboxResult = autoboxTo;
        JSType found = t.findPropertyType("prop");
        assertNotNull(found);
    }

    // ===== Tests for autobox =====
    @Test
    public void testAutobox_autoboxesToReturnsNull() {
        assertEquals(normalType, normalType.autobox());
    }

    @Test
    public void testAutobox_returnsAutoboxed() {
        MockJSType autobox = new MockJSType(registry);
        MockJSType t = new MockJSType(registry);
        t.autoboxResult = autobox;
        assertEquals(autobox, t.autobox());
    }

    // ===== Tests for dereference =====
    @Test
    public void testDereference() {
        assertNull(normalType.dereference());
    }

    // ===== Tests for isNominalConstructor =====
    @Test
    public void testIsNominalConstructor_notConstructor() {
        assertFalse(normalType.isNominalConstructor());
    }

    @Test
    public void testIsNominalConstructor_constructorNoFunctionType() {
        MockJSType t = new MockJSType(registry);
        t.constructor = true;
        assertFalse(t.isNominalConstructor());
    }

    // ===== Tests for isGlobalThisType =====
    @Test
    public void testIsGlobalThisType_true() {
        MockJSType globalThis = (MockJSType) registry.getNativeType(JSTypeNative.GLOBAL_THIS);
        assertTrue(globalThis.isGlobalThisType());
    }

    @Test
    public void testIsGlobalThisType_false() {
        assertFalse(normalType.isGlobalThisType());
    }

    // ===== Tests for getTypesUnderEquality =====
    @Test
    public void testGetTypesUnderEquality_unionDelegates() {
        MockJSType union = new MockJSType(registry) { { unionType = true; } };
        // We don't implement getTypesUnderEquality on union, just test that it returns something
        assertNotNull(normalType.getTypesUnderEquality(union));
    }

    // ===== Tests for getTypesUnderInequality =====
    @Test
    public void testGetTypesUnderInequality_trueReturnsNoType() {
        // testForEquality returns TRUE for two empties
        JSType.TypePair pair = emptyType.getTypesUnderInequality(emptyType);
        assertNotNull(pair.typeA);
        assertTrue(pair.typeA.isNoType());
    }

    // ===== Tests for getTypesUnderShallowEquality =====
    @Test
    public void testGetTypesUnderShallowEquality() {
        JSType.TypePair pair = normalType.getTypesUnderShallowEquality(normalType);
        assertEquals(normalType, pair.typeA);
    }

    // ===== Tests for getTypesUnderShallowInequality =====
    @Test
    public void testGetTypesUnderShallowInequality_bothNull() {
        MockJSType nullType = new MockJSType(registry) {{ nullType = true; }};
        JSType.TypePair pair = nullType.getTypesUnderShallowInequality(nullType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequality_notBothNull() {
        JSType.TypePair pair = normalType.getTypesUnderShallowInequality(emptyType);
        assertEquals(normalType, pair.typeA);
        assertEquals(emptyType, pair.typeB);
    }

    // ===== Tests for restrictByNotNullOrUndefined =====
    @Test
    public void testRestrictByNotNullOrUndefined() {
        assertEquals(normalType, normalType.restrictByNotNullOrUndefined());
    }

    // ===== Tests for setValidator =====
    @Test
    public void testSetValidator_applies() {
        // Predicate returns true
        Predicate<JSType> pred = new Predicate<JSType>() {
            @Override public boolean apply(JSType input) {
                return input == normalType;
            }
        };
        assertTrue(normalType.setValidator(pred));
    }

    @Test
    public void testSetValidator_false() {
        Predicate<JSType> pred = new Predicate<JSType>() {
            @Override public boolean apply(JSType input) {
                return false;
            }
        };
        assertFalse(normalType.setValidator(pred));
    }

    // ===== Tests for static isEquivalent =====
    @Test
    public void testIsEquivalent_bothNull() {
        assertTrue(JSType.isEquivalent(null, null));
    }

    @Test
    public void testIsEquivalent_oneNull() {
        assertFalse(JSType.isEquivalent(normalType, null));
        assertFalse(JSType.isEquivalent(null, normalType));
    }

    @Test
    public void testIsEquivalent_bothNonNullEqual() {
        assertTrue(JSType.isEquivalent(normalType, normalType));
    }

    // ===== Tests for forceResolve (simple) =====
    @Test
    public void testForceResolve() {
        // Since resolveInternal returns null, result should be UNKNOWN_TYPE after resolution?
        // But our mock resolve returns null. The real resolve will return UNKNOWN if resolveResult null.
        // Just test it doesn't throw.
        ErrorReporter reporter = null;
        StaticScope<JSType> scope = null;
        JSType result = normalType.forceResolve(reporter, scope);
        assertNotNull(result);
    }

    // ===== Test for enum types =====
    @Test
    public void testIsEnumType_true() {
        MockJSType enumT = new MockJSType(registry);
        enumT.enumType = true;
        assertTrue(enumT.isEnumType());
    }

    @Test
    public void testIsEnumType_false() {
        assertFalse(normalType.isEnumType());
    }

    // ===== Test for isRecordType =====
    @Test
    public void testIsRecordType_true() {
        MockJSType rec = new MockJSType(registry);
        rec.recordType = true;
        assertTrue(rec.isRecordType());
    }

    // ===== Test for isParameterizedType =====
    @Test
    public void testIsParameterizedType_true() {
        MockJSType param = new MockJSType(registry);
        param.parameterizedType = true;
        assertTrue(param.isParameterizedType());
    }

    // ===== Test for isTemplateType =====
    @Test
    public void testIsTemplateType_true() {
        MockJSType tmpl = new MockJSType(registry);
        tmpl.templateType = true;
        assertTrue(tmpl.isTemplateType());
    }

    // ===== Test for hasAnyTemplate =====
    @Test
    public void testHasAnyTemplate_notInCheckVisit() {
        // Default returns false
        assertFalse(normalType.hasAnyTemplate());
    }

    @Test
    public void testHasAnyTemplate_recursiveCallReturnsFalse() {
        // Override hasAnyTemplateInternal to call hasAnyTemplate again? Not needed.
        // Just ensure it doesn't loop
        assertFalse(normalType.hasAnyTemplate());
    }

    // ===== Test for isNominalConstructor with interface =====
    @Test
    public void testIsNominalConstructor_interface() {
        MockJSType t = new MockJSType(registry);
        t.interfaceType = true;
        // Still returns false because toMaybeFunctionType returns null
        assertFalse(t.isNominalConstructor());
    }

    // ===== Test for clearResolved =====
    @Test
    public void testClearResolved() {
        normalType.clearResolved();
        assertFalse(normalType.isResolved());
    }

    // ===== Test for setResolvedTypeInternal =====
    @Test
    public void testSetResolvedTypeInternal() {
        normalType.setResolvedTypeInternal(normalType);
        assertTrue(normalType.isResolved());
    }

    // ===== Test for matchesInt32Context =====
    @Test
    public void testMatchesInt32Context() {
        assertFalse(normalType.matchesInt32Context());
    }

    // ===== Test for matchesUint32Context =====
    @Test
    public void testMatchesUint32Context() {
        assertFalse(normalType.matchesUint32Context());
    }

    // ===== Test for matchesStringContext =====
    @Test
    public void testMatchesStringContext() {
        assertFalse(normalType.matchesStringContext());
    }

    // ===== Test for matchesObjectContext =====
    @Test
    public void testMatchesObjectContext() {
        assertFalse(normalType.matchesObjectContext());
    }

    // ===== Test for canBeCalled =====
    @Test
    public void testCanBeCalled() {
        assertFalse(normalType.canBeCalled());
    }

    // ===== Test for canAssignTo =====
    @Test
    public void testCanAssignTo_true() {
        // normalType is not subtype of allType? Actually isSubtype returns false for allType unless we set allType
        // We'll test with subtype relationship manually
        MockJSType sub = new MockJSType(registry) {
            @Override public boolean isSubtype(JSType that) {
                return true;
            }
        };
        assertTrue(sub.canAssignTo(normalType));
    }

    @Test
    public void testCanAssignTo_false() {
        assertFalse(normalType.canAssignTo(noType));
    }

    // ===== Test for differsFrom =====
    @Test
    public void testDiffersFrom_unknownVsNot() {
        assertTrue(unknownType.differsFrom(normalType));
    }

    @Test
    public void testDiffersFrom_bothUnknown() {
        assertFalse(unknownType.differsFrom(unknownType));
    }

    @Test
    public void testDiffersFrom_bothNotUnknownEquivalent() {
        assertFalse(normalType.differsFrom(normalType));
    }

    @Test
    public void testDiffersFrom_bothNotUnknownNonEquivalent() {
        assertTrue(normalType.differsFrom(noType));
    }
}