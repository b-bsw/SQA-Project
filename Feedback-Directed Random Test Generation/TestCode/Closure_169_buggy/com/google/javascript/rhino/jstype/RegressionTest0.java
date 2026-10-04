package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope2 = null;
        com.google.javascript.rhino.jstype.JSType jSType3 = com.google.javascript.rhino.jstype.JSType.safeResolve(jSType0, errorReporter1, jSTypeStaticScope2);
        org.junit.Assert.assertNull(jSType3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        com.google.javascript.rhino.jstype.RecordType recordType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.rhino.jstype.RecordType.isSubtype(objectType0, recordType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "()" + "'", str1, "()");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = com.google.javascript.rhino.jstype.ObjectType.cast(jSType0);
        org.junit.Assert.assertNull(objectType1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Comparator<com.google.javascript.rhino.jstype.JSType> jSTypeComparator0 = com.google.javascript.rhino.jstype.JSType.ALPHA;
        org.junit.Assert.assertNotNull(jSTypeComparator0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a type name" + "'", str0, "Not declared as a type name");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ArrowType arrowType3 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, jSType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = com.google.javascript.rhino.jstype.JSType.NOT_ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        boolean boolean2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, jSType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "()", node2, arrowType3, objectType4, strList5, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.jstype.UnionType unionType15 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry11, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] { unionType15 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.jstype.UnionType unionType19 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry10, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair20 = unionType9.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) unionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertArrayEquals(jSTypeArray12, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.UnionType unionType10 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry6, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] { unionType10 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList12 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12, jSTypeArray11);
        com.google.javascript.rhino.jstype.UnionType unionType14 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry5, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair15 = unionType4.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) unionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertArrayEquals(jSTypeArray7, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unionType9.isEmptyType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType19 = unionType9.getRestrictedTypeGivenToBooleanOutcome(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        boolean boolean15 = unionType9.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.jstype.UnionType unionType21 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry17, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] { unionType21 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList23 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList23, jSTypeArray22);
        com.google.javascript.rhino.jstype.UnionType unionType25 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry16, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList23);
        java.lang.String str27 = unionType25.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType29 = unionType25.findPropertyType("()");
        boolean boolean30 = unionType25.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = null;
        com.google.javascript.rhino.jstype.JSType jSType33 = unionType25.resolve(errorReporter31, jSTypeStaticScope32);
        com.google.javascript.rhino.jstype.JSType jSType35 = unionType25.findPropertyType("()");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType36 = unionType9.meet((com.google.javascript.rhino.jstype.JSType) unionType25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertArrayEquals(jSTypeArray18, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(())" + "'", str27, "(())");
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNull(jSType35);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.jstype.UnionType unionType19 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry15, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] { unionType19 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList21 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21, jSTypeArray20);
        com.google.javascript.rhino.jstype.UnionType unionType23 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry14, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21);
        java.lang.String str25 = unionType23.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType27 = unionType23.findPropertyType("()");
        boolean boolean28 = unionType23.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = null;
        com.google.javascript.rhino.jstype.JSType jSType31 = unionType23.resolve(errorReporter29, jSTypeStaticScope30);
        boolean boolean32 = unionType9.isSubtype(jSType31);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertArrayEquals(jSTypeArray16, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(())" + "'", str25, "(())");
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        boolean boolean15 = unionType9.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList5 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList5, jSTypeArray4);
        com.google.javascript.rhino.jstype.UnionType unionType7 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry3, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList5);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] { unionType7 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.jstype.UnionType unionType11 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry2, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        java.lang.String str13 = unionType11.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType15 = unionType11.findPropertyType("()");
        boolean boolean16 = unionType11.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = unionType11.resolve(errorReporter17, jSTypeStaticScope18);
        boolean boolean20 = unionType11.matchesNumberContext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ArrowType arrowType21 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertArrayEquals(jSTypeArray4, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(())" + "'", str13, "(())");
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        boolean boolean18 = unionType9.isNoResolvedType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        com.google.javascript.rhino.jstype.JSType jSType19 = unionType9.findPropertyType("()");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TemplateType templateType20 = jSType19.toMaybeTemplateType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.jstype.UnionType unionType19 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry15, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] { unionType19 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList21 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21, jSTypeArray20);
        com.google.javascript.rhino.jstype.UnionType unionType23 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry14, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21);
        java.lang.String str25 = unionType23.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType27 = unionType23.findPropertyType("()");
        boolean boolean28 = unionType23.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = null;
        com.google.javascript.rhino.jstype.JSType jSType31 = unionType23.resolve(errorReporter29, jSTypeStaticScope30);
        boolean boolean32 = unionType23.canBeCalled();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType33 = unionType9.meet((com.google.javascript.rhino.jstype.JSType) unionType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertArrayEquals(jSTypeArray16, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(())" + "'", str25, "(())");
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        com.google.javascript.rhino.jstype.JSType jSType19 = unionType9.findPropertyType("()");
        boolean boolean20 = unionType9.matchesObjectContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = unionType9.isGlobalThisType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.jstype.UnionType unionType15 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry11, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] { unionType15 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.jstype.UnionType unionType19 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry10, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        java.lang.String str21 = unionType19.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType23 = unionType19.findPropertyType("()");
        boolean boolean24 = unionType19.isBooleanValueType();
        boolean boolean25 = unionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) unionType19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = unionType19.isGlobalThisType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertArrayEquals(jSTypeArray12, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(())" + "'", str21, "(())");
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        java.lang.String str15 = unionType9.toStringHelper(false);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(())" + "'", str15, "(())");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        boolean boolean15 = unionType9.isStruct();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = unionType9.resolve(errorReporter16, jSTypeStaticScope17);
        boolean boolean19 = jSType18.isResolved();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        com.google.javascript.rhino.jstype.JSType jSType19 = unionType9.findPropertyType("()");
        boolean boolean20 = unionType9.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.jstype.UnionType unionType26 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry22, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { unionType26 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.jstype.UnionType unionType30 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry21, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList34 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList34, jSTypeArray33);
        com.google.javascript.rhino.jstype.UnionType unionType36 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry32, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList34);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] { unionType36 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.UnionType unionType40 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry31, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        java.lang.String str42 = unionType40.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType44 = unionType40.findPropertyType("()");
        boolean boolean45 = unionType40.isBooleanValueType();
        boolean boolean46 = unionType30.isSubtype((com.google.javascript.rhino.jstype.JSType) unionType40);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50, jSTypeArray49);
        com.google.javascript.rhino.jstype.UnionType unionType52 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry48, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { unionType52 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.jstype.UnionType unionType56 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry47, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        java.lang.String str58 = unionType56.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType60 = unionType56.findPropertyType("()");
        boolean boolean61 = unionType56.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope63 = null;
        com.google.javascript.rhino.jstype.JSType jSType64 = unionType56.resolve(errorReporter62, jSTypeStaticScope63);
        boolean boolean65 = unionType56.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69, jSTypeArray68);
        com.google.javascript.rhino.jstype.UnionType unionType71 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry67, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] { unionType71 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73, jSTypeArray72);
        com.google.javascript.rhino.jstype.UnionType unionType75 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry66, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList73);
        java.lang.String str77 = unionType75.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType79 = unionType75.findPropertyType("()");
        boolean boolean80 = unionType75.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope82 = null;
        com.google.javascript.rhino.jstype.JSType jSType83 = unionType75.resolve(errorReporter81, jSTypeStaticScope82);
        com.google.javascript.rhino.jstype.JSType jSType85 = unionType75.findPropertyType("()");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair86 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) unionType56, (com.google.javascript.rhino.jstype.JSType) unionType75);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue87 = unionType9.testForEqualityHelper((com.google.javascript.rhino.jstype.JSType) unionType30, (com.google.javascript.rhino.jstype.JSType) unionType56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertArrayEquals(jSTypeArray23, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertArrayEquals(jSTypeArray33, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(())" + "'", str42, "(())");
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertArrayEquals(jSTypeArray49, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(())" + "'", str58, "(())");
        org.junit.Assert.assertNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertArrayEquals(jSTypeArray68, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "(())" + "'", str77, "(())");
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNull(jSType85);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        boolean boolean15 = unionType9.isStruct();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType16 = unionType9.autobox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.jstype.UnionType unionType15 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry11, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] { unionType15 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.jstype.UnionType unionType19 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry10, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        java.lang.String str21 = unionType19.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType23 = unionType19.findPropertyType("()");
        boolean boolean24 = unionType19.isBooleanValueType();
        boolean boolean25 = unionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) unionType19);
        boolean boolean26 = unionType19.isVoidType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertArrayEquals(jSTypeArray12, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(())" + "'", str21, "(())");
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        boolean boolean15 = unionType9.isOrdinaryFunction();
        boolean boolean16 = unionType9.matchesObjectContext();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        boolean boolean10 = unionType9.matchesNumberContext();
        boolean boolean11 = unionType9.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = unionType9.resolve(errorReporter12, jSTypeStaticScope13);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType14);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList18 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList18, jSTypeArray17);
        com.google.javascript.rhino.jstype.UnionType unionType20 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry16, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList18);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] { unionType20 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.jstype.UnionType unionType24 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry15, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        java.lang.String str26 = unionType24.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType28 = unionType24.findPropertyType("()");
        boolean boolean29 = unionType24.isBooleanValueType();
        boolean boolean30 = unionType24.hasAnyTemplateInternal();
        boolean boolean31 = unionType9.equals((java.lang.Object) unionType24);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertArrayEquals(jSTypeArray17, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(())" + "'", str26, "(())");
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        com.google.javascript.rhino.jstype.JSType jSType19 = unionType9.findPropertyType("()");
        boolean boolean20 = unionType9.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.jstype.UnionType unionType26 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry22, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { unionType26 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.jstype.UnionType unionType30 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry21, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        java.lang.String str32 = unionType30.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType34 = unionType30.findPropertyType("()");
        boolean boolean35 = unionType30.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope37 = null;
        com.google.javascript.rhino.jstype.JSType jSType38 = unionType30.resolve(errorReporter36, jSTypeStaticScope37);
        com.google.javascript.rhino.jstype.JSType jSType40 = unionType30.findPropertyType("()");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = unionType9.testForEquality(jSType40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = jSType40.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertArrayEquals(jSTypeArray23, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(())" + "'", str32, "(())");
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNull(ternaryValue41);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        com.google.javascript.rhino.jstype.JSType jSType19 = unionType9.findPropertyType("()");
        boolean boolean20 = unionType9.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = unionType9.resolveInternal(errorReporter21, jSTypeStaticScope22);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType23);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry5, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair10 = unionType4.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) unionType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        boolean boolean15 = unionType9.isStruct();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = unionType9.resolve(errorReporter16, jSTypeStaticScope17);
        boolean boolean19 = unionType9.isNominalType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.jstype.UnionType unionType15 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry11, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] { unionType15 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.jstype.UnionType unionType19 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry10, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        java.lang.String str21 = unionType19.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType23 = unionType19.findPropertyType("()");
        boolean boolean24 = unionType19.isBooleanValueType();
        boolean boolean25 = unionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) unionType19);
        boolean boolean26 = unionType9.isRecordType();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertArrayEquals(jSTypeArray12, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(())" + "'", str21, "(())");
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        boolean boolean13 = unionType9.hasProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList17 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17, jSTypeArray16);
        com.google.javascript.rhino.jstype.UnionType unionType19 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry15, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList17);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] { unionType19 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList21 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21, jSTypeArray20);
        com.google.javascript.rhino.jstype.UnionType unionType23 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry14, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21);
        boolean boolean24 = unionType23.matchesNumberContext();
        boolean boolean25 = unionType23.matchesNumberContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = unionType9.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType23);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertArrayEquals(jSTypeArray16, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(ternaryValue26);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] { unionType5 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList7 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7, jSTypeArray6);
        com.google.javascript.rhino.jstype.UnionType unionType9 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList7);
        java.lang.String str11 = unionType9.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.findPropertyType("()");
        boolean boolean14 = unionType9.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = unionType9.resolve(errorReporter15, jSTypeStaticScope16);
        boolean boolean18 = unionType9.canBeCalled();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22, jSTypeArray21);
        com.google.javascript.rhino.jstype.UnionType unionType24 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry20, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] { unionType24 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList26 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26, jSTypeArray25);
        com.google.javascript.rhino.jstype.UnionType unionType28 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry19, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList26);
        java.lang.String str30 = unionType28.toStringHelper(true);
        com.google.javascript.rhino.jstype.JSType jSType32 = unionType28.findPropertyType("()");
        boolean boolean33 = unionType28.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = null;
        com.google.javascript.rhino.jstype.JSType jSType36 = unionType28.resolve(errorReporter34, jSTypeStaticScope35);
        boolean boolean37 = unionType28.isArrayType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair38 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) unionType9, (com.google.javascript.rhino.jstype.JSType) unionType28);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(())" + "'", str11, "(())");
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertArrayEquals(jSTypeArray21, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(())" + "'", str30, "(())");
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }
}

