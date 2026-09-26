package com.google.javascript.rhino.jstype;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class UnionTypeTest {

    private JSTypeRegistry registry;
    private StubJSType typeA;
    private StubJSType typeB;
    private StubJSType typeC;
    private UnionType emptyUnion;
    private UnionType singleUnion;
    private UnionType multiUnion;

    // --- Inner stub classes ---

    static class FakeRegistry extends JSTypeRegistry {
        FakeRegistry() {
            super(null);
        }
    }

    static class StubJSType extends JSType {
        boolean matchesNumber;
        boolean matchesString;
        boolean matchesObject;
        boolean nullable;
        boolean unknown;
        boolean callable = true;
        boolean objectFlag = true;
        boolean nullType;
        boolean voidType;
        boolean canAssignToResult = true;
        boolean subtypeResult = true;
        JSType propertyType;
        String name;

        StubJSType(JSTypeRegistry registry) {
            super(registry);
        }

        StubJSType(JSTypeRegistry registry, String name) {
            super(registry);
            this.name = name;
        }

        @Override
        public boolean matchesNumberContext() { return matchesNumber; }

        @Override
        public boolean matchesStringContext() { return matchesString; }

        @Override
        public boolean matchesObjectContext() { return matchesObject; }

        @Override
        public boolean isNullable() { return nullable; }

        @Override
        public boolean isUnknownType() { return unknown; }

        @Override
        public boolean canBeCalled() { return callable; }

        @Override
        public boolean isObject() { return objectFlag; }

        @Override
        public boolean isNullType() { return nullType; }

        @Override
        public boolean isVoidType() { return voidType; }

        @Override
        public boolean canAssignTo(JSType that) { return canAssignToResult; }

        @Override
        public boolean isSubtype(JSType that) { return subtypeResult; }

        @Override
        public JSType findPropertyType(String propertyName) { return propertyType; }

        @Override
        public String toString() {
            return name != null ? name : super.toString();
        }
    }

    @Before
    public void setUp() {
        registry = new FakeRegistry();
        typeA = new StubJSType(registry, "A");
        typeB = new StubJSType(registry, "B");
        typeC = new StubJSType(registry, "C");

        emptyUnion = new UnionType(registry, new HashSet<JSType>());
        singleUnion = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA)));
        multiUnion = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB, typeC)));
    }

    @After
    public void tearDown() {
        // nothing to clean
    }

    // --- matchesNumberContext ---
    @Test
    public void testMatchesNumberContext_emptySet() {
        Assert.assertFalse(emptyUnion.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContext_oneTrue() {
        typeA.matchesNumber = true;
        typeB.matchesNumber = false;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertTrue(u.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContext_allFalse() {
        typeA.matchesNumber = false;
        typeB.matchesNumber = false;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertFalse(u.matchesNumberContext());
    }

    // --- matchesStringContext ---
    @Test
    public void testMatchesStringContext_emptySet() {
        Assert.assertFalse(emptyUnion.matchesStringContext());
    }

    @Test
    public void testMatchesStringContext_oneTrue() {
        typeA.matchesString = true;
        Assert.assertTrue(singleUnion.matchesStringContext());
    }

    @Test
    public void testMatchesStringContext_allFalse() {
        typeA.matchesString = false;
        Assert.assertFalse(singleUnion.matchesStringContext());
    }

    // --- matchesObjectContext ---
    @Test
    public void testMatchesObjectContext_emptySet() {
        Assert.assertFalse(emptyUnion.matchesObjectContext());
    }

    @Test
    public void testMatchesObjectContext_oneTrue() {
        typeA.matchesObject = true;
        Assert.assertTrue(singleUnion.matchesObjectContext());
    }

    @Test
    public void testMatchesObjectContext_allFalse() {
        typeA.matchesObject = false;
        Assert.assertFalse(singleUnion.matchesObjectContext());
    }

    // --- isNullable ---
    @Test
    public void testIsNullable_emptySet() {
        Assert.assertFalse(emptyUnion.isNullable());
    }

    @Test
    public void testIsNullable_oneNullable() {
        typeA.nullable = true;
        Assert.assertTrue(singleUnion.isNullable());
    }

    @Test
    public void testIsNullable_noneNullable() {
        typeA.nullable = false;
        Assert.assertFalse(singleUnion.isNullable());
    }

    // --- isUnknownType ---
    @Test
    public void testIsUnknownType_emptySet() {
        Assert.assertFalse(emptyUnion.isUnknownType());
    }

    @Test
    public void testIsUnknownType_oneUnknown() {
        typeA.unknown = true;
        Assert.assertTrue(singleUnion.isUnknownType());
    }

    @Test
    public void testIsUnknownType_noneUnknown() {
        typeA.unknown = false;
        Assert.assertFalse(singleUnion.isUnknownType());
    }

    // --- canBeCalled ---
    @Test
    public void testCanBeCalled_emptySet() {
        Assert.assertTrue(emptyUnion.canBeCalled());
    }

    @Test
    public void testCanBeCalled_oneNotCallable() {
        typeA.callable = false;
        Assert.assertFalse(singleUnion.canBeCalled());
    }

    @Test
    public void testCanBeCalled_allCallable() {
        typeA.callable = true;
        typeB.callable = true;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertTrue(u.canBeCalled());
    }

    // --- contains ---
    @Test
    public void testContains_inSet() {
        Assert.assertTrue(singleUnion.contains(typeA));
    }

    @Test
    public void testContains_notInSet() {
        Assert.assertFalse(singleUnion.contains(typeB));
    }

    @Test
    public void testContains_null() {
        Assert.assertFalse(singleUnion.contains(null));
    }

    // --- equals ---
    @Test
    public void testEquals_sameSet() {
        UnionType u1 = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        UnionType u2 = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeB, typeA)));
        Assert.assertTrue(u1.equals(u2));
    }

    @Test
    public void testEquals_differentSet() {
        UnionType u1 = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        UnionType u2 = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeC)));
        Assert.assertFalse(u1.equals(u2));
    }

    @Test
    public void testEquals_nonUnion() {
        Assert.assertFalse(emptyUnion.equals("string"));
    }

    @Test
    public void testEquals_null() {
        Assert.assertFalse(emptyUnion.equals(null));
    }

    // --- hashCode ---
    @Test
    public void testHashCode_consistentWithEquals() {
        UnionType u1 = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        UnionType u2 = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeB, typeA)));
        Assert.assertEquals(u1.hashCode(), u2.hashCode());
    }

    // --- toString ---
    @Test
    public void testToString_empty() {
        Assert.assertEquals("()", emptyUnion.toString());
    }

    @Test
    public void testToString_single() {
        String result = singleUnion.toString();
        Assert.assertTrue(result.startsWith("("));
        Assert.assertTrue(result.endsWith(")"));
        Assert.assertTrue(result.contains(typeA.toString()));
    }

    @Test
    public void testToString_multiple() {
        String result = multiUnion.toString();
        Assert.assertTrue(result.startsWith("("));
        Assert.assertTrue(result.endsWith(")"));
        Assert.assertTrue(result.contains("|"));
        Assert.assertTrue(result.contains(typeA.toString()));
        Assert.assertTrue(result.contains(typeB.toString()));
        Assert.assertTrue(result.contains(typeC.toString()));
    }

    // --- isSubtype ---
    @Test
    public void testIsSubtype_emptySet() {
        Assert.assertTrue(emptyUnion.isSubtype(typeA));
    }

    @Test
    public void testIsSubtype_allSubtype() {
        typeA.subtypeResult = true;
        typeB.subtypeResult = true;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertTrue(u.isSubtype(typeA));
    }

    @Test
    public void testIsSubtype_oneNotSubtype() {
        typeA.subtypeResult = true;
        typeB.subtypeResult = false;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertFalse(u.isSubtype(typeA));
    }

    // --- canAssignTo ---
    @Test
    public void testCanAssignTo_emptySet() {
        Assert.assertTrue(emptyUnion.canAssignTo(typeA));
    }

    @Test
    public void testCanAssignTo_allTrue() {
        typeA.canAssignToResult = true;
        typeB.canAssignToResult = true;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertTrue(u.canAssignTo(typeA));
    }

    @Test
    public void testCanAssignTo_oneFalse() {
        typeA.canAssignToResult = true;
        typeB.canAssignToResult = false;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertFalse(u.canAssignTo(typeA));
    }

    @Test
    public void testCanAssignTo_unknownType() {
        typeA.unknown = true;
        typeB.canAssignToResult = false; // should be ignored
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertTrue(u.canAssignTo(typeA));
    }

    // --- getAlternates ---
    @Test
    public void testGetAlternates() {
        Set<JSType> alternates = new HashSet<JSType>(Arrays.asList(typeA, typeB));
        UnionType u = new UnionType(registry, alternates);
        int count = 0;
        for (JSType alt : u.getAlternates()) {
            count++;
        }
        Assert.assertEquals(2, count);
    }

    // --- findPropertyType ---
    @Test
    public void testFindPropertyType_skipsNullAndVoid() {
        typeA.nullType = true;
        typeB.voidType = true;
        typeC.propertyType = typeA;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB, typeC)));
        JSType result = u.findPropertyType("prop");
        Assert.assertSame(typeA, result);
    }

    @Test
    public void testFindPropertyType_allNullAndVoid() {
        typeA.nullType = true;
        typeB.voidType = true;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        JSType result = u.findPropertyType("prop");
        Assert.assertNull(result);
    }

    @Test
    public void testFindPropertyType_noPropertyType() {
        typeA.propertyType = null;
        typeB.propertyType = null;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        JSType result = u.findPropertyType("prop");
        Assert.assertNull(result);
    }

    @Test
    public void testFindPropertyType_multipleNonNull() {
        typeA.propertyType = typeA;
        typeB.propertyType = typeB;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        JSType result = u.findPropertyType("prop");
        Assert.assertNotNull(result);
    }

    // --- isUnionType ---
    @Test
    public void testIsUnionType() {
        Assert.assertTrue(emptyUnion.isUnionType());
    }

    // --- isObject ---
    @Test
    public void testIsObject_allTrue() {
        typeA.objectFlag = true;
        typeB.objectFlag = true;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertTrue(u.isObject());
    }

    @Test
    public void testIsObject_oneFalse() {
        typeA.objectFlag = false;
        typeB.objectFlag = true;
        UnionType u = new UnionType(registry, new HashSet<JSType>(Arrays.asList(typeA, typeB)));
        Assert.assertFalse(u.isObject());
    }
}