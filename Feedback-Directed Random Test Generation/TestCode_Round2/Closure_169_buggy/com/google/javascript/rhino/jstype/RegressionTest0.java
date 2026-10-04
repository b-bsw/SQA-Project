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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ArrowType arrowType4 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, jSType2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(jSType0, jSType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        boolean boolean2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, jSType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = com.google.javascript.rhino.jstype.ObjectType.cast(jSType0);
        org.junit.Assert.assertNull(objectType1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "hi!", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType1 = com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(jSType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a type name" + "'", str0, "Not declared as a type name");
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
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "hi!", node2, arrowType3, objectType4, strList5, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a constructor" + "'", str0, "Not declared as a constructor");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.RecordType recordType2 = new com.google.javascript.rhino.jstype.RecordType(jSTypeRegistry0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int0 = com.google.javascript.rhino.jstype.JSType.NOT_ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, strList5, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "Not declared as a type name", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope2 = null;
        com.google.javascript.rhino.jstype.JSType jSType3 = com.google.javascript.rhino.jstype.JSType.safeResolve(jSType0, errorReporter1, jSTypeStaticScope2);
        org.junit.Assert.assertNull(jSType3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.UNKNOWN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unknown class name" + "'", str0, "Unknown class name");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "Not declared as a constructor", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.forceResolve(errorReporter11, jSTypeStaticScope12);
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
        org.junit.Assert.assertNull(ternaryValue10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "Unknown class name", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unionType4.isString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        java.lang.String str6 = unionType4.toStringHelper(false);
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "()" + "'", str6, "()");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "Not declared as a constructor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.matchesUint32Context();
        boolean boolean12 = unionType9.isNominalConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType13 = unionType9.restrictByNotNullOrUndefined();
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
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList12 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12, jSTypeArray11);
        com.google.javascript.rhino.jstype.UnionType unionType14 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry10, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = unionType9.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType14);
        boolean boolean16 = unionType14.isStringObjectType();
        boolean boolean17 = unionType14.isNumberValueType();
        boolean boolean18 = unionType14.isUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType19 = unionType4.getRestrictedUnion((com.google.javascript.rhino.jstype.JSType) unionType14);
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
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertArrayEquals(jSTypeArray11, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(ternaryValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray1 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList2 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2, jSTypeArray1);
        com.google.javascript.rhino.jstype.UnionType unionType4 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList2);
        boolean boolean5 = unionType4.isNominalConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.RecordType recordType3 = new com.google.javascript.rhino.jstype.RecordType(jSTypeRegistry0, strMap1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.isStringObjectType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = unionType9.getPossibleToBooleanOutcomes();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.isStringObjectType();
        boolean boolean12 = unionType9.isNumberValueType();
        boolean boolean13 = unionType9.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = unionType9.resolveInternal(errorReporter14, jSTypeStaticScope15);
        boolean boolean17 = unionType9.isUnionType();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.matchesUint32Context();
        boolean boolean12 = unionType9.isNominalConstructor();
        boolean boolean13 = unionType9.hasDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.isStringObjectType();
        boolean boolean12 = unionType9.isNumberValueType();
        boolean boolean13 = unionType9.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = unionType9.resolveInternal(errorReporter14, jSTypeStaticScope15);
        boolean boolean17 = jSType16.isNoType();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.isStringObjectType();
        boolean boolean12 = unionType9.isNumberValueType();
        boolean boolean13 = unionType9.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = unionType9.resolveInternal(errorReporter14, jSTypeStaticScope15);
        boolean boolean17 = unionType9.isDict();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.matchesUint32Context();
        com.google.javascript.rhino.jstype.JSType jSType12 = unionType9.autoboxesTo();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.UnionType unionType10 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry6, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = unionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType10);
        boolean boolean12 = unionType10.isStringObjectType();
        boolean boolean13 = unionType10.isNumberValueType();
        boolean boolean14 = unionType10.isUnionType();
        boolean boolean15 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, (com.google.javascript.rhino.jstype.JSType) unionType10);
        boolean boolean16 = unionType10.isDict();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.jstype.UnionType unionType21 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry17, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.jstype.UnionType unionType26 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry22, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = unionType21.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType26);
        boolean boolean28 = unionType21.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType29 = unionType10.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) unionType21);
        boolean boolean30 = unionType10.matchesObjectContext();
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertArrayEquals(jSTypeArray7, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertArrayEquals(jSTypeArray18, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertArrayEquals(jSTypeArray23, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.isObject();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        com.google.javascript.rhino.jstype.UnionType unionType6 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry0, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.UnionType unionType10 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry6, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = unionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType10);
        boolean boolean12 = unionType10.isStringObjectType();
        boolean boolean13 = unionType10.isNumberValueType();
        boolean boolean14 = unionType10.isUnionType();
        boolean boolean15 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, (com.google.javascript.rhino.jstype.JSType) unionType10);
        boolean boolean16 = unionType10.isDict();
        com.google.javascript.rhino.jstype.RecordType recordType17 = unionType10.toMaybeRecordType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList20 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20, jSTypeArray19);
        com.google.javascript.rhino.jstype.UnionType unionType22 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry18, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.UnionType unionType27 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry23, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = unionType22.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType27);
        boolean boolean29 = unionType27.isStringObjectType();
        boolean boolean30 = unionType27.isNumberValueType();
        boolean boolean31 = unionType27.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = com.google.javascript.rhino.jstype.JSType.safeResolve((com.google.javascript.rhino.jstype.JSType) unionType27, errorReporter32, jSTypeStaticScope33);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair35 = recordType17.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) unionType27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertArrayEquals(jSTypeArray7, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(recordType17);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertArrayEquals(jSTypeArray19, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertArrayEquals(jSTypeArray24, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(ternaryValue28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jSType34);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = unionType4.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType9);
        boolean boolean11 = unionType9.isStringObjectType();
        boolean boolean12 = unionType9.isNumberValueType();
        boolean boolean13 = unionType9.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = com.google.javascript.rhino.jstype.JSType.safeResolve((com.google.javascript.rhino.jstype.JSType) unionType9, errorReporter14, jSTypeStaticScope15);
        boolean boolean17 = unionType9.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray1);
        org.junit.Assert.assertArrayEquals(jSTypeArray1, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertArrayEquals(jSTypeArray6, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray2 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList3 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3, jSTypeArray2);
        com.google.javascript.rhino.jstype.UnionType unionType5 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry1, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList3);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.UnionType unionType10 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry6, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = unionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType10);
        boolean boolean12 = unionType10.isStringObjectType();
        boolean boolean13 = unionType10.isNumberValueType();
        boolean boolean14 = unionType10.isUnionType();
        boolean boolean15 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, (com.google.javascript.rhino.jstype.JSType) unionType10);
        boolean boolean16 = unionType10.isDict();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.jstype.UnionType unionType21 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry17, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList24 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24, jSTypeArray23);
        com.google.javascript.rhino.jstype.UnionType unionType26 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry22, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = unionType21.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType26);
        boolean boolean28 = unionType21.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType29 = unionType10.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) unionType21);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33, jSTypeArray32);
        com.google.javascript.rhino.jstype.UnionType unionType35 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry31, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList33);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.UnionType unionType40 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry36, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = unionType35.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType40);
        boolean boolean42 = unionType40.isStringObjectType();
        boolean boolean43 = unionType40.isNumberValueType();
        boolean boolean44 = unionType40.isUnionType();
        boolean boolean45 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType30, (com.google.javascript.rhino.jstype.JSType) unionType40);
        boolean boolean46 = unionType40.isDict();
        com.google.javascript.rhino.jstype.RecordType recordType47 = unionType40.toMaybeRecordType();
        com.google.javascript.rhino.jstype.JSType jSType49 = unionType40.findPropertyType("Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType50 = unionType21.getRestrictedUnion(jSType49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray2);
        org.junit.Assert.assertArrayEquals(jSTypeArray2, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertArrayEquals(jSTypeArray7, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertArrayEquals(jSTypeArray18, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertArrayEquals(jSTypeArray23, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertArrayEquals(jSTypeArray32, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertArrayEquals(jSTypeArray37, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(ternaryValue41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(recordType47);
        org.junit.Assert.assertNull(jSType49);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList4 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4, jSTypeArray3);
        com.google.javascript.rhino.jstype.UnionType unionType6 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry2, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList4);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList9 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9, jSTypeArray8);
        com.google.javascript.rhino.jstype.UnionType unionType11 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry7, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = unionType6.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType11);
        boolean boolean13 = unionType11.isStringObjectType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16, jSTypeArray15);
        com.google.javascript.rhino.jstype.UnionType unionType18 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry14, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList16);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList21 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21, jSTypeArray20);
        com.google.javascript.rhino.jstype.UnionType unionType23 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry19, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = unionType18.testForEquality((com.google.javascript.rhino.jstype.JSType) unionType23);
        boolean boolean25 = unionType23.isStringObjectType();
        unionType11.setResolvedTypeInternal((com.google.javascript.rhino.jstype.JSType) unionType23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ArrowType arrowType27 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unionType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertArrayEquals(jSTypeArray3, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertArrayEquals(jSTypeArray8, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertArrayEquals(jSTypeArray15, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertArrayEquals(jSTypeArray20, new com.google.javascript.rhino.jstype.JSType[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(ternaryValue24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }
}

