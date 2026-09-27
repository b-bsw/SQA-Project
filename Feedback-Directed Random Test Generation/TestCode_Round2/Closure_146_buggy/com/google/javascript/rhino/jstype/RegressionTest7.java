package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSType15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = jSType21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        java.lang.Class<?> wildcardClass20 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = jSType19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSType15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSType15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        java.lang.Class<?> wildcardClass11 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        java.lang.Class<?> wildcardClass18 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        java.lang.Class<?> wildcardClass18 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = jSType21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jSType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        java.lang.Class<?> wildcardClass23 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        java.lang.Class<?> wildcardClass12 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        java.lang.Class<?> wildcardClass18 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSType14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSType15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        java.lang.Class<?> wildcardClass12 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        java.lang.Class<?> wildcardClass18 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = jSType19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        java.lang.Class<?> wildcardClass18 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        java.lang.Class<?> wildcardClass18 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        java.lang.Class<?> wildcardClass22 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        java.lang.Class<?> wildcardClass23 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSType14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        java.lang.Class<?> wildcardClass19 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
        java.lang.Class<?> wildcardClass25 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = jSType22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        java.lang.Class<?> wildcardClass13 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSType10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType25 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNull(jSType25);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        java.lang.Class<?> wildcardClass14 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        java.lang.Class<?> wildcardClass15 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        java.lang.Class<?> wildcardClass19 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = jSType23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
        java.lang.Class<?> wildcardClass25 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = jSType24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        java.lang.Class<?> wildcardClass20 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        java.lang.Class<?> wildcardClass14 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        java.lang.Class<?> wildcardClass15 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jSType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType25 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNull(jSType25);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        java.lang.Class<?> wildcardClass21 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        java.lang.Class<?> wildcardClass20 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jSType14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = jSType19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        java.lang.Class<?> wildcardClass15 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        java.lang.Class<?> wildcardClass14 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType25 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType26 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertNull(jSType26);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSType15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        java.lang.Class<?> wildcardClass22 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = jSType17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType25 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNull(jSType25);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = jSType17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        java.lang.Class<?> wildcardClass16 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        java.lang.Class<?> wildcardClass14 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        java.lang.Class<?> wildcardClass14 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType23 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType24 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = jSType19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSType12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        java.lang.Class<?> wildcardClass12 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = jSType21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jSType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        java.lang.Class<?> wildcardClass20 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        java.lang.Class<?> wildcardClass17 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        java.lang.Class<?> wildcardClass20 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType21 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType22 = typePair2.typeB;
        java.lang.Class<?> wildcardClass23 = typePair2.getClass();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSType15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jSType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = jSType18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType19 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType20 = typePair2.typeA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = jSType20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSType20);
    }
}

