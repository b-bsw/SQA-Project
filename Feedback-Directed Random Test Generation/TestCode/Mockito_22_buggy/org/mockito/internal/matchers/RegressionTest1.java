package org.mockito.internal.matchers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean5, (java.lang.Object) equality6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, (java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj9 = null;
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality8, obj9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, (java.lang.Object) equality8);
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj16 = null;
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality15, obj16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean6, (java.lang.Object) equality15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) boolean6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) equality1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) wildcardClass15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) wildcardClass13);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) wildcardClass11);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj9, (java.lang.Object) equality19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality1, (java.lang.Object) equality19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) equality5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality9);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality9, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality2, (java.lang.Object) equality9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality14);
        java.lang.Class<?> wildcardClass18 = equality14.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj8 = null;
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, obj8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass5, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj7);
        java.lang.Class<?> wildcardClass9 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean5, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality4.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) equality5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean23, (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass12);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass12);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj20 = null;
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, obj20);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality19);
        java.lang.Class<?> wildcardClass23 = equality19.getClass();
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass23);
        org.mockito.internal.matchers.Equality equality25 = new org.mockito.internal.matchers.Equality();
        boolean boolean26 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality25);
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality25, (java.lang.Object) '#');
        boolean boolean29 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass23, (java.lang.Object) equality25);
        boolean boolean30 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass8);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality19, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.internal.matchers.Equality equality22 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass23 = equality22.getClass();
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass21, (java.lang.Object) wildcardClass23);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) wildcardClass21);
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual(obj17, (java.lang.Object) wildcardClass19);
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual(obj15, obj17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass6, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        boolean boolean24 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        org.mockito.internal.matchers.Equality equality25 = new org.mockito.internal.matchers.Equality();
        boolean boolean26 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality25);
        org.mockito.internal.matchers.Equality equality27 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass28 = equality27.getClass();
        org.mockito.internal.matchers.Equality equality29 = new org.mockito.internal.matchers.Equality();
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass28, (java.lang.Object) equality29);
        boolean boolean31 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality25, (java.lang.Object) boolean30);
        org.mockito.internal.matchers.Equality equality33 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj34 = null;
        boolean boolean35 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality33, obj34);
        boolean boolean36 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality33);
        boolean boolean37 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality33);
        boolean boolean38 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean31, (java.lang.Object) equality33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality19, (java.lang.Object) equality33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality1);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality2, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj10 = null;
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality9, obj10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality9);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality2, (java.lang.Object) equality9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        java.lang.Class<?> wildcardClass9 = equality5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality2, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) equality6);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) equality8);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean7, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) equality6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass10);
        org.mockito.internal.matchers.Equality equality17 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj18 = null;
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality17, obj18);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality17);
        java.lang.Class<?> wildcardClass21 = equality17.getClass();
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality3, (java.lang.Object) equality5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass5 = equality3.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality3, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass7 = equality3.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj1, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj12 = null;
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality11, obj12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality11);
        java.lang.Class<?> wildcardClass15 = equality11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean9, (java.lang.Object) equality11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality9);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) equality13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality9, (java.lang.Object) boolean14);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean14, (java.lang.Object) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass8, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass11 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (short) 100, (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) equality16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.internal.matchers.Equality equality21 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass22 = equality21.getClass();
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass20, (java.lang.Object) wildcardClass22);
        boolean boolean24 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass20);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) wildcardClass20);
        org.mockito.internal.matchers.Equality equality27 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj28 = null;
        boolean boolean29 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality27, obj28);
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality27);
        java.lang.Class<?> wildcardClass31 = equality27.getClass();
        boolean boolean32 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) wildcardClass31);
        org.mockito.internal.matchers.Equality equality33 = new org.mockito.internal.matchers.Equality();
        boolean boolean34 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality33);
        boolean boolean36 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality33, (java.lang.Object) '#');
        boolean boolean37 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass31, (java.lang.Object) equality33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) boolean37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (-1), (java.lang.Object) equality8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj11 = null;
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality10, obj11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality11);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) equality15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality11, (java.lang.Object) boolean16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) equality11);
        java.lang.Class<?> wildcardClass19 = equality11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayElementsEqual(obj0, (java.lang.Object) equality11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass9);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.internal.matchers.Equality equality22 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass23 = equality22.getClass();
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass21, (java.lang.Object) wildcardClass23);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) wildcardClass21);
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual(obj17, (java.lang.Object) wildcardClass19);
        org.mockito.internal.matchers.Equality equality27 = new org.mockito.internal.matchers.Equality();
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual(obj17, (java.lang.Object) equality27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass9, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) boolean6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) equality1);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass20 = equality19.getClass();
        org.mockito.internal.matchers.Equality equality21 = new org.mockito.internal.matchers.Equality();
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass20, (java.lang.Object) equality21);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.internal.matchers.Equality equality26 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass27 = equality26.getClass();
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) wildcardClass27);
        boolean boolean29 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass25);
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass20, (java.lang.Object) wildcardClass25);
        boolean boolean31 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass17, (java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean5, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100.0d, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass2, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) boolean6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0d, (java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality16);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality16, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass20 = equality16.getClass();
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass20);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', (java.lang.Object) wildcardClass20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass7, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 10L, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass7 = equality4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean3, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 1, (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) equality11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass17 = equality16.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) wildcardClass17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass15);
        org.mockito.internal.matchers.Equality equality22 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj23 = null;
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality22, obj23);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality22);
        java.lang.Class<?> wildcardClass26 = equality22.getClass();
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass26);
        org.mockito.internal.matchers.Equality equality28 = new org.mockito.internal.matchers.Equality();
        boolean boolean29 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality28);
        boolean boolean31 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality28, (java.lang.Object) '#');
        boolean boolean32 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass26, (java.lang.Object) equality28);
        boolean boolean34 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality28, (java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean8, (java.lang.Object) equality28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) 'a');
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean13, (java.lang.Object) equality14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality20 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj21 = null;
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality20, obj21);
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality20);
        java.lang.Class<?> wildcardClass24 = equality20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean18, (java.lang.Object) equality20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Equality equality18 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass19 = equality18.getClass();
        org.mockito.internal.matchers.Equality equality20 = new org.mockito.internal.matchers.Equality();
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) equality20);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass19);
        org.mockito.internal.matchers.Equality equality24 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass25 = equality24.getClass();
        org.mockito.internal.matchers.Equality equality26 = new org.mockito.internal.matchers.Equality();
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) equality26);
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass25);
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) 'a');
        boolean boolean31 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) wildcardClass25);
        org.mockito.internal.matchers.Equality equality32 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass33 = equality32.getClass();
        org.mockito.internal.matchers.Equality equality34 = new org.mockito.internal.matchers.Equality();
        boolean boolean35 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass33, (java.lang.Object) equality34);
        boolean boolean36 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass33);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.mockito.internal.matchers.Equality equality39 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass40 = equality39.getClass();
        boolean boolean41 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass38, (java.lang.Object) wildcardClass40);
        boolean boolean42 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass38);
        boolean boolean43 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass33, (java.lang.Object) wildcardClass38);
        org.mockito.internal.matchers.Equality equality45 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj46 = null;
        boolean boolean47 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality45, obj46);
        boolean boolean48 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality45);
        java.lang.Class<?> wildcardClass49 = equality45.getClass();
        boolean boolean50 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass33, (java.lang.Object) wildcardClass49);
        org.mockito.internal.matchers.Equality equality51 = new org.mockito.internal.matchers.Equality();
        boolean boolean52 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality51);
        boolean boolean54 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality51, (java.lang.Object) '#');
        boolean boolean55 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass49, (java.lang.Object) equality51);
        boolean boolean57 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass49, (java.lang.Object) 10);
        boolean boolean58 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) boolean57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean16, (java.lang.Object) boolean58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass4 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) equality11);
        java.lang.Class<?> wildcardClass13 = equality11.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1.0f), (java.lang.Object) equality11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (short) 0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) "", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj6 = null;
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality5, obj6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean4, (java.lang.Object) equality5);
        java.lang.Class<?> wildcardClass9 = equality5.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 100, (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual(obj11, (java.lang.Object) boolean13);
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj16 = null;
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality15, obj16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean14, (java.lang.Object) equality15);
        java.lang.Class<?> wildcardClass19 = equality15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100L, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) 0);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, obj17);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray(obj17);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass6 = equality1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100, (java.lang.Object) equality1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) false, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj9 = null;
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality8, obj9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, (java.lang.Object) equality8);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) equality16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean13, (java.lang.Object) equality16);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass20 = equality19.getClass();
        org.mockito.internal.matchers.Equality equality21 = new org.mockito.internal.matchers.Equality();
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass20, (java.lang.Object) equality21);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.mockito.internal.matchers.Equality equality26 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass27 = equality26.getClass();
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) wildcardClass27);
        boolean boolean29 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass25);
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass20, (java.lang.Object) wildcardClass25);
        boolean boolean32 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) (short) 10);
        boolean boolean33 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean18, (java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass5, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean8, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality4, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean7);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (-1), (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) wildcardClass15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass13);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass13);
        java.lang.Object obj21 = null;
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, obj21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 0, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Equality equality17 = new org.mockito.internal.matchers.Equality();
        boolean boolean18 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass20 = equality19.getClass();
        org.mockito.internal.matchers.Equality equality21 = new org.mockito.internal.matchers.Equality();
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass20, (java.lang.Object) equality21);
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality17, (java.lang.Object) boolean22);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean22, (java.lang.Object) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass9, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.lang.Object obj1 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) boolean3);
        java.lang.Class<?> wildcardClass5 = obj1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0f, obj1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean2, (java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean7, (java.lang.Object) equality8);
        java.lang.Class<?> wildcardClass12 = equality8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass8 = equality4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass5 = equality0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass17 = equality16.getClass();
        org.mockito.internal.matchers.Equality equality18 = new org.mockito.internal.matchers.Equality();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality18);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality22 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass23 = equality22.getClass();
        org.mockito.internal.matchers.Equality equality24 = new org.mockito.internal.matchers.Equality();
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass23, (java.lang.Object) equality24);
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass23);
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass23, (java.lang.Object) 'a');
        boolean boolean29 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) wildcardClass23);
        boolean boolean31 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean14, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) equality14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass13);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) 'a');
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean4, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.mockito.internal.matchers.Equality equality17 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass18 = equality17.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass16, (java.lang.Object) wildcardClass18);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) wildcardClass16);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual(obj12, (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass6, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass6 = equality2.getClass();
        java.lang.Object obj7 = null;
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, obj7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean13 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean13, obj14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj2);
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) (byte) 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass26 = equality19.getClass();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.mockito.internal.matchers.Equality equality30 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass31 = equality30.getClass();
        boolean boolean32 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass29, (java.lang.Object) wildcardClass31);
        boolean boolean33 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass31);
        boolean boolean34 = org.mockito.internal.matchers.Equality.areEqual(obj27, (java.lang.Object) wildcardClass31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality19, obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass9);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.mockito.internal.matchers.Equality equality22 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass23 = equality22.getClass();
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass21, (java.lang.Object) wildcardClass23);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) wildcardClass21);
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual(obj17, (java.lang.Object) wildcardClass19);
        org.mockito.internal.matchers.Equality equality27 = new org.mockito.internal.matchers.Equality();
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual(obj17, (java.lang.Object) equality27);
        java.lang.Class<?> wildcardClass29 = obj17.getClass();
        org.mockito.internal.matchers.Equality equality31 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj32 = null;
        boolean boolean33 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality31, obj32);
        boolean boolean34 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality31);
        java.lang.Class<?> wildcardClass35 = equality31.getClass();
        boolean boolean36 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass35);
        boolean boolean37 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass35);
        boolean boolean38 = org.mockito.internal.matchers.Equality.areEqual(obj17, (java.lang.Object) wildcardClass35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality0, (java.lang.Object) boolean38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) ' ');
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) '#', (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, obj2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) (byte) 10, (java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual(obj4, (java.lang.Object) equality14);
        java.lang.Class<?> wildcardClass16 = equality14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        java.lang.Class<?> wildcardClass5 = equality1.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass5);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) wildcardClass15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass13);
        boolean boolean19 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality4.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) equality11);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality13);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality11, (java.lang.Object) equality13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass8, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) 'a');
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass8);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass20 = equality19.getClass();
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass18, (java.lang.Object) wildcardClass20);
        boolean boolean22 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) wildcardClass4, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) wildcardClass13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass11);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass11);
        org.mockito.internal.matchers.Equality equality18 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj19 = null;
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality18, obj19);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality18);
        java.lang.Class<?> wildcardClass22 = equality18.getClass();
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass22);
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        org.mockito.internal.matchers.Equality equality24 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass25 = equality24.getClass();
        org.mockito.internal.matchers.Equality equality26 = new org.mockito.internal.matchers.Equality();
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) equality26);
        boolean boolean28 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass25);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.mockito.internal.matchers.Equality equality31 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass32 = equality31.getClass();
        boolean boolean33 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass30, (java.lang.Object) wildcardClass32);
        boolean boolean34 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass30);
        boolean boolean35 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) wildcardClass30);
        boolean boolean36 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass25);
        boolean boolean38 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass25, (java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality19, (java.lang.Object) boolean38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) -1, obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) (byte) -1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) equality15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.mockito.internal.matchers.Equality equality20 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass21 = equality20.getClass();
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) wildcardClass21);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass19);
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) wildcardClass19);
        org.mockito.internal.matchers.Equality equality26 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj27 = null;
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality26, obj27);
        boolean boolean29 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality26);
        java.lang.Class<?> wildcardClass30 = equality26.getClass();
        boolean boolean31 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) wildcardClass30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean12, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass8);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass14 = equality13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) equality15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) 'a');
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass14);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) (short) 0);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, obj23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) wildcardClass4, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality13 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj14 = null;
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality13, obj14);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality13);
        java.lang.Class<?> wildcardClass17 = equality13.getClass();
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Equality equality19 = new org.mockito.internal.matchers.Equality();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality19);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) '#');
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass17, (java.lang.Object) equality19);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality19, (java.lang.Object) (short) 1);
        org.mockito.internal.matchers.Equality equality27 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass28 = equality27.getClass();
        org.mockito.internal.matchers.Equality equality29 = new org.mockito.internal.matchers.Equality();
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass28, (java.lang.Object) equality29);
        boolean boolean31 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass28);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.mockito.internal.matchers.Equality equality34 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass35 = equality34.getClass();
        boolean boolean36 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass33, (java.lang.Object) wildcardClass35);
        boolean boolean37 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass33);
        boolean boolean38 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass28, (java.lang.Object) wildcardClass33);
        boolean boolean39 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass33);
        boolean boolean40 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) equality19, (java.lang.Object) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj15 = null;
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality14, obj15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality14);
        java.lang.Class<?> wildcardClass18 = equality14.getClass();
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass18);
        org.mockito.internal.matchers.Equality equality20 = new org.mockito.internal.matchers.Equality();
        boolean boolean21 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality20);
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality20, (java.lang.Object) '#');
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass18, (java.lang.Object) equality20);
        boolean boolean26 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality20, (java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) 100.0d, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass6 = equality5.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) equality7);
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) wildcardClass13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass11);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass11);
        org.mockito.internal.matchers.Equality equality18 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj19 = null;
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality18, obj19);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality18);
        java.lang.Class<?> wildcardClass22 = equality18.getClass();
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, (java.lang.Object) wildcardClass22);
        org.mockito.internal.matchers.Equality equality24 = new org.mockito.internal.matchers.Equality();
        boolean boolean25 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality24);
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality24, (java.lang.Object) '#');
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass22, (java.lang.Object) equality24);
        boolean boolean30 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality24, (java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass31 = equality24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.lang.Object obj0 = null;
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.internal.matchers.Equality equality12 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass13 = equality12.getClass();
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) wildcardClass13);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) wildcardClass11);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.internal.matchers.Equality equality21 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass22 = equality21.getClass();
        boolean boolean23 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass20, (java.lang.Object) wildcardClass22);
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass18, (java.lang.Object) wildcardClass20);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) wildcardClass18);
        org.mockito.internal.matchers.Equality equality26 = new org.mockito.internal.matchers.Equality();
        boolean boolean27 = org.mockito.internal.matchers.Equality.areEqual(obj16, (java.lang.Object) equality26);
        boolean boolean28 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass11, (java.lang.Object) boolean27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean3, (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass2);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) 100L);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, (java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) 100L, (java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass4 = equality0.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) boolean12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, obj10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) boolean7, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) equality16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass15);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass15, (java.lang.Object) 'a');
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) wildcardClass15);
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean5, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj2 = null;
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, obj2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 0.0f, (java.lang.Object) equality1);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality3, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass7 = equality3.getClass();
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArraysEqual(obj0, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj3 = null;
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, obj3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass6 = equality2.getClass();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) 1, (java.lang.Object) wildcardClass6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass6);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj11 = null;
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality10, obj11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass6, (java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj2, (java.lang.Object) boolean4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, obj2);
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass8 = equality7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) equality9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.internal.matchers.Equality equality14 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass15 = equality14.getClass();
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) wildcardClass15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass13);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass13);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, (java.lang.Object) (short) 10);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) boolean2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj5 = null;
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality4, obj5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean3, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality4.getClass();
        boolean boolean9 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass3);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) equality10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass9);
        boolean boolean14 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) 'a');
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass9);
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) wildcardClass9);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.mockito.internal.matchers.Equality equality20 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass21 = equality20.getClass();
        boolean boolean22 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass19, (java.lang.Object) wildcardClass21);
        boolean boolean23 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass21);
        boolean boolean24 = org.mockito.internal.matchers.Equality.areEqual(obj17, (java.lang.Object) wildcardClass21);
        boolean boolean25 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass9, (java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj1 = null;
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, obj1);
        boolean boolean3 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.mockito.internal.matchers.Equality.areArraysEqual((java.lang.Object) equality0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) equality6);
        boolean boolean8 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass12 = equality11.getClass();
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) wildcardClass12);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean2 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) ' ');
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj4 = null;
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality3, obj4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality3);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean2, (java.lang.Object) equality3);
        java.lang.Class<?> wildcardClass8 = equality3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality5);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality3, (java.lang.Object) equality5);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) "hi!", (java.lang.Object) equality3);
        org.mockito.internal.matchers.Equality equality10 = new org.mockito.internal.matchers.Equality();
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality10);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality10, (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass14 = equality10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) equality3, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual(obj0, (java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality7 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj8 = null;
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality7, obj8);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass16 = equality15.getClass();
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass14, (java.lang.Object) wildcardClass16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass12, (java.lang.Object) wildcardClass14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual(obj10, (java.lang.Object) wildcardClass12);
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual(obj8, obj10);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass6, obj10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality4);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) equality4);
        java.lang.Class<?> wildcardClass8 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) equality11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass9 = equality8.getClass();
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 1, (java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) wildcardClass3);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass1);
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality6);
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = equality6.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality6);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality15);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual(obj14, (java.lang.Object) boolean16);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass13, obj14);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality6, (java.lang.Object) wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual(obj6, (java.lang.Object) wildcardClass10);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) boolean5, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        java.lang.Class<?> wildcardClass4 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality6 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass7 = equality6.getClass();
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        boolean boolean9 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) equality8);
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass7);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass7, (java.lang.Object) 'a');
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality2, (java.lang.Object) wildcardClass7);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean13, (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass4 = equality3.getClass();
        org.mockito.internal.matchers.Equality equality5 = new org.mockito.internal.matchers.Equality();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) equality5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass4);
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        org.mockito.internal.matchers.Equality equality11 = new org.mockito.internal.matchers.Equality();
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) equality11);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) 10.0d, (java.lang.Object) wildcardClass10);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass10, (java.lang.Object) 'a');
        boolean boolean16 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass10);
        boolean boolean17 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality1, (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass18 = equality1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual((java.lang.Object) 10L, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.mockito.internal.matchers.Equality equality1 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass2 = equality1.getClass();
        org.mockito.internal.matchers.Equality equality3 = new org.mockito.internal.matchers.Equality();
        boolean boolean4 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) equality3);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass2, (java.lang.Object) (short) -1);
        boolean boolean7 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (-1), (java.lang.Object) wildcardClass2);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean7, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        boolean boolean1 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality0);
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality0, (java.lang.Object) boolean5);
        org.mockito.internal.matchers.Equality equality8 = new org.mockito.internal.matchers.Equality();
        java.lang.Object obj9 = null;
        boolean boolean10 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality8, obj9);
        boolean boolean11 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality8);
        boolean boolean12 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (byte) 0, (java.lang.Object) equality8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) boolean6, (java.lang.Object) equality8);
        org.mockito.internal.matchers.Equality equality15 = new org.mockito.internal.matchers.Equality();
        boolean boolean16 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality15);
        boolean boolean18 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality15, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass19 = equality15.getClass();
        boolean boolean20 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass19);
        boolean boolean21 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) '4', (java.lang.Object) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) boolean13, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass3 = equality2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        boolean boolean5 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) equality4);
        boolean boolean6 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass3);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.mockito.internal.matchers.Equality equality9 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass10 = equality9.getClass();
        boolean boolean11 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) wildcardClass10);
        boolean boolean12 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean13 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass8);
        boolean boolean14 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass8);
        boolean boolean15 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass8);
        org.mockito.internal.matchers.Equality equality16 = new org.mockito.internal.matchers.Equality();
        boolean boolean17 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality16);
        boolean boolean19 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) equality16, (java.lang.Object) '#');
        boolean boolean20 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass8, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.mockito.internal.matchers.Equality.areArrayElementsEqual((java.lang.Object) false, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.mockito.internal.matchers.Equality equality0 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass1 = equality0.getClass();
        org.mockito.internal.matchers.Equality equality2 = new org.mockito.internal.matchers.Equality();
        boolean boolean3 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass1, (java.lang.Object) equality2);
        boolean boolean4 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        boolean boolean5 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) equality2);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.mockito.internal.matchers.Equality equality4 = new org.mockito.internal.matchers.Equality();
        java.lang.Class<?> wildcardClass5 = equality4.getClass();
        boolean boolean6 = org.mockito.internal.matchers.Equality.areEqual((java.lang.Object) wildcardClass3, (java.lang.Object) wildcardClass5);
        boolean boolean7 = org.mockito.internal.matchers.Equality.isArray((java.lang.Object) wildcardClass5);
        boolean boolean8 = org.mockito.internal.matchers.Equality.areEqual(obj1, (java.lang.Object) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.mockito.internal.matchers.Equality.areArrayLengthsEqual(obj0, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

