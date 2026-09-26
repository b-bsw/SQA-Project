package com.google.javascript.rhino.jstype;

import static com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
import static org.junit.Assert.*;

import com.google.javascript.rhino.ErrorReporter;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class UnionTypeTest {
    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;
    private JSType booleanType;
    private JSType voidType;
    private JSType nullType;
    private JSType unknownType;
    private JSType allType;
    private JSType objectType;

    @Before
    public void setUp() {
        ErrorReporter reporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}

            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(reporter);
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    }

    private UnionType createUnion(JSType... types) {
        Collection<JSType> alternates = Arrays.asList(types);
        return new UnionType(registry, alternates);
    }

    @Test
    public void testIsSubtypeWithUnknown() {
        UnionType union = createUnion(numberType, unknownType);
        assertTrue("union containing unknown should be subtype of unknown", union.isSubtype(unknownType));
    }

    @Test
    public void testIsSubtypeWithAllType() {
        UnionType union = createUnion(numberType, stringType);
        assertTrue("any type is subtype of all type", union.isSubtype(allType));
    }

    @Test
    public void testIsSubtypeWhenNotAllAlternatesAreSubtype() {
        UnionType union = createUnion(numberType, stringType);
        assertFalse("union (number|string) is not subtype of number", union.isSubtype(numberType));
    }

    @Test
    public void testIsSubtypeWithSingleAlternate() {
        UnionType union = createUnion(numberType);
        assertTrue("single number union is subtype of number", union.isSubtype(numberType));
        assertFalse("single number union is not subtype of boolean", union.isSubtype(booleanType));
    }

    @Test
    public void testMatchesNumberContextWhenAnyMatches() {
        UnionType union = createUnion(stringType, numberType);
        assertTrue("union with number matches number context", union.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContextWhenNoneMatch() {
        UnionType union = createUnion(voidType, stringType);
        assertFalse("union without number matches number context", union.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContextWhenAnyMatches() {
        UnionType union = createUnion(numberType, stringType);
        assertTrue("union with string matches string context", union.matchesStringContext());
    }

    @Test
    public void testMatchesStringContextWhenNoneMatch() {
        UnionType union = createUnion(voidType);
        assertFalse("union of void only does not match string context", union.matchesStringContext());
    }

    @Test
    public void testMatchesObjectContextWhenAnyMatches() {
        UnionType union = createUnion(voidType, objectType);
        assertTrue("union with object matches object context", union.matchesObjectContext());
    }

    @Test
    public void testMatchesObjectContextWhenNoneMatch() {
        UnionType union = createUnion(nullType, voidType);
        assertFalse("union of null and void does not match object context", union.matchesObjectContext());
    }

    @Test
    public void testContainsWhenTypeIsPresent() {
        UnionType union = createUnion(numberType, stringType);
        assertTrue("union contains numberType", union.contains(numberType));
    }

    @Test
    public void testContainsWhenTypeIsAbsent() {
        UnionType union = createUnion(numberType, stringType);
        assertFalse("union does not contain booleanType", union.contains(booleanType));
    }

    @Test
    public void testIsNullableWhenAnyNullable() {
        UnionType union = createUnion(nullType, numberType);
        assertTrue("union with null is nullable", union.isNullable());
    }

    @Test
    public void testIsNullableWhenNoneNullable() {
        UnionType union = createUnion(numberType, stringType);
        assertFalse("union without null/void is not nullable", union.isNullable());
    }

    @Test
    public void testIsUnknownTypeWhenAnyUnknown() {
        UnionType union = createUnion(numberType, unknownType);
        assertTrue("union with unknown is unknown type", union.isUnknownType());
    }

    @Test
    public void testIsUnknownTypeWhenNoUnknown() {
        UnionType union = createUnion(numberType, stringType);
        assertFalse("union without unknown is not unknown type", union.isUnknownType());
    }

    @Test
    public void testCanBeCalledWhenAllCanBeCalled() {
        UnionType emptyUnion = new UnionType(registry, Arrays.<JSType>asList());
        assertTrue("empty union canBeCalled returns true", emptyUnion.canBeCalled());
    }

    @Test
    public void testCanBeCalledWhenOneCannot() {
        UnionType union = createUnion(numberType, stringType);
        assertFalse("union with non-callable type should not be callable", union.canBeCalled());
    }

    @Test
    public void testGetRestrictedUnion() {
        UnionType union = createUnion(numberType, stringType);
        JSType restricted = union.getRestrictedUnion(numberType);
        assertTrue("restricted should be a union type", restricted.isUnionType());
        UnionType restrictedUnion = (UnionType) restricted;
        assertEquals("restricted union should have 1 alternate", 1, restrictedUnion.alternates.size());
        assertTrue("restricted union should contain stringType", restrictedUnion.contains(stringType));
    }

    @Test
    public void testGetRestrictedUnionWithUnknown() {
        UnionType union = createUnion(numberType, unknownType);
        JSType restricted = union.getRestrictedUnion(numberType);
        assertTrue("restricted should be a union type", restricted.isUnionType());
        UnionType restrictedUnion = (UnionType) restricted;
        assertEquals("restricted union should have 1 alternate (unknown)", 1, restrictedUnion.alternates.size());
        assertTrue("restricted union should contain unknownType", restrictedUnion.contains(unknownType));
    }

    @Test
    public void testTestForEqualityDifferentResults() {
        UnionType union = createUnion(numberType, stringType);
        TernaryValue result = union.testForEquality(numberType);
        assertSame("when alternatives give different equality results, should return UNKNOWN", UNKNOWN, result);
    }

    @Test
    public void testTestForEqualitySameResults() {
        UnionType union = createUnion(numberType);
        TernaryValue result = union.testForEquality(numberType);
        assertSame("single element union equality with same type should return TRUE", TernaryValue.TRUE, result);
    }

    @Test
    public void testGetPossibleToBooleanOutcomes() {
        UnionType union = createUnion(numberType, stringType);
        BooleanLiteralSet literals = union.getPossibleToBooleanOutcomes();
        assertSame("union of number and string should have BOTH outcomes", BooleanLiteralSet.BOTH, literals);
    }

    @Test
    public void testToStringHelper() {
        UnionType union = createUnion(numberType, stringType);
        String s = union.toStringHelper(false);
        assertEquals("toStringHelper result", "(number|string)", s);
    }

    @Test
    public void testIsObjectWhenAllAreObjects() {
        UnionType union = createUnion(objectType, objectType);
        assertTrue("union of objects is object", union.isObject());
    }

    @Test
    public void testIsObjectWhenOneIsNotObject() {
        UnionType union = createUnion(numberType, objectType);
        assertFalse("union with non-object is not object", union.isObject());
    }

    @Test
    public void testEmptyUnion() {
        UnionType empty = new UnionType(registry, Arrays.<JSType>asList());
        assertEquals("empty union hashCode", 1, empty.hashCode());
        assertTrue("empty union isSubtype(unknown) should be true", empty.isSubtype(unknownType));
        assertFalse("empty union matchesNumberContext should be false", empty.matchesNumberContext());
        assertFalse("empty union matchesStringContext should be false", empty.matchesStringContext());
        assertFalse("empty union matchesObjectContext should be false", empty.matchesObjectContext());
        assertTrue("empty union canBeCalled should be true", empty.canBeCalled());
        assertFalse("empty union isNullable should be false", empty.isNullable());
        assertFalse("empty union isUnknownType should be false", empty.isUnknownType());
    }

    @Test
    public void testUnionWithSingleAlternate() {
        UnionType union = createUnion(numberType);
        assertEquals("single alternate hashCode equals numberType hashCode", numberType.hashCode(), union.hashCode());
        assertTrue("single element union contains that element", union.contains(numberType));
        assertFalse("single element union does not contain other", union.contains(stringType));
    }
}